// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.monitoring.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.Double;
import java.util.Objects;
import javax.annotation.Nullable;


public final class SloWindowsBasedSliGoodTotalRatioThresholdPerformanceDistributionCutRangeArgs extends io.pulumi.resources.ResourceArgs {

    public static final SloWindowsBasedSliGoodTotalRatioThresholdPerformanceDistributionCutRangeArgs Empty = new SloWindowsBasedSliGoodTotalRatioThresholdPerformanceDistributionCutRangeArgs();

    /**
     * max value for the range (inclusive). If not given,
     * will be set to "infinity", defining an open range
     * ">= range.min"
     * 
     */
    @InputImport(name="max")
      private final @Nullable Input<Double> max;

    public Input<Double> getMax() {
        return this.max == null ? Input.empty() : this.max;
    }

    /**
     * Min value for the range (inclusive). If not given,
     * will be set to "-infinity", defining an open range
     * "< range.max"
     * 
     */
    @InputImport(name="min")
      private final @Nullable Input<Double> min;

    public Input<Double> getMin() {
        return this.min == null ? Input.empty() : this.min;
    }

    public SloWindowsBasedSliGoodTotalRatioThresholdPerformanceDistributionCutRangeArgs(
        @Nullable Input<Double> max,
        @Nullable Input<Double> min) {
        this.max = max;
        this.min = min;
    }

    private SloWindowsBasedSliGoodTotalRatioThresholdPerformanceDistributionCutRangeArgs() {
        this.max = Input.empty();
        this.min = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(SloWindowsBasedSliGoodTotalRatioThresholdPerformanceDistributionCutRangeArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<Double> max;
        private @Nullable Input<Double> min;

        public Builder() {
    	      // Empty
        }

        public Builder(SloWindowsBasedSliGoodTotalRatioThresholdPerformanceDistributionCutRangeArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.max = defaults.max;
    	      this.min = defaults.min;
        }

        public Builder setMax(@Nullable Input<Double> max) {
            this.max = max;
            return this;
        }

        public Builder setMax(@Nullable Double max) {
            this.max = Input.ofNullable(max);
            return this;
        }

        public Builder setMin(@Nullable Input<Double> min) {
            this.min = min;
            return this;
        }

        public Builder setMin(@Nullable Double min) {
            this.min = Input.ofNullable(min);
            return this;
        }
        public SloWindowsBasedSliGoodTotalRatioThresholdPerformanceDistributionCutRangeArgs build() {
            return new SloWindowsBasedSliGoodTotalRatioThresholdPerformanceDistributionCutRangeArgs(max, min);
        }
    }
}
