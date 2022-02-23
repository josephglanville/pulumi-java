// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.network;

import io.pulumi.azurenative.Utilities;
import io.pulumi.azurenative.network.VirtualHubArgs;
import io.pulumi.azurenative.network.outputs.SubResourceResponse;
import io.pulumi.azurenative.network.outputs.VirtualHubRouteTableResponse;
import io.pulumi.azurenative.network.outputs.VirtualHubRouteTableV2Response;
import io.pulumi.core.Alias;
import io.pulumi.core.Input;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.OutputExport;
import io.pulumi.core.annotations.ResourceType;
import java.lang.Boolean;
import java.lang.Double;
import java.lang.String;
import java.util.List;
import java.util.Map;
import javax.annotation.Nullable;

/**
 * VirtualHub Resource.
 * API Version: 2020-11-01.
 * 
 * ## Example Usage
 * 
 * ## Import
 * 
 * An existing resource can be imported using its type token, name, and identifier, e.g.
 * 
 * ```sh
 * $ pulumi import azure-native:network:VirtualHub virtualHub2 /subscriptions/subid/resourceGroups/rg1/providers/Microsoft.Network/virtualHubs/virtualHub2 
 * ```
 * 
 */
@ResourceType(type="azure-native:network:VirtualHub")
public class VirtualHub extends io.pulumi.resources.CustomResource {
    /**
     * Address-prefix for this VirtualHub.
     * 
     */
    @OutputExport(name="addressPrefix", type=String.class, parameters={})
    private Output</* @Nullable */ String> addressPrefix;

    /**
     * @return Address-prefix for this VirtualHub.
     * 
     */
    public Output</* @Nullable */ String> getAddressPrefix() {
        return this.addressPrefix;
    }
    /**
     * Flag to control transit for VirtualRouter hub.
     * 
     */
    @OutputExport(name="allowBranchToBranchTraffic", type=Boolean.class, parameters={})
    private Output</* @Nullable */ Boolean> allowBranchToBranchTraffic;

    /**
     * @return Flag to control transit for VirtualRouter hub.
     * 
     */
    public Output</* @Nullable */ Boolean> getAllowBranchToBranchTraffic() {
        return this.allowBranchToBranchTraffic;
    }
    /**
     * The azureFirewall associated with this VirtualHub.
     * 
     */
    @OutputExport(name="azureFirewall", type=SubResourceResponse.class, parameters={})
    private Output</* @Nullable */ SubResourceResponse> azureFirewall;

    /**
     * @return The azureFirewall associated with this VirtualHub.
     * 
     */
    public Output</* @Nullable */ SubResourceResponse> getAzureFirewall() {
        return this.azureFirewall;
    }
    /**
     * List of references to Bgp Connections.
     * 
     */
    @OutputExport(name="bgpConnections", type=List.class, parameters={SubResourceResponse.class})
    private Output<List<SubResourceResponse>> bgpConnections;

