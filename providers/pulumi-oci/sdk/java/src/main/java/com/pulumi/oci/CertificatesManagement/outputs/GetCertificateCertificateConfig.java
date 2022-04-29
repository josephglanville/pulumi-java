// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.oci.CertificatesManagement.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.oci.CertificatesManagement.outputs.GetCertificateCertificateConfigSubject;
import com.pulumi.oci.CertificatesManagement.outputs.GetCertificateCertificateConfigSubjectAlternativeName;
import com.pulumi.oci.CertificatesManagement.outputs.GetCertificateCertificateConfigValidity;
import java.lang.String;
import java.util.List;
import java.util.Objects;

@CustomType
public final class GetCertificateCertificateConfig {
    /**
     * @return The name of the profile used to create the certificate, which depends on the type of certificate you need.
     * 
     */
    private final String certificateProfileType;
    /**
     * @return The origin of the certificate.
     * 
     */
    private final String configType;
    private final String csrPem;
    /**
     * @return The OCID of the certificate authority (CA) that issued the certificate.
     * 
     */
    private final String issuerCertificateAuthorityId;
    /**
     * @return The algorithm used to create key pairs.
     * 
     */
    private final String keyAlgorithm;
    /**
     * @return The algorithm used to sign the public key certificate.
     * 
     */
    private final String signatureAlgorithm;
    /**
     * @return A list of subject alternative names.
     * 
     */
    private final List<GetCertificateCertificateConfigSubjectAlternativeName> subjectAlternativeNames;
    /**
     * @return The subject of the certificate, which is a distinguished name that identifies the entity that owns the public key in the certificate.
     * 
     */
    private final List<GetCertificateCertificateConfigSubject> subjects;
    /**
     * @return An object that describes a period of time during which an entity is valid. If this is not provided when you create a certificate, the validity of the issuing CA is used.
     * 
     */
    private final List<GetCertificateCertificateConfigValidity> validities;
    /**
     * @return The name of the certificate version. When the value is not null, a name is unique across versions of a given certificate.
     * 
     */
    private final String versionName;

    @CustomType.Constructor
    private GetCertificateCertificateConfig(
        @CustomType.Parameter("certificateProfileType") String certificateProfileType,
        @CustomType.Parameter("configType") String configType,
        @CustomType.Parameter("csrPem") String csrPem,
        @CustomType.Parameter("issuerCertificateAuthorityId") String issuerCertificateAuthorityId,
        @CustomType.Parameter("keyAlgorithm") String keyAlgorithm,
        @CustomType.Parameter("signatureAlgorithm") String signatureAlgorithm,
        @CustomType.Parameter("subjectAlternativeNames") List<GetCertificateCertificateConfigSubjectAlternativeName> subjectAlternativeNames,
        @CustomType.Parameter("subjects") List<GetCertificateCertificateConfigSubject> subjects,
        @CustomType.Parameter("validities") List<GetCertificateCertificateConfigValidity> validities,
        @CustomType.Parameter("versionName") String versionName) {
        this.certificateProfileType = certificateProfileType;
        this.configType = configType;
        this.csrPem = csrPem;
        this.issuerCertificateAuthorityId = issuerCertificateAuthorityId;
        this.keyAlgorithm = keyAlgorithm;
        this.signatureAlgorithm = signatureAlgorithm;
        this.subjectAlternativeNames = subjectAlternativeNames;
        this.subjects = subjects;
        this.validities = validities;
        this.versionName = versionName;
    }

