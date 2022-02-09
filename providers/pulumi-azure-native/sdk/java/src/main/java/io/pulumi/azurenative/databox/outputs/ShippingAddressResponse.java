// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.databox.outputs;

import io.pulumi.core.internal.annotations.OutputCustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class ShippingAddressResponse {
    private final @Nullable String addressType;
    private final @Nullable String city;
    private final @Nullable String companyName;
    private final String country;
    private final @Nullable String postalCode;
    private final @Nullable String stateOrProvince;
    private final String streetAddress1;
    private final @Nullable String streetAddress2;
    private final @Nullable String streetAddress3;
    private final @Nullable String zipExtendedCode;

    @OutputCustomType.Constructor({"addressType","city","companyName","country","postalCode","stateOrProvince","streetAddress1","streetAddress2","streetAddress3","zipExtendedCode"})
    private ShippingAddressResponse(
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
        this.country = Objects.requireNonNull(country);
        this.postalCode = postalCode;
        this.stateOrProvince = stateOrProvince;
        this.streetAddress1 = Objects.requireNonNull(streetAddress1);
        this.streetAddress2 = streetAddress2;
        this.streetAddress3 = streetAddress3;
        this.zipExtendedCode = zipExtendedCode;
    }

    public Optional<String> getAddressType() {
        return Optional.ofNullable(this.addressType);
    }
    public Optional<String> getCity() {
        return Optional.ofNullable(this.city);
    }
    public Optional<String> getCompanyName() {
        return Optional.ofNullable(this.companyName);
    }
    public String getCountry() {
        return this.country;
    }
    public Optional<String> getPostalCode() {
        return Optional.ofNullable(this.postalCode);
    }
    public Optional<String> getStateOrProvince() {
        return Optional.ofNullable(this.stateOrProvince);
    }
    public String getStreetAddress1() {
        return this.streetAddress1;
    }
    public Optional<String> getStreetAddress2() {
        return Optional.ofNullable(this.streetAddress2);
    }
    public Optional<String> getStreetAddress3() {
        return Optional.ofNullable(this.streetAddress3);
    }
    public Optional<String> getZipExtendedCode() {
        return Optional.ofNullable(this.zipExtendedCode);
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

        public Builder setAddressType(@Nullable String addressType) {
            this.addressType = addressType;
            return this;
        }

        public Builder setCity(@Nullable String city) {
            this.city = city;
            return this;
        }

        public Builder setCompanyName(@Nullable String companyName) {
            this.companyName = companyName;
            return this;
        }

        public Builder setCountry(String country) {
            this.country = Objects.requireNonNull(country);
            return this;
        }

        public Builder setPostalCode(@Nullable String postalCode) {
            this.postalCode = postalCode;
            return this;
        }

        public Builder setStateOrProvince(@Nullable String stateOrProvince) {
            this.stateOrProvince = stateOrProvince;
            return this;
        }

        public Builder setStreetAddress1(String streetAddress1) {
            this.streetAddress1 = Objects.requireNonNull(streetAddress1);
            return this;
        }

        public Builder setStreetAddress2(@Nullable String streetAddress2) {
            this.streetAddress2 = streetAddress2;
            return this;
        }

        public Builder setStreetAddress3(@Nullable String streetAddress3) {
            this.streetAddress3 = streetAddress3;
            return this;
        }

        public Builder setZipExtendedCode(@Nullable String zipExtendedCode) {
            this.zipExtendedCode = zipExtendedCode;
            return this;
        }

        public ShippingAddressResponse build() {
            return new ShippingAddressResponse(addressType, city, companyName, country, postalCode, stateOrProvince, streetAddress1, streetAddress2, streetAddress3, zipExtendedCode);
        }
    }
}
