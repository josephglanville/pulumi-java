// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.container_v1beta1.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.googlenative.container_v1beta1.enums.NetworkPolicyProvider;
import java.lang.Boolean;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * Configuration options for the NetworkPolicy feature. https://kubernetes.io/docs/concepts/services-networking/networkpolicies/
 * 
 */
public final class NetworkPolicyArgs extends io.pulumi.resources.ResourceArgs {

    public static final NetworkPolicyArgs Empty = new NetworkPolicyArgs();

    /**
     * Whether network policy is enabled on the cluster.
     * 
     */
    @Import(name="enabled")
      private final @Nullable Output<Boolean> enabled;

    public Output<Boolean> getEnabled() {
        return this.enabled == null ? Output.empty() : this.enabled;
    }

    /**
     * The selected network policy provider.
     * 
     */
    @Import(name="provider")
      private final @Nullable Output<NetworkPolicyProvider> provider;

    public Output<NetworkPolicyProvider> getProvider() {
        return this.provider == null ? Output.empty() : this.provider;
    }

    public NetworkPolicyArgs(
        @Nullable Output<Boolean> enabled,
        @Nullable Output<NetworkPolicyProvider> provider) {
        this.enabled = enabled;
        this.provider = provider;
    }

    private NetworkPolicyArgs() {
        this.enabled = Output.empty();
        this.provider = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(NetworkPolicyArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<Boolean> enabled;
        private @Nullable Output<NetworkPolicyProvider> provider;

        public Builder() {
    	      // Empty
        }

        public Builder(NetworkPolicyArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.enabled = defaults.enabled;
    	      this.provider = defaults.provider;
        }

        public Builder enabled(@Nullable Output<Boolean> enabled) {
            this.enabled = enabled;
            return this;
        }
        public Builder enabled(@Nullable Boolean enabled) {
            this.enabled = Output.ofNullable(enabled);
            return this;
        }
        public Builder provider(@Nullable Output<NetworkPolicyProvider> provider) {
            this.provider = provider;
            return this;
        }
        public Builder provider(@Nullable NetworkPolicyProvider provider) {
            this.provider = Output.ofNullable(provider);
            return this;
        }        public NetworkPolicyArgs build() {
            return new NetworkPolicyArgs(enabled, provider);
        }
    }
}
