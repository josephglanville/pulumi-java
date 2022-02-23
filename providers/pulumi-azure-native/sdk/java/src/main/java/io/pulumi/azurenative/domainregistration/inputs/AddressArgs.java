// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.domainregistration.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * Address information for domain registration.
 * 
 */
public final class AddressArgs extends io.pulumi.resources.ResourceArgs {

    public static final AddressArgs Empty = new AddressArgs();

    /**
     * First line of an Address.
     * 
     */
    @InputImport(name="address1", required=true)
      private final Input<String> address1;

    public Input<String> getAddress1() {
        return this.address1;
    }

    /**
     * The second line of the Address. Optional.
     * 
     */
    @InputImport(name="address2")
      private final @Nullable Input<String> address2;

    public Input<String> getAddress2() {
        return this.address2 == null ? Input.empty() : this.address2;
    }

    /**
     * The city for the address.
     * 
     */
    @InputImport(name="city", required=true)
      private final Input<String> city;

    public Input<String> getCity() {
        return this.city;
    }

    /**
     * The country for the address.
     * 
     */
    @InputImport(name="country", required=true)
      private final Input<String> country;

    public Input<String> getCountry() {
        return this.country;
    }

    /**
     * The postal code for the address.
     * 
     */
    @InputImport(name="postalCode", required=true)
      private final Input<String> postalCode;

    public Input<String> getPostalCode() {
        return this.postalCode;
    }

    /**
     * The state or province for the address.
     * 
     */
    @InputImport(name="state", required=true)
      private final Input<String> state;

    public Input<String> getState() {
        return this.state;
    }

    public AddressArgs(
        Input<String> address1,
        @Nullable Input<String> address2,
        Input<String> city,
        Input<String> country,
        Input<String> postalCode,
        Input<String> state) {
        this.address1 = Objects.requireNonNull(address1, "expected parameter 'address1' to be non-null");
        this.address2 = address2;
        this.city = Objects.requireNonNull(city, "expected parameter 'city' to be non-null");
        this.country = Objects.requireNonNull(country, "expected parameter 'country' to be non-null");
        this.postalCode = Objects.requireNonNull(postalCode, "expected parameter 'postalCode' to be non-null");
        this.state = Objects.requireNonNull(state, "expected parameter 'state' to be non-null");
    }

    private AddressArgs() {
        this.address1 = Input.empty();
        this.address2 = Input.empty();
        this.city = Input.empty();
        this.country = Input.empty();
        this.postalCode = Input.empty();
        this.state = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(AddressArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Input<String> address1;
        private @Nullable Input<String> address2;
        private Input<String> city;
        private Input<String> country;
        private Input<String> postalCode;
        private Input<String> state;

        public Builder() {
    	      // Empty
        }

        public Builder(AddressArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.address1 = defaults.address1;
    	      this.address2 = defaults.address2;
    	      this.city = defaults.city;
    	      this.country = defaults.country;
    	      this.postalCode = defaults.postalCode;
    	      this.state = defaults.state;
        }

        public Builder setAddress1(Input<String> address1) {
            this.address1 = Objects.requireNonNull(address1);
            return this;
        }

        public Builder setAddress1(String address1) {
            this.address1 = Input.of(Objects.requireNonNull(address1));
            return this;
        }

        public Builder setAddress2(@Nullable Input<String> address2) {
            this.address2 = address2;
            return this;
        }

        public Builder setAddress2(@Nullable String address2) {
            this.address2 = Input.ofNullable(address2);
            return this;
        }

        public Builder setCity(Input<String> city) {
            this.city = Objects.requireNonNull(city);
            return this;
        }

        public Builder setCity(String city) {
            this.city = Input.of(Objects.requireNonNull(city));
            return this;
        }

        public Builder setCountry(Input<String> country) {
            this.country = Objects.requireNonNull(country);
            return this;
        }

        public Builder setCountry(String country) {
            this.country = Input.of(Objects.requireNonNull(country));
            return this;
        }

        public Builder setPostalCode(Input<String> postalCode) {
            this.postalCode = Objects.requireNonNull(postalCode);
            return this;
        }

        public Builder setPostalCode(String postalCode) {
            this.postalCode = Input.of(Objects.requireNonNull(postalCode));
            return this;
        }

        public Builder setState(Input<String> state) {
            this.state = Objects.requireNonNull(state);
            return this;
        }

        public Builder setState(String state) {
            this.state = Input.of(Objects.requireNonNull(state));
            return this;
        }
        public AddressArgs build() {
            return new AddressArgs(address1, address2, city, country, postalCode, state);
        }
    }
}
