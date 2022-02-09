// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.insights.inputs;

import io.pulumi.azurenative.insights.inputs.ScaleRuleMetricDimensionResponse;
import io.pulumi.core.internal.annotations.InputImport;
import java.lang.Boolean;
import java.lang.Double;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class MetricTriggerResponse extends io.pulumi.resources.InvokeArgs {

    public static final MetricTriggerResponse Empty = new MetricTriggerResponse();

    @InputImport(name="dimensions")
    private final @Nullable List<ScaleRuleMetricDimensionResponse> dimensions;

    public List<ScaleRuleMetricDimensionResponse> getDimensions() {
        return this.dimensions == null ? List.of() : this.dimensions;
    }

    @InputImport(name="dividePerInstance")
    private final @Nullable Boolean dividePerInstance;

    public Optional<Boolean> getDividePerInstance() {
        return this.dividePerInstance == null ? Optional.empty() : Optional.ofNullable(this.dividePerInstance);
    }

    @InputImport(name="metricName", required=true)
    private final String metricName;

    public String getMetricName() {
        return this.metricName;
    }

    @InputImport(name="metricNamespace")
    private final @Nullable String metricNamespace;

    public Optional<String> getMetricNamespace() {
        return this.metricNamespace == null ? Optional.empty() : Optional.ofNullable(this.metricNamespace);
    }

    @InputImport(name="metricResourceLocation")
    private final @Nullable String metricResourceLocation;

    public Optional<String> getMetricResourceLocation() {
        return this.metricResourceLocation == null ? Optional.empty() : Optional.ofNullable(this.metricResourceLocation);
    }

    @InputImport(name="metricResourceUri", required=true)
    private final String metricResourceUri;

    public String getMetricResourceUri() {
        return this.metricResourceUri;
    }

    @InputImport(name="operator", required=true)
    private final String operator;

    public String getOperator() {
        return this.operator;
    }

    @InputImport(name="statistic", required=true)
    private final String statistic;

    public String getStatistic() {
        return this.statistic;
    }

    @InputImport(name="threshold", required=true)
    private final Double threshold;

    public Double getThreshold() {
        return this.threshold;
    }

    @InputImport(name="timeAggregation", required=true)
    private final String timeAggregation;

    public String getTimeAggregation() {
        return this.timeAggregation;
    }

    @InputImport(name="timeGrain", required=true)
    private final String timeGrain;

    public String getTimeGrain() {
        return this.timeGrain;
    }

    @InputImport(name="timeWindow", required=true)
    private final String timeWindow;

    public String getTimeWindow() {
        return this.timeWindow;
    }

    public MetricTriggerResponse(
        @Nullable List<ScaleRuleMetricDimensionResponse> dimensions,
        @Nullable Boolean dividePerInstance,
        String metricName,
        @Nullable String metricNamespace,
        @Nullable String metricResourceLocation,
        String metricResourceUri,
        String operator,
        String statistic,
        Double threshold,
        String timeAggregation,
        String timeGrain,
        String timeWindow) {
        this.dimensions = dimensions;
        this.dividePerInstance = dividePerInstance;
        this.metricName = Objects.requireNonNull(metricName, "expected parameter 'metricName' to be non-null");
        this.metricNamespace = metricNamespace;
        this.metricResourceLocation = metricResourceLocation;
        this.metricResourceUri = Objects.requireNonNull(metricResourceUri, "expected parameter 'metricResourceUri' to be non-null");
        this.operator = Objects.requireNonNull(operator, "expected parameter 'operator' to be non-null");
        this.statistic = Objects.requireNonNull(statistic, "expected parameter 'statistic' to be non-null");
        this.threshold = Objects.requireNonNull(threshold, "expected parameter 'threshold' to be non-null");
        this.timeAggregation = Objects.requireNonNull(timeAggregation, "expected parameter 'timeAggregation' to be non-null");
        this.timeGrain = Objects.requireNonNull(timeGrain, "expected parameter 'timeGrain' to be non-null");
        this.timeWindow = Objects.requireNonNull(timeWindow, "expected parameter 'timeWindow' to be non-null");
    }

    private MetricTriggerResponse() {
        this.dimensions = List.of();
        this.dividePerInstance = null;
        this.metricName = null;
        this.metricNamespace = null;
        this.metricResourceLocation = null;
        this.metricResourceUri = null;
        this.operator = null;
        this.statistic = null;
        this.threshold = null;
        this.timeAggregation = null;
        this.timeGrain = null;
        this.timeWindow = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(MetricTriggerResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable List<ScaleRuleMetricDimensionResponse> dimensions;
        private @Nullable Boolean dividePerInstance;
        private String metricName;
        private @Nullable String metricNamespace;
        private @Nullable String metricResourceLocation;
        private String metricResourceUri;
        private String operator;
        private String statistic;
        private Double threshold;
        private String timeAggregation;
        private String timeGrain;
        private String timeWindow;

        public Builder() {
    	      // Empty
        }

        public Builder(MetricTriggerResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.dimensions = defaults.dimensions;
    	      this.dividePerInstance = defaults.dividePerInstance;
    	      this.metricName = defaults.metricName;
    	      this.metricNamespace = defaults.metricNamespace;
    	      this.metricResourceLocation = defaults.metricResourceLocation;
    	      this.metricResourceUri = defaults.metricResourceUri;
    	      this.operator = defaults.operator;
    	      this.statistic = defaults.statistic;
    	      this.threshold = defaults.threshold;
    	      this.timeAggregation = defaults.timeAggregation;
    	      this.timeGrain = defaults.timeGrain;
    	      this.timeWindow = defaults.timeWindow;
        }

        public Builder setDimensions(@Nullable List<ScaleRuleMetricDimensionResponse> dimensions) {
            this.dimensions = dimensions;
            return this;
        }

        public Builder setDividePerInstance(@Nullable Boolean dividePerInstance) {
            this.dividePerInstance = dividePerInstance;
            return this;
        }

        public Builder setMetricName(String metricName) {
            this.metricName = Objects.requireNonNull(metricName);
            return this;
        }

        public Builder setMetricNamespace(@Nullable String metricNamespace) {
            this.metricNamespace = metricNamespace;
            return this;
        }

        public Builder setMetricResourceLocation(@Nullable String metricResourceLocation) {
            this.metricResourceLocation = metricResourceLocation;
            return this;
        }

        public Builder setMetricResourceUri(String metricResourceUri) {
            this.metricResourceUri = Objects.requireNonNull(metricResourceUri);
            return this;
        }

        public Builder setOperator(String operator) {
            this.operator = Objects.requireNonNull(operator);
            return this;
        }

        public Builder setStatistic(String statistic) {
            this.statistic = Objects.requireNonNull(statistic);
            return this;
        }

        public Builder setThreshold(Double threshold) {
            this.threshold = Objects.requireNonNull(threshold);
            return this;
        }

        public Builder setTimeAggregation(String timeAggregation) {
            this.timeAggregation = Objects.requireNonNull(timeAggregation);
            return this;
        }

        public Builder setTimeGrain(String timeGrain) {
            this.timeGrain = Objects.requireNonNull(timeGrain);
            return this;
        }

        public Builder setTimeWindow(String timeWindow) {
            this.timeWindow = Objects.requireNonNull(timeWindow);
            return this;
        }

        public MetricTriggerResponse build() {
            return new MetricTriggerResponse(dimensions, dividePerInstance, metricName, metricNamespace, metricResourceLocation, metricResourceUri, operator, statistic, threshold, timeAggregation, timeGrain, timeWindow);
        }
    }
}
