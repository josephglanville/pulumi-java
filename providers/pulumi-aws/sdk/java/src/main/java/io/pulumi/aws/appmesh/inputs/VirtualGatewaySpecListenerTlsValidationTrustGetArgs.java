// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.appmesh.inputs;

import io.pulumi.aws.appmesh.inputs.VirtualGatewaySpecListenerTlsValidationTrustFileGetArgs;
import io.pulumi.aws.appmesh.inputs.VirtualGatewaySpecListenerTlsValidationTrustSdsGetArgs;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import java.util.Objects;
import javax.annotation.Nullable;


public final class VirtualGatewaySpecListenerTlsValidationTrustGetArgs extends io.pulumi.resources.ResourceArgs {

    public static final VirtualGatewaySpecListenerTlsValidationTrustGetArgs Empty = new VirtualGatewaySpecListenerTlsValidationTrustGetArgs();

    /**
     * The TLS validation context trust for a local file certificate.
     * 
     */
    @Import(name="file")
      private final @Nullable Output<VirtualGatewaySpecListenerTlsValidationTrustFileGetArgs> file;

    public Output<VirtualGatewaySpecListenerTlsValidationTrustFileGetArgs> getFile() {
        return this.file == null ? Output.empty() : this.file;
    }

    /**
     * The TLS validation context trust for a [Secret Discovery Service](https://www.envoyproxy.io/docs/envoy/latest/configuration/security/secret#secret-discovery-service-sds) certificate.
     * 
     */
    @Import(name="sds")
      private final @Nullable Output<VirtualGatewaySpecListenerTlsValidationTrustSdsGetArgs> sds;

    public Output<VirtualGatewaySpecListenerTlsValidationTrustSdsGetArgs> getSds() {
        return this.sds == null ? Output.empty() : this.sds;
    }

    public VirtualGatewaySpecListenerTlsValidationTrustGetArgs(
        @Nullable Output<VirtualGatewaySpecListenerTlsValidationTrustFileGetArgs> file,
        @Nullable Output<VirtualGatewaySpecListenerTlsValidationTrustSdsGetArgs> sds) {
        this.file = file;
        this.sds = sds;
    }

    private VirtualGatewaySpecListenerTlsValidationTrustGetArgs() {
        this.file = Output.empty();
        this.sds = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(VirtualGatewaySpecListenerTlsValidationTrustGetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<VirtualGatewaySpecListenerTlsValidationTrustFileGetArgs> file;
        private @Nullable Output<VirtualGatewaySpecListenerTlsValidationTrustSdsGetArgs> sds;

        public Builder() {
    	      // Empty
        }

        public Builder(VirtualGatewaySpecListenerTlsValidationTrustGetArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.file = defaults.file;
    	      this.sds = defaults.sds;
        }

        public Builder file(@Nullable Output<VirtualGatewaySpecListenerTlsValidationTrustFileGetArgs> file) {
            this.file = file;
            return this;
        }
        public Builder file(@Nullable VirtualGatewaySpecListenerTlsValidationTrustFileGetArgs file) {
            this.file = Output.ofNullable(file);
            return this;
        }
        public Builder sds(@Nullable Output<VirtualGatewaySpecListenerTlsValidationTrustSdsGetArgs> sds) {
            this.sds = sds;
            return this;
        }
        public Builder sds(@Nullable VirtualGatewaySpecListenerTlsValidationTrustSdsGetArgs sds) {
            this.sds = Output.ofNullable(sds);
            return this;
        }        public VirtualGatewaySpecListenerTlsValidationTrustGetArgs build() {
            return new VirtualGatewaySpecListenerTlsValidationTrustGetArgs(file, sds);
        }
    }
}