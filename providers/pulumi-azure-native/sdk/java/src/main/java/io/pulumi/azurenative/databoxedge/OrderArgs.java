// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.databoxedge;

import io.pulumi.azurenative.databoxedge.enums.ShipmentType;
import io.pulumi.azurenative.databoxedge.inputs.AddressArgs;
import io.pulumi.azurenative.databoxedge.inputs.ContactDetailsArgs;
import io.pulumi.core.Either;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class OrderArgs extends io.pulumi.resources.ResourceArgs {

    public static final OrderArgs Empty = new OrderArgs();

    /**
     * The contact details.
     * 
     */
    @Import(name="contactInformation", required=true)
      private final Output<ContactDetailsArgs> contactInformation;

    public Output<ContactDetailsArgs> getContactInformation() {
        return this.contactInformation;
    }

    /**
     * The order details of a device.
     * 
     */
    @Import(name="deviceName", required=true)
      private final Output<String> deviceName;

    public Output<String> getDeviceName() {
        return this.deviceName;
    }

    /**
     * The resource group name.
     * 
     */
    @Import(name="resourceGroupName", required=true)
      private final Output<String> resourceGroupName;

    public Output<String> getResourceGroupName() {
        return this.resourceGroupName;
    }

    /**
     * ShipmentType of the order
     * 
     */
    @Import(name="shipmentType")
      private final @Nullable Output<Either<String,ShipmentType>> shipmentType;

    public Output<Either<String,ShipmentType>> getShipmentType() {
        return this.shipmentType == null ? Output.empty() : this.shipmentType;
    }

    /**
     * The shipping address.
     * 
     */
    @Import(name="shippingAddress")
      private final @Nullable Output<AddressArgs> shippingAddress;

    public Output<AddressArgs> getShippingAddress() {
        return this.shippingAddress == null ? Output.empty() : this.shippingAddress;
    }

    public OrderArgs(
        Output<ContactDetailsArgs> contactInformation,
        Output<String> deviceName,
        Output<String> resourceGroupName,
        @Nullable Output<Either<String,ShipmentType>> shipmentType,
        @Nullable Output<AddressArgs> shippingAddress) {
        this.contactInformation = Objects.requireNonNull(contactInformation, "expected parameter 'contactInformation' to be non-null");
        this.deviceName = Objects.requireNonNull(deviceName, "expected parameter 'deviceName' to be non-null");
        this.resourceGroupName = Objects.requireNonNull(resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
        this.shipmentType = shipmentType;
        this.shippingAddress = shippingAddress;
    }

    private OrderArgs() {
        this.contactInformation = Output.empty();
        this.deviceName = Output.empty();
        this.resourceGroupName = Output.empty();
        this.shipmentType = Output.empty();
        this.shippingAddress = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(OrderArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Output<ContactDetailsArgs> contactInformation;
        private Output<String> deviceName;
        private Output<String> resourceGroupName;
        private @Nullable Output<Either<String,ShipmentType>> shipmentType;
        private @Nullable Output<AddressArgs> shippingAddress;

        public Builder() {
    	      // Empty
        }

        public Builder(OrderArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.contactInformation = defaults.contactInformation;
    	      this.deviceName = defaults.deviceName;
    	      this.resourceGroupName = defaults.resourceGroupName;
    	      this.shipmentType = defaults.shipmentType;
    	      this.shippingAddress = defaults.shippingAddress;
        }

        public Builder contactInformation(Output<ContactDetailsArgs> contactInformation) {
            this.contactInformation = Objects.requireNonNull(contactInformation);
            return this;
        }
        public Builder contactInformation(ContactDetailsArgs contactInformation) {
            this.contactInformation = Output.of(Objects.requireNonNull(contactInformation));
            return this;
        }
        public Builder deviceName(Output<String> deviceName) {
            this.deviceName = Objects.requireNonNull(deviceName);
            return this;
        }
        public Builder deviceName(String deviceName) {
            this.deviceName = Output.of(Objects.requireNonNull(deviceName));
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
        public Builder shipmentType(@Nullable Output<Either<String,ShipmentType>> shipmentType) {
            this.shipmentType = shipmentType;
            return this;
        }
        public Builder shipmentType(@Nullable Either<String,ShipmentType> shipmentType) {
            this.shipmentType = Output.ofNullable(shipmentType);
            return this;
        }
        public Builder shippingAddress(@Nullable Output<AddressArgs> shippingAddress) {
            this.shippingAddress = shippingAddress;
            return this;
        }
        public Builder shippingAddress(@Nullable AddressArgs shippingAddress) {
            this.shippingAddress = Output.ofNullable(shippingAddress);
            return this;
        }        public OrderArgs build() {
            return new OrderArgs(contactInformation, deviceName, resourceGroupName, shipmentType, shippingAddress);
        }
    }
}
