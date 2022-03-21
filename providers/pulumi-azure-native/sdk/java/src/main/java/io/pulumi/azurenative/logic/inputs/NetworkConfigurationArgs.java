// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.logic.inputs;

import io.pulumi.azurenative.logic.inputs.IntegrationServiceEnvironmentAccessEndpointArgs;
import io.pulumi.azurenative.logic.inputs.ResourceReferenceArgs;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * The network configuration.
 * 
 */
public final class NetworkConfigurationArgs extends io.pulumi.resources.ResourceArgs {

    public static final NetworkConfigurationArgs Empty = new NetworkConfigurationArgs();

    /**
     * The access endpoint.
     * 
     */
    @Import(name="accessEndpoint")
      private final @Nullable Output<IntegrationServiceEnvironmentAccessEndpointArgs> accessEndpoint;

    public Output<IntegrationServiceEnvironmentAccessEndpointArgs> getAccessEndpoint() {
        return this.accessEndpoint == null ? Output.empty() : this.accessEndpoint;
    }

    /**
     * The subnets.
     * 
     */
    @Import(name="subnets")
      private final @Nullable Output<List<ResourceReferenceArgs>> subnets;

    public Output<List<ResourceReferenceArgs>> getSubnets() {
        return this.subnets == null ? Output.empty() : this.subnets;
    }

    /**
     * Gets the virtual network address space.
     * 
     */
    @Import(name="virtualNetworkAddressSpace")
      private final @Nullable Output<String> virtualNetworkAddressSpace;

    public Output<String> getVirtualNetworkAddressSpace() {
        return this.virtualNetworkAddressSpace == null ? Output.empty() : this.virtualNetworkAddressSpace;
    }

    public NetworkConfigurationArgs(
        @Nullable Output<IntegrationServiceEnvironmentAccessEndpointArgs> accessEndpoint,
        @Nullable Output<List<ResourceReferenceArgs>> subnets,
        @Nullable Output<String> virtualNetworkAddressSpace) {
        this.accessEndpoint = accessEndpoint;
        this.subnets = subnets;
        this.virtualNetworkAddressSpace = virtualNetworkAddressSpace;
    }

    private NetworkConfigurationArgs() {
        this.accessEndpoint = Output.empty();
        this.subnets = Output.empty();
        this.virtualNetworkAddressSpace = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(NetworkConfigurationArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<IntegrationServiceEnvironmentAccessEndpointArgs> accessEndpoint;
        private @Nullable Output<List<ResourceReferenceArgs>> subnets;
        private @Nullable Output<String> virtualNetworkAddressSpace;

        public Builder() {
    	      // Empty
        }

        public Builder(NetworkConfigurationArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.accessEndpoint = defaults.accessEndpoint;
    	      this.subnets = defaults.subnets;
    	      this.virtualNetworkAddressSpace = defaults.virtualNetworkAddressSpace;
        }

        public Builder accessEndpoint(@Nullable Output<IntegrationServiceEnvironmentAccessEndpointArgs> accessEndpoint) {
            this.accessEndpoint = accessEndpoint;
            return this;
        }
        public Builder accessEndpoint(@Nullable IntegrationServiceEnvironmentAccessEndpointArgs accessEndpoint) {
            this.accessEndpoint = Output.ofNullable(accessEndpoint);
            return this;
        }
        public Builder subnets(@Nullable Output<List<ResourceReferenceArgs>> subnets) {
            this.subnets = subnets;
            return this;
        }
        public Builder subnets(@Nullable List<ResourceReferenceArgs> subnets) {
            this.subnets = Output.ofNullable(subnets);
            return this;
        }
        public Builder subnets(ResourceReferenceArgs... subnets) {
            return subnets(List.of(subnets));
        }
        public Builder virtualNetworkAddressSpace(@Nullable Output<String> virtualNetworkAddressSpace) {
            this.virtualNetworkAddressSpace = virtualNetworkAddressSpace;
            return this;
        }
        public Builder virtualNetworkAddressSpace(@Nullable String virtualNetworkAddressSpace) {
            this.virtualNetworkAddressSpace = Output.ofNullable(virtualNetworkAddressSpace);
            return this;
        }        public NetworkConfigurationArgs build() {
            return new NetworkConfigurationArgs(accessEndpoint, subnets, virtualNetworkAddressSpace);
        }
    }
}
