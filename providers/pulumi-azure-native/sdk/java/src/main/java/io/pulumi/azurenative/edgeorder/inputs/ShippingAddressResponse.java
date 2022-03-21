// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.edgeorder.inputs;

import io.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Shipping address where customer wishes to receive the device.
 * 
 */
public final class ShippingAddressResponse extends io.pulumi.resources.InvokeArgs {

    public static final ShippingAddressResponse Empty = new ShippingAddressResponse();

    /**
     * Type of address.
     * 
     */
    @Import(name="addressType")
      private final @Nullable String addressType;

    public Optional<String> getAddressType() {
        return this.addressType == null ? Optional.empty() : Optional.ofNullable(this.addressType);
    }

    /**
     * Name of the City.
     * 
     */
    @Import(name="city")
      private final @Nullable String city;

    public Optional<String> getCity() {
        return this.city == null ? Optional.empty() : Optional.ofNullable(this.city);
    }

    /**
     * Name of the company.
     * 
     */
    @Import(name="companyName")
      private final @Nullable String companyName;

    public Optional<String> getCompanyName() {
        return this.companyName == null ? Optional.empty() : Optional.ofNullable(this.companyName);
    }

    /**
     * Name of the Country.
     * 
     */
    @Import(name="country", required=true)
      private final String country;

    public String getCountry() {
        return this.country;
    }

    /**
     * Postal code.
     * 
     */
    @Import(name="postalCode")
      private final @Nullable String postalCode;

    public Optional<String> getPostalCode() {
        return this.postalCode == null ? Optional.empty() : Optional.ofNullable(this.postalCode);
    }

    /**
     * Name of the State or Province.
     * 
     */
    @Import(name="stateOrProvince")
      private final @Nullable String stateOrProvince;

    public Optional<String> getStateOrProvince() {
        return this.stateOrProvince == null ? Optional.empty() : Optional.ofNullable(this.stateOrProvince);
    }

    /**
     * Street Address line 1.
     * 
     */
    @Import(name="streetAddress1", required=true)
      private final String streetAddress1;

    public String getStreetAddress1() {
        return this.streetAddress1;
    }

    /**
     * Street Address line 2.
     * 
     */
    @Import(name="streetAddress2")
      private final @Nullable String streetAddress2;

    public Optional<String> getStreetAddress2() {
        return this.streetAddress2 == null ? Optional.empty() : Optional.ofNullable(this.streetAddress2);
    }

    /**
     * Street Address line 3.
     * 
     */
    @Import(name="streetAddress3")
      private final @Nullable String streetAddress3;

    public Optional<String> getStreetAddress3() {
        return this.streetAddress3 == null ? Optional.empty() : Optional.ofNullable(this.streetAddress3);
    }

    /**
     * Extended Zip Code.
     * 
     */
    @Import(name="zipExtendedCode")
      private final @Nullable String zipExtendedCode;

    public Optional<String> getZipExtendedCode() {
        return this.zipExtendedCode == null ? Optional.empty() : Optional.ofNullable(this.zipExtendedCode);
    }

    public ShippingAddressResponse(
        @Nullable String addressType,
        @Nullable String city,
        @Nullable String companyName,
        String country,
        @Nullable String postalCode,
        @Nullable String stateOrProvince,
        String streetAddress1,
        @Nullable String streetAddress2,
        @Nullable String streetAddress3,
        @Nullable String zipExtendedCode) {
        this.addressType = addressType;
        this.city = city;
        this.companyName = companyName;
        this.country = Objects.requireNonNull(country, "expected parameter 'country' to be non-null");
        this.postalCode = postalCode;
        this.stateOrProvince = stateOrProvince;
        this.streetAddress1 = Objects.requireNonNull(streetAddress1, "expected parameter 'streetAddress1' to be non-null");
        this.streetAddress2 = streetAddress2;
        this.streetAddress3 = streetAddress3;
        this.zipExtendedCode = zipExtendedCode;
    }

    private ShippingAddressResponse() {
        this.addressType = null;
        this.city = null;
        this.companyName = null;
        this.country = null;
        this.postalCode = null;
        this.stateOrProvince = null;
        this.streetAddress1 = null;
        this.streetAddress2 = null;
        this.streetAddress3 = null;
        this.zipExtendedCode = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ShippingAddressResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String addressType;
        private @Nullable String city;
        private @Nullable String companyName;
        private String country;
        private @Nullable String postalCode;
        private @Nullable String stateOrProvince;
        private String streetAddress1;
        private @Nullable String streetAddress2;
        private @Nullable String streetAddress3;
        private @Nullable String zipExtendedCode;

        public Builder() {
    	      // Empty
        }

        public Builder(ShippingAddressResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.addressType = defaults.addressType;
    	      this.city = defaults.city;
    	      this.companyName = defaults.companyName;
    	      this.country = defaults.country;
    	      this.postalCode = defaults.postalCode;
    	      this.stateOrProvince = defaults.stateOrProvince;
    	      this.streetAddress1 = defaults.streetAddress1;
    	      this.streetAddress2 = defaults.streetAddress2;
    	      this.streetAddress3 = defaults.streetAddress3;
    	      this.zipExtendedCode = defaults.zipExtendedCode;
        }

        public Builder addressType(@Nullable String addressType) {
            this.addressType = addressType;
            return this;
        }
        public Builder city(@Nullable String city) {
            this.city = city;
            return this;
        }
        public Builder companyName(@Nullable String companyName) {
            this.companyName = companyName;
            return this;
        }
        public Builder country(String country) {
            this.country = Objects.requireNonNull(country);
            return this;
        }
        public Builder postalCode(@Nullable String postalCode) {
            this.postalCode = postalCode;
            return this;
        }
        public Builder stateOrProvince(@Nullable String stateOrProvince) {
            this.stateOrProvince = stateOrProvince;
            return this;
        }
        public Builder streetAddress1(String streetAddress1) {
            this.streetAddress1 = Objects.requireNonNull(streetAddress1);
            return this;
        }
        public Builder streetAddress2(@Nullable String streetAddress2) {
            this.streetAddress2 = streetAddress2;
            return this;
        }
        public Builder streetAddress3(@Nullable String streetAddress3) {
            this.streetAddress3 = streetAddress3;
            return this;
        }
        public Builder zipExtendedCode(@Nullable String zipExtendedCode) {
            this.zipExtendedCode = zipExtendedCode;
            return this;
        }        public ShippingAddressResponse build() {
            return new ShippingAddressResponse(addressType, city, companyName, country, postalCode, stateOrProvince, streetAddress1, streetAddress2, streetAddress3, zipExtendedCode);
        }
    }
}
