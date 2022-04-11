// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.network.inputs;

import io.pulumi.azurenative.network.inputs.FrontendIPConfigurationArgs;
import io.pulumi.azurenative.network.inputs.NetworkInterfaceIPConfigurationArgs;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import java.lang.Integer;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * Virtual Network Tap resource.
 * 
 */
public final class VirtualNetworkTapArgs extends io.pulumi.resources.ResourceArgs {

    public static final VirtualNetworkTapArgs Empty = new VirtualNetworkTapArgs();

    /**
     * The reference to the private IP address on the internal Load Balancer that will receive the tap.
     * 
     */
    @Import(name="destinationLoadBalancerFrontEndIPConfiguration")
      private final @Nullable Output<FrontendIPConfigurationArgs> destinationLoadBalancerFrontEndIPConfiguration;

    public Output<FrontendIPConfigurationArgs> getDestinationLoadBalancerFrontEndIPConfiguration() {
        return this.destinationLoadBalancerFrontEndIPConfiguration == null ? Codegen.empty() : this.destinationLoadBalancerFrontEndIPConfiguration;
    }

    /**
     * The reference to the private IP Address of the collector nic that will receive the tap.
     * 
     */
    @Import(name="destinationNetworkInterfaceIPConfiguration")
      private final @Nullable Output<NetworkInterfaceIPConfigurationArgs> destinationNetworkInterfaceIPConfiguration;

    public Output<NetworkInterfaceIPConfigurationArgs> getDestinationNetworkInterfaceIPConfiguration() {
        return this.destinationNetworkInterfaceIPConfiguration == null ? Codegen.empty() : this.destinationNetworkInterfaceIPConfiguration;
    }

    /**
     * The VXLAN destination port that will receive the tapped traffic.
     * 
     */
    @Import(name="destinationPort")
      private final @Nullable Output<Integer> destinationPort;

    public Output<Integer> getDestinationPort() {
        return this.destinationPort == null ? Codegen.empty() : this.destinationPort;
    }

    /**
     * Resource ID.
     * 
     */
    @Import(name="id")
      private final @Nullable Output<String> id;

    public Output<String> getId() {
        return this.id == null ? Codegen.empty() : this.id;
    }

    /**
     * Resource location.
     * 
     */
    @Import(name="location")
      private final @Nullable Output<String> location;

    public Output<String> getLocation() {
        return this.location == null ? Codegen.empty() : this.location;
    }

    /**
     * Resource tags.
     * 
     */
    @Import(name="tags")
      private final @Nullable Output<Map<String,String>> tags;

    public Output<Map<String,String>> getTags() {
        return this.tags == null ? Codegen.empty() : this.tags;
    }

    public VirtualNetworkTapArgs(
        @Nullable Output<FrontendIPConfigurationArgs> destinationLoadBalancerFrontEndIPConfiguration,
        @Nullable Output<NetworkInterfaceIPConfigurationArgs> destinationNetworkInterfaceIPConfiguration,
        @Nullable Output<Integer> destinationPort,
        @Nullable Output<String> id,
        @Nullable Output<String> location,
        @Nullable Output<Map<String,String>> tags) {
        this.destinationLoadBalancerFrontEndIPConfiguration = destinationLoadBalancerFrontEndIPConfiguration;
        this.destinationNetworkInterfaceIPConfiguration = destinationNetworkInterfaceIPConfiguration;
        this.destinationPort = destinationPort;
        this.id = id;
        this.location = location;
        this.tags = tags;
    }

    private VirtualNetworkTapArgs() {
        this.destinationLoadBalancerFrontEndIPConfiguration = Codegen.empty();
        this.destinationNetworkInterfaceIPConfiguration = Codegen.empty();
        this.destinationPort = Codegen.empty();
        this.id = Codegen.empty();
        this.location = Codegen.empty();
        this.tags = Codegen.empty();
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
        private @Nullable Output<Map<String,String>> tags;

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
    	      this.tags = defaults.tags;
        }

        public Builder destinationLoadBalancerFrontEndIPConfiguration(@Nullable Output<FrontendIPConfigurationArgs> destinationLoadBalancerFrontEndIPConfiguration) {
            this.destinationLoadBalancerFrontEndIPConfiguration = destinationLoadBalancerFrontEndIPConfiguration;
            return this;
        }
        public Builder destinationLoadBalancerFrontEndIPConfiguration(@Nullable FrontendIPConfigurationArgs destinationLoadBalancerFrontEndIPConfiguration) {
            this.destinationLoadBalancerFrontEndIPConfiguration = Codegen.ofNullable(destinationLoadBalancerFrontEndIPConfiguration);
            return this;
        }
        public Builder destinationNetworkInterfaceIPConfiguration(@Nullable Output<NetworkInterfaceIPConfigurationArgs> destinationNetworkInterfaceIPConfiguration) {
            this.destinationNetworkInterfaceIPConfiguration = destinationNetworkInterfaceIPConfiguration;
            return this;
        }
        public Builder destinationNetworkInterfaceIPConfiguration(@Nullable NetworkInterfaceIPConfigurationArgs destinationNetworkInterfaceIPConfiguration) {
            this.destinationNetworkInterfaceIPConfiguration = Codegen.ofNullable(destinationNetworkInterfaceIPConfiguration);
            return this;
        }
        public Builder destinationPort(@Nullable Output<Integer> destinationPort) {
            this.destinationPort = destinationPort;
            return this;
        }
        public Builder destinationPort(@Nullable Integer destinationPort) {
            this.destinationPort = Codegen.ofNullable(destinationPort);
            return this;
        }
        public Builder id(@Nullable Output<String> id) {
            this.id = id;
            return this;
        }
        public Builder id(@Nullable String id) {
            this.id = Codegen.ofNullable(id);
            return this;
        }
        public Builder location(@Nullable Output<String> location) {
            this.location = location;
            return this;
        }
        public Builder location(@Nullable String location) {
            this.location = Codegen.ofNullable(location);
            return this;
        }
        public Builder tags(@Nullable Output<Map<String,String>> tags) {
            this.tags = tags;
            return this;
        }
        public Builder tags(@Nullable Map<String,String> tags) {
            this.tags = Codegen.ofNullable(tags);
            return this;
        }        public VirtualNetworkTapArgs build() {
            return new VirtualNetworkTapArgs(destinationLoadBalancerFrontEndIPConfiguration, destinationNetworkInterfaceIPConfiguration, destinationPort, id, location, tags);
        }
    }
}
