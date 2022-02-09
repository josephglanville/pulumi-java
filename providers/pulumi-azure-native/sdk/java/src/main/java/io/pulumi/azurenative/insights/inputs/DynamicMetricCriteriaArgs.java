// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.insights.inputs;

import io.pulumi.azurenative.insights.enums.AggregationTypeEnum;
import io.pulumi.azurenative.insights.enums.DynamicThresholdOperator;
import io.pulumi.azurenative.insights.enums.DynamicThresholdSensitivity;
import io.pulumi.azurenative.insights.inputs.DynamicThresholdFailingPeriodsArgs;
import io.pulumi.azurenative.insights.inputs.MetricDimensionArgs;
import io.pulumi.core.Either;
import io.pulumi.core.Input;
import io.pulumi.core.internal.annotations.InputImport;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


public final class DynamicMetricCriteriaArgs extends io.pulumi.resources.ResourceArgs {

    public static final DynamicMetricCriteriaArgs Empty = new DynamicMetricCriteriaArgs();

    @InputImport(name="alertSensitivity", required=true)
    private final Input<Either<String,DynamicThresholdSensitivity>> alertSensitivity;

    public Input<Either<String,DynamicThresholdSensitivity>> getAlertSensitivity() {
        return this.alertSensitivity;
    }

    @InputImport(name="criterionType", required=true)
    private final Input<String> criterionType;

    public Input<String> getCriterionType() {
        return this.criterionType;
    }

    @InputImport(name="dimensions")
    private final @Nullable Input<List<MetricDimensionArgs>> dimensions;

    public Input<List<MetricDimensionArgs>> getDimensions() {
        return this.dimensions == null ? Input.empty() : this.dimensions;
    }

    @InputImport(name="failingPeriods", required=true)
    private final Input<DynamicThresholdFailingPeriodsArgs> failingPeriods;

    public Input<DynamicThresholdFailingPeriodsArgs> getFailingPeriods() {
        return this.failingPeriods;
    }

    @InputImport(name="ignoreDataBefore")
    private final @Nullable Input<String> ignoreDataBefore;

    public Input<String> getIgnoreDataBefore() {
        return this.ignoreDataBefore == null ? Input.empty() : this.ignoreDataBefore;
    }

    @InputImport(name="metricName", required=true)
    private final Input<String> metricName;

    public Input<String> getMetricName() {
        return this.metricName;
    }

    @InputImport(name="metricNamespace")
    private final @Nullable Input<String> metricNamespace;

    public Input<String> getMetricNamespace() {
        return this.metricNamespace == null ? Input.empty() : this.metricNamespace;
    }

    @InputImport(name="name", required=true)
    private final Input<String> name;

    public Input<String> getName() {
        return this.name;
    }

    @InputImport(name="operator", required=true)
    private final Input<Either<String,DynamicThresholdOperator>> operator;

    public Input<Either<String,DynamicThresholdOperator>> getOperator() {
        return this.operator;
    }

    @InputImport(name="skipMetricValidation")
    private final @Nullable Input<Boolean> skipMetricValidation;

    public Input<Boolean> getSkipMetricValidation() {
        return this.skipMetricValidation == null ? Input.empty() : this.skipMetricValidation;
    }

    @InputImport(name="timeAggregation", required=true)
    private final Input<Either<String,AggregationTypeEnum>> timeAggregation;

    public Input<Either<String,AggregationTypeEnum>> getTimeAggregation() {
        return this.timeAggregation;
    }

    public DynamicMetricCriteriaArgs(
        Input<Either<String,DynamicThresholdSensitivity>> alertSensitivity,
        Input<String> criterionType,
        @Nullable Input<List<MetricDimensionArgs>> dimensions,
        Input<DynamicThresholdFailingPeriodsArgs> failingPeriods,
        @Nullable Input<String> ignoreDataBefore,
        Input<String> metricName,
        @Nullable Input<String> metricNamespace,
        Input<String> name,
        Input<Either<String,DynamicThresholdOperator>> operator,
        @Nullable Input<Boolean> skipMetricValidation,
        Input<Either<String,AggregationTypeEnum>> timeAggregation) {
        this.alertSensitivity = Objects.requireNonNull(alertSensitivity, "expected parameter 'alertSensitivity' to be non-null");
        this.criterionType = Objects.requireNonNull(criterionType, "expected parameter 'criterionType' to be non-null");
        this.dimensions = dimensions;
        this.failingPeriods = Objects.requireNonNull(failingPeriods, "expected parameter 'failingPeriods' to be non-null");
        this.ignoreDataBefore = ignoreDataBefore;
        this.metricName = Objects.requireNonNull(metricName, "expected parameter 'metricName' to be non-null");
        this.metricNamespace = metricNamespace;
        this.name = Objects.requireNonNull(name, "expected parameter 'name' to be non-null");
        this.operator = Objects.requireNonNull(operator, "expected parameter 'operator' to be non-null");
        this.skipMetricValidation = skipMetricValidation;
        this.timeAggregation = Objects.requireNonNull(timeAggregation, "expected parameter 'timeAggregation' to be non-null");
    }

