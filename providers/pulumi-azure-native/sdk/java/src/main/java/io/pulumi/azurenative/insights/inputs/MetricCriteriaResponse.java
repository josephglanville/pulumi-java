// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.insights.inputs;

import io.pulumi.azurenative.insights.inputs.MetricDimensionResponse;
import io.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.lang.Double;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Criterion to filter metrics.
 * 
 */
public final class MetricCriteriaResponse extends io.pulumi.resources.InvokeArgs {

    public static final MetricCriteriaResponse Empty = new MetricCriteriaResponse();

    /**
     * Specifies the type of threshold criteria
     * Expected value is 'StaticThresholdCriterion'.
     * 
     */
    @Import(name="criterionType", required=true)
      private final String criterionType;

    public String getCriterionType() {
        return this.criterionType;
    }

    /**
     * List of dimension conditions.
     * 
     */
    @Import(name="dimensions")
      private final @Nullable List<MetricDimensionResponse> dimensions;

    public List<MetricDimensionResponse> getDimensions() {
        return this.dimensions == null ? List.of() : this.dimensions;
    }

    /**
     * Name of the metric.
     * 
     */
    @Import(name="metricName", required=true)
      private final String metricName;

    public String getMetricName() {
        return this.metricName;
    }

    /**
     * Namespace of the metric.
     * 
     */
    @Import(name="metricNamespace")
      private final @Nullable String metricNamespace;

    public Optional<String> getMetricNamespace() {
        return this.metricNamespace == null ? Optional.empty() : Optional.ofNullable(this.metricNamespace);
    }

    /**
     * Name of the criteria.
     * 
     */
    @Import(name="name", required=true)
      private final String name;

    public String getName() {
        return this.name;
    }

    /**
     * the criteria operator.
     * 
     */
    @Import(name="operator", required=true)
      private final String operator;

    public String getOperator() {
        return this.operator;
    }

    /**
     * Allows creating an alert rule on a custom metric that isn't yet emitted, by causing the metric validation to be skipped.
     * 
     */
    @Import(name="skipMetricValidation")
      private final @Nullable Boolean skipMetricValidation;

    public Optional<Boolean> getSkipMetricValidation() {
        return this.skipMetricValidation == null ? Optional.empty() : Optional.ofNullable(this.skipMetricValidation);
    }

    /**
     * the criteria threshold value that activates the alert.
     * 
     */
    @Import(name="threshold", required=true)
      private final Double threshold;

    public Double getThreshold() {
        return this.threshold;
    }

    /**
     * the criteria time aggregation types.
     * 
     */
    @Import(name="timeAggregation", required=true)
      private final String timeAggregation;

    public String getTimeAggregation() {
        return this.timeAggregation;
    }

    public MetricCriteriaResponse(
        String criterionType,
        @Nullable List<MetricDimensionResponse> dimensions,
        String metricName,
        @Nullable String metricNamespace,
        String name,
        String operator,
        @Nullable Boolean skipMetricValidation,
        Double threshold,
        String timeAggregation) {
        this.criterionType = Objects.requireNonNull(criterionType, "expected parameter 'criterionType' to be non-null");
        this.dimensions = dimensions;
        this.metricName = Objects.requireNonNull(metricName, "expected parameter 'metricName' to be non-null");
        this.metricNamespace = metricNamespace;
        this.name = Objects.requireNonNull(name, "expected parameter 'name' to be non-null");
        this.operator = Objects.requireNonNull(operator, "expected parameter 'operator' to be non-null");
        this.skipMetricValidation = skipMetricValidation;
        this.threshold = Objects.requireNonNull(threshold, "expected parameter 'threshold' to be non-null");
        this.timeAggregation = Objects.requireNonNull(timeAggregation, "expected parameter 'timeAggregation' to be non-null");
    }

    private MetricCriteriaResponse() {
        this.criterionType = null;
        this.dimensions = List.of();
        this.metricName = null;
        this.metricNamespace = null;
        this.name = null;
        this.operator = null;
        this.skipMetricValidation = null;
        this.threshold = null;
        this.timeAggregation = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(MetricCriteriaResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String criterionType;
        private @Nullable List<MetricDimensionResponse> dimensions;
        private String metricName;
        private @Nullable String metricNamespace;
        private String name;
        private String operator;
        private @Nullable Boolean skipMetricValidation;
        private Double threshold;
        private String timeAggregation;

        public Builder() {
    	      // Empty
        }

        public Builder(MetricCriteriaResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.criterionType = defaults.criterionType;
    	      this.dimensions = defaults.dimensions;
    	      this.metricName = defaults.metricName;
    	      this.metricNamespace = defaults.metricNamespace;
    	      this.name = defaults.name;
    	      this.operator = defaults.operator;
    	      this.skipMetricValidation = defaults.skipMetricValidation;
    	      this.threshold = defaults.threshold;
    	      this.timeAggregation = defaults.timeAggregation;
        }

        public Builder criterionType(String criterionType) {
            this.criterionType = Objects.requireNonNull(criterionType);
            return this;
        }
        public Builder dimensions(@Nullable List<MetricDimensionResponse> dimensions) {
            this.dimensions = dimensions;
            return this;
        }
        public Builder dimensions(MetricDimensionResponse... dimensions) {
            return dimensions(List.of(dimensions));
        }
        public Builder metricName(String metricName) {
            this.metricName = Objects.requireNonNull(metricName);
            return this;
        }
        public Builder metricNamespace(@Nullable String metricNamespace) {
            this.metricNamespace = metricNamespace;
            return this;
        }
        public Builder name(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }
        public Builder operator(String operator) {
            this.operator = Objects.requireNonNull(operator);
            return this;
        }
        public Builder skipMetricValidation(@Nullable Boolean skipMetricValidation) {
            this.skipMetricValidation = skipMetricValidation;
            return this;
        }
        public Builder threshold(Double threshold) {
            this.threshold = Objects.requireNonNull(threshold);
            return this;
        }
        public Builder timeAggregation(String timeAggregation) {
            this.timeAggregation = Objects.requireNonNull(timeAggregation);
            return this;
        }        public MetricCriteriaResponse build() {
            return new MetricCriteriaResponse(criterionType, dimensions, metricName, metricNamespace, name, operator, skipMetricValidation, threshold, timeAggregation);
        }
    }
}