    /**
     * @return The name of the profile used to create the certificate, which depends on the type of certificate you need.
     * 
     */
    public String certificateProfileType() {
        return this.certificateProfileType;
    }
    /**
     * @return The origin of the certificate.
     * 
     */
    public String configType() {
        return this.configType;
    }
    public String csrPem() {
        return this.csrPem;
    }
    /**
     * @return The OCID of the certificate authority (CA) that issued the certificate.
     * 
     */
    public String issuerCertificateAuthorityId() {
        return this.issuerCertificateAuthorityId;
    }
    /**
     * @return The algorithm used to create key pairs.
     * 
     */
    public String keyAlgorithm() {
        return this.keyAlgorithm;
    }
    /**
     * @return The algorithm used to sign the public key certificate.
     * 
     */
    public String signatureAlgorithm() {
        return this.signatureAlgorithm;
    }
    /**
     * @return A list of subject alternative names.
     * 
     */
    public List<GetCertificateCertificateConfigSubjectAlternativeName> subjectAlternativeNames() {
        return this.subjectAlternativeNames;
    }
    /**
     * @return The subject of the certificate, which is a distinguished name that identifies the entity that owns the public key in the certificate.
     * 
     */
    public List<GetCertificateCertificateConfigSubject> subjects() {
        return this.subjects;
    }
    /**
     * @return An object that describes a period of time during which an entity is valid. If this is not provided when you create a certificate, the validity of the issuing CA is used.
     * 
     */
    public List<GetCertificateCertificateConfigValidity> validities() {
        return this.validities;
    }
    /**
     * @return The name of the certificate version. When the value is not null, a name is unique across versions of a given certificate.
     * 
     */
    public String versionName() {
        return this.versionName;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetCertificateCertificateConfig defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String certificateProfileType;
        private String configType;
        private String csrPem;
        private String issuerCertificateAuthorityId;
        private String keyAlgorithm;
        private String signatureAlgorithm;
        private List<GetCertificateCertificateConfigSubjectAlternativeName> subjectAlternativeNames;
        private List<GetCertificateCertificateConfigSubject> subjects;
        private List<GetCertificateCertificateConfigValidity> validities;
        private String versionName;

        public Builder() {
    	      // Empty
        }

        public Builder(GetCertificateCertificateConfig defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.certificateProfileType = defaults.certificateProfileType;
    	      this.configType = defaults.configType;
    	      this.csrPem = defaults.csrPem;
    	      this.issuerCertificateAuthorityId = defaults.issuerCertificateAuthorityId;
    	      this.keyAlgorithm = defaults.keyAlgorithm;
    	      this.signatureAlgorithm = defaults.signatureAlgorithm;
    	      this.subjectAlternativeNames = defaults.subjectAlternativeNames;
    	      this.subjects = defaults.subjects;
    	      this.validities = defaults.validities;
    	      this.versionName = defaults.versionName;
        }

        public Builder certificateProfileType(String certificateProfileType) {
            this.certificateProfileType = Objects.requireNonNull(certificateProfileType);
            return this;
        }
        public Builder configType(String configType) {
            this.configType = Objects.requireNonNull(configType);
            return this;
        }
        public Builder csrPem(String csrPem) {
            this.csrPem = Objects.requireNonNull(csrPem);
            return this;
        }
        public Builder issuerCertificateAuthorityId(String issuerCertificateAuthorityId) {
            this.issuerCertificateAuthorityId = Objects.requireNonNull(issuerCertificateAuthorityId);
            return this;
        }
        public Builder keyAlgorithm(String keyAlgorithm) {
            this.keyAlgorithm = Objects.requireNonNull(keyAlgorithm);
            return this;
        }
        public Builder signatureAlgorithm(String signatureAlgorithm) {
            this.signatureAlgorithm = Objects.requireNonNull(signatureAlgorithm);
            return this;
        }
        public Builder subjectAlternativeNames(List<GetCertificateCertificateConfigSubjectAlternativeName> subjectAlternativeNames) {
            this.subjectAlternativeNames = Objects.requireNonNull(subjectAlternativeNames);
            return this;
        }
        public Builder subjectAlternativeNames(GetCertificateCertificateConfigSubjectAlternativeName... subjectAlternativeNames) {
            return subjectAlternativeNames(List.of(subjectAlternativeNames));
        }
        public Builder subjects(List<GetCertificateCertificateConfigSubject> subjects) {
            this.subjects = Objects.requireNonNull(subjects);
            return this;
        }
        public Builder subjects(GetCertificateCertificateConfigSubject... subjects) {
            return subjects(List.of(subjects));
        }
        public Builder validities(List<GetCertificateCertificateConfigValidity> validities) {
            this.validities = Objects.requireNonNull(validities);
            return this;
        }
        public Builder validities(GetCertificateCertificateConfigValidity... validities) {
            return validities(List.of(validities));
        }
        public Builder versionName(String versionName) {
            this.versionName = Objects.requireNonNull(versionName);
            return this;
        }        public GetCertificateCertificateConfig build() {
            return new GetCertificateCertificateConfig(certificateProfileType, configType, csrPem, issuerCertificateAuthorityId, keyAlgorithm, signatureAlgorithm, subjectAlternativeNames, subjects, validities, versionName);
        }
    }
}
