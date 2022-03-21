// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.insights.inputs;

import io.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.List;
import java.util.Objects;


/**
 * Specifies an auto scale rule metric dimension.
 * 
 */
public final class ScaleRuleMetricDimensionResponse extends io.pulumi.resources.InvokeArgs {

    public static final ScaleRuleMetricDimensionResponse Empty = new ScaleRuleMetricDimensionResponse();

    /**
     * Name of the dimension.
     * 
     */
    @Import(name="dimensionName", required=true)
      private final String dimensionName;

    public String getDimensionName() {
        return this.dimensionName;
    }

    /**
     * the dimension operator. Only 'Equals' and 'NotEquals' are supported. 'Equals' being equal to any of the values. 'NotEquals' being not equal to all of the values
     * 
     */
    @Import(name="operator", required=true)
      private final String operator;

    public String getOperator() {
        return this.operator;
    }

    /**
     * list of dimension values. For example: ["App1","App2"].
     * 
     */
    @Import(name="values", required=true)
      private final List<String> values;

    public List<String> getValues() {
        return this.values;
    }

    public ScaleRuleMetricDimensionResponse(
        String dimensionName,
        String operator,
        List<String> values) {
        this.dimensionName = Objects.requireNonNull(dimensionName, "expected parameter 'dimensionName' to be non-null");
        this.operator = Objects.requireNonNull(operator, "expected parameter 'operator' to be non-null");
        this.values = Objects.requireNonNull(values, "expected parameter 'values' to be non-null");
    }

    private ScaleRuleMetricDimensionResponse() {
        this.dimensionName = null;
        this.operator = null;
        this.values = List.of();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ScaleRuleMetricDimensionResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String dimensionName;
        private String operator;
        private List<String> values;

        public Builder() {
    	      // Empty
        }

        public Builder(ScaleRuleMetricDimensionResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.dimensionName = defaults.dimensionName;
    	      this.operator = defaults.operator;
    	      this.values = defaults.values;
        }

        public Builder dimensionName(String dimensionName) {
            this.dimensionName = Objects.requireNonNull(dimensionName);
            return this;
        }
        public Builder operator(String operator) {
            this.operator = Objects.requireNonNull(operator);
            return this;
        }
        public Builder values(List<String> values) {
            this.values = Objects.requireNonNull(values);
            return this;
        }
        public Builder values(String... values) {
            return values(List.of(values));
        }        public ScaleRuleMetricDimensionResponse build() {
            return new ScaleRuleMetricDimensionResponse(dimensionName, operator, values);
        }
    }
}
