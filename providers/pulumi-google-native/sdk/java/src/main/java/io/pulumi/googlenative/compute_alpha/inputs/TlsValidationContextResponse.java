// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.compute_alpha.inputs;

import io.pulumi.core.annotations.Import;
import io.pulumi.googlenative.compute_alpha.inputs.SdsConfigResponse;
import java.lang.String;
import java.util.Objects;


/**
 * [Deprecated] Defines the mechanism to obtain the Certificate Authority certificate to validate the client/server certificate. validate the client/server certificate.
 * 
 */
public final class TlsValidationContextResponse extends io.pulumi.resources.InvokeArgs {

    public static final TlsValidationContextResponse Empty = new TlsValidationContextResponse();

    /**
     * The path to the file holding the CA certificate to validate the client or server certificate.
     * 
     */
    @Import(name="certificatePath", required=true)
      private final String certificatePath;

    public String getCertificatePath() {
        return this.certificatePath;
    }

    /**
     * Specifies the config to retrieve certificates through SDS. This field is applicable only if tlsCertificateSource is set to USE_SDS.
     * 
     */
    @Import(name="sdsConfig", required=true)
      private final SdsConfigResponse sdsConfig;

    public SdsConfigResponse getSdsConfig() {
        return this.sdsConfig;
    }

    /**
     * Defines how TLS certificates are obtained.
     * 
     */
    @Import(name="validationSource", required=true)
      private final String validationSource;

    public String getValidationSource() {
        return this.validationSource;
    }

    public TlsValidationContextResponse(
        String certificatePath,
        SdsConfigResponse sdsConfig,
        String validationSource) {
        this.certificatePath = Objects.requireNonNull(certificatePath, "expected parameter 'certificatePath' to be non-null");
        this.sdsConfig = Objects.requireNonNull(sdsConfig, "expected parameter 'sdsConfig' to be non-null");
        this.validationSource = Objects.requireNonNull(validationSource, "expected parameter 'validationSource' to be non-null");
    }

    private TlsValidationContextResponse() {
        this.certificatePath = null;
        this.sdsConfig = null;
        this.validationSource = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(TlsValidationContextResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String certificatePath;
        private SdsConfigResponse sdsConfig;
        private String validationSource;

        public Builder() {
    	      // Empty
        }

        public Builder(TlsValidationContextResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.certificatePath = defaults.certificatePath;
    	      this.sdsConfig = defaults.sdsConfig;
    	      this.validationSource = defaults.validationSource;
        }

        public Builder certificatePath(String certificatePath) {
            this.certificatePath = Objects.requireNonNull(certificatePath);
            return this;
        }
        public Builder sdsConfig(SdsConfigResponse sdsConfig) {
            this.sdsConfig = Objects.requireNonNull(sdsConfig);
            return this;
        }
        public Builder validationSource(String validationSource) {
            this.validationSource = Objects.requireNonNull(validationSource);
            return this;
        }        public TlsValidationContextResponse build() {
            return new TlsValidationContextResponse(certificatePath, sdsConfig, validationSource);
        }
    }
}
