// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.monitoring.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import io.pulumi.gcp.monitoring.inputs.SloWindowsBasedSliGoodTotalRatioThresholdPerformanceDistributionCutGetArgs;
import io.pulumi.gcp.monitoring.inputs.SloWindowsBasedSliGoodTotalRatioThresholdPerformanceGoodTotalRatioGetArgs;
import java.util.Objects;
import javax.annotation.Nullable;


public final class SloWindowsBasedSliGoodTotalRatioThresholdPerformanceGetArgs extends io.pulumi.resources.ResourceArgs {

    public static final SloWindowsBasedSliGoodTotalRatioThresholdPerformanceGetArgs Empty = new SloWindowsBasedSliGoodTotalRatioThresholdPerformanceGetArgs();

    /**
     * Used when good_service is defined by a count of values aggregated in a
     * Distribution that fall into a good range. The total_service is the
     * total count of all values aggregated in the Distribution.
     * Defines a distribution TimeSeries filter and thresholds used for
     * measuring good service and total service.
     * Structure is documented below.
     * 
     */
    @InputImport(name="distributionCut")
      private final @Nullable Input<SloWindowsBasedSliGoodTotalRatioThresholdPerformanceDistributionCutGetArgs> distributionCut;

    public Input<SloWindowsBasedSliGoodTotalRatioThresholdPerformanceDistributionCutGetArgs> getDistributionCut() {
        return this.distributionCut == null ? Input.empty() : this.distributionCut;
    }

    /**
     * A means to compute a ratio of `good_service` to `total_service`.
     * Defines computing this ratio with two TimeSeries [monitoring filters](https://cloud.google.com/monitoring/api/v3/filters)
     * Must specify exactly two of good, bad, and total service filters.
     * The relationship good_service + bad_service = total_service
     * will be assumed.
     * Structure is documented below.
     * 
     */
    @InputImport(name="goodTotalRatio")
      private final @Nullable Input<SloWindowsBasedSliGoodTotalRatioThresholdPerformanceGoodTotalRatioGetArgs> goodTotalRatio;

    public Input<SloWindowsBasedSliGoodTotalRatioThresholdPerformanceGoodTotalRatioGetArgs> getGoodTotalRatio() {
        return this.goodTotalRatio == null ? Input.empty() : this.goodTotalRatio;
    }

    public SloWindowsBasedSliGoodTotalRatioThresholdPerformanceGetArgs(
        @Nullable Input<SloWindowsBasedSliGoodTotalRatioThresholdPerformanceDistributionCutGetArgs> distributionCut,
        @Nullable Input<SloWindowsBasedSliGoodTotalRatioThresholdPerformanceGoodTotalRatioGetArgs> goodTotalRatio) {
        this.distributionCut = distributionCut;
        this.goodTotalRatio = goodTotalRatio;
    }

    private SloWindowsBasedSliGoodTotalRatioThresholdPerformanceGetArgs() {
        this.distributionCut = Input.empty();
        this.goodTotalRatio = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(SloWindowsBasedSliGoodTotalRatioThresholdPerformanceGetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<SloWindowsBasedSliGoodTotalRatioThresholdPerformanceDistributionCutGetArgs> distributionCut;
        private @Nullable Input<SloWindowsBasedSliGoodTotalRatioThresholdPerformanceGoodTotalRatioGetArgs> goodTotalRatio;

        public Builder() {
    	      // Empty
        }

        public Builder(SloWindowsBasedSliGoodTotalRatioThresholdPerformanceGetArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.distributionCut = defaults.distributionCut;
    	      this.goodTotalRatio = defaults.goodTotalRatio;
        }

        public Builder setDistributionCut(@Nullable Input<SloWindowsBasedSliGoodTotalRatioThresholdPerformanceDistributionCutGetArgs> distributionCut) {
            this.distributionCut = distributionCut;
            return this;
        }

        public Builder setDistributionCut(@Nullable SloWindowsBasedSliGoodTotalRatioThresholdPerformanceDistributionCutGetArgs distributionCut) {
            this.distributionCut = Input.ofNullable(distributionCut);
            return this;
        }

        public Builder setGoodTotalRatio(@Nullable Input<SloWindowsBasedSliGoodTotalRatioThresholdPerformanceGoodTotalRatioGetArgs> goodTotalRatio) {
            this.goodTotalRatio = goodTotalRatio;
            return this;
        }

        public Builder setGoodTotalRatio(@Nullable SloWindowsBasedSliGoodTotalRatioThresholdPerformanceGoodTotalRatioGetArgs goodTotalRatio) {
            this.goodTotalRatio = Input.ofNullable(goodTotalRatio);
            return this;
        }
        public SloWindowsBasedSliGoodTotalRatioThresholdPerformanceGetArgs build() {
            return new SloWindowsBasedSliGoodTotalRatioThresholdPerformanceGetArgs(distributionCut, goodTotalRatio);
        }
    }
}
