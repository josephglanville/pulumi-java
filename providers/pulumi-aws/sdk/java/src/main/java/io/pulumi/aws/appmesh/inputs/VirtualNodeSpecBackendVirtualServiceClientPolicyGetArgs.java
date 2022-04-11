// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.appmesh.inputs;

import io.pulumi.aws.appmesh.inputs.VirtualNodeSpecBackendVirtualServiceClientPolicyTlsGetArgs;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import java.util.Objects;
import javax.annotation.Nullable;


public final class VirtualNodeSpecBackendVirtualServiceClientPolicyGetArgs extends io.pulumi.resources.ResourceArgs {

    public static final VirtualNodeSpecBackendVirtualServiceClientPolicyGetArgs Empty = new VirtualNodeSpecBackendVirtualServiceClientPolicyGetArgs();

    /**
     * The Transport Layer Security (TLS) client policy.
     * 
     */
    @Import(name="tls")
      private final @Nullable Output<VirtualNodeSpecBackendVirtualServiceClientPolicyTlsGetArgs> tls;

    public Output<VirtualNodeSpecBackendVirtualServiceClientPolicyTlsGetArgs> getTls() {
        return this.tls == null ? Codegen.empty() : this.tls;
    }

    public VirtualNodeSpecBackendVirtualServiceClientPolicyGetArgs(@Nullable Output<VirtualNodeSpecBackendVirtualServiceClientPolicyTlsGetArgs> tls) {
        this.tls = tls;
    }

    private VirtualNodeSpecBackendVirtualServiceClientPolicyGetArgs() {
        this.tls = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(VirtualNodeSpecBackendVirtualServiceClientPolicyGetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<VirtualNodeSpecBackendVirtualServiceClientPolicyTlsGetArgs> tls;

        public Builder() {
    	      // Empty
        }

        public Builder(VirtualNodeSpecBackendVirtualServiceClientPolicyGetArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.tls = defaults.tls;
        }

        public Builder tls(@Nullable Output<VirtualNodeSpecBackendVirtualServiceClientPolicyTlsGetArgs> tls) {
            this.tls = tls;
            return this;
        }
        public Builder tls(@Nullable VirtualNodeSpecBackendVirtualServiceClientPolicyTlsGetArgs tls) {
            this.tls = Codegen.ofNullable(tls);
            return this;
        }        public VirtualNodeSpecBackendVirtualServiceClientPolicyGetArgs build() {
            return new VirtualNodeSpecBackendVirtualServiceClientPolicyGetArgs(tls);
        }
    }
}
