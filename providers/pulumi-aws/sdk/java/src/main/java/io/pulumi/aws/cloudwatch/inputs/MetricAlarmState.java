// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.cloudwatch.inputs;

import io.pulumi.aws.cloudwatch.inputs.MetricAlarmMetricQueryGetArgs;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.lang.Double;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import javax.annotation.Nullable;


public final class MetricAlarmState extends io.pulumi.resources.ResourceArgs {

    public static final MetricAlarmState Empty = new MetricAlarmState();

    /**
     * Indicates whether or not actions should be executed during any changes to the alarm's state. Defaults to `true`.
     * 
     */
    @Import(name="actionsEnabled")
      private final @Nullable Output<Boolean> actionsEnabled;

    public Output<Boolean> getActionsEnabled() {
        return this.actionsEnabled == null ? Output.empty() : this.actionsEnabled;
    }

    /**
     * The list of actions to execute when this alarm transitions into an ALARM state from any other state. Each action is specified as an Amazon Resource Name (ARN).
     * 
     */
    @Import(name="alarmActions")
      private final @Nullable Output<List<String>> alarmActions;

    public Output<List<String>> getAlarmActions() {
        return this.alarmActions == null ? Output.empty() : this.alarmActions;
    }

    /**
     * The description for the alarm.
     * 
     */
    @Import(name="alarmDescription")
      private final @Nullable Output<String> alarmDescription;

    public Output<String> getAlarmDescription() {
        return this.alarmDescription == null ? Output.empty() : this.alarmDescription;
    }

    /**
     * The ARN of the CloudWatch Metric Alarm.
     * 
     */
    @Import(name="arn")
      private final @Nullable Output<String> arn;

    public Output<String> getArn() {
        return this.arn == null ? Output.empty() : this.arn;
    }

    /**
     * The arithmetic operation to use when comparing the specified Statistic and Threshold. The specified Statistic value is used as the first operand. Either of the following is supported: `GreaterThanOrEqualToThreshold`, `GreaterThanThreshold`, `LessThanThreshold`, `LessThanOrEqualToThreshold`. Additionally, the values  `LessThanLowerOrGreaterThanUpperThreshold`, `LessThanLowerThreshold`, and `GreaterThanUpperThreshold` are used only for alarms based on anomaly detection models.
     * 
     */
    @Import(name="comparisonOperator")
      private final @Nullable Output<String> comparisonOperator;

    public Output<String> getComparisonOperator() {
        return this.comparisonOperator == null ? Output.empty() : this.comparisonOperator;
    }

    /**
     * The number of datapoints that must be breaching to trigger the alarm.
     * 
     */
    @Import(name="datapointsToAlarm")
      private final @Nullable Output<Integer> datapointsToAlarm;

    public Output<Integer> getDatapointsToAlarm() {
        return this.datapointsToAlarm == null ? Output.empty() : this.datapointsToAlarm;
    }

    /**
     * The dimensions for this metric.  For the list of available dimensions see the AWS documentation [here](http://docs.aws.amazon.com/AmazonCloudWatch/latest/DeveloperGuide/CW_Support_For_AWS.html).
     * 
     */
    @Import(name="dimensions")
      private final @Nullable Output<Map<String,String>> dimensions;

    public Output<Map<String,String>> getDimensions() {
        return this.dimensions == null ? Output.empty() : this.dimensions;
    }

    /**
     * Used only for alarms
     * based on percentiles. If you specify `ignore`, the alarm state will not
     * change during periods with too few data points to be statistically significant.
     * If you specify `evaluate` or omit this parameter, the alarm will always be
     * evaluated and possibly change state no matter how many data points are available.
     * The following values are supported: `ignore`, and `evaluate`.
     * 
     */
    @Import(name="evaluateLowSampleCountPercentiles")
      private final @Nullable Output<String> evaluateLowSampleCountPercentiles;

    public Output<String> getEvaluateLowSampleCountPercentiles() {
        return this.evaluateLowSampleCountPercentiles == null ? Output.empty() : this.evaluateLowSampleCountPercentiles;
    }

