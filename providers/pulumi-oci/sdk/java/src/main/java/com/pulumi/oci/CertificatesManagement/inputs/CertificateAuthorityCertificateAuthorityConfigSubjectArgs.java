// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.oci.CertificatesManagement.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class CertificateAuthorityCertificateAuthorityConfigSubjectArgs extends com.pulumi.resources.ResourceArgs {

    public static final CertificateAuthorityCertificateAuthorityConfigSubjectArgs Empty = new CertificateAuthorityCertificateAuthorityConfigSubjectArgs();

    /**
     * Common name or fully-qualified domain name (RDN CN).
     * 
     */
    @Import(name="commonName", required=true)
    private Output<String> commonName;

    /**
     * @return Common name or fully-qualified domain name (RDN CN).
     * 
     */
    public Output<String> commonName() {
        return this.commonName;
    }

    /**
     * Country name (RDN C).
     * 
     */
    @Import(name="country")
    private @Nullable Output<String> country;

    /**
     * @return Country name (RDN C).
     * 
     */
    public Optional<Output<String>> country() {
        return Optional.ofNullable(this.country);
    }

    /**
     * Distinguished name qualifier(RDN DNQ).
     * 
     */
    @Import(name="distinguishedNameQualifier")
    private @Nullable Output<String> distinguishedNameQualifier;

    /**
     * @return Distinguished name qualifier(RDN DNQ).
     * 
     */
    public Optional<Output<String>> distinguishedNameQualifier() {
        return Optional.ofNullable(this.distinguishedNameQualifier);
    }

    /**
     * Domain component (RDN DC).
     * 
     */
    @Import(name="domainComponent")
    private @Nullable Output<String> domainComponent;

    /**
     * @return Domain component (RDN DC).
     * 
     */
    public Optional<Output<String>> domainComponent() {
        return Optional.ofNullable(this.domainComponent);
    }

    /**
     * Personal generational qualifier (for example, Sr., Jr. 3rd, or IV).
     * 
     */
    @Import(name="generationQualifier")
    private @Nullable Output<String> generationQualifier;

    /**
     * @return Personal generational qualifier (for example, Sr., Jr. 3rd, or IV).
     * 
     */
    public Optional<Output<String>> generationQualifier() {
        return Optional.ofNullable(this.generationQualifier);
    }

    /**
     * Personal given name (RDN G or GN).
     * 
     */
    @Import(name="givenName")
    private @Nullable Output<String> givenName;

    /**
     * @return Personal given name (RDN G or GN).
     * 
     */
    public Optional<Output<String>> givenName() {
        return Optional.ofNullable(this.givenName);
    }

    /**
     * Personal initials.
     * 
     */
    @Import(name="initials")
    private @Nullable Output<String> initials;

    /**
     * @return Personal initials.
     * 
     */
    public Optional<Output<String>> initials() {
        return Optional.ofNullable(this.initials);
    }

    /**
     * Locality (RDN L).
     * 
     */
    @Import(name="localityName")
    private @Nullable Output<String> localityName;

    /**
     * @return Locality (RDN L).
     * 
     */
    public Optional<Output<String>> localityName() {
        return Optional.ofNullable(this.localityName);
    }

    /**
     * Organization (RDN O).
     * 
     */
    @Import(name="organization")
    private @Nullable Output<String> organization;

    /**
     * @return Organization (RDN O).
     * 
     */
    public Optional<Output<String>> organization() {
        return Optional.ofNullable(this.organization);
    }

    /**
     * Organizational unit (RDN OU).
     * 
     */
    @Import(name="organizationalUnit")
    private @Nullable Output<String> organizationalUnit;

    /**
     * @return Organizational unit (RDN OU).
     * 
     */
    public Optional<Output<String>> organizationalUnit() {
        return Optional.ofNullable(this.organizationalUnit);
    }

    /**
     * Subject pseudonym.
     * 
     */
    @Import(name="pseudonym")
    private @Nullable Output<String> pseudonym;

    /**
     * @return Subject pseudonym.
     * 
     */
    public Optional<Output<String>> pseudonym() {
        return Optional.ofNullable(this.pseudonym);
    }

    /**
     * Unique subject identifier, which is not the same as the certificate serial number (RDN SERIALNUMBER).
     * 
     */
    @Import(name="serialNumber")
    private @Nullable Output<String> serialNumber;

    /**
     * @return Unique subject identifier, which is not the same as the certificate serial number (RDN SERIALNUMBER).
     * 
     */
    public Optional<Output<String>> serialNumber() {
        return Optional.ofNullable(this.serialNumber);
    }

    /**
     * State or province name (RDN ST or S).
     * 
     */
    @Import(name="stateOrProvinceName")
    private @Nullable Output<String> stateOrProvinceName;

    /**
     * @return State or province name (RDN ST or S).
     * 
     */
    public Optional<Output<String>> stateOrProvinceName() {
        return Optional.ofNullable(this.stateOrProvinceName);
    }

    /**
     * Street address (RDN STREET).
     * 
     */
    @Import(name="street")
    private @Nullable Output<String> street;

    /**
     * @return Street address (RDN STREET).
     * 
     */
    public Optional<Output<String>> street() {
        return Optional.ofNullable(this.street);
    }

    /**
     * Personal surname (RDN SN).
     * 
     */
    @Import(name="surname")
    private @Nullable Output<String> surname;

    /**
     * @return Personal surname (RDN SN).
     * 
     */
    public Optional<Output<String>> surname() {
        return Optional.ofNullable(this.surname);
    }

    /**
     * Title (RDN T or TITLE).
     * 
     */
    @Import(name="title")
    private @Nullable Output<String> title;

    /**
     * @return Title (RDN T or TITLE).
     * 
     */
    public Optional<Output<String>> title() {
        return Optional.ofNullable(this.title);
    }

    /**
     * User ID (RDN UID).
     * 
     */
    @Import(name="userId")
    private @Nullable Output<String> userId;

    /**
     * @return User ID (RDN UID).
     * 
     */
    public Optional<Output<String>> userId() {
        return Optional.ofNullable(this.userId);
    }

    private CertificateAuthorityCertificateAuthorityConfigSubjectArgs() {}

    private CertificateAuthorityCertificateAuthorityConfigSubjectArgs(CertificateAuthorityCertificateAuthorityConfigSubjectArgs $) {
        this.commonName = $.commonName;
        this.country = $.country;
        this.distinguishedNameQualifier = $.distinguishedNameQualifier;
        this.domainComponent = $.domainComponent;
        this.generationQualifier = $.generationQualifier;
        this.givenName = $.givenName;
        this.initials = $.initials;
        this.localityName = $.localityName;
        this.organization = $.organization;
        this.organizationalUnit = $.organizationalUnit;
        this.pseudonym = $.pseudonym;
        this.serialNumber = $.serialNumber;
        this.stateOrProvinceName = $.stateOrProvinceName;
        this.street = $.street;
        this.surname = $.surname;
        this.title = $.title;
        this.userId = $.userId;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(CertificateAuthorityCertificateAuthorityConfigSubjectArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private CertificateAuthorityCertificateAuthorityConfigSubjectArgs $;

        public Builder() {
            $ = new CertificateAuthorityCertificateAuthorityConfigSubjectArgs();
        }

        public Builder(CertificateAuthorityCertificateAuthorityConfigSubjectArgs defaults) {
            $ = new CertificateAuthorityCertificateAuthorityConfigSubjectArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param commonName Common name or fully-qualified domain name (RDN CN).
         * 
         * @return builder
         * 
         */
        public Builder commonName(Output<String> commonName) {
            $.commonName = commonName;
            return this;
        }

        /**
         * @param commonName Common name or fully-qualified domain name (RDN CN).
         * 
         * @return builder
         * 
         */
        public Builder commonName(String commonName) {
            return commonName(Output.of(commonName));
        }

        /**
         * @param country Country name (RDN C).
         * 
         * @return builder
         * 
         */
        public Builder country(@Nullable Output<String> country) {
            $.country = country;
            return this;
        }

        /**
         * @param country Country name (RDN C).
         * 
         * @return builder
         * 
         */
        public Builder country(String country) {
            return country(Output.of(country));
        }

        /**
         * @param distinguishedNameQualifier Distinguished name qualifier(RDN DNQ).
         * 
         * @return builder
         * 
         */
        public Builder distinguishedNameQualifier(@Nullable Output<String> distinguishedNameQualifier) {
            $.distinguishedNameQualifier = distinguishedNameQualifier;
            return this;
        }

        /**
         * @param distinguishedNameQualifier Distinguished name qualifier(RDN DNQ).
         * 
         * @return builder
         * 
         */
        public Builder distinguishedNameQualifier(String distinguishedNameQualifier) {
            return distinguishedNameQualifier(Output.of(distinguishedNameQualifier));
        }

        /**
         * @param domainComponent Domain component (RDN DC).
         * 
         * @return builder
         * 
         */
        public Builder domainComponent(@Nullable Output<String> domainComponent) {
            $.domainComponent = domainComponent;
            return this;
        }

        /**
         * @param domainComponent Domain component (RDN DC).
         * 
         * @return builder
         * 
         */
        public Builder domainComponent(String domainComponent) {
            return domainComponent(Output.of(domainComponent));
        }

        /**
         * @param generationQualifier Personal generational qualifier (for example, Sr., Jr. 3rd, or IV).
         * 
         * @return builder
         * 
         */
        public Builder generationQualifier(@Nullable Output<String> generationQualifier) {
            $.generationQualifier = generationQualifier;
            return this;
        }

        /**
         * @param generationQualifier Personal generational qualifier (for example, Sr., Jr. 3rd, or IV).
         * 
         * @return builder
         * 
         */
        public Builder generationQualifier(String generationQualifier) {
            return generationQualifier(Output.of(generationQualifier));
        }

        /**
         * @param givenName Personal given name (RDN G or GN).
         * 
         * @return builder
         * 
         */
        public Builder givenName(@Nullable Output<String> givenName) {
            $.givenName = givenName;
            return this;
        }

        /**
         * @param givenName Personal given name (RDN G or GN).
         * 
         * @return builder
         * 
         */
        public Builder givenName(String givenName) {
            return givenName(Output.of(givenName));
        }

        /**
         * @param initials Personal initials.
         * 
         * @return builder
         * 
         */
        public Builder initials(@Nullable Output<String> initials) {
            $.initials = initials;
            return this;
        }

        /**
         * @param initials Personal initials.
         * 
         * @return builder
         * 
         */
        public Builder initials(String initials) {
            return initials(Output.of(initials));
        }

        /**
         * @param localityName Locality (RDN L).
         * 
         * @return builder
         * 
         */
        public Builder localityName(@Nullable Output<String> localityName) {
            $.localityName = localityName;
            return this;
        }

        /**
         * @param localityName Locality (RDN L).
         * 
         * @return builder
         * 
         */
        public Builder localityName(String localityName) {
            return localityName(Output.of(localityName));
        }

        /**
         * @param organization Organization (RDN O).
         * 
         * @return builder
         * 
         */
        public Builder organization(@Nullable Output<String> organization) {
            $.organization = organization;
            return this;
        }

        /**
         * @param organization Organization (RDN O).
         * 
         * @return builder
         * 
         */
        public Builder organization(String organization) {
            return organization(Output.of(organization));
        }

        /**
         * @param organizationalUnit Organizational unit (RDN OU).
         * 
         * @return builder
         * 
         */
        public Builder organizationalUnit(@Nullable Output<String> organizationalUnit) {
            $.organizationalUnit = organizationalUnit;
            return this;
        }

        /**
         * @param organizationalUnit Organizational unit (RDN OU).
         * 
         * @return builder
         * 
         */
        public Builder organizationalUnit(String organizationalUnit) {
            return organizationalUnit(Output.of(organizationalUnit));
        }

        /**
         * @param pseudonym Subject pseudonym.
         * 
         * @return builder
         * 
         */
        public Builder pseudonym(@Nullable Output<String> pseudonym) {
            $.pseudonym = pseudonym;
            return this;
        }

        /**
         * @param pseudonym Subject pseudonym.
         * 
         * @return builder
         * 
         */
        public Builder pseudonym(String pseudonym) {
            return pseudonym(Output.of(pseudonym));
        }

        /**
         * @param serialNumber Unique subject identifier, which is not the same as the certificate serial number (RDN SERIALNUMBER).
         * 
         * @return builder
         * 
         */
        public Builder serialNumber(@Nullable Output<String> serialNumber) {
            $.serialNumber = serialNumber;
            return this;
        }

        /**
         * @param serialNumber Unique subject identifier, which is not the same as the certificate serial number (RDN SERIALNUMBER).
         * 
         * @return builder
         * 
         */
        public Builder serialNumber(String serialNumber) {
            return serialNumber(Output.of(serialNumber));
        }

        /**
         * @param stateOrProvinceName State or province name (RDN ST or S).
         * 
         * @return builder
         * 
         */
        public Builder stateOrProvinceName(@Nullable Output<String> stateOrProvinceName) {
            $.stateOrProvinceName = stateOrProvinceName;
            return this;
        }

        /**
         * @param stateOrProvinceName State or province name (RDN ST or S).
         * 
         * @return builder
         * 
         */
        public Builder stateOrProvinceName(String stateOrProvinceName) {
            return stateOrProvinceName(Output.of(stateOrProvinceName));
        }

        /**
         * @param street Street address (RDN STREET).
         * 
         * @return builder
         * 
         */
        public Builder street(@Nullable Output<String> street) {
            $.street = street;
            return this;
        }

        /**
         * @param street Street address (RDN STREET).
         * 
         * @return builder
         * 
         */
        public Builder street(String street) {
            return street(Output.of(street));
        }

        /**
         * @param surname Personal surname (RDN SN).
         * 
         * @return builder
         * 
         */
        public Builder surname(@Nullable Output<String> surname) {
            $.surname = surname;
            return this;
        }

        /**
         * @param surname Personal surname (RDN SN).
         * 
         * @return builder
         * 
         */
        public Builder surname(String surname) {
            return surname(Output.of(surname));
        }

        /**
         * @param title Title (RDN T or TITLE).
         * 
         * @return builder
         * 
         */
        public Builder title(@Nullable Output<String> title) {
            $.title = title;
            return this;
        }

        /**
         * @param title Title (RDN T or TITLE).
         * 
         * @return builder
         * 
         */
        public Builder title(String title) {
            return title(Output.of(title));
        }

        /**
         * @param userId User ID (RDN UID).
         * 
         * @return builder
         * 
         */
        public Builder userId(@Nullable Output<String> userId) {
            $.userId = userId;
            return this;
        }

        /**
         * @param userId User ID (RDN UID).
         * 
         * @return builder
         * 
         */
        public Builder userId(String userId) {
            return userId(Output.of(userId));
        }

        public CertificateAuthorityCertificateAuthorityConfigSubjectArgs build() {
            $.commonName = Objects.requireNonNull($.commonName, "expected parameter 'commonName' to be non-null");
            return $;
        }
    }

}
