// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.edgeorder.outputs;

import io.pulumi.core.annotations.CustomType;
import java.lang.Double;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class PurchaseMeterDetailsResponse {
    /**
     * Represents billing type.
     * Expected value is 'Purchase'.
     * 
     */
    private final String billingType;
    /**
     * Charging type.
     * 
     */
    private final String chargingType;
    /**
     * Billing unit applicable for Pav2 billing
     * 
     */
    private final Double multiplier;
    /**
     * Product Id
     * 
     */
    private final String productId;
    /**
     * Sku Id
     * 
     */
    private final String skuId;
    /**
     * Term Id
     * 
     */
    private final String termId;

    @CustomType.Constructor
    private PurchaseMeterDetailsResponse(
        @CustomType.Parameter("billingType") String billingType,
        @CustomType.Parameter("chargingType") String chargingType,
        @CustomType.Parameter("multiplier") Double multiplier,
        @CustomType.Parameter("productId") String productId,
        @CustomType.Parameter("skuId") String skuId,
        @CustomType.Parameter("termId") String termId) {
        this.billingType = billingType;
        this.chargingType = chargingType;
        this.multiplier = multiplier;
        this.productId = productId;
        this.skuId = skuId;
        this.termId = termId;
    }

    /**
     * Represents billing type.
     * Expected value is 'Purchase'.
     * 
    */
    public String getBillingType() {
        return this.billingType;
    }
    /**
     * Charging type.
     * 
    */
    public String getChargingType() {
        return this.chargingType;
    }
    /**
     * Billing unit applicable for Pav2 billing
     * 
    */
    public Double getMultiplier() {
        return this.multiplier;
    }
    /**
     * Product Id
     * 
    */
    public String getProductId() {
        return this.productId;
    }
    /**
     * Sku Id
     * 
    */
    public String getSkuId() {
        return this.skuId;
    }
    /**
     * Term Id
     * 
    */
    public String getTermId() {
        return this.termId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(PurchaseMeterDetailsResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String billingType;
        private String chargingType;
        private Double multiplier;
        private String productId;
        private String skuId;
        private String termId;

        public Builder() {
    	      // Empty
        }

        public Builder(PurchaseMeterDetailsResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.billingType = defaults.billingType;
    	      this.chargingType = defaults.chargingType;
    	      this.multiplier = defaults.multiplier;
    	      this.productId = defaults.productId;
    	      this.skuId = defaults.skuId;
    	      this.termId = defaults.termId;
        }

        public Builder billingType(String billingType) {
            this.billingType = Objects.requireNonNull(billingType);
            return this;
        }
        public Builder chargingType(String chargingType) {
            this.chargingType = Objects.requireNonNull(chargingType);
            return this;
        }
        public Builder multiplier(Double multiplier) {
            this.multiplier = Objects.requireNonNull(multiplier);
            return this;
        }
        public Builder productId(String productId) {
            this.productId = Objects.requireNonNull(productId);
            return this;
        }
        public Builder skuId(String skuId) {
            this.skuId = Objects.requireNonNull(skuId);
            return this;
        }
        public Builder termId(String termId) {
            this.termId = Objects.requireNonNull(termId);
            return this;
        }        public PurchaseMeterDetailsResponse build() {
            return new PurchaseMeterDetailsResponse(billingType, chargingType, multiplier, productId, skuId, termId);
        }
    }
}
