// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.network.outputs;

import io.pulumi.azurenative.network.outputs.SubResourceResponse;
import io.pulumi.azurenative.network.outputs.VirtualHubRouteTableResponse;
import io.pulumi.azurenative.network.outputs.VirtualHubRouteTableV2Response;
import io.pulumi.core.internal.annotations.OutputCustomType;
import java.lang.Boolean;
import java.lang.Double;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class GetVirtualHubResult {
    private final @Nullable String addressPrefix;
    private final @Nullable Boolean allowBranchToBranchTraffic;
    private final @Nullable SubResourceResponse azureFirewall;
    private final List<SubResourceResponse> bgpConnections;
    private final String etag;
    private final @Nullable SubResourceResponse expressRouteGateway;
    private final @Nullable String id;
    private final List<SubResourceResponse> ipConfigurations;
    private final String location;
    private final String name;
    private final @Nullable SubResourceResponse p2SVpnGateway;
    private final String provisioningState;
    private final @Nullable VirtualHubRouteTableResponse routeTable;
    private final String routingState;
    private final @Nullable SubResourceResponse securityPartnerProvider;
    private final @Nullable String securityProviderName;
    private final @Nullable String sku;
    private final @Nullable Map<String,String> tags;
    private final String type;
    private final @Nullable List<VirtualHubRouteTableV2Response> virtualHubRouteTableV2s;
    private final @Nullable Double virtualRouterAsn;
    private final @Nullable List<String> virtualRouterIps;
    private final @Nullable SubResourceResponse virtualWan;
    private final @Nullable SubResourceResponse vpnGateway;

    @OutputCustomType.Constructor({"addressPrefix","allowBranchToBranchTraffic","azureFirewall","bgpConnections","etag","expressRouteGateway","id","ipConfigurations","location","name","p2SVpnGateway","provisioningState","routeTable","routingState","securityPartnerProvider","securityProviderName","sku","tags","type","virtualHubRouteTableV2s","virtualRouterAsn","virtualRouterIps","virtualWan","vpnGateway"})
    private GetVirtualHubResult(
        @Nullable String addressPrefix,
        @Nullable Boolean allowBranchToBranchTraffic,
        @Nullable SubResourceResponse azureFirewall,
        List<SubResourceResponse> bgpConnections,
        String etag,
        @Nullable SubResourceResponse expressRouteGateway,
        @Nullable String id,
        List<SubResourceResponse> ipConfigurations,
        String location,
        String name,
        @Nullable SubResourceResponse p2SVpnGateway,
        String provisioningState,
        @Nullable VirtualHubRouteTableResponse routeTable,
        String routingState,
        @Nullable SubResourceResponse securityPartnerProvider,
        @Nullable String securityProviderName,
        @Nullable String sku,
        @Nullable Map<String,String> tags,
        String type,
        @Nullable List<VirtualHubRouteTableV2Response> virtualHubRouteTableV2s,
        @Nullable Double virtualRouterAsn,
        @Nullable List<String> virtualRouterIps,
        @Nullable SubResourceResponse virtualWan,
        @Nullable SubResourceResponse vpnGateway) {
        this.addressPrefix = addressPrefix;
        this.allowBranchToBranchTraffic = allowBranchToBranchTraffic;
        this.azureFirewall = azureFirewall;
        this.bgpConnections = Objects.requireNonNull(bgpConnections);
        this.etag = Objects.requireNonNull(etag);
        this.expressRouteGateway = expressRouteGateway;
        this.id = id;
        this.ipConfigurations = Objects.requireNonNull(ipConfigurations);
        this.location = Objects.requireNonNull(location);
        this.name = Objects.requireNonNull(name);
        this.p2SVpnGateway = p2SVpnGateway;
        this.provisioningState = Objects.requireNonNull(provisioningState);
        this.routeTable = routeTable;
        this.routingState = Objects.requireNonNull(routingState);
        this.securityPartnerProvider = securityPartnerProvider;
        this.securityProviderName = securityProviderName;
        this.sku = sku;
        this.tags = tags;
        this.type = Objects.requireNonNull(type);
        this.virtualHubRouteTableV2s = virtualHubRouteTableV2s;
        this.virtualRouterAsn = virtualRouterAsn;
        this.virtualRouterIps = virtualRouterIps;
        this.virtualWan = virtualWan;
        this.vpnGateway = vpnGateway;
    }

    public Optional<String> getAddressPrefix() {
        return Optional.ofNullable(this.addressPrefix);
    }
    public Optional<Boolean> getAllowBranchToBranchTraffic() {
        return Optional.ofNullable(this.allowBranchToBranchTraffic);
    }
    public Optional<SubResourceResponse> getAzureFirewall() {
        return Optional.ofNullable(this.azureFirewall);
    }
    public List<SubResourceResponse> getBgpConnections() {
        return this.bgpConnections;
    }
    public String getEtag() {
        return this.etag;
    }
    public Optional<SubResourceResponse> getExpressRouteGateway() {
        return Optional.ofNullable(this.expressRouteGateway);
    }
    public Optional<String> getId() {
        return Optional.ofNullable(this.id);
    }
    public List<SubResourceResponse> getIpConfigurations() {
        return this.ipConfigurations;
    }
    public String getLocation() {
        return this.location;
    }
    public String getName() {
        return this.name;
    }
    public Optional<SubResourceResponse> getP2SVpnGateway() {
        return Optional.ofNullable(this.p2SVpnGateway);
    }
    public String getProvisioningState() {
        return this.provisioningState;
    }
    public Optional<VirtualHubRouteTableResponse> getRouteTable() {
        return Optional.ofNullable(this.routeTable);
    }
    public String getRoutingState() {
        return this.routingState;
    }
    public Optional<SubResourceResponse> getSecurityPartnerProvider() {
        return Optional.ofNullable(this.securityPartnerProvider);
    }
    public Optional<String> getSecurityProviderName() {
        return Optional.ofNullable(this.securityProviderName);
    }
    public Optional<String> getSku() {
        return Optional.ofNullable(this.sku);
    }
    public Map<String,String> getTags() {
        return this.tags == null ? Map.of() : this.tags;
    }
    public String getType() {
        return this.type;
    }
    public List<VirtualHubRouteTableV2Response> getVirtualHubRouteTableV2s() {
        return this.virtualHubRouteTableV2s == null ? List.of() : this.virtualHubRouteTableV2s;
    }
    public Optional<Double> getVirtualRouterAsn() {
        return Optional.ofNullable(this.virtualRouterAsn);
    }
    public List<String> getVirtualRouterIps() {
        return this.virtualRouterIps == null ? List.of() : this.virtualRouterIps;
    }
    public Optional<SubResourceResponse> getVirtualWan() {
        return Optional.ofNullable(this.virtualWan);
    }
    public Optional<SubResourceResponse> getVpnGateway() {
        return Optional.ofNullable(this.vpnGateway);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetVirtualHubResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String addressPrefix;
        private @Nullable Boolean allowBranchToBranchTraffic;
        private @Nullable SubResourceResponse azureFirewall;
        private List<SubResourceResponse> bgpConnections;
        private String etag;
        private @Nullable SubResourceResponse expressRouteGateway;
        private @Nullable String id;
        private List<SubResourceResponse> ipConfigurations;
        private String location;
        private String name;
        private @Nullable SubResourceResponse p2SVpnGateway;
        private String provisioningState;
        private @Nullable VirtualHubRouteTableResponse routeTable;
        private String routingState;
        private @Nullable SubResourceResponse securityPartnerProvider;
        private @Nullable String securityProviderName;
        private @Nullable String sku;
        private @Nullable Map<String,String> tags;
        private String type;
        private @Nullable List<VirtualHubRouteTableV2Response> virtualHubRouteTableV2s;
        private @Nullable Double virtualRouterAsn;
        private @Nullable List<String> virtualRouterIps;
        private @Nullable SubResourceResponse virtualWan;
        private @Nullable SubResourceResponse vpnGateway;

        public Builder() {
    	      // Empty
        }

        public Builder(GetVirtualHubResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.addressPrefix = defaults.addressPrefix;
    	      this.allowBranchToBranchTraffic = defaults.allowBranchToBranchTraffic;
    	      this.azureFirewall = defaults.azureFirewall;
    	      this.bgpConnections = defaults.bgpConnections;
    	      this.etag = defaults.etag;
    	      this.expressRouteGateway = defaults.expressRouteGateway;
    	      this.id = defaults.id;
    	      this.ipConfigurations = defaults.ipConfigurations;
    	      this.location = defaults.location;
    	      this.name = defaults.name;
    	      this.p2SVpnGateway = defaults.p2SVpnGateway;
    	      this.provisioningState = defaults.provisioningState;
    	      this.routeTable = defaults.routeTable;
    	      this.routingState = defaults.routingState;
    	      this.securityPartnerProvider = defaults.securityPartnerProvider;
    	      this.securityProviderName = defaults.securityProviderName;
    	      this.sku = defaults.sku;
    	      this.tags = defaults.tags;
    	      this.type = defaults.type;
    	      this.virtualHubRouteTableV2s = defaults.virtualHubRouteTableV2s;
    	      this.virtualRouterAsn = defaults.virtualRouterAsn;
    	      this.virtualRouterIps = defaults.virtualRouterIps;
    	      this.virtualWan = defaults.virtualWan;
    	      this.vpnGateway = defaults.vpnGateway;
        }

        public Builder setAddressPrefix(@Nullable String addressPrefix) {
            this.addressPrefix = addressPrefix;
            return this;
        }

        public Builder setAllowBranchToBranchTraffic(@Nullable Boolean allowBranchToBranchTraffic) {
            this.allowBranchToBranchTraffic = allowBranchToBranchTraffic;
            return this;
        }

        public Builder setAzureFirewall(@Nullable SubResourceResponse azureFirewall) {
            this.azureFirewall = azureFirewall;
            return this;
        }

        public Builder setBgpConnections(List<SubResourceResponse> bgpConnections) {
            this.bgpConnections = Objects.requireNonNull(bgpConnections);
            return this;
        }

        public Builder setEtag(String etag) {
            this.etag = Objects.requireNonNull(etag);
            return this;
        }

        public Builder setExpressRouteGateway(@Nullable SubResourceResponse expressRouteGateway) {
            this.expressRouteGateway = expressRouteGateway;
            return this;
        }

        public Builder setId(@Nullable String id) {
            this.id = id;
            return this;
        }

        public Builder setIpConfigurations(List<SubResourceResponse> ipConfigurations) {
            this.ipConfigurations = Objects.requireNonNull(ipConfigurations);
            return this;
        }

        public Builder setLocation(String location) {
            this.location = Objects.requireNonNull(location);
            return this;
        }

        public Builder setName(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }

        public Builder setP2SVpnGateway(@Nullable SubResourceResponse p2SVpnGateway) {
            this.p2SVpnGateway = p2SVpnGateway;
            return this;
        }

        public Builder setProvisioningState(String provisioningState) {
            this.provisioningState = Objects.requireNonNull(provisioningState);
            return this;
        }

        public Builder setRouteTable(@Nullable VirtualHubRouteTableResponse routeTable) {
            this.routeTable = routeTable;
            return this;
        }

        public Builder setRoutingState(String routingState) {
            this.routingState = Objects.requireNonNull(routingState);
            return this;
        }

        public Builder setSecurityPartnerProvider(@Nullable SubResourceResponse securityPartnerProvider) {
            this.securityPartnerProvider = securityPartnerProvider;
            return this;
        }

        public Builder setSecurityProviderName(@Nullable String securityProviderName) {
            this.securityProviderName = securityProviderName;
            return this;
        }

        public Builder setSku(@Nullable String sku) {
            this.sku = sku;
            return this;
        }

        public Builder setTags(@Nullable Map<String,String> tags) {
            this.tags = tags;
            return this;
        }

        public Builder setType(String type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }

        public Builder setVirtualHubRouteTableV2s(@Nullable List<VirtualHubRouteTableV2Response> virtualHubRouteTableV2s) {
            this.virtualHubRouteTableV2s = virtualHubRouteTableV2s;
            return this;
        }

        public Builder setVirtualRouterAsn(@Nullable Double virtualRouterAsn) {
            this.virtualRouterAsn = virtualRouterAsn;
            return this;
        }

        public Builder setVirtualRouterIps(@Nullable List<String> virtualRouterIps) {
            this.virtualRouterIps = virtualRouterIps;
            return this;
        }

        public Builder setVirtualWan(@Nullable SubResourceResponse virtualWan) {
            this.virtualWan = virtualWan;
            return this;
        }

        public Builder setVpnGateway(@Nullable SubResourceResponse vpnGateway) {
            this.vpnGateway = vpnGateway;
            return this;
        }

        public GetVirtualHubResult build() {
            return new GetVirtualHubResult(addressPrefix, allowBranchToBranchTraffic, azureFirewall, bgpConnections, etag, expressRouteGateway, id, ipConfigurations, location, name, p2SVpnGateway, provisioningState, routeTable, routingState, securityPartnerProvider, securityProviderName, sku, tags, type, virtualHubRouteTableV2s, virtualRouterAsn, virtualRouterIps, virtualWan, vpnGateway);
        }
    }
}
