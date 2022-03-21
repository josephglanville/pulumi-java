// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.monitoring.outputs;

import io.pulumi.core.annotations.CustomType;
import io.pulumi.gcp.monitoring.outputs.SloWindowsBasedSliGoodTotalRatioThreshold;
import io.pulumi.gcp.monitoring.outputs.SloWindowsBasedSliMetricMeanInRange;
import io.pulumi.gcp.monitoring.outputs.SloWindowsBasedSliMetricSumInRange;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class SloWindowsBasedSli {
    /**
     * A TimeSeries [monitoring filter](https://cloud.google.com/monitoring/api/v3/filters)
     * with ValueType = BOOL. The window is good if any true values
     * appear in the window. One of `good_bad_metric_filter`,
     * `good_total_ratio_threshold`, `metric_mean_in_range`,
     * `metric_sum_in_range` must be set for `windows_based_sli`.
     * 
     */
    private final @Nullable String goodBadMetricFilter;
    /**
     * Criterion that describes a window as good if its performance is
     * high enough. One of `good_bad_metric_filter`,
     * `good_total_ratio_threshold`, `metric_mean_in_range`,
     * `metric_sum_in_range` must be set for `windows_based_sli`.
     * Structure is documented below.
     * 
     */
    private final @Nullable SloWindowsBasedSliGoodTotalRatioThreshold goodTotalRatioThreshold;
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
    private final @Nullable SloWindowsBasedSliMetricMeanInRange metricMeanInRange;
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
    private final @Nullable SloWindowsBasedSliMetricSumInRange metricSumInRange;
    /**
     * Duration over which window quality is evaluated, given as a
     * duration string "{X}s" representing X seconds. Must be an
     * integer fraction of a day and at least 60s.
     * 
     */
    private final @Nullable String windowPeriod;

    @CustomType.Constructor
    private SloWindowsBasedSli(
        @CustomType.Parameter("goodBadMetricFilter") @Nullable String goodBadMetricFilter,
        @CustomType.Parameter("goodTotalRatioThreshold") @Nullable SloWindowsBasedSliGoodTotalRatioThreshold goodTotalRatioThreshold,
        @CustomType.Parameter("metricMeanInRange") @Nullable SloWindowsBasedSliMetricMeanInRange metricMeanInRange,
        @CustomType.Parameter("metricSumInRange") @Nullable SloWindowsBasedSliMetricSumInRange metricSumInRange,
        @CustomType.Parameter("windowPeriod") @Nullable String windowPeriod) {
        this.goodBadMetricFilter = goodBadMetricFilter;
        this.goodTotalRatioThreshold = goodTotalRatioThreshold;
        this.metricMeanInRange = metricMeanInRange;
        this.metricSumInRange = metricSumInRange;
        this.windowPeriod = windowPeriod;
    }

    /**
     * A TimeSeries [monitoring filter](https://cloud.google.com/monitoring/api/v3/filters)
     * with ValueType = BOOL. The window is good if any true values
     * appear in the window. One of `good_bad_metric_filter`,
     * `good_total_ratio_threshold`, `metric_mean_in_range`,
     * `metric_sum_in_range` must be set for `windows_based_sli`.
     * 
    */
    public Optional<String> getGoodBadMetricFilter() {
        return Optional.ofNullable(this.goodBadMetricFilter);
    }
    /**
     * Criterion that describes a window as good if its performance is
     * high enough. One of `good_bad_metric_filter`,
     * `good_total_ratio_threshold`, `metric_mean_in_range`,
     * `metric_sum_in_range` must be set for `windows_based_sli`.
     * Structure is documented below.
     * 
    */
    public Optional<SloWindowsBasedSliGoodTotalRatioThreshold> getGoodTotalRatioThreshold() {
        return Optional.ofNullable(this.goodTotalRatioThreshold);
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
    public Optional<SloWindowsBasedSliMetricMeanInRange> getMetricMeanInRange() {
        return Optional.ofNullable(this.metricMeanInRange);
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
    public Optional<SloWindowsBasedSliMetricSumInRange> getMetricSumInRange() {
        return Optional.ofNullable(this.metricSumInRange);
    }
    /**
     * Duration over which window quality is evaluated, given as a
     * duration string "{X}s" representing X seconds. Must be an
     * integer fraction of a day and at least 60s.
     * 
    */
    public Optional<String> getWindowPeriod() {
        return Optional.ofNullable(this.windowPeriod);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(SloWindowsBasedSli defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String goodBadMetricFilter;
        private @Nullable SloWindowsBasedSliGoodTotalRatioThreshold goodTotalRatioThreshold;
        private @Nullable SloWindowsBasedSliMetricMeanInRange metricMeanInRange;
        private @Nullable SloWindowsBasedSliMetricSumInRange metricSumInRange;
        private @Nullable String windowPeriod;

        public Builder() {
    	      // Empty
        }

        public Builder(SloWindowsBasedSli defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.goodBadMetricFilter = defaults.goodBadMetricFilter;
    	      this.goodTotalRatioThreshold = defaults.goodTotalRatioThreshold;
    	      this.metricMeanInRange = defaults.metricMeanInRange;
    	      this.metricSumInRange = defaults.metricSumInRange;
    	      this.windowPeriod = defaults.windowPeriod;
        }

        public Builder goodBadMetricFilter(@Nullable String goodBadMetricFilter) {
            this.goodBadMetricFilter = goodBadMetricFilter;
            return this;
        }
        public Builder goodTotalRatioThreshold(@Nullable SloWindowsBasedSliGoodTotalRatioThreshold goodTotalRatioThreshold) {
            this.goodTotalRatioThreshold = goodTotalRatioThreshold;
            return this;
        }
        public Builder metricMeanInRange(@Nullable SloWindowsBasedSliMetricMeanInRange metricMeanInRange) {
            this.metricMeanInRange = metricMeanInRange;
            return this;
        }
        public Builder metricSumInRange(@Nullable SloWindowsBasedSliMetricSumInRange metricSumInRange) {
            this.metricSumInRange = metricSumInRange;
            return this;
        }
        public Builder windowPeriod(@Nullable String windowPeriod) {
            this.windowPeriod = windowPeriod;
            return this;
        }        public SloWindowsBasedSli build() {
            return new SloWindowsBasedSli(goodBadMetricFilter, goodTotalRatioThreshold, metricMeanInRange, metricSumInRange, windowPeriod);
        }
    }
}
