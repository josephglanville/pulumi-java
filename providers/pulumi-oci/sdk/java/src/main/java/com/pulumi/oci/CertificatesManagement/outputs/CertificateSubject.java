// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.oci.CertificatesManagement.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class CertificateSubject {
    /**
     * @return Common name or fully-qualified domain name (RDN CN).
     * 
     */
    private final @Nullable String commonName;
    /**
     * @return Country name (RDN C).
     * 
     */
    private final @Nullable String country;
    /**
     * @return Distinguished name qualifier(RDN DNQ).
     * 
     */
    private final @Nullable String distinguishedNameQualifier;
    /**
     * @return Domain component (RDN DC).
     * 
     */
    private final @Nullable String domainComponent;
    /**
     * @return Personal generational qualifier (for example, Sr., Jr. 3rd, or IV).
     * 
     */
    private final @Nullable String generationQualifier;
    /**
     * @return Personal given name (RDN G or GN).
     * 
     */
    private final @Nullable String givenName;
    /**
     * @return Personal initials.
     * 
     */
    private final @Nullable String initials;
    /**
     * @return Locality (RDN L).
     * 
     */
    private final @Nullable String localityName;
    /**
     * @return Organization (RDN O).
     * 
     */
    private final @Nullable String organization;
    /**
     * @return Organizational unit (RDN OU).
     * 
     */
    private final @Nullable String organizationalUnit;
    /**
     * @return Subject pseudonym.
     * 
     */
    private final @Nullable String pseudonym;
    /**
     * @return Unique subject identifier, which is not the same as the certificate serial number (RDN SERIALNUMBER).
     * 
     */
    private final @Nullable String serialNumber;
    /**
     * @return State or province name (RDN ST or S).
     * 
     */
    private final @Nullable String stateOrProvinceName;
    /**
     * @return Street address (RDN STREET).
     * 
     */
    private final @Nullable String street;
    /**
     * @return Personal surname (RDN SN).
     * 
     */
    private final @Nullable String surname;
    /**
     * @return Title (RDN T or TITLE).
     * 
     */
    private final @Nullable String title;
    /**
     * @return User ID (RDN UID).
     * 
     */
    private final @Nullable String userId;

    @CustomType.Constructor
    private CertificateSubject(
        @CustomType.Parameter("commonName") @Nullable String commonName,
        @CustomType.Parameter("country") @Nullable String country,
        @CustomType.Parameter("distinguishedNameQualifier") @Nullable String distinguishedNameQualifier,
        @CustomType.Parameter("domainComponent") @Nullable String domainComponent,
        @CustomType.Parameter("generationQualifier") @Nullable String generationQualifier,
        @CustomType.Parameter("givenName") @Nullable String givenName,
        @CustomType.Parameter("initials") @Nullable String initials,
        @CustomType.Parameter("localityName") @Nullable String localityName,
        @CustomType.Parameter("organization") @Nullable String organization,
        @CustomType.Parameter("organizationalUnit") @Nullable String organizationalUnit,
        @CustomType.Parameter("pseudonym") @Nullable String pseudonym,
        @CustomType.Parameter("serialNumber") @Nullable String serialNumber,
        @CustomType.Parameter("stateOrProvinceName") @Nullable String stateOrProvinceName,
        @CustomType.Parameter("street") @Nullable String street,
        @CustomType.Parameter("surname") @Nullable String surname,
        @CustomType.Parameter("title") @Nullable String title,
        @CustomType.Parameter("userId") @Nullable String userId) {
        this.commonName = commonName;
        this.country = country;
        this.distinguishedNameQualifier = distinguishedNameQualifier;
        this.domainComponent = domainComponent;
        this.generationQualifier = generationQualifier;
        this.givenName = givenName;
        this.initials = initials;
        this.localityName = localityName;
        this.organization = organization;
        this.organizationalUnit = organizationalUnit;
        this.pseudonym = pseudonym;
        this.serialNumber = serialNumber;
        this.stateOrProvinceName = stateOrProvinceName;
        this.street = street;
        this.surname = surname;
        this.title = title;
        this.userId = userId;
    }

    /**
     * @return Common name or fully-qualified domain name (RDN CN).
     * 
     */
    public Optional<String> commonName() {
        return Optional.ofNullable(this.commonName);
    }
    /**
     * @return Country name (RDN C).
     * 
     */
    public Optional<String> country() {
        return Optional.ofNullable(this.country);
    }
    /**
     * @return Distinguished name qualifier(RDN DNQ).
     * 
     */
    public Optional<String> distinguishedNameQualifier() {
        return Optional.ofNullable(this.distinguishedNameQualifier);
    }
    /**
     * @return Domain component (RDN DC).
     * 
     */
    public Optional<String> domainComponent() {
        return Optional.ofNullable(this.domainComponent);
    }
    /**
     * @return Personal generational qualifier (for example, Sr., Jr. 3rd, or IV).
     * 
     */
    public Optional<String> generationQualifier() {
        return Optional.ofNullable(this.generationQualifier);
    }
    /**
     * @return Personal given name (RDN G or GN).
     * 
     */
    public Optional<String> givenName() {
        return Optional.ofNullable(this.givenName);
    }
    /**
     * @return Personal initials.
     * 
     */
    public Optional<String> initials() {
        return Optional.ofNullable(this.initials);
    }
    /**
     * @return Locality (RDN L).
     * 
     */
    public Optional<String> localityName() {
        return Optional.ofNullable(this.localityName);
    }
    /**
     * @return Organization (RDN O).
     * 
     */
    public Optional<String> organization() {
        return Optional.ofNullable(this.organization);
    }
    /**
     * @return Organizational unit (RDN OU).
     * 
     */
    public Optional<String> organizationalUnit() {
        return Optional.ofNullable(this.organizationalUnit);
    }
    /**
     * @return Subject pseudonym.
     * 
     */
    public Optional<String> pseudonym() {
        return Optional.ofNullable(this.pseudonym);
    }
    /**
     * @return Unique subject identifier, which is not the same as the certificate serial number (RDN SERIALNUMBER).
     * 
     */
    public Optional<String> serialNumber() {
        return Optional.ofNullable(this.serialNumber);
    }
    /**
     * @return State or province name (RDN ST or S).
     * 
     */
    public Optional<String> stateOrProvinceName() {
        return Optional.ofNullable(this.stateOrProvinceName);
    }
    /**
     * @return Street address (RDN STREET).
     * 
     */
    public Optional<String> street() {
        return Optional.ofNullable(this.street);
    }
    /**
     * @return Personal surname (RDN SN).
     * 
     */
    public Optional<String> surname() {
        return Optional.ofNullable(this.surname);
    }
    /**
     * @return Title (RDN T or TITLE).
     * 
     */
    public Optional<String> title() {
        return Optional.ofNullable(this.title);
    }
    /**
     * @return User ID (RDN UID).
     * 
     */
    public Optional<String> userId() {
        return Optional.ofNullable(this.userId);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(CertificateSubject defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String commonName;
        private @Nullable String country;
        private @Nullable String distinguishedNameQualifier;
        private @Nullable String domainComponent;
        private @Nullable String generationQualifier;
        private @Nullable String givenName;
        private @Nullable String initials;
        private @Nullable String localityName;
        private @Nullable String organization;
        private @Nullable String organizationalUnit;
        private @Nullable String pseudonym;
        private @Nullable String serialNumber;
        private @Nullable String stateOrProvinceName;
        private @Nullable String street;
        private @Nullable String surname;
        private @Nullable String title;
        private @Nullable String userId;

        public Builder() {
    	      // Empty
        }

        public Builder(CertificateSubject defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.commonName = defaults.commonName;
    	      this.country = defaults.country;
    	      this.distinguishedNameQualifier = defaults.distinguishedNameQualifier;
    	      this.domainComponent = defaults.domainComponent;
    	      this.generationQualifier = defaults.generationQualifier;
    	      this.givenName = defaults.givenName;
    	      this.initials = defaults.initials;
    	      this.localityName = defaults.localityName;
    	      this.organization = defaults.organization;
    	      this.organizationalUnit = defaults.organizationalUnit;
    	      this.pseudonym = defaults.pseudonym;
    	      this.serialNumber = defaults.serialNumber;
    	      this.stateOrProvinceName = defaults.stateOrProvinceName;
    	      this.street = defaults.street;
    	      this.surname = defaults.surname;
    	      this.title = defaults.title;
    	      this.userId = defaults.userId;
        }

        public Builder commonName(@Nullable String commonName) {
            this.commonName = commonName;
            return this;
        }
        public Builder country(@Nullable String country) {
            this.country = country;
            return this;
        }
        public Builder distinguishedNameQualifier(@Nullable String distinguishedNameQualifier) {
            this.distinguishedNameQualifier = distinguishedNameQualifier;
            return this;
        }
        public Builder domainComponent(@Nullable String domainComponent) {
            this.domainComponent = domainComponent;
            return this;
        }
        public Builder generationQualifier(@Nullable String generationQualifier) {
            this.generationQualifier = generationQualifier;
            return this;
        }
        public Builder givenName(@Nullable String givenName) {
            this.givenName = givenName;
            return this;
        }
        public Builder initials(@Nullable String initials) {
            this.initials = initials;
            return this;
        }
        public Builder localityName(@Nullable String localityName) {
            this.localityName = localityName;
            return this;
        }
        public Builder organization(@Nullable String organization) {
            this.organization = organization;
            return this;
        }
        public Builder organizationalUnit(@Nullable String organizationalUnit) {
            this.organizationalUnit = organizationalUnit;
            return this;
        }
        public Builder pseudonym(@Nullable String pseudonym) {
            this.pseudonym = pseudonym;
            return this;
        }
        public Builder serialNumber(@Nullable String serialNumber) {
            this.serialNumber = serialNumber;
            return this;
        }
        public Builder stateOrProvinceName(@Nullable String stateOrProvinceName) {
            this.stateOrProvinceName = stateOrProvinceName;
            return this;
        }
        public Builder street(@Nullable String street) {
            this.street = street;
            return this;
        }
        public Builder surname(@Nullable String surname) {
            this.surname = surname;
            return this;
        }
        public Builder title(@Nullable String title) {
            this.title = title;
            return this;
        }
        public Builder userId(@Nullable String userId) {
            this.userId = userId;
            return this;
        }        public CertificateSubject build() {
            return new CertificateSubject(commonName, country, distinguishedNameQualifier, domainComponent, generationQualifier, givenName, initials, localityName, organization, organizationalUnit, pseudonym, serialNumber, stateOrProvinceName, street, surname, title, userId);
        }
    }
}
