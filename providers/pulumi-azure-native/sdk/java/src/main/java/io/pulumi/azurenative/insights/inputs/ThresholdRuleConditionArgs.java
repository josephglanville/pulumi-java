// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.insights.inputs;

import io.pulumi.azurenative.insights.enums.ConditionOperator;
import io.pulumi.azurenative.insights.enums.TimeAggregationOperator;
import io.pulumi.azurenative.insights.inputs.RuleManagementEventDataSourceArgs;
import io.pulumi.azurenative.insights.inputs.RuleMetricDataSourceArgs;
import io.pulumi.core.Either;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import java.lang.Double;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * A rule condition based on a metric crossing a threshold.
 * 
 */
public final class ThresholdRuleConditionArgs extends io.pulumi.resources.ResourceArgs {

    public static final ThresholdRuleConditionArgs Empty = new ThresholdRuleConditionArgs();

    /**
     * the resource from which the rule collects its data. For this type dataSource will always be of type RuleMetricDataSource.
     * 
     */
    @Import(name="dataSource")
      private final @Nullable Output<Either<RuleManagementEventDataSourceArgs,RuleMetricDataSourceArgs>> dataSource;

    public Output<Either<RuleManagementEventDataSourceArgs,RuleMetricDataSourceArgs>> getDataSource() {
        return this.dataSource == null ? Codegen.empty() : this.dataSource;
    }

    /**
     * specifies the type of condition. This can be one of three types: ManagementEventRuleCondition (occurrences of management events), LocationThresholdRuleCondition (based on the number of failures of a web test), and ThresholdRuleCondition (based on the threshold of a metric).
     * Expected value is 'Microsoft.Azure.Management.Insights.Models.ThresholdRuleCondition'.
     * 
     */
    @Import(name="odataType", required=true)
      private final Output<String> odataType;

    public Output<String> getOdataType() {
        return this.odataType;
    }

    /**
     * the operator used to compare the data and the threshold.
     * 
     */
    @Import(name="operator", required=true)
      private final Output<ConditionOperator> operator;

    public Output<ConditionOperator> getOperator() {
        return this.operator;
    }

    /**
     * the threshold value that activates the alert.
     * 
     */
    @Import(name="threshold", required=true)
      private final Output<Double> threshold;

    public Output<Double> getThreshold() {
        return this.threshold;
    }

    /**
     * the time aggregation operator. How the data that are collected should be combined over time. The default value is the PrimaryAggregationType of the Metric.
     * 
     */
    @Import(name="timeAggregation")
      private final @Nullable Output<TimeAggregationOperator> timeAggregation;

    public Output<TimeAggregationOperator> getTimeAggregation() {
        return this.timeAggregation == null ? Codegen.empty() : this.timeAggregation;
    }

    /**
     * the period of time (in ISO 8601 duration format) that is used to monitor alert activity based on the threshold. If specified then it must be between 5 minutes and 1 day.
     * 
     */
    @Import(name="windowSize")
      private final @Nullable Output<String> windowSize;

    public Output<String> getWindowSize() {
        return this.windowSize == null ? Codegen.empty() : this.windowSize;
    }

    public ThresholdRuleConditionArgs(
        @Nullable Output<Either<RuleManagementEventDataSourceArgs,RuleMetricDataSourceArgs>> dataSource,
        Output<String> odataType,
        Output<ConditionOperator> operator,
        Output<Double> threshold,
        @Nullable Output<TimeAggregationOperator> timeAggregation,
        @Nullable Output<String> windowSize) {
        this.dataSource = dataSource;
        this.odataType = Objects.requireNonNull(odataType, "expected parameter 'odataType' to be non-null");
        this.operator = Objects.requireNonNull(operator, "expected parameter 'operator' to be non-null");
        this.threshold = Objects.requireNonNull(threshold, "expected parameter 'threshold' to be non-null");
        this.timeAggregation = timeAggregation;
        this.windowSize = windowSize;
    }

    private ThresholdRuleConditionArgs() {
        this.dataSource = Codegen.empty();
        this.odataType = Codegen.empty();
        this.operator = Codegen.empty();
        this.threshold = Codegen.empty();
        this.timeAggregation = Codegen.empty();
        this.windowSize = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ThresholdRuleConditionArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<Either<RuleManagementEventDataSourceArgs,RuleMetricDataSourceArgs>> dataSource;
        private Output<String> odataType;
        private Output<ConditionOperator> operator;
        private Output<Double> threshold;
        private @Nullable Output<TimeAggregationOperator> timeAggregation;
        private @Nullable Output<String> windowSize;

        public Builder() {
    	      // Empty
        }

        public Builder(ThresholdRuleConditionArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.dataSource = defaults.dataSource;
    	      this.odataType = defaults.odataType;
    	      this.operator = defaults.operator;
    	      this.threshold = defaults.threshold;
    	      this.timeAggregation = defaults.timeAggregation;
    	      this.windowSize = defaults.windowSize;
        }

        public Builder dataSource(@Nullable Output<Either<RuleManagementEventDataSourceArgs,RuleMetricDataSourceArgs>> dataSource) {
            this.dataSource = dataSource;
            return this;
        }
        public Builder dataSource(@Nullable Either<RuleManagementEventDataSourceArgs,RuleMetricDataSourceArgs> dataSource) {
            this.dataSource = Codegen.ofNullable(dataSource);
            return this;
        }
        public Builder odataType(Output<String> odataType) {
            this.odataType = Objects.requireNonNull(odataType);
            return this;
        }
        public Builder odataType(String odataType) {
            this.odataType = Output.of(Objects.requireNonNull(odataType));
            return this;
        }
        public Builder operator(Output<ConditionOperator> operator) {
            this.operator = Objects.requireNonNull(operator);
            return this;
        }
        public Builder operator(ConditionOperator operator) {
            this.operator = Output.of(Objects.requireNonNull(operator));
            return this;
        }
        public Builder threshold(Output<Double> threshold) {
            this.threshold = Objects.requireNonNull(threshold);
            return this;
        }
        public Builder threshold(Double threshold) {
            this.threshold = Output.of(Objects.requireNonNull(threshold));
            return this;
        }
        public Builder timeAggregation(@Nullable Output<TimeAggregationOperator> timeAggregation) {
            this.timeAggregation = timeAggregation;
            return this;
        }
        public Builder timeAggregation(@Nullable TimeAggregationOperator timeAggregation) {
            this.timeAggregation = Codegen.ofNullable(timeAggregation);
            return this;
        }
        public Builder windowSize(@Nullable Output<String> windowSize) {
            this.windowSize = windowSize;
            return this;
        }
        public Builder windowSize(@Nullable String windowSize) {
            this.windowSize = Codegen.ofNullable(windowSize);
            return this;
        }        public ThresholdRuleConditionArgs build() {
            return new ThresholdRuleConditionArgs(dataSource, odataType, operator, threshold, timeAggregation, windowSize);
        }
    }
}
