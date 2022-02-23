// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.inspectorv2.inputs;

import io.pulumi.core.annotations.InputImport;
import java.lang.Double;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class FilterNumberFilter extends io.pulumi.resources.InvokeArgs {

    public static final FilterNumberFilter Empty = new FilterNumberFilter();

    @InputImport(name="lowerInclusive")
      private final @Nullable Double lowerInclusive;

    public Optional<Double> getLowerInclusive() {
        return this.lowerInclusive == null ? Optional.empty() : Optional.ofNullable(this.lowerInclusive);
    }

    @InputImport(name="upperInclusive")
      private final @Nullable Double upperInclusive;

    public Optional<Double> getUpperInclusive() {
        return this.upperInclusive == null ? Optional.empty() : Optional.ofNullable(this.upperInclusive);
    }

    public FilterNumberFilter(
        @Nullable Double lowerInclusive,
        @Nullable Double upperInclusive) {
        this.lowerInclusive = lowerInclusive;
        this.upperInclusive = upperInclusive;
    }

    private FilterNumberFilter() {
        this.lowerInclusive = null;
        this.upperInclusive = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(FilterNumberFilter defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Double lowerInclusive;
        private @Nullable Double upperInclusive;

        public Builder() {
    	      // Empty
        }

        public Builder(FilterNumberFilter defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.lowerInclusive = defaults.lowerInclusive;
    	      this.upperInclusive = defaults.upperInclusive;
        }

        public Builder setLowerInclusive(@Nullable Double lowerInclusive) {
            this.lowerInclusive = lowerInclusive;
            return this;
        }

        public Builder setUpperInclusive(@Nullable Double upperInclusive) {
            this.upperInclusive = upperInclusive;
            return this;
        }
        public FilterNumberFilter build() {
            return new FilterNumberFilter(lowerInclusive, upperInclusive);
        }
    }
}
