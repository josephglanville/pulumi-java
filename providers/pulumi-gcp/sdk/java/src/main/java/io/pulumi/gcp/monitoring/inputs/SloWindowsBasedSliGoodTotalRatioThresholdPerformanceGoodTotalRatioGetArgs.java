// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.monitoring.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class SloWindowsBasedSliGoodTotalRatioThresholdPerformanceGoodTotalRatioGetArgs extends io.pulumi.resources.ResourceArgs {

    public static final SloWindowsBasedSliGoodTotalRatioThresholdPerformanceGoodTotalRatioGetArgs Empty = new SloWindowsBasedSliGoodTotalRatioThresholdPerformanceGoodTotalRatioGetArgs();

    /**
     * A TimeSeries [monitoring filter](https://cloud.google.com/monitoring/api/v3/filters)
     * quantifying bad service provided, either demanded service that
     * was not provided or demanded service that was of inadequate
     * quality. Exactly two of
     * good, bad, or total service filter must be defined (where
     * good + bad = total is assumed)
     * Must have ValueType = DOUBLE or ValueType = INT64 and
     * must have MetricKind = DELTA or MetricKind = CUMULATIVE.
     * 
     */
    @Import(name="badServiceFilter")
      private final @Nullable Output<String> badServiceFilter;

    public Output<String> getBadServiceFilter() {
        return this.badServiceFilter == null ? Codegen.empty() : this.badServiceFilter;
    }

    /**
     * A TimeSeries [monitoring filter](https://cloud.google.com/monitoring/api/v3/filters)
     * quantifying good service provided. Exactly two of
     * good, bad, or total service filter must be defined (where
     * good + bad = total is assumed)
     * Must have ValueType = DOUBLE or ValueType = INT64 and
     * must have MetricKind = DELTA or MetricKind = CUMULATIVE.
     * 
     */
    @Import(name="goodServiceFilter")
      private final @Nullable Output<String> goodServiceFilter;

    public Output<String> getGoodServiceFilter() {
        return this.goodServiceFilter == null ? Codegen.empty() : this.goodServiceFilter;
    }

    /**
     * A TimeSeries [monitoring filter](https://cloud.google.com/monitoring/api/v3/filters)
     * quantifying total demanded service. Exactly two of
     * good, bad, or total service filter must be defined (where
     * good + bad = total is assumed)
     * Must have ValueType = DOUBLE or ValueType = INT64 and
     * must have MetricKind = DELTA or MetricKind = CUMULATIVE.
     * 
     */
    @Import(name="totalServiceFilter")
      private final @Nullable Output<String> totalServiceFilter;

    public Output<String> getTotalServiceFilter() {
        return this.totalServiceFilter == null ? Codegen.empty() : this.totalServiceFilter;
    }

    public SloWindowsBasedSliGoodTotalRatioThresholdPerformanceGoodTotalRatioGetArgs(
        @Nullable Output<String> badServiceFilter,
        @Nullable Output<String> goodServiceFilter,
        @Nullable Output<String> totalServiceFilter) {
        this.badServiceFilter = badServiceFilter;
        this.goodServiceFilter = goodServiceFilter;
        this.totalServiceFilter = totalServiceFilter;
    }

    private SloWindowsBasedSliGoodTotalRatioThresholdPerformanceGoodTotalRatioGetArgs() {
        this.badServiceFilter = Codegen.empty();
        this.goodServiceFilter = Codegen.empty();
        this.totalServiceFilter = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(SloWindowsBasedSliGoodTotalRatioThresholdPerformanceGoodTotalRatioGetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<String> badServiceFilter;
        private @Nullable Output<String> goodServiceFilter;
        private @Nullable Output<String> totalServiceFilter;

        public Builder() {
    	      // Empty
        }

        public Builder(SloWindowsBasedSliGoodTotalRatioThresholdPerformanceGoodTotalRatioGetArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.badServiceFilter = defaults.badServiceFilter;
    	      this.goodServiceFilter = defaults.goodServiceFilter;
    	      this.totalServiceFilter = defaults.totalServiceFilter;
        }

        public Builder badServiceFilter(@Nullable Output<String> badServiceFilter) {
            this.badServiceFilter = badServiceFilter;
            return this;
        }
        public Builder badServiceFilter(@Nullable String badServiceFilter) {
            this.badServiceFilter = Codegen.ofNullable(badServiceFilter);
            return this;
        }
        public Builder goodServiceFilter(@Nullable Output<String> goodServiceFilter) {
            this.goodServiceFilter = goodServiceFilter;
            return this;
        }
        public Builder goodServiceFilter(@Nullable String goodServiceFilter) {
            this.goodServiceFilter = Codegen.ofNullable(goodServiceFilter);
            return this;
        }
        public Builder totalServiceFilter(@Nullable Output<String> totalServiceFilter) {
            this.totalServiceFilter = totalServiceFilter;
            return this;
        }
        public Builder totalServiceFilter(@Nullable String totalServiceFilter) {
            this.totalServiceFilter = Codegen.ofNullable(totalServiceFilter);
            return this;
        }        public SloWindowsBasedSliGoodTotalRatioThresholdPerformanceGoodTotalRatioGetArgs build() {
            return new SloWindowsBasedSliGoodTotalRatioThresholdPerformanceGoodTotalRatioGetArgs(badServiceFilter, goodServiceFilter, totalServiceFilter);
        }
    }
}
