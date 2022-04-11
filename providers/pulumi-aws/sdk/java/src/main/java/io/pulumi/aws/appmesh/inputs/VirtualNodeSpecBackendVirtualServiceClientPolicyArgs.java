// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.appmesh.inputs;

import io.pulumi.aws.appmesh.inputs.VirtualNodeSpecBackendVirtualServiceClientPolicyTlsArgs;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import java.util.Objects;
import javax.annotation.Nullable;


public final class VirtualNodeSpecBackendVirtualServiceClientPolicyArgs extends io.pulumi.resources.ResourceArgs {

    public static final VirtualNodeSpecBackendVirtualServiceClientPolicyArgs Empty = new VirtualNodeSpecBackendVirtualServiceClientPolicyArgs();

    /**
     * The Transport Layer Security (TLS) client policy.
     * 
     */
    @Import(name="tls")
      private final @Nullable Output<VirtualNodeSpecBackendVirtualServiceClientPolicyTlsArgs> tls;

    public Output<VirtualNodeSpecBackendVirtualServiceClientPolicyTlsArgs> getTls() {
        return this.tls == null ? Codegen.empty() : this.tls;
    }

    public VirtualNodeSpecBackendVirtualServiceClientPolicyArgs(@Nullable Output<VirtualNodeSpecBackendVirtualServiceClientPolicyTlsArgs> tls) {
        this.tls = tls;
    }

    private VirtualNodeSpecBackendVirtualServiceClientPolicyArgs() {
        this.tls = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(VirtualNodeSpecBackendVirtualServiceClientPolicyArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<VirtualNodeSpecBackendVirtualServiceClientPolicyTlsArgs> tls;

        public Builder() {
    	      // Empty
        }

        public Builder(VirtualNodeSpecBackendVirtualServiceClientPolicyArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.tls = defaults.tls;
        }

        public Builder tls(@Nullable Output<VirtualNodeSpecBackendVirtualServiceClientPolicyTlsArgs> tls) {
            this.tls = tls;
            return this;
        }
        public Builder tls(@Nullable VirtualNodeSpecBackendVirtualServiceClientPolicyTlsArgs tls) {
            this.tls = Codegen.ofNullable(tls);
            return this;
        }        public VirtualNodeSpecBackendVirtualServiceClientPolicyArgs build() {
            return new VirtualNodeSpecBackendVirtualServiceClientPolicyArgs(tls);
        }
    }
}
