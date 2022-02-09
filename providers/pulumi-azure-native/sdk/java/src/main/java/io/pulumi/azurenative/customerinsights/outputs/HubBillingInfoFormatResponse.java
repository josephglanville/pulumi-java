// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.customerinsights.outputs;

import io.pulumi.core.internal.annotations.OutputCustomType;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class HubBillingInfoFormatResponse {
    private final @Nullable Integer maxUnits;
    private final @Nullable Integer minUnits;
    private final @Nullable String skuName;

    @OutputCustomType.Constructor({"maxUnits","minUnits","skuName"})
    private HubBillingInfoFormatResponse(
        @Nullable Integer maxUnits,
        @Nullable Integer minUnits,
        @Nullable String skuName) {
        this.maxUnits = maxUnits;
        this.minUnits = minUnits;
        this.skuName = skuName;
    }

    public Optional<Integer> getMaxUnits() {
        return Optional.ofNullable(this.maxUnits);
    }
    public Optional<Integer> getMinUnits() {
        return Optional.ofNullable(this.minUnits);
    }
    public Optional<String> getSkuName() {
        return Optional.ofNullable(this.skuName);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(HubBillingInfoFormatResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Integer maxUnits;
        private @Nullable Integer minUnits;
        private @Nullable String skuName;

        public Builder() {
    	      // Empty
        }

        public Builder(HubBillingInfoFormatResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.maxUnits = defaults.maxUnits;
    	      this.minUnits = defaults.minUnits;
    	      this.skuName = defaults.skuName;
        }

        public Builder setMaxUnits(@Nullable Integer maxUnits) {
            this.maxUnits = maxUnits;
            return this;
        }

        public Builder setMinUnits(@Nullable Integer minUnits) {
            this.minUnits = minUnits;
            return this;
        }

        public Builder setSkuName(@Nullable String skuName) {
            this.skuName = skuName;
            return this;
        }

        public HubBillingInfoFormatResponse build() {
            return new HubBillingInfoFormatResponse(maxUnits, minUnits, skuName);
        }
    }
}
