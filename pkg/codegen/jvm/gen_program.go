// Copyright 2022, Pulumi Corporation.  All rights reserved.

package jvm

import (
	"bytes"
	"fmt"
	"github.com/zclconf/go-cty/cty"
	"io"
	"strings"

	"github.com/hashicorp/hcl/v2"
	"github.com/pulumi/pulumi/pkg/v3/codegen"
	"github.com/pulumi/pulumi/pkg/v3/codegen/hcl2/model"
	"github.com/pulumi/pulumi/pkg/v3/codegen/hcl2/model/format"
	"github.com/pulumi/pulumi/pkg/v3/codegen/hcl2/syntax"
	"github.com/pulumi/pulumi/pkg/v3/codegen/pcl"
	"github.com/pulumi/pulumi/pkg/v3/codegen/schema"
	"github.com/pulumi/pulumi/pkg/v3/codegen/testing/utils"
	"github.com/pulumi/pulumi/sdk/v3/go/common/util/contract"
)

type generator struct {
	// The formatter to use when generating code.
	*format.Formatter
	program *pcl.Program
	// Whether awaits are needed, and therefore an async Initialize method should be declared.
	asyncInit bool
	// TODO
	diagnostics                 hcl.Diagnostics
	currentResourcePropertyType schema.Type
	// keep track of variable identifiers which are the result of an invoke
	// for example "var resourceGroup = GetResourceGroup.invokeAsync(...)"
	// we will keep track of "resourceGroup" -> schema(GetResourceGroup)
	//
	// later on when apply a traversal sush as resourceGroup.getName(),
	// we should rewrite it as resourceGroup.thenApply(getResourceGroupResult -> getResourceGroupResult.getName())
	functionInvokes map[string]*schema.Function
}

func (g *generator) GenTemplateExpression(w io.Writer, expr *model.TemplateExpression) {
	multiLine := false
	expressions := false
	for _, expr := range expr.Parts {
		if lit, ok := expr.(*model.LiteralValueExpression); ok && model.StringType.AssignableFrom(lit.Type()) {
			if strings.Contains(lit.Value.AsString(), "\n") {
				multiLine = true
			}
		} else {
			expressions = true
		}
	}

	if multiLine {
		g.Fgen(w, "@")
	}
	if expressions {
		g.Fgen(w, "String.format(\"")
	} else {
		g.Fgen(w, "\"")
	}
	var args []model.Expression
	for _, expr := range expr.Parts {
		if lit, ok := expr.(*model.LiteralValueExpression); ok && model.StringType.AssignableFrom(lit.Type()) {
			g.Fgen(w, g.escapeString(lit.Value.AsString(), multiLine, expressions))
		} else {
			args = append(args, expr)
			g.Fgen(w, g.escapeString("%s", multiLine, expressions))
		}
	}
	g.Fgen(w, "\"")
	if expressions {
		g.Fgen(w, ", ")
		for index, arg := range args {
			if index == len(args)-1 {
				g.Fgenf(w, "%.v)", arg)
			} else {
				g.Fgenf(w, "%.v,", arg)
			}
		}
	}
}

func containsFunctionCall(functionName string, nodes []pcl.Node) bool {
	foundRangeCall := false
	for _, node := range nodes {
		node.VisitExpressions(model.IdentityVisitor, func(x model.Expression) (model.Expression, hcl.Diagnostics) {
			// Ignore the node if it is not a call to invoke.
			call, ok := x.(*model.FunctionCallExpression)
			if !ok {
				return x, nil
			}

			if call.Name == functionName {
				foundRangeCall = true
			}

			return x, nil
		})
	}

	return foundRangeCall
}

func hasIterableResources(nodes []pcl.Node) bool {
	for _, node := range nodes {
		switch node.(type) {
		case *pcl.Resource:
			resource := node.(*pcl.Resource)
			if resource.Options != nil && resource.Options.Range != nil {
				return true
			}
		}
	}

	return false
}

func containsRangeExpr(nodes []pcl.Node) bool {
	return hasIterableResources(nodes) || containsFunctionCall("readDir", nodes)
}

