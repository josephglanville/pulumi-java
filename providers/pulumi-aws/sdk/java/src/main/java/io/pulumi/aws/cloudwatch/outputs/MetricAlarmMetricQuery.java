// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.cloudwatch.outputs;

import io.pulumi.aws.cloudwatch.outputs.MetricAlarmMetricQueryMetric;
import io.pulumi.core.annotations.CustomType;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class MetricAlarmMetricQuery {
    /**
     * The ID of the account where the metrics are located, if this is a cross-account alarm.
     * 
     */
    private final @Nullable String accountId;
    /**
     * The math expression to be performed on the returned data, if this object is performing a math expression. This expression can use the id of the other metrics to refer to those metrics, and can also use the id of other expressions to use the result of those expressions. For more information about metric math expressions, see Metric Math Syntax and Functions in the [Amazon CloudWatch User Guide](https://docs.aws.amazon.com/AmazonCloudWatch/latest/monitoring/using-metric-math.html#metric-math-syntax).
     * 
     */
    private final @Nullable String expression;
    /**
     * A short name used to tie this object to the results in the response. If you are performing math expressions on this set of data, this name represents that data and can serve as a variable in the mathematical expression. The valid characters are letters, numbers, and underscore. The first character must be a lowercase letter.
     * 
     */
    private final String id;
    /**
     * A human-readable label for this metric or expression. This is especially useful if this is an expression, so that you know what the value represents.
     * 
     */
    private final @Nullable String label;
    /**
     * The metric to be returned, along with statistics, period, and units. Use this parameter only if this object is retrieving a metric and not performing a math expression on returned data.
     * 
     */
    private final @Nullable MetricAlarmMetricQueryMetric metric;
    /**
     * Specify exactly one `metric_query` to be `true` to use that `metric_query` result as the alarm.
     * 
     */
    private final @Nullable Boolean returnData;

    @CustomType.Constructor
    private MetricAlarmMetricQuery(
        @CustomType.Parameter("accountId") @Nullable String accountId,
        @CustomType.Parameter("expression") @Nullable String expression,
        @CustomType.Parameter("id") String id,
        @CustomType.Parameter("label") @Nullable String label,
        @CustomType.Parameter("metric") @Nullable MetricAlarmMetricQueryMetric metric,
        @CustomType.Parameter("returnData") @Nullable Boolean returnData) {
        this.accountId = accountId;
        this.expression = expression;
        this.id = id;
        this.label = label;
        this.metric = metric;
        this.returnData = returnData;
    }

    /**
     * The ID of the account where the metrics are located, if this is a cross-account alarm.
     * 
    */
    public Optional<String> getAccountId() {
        return Optional.ofNullable(this.accountId);
    }
    /**
     * The math expression to be performed on the returned data, if this object is performing a math expression. This expression can use the id of the other metrics to refer to those metrics, and can also use the id of other expressions to use the result of those expressions. For more information about metric math expressions, see Metric Math Syntax and Functions in the [Amazon CloudWatch User Guide](https://docs.aws.amazon.com/AmazonCloudWatch/latest/monitoring/using-metric-math.html#metric-math-syntax).
     * 
    */
    public Optional<String> getExpression() {
        return Optional.ofNullable(this.expression);
    }
    /**
     * A short name used to tie this object to the results in the response. If you are performing math expressions on this set of data, this name represents that data and can serve as a variable in the mathematical expression. The valid characters are letters, numbers, and underscore. The first character must be a lowercase letter.
     * 
    */
    public String getId() {
        return this.id;
    }
    /**
     * A human-readable label for this metric or expression. This is especially useful if this is an expression, so that you know what the value represents.
     * 
    */
    public Optional<String> getLabel() {
        return Optional.ofNullable(this.label);
    }
    /**
     * The metric to be returned, along with statistics, period, and units. Use this parameter only if this object is retrieving a metric and not performing a math expression on returned data.
     * 
    */
    public Optional<MetricAlarmMetricQueryMetric> getMetric() {
        return Optional.ofNullable(this.metric);
    }
    /**
     * Specify exactly one `metric_query` to be `true` to use that `metric_query` result as the alarm.
     * 
    */
    public Optional<Boolean> getReturnData() {
        return Optional.ofNullable(this.returnData);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(MetricAlarmMetricQuery defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String accountId;
        private @Nullable String expression;
        private String id;
        private @Nullable String label;
        private @Nullable MetricAlarmMetricQueryMetric metric;
        private @Nullable Boolean returnData;

        public Builder() {
    	      // Empty
        }

        public Builder(MetricAlarmMetricQuery defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.accountId = defaults.accountId;
    	      this.expression = defaults.expression;
    	      this.id = defaults.id;
    	      this.label = defaults.label;
    	      this.metric = defaults.metric;
    	      this.returnData = defaults.returnData;
        }

        public Builder accountId(@Nullable String accountId) {
            this.accountId = accountId;
            return this;
        }
        public Builder expression(@Nullable String expression) {
            this.expression = expression;
            return this;
        }
        public Builder id(String id) {
            this.id = Objects.requireNonNull(id);
            return this;
        }
        public Builder label(@Nullable String label) {
            this.label = label;
            return this;
        }
        public Builder metric(@Nullable MetricAlarmMetricQueryMetric metric) {
            this.metric = metric;
            return this;
        }
        public Builder returnData(@Nullable Boolean returnData) {
            this.returnData = returnData;
            return this;
        }        public MetricAlarmMetricQuery build() {
            return new MetricAlarmMetricQuery(accountId, expression, id, label, metric, returnData);
        }
    }
}
