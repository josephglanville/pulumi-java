// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.appmesh.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;


public final class VirtualNodeSpecBackendDefaultsClientPolicyTlsCertificateFileArgs extends io.pulumi.resources.ResourceArgs {

    public static final VirtualNodeSpecBackendDefaultsClientPolicyTlsCertificateFileArgs Empty = new VirtualNodeSpecBackendDefaultsClientPolicyTlsCertificateFileArgs();

    /**
     * The certificate trust chain for a certificate stored on the file system of the mesh endpoint that the proxy is running on. Must be between 1 and 255 characters in length.
     * 
     */
    @InputImport(name="certificateChain", required=true)
      private final Output<String> certificateChain;

    public Output<String> getCertificateChain() {
        return this.certificateChain;
    }

    /**
     * The private key for a certificate stored on the file system of the virtual node that the proxy is running on. Must be between 1 and 255 characters in length.
     * 
     */
    @InputImport(name="privateKey", required=true)
      private final Output<String> privateKey;

    public Output<String> getPrivateKey() {
        return this.privateKey;
    }

    public VirtualNodeSpecBackendDefaultsClientPolicyTlsCertificateFileArgs(
        Output<String> certificateChain,
        Output<String> privateKey) {
        this.certificateChain = Objects.requireNonNull(certificateChain, "expected parameter 'certificateChain' to be non-null");
        this.privateKey = Objects.requireNonNull(privateKey, "expected parameter 'privateKey' to be non-null");
    }

    private VirtualNodeSpecBackendDefaultsClientPolicyTlsCertificateFileArgs() {
        this.certificateChain = Output.empty();
        this.privateKey = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(VirtualNodeSpecBackendDefaultsClientPolicyTlsCertificateFileArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Output<String> certificateChain;
        private Output<String> privateKey;

        public Builder() {
    	      // Empty
        }

        public Builder(VirtualNodeSpecBackendDefaultsClientPolicyTlsCertificateFileArgs defaults) {
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
        }
        public VirtualNodeSpecBackendDefaultsClientPolicyTlsCertificateFileArgs build() {
            return new VirtualNodeSpecBackendDefaultsClientPolicyTlsCertificateFileArgs(certificateChain, privateKey);
        }
    }
}
