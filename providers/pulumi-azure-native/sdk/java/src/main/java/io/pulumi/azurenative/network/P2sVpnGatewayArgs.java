// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.network;

import io.pulumi.azurenative.network.inputs.P2SConnectionConfigurationArgs;
import io.pulumi.azurenative.network.inputs.SubResourceArgs;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import javax.annotation.Nullable;


public final class P2sVpnGatewayArgs extends io.pulumi.resources.ResourceArgs {

    public static final P2sVpnGatewayArgs Empty = new P2sVpnGatewayArgs();

    /**
     * List of all customer specified DNS servers IP addresses.
     * 
     */
    @Import(name="customDnsServers")
      private final @Nullable Output<List<String>> customDnsServers;

    public Output<List<String>> getCustomDnsServers() {
        return this.customDnsServers == null ? Codegen.empty() : this.customDnsServers;
    }

    /**
     * The name of the gateway.
     * 
     */
    @Import(name="gatewayName")
      private final @Nullable Output<String> gatewayName;

    public Output<String> getGatewayName() {
        return this.gatewayName == null ? Codegen.empty() : this.gatewayName;
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
     * Enable Routing Preference property for the Public IP Interface of the P2SVpnGateway.
     * 
     */
    @Import(name="isRoutingPreferenceInternet")
      private final @Nullable Output<Boolean> isRoutingPreferenceInternet;

    public Output<Boolean> getIsRoutingPreferenceInternet() {
        return this.isRoutingPreferenceInternet == null ? Codegen.empty() : this.isRoutingPreferenceInternet;
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
     * List of all p2s connection configurations of the gateway.
     * 
     */
    @Import(name="p2SConnectionConfigurations")
      private final @Nullable Output<List<P2SConnectionConfigurationArgs>> p2SConnectionConfigurations;

    public Output<List<P2SConnectionConfigurationArgs>> getP2SConnectionConfigurations() {
        return this.p2SConnectionConfigurations == null ? Codegen.empty() : this.p2SConnectionConfigurations;
    }

    /**
     * The resource group name of the P2SVpnGateway.
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
        return this.tags == null ? Codegen.empty() : this.tags;
    }

    /**
     * The VirtualHub to which the gateway belongs.
     * 
     */
    @Import(name="virtualHub")
      private final @Nullable Output<SubResourceArgs> virtualHub;

    public Output<SubResourceArgs> getVirtualHub() {
        return this.virtualHub == null ? Codegen.empty() : this.virtualHub;
    }

    /**
     * The scale unit for this p2s vpn gateway.
     * 
     */
    @Import(name="vpnGatewayScaleUnit")
      private final @Nullable Output<Integer> vpnGatewayScaleUnit;

    public Output<Integer> getVpnGatewayScaleUnit() {
        return this.vpnGatewayScaleUnit == null ? Codegen.empty() : this.vpnGatewayScaleUnit;
    }

    /**
     * The VpnServerConfiguration to which the p2sVpnGateway is attached to.
     * 
     */
    @Import(name="vpnServerConfiguration")
      private final @Nullable Output<SubResourceArgs> vpnServerConfiguration;

    public Output<SubResourceArgs> getVpnServerConfiguration() {
        return this.vpnServerConfiguration == null ? Codegen.empty() : this.vpnServerConfiguration;
    }

    public P2sVpnGatewayArgs(
        @Nullable Output<List<String>> customDnsServers,
        @Nullable Output<String> gatewayName,
        @Nullable Output<String> id,
        @Nullable Output<Boolean> isRoutingPreferenceInternet,
        @Nullable Output<String> location,
        @Nullable Output<List<P2SConnectionConfigurationArgs>> p2SConnectionConfigurations,
        Output<String> resourceGroupName,
        @Nullable Output<Map<String,String>> tags,
        @Nullable Output<SubResourceArgs> virtualHub,
        @Nullable Output<Integer> vpnGatewayScaleUnit,
        @Nullable Output<SubResourceArgs> vpnServerConfiguration) {
        this.customDnsServers = customDnsServers;
        this.gatewayName = gatewayName;
        this.id = id;
        this.isRoutingPreferenceInternet = isRoutingPreferenceInternet;
        this.location = location;
        this.p2SConnectionConfigurations = p2SConnectionConfigurations;
        this.resourceGroupName = Objects.requireNonNull(resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
        this.tags = tags;
        this.virtualHub = virtualHub;
        this.vpnGatewayScaleUnit = vpnGatewayScaleUnit;
        this.vpnServerConfiguration = vpnServerConfiguration;
    }

    private P2sVpnGatewayArgs() {
        this.customDnsServers = Codegen.empty();
        this.gatewayName = Codegen.empty();
        this.id = Codegen.empty();
        this.isRoutingPreferenceInternet = Codegen.empty();
        this.location = Codegen.empty();
        this.p2SConnectionConfigurations = Codegen.empty();
        this.resourceGroupName = Codegen.empty();
        this.tags = Codegen.empty();
        this.virtualHub = Codegen.empty();
        this.vpnGatewayScaleUnit = Codegen.empty();
        this.vpnServerConfiguration = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(P2sVpnGatewayArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<List<String>> customDnsServers;
        private @Nullable Output<String> gatewayName;
        private @Nullable Output<String> id;
        private @Nullable Output<Boolean> isRoutingPreferenceInternet;
        private @Nullable Output<String> location;
        private @Nullable Output<List<P2SConnectionConfigurationArgs>> p2SConnectionConfigurations;
        private Output<String> resourceGroupName;
        private @Nullable Output<Map<String,String>> tags;
        private @Nullable Output<SubResourceArgs> virtualHub;
        private @Nullable Output<Integer> vpnGatewayScaleUnit;
        private @Nullable Output<SubResourceArgs> vpnServerConfiguration;

        public Builder() {
    	      // Empty
        }

        public Builder(P2sVpnGatewayArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.customDnsServers = defaults.customDnsServers;
    	      this.gatewayName = defaults.gatewayName;
    	      this.id = defaults.id;
    	      this.isRoutingPreferenceInternet = defaults.isRoutingPreferenceInternet;
    	      this.location = defaults.location;
    	      this.p2SConnectionConfigurations = defaults.p2SConnectionConfigurations;
    	      this.resourceGroupName = defaults.resourceGroupName;
    	      this.tags = defaults.tags;
    	      this.virtualHub = defaults.virtualHub;
    	      this.vpnGatewayScaleUnit = defaults.vpnGatewayScaleUnit;
    	      this.vpnServerConfiguration = defaults.vpnServerConfiguration;
        }

        public Builder customDnsServers(@Nullable Output<List<String>> customDnsServers) {
            this.customDnsServers = customDnsServers;
            return this;
        }
        public Builder customDnsServers(@Nullable List<String> customDnsServers) {
            this.customDnsServers = Codegen.ofNullable(customDnsServers);
            return this;
        }
        public Builder customDnsServers(String... customDnsServers) {
            return customDnsServers(List.of(customDnsServers));
        }
        public Builder gatewayName(@Nullable Output<String> gatewayName) {
            this.gatewayName = gatewayName;
            return this;
        }
        public Builder gatewayName(@Nullable String gatewayName) {
            this.gatewayName = Codegen.ofNullable(gatewayName);
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
        public Builder isRoutingPreferenceInternet(@Nullable Output<Boolean> isRoutingPreferenceInternet) {
            this.isRoutingPreferenceInternet = isRoutingPreferenceInternet;
            return this;
        }
        public Builder isRoutingPreferenceInternet(@Nullable Boolean isRoutingPreferenceInternet) {
            this.isRoutingPreferenceInternet = Codegen.ofNullable(isRoutingPreferenceInternet);
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
        public Builder p2SConnectionConfigurations(@Nullable Output<List<P2SConnectionConfigurationArgs>> p2SConnectionConfigurations) {
            this.p2SConnectionConfigurations = p2SConnectionConfigurations;
            return this;
        }
        public Builder p2SConnectionConfigurations(@Nullable List<P2SConnectionConfigurationArgs> p2SConnectionConfigurations) {
            this.p2SConnectionConfigurations = Codegen.ofNullable(p2SConnectionConfigurations);
            return this;
        }
        public Builder p2SConnectionConfigurations(P2SConnectionConfigurationArgs... p2SConnectionConfigurations) {
            return p2SConnectionConfigurations(List.of(p2SConnectionConfigurations));
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
            this.tags = Codegen.ofNullable(tags);
            return this;
        }
        public Builder virtualHub(@Nullable Output<SubResourceArgs> virtualHub) {
            this.virtualHub = virtualHub;
            return this;
        }
        public Builder virtualHub(@Nullable SubResourceArgs virtualHub) {
            this.virtualHub = Codegen.ofNullable(virtualHub);
            return this;
        }
        public Builder vpnGatewayScaleUnit(@Nullable Output<Integer> vpnGatewayScaleUnit) {
            this.vpnGatewayScaleUnit = vpnGatewayScaleUnit;
            return this;
        }
        public Builder vpnGatewayScaleUnit(@Nullable Integer vpnGatewayScaleUnit) {
            this.vpnGatewayScaleUnit = Codegen.ofNullable(vpnGatewayScaleUnit);
            return this;
        }
        public Builder vpnServerConfiguration(@Nullable Output<SubResourceArgs> vpnServerConfiguration) {
            this.vpnServerConfiguration = vpnServerConfiguration;
            return this;
        }
        public Builder vpnServerConfiguration(@Nullable SubResourceArgs vpnServerConfiguration) {
            this.vpnServerConfiguration = Codegen.ofNullable(vpnServerConfiguration);
            return this;
        }        public P2sVpnGatewayArgs build() {
            return new P2sVpnGatewayArgs(customDnsServers, gatewayName, id, isRoutingPreferenceInternet, location, p2SConnectionConfigurations, resourceGroupName, tags, virtualHub, vpnGatewayScaleUnit, vpnServerConfiguration);
        }
    }
}
