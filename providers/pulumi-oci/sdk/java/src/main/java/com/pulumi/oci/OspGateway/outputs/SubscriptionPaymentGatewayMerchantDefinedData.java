// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.oci.OspGateway.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class SubscriptionPaymentGatewayMerchantDefinedData {
    /**
     * @return (Updatable) Cloud account name.
     * 
     */
    private final @Nullable String cloudAccountName;
    /**
     * @return (Updatable) Promotion type code.
     * 
     */
    private final @Nullable String promoType;

    @CustomType.Constructor
    private SubscriptionPaymentGatewayMerchantDefinedData(
        @CustomType.Parameter("cloudAccountName") @Nullable String cloudAccountName,
        @CustomType.Parameter("promoType") @Nullable String promoType) {
        this.cloudAccountName = cloudAccountName;
        this.promoType = promoType;
    }

    /**
     * @return (Updatable) Cloud account name.
     * 
     */
    public Optional<String> cloudAccountName() {
        return Optional.ofNullable(this.cloudAccountName);
    }
    /**
     * @return (Updatable) Promotion type code.
     * 
     */
    public Optional<String> promoType() {
        return Optional.ofNullable(this.promoType);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(SubscriptionPaymentGatewayMerchantDefinedData defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String cloudAccountName;
        private @Nullable String promoType;

        public Builder() {
    	      // Empty
        }

        public Builder(SubscriptionPaymentGatewayMerchantDefinedData defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.cloudAccountName = defaults.cloudAccountName;
    	      this.promoType = defaults.promoType;
        }

        public Builder cloudAccountName(@Nullable String cloudAccountName) {
            this.cloudAccountName = cloudAccountName;
            return this;
        }
        public Builder promoType(@Nullable String promoType) {
            this.promoType = promoType;
            return this;
        }        public SubscriptionPaymentGatewayMerchantDefinedData build() {
            return new SubscriptionPaymentGatewayMerchantDefinedData(cloudAccountName, promoType);
        }
    }
}
