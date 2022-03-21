// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.monitoring_v1.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.googlenative.monitoring_v1.inputs.GaugeViewArgs;
import io.pulumi.googlenative.monitoring_v1.inputs.SparkChartViewArgs;
import io.pulumi.googlenative.monitoring_v1.inputs.ThresholdArgs;
import io.pulumi.googlenative.monitoring_v1.inputs.TimeSeriesQueryArgs;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * A widget showing the latest value of a metric, and how this value relates to one or more thresholds.
 * 
 */
public final class ScorecardArgs extends io.pulumi.resources.ResourceArgs {

    public static final ScorecardArgs Empty = new ScorecardArgs();

    /**
     * Will cause the scorecard to show a gauge chart.
     * 
     */
    @Import(name="gaugeView")
      private final @Nullable Output<GaugeViewArgs> gaugeView;

    public Output<GaugeViewArgs> getGaugeView() {
        return this.gaugeView == null ? Output.empty() : this.gaugeView;
    }

    /**
     * Will cause the scorecard to show a spark chart.
     * 
     */
    @Import(name="sparkChartView")
      private final @Nullable Output<SparkChartViewArgs> sparkChartView;

    public Output<SparkChartViewArgs> getSparkChartView() {
        return this.sparkChartView == null ? Output.empty() : this.sparkChartView;
    }

    /**
     * The thresholds used to determine the state of the scorecard given the time series' current value. For an actual value x, the scorecard is in a danger state if x is less than or equal to a danger threshold that triggers below, or greater than or equal to a danger threshold that triggers above. Similarly, if x is above/below a warning threshold that triggers above/below, then the scorecard is in a warning state - unless x also puts it in a danger state. (Danger trumps warning.)As an example, consider a scorecard with the following four thresholds: { value: 90, category: 'DANGER', trigger: 'ABOVE', }, { value: 70, category: 'WARNING', trigger: 'ABOVE', }, { value: 10, category: 'DANGER', trigger: 'BELOW', }, { value: 20, category: 'WARNING', trigger: 'BELOW', }Then: values less than or equal to 10 would put the scorecard in a DANGER state, values greater than 10 but less than or equal to 20 a WARNING state, values strictly between 20 and 70 an OK state, values greater than or equal to 70 but less than 90 a WARNING state, and values greater than or equal to 90 a DANGER state.
     * 
     */
    @Import(name="thresholds")
      private final @Nullable Output<List<ThresholdArgs>> thresholds;

    public Output<List<ThresholdArgs>> getThresholds() {
        return this.thresholds == null ? Output.empty() : this.thresholds;
    }

    /**
     * Fields for querying time series data from the Stackdriver metrics API.
     * 
     */
    @Import(name="timeSeriesQuery", required=true)
      private final Output<TimeSeriesQueryArgs> timeSeriesQuery;

    public Output<TimeSeriesQueryArgs> getTimeSeriesQuery() {
        return this.timeSeriesQuery;
    }

    public ScorecardArgs(
        @Nullable Output<GaugeViewArgs> gaugeView,
        @Nullable Output<SparkChartViewArgs> sparkChartView,
        @Nullable Output<List<ThresholdArgs>> thresholds,
        Output<TimeSeriesQueryArgs> timeSeriesQuery) {
        this.gaugeView = gaugeView;
        this.sparkChartView = sparkChartView;
        this.thresholds = thresholds;
        this.timeSeriesQuery = Objects.requireNonNull(timeSeriesQuery, "expected parameter 'timeSeriesQuery' to be non-null");
    }

    private ScorecardArgs() {
        this.gaugeView = Output.empty();
        this.sparkChartView = Output.empty();
        this.thresholds = Output.empty();
        this.timeSeriesQuery = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ScorecardArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<GaugeViewArgs> gaugeView;
        private @Nullable Output<SparkChartViewArgs> sparkChartView;
        private @Nullable Output<List<ThresholdArgs>> thresholds;
        private Output<TimeSeriesQueryArgs> timeSeriesQuery;

        public Builder() {
    	      // Empty
        }

        public Builder(ScorecardArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.gaugeView = defaults.gaugeView;
    	      this.sparkChartView = defaults.sparkChartView;
    	      this.thresholds = defaults.thresholds;
    	      this.timeSeriesQuery = defaults.timeSeriesQuery;
        }

        public Builder gaugeView(@Nullable Output<GaugeViewArgs> gaugeView) {
            this.gaugeView = gaugeView;
            return this;
        }
        public Builder gaugeView(@Nullable GaugeViewArgs gaugeView) {
            this.gaugeView = Output.ofNullable(gaugeView);
            return this;
        }
        public Builder sparkChartView(@Nullable Output<SparkChartViewArgs> sparkChartView) {
            this.sparkChartView = sparkChartView;
            return this;
        }
        public Builder sparkChartView(@Nullable SparkChartViewArgs sparkChartView) {
            this.sparkChartView = Output.ofNullable(sparkChartView);
            return this;
        }
        public Builder thresholds(@Nullable Output<List<ThresholdArgs>> thresholds) {
            this.thresholds = thresholds;
            return this;
        }
        public Builder thresholds(@Nullable List<ThresholdArgs> thresholds) {
            this.thresholds = Output.ofNullable(thresholds);
            return this;
        }
        public Builder thresholds(ThresholdArgs... thresholds) {
            return thresholds(List.of(thresholds));
        }
        public Builder timeSeriesQuery(Output<TimeSeriesQueryArgs> timeSeriesQuery) {
            this.timeSeriesQuery = Objects.requireNonNull(timeSeriesQuery);
            return this;
        }
        public Builder timeSeriesQuery(TimeSeriesQueryArgs timeSeriesQuery) {
            this.timeSeriesQuery = Output.of(Objects.requireNonNull(timeSeriesQuery));
            return this;
        }        public ScorecardArgs build() {
            return new ScorecardArgs(gaugeView, sparkChartView, thresholds, timeSeriesQuery);
        }
    }
}
