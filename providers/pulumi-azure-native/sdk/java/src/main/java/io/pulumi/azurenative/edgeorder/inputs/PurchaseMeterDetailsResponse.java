// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.edgeorder.inputs;

import io.pulumi.core.annotations.Import;
import java.lang.Double;
import java.lang.String;
import java.util.Objects;


/**
 * Billing type Purchase meter details
 * 
 */
public final class PurchaseMeterDetailsResponse extends io.pulumi.resources.InvokeArgs {

    public static final PurchaseMeterDetailsResponse Empty = new PurchaseMeterDetailsResponse();

    /**
     * Represents billing type.
     * Expected value is 'Purchase'.
     * 
     */
    @Import(name="billingType", required=true)
      private final String billingType;

    public String getBillingType() {
        return this.billingType;
    }

    /**
     * Charging type.
     * 
     */
    @Import(name="chargingType", required=true)
      private final String chargingType;

    public String getChargingType() {
        return this.chargingType;
    }

    /**
     * Billing unit applicable for Pav2 billing
     * 
     */
    @Import(name="multiplier", required=true)
      private final Double multiplier;

    public Double getMultiplier() {
        return this.multiplier;
    }

    /**
     * Product Id
     * 
     */
    @Import(name="productId", required=true)
      private final String productId;

    public String getProductId() {
        return this.productId;
    }

    /**
     * Sku Id
     * 
     */
    @Import(name="skuId", required=true)
      private final String skuId;

    public String getSkuId() {
        return this.skuId;
    }

    /**
     * Term Id
     * 
     */
    @Import(name="termId", required=true)
      private final String termId;

    public String getTermId() {
        return this.termId;
    }

    public PurchaseMeterDetailsResponse(
        String billingType,
        String chargingType,
        Double multiplier,
        String productId,
        String skuId,
        String termId) {
        this.billingType = Objects.requireNonNull(billingType, "expected parameter 'billingType' to be non-null");
        this.chargingType = Objects.requireNonNull(chargingType, "expected parameter 'chargingType' to be non-null");
        this.multiplier = Objects.requireNonNull(multiplier, "expected parameter 'multiplier' to be non-null");
        this.productId = Objects.requireNonNull(productId, "expected parameter 'productId' to be non-null");
        this.skuId = Objects.requireNonNull(skuId, "expected parameter 'skuId' to be non-null");
        this.termId = Objects.requireNonNull(termId, "expected parameter 'termId' to be non-null");
    }

    private PurchaseMeterDetailsResponse() {
        this.billingType = null;
        this.chargingType = null;
        this.multiplier = null;
        this.productId = null;
        this.skuId = null;
        this.termId = null;
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
