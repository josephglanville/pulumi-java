// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.edgeorder.inputs;

import io.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetOrderItemByNameArgs extends io.pulumi.resources.InvokeArgs {

    public static final GetOrderItemByNameArgs Empty = new GetOrderItemByNameArgs();

    /**
     * $expand is supported on device details, forward shipping details and reverse shipping details parameters. Each of these can be provided as a comma separated list. Device Details for order item provides details on the devices of the product, Forward and Reverse Shipping details provide forward and reverse shipping details respectively.
     * 
     */
    @Import(name="expand")
      private final @Nullable String expand;

    public Optional<String> getExpand() {
        return this.expand == null ? Optional.empty() : Optional.ofNullable(this.expand);
    }

    /**
     * The name of the order item
     * 
     */
    @Import(name="orderItemName", required=true)
      private final String orderItemName;

    public String getOrderItemName() {
        return this.orderItemName;
    }

    /**
     * The name of the resource group. The name is case insensitive.
     * 
     */
    @Import(name="resourceGroupName", required=true)
      private final String resourceGroupName;

    public String getResourceGroupName() {
        return this.resourceGroupName;
    }

    public GetOrderItemByNameArgs(
        @Nullable String expand,
        String orderItemName,
        String resourceGroupName) {
        this.expand = expand;
        this.orderItemName = Objects.requireNonNull(orderItemName, "expected parameter 'orderItemName' to be non-null");
        this.resourceGroupName = Objects.requireNonNull(resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
    }

    private GetOrderItemByNameArgs() {
        this.expand = null;
        this.orderItemName = null;
        this.resourceGroupName = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetOrderItemByNameArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String expand;
        private String orderItemName;
        private String resourceGroupName;

        public Builder() {
    	      // Empty
        }

        public Builder(GetOrderItemByNameArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.expand = defaults.expand;
    	      this.orderItemName = defaults.orderItemName;
    	      this.resourceGroupName = defaults.resourceGroupName;
        }

        public Builder expand(@Nullable String expand) {
            this.expand = expand;
            return this;
        }
        public Builder orderItemName(String orderItemName) {
            this.orderItemName = Objects.requireNonNull(orderItemName);
            return this;
        }
        public Builder resourceGroupName(String resourceGroupName) {
            this.resourceGroupName = Objects.requireNonNull(resourceGroupName);
            return this;
        }        public GetOrderItemByNameArgs build() {
            return new GetOrderItemByNameArgs(expand, orderItemName, resourceGroupName);
        }
    }
}