    /**
     * The number of periods over which data is compared to the specified threshold.
     * 
     */
    @Import(name="evaluationPeriods")
      private final @Nullable Output<Integer> evaluationPeriods;

    public Output<Integer> getEvaluationPeriods() {
        return this.evaluationPeriods == null ? Output.empty() : this.evaluationPeriods;
    }

    /**
     * The percentile statistic for the metric associated with the alarm. Specify a value between p0.0 and p100.
     * 
     */
    @Import(name="extendedStatistic")
      private final @Nullable Output<String> extendedStatistic;

    public Output<String> getExtendedStatistic() {
        return this.extendedStatistic == null ? Output.empty() : this.extendedStatistic;
    }

    /**
     * The list of actions to execute when this alarm transitions into an INSUFFICIENT_DATA state from any other state. Each action is specified as an Amazon Resource Name (ARN).
     * 
     */
    @Import(name="insufficientDataActions")
      private final @Nullable Output<List<String>> insufficientDataActions;

    public Output<List<String>> getInsufficientDataActions() {
        return this.insufficientDataActions == null ? Output.empty() : this.insufficientDataActions;
    }

    /**
     * The name for this metric.
     * See docs for [supported metrics](https://docs.aws.amazon.com/AmazonCloudWatch/latest/DeveloperGuide/CW_Support_For_AWS.html).
     * 
     */
    @Import(name="metricName")
      private final @Nullable Output<String> metricName;

    public Output<String> getMetricName() {
        return this.metricName == null ? Output.empty() : this.metricName;
    }

    /**
     * Enables you to create an alarm based on a metric math expression. You may specify at most 20.
     * 
     */
    @Import(name="metricQueries")
      private final @Nullable Output<List<MetricAlarmMetricQueryGetArgs>> metricQueries;

    public Output<List<MetricAlarmMetricQueryGetArgs>> getMetricQueries() {
        return this.metricQueries == null ? Output.empty() : this.metricQueries;
    }

    /**
     * The descriptive name for the alarm. This name must be unique within the user's AWS account
     * 
     */
    @Import(name="name")
      private final @Nullable Output<String> name;

    public Output<String> getName() {
        return this.name == null ? Output.empty() : this.name;
    }

    /**
     * The namespace for this metric. See docs for the [list of namespaces](https://docs.aws.amazon.com/AmazonCloudWatch/latest/DeveloperGuide/aws-namespaces.html).
     * See docs for [supported metrics](https://docs.aws.amazon.com/AmazonCloudWatch/latest/DeveloperGuide/CW_Support_For_AWS.html).
     * 
     */
    @Import(name="namespace")
      private final @Nullable Output<String> namespace;

    public Output<String> getNamespace() {
        return this.namespace == null ? Output.empty() : this.namespace;
    }

    /**
     * The list of actions to execute when this alarm transitions into an OK state from any other state. Each action is specified as an Amazon Resource Name (ARN).
     * 
     */
    @Import(name="okActions")
      private final @Nullable Output<List<String>> okActions;

    public Output<List<String>> getOkActions() {
        return this.okActions == null ? Output.empty() : this.okActions;
    }

    /**
     * The period in seconds over which the specified `stat` is applied.
     * 
     */
    @Import(name="period")
      private final @Nullable Output<Integer> period;

    public Output<Integer> getPeriod() {
        return this.period == null ? Output.empty() : this.period;
    }

    /**
     * The statistic to apply to the alarm's associated metric.
     * Either of the following is supported: `SampleCount`, `Average`, `Sum`, `Minimum`, `Maximum`
     * 
     */
    @Import(name="statistic")
      private final @Nullable Output<String> statistic;

    public Output<String> getStatistic() {
        return this.statistic == null ? Output.empty() : this.statistic;
    }

    /**
     * A map of tags to assign to the resource. .If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
     * 
     */
    @Import(name="tags")
      private final @Nullable Output<Map<String,String>> tags;

