// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.network;

import io.pulumi.azurenative.network.inputs.VirtualNetworkTapArgs;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class NetworkInterfaceTapConfigurationArgs extends io.pulumi.resources.ResourceArgs {

    public static final NetworkInterfaceTapConfigurationArgs Empty = new NetworkInterfaceTapConfigurationArgs();

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
     * The name of the resource that is unique within a resource group. This name can be used to access the resource.
     * 
     */
    @Import(name="name")
      private final @Nullable Output<String> name;

    public Output<String> getName() {
        return this.name == null ? Output.empty() : this.name;
    }

    /**
     * The name of the network interface.
     * 
     */
    @Import(name="networkInterfaceName", required=true)
      private final Output<String> networkInterfaceName;

    public Output<String> getNetworkInterfaceName() {
        return this.networkInterfaceName;
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

    /**
     * The name of the tap configuration.
     * 
     */
    @Import(name="tapConfigurationName")
      private final @Nullable Output<String> tapConfigurationName;

    public Output<String> getTapConfigurationName() {
        return this.tapConfigurationName == null ? Output.empty() : this.tapConfigurationName;
    }

    /**
     * The reference to the Virtual Network Tap resource.
     * 
     */
    @Import(name="virtualNetworkTap")
      private final @Nullable Output<VirtualNetworkTapArgs> virtualNetworkTap;

    public Output<VirtualNetworkTapArgs> getVirtualNetworkTap() {
        return this.virtualNetworkTap == null ? Output.empty() : this.virtualNetworkTap;
    }

    public NetworkInterfaceTapConfigurationArgs(
        @Nullable Output<String> id,
        @Nullable Output<String> name,
        Output<String> networkInterfaceName,
        Output<String> resourceGroupName,
        @Nullable Output<String> tapConfigurationName,
        @Nullable Output<VirtualNetworkTapArgs> virtualNetworkTap) {
        this.id = id;
        this.name = name;
        this.networkInterfaceName = Objects.requireNonNull(networkInterfaceName, "expected parameter 'networkInterfaceName' to be non-null");
        this.resourceGroupName = Objects.requireNonNull(resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
        this.tapConfigurationName = tapConfigurationName;
        this.virtualNetworkTap = virtualNetworkTap;
    }

    private NetworkInterfaceTapConfigurationArgs() {
        this.id = Output.empty();
        this.name = Output.empty();
        this.networkInterfaceName = Output.empty();
        this.resourceGroupName = Output.empty();
        this.tapConfigurationName = Output.empty();
        this.virtualNetworkTap = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(NetworkInterfaceTapConfigurationArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<String> id;
        private @Nullable Output<String> name;
        private Output<String> networkInterfaceName;
        private Output<String> resourceGroupName;
        private @Nullable Output<String> tapConfigurationName;
        private @Nullable Output<VirtualNetworkTapArgs> virtualNetworkTap;

        public Builder() {
    	      // Empty
        }

        public Builder(NetworkInterfaceTapConfigurationArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.id = defaults.id;
    	      this.name = defaults.name;
    	      this.networkInterfaceName = defaults.networkInterfaceName;
    	      this.resourceGroupName = defaults.resourceGroupName;
    	      this.tapConfigurationName = defaults.tapConfigurationName;
    	      this.virtualNetworkTap = defaults.virtualNetworkTap;
        }

        public Builder id(@Nullable Output<String> id) {
            this.id = id;
            return this;
        }
        public Builder id(@Nullable String id) {
            this.id = Output.ofNullable(id);
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
        public Builder networkInterfaceName(Output<String> networkInterfaceName) {
            this.networkInterfaceName = Objects.requireNonNull(networkInterfaceName);
            return this;
        }
        public Builder networkInterfaceName(String networkInterfaceName) {
            this.networkInterfaceName = Output.of(Objects.requireNonNull(networkInterfaceName));
            return this;
        }
        public Builder resourceGroupName(Output<String> resourceGroupName) {
            this.resourceGroupName = Objects.requireNonNull(resourceGroupName);
            return this;
        }
        public Builder resourceGroupName(String resourceGroupName) {
            this.resourceGroupName = Output.of(Objects.requireNonNull(resourceGroupName));
            return this;
        }
        public Builder tapConfigurationName(@Nullable Output<String> tapConfigurationName) {
            this.tapConfigurationName = tapConfigurationName;
            return this;
        }
        public Builder tapConfigurationName(@Nullable String tapConfigurationName) {
            this.tapConfigurationName = Output.ofNullable(tapConfigurationName);
            return this;
        }
        public Builder virtualNetworkTap(@Nullable Output<VirtualNetworkTapArgs> virtualNetworkTap) {
            this.virtualNetworkTap = virtualNetworkTap;
            return this;
        }
        public Builder virtualNetworkTap(@Nullable VirtualNetworkTapArgs virtualNetworkTap) {
            this.virtualNetworkTap = Output.ofNullable(virtualNetworkTap);
            return this;
        }        public NetworkInterfaceTapConfigurationArgs build() {
            return new NetworkInterfaceTapConfigurationArgs(id, name, networkInterfaceName, resourceGroupName, tapConfigurationName, virtualNetworkTap);
        }
    }
}
