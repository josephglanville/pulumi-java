// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.oci.CertificatesManagement.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class GetCertificateAuthoritySubject {
    /**
     * @return Common name or fully-qualified domain name (RDN CN).
     * 
     */
    private final String commonName;
    /**
     * @return Country name (RDN C).
     * 
     */
    private final String country;
    /**
     * @return Distinguished name qualifier(RDN DNQ).
     * 
     */
    private final String distinguishedNameQualifier;
    /**
     * @return Domain component (RDN DC).
     * 
     */
    private final String domainComponent;
    /**
     * @return Personal generational qualifier (for example, Sr., Jr. 3rd, or IV).
     * 
     */
    private final String generationQualifier;
    /**
     * @return Personal given name (RDN G or GN).
     * 
     */
    private final String givenName;
    /**
     * @return Personal initials.
     * 
     */
    private final String initials;
    /**
     * @return Locality (RDN L).
     * 
     */
    private final String localityName;
    /**
     * @return Organization (RDN O).
     * 
     */
    private final String organization;
    /**
     * @return Organizational unit (RDN OU).
     * 
     */
    private final String organizationalUnit;
    /**
     * @return Subject pseudonym.
     * 
     */
    private final String pseudonym;
    /**
     * @return Unique subject identifier, which is not the same as the certificate serial number (RDN SERIALNUMBER).
     * 
     */
    private final String serialNumber;
    /**
     * @return State or province name (RDN ST or S).
     * 
     */
    private final String stateOrProvinceName;
    /**
     * @return Street address (RDN STREET).
     * 
     */
    private final String street;
    /**
     * @return Personal surname (RDN SN).
     * 
     */
    private final String surname;
    /**
     * @return Title (RDN T or TITLE).
     * 
     */
    private final String title;
    /**
     * @return User ID (RDN UID).
     * 
     */
    private final String userId;

    @CustomType.Constructor
    private GetCertificateAuthoritySubject(
        @CustomType.Parameter("commonName") String commonName,
        @CustomType.Parameter("country") String country,
        @CustomType.Parameter("distinguishedNameQualifier") String distinguishedNameQualifier,
        @CustomType.Parameter("domainComponent") String domainComponent,
        @CustomType.Parameter("generationQualifier") String generationQualifier,
        @CustomType.Parameter("givenName") String givenName,
        @CustomType.Parameter("initials") String initials,
        @CustomType.Parameter("localityName") String localityName,
        @CustomType.Parameter("organization") String organization,
        @CustomType.Parameter("organizationalUnit") String organizationalUnit,
        @CustomType.Parameter("pseudonym") String pseudonym,
        @CustomType.Parameter("serialNumber") String serialNumber,
        @CustomType.Parameter("stateOrProvinceName") String stateOrProvinceName,
        @CustomType.Parameter("street") String street,
        @CustomType.Parameter("surname") String surname,
        @CustomType.Parameter("title") String title,
        @CustomType.Parameter("userId") String userId) {
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
    public String commonName() {
        return this.commonName;
    }
    /**
     * @return Country name (RDN C).
     * 
     */
    public String country() {
        return this.country;
    }
    /**
     * @return Distinguished name qualifier(RDN DNQ).
     * 
     */
    public String distinguishedNameQualifier() {
        return this.distinguishedNameQualifier;
    }
    /**
     * @return Domain component (RDN DC).
     * 
     */
    public String domainComponent() {
        return this.domainComponent;
    }
    /**
     * @return Personal generational qualifier (for example, Sr., Jr. 3rd, or IV).
     * 
     */
    public String generationQualifier() {
        return this.generationQualifier;
    }
    /**
     * @return Personal given name (RDN G or GN).
     * 
     */
    public String givenName() {
        return this.givenName;
    }
    /**
     * @return Personal initials.
     * 
     */
    public String initials() {
        return this.initials;
    }
    /**
     * @return Locality (RDN L).
     * 
     */
    public String localityName() {
        return this.localityName;
    }
    /**
     * @return Organization (RDN O).
     * 
     */
    public String organization() {
        return this.organization;
    }
    /**
     * @return Organizational unit (RDN OU).
     * 
     */
    public String organizationalUnit() {
        return this.organizationalUnit;
    }
    /**
     * @return Subject pseudonym.
     * 
     */
    public String pseudonym() {
        return this.pseudonym;
    }
    /**
     * @return Unique subject identifier, which is not the same as the certificate serial number (RDN SERIALNUMBER).
     * 
     */
    public String serialNumber() {
        return this.serialNumber;
    }
    /**
     * @return State or province name (RDN ST or S).
     * 
     */
    public String stateOrProvinceName() {
        return this.stateOrProvinceName;
    }
    /**
     * @return Street address (RDN STREET).
     * 
     */
    public String street() {
        return this.street;
    }
    /**
     * @return Personal surname (RDN SN).
     * 
     */
    public String surname() {
        return this.surname;
    }
    /**
     * @return Title (RDN T or TITLE).
     * 
     */
    public String title() {
        return this.title;
    }
    /**
     * @return User ID (RDN UID).
     * 
     */
    public String userId() {
        return this.userId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetCertificateAuthoritySubject defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String commonName;
        private String country;
        private String distinguishedNameQualifier;
        private String domainComponent;
        private String generationQualifier;
        private String givenName;
        private String initials;
        private String localityName;
        private String organization;
        private String organizationalUnit;
        private String pseudonym;
        private String serialNumber;
        private String stateOrProvinceName;
        private String street;
        private String surname;
        private String title;
        private String userId;

        public Builder() {
    	      // Empty
        }

        public Builder(GetCertificateAuthoritySubject defaults) {
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

        public Builder commonName(String commonName) {
            this.commonName = Objects.requireNonNull(commonName);
            return this;
        }
        public Builder country(String country) {
            this.country = Objects.requireNonNull(country);
            return this;
        }
        public Builder distinguishedNameQualifier(String distinguishedNameQualifier) {
            this.distinguishedNameQualifier = Objects.requireNonNull(distinguishedNameQualifier);
            return this;
        }
        public Builder domainComponent(String domainComponent) {
            this.domainComponent = Objects.requireNonNull(domainComponent);
            return this;
        }
        public Builder generationQualifier(String generationQualifier) {
            this.generationQualifier = Objects.requireNonNull(generationQualifier);
            return this;
        }
        public Builder givenName(String givenName) {
            this.givenName = Objects.requireNonNull(givenName);
            return this;
        }
        public Builder initials(String initials) {
            this.initials = Objects.requireNonNull(initials);
            return this;
        }
        public Builder localityName(String localityName) {
            this.localityName = Objects.requireNonNull(localityName);
            return this;
        }
        public Builder organization(String organization) {
            this.organization = Objects.requireNonNull(organization);
            return this;
        }
        public Builder organizationalUnit(String organizationalUnit) {
            this.organizationalUnit = Objects.requireNonNull(organizationalUnit);
            return this;
        }
        public Builder pseudonym(String pseudonym) {
            this.pseudonym = Objects.requireNonNull(pseudonym);
            return this;
        }
        public Builder serialNumber(String serialNumber) {
            this.serialNumber = Objects.requireNonNull(serialNumber);
            return this;
        }
        public Builder stateOrProvinceName(String stateOrProvinceName) {
            this.stateOrProvinceName = Objects.requireNonNull(stateOrProvinceName);
            return this;
        }
        public Builder street(String street) {
            this.street = Objects.requireNonNull(street);
            return this;
        }
        public Builder surname(String surname) {
            this.surname = Objects.requireNonNull(surname);
            return this;
        }
        public Builder title(String title) {
            this.title = Objects.requireNonNull(title);
            return this;
        }
        public Builder userId(String userId) {
            this.userId = Objects.requireNonNull(userId);
            return this;
        }        public GetCertificateAuthoritySubject build() {
            return new GetCertificateAuthoritySubject(commonName, country, distinguishedNameQualifier, domainComponent, generationQualifier, givenName, initials, localityName, organization, organizationalUnit, pseudonym, serialNumber, stateOrProvinceName, street, surname, title, userId);
        }
    }
}
