// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.edgeorder.inputs;

import io.pulumi.azurenative.edgeorder.inputs.ContactDetailsArgs;
import io.pulumi.azurenative.edgeorder.inputs.ShippingAddressArgs;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * Address Properties
 * 
 */
public final class AddressPropertiesArgs extends io.pulumi.resources.ResourceArgs {

    public static final AddressPropertiesArgs Empty = new AddressPropertiesArgs();

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
     * Shipping details for the address
     * 
     */
    @Import(name="shippingAddress")
      private final @Nullable Output<ShippingAddressArgs> shippingAddress;

    public Output<ShippingAddressArgs> getShippingAddress() {
        return this.shippingAddress == null ? Output.empty() : this.shippingAddress;
    }

    public AddressPropertiesArgs(
        Output<ContactDetailsArgs> contactDetails,
        @Nullable Output<ShippingAddressArgs> shippingAddress) {
        this.contactDetails = Objects.requireNonNull(contactDetails, "expected parameter 'contactDetails' to be non-null");
        this.shippingAddress = shippingAddress;
    }

    private AddressPropertiesArgs() {
        this.contactDetails = Output.empty();
        this.shippingAddress = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(AddressPropertiesArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Output<ContactDetailsArgs> contactDetails;
        private @Nullable Output<ShippingAddressArgs> shippingAddress;

        public Builder() {
    	      // Empty
        }

        public Builder(AddressPropertiesArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.contactDetails = defaults.contactDetails;
    	      this.shippingAddress = defaults.shippingAddress;
        }

        public Builder contactDetails(Output<ContactDetailsArgs> contactDetails) {
            this.contactDetails = Objects.requireNonNull(contactDetails);
            return this;
        }
        public Builder contactDetails(ContactDetailsArgs contactDetails) {
            this.contactDetails = Output.of(Objects.requireNonNull(contactDetails));
            return this;
        }
        public Builder shippingAddress(@Nullable Output<ShippingAddressArgs> shippingAddress) {
            this.shippingAddress = shippingAddress;
            return this;
        }
        public Builder shippingAddress(@Nullable ShippingAddressArgs shippingAddress) {
            this.shippingAddress = Output.ofNullable(shippingAddress);
            return this;
        }        public AddressPropertiesArgs build() {
            return new AddressPropertiesArgs(contactDetails, shippingAddress);
        }
    }
}
