// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.machinelearningservices.outputs;

import io.pulumi.azurenative.machinelearningservices.outputs.InputDataBindingResponse;
import io.pulumi.azurenative.machinelearningservices.outputs.MpiResponse;
import io.pulumi.azurenative.machinelearningservices.outputs.OutputDataBindingResponse;
import io.pulumi.azurenative.machinelearningservices.outputs.PyTorchResponse;
import io.pulumi.azurenative.machinelearningservices.outputs.TensorFlowResponse;
import io.pulumi.core.internal.annotations.OutputCustomType;
import java.lang.Object;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class TrialComponentResponse {
    private final @Nullable String codeId;
    private final String command;
    private final @Nullable Object distribution;
    private final @Nullable String environmentId;
    private final @Nullable Map<String,String> environmentVariables;
    private final @Nullable Map<String,InputDataBindingResponse> inputDataBindings;
    private final @Nullable Map<String,OutputDataBindingResponse> outputDataBindings;
    private final @Nullable String timeout;

    @OutputCustomType.Constructor({"codeId","command","distribution","environmentId","environmentVariables","inputDataBindings","outputDataBindings","timeout"})
    private TrialComponentResponse(
        @Nullable String codeId,
        String command,
        @Nullable Object distribution,
        @Nullable String environmentId,
        @Nullable Map<String,String> environmentVariables,
        @Nullable Map<String,InputDataBindingResponse> inputDataBindings,
        @Nullable Map<String,OutputDataBindingResponse> outputDataBindings,
        @Nullable String timeout) {
        this.codeId = codeId;
        this.command = Objects.requireNonNull(command);
        this.distribution = distribution;
        this.environmentId = environmentId;
        this.environmentVariables = environmentVariables;
        this.inputDataBindings = inputDataBindings;
        this.outputDataBindings = outputDataBindings;
        this.timeout = timeout;
    }

    public Optional<String> getCodeId() {
        return Optional.ofNullable(this.codeId);
    }
    public String getCommand() {
        return this.command;
    }
    public Optional<Object> getDistribution() {
        return Optional.ofNullable(this.distribution);
    }
    public Optional<String> getEnvironmentId() {
        return Optional.ofNullable(this.environmentId);
    }
    public Map<String,String> getEnvironmentVariables() {
        return this.environmentVariables == null ? Map.of() : this.environmentVariables;
    }
    public Map<String,InputDataBindingResponse> getInputDataBindings() {
        return this.inputDataBindings == null ? Map.of() : this.inputDataBindings;
    }
    public Map<String,OutputDataBindingResponse> getOutputDataBindings() {
        return this.outputDataBindings == null ? Map.of() : this.outputDataBindings;
    }
    public Optional<String> getTimeout() {
        return Optional.ofNullable(this.timeout);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(TrialComponentResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String codeId;
        private String command;
        private @Nullable Object distribution;
        private @Nullable String environmentId;
        private @Nullable Map<String,String> environmentVariables;
        private @Nullable Map<String,InputDataBindingResponse> inputDataBindings;
        private @Nullable Map<String,OutputDataBindingResponse> outputDataBindings;
        private @Nullable String timeout;

        public Builder() {
    	      // Empty
        }

        public Builder(TrialComponentResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.codeId = defaults.codeId;
    	      this.command = defaults.command;
    	      this.distribution = defaults.distribution;
    	      this.environmentId = defaults.environmentId;
    	      this.environmentVariables = defaults.environmentVariables;
    	      this.inputDataBindings = defaults.inputDataBindings;
    	      this.outputDataBindings = defaults.outputDataBindings;
    	      this.timeout = defaults.timeout;
        }

        public Builder setCodeId(@Nullable String codeId) {
            this.codeId = codeId;
            return this;
        }

        public Builder setCommand(String command) {
            this.command = Objects.requireNonNull(command);
            return this;
        }

        public Builder setDistribution(@Nullable Object distribution) {
            this.distribution = distribution;
            return this;
        }

        public Builder setEnvironmentId(@Nullable String environmentId) {
            this.environmentId = environmentId;
            return this;
        }

        public Builder setEnvironmentVariables(@Nullable Map<String,String> environmentVariables) {
            this.environmentVariables = environmentVariables;
            return this;
        }

        public Builder setInputDataBindings(@Nullable Map<String,InputDataBindingResponse> inputDataBindings) {
            this.inputDataBindings = inputDataBindings;
            return this;
        }

        public Builder setOutputDataBindings(@Nullable Map<String,OutputDataBindingResponse> outputDataBindings) {
            this.outputDataBindings = outputDataBindings;
            return this;
        }

        public Builder setTimeout(@Nullable String timeout) {
            this.timeout = timeout;
            return this;
        }

        public TrialComponentResponse build() {
            return new TrialComponentResponse(codeId, command, distribution, environmentId, environmentVariables, inputDataBindings, outputDataBindings, timeout);
        }
    }
}
