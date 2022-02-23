// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.acmpca;

import io.pulumi.awsnative.acmpca.inputs.CertificateApiPassthroughArgs;
import io.pulumi.awsnative.acmpca.inputs.CertificateValidityArgs;
import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class CertificateArgs extends io.pulumi.resources.ResourceArgs {

    public static final CertificateArgs Empty = new CertificateArgs();

    /**
     * These are fields to be overridden in a certificate at the time of issuance. These requires an API_Passthrough template be used or they will be ignored.
     * 
     */
    @InputImport(name="apiPassthrough")
      private final @Nullable Input<CertificateApiPassthroughArgs> apiPassthrough;

    public Input<CertificateApiPassthroughArgs> getApiPassthrough() {
        return this.apiPassthrough == null ? Input.empty() : this.apiPassthrough;
    }

    /**
     * The Amazon Resource Name (ARN) for the private CA to issue the certificate.
     * 
     */
    @InputImport(name="certificateAuthorityArn", required=true)
      private final Input<String> certificateAuthorityArn;

    public Input<String> getCertificateAuthorityArn() {
        return this.certificateAuthorityArn;
    }

    /**
     * The certificate signing request (CSR) for the Certificate.
     * 
     */
    @InputImport(name="certificateSigningRequest", required=true)
      private final Input<String> certificateSigningRequest;

    public Input<String> getCertificateSigningRequest() {
        return this.certificateSigningRequest;
    }

    /**
     * The name of the algorithm that will be used to sign the Certificate.
     * 
     */
    @InputImport(name="signingAlgorithm", required=true)
      private final Input<String> signingAlgorithm;

    public Input<String> getSigningAlgorithm() {
        return this.signingAlgorithm;
    }

    /**
     * Specifies a custom configuration template to use when issuing a certificate. If this parameter is not provided, ACM Private CA defaults to the EndEntityCertificate/V1 template.
     * 
     */
    @InputImport(name="templateArn")
      private final @Nullable Input<String> templateArn;

    public Input<String> getTemplateArn() {
        return this.templateArn == null ? Input.empty() : this.templateArn;
    }

    /**
     * The time before which the Certificate will be valid.
     * 
     */
    @InputImport(name="validity", required=true)
      private final Input<CertificateValidityArgs> validity;

    public Input<CertificateValidityArgs> getValidity() {
        return this.validity;
    }

    /**
     * The time after which the Certificate will be valid.
     * 
     */
    @InputImport(name="validityNotBefore")
      private final @Nullable Input<CertificateValidityArgs> validityNotBefore;

    public Input<CertificateValidityArgs> getValidityNotBefore() {
        return this.validityNotBefore == null ? Input.empty() : this.validityNotBefore;
    }

    public CertificateArgs(
        @Nullable Input<CertificateApiPassthroughArgs> apiPassthrough,
        Input<String> certificateAuthorityArn,
        Input<String> certificateSigningRequest,
        Input<String> signingAlgorithm,
        @Nullable Input<String> templateArn,
        Input<CertificateValidityArgs> validity,
        @Nullable Input<CertificateValidityArgs> validityNotBefore) {
        this.apiPassthrough = apiPassthrough;
        this.certificateAuthorityArn = Objects.requireNonNull(certificateAuthorityArn, "expected parameter 'certificateAuthorityArn' to be non-null");
        this.certificateSigningRequest = Objects.requireNonNull(certificateSigningRequest, "expected parameter 'certificateSigningRequest' to be non-null");
        this.signingAlgorithm = Objects.requireNonNull(signingAlgorithm, "expected parameter 'signingAlgorithm' to be non-null");
        this.templateArn = templateArn;
        this.validity = Objects.requireNonNull(validity, "expected parameter 'validity' to be non-null");
        this.validityNotBefore = validityNotBefore;
    }

    private CertificateArgs() {
        this.apiPassthrough = Input.empty();
        this.certificateAuthorityArn = Input.empty();
        this.certificateSigningRequest = Input.empty();
        this.signingAlgorithm = Input.empty();
        this.templateArn = Input.empty();
        this.validity = Input.empty();
        this.validityNotBefore = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(CertificateArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<CertificateApiPassthroughArgs> apiPassthrough;
        private Input<String> certificateAuthorityArn;
        private Input<String> certificateSigningRequest;
        private Input<String> signingAlgorithm;
        private @Nullable Input<String> templateArn;
        private Input<CertificateValidityArgs> validity;
        private @Nullable Input<CertificateValidityArgs> validityNotBefore;

        public Builder() {
    	      // Empty
        }

        public Builder(CertificateArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.apiPassthrough = defaults.apiPassthrough;
    	      this.certificateAuthorityArn = defaults.certificateAuthorityArn;
    	      this.certificateSigningRequest = defaults.certificateSigningRequest;
    	      this.signingAlgorithm = defaults.signingAlgorithm;
    	      this.templateArn = defaults.templateArn;
    	      this.validity = defaults.validity;
    	      this.validityNotBefore = defaults.validityNotBefore;
        }

        public Builder setApiPassthrough(@Nullable Input<CertificateApiPassthroughArgs> apiPassthrough) {
            this.apiPassthrough = apiPassthrough;
            return this;
        }

        public Builder setApiPassthrough(@Nullable CertificateApiPassthroughArgs apiPassthrough) {
            this.apiPassthrough = Input.ofNullable(apiPassthrough);
            return this;
        }

        public Builder setCertificateAuthorityArn(Input<String> certificateAuthorityArn) {
            this.certificateAuthorityArn = Objects.requireNonNull(certificateAuthorityArn);
            return this;
        }

        public Builder setCertificateAuthorityArn(String certificateAuthorityArn) {
            this.certificateAuthorityArn = Input.of(Objects.requireNonNull(certificateAuthorityArn));
            return this;
        }

        public Builder setCertificateSigningRequest(Input<String> certificateSigningRequest) {
            this.certificateSigningRequest = Objects.requireNonNull(certificateSigningRequest);
            return this;
        }

        public Builder setCertificateSigningRequest(String certificateSigningRequest) {
            this.certificateSigningRequest = Input.of(Objects.requireNonNull(certificateSigningRequest));
            return this;
        }

        public Builder setSigningAlgorithm(Input<String> signingAlgorithm) {
            this.signingAlgorithm = Objects.requireNonNull(signingAlgorithm);
            return this;
        }

        public Builder setSigningAlgorithm(String signingAlgorithm) {
            this.signingAlgorithm = Input.of(Objects.requireNonNull(signingAlgorithm));
            return this;
        }

        public Builder setTemplateArn(@Nullable Input<String> templateArn) {
            this.templateArn = templateArn;
            return this;
        }

        public Builder setTemplateArn(@Nullable String templateArn) {
            this.templateArn = Input.ofNullable(templateArn);
            return this;
        }

        public Builder setValidity(Input<CertificateValidityArgs> validity) {
            this.validity = Objects.requireNonNull(validity);
            return this;
        }

        public Builder setValidity(CertificateValidityArgs validity) {
            this.validity = Input.of(Objects.requireNonNull(validity));
            return this;
        }

        public Builder setValidityNotBefore(@Nullable Input<CertificateValidityArgs> validityNotBefore) {
            this.validityNotBefore = validityNotBefore;
            return this;
        }

        public Builder setValidityNotBefore(@Nullable CertificateValidityArgs validityNotBefore) {
            this.validityNotBefore = Input.ofNullable(validityNotBefore);
            return this;
        }
        public CertificateArgs build() {
            return new CertificateArgs(apiPassthrough, certificateAuthorityArn, certificateSigningRequest, signingAlgorithm, templateArn, validity, validityNotBefore);
        }
    }
}
