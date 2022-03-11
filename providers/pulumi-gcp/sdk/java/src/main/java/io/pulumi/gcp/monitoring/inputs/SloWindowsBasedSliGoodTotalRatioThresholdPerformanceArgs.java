// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.monitoring.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.InputImport;
import io.pulumi.gcp.monitoring.inputs.SloWindowsBasedSliGoodTotalRatioThresholdPerformanceDistributionCutArgs;
import io.pulumi.gcp.monitoring.inputs.SloWindowsBasedSliGoodTotalRatioThresholdPerformanceGoodTotalRatioArgs;
import java.util.Objects;
import javax.annotation.Nullable;


public final class SloWindowsBasedSliGoodTotalRatioThresholdPerformanceArgs extends io.pulumi.resources.ResourceArgs {

    public static final SloWindowsBasedSliGoodTotalRatioThresholdPerformanceArgs Empty = new SloWindowsBasedSliGoodTotalRatioThresholdPerformanceArgs();

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
      private final @Nullable Output<SloWindowsBasedSliGoodTotalRatioThresholdPerformanceDistributionCutArgs> distributionCut;

    public Output<SloWindowsBasedSliGoodTotalRatioThresholdPerformanceDistributionCutArgs> getDistributionCut() {
        return this.distributionCut == null ? Output.empty() : this.distributionCut;
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
      private final @Nullable Output<SloWindowsBasedSliGoodTotalRatioThresholdPerformanceGoodTotalRatioArgs> goodTotalRatio;

    public Output<SloWindowsBasedSliGoodTotalRatioThresholdPerformanceGoodTotalRatioArgs> getGoodTotalRatio() {
        return this.goodTotalRatio == null ? Output.empty() : this.goodTotalRatio;
    }

    public SloWindowsBasedSliGoodTotalRatioThresholdPerformanceArgs(
        @Nullable Output<SloWindowsBasedSliGoodTotalRatioThresholdPerformanceDistributionCutArgs> distributionCut,
        @Nullable Output<SloWindowsBasedSliGoodTotalRatioThresholdPerformanceGoodTotalRatioArgs> goodTotalRatio) {
        this.distributionCut = distributionCut;
        this.goodTotalRatio = goodTotalRatio;
    }

    private SloWindowsBasedSliGoodTotalRatioThresholdPerformanceArgs() {
        this.distributionCut = Output.empty();
        this.goodTotalRatio = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(SloWindowsBasedSliGoodTotalRatioThresholdPerformanceArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<SloWindowsBasedSliGoodTotalRatioThresholdPerformanceDistributionCutArgs> distributionCut;
        private @Nullable Output<SloWindowsBasedSliGoodTotalRatioThresholdPerformanceGoodTotalRatioArgs> goodTotalRatio;

        public Builder() {
    	      // Empty
        }

        public Builder(SloWindowsBasedSliGoodTotalRatioThresholdPerformanceArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.distributionCut = defaults.distributionCut;
    	      this.goodTotalRatio = defaults.goodTotalRatio;
        }

        public Builder distributionCut(@Nullable Output<SloWindowsBasedSliGoodTotalRatioThresholdPerformanceDistributionCutArgs> distributionCut) {
            this.distributionCut = distributionCut;
            return this;
        }

        public Builder distributionCut(@Nullable SloWindowsBasedSliGoodTotalRatioThresholdPerformanceDistributionCutArgs distributionCut) {
            this.distributionCut = Output.ofNullable(distributionCut);
            return this;
        }

        public Builder goodTotalRatio(@Nullable Output<SloWindowsBasedSliGoodTotalRatioThresholdPerformanceGoodTotalRatioArgs> goodTotalRatio) {
            this.goodTotalRatio = goodTotalRatio;
            return this;
        }

        public Builder goodTotalRatio(@Nullable SloWindowsBasedSliGoodTotalRatioThresholdPerformanceGoodTotalRatioArgs goodTotalRatio) {
            this.goodTotalRatio = Output.ofNullable(goodTotalRatio);
            return this;
        }
        public SloWindowsBasedSliGoodTotalRatioThresholdPerformanceArgs build() {
            return new SloWindowsBasedSliGoodTotalRatioThresholdPerformanceArgs(distributionCut, goodTotalRatio);
        }
    }
}
