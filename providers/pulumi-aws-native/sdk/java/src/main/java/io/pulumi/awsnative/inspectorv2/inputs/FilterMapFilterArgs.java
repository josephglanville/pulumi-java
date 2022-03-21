// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.inspectorv2.inputs;

import io.pulumi.awsnative.inspectorv2.enums.FilterMapComparison;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class FilterMapFilterArgs extends io.pulumi.resources.ResourceArgs {

    public static final FilterMapFilterArgs Empty = new FilterMapFilterArgs();

    @Import(name="comparison", required=true)
      private final Output<FilterMapComparison> comparison;

    public Output<FilterMapComparison> getComparison() {
        return this.comparison;
    }

    @Import(name="key")
      private final @Nullable Output<String> key;

    public Output<String> getKey() {
        return this.key == null ? Output.empty() : this.key;
    }

    @Import(name="value")
      private final @Nullable Output<String> value;

    public Output<String> getValue() {
        return this.value == null ? Output.empty() : this.value;
    }

    public FilterMapFilterArgs(
        Output<FilterMapComparison> comparison,
        @Nullable Output<String> key,
        @Nullable Output<String> value) {
        this.comparison = Objects.requireNonNull(comparison, "expected parameter 'comparison' to be non-null");
        this.key = key;
        this.value = value;
    }

    private FilterMapFilterArgs() {
        this.comparison = Output.empty();
        this.key = Output.empty();
        this.value = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(FilterMapFilterArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Output<FilterMapComparison> comparison;
        private @Nullable Output<String> key;
        private @Nullable Output<String> value;

        public Builder() {
    	      // Empty
        }

        public Builder(FilterMapFilterArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.comparison = defaults.comparison;
    	      this.key = defaults.key;
    	      this.value = defaults.value;
        }

        public Builder comparison(Output<FilterMapComparison> comparison) {
            this.comparison = Objects.requireNonNull(comparison);
            return this;
        }
        public Builder comparison(FilterMapComparison comparison) {
            this.comparison = Output.of(Objects.requireNonNull(comparison));
            return this;
        }
        public Builder key(@Nullable Output<String> key) {
            this.key = key;
            return this;
        }
        public Builder key(@Nullable String key) {
            this.key = Output.ofNullable(key);
            return this;
        }
        public Builder value(@Nullable Output<String> value) {
            this.value = value;
            return this;
        }
        public Builder value(@Nullable String value) {
            this.value = Output.ofNullable(value);
            return this;
        }        public FilterMapFilterArgs build() {
            return new FilterMapFilterArgs(comparison, key, value);
        }
    }
}
