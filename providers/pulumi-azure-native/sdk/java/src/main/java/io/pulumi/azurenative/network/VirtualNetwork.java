// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.network;

import io.pulumi.azurenative.Utilities;
import io.pulumi.azurenative.network.VirtualNetworkArgs;
import io.pulumi.azurenative.network.outputs.AddressSpaceResponse;
import io.pulumi.azurenative.network.outputs.DhcpOptionsResponse;
import io.pulumi.azurenative.network.outputs.ExtendedLocationResponse;
import io.pulumi.azurenative.network.outputs.SubResourceResponse;
import io.pulumi.azurenative.network.outputs.SubnetResponse;
import io.pulumi.azurenative.network.outputs.VirtualNetworkBgpCommunitiesResponse;
import io.pulumi.azurenative.network.outputs.VirtualNetworkPeeringResponse;
import io.pulumi.core.Alias;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.Export;
import io.pulumi.core.annotations.ResourceType;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Map;
import javax.annotation.Nullable;

/**
 * Virtual Network resource.
 * API Version: 2020-11-01.
 * 
 * ## Example Usage
 * 
 * ## Import
 * 
 * An existing resource can be imported using its type token, name, and identifier, e.g.
 * 
 * ```sh
 * $ pulumi import azure-native:network:VirtualNetwork test-vnet /subscriptions/subid/resourceGroups/rg1/providers/Microsoft.Network/virtualNetworks/test-vnet 
 * ```
 * 
 */
@ResourceType(type="azure-native:network:VirtualNetwork")
public class VirtualNetwork extends io.pulumi.resources.CustomResource {
    /**
     * The AddressSpace that contains an array of IP address ranges that can be used by subnets.
     * 
     */
    @Export(name="addressSpace", type=AddressSpaceResponse.class, parameters={})
    private Output</* @Nullable */ AddressSpaceResponse> addressSpace;

    /**
     * @return The AddressSpace that contains an array of IP address ranges that can be used by subnets.
     * 
     */
    public Output</* @Nullable */ AddressSpaceResponse> getAddressSpace() {
        return this.addressSpace;
    }
    /**
     * Bgp Communities sent over ExpressRoute with each route corresponding to a prefix in this VNET.
     * 
     */
    @Export(name="bgpCommunities", type=VirtualNetworkBgpCommunitiesResponse.class, parameters={})
    private Output</* @Nullable */ VirtualNetworkBgpCommunitiesResponse> bgpCommunities;

    /**
     * @return Bgp Communities sent over ExpressRoute with each route corresponding to a prefix in this VNET.
     * 
     */
    public Output</* @Nullable */ VirtualNetworkBgpCommunitiesResponse> getBgpCommunities() {
        return this.bgpCommunities;
    }
    /**
     * The DDoS protection plan associated with the virtual network.
     * 
     */
    @Export(name="ddosProtectionPlan", type=SubResourceResponse.class, parameters={})
    private Output</* @Nullable */ SubResourceResponse> ddosProtectionPlan;

    /**
     * @return The DDoS protection plan associated with the virtual network.
     * 
     */
    public Output</* @Nullable */ SubResourceResponse> getDdosProtectionPlan() {
        return this.ddosProtectionPlan;
    }
    /**
     * The dhcpOptions that contains an array of DNS servers available to VMs deployed in the virtual network.
     * 
     */
    @Export(name="dhcpOptions", type=DhcpOptionsResponse.class, parameters={})
    private Output</* @Nullable */ DhcpOptionsResponse> dhcpOptions;

    /**
     * @return The dhcpOptions that contains an array of DNS servers available to VMs deployed in the virtual network.
     * 
     */
    public Output</* @Nullable */ DhcpOptionsResponse> getDhcpOptions() {
        return this.dhcpOptions;
    }
    /**
     * Indicates if DDoS protection is enabled for all the protected resources in the virtual network. It requires a DDoS protection plan associated with the resource.
     * 
     */
    @Export(name="enableDdosProtection", type=Boolean.class, parameters={})
    private Output</* @Nullable */ Boolean> enableDdosProtection;

    /**
     * @return Indicates if DDoS protection is enabled for all the protected resources in the virtual network. It requires a DDoS protection plan associated with the resource.
     * 
     */
    public Output</* @Nullable */ Boolean> getEnableDdosProtection() {
        return this.enableDdosProtection;
    }
    /**
     * Indicates if VM protection is enabled for all the subnets in the virtual network.
     * 
     */
    @Export(name="enableVmProtection", type=Boolean.class, parameters={})
    private Output</* @Nullable */ Boolean> enableVmProtection;

