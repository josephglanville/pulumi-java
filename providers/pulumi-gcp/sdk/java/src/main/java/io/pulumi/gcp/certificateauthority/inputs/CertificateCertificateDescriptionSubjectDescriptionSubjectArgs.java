// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.certificateauthority.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class CertificateCertificateDescriptionSubjectDescriptionSubjectArgs extends io.pulumi.resources.ResourceArgs {

    public static final CertificateCertificateDescriptionSubjectDescriptionSubjectArgs Empty = new CertificateCertificateDescriptionSubjectDescriptionSubjectArgs();

    /**
     * The common name of the distinguished name.
     * 
     */
    @Import(name="commonName")
      private final @Nullable Output<String> commonName;

    public Output<String> getCommonName() {
        return this.commonName == null ? Output.empty() : this.commonName;
    }

    /**
     * The country code of the subject.
     * 
     */
    @Import(name="countryCode")
      private final @Nullable Output<String> countryCode;

    public Output<String> getCountryCode() {
        return this.countryCode == null ? Output.empty() : this.countryCode;
    }

    /**
     * The locality or city of the subject.
     * 
     */
    @Import(name="locality")
      private final @Nullable Output<String> locality;

    public Output<String> getLocality() {
        return this.locality == null ? Output.empty() : this.locality;
    }

    /**
     * The organization of the subject.
     * 
     */
    @Import(name="organization")
      private final @Nullable Output<String> organization;

    public Output<String> getOrganization() {
        return this.organization == null ? Output.empty() : this.organization;
    }

    /**
     * The organizational unit of the subject.
     * 
     */
    @Import(name="organizationalUnit")
      private final @Nullable Output<String> organizationalUnit;

    public Output<String> getOrganizationalUnit() {
        return this.organizationalUnit == null ? Output.empty() : this.organizationalUnit;
    }

    /**
     * The postal code of the subject.
     * 
     */
    @Import(name="postalCode")
      private final @Nullable Output<String> postalCode;

    public Output<String> getPostalCode() {
        return this.postalCode == null ? Output.empty() : this.postalCode;
    }

    /**
     * The province, territory, or regional state of the subject.
     * 
     */
    @Import(name="province")
      private final @Nullable Output<String> province;

    public Output<String> getProvince() {
        return this.province == null ? Output.empty() : this.province;
    }

    /**
     * The street address of the subject.
     * 
     */
    @Import(name="streetAddress")
      private final @Nullable Output<String> streetAddress;

    public Output<String> getStreetAddress() {
        return this.streetAddress == null ? Output.empty() : this.streetAddress;
    }

    public CertificateCertificateDescriptionSubjectDescriptionSubjectArgs(
        @Nullable Output<String> commonName,
        @Nullable Output<String> countryCode,
        @Nullable Output<String> locality,
        @Nullable Output<String> organization,
        @Nullable Output<String> organizationalUnit,
        @Nullable Output<String> postalCode,
        @Nullable Output<String> province,
        @Nullable Output<String> streetAddress) {
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
        this.commonName = Output.empty();
        this.countryCode = Output.empty();
        this.locality = Output.empty();
        this.organization = Output.empty();
        this.organizationalUnit = Output.empty();
        this.postalCode = Output.empty();
        this.province = Output.empty();
        this.streetAddress = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(CertificateCertificateDescriptionSubjectDescriptionSubjectArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<String> commonName;
        private @Nullable Output<String> countryCode;
        private @Nullable Output<String> locality;
        private @Nullable Output<String> organization;
        private @Nullable Output<String> organizationalUnit;
        private @Nullable Output<String> postalCode;
        private @Nullable Output<String> province;
        private @Nullable Output<String> streetAddress;

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

        public Builder commonName(@Nullable Output<String> commonName) {
            this.commonName = commonName;
            return this;
        }
        public Builder commonName(@Nullable String commonName) {
            this.commonName = Output.ofNullable(commonName);
            return this;
        }
        public Builder countryCode(@Nullable Output<String> countryCode) {
            this.countryCode = countryCode;
            return this;
        }
        public Builder countryCode(@Nullable String countryCode) {
            this.countryCode = Output.ofNullable(countryCode);
            return this;
        }
        public Builder locality(@Nullable Output<String> locality) {
            this.locality = locality;
            return this;
        }
        public Builder locality(@Nullable String locality) {
            this.locality = Output.ofNullable(locality);
            return this;
        }
        public Builder organization(@Nullable Output<String> organization) {
            this.organization = organization;
            return this;
        }
        public Builder organization(@Nullable String organization) {
            this.organization = Output.ofNullable(organization);
            return this;
        }
        public Builder organizationalUnit(@Nullable Output<String> organizationalUnit) {
            this.organizationalUnit = organizationalUnit;
            return this;
        }
        public Builder organizationalUnit(@Nullable String organizationalUnit) {
            this.organizationalUnit = Output.ofNullable(organizationalUnit);
            return this;
        }
        public Builder postalCode(@Nullable Output<String> postalCode) {
            this.postalCode = postalCode;
            return this;
        }
        public Builder postalCode(@Nullable String postalCode) {
            this.postalCode = Output.ofNullable(postalCode);
            return this;
        }
        public Builder province(@Nullable Output<String> province) {
            this.province = province;
            return this;
        }
        public Builder province(@Nullable String province) {
            this.province = Output.ofNullable(province);
            return this;
        }
        public Builder streetAddress(@Nullable Output<String> streetAddress) {
            this.streetAddress = streetAddress;
            return this;
        }
        public Builder streetAddress(@Nullable String streetAddress) {
            this.streetAddress = Output.ofNullable(streetAddress);
            return this;
        }        public CertificateCertificateDescriptionSubjectDescriptionSubjectArgs build() {
            return new CertificateCertificateDescriptionSubjectDescriptionSubjectArgs(commonName, countryCode, locality, organization, organizationalUnit, postalCode, province, streetAddress);
        }
    }
}
