// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.appmesh.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


public final class VirtualNodeSpecListenerTlsCertificateAcmArgs extends io.pulumi.resources.ResourceArgs {

    public static final VirtualNodeSpecListenerTlsCertificateAcmArgs Empty = new VirtualNodeSpecListenerTlsCertificateAcmArgs();

    /**
     * The Amazon Resource Name (ARN) for the certificate.
     * 
     */
    @Import(name="certificateArn", required=true)
      private final Output<String> certificateArn;

    public Output<String> getCertificateArn() {
        return this.certificateArn;
    }

    public VirtualNodeSpecListenerTlsCertificateAcmArgs(Output<String> certificateArn) {
        this.certificateArn = Objects.requireNonNull(certificateArn, "expected parameter 'certificateArn' to be non-null");
    }

    private VirtualNodeSpecListenerTlsCertificateAcmArgs() {
        this.certificateArn = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(VirtualNodeSpecListenerTlsCertificateAcmArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Output<String> certificateArn;

        public Builder() {
    	      // Empty
        }

        public Builder(VirtualNodeSpecListenerTlsCertificateAcmArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.certificateArn = defaults.certificateArn;
        }

        public Builder certificateArn(Output<String> certificateArn) {
            this.certificateArn = Objects.requireNonNull(certificateArn);
            return this;
        }
        public Builder certificateArn(String certificateArn) {
            this.certificateArn = Output.of(Objects.requireNonNull(certificateArn));
            return this;
        }        public VirtualNodeSpecListenerTlsCertificateAcmArgs build() {
            return new VirtualNodeSpecListenerTlsCertificateAcmArgs(certificateArn);
        }
    }
}