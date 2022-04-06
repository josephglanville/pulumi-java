// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.appmesh.inputs;

import io.pulumi.aws.appmesh.inputs.VirtualGatewaySpecBackendDefaultsClientPolicyTlsGetArgs;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import java.util.Objects;
import javax.annotation.Nullable;


public final class VirtualGatewaySpecBackendDefaultsClientPolicyGetArgs extends io.pulumi.resources.ResourceArgs {

    public static final VirtualGatewaySpecBackendDefaultsClientPolicyGetArgs Empty = new VirtualGatewaySpecBackendDefaultsClientPolicyGetArgs();

    /**
     * The Transport Layer Security (TLS) client policy.
     * 
     */
    @Import(name="tls")
      private final @Nullable Output<VirtualGatewaySpecBackendDefaultsClientPolicyTlsGetArgs> tls;

    public Output<VirtualGatewaySpecBackendDefaultsClientPolicyTlsGetArgs> getTls() {
        return this.tls == null ? Output.empty() : this.tls;
    }

    public VirtualGatewaySpecBackendDefaultsClientPolicyGetArgs(@Nullable Output<VirtualGatewaySpecBackendDefaultsClientPolicyTlsGetArgs> tls) {
        this.tls = tls;
    }

    private VirtualGatewaySpecBackendDefaultsClientPolicyGetArgs() {
        this.tls = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(VirtualGatewaySpecBackendDefaultsClientPolicyGetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<VirtualGatewaySpecBackendDefaultsClientPolicyTlsGetArgs> tls;

        public Builder() {
    	      // Empty
        }

        public Builder(VirtualGatewaySpecBackendDefaultsClientPolicyGetArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.tls = defaults.tls;
        }

        public Builder tls(@Nullable Output<VirtualGatewaySpecBackendDefaultsClientPolicyTlsGetArgs> tls) {
            this.tls = tls;
            return this;
        }
        public Builder tls(@Nullable VirtualGatewaySpecBackendDefaultsClientPolicyTlsGetArgs tls) {
            this.tls = Output.ofNullable(tls);
            return this;
        }        public VirtualGatewaySpecBackendDefaultsClientPolicyGetArgs build() {
            return new VirtualGatewaySpecBackendDefaultsClientPolicyGetArgs(tls);
        }
    }
}