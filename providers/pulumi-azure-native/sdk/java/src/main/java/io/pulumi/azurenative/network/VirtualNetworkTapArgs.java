// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.network;

import io.pulumi.azurenative.network.inputs.FrontendIPConfigurationArgs;
import io.pulumi.azurenative.network.inputs.NetworkInterfaceIPConfigurationArgs;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import java.lang.Integer;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import javax.annotation.Nullable;


public final class VirtualNetworkTapArgs extends io.pulumi.resources.ResourceArgs {

    public static final VirtualNetworkTapArgs Empty = new VirtualNetworkTapArgs();

    /**
     * The reference to the private IP address on the internal Load Balancer that will receive the tap.
     * 
     */
    @Import(name="destinationLoadBalancerFrontEndIPConfiguration")
      private final @Nullable Output<FrontendIPConfigurationArgs> destinationLoadBalancerFrontEndIPConfiguration;

    public Output<FrontendIPConfigurationArgs> getDestinationLoadBalancerFrontEndIPConfiguration() {
        return this.destinationLoadBalancerFrontEndIPConfiguration == null ? Output.empty() : this.destinationLoadBalancerFrontEndIPConfiguration;
    }

    /**
     * The reference to the private IP Address of the collector nic that will receive the tap.
     * 
     */
    @Import(name="destinationNetworkInterfaceIPConfiguration")
      private final @Nullable Output<NetworkInterfaceIPConfigurationArgs> destinationNetworkInterfaceIPConfiguration;

    public Output<NetworkInterfaceIPConfigurationArgs> getDestinationNetworkInterfaceIPConfiguration() {
        return this.destinationNetworkInterfaceIPConfiguration == null ? Output.empty() : this.destinationNetworkInterfaceIPConfiguration;
    }

    /**
     * The VXLAN destination port that will receive the tapped traffic.
     * 
     */
    @Import(name="destinationPort")
      private final @Nullable Output<Integer> destinationPort;

