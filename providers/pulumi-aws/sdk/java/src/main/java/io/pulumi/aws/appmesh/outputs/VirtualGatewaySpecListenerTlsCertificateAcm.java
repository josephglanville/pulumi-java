// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.appmesh.outputs;

import io.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class VirtualGatewaySpecListenerTlsCertificateAcm {
    /**
     * The Amazon Resource Name (ARN) for the certificate.
     * 
     */
    private final String certificateArn;

    @CustomType.Constructor
    private VirtualGatewaySpecListenerTlsCertificateAcm(@CustomType.Parameter("certificateArn") String certificateArn) {
        this.certificateArn = certificateArn;
    }

    /**
     * The Amazon Resource Name (ARN) for the certificate.
     * 
    */
    public String getCertificateArn() {
        return this.certificateArn;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(VirtualGatewaySpecListenerTlsCertificateAcm defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String certificateArn;

        public Builder() {
    	      // Empty
        }

        public Builder(VirtualGatewaySpecListenerTlsCertificateAcm defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.certificateArn = defaults.certificateArn;
        }

        public Builder certificateArn(String certificateArn) {
            this.certificateArn = Objects.requireNonNull(certificateArn);
            return this;
        }        public VirtualGatewaySpecListenerTlsCertificateAcm build() {
            return new VirtualGatewaySpecListenerTlsCertificateAcm(certificateArn);
        }
    }
}
