// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.edgeorder;

import io.pulumi.azurenative.edgeorder.inputs.ContactDetailsArgs;
import io.pulumi.azurenative.edgeorder.inputs.ShippingAddressArgs;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import javax.annotation.Nullable;


public final class AddressByNameArgs extends io.pulumi.resources.ResourceArgs {

    public static final AddressByNameArgs Empty = new AddressByNameArgs();

    /**
     * The name of the address Resource within the specified resource group. address names must be between 3 and 24 characters in length and use any alphanumeric and underscore only
     * 
     */
    @Import(name="addressName")
      private final @Nullable Output<String> addressName;

    public Output<String> getAddressName() {
        return this.addressName == null ? Output.empty() : this.addressName;
    }

    /**
     * Contact details for the address
     * 
     */
    @Import(name="contactDetails", required=true)
      private final Output<ContactDetailsArgs> contactDetails;

    public Output<ContactDetailsArgs> getContactDetails() {
        return this.contactDetails;
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
     * The name of the resource group. The name is case insensitive.
     * 
     */
    @Import(name="resourceGroupName", required=true)
      private final Output<String> resourceGroupName;

    public Output<String> getResourceGroupName() {
        return this.resourceGroupName;
    }

    /**
     * Shipping details for the address
     * 
     */
    @Import(name="shippingAddress")
      private final @Nullable Output<ShippingAddressArgs> shippingAddress;

    public Output<ShippingAddressArgs> getShippingAddress() {
        return this.shippingAddress == null ? Output.empty() : this.shippingAddress;
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

    public AddressByNameArgs(
        @Nullable Output<String> addressName,
        Output<ContactDetailsArgs> contactDetails,
        @Nullable Output<String> location,
        Output<String> resourceGroupName,
        @Nullable Output<ShippingAddressArgs> shippingAddress,
        @Nullable Output<Map<String,String>> tags) {
        this.addressName = addressName;
        this.contactDetails = Objects.requireNonNull(contactDetails, "expected parameter 'contactDetails' to be non-null");
        this.location = location;
        this.resourceGroupName = Objects.requireNonNull(resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
        this.shippingAddress = shippingAddress;
        this.tags = tags;
    }

    private AddressByNameArgs() {
        this.addressName = Output.empty();
        this.contactDetails = Output.empty();
        this.location = Output.empty();
        this.resourceGroupName = Output.empty();
        this.shippingAddress = Output.empty();
        this.tags = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(AddressByNameArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<String> addressName;
        private Output<ContactDetailsArgs> contactDetails;
        private @Nullable Output<String> location;
        private Output<String> resourceGroupName;
        private @Nullable Output<ShippingAddressArgs> shippingAddress;
        private @Nullable Output<Map<String,String>> tags;

        public Builder() {
    	      // Empty
        }

        public Builder(AddressByNameArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.addressName = defaults.addressName;
    	      this.contactDetails = defaults.contactDetails;
    	      this.location = defaults.location;
    	      this.resourceGroupName = defaults.resourceGroupName;
    	      this.shippingAddress = defaults.shippingAddress;
    	      this.tags = defaults.tags;
        }

        public Builder addressName(@Nullable Output<String> addressName) {
            this.addressName = addressName;
            return this;
        }
        public Builder addressName(@Nullable String addressName) {
            this.addressName = Output.ofNullable(addressName);
            return this;
        }
        public Builder contactDetails(Output<ContactDetailsArgs> contactDetails) {
            this.contactDetails = Objects.requireNonNull(contactDetails);
            return this;
        }
        public Builder contactDetails(ContactDetailsArgs contactDetails) {
            this.contactDetails = Output.of(Objects.requireNonNull(contactDetails));
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
        public Builder resourceGroupName(Output<String> resourceGroupName) {
            this.resourceGroupName = Objects.requireNonNull(resourceGroupName);
            return this;
        }
        public Builder resourceGroupName(String resourceGroupName) {
            this.resourceGroupName = Output.of(Objects.requireNonNull(resourceGroupName));
            return this;
        }
        public Builder shippingAddress(@Nullable Output<ShippingAddressArgs> shippingAddress) {
            this.shippingAddress = shippingAddress;
            return this;
        }
        public Builder shippingAddress(@Nullable ShippingAddressArgs shippingAddress) {
            this.shippingAddress = Output.ofNullable(shippingAddress);
            return this;
        }
        public Builder tags(@Nullable Output<Map<String,String>> tags) {
            this.tags = tags;
            return this;
        }
        public Builder tags(@Nullable Map<String,String> tags) {
            this.tags = Output.ofNullable(tags);
            return this;
        }        public AddressByNameArgs build() {
            return new AddressByNameArgs(addressName, contactDetails, location, resourceGroupName, shippingAddress, tags);
        }
    }
}
