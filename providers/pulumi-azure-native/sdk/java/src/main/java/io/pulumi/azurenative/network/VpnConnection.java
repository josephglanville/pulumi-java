// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.network;

import io.pulumi.azurenative.Utilities;
import io.pulumi.azurenative.network.VpnConnectionArgs;
import io.pulumi.azurenative.network.outputs.IpsecPolicyResponse;
import io.pulumi.azurenative.network.outputs.RoutingConfigurationResponse;
import io.pulumi.azurenative.network.outputs.SubResourceResponse;
import io.pulumi.azurenative.network.outputs.TrafficSelectorPolicyResponse;
import io.pulumi.azurenative.network.outputs.VpnSiteLinkConnectionResponse;
import io.pulumi.core.Alias;
import io.pulumi.core.Input;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.OutputExport;
import io.pulumi.core.annotations.ResourceType;
import java.lang.Boolean;
import java.lang.Double;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import javax.annotation.Nullable;

/**
 * VpnConnection Resource.
 * API Version: 2020-11-01.
 * 
 * ## Example Usage
 * 
 * ## Import
 * 
 * An existing resource can be imported using its type token, name, and identifier, e.g.
 * 
 * ```sh
 * $ pulumi import azure-native:network:VpnConnection vpnConnection1 /subscriptions/subid/resourceGroups/rg1/providers/Microsoft.Network/vpnGateways/gateway1/vpnConnections/vpnConnection1 
 * ```
 * 
 */
@ResourceType(type="azure-native:network:VpnConnection")
public class VpnConnection extends io.pulumi.resources.CustomResource {
    /**
     * Expected bandwidth in MBPS.
     * 
     */
    @OutputExport(name="connectionBandwidth", type=Integer.class, parameters={})
    private Output</* @Nullable */ Integer> connectionBandwidth;

    /**
     * @return Expected bandwidth in MBPS.
     * 
     */
    public Output</* @Nullable */ Integer> getConnectionBandwidth() {
        return this.connectionBandwidth;
    }
    /**
     * The connection status.
     * 
     */
    @OutputExport(name="connectionStatus", type=String.class, parameters={})
    private Output<String> connectionStatus;

    /**
     * @return The connection status.
     * 
     */
    public Output<String> getConnectionStatus() {
        return this.connectionStatus;
    }
    /**
     * DPD timeout in seconds for vpn connection.
     * 
     */
    @OutputExport(name="dpdTimeoutSeconds", type=Integer.class, parameters={})
    private Output</* @Nullable */ Integer> dpdTimeoutSeconds;

    /**
     * @return DPD timeout in seconds for vpn connection.
     * 
     */
    public Output</* @Nullable */ Integer> getDpdTimeoutSeconds() {
        return this.dpdTimeoutSeconds;
    }
    /**
     * Egress bytes transferred.
     * 
     */
    @OutputExport(name="egressBytesTransferred", type=Double.class, parameters={})
    private Output<Double> egressBytesTransferred;

    /**
     * @return Egress bytes transferred.
     * 
     */
    public Output<Double> getEgressBytesTransferred() {
        return this.egressBytesTransferred;
    }
    /**
     * EnableBgp flag.
     * 
     */
    @OutputExport(name="enableBgp", type=Boolean.class, parameters={})
    private Output</* @Nullable */ Boolean> enableBgp;

    /**
     * @return EnableBgp flag.
     * 
     */
    public Output</* @Nullable */ Boolean> getEnableBgp() {
        return this.enableBgp;
    }
    /**
     * Enable internet security.
     * 
     */
    @OutputExport(name="enableInternetSecurity", type=Boolean.class, parameters={})
    private Output</* @Nullable */ Boolean> enableInternetSecurity;

    /**
     * @return Enable internet security.
     * 
     */
    public Output</* @Nullable */ Boolean> getEnableInternetSecurity() {
        return this.enableInternetSecurity;
    }
    /**
     * EnableBgp flag.
     * 
     */
    @OutputExport(name="enableRateLimiting", type=Boolean.class, parameters={})
    private Output</* @Nullable */ Boolean> enableRateLimiting;

    /**
     * @return EnableBgp flag.
     * 
     */
    public Output</* @Nullable */ Boolean> getEnableRateLimiting() {
        return this.enableRateLimiting;
    }
    /**
     * A unique read-only string that changes whenever the resource is updated.
     * 
     */
    @OutputExport(name="etag", type=String.class, parameters={})
    private Output<String> etag;

    /**
     * @return A unique read-only string that changes whenever the resource is updated.
     * 
     */
    public Output<String> getEtag() {
        return this.etag;
    }
    /**
     * Ingress bytes transferred.
     * 
     */
    @OutputExport(name="ingressBytesTransferred", type=Double.class, parameters={})
    private Output<Double> ingressBytesTransferred;

