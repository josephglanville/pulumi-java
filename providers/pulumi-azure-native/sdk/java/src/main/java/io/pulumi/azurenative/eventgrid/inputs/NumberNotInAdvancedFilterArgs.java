// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.eventgrid.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.internal.annotations.InputImport;
import java.lang.Double;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


public final class NumberNotInAdvancedFilterArgs extends io.pulumi.resources.ResourceArgs {

    public static final NumberNotInAdvancedFilterArgs Empty = new NumberNotInAdvancedFilterArgs();

    @InputImport(name="key")
    private final @Nullable Input<String> key;

    public Input<String> getKey() {
        return this.key == null ? Input.empty() : this.key;
    }

    @InputImport(name="operatorType", required=true)
    private final Input<String> operatorType;

    public Input<String> getOperatorType() {
        return this.operatorType;
    }

    @InputImport(name="values")
    private final @Nullable Input<List<Double>> values;

    public Input<List<Double>> getValues() {
        return this.values == null ? Input.empty() : this.values;
    }

    public NumberNotInAdvancedFilterArgs(
        @Nullable Input<String> key,
        Input<String> operatorType,
        @Nullable Input<List<Double>> values) {
        this.key = key;
        this.operatorType = Objects.requireNonNull(operatorType, "expected parameter 'operatorType' to be non-null");
        this.values = values;
    }

    private NumberNotInAdvancedFilterArgs() {
        this.key = Input.empty();
        this.operatorType = Input.empty();
        this.values = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(NumberNotInAdvancedFilterArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<String> key;
        private Input<String> operatorType;
        private @Nullable Input<List<Double>> values;

        public Builder() {
    	      // Empty
        }

        public Builder(NumberNotInAdvancedFilterArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.key = defaults.key;
    	      this.operatorType = defaults.operatorType;
    	      this.values = defaults.values;
        }

        public Builder setKey(@Nullable Input<String> key) {
            this.key = key;
            return this;
        }

        public Builder setKey(@Nullable String key) {
            this.key = Input.ofNullable(key);
            return this;
        }

        public Builder setOperatorType(Input<String> operatorType) {
            this.operatorType = Objects.requireNonNull(operatorType);
            return this;
        }

        public Builder setOperatorType(String operatorType) {
            this.operatorType = Input.of(Objects.requireNonNull(operatorType));
            return this;
        }

        public Builder setValues(@Nullable Input<List<Double>> values) {
            this.values = values;
            return this;
        }

        public Builder setValues(@Nullable List<Double> values) {
            this.values = Input.ofNullable(values);
            return this;
        }

        public NumberNotInAdvancedFilterArgs build() {
            return new NumberNotInAdvancedFilterArgs(key, operatorType, values);
        }
    }
}
