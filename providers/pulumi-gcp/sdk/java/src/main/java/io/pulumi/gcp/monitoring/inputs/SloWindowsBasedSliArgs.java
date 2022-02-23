// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.monitoring.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import io.pulumi.gcp.monitoring.inputs.SloWindowsBasedSliGoodTotalRatioThresholdArgs;
import io.pulumi.gcp.monitoring.inputs.SloWindowsBasedSliMetricMeanInRangeArgs;
import io.pulumi.gcp.monitoring.inputs.SloWindowsBasedSliMetricSumInRangeArgs;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class SloWindowsBasedSliArgs extends io.pulumi.resources.ResourceArgs {

    public static final SloWindowsBasedSliArgs Empty = new SloWindowsBasedSliArgs();

    /**
     * A TimeSeries [monitoring filter](https://cloud.google.com/monitoring/api/v3/filters)
     * with ValueType = BOOL. The window is good if any true values
     * appear in the window. One of `good_bad_metric_filter`,
     * `good_total_ratio_threshold`, `metric_mean_in_range`,
     * `metric_sum_in_range` must be set for `windows_based_sli`.
     * 
     */
    @InputImport(name="goodBadMetricFilter")
      private final @Nullable Input<String> goodBadMetricFilter;

    public Input<String> getGoodBadMetricFilter() {
        return this.goodBadMetricFilter == null ? Input.empty() : this.goodBadMetricFilter;
    }

    /**
     * Criterion that describes a window as good if its performance is
     * high enough. One of `good_bad_metric_filter`,
     * `good_total_ratio_threshold`, `metric_mean_in_range`,
     * `metric_sum_in_range` must be set for `windows_based_sli`.
     * Structure is documented below.
     * 
     */
    @InputImport(name="goodTotalRatioThreshold")
      private final @Nullable Input<SloWindowsBasedSliGoodTotalRatioThresholdArgs> goodTotalRatioThreshold;

    public Input<SloWindowsBasedSliGoodTotalRatioThresholdArgs> getGoodTotalRatioThreshold() {
        return this.goodTotalRatioThreshold == null ? Input.empty() : this.goodTotalRatioThreshold;
    }

    /**
     * Criterion that describes a window as good if the metric's value
     * is in a good range, *averaged* across returned streams.
     * One of `good_bad_metric_filter`,
     * `good_total_ratio_threshold`, `metric_mean_in_range`,
     * `metric_sum_in_range` must be set for `windows_based_sli`.
     * Average value X of `time_series` should satisfy
     * `range.min <= X <= range.max` for a good window.
     * Structure is documented below.
     * 
     */
    @InputImport(name="metricMeanInRange")
      private final @Nullable Input<SloWindowsBasedSliMetricMeanInRangeArgs> metricMeanInRange;

    public Input<SloWindowsBasedSliMetricMeanInRangeArgs> getMetricMeanInRange() {
        return this.metricMeanInRange == null ? Input.empty() : this.metricMeanInRange;
    }

    /**
     * Criterion that describes a window as good if the metric's value
     * is in a good range, *summed* across returned streams.
     * Summed value `X` of `time_series` should satisfy
     * `range.min <= X <= range.max` for a good window.
     * One of `good_bad_metric_filter`,
     * `good_total_ratio_threshold`, `metric_mean_in_range`,
     * `metric_sum_in_range` must be set for `windows_based_sli`.
     * Structure is documented below.
     * 
     */
    @InputImport(name="metricSumInRange")
      private final @Nullable Input<SloWindowsBasedSliMetricSumInRangeArgs> metricSumInRange;

    public Input<SloWindowsBasedSliMetricSumInRangeArgs> getMetricSumInRange() {
        return this.metricSumInRange == null ? Input.empty() : this.metricSumInRange;
    }

    /**
     * Duration over which window quality is evaluated, given as a
     * duration string "{X}s" representing X seconds. Must be an
     * integer fraction of a day and at least 60s.
     * 
     */
    @InputImport(name="windowPeriod")
      private final @Nullable Input<String> windowPeriod;

    public Input<String> getWindowPeriod() {
        return this.windowPeriod == null ? Input.empty() : this.windowPeriod;
    }

    public SloWindowsBasedSliArgs(
        @Nullable Input<String> goodBadMetricFilter,
        @Nullable Input<SloWindowsBasedSliGoodTotalRatioThresholdArgs> goodTotalRatioThreshold,
        @Nullable Input<SloWindowsBasedSliMetricMeanInRangeArgs> metricMeanInRange,
        @Nullable Input<SloWindowsBasedSliMetricSumInRangeArgs> metricSumInRange,
        @Nullable Input<String> windowPeriod) {
        this.goodBadMetricFilter = goodBadMetricFilter;
        this.goodTotalRatioThreshold = goodTotalRatioThreshold;
        this.metricMeanInRange = metricMeanInRange;
        this.metricSumInRange = metricSumInRange;
        this.windowPeriod = windowPeriod;
    }

    private SloWindowsBasedSliArgs() {
        this.goodBadMetricFilter = Input.empty();
        this.goodTotalRatioThreshold = Input.empty();
        this.metricMeanInRange = Input.empty();
        this.metricSumInRange = Input.empty();
        this.windowPeriod = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(SloWindowsBasedSliArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<String> goodBadMetricFilter;
        private @Nullable Input<SloWindowsBasedSliGoodTotalRatioThresholdArgs> goodTotalRatioThreshold;
        private @Nullable Input<SloWindowsBasedSliMetricMeanInRangeArgs> metricMeanInRange;
        private @Nullable Input<SloWindowsBasedSliMetricSumInRangeArgs> metricSumInRange;
        private @Nullable Input<String> windowPeriod;

        public Builder() {
    	      // Empty
        }

        public Builder(SloWindowsBasedSliArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.goodBadMetricFilter = defaults.goodBadMetricFilter;
    	      this.goodTotalRatioThreshold = defaults.goodTotalRatioThreshold;
    	      this.metricMeanInRange = defaults.metricMeanInRange;
    	      this.metricSumInRange = defaults.metricSumInRange;
    	      this.windowPeriod = defaults.windowPeriod;
        }

        public Builder setGoodBadMetricFilter(@Nullable Input<String> goodBadMetricFilter) {
            this.goodBadMetricFilter = goodBadMetricFilter;
            return this;
        }

        public Builder setGoodBadMetricFilter(@Nullable String goodBadMetricFilter) {
            this.goodBadMetricFilter = Input.ofNullable(goodBadMetricFilter);
            return this;
        }

        public Builder setGoodTotalRatioThreshold(@Nullable Input<SloWindowsBasedSliGoodTotalRatioThresholdArgs> goodTotalRatioThreshold) {
            this.goodTotalRatioThreshold = goodTotalRatioThreshold;
            return this;
        }

        public Builder setGoodTotalRatioThreshold(@Nullable SloWindowsBasedSliGoodTotalRatioThresholdArgs goodTotalRatioThreshold) {
            this.goodTotalRatioThreshold = Input.ofNullable(goodTotalRatioThreshold);
            return this;
        }

        public Builder setMetricMeanInRange(@Nullable Input<SloWindowsBasedSliMetricMeanInRangeArgs> metricMeanInRange) {
            this.metricMeanInRange = metricMeanInRange;
            return this;
        }

        public Builder setMetricMeanInRange(@Nullable SloWindowsBasedSliMetricMeanInRangeArgs metricMeanInRange) {
            this.metricMeanInRange = Input.ofNullable(metricMeanInRange);
            return this;
        }

        public Builder setMetricSumInRange(@Nullable Input<SloWindowsBasedSliMetricSumInRangeArgs> metricSumInRange) {
            this.metricSumInRange = metricSumInRange;
            return this;
        }

        public Builder setMetricSumInRange(@Nullable SloWindowsBasedSliMetricSumInRangeArgs metricSumInRange) {
            this.metricSumInRange = Input.ofNullable(metricSumInRange);
            return this;
        }

        public Builder setWindowPeriod(@Nullable Input<String> windowPeriod) {
            this.windowPeriod = windowPeriod;
            return this;
        }

        public Builder setWindowPeriod(@Nullable String windowPeriod) {
            this.windowPeriod = Input.ofNullable(windowPeriod);
            return this;
        }
        public SloWindowsBasedSliArgs build() {
            return new SloWindowsBasedSliArgs(goodBadMetricFilter, goodTotalRatioThreshold, metricMeanInRange, metricSumInRange, windowPeriod);
        }
    }
}