    /**
     * @return Indicates if VM protection is enabled for all the subnets in the virtual network.
     * 
     */
    public Output</* @Nullable */ Boolean> getEnableVmProtection() {
        return this.enableVmProtection;
    }
    /**
     * A unique read-only string that changes whenever the resource is updated.
     * 
     */
    @Export(name="etag", type=String.class, parameters={})
    private Output<String> etag;

    /**
     * @return A unique read-only string that changes whenever the resource is updated.
     * 
     */
    public Output<String> getEtag() {
        return this.etag;
    }
    /**
     * The extended location of the virtual network.
     * 
     */
    @Export(name="extendedLocation", type=ExtendedLocationResponse.class, parameters={})
    private Output</* @Nullable */ ExtendedLocationResponse> extendedLocation;

    /**
     * @return The extended location of the virtual network.
     * 
     */
    public Output</* @Nullable */ ExtendedLocationResponse> getExtendedLocation() {
        return this.extendedLocation;
    }
    /**
     * Array of IpAllocation which reference this VNET.
     * 
     */
    @Export(name="ipAllocations", type=List.class, parameters={SubResourceResponse.class})
    private Output</* @Nullable */ List<SubResourceResponse>> ipAllocations;

    /**
     * @return Array of IpAllocation which reference this VNET.
     * 
     */
    public Output</* @Nullable */ List<SubResourceResponse>> getIpAllocations() {
        return this.ipAllocations;
    }
    /**
     * Resource location.
     * 
     */
    @Export(name="location", type=String.class, parameters={})
    private Output</* @Nullable */ String> location;

    /**
     * @return Resource location.
     * 
     */
    public Output</* @Nullable */ String> getLocation() {
        return this.location;
    }
    /**
     * Resource name.
     * 
     */
    @Export(name="name", type=String.class, parameters={})
    private Output<String> name;

    /**
     * @return Resource name.
     * 
     */
    public Output<String> getName() {
        return this.name;
    }
    /**
     * The provisioning state of the virtual network resource.
     * 
     */
    @Export(name="provisioningState", type=String.class, parameters={})
    private Output<String> provisioningState;

    /**
     * @return The provisioning state of the virtual network resource.
     * 
     */
    public Output<String> getProvisioningState() {
        return this.provisioningState;
    }
    /**
     * The resourceGuid property of the Virtual Network resource.
     * 
     */
    @Export(name="resourceGuid", type=String.class, parameters={})
    private Output<String> resourceGuid;

    /**
     * @return The resourceGuid property of the Virtual Network resource.
     * 
     */
    public Output<String> getResourceGuid() {
        return this.resourceGuid;
    }
    /**
     * A list of subnets in a Virtual Network.
     * 
     */
    @Export(name="subnets", type=List.class, parameters={SubnetResponse.class})
    private Output</* @Nullable */ List<SubnetResponse>> subnets;

    /**
     * @return A list of subnets in a Virtual Network.
     * 
     */
    public Output</* @Nullable */ List<SubnetResponse>> getSubnets() {
        return this.subnets;
    }
    /**
     * Resource tags.
     * 
     */
    @Export(name="tags", type=Map.class, parameters={String.class, String.class})
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
    @Export(name="type", type=String.class, parameters={})
    private Output<String> type;

    /**
     * @return Resource type.
     * 
     */
    public Output<String> getType() {
        return this.type;
    }
    /**
     * A list of peerings in a Virtual Network.
     * 
     */
    @Export(name="virtualNetworkPeerings", type=List.class, parameters={VirtualNetworkPeeringResponse.class})
    private Output</* @Nullable */ List<VirtualNetworkPeeringResponse>> virtualNetworkPeerings;

    /**
     * @return A list of peerings in a Virtual Network.
     * 
     */
    public Output</* @Nullable */ List<VirtualNetworkPeeringResponse>> getVirtualNetworkPeerings() {
        return this.virtualNetworkPeerings;
    }

