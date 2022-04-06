// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.securityhub.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


public final class InsightFiltersUserDefinedValueGetArgs extends io.pulumi.resources.ResourceArgs {

    public static final InsightFiltersUserDefinedValueGetArgs Empty = new InsightFiltersUserDefinedValueGetArgs();

    /**
     * The condition to apply to a string value when querying for findings. Valid values include: `EQUALS` and `NOT_EQUALS`.
     * 
     */
    @Import(name="comparison", required=true)
      private final Output<String> comparison;

    public Output<String> getComparison() {
        return this.comparison;
    }

    /**
     * The key of the map filter. For example, for `ResourceTags`, `Key` identifies the name of the tag. For `UserDefinedFields`, `Key` is the name of the field.
     * 
     */
    @Import(name="key", required=true)
      private final Output<String> key;

    public Output<String> getKey() {
        return this.key;
    }

    /**
     * A date range value for the date filter, provided as an Integer.
     * 
     */
    @Import(name="value", required=true)
      private final Output<String> value;

    public Output<String> getValue() {
        return this.value;
    }

    public InsightFiltersUserDefinedValueGetArgs(
        Output<String> comparison,
        Output<String> key,
        Output<String> value) {
        this.comparison = Objects.requireNonNull(comparison, "expected parameter 'comparison' to be non-null");
        this.key = Objects.requireNonNull(key, "expected parameter 'key' to be non-null");
        this.value = Objects.requireNonNull(value, "expected parameter 'value' to be non-null");
    }

    private InsightFiltersUserDefinedValueGetArgs() {
        this.comparison = Output.empty();
        this.key = Output.empty();
        this.value = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(InsightFiltersUserDefinedValueGetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Output<String> comparison;
        private Output<String> key;
        private Output<String> value;

        public Builder() {
    	      // Empty
        }

        public Builder(InsightFiltersUserDefinedValueGetArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.comparison = defaults.comparison;
    	      this.key = defaults.key;
    	      this.value = defaults.value;
        }

        public Builder comparison(Output<String> comparison) {
            this.comparison = Objects.requireNonNull(comparison);
            return this;
        }
        public Builder comparison(String comparison) {
            this.comparison = Output.of(Objects.requireNonNull(comparison));
            return this;
        }
        public Builder key(Output<String> key) {
            this.key = Objects.requireNonNull(key);
            return this;
        }
        public Builder key(String key) {
            this.key = Output.of(Objects.requireNonNull(key));
            return this;
        }
        public Builder value(Output<String> value) {
            this.value = Objects.requireNonNull(value);
            return this;
        }
        public Builder value(String value) {
            this.value = Output.of(Objects.requireNonNull(value));
            return this;
        }        public InsightFiltersUserDefinedValueGetArgs build() {
            return new InsightFiltersUserDefinedValueGetArgs(comparison, key, value);
        }
    }
}