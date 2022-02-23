// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.apimanagement.inputs;

import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;


/**
 * SSL certificate information.
 * 
 */
public final class CertificateInformationResponse extends io.pulumi.resources.InvokeArgs {

    public static final CertificateInformationResponse Empty = new CertificateInformationResponse();

    /**
     * Expiration date of the certificate. The date conforms to the following format: `yyyy-MM-ddTHH:mm:ssZ` as specified by the ISO 8601 standard.
     * 
     */
    @InputImport(name="expiry", required=true)
      private final String expiry;

    public String getExpiry() {
        return this.expiry;
    }

    /**
     * Subject of the certificate.
     * 
     */
    @InputImport(name="subject", required=true)
      private final String subject;

    public String getSubject() {
        return this.subject;
    }

    /**
     * Thumbprint of the certificate.
     * 
     */
    @InputImport(name="thumbprint", required=true)
      private final String thumbprint;

    public String getThumbprint() {
        return this.thumbprint;
    }

    public CertificateInformationResponse(
        String expiry,
        String subject,
        String thumbprint) {
        this.expiry = Objects.requireNonNull(expiry, "expected parameter 'expiry' to be non-null");
        this.subject = Objects.requireNonNull(subject, "expected parameter 'subject' to be non-null");
        this.thumbprint = Objects.requireNonNull(thumbprint, "expected parameter 'thumbprint' to be non-null");
    }

    private CertificateInformationResponse() {
        this.expiry = null;
        this.subject = null;
        this.thumbprint = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(CertificateInformationResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String expiry;
        private String subject;
        private String thumbprint;

        public Builder() {
    	      // Empty
        }

        public Builder(CertificateInformationResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.expiry = defaults.expiry;
    	      this.subject = defaults.subject;
    	      this.thumbprint = defaults.thumbprint;
        }

        public Builder setExpiry(String expiry) {
            this.expiry = Objects.requireNonNull(expiry);
            return this;
        }

        public Builder setSubject(String subject) {
            this.subject = Objects.requireNonNull(subject);
            return this;
        }

        public Builder setThumbprint(String thumbprint) {
            this.thumbprint = Objects.requireNonNull(thumbprint);
            return this;
        }
        public CertificateInformationResponse build() {
            return new CertificateInformationResponse(expiry, subject, thumbprint);
        }
    }
}