func GenerateProgram(program *pcl.Program) (map[string][]byte, hcl.Diagnostics, error) {
	// Linearize the nodes into an order appropriate for procedural code generation.
	nodes := pcl.Linearize(program)

	// Import Java-specific schema info.
	// FIX ME: not sure what this is doing...
	for _, p := range program.Packages() {
		if err := p.ImportLanguages(map[string]schema.Language{"java": Importer}); err != nil {
			return make(map[string][]byte), nil, err
		}
	}

	g := &generator{
		program:         program,
		functionInvokes: make(map[string]*schema.Function),
	}

	g.Formatter = format.NewFormatter(g)

	for _, n := range nodes {
		if r, ok := n.(*pcl.Resource); ok && requiresAsyncInit(r) {
			g.asyncInit = true
			break
		}
	}

	var index bytes.Buffer
	g.genPreamble(&index, nodes)

	g.Indented(func() {
		g.Indented(func() {
			for _, n := range nodes {
				g.genNode(&index, n)
			}
		})
	})

	g.genPostamble(&index, nodes)

	files := map[string][]byte{
		"MyStack.java": index.Bytes(),
	}
	return files, g.diagnostics, nil
}

func (g *generator) genImport(w io.Writer, qualifiedName string) {
	g.Fprintf(w, "import %s;\n", qualifiedName)
}

func (g *generator) makeIndent(w io.Writer) {
	g.Fgenf(w, "%s", g.Indent)
}
func (g *generator) newline(w io.Writer) {
	g.Fgen(w, "\n")
}

func (g *generator) emitOutputFields(w io.Writer, nodes []pcl.Node) {
	for _, node := range nodes {
		if outputVariable, isOutput := node.(*pcl.OutputVariable); isOutput {
			outputType := "Object"

			if outputVariable.Type().AssignableFrom(model.BoolType) {
				outputType = "Boolean"
			}

			if outputVariable.Type().AssignableFrom(model.NumberType) {
				outputType = "Integer"
			}

			if outputVariable.Type().AssignableFrom(model.StringType) {
				outputType = "String"
			}

			g.Indented(func() {
				g.makeIndent(w)
				g.Fgenf(w, "@Export(type = String.class)")
				g.newline(w)

				g.makeIndent(w)
				g.Fgenf(w, "private final Output<%s> %s;", outputType, outputVariable.Name())
				g.newline(w)
			})
		}
	}
}

// Checks whether any of the input nodes is a configuration variable
func containConfigVariables(nodes []pcl.Node) bool {
	for _, node := range nodes {
		switch node.(type) {
		case *pcl.ConfigVariable:
			return true
		}
	}

	return false
}

// genPreamble generates import statements, class definition and constructor.
func (g *generator) genPreamble(w io.Writer, nodes []pcl.Node) {
	g.genImport(w, "java.util.*")
	g.genImport(w, "java.io.*")
	g.genImport(w, "java.nio.*")
	g.genImport(w, "io.pulumi.*")
	g.newline(w)
	g.newline(w)
	// Emit Stack class signature
	g.Fprint(w, "public class MyStack extends Stack\n")
	g.Fprint(w, "{")
	g.newline(w)
	g.emitOutputFields(w, nodes)
	g.newline(w)
	g.Fprint(w, "    public MyStack()\n")
	g.Fprint(w, "    {\n")
	if containConfigVariables(nodes) {
		g.Fprint(w, "        final var config = Config.of();\n")
	}
}

