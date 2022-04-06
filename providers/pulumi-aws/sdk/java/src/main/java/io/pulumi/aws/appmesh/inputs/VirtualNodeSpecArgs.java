// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.appmesh.inputs;

import io.pulumi.aws.appmesh.inputs.VirtualNodeSpecBackendArgs;
import io.pulumi.aws.appmesh.inputs.VirtualNodeSpecBackendDefaultsArgs;
import io.pulumi.aws.appmesh.inputs.VirtualNodeSpecListenerArgs;
import io.pulumi.aws.appmesh.inputs.VirtualNodeSpecLoggingArgs;
import io.pulumi.aws.appmesh.inputs.VirtualNodeSpecServiceDiscoveryArgs;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


public final class VirtualNodeSpecArgs extends io.pulumi.resources.ResourceArgs {

    public static final VirtualNodeSpecArgs Empty = new VirtualNodeSpecArgs();

    /**
     * The defaults for backends.
     * 
     */
    @Import(name="backendDefaults")
      private final @Nullable Output<VirtualNodeSpecBackendDefaultsArgs> backendDefaults;

    public Output<VirtualNodeSpecBackendDefaultsArgs> getBackendDefaults() {
        return this.backendDefaults == null ? Output.empty() : this.backendDefaults;
    }

    /**
     * The backends to which the virtual node is expected to send outbound traffic.
     * 
     */
    @Import(name="backends")
      private final @Nullable Output<List<VirtualNodeSpecBackendArgs>> backends;

    public Output<List<VirtualNodeSpecBackendArgs>> getBackends() {
        return this.backends == null ? Output.empty() : this.backends;
    }

    /**
     * The listeners from which the virtual node is expected to receive inbound traffic.
     * 
     */
    @Import(name="listener")
      private final @Nullable Output<VirtualNodeSpecListenerArgs> listener;

    public Output<VirtualNodeSpecListenerArgs> getListener() {
        return this.listener == null ? Output.empty() : this.listener;
    }

    /**
     * The inbound and outbound access logging information for the virtual node.
     * 
     */
    @Import(name="logging")
      private final @Nullable Output<VirtualNodeSpecLoggingArgs> logging;

    public Output<VirtualNodeSpecLoggingArgs> getLogging() {
        return this.logging == null ? Output.empty() : this.logging;
    }

    /**
     * The service discovery information for the virtual node.
     * 
     */
    @Import(name="serviceDiscovery")
      private final @Nullable Output<VirtualNodeSpecServiceDiscoveryArgs> serviceDiscovery;

    public Output<VirtualNodeSpecServiceDiscoveryArgs> getServiceDiscovery() {
        return this.serviceDiscovery == null ? Output.empty() : this.serviceDiscovery;
    }

    public VirtualNodeSpecArgs(
        @Nullable Output<VirtualNodeSpecBackendDefaultsArgs> backendDefaults,
        @Nullable Output<List<VirtualNodeSpecBackendArgs>> backends,
        @Nullable Output<VirtualNodeSpecListenerArgs> listener,
        @Nullable Output<VirtualNodeSpecLoggingArgs> logging,
        @Nullable Output<VirtualNodeSpecServiceDiscoveryArgs> serviceDiscovery) {
        this.backendDefaults = backendDefaults;
        this.backends = backends;
        this.listener = listener;
        this.logging = logging;
        this.serviceDiscovery = serviceDiscovery;
    }

    private VirtualNodeSpecArgs() {
        this.backendDefaults = Output.empty();
        this.backends = Output.empty();
        this.listener = Output.empty();
        this.logging = Output.empty();
        this.serviceDiscovery = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(VirtualNodeSpecArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<VirtualNodeSpecBackendDefaultsArgs> backendDefaults;
        private @Nullable Output<List<VirtualNodeSpecBackendArgs>> backends;
        private @Nullable Output<VirtualNodeSpecListenerArgs> listener;
        private @Nullable Output<VirtualNodeSpecLoggingArgs> logging;
        private @Nullable Output<VirtualNodeSpecServiceDiscoveryArgs> serviceDiscovery;

        public Builder() {
    	      // Empty
        }

        public Builder(VirtualNodeSpecArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.backendDefaults = defaults.backendDefaults;
    	      this.backends = defaults.backends;
    	      this.listener = defaults.listener;
    	      this.logging = defaults.logging;
    	      this.serviceDiscovery = defaults.serviceDiscovery;
        }

        public Builder backendDefaults(@Nullable Output<VirtualNodeSpecBackendDefaultsArgs> backendDefaults) {
            this.backendDefaults = backendDefaults;
            return this;
        }
        public Builder backendDefaults(@Nullable VirtualNodeSpecBackendDefaultsArgs backendDefaults) {
            this.backendDefaults = Output.ofNullable(backendDefaults);
            return this;
        }
        public Builder backends(@Nullable Output<List<VirtualNodeSpecBackendArgs>> backends) {
            this.backends = backends;
            return this;
        }
        public Builder backends(@Nullable List<VirtualNodeSpecBackendArgs> backends) {
            this.backends = Output.ofNullable(backends);
            return this;
        }
        public Builder backends(VirtualNodeSpecBackendArgs... backends) {
            return backends(List.of(backends));
        }
        public Builder listener(@Nullable Output<VirtualNodeSpecListenerArgs> listener) {
            this.listener = listener;
            return this;
        }
        public Builder listener(@Nullable VirtualNodeSpecListenerArgs listener) {
            this.listener = Output.ofNullable(listener);
            return this;
        }
        public Builder logging(@Nullable Output<VirtualNodeSpecLoggingArgs> logging) {
            this.logging = logging;
            return this;
        }
        public Builder logging(@Nullable VirtualNodeSpecLoggingArgs logging) {
            this.logging = Output.ofNullable(logging);
            return this;
        }
        public Builder serviceDiscovery(@Nullable Output<VirtualNodeSpecServiceDiscoveryArgs> serviceDiscovery) {
            this.serviceDiscovery = serviceDiscovery;
            return this;
        }
        public Builder serviceDiscovery(@Nullable VirtualNodeSpecServiceDiscoveryArgs serviceDiscovery) {
            this.serviceDiscovery = Output.ofNullable(serviceDiscovery);
            return this;
        }        public VirtualNodeSpecArgs build() {
            return new VirtualNodeSpecArgs(backendDefaults, backends, listener, logging, serviceDiscovery);
        }
    }
}