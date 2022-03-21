// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.network;

import io.pulumi.azurenative.network.inputs.Ipv6CircuitConnectionConfigArgs;
import io.pulumi.azurenative.network.inputs.SubResourceArgs;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class ExpressRouteCircuitConnectionArgs extends io.pulumi.resources.ResourceArgs {

    public static final ExpressRouteCircuitConnectionArgs Empty = new ExpressRouteCircuitConnectionArgs();

    /**
     * /29 IP address space to carve out Customer addresses for tunnels.
     * 
     */
    @Import(name="addressPrefix")
      private final @Nullable Output<String> addressPrefix;

    public Output<String> getAddressPrefix() {
        return this.addressPrefix == null ? Output.empty() : this.addressPrefix;
    }

    /**
     * The authorization key.
     * 
     */
    @Import(name="authorizationKey")
      private final @Nullable Output<String> authorizationKey;

    public Output<String> getAuthorizationKey() {
        return this.authorizationKey == null ? Output.empty() : this.authorizationKey;
    }

    /**
     * The name of the express route circuit.
     * 
     */
    @Import(name="circuitName", required=true)
      private final Output<String> circuitName;

    public Output<String> getCircuitName() {
        return this.circuitName;
    }

    /**
     * The name of the express route circuit connection.
     * 
     */
    @Import(name="connectionName")
      private final @Nullable Output<String> connectionName;

    public Output<String> getConnectionName() {
        return this.connectionName == null ? Output.empty() : this.connectionName;
    }

    /**
     * Reference to Express Route Circuit Private Peering Resource of the circuit initiating connection.
     * 
     */
    @Import(name="expressRouteCircuitPeering")
      private final @Nullable Output<SubResourceArgs> expressRouteCircuitPeering;

    public Output<SubResourceArgs> getExpressRouteCircuitPeering() {
        return this.expressRouteCircuitPeering == null ? Output.empty() : this.expressRouteCircuitPeering;
    }

    /**
     * Resource ID.
     * 
     */
    @Import(name="id")
      private final @Nullable Output<String> id;

    public Output<String> getId() {
        return this.id == null ? Output.empty() : this.id;
    }

    /**
     * IPv6 Address PrefixProperties of the express route circuit connection.
     * 
     */
    @Import(name="ipv6CircuitConnectionConfig")
      private final @Nullable Output<Ipv6CircuitConnectionConfigArgs> ipv6CircuitConnectionConfig;

    public Output<Ipv6CircuitConnectionConfigArgs> getIpv6CircuitConnectionConfig() {
        return this.ipv6CircuitConnectionConfig == null ? Output.empty() : this.ipv6CircuitConnectionConfig;
    }

    /**
     * The name of the resource that is unique within a resource group. This name can be used to access the resource.
     * 
     */
    @Import(name="name")
      private final @Nullable Output<String> name;

    public Output<String> getName() {
        return this.name == null ? Output.empty() : this.name;
    }

    /**
     * Reference to Express Route Circuit Private Peering Resource of the peered circuit.
     * 
     */
    @Import(name="peerExpressRouteCircuitPeering")
      private final @Nullable Output<SubResourceArgs> peerExpressRouteCircuitPeering;

    public Output<SubResourceArgs> getPeerExpressRouteCircuitPeering() {
        return this.peerExpressRouteCircuitPeering == null ? Output.empty() : this.peerExpressRouteCircuitPeering;
    }

    /**
     * The name of the peering.
     * 
     */
    @Import(name="peeringName", required=true)
      private final Output<String> peeringName;

    public Output<String> getPeeringName() {
        return this.peeringName;
    }

    /**
     * The name of the resource group.
     * 
     */
    @Import(name="resourceGroupName", required=true)
      private final Output<String> resourceGroupName;

    public Output<String> getResourceGroupName() {
        return this.resourceGroupName;
    }

    public ExpressRouteCircuitConnectionArgs(
        @Nullable Output<String> addressPrefix,
        @Nullable Output<String> authorizationKey,
        Output<String> circuitName,
        @Nullable Output<String> connectionName,
        @Nullable Output<SubResourceArgs> expressRouteCircuitPeering,
        @Nullable Output<String> id,
        @Nullable Output<Ipv6CircuitConnectionConfigArgs> ipv6CircuitConnectionConfig,
        @Nullable Output<String> name,
        @Nullable Output<SubResourceArgs> peerExpressRouteCircuitPeering,
        Output<String> peeringName,
        Output<String> resourceGroupName) {
        this.addressPrefix = addressPrefix;
        this.authorizationKey = authorizationKey;
        this.circuitName = Objects.requireNonNull(circuitName, "expected parameter 'circuitName' to be non-null");
        this.connectionName = connectionName;
        this.expressRouteCircuitPeering = expressRouteCircuitPeering;
        this.id = id;
        this.ipv6CircuitConnectionConfig = ipv6CircuitConnectionConfig;
        this.name = name;
        this.peerExpressRouteCircuitPeering = peerExpressRouteCircuitPeering;
        this.peeringName = Objects.requireNonNull(peeringName, "expected parameter 'peeringName' to be non-null");
        this.resourceGroupName = Objects.requireNonNull(resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
    }

    private ExpressRouteCircuitConnectionArgs() {
        this.addressPrefix = Output.empty();
        this.authorizationKey = Output.empty();
        this.circuitName = Output.empty();
        this.connectionName = Output.empty();
        this.expressRouteCircuitPeering = Output.empty();
        this.id = Output.empty();
        this.ipv6CircuitConnectionConfig = Output.empty();
        this.name = Output.empty();
        this.peerExpressRouteCircuitPeering = Output.empty();
        this.peeringName = Output.empty();
        this.resourceGroupName = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ExpressRouteCircuitConnectionArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<String> addressPrefix;
        private @Nullable Output<String> authorizationKey;
        private Output<String> circuitName;
        private @Nullable Output<String> connectionName;
        private @Nullable Output<SubResourceArgs> expressRouteCircuitPeering;
        private @Nullable Output<String> id;
        private @Nullable Output<Ipv6CircuitConnectionConfigArgs> ipv6CircuitConnectionConfig;
        private @Nullable Output<String> name;
        private @Nullable Output<SubResourceArgs> peerExpressRouteCircuitPeering;
        private Output<String> peeringName;
        private Output<String> resourceGroupName;

        public Builder() {
    	      // Empty
        }

        public Builder(ExpressRouteCircuitConnectionArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.addressPrefix = defaults.addressPrefix;
    	      this.authorizationKey = defaults.authorizationKey;
    	      this.circuitName = defaults.circuitName;
    	      this.connectionName = defaults.connectionName;
    	      this.expressRouteCircuitPeering = defaults.expressRouteCircuitPeering;
    	      this.id = defaults.id;
    	      this.ipv6CircuitConnectionConfig = defaults.ipv6CircuitConnectionConfig;
    	      this.name = defaults.name;
    	      this.peerExpressRouteCircuitPeering = defaults.peerExpressRouteCircuitPeering;
    	      this.peeringName = defaults.peeringName;
    	      this.resourceGroupName = defaults.resourceGroupName;
        }

        public Builder addressPrefix(@Nullable Output<String> addressPrefix) {
            this.addressPrefix = addressPrefix;
            return this;
        }
        public Builder addressPrefix(@Nullable String addressPrefix) {
            this.addressPrefix = Output.ofNullable(addressPrefix);
            return this;
        }
        public Builder authorizationKey(@Nullable Output<String> authorizationKey) {
            this.authorizationKey = authorizationKey;
            return this;
        }
        public Builder authorizationKey(@Nullable String authorizationKey) {
            this.authorizationKey = Output.ofNullable(authorizationKey);
            return this;
        }
        public Builder circuitName(Output<String> circuitName) {
            this.circuitName = Objects.requireNonNull(circuitName);
            return this;
        }
        public Builder circuitName(String circuitName) {
            this.circuitName = Output.of(Objects.requireNonNull(circuitName));
            return this;
        }
        public Builder connectionName(@Nullable Output<String> connectionName) {
            this.connectionName = connectionName;
            return this;
        }
        public Builder connectionName(@Nullable String connectionName) {
            this.connectionName = Output.ofNullable(connectionName);
            return this;
        }
        public Builder expressRouteCircuitPeering(@Nullable Output<SubResourceArgs> expressRouteCircuitPeering) {
            this.expressRouteCircuitPeering = expressRouteCircuitPeering;
            return this;
        }
        public Builder expressRouteCircuitPeering(@Nullable SubResourceArgs expressRouteCircuitPeering) {
            this.expressRouteCircuitPeering = Output.ofNullable(expressRouteCircuitPeering);
            return this;
        }
        public Builder id(@Nullable Output<String> id) {
            this.id = id;
            return this;
        }
        public Builder id(@Nullable String id) {
            this.id = Output.ofNullable(id);
            return this;
        }
        public Builder ipv6CircuitConnectionConfig(@Nullable Output<Ipv6CircuitConnectionConfigArgs> ipv6CircuitConnectionConfig) {
            this.ipv6CircuitConnectionConfig = ipv6CircuitConnectionConfig;
            return this;
        }
        public Builder ipv6CircuitConnectionConfig(@Nullable Ipv6CircuitConnectionConfigArgs ipv6CircuitConnectionConfig) {
            this.ipv6CircuitConnectionConfig = Output.ofNullable(ipv6CircuitConnectionConfig);
            return this;
        }
        public Builder name(@Nullable Output<String> name) {
            this.name = name;
            return this;
        }
        public Builder name(@Nullable String name) {
            this.name = Output.ofNullable(name);
            return this;
        }
        public Builder peerExpressRouteCircuitPeering(@Nullable Output<SubResourceArgs> peerExpressRouteCircuitPeering) {
            this.peerExpressRouteCircuitPeering = peerExpressRouteCircuitPeering;
            return this;
        }
        public Builder peerExpressRouteCircuitPeering(@Nullable SubResourceArgs peerExpressRouteCircuitPeering) {
            this.peerExpressRouteCircuitPeering = Output.ofNullable(peerExpressRouteCircuitPeering);
            return this;
        }
        public Builder peeringName(Output<String> peeringName) {
            this.peeringName = Objects.requireNonNull(peeringName);
            return this;
        }
        public Builder peeringName(String peeringName) {
            this.peeringName = Output.of(Objects.requireNonNull(peeringName));
            return this;
        }
        public Builder resourceGroupName(Output<String> resourceGroupName) {
            this.resourceGroupName = Objects.requireNonNull(resourceGroupName);
            return this;
        }
        public Builder resourceGroupName(String resourceGroupName) {
            this.resourceGroupName = Output.of(Objects.requireNonNull(resourceGroupName));
            return this;
        }        public ExpressRouteCircuitConnectionArgs build() {
            return new ExpressRouteCircuitConnectionArgs(addressPrefix, authorizationKey, circuitName, connectionName, expressRouteCircuitPeering, id, ipv6CircuitConnectionConfig, name, peerExpressRouteCircuitPeering, peeringName, resourceGroupName);
        }
    }
}