func (g *generator) generateRangeClass(w io.Writer) {
	g.Fgenf(w, "%sclass Range<T> {\n", g.Indent)
	g.Indented(func() {
		g.Fgenf(w, "%spublic T value;\n", g.Indent)
		g.Fgenf(w, "%spublic String key;\n", g.Indent)
		g.Fgenf(w, "%spublic Range(String key, T value) { this.value = value; this.key = key; }\n", g.Indent)
		g.Fgenf(w, "%spublic static <TValue> Range<TValue> of(String key, TValue input) {\n", g.Indent)
		g.Indented(func() {
			g.Fgenf(w, "%sreturn new Range<TValue>(key, input);\n", g.Indent)
		})
		g.Fgenf(w, "%s}\n", g.Indent)
		g.Fgenf(w, "%spublic T getValue() { return this.value; }\n", g.Indent)
		g.Fgenf(w, "%spublic String getKey() { return this.key; }\n", g.Indent)
		g.Fgenf(w, "%spublic static <TValue> List<Range<TValue>> of(Iterable<TValue> items) {\n", g.Indent)
		g.Indented(func() {
			g.Fgenf(w, "%svar results = new ArrayList<Range<TValue>>();\n", g.Indent)
			g.Fgenf(w, "%sInteger counter = 0;\n", g.Indent)
			g.Fgenf(w, "%sfor(var item : items) {\n", g.Indent)
			g.Indented(func() {
				g.Fgenf(w, "%sresults.add(new Range<TValue>(counter.toString(), item));\n", g.Indent)
				g.Fgenf(w, "%scounter = counter + 1;\n", g.Indent)
			})
			g.Fgenf(w, "%s}\n", g.Indent)
			g.Fgenf(w, "%sreturn results;\n", g.Indent)
		})
		g.Fgenf(w, "%s}\n", g.Indent)
	})
	g.Fgenf(w, "%s}\n", g.Indent)
}

func (g *generator) generateReadDirMethod(w io.Writer) {
	g.Fgenf(w, "\n%sList<Range<String>> ReadDir(String directory) {\n", g.Indent)
	g.Indented(func() {
		g.Fgenf(w, "%svar results = new ArrayList<Range<String>>();\n", g.Indent)
		g.Fgenf(w, "%sFile[] files = new File(directory).listFiles();\n", g.Indent)
		g.Fgenf(w, "%sfor (File file : files) {\n", g.Indent)
		g.Indented(func() {
			g.Fgenf(w, "%sif (file.isFile()) {\n", g.Indent)
			g.Indented(func() {
				g.Fgenf(w, "%sresults.add(Range.of(file.getName(), file.getName()));\n", g.Indent)
			})
			g.Fgenf(w, "%s}\n", g.Indent)
		})
		g.Fgenf(w, "%s}\n", g.Indent)
		g.Fgenf(w, "%sreturn results;\n", g.Indent)
	})
	g.Fgenf(w, "%s}\n", g.Indent)
}

func (g *generator) generateJsonMethods(w io.Writer) {
	// entry point
	g.Fgenf(w, "\n%sstatic String ToJson(Map<String, Object> map) {\n", g.Indent)
	g.Indented(func() {
		g.Fgenf(w, "%s// Bring your own JSON library here to serialize map", g.Indent)
		g.newline(w)
		g.Fgenf(w, "%sreturn \"{}\";\n", g.Indent)
	})
	g.Fgenf(w, "%s}\n", g.Indent)
	g.newline(w)

	g.makeIndent(w)
	g.Fgen(w, "@SafeVarargs")
	g.Fgenf(w, "\n%sstatic Map<String, Object> JObject(java.util.Map.Entry<String, Object> ...entries) {\n", g.Indent)
	g.Indented(func() {
		g.Fgenf(w, "%svar map = new HashMap<String, Object>();\n", g.Indent)
		g.Fgenf(w, "%sfor (var entry : entries)  {  map.put(entry.getKey(), entry.getValue()); }\n", g.Indent)
		g.Fgenf(w, "%sreturn map;\n", g.Indent)
	})
	g.Fgenf(w, "%s}\n", g.Indent)
	g.newline(w)

	g.Fgenf(w, "\n%sstatic java.util.Map.Entry<String, Object> JProperty(String key, Object value) {\n", g.Indent)
	g.Indented(func() {
		g.Fgenf(w, "%sreturn java.util.Map.entry(key, value);\n", g.Indent)
	})
	g.Fgenf(w, "%s}\n", g.Indent)
	g.newline(w)

	g.Fgenf(w, "\n%sObject[] JArray(Object ...items) {\n", g.Indent)
	g.Indented(func() {
		g.Fgenf(w, "%sreturn items;\n", g.Indent)
	})
	g.Fgenf(w, "%s}\n", g.Indent)
	g.newline(w)
}

