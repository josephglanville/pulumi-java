// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.datafactory.outputs;

import io.pulumi.core.annotations.CustomType;
import java.lang.Object;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class PipelineElapsedTimeMetricPolicyResponse {
    /**
     * TimeSpan value, after which an Azure Monitoring Metric is fired.
     * 
     */
    private final @Nullable Object duration;

    @CustomType.Constructor
    private PipelineElapsedTimeMetricPolicyResponse(@CustomType.Parameter("duration") @Nullable Object duration) {
        this.duration = duration;
    }

    /**
     * TimeSpan value, after which an Azure Monitoring Metric is fired.
     * 
    */
    public Optional<Object> getDuration() {
        return Optional.ofNullable(this.duration);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(PipelineElapsedTimeMetricPolicyResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Object duration;

        public Builder() {
    	      // Empty
        }

        public Builder(PipelineElapsedTimeMetricPolicyResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.duration = defaults.duration;
        }

        public Builder duration(@Nullable Object duration) {
            this.duration = duration;
            return this;
        }        public PipelineElapsedTimeMetricPolicyResponse build() {
            return new PipelineElapsedTimeMetricPolicyResponse(duration);
        }
    }
}
