// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.inspectorv2.inputs;

import io.pulumi.core.annotations.InputImport;
import java.lang.Integer;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class FilterPortRangeFilter extends io.pulumi.resources.InvokeArgs {

    public static final FilterPortRangeFilter Empty = new FilterPortRangeFilter();

    @InputImport(name="beginInclusive")
      private final @Nullable Integer beginInclusive;

    public Optional<Integer> getBeginInclusive() {
        return this.beginInclusive == null ? Optional.empty() : Optional.ofNullable(this.beginInclusive);
    }

    @InputImport(name="endInclusive")
      private final @Nullable Integer endInclusive;

    public Optional<Integer> getEndInclusive() {
        return this.endInclusive == null ? Optional.empty() : Optional.ofNullable(this.endInclusive);
    }

    public FilterPortRangeFilter(
        @Nullable Integer beginInclusive,
        @Nullable Integer endInclusive) {
        this.beginInclusive = beginInclusive;
        this.endInclusive = endInclusive;
    }

    private FilterPortRangeFilter() {
        this.beginInclusive = null;
        this.endInclusive = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(FilterPortRangeFilter defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Integer beginInclusive;
        private @Nullable Integer endInclusive;

        public Builder() {
    	      // Empty
        }

        public Builder(FilterPortRangeFilter defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.beginInclusive = defaults.beginInclusive;
    	      this.endInclusive = defaults.endInclusive;
        }

        public Builder setBeginInclusive(@Nullable Integer beginInclusive) {
            this.beginInclusive = beginInclusive;
            return this;
        }

        public Builder setEndInclusive(@Nullable Integer endInclusive) {
            this.endInclusive = endInclusive;
            return this;
        }
        public FilterPortRangeFilter build() {
            return new FilterPortRangeFilter(beginInclusive, endInclusive);
        }
    }
}
