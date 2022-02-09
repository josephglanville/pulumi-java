// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.network;

import io.pulumi.azurenative.network.inputs.SubResourceArgs;
import io.pulumi.azurenative.network.inputs.VirtualHubRouteTableArgs;
import io.pulumi.azurenative.network.inputs.VirtualHubRouteTableV2Args;
import io.pulumi.core.Input;
import io.pulumi.core.internal.annotations.InputImport;
import java.lang.Boolean;
import java.lang.Double;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import javax.annotation.Nullable;


public final class VirtualHubArgs extends io.pulumi.resources.ResourceArgs {

    public static final VirtualHubArgs Empty = new VirtualHubArgs();

    @InputImport(name="addressPrefix")
    private final @Nullable Input<String> addressPrefix;

    public Input<String> getAddressPrefix() {
        return this.addressPrefix == null ? Input.empty() : this.addressPrefix;
    }

    @InputImport(name="allowBranchToBranchTraffic")
    private final @Nullable Input<Boolean> allowBranchToBranchTraffic;

    public Input<Boolean> getAllowBranchToBranchTraffic() {
        return this.allowBranchToBranchTraffic == null ? Input.empty() : this.allowBranchToBranchTraffic;
    }

    @InputImport(name="azureFirewall")
    private final @Nullable Input<SubResourceArgs> azureFirewall;

    public Input<SubResourceArgs> getAzureFirewall() {
        return this.azureFirewall == null ? Input.empty() : this.azureFirewall;
    }

    @InputImport(name="expressRouteGateway")
    private final @Nullable Input<SubResourceArgs> expressRouteGateway;

    public Input<SubResourceArgs> getExpressRouteGateway() {
        return this.expressRouteGateway == null ? Input.empty() : this.expressRouteGateway;
    }

    @InputImport(name="id")
    private final @Nullable Input<String> id;

    public Input<String> getId() {
        return this.id == null ? Input.empty() : this.id;
    }

    @InputImport(name="location")
    private final @Nullable Input<String> location;

    public Input<String> getLocation() {
        return this.location == null ? Input.empty() : this.location;
    }

    @InputImport(name="p2SVpnGateway")
    private final @Nullable Input<SubResourceArgs> p2SVpnGateway;

    public Input<SubResourceArgs> getP2SVpnGateway() {
        return this.p2SVpnGateway == null ? Input.empty() : this.p2SVpnGateway;
    }

    @InputImport(name="resourceGroupName", required=true)
    private final Input<String> resourceGroupName;

    public Input<String> getResourceGroupName() {
        return this.resourceGroupName;
    }

    @InputImport(name="routeTable")
    private final @Nullable Input<VirtualHubRouteTableArgs> routeTable;

    public Input<VirtualHubRouteTableArgs> getRouteTable() {
        return this.routeTable == null ? Input.empty() : this.routeTable;
    }

    @InputImport(name="securityPartnerProvider")
    private final @Nullable Input<SubResourceArgs> securityPartnerProvider;

    public Input<SubResourceArgs> getSecurityPartnerProvider() {
        return this.securityPartnerProvider == null ? Input.empty() : this.securityPartnerProvider;
    }

    @InputImport(name="securityProviderName")
    private final @Nullable Input<String> securityProviderName;

    public Input<String> getSecurityProviderName() {
        return this.securityProviderName == null ? Input.empty() : this.securityProviderName;
    }

    @InputImport(name="sku")
    private final @Nullable Input<String> sku;

    public Input<String> getSku() {
        return this.sku == null ? Input.empty() : this.sku;
    }

    @InputImport(name="tags")
    private final @Nullable Input<Map<String,String>> tags;

    public Input<Map<String,String>> getTags() {
        return this.tags == null ? Input.empty() : this.tags;
    }

    @InputImport(name="virtualHubName")
    private final @Nullable Input<String> virtualHubName;

    public Input<String> getVirtualHubName() {
        return this.virtualHubName == null ? Input.empty() : this.virtualHubName;
    }

    @InputImport(name="virtualHubRouteTableV2s")
    private final @Nullable Input<List<VirtualHubRouteTableV2Args>> virtualHubRouteTableV2s;

