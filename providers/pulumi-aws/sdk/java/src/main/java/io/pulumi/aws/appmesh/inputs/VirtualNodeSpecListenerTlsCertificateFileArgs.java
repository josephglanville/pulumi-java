// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.appmesh.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


public final class VirtualNodeSpecListenerTlsCertificateFileArgs extends io.pulumi.resources.ResourceArgs {

    public static final VirtualNodeSpecListenerTlsCertificateFileArgs Empty = new VirtualNodeSpecListenerTlsCertificateFileArgs();

    /**
     * The certificate trust chain for a certificate stored on the file system of the mesh endpoint that the proxy is running on. Must be between 1 and 255 characters in length.
     * 
     */
    @Import(name="certificateChain", required=true)
      private final Output<String> certificateChain;

    public Output<String> getCertificateChain() {
        return this.certificateChain;
    }

    /**
     * The private key for a certificate stored on the file system of the virtual node that the proxy is running on. Must be between 1 and 255 characters in length.
     * 
     */
    @Import(name="privateKey", required=true)
      private final Output<String> privateKey;

    public Output<String> getPrivateKey() {
        return this.privateKey;
    }

    public VirtualNodeSpecListenerTlsCertificateFileArgs(
        Output<String> certificateChain,
        Output<String> privateKey) {
        this.certificateChain = Objects.requireNonNull(certificateChain, "expected parameter 'certificateChain' to be non-null");
        this.privateKey = Objects.requireNonNull(privateKey, "expected parameter 'privateKey' to be non-null");
    }

    private VirtualNodeSpecListenerTlsCertificateFileArgs() {
        this.certificateChain = Output.empty();
        this.privateKey = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(VirtualNodeSpecListenerTlsCertificateFileArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Output<String> certificateChain;
        private Output<String> privateKey;

        public Builder() {
    	      // Empty
        }

        public Builder(VirtualNodeSpecListenerTlsCertificateFileArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.certificateChain = defaults.certificateChain;
    	      this.privateKey = defaults.privateKey;
        }

        public Builder certificateChain(Output<String> certificateChain) {
            this.certificateChain = Objects.requireNonNull(certificateChain);
            return this;
        }
        public Builder certificateChain(String certificateChain) {
            this.certificateChain = Output.of(Objects.requireNonNull(certificateChain));
            return this;
        }
        public Builder privateKey(Output<String> privateKey) {
            this.privateKey = Objects.requireNonNull(privateKey);
            return this;
        }
        public Builder privateKey(String privateKey) {
            this.privateKey = Output.of(Objects.requireNonNull(privateKey));
            return this;
        }        public VirtualNodeSpecListenerTlsCertificateFileArgs build() {
            return new VirtualNodeSpecListenerTlsCertificateFileArgs(certificateChain, privateKey);
        }
    }
}
