// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.certificateauthority.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class CertificateCertificateDescriptionSubjectDescriptionSubjectArgs extends io.pulumi.resources.ResourceArgs {

    public static final CertificateCertificateDescriptionSubjectDescriptionSubjectArgs Empty = new CertificateCertificateDescriptionSubjectDescriptionSubjectArgs();

    /**
     * The common name of the distinguished name.
     * 
     */
    @InputImport(name="commonName")
      private final @Nullable Input<String> commonName;

    public Input<String> getCommonName() {
        return this.commonName == null ? Input.empty() : this.commonName;
    }

    /**
     * The country code of the subject.
     * 
     */
    @InputImport(name="countryCode")
      private final @Nullable Input<String> countryCode;

    public Input<String> getCountryCode() {
        return this.countryCode == null ? Input.empty() : this.countryCode;
    }

    /**
     * The locality or city of the subject.
     * 
     */
    @InputImport(name="locality")
      private final @Nullable Input<String> locality;

    public Input<String> getLocality() {
        return this.locality == null ? Input.empty() : this.locality;
    }

    /**
     * The organization of the subject.
     * 
     */
    @InputImport(name="organization")
      private final @Nullable Input<String> organization;

    public Input<String> getOrganization() {
        return this.organization == null ? Input.empty() : this.organization;
    }

    /**
     * The organizational unit of the subject.
     * 
     */
    @InputImport(name="organizationalUnit")
      private final @Nullable Input<String> organizationalUnit;

    public Input<String> getOrganizationalUnit() {
        return this.organizationalUnit == null ? Input.empty() : this.organizationalUnit;
    }

    /**
     * The postal code of the subject.
     * 
     */
    @InputImport(name="postalCode")
      private final @Nullable Input<String> postalCode;

    public Input<String> getPostalCode() {
        return this.postalCode == null ? Input.empty() : this.postalCode;
    }

    /**
     * The province, territory, or regional state of the subject.
     * 
     */
    @InputImport(name="province")
      private final @Nullable Input<String> province;

    public Input<String> getProvince() {
        return this.province == null ? Input.empty() : this.province;
    }

    /**
     * The street address of the subject.
     * 
     */
    @InputImport(name="streetAddress")
      private final @Nullable Input<String> streetAddress;

    public Input<String> getStreetAddress() {
        return this.streetAddress == null ? Input.empty() : this.streetAddress;
    }

    public CertificateCertificateDescriptionSubjectDescriptionSubjectArgs(
        @Nullable Input<String> commonName,
        @Nullable Input<String> countryCode,
        @Nullable Input<String> locality,
        @Nullable Input<String> organization,
        @Nullable Input<String> organizationalUnit,
        @Nullable Input<String> postalCode,
        @Nullable Input<String> province,
        @Nullable Input<String> streetAddress) {
        this.commonName = commonName;
        this.countryCode = countryCode;
        this.locality = locality;
        this.organization = organization;
        this.organizationalUnit = organizationalUnit;
        this.postalCode = postalCode;
        this.province = province;
        this.streetAddress = streetAddress;
    }

    private CertificateCertificateDescriptionSubjectDescriptionSubjectArgs() {
        this.commonName = Input.empty();
        this.countryCode = Input.empty();
        this.locality = Input.empty();
        this.organization = Input.empty();
        this.organizationalUnit = Input.empty();
        this.postalCode = Input.empty();
        this.province = Input.empty();
        this.streetAddress = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(CertificateCertificateDescriptionSubjectDescriptionSubjectArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<String> commonName;
        private @Nullable Input<String> countryCode;
        private @Nullable Input<String> locality;
        private @Nullable Input<String> organization;
        private @Nullable Input<String> organizationalUnit;
        private @Nullable Input<String> postalCode;
        private @Nullable Input<String> province;
        private @Nullable Input<String> streetAddress;

        public Builder() {
    	      // Empty
        }

        public Builder(CertificateCertificateDescriptionSubjectDescriptionSubjectArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.commonName = defaults.commonName;
    	      this.countryCode = defaults.countryCode;
    	      this.locality = defaults.locality;
    	      this.organization = defaults.organization;
    	      this.organizationalUnit = defaults.organizationalUnit;
    	      this.postalCode = defaults.postalCode;
    	      this.province = defaults.province;
    	      this.streetAddress = defaults.streetAddress;
        }

        public Builder setCommonName(@Nullable Input<String> commonName) {
            this.commonName = commonName;
            return this;
        }

        public Builder setCommonName(@Nullable String commonName) {
            this.commonName = Input.ofNullable(commonName);
            return this;
        }

        public Builder setCountryCode(@Nullable Input<String> countryCode) {
            this.countryCode = countryCode;
            return this;
        }

        public Builder setCountryCode(@Nullable String countryCode) {
            this.countryCode = Input.ofNullable(countryCode);
            return this;
        }

        public Builder setLocality(@Nullable Input<String> locality) {
            this.locality = locality;
            return this;
        }

        public Builder setLocality(@Nullable String locality) {
            this.locality = Input.ofNullable(locality);
            return this;
        }

        public Builder setOrganization(@Nullable Input<String> organization) {
            this.organization = organization;
            return this;
        }

        public Builder setOrganization(@Nullable String organization) {
            this.organization = Input.ofNullable(organization);
            return this;
        }

        public Builder setOrganizationalUnit(@Nullable Input<String> organizationalUnit) {
            this.organizationalUnit = organizationalUnit;
            return this;
        }

        public Builder setOrganizationalUnit(@Nullable String organizationalUnit) {
            this.organizationalUnit = Input.ofNullable(organizationalUnit);
            return this;
        }

        public Builder setPostalCode(@Nullable Input<String> postalCode) {
            this.postalCode = postalCode;
            return this;
        }

        public Builder setPostalCode(@Nullable String postalCode) {
            this.postalCode = Input.ofNullable(postalCode);
            return this;
        }

        public Builder setProvince(@Nullable Input<String> province) {
            this.province = province;
            return this;
        }

        public Builder setProvince(@Nullable String province) {
            this.province = Input.ofNullable(province);
            return this;
        }

        public Builder setStreetAddress(@Nullable Input<String> streetAddress) {
            this.streetAddress = streetAddress;
            return this;
        }

        public Builder setStreetAddress(@Nullable String streetAddress) {
            this.streetAddress = Input.ofNullable(streetAddress);
            return this;
        }
        public CertificateCertificateDescriptionSubjectDescriptionSubjectArgs build() {
            return new CertificateCertificateDescriptionSubjectDescriptionSubjectArgs(commonName, countryCode, locality, organization, organizationalUnit, postalCode, province, streetAddress);
        }
    }
}
