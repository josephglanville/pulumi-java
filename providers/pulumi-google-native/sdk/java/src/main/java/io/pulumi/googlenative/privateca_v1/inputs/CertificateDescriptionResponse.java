// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.privateca_v1.inputs;

import io.pulumi.core.annotations.Import;
import io.pulumi.googlenative.privateca_v1.inputs.CertificateFingerprintResponse;
import io.pulumi.googlenative.privateca_v1.inputs.KeyIdResponse;
import io.pulumi.googlenative.privateca_v1.inputs.PublicKeyResponse;
import io.pulumi.googlenative.privateca_v1.inputs.SubjectDescriptionResponse;
import io.pulumi.googlenative.privateca_v1.inputs.X509ParametersResponse;
import java.lang.String;
import java.util.List;
import java.util.Objects;


/**
 * A CertificateDescription describes an X.509 certificate or CSR that has been issued, as an alternative to using ASN.1 / X.509.
 * 
 */
public final class CertificateDescriptionResponse extends io.pulumi.resources.InvokeArgs {

    public static final CertificateDescriptionResponse Empty = new CertificateDescriptionResponse();

    /**
     * Describes lists of issuer CA certificate URLs that appear in the "Authority Information Access" extension in the certificate.
     * 
     */
    @Import(name="aiaIssuingCertificateUrls", required=true)
      private final List<String> aiaIssuingCertificateUrls;

    public List<String> getAiaIssuingCertificateUrls() {
        return this.aiaIssuingCertificateUrls;
    }

    /**
     * Identifies the subject_key_id of the parent certificate, per https://tools.ietf.org/html/rfc5280#section-4.2.1.1
     * 
     */
    @Import(name="authorityKeyId", required=true)
      private final KeyIdResponse authorityKeyId;

    public KeyIdResponse getAuthorityKeyId() {
        return this.authorityKeyId;
    }

    /**
     * The hash of the x.509 certificate.
     * 
     */
    @Import(name="certFingerprint", required=true)
      private final CertificateFingerprintResponse certFingerprint;

    public CertificateFingerprintResponse getCertFingerprint() {
        return this.certFingerprint;
    }

    /**
     * Describes a list of locations to obtain CRL information, i.e. the DistributionPoint.fullName described by https://tools.ietf.org/html/rfc5280#section-4.2.1.13
     * 
     */
    @Import(name="crlDistributionPoints", required=true)
      private final List<String> crlDistributionPoints;

    public List<String> getCrlDistributionPoints() {
        return this.crlDistributionPoints;
    }

    /**
     * The public key that corresponds to an issued certificate.
     * 
     */
    @Import(name="publicKey", required=true)
      private final PublicKeyResponse publicKey;

    public PublicKeyResponse getPublicKey() {
        return this.publicKey;
    }

    /**
     * Describes some of the values in a certificate that are related to the subject and lifetime.
     * 
     */
    @Import(name="subjectDescription", required=true)
      private final SubjectDescriptionResponse subjectDescription;

    public SubjectDescriptionResponse getSubjectDescription() {
        return this.subjectDescription;
    }

    /**
     * Provides a means of identifiying certificates that contain a particular public key, per https://tools.ietf.org/html/rfc5280#section-4.2.1.2.
     * 
     */
    @Import(name="subjectKeyId", required=true)
      private final KeyIdResponse subjectKeyId;

    public KeyIdResponse getSubjectKeyId() {
        return this.subjectKeyId;
    }

    /**
     * Describes some of the technical X.509 fields in a certificate.
     * 
     */
    @Import(name="x509Description", required=true)
      private final X509ParametersResponse x509Description;

    public X509ParametersResponse getX509Description() {
        return this.x509Description;
    }