    public Input<List<VirtualHubRouteTableV2Args>> getVirtualHubRouteTableV2s() {
        return this.virtualHubRouteTableV2s == null ? Input.empty() : this.virtualHubRouteTableV2s;
    }

    @InputImport(name="virtualRouterAsn")
    private final @Nullable Input<Double> virtualRouterAsn;

    public Input<Double> getVirtualRouterAsn() {
        return this.virtualRouterAsn == null ? Input.empty() : this.virtualRouterAsn;
    }

    @InputImport(name="virtualRouterIps")
    private final @Nullable Input<List<String>> virtualRouterIps;

    public Input<List<String>> getVirtualRouterIps() {
        return this.virtualRouterIps == null ? Input.empty() : this.virtualRouterIps;
    }

    @InputImport(name="virtualWan")
    private final @Nullable Input<SubResourceArgs> virtualWan;

    public Input<SubResourceArgs> getVirtualWan() {
        return this.virtualWan == null ? Input.empty() : this.virtualWan;
    }

    @InputImport(name="vpnGateway")
    private final @Nullable Input<SubResourceArgs> vpnGateway;

    public Input<SubResourceArgs> getVpnGateway() {
        return this.vpnGateway == null ? Input.empty() : this.vpnGateway;
    }

    public VirtualHubArgs(
        @Nullable Input<String> addressPrefix,
        @Nullable Input<Boolean> allowBranchToBranchTraffic,
        @Nullable Input<SubResourceArgs> azureFirewall,
        @Nullable Input<SubResourceArgs> expressRouteGateway,
        @Nullable Input<String> id,
        @Nullable Input<String> location,
        @Nullable Input<SubResourceArgs> p2SVpnGateway,
        Input<String> resourceGroupName,
        @Nullable Input<VirtualHubRouteTableArgs> routeTable,
        @Nullable Input<SubResourceArgs> securityPartnerProvider,
        @Nullable Input<String> securityProviderName,
        @Nullable Input<String> sku,
        @Nullable Input<Map<String,String>> tags,
        @Nullable Input<String> virtualHubName,
        @Nullable Input<List<VirtualHubRouteTableV2Args>> virtualHubRouteTableV2s,
        @Nullable Input<Double> virtualRouterAsn,
        @Nullable Input<List<String>> virtualRouterIps,
        @Nullable Input<SubResourceArgs> virtualWan,
        @Nullable Input<SubResourceArgs> vpnGateway) {
        this.addressPrefix = addressPrefix;
        this.allowBranchToBranchTraffic = allowBranchToBranchTraffic;
        this.azureFirewall = azureFirewall;
        this.expressRouteGateway = expressRouteGateway;
        this.id = id;
        this.location = location;
        this.p2SVpnGateway = p2SVpnGateway;
        this.resourceGroupName = Objects.requireNonNull(resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
        this.routeTable = routeTable;
        this.securityPartnerProvider = securityPartnerProvider;
        this.securityProviderName = securityProviderName;
        this.sku = sku;
        this.tags = tags;
        this.virtualHubName = virtualHubName;
        this.virtualHubRouteTableV2s = virtualHubRouteTableV2s;
        this.virtualRouterAsn = virtualRouterAsn;
        this.virtualRouterIps = virtualRouterIps;
        this.virtualWan = virtualWan;
        this.vpnGateway = vpnGateway;
    }

    private VirtualHubArgs() {
        this.addressPrefix = Input.empty();
        this.allowBranchToBranchTraffic = Input.empty();
        this.azureFirewall = Input.empty();
        this.expressRouteGateway = Input.empty();
        this.id = Input.empty();
        this.location = Input.empty();
        this.p2SVpnGateway = Input.empty();
        this.resourceGroupName = Input.empty();
        this.routeTable = Input.empty();
        this.securityPartnerProvider = Input.empty();
        this.securityProviderName = Input.empty();
        this.sku = Input.empty();
        this.tags = Input.empty();
        this.virtualHubName = Input.empty();
        this.virtualHubRouteTableV2s = Input.empty();
        this.virtualRouterAsn = Input.empty();
        this.virtualRouterIps = Input.empty();
        this.virtualWan = Input.empty();
        this.vpnGateway = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(VirtualHubArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<String> addressPrefix;
        private @Nullable Input<Boolean> allowBranchToBranchTraffic;
        private @Nullable Input<SubResourceArgs> azureFirewall;
        private @Nullable Input<SubResourceArgs> expressRouteGateway;
        private @Nullable Input<String> id;
        private @Nullable Input<String> location;
        private @Nullable Input<SubResourceArgs> p2SVpnGateway;
        private Input<String> resourceGroupName;
        private @Nullable Input<VirtualHubRouteTableArgs> routeTable;
        private @Nullable Input<SubResourceArgs> securityPartnerProvider;
        private @Nullable Input<String> securityProviderName;
        private @Nullable Input<String> sku;
        private @Nullable Input<Map<String,String>> tags;
        private @Nullable Input<String> virtualHubName;
        private @Nullable Input<List<VirtualHubRouteTableV2Args>> virtualHubRouteTableV2s;
        private @Nullable Input<Double> virtualRouterAsn;
        private @Nullable Input<List<String>> virtualRouterIps;
        private @Nullable Input<SubResourceArgs> virtualWan;
        private @Nullable Input<SubResourceArgs> vpnGateway;

        public Builder() {
    	      // Empty
        }

        public Builder(VirtualHubArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.addressPrefix = defaults.addressPrefix;
    	      this.allowBranchToBranchTraffic = defaults.allowBranchToBranchTraffic;
    	      this.azureFirewall = defaults.azureFirewall;
    	      this.expressRouteGateway = defaults.expressRouteGateway;
    	      this.id = defaults.id;
    	      this.location = defaults.location;
    	      this.p2SVpnGateway = defaults.p2SVpnGateway;
    	      this.resourceGroupName = defaults.resourceGroupName;
    	      this.routeTable = defaults.routeTable;
    	      this.securityPartnerProvider = defaults.securityPartnerProvider;
    	      this.securityProviderName = defaults.securityProviderName;
    	      this.sku = defaults.sku;
    	      this.tags = defaults.tags;
    	      this.virtualHubName = defaults.virtualHubName;
    	      this.virtualHubRouteTableV2s = defaults.virtualHubRouteTableV2s;
    	      this.virtualRouterAsn = defaults.virtualRouterAsn;
    	      this.virtualRouterIps = defaults.virtualRouterIps;
    	      this.virtualWan = defaults.virtualWan;
    	      this.vpnGateway = defaults.vpnGateway;
        }

        public Builder setAddressPrefix(@Nullable Input<String> addressPrefix) {
            this.addressPrefix = addressPrefix;
            return this;
        }

        public Builder setAddressPrefix(@Nullable String addressPrefix) {
            this.addressPrefix = Input.ofNullable(addressPrefix);
            return this;
        }

        public Builder setAllowBranchToBranchTraffic(@Nullable Input<Boolean> allowBranchToBranchTraffic) {
            this.allowBranchToBranchTraffic = allowBranchToBranchTraffic;
            return this;
        }

        public Builder setAllowBranchToBranchTraffic(@Nullable Boolean allowBranchToBranchTraffic) {
            this.allowBranchToBranchTraffic = Input.ofNullable(allowBranchToBranchTraffic);
            return this;
        }

        public Builder setAzureFirewall(@Nullable Input<SubResourceArgs> azureFirewall) {
            this.azureFirewall = azureFirewall;
            return this;
        }

        public Builder setAzureFirewall(@Nullable SubResourceArgs azureFirewall) {
            this.azureFirewall = Input.ofNullable(azureFirewall);
            return this;
        }

        public Builder setExpressRouteGateway(@Nullable Input<SubResourceArgs> expressRouteGateway) {
            this.expressRouteGateway = expressRouteGateway;
            return this;
        }

        public Builder setExpressRouteGateway(@Nullable SubResourceArgs expressRouteGateway) {
            this.expressRouteGateway = Input.ofNullable(expressRouteGateway);
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

        public Builder setLocation(@Nullable Input<String> location) {
            this.location = location;
            return this;
        }

        public Builder setLocation(@Nullable String location) {
            this.location = Input.ofNullable(location);
            return this;
        }

        public Builder setP2SVpnGateway(@Nullable Input<SubResourceArgs> p2SVpnGateway) {
            this.p2SVpnGateway = p2SVpnGateway;
            return this;
        }

        public Builder setP2SVpnGateway(@Nullable SubResourceArgs p2SVpnGateway) {
            this.p2SVpnGateway = Input.ofNullable(p2SVpnGateway);
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

        public Builder setRouteTable(@Nullable Input<VirtualHubRouteTableArgs> routeTable) {
            this.routeTable = routeTable;
            return this;
        }

        public Builder setRouteTable(@Nullable VirtualHubRouteTableArgs routeTable) {
            this.routeTable = Input.ofNullable(routeTable);
            return this;
        }

        public Builder setSecurityPartnerProvider(@Nullable Input<SubResourceArgs> securityPartnerProvider) {
            this.securityPartnerProvider = securityPartnerProvider;
            return this;
        }

        public Builder setSecurityPartnerProvider(@Nullable SubResourceArgs securityPartnerProvider) {
            this.securityPartnerProvider = Input.ofNullable(securityPartnerProvider);
            return this;
        }

        public Builder setSecurityProviderName(@Nullable Input<String> securityProviderName) {
            this.securityProviderName = securityProviderName;
            return this;
        }

        public Builder setSecurityProviderName(@Nullable String securityProviderName) {
            this.securityProviderName = Input.ofNullable(securityProviderName);
            return this;
        }

        public Builder setSku(@Nullable Input<String> sku) {
            this.sku = sku;
            return this;
        }

        public Builder setSku(@Nullable String sku) {
            this.sku = Input.ofNullable(sku);
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

        public Builder setVirtualHubName(@Nullable Input<String> virtualHubName) {
            this.virtualHubName = virtualHubName;
            return this;
        }

        public Builder setVirtualHubName(@Nullable String virtualHubName) {
            this.virtualHubName = Input.ofNullable(virtualHubName);
            return this;
        }

        public Builder setVirtualHubRouteTableV2s(@Nullable Input<List<VirtualHubRouteTableV2Args>> virtualHubRouteTableV2s) {
            this.virtualHubRouteTableV2s = virtualHubRouteTableV2s;
            return this;
        }

        public Builder setVirtualHubRouteTableV2s(@Nullable List<VirtualHubRouteTableV2Args> virtualHubRouteTableV2s) {
            this.virtualHubRouteTableV2s = Input.ofNullable(virtualHubRouteTableV2s);
            return this;
        }

        public Builder setVirtualRouterAsn(@Nullable Input<Double> virtualRouterAsn) {
            this.virtualRouterAsn = virtualRouterAsn;
            return this;
        }

        public Builder setVirtualRouterAsn(@Nullable Double virtualRouterAsn) {
            this.virtualRouterAsn = Input.ofNullable(virtualRouterAsn);
            return this;
        }

        public Builder setVirtualRouterIps(@Nullable Input<List<String>> virtualRouterIps) {
            this.virtualRouterIps = virtualRouterIps;
            return this;
        }

        public Builder setVirtualRouterIps(@Nullable List<String> virtualRouterIps) {
            this.virtualRouterIps = Input.ofNullable(virtualRouterIps);
            return this;
        }

        public Builder setVirtualWan(@Nullable Input<SubResourceArgs> virtualWan) {
            this.virtualWan = virtualWan;
            return this;
        }

        public Builder setVirtualWan(@Nullable SubResourceArgs virtualWan) {
            this.virtualWan = Input.ofNullable(virtualWan);
            return this;
        }

        public Builder setVpnGateway(@Nullable Input<SubResourceArgs> vpnGateway) {
            this.vpnGateway = vpnGateway;
            return this;
        }

        public Builder setVpnGateway(@Nullable SubResourceArgs vpnGateway) {
            this.vpnGateway = Input.ofNullable(vpnGateway);
            return this;
        }

        public VirtualHubArgs build() {
            return new VirtualHubArgs(addressPrefix, allowBranchToBranchTraffic, azureFirewall, expressRouteGateway, id, location, p2SVpnGateway, resourceGroupName, routeTable, securityPartnerProvider, securityProviderName, sku, tags, virtualHubName, virtualHubRouteTableV2s, virtualRouterAsn, virtualRouterIps, virtualWan, vpnGateway);
        }
    }
}
