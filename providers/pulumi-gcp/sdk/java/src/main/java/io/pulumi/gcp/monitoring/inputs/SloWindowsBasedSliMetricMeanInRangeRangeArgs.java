// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.monitoring.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import java.lang.Double;
import java.util.Objects;
import javax.annotation.Nullable;


public final class SloWindowsBasedSliMetricMeanInRangeRangeArgs extends io.pulumi.resources.ResourceArgs {

    public static final SloWindowsBasedSliMetricMeanInRangeRangeArgs Empty = new SloWindowsBasedSliMetricMeanInRangeRangeArgs();

    /**
     * max value for the range (inclusive). If not given,
     * will be set to "infinity", defining an open range
     * ">= range.min"
     * 
     */
    @Import(name="max")
      private final @Nullable Output<Double> max;

    public Output<Double> getMax() {
        return this.max == null ? Output.empty() : this.max;
    }

    /**
     * Min value for the range (inclusive). If not given,
     * will be set to "-infinity", defining an open range
     * "< range.max"
     * 
     */
    @Import(name="min")
      private final @Nullable Output<Double> min;

    public Output<Double> getMin() {
        return this.min == null ? Output.empty() : this.min;
    }

    public SloWindowsBasedSliMetricMeanInRangeRangeArgs(
        @Nullable Output<Double> max,
        @Nullable Output<Double> min) {
        this.max = max;
        this.min = min;
    }

    private SloWindowsBasedSliMetricMeanInRangeRangeArgs() {
        this.max = Output.empty();
        this.min = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(SloWindowsBasedSliMetricMeanInRangeRangeArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<Double> max;
        private @Nullable Output<Double> min;

        public Builder() {
    	      // Empty
        }

        public Builder(SloWindowsBasedSliMetricMeanInRangeRangeArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.max = defaults.max;
    	      this.min = defaults.min;
        }

        public Builder max(@Nullable Output<Double> max) {
            this.max = max;
            return this;
        }
        public Builder max(@Nullable Double max) {
            this.max = Output.ofNullable(max);
            return this;
        }
        public Builder min(@Nullable Output<Double> min) {
            this.min = min;
            return this;
        }
        public Builder min(@Nullable Double min) {
            this.min = Output.ofNullable(min);
            return this;
        }        public SloWindowsBasedSliMetricMeanInRangeRangeArgs build() {
            return new SloWindowsBasedSliMetricMeanInRangeRangeArgs(max, min);
        }
    }
}