    public Output<Map<String,String>> getTags() {
        return this.tags == null ? Output.empty() : this.tags;
    }

    /**
     * A map of tags assigned to the resource, including those inherited from the provider .
     * 
     */
    @Import(name="tagsAll")
      private final @Nullable Output<Map<String,String>> tagsAll;

    public Output<Map<String,String>> getTagsAll() {
        return this.tagsAll == null ? Output.empty() : this.tagsAll;
    }

    /**
     * The value against which the specified statistic is compared. This parameter is required for alarms based on static thresholds, but should not be used for alarms based on anomaly detection models.
     * 
     */
    @Import(name="threshold")
      private final @Nullable Output<Double> threshold;

    public Output<Double> getThreshold() {
        return this.threshold == null ? Output.empty() : this.threshold;
    }

    /**
     * If this is an alarm based on an anomaly detection model, make this value match the ID of the ANOMALY_DETECTION_BAND function.
     * 
     */
    @Import(name="thresholdMetricId")
      private final @Nullable Output<String> thresholdMetricId;

    public Output<String> getThresholdMetricId() {
        return this.thresholdMetricId == null ? Output.empty() : this.thresholdMetricId;
    }

    /**
     * Sets how this alarm is to handle missing data points. The following values are supported: `missing`, `ignore`, `breaching` and `notBreaching`. Defaults to `missing`.
     * 
     */
    @Import(name="treatMissingData")
      private final @Nullable Output<String> treatMissingData;

    public Output<String> getTreatMissingData() {
        return this.treatMissingData == null ? Output.empty() : this.treatMissingData;
    }

    /**
     * The unit for this metric.
     * 
     */
    @Import(name="unit")
      private final @Nullable Output<String> unit;

    public Output<String> getUnit() {
        return this.unit == null ? Output.empty() : this.unit;
    }

    public MetricAlarmState(
        @Nullable Output<Boolean> actionsEnabled,
        @Nullable Output<List<String>> alarmActions,
        @Nullable Output<String> alarmDescription,
        @Nullable Output<String> arn,
        @Nullable Output<String> comparisonOperator,
        @Nullable Output<Integer> datapointsToAlarm,
        @Nullable Output<Map<String,String>> dimensions,
        @Nullable Output<String> evaluateLowSampleCountPercentiles,
        @Nullable Output<Integer> evaluationPeriods,
        @Nullable Output<String> extendedStatistic,
        @Nullable Output<List<String>> insufficientDataActions,
        @Nullable Output<String> metricName,
        @Nullable Output<List<MetricAlarmMetricQueryGetArgs>> metricQueries,
        @Nullable Output<String> name,
        @Nullable Output<String> namespace,
        @Nullable Output<List<String>> okActions,
        @Nullable Output<Integer> period,
        @Nullable Output<String> statistic,
        @Nullable Output<Map<String,String>> tags,
        @Nullable Output<Map<String,String>> tagsAll,
        @Nullable Output<Double> threshold,
        @Nullable Output<String> thresholdMetricId,
        @Nullable Output<String> treatMissingData,
        @Nullable Output<String> unit) {
        this.actionsEnabled = actionsEnabled;
        this.alarmActions = alarmActions;
        this.alarmDescription = alarmDescription;
        this.arn = arn;
        this.comparisonOperator = comparisonOperator;
        this.datapointsToAlarm = datapointsToAlarm;
        this.dimensions = dimensions;
        this.evaluateLowSampleCountPercentiles = evaluateLowSampleCountPercentiles;
        this.evaluationPeriods = evaluationPeriods;
        this.extendedStatistic = extendedStatistic;
        this.insufficientDataActions = insufficientDataActions;
        this.metricName = metricName;
        this.metricQueries = metricQueries;
        this.name = name;
        this.namespace = namespace;
        this.okActions = okActions;
        this.period = period;
        this.statistic = statistic;
        this.tags = tags;
        this.tagsAll = tagsAll;
        this.threshold = threshold;
        this.thresholdMetricId = thresholdMetricId;
        this.treatMissingData = treatMissingData;
        this.unit = unit;
    }

