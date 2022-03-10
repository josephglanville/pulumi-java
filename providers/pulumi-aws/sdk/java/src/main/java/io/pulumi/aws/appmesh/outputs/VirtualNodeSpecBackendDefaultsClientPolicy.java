// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.appmesh.outputs;

import io.pulumi.aws.appmesh.outputs.VirtualNodeSpecBackendDefaultsClientPolicyTls;
import io.pulumi.core.annotations.OutputCustomType;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class VirtualNodeSpecBackendDefaultsClientPolicy {
    /**
     * The Transport Layer Security (TLS) client policy.
     * 
     */
    private final @Nullable VirtualNodeSpecBackendDefaultsClientPolicyTls tls;

    @OutputCustomType.Constructor
    private VirtualNodeSpecBackendDefaultsClientPolicy(@OutputCustomType.Parameter("tls") @Nullable VirtualNodeSpecBackendDefaultsClientPolicyTls tls) {
        this.tls = tls;
    }

    /**
     * The Transport Layer Security (TLS) client policy.
     * 
    */
    public Optional<VirtualNodeSpecBackendDefaultsClientPolicyTls> getTls() {
        return Optional.ofNullable(this.tls);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(VirtualNodeSpecBackendDefaultsClientPolicy defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable VirtualNodeSpecBackendDefaultsClientPolicyTls tls;

        public Builder() {
    	      // Empty
        }

        public Builder(VirtualNodeSpecBackendDefaultsClientPolicy defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.tls = defaults.tls;
        }

        public Builder setTls(@Nullable VirtualNodeSpecBackendDefaultsClientPolicyTls tls) {
            this.tls = tls;
            return this;
        }
        public VirtualNodeSpecBackendDefaultsClientPolicy build() {
            return new VirtualNodeSpecBackendDefaultsClientPolicy(tls);
        }
    }
}
