// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.databoxedge;

import io.pulumi.azurenative.databoxedge.enums.ShipmentType;
import io.pulumi.azurenative.databoxedge.inputs.AddressArgs;
import io.pulumi.azurenative.databoxedge.inputs.ContactDetailsArgs;
import io.pulumi.core.Either;
import io.pulumi.core.Input;
import io.pulumi.core.internal.annotations.InputImport;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class OrderArgs extends io.pulumi.resources.ResourceArgs {

    public static final OrderArgs Empty = new OrderArgs();

    @InputImport(name="contactInformation", required=true)
    private final Input<ContactDetailsArgs> contactInformation;

    public Input<ContactDetailsArgs> getContactInformation() {
        return this.contactInformation;
    }

    @InputImport(name="deviceName", required=true)
    private final Input<String> deviceName;

    public Input<String> getDeviceName() {
        return this.deviceName;
    }

    @InputImport(name="resourceGroupName", required=true)
    private final Input<String> resourceGroupName;

    public Input<String> getResourceGroupName() {
        return this.resourceGroupName;
    }

    @InputImport(name="shipmentType")
    private final @Nullable Input<Either<String,ShipmentType>> shipmentType;

    public Input<Either<String,ShipmentType>> getShipmentType() {
        return this.shipmentType == null ? Input.empty() : this.shipmentType;
    }

    @InputImport(name="shippingAddress")
    private final @Nullable Input<AddressArgs> shippingAddress;

    public Input<AddressArgs> getShippingAddress() {
        return this.shippingAddress == null ? Input.empty() : this.shippingAddress;
    }

    public OrderArgs(
        Input<ContactDetailsArgs> contactInformation,
        Input<String> deviceName,
        Input<String> resourceGroupName,
        @Nullable Input<Either<String,ShipmentType>> shipmentType,
        @Nullable Input<AddressArgs> shippingAddress) {
        this.contactInformation = Objects.requireNonNull(contactInformation, "expected parameter 'contactInformation' to be non-null");
        this.deviceName = Objects.requireNonNull(deviceName, "expected parameter 'deviceName' to be non-null");
        this.resourceGroupName = Objects.requireNonNull(resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
        this.shipmentType = shipmentType;
        this.shippingAddress = shippingAddress;
    }

    private OrderArgs() {
        this.contactInformation = Input.empty();
        this.deviceName = Input.empty();
        this.resourceGroupName = Input.empty();
        this.shipmentType = Input.empty();
        this.shippingAddress = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(OrderArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Input<ContactDetailsArgs> contactInformation;
        private Input<String> deviceName;
        private Input<String> resourceGroupName;
        private @Nullable Input<Either<String,ShipmentType>> shipmentType;
        private @Nullable Input<AddressArgs> shippingAddress;

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

        public Builder setContactInformation(Input<ContactDetailsArgs> contactInformation) {
            this.contactInformation = Objects.requireNonNull(contactInformation);
            return this;
        }

        public Builder setContactInformation(ContactDetailsArgs contactInformation) {
            this.contactInformation = Input.of(Objects.requireNonNull(contactInformation));
            return this;
        }

        public Builder setDeviceName(Input<String> deviceName) {
            this.deviceName = Objects.requireNonNull(deviceName);
            return this;
        }

        public Builder setDeviceName(String deviceName) {
            this.deviceName = Input.of(Objects.requireNonNull(deviceName));
            return this;
        }

        public Builder setResourceGroupName(Input<String> resourceGroupName) {
            this.resourceGroupName = Objects.requireNonNull(resourceGroupName);
            return this;
        }

        public Builder setResourceGroupName(String resourceGroupName) {
            this.resourceGroupName = Input.of(Objects.requireNonNull(resourceGroupName));
            return this;
        }

        public Builder setShipmentType(@Nullable Input<Either<String,ShipmentType>> shipmentType) {
            this.shipmentType = shipmentType;
            return this;
        }

        public Builder setShipmentType(@Nullable Either<String,ShipmentType> shipmentType) {
            this.shipmentType = Input.ofNullable(shipmentType);
            return this;
        }

        public Builder setShippingAddress(@Nullable Input<AddressArgs> shippingAddress) {
            this.shippingAddress = shippingAddress;
            return this;
        }

        public Builder setShippingAddress(@Nullable AddressArgs shippingAddress) {
            this.shippingAddress = Input.ofNullable(shippingAddress);
            return this;
        }

        public OrderArgs build() {
            return new OrderArgs(contactInformation, deviceName, resourceGroupName, shipmentType, shippingAddress);
        }
    }
}
