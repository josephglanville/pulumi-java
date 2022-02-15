// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.osconfig_v1.outputs;

import io.pulumi.core.internal.annotations.OutputCustomType;
import io.pulumi.googlenative.osconfig_v1.outputs.OSPolicyResourceFileResponse;
import java.lang.String;
import java.util.List;
import java.util.Objects;

@OutputCustomType
public final class OSPolicyResourceExecResourceExecResponse {
    private final List<String> args;
    private final OSPolicyResourceFileResponse file;
    private final String interpreter;
    private final String outputFilePath;
    private final String script;

    @OutputCustomType.Constructor({"args","file","interpreter","outputFilePath","script"})
    private OSPolicyResourceExecResourceExecResponse(
        List<String> args,
        OSPolicyResourceFileResponse file,
        String interpreter,
        String outputFilePath,
        String script) {
        this.args = Objects.requireNonNull(args);
        this.file = Objects.requireNonNull(file);
        this.interpreter = Objects.requireNonNull(interpreter);
        this.outputFilePath = Objects.requireNonNull(outputFilePath);
        this.script = Objects.requireNonNull(script);
    }

    public List<String> getArgs() {
        return this.args;
    }
    public OSPolicyResourceFileResponse getFile() {
        return this.file;
    }
    public String getInterpreter() {
        return this.interpreter;
    }
    public String getOutputFilePath() {
        return this.outputFilePath;
    }
    public String getScript() {
        return this.script;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(OSPolicyResourceExecResourceExecResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private List<String> args;
        private OSPolicyResourceFileResponse file;
        private String interpreter;
        private String outputFilePath;
        private String script;

        public Builder() {
    	      // Empty
        }

        public Builder(OSPolicyResourceExecResourceExecResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.args = defaults.args;
    	      this.file = defaults.file;
    	      this.interpreter = defaults.interpreter;
    	      this.outputFilePath = defaults.outputFilePath;
    	      this.script = defaults.script;
        }

        public Builder setArgs(List<String> args) {
            this.args = Objects.requireNonNull(args);
            return this;
        }

        public Builder setFile(OSPolicyResourceFileResponse file) {
            this.file = Objects.requireNonNull(file);
            return this;
        }

        public Builder setInterpreter(String interpreter) {
            this.interpreter = Objects.requireNonNull(interpreter);
            return this;
        }

        public Builder setOutputFilePath(String outputFilePath) {
            this.outputFilePath = Objects.requireNonNull(outputFilePath);
            return this;
        }

        public Builder setScript(String script) {
            this.script = Objects.requireNonNull(script);
            return this;
        }

        public OSPolicyResourceExecResourceExecResponse build() {
            return new OSPolicyResourceExecResourceExecResponse(args, file, interpreter, outputFilePath, script);
        }
    }
}