    public CertificateDescriptionResponse(
        List<String> aiaIssuingCertificateUrls,
        KeyIdResponse authorityKeyId,
        CertificateFingerprintResponse certFingerprint,
        List<String> crlDistributionPoints,
        PublicKeyResponse publicKey,
        SubjectDescriptionResponse subjectDescription,
        KeyIdResponse subjectKeyId,
        X509ParametersResponse x509Description) {
        this.aiaIssuingCertificateUrls = Objects.requireNonNull(aiaIssuingCertificateUrls, "expected parameter 'aiaIssuingCertificateUrls' to be non-null");
        this.authorityKeyId = Objects.requireNonNull(authorityKeyId, "expected parameter 'authorityKeyId' to be non-null");
        this.certFingerprint = Objects.requireNonNull(certFingerprint, "expected parameter 'certFingerprint' to be non-null");
        this.crlDistributionPoints = Objects.requireNonNull(crlDistributionPoints, "expected parameter 'crlDistributionPoints' to be non-null");
        this.publicKey = Objects.requireNonNull(publicKey, "expected parameter 'publicKey' to be non-null");
        this.subjectDescription = Objects.requireNonNull(subjectDescription, "expected parameter 'subjectDescription' to be non-null");
        this.subjectKeyId = Objects.requireNonNull(subjectKeyId, "expected parameter 'subjectKeyId' to be non-null");
        this.x509Description = Objects.requireNonNull(x509Description, "expected parameter 'x509Description' to be non-null");
    }

    private CertificateDescriptionResponse() {
        this.aiaIssuingCertificateUrls = List.of();
        this.authorityKeyId = null;
        this.certFingerprint = null;
        this.crlDistributionPoints = List.of();
        this.publicKey = null;
        this.subjectDescription = null;
        this.subjectKeyId = null;
        this.x509Description = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(CertificateDescriptionResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private List<String> aiaIssuingCertificateUrls;
        private KeyIdResponse authorityKeyId;
        private CertificateFingerprintResponse certFingerprint;
        private List<String> crlDistributionPoints;
        private PublicKeyResponse publicKey;
        private SubjectDescriptionResponse subjectDescription;
        private KeyIdResponse subjectKeyId;
        private X509ParametersResponse x509Description;

        public Builder() {
    	      // Empty
        }

        public Builder(CertificateDescriptionResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.aiaIssuingCertificateUrls = defaults.aiaIssuingCertificateUrls;
    	      this.authorityKeyId = defaults.authorityKeyId;
    	      this.certFingerprint = defaults.certFingerprint;
    	      this.crlDistributionPoints = defaults.crlDistributionPoints;
    	      this.publicKey = defaults.publicKey;
    	      this.subjectDescription = defaults.subjectDescription;
    	      this.subjectKeyId = defaults.subjectKeyId;
    	      this.x509Description = defaults.x509Description;
        }

        public Builder aiaIssuingCertificateUrls(List<String> aiaIssuingCertificateUrls) {
            this.aiaIssuingCertificateUrls = Objects.requireNonNull(aiaIssuingCertificateUrls);
            return this;
        }
        public Builder aiaIssuingCertificateUrls(String... aiaIssuingCertificateUrls) {
            return aiaIssuingCertificateUrls(List.of(aiaIssuingCertificateUrls));
        }
        public Builder authorityKeyId(KeyIdResponse authorityKeyId) {
            this.authorityKeyId = Objects.requireNonNull(authorityKeyId);
            return this;
        }
        public Builder certFingerprint(CertificateFingerprintResponse certFingerprint) {
            this.certFingerprint = Objects.requireNonNull(certFingerprint);
            return this;
        }
        public Builder crlDistributionPoints(List<String> crlDistributionPoints) {
            this.crlDistributionPoints = Objects.requireNonNull(crlDistributionPoints);
            return this;
        }
        public Builder crlDistributionPoints(String... crlDistributionPoints) {
            return crlDistributionPoints(List.of(crlDistributionPoints));
        }
        public Builder publicKey(PublicKeyResponse publicKey) {
            this.publicKey = Objects.requireNonNull(publicKey);
            return this;
        }
        public Builder subjectDescription(SubjectDescriptionResponse subjectDescription) {
            this.subjectDescription = Objects.requireNonNull(subjectDescription);
            return this;
        }
        public Builder subjectKeyId(KeyIdResponse subjectKeyId) {
            this.subjectKeyId = Objects.requireNonNull(subjectKeyId);
            return this;
        }
        public Builder x509Description(X509ParametersResponse x509Description) {
            this.x509Description = Objects.requireNonNull(x509Description);
            return this;
        }        public CertificateDescriptionResponse build() {
            return new CertificateDescriptionResponse(aiaIssuingCertificateUrls, authorityKeyId, certFingerprint, crlDistributionPoints, publicKey, subjectDescription, subjectKeyId, x509Description);
        }
    }
}