    /**
     * @return List of references to Bgp Connections.
     * 
     */
    public Output<List<SubResourceResponse>> getBgpConnections() {
        return this.bgpConnections;
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
     * The expressRouteGateway associated with this VirtualHub.
     * 
     */
    @OutputExport(name="expressRouteGateway", type=SubResourceResponse.class, parameters={})
    private Output</* @Nullable */ SubResourceResponse> expressRouteGateway;

    /**
     * @return The expressRouteGateway associated with this VirtualHub.
     * 
     */
    public Output</* @Nullable */ SubResourceResponse> getExpressRouteGateway() {
        return this.expressRouteGateway;
    }
    /**
     * List of references to IpConfigurations.
     * 
     */
    @OutputExport(name="ipConfigurations", type=List.class, parameters={SubResourceResponse.class})
    private Output<List<SubResourceResponse>> ipConfigurations;

    /**
     * @return List of references to IpConfigurations.
     * 
     */
    public Output<List<SubResourceResponse>> getIpConfigurations() {
        return this.ipConfigurations;
    }
    /**
     * Resource location.
     * 
     */
    @OutputExport(name="location", type=String.class, parameters={})
    private Output<String> location;

    /**
     * @return Resource location.
     * 
     */
    public Output<String> getLocation() {
        return this.location;
    }
    /**
     * Resource name.
     * 
     */
    @OutputExport(name="name", type=String.class, parameters={})
    private Output<String> name;

    /**
     * @return Resource name.
     * 
     */
    public Output<String> getName() {
        return this.name;
    }
    /**
     * The P2SVpnGateway associated with this VirtualHub.
     * 
     */
    @OutputExport(name="p2SVpnGateway", type=SubResourceResponse.class, parameters={})
    private Output</* @Nullable */ SubResourceResponse> p2SVpnGateway;

    /**
     * @return The P2SVpnGateway associated with this VirtualHub.
     * 
     */
    public Output</* @Nullable */ SubResourceResponse> getP2SVpnGateway() {
        return this.p2SVpnGateway;
    }
    /**
     * The provisioning state of the virtual hub resource.
     * 
     */
    @OutputExport(name="provisioningState", type=String.class, parameters={})
    private Output<String> provisioningState;

    /**
     * @return The provisioning state of the virtual hub resource.
     * 
     */
    public Output<String> getProvisioningState() {
        return this.provisioningState;
    }
    /**
     * The routeTable associated with this virtual hub.
     * 
     */
    @OutputExport(name="routeTable", type=VirtualHubRouteTableResponse.class, parameters={})
    private Output</* @Nullable */ VirtualHubRouteTableResponse> routeTable;

    /**
     * @return The routeTable associated with this virtual hub.
     * 
     */
    public Output</* @Nullable */ VirtualHubRouteTableResponse> getRouteTable() {
        return this.routeTable;
    }
    /**
     * The routing state.
     * 
     */
    @OutputExport(name="routingState", type=String.class, parameters={})
    private Output<String> routingState;

    /**
     * @return The routing state.
     * 
     */
    public Output<String> getRoutingState() {
        return this.routingState;
    }
    /**
     * The securityPartnerProvider associated with this VirtualHub.
     * 
     */
    @OutputExport(name="securityPartnerProvider", type=SubResourceResponse.class, parameters={})
    private Output</* @Nullable */ SubResourceResponse> securityPartnerProvider;

    /**
     * @return The securityPartnerProvider associated with this VirtualHub.
     * 
     */
    public Output</* @Nullable */ SubResourceResponse> getSecurityPartnerProvider() {
        return this.securityPartnerProvider;
    }
    /**
     * The Security Provider name.
     * 
     */
    @OutputExport(name="securityProviderName", type=String.class, parameters={})
    private Output</* @Nullable */ String> securityProviderName;

    /**
     * @return The Security Provider name.
     * 
     */
    public Output</* @Nullable */ String> getSecurityProviderName() {
        return this.securityProviderName;
    }
    /**
     * The sku of this VirtualHub.
     * 
     */
    @OutputExport(name="sku", type=String.class, parameters={})
    private Output</* @Nullable */ String> sku;

    /**
     * @return The sku of this VirtualHub.
     * 
     */
    public Output</* @Nullable */ String> getSku() {
        return this.sku;
    }
    /**
     * Resource tags.
     * 
     */
    @OutputExport(name="tags", type=Map.class, parameters={String.class, String.class})
    private Output</* @Nullable */ Map<String,String>> tags;

    /**
     * @return Resource tags.
     * 
     */
    public Output</* @Nullable */ Map<String,String>> getTags() {
        return this.tags;
    }
    /**
     * Resource type.
     * 
     */
    @OutputExport(name="type", type=String.class, parameters={})
    private Output<String> type;

    /**
     * @return Resource type.
     * 
     */
    public Output<String> getType() {
        return this.type;
    }
    /**
     * List of all virtual hub route table v2s associated with this VirtualHub.
     * 
     */
    @OutputExport(name="virtualHubRouteTableV2s", type=List.class, parameters={VirtualHubRouteTableV2Response.class})
    private Output</* @Nullable */ List<VirtualHubRouteTableV2Response>> virtualHubRouteTableV2s;

    /**
     * @return List of all virtual hub route table v2s associated with this VirtualHub.
     * 
     */
    public Output</* @Nullable */ List<VirtualHubRouteTableV2Response>> getVirtualHubRouteTableV2s() {
        return this.virtualHubRouteTableV2s;
    }
    /**
     * VirtualRouter ASN.
     * 
     */
    @OutputExport(name="virtualRouterAsn", type=Double.class, parameters={})
    private Output</* @Nullable */ Double> virtualRouterAsn;

    /**
     * @return VirtualRouter ASN.
     * 
     */
    public Output</* @Nullable */ Double> getVirtualRouterAsn() {
        return this.virtualRouterAsn;
    }
    /**
     * VirtualRouter IPs.
     * 
     */
    @OutputExport(name="virtualRouterIps", type=List.class, parameters={String.class})
    private Output</* @Nullable */ List<String>> virtualRouterIps;

    /**
     * @return VirtualRouter IPs.
     * 
     */
    public Output</* @Nullable */ List<String>> getVirtualRouterIps() {
        return this.virtualRouterIps;
    }
    /**
     * The VirtualWAN to which the VirtualHub belongs.
     * 
     */
    @OutputExport(name="virtualWan", type=SubResourceResponse.class, parameters={})
    private Output</* @Nullable */ SubResourceResponse> virtualWan;

    /**
     * @return The VirtualWAN to which the VirtualHub belongs.
     * 
     */
    public Output</* @Nullable */ SubResourceResponse> getVirtualWan() {
        return this.virtualWan;
    }
    /**
     * The VpnGateway associated with this VirtualHub.
     * 
     */
    @OutputExport(name="vpnGateway", type=SubResourceResponse.class, parameters={})
    private Output</* @Nullable */ SubResourceResponse> vpnGateway;

    /**
     * @return The VpnGateway associated with this VirtualHub.
     * 
     */
    public Output</* @Nullable */ SubResourceResponse> getVpnGateway() {
        return this.vpnGateway;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public VirtualHub(String name) {
        this(name, VirtualHubArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public VirtualHub(String name, VirtualHubArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public VirtualHub(String name, VirtualHubArgs args, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("azure-native:network:VirtualHub", name, args == null ? VirtualHubArgs.Empty : args, makeResourceOptions(options, Input.empty()));
    }

    private VirtualHub(String name, Input<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("azure-native:network:VirtualHub", name, null, makeResourceOptions(options, id));
    }

    private static io.pulumi.resources.CustomResourceOptions makeResourceOptions(@Nullable io.pulumi.resources.CustomResourceOptions options, @Nullable Input<String> id) {
        var defaultOptions = io.pulumi.resources.CustomResourceOptions.builder()
            .setVersion(Utilities.getVersion())
            .setAliases(List.of(
                Input.of(Alias.builder().setType("azure-native:network/v20180401:VirtualHub").build()),
                Input.of(Alias.builder().setType("azure-native:network/v20180601:VirtualHub").build()),
                Input.of(Alias.builder().setType("azure-native:network/v20180701:VirtualHub").build()),
                Input.of(Alias.builder().setType("azure-native:network/v20180801:VirtualHub").build()),
                Input.of(Alias.builder().setType("azure-native:network/v20181001:VirtualHub").build()),
                Input.of(Alias.builder().setType("azure-native:network/v20181101:VirtualHub").build()),
                Input.of(Alias.builder().setType("azure-native:network/v20181201:VirtualHub").build()),
                Input.of(Alias.builder().setType("azure-native:network/v20190201:VirtualHub").build()),
                Input.of(Alias.builder().setType("azure-native:network/v20190401:VirtualHub").build()),
                Input.of(Alias.builder().setType("azure-native:network/v20190601:VirtualHub").build()),
                Input.of(Alias.builder().setType("azure-native:network/v20190701:VirtualHub").build()),
                Input.of(Alias.builder().setType("azure-native:network/v20190801:VirtualHub").build()),
                Input.of(Alias.builder().setType("azure-native:network/v20190901:VirtualHub").build()),
                Input.of(Alias.builder().setType("azure-native:network/v20191101:VirtualHub").build()),
                Input.of(Alias.builder().setType("azure-native:network/v20191201:VirtualHub").build()),
                Input.of(Alias.builder().setType("azure-native:network/v20200301:VirtualHub").build()),
                Input.of(Alias.builder().setType("azure-native:network/v20200401:VirtualHub").build()),
                Input.of(Alias.builder().setType("azure-native:network/v20200501:VirtualHub").build()),
                Input.of(Alias.builder().setType("azure-native:network/v20200601:VirtualHub").build()),
                Input.of(Alias.builder().setType("azure-native:network/v20200701:VirtualHub").build()),
                Input.of(Alias.builder().setType("azure-native:network/v20200801:VirtualHub").build()),
                Input.of(Alias.builder().setType("azure-native:network/v20201101:VirtualHub").build()),
                Input.of(Alias.builder().setType("azure-native:network/v20210201:VirtualHub").build()),
                Input.of(Alias.builder().setType("azure-native:network/v20210301:VirtualHub").build()),
                Input.of(Alias.builder().setType("azure-native:network/v20210501:VirtualHub").build())
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
    public static VirtualHub get(String name, Input<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        return new VirtualHub(name, id, options);
    }
}
