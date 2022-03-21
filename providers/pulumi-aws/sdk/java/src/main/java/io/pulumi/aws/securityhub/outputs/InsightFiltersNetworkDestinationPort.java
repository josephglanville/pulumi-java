// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.securityhub.outputs;

import io.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class InsightFiltersNetworkDestinationPort {
    /**
     * The equal-to condition to be applied to a single field when querying for findings, provided as a String.
     * 
     */
    private final @Nullable String eq;
    /**
     * The greater-than-equal condition to be applied to a single field when querying for findings, provided as a String.
     * 
     */
    private final @Nullable String gte;
    /**
     * The less-than-equal condition to be applied to a single field when querying for findings, provided as a String.
     * 
     */
    private final @Nullable String lte;

    @CustomType.Constructor
    private InsightFiltersNetworkDestinationPort(
        @CustomType.Parameter("eq") @Nullable String eq,
        @CustomType.Parameter("gte") @Nullable String gte,
        @CustomType.Parameter("lte") @Nullable String lte) {
        this.eq = eq;
        this.gte = gte;
        this.lte = lte;
    }

    /**
     * The equal-to condition to be applied to a single field when querying for findings, provided as a String.
     * 
    */
    public Optional<String> getEq() {
        return Optional.ofNullable(this.eq);
    }
    /**
     * The greater-than-equal condition to be applied to a single field when querying for findings, provided as a String.
     * 
    */
    public Optional<String> getGte() {
        return Optional.ofNullable(this.gte);
    }
    /**
     * The less-than-equal condition to be applied to a single field when querying for findings, provided as a String.
     * 
    */
    public Optional<String> getLte() {
        return Optional.ofNullable(this.lte);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(InsightFiltersNetworkDestinationPort defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String eq;
        private @Nullable String gte;
        private @Nullable String lte;

        public Builder() {
    	      // Empty
        }

        public Builder(InsightFiltersNetworkDestinationPort defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.eq = defaults.eq;
    	      this.gte = defaults.gte;
    	      this.lte = defaults.lte;
        }

        public Builder eq(@Nullable String eq) {
            this.eq = eq;
            return this;
        }
        public Builder gte(@Nullable String gte) {
            this.gte = gte;
            return this;
        }
        public Builder lte(@Nullable String lte) {
            this.lte = lte;
            return this;
        }        public InsightFiltersNetworkDestinationPort build() {
            return new InsightFiltersNetworkDestinationPort(eq, gte, lte);
        }
    }
}
