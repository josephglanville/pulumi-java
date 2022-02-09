// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.containerregistry.outputs;

import io.pulumi.azurenative.containerregistry.outputs.PipelineSourceTriggerDescriptorResponse;
import io.pulumi.core.internal.annotations.OutputCustomType;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class PipelineTriggerDescriptorResponse {
    private final @Nullable PipelineSourceTriggerDescriptorResponse sourceTrigger;

    @OutputCustomType.Constructor({"sourceTrigger"})
    private PipelineTriggerDescriptorResponse(@Nullable PipelineSourceTriggerDescriptorResponse sourceTrigger) {
        this.sourceTrigger = sourceTrigger;
    }

    public Optional<PipelineSourceTriggerDescriptorResponse> getSourceTrigger() {
        return Optional.ofNullable(this.sourceTrigger);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(PipelineTriggerDescriptorResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable PipelineSourceTriggerDescriptorResponse sourceTrigger;

        public Builder() {
    	      // Empty
        }

        public Builder(PipelineTriggerDescriptorResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.sourceTrigger = defaults.sourceTrigger;
        }

        public Builder setSourceTrigger(@Nullable PipelineSourceTriggerDescriptorResponse sourceTrigger) {
            this.sourceTrigger = sourceTrigger;
            return this;
        }

        public PipelineTriggerDescriptorResponse build() {
            return new PipelineTriggerDescriptorResponse(sourceTrigger);
        }
    }
}
