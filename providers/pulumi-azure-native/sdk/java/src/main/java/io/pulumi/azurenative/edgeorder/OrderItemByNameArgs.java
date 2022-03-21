// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.edgeorder;

import io.pulumi.azurenative.edgeorder.inputs.AddressDetailsArgs;
import io.pulumi.azurenative.edgeorder.inputs.OrderItemDetailsArgs;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import javax.annotation.Nullable;


public final class OrderItemByNameArgs extends io.pulumi.resources.ResourceArgs {

    public static final OrderItemByNameArgs Empty = new OrderItemByNameArgs();

    /**
     * Represents shipping and return address for order item
     * 
     */
    @Import(name="addressDetails", required=true)
      private final Output<AddressDetailsArgs> addressDetails;

    public Output<AddressDetailsArgs> getAddressDetails() {
        return this.addressDetails;
    }

    /**
     * The geo-location where the resource lives
     * 
     */
    @Import(name="location")
      private final @Nullable Output<String> location;

    public Output<String> getLocation() {
        return this.location == null ? Output.empty() : this.location;
    }

    /**
     * Id of the order to which order item belongs to
     * 
     */
    @Import(name="orderId", required=true)
      private final Output<String> orderId;

    public Output<String> getOrderId() {
        return this.orderId;
    }

    /**
     * Represents order item details.
     * 
     */
    @Import(name="orderItemDetails", required=true)
      private final Output<OrderItemDetailsArgs> orderItemDetails;

    public Output<OrderItemDetailsArgs> getOrderItemDetails() {
        return this.orderItemDetails;
    }

    /**
     * The name of the order item
     * 
     */
    @Import(name="orderItemName")
      private final @Nullable Output<String> orderItemName;

    public Output<String> getOrderItemName() {
        return this.orderItemName == null ? Output.empty() : this.orderItemName;
    }

    /**
     * The name of the resource group. The name is case insensitive.
     * 
     */
    @Import(name="resourceGroupName", required=true)
      private final Output<String> resourceGroupName;

    public Output<String> getResourceGroupName() {
        return this.resourceGroupName;
    }

    /**
     * Resource tags.
     * 
     */
    @Import(name="tags")
      private final @Nullable Output<Map<String,String>> tags;

    public Output<Map<String,String>> getTags() {
        return this.tags == null ? Output.empty() : this.tags;
    }

    public OrderItemByNameArgs(
        Output<AddressDetailsArgs> addressDetails,
        @Nullable Output<String> location,
        Output<String> orderId,
        Output<OrderItemDetailsArgs> orderItemDetails,
        @Nullable Output<String> orderItemName,
        Output<String> resourceGroupName,
        @Nullable Output<Map<String,String>> tags) {
        this.addressDetails = Objects.requireNonNull(addressDetails, "expected parameter 'addressDetails' to be non-null");
        this.location = location;
        this.orderId = Objects.requireNonNull(orderId, "expected parameter 'orderId' to be non-null");
        this.orderItemDetails = Objects.requireNonNull(orderItemDetails, "expected parameter 'orderItemDetails' to be non-null");
        this.orderItemName = orderItemName;
        this.resourceGroupName = Objects.requireNonNull(resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
        this.tags = tags;
    }

    private OrderItemByNameArgs() {
        this.addressDetails = Output.empty();
        this.location = Output.empty();
        this.orderId = Output.empty();
        this.orderItemDetails = Output.empty();
        this.orderItemName = Output.empty();
        this.resourceGroupName = Output.empty();
        this.tags = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(OrderItemByNameArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Output<AddressDetailsArgs> addressDetails;
        private @Nullable Output<String> location;
        private Output<String> orderId;
        private Output<OrderItemDetailsArgs> orderItemDetails;
        private @Nullable Output<String> orderItemName;
        private Output<String> resourceGroupName;
        private @Nullable Output<Map<String,String>> tags;

        public Builder() {
    	      // Empty
        }

        public Builder(OrderItemByNameArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.addressDetails = defaults.addressDetails;
    	      this.location = defaults.location;
    	      this.orderId = defaults.orderId;
    	      this.orderItemDetails = defaults.orderItemDetails;
    	      this.orderItemName = defaults.orderItemName;
    	      this.resourceGroupName = defaults.resourceGroupName;
    	      this.tags = defaults.tags;
        }

        public Builder addressDetails(Output<AddressDetailsArgs> addressDetails) {
            this.addressDetails = Objects.requireNonNull(addressDetails);
            return this;
        }
        public Builder addressDetails(AddressDetailsArgs addressDetails) {
            this.addressDetails = Output.of(Objects.requireNonNull(addressDetails));
            return this;
        }
        public Builder location(@Nullable Output<String> location) {
            this.location = location;
            return this;
        }
        public Builder location(@Nullable String location) {
            this.location = Output.ofNullable(location);
            return this;
        }
        public Builder orderId(Output<String> orderId) {
            this.orderId = Objects.requireNonNull(orderId);
            return this;
        }
        public Builder orderId(String orderId) {
            this.orderId = Output.of(Objects.requireNonNull(orderId));
            return this;
        }
        public Builder orderItemDetails(Output<OrderItemDetailsArgs> orderItemDetails) {
            this.orderItemDetails = Objects.requireNonNull(orderItemDetails);
            return this;
        }
        public Builder orderItemDetails(OrderItemDetailsArgs orderItemDetails) {
            this.orderItemDetails = Output.of(Objects.requireNonNull(orderItemDetails));
            return this;
        }
        public Builder orderItemName(@Nullable Output<String> orderItemName) {
            this.orderItemName = orderItemName;
            return this;
        }
        public Builder orderItemName(@Nullable String orderItemName) {
            this.orderItemName = Output.ofNullable(orderItemName);
            return this;
        }
        public Builder resourceGroupName(Output<String> resourceGroupName) {
            this.resourceGroupName = Objects.requireNonNull(resourceGroupName);
            return this;
        }
        public Builder resourceGroupName(String resourceGroupName) {
            this.resourceGroupName = Output.of(Objects.requireNonNull(resourceGroupName));
            return this;
        }
        public Builder tags(@Nullable Output<Map<String,String>> tags) {
            this.tags = tags;
            return this;
        }
        public Builder tags(@Nullable Map<String,String> tags) {
            this.tags = Output.ofNullable(tags);
            return this;
        }        public OrderItemByNameArgs build() {
            return new OrderItemByNameArgs(addressDetails, location, orderId, orderItemDetails, orderItemName, resourceGroupName, tags);
        }
    }
}
