// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.appmesh.inputs;

import io.pulumi.aws.appmesh.inputs.VirtualGatewaySpecBackendDefaultsClientPolicyTlsCertificateFileGetArgs;
import io.pulumi.aws.appmesh.inputs.VirtualGatewaySpecBackendDefaultsClientPolicyTlsCertificateSdsGetArgs;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import java.util.Objects;
import javax.annotation.Nullable;


public final class VirtualGatewaySpecBackendDefaultsClientPolicyTlsCertificateGetArgs extends io.pulumi.resources.ResourceArgs {

    public static final VirtualGatewaySpecBackendDefaultsClientPolicyTlsCertificateGetArgs Empty = new VirtualGatewaySpecBackendDefaultsClientPolicyTlsCertificateGetArgs();

    /**
     * A local file certificate.
     * 
     */
    @Import(name="file")
      private final @Nullable Output<VirtualGatewaySpecBackendDefaultsClientPolicyTlsCertificateFileGetArgs> file;

    public Output<VirtualGatewaySpecBackendDefaultsClientPolicyTlsCertificateFileGetArgs> getFile() {
        return this.file == null ? Output.empty() : this.file;
    }

    /**
     * A [Secret Discovery Service](https://www.envoyproxy.io/docs/envoy/latest/configuration/security/secret#secret-discovery-service-sds) certificate.
     * 
     */
    @Import(name="sds")
      private final @Nullable Output<VirtualGatewaySpecBackendDefaultsClientPolicyTlsCertificateSdsGetArgs> sds;

    public Output<VirtualGatewaySpecBackendDefaultsClientPolicyTlsCertificateSdsGetArgs> getSds() {
        return this.sds == null ? Output.empty() : this.sds;
    }

    public VirtualGatewaySpecBackendDefaultsClientPolicyTlsCertificateGetArgs(
        @Nullable Output<VirtualGatewaySpecBackendDefaultsClientPolicyTlsCertificateFileGetArgs> file,
        @Nullable Output<VirtualGatewaySpecBackendDefaultsClientPolicyTlsCertificateSdsGetArgs> sds) {
        this.file = file;
        this.sds = sds;
    }

    private VirtualGatewaySpecBackendDefaultsClientPolicyTlsCertificateGetArgs() {
        this.file = Output.empty();
        this.sds = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(VirtualGatewaySpecBackendDefaultsClientPolicyTlsCertificateGetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<VirtualGatewaySpecBackendDefaultsClientPolicyTlsCertificateFileGetArgs> file;
        private @Nullable Output<VirtualGatewaySpecBackendDefaultsClientPolicyTlsCertificateSdsGetArgs> sds;

        public Builder() {
    	      // Empty
        }

        public Builder(VirtualGatewaySpecBackendDefaultsClientPolicyTlsCertificateGetArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.file = defaults.file;
    	      this.sds = defaults.sds;
        }

        public Builder file(@Nullable Output<VirtualGatewaySpecBackendDefaultsClientPolicyTlsCertificateFileGetArgs> file) {
            this.file = file;
            return this;
        }
        public Builder file(@Nullable VirtualGatewaySpecBackendDefaultsClientPolicyTlsCertificateFileGetArgs file) {
            this.file = Output.ofNullable(file);
            return this;
        }
        public Builder sds(@Nullable Output<VirtualGatewaySpecBackendDefaultsClientPolicyTlsCertificateSdsGetArgs> sds) {
            this.sds = sds;
            return this;
        }
        public Builder sds(@Nullable VirtualGatewaySpecBackendDefaultsClientPolicyTlsCertificateSdsGetArgs sds) {
            this.sds = Output.ofNullable(sds);
            return this;
        }        public VirtualGatewaySpecBackendDefaultsClientPolicyTlsCertificateGetArgs build() {
            return new VirtualGatewaySpecBackendDefaultsClientPolicyTlsCertificateGetArgs(file, sds);
        }
    }
}