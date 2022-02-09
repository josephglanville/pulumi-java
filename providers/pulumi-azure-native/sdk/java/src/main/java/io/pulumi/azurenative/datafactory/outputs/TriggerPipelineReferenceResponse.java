// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.datafactory.outputs;

import io.pulumi.azurenative.datafactory.outputs.PipelineReferenceResponse;
import io.pulumi.core.internal.annotations.OutputCustomType;
import java.lang.Object;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class TriggerPipelineReferenceResponse {
    private final @Nullable Map<String,Object> parameters;
    private final @Nullable PipelineReferenceResponse pipelineReference;

    @OutputCustomType.Constructor({"parameters","pipelineReference"})
    private TriggerPipelineReferenceResponse(
        @Nullable Map<String,Object> parameters,
        @Nullable PipelineReferenceResponse pipelineReference) {
        this.parameters = parameters;
        this.pipelineReference = pipelineReference;
    }

    public Map<String,Object> getParameters() {
        return this.parameters == null ? Map.of() : this.parameters;
    }
    public Optional<PipelineReferenceResponse> getPipelineReference() {
        return Optional.ofNullable(this.pipelineReference);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(TriggerPipelineReferenceResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Map<String,Object> parameters;
        private @Nullable PipelineReferenceResponse pipelineReference;

        public Builder() {
    	      // Empty
        }

        public Builder(TriggerPipelineReferenceResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.parameters = defaults.parameters;
    	      this.pipelineReference = defaults.pipelineReference;
        }

        public Builder setParameters(@Nullable Map<String,Object> parameters) {
            this.parameters = parameters;
            return this;
        }

        public Builder setPipelineReference(@Nullable PipelineReferenceResponse pipelineReference) {
            this.pipelineReference = pipelineReference;
            return this;
        }

        public TriggerPipelineReferenceResponse build() {
            return new TriggerPipelineReferenceResponse(parameters, pipelineReference);
        }
    }
}