// genPostamble closes the method and the class and declares stack output statements.
func (g *generator) genPostamble(w io.Writer, nodes []pcl.Node) {
	g.Indented(func() {
		g.Fprintf(w, "%s}\n", g.Indent)
		if containsFunctionCall("readDir", nodes) {
			g.generateReadDirMethod(w)
		}

		if containsFunctionCall("toJSON", nodes) {
			g.generateJsonMethods(w)
		}
	})
	g.Fprint(w, "}\n")

	if containsRangeExpr(nodes) {
		g.Fprint(w, "\n")
		g.generateRangeClass(w)
	}
}

// resourceArgsTypeName computes the Java arguments class name for the given resource.
func resourceArgsTypeName(r *pcl.Resource) string {
	// Compute the resource type from the Pulumi type token.
	pkg, module, member, diags := r.DecomposeToken()
	contract.Assert(len(diags) == 0)
	if pkg == "pulumi" && module == "providers" {
		pkg, module, member = member, "", "Provider"
	}

	return fmt.Sprintf("%sArgs", toUpperCase(member))
}

// resourceTypeName computes the Java resource class name for the given resource.
func resourceTypeName(resource *pcl.Resource) string {
	// Compute the resource type from the Pulumi type token.
	pkg, module, member, diags := resource.DecomposeToken()
	contract.Assert(len(diags) == 0)
	if pkg == "pulumi" && module == "providers" {
		pkg, module, member = member, "", "Provider"
	}

	return toUpperCase(member)
}

// Returns the expression that should be emitted for a resource's "name" parameter given its base name
func makeResourceName(baseName string, suffix string) string {
	if suffix == "" {
		return fmt.Sprintf(`"%s"`, baseName)
	}
	return fmt.Sprintf(`"%s-"`, baseName) + " + " + suffix
}

func (g *generator) findResourceSchema(resource *pcl.Resource) (bool, *schema.Resource) {
	if resource.Schema == nil {
		return false, nil
	}

	for _, pkg := range g.program.Packages() {
		if pkg.Resources != nil {
			for _, resourceSchame := range pkg.Resources {
				if resourceSchame != nil && resourceSchame.Token == resource.Schema.Token {
					return true, resourceSchame
				}
			}
		}
	}

	return false, nil
}

func (g *generator) findFunctionSchema(w io.Writer, function string) (bool, *schema.Function) {

	for _, pkg := range g.program.Packages() {
		if pkg.Functions != nil {
			for _, functionSchame := range pkg.Functions {
				if functionSchame != nil && strings.HasSuffix(functionSchame.Token, toLowerCase(function)) {
					return true, functionSchame
				}
			}
		}
	}

	return false, nil
}

func getTraversalKey(traversal hcl.Traversal) string {
	for _, part := range traversal {
		switch part := part.(type) {
		case hcl.TraverseAttr:
			return cty.StringVal(part.Name).AsString()
		case hcl.TraverseIndex:
			return part.Key.AsString()
		default:
			contract.Failf("unexpected traversal part of type %T (%v)", part, part.SourceRange())
		}
	}

	return ""
}

