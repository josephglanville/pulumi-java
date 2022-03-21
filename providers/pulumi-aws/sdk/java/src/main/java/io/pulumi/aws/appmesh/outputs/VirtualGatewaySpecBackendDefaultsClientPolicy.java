// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.appmesh.outputs;

import io.pulumi.aws.appmesh.outputs.VirtualGatewaySpecBackendDefaultsClientPolicyTls;
import io.pulumi.core.annotations.CustomType;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class VirtualGatewaySpecBackendDefaultsClientPolicy {
    /**
     * The Transport Layer Security (TLS) client policy.
     * 
     */
    private final @Nullable VirtualGatewaySpecBackendDefaultsClientPolicyTls tls;

    @CustomType.Constructor
    private VirtualGatewaySpecBackendDefaultsClientPolicy(@CustomType.Parameter("tls") @Nullable VirtualGatewaySpecBackendDefaultsClientPolicyTls tls) {
        this.tls = tls;
    }

    /**
     * The Transport Layer Security (TLS) client policy.
     * 
    */
    public Optional<VirtualGatewaySpecBackendDefaultsClientPolicyTls> getTls() {
        return Optional.ofNullable(this.tls);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(VirtualGatewaySpecBackendDefaultsClientPolicy defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable VirtualGatewaySpecBackendDefaultsClientPolicyTls tls;

        public Builder() {
    	      // Empty
        }

        public Builder(VirtualGatewaySpecBackendDefaultsClientPolicy defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.tls = defaults.tls;
        }

        public Builder tls(@Nullable VirtualGatewaySpecBackendDefaultsClientPolicyTls tls) {
            this.tls = tls;
            return this;
        }        public VirtualGatewaySpecBackendDefaultsClientPolicy build() {
            return new VirtualGatewaySpecBackendDefaultsClientPolicy(tls);
        }
    }
}
