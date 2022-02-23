// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.monitoring.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


public final class AlertPolicyConditionConditionAbsentAggregationGetArgs extends io.pulumi.resources.ResourceArgs {

    public static final AlertPolicyConditionConditionAbsentAggregationGetArgs Empty = new AlertPolicyConditionConditionAbsentAggregationGetArgs();

    /**
     * The alignment period for per-time
     * series alignment. If present,
     * alignmentPeriod must be at least
     * 60 seconds. After per-time series
     * alignment, each time series will
     * contain data points only on the
     * period boundaries. If
     * perSeriesAligner is not specified
     * or equals ALIGN_NONE, then this
     * field is ignored. If
     * perSeriesAligner is specified and
     * does not equal ALIGN_NONE, then
     * this field must be defined;
     * otherwise an error is returned.
     * 
     */
    @InputImport(name="alignmentPeriod")
      private final @Nullable Input<String> alignmentPeriod;

    public Input<String> getAlignmentPeriod() {
        return this.alignmentPeriod == null ? Input.empty() : this.alignmentPeriod;
    }

    /**
     * The approach to be used to combine
     * time series. Not all reducer
     * functions may be applied to all
     * time series, depending on the
     * metric type and the value type of
     * the original time series.
     * Reduction may change the metric
     * type of value type of the time
     * series.Time series data must be
     * aligned in order to perform cross-
     * time series reduction. If
     * crossSeriesReducer is specified,
     * then perSeriesAligner must be
     * specified and not equal ALIGN_NONE
     * and alignmentPeriod must be
     * specified; otherwise, an error is
     * returned.
     * Possible values are `REDUCE_NONE`, `REDUCE_MEAN`, `REDUCE_MIN`, `REDUCE_MAX`, `REDUCE_SUM`, `REDUCE_STDDEV`, `REDUCE_COUNT`, `REDUCE_COUNT_TRUE`, `REDUCE_COUNT_FALSE`, `REDUCE_FRACTION_TRUE`, `REDUCE_PERCENTILE_99`, `REDUCE_PERCENTILE_95`, `REDUCE_PERCENTILE_50`, and `REDUCE_PERCENTILE_05`.
     * 
     */
    @InputImport(name="crossSeriesReducer")
      private final @Nullable Input<String> crossSeriesReducer;

    public Input<String> getCrossSeriesReducer() {
        return this.crossSeriesReducer == null ? Input.empty() : this.crossSeriesReducer;
    }

    /**
     * The set of fields to preserve when
     * crossSeriesReducer is specified.
     * The groupByFields determine how
     * the time series are partitioned
     * into subsets prior to applying the
     * aggregation function. Each subset
     * contains time series that have the
     * same value for each of the
     * grouping fields. Each individual
     * time series is a member of exactly
     * one subset. The crossSeriesReducer
     * is applied to each subset of time
     * series. It is not possible to
     * reduce across different resource
     * types, so this field implicitly
     * contains resource.type. Fields not
     * specified in groupByFields are
     * aggregated away. If groupByFields
     * is not specified and all the time
     * series have the same resource
     * type, then the time series are
     * aggregated into a single output
     * time series. If crossSeriesReducer
     * is not defined, this field is
     * ignored.
     * 
     */
    @InputImport(name="groupByFields")
      private final @Nullable Input<List<String>> groupByFields;

    public Input<List<String>> getGroupByFields() {
        return this.groupByFields == null ? Input.empty() : this.groupByFields;
    }