    private DynamicMetricCriteriaArgs() {
        this.alertSensitivity = Input.empty();
        this.criterionType = Input.empty();
        this.dimensions = Input.empty();
        this.failingPeriods = Input.empty();
        this.ignoreDataBefore = Input.empty();
        this.metricName = Input.empty();
        this.metricNamespace = Input.empty();
        this.name = Input.empty();
        this.operator = Input.empty();
        this.skipMetricValidation = Input.empty();
        this.timeAggregation = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(DynamicMetricCriteriaArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Input<Either<String,DynamicThresholdSensitivity>> alertSensitivity;
        private Input<String> criterionType;
        private @Nullable Input<List<MetricDimensionArgs>> dimensions;
        private Input<DynamicThresholdFailingPeriodsArgs> failingPeriods;
        private @Nullable Input<String> ignoreDataBefore;
        private Input<String> metricName;
        private @Nullable Input<String> metricNamespace;
        private Input<String> name;
        private Input<Either<String,DynamicThresholdOperator>> operator;
        private @Nullable Input<Boolean> skipMetricValidation;
        private Input<Either<String,AggregationTypeEnum>> timeAggregation;

        public Builder() {
    	      // Empty
        }

        public Builder(DynamicMetricCriteriaArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.alertSensitivity = defaults.alertSensitivity;
    	      this.criterionType = defaults.criterionType;
    	      this.dimensions = defaults.dimensions;
    	      this.failingPeriods = defaults.failingPeriods;
    	      this.ignoreDataBefore = defaults.ignoreDataBefore;
    	      this.metricName = defaults.metricName;
    	      this.metricNamespace = defaults.metricNamespace;
    	      this.name = defaults.name;
    	      this.operator = defaults.operator;
    	      this.skipMetricValidation = defaults.skipMetricValidation;
    	      this.timeAggregation = defaults.timeAggregation;
        }

        public Builder setAlertSensitivity(Input<Either<String,DynamicThresholdSensitivity>> alertSensitivity) {
            this.alertSensitivity = Objects.requireNonNull(alertSensitivity);
            return this;
        }

        public Builder setAlertSensitivity(Either<String,DynamicThresholdSensitivity> alertSensitivity) {
            this.alertSensitivity = Input.of(Objects.requireNonNull(alertSensitivity));
            return this;
        }

        public Builder setCriterionType(Input<String> criterionType) {
            this.criterionType = Objects.requireNonNull(criterionType);
            return this;
        }

        public Builder setCriterionType(String criterionType) {
            this.criterionType = Input.of(Objects.requireNonNull(criterionType));
            return this;
        }

        public Builder setDimensions(@Nullable Input<List<MetricDimensionArgs>> dimensions) {
            this.dimensions = dimensions;
            return this;
        }

        public Builder setDimensions(@Nullable List<MetricDimensionArgs> dimensions) {
            this.dimensions = Input.ofNullable(dimensions);
            return this;
        }

        public Builder setFailingPeriods(Input<DynamicThresholdFailingPeriodsArgs> failingPeriods) {
            this.failingPeriods = Objects.requireNonNull(failingPeriods);
            return this;
        }

        public Builder setFailingPeriods(DynamicThresholdFailingPeriodsArgs failingPeriods) {
            this.failingPeriods = Input.of(Objects.requireNonNull(failingPeriods));
            return this;
        }

        public Builder setIgnoreDataBefore(@Nullable Input<String> ignoreDataBefore) {
            this.ignoreDataBefore = ignoreDataBefore;
            return this;
        }

        public Builder setIgnoreDataBefore(@Nullable String ignoreDataBefore) {
            this.ignoreDataBefore = Input.ofNullable(ignoreDataBefore);
            return this;
        }

        public Builder setMetricName(Input<String> metricName) {
            this.metricName = Objects.requireNonNull(metricName);
            return this;
        }

        public Builder setMetricName(String metricName) {
            this.metricName = Input.of(Objects.requireNonNull(metricName));
            return this;
        }

        public Builder setMetricNamespace(@Nullable Input<String> metricNamespace) {
            this.metricNamespace = metricNamespace;
            return this;
        }

        public Builder setMetricNamespace(@Nullable String metricNamespace) {
            this.metricNamespace = Input.ofNullable(metricNamespace);
            return this;
        }

        public Builder setName(Input<String> name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }

        public Builder setName(String name) {
            this.name = Input.of(Objects.requireNonNull(name));
            return this;
        }

        public Builder setOperator(Input<Either<String,DynamicThresholdOperator>> operator) {
            this.operator = Objects.requireNonNull(operator);
            return this;
        }

        public Builder setOperator(Either<String,DynamicThresholdOperator> operator) {
            this.operator = Input.of(Objects.requireNonNull(operator));
            return this;
        }

        public Builder setSkipMetricValidation(@Nullable Input<Boolean> skipMetricValidation) {
            this.skipMetricValidation = skipMetricValidation;
            return this;
        }

        public Builder setSkipMetricValidation(@Nullable Boolean skipMetricValidation) {
            this.skipMetricValidation = Input.ofNullable(skipMetricValidation);
            return this;
        }

        public Builder setTimeAggregation(Input<Either<String,AggregationTypeEnum>> timeAggregation) {
            this.timeAggregation = Objects.requireNonNull(timeAggregation);
            return this;
        }

        public Builder setTimeAggregation(Either<String,AggregationTypeEnum> timeAggregation) {
            this.timeAggregation = Input.of(Objects.requireNonNull(timeAggregation));
            return this;
        }

        public DynamicMetricCriteriaArgs build() {
            return new DynamicMetricCriteriaArgs(alertSensitivity, criterionType, dimensions, failingPeriods, ignoreDataBefore, metricName, metricNamespace, name, operator, skipMetricValidation, timeAggregation);
        }
    }
}