    public interface BuilderApplicator {
        public void apply(VirtualNetworkArgs.Builder a);
    }
    private static io.pulumi.azurenative.network.VirtualNetworkArgs buildArgs(BuilderApplicator argsBuilder) {
        final var builder = io.pulumi.azurenative.network.VirtualNetworkArgs.builder();
        argsBuilder.apply(builder);
        return builder.build();
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param argsBuilder A function that configures a passed builder.
     */
    public VirtualNetwork(String name, BuilderApplicator argsBuilder) {
        this(name, buildArgs(argsBuilder), null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public VirtualNetwork(String name) {
        this(name, VirtualNetworkArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public VirtualNetwork(String name, VirtualNetworkArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public VirtualNetwork(String name, VirtualNetworkArgs args, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("azure-native:network:VirtualNetwork", name, args == null ? VirtualNetworkArgs.Empty : args, makeResourceOptions(options, Output.empty()));
    }

    private VirtualNetwork(String name, Output<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("azure-native:network:VirtualNetwork", name, null, makeResourceOptions(options, id));
    }

    private static io.pulumi.resources.CustomResourceOptions makeResourceOptions(@Nullable io.pulumi.resources.CustomResourceOptions options, @Nullable Output<String> id) {
        var defaultOptions = io.pulumi.resources.CustomResourceOptions.builder()
            .version(Utilities.getVersion())
            .aliases(List.of(
                Output.of(Alias.builder().type("azure-native:network/v20150501preview:VirtualNetwork").build()),
                Output.of(Alias.builder().type("azure-native:network/v20150615:VirtualNetwork").build()),
                Output.of(Alias.builder().type("azure-native:network/v20160330:VirtualNetwork").build()),
                Output.of(Alias.builder().type("azure-native:network/v20160601:VirtualNetwork").build()),
                Output.of(Alias.builder().type("azure-native:network/v20160901:VirtualNetwork").build()),
                Output.of(Alias.builder().type("azure-native:network/v20161201:VirtualNetwork").build()),
                Output.of(Alias.builder().type("azure-native:network/v20170301:VirtualNetwork").build()),
                Output.of(Alias.builder().type("azure-native:network/v20170601:VirtualNetwork").build()),
                Output.of(Alias.builder().type("azure-native:network/v20170801:VirtualNetwork").build()),
                Output.of(Alias.builder().type("azure-native:network/v20170901:VirtualNetwork").build()),
                Output.of(Alias.builder().type("azure-native:network/v20171001:VirtualNetwork").build()),
                Output.of(Alias.builder().type("azure-native:network/v20171101:VirtualNetwork").build()),
                Output.of(Alias.builder().type("azure-native:network/v20180101:VirtualNetwork").build()),
                Output.of(Alias.builder().type("azure-native:network/v20180201:VirtualNetwork").build()),
                Output.of(Alias.builder().type("azure-native:network/v20180401:VirtualNetwork").build()),
                Output.of(Alias.builder().type("azure-native:network/v20180601:VirtualNetwork").build()),
                Output.of(Alias.builder().type("azure-native:network/v20180701:VirtualNetwork").build()),
                Output.of(Alias.builder().type("azure-native:network/v20180801:VirtualNetwork").build()),
                Output.of(Alias.builder().type("azure-native:network/v20181001:VirtualNetwork").build()),
                Output.of(Alias.builder().type("azure-native:network/v20181101:VirtualNetwork").build()),
                Output.of(Alias.builder().type("azure-native:network/v20181201:VirtualNetwork").build()),
                Output.of(Alias.builder().type("azure-native:network/v20190201:VirtualNetwork").build()),
                Output.of(Alias.builder().type("azure-native:network/v20190401:VirtualNetwork").build()),
                Output.of(Alias.builder().type("azure-native:network/v20190601:VirtualNetwork").build()),
                Output.of(Alias.builder().type("azure-native:network/v20190701:VirtualNetwork").build()),
                Output.of(Alias.builder().type("azure-native:network/v20190801:VirtualNetwork").build()),
                Output.of(Alias.builder().type("azure-native:network/v20190901:VirtualNetwork").build()),
                Output.of(Alias.builder().type("azure-native:network/v20191101:VirtualNetwork").build()),
                Output.of(Alias.builder().type("azure-native:network/v20191201:VirtualNetwork").build()),
                Output.of(Alias.builder().type("azure-native:network/v20200301:VirtualNetwork").build()),
                Output.of(Alias.builder().type("azure-native:network/v20200401:VirtualNetwork").build()),
                Output.of(Alias.builder().type("azure-native:network/v20200501:VirtualNetwork").build()),
                Output.of(Alias.builder().type("azure-native:network/v20200601:VirtualNetwork").build()),
                Output.of(Alias.builder().type("azure-native:network/v20200701:VirtualNetwork").build()),
                Output.of(Alias.builder().type("azure-native:network/v20200801:VirtualNetwork").build()),
                Output.of(Alias.builder().type("azure-native:network/v20201101:VirtualNetwork").build()),
                Output.of(Alias.builder().type("azure-native:network/v20210201:VirtualNetwork").build()),
                Output.of(Alias.builder().type("azure-native:network/v20210301:VirtualNetwork").build()),
                Output.of(Alias.builder().type("azure-native:network/v20210501:VirtualNetwork").build())
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
    public static VirtualNetwork get(String name, Output<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        return new VirtualNetwork(name, id, options);
    }
}