func (g *generator) genResource(w io.Writer, resource *pcl.Resource) {
	resourceTypeName := resourceTypeName(resource)
	resourceArgs := resourceArgsTypeName(resource)
	variableName := toLowerCase(makeValidIdentifier(resource.Name()))
	instantiate := func(resName string) {
		resourceProperties := make(map[string]schema.Type)
		foundSchema, resourceSchema := g.findResourceSchema(resource)
		if foundSchema && resourceSchema.Properties != nil {
			for _, property := range resourceSchema.Properties {
				if property != nil && property.Type != nil {
					resourceProperties[property.Name] = codegen.UnwrapType(property.Type)
				}
			}
		}

		if len(resource.Inputs) == 0 {
			g.Fgenf(w, "new %s(%s)", resourceTypeName, resName)
		} else {
			g.Fgenf(w, "new %s(%s, %s.builder()", resourceTypeName, resName, resourceArgs)
			g.Fgenf(w, "%s\n", g.Indent)
			g.Indented(func() {
				for _, attr := range resource.Inputs {
					attributeType := resourceProperties[attr.Name]
					g.currentResourcePropertyType = attributeType
					g.Fgenf(w, "%s.%s(%.v)\n", g.Indent, makeValidIdentifier(attr.Name), attr.Value)
				}

				g.Fgenf(w, "%s.build())", g.Indent)
			})
			// resource options: TODO
			//g.Fgenf(w, "%s}%s)", g.Indent, g.genResourceOptions(r.Options))
		}
	}

	if resource.Options != nil && resource.Options.Range != nil {
		// generate list of resources
		rangeType := model.ResolveOutputs(resource.Options.Range.Type())
		rangeExpr := g.lowerExpression(resource.Options.Range, rangeType)
		isNumericRange := model.InputType(model.NumberType).ConversionFrom(rangeExpr.Type()) != model.NoConversion
		if isNumericRange {
			// numeric range
			g.Fgenf(w, "%sfor (var rangeIndex = 0; rangeIndex < %.12o; rangeIndex++)\n", g.Indent, rangeExpr)
			g.Fgenf(w, "%s{\n", g.Indent)
			g.Indented(func() {
				// register each resource
				g.Fgenf(w, "%s", g.Indent)
				instantiate(makeResourceName(resource.Name(), "rangeIndex"))
				g.Fgenf(w, ";\n\n")
			})
			g.Fgenf(w, "%s\n}\n", g.Indent)

		} else {
			// for each-loop through the elements to creates a resource from each one
			switch rangeExpr.(type) {
			case *model.FunctionCallExpression:
				funcCall := rangeExpr.(*model.FunctionCallExpression)
				switch funcCall.Name {
				case pcl.IntrinsicConvert:
					firstArg := funcCall.Args[0]
					switch firstArg.(type) {
					case *model.ScopeTraversalExpression:
						traversalExpr := firstArg.(*model.ScopeTraversalExpression)
						if len(traversalExpr.Parts) == 2 {
							// Meaning here we have {root}.{part} expression which the most common
							// check whether {root} is actually a variable name that holds the result
							// of a function invoke
							if functionSchema, isInvoke := g.functionInvokes[traversalExpr.RootName]; isInvoke {
								resultTypeName := toLowerCase(typeName(functionSchema.Outputs))
								part := getTraversalKey(traversalExpr.Traversal.SimpleSplit().Rel)
								g.makeIndent(w)
								g.Fgenf(w, "final var %s = ", resource.Name())
								g.Fgenf(w, "Output.of(%s.thenApply(%s -> {\n", traversalExpr.RootName, resultTypeName)
								g.Indented(func() {
									g.Fgenf(w, "%sfinal var resources = new ArrayList<%s>();\n", g.Indent, resourceTypeName)
									g.Fgenf(w, "%sfor (var range : Range.of(%s.get%s())\n", g.Indent, resultTypeName, toUpperCase(part))
									g.Fgenf(w, "%s{\n", g.Indent)
									g.Indented(func() {
										suffix := "range.getKey()"
										g.Fgenf(w, "%svar resource = ", g.Indent)
										instantiate(makeResourceName(resource.Name(), suffix))
										g.Fgenf(w, ";\n\n")
										g.Fgenf(w, "%sresources.add(resource);\n", g.Indent)
									})
									g.Fgenf(w, "%s}\n\n", g.Indent)
									g.Fgenf(w, "%sreturn resources;\n", g.Indent)
								})
								g.Fgenf(w, "%s}))\n\n", g.Indent)
								return
							} else {
								// not an async function invoke
								// wrap into range collection
								g.Fgenf(w, "%sfor (var range : Range.of(%.12o))\n", g.Indent, rangeExpr)
							}
						} else {
							// wrap into range collection
							g.Fgenf(w, "%sfor (var range : Range.of(%.12o))\n", g.Indent, rangeExpr)
						}
					}
					// wrap into range collection
					g.Fgenf(w, "%sfor (var range : Range.of(%.12o))\n", g.Indent, rangeExpr)
				default:
					// assume function call returns a Range<T>
					g.Fgenf(w, "%sfor (var range : %.12o)\n", g.Indent, rangeExpr)
				}

			default:
				// wrap into range collection
				g.Fgenf(w, "%sfor (var range : Range.of(%.12o))\n", g.Indent, rangeExpr)
			}

			g.Fgenf(w, "%s{\n", g.Indent)
			g.Indented(func() {
				suffix := "range.getKey()"
				g.Fgenf(w, "%s", g.Indent)
				instantiate(makeResourceName(resource.Name(), suffix))
				g.Fgenf(w, ";\n")
			})
			g.Fgenf(w, "%s}\n\n", g.Indent)
		}

	} else {
		// generate single resource
		g.Fgenf(w, "%svar %s = ", g.Indent, variableName)
		suffix := ""
		instantiate(makeResourceName(resource.Name(), suffix))
		g.Fgenf(w, ";\n\n")
	}
}

