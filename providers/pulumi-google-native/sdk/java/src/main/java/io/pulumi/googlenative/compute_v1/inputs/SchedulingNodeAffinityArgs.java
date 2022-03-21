// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.compute_v1.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.googlenative.compute_v1.enums.SchedulingNodeAffinityOperator;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * Node Affinity: the configuration of desired nodes onto which this Instance could be scheduled.
 * 
 */
public final class SchedulingNodeAffinityArgs extends io.pulumi.resources.ResourceArgs {

    public static final SchedulingNodeAffinityArgs Empty = new SchedulingNodeAffinityArgs();

    /**
     * Corresponds to the label key of Node resource.
     * 
     */
    @Import(name="key")
      private final @Nullable Output<String> key;

    public Output<String> getKey() {
        return this.key == null ? Output.empty() : this.key;
    }

    /**
     * Defines the operation of node selection. Valid operators are IN for affinity and NOT_IN for anti-affinity.
     * 
     */
    @Import(name="operator")
      private final @Nullable Output<SchedulingNodeAffinityOperator> operator;

    public Output<SchedulingNodeAffinityOperator> getOperator() {
        return this.operator == null ? Output.empty() : this.operator;
    }

    /**
     * Corresponds to the label values of Node resource.
     * 
     */
    @Import(name="values")
      private final @Nullable Output<List<String>> values;

    public Output<List<String>> getValues() {
        return this.values == null ? Output.empty() : this.values;
    }

    public SchedulingNodeAffinityArgs(
        @Nullable Output<String> key,
        @Nullable Output<SchedulingNodeAffinityOperator> operator,
        @Nullable Output<List<String>> values) {
        this.key = key;
        this.operator = operator;
        this.values = values;
    }

    private SchedulingNodeAffinityArgs() {
        this.key = Output.empty();
        this.operator = Output.empty();
        this.values = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(SchedulingNodeAffinityArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<String> key;
        private @Nullable Output<SchedulingNodeAffinityOperator> operator;
        private @Nullable Output<List<String>> values;

        public Builder() {
    	      // Empty
        }

        public Builder(SchedulingNodeAffinityArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.key = defaults.key;
    	      this.operator = defaults.operator;
    	      this.values = defaults.values;
        }

        public Builder key(@Nullable Output<String> key) {
            this.key = key;
            return this;
        }
        public Builder key(@Nullable String key) {
            this.key = Output.ofNullable(key);
            return this;
        }
        public Builder operator(@Nullable Output<SchedulingNodeAffinityOperator> operator) {
            this.operator = operator;
            return this;
        }
        public Builder operator(@Nullable SchedulingNodeAffinityOperator operator) {
            this.operator = Output.ofNullable(operator);
            return this;
        }
        public Builder values(@Nullable Output<List<String>> values) {
            this.values = values;
            return this;
        }
        public Builder values(@Nullable List<String> values) {
            this.values = Output.ofNullable(values);
            return this;
        }
        public Builder values(String... values) {
            return values(List.of(values));
        }        public SchedulingNodeAffinityArgs build() {
            return new SchedulingNodeAffinityArgs(key, operator, values);
        }
    }
}
