// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.iotsitewise.inputs;

import io.pulumi.awsnative.iotsitewise.inputs.AssetModelExpressionVariableArgs;
import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.List;
import java.util.Objects;


public final class AssetModelTransformArgs extends io.pulumi.resources.ResourceArgs {

    public static final AssetModelTransformArgs Empty = new AssetModelTransformArgs();

    /**
     * The mathematical expression that defines the transformation function. You can specify up to 10 functions per expression.
     * 
     */
    @InputImport(name="expression", required=true)
      private final Input<String> expression;

    public Input<String> getExpression() {
        return this.expression;
    }

    /**
     * The list of variables used in the expression.
     * 
     */
    @InputImport(name="variables", required=true)
      private final Input<List<AssetModelExpressionVariableArgs>> variables;

    public Input<List<AssetModelExpressionVariableArgs>> getVariables() {
        return this.variables;
    }

    public AssetModelTransformArgs(
        Input<String> expression,
        Input<List<AssetModelExpressionVariableArgs>> variables) {
        this.expression = Objects.requireNonNull(expression, "expected parameter 'expression' to be non-null");
        this.variables = Objects.requireNonNull(variables, "expected parameter 'variables' to be non-null");
    }

    private AssetModelTransformArgs() {
        this.expression = Input.empty();
        this.variables = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(AssetModelTransformArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Input<String> expression;
        private Input<List<AssetModelExpressionVariableArgs>> variables;

        public Builder() {
    	      // Empty
        }

        public Builder(AssetModelTransformArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.expression = defaults.expression;
    	      this.variables = defaults.variables;
        }

        public Builder setExpression(Input<String> expression) {
            this.expression = Objects.requireNonNull(expression);
            return this;
        }

        public Builder setExpression(String expression) {
            this.expression = Input.of(Objects.requireNonNull(expression));
            return this;
        }

        public Builder setVariables(Input<List<AssetModelExpressionVariableArgs>> variables) {
            this.variables = Objects.requireNonNull(variables);
            return this;
        }

        public Builder setVariables(List<AssetModelExpressionVariableArgs> variables) {
            this.variables = Input.of(Objects.requireNonNull(variables));
            return this;
        }
        public AssetModelTransformArgs build() {
            return new AssetModelTransformArgs(expression, variables);
        }
    }
}
