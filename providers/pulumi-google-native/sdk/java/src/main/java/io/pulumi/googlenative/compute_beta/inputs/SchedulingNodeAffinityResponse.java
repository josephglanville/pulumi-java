// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.compute_beta.inputs;

import io.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.List;
import java.util.Objects;


/**
 * Node Affinity: the configuration of desired nodes onto which this Instance could be scheduled.
 * 
 */
public final class SchedulingNodeAffinityResponse extends io.pulumi.resources.InvokeArgs {

    public static final SchedulingNodeAffinityResponse Empty = new SchedulingNodeAffinityResponse();

    /**
     * Corresponds to the label key of Node resource.
     * 
     */
    @Import(name="key", required=true)
      private final String key;

    public String getKey() {
        return this.key;
    }

    /**
     * Defines the operation of node selection. Valid operators are IN for affinity and NOT_IN for anti-affinity.
     * 
     */
    @Import(name="operator", required=true)
      private final String operator;

    public String getOperator() {
        return this.operator;
    }

    /**
     * Corresponds to the label values of Node resource.
     * 
     */
    @Import(name="values", required=true)
      private final List<String> values;

    public List<String> getValues() {
        return this.values;
    }

    public SchedulingNodeAffinityResponse(
        String key,
        String operator,
        List<String> values) {
        this.key = Objects.requireNonNull(key, "expected parameter 'key' to be non-null");
        this.operator = Objects.requireNonNull(operator, "expected parameter 'operator' to be non-null");
        this.values = Objects.requireNonNull(values, "expected parameter 'values' to be non-null");
    }

    private SchedulingNodeAffinityResponse() {
        this.key = null;
        this.operator = null;
        this.values = List.of();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(SchedulingNodeAffinityResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String key;
        private String operator;
        private List<String> values;

        public Builder() {
    	      // Empty
        }

        public Builder(SchedulingNodeAffinityResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.key = defaults.key;
    	      this.operator = defaults.operator;
    	      this.values = defaults.values;
        }

        public Builder key(String key) {
            this.key = Objects.requireNonNull(key);
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
        }        public SchedulingNodeAffinityResponse build() {
            return new SchedulingNodeAffinityResponse(key, operator, values);
        }
    }
}
