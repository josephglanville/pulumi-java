// *** WARNING: this file was generated by test. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.myedgeorder.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.Double;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class PurchaseMeterDetailsResponse {
    /**
     * @return Represents billing type.
     * Expected value is &#39;Purchase&#39;.
     * 
     */
    private String billingType;
    /**
     * @return Charging type.
     * 
     */
    private String chargingType;
    /**
     * @return Billing unit applicable for Pav2 billing
     * 
     */
    private Double multiplier;
    /**
     * @return Product Id
     * 
     */
    private String productId;
    /**
     * @return Sku Id
     * 
     */
    private String skuId;
    /**
     * @return Term Id
     * 
     */
    private String termId;

    private PurchaseMeterDetailsResponse() {}
    /**
     * @return Represents billing type.
     * Expected value is &#39;Purchase&#39;.
     * 
     */
    public String billingType() {
        return this.billingType;
    }
    /**
     * @return Charging type.
     * 
     */
    public String chargingType() {
        return this.chargingType;
    }
    /**
     * @return Billing unit applicable for Pav2 billing
     * 
     */
    public Double multiplier() {
        return this.multiplier;
    }
    /**
     * @return Product Id
     * 
     */
    public String productId() {
        return this.productId;
    }
    /**
     * @return Sku Id
     * 
     */
    public String skuId() {
        return this.skuId;
    }
    /**
     * @return Term Id
     * 
     */
    public String termId() {
        return this.termId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(PurchaseMeterDetailsResponse defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String billingType;
        private String chargingType;
        private Double multiplier;
        private String productId;
        private String skuId;
        private String termId;
        public Builder() {}
        public Builder(PurchaseMeterDetailsResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.billingType = defaults.billingType;
    	      this.chargingType = defaults.chargingType;
    	      this.multiplier = defaults.multiplier;
    	      this.productId = defaults.productId;
    	      this.skuId = defaults.skuId;
    	      this.termId = defaults.termId;
        }

        @CustomType.Setter
        public Builder billingType(String billingType) {
            if (billingType == null) {
                throw new MissingRequiredPropertyException("PurchaseMeterDetailsResponse", "billingType");
            }
            this.billingType = billingType;
            return this;
        }
        @CustomType.Setter
        public Builder chargingType(String chargingType) {
            if (chargingType == null) {
                throw new MissingRequiredPropertyException("PurchaseMeterDetailsResponse", "chargingType");
            }
            this.chargingType = chargingType;
            return this;
        }
        @CustomType.Setter
        public Builder multiplier(Double multiplier) {
            if (multiplier == null) {
                throw new MissingRequiredPropertyException("PurchaseMeterDetailsResponse", "multiplier");
            }
            this.multiplier = multiplier;
            return this;
        }
        @CustomType.Setter
        public Builder productId(String productId) {
            if (productId == null) {
                throw new MissingRequiredPropertyException("PurchaseMeterDetailsResponse", "productId");
            }
            this.productId = productId;
            return this;
        }
        @CustomType.Setter
        public Builder skuId(String skuId) {
            if (skuId == null) {
                throw new MissingRequiredPropertyException("PurchaseMeterDetailsResponse", "skuId");
            }
            this.skuId = skuId;
            return this;
        }
        @CustomType.Setter
        public Builder termId(String termId) {
            if (termId == null) {
                throw new MissingRequiredPropertyException("PurchaseMeterDetailsResponse", "termId");
            }
            this.termId = termId;
            return this;
        }
        public PurchaseMeterDetailsResponse build() {
            final var o = new PurchaseMeterDetailsResponse();
            o.billingType = billingType;
            o.chargingType = chargingType;
            o.multiplier = multiplier;
            o.productId = productId;
            o.skuId = skuId;
            o.termId = termId;
            return o;
        }
    }
}
