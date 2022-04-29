// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.oci.CertificatesManagement.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.oci.CertificatesManagement.inputs.CertificateCurrentVersionRevocationStatusArgs;
import com.pulumi.oci.CertificatesManagement.inputs.CertificateCurrentVersionSubjectAlternativeNameArgs;
import com.pulumi.oci.CertificatesManagement.inputs.CertificateCurrentVersionValidityArgs;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class CertificateCurrentVersionArgs extends com.pulumi.resources.ResourceArgs {

    public static final CertificateCurrentVersionArgs Empty = new CertificateCurrentVersionArgs();

    /**
     * The OCID of the certificate.
     * 
     */
    @Import(name="certificateId")
    private @Nullable Output<String> certificateId;

    /**
     * @return The OCID of the certificate.
     * 
     */
    public Optional<Output<String>> certificateId() {
        return Optional.ofNullable(this.certificateId);
    }

    /**
     * The version number of the issuing certificate authority (CA).
     * 
     */
    @Import(name="issuerCaVersionNumber")
    private @Nullable Output<String> issuerCaVersionNumber;

    /**
     * @return The version number of the issuing certificate authority (CA).
     * 
     */
    public Optional<Output<String>> issuerCaVersionNumber() {
        return Optional.ofNullable(this.issuerCaVersionNumber);
    }

    /**
     * The current revocation status of the entity.
     * 
     */
    @Import(name="revocationStatuses")
    private @Nullable Output<List<CertificateCurrentVersionRevocationStatusArgs>> revocationStatuses;

    /**
     * @return The current revocation status of the entity.
     * 
     */
    public Optional<Output<List<CertificateCurrentVersionRevocationStatusArgs>>> revocationStatuses() {
        return Optional.ofNullable(this.revocationStatuses);
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
     * A list of rotation states for this certificate version.
     * 
     */
    @Import(name="stages")
    private @Nullable Output<List<String>> stages;

    /**
     * @return A list of rotation states for this certificate version.
     * 
     */
    public Optional<Output<List<String>>> stages() {
        return Optional.ofNullable(this.stages);
    }

    /**
     * A list of subject alternative names.
     * 
     */
    @Import(name="subjectAlternativeNames")
    private @Nullable Output<List<CertificateCurrentVersionSubjectAlternativeNameArgs>> subjectAlternativeNames;

    /**
     * @return A list of subject alternative names.
     * 
     */
    public Optional<Output<List<CertificateCurrentVersionSubjectAlternativeNameArgs>>> subjectAlternativeNames() {
        return Optional.ofNullable(this.subjectAlternativeNames);
    }

    /**
     * A property indicating when the certificate was created, expressed in [RFC 3339](https://tools.ietf.org/html/rfc3339) timestamp format. Example: `2019-04-03T21:10:29.600Z`
     * 
     */
    @Import(name="timeCreated")
    private @Nullable Output<String> timeCreated;

    /**
     * @return A property indicating when the certificate was created, expressed in [RFC 3339](https://tools.ietf.org/html/rfc3339) timestamp format. Example: `2019-04-03T21:10:29.600Z`
     * 
     */
    public Optional<Output<String>> timeCreated() {
        return Optional.ofNullable(this.timeCreated);
    }

    /**
     * An optional property indicating when to delete the certificate version, expressed in [RFC 3339](https://tools.ietf.org/html/rfc3339) timestamp format. Example: `2019-04-03T21:10:29.600Z`
     * 
     */
    @Import(name="timeOfDeletion")
    private @Nullable Output<String> timeOfDeletion;

    /**
     * @return An optional property indicating when to delete the certificate version, expressed in [RFC 3339](https://tools.ietf.org/html/rfc3339) timestamp format. Example: `2019-04-03T21:10:29.600Z`
     * 
     */
    public Optional<Output<String>> timeOfDeletion() {
        return Optional.ofNullable(this.timeOfDeletion);
    }

    /**
     * (Updatable) An object that describes a period of time during which an entity is valid. If this is not provided when you create a certificate, the validity of the issuing CA is used.
     * 
     */
    @Import(name="validities")
    private @Nullable Output<List<CertificateCurrentVersionValidityArgs>> validities;

    /**
     * @return (Updatable) An object that describes a period of time during which an entity is valid. If this is not provided when you create a certificate, the validity of the issuing CA is used.
     * 
     */
    public Optional<Output<List<CertificateCurrentVersionValidityArgs>>> validities() {
        return Optional.ofNullable(this.validities);
    }

    /**
     * (Updatable) A name for the certificate. When the value is not null, a name is unique across versions of a given certificate.
     * 
     */
    @Import(name="versionName")
    private @Nullable Output<String> versionName;

    /**
     * @return (Updatable) A name for the certificate. When the value is not null, a name is unique across versions of a given certificate.
     * 
     */
    public Optional<Output<String>> versionName() {
        return Optional.ofNullable(this.versionName);
    }

    /**
     * The version number of the certificate.
     * 
     */
    @Import(name="versionNumber")
    private @Nullable Output<String> versionNumber;

    /**
     * @return The version number of the certificate.
     * 
     */
    public Optional<Output<String>> versionNumber() {
        return Optional.ofNullable(this.versionNumber);
    }

    private CertificateCurrentVersionArgs() {}

    private CertificateCurrentVersionArgs(CertificateCurrentVersionArgs $) {
        this.certificateId = $.certificateId;
        this.issuerCaVersionNumber = $.issuerCaVersionNumber;
        this.revocationStatuses = $.revocationStatuses;
        this.serialNumber = $.serialNumber;
        this.stages = $.stages;
        this.subjectAlternativeNames = $.subjectAlternativeNames;
        this.timeCreated = $.timeCreated;
        this.timeOfDeletion = $.timeOfDeletion;
        this.validities = $.validities;
        this.versionName = $.versionName;
        this.versionNumber = $.versionNumber;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(CertificateCurrentVersionArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private CertificateCurrentVersionArgs $;

        public Builder() {
            $ = new CertificateCurrentVersionArgs();
        }

        public Builder(CertificateCurrentVersionArgs defaults) {
            $ = new CertificateCurrentVersionArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param certificateId The OCID of the certificate.
         * 
         * @return builder
         * 
         */
        public Builder certificateId(@Nullable Output<String> certificateId) {
            $.certificateId = certificateId;
            return this;
        }

        /**
         * @param certificateId The OCID of the certificate.
         * 
         * @return builder
         * 
         */
        public Builder certificateId(String certificateId) {
            return certificateId(Output.of(certificateId));
        }

        /**
         * @param issuerCaVersionNumber The version number of the issuing certificate authority (CA).
         * 
         * @return builder
         * 
         */
        public Builder issuerCaVersionNumber(@Nullable Output<String> issuerCaVersionNumber) {
            $.issuerCaVersionNumber = issuerCaVersionNumber;
            return this;
        }

        /**
         * @param issuerCaVersionNumber The version number of the issuing certificate authority (CA).
         * 
         * @return builder
         * 
         */
        public Builder issuerCaVersionNumber(String issuerCaVersionNumber) {
            return issuerCaVersionNumber(Output.of(issuerCaVersionNumber));
        }

        /**
         * @param revocationStatuses The current revocation status of the entity.
         * 
         * @return builder
         * 
         */
        public Builder revocationStatuses(@Nullable Output<List<CertificateCurrentVersionRevocationStatusArgs>> revocationStatuses) {
            $.revocationStatuses = revocationStatuses;
            return this;
        }

        /**
         * @param revocationStatuses The current revocation status of the entity.
         * 
         * @return builder
         * 
         */
        public Builder revocationStatuses(List<CertificateCurrentVersionRevocationStatusArgs> revocationStatuses) {
            return revocationStatuses(Output.of(revocationStatuses));
        }

        /**
         * @param revocationStatuses The current revocation status of the entity.
         * 
         * @return builder
         * 
         */
        public Builder revocationStatuses(CertificateCurrentVersionRevocationStatusArgs... revocationStatuses) {
            return revocationStatuses(List.of(revocationStatuses));
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
         * @param stages A list of rotation states for this certificate version.
         * 
         * @return builder
         * 
         */
        public Builder stages(@Nullable Output<List<String>> stages) {
            $.stages = stages;
            return this;
        }

        /**
         * @param stages A list of rotation states for this certificate version.
         * 
         * @return builder
         * 
         */
        public Builder stages(List<String> stages) {
            return stages(Output.of(stages));
        }

        /**
         * @param stages A list of rotation states for this certificate version.
         * 
         * @return builder
         * 
         */
        public Builder stages(String... stages) {
            return stages(List.of(stages));
        }

        /**
         * @param subjectAlternativeNames A list of subject alternative names.
         * 
         * @return builder
         * 
         */
        public Builder subjectAlternativeNames(@Nullable Output<List<CertificateCurrentVersionSubjectAlternativeNameArgs>> subjectAlternativeNames) {
            $.subjectAlternativeNames = subjectAlternativeNames;
            return this;
        }

        /**
         * @param subjectAlternativeNames A list of subject alternative names.
         * 
         * @return builder
         * 
         */
        public Builder subjectAlternativeNames(List<CertificateCurrentVersionSubjectAlternativeNameArgs> subjectAlternativeNames) {
            return subjectAlternativeNames(Output.of(subjectAlternativeNames));
        }

        /**
         * @param subjectAlternativeNames A list of subject alternative names.
         * 
         * @return builder
         * 
         */
        public Builder subjectAlternativeNames(CertificateCurrentVersionSubjectAlternativeNameArgs... subjectAlternativeNames) {
            return subjectAlternativeNames(List.of(subjectAlternativeNames));
        }

        /**
         * @param timeCreated A property indicating when the certificate was created, expressed in [RFC 3339](https://tools.ietf.org/html/rfc3339) timestamp format. Example: `2019-04-03T21:10:29.600Z`
         * 
         * @return builder
         * 
         */
        public Builder timeCreated(@Nullable Output<String> timeCreated) {
            $.timeCreated = timeCreated;
            return this;
        }

        /**
         * @param timeCreated A property indicating when the certificate was created, expressed in [RFC 3339](https://tools.ietf.org/html/rfc3339) timestamp format. Example: `2019-04-03T21:10:29.600Z`
         * 
         * @return builder
         * 
         */
        public Builder timeCreated(String timeCreated) {
            return timeCreated(Output.of(timeCreated));
        }

        /**
         * @param timeOfDeletion An optional property indicating when to delete the certificate version, expressed in [RFC 3339](https://tools.ietf.org/html/rfc3339) timestamp format. Example: `2019-04-03T21:10:29.600Z`
         * 
         * @return builder
         * 
         */
        public Builder timeOfDeletion(@Nullable Output<String> timeOfDeletion) {
            $.timeOfDeletion = timeOfDeletion;
            return this;
        }

        /**
         * @param timeOfDeletion An optional property indicating when to delete the certificate version, expressed in [RFC 3339](https://tools.ietf.org/html/rfc3339) timestamp format. Example: `2019-04-03T21:10:29.600Z`
         * 
         * @return builder
         * 
         */
        public Builder timeOfDeletion(String timeOfDeletion) {
            return timeOfDeletion(Output.of(timeOfDeletion));
        }

        /**
         * @param validities (Updatable) An object that describes a period of time during which an entity is valid. If this is not provided when you create a certificate, the validity of the issuing CA is used.
         * 
         * @return builder
         * 
         */
        public Builder validities(@Nullable Output<List<CertificateCurrentVersionValidityArgs>> validities) {
            $.validities = validities;
            return this;
        }

        /**
         * @param validities (Updatable) An object that describes a period of time during which an entity is valid. If this is not provided when you create a certificate, the validity of the issuing CA is used.
         * 
         * @return builder
         * 
         */
        public Builder validities(List<CertificateCurrentVersionValidityArgs> validities) {
            return validities(Output.of(validities));
        }

        /**
         * @param validities (Updatable) An object that describes a period of time during which an entity is valid. If this is not provided when you create a certificate, the validity of the issuing CA is used.
         * 
         * @return builder
         * 
         */
        public Builder validities(CertificateCurrentVersionValidityArgs... validities) {
            return validities(List.of(validities));
        }

        /**
         * @param versionName (Updatable) A name for the certificate. When the value is not null, a name is unique across versions of a given certificate.
         * 
         * @return builder
         * 
         */
        public Builder versionName(@Nullable Output<String> versionName) {
            $.versionName = versionName;
            return this;
        }

        /**
         * @param versionName (Updatable) A name for the certificate. When the value is not null, a name is unique across versions of a given certificate.
         * 
         * @return builder
         * 
         */
        public Builder versionName(String versionName) {
            return versionName(Output.of(versionName));
        }

        /**
         * @param versionNumber The version number of the certificate.
         * 
         * @return builder
         * 
         */
        public Builder versionNumber(@Nullable Output<String> versionNumber) {
            $.versionNumber = versionNumber;
            return this;
        }

        /**
         * @param versionNumber The version number of the certificate.
         * 
         * @return builder
         * 
         */
        public Builder versionNumber(String versionNumber) {
            return versionNumber(Output.of(versionNumber));
        }

        public CertificateCurrentVersionArgs build() {
            return $;
        }
    }

}
