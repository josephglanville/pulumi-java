// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.appmesh.outputs;

import io.pulumi.aws.appmesh.outputs.VirtualGatewaySpecListenerTlsCertificate;
import io.pulumi.aws.appmesh.outputs.VirtualGatewaySpecListenerTlsValidation;
import io.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class VirtualGatewaySpecListenerTls {
    /**
     * The listener's TLS certificate.
     * 
     */
    private final VirtualGatewaySpecListenerTlsCertificate certificate;
    /**
     * The listener's TLS mode. Valid values: `DISABLED`, `PERMISSIVE`, `STRICT`.
     * 
     */
    private final String mode;
    /**
     * The listener's Transport Layer Security (TLS) validation context.
     * 
     */
    private final @Nullable VirtualGatewaySpecListenerTlsValidation validation;

    @CustomType.Constructor
    private VirtualGatewaySpecListenerTls(
        @CustomType.Parameter("certificate") VirtualGatewaySpecListenerTlsCertificate certificate,
        @CustomType.Parameter("mode") String mode,
        @CustomType.Parameter("validation") @Nullable VirtualGatewaySpecListenerTlsValidation validation) {
        this.certificate = certificate;
        this.mode = mode;
        this.validation = validation;
    }

    /**
     * The listener's TLS certificate.
     * 
    */
    public VirtualGatewaySpecListenerTlsCertificate getCertificate() {
        return this.certificate;
    }
    /**
     * The listener's TLS mode. Valid values: `DISABLED`, `PERMISSIVE`, `STRICT`.
     * 
    */
    public String getMode() {
        return this.mode;
    }
    /**
     * The listener's Transport Layer Security (TLS) validation context.
     * 
    */
    public Optional<VirtualGatewaySpecListenerTlsValidation> getValidation() {
        return Optional.ofNullable(this.validation);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(VirtualGatewaySpecListenerTls defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private VirtualGatewaySpecListenerTlsCertificate certificate;
        private String mode;
        private @Nullable VirtualGatewaySpecListenerTlsValidation validation;

        public Builder() {
    	      // Empty
        }

        public Builder(VirtualGatewaySpecListenerTls defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.certificate = defaults.certificate;
    	      this.mode = defaults.mode;
    	      this.validation = defaults.validation;
        }

        public Builder certificate(VirtualGatewaySpecListenerTlsCertificate certificate) {
            this.certificate = Objects.requireNonNull(certificate);
            return this;
        }
        public Builder mode(String mode) {
            this.mode = Objects.requireNonNull(mode);
            return this;
        }
        public Builder validation(@Nullable VirtualGatewaySpecListenerTlsValidation validation) {
            this.validation = validation;
            return this;
        }        public VirtualGatewaySpecListenerTls build() {
            return new VirtualGatewaySpecListenerTls(certificate, mode, validation);
        }
    }
}
