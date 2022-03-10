// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.appmesh.outputs;

import io.pulumi.aws.appmesh.outputs.VirtualNodeSpecBackendVirtualServiceClientPolicyTlsCertificateFile;
import io.pulumi.aws.appmesh.outputs.VirtualNodeSpecBackendVirtualServiceClientPolicyTlsCertificateSds;
import io.pulumi.core.annotations.OutputCustomType;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class VirtualNodeSpecBackendVirtualServiceClientPolicyTlsCertificate {
    /**
     * A local file certificate.
     * 
     */
    private final @Nullable VirtualNodeSpecBackendVirtualServiceClientPolicyTlsCertificateFile file;
    /**
     * A [Secret Discovery Service](https://www.envoyproxy.io/docs/envoy/latest/configuration/security/secret#secret-discovery-service-sds) certificate.
     * 
     */
    private final @Nullable VirtualNodeSpecBackendVirtualServiceClientPolicyTlsCertificateSds sds;

    @OutputCustomType.Constructor
    private VirtualNodeSpecBackendVirtualServiceClientPolicyTlsCertificate(
        @OutputCustomType.Parameter("file") @Nullable VirtualNodeSpecBackendVirtualServiceClientPolicyTlsCertificateFile file,
        @OutputCustomType.Parameter("sds") @Nullable VirtualNodeSpecBackendVirtualServiceClientPolicyTlsCertificateSds sds) {
        this.file = file;
        this.sds = sds;
    }

    /**
     * A local file certificate.
     * 
    */
    public Optional<VirtualNodeSpecBackendVirtualServiceClientPolicyTlsCertificateFile> getFile() {
        return Optional.ofNullable(this.file);
    }
    /**
     * A [Secret Discovery Service](https://www.envoyproxy.io/docs/envoy/latest/configuration/security/secret#secret-discovery-service-sds) certificate.
     * 
    */
    public Optional<VirtualNodeSpecBackendVirtualServiceClientPolicyTlsCertificateSds> getSds() {
        return Optional.ofNullable(this.sds);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(VirtualNodeSpecBackendVirtualServiceClientPolicyTlsCertificate defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable VirtualNodeSpecBackendVirtualServiceClientPolicyTlsCertificateFile file;
        private @Nullable VirtualNodeSpecBackendVirtualServiceClientPolicyTlsCertificateSds sds;

        public Builder() {
    	      // Empty
        }

        public Builder(VirtualNodeSpecBackendVirtualServiceClientPolicyTlsCertificate defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.file = defaults.file;
    	      this.sds = defaults.sds;
        }

        public Builder setFile(@Nullable VirtualNodeSpecBackendVirtualServiceClientPolicyTlsCertificateFile file) {
            this.file = file;
            return this;
        }

        public Builder setSds(@Nullable VirtualNodeSpecBackendVirtualServiceClientPolicyTlsCertificateSds sds) {
            this.sds = sds;
            return this;
        }
        public VirtualNodeSpecBackendVirtualServiceClientPolicyTlsCertificate build() {
            return new VirtualNodeSpecBackendVirtualServiceClientPolicyTlsCertificate(file, sds);
        }
    }
}
