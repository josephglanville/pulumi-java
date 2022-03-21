// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.eventgrid.inputs;

import io.pulumi.core.annotations.Import;
import java.lang.Double;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * NumberInRange Advanced Filter.
 * 
 */
public final class NumberInRangeAdvancedFilterResponse extends io.pulumi.resources.InvokeArgs {

    public static final NumberInRangeAdvancedFilterResponse Empty = new NumberInRangeAdvancedFilterResponse();

    /**
     * The field/property in the event based on which you want to filter.
     * 
     */
    @Import(name="key")
      private final @Nullable String key;

    public Optional<String> getKey() {
        return this.key == null ? Optional.empty() : Optional.ofNullable(this.key);
    }

    /**
     * The operator type used for filtering, e.g., NumberIn, StringContains, BoolEquals and others.
     * Expected value is 'NumberInRange'.
     * 
     */
    @Import(name="operatorType", required=true)
      private final String operatorType;

    public String getOperatorType() {
        return this.operatorType;
    }

    /**
     * The set of filter values.
     * 
     */
    @Import(name="values")
      private final @Nullable List<List<Double>> values;

    public List<List<Double>> getValues() {
        return this.values == null ? List.of() : this.values;
    }

    public NumberInRangeAdvancedFilterResponse(
        @Nullable String key,
        String operatorType,
        @Nullable List<List<Double>> values) {
        this.key = key;
        this.operatorType = Objects.requireNonNull(operatorType, "expected parameter 'operatorType' to be non-null");
        this.values = values;
    }

    private NumberInRangeAdvancedFilterResponse() {
        this.key = null;
        this.operatorType = null;
        this.values = List.of();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(NumberInRangeAdvancedFilterResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String key;
        private String operatorType;
        private @Nullable List<List<Double>> values;

        public Builder() {
    	      // Empty
        }

        public Builder(NumberInRangeAdvancedFilterResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.key = defaults.key;
    	      this.operatorType = defaults.operatorType;
    	      this.values = defaults.values;
        }

        public Builder key(@Nullable String key) {
            this.key = key;
            return this;
        }
        public Builder operatorType(String operatorType) {
            this.operatorType = Objects.requireNonNull(operatorType);
            return this;
        }
        public Builder values(@Nullable List<List<Double>> values) {
            this.values = values;
            return this;
        }        public NumberInRangeAdvancedFilterResponse build() {
            return new NumberInRangeAdvancedFilterResponse(key, operatorType, values);
        }
    }
}
