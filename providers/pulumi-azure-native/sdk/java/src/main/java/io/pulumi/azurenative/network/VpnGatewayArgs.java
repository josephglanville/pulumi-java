// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.network;

import io.pulumi.azurenative.network.inputs.BgpSettingsArgs;
import io.pulumi.azurenative.network.inputs.SubResourceArgs;
import io.pulumi.azurenative.network.inputs.VpnConnectionArgs;
import io.pulumi.azurenative.network.inputs.VpnGatewayNatRuleArgs;
import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import javax.annotation.Nullable;


public final class VpnGatewayArgs extends io.pulumi.resources.ResourceArgs {

    public static final VpnGatewayArgs Empty = new VpnGatewayArgs();

    /**
     * Local network gateway's BGP speaker settings.
     * 
     */
    @InputImport(name="bgpSettings")
      private final @Nullable Input<BgpSettingsArgs> bgpSettings;

    public Input<BgpSettingsArgs> getBgpSettings() {
        return this.bgpSettings == null ? Input.empty() : this.bgpSettings;
    }

    /**
     * List of all vpn connections to the gateway.
     * 
     */
    @InputImport(name="connections")
      private final @Nullable Input<List<VpnConnectionArgs>> connections;

    public Input<List<VpnConnectionArgs>> getConnections() {
        return this.connections == null ? Input.empty() : this.connections;
    }

    /**
     * The name of the gateway.
     * 
     */
    @InputImport(name="gatewayName")
      private final @Nullable Input<String> gatewayName;

    public Input<String> getGatewayName() {
        return this.gatewayName == null ? Input.empty() : this.gatewayName;
    }

    /**
     * Resource ID.
     * 
     */
    @InputImport(name="id")
      private final @Nullable Input<String> id;

    public Input<String> getId() {
        return this.id == null ? Input.empty() : this.id;
    }

    /**
     * Enable Routing Preference property for the Public IP Interface of the VpnGateway.
     * 
     */
    @InputImport(name="isRoutingPreferenceInternet")
      private final @Nullable Input<Boolean> isRoutingPreferenceInternet;

    public Input<Boolean> getIsRoutingPreferenceInternet() {
        return this.isRoutingPreferenceInternet == null ? Input.empty() : this.isRoutingPreferenceInternet;
    }

    /**
     * Resource location.
     * 
     */
    @InputImport(name="location")
      private final @Nullable Input<String> location;

    public Input<String> getLocation() {
        return this.location == null ? Input.empty() : this.location;
    }

    /**
     * List of all the nat Rules associated with the gateway.
     * 
     */
    @InputImport(name="natRules")
      private final @Nullable Input<List<VpnGatewayNatRuleArgs>> natRules;

    public Input<List<VpnGatewayNatRuleArgs>> getNatRules() {
        return this.natRules == null ? Input.empty() : this.natRules;
    }

    /**
     * The resource group name of the VpnGateway.
     * 
     */
    @InputImport(name="resourceGroupName", required=true)
      private final Input<String> resourceGroupName;

    public Input<String> getResourceGroupName() {
        return this.resourceGroupName;
    }

    /**
     * Resource tags.
     * 
     */
    @InputImport(name="tags")
      private final @Nullable Input<Map<String,String>> tags;

    public Input<Map<String,String>> getTags() {
        return this.tags == null ? Input.empty() : this.tags;
    }

    /**
     * The VirtualHub to which the gateway belongs.
     * 
     */
    @InputImport(name="virtualHub")
      private final @Nullable Input<SubResourceArgs> virtualHub;

    public Input<SubResourceArgs> getVirtualHub() {
        return this.virtualHub == null ? Input.empty() : this.virtualHub;
    }

    /**
     * The scale unit for this vpn gateway.
     * 
     */
    @InputImport(name="vpnGatewayScaleUnit")
      private final @Nullable Input<Integer> vpnGatewayScaleUnit;

    public Input<Integer> getVpnGatewayScaleUnit() {
        return this.vpnGatewayScaleUnit == null ? Input.empty() : this.vpnGatewayScaleUnit;
    }

