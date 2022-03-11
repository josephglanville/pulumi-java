// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.osconfig.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.InputImport;
import io.pulumi.gcp.osconfig.inputs.OsPolicyAssignmentOsPolicyResourceGroupResourceExecValidateFileGetArgs;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


public final class OsPolicyAssignmentOsPolicyResourceGroupResourceExecValidateGetArgs extends io.pulumi.resources.ResourceArgs {

    public static final OsPolicyAssignmentOsPolicyResourceGroupResourceExecValidateGetArgs Empty = new OsPolicyAssignmentOsPolicyResourceGroupResourceExecValidateGetArgs();

    /**
     * Optional arguments to pass to the source during execution.
     * 
     */
    @InputImport(name="args")
      private final @Nullable Output<List<String>> args;

    public Output<List<String>> getArgs() {
        return this.args == null ? Output.empty() : this.args;
    }

    /**
     * A remote or local source.
     * 
     */
    @InputImport(name="file")
      private final @Nullable Output<OsPolicyAssignmentOsPolicyResourceGroupResourceExecValidateFileGetArgs> file;

    public Output<OsPolicyAssignmentOsPolicyResourceGroupResourceExecValidateFileGetArgs> getFile() {
        return this.file == null ? Output.empty() : this.file;
    }

    /**
     * Required. The script interpreter to use. Possible values: INTERPRETER_UNSPECIFIED, NONE, SHELL, POWERSHELL
     * 
     */
    @InputImport(name="interpreter", required=true)
      private final Output<String> interpreter;

    public Output<String> getInterpreter() {
        return this.interpreter;
    }

    /**
     * Only recorded for enforce Exec. Path to an output file (that is created by this Exec) whose content will be recorded in OSPolicyResourceCompliance after a successful run. Absence or failure to read this file will result in this ExecResource being non-compliant. Output file size is limited to 100K bytes.
     * 
     */
    @InputImport(name="outputFilePath")
      private final @Nullable Output<String> outputFilePath;

    public Output<String> getOutputFilePath() {
        return this.outputFilePath == null ? Output.empty() : this.outputFilePath;
    }

    /**
     * An inline script. The size of the script is limited to 1024 characters.
     * 
     */
    @InputImport(name="script")
      private final @Nullable Output<String> script;

    public Output<String> getScript() {
        return this.script == null ? Output.empty() : this.script;
    }

    public OsPolicyAssignmentOsPolicyResourceGroupResourceExecValidateGetArgs(
        @Nullable Output<List<String>> args,
        @Nullable Output<OsPolicyAssignmentOsPolicyResourceGroupResourceExecValidateFileGetArgs> file,
        Output<String> interpreter,
        @Nullable Output<String> outputFilePath,
        @Nullable Output<String> script) {
        this.args = args;
        this.file = file;
        this.interpreter = Objects.requireNonNull(interpreter, "expected parameter 'interpreter' to be non-null");
        this.outputFilePath = outputFilePath;
        this.script = script;
    }

    private OsPolicyAssignmentOsPolicyResourceGroupResourceExecValidateGetArgs() {
        this.args = Output.empty();
        this.file = Output.empty();
        this.interpreter = Output.empty();
        this.outputFilePath = Output.empty();
        this.script = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(OsPolicyAssignmentOsPolicyResourceGroupResourceExecValidateGetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<List<String>> args;
        private @Nullable Output<OsPolicyAssignmentOsPolicyResourceGroupResourceExecValidateFileGetArgs> file;
        private Output<String> interpreter;
        private @Nullable Output<String> outputFilePath;
        private @Nullable Output<String> script;

        public Builder() {
    	      // Empty
        }

        public Builder(OsPolicyAssignmentOsPolicyResourceGroupResourceExecValidateGetArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.args = defaults.args;
    	      this.file = defaults.file;
    	      this.interpreter = defaults.interpreter;
    	      this.outputFilePath = defaults.outputFilePath;
    	      this.script = defaults.script;
        }

        public Builder args(@Nullable Output<List<String>> args) {
            this.args = args;
            return this;
        }

        public Builder args(@Nullable List<String> args) {
            this.args = Output.ofNullable(args);
            return this;
        }

        public Builder file(@Nullable Output<OsPolicyAssignmentOsPolicyResourceGroupResourceExecValidateFileGetArgs> file) {
            this.file = file;
            return this;
        }

        public Builder file(@Nullable OsPolicyAssignmentOsPolicyResourceGroupResourceExecValidateFileGetArgs file) {
            this.file = Output.ofNullable(file);
            return this;
        }

        public Builder interpreter(Output<String> interpreter) {
            this.interpreter = Objects.requireNonNull(interpreter);
            return this;
        }

        public Builder interpreter(String interpreter) {
            this.interpreter = Output.of(Objects.requireNonNull(interpreter));
            return this;
        }

        public Builder outputFilePath(@Nullable Output<String> outputFilePath) {
            this.outputFilePath = outputFilePath;
            return this;
        }

        public Builder outputFilePath(@Nullable String outputFilePath) {
            this.outputFilePath = Output.ofNullable(outputFilePath);
            return this;
        }

        public Builder script(@Nullable Output<String> script) {
            this.script = script;
            return this;
        }

        public Builder script(@Nullable String script) {
            this.script = Output.ofNullable(script);
            return this;
        }
        public OsPolicyAssignmentOsPolicyResourceGroupResourceExecValidateGetArgs build() {
            return new OsPolicyAssignmentOsPolicyResourceGroupResourceExecValidateGetArgs(args, file, interpreter, outputFilePath, script);
        }
    }
}
