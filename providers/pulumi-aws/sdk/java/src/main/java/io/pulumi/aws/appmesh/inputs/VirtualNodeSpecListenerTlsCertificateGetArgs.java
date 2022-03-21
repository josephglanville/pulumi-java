// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.appmesh.inputs;

import io.pulumi.aws.appmesh.inputs.VirtualNodeSpecListenerTlsCertificateAcmGetArgs;
import io.pulumi.aws.appmesh.inputs.VirtualNodeSpecListenerTlsCertificateFileGetArgs;
import io.pulumi.aws.appmesh.inputs.VirtualNodeSpecListenerTlsCertificateSdsGetArgs;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import java.util.Objects;
import javax.annotation.Nullable;


public final class VirtualNodeSpecListenerTlsCertificateGetArgs extends io.pulumi.resources.ResourceArgs {

    public static final VirtualNodeSpecListenerTlsCertificateGetArgs Empty = new VirtualNodeSpecListenerTlsCertificateGetArgs();

    /**
     * An AWS Certificate Manager (ACM) certificate.
     * 
     */
    @Import(name="acm")
      private final @Nullable Output<VirtualNodeSpecListenerTlsCertificateAcmGetArgs> acm;

    public Output<VirtualNodeSpecListenerTlsCertificateAcmGetArgs> getAcm() {
        return this.acm == null ? Output.empty() : this.acm;
    }

    /**
     * A local file certificate.
     * 
     */
    @Import(name="file")
      private final @Nullable Output<VirtualNodeSpecListenerTlsCertificateFileGetArgs> file;

    public Output<VirtualNodeSpecListenerTlsCertificateFileGetArgs> getFile() {
        return this.file == null ? Output.empty() : this.file;
    }

    /**
     * A [Secret Discovery Service](https://www.envoyproxy.io/docs/envoy/latest/configuration/security/secret#secret-discovery-service-sds) certificate.
     * 
     */
    @Import(name="sds")
      private final @Nullable Output<VirtualNodeSpecListenerTlsCertificateSdsGetArgs> sds;

    public Output<VirtualNodeSpecListenerTlsCertificateSdsGetArgs> getSds() {
        return this.sds == null ? Output.empty() : this.sds;
    }

    public VirtualNodeSpecListenerTlsCertificateGetArgs(
        @Nullable Output<VirtualNodeSpecListenerTlsCertificateAcmGetArgs> acm,
        @Nullable Output<VirtualNodeSpecListenerTlsCertificateFileGetArgs> file,
        @Nullable Output<VirtualNodeSpecListenerTlsCertificateSdsGetArgs> sds) {
        this.acm = acm;
        this.file = file;
        this.sds = sds;
    }

    private VirtualNodeSpecListenerTlsCertificateGetArgs() {
        this.acm = Output.empty();
        this.file = Output.empty();
        this.sds = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(VirtualNodeSpecListenerTlsCertificateGetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<VirtualNodeSpecListenerTlsCertificateAcmGetArgs> acm;
        private @Nullable Output<VirtualNodeSpecListenerTlsCertificateFileGetArgs> file;
        private @Nullable Output<VirtualNodeSpecListenerTlsCertificateSdsGetArgs> sds;

        public Builder() {
    	      // Empty
        }

        public Builder(VirtualNodeSpecListenerTlsCertificateGetArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.acm = defaults.acm;
    	      this.file = defaults.file;
    	      this.sds = defaults.sds;
        }

        public Builder acm(@Nullable Output<VirtualNodeSpecListenerTlsCertificateAcmGetArgs> acm) {
            this.acm = acm;
            return this;
        }
        public Builder acm(@Nullable VirtualNodeSpecListenerTlsCertificateAcmGetArgs acm) {
            this.acm = Output.ofNullable(acm);
            return this;
        }
        public Builder file(@Nullable Output<VirtualNodeSpecListenerTlsCertificateFileGetArgs> file) {
            this.file = file;
            return this;
        }
        public Builder file(@Nullable VirtualNodeSpecListenerTlsCertificateFileGetArgs file) {
            this.file = Output.ofNullable(file);
            return this;
        }
        public Builder sds(@Nullable Output<VirtualNodeSpecListenerTlsCertificateSdsGetArgs> sds) {
            this.sds = sds;
            return this;
        }
        public Builder sds(@Nullable VirtualNodeSpecListenerTlsCertificateSdsGetArgs sds) {
            this.sds = Output.ofNullable(sds);
            return this;
        }        public VirtualNodeSpecListenerTlsCertificateGetArgs build() {
            return new VirtualNodeSpecListenerTlsCertificateGetArgs(acm, file, sds);
        }
    }
}
