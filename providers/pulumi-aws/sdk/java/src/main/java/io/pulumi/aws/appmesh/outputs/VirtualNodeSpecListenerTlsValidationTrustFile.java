// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.appmesh.outputs;

import io.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class VirtualNodeSpecListenerTlsValidationTrustFile {
    /**
     * The certificate trust chain for a certificate stored on the file system of the mesh endpoint that the proxy is running on. Must be between 1 and 255 characters in length.
     * 
     */
    private final String certificateChain;

    @CustomType.Constructor
    private VirtualNodeSpecListenerTlsValidationTrustFile(@CustomType.Parameter("certificateChain") String certificateChain) {
        this.certificateChain = certificateChain;
    }

    /**
     * The certificate trust chain for a certificate stored on the file system of the mesh endpoint that the proxy is running on. Must be between 1 and 255 characters in length.
     * 
    */
    public String getCertificateChain() {
        return this.certificateChain;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(VirtualNodeSpecListenerTlsValidationTrustFile defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String certificateChain;

        public Builder() {
    	      // Empty
        }

        public Builder(VirtualNodeSpecListenerTlsValidationTrustFile defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.certificateChain = defaults.certificateChain;
        }

        public Builder certificateChain(String certificateChain) {
            this.certificateChain = Objects.requireNonNull(certificateChain);
            return this;
        }        public VirtualNodeSpecListenerTlsValidationTrustFile build() {
            return new VirtualNodeSpecListenerTlsValidationTrustFile(certificateChain);
        }
    }
}
