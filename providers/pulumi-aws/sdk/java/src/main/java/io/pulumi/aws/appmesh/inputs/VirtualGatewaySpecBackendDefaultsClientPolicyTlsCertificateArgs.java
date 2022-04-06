// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.appmesh.inputs;

import io.pulumi.aws.appmesh.inputs.VirtualGatewaySpecBackendDefaultsClientPolicyTlsCertificateFileArgs;
import io.pulumi.aws.appmesh.inputs.VirtualGatewaySpecBackendDefaultsClientPolicyTlsCertificateSdsArgs;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import java.util.Objects;
import javax.annotation.Nullable;


public final class VirtualGatewaySpecBackendDefaultsClientPolicyTlsCertificateArgs extends io.pulumi.resources.ResourceArgs {

    public static final VirtualGatewaySpecBackendDefaultsClientPolicyTlsCertificateArgs Empty = new VirtualGatewaySpecBackendDefaultsClientPolicyTlsCertificateArgs();

    /**
     * A local file certificate.
     * 
     */
    @Import(name="file")
      private final @Nullable Output<VirtualGatewaySpecBackendDefaultsClientPolicyTlsCertificateFileArgs> file;

    public Output<VirtualGatewaySpecBackendDefaultsClientPolicyTlsCertificateFileArgs> getFile() {
        return this.file == null ? Output.empty() : this.file;
    }

    /**
     * A [Secret Discovery Service](https://www.envoyproxy.io/docs/envoy/latest/configuration/security/secret#secret-discovery-service-sds) certificate.
     * 
     */
    @Import(name="sds")
      private final @Nullable Output<VirtualGatewaySpecBackendDefaultsClientPolicyTlsCertificateSdsArgs> sds;

    public Output<VirtualGatewaySpecBackendDefaultsClientPolicyTlsCertificateSdsArgs> getSds() {
        return this.sds == null ? Output.empty() : this.sds;
    }

    public VirtualGatewaySpecBackendDefaultsClientPolicyTlsCertificateArgs(
        @Nullable Output<VirtualGatewaySpecBackendDefaultsClientPolicyTlsCertificateFileArgs> file,
        @Nullable Output<VirtualGatewaySpecBackendDefaultsClientPolicyTlsCertificateSdsArgs> sds) {
        this.file = file;
        this.sds = sds;
    }

    private VirtualGatewaySpecBackendDefaultsClientPolicyTlsCertificateArgs() {
        this.file = Output.empty();
        this.sds = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(VirtualGatewaySpecBackendDefaultsClientPolicyTlsCertificateArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<VirtualGatewaySpecBackendDefaultsClientPolicyTlsCertificateFileArgs> file;
        private @Nullable Output<VirtualGatewaySpecBackendDefaultsClientPolicyTlsCertificateSdsArgs> sds;

        public Builder() {
    	      // Empty
        }

        public Builder(VirtualGatewaySpecBackendDefaultsClientPolicyTlsCertificateArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.file = defaults.file;
    	      this.sds = defaults.sds;
        }

        public Builder file(@Nullable Output<VirtualGatewaySpecBackendDefaultsClientPolicyTlsCertificateFileArgs> file) {
            this.file = file;
            return this;
        }
        public Builder file(@Nullable VirtualGatewaySpecBackendDefaultsClientPolicyTlsCertificateFileArgs file) {
            this.file = Output.ofNullable(file);
            return this;
        }
        public Builder sds(@Nullable Output<VirtualGatewaySpecBackendDefaultsClientPolicyTlsCertificateSdsArgs> sds) {
            this.sds = sds;
            return this;
        }
        public Builder sds(@Nullable VirtualGatewaySpecBackendDefaultsClientPolicyTlsCertificateSdsArgs sds) {
            this.sds = Output.ofNullable(sds);
            return this;
        }        public VirtualGatewaySpecBackendDefaultsClientPolicyTlsCertificateArgs build() {
            return new VirtualGatewaySpecBackendDefaultsClientPolicyTlsCertificateArgs(file, sds);
        }
    }
}