    /**
     * The approach to be used to align
     * individual time series. Not all
     * alignment functions may be applied
     * to all time series, depending on
     * the metric type and value type of
     * the original time series.
     * Alignment may change the metric
     * type or the value type of the time
     * series.Time series data must be
     * aligned in order to perform cross-
     * time series reduction. If
     * crossSeriesReducer is specified,
     * then perSeriesAligner must be
     * specified and not equal ALIGN_NONE
     * and alignmentPeriod must be
     * specified; otherwise, an error is
     * returned.
     * Possible values are `ALIGN_NONE`, `ALIGN_DELTA`, `ALIGN_RATE`, `ALIGN_INTERPOLATE`, `ALIGN_NEXT_OLDER`, `ALIGN_MIN`, `ALIGN_MAX`, `ALIGN_MEAN`, `ALIGN_COUNT`, `ALIGN_SUM`, `ALIGN_STDDEV`, `ALIGN_COUNT_TRUE`, `ALIGN_COUNT_FALSE`, `ALIGN_FRACTION_TRUE`, `ALIGN_PERCENTILE_99`, `ALIGN_PERCENTILE_95`, `ALIGN_PERCENTILE_50`, `ALIGN_PERCENTILE_05`, and `ALIGN_PERCENT_CHANGE`.
     * 
     */
    @InputImport(name="perSeriesAligner")
      private final @Nullable Input<String> perSeriesAligner;

    public Input<String> getPerSeriesAligner() {
        return this.perSeriesAligner == null ? Input.empty() : this.perSeriesAligner;
    }

    public AlertPolicyConditionConditionAbsentAggregationGetArgs(
        @Nullable Input<String> alignmentPeriod,
        @Nullable Input<String> crossSeriesReducer,
        @Nullable Input<List<String>> groupByFields,
        @Nullable Input<String> perSeriesAligner) {
        this.alignmentPeriod = alignmentPeriod;
        this.crossSeriesReducer = crossSeriesReducer;
        this.groupByFields = groupByFields;
        this.perSeriesAligner = perSeriesAligner;
    }

    private AlertPolicyConditionConditionAbsentAggregationGetArgs() {
        this.alignmentPeriod = Input.empty();
        this.crossSeriesReducer = Input.empty();
        this.groupByFields = Input.empty();
        this.perSeriesAligner = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(AlertPolicyConditionConditionAbsentAggregationGetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<String> alignmentPeriod;
        private @Nullable Input<String> crossSeriesReducer;
        private @Nullable Input<List<String>> groupByFields;
        private @Nullable Input<String> perSeriesAligner;

        public Builder() {
    	      // Empty
        }

        public Builder(AlertPolicyConditionConditionAbsentAggregationGetArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.alignmentPeriod = defaults.alignmentPeriod;
    	      this.crossSeriesReducer = defaults.crossSeriesReducer;
    	      this.groupByFields = defaults.groupByFields;
    	      this.perSeriesAligner = defaults.perSeriesAligner;
        }

        public Builder setAlignmentPeriod(@Nullable Input<String> alignmentPeriod) {
            this.alignmentPeriod = alignmentPeriod;
            return this;
        }

        public Builder setAlignmentPeriod(@Nullable String alignmentPeriod) {
            this.alignmentPeriod = Input.ofNullable(alignmentPeriod);
            return this;
        }

        public Builder setCrossSeriesReducer(@Nullable Input<String> crossSeriesReducer) {
            this.crossSeriesReducer = crossSeriesReducer;
            return this;
        }

        public Builder setCrossSeriesReducer(@Nullable String crossSeriesReducer) {
            this.crossSeriesReducer = Input.ofNullable(crossSeriesReducer);
            return this;
        }

        public Builder setGroupByFields(@Nullable Input<List<String>> groupByFields) {
            this.groupByFields = groupByFields;
            return this;
        }

        public Builder setGroupByFields(@Nullable List<String> groupByFields) {
            this.groupByFields = Input.ofNullable(groupByFields);
            return this;
        }

        public Builder setPerSeriesAligner(@Nullable Input<String> perSeriesAligner) {
            this.perSeriesAligner = perSeriesAligner;
            return this;
        }

        public Builder setPerSeriesAligner(@Nullable String perSeriesAligner) {
            this.perSeriesAligner = Input.ofNullable(perSeriesAligner);
            return this;
        }
        public AlertPolicyConditionConditionAbsentAggregationGetArgs build() {
            return new AlertPolicyConditionConditionAbsentAggregationGetArgs(alignmentPeriod, crossSeriesReducer, groupByFields, perSeriesAligner);
        }
    }
}