    /**
     * @return Ingress bytes transferred.
     * 
     */
    public Output<Double> getIngressBytesTransferred() {
        return this.ingressBytesTransferred;
    }
    /**
     * The IPSec Policies to be considered by this connection.
     * 
     */
    @OutputExport(name="ipsecPolicies", type=List.class, parameters={IpsecPolicyResponse.class})
    private Output</* @Nullable */ List<IpsecPolicyResponse>> ipsecPolicies;

    /**
     * @return The IPSec Policies to be considered by this connection.
     * 
     */
    public Output</* @Nullable */ List<IpsecPolicyResponse>> getIpsecPolicies() {
        return this.ipsecPolicies;
    }
    /**
     * The name of the resource that is unique within a resource group. This name can be used to access the resource.
     * 
     */
    @OutputExport(name="name", type=String.class, parameters={})
    private Output</* @Nullable */ String> name;

    /**
     * @return The name of the resource that is unique within a resource group. This name can be used to access the resource.
     * 
     */
    public Output</* @Nullable */ String> getName() {
        return this.name;
    }
    /**
     * The provisioning state of the VPN connection resource.
     * 
     */
    @OutputExport(name="provisioningState", type=String.class, parameters={})
    private Output<String> provisioningState;

    /**
     * @return The provisioning state of the VPN connection resource.
     * 
     */
    public Output<String> getProvisioningState() {
        return this.provisioningState;
    }
    /**
     * Id of the connected vpn site.
     * 
     */
    @OutputExport(name="remoteVpnSite", type=SubResourceResponse.class, parameters={})
    private Output</* @Nullable */ SubResourceResponse> remoteVpnSite;

    /**
     * @return Id of the connected vpn site.
     * 
     */
    public Output</* @Nullable */ SubResourceResponse> getRemoteVpnSite() {
        return this.remoteVpnSite;
    }
    /**
     * The Routing Configuration indicating the associated and propagated route tables on this connection.
     * 
     */
    @OutputExport(name="routingConfiguration", type=RoutingConfigurationResponse.class, parameters={})
    private Output</* @Nullable */ RoutingConfigurationResponse> routingConfiguration;

    /**
     * @return The Routing Configuration indicating the associated and propagated route tables on this connection.
     * 
     */
    public Output</* @Nullable */ RoutingConfigurationResponse> getRoutingConfiguration() {
        return this.routingConfiguration;
    }
    /**
     * Routing weight for vpn connection.
     * 
     */
    @OutputExport(name="routingWeight", type=Integer.class, parameters={})
    private Output</* @Nullable */ Integer> routingWeight;

    /**
     * @return Routing weight for vpn connection.
     * 
     */
    public Output</* @Nullable */ Integer> getRoutingWeight() {
        return this.routingWeight;
    }
    /**
     * SharedKey for the vpn connection.
     * 
     */
    @OutputExport(name="sharedKey", type=String.class, parameters={})
    private Output</* @Nullable */ String> sharedKey;

    /**
     * @return SharedKey for the vpn connection.
     * 
     */
    public Output</* @Nullable */ String> getSharedKey() {
        return this.sharedKey;
    }
    /**
     * The Traffic Selector Policies to be considered by this connection.
     * 
     */
    @OutputExport(name="trafficSelectorPolicies", type=List.class, parameters={TrafficSelectorPolicyResponse.class})
    private Output</* @Nullable */ List<TrafficSelectorPolicyResponse>> trafficSelectorPolicies;

    /**
     * @return The Traffic Selector Policies to be considered by this connection.
     * 
     */
    public Output</* @Nullable */ List<TrafficSelectorPolicyResponse>> getTrafficSelectorPolicies() {
        return this.trafficSelectorPolicies;
    }
    /**
     * Use local azure ip to initiate connection.
     * 
     */
    @OutputExport(name="useLocalAzureIpAddress", type=Boolean.class, parameters={})
    private Output</* @Nullable */ Boolean> useLocalAzureIpAddress;

    /**
     * @return Use local azure ip to initiate connection.
     * 
     */
    public Output</* @Nullable */ Boolean> getUseLocalAzureIpAddress() {
        return this.useLocalAzureIpAddress;
    }
    /**
     * Enable policy-based traffic selectors.
     * 
     */
    @OutputExport(name="usePolicyBasedTrafficSelectors", type=Boolean.class, parameters={})
    private Output</* @Nullable */ Boolean> usePolicyBasedTrafficSelectors;

