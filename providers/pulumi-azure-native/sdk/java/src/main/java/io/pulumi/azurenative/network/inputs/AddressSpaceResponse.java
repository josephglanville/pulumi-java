// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.network.inputs;

import io.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * AddressSpace contains an array of IP address ranges that can be used by subnets of the virtual network.
 * 
 */
public final class AddressSpaceResponse extends io.pulumi.resources.InvokeArgs {

    public static final AddressSpaceResponse Empty = new AddressSpaceResponse();

    /**
     * A list of address blocks reserved for this virtual network in CIDR notation.
     * 
     */
    @Import(name="addressPrefixes")
      private final @Nullable List<String> addressPrefixes;

    public List<String> getAddressPrefixes() {
        return this.addressPrefixes == null ? List.of() : this.addressPrefixes;
    }

    public AddressSpaceResponse(@Nullable List<String> addressPrefixes) {
        this.addressPrefixes = addressPrefixes;
    }

    private AddressSpaceResponse() {
        this.addressPrefixes = List.of();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(AddressSpaceResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable List<String> addressPrefixes;

        public Builder() {
    	      // Empty
        }

        public Builder(AddressSpaceResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.addressPrefixes = defaults.addressPrefixes;
        }

        public Builder addressPrefixes(@Nullable List<String> addressPrefixes) {
            this.addressPrefixes = addressPrefixes;
            return this;
        }
        public Builder addressPrefixes(String... addressPrefixes) {
            return addressPrefixes(List.of(addressPrefixes));
        }        public AddressSpaceResponse build() {
            return new AddressSpaceResponse(addressPrefixes);
        }
    }
}
