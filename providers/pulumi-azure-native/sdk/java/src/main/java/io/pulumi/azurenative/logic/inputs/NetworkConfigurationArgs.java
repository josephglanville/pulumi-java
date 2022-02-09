// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.logic.inputs;

import io.pulumi.azurenative.logic.inputs.IntegrationServiceEnvironmentAccessEndpointArgs;
import io.pulumi.azurenative.logic.inputs.ResourceReferenceArgs;
import io.pulumi.core.Input;
import io.pulumi.core.internal.annotations.InputImport;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


public final class NetworkConfigurationArgs extends io.pulumi.resources.ResourceArgs {

    public static final NetworkConfigurationArgs Empty = new NetworkConfigurationArgs();

    @InputImport(name="accessEndpoint")
    private final @Nullable Input<IntegrationServiceEnvironmentAccessEndpointArgs> accessEndpoint;

    public Input<IntegrationServiceEnvironmentAccessEndpointArgs> getAccessEndpoint() {
        return this.accessEndpoint == null ? Input.empty() : this.accessEndpoint;
    }

    @InputImport(name="subnets")
    private final @Nullable Input<List<ResourceReferenceArgs>> subnets;

    public Input<List<ResourceReferenceArgs>> getSubnets() {
        return this.subnets == null ? Input.empty() : this.subnets;
    }

    @InputImport(name="virtualNetworkAddressSpace")
    private final @Nullable Input<String> virtualNetworkAddressSpace;

    public Input<String> getVirtualNetworkAddressSpace() {
        return this.virtualNetworkAddressSpace == null ? Input.empty() : this.virtualNetworkAddressSpace;
    }

    public NetworkConfigurationArgs(
        @Nullable Input<IntegrationServiceEnvironmentAccessEndpointArgs> accessEndpoint,
        @Nullable Input<List<ResourceReferenceArgs>> subnets,
        @Nullable Input<String> virtualNetworkAddressSpace) {
        this.accessEndpoint = accessEndpoint;
        this.subnets = subnets;
        this.virtualNetworkAddressSpace = virtualNetworkAddressSpace;
    }

    private NetworkConfigurationArgs() {
        this.accessEndpoint = Input.empty();
        this.subnets = Input.empty();
        this.virtualNetworkAddressSpace = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(NetworkConfigurationArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<IntegrationServiceEnvironmentAccessEndpointArgs> accessEndpoint;
        private @Nullable Input<List<ResourceReferenceArgs>> subnets;
        private @Nullable Input<String> virtualNetworkAddressSpace;

        public Builder() {
    	      // Empty
        }

        public Builder(NetworkConfigurationArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.accessEndpoint = defaults.accessEndpoint;
    	      this.subnets = defaults.subnets;
    	      this.virtualNetworkAddressSpace = defaults.virtualNetworkAddressSpace;
        }

        public Builder setAccessEndpoint(@Nullable Input<IntegrationServiceEnvironmentAccessEndpointArgs> accessEndpoint) {
            this.accessEndpoint = accessEndpoint;
            return this;
        }

        public Builder setAccessEndpoint(@Nullable IntegrationServiceEnvironmentAccessEndpointArgs accessEndpoint) {
            this.accessEndpoint = Input.ofNullable(accessEndpoint);
            return this;
        }

        public Builder setSubnets(@Nullable Input<List<ResourceReferenceArgs>> subnets) {
            this.subnets = subnets;
            return this;
        }

        public Builder setSubnets(@Nullable List<ResourceReferenceArgs> subnets) {
            this.subnets = Input.ofNullable(subnets);
            return this;
        }

        public Builder setVirtualNetworkAddressSpace(@Nullable Input<String> virtualNetworkAddressSpace) {
            this.virtualNetworkAddressSpace = virtualNetworkAddressSpace;
            return this;
        }

        public Builder setVirtualNetworkAddressSpace(@Nullable String virtualNetworkAddressSpace) {
            this.virtualNetworkAddressSpace = Input.ofNullable(virtualNetworkAddressSpace);
            return this;
        }

        public NetworkConfigurationArgs build() {
            return new NetworkConfigurationArgs(accessEndpoint, subnets, virtualNetworkAddressSpace);
        }
    }
}
