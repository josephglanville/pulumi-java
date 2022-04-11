// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.importexport.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * Specifies the return address information for the job.
 * 
 */
public final class ReturnAddressArgs extends io.pulumi.resources.ResourceArgs {

    public static final ReturnAddressArgs Empty = new ReturnAddressArgs();

    /**
     * The city name to use when returning the drives.
     * 
     */
    @Import(name="city", required=true)
      private final Output<String> city;

    public Output<String> getCity() {
        return this.city;
    }

    /**
     * The country or region to use when returning the drives.
     * 
     */
    @Import(name="countryOrRegion", required=true)
      private final Output<String> countryOrRegion;

    public Output<String> getCountryOrRegion() {
        return this.countryOrRegion;
    }

    /**
     * Email address of the recipient of the returned drives.
     * 
     */
    @Import(name="email", required=true)
      private final Output<String> email;

    public Output<String> getEmail() {
        return this.email;
    }

    /**
     * Phone number of the recipient of the returned drives.
     * 
     */
    @Import(name="phone", required=true)
      private final Output<String> phone;

    public Output<String> getPhone() {
        return this.phone;
    }

    /**
     * The postal code to use when returning the drives.
     * 
     */
    @Import(name="postalCode", required=true)
      private final Output<String> postalCode;

    public Output<String> getPostalCode() {
        return this.postalCode;
    }

    /**
     * The name of the recipient who will receive the hard drives when they are returned.
     * 
     */
    @Import(name="recipientName", required=true)
      private final Output<String> recipientName;

    public Output<String> getRecipientName() {
        return this.recipientName;
    }

    /**
     * The state or province to use when returning the drives.
     * 
     */
    @Import(name="stateOrProvince")
      private final @Nullable Output<String> stateOrProvince;

    public Output<String> getStateOrProvince() {
        return this.stateOrProvince == null ? Codegen.empty() : this.stateOrProvince;
    }

    /**
     * The first line of the street address to use when returning the drives.
     * 
     */
    @Import(name="streetAddress1", required=true)
      private final Output<String> streetAddress1;

    public Output<String> getStreetAddress1() {
        return this.streetAddress1;
    }

    /**
     * The second line of the street address to use when returning the drives.
     * 
     */
    @Import(name="streetAddress2")
      private final @Nullable Output<String> streetAddress2;

    public Output<String> getStreetAddress2() {
        return this.streetAddress2 == null ? Codegen.empty() : this.streetAddress2;
    }

    public ReturnAddressArgs(
        Output<String> city,
        Output<String> countryOrRegion,
        Output<String> email,
        Output<String> phone,
        Output<String> postalCode,
        Output<String> recipientName,
        @Nullable Output<String> stateOrProvince,
        Output<String> streetAddress1,
        @Nullable Output<String> streetAddress2) {
        this.city = Objects.requireNonNull(city, "expected parameter 'city' to be non-null");
        this.countryOrRegion = Objects.requireNonNull(countryOrRegion, "expected parameter 'countryOrRegion' to be non-null");
        this.email = Objects.requireNonNull(email, "expected parameter 'email' to be non-null");
        this.phone = Objects.requireNonNull(phone, "expected parameter 'phone' to be non-null");
        this.postalCode = Objects.requireNonNull(postalCode, "expected parameter 'postalCode' to be non-null");
        this.recipientName = Objects.requireNonNull(recipientName, "expected parameter 'recipientName' to be non-null");
        this.stateOrProvince = stateOrProvince;
        this.streetAddress1 = Objects.requireNonNull(streetAddress1, "expected parameter 'streetAddress1' to be non-null");
        this.streetAddress2 = streetAddress2;
    }

    private ReturnAddressArgs() {
        this.city = Codegen.empty();
        this.countryOrRegion = Codegen.empty();
        this.email = Codegen.empty();
        this.phone = Codegen.empty();
        this.postalCode = Codegen.empty();
        this.recipientName = Codegen.empty();
        this.stateOrProvince = Codegen.empty();
        this.streetAddress1 = Codegen.empty();
        this.streetAddress2 = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ReturnAddressArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Output<String> city;
        private Output<String> countryOrRegion;
        private Output<String> email;
        private Output<String> phone;
        private Output<String> postalCode;
        private Output<String> recipientName;
        private @Nullable Output<String> stateOrProvince;
        private Output<String> streetAddress1;
        private @Nullable Output<String> streetAddress2;

        public Builder() {
    	      // Empty
        }

        public Builder(ReturnAddressArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.city = defaults.city;
    	      this.countryOrRegion = defaults.countryOrRegion;
    	      this.email = defaults.email;
    	      this.phone = defaults.phone;
    	      this.postalCode = defaults.postalCode;
    	      this.recipientName = defaults.recipientName;
    	      this.stateOrProvince = defaults.stateOrProvince;
    	      this.streetAddress1 = defaults.streetAddress1;
    	      this.streetAddress2 = defaults.streetAddress2;
        }

        public Builder city(Output<String> city) {
            this.city = Objects.requireNonNull(city);
            return this;
        }
        public Builder city(String city) {
            this.city = Output.of(Objects.requireNonNull(city));
            return this;
        }
        public Builder countryOrRegion(Output<String> countryOrRegion) {
            this.countryOrRegion = Objects.requireNonNull(countryOrRegion);
            return this;
        }
        public Builder countryOrRegion(String countryOrRegion) {
            this.countryOrRegion = Output.of(Objects.requireNonNull(countryOrRegion));
            return this;
        }
        public Builder email(Output<String> email) {
            this.email = Objects.requireNonNull(email);
            return this;
        }
        public Builder email(String email) {
            this.email = Output.of(Objects.requireNonNull(email));
            return this;
        }
        public Builder phone(Output<String> phone) {
            this.phone = Objects.requireNonNull(phone);
            return this;
        }
        public Builder phone(String phone) {
            this.phone = Output.of(Objects.requireNonNull(phone));
            return this;
        }
        public Builder postalCode(Output<String> postalCode) {
            this.postalCode = Objects.requireNonNull(postalCode);
            return this;
        }
        public Builder postalCode(String postalCode) {
            this.postalCode = Output.of(Objects.requireNonNull(postalCode));
            return this;
        }
        public Builder recipientName(Output<String> recipientName) {
            this.recipientName = Objects.requireNonNull(recipientName);
            return this;
        }
        public Builder recipientName(String recipientName) {
            this.recipientName = Output.of(Objects.requireNonNull(recipientName));
            return this;
        }
        public Builder stateOrProvince(@Nullable Output<String> stateOrProvince) {
            this.stateOrProvince = stateOrProvince;
            return this;
        }
        public Builder stateOrProvince(@Nullable String stateOrProvince) {
            this.stateOrProvince = Codegen.ofNullable(stateOrProvince);
            return this;
        }
        public Builder streetAddress1(Output<String> streetAddress1) {
            this.streetAddress1 = Objects.requireNonNull(streetAddress1);
            return this;
        }
        public Builder streetAddress1(String streetAddress1) {
            this.streetAddress1 = Output.of(Objects.requireNonNull(streetAddress1));
            return this;
        }
        public Builder streetAddress2(@Nullable Output<String> streetAddress2) {
            this.streetAddress2 = streetAddress2;
            return this;
        }
        public Builder streetAddress2(@Nullable String streetAddress2) {
            this.streetAddress2 = Codegen.ofNullable(streetAddress2);
            return this;
        }        public ReturnAddressArgs build() {
            return new ReturnAddressArgs(city, countryOrRegion, email, phone, postalCode, recipientName, stateOrProvince, streetAddress1, streetAddress2);
        }
    }
}