    private MetricAlarmState() {
        this.actionsEnabled = Output.empty();
        this.alarmActions = Output.empty();
        this.alarmDescription = Output.empty();
        this.arn = Output.empty();
        this.comparisonOperator = Output.empty();
        this.datapointsToAlarm = Output.empty();
        this.dimensions = Output.empty();
        this.evaluateLowSampleCountPercentiles = Output.empty();
        this.evaluationPeriods = Output.empty();
        this.extendedStatistic = Output.empty();
        this.insufficientDataActions = Output.empty();
        this.metricName = Output.empty();
        this.metricQueries = Output.empty();
        this.name = Output.empty();
        this.namespace = Output.empty();
        this.okActions = Output.empty();
        this.period = Output.empty();
        this.statistic = Output.empty();
        this.tags = Output.empty();
        this.tagsAll = Output.empty();
        this.threshold = Output.empty();
        this.thresholdMetricId = Output.empty();
        this.treatMissingData = Output.empty();
        this.unit = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(MetricAlarmState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<Boolean> actionsEnabled;
        private @Nullable Output<List<String>> alarmActions;
        private @Nullable Output<String> alarmDescription;
        private @Nullable Output<String> arn;
        private @Nullable Output<String> comparisonOperator;
        private @Nullable Output<Integer> datapointsToAlarm;
        private @Nullable Output<Map<String,String>> dimensions;
        private @Nullable Output<String> evaluateLowSampleCountPercentiles;
        private @Nullable Output<Integer> evaluationPeriods;
        private @Nullable Output<String> extendedStatistic;
        private @Nullable Output<List<String>> insufficientDataActions;
        private @Nullable Output<String> metricName;
        private @Nullable Output<List<MetricAlarmMetricQueryGetArgs>> metricQueries;
        private @Nullable Output<String> name;
        private @Nullable Output<String> namespace;
        private @Nullable Output<List<String>> okActions;
        private @Nullable Output<Integer> period;
        private @Nullable Output<String> statistic;
        private @Nullable Output<Map<String,String>> tags;
        private @Nullable Output<Map<String,String>> tagsAll;
        private @Nullable Output<Double> threshold;
        private @Nullable Output<String> thresholdMetricId;
        private @Nullable Output<String> treatMissingData;
        private @Nullable Output<String> unit;

        public Builder() {
    	      // Empty
        }

        public Builder(MetricAlarmState defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.actionsEnabled = defaults.actionsEnabled;
    	      this.alarmActions = defaults.alarmActions;
    	      this.alarmDescription = defaults.alarmDescription;
    	      this.arn = defaults.arn;
    	      this.comparisonOperator = defaults.comparisonOperator;
    	      this.datapointsToAlarm = defaults.datapointsToAlarm;
    	      this.dimensions = defaults.dimensions;
    	      this.evaluateLowSampleCountPercentiles = defaults.evaluateLowSampleCountPercentiles;
    	      this.evaluationPeriods = defaults.evaluationPeriods;
    	      this.extendedStatistic = defaults.extendedStatistic;
    	      this.insufficientDataActions = defaults.insufficientDataActions;
    	      this.metricName = defaults.metricName;
    	      this.metricQueries = defaults.metricQueries;
    	      this.name = defaults.name;
    	      this.namespace = defaults.namespace;
    	      this.okActions = defaults.okActions;
    	      this.period = defaults.period;
    	      this.statistic = defaults.statistic;
    	      this.tags = defaults.tags;
    	      this.tagsAll = defaults.tagsAll;
    	      this.threshold = defaults.threshold;
    	      this.thresholdMetricId = defaults.thresholdMetricId;
    	      this.treatMissingData = defaults.treatMissingData;
    	      this.unit = defaults.unit;
        }

        public Builder actionsEnabled(@Nullable Output<Boolean> actionsEnabled) {
            this.actionsEnabled = actionsEnabled;
            return this;
        }
        public Builder actionsEnabled(@Nullable Boolean actionsEnabled) {
            this.actionsEnabled = Output.ofNullable(actionsEnabled);
            return this;
        }
        public Builder alarmActions(@Nullable Output<List<String>> alarmActions) {
            this.alarmActions = alarmActions;
            return this;
        }
        public Builder alarmActions(@Nullable List<String> alarmActions) {
            this.alarmActions = Output.ofNullable(alarmActions);
            return this;
        }
        public Builder alarmActions(String... alarmActions) {
            return alarmActions(List.of(alarmActions));
        }
        public Builder alarmDescription(@Nullable Output<String> alarmDescription) {
            this.alarmDescription = alarmDescription;
            return this;
        }
        public Builder alarmDescription(@Nullable String alarmDescription) {
            this.alarmDescription = Output.ofNullable(alarmDescription);
            return this;
        }
        public Builder arn(@Nullable Output<String> arn) {
            this.arn = arn;
            return this;
        }
        public Builder arn(@Nullable String arn) {
            this.arn = Output.ofNullable(arn);
            return this;
        }
        public Builder comparisonOperator(@Nullable Output<String> comparisonOperator) {
            this.comparisonOperator = comparisonOperator;
            return this;
        }
        public Builder comparisonOperator(@Nullable String comparisonOperator) {
            this.comparisonOperator = Output.ofNullable(comparisonOperator);
            return this;
        }
        public Builder datapointsToAlarm(@Nullable Output<Integer> datapointsToAlarm) {
            this.datapointsToAlarm = datapointsToAlarm;
            return this;
        }
        public Builder datapointsToAlarm(@Nullable Integer datapointsToAlarm) {
            this.datapointsToAlarm = Output.ofNullable(datapointsToAlarm);
            return this;
        }
        public Builder dimensions(@Nullable Output<Map<String,String>> dimensions) {
            this.dimensions = dimensions;
            return this;
        }
        public Builder dimensions(@Nullable Map<String,String> dimensions) {
            this.dimensions = Output.ofNullable(dimensions);
            return this;
        }
        public Builder evaluateLowSampleCountPercentiles(@Nullable Output<String> evaluateLowSampleCountPercentiles) {
            this.evaluateLowSampleCountPercentiles = evaluateLowSampleCountPercentiles;
            return this;
        }
        public Builder evaluateLowSampleCountPercentiles(@Nullable String evaluateLowSampleCountPercentiles) {
            this.evaluateLowSampleCountPercentiles = Output.ofNullable(evaluateLowSampleCountPercentiles);
            return this;
        }
        public Builder evaluationPeriods(@Nullable Output<Integer> evaluationPeriods) {
            this.evaluationPeriods = evaluationPeriods;
            return this;
        }
        public Builder evaluationPeriods(@Nullable Integer evaluationPeriods) {
            this.evaluationPeriods = Output.ofNullable(evaluationPeriods);
            return this;
        }
        public Builder extendedStatistic(@Nullable Output<String> extendedStatistic) {
            this.extendedStatistic = extendedStatistic;
            return this;
        }
        public Builder extendedStatistic(@Nullable String extendedStatistic) {
            this.extendedStatistic = Output.ofNullable(extendedStatistic);
            return this;
        }
        public Builder insufficientDataActions(@Nullable Output<List<String>> insufficientDataActions) {
            this.insufficientDataActions = insufficientDataActions;
            return this;
        }
        public Builder insufficientDataActions(@Nullable List<String> insufficientDataActions) {
            this.insufficientDataActions = Output.ofNullable(insufficientDataActions);
            return this;
        }
        public Builder insufficientDataActions(String... insufficientDataActions) {
            return insufficientDataActions(List.of(insufficientDataActions));
        }
        public Builder metricName(@Nullable Output<String> metricName) {
            this.metricName = metricName;
            return this;
        }
        public Builder metricName(@Nullable String metricName) {
            this.metricName = Output.ofNullable(metricName);
            return this;
        }
        public Builder metricQueries(@Nullable Output<List<MetricAlarmMetricQueryGetArgs>> metricQueries) {
            this.metricQueries = metricQueries;
            return this;
        }
        public Builder metricQueries(@Nullable List<MetricAlarmMetricQueryGetArgs> metricQueries) {
            this.metricQueries = Output.ofNullable(metricQueries);
            return this;
        }
        public Builder metricQueries(MetricAlarmMetricQueryGetArgs... metricQueries) {
            return metricQueries(List.of(metricQueries));
        }
        public Builder name(@Nullable Output<String> name) {
            this.name = name;
            return this;
        }
        public Builder name(@Nullable String name) {
            this.name = Output.ofNullable(name);
            return this;
        }
        public Builder namespace(@Nullable Output<String> namespace) {
            this.namespace = namespace;
            return this;
        }
        public Builder namespace(@Nullable String namespace) {
            this.namespace = Output.ofNullable(namespace);
            return this;
        }
        public Builder okActions(@Nullable Output<List<String>> okActions) {
            this.okActions = okActions;
            return this;
        }
        public Builder okActions(@Nullable List<String> okActions) {
            this.okActions = Output.ofNullable(okActions);
            return this;
        }
        public Builder okActions(String... okActions) {
            return okActions(List.of(okActions));
        }
        public Builder period(@Nullable Output<Integer> period) {
            this.period = period;
            return this;
        }
        public Builder period(@Nullable Integer period) {
            this.period = Output.ofNullable(period);
            return this;
        }
        public Builder statistic(@Nullable Output<String> statistic) {
            this.statistic = statistic;
            return this;
        }
        public Builder statistic(@Nullable String statistic) {
            this.statistic = Output.ofNullable(statistic);
            return this;
        }
        public Builder tags(@Nullable Output<Map<String,String>> tags) {
            this.tags = tags;
            return this;
        }
        public Builder tags(@Nullable Map<String,String> tags) {
            this.tags = Output.ofNullable(tags);
            return this;
        }
        public Builder tagsAll(@Nullable Output<Map<String,String>> tagsAll) {
            this.tagsAll = tagsAll;
            return this;
        }
        public Builder tagsAll(@Nullable Map<String,String> tagsAll) {
            this.tagsAll = Output.ofNullable(tagsAll);
            return this;
        }
        public Builder threshold(@Nullable Output<Double> threshold) {
            this.threshold = threshold;
            return this;
        }
        public Builder threshold(@Nullable Double threshold) {
            this.threshold = Output.ofNullable(threshold);
            return this;
        }
        public Builder thresholdMetricId(@Nullable Output<String> thresholdMetricId) {
            this.thresholdMetricId = thresholdMetricId;
            return this;
        }
        public Builder thresholdMetricId(@Nullable String thresholdMetricId) {
            this.thresholdMetricId = Output.ofNullable(thresholdMetricId);
            return this;
        }
        public Builder treatMissingData(@Nullable Output<String> treatMissingData) {
            this.treatMissingData = treatMissingData;
            return this;
        }
        public Builder treatMissingData(@Nullable String treatMissingData) {
            this.treatMissingData = Output.ofNullable(treatMissingData);
            return this;
        }
        public Builder unit(@Nullable Output<String> unit) {
            this.unit = unit;
            return this;
        }
        public Builder unit(@Nullable String unit) {
            this.unit = Output.ofNullable(unit);
            return this;
        }        public MetricAlarmState build() {
            return new MetricAlarmState(actionsEnabled, alarmActions, alarmDescription, arn, comparisonOperator, datapointsToAlarm, dimensions, evaluateLowSampleCountPercentiles, evaluationPeriods, extendedStatistic, insufficientDataActions, metricName, metricQueries, name, namespace, okActions, period, statistic, tags, tagsAll, threshold, thresholdMetricId, treatMissingData, unit);
        }
    }
}