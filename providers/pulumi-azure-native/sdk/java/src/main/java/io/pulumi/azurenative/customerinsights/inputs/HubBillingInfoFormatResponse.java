// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.customerinsights.inputs;

import io.pulumi.core.annotations.InputImport;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Hub billing info.
 * 
 */
public final class HubBillingInfoFormatResponse extends io.pulumi.resources.InvokeArgs {

    public static final HubBillingInfoFormatResponse Empty = new HubBillingInfoFormatResponse();

    /**
     * The maximum number of units can be used.  One unit is 10,000 Profiles and 100,000 Interactions.
     * 
     */
    @InputImport(name="maxUnits")
      private final @Nullable Integer maxUnits;

    public Optional<Integer> getMaxUnits() {
        return this.maxUnits == null ? Optional.empty() : Optional.ofNullable(this.maxUnits);
    }

    /**
     * The minimum number of units will be billed. One unit is 10,000 Profiles and 100,000 Interactions.
     * 
     */
    @InputImport(name="minUnits")
      private final @Nullable Integer minUnits;

    public Optional<Integer> getMinUnits() {
        return this.minUnits == null ? Optional.empty() : Optional.ofNullable(this.minUnits);
    }

    /**
     * The sku name.
     * 
     */
    @InputImport(name="skuName")
      private final @Nullable String skuName;

    public Optional<String> getSkuName() {
        return this.skuName == null ? Optional.empty() : Optional.ofNullable(this.skuName);
    }

    public HubBillingInfoFormatResponse(
        @Nullable Integer maxUnits,
        @Nullable Integer minUnits,
        @Nullable String skuName) {
        this.maxUnits = maxUnits;
        this.minUnits = minUnits;
        this.skuName = skuName;
    }

    private HubBillingInfoFormatResponse() {
        this.maxUnits = null;
        this.minUnits = null;
        this.skuName = null;
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
