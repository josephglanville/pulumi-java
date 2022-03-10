// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.appmesh.outputs;

import io.pulumi.aws.appmesh.outputs.VirtualGatewaySpecBackendDefaultsClientPolicyTlsCertificateFile;
import io.pulumi.aws.appmesh.outputs.VirtualGatewaySpecBackendDefaultsClientPolicyTlsCertificateSds;
import io.pulumi.core.annotations.OutputCustomType;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class VirtualGatewaySpecBackendDefaultsClientPolicyTlsCertificate {
    /**
     * A local file certificate.
     * 
     */
    private final @Nullable VirtualGatewaySpecBackendDefaultsClientPolicyTlsCertificateFile file;
    /**
     * A [Secret Discovery Service](https://www.envoyproxy.io/docs/envoy/latest/configuration/security/secret#secret-discovery-service-sds) certificate.
     * 
     */
    private final @Nullable VirtualGatewaySpecBackendDefaultsClientPolicyTlsCertificateSds sds;

    @OutputCustomType.Constructor
    private VirtualGatewaySpecBackendDefaultsClientPolicyTlsCertificate(
        @OutputCustomType.Parameter("file") @Nullable VirtualGatewaySpecBackendDefaultsClientPolicyTlsCertificateFile file,
        @OutputCustomType.Parameter("sds") @Nullable VirtualGatewaySpecBackendDefaultsClientPolicyTlsCertificateSds sds) {
        this.file = file;
        this.sds = sds;
    }

    /**
     * A local file certificate.
     * 
    */
    public Optional<VirtualGatewaySpecBackendDefaultsClientPolicyTlsCertificateFile> getFile() {
        return Optional.ofNullable(this.file);
    }
    /**
     * A [Secret Discovery Service](https://www.envoyproxy.io/docs/envoy/latest/configuration/security/secret#secret-discovery-service-sds) certificate.
     * 
    */
    public Optional<VirtualGatewaySpecBackendDefaultsClientPolicyTlsCertificateSds> getSds() {
        return Optional.ofNullable(this.sds);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(VirtualGatewaySpecBackendDefaultsClientPolicyTlsCertificate defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable VirtualGatewaySpecBackendDefaultsClientPolicyTlsCertificateFile file;
        private @Nullable VirtualGatewaySpecBackendDefaultsClientPolicyTlsCertificateSds sds;

        public Builder() {
    	      // Empty
        }

        public Builder(VirtualGatewaySpecBackendDefaultsClientPolicyTlsCertificate defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.file = defaults.file;
    	      this.sds = defaults.sds;
        }

        public Builder setFile(@Nullable VirtualGatewaySpecBackendDefaultsClientPolicyTlsCertificateFile file) {
            this.file = file;
            return this;
        }

        public Builder setSds(@Nullable VirtualGatewaySpecBackendDefaultsClientPolicyTlsCertificateSds sds) {
            this.sds = sds;
            return this;
        }
        public VirtualGatewaySpecBackendDefaultsClientPolicyTlsCertificate build() {
            return new VirtualGatewaySpecBackendDefaultsClientPolicyTlsCertificate(file, sds);
        }
    }
}