    /**
     * @return Enable policy-based traffic selectors.
     * 
     */
    public Output</* @Nullable */ Boolean> getUsePolicyBasedTrafficSelectors() {
        return this.usePolicyBasedTrafficSelectors;
    }
    /**
     * Connection protocol used for this connection.
     * 
     */
    @OutputExport(name="vpnConnectionProtocolType", type=String.class, parameters={})
    private Output</* @Nullable */ String> vpnConnectionProtocolType;

    /**
     * @return Connection protocol used for this connection.
     * 
     */
    public Output</* @Nullable */ String> getVpnConnectionProtocolType() {
        return this.vpnConnectionProtocolType;
    }
    /**
     * List of all vpn site link connections to the gateway.
     * 
     */
    @OutputExport(name="vpnLinkConnections", type=List.class, parameters={VpnSiteLinkConnectionResponse.class})
    private Output</* @Nullable */ List<VpnSiteLinkConnectionResponse>> vpnLinkConnections;

    /**
     * @return List of all vpn site link connections to the gateway.
     * 
     */
    public Output</* @Nullable */ List<VpnSiteLinkConnectionResponse>> getVpnLinkConnections() {
        return this.vpnLinkConnections;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public VpnConnection(String name) {
        this(name, VpnConnectionArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public VpnConnection(String name, VpnConnectionArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public VpnConnection(String name, VpnConnectionArgs args, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("azure-native:network:VpnConnection", name, args == null ? VpnConnectionArgs.Empty : args, makeResourceOptions(options, Input.empty()));
    }

    private VpnConnection(String name, Input<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("azure-native:network:VpnConnection", name, null, makeResourceOptions(options, id));
    }

    private static io.pulumi.resources.CustomResourceOptions makeResourceOptions(@Nullable io.pulumi.resources.CustomResourceOptions options, @Nullable Input<String> id) {
        var defaultOptions = io.pulumi.resources.CustomResourceOptions.builder()
            .setVersion(Utilities.getVersion())
            .setAliases(List.of(
                Input.of(Alias.builder().setType("azure-native:network/v20180401:VpnConnection").build()),
                Input.of(Alias.builder().setType("azure-native:network/v20180601:VpnConnection").build()),
                Input.of(Alias.builder().setType("azure-native:network/v20180701:VpnConnection").build()),
                Input.of(Alias.builder().setType("azure-native:network/v20180801:VpnConnection").build()),
                Input.of(Alias.builder().setType("azure-native:network/v20181001:VpnConnection").build()),
                Input.of(Alias.builder().setType("azure-native:network/v20181101:VpnConnection").build()),
                Input.of(Alias.builder().setType("azure-native:network/v20181201:VpnConnection").build()),
                Input.of(Alias.builder().setType("azure-native:network/v20190201:VpnConnection").build()),
                Input.of(Alias.builder().setType("azure-native:network/v20190401:VpnConnection").build()),
                Input.of(Alias.builder().setType("azure-native:network/v20190601:VpnConnection").build()),
                Input.of(Alias.builder().setType("azure-native:network/v20190701:VpnConnection").build()),
                Input.of(Alias.builder().setType("azure-native:network/v20190801:VpnConnection").build()),
                Input.of(Alias.builder().setType("azure-native:network/v20190901:VpnConnection").build()),
                Input.of(Alias.builder().setType("azure-native:network/v20191101:VpnConnection").build()),
                Input.of(Alias.builder().setType("azure-native:network/v20191201:VpnConnection").build()),
                Input.of(Alias.builder().setType("azure-native:network/v20200301:VpnConnection").build()),
                Input.of(Alias.builder().setType("azure-native:network/v20200401:VpnConnection").build()),
                Input.of(Alias.builder().setType("azure-native:network/v20200501:VpnConnection").build()),
                Input.of(Alias.builder().setType("azure-native:network/v20200601:VpnConnection").build()),
                Input.of(Alias.builder().setType("azure-native:network/v20200701:VpnConnection").build()),
                Input.of(Alias.builder().setType("azure-native:network/v20200801:VpnConnection").build()),
                Input.of(Alias.builder().setType("azure-native:network/v20201101:VpnConnection").build()),
                Input.of(Alias.builder().setType("azure-native:network/v20210201:VpnConnection").build()),
                Input.of(Alias.builder().setType("azure-native:network/v20210301:VpnConnection").build()),
                Input.of(Alias.builder().setType("azure-native:network/v20210501:VpnConnection").build())
            ))
            .build();
        return io.pulumi.resources.CustomResourceOptions.merge(defaultOptions, options, id);
    }

    /**
     * Get an existing Host resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param options Optional settings to control the behavior of the CustomResource.
     */
    public static VpnConnection get(String name, Input<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        return new VpnConnection(name, id, options);
    }
}
