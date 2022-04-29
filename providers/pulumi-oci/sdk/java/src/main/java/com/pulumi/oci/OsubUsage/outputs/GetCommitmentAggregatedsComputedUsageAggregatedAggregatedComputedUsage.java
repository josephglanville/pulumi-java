// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.oci.OsubUsage.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.oci.OsubUsage.outputs.GetCommitmentAggregatedsComputedUsageAggregatedAggregatedComputedUsageProduct;
import java.lang.String;
import java.util.List;
import java.util.Objects;

@CustomType
public final class GetCommitmentAggregatedsComputedUsageAggregatedAggregatedComputedUsage {
    /**
     * @return Sum of Computed Line Amount rounded
     * 
     */
    private final String cost;
    /**
     * @return Sum of Computed Line Amount unrounded
     * 
     */
    private final String costUnrounded;
    /**
     * @return Data Center Attribute as sent by MQS to SPM.
     * 
     */
    private final String dataCenter;
    /**
     * @return Net Unit Price for the product in consideration.
     * 
     */
    private final String netUnitPrice;
    /**
     * @return Product description
     * 
     */
    private final List<GetCommitmentAggregatedsComputedUsageAggregatedAggregatedComputedUsageProduct> products;
    /**
     * @return Total Quantity that was used for computation
     * 
     */
    private final String quantity;
    /**
     * @return Metered Service date , expressed in RFC 3339 timestamp format.
     * 
     */
    private final String timeMeteredOn;
    /**
     * @return Usage compute type in SPM.
     * 
     */
    private final String type;

    @CustomType.Constructor
    private GetCommitmentAggregatedsComputedUsageAggregatedAggregatedComputedUsage(
        @CustomType.Parameter("cost") String cost,
        @CustomType.Parameter("costUnrounded") String costUnrounded,
        @CustomType.Parameter("dataCenter") String dataCenter,
        @CustomType.Parameter("netUnitPrice") String netUnitPrice,
        @CustomType.Parameter("products") List<GetCommitmentAggregatedsComputedUsageAggregatedAggregatedComputedUsageProduct> products,
        @CustomType.Parameter("quantity") String quantity,
        @CustomType.Parameter("timeMeteredOn") String timeMeteredOn,
        @CustomType.Parameter("type") String type) {
        this.cost = cost;
        this.costUnrounded = costUnrounded;
        this.dataCenter = dataCenter;
        this.netUnitPrice = netUnitPrice;
        this.products = products;
        this.quantity = quantity;
        this.timeMeteredOn = timeMeteredOn;
        this.type = type;
    }

    /**
     * @return Sum of Computed Line Amount rounded
     * 
     */
    public String cost() {
        return this.cost;
    }
    /**
     * @return Sum of Computed Line Amount unrounded
     * 
     */
    public String costUnrounded() {
        return this.costUnrounded;
    }
    /**
     * @return Data Center Attribute as sent by MQS to SPM.
     * 
     */
    public String dataCenter() {
        return this.dataCenter;
    }
    /**
     * @return Net Unit Price for the product in consideration.
     * 
     */
    public String netUnitPrice() {
        return this.netUnitPrice;
    }
    /**
     * @return Product description
     * 
     */
    public List<GetCommitmentAggregatedsComputedUsageAggregatedAggregatedComputedUsageProduct> products() {
        return this.products;
    }
    /**
     * @return Total Quantity that was used for computation
     * 
     */
    public String quantity() {
        return this.quantity;
    }
    /**
     * @return Metered Service date , expressed in RFC 3339 timestamp format.
     * 
     */
    public String timeMeteredOn() {
        return this.timeMeteredOn;
    }
    /**
     * @return Usage compute type in SPM.
     * 
     */
    public String type() {
        return this.type;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetCommitmentAggregatedsComputedUsageAggregatedAggregatedComputedUsage defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String cost;
        private String costUnrounded;
        private String dataCenter;
        private String netUnitPrice;
        private List<GetCommitmentAggregatedsComputedUsageAggregatedAggregatedComputedUsageProduct> products;
        private String quantity;
        private String timeMeteredOn;
        private String type;

        public Builder() {
    	      // Empty
        }

        public Builder(GetCommitmentAggregatedsComputedUsageAggregatedAggregatedComputedUsage defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.cost = defaults.cost;
    	      this.costUnrounded = defaults.costUnrounded;
    	      this.dataCenter = defaults.dataCenter;
    	      this.netUnitPrice = defaults.netUnitPrice;
    	      this.products = defaults.products;
    	      this.quantity = defaults.quantity;
    	      this.timeMeteredOn = defaults.timeMeteredOn;
    	      this.type = defaults.type;
        }

        public Builder cost(String cost) {
            this.cost = Objects.requireNonNull(cost);
            return this;
        }
        public Builder costUnrounded(String costUnrounded) {
            this.costUnrounded = Objects.requireNonNull(costUnrounded);
            return this;
        }
        public Builder dataCenter(String dataCenter) {
            this.dataCenter = Objects.requireNonNull(dataCenter);
            return this;
        }
        public Builder netUnitPrice(String netUnitPrice) {
            this.netUnitPrice = Objects.requireNonNull(netUnitPrice);
            return this;
        }
        public Builder products(List<GetCommitmentAggregatedsComputedUsageAggregatedAggregatedComputedUsageProduct> products) {
            this.products = Objects.requireNonNull(products);
            return this;
        }
        public Builder products(GetCommitmentAggregatedsComputedUsageAggregatedAggregatedComputedUsageProduct... products) {
            return products(List.of(products));
        }
        public Builder quantity(String quantity) {
            this.quantity = Objects.requireNonNull(quantity);
            return this;
        }
        public Builder timeMeteredOn(String timeMeteredOn) {
            this.timeMeteredOn = Objects.requireNonNull(timeMeteredOn);
            return this;
        }
        public Builder type(String type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }        public GetCommitmentAggregatedsComputedUsageAggregatedAggregatedComputedUsage build() {
            return new GetCommitmentAggregatedsComputedUsageAggregatedAggregatedComputedUsage(cost, costUnrounded, dataCenter, netUnitPrice, products, quantity, timeMeteredOn, type);
        }
    }
}