    public Output<Integer> getDestinationPort() {
        return this.destinationPort == null ? Output.empty() : this.destinationPort;
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
     * Resource location.
     * 
     */
    @Import(name="location")
      private final @Nullable Output<String> location;

    public Output<String> getLocation() {
        return this.location == null ? Output.empty() : this.location;
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
     * Resource tags.
     * 
     */
    @Import(name="tags")
      private final @Nullable Output<Map<String,String>> tags;

    public Output<Map<String,String>> getTags() {
        return this.tags == null ? Output.empty() : this.tags;
    }

    /**
     * The name of the virtual network tap.
     * 
     */
    @Import(name="tapName")
      private final @Nullable Output<String> tapName;

    public Output<String> getTapName() {
        return this.tapName == null ? Output.empty() : this.tapName;
    }

    public VirtualNetworkTapArgs(
        @Nullable Output<FrontendIPConfigurationArgs> destinationLoadBalancerFrontEndIPConfiguration,
        @Nullable Output<NetworkInterfaceIPConfigurationArgs> destinationNetworkInterfaceIPConfiguration,
        @Nullable Output<Integer> destinationPort,
        @Nullable Output<String> id,
        @Nullable Output<String> location,
        Output<String> resourceGroupName,
        @Nullable Output<Map<String,String>> tags,
        @Nullable Output<String> tapName) {
        this.destinationLoadBalancerFrontEndIPConfiguration = destinationLoadBalancerFrontEndIPConfiguration;
        this.destinationNetworkInterfaceIPConfiguration = destinationNetworkInterfaceIPConfiguration;
        this.destinationPort = destinationPort;
        this.id = id;
        this.location = location;
        this.resourceGroupName = Objects.requireNonNull(resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
        this.tags = tags;
        this.tapName = tapName;
    }

    private VirtualNetworkTapArgs() {
        this.destinationLoadBalancerFrontEndIPConfiguration = Output.empty();
        this.destinationNetworkInterfaceIPConfiguration = Output.empty();
        this.destinationPort = Output.empty();
        this.id = Output.empty();
        this.location = Output.empty();
        this.resourceGroupName = Output.empty();
        this.tags = Output.empty();
        this.tapName = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(VirtualNetworkTapArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<FrontendIPConfigurationArgs> destinationLoadBalancerFrontEndIPConfiguration;
        private @Nullable Output<NetworkInterfaceIPConfigurationArgs> destinationNetworkInterfaceIPConfiguration;
        private @Nullable Output<Integer> destinationPort;
        private @Nullable Output<String> id;
        private @Nullable Output<String> location;
        private Output<String> resourceGroupName;
        private @Nullable Output<Map<String,String>> tags;
        private @Nullable Output<String> tapName;

        public Builder() {
    	      // Empty
        }

        public Builder(VirtualNetworkTapArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.destinationLoadBalancerFrontEndIPConfiguration = defaults.destinationLoadBalancerFrontEndIPConfiguration;
    	      this.destinationNetworkInterfaceIPConfiguration = defaults.destinationNetworkInterfaceIPConfiguration;
    	      this.destinationPort = defaults.destinationPort;
    	      this.id = defaults.id;
    	      this.location = defaults.location;
    	      this.resourceGroupName = defaults.resourceGroupName;
    	      this.tags = defaults.tags;
    	      this.tapName = defaults.tapName;
        }

        public Builder destinationLoadBalancerFrontEndIPConfiguration(@Nullable Output<FrontendIPConfigurationArgs> destinationLoadBalancerFrontEndIPConfiguration) {
            this.destinationLoadBalancerFrontEndIPConfiguration = destinationLoadBalancerFrontEndIPConfiguration;
            return this;
        }
        public Builder destinationLoadBalancerFrontEndIPConfiguration(@Nullable FrontendIPConfigurationArgs destinationLoadBalancerFrontEndIPConfiguration) {
            this.destinationLoadBalancerFrontEndIPConfiguration = Output.ofNullable(destinationLoadBalancerFrontEndIPConfiguration);
            return this;
        }
        public Builder destinationNetworkInterfaceIPConfiguration(@Nullable Output<NetworkInterfaceIPConfigurationArgs> destinationNetworkInterfaceIPConfiguration) {
            this.destinationNetworkInterfaceIPConfiguration = destinationNetworkInterfaceIPConfiguration;
            return this;
        }
        public Builder destinationNetworkInterfaceIPConfiguration(@Nullable NetworkInterfaceIPConfigurationArgs destinationNetworkInterfaceIPConfiguration) {
            this.destinationNetworkInterfaceIPConfiguration = Output.ofNullable(destinationNetworkInterfaceIPConfiguration);
            return this;
        }
        public Builder destinationPort(@Nullable Output<Integer> destinationPort) {
            this.destinationPort = destinationPort;
            return this;
        }
        public Builder destinationPort(@Nullable Integer destinationPort) {
            this.destinationPort = Output.ofNullable(destinationPort);
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
        public Builder location(@Nullable Output<String> location) {
            this.location = location;
            return this;
        }
        public Builder location(@Nullable String location) {
            this.location = Output.ofNullable(location);
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
        public Builder tags(@Nullable Output<Map<String,String>> tags) {
            this.tags = tags;
            return this;
        }
        public Builder tags(@Nullable Map<String,String> tags) {
            this.tags = Output.ofNullable(tags);
            return this;
        }
        public Builder tapName(@Nullable Output<String> tapName) {
            this.tapName = tapName;
            return this;
        }
        public Builder tapName(@Nullable String tapName) {
            this.tapName = Output.ofNullable(tapName);
            return this;
        }        public VirtualNetworkTapArgs build() {
            return new VirtualNetworkTapArgs(destinationLoadBalancerFrontEndIPConfiguration, destinationNetworkInterfaceIPConfiguration, destinationPort, id, location, resourceGroupName, tags, tapName);
        }
    }
}