func (g *generator) genConfigVariable(w io.Writer, configVariable *pcl.ConfigVariable) {
	g.makeIndent(w)
	if configVariable.DefaultValue != nil {
		g.Fgenf(w, "final var %s = config.get(\"%s\").orElse(%v);",
			makeValidIdentifier(configVariable.Name()),
			configVariable.Name(),
			configVariable.DefaultValue)
	} else {
		g.Fgenf(w, "final var %s = config.get(\"%s\");",
			makeValidIdentifier(configVariable.Name()),
			configVariable.Name())
	}
	g.newline(w)
}

func (g *generator) isFunctionInvoke(w io.Writer, localVariable *pcl.LocalVariable) (bool, *schema.Function) {
	value := localVariable.Definition.Value
	switch value.(type) {
	case *model.FunctionCallExpression:
		call := value.(*model.FunctionCallExpression)
		switch call.Name {
		case pcl.Invoke:
			args := call.Args[0]
			name := g.functionName(args)
			foundFunction, functionSchema := g.findFunctionSchema(w, name)
			if foundFunction {
				return true, functionSchema
			}
		}
	}

	return false, nil
}

func (g *generator) genLocalVariable(w io.Writer, localVariable *pcl.LocalVariable) {
	variableName := localVariable.Name()
	isInvokeCall, functionSchema := g.isFunctionInvoke(w, localVariable)
	if isInvokeCall {
		g.functionInvokes[variableName] = functionSchema
	}
	g.makeIndent(w)
	g.Fgenf(w, "final var %s = %v;", variableName, localVariable.Definition.Value)
	g.newline(w)
}

func (g *generator) genOutputAssignment(w io.Writer, outputVariable *pcl.OutputVariable) {
	g.makeIndent(w)
	g.Fgenf(w, "this.%s = %v;", outputVariable.Name(), outputVariable.Value)
	g.newline(w)
}

func (g *generator) genNode(w io.Writer, n pcl.Node) {
	switch n := n.(type) {
	case *pcl.Resource:
		g.genResource(w, n)
	case *pcl.ConfigVariable:
		g.genConfigVariable(w, n)
	case *pcl.LocalVariable:
		g.genLocalVariable(w, n)
	case *pcl.OutputVariable:
		g.genOutputAssignment(w, n)
	}
}

// requiresAsyncInit returns true if the program requires awaits in the code, and therefore an asynchronous
// method must be declared.
func requiresAsyncInit(r *pcl.Resource) bool {
	if r.Options == nil || r.Options.Range == nil {
		return false
	}

	return model.ContainsPromises(r.Options.Range.Type())
}

// TODO

func (g *generator) genNYI(w io.Writer, reason string, vs ...interface{}) {
	message := fmt.Sprintf("not yet implemented: %s", fmt.Sprintf(reason, vs...))
	g.diagnostics = append(g.diagnostics, &hcl.Diagnostic{
		Severity: hcl.DiagError,
		Summary:  message,
		Detail:   message,
	})
	g.Fgenf(w, "\"TODO: %s\"", fmt.Sprintf(reason, vs...))
}

func CompilePclToJava(source []byte, schemaPath string) ([]byte, hcl.Diagnostics, error) {
	parser := syntax.NewParser()
	parser.ParseFile(bytes.NewReader(source), "")
	program, programDiags, err := pcl.BindProgram(parser.Files, pcl.PluginHost(utils.NewHost(schemaPath)))
	if err != nil {
		return nil, nil, err
	}

	if programDiags != nil && programDiags.HasErrors() {
		for _, diagnosticError := range programDiags.Errs() {
			panic(diagnosticError.Error())
		}
	}

	javaPrograms, diagnostics, err := GenerateProgram(program)
	if err != nil {
		return nil, nil, err
	}

	return javaPrograms["MyStack.java"], diagnostics, nil
}
