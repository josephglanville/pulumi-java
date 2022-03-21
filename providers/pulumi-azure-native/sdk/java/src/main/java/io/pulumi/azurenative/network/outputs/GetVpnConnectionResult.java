// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.network.outputs;

import io.pulumi.azurenative.network.outputs.IpsecPolicyResponse;
import io.pulumi.azurenative.network.outputs.RoutingConfigurationResponse;
import io.pulumi.azurenative.network.outputs.SubResourceResponse;
import io.pulumi.azurenative.network.outputs.TrafficSelectorPolicyResponse;
import io.pulumi.azurenative.network.outputs.VpnSiteLinkConnectionResponse;
import io.pulumi.core.annotations.CustomType;
import java.lang.Boolean;
import java.lang.Double;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class GetVpnConnectionResult {
    /**
     * Expected bandwidth in MBPS.
     * 
     */
    private final @Nullable Integer connectionBandwidth;
    /**
     * The connection status.
     * 
     */
    private final String connectionStatus;
    /**
     * DPD timeout in seconds for vpn connection.
     * 
     */
    private final @Nullable Integer dpdTimeoutSeconds;
    /**
     * Egress bytes transferred.
     * 
     */
    private final Double egressBytesTransferred;
    /**
     * EnableBgp flag.
     * 
     */
    private final @Nullable Boolean enableBgp;
    /**
     * Enable internet security.
     * 
     */
    private final @Nullable Boolean enableInternetSecurity;
    /**
     * EnableBgp flag.
     * 
     */
    private final @Nullable Boolean enableRateLimiting;
    /**
     * A unique read-only string that changes whenever the resource is updated.
     * 
     */
    private final String etag;
    /**
     * Resource ID.
     * 
     */
    private final @Nullable String id;
    /**
     * Ingress bytes transferred.
     * 
     */
    private final Double ingressBytesTransferred;
    /**
     * The IPSec Policies to be considered by this connection.
     * 
     */
    private final @Nullable List<IpsecPolicyResponse> ipsecPolicies;
    /**
     * The name of the resource that is unique within a resource group. This name can be used to access the resource.
     * 
     */
    private final @Nullable String name;
    /**
     * The provisioning state of the VPN connection resource.
     * 
     */
    private final String provisioningState;
    /**
     * Id of the connected vpn site.
     * 
     */
    private final @Nullable SubResourceResponse remoteVpnSite;
    /**
     * The Routing Configuration indicating the associated and propagated route tables on this connection.
     * 
     */
    private final @Nullable RoutingConfigurationResponse routingConfiguration;
    /**
     * Routing weight for vpn connection.
     * 
     */
    private final @Nullable Integer routingWeight;
    /**
     * SharedKey for the vpn connection.
     * 
     */
    private final @Nullable String sharedKey;
    /**
     * The Traffic Selector Policies to be considered by this connection.
     * 
     */
    private final @Nullable List<TrafficSelectorPolicyResponse> trafficSelectorPolicies;
    /**
     * Use local azure ip to initiate connection.
     * 
     */
    private final @Nullable Boolean useLocalAzureIpAddress;
    /**
     * Enable policy-based traffic selectors.
     * 
     */
    private final @Nullable Boolean usePolicyBasedTrafficSelectors;
    /**
     * Connection protocol used for this connection.
     * 
     */
    private final @Nullable String vpnConnectionProtocolType;
    /**
     * List of all vpn site link connections to the gateway.
     * 
     */
    private final @Nullable List<VpnSiteLinkConnectionResponse> vpnLinkConnections;

    @CustomType.Constructor
    private GetVpnConnectionResult(
        @CustomType.Parameter("connectionBandwidth") @Nullable Integer connectionBandwidth,
        @CustomType.Parameter("connectionStatus") String connectionStatus,
        @CustomType.Parameter("dpdTimeoutSeconds") @Nullable Integer dpdTimeoutSeconds,
        @CustomType.Parameter("egressBytesTransferred") Double egressBytesTransferred,
        @CustomType.Parameter("enableBgp") @Nullable Boolean enableBgp,
        @CustomType.Parameter("enableInternetSecurity") @Nullable Boolean enableInternetSecurity,
        @CustomType.Parameter("enableRateLimiting") @Nullable Boolean enableRateLimiting,
        @CustomType.Parameter("etag") String etag,
        @CustomType.Parameter("id") @Nullable String id,
        @CustomType.Parameter("ingressBytesTransferred") Double ingressBytesTransferred,
        @CustomType.Parameter("ipsecPolicies") @Nullable List<IpsecPolicyResponse> ipsecPolicies,
        @CustomType.Parameter("name") @Nullable String name,
        @CustomType.Parameter("provisioningState") String provisioningState,
        @CustomType.Parameter("remoteVpnSite") @Nullable SubResourceResponse remoteVpnSite,
        @CustomType.Parameter("routingConfiguration") @Nullable RoutingConfigurationResponse routingConfiguration,
        @CustomType.Parameter("routingWeight") @Nullable Integer routingWeight,
        @CustomType.Parameter("sharedKey") @Nullable String sharedKey,
        @CustomType.Parameter("trafficSelectorPolicies") @Nullable List<TrafficSelectorPolicyResponse> trafficSelectorPolicies,
        @CustomType.Parameter("useLocalAzureIpAddress") @Nullable Boolean useLocalAzureIpAddress,
        @CustomType.Parameter("usePolicyBasedTrafficSelectors") @Nullable Boolean usePolicyBasedTrafficSelectors,
        @CustomType.Parameter("vpnConnectionProtocolType") @Nullable String vpnConnectionProtocolType,
        @CustomType.Parameter("vpnLinkConnections") @Nullable List<VpnSiteLinkConnectionResponse> vpnLinkConnections) {
        this.connectionBandwidth = connectionBandwidth;
        this.connectionStatus = connectionStatus;
        this.dpdTimeoutSeconds = dpdTimeoutSeconds;
        this.egressBytesTransferred = egressBytesTransferred;
        this.enableBgp = enableBgp;
        this.enableInternetSecurity = enableInternetSecurity;
        this.enableRateLimiting = enableRateLimiting;
        this.etag = etag;
        this.id = id;
        this.ingressBytesTransferred = ingressBytesTransferred;
        this.ipsecPolicies = ipsecPolicies;
        this.name = name;
        this.provisioningState = provisioningState;
        this.remoteVpnSite = remoteVpnSite;
        this.routingConfiguration = routingConfiguration;
        this.routingWeight = routingWeight;
        this.sharedKey = sharedKey;
        this.trafficSelectorPolicies = trafficSelectorPolicies;
        this.useLocalAzureIpAddress = useLocalAzureIpAddress;
        this.usePolicyBasedTrafficSelectors = usePolicyBasedTrafficSelectors;
        this.vpnConnectionProtocolType = vpnConnectionProtocolType;
        this.vpnLinkConnections = vpnLinkConnections;
    }

    /**
     * Expected bandwidth in MBPS.
     * 
    */
    public Optional<Integer> getConnectionBandwidth() {
        return Optional.ofNullable(this.connectionBandwidth);
    }
    /**
     * The connection status.
     * 
    */
    public String getConnectionStatus() {
        return this.connectionStatus;
    }
    /**
     * DPD timeout in seconds for vpn connection.
     * 
    */
    public Optional<Integer> getDpdTimeoutSeconds() {
        return Optional.ofNullable(this.dpdTimeoutSeconds);
    }
    /**
     * Egress bytes transferred.
     * 
    */
    public Double getEgressBytesTransferred() {
        return this.egressBytesTransferred;
    }
    /**
     * EnableBgp flag.
     * 
    */
    public Optional<Boolean> getEnableBgp() {
        return Optional.ofNullable(this.enableBgp);
    }
    /**
     * Enable internet security.
     * 
    */
    public Optional<Boolean> getEnableInternetSecurity() {
        return Optional.ofNullable(this.enableInternetSecurity);
    }
    /**
     * EnableBgp flag.
     * 
    */
    public Optional<Boolean> getEnableRateLimiting() {
        return Optional.ofNullable(this.enableRateLimiting);
    }
    /**
     * A unique read-only string that changes whenever the resource is updated.
     * 
    */
    public String getEtag() {
        return this.etag;
    }
    /**
     * Resource ID.
     * 
    */
    public Optional<String> getId() {
        return Optional.ofNullable(this.id);
    }
    /**
     * Ingress bytes transferred.
     * 
    */
    public Double getIngressBytesTransferred() {
        return this.ingressBytesTransferred;
    }
    /**
     * The IPSec Policies to be considered by this connection.
     * 
    */
    public List<IpsecPolicyResponse> getIpsecPolicies() {
        return this.ipsecPolicies == null ? List.of() : this.ipsecPolicies;
    }
    /**
     * The name of the resource that is unique within a resource group. This name can be used to access the resource.
     * 
    */
    public Optional<String> getName() {
        return Optional.ofNullable(this.name);
    }
    /**
     * The provisioning state of the VPN connection resource.
     * 
    */
    public String getProvisioningState() {
        return this.provisioningState;
    }
    /**
     * Id of the connected vpn site.
     * 
    */
    public Optional<SubResourceResponse> getRemoteVpnSite() {
        return Optional.ofNullable(this.remoteVpnSite);
    }
    /**
     * The Routing Configuration indicating the associated and propagated route tables on this connection.
     * 
    */
    public Optional<RoutingConfigurationResponse> getRoutingConfiguration() {
        return Optional.ofNullable(this.routingConfiguration);
    }
    /**
     * Routing weight for vpn connection.
     * 
    */
    public Optional<Integer> getRoutingWeight() {
        return Optional.ofNullable(this.routingWeight);
    }
    /**
     * SharedKey for the vpn connection.
     * 
    */
    public Optional<String> getSharedKey() {
        return Optional.ofNullable(this.sharedKey);
    }
    /**
     * The Traffic Selector Policies to be considered by this connection.
     * 
    */
    public List<TrafficSelectorPolicyResponse> getTrafficSelectorPolicies() {
        return this.trafficSelectorPolicies == null ? List.of() : this.trafficSelectorPolicies;
    }
    /**
     * Use local azure ip to initiate connection.
     * 
    */
    public Optional<Boolean> getUseLocalAzureIpAddress() {
        return Optional.ofNullable(this.useLocalAzureIpAddress);
    }
    /**
     * Enable policy-based traffic selectors.
     * 
    */
    public Optional<Boolean> getUsePolicyBasedTrafficSelectors() {
        return Optional.ofNullable(this.usePolicyBasedTrafficSelectors);
    }
    /**
     * Connection protocol used for this connection.
     * 
    */
    public Optional<String> getVpnConnectionProtocolType() {
        return Optional.ofNullable(this.vpnConnectionProtocolType);
    }
    /**
     * List of all vpn site link connections to the gateway.
     * 
    */
    public List<VpnSiteLinkConnectionResponse> getVpnLinkConnections() {
        return this.vpnLinkConnections == null ? List.of() : this.vpnLinkConnections;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetVpnConnectionResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Integer connectionBandwidth;
        private String connectionStatus;
        private @Nullable Integer dpdTimeoutSeconds;
        private Double egressBytesTransferred;
        private @Nullable Boolean enableBgp;
        private @Nullable Boolean enableInternetSecurity;
        private @Nullable Boolean enableRateLimiting;
        private String etag;
        private @Nullable String id;
        private Double ingressBytesTransferred;
        private @Nullable List<IpsecPolicyResponse> ipsecPolicies;
        private @Nullable String name;
        private String provisioningState;
        private @Nullable SubResourceResponse remoteVpnSite;
        private @Nullable RoutingConfigurationResponse routingConfiguration;
        private @Nullable Integer routingWeight;
        private @Nullable String sharedKey;
        private @Nullable List<TrafficSelectorPolicyResponse> trafficSelectorPolicies;
        private @Nullable Boolean useLocalAzureIpAddress;
        private @Nullable Boolean usePolicyBasedTrafficSelectors;
        private @Nullable String vpnConnectionProtocolType;
        private @Nullable List<VpnSiteLinkConnectionResponse> vpnLinkConnections;

        public Builder() {
    	      // Empty
        }

        public Builder(GetVpnConnectionResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.connectionBandwidth = defaults.connectionBandwidth;
    	      this.connectionStatus = defaults.connectionStatus;
    	      this.dpdTimeoutSeconds = defaults.dpdTimeoutSeconds;
    	      this.egressBytesTransferred = defaults.egressBytesTransferred;
    	      this.enableBgp = defaults.enableBgp;
    	      this.enableInternetSecurity = defaults.enableInternetSecurity;
    	      this.enableRateLimiting = defaults.enableRateLimiting;
    	      this.etag = defaults.etag;
    	      this.id = defaults.id;
    	      this.ingressBytesTransferred = defaults.ingressBytesTransferred;
    	      this.ipsecPolicies = defaults.ipsecPolicies;
    	      this.name = defaults.name;
    	      this.provisioningState = defaults.provisioningState;
    	      this.remoteVpnSite = defaults.remoteVpnSite;
    	      this.routingConfiguration = defaults.routingConfiguration;
    	      this.routingWeight = defaults.routingWeight;
    	      this.sharedKey = defaults.sharedKey;
    	      this.trafficSelectorPolicies = defaults.trafficSelectorPolicies;
    	      this.useLocalAzureIpAddress = defaults.useLocalAzureIpAddress;
    	      this.usePolicyBasedTrafficSelectors = defaults.usePolicyBasedTrafficSelectors;
    	      this.vpnConnectionProtocolType = defaults.vpnConnectionProtocolType;
    	      this.vpnLinkConnections = defaults.vpnLinkConnections;
        }

        public Builder connectionBandwidth(@Nullable Integer connectionBandwidth) {
            this.connectionBandwidth = connectionBandwidth;
            return this;
        }
        public Builder connectionStatus(String connectionStatus) {
            this.connectionStatus = Objects.requireNonNull(connectionStatus);
            return this;
        }
        public Builder dpdTimeoutSeconds(@Nullable Integer dpdTimeoutSeconds) {
            this.dpdTimeoutSeconds = dpdTimeoutSeconds;
            return this;
        }
        public Builder egressBytesTransferred(Double egressBytesTransferred) {
            this.egressBytesTransferred = Objects.requireNonNull(egressBytesTransferred);
            return this;
        }
        public Builder enableBgp(@Nullable Boolean enableBgp) {
            this.enableBgp = enableBgp;
            return this;
        }
        public Builder enableInternetSecurity(@Nullable Boolean enableInternetSecurity) {
            this.enableInternetSecurity = enableInternetSecurity;
            return this;
        }
        public Builder enableRateLimiting(@Nullable Boolean enableRateLimiting) {
            this.enableRateLimiting = enableRateLimiting;
            return this;
        }
        public Builder etag(String etag) {
            this.etag = Objects.requireNonNull(etag);
            return this;
        }
        public Builder id(@Nullable String id) {
            this.id = id;
            return this;
        }
        public Builder ingressBytesTransferred(Double ingressBytesTransferred) {
            this.ingressBytesTransferred = Objects.requireNonNull(ingressBytesTransferred);
            return this;
        }
        public Builder ipsecPolicies(@Nullable List<IpsecPolicyResponse> ipsecPolicies) {
            this.ipsecPolicies = ipsecPolicies;
            return this;
        }
        public Builder ipsecPolicies(IpsecPolicyResponse... ipsecPolicies) {
            return ipsecPolicies(List.of(ipsecPolicies));
        }
        public Builder name(@Nullable String name) {
            this.name = name;
            return this;
        }
        public Builder provisioningState(String provisioningState) {
            this.provisioningState = Objects.requireNonNull(provisioningState);
            return this;
        }
        public Builder remoteVpnSite(@Nullable SubResourceResponse remoteVpnSite) {
            this.remoteVpnSite = remoteVpnSite;
            return this;
        }
        public Builder routingConfiguration(@Nullable RoutingConfigurationResponse routingConfiguration) {
            this.routingConfiguration = routingConfiguration;
            return this;
        }
        public Builder routingWeight(@Nullable Integer routingWeight) {
            this.routingWeight = routingWeight;
            return this;
        }
        public Builder sharedKey(@Nullable String sharedKey) {
            this.sharedKey = sharedKey;
            return this;
        }
        public Builder trafficSelectorPolicies(@Nullable List<TrafficSelectorPolicyResponse> trafficSelectorPolicies) {
            this.trafficSelectorPolicies = trafficSelectorPolicies;
            return this;
        }
        public Builder trafficSelectorPolicies(TrafficSelectorPolicyResponse... trafficSelectorPolicies) {
            return trafficSelectorPolicies(List.of(trafficSelectorPolicies));
        }
        public Builder useLocalAzureIpAddress(@Nullable Boolean useLocalAzureIpAddress) {
            this.useLocalAzureIpAddress = useLocalAzureIpAddress;
            return this;
        }
        public Builder usePolicyBasedTrafficSelectors(@Nullable Boolean usePolicyBasedTrafficSelectors) {
            this.usePolicyBasedTrafficSelectors = usePolicyBasedTrafficSelectors;
            return this;
        }
        public Builder vpnConnectionProtocolType(@Nullable String vpnConnectionProtocolType) {
            this.vpnConnectionProtocolType = vpnConnectionProtocolType;
            return this;
        }
        public Builder vpnLinkConnections(@Nullable List<VpnSiteLinkConnectionResponse> vpnLinkConnections) {
            this.vpnLinkConnections = vpnLinkConnections;
            return this;
        }
        public Builder vpnLinkConnections(VpnSiteLinkConnectionResponse... vpnLinkConnections) {
            return vpnLinkConnections(List.of(vpnLinkConnections));
        }        public GetVpnConnectionResult build() {
            return new GetVpnConnectionResult(connectionBandwidth, connectionStatus, dpdTimeoutSeconds, egressBytesTransferred, enableBgp, enableInternetSecurity, enableRateLimiting, etag, id, ingressBytesTransferred, ipsecPolicies, name, provisioningState, remoteVpnSite, routingConfiguration, routingWeight, sharedKey, trafficSelectorPolicies, useLocalAzureIpAddress, usePolicyBasedTrafficSelectors, vpnConnectionProtocolType, vpnLinkConnections);
        }
    }
}
