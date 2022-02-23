// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.datafactory.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.Object;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * Pipeline ElapsedTime Metric Policy.
 * 
 */
public final class PipelineElapsedTimeMetricPolicyArgs extends io.pulumi.resources.ResourceArgs {

    public static final PipelineElapsedTimeMetricPolicyArgs Empty = new PipelineElapsedTimeMetricPolicyArgs();

    /**
     * TimeSpan value, after which an Azure Monitoring Metric is fired.
     * 
     */
    @InputImport(name="duration")
      private final @Nullable Input<Object> duration;

    public Input<Object> getDuration() {
        return this.duration == null ? Input.empty() : this.duration;
    }

    public PipelineElapsedTimeMetricPolicyArgs(@Nullable Input<Object> duration) {
        this.duration = duration;
    }

    private PipelineElapsedTimeMetricPolicyArgs() {
        this.duration = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(PipelineElapsedTimeMetricPolicyArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<Object> duration;

        public Builder() {
    	      // Empty
        }

        public Builder(PipelineElapsedTimeMetricPolicyArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.duration = defaults.duration;
        }

        public Builder setDuration(@Nullable Input<Object> duration) {
            this.duration = duration;
            return this;
        }

        public Builder setDuration(@Nullable Object duration) {
            this.duration = Input.ofNullable(duration);
            return this;
        }
        public PipelineElapsedTimeMetricPolicyArgs build() {
            return new PipelineElapsedTimeMetricPolicyArgs(duration);
        }
    }
}
