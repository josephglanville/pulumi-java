// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.oci.CertificatesManagement.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.oci.CertificatesManagement.outputs.CertificateAuthorityCurrentVersionRevocationStatus;
import com.pulumi.oci.CertificatesManagement.outputs.CertificateAuthorityCurrentVersionValidity;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class CertificateAuthorityCurrentVersion {
    /**
     * @return The OCID of the CA.
     * 
     */
    private final @Nullable String certificateAuthorityId;
    /**
     * @return The version number of the issuing CA.
     * 
     */
    private final @Nullable String issuerCaVersionNumber;
    /**
     * @return The current revocation status of the entity.
     * 
     */
    private final @Nullable List<CertificateAuthorityCurrentVersionRevocationStatus> revocationStatuses;
    /**
     * @return Unique subject identifier, which is not the same as the certificate serial number (RDN SERIALNUMBER).
     * 
     */
    private final @Nullable String serialNumber;
    /**
     * @return A list of rotation states for this CA version.
     * 
     */
    private final @Nullable List<String> stages;
    /**
     * @return A property indicating when the CA was created, expressed in [RFC 3339](https://tools.ietf.org/html/rfc3339) timestamp format. Example: `2019-04-03T21:10:29.600Z`
     * 
     */
    private final @Nullable String timeCreated;
    /**
     * @return An optional property indicating when to delete the CA version, expressed in [RFC 3339](https://tools.ietf.org/html/rfc3339) timestamp format. Example: `2019-04-03T21:10:29.600Z`
     * 
     */
    private final @Nullable String timeOfDeletion;
    /**
     * @return (Updatable) An object that describes a period of time during which an entity is valid. If this is not provided when you create a certificate, the validity of the issuing CA is used.
     * 
     */
    private final @Nullable List<CertificateAuthorityCurrentVersionValidity> validities;
    /**
     * @return (Updatable) The name of the CA version. When the value is not null, a name is unique across versions of a given CA.
     * 
     */
    private final @Nullable String versionName;
    /**
     * @return The version number of the CA.
     * 
     */
    private final @Nullable String versionNumber;

    @CustomType.Constructor
    private CertificateAuthorityCurrentVersion(
        @CustomType.Parameter("certificateAuthorityId") @Nullable String certificateAuthorityId,
        @CustomType.Parameter("issuerCaVersionNumber") @Nullable String issuerCaVersionNumber,
        @CustomType.Parameter("revocationStatuses") @Nullable List<CertificateAuthorityCurrentVersionRevocationStatus> revocationStatuses,
        @CustomType.Parameter("serialNumber") @Nullable String serialNumber,
        @CustomType.Parameter("stages") @Nullable List<String> stages,
        @CustomType.Parameter("timeCreated") @Nullable String timeCreated,
        @CustomType.Parameter("timeOfDeletion") @Nullable String timeOfDeletion,
        @CustomType.Parameter("validities") @Nullable List<CertificateAuthorityCurrentVersionValidity> validities,
        @CustomType.Parameter("versionName") @Nullable String versionName,
        @CustomType.Parameter("versionNumber") @Nullable String versionNumber) {
        this.certificateAuthorityId = certificateAuthorityId;
        this.issuerCaVersionNumber = issuerCaVersionNumber;
        this.revocationStatuses = revocationStatuses;
        this.serialNumber = serialNumber;
        this.stages = stages;
        this.timeCreated = timeCreated;
        this.timeOfDeletion = timeOfDeletion;
        this.validities = validities;
        this.versionName = versionName;
        this.versionNumber = versionNumber;
    }

    /**
     * @return The OCID of the CA.
     * 
     */
    public Optional<String> certificateAuthorityId() {
        return Optional.ofNullable(this.certificateAuthorityId);
    }
    /**
     * @return The version number of the issuing CA.
     * 
     */
    public Optional<String> issuerCaVersionNumber() {
        return Optional.ofNullable(this.issuerCaVersionNumber);
    }
    /**
     * @return The current revocation status of the entity.
     * 
     */
    public List<CertificateAuthorityCurrentVersionRevocationStatus> revocationStatuses() {
        return this.revocationStatuses == null ? List.of() : this.revocationStatuses;
    }
    /**
     * @return Unique subject identifier, which is not the same as the certificate serial number (RDN SERIALNUMBER).
     * 
     */
    public Optional<String> serialNumber() {
        return Optional.ofNullable(this.serialNumber);
    }
    /**
     * @return A list of rotation states for this CA version.
     * 
     */
    public List<String> stages() {
        return this.stages == null ? List.of() : this.stages;
    }
    /**
     * @return A property indicating when the CA was created, expressed in [RFC 3339](https://tools.ietf.org/html/rfc3339) timestamp format. Example: `2019-04-03T21:10:29.600Z`
     * 
     */
    public Optional<String> timeCreated() {
        return Optional.ofNullable(this.timeCreated);
    }
    /**
     * @return An optional property indicating when to delete the CA version, expressed in [RFC 3339](https://tools.ietf.org/html/rfc3339) timestamp format. Example: `2019-04-03T21:10:29.600Z`
     * 
     */
    public Optional<String> timeOfDeletion() {
        return Optional.ofNullable(this.timeOfDeletion);
    }
    /**
     * @return (Updatable) An object that describes a period of time during which an entity is valid. If this is not provided when you create a certificate, the validity of the issuing CA is used.
     * 
     */
    public List<CertificateAuthorityCurrentVersionValidity> validities() {
        return this.validities == null ? List.of() : this.validities;
    }
    /**
     * @return (Updatable) The name of the CA version. When the value is not null, a name is unique across versions of a given CA.
     * 
     */
    public Optional<String> versionName() {
        return Optional.ofNullable(this.versionName);
    }
    /**
     * @return The version number of the CA.
     * 
     */
    public Optional<String> versionNumber() {
        return Optional.ofNullable(this.versionNumber);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(CertificateAuthorityCurrentVersion defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String certificateAuthorityId;
        private @Nullable String issuerCaVersionNumber;
        private @Nullable List<CertificateAuthorityCurrentVersionRevocationStatus> revocationStatuses;
        private @Nullable String serialNumber;
        private @Nullable List<String> stages;
        private @Nullable String timeCreated;
        private @Nullable String timeOfDeletion;
        private @Nullable List<CertificateAuthorityCurrentVersionValidity> validities;
        private @Nullable String versionName;
        private @Nullable String versionNumber;

        public Builder() {
    	      // Empty
        }

        public Builder(CertificateAuthorityCurrentVersion defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.certificateAuthorityId = defaults.certificateAuthorityId;
    	      this.issuerCaVersionNumber = defaults.issuerCaVersionNumber;
    	      this.revocationStatuses = defaults.revocationStatuses;
    	      this.serialNumber = defaults.serialNumber;
    	      this.stages = defaults.stages;
    	      this.timeCreated = defaults.timeCreated;
    	      this.timeOfDeletion = defaults.timeOfDeletion;
    	      this.validities = defaults.validities;
    	      this.versionName = defaults.versionName;
    	      this.versionNumber = defaults.versionNumber;
        }

        public Builder certificateAuthorityId(@Nullable String certificateAuthorityId) {
            this.certificateAuthorityId = certificateAuthorityId;
            return this;
        }
        public Builder issuerCaVersionNumber(@Nullable String issuerCaVersionNumber) {
            this.issuerCaVersionNumber = issuerCaVersionNumber;
            return this;
        }
        public Builder revocationStatuses(@Nullable List<CertificateAuthorityCurrentVersionRevocationStatus> revocationStatuses) {
            this.revocationStatuses = revocationStatuses;
            return this;
        }
        public Builder revocationStatuses(CertificateAuthorityCurrentVersionRevocationStatus... revocationStatuses) {
            return revocationStatuses(List.of(revocationStatuses));
        }
        public Builder serialNumber(@Nullable String serialNumber) {
            this.serialNumber = serialNumber;
            return this;
        }
        public Builder stages(@Nullable List<String> stages) {
            this.stages = stages;
            return this;
        }
        public Builder stages(String... stages) {
            return stages(List.of(stages));
        }
        public Builder timeCreated(@Nullable String timeCreated) {
            this.timeCreated = timeCreated;
            return this;
        }
        public Builder timeOfDeletion(@Nullable String timeOfDeletion) {
            this.timeOfDeletion = timeOfDeletion;
            return this;
        }
        public Builder validities(@Nullable List<CertificateAuthorityCurrentVersionValidity> validities) {
            this.validities = validities;
            return this;
        }
        public Builder validities(CertificateAuthorityCurrentVersionValidity... validities) {
            return validities(List.of(validities));
        }
        public Builder versionName(@Nullable String versionName) {
            this.versionName = versionName;
            return this;
        }
        public Builder versionNumber(@Nullable String versionNumber) {
            this.versionNumber = versionNumber;
            return this;
        }        public CertificateAuthorityCurrentVersion build() {
            return new CertificateAuthorityCurrentVersion(certificateAuthorityId, issuerCaVersionNumber, revocationStatuses, serialNumber, stages, timeCreated, timeOfDeletion, validities, versionName, versionNumber);
        }
    }
}
