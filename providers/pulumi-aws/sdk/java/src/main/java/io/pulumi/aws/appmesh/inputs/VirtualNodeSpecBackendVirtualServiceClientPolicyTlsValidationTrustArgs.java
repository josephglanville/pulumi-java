// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.appmesh.inputs;

import io.pulumi.aws.appmesh.inputs.VirtualNodeSpecBackendVirtualServiceClientPolicyTlsValidationTrustAcmArgs;
import io.pulumi.aws.appmesh.inputs.VirtualNodeSpecBackendVirtualServiceClientPolicyTlsValidationTrustFileArgs;
import io.pulumi.aws.appmesh.inputs.VirtualNodeSpecBackendVirtualServiceClientPolicyTlsValidationTrustSdsArgs;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import java.util.Objects;
import javax.annotation.Nullable;


public final class VirtualNodeSpecBackendVirtualServiceClientPolicyTlsValidationTrustArgs extends io.pulumi.resources.ResourceArgs {

    public static final VirtualNodeSpecBackendVirtualServiceClientPolicyTlsValidationTrustArgs Empty = new VirtualNodeSpecBackendVirtualServiceClientPolicyTlsValidationTrustArgs();

    /**
     * The TLS validation context trust for an AWS Certificate Manager (ACM) certificate.
     * 
     */
    @Import(name="acm")
      private final @Nullable Output<VirtualNodeSpecBackendVirtualServiceClientPolicyTlsValidationTrustAcmArgs> acm;

    public Output<VirtualNodeSpecBackendVirtualServiceClientPolicyTlsValidationTrustAcmArgs> getAcm() {
        return this.acm == null ? Output.empty() : this.acm;
    }

    /**
     * The TLS validation context trust for a local file certificate.
     * 
     */
    @Import(name="file")
      private final @Nullable Output<VirtualNodeSpecBackendVirtualServiceClientPolicyTlsValidationTrustFileArgs> file;

    public Output<VirtualNodeSpecBackendVirtualServiceClientPolicyTlsValidationTrustFileArgs> getFile() {
        return this.file == null ? Output.empty() : this.file;
    }

    /**
     * The TLS validation context trust for a [Secret Discovery Service](https://www.envoyproxy.io/docs/envoy/latest/configuration/security/secret#secret-discovery-service-sds) certificate.
     * 
     */
    @Import(name="sds")
      private final @Nullable Output<VirtualNodeSpecBackendVirtualServiceClientPolicyTlsValidationTrustSdsArgs> sds;

    public Output<VirtualNodeSpecBackendVirtualServiceClientPolicyTlsValidationTrustSdsArgs> getSds() {
        return this.sds == null ? Output.empty() : this.sds;
    }

    public VirtualNodeSpecBackendVirtualServiceClientPolicyTlsValidationTrustArgs(
        @Nullable Output<VirtualNodeSpecBackendVirtualServiceClientPolicyTlsValidationTrustAcmArgs> acm,
        @Nullable Output<VirtualNodeSpecBackendVirtualServiceClientPolicyTlsValidationTrustFileArgs> file,
        @Nullable Output<VirtualNodeSpecBackendVirtualServiceClientPolicyTlsValidationTrustSdsArgs> sds) {
        this.acm = acm;
        this.file = file;
        this.sds = sds;
    }

    private VirtualNodeSpecBackendVirtualServiceClientPolicyTlsValidationTrustArgs() {
        this.acm = Output.empty();
        this.file = Output.empty();
        this.sds = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(VirtualNodeSpecBackendVirtualServiceClientPolicyTlsValidationTrustArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<VirtualNodeSpecBackendVirtualServiceClientPolicyTlsValidationTrustAcmArgs> acm;
        private @Nullable Output<VirtualNodeSpecBackendVirtualServiceClientPolicyTlsValidationTrustFileArgs> file;
        private @Nullable Output<VirtualNodeSpecBackendVirtualServiceClientPolicyTlsValidationTrustSdsArgs> sds;

        public Builder() {
    	      // Empty
        }

        public Builder(VirtualNodeSpecBackendVirtualServiceClientPolicyTlsValidationTrustArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.acm = defaults.acm;
    	      this.file = defaults.file;
    	      this.sds = defaults.sds;
        }

        public Builder acm(@Nullable Output<VirtualNodeSpecBackendVirtualServiceClientPolicyTlsValidationTrustAcmArgs> acm) {
            this.acm = acm;
            return this;
        }
        public Builder acm(@Nullable VirtualNodeSpecBackendVirtualServiceClientPolicyTlsValidationTrustAcmArgs acm) {
            this.acm = Output.ofNullable(acm);
            return this;
        }
        public Builder file(@Nullable Output<VirtualNodeSpecBackendVirtualServiceClientPolicyTlsValidationTrustFileArgs> file) {
            this.file = file;
            return this;
        }
        public Builder file(@Nullable VirtualNodeSpecBackendVirtualServiceClientPolicyTlsValidationTrustFileArgs file) {
            this.file = Output.ofNullable(file);
            return this;
        }
        public Builder sds(@Nullable Output<VirtualNodeSpecBackendVirtualServiceClientPolicyTlsValidationTrustSdsArgs> sds) {
            this.sds = sds;
            return this;
        }
        public Builder sds(@Nullable VirtualNodeSpecBackendVirtualServiceClientPolicyTlsValidationTrustSdsArgs sds) {
            this.sds = Output.ofNullable(sds);
            return this;
        }        public VirtualNodeSpecBackendVirtualServiceClientPolicyTlsValidationTrustArgs build() {
            return new VirtualNodeSpecBackendVirtualServiceClientPolicyTlsValidationTrustArgs(acm, file, sds);
        }
    }
}
