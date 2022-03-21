// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.monitoring.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.gcp.monitoring.inputs.SloWindowsBasedSliGoodTotalRatioThresholdBasicSliPerformanceArgs;
import io.pulumi.gcp.monitoring.inputs.SloWindowsBasedSliGoodTotalRatioThresholdPerformanceArgs;
import java.lang.Double;
import java.util.Objects;
import javax.annotation.Nullable;


public final class SloWindowsBasedSliGoodTotalRatioThresholdArgs extends io.pulumi.resources.ResourceArgs {

    public static final SloWindowsBasedSliGoodTotalRatioThresholdArgs Empty = new SloWindowsBasedSliGoodTotalRatioThresholdArgs();

    /**
     * Basic SLI to evaluate to judge window quality.
     * Structure is documented below.
     * 
     */
    @Import(name="basicSliPerformance")
      private final @Nullable Output<SloWindowsBasedSliGoodTotalRatioThresholdBasicSliPerformanceArgs> basicSliPerformance;

    public Output<SloWindowsBasedSliGoodTotalRatioThresholdBasicSliPerformanceArgs> getBasicSliPerformance() {
        return this.basicSliPerformance == null ? Output.empty() : this.basicSliPerformance;
    }

    /**
     * Request-based SLI to evaluate to judge window quality.
     * Structure is documented below.
     * 
     */
    @Import(name="performance")
      private final @Nullable Output<SloWindowsBasedSliGoodTotalRatioThresholdPerformanceArgs> performance;

    public Output<SloWindowsBasedSliGoodTotalRatioThresholdPerformanceArgs> getPerformance() {
        return this.performance == null ? Output.empty() : this.performance;
    }

    /**
     * A duration string, e.g. 10s.
     * Good service is defined to be the count of requests made to
     * this service that return in no more than threshold.
     * 
     */
    @Import(name="threshold")
      private final @Nullable Output<Double> threshold;

    public Output<Double> getThreshold() {
        return this.threshold == null ? Output.empty() : this.threshold;
    }

    public SloWindowsBasedSliGoodTotalRatioThresholdArgs(
        @Nullable Output<SloWindowsBasedSliGoodTotalRatioThresholdBasicSliPerformanceArgs> basicSliPerformance,
        @Nullable Output<SloWindowsBasedSliGoodTotalRatioThresholdPerformanceArgs> performance,
        @Nullable Output<Double> threshold) {
        this.basicSliPerformance = basicSliPerformance;
        this.performance = performance;
        this.threshold = threshold;
    }

    private SloWindowsBasedSliGoodTotalRatioThresholdArgs() {
        this.basicSliPerformance = Output.empty();
        this.performance = Output.empty();
        this.threshold = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(SloWindowsBasedSliGoodTotalRatioThresholdArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<SloWindowsBasedSliGoodTotalRatioThresholdBasicSliPerformanceArgs> basicSliPerformance;
        private @Nullable Output<SloWindowsBasedSliGoodTotalRatioThresholdPerformanceArgs> performance;
        private @Nullable Output<Double> threshold;

        public Builder() {
    	      // Empty
        }

        public Builder(SloWindowsBasedSliGoodTotalRatioThresholdArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.basicSliPerformance = defaults.basicSliPerformance;
    	      this.performance = defaults.performance;
    	      this.threshold = defaults.threshold;
        }

        public Builder basicSliPerformance(@Nullable Output<SloWindowsBasedSliGoodTotalRatioThresholdBasicSliPerformanceArgs> basicSliPerformance) {
            this.basicSliPerformance = basicSliPerformance;
            return this;
        }
        public Builder basicSliPerformance(@Nullable SloWindowsBasedSliGoodTotalRatioThresholdBasicSliPerformanceArgs basicSliPerformance) {
            this.basicSliPerformance = Output.ofNullable(basicSliPerformance);
            return this;
        }
        public Builder performance(@Nullable Output<SloWindowsBasedSliGoodTotalRatioThresholdPerformanceArgs> performance) {
            this.performance = performance;
            return this;
        }
        public Builder performance(@Nullable SloWindowsBasedSliGoodTotalRatioThresholdPerformanceArgs performance) {
            this.performance = Output.ofNullable(performance);
            return this;
        }
        public Builder threshold(@Nullable Output<Double> threshold) {
            this.threshold = threshold;
            return this;
        }
        public Builder threshold(@Nullable Double threshold) {
            this.threshold = Output.ofNullable(threshold);
            return this;
        }        public SloWindowsBasedSliGoodTotalRatioThresholdArgs build() {
            return new SloWindowsBasedSliGoodTotalRatioThresholdArgs(basicSliPerformance, performance, threshold);
        }
    }
}
