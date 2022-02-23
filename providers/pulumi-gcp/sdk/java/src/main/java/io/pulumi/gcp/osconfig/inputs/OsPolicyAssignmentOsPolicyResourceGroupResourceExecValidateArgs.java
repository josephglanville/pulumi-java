// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.osconfig.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import io.pulumi.gcp.osconfig.inputs.OsPolicyAssignmentOsPolicyResourceGroupResourceExecValidateFileArgs;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


public final class OsPolicyAssignmentOsPolicyResourceGroupResourceExecValidateArgs extends io.pulumi.resources.ResourceArgs {

    public static final OsPolicyAssignmentOsPolicyResourceGroupResourceExecValidateArgs Empty = new OsPolicyAssignmentOsPolicyResourceGroupResourceExecValidateArgs();

    /**
     * Optional arguments to pass to the source during execution.
     * 
     */
    @InputImport(name="args")
      private final @Nullable Input<List<String>> args;

    public Input<List<String>> getArgs() {
        return this.args == null ? Input.empty() : this.args;
    }

    /**
     * A remote or local source.
     * 
     */
    @InputImport(name="file")
      private final @Nullable Input<OsPolicyAssignmentOsPolicyResourceGroupResourceExecValidateFileArgs> file;

    public Input<OsPolicyAssignmentOsPolicyResourceGroupResourceExecValidateFileArgs> getFile() {
        return this.file == null ? Input.empty() : this.file;
    }

    /**
     * Required. The script interpreter to use. Possible values: INTERPRETER_UNSPECIFIED, NONE, SHELL, POWERSHELL
     * 
     */
    @InputImport(name="interpreter", required=true)
      private final Input<String> interpreter;

    public Input<String> getInterpreter() {
        return this.interpreter;
    }

    /**
     * Only recorded for enforce Exec. Path to an output file (that is created by this Exec) whose content will be recorded in OSPolicyResourceCompliance after a successful run. Absence or failure to read this file will result in this ExecResource being non-compliant. Output file size is limited to 100K bytes.
     * 
     */
    @InputImport(name="outputFilePath")
      private final @Nullable Input<String> outputFilePath;

    public Input<String> getOutputFilePath() {
        return this.outputFilePath == null ? Input.empty() : this.outputFilePath;
    }

    /**
     * An inline script. The size of the script is limited to 1024 characters.
     * 
     */
    @InputImport(name="script")
      private final @Nullable Input<String> script;

    public Input<String> getScript() {
        return this.script == null ? Input.empty() : this.script;
    }

    public OsPolicyAssignmentOsPolicyResourceGroupResourceExecValidateArgs(
        @Nullable Input<List<String>> args,
        @Nullable Input<OsPolicyAssignmentOsPolicyResourceGroupResourceExecValidateFileArgs> file,
        Input<String> interpreter,
        @Nullable Input<String> outputFilePath,
        @Nullable Input<String> script) {
        this.args = args;
        this.file = file;
        this.interpreter = Objects.requireNonNull(interpreter, "expected parameter 'interpreter' to be non-null");
        this.outputFilePath = outputFilePath;
        this.script = script;
    }

    private OsPolicyAssignmentOsPolicyResourceGroupResourceExecValidateArgs() {
        this.args = Input.empty();
        this.file = Input.empty();
        this.interpreter = Input.empty();
        this.outputFilePath = Input.empty();
        this.script = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(OsPolicyAssignmentOsPolicyResourceGroupResourceExecValidateArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<List<String>> args;
        private @Nullable Input<OsPolicyAssignmentOsPolicyResourceGroupResourceExecValidateFileArgs> file;
        private Input<String> interpreter;
        private @Nullable Input<String> outputFilePath;
        private @Nullable Input<String> script;

        public Builder() {
    	      // Empty
        }

        public Builder(OsPolicyAssignmentOsPolicyResourceGroupResourceExecValidateArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.args = defaults.args;
    	      this.file = defaults.file;
    	      this.interpreter = defaults.interpreter;
    	      this.outputFilePath = defaults.outputFilePath;
    	      this.script = defaults.script;
        }

        public Builder setArgs(@Nullable Input<List<String>> args) {
            this.args = args;
            return this;
        }

        public Builder setArgs(@Nullable List<String> args) {
            this.args = Input.ofNullable(args);
            return this;
        }

        public Builder setFile(@Nullable Input<OsPolicyAssignmentOsPolicyResourceGroupResourceExecValidateFileArgs> file) {
            this.file = file;
            return this;
        }

        public Builder setFile(@Nullable OsPolicyAssignmentOsPolicyResourceGroupResourceExecValidateFileArgs file) {
            this.file = Input.ofNullable(file);
            return this;
        }

        public Builder setInterpreter(Input<String> interpreter) {
            this.interpreter = Objects.requireNonNull(interpreter);
            return this;
        }

        public Builder setInterpreter(String interpreter) {
            this.interpreter = Input.of(Objects.requireNonNull(interpreter));
            return this;
        }

        public Builder setOutputFilePath(@Nullable Input<String> outputFilePath) {
            this.outputFilePath = outputFilePath;
            return this;
        }

        public Builder setOutputFilePath(@Nullable String outputFilePath) {
            this.outputFilePath = Input.ofNullable(outputFilePath);
            return this;
        }

        public Builder setScript(@Nullable Input<String> script) {
            this.script = script;
            return this;
        }

        public Builder setScript(@Nullable String script) {
            this.script = Input.ofNullable(script);
            return this;
        }
        public OsPolicyAssignmentOsPolicyResourceGroupResourceExecValidateArgs build() {
            return new OsPolicyAssignmentOsPolicyResourceGroupResourceExecValidateArgs(args, file, interpreter, outputFilePath, script);
        }
    }
}
