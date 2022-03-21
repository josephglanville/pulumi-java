// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.appautoscaling.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import java.lang.Integer;
import java.util.Objects;
import javax.annotation.Nullable;


public final class ScheduledActionScalableTargetActionArgs extends io.pulumi.resources.ResourceArgs {

    public static final ScheduledActionScalableTargetActionArgs Empty = new ScheduledActionScalableTargetActionArgs();

    /**
     * The maximum capacity. At least one of `max_capacity` or `min_capacity` must be set.
     * 
     */
    @Import(name="maxCapacity")
      private final @Nullable Output<Integer> maxCapacity;

    public Output<Integer> getMaxCapacity() {
        return this.maxCapacity == null ? Output.empty() : this.maxCapacity;
    }

    /**
     * The minimum capacity. At least one of `min_capacity` or `max_capacity` must be set.
     * 
     */
    @Import(name="minCapacity")
      private final @Nullable Output<Integer> minCapacity;

    public Output<Integer> getMinCapacity() {
        return this.minCapacity == null ? Output.empty() : this.minCapacity;
    }

    public ScheduledActionScalableTargetActionArgs(
        @Nullable Output<Integer> maxCapacity,
        @Nullable Output<Integer> minCapacity) {
        this.maxCapacity = maxCapacity;
        this.minCapacity = minCapacity;
    }

    private ScheduledActionScalableTargetActionArgs() {
        this.maxCapacity = Output.empty();
        this.minCapacity = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ScheduledActionScalableTargetActionArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<Integer> maxCapacity;
        private @Nullable Output<Integer> minCapacity;

        public Builder() {
    	      // Empty
        }

        public Builder(ScheduledActionScalableTargetActionArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.maxCapacity = defaults.maxCapacity;
    	      this.minCapacity = defaults.minCapacity;
        }

        public Builder maxCapacity(@Nullable Output<Integer> maxCapacity) {
            this.maxCapacity = maxCapacity;
            return this;
        }
        public Builder maxCapacity(@Nullable Integer maxCapacity) {
            this.maxCapacity = Output.ofNullable(maxCapacity);
            return this;
        }
        public Builder minCapacity(@Nullable Output<Integer> minCapacity) {
            this.minCapacity = minCapacity;
            return this;
        }
        public Builder minCapacity(@Nullable Integer minCapacity) {
            this.minCapacity = Output.ofNullable(minCapacity);
            return this;
        }        public ScheduledActionScalableTargetActionArgs build() {
            return new ScheduledActionScalableTargetActionArgs(maxCapacity, minCapacity);
        }
    }
}