    public VpnGatewayArgs(
        @Nullable Input<BgpSettingsArgs> bgpSettings,
        @Nullable Input<List<VpnConnectionArgs>> connections,
        @Nullable Input<String> gatewayName,
        @Nullable Input<String> id,
        @Nullable Input<Boolean> isRoutingPreferenceInternet,
        @Nullable Input<String> location,
        @Nullable Input<List<VpnGatewayNatRuleArgs>> natRules,
        Input<String> resourceGroupName,
        @Nullable Input<Map<String,String>> tags,
        @Nullable Input<SubResourceArgs> virtualHub,
        @Nullable Input<Integer> vpnGatewayScaleUnit) {
        this.bgpSettings = bgpSettings;
        this.connections = connections;
        this.gatewayName = gatewayName;
        this.id = id;
        this.isRoutingPreferenceInternet = isRoutingPreferenceInternet;
        this.location = location;
        this.natRules = natRules;
        this.resourceGroupName = Objects.requireNonNull(resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
        this.tags = tags;
        this.virtualHub = virtualHub;
        this.vpnGatewayScaleUnit = vpnGatewayScaleUnit;
    }

    private VpnGatewayArgs() {
        this.bgpSettings = Input.empty();
        this.connections = Input.empty();
        this.gatewayName = Input.empty();
        this.id = Input.empty();
        this.isRoutingPreferenceInternet = Input.empty();
        this.location = Input.empty();
        this.natRules = Input.empty();
        this.resourceGroupName = Input.empty();
        this.tags = Input.empty();
        this.virtualHub = Input.empty();
        this.vpnGatewayScaleUnit = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(VpnGatewayArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<BgpSettingsArgs> bgpSettings;
        private @Nullable Input<List<VpnConnectionArgs>> connections;
        private @Nullable Input<String> gatewayName;
        private @Nullable Input<String> id;
        private @Nullable Input<Boolean> isRoutingPreferenceInternet;
        private @Nullable Input<String> location;
        private @Nullable Input<List<VpnGatewayNatRuleArgs>> natRules;
        private Input<String> resourceGroupName;
        private @Nullable Input<Map<String,String>> tags;
        private @Nullable Input<SubResourceArgs> virtualHub;
        private @Nullable Input<Integer> vpnGatewayScaleUnit;

        public Builder() {
    	      // Empty
        }

        public Builder(VpnGatewayArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.bgpSettings = defaults.bgpSettings;
    	      this.connections = defaults.connections;
    	      this.gatewayName = defaults.gatewayName;
    	      this.id = defaults.id;
    	      this.isRoutingPreferenceInternet = defaults.isRoutingPreferenceInternet;
    	      this.location = defaults.location;
    	      this.natRules = defaults.natRules;
    	      this.resourceGroupName = defaults.resourceGroupName;
    	      this.tags = defaults.tags;
    	      this.virtualHub = defaults.virtualHub;
    	      this.vpnGatewayScaleUnit = defaults.vpnGatewayScaleUnit;
        }

        public Builder setBgpSettings(@Nullable Input<BgpSettingsArgs> bgpSettings) {
            this.bgpSettings = bgpSettings;
            return this;
        }

        public Builder setBgpSettings(@Nullable BgpSettingsArgs bgpSettings) {
            this.bgpSettings = Input.ofNullable(bgpSettings);
            return this;
        }

        public Builder setConnections(@Nullable Input<List<VpnConnectionArgs>> connections) {
            this.connections = connections;
            return this;
        }

        public Builder setConnections(@Nullable List<VpnConnectionArgs> connections) {
            this.connections = Input.ofNullable(connections);
            return this;
        }

        public Builder setGatewayName(@Nullable Input<String> gatewayName) {
            this.gatewayName = gatewayName;
            return this;
        }

        public Builder setGatewayName(@Nullable String gatewayName) {
            this.gatewayName = Input.ofNullable(gatewayName);
            return this;
        }

        public Builder setId(@Nullable Input<String> id) {
            this.id = id;
            return this;
        }

        public Builder setId(@Nullable String id) {
            this.id = Input.ofNullable(id);
            return this;
        }

        public Builder setIsRoutingPreferenceInternet(@Nullable Input<Boolean> isRoutingPreferenceInternet) {
            this.isRoutingPreferenceInternet = isRoutingPreferenceInternet;
            return this;
        }

        public Builder setIsRoutingPreferenceInternet(@Nullable Boolean isRoutingPreferenceInternet) {
            this.isRoutingPreferenceInternet = Input.ofNullable(isRoutingPreferenceInternet);
            return this;
        }

        public Builder setLocation(@Nullable Input<String> location) {
            this.location = location;
            return this;
        }

        public Builder setLocation(@Nullable String location) {
            this.location = Input.ofNullable(location);
            return this;
        }

        public Builder setNatRules(@Nullable Input<List<VpnGatewayNatRuleArgs>> natRules) {
            this.natRules = natRules;
            return this;
        }

        public Builder setNatRules(@Nullable List<VpnGatewayNatRuleArgs> natRules) {
            this.natRules = Input.ofNullable(natRules);
            return this;
        }

        public Builder setResourceGroupName(Input<String> resourceGroupName) {
            this.resourceGroupName = Objects.requireNonNull(resourceGroupName);
            return this;
        }

        public Builder setResourceGroupName(String resourceGroupName) {
            this.resourceGroupName = Input.of(Objects.requireNonNull(resourceGroupName));
            return this;
        }

        public Builder setTags(@Nullable Input<Map<String,String>> tags) {
            this.tags = tags;
            return this;
        }

        public Builder setTags(@Nullable Map<String,String> tags) {
            this.tags = Input.ofNullable(tags);
            return this;
        }

        public Builder setVirtualHub(@Nullable Input<SubResourceArgs> virtualHub) {
            this.virtualHub = virtualHub;
            return this;
        }

        public Builder setVirtualHub(@Nullable SubResourceArgs virtualHub) {
            this.virtualHub = Input.ofNullable(virtualHub);
            return this;
        }

        public Builder setVpnGatewayScaleUnit(@Nullable Input<Integer> vpnGatewayScaleUnit) {
            this.vpnGatewayScaleUnit = vpnGatewayScaleUnit;
            return this;
        }

        public Builder setVpnGatewayScaleUnit(@Nullable Integer vpnGatewayScaleUnit) {
            this.vpnGatewayScaleUnit = Input.ofNullable(vpnGatewayScaleUnit);
            return this;
        }
        public VpnGatewayArgs build() {
            return new VpnGatewayArgs(bgpSettings, connections, gatewayName, id, isRoutingPreferenceInternet, location, natRules, resourceGroupName, tags, virtualHub, vpnGatewayScaleUnit);
        }
    }
}
