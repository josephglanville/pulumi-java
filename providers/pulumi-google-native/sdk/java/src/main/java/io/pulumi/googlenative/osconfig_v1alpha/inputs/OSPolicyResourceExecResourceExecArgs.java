// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.osconfig_v1alpha.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.googlenative.osconfig_v1alpha.enums.OSPolicyResourceExecResourceExecInterpreter;
import io.pulumi.googlenative.osconfig_v1alpha.inputs.OSPolicyResourceFileArgs;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * A file or script to execute.
 * 
 */
public final class OSPolicyResourceExecResourceExecArgs extends io.pulumi.resources.ResourceArgs {

    public static final OSPolicyResourceExecResourceExecArgs Empty = new OSPolicyResourceExecResourceExecArgs();

    /**
     * Optional arguments to pass to the source during execution.
     * 
     */
    @Import(name="args")
      private final @Nullable Output<List<String>> args;

    public Output<List<String>> getArgs() {
        return this.args == null ? Output.empty() : this.args;
    }

    /**
     * A remote or local file.
     * 
     */
    @Import(name="file")
      private final @Nullable Output<OSPolicyResourceFileArgs> file;

    public Output<OSPolicyResourceFileArgs> getFile() {
        return this.file == null ? Output.empty() : this.file;
    }

    /**
     * The script interpreter to use.
     * 
     */
    @Import(name="interpreter", required=true)
      private final Output<OSPolicyResourceExecResourceExecInterpreter> interpreter;

    public Output<OSPolicyResourceExecResourceExecInterpreter> getInterpreter() {
        return this.interpreter;
    }

    /**
     * Only recorded for enforce Exec. Path to an output file (that is created by this Exec) whose content will be recorded in OSPolicyResourceCompliance after a successful run. Absence or failure to read this file will result in this ExecResource being non-compliant. Output file size is limited to 100K bytes.
     * 
     */
    @Import(name="outputFilePath")
      private final @Nullable Output<String> outputFilePath;

    public Output<String> getOutputFilePath() {
        return this.outputFilePath == null ? Output.empty() : this.outputFilePath;
    }

    /**
     * An inline script. The size of the script is limited to 1024 characters.
     * 
     */
    @Import(name="script")
      private final @Nullable Output<String> script;

    public Output<String> getScript() {
        return this.script == null ? Output.empty() : this.script;
    }

    public OSPolicyResourceExecResourceExecArgs(
        @Nullable Output<List<String>> args,
        @Nullable Output<OSPolicyResourceFileArgs> file,
        Output<OSPolicyResourceExecResourceExecInterpreter> interpreter,
        @Nullable Output<String> outputFilePath,
        @Nullable Output<String> script) {
        this.args = args;
        this.file = file;
        this.interpreter = Objects.requireNonNull(interpreter, "expected parameter 'interpreter' to be non-null");
        this.outputFilePath = outputFilePath;
        this.script = script;
    }

    private OSPolicyResourceExecResourceExecArgs() {
        this.args = Output.empty();
        this.file = Output.empty();
        this.interpreter = Output.empty();
        this.outputFilePath = Output.empty();
        this.script = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(OSPolicyResourceExecResourceExecArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<List<String>> args;
        private @Nullable Output<OSPolicyResourceFileArgs> file;
        private Output<OSPolicyResourceExecResourceExecInterpreter> interpreter;
        private @Nullable Output<String> outputFilePath;
        private @Nullable Output<String> script;

        public Builder() {
    	      // Empty
        }

        public Builder(OSPolicyResourceExecResourceExecArgs defaults) {
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
        public Builder args(String... args) {
            return args(List.of(args));
        }
        public Builder file(@Nullable Output<OSPolicyResourceFileArgs> file) {
            this.file = file;
            return this;
        }
        public Builder file(@Nullable OSPolicyResourceFileArgs file) {
            this.file = Output.ofNullable(file);
            return this;
        }
        public Builder interpreter(Output<OSPolicyResourceExecResourceExecInterpreter> interpreter) {
            this.interpreter = Objects.requireNonNull(interpreter);
            return this;
        }
        public Builder interpreter(OSPolicyResourceExecResourceExecInterpreter interpreter) {
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
        }        public OSPolicyResourceExecResourceExecArgs build() {
            return new OSPolicyResourceExecResourceExecArgs(args, file, interpreter, outputFilePath, script);
        }
    }
}
