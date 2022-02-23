// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.edgeorder.inputs;

import io.pulumi.azurenative.edgeorder.inputs.AddressPropertiesResponse;
import io.pulumi.core.annotations.InputImport;
import java.util.Objects;


/**
 * Address details for an order item.
 * 
 */
public final class AddressDetailsResponse extends io.pulumi.resources.InvokeArgs {

    public static final AddressDetailsResponse Empty = new AddressDetailsResponse();

    /**
     * Customer address and contact details. It should be address resource
     * 
     */
    @InputImport(name="forwardAddress", required=true)
      private final AddressPropertiesResponse forwardAddress;

    public AddressPropertiesResponse getForwardAddress() {
        return this.forwardAddress;
    }

    /**
     * Return shipping address
     * 
     */
    @InputImport(name="returnAddress", required=true)
      private final AddressPropertiesResponse returnAddress;

    public AddressPropertiesResponse getReturnAddress() {
        return this.returnAddress;
    }

    public AddressDetailsResponse(
        AddressPropertiesResponse forwardAddress,
        AddressPropertiesResponse returnAddress) {
        this.forwardAddress = Objects.requireNonNull(forwardAddress, "expected parameter 'forwardAddress' to be non-null");
        this.returnAddress = Objects.requireNonNull(returnAddress, "expected parameter 'returnAddress' to be non-null");
    }

    private AddressDetailsResponse() {
        this.forwardAddress = null;
        this.returnAddress = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(AddressDetailsResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private AddressPropertiesResponse forwardAddress;
        private AddressPropertiesResponse returnAddress;

        public Builder() {
    	      // Empty
        }

        public Builder(AddressDetailsResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.forwardAddress = defaults.forwardAddress;
    	      this.returnAddress = defaults.returnAddress;
        }

        public Builder setForwardAddress(AddressPropertiesResponse forwardAddress) {
            this.forwardAddress = Objects.requireNonNull(forwardAddress);
            return this;
        }

        public Builder setReturnAddress(AddressPropertiesResponse returnAddress) {
            this.returnAddress = Objects.requireNonNull(returnAddress);
            return this;
        }
        public AddressDetailsResponse build() {
            return new AddressDetailsResponse(forwardAddress, returnAddress);
        }
    }
}
