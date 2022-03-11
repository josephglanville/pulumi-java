// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.appmesh.inputs;

import io.pulumi.aws.appmesh.inputs.VirtualNodeSpecBackendDefaultsClientPolicyTlsArgs;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.InputImport;
import java.util.Objects;
import javax.annotation.Nullable;


public final class VirtualNodeSpecBackendDefaultsClientPolicyArgs extends io.pulumi.resources.ResourceArgs {

    public static final VirtualNodeSpecBackendDefaultsClientPolicyArgs Empty = new VirtualNodeSpecBackendDefaultsClientPolicyArgs();

    /**
     * The Transport Layer Security (TLS) client policy.
     * 
     */
    @InputImport(name="tls")
      private final @Nullable Output<VirtualNodeSpecBackendDefaultsClientPolicyTlsArgs> tls;

    public Output<VirtualNodeSpecBackendDefaultsClientPolicyTlsArgs> getTls() {
        return this.tls == null ? Output.empty() : this.tls;
    }

    public VirtualNodeSpecBackendDefaultsClientPolicyArgs(@Nullable Output<VirtualNodeSpecBackendDefaultsClientPolicyTlsArgs> tls) {
        this.tls = tls;
    }

    private VirtualNodeSpecBackendDefaultsClientPolicyArgs() {
        this.tls = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(VirtualNodeSpecBackendDefaultsClientPolicyArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<VirtualNodeSpecBackendDefaultsClientPolicyTlsArgs> tls;

        public Builder() {
    	      // Empty
        }

        public Builder(VirtualNodeSpecBackendDefaultsClientPolicyArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.tls = defaults.tls;
        }

        public Builder tls(@Nullable Output<VirtualNodeSpecBackendDefaultsClientPolicyTlsArgs> tls) {
            this.tls = tls;
            return this;
        }

        public Builder tls(@Nullable VirtualNodeSpecBackendDefaultsClientPolicyTlsArgs tls) {
            this.tls = Output.ofNullable(tls);
            return this;
        }
        public VirtualNodeSpecBackendDefaultsClientPolicyArgs build() {
            return new VirtualNodeSpecBackendDefaultsClientPolicyArgs(tls);
        }
    }
}
