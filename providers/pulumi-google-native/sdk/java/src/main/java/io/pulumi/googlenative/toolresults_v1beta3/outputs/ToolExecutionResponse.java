// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.toolresults_v1beta3.outputs;

import io.pulumi.core.internal.annotations.OutputCustomType;
import io.pulumi.googlenative.toolresults_v1beta3.outputs.FileReferenceResponse;
import io.pulumi.googlenative.toolresults_v1beta3.outputs.ToolExitCodeResponse;
import io.pulumi.googlenative.toolresults_v1beta3.outputs.ToolOutputReferenceResponse;
import java.lang.String;
import java.util.List;
import java.util.Objects;

@OutputCustomType
public final class ToolExecutionResponse {
    private final List<String> commandLineArguments;
    private final ToolExitCodeResponse exitCode;
    private final List<FileReferenceResponse> toolLogs;
    private final List<ToolOutputReferenceResponse> toolOutputs;

    @OutputCustomType.Constructor({"commandLineArguments","exitCode","toolLogs","toolOutputs"})
    private ToolExecutionResponse(
        List<String> commandLineArguments,
        ToolExitCodeResponse exitCode,
        List<FileReferenceResponse> toolLogs,
        List<ToolOutputReferenceResponse> toolOutputs) {
        this.commandLineArguments = Objects.requireNonNull(commandLineArguments);
        this.exitCode = Objects.requireNonNull(exitCode);
        this.toolLogs = Objects.requireNonNull(toolLogs);
        this.toolOutputs = Objects.requireNonNull(toolOutputs);
    }

    public List<String> getCommandLineArguments() {
        return this.commandLineArguments;
    }
    public ToolExitCodeResponse getExitCode() {
        return this.exitCode;
    }
    public List<FileReferenceResponse> getToolLogs() {
        return this.toolLogs;
    }
    public List<ToolOutputReferenceResponse> getToolOutputs() {
        return this.toolOutputs;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ToolExecutionResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private List<String> commandLineArguments;
        private ToolExitCodeResponse exitCode;
        private List<FileReferenceResponse> toolLogs;
        private List<ToolOutputReferenceResponse> toolOutputs;

        public Builder() {
    	      // Empty
        }

        public Builder(ToolExecutionResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.commandLineArguments = defaults.commandLineArguments;
    	      this.exitCode = defaults.exitCode;
    	      this.toolLogs = defaults.toolLogs;
    	      this.toolOutputs = defaults.toolOutputs;
        }

        public Builder setCommandLineArguments(List<String> commandLineArguments) {
            this.commandLineArguments = Objects.requireNonNull(commandLineArguments);
            return this;
        }

        public Builder setExitCode(ToolExitCodeResponse exitCode) {
            this.exitCode = Objects.requireNonNull(exitCode);
            return this;
        }

        public Builder setToolLogs(List<FileReferenceResponse> toolLogs) {
            this.toolLogs = Objects.requireNonNull(toolLogs);
            return this;
        }

        public Builder setToolOutputs(List<ToolOutputReferenceResponse> toolOutputs) {
            this.toolOutputs = Objects.requireNonNull(toolOutputs);
            return this;
        }

        public ToolExecutionResponse build() {
            return new ToolExecutionResponse(commandLineArguments, exitCode, toolLogs, toolOutputs);
        }
    }
}