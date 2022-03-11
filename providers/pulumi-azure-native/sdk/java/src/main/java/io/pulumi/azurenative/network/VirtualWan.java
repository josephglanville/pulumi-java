// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.network;

import io.pulumi.azurenative.Utilities;
import io.pulumi.azurenative.network.VirtualWanArgs;
import io.pulumi.azurenative.network.outputs.SubResourceResponse;
import io.pulumi.core.Alias;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.OutputExport;
import io.pulumi.core.annotations.ResourceType;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Map;
import javax.annotation.Nullable;

/**
 * VirtualWAN Resource.
 * API Version: 2020-11-01.
 * 
 * ## Example Usage
 * 
 * ## Import
 * 
 * An existing resource can be imported using its type token, name, and identifier, e.g.
 * 
 * ```sh
 * $ pulumi import azure-native:network:VirtualWan wan1 /subscriptions/subid/resourceGroups/rg1/providers/Microsoft.Network/virtualWANs/wan1 
 * ```
 * 
 */
@ResourceType(type="azure-native:network:VirtualWan")
public class VirtualWan extends io.pulumi.resources.CustomResource {
    /**
     * True if branch to branch traffic is allowed.
     * 
     */
    @OutputExport(name="allowBranchToBranchTraffic", type=Boolean.class, parameters={})
    private Output</* @Nullable */ Boolean> allowBranchToBranchTraffic;

    /**
     * @return True if branch to branch traffic is allowed.
     * 
     */
    public Output</* @Nullable */ Boolean> getAllowBranchToBranchTraffic() {
        return this.allowBranchToBranchTraffic;
    }
    /**
     * True if Vnet to Vnet traffic is allowed.
     * 
     */
    @OutputExport(name="allowVnetToVnetTraffic", type=Boolean.class, parameters={})
    private Output</* @Nullable */ Boolean> allowVnetToVnetTraffic;

    /**
     * @return True if Vnet to Vnet traffic is allowed.
     * 
     */
    public Output</* @Nullable */ Boolean> getAllowVnetToVnetTraffic() {
        return this.allowVnetToVnetTraffic;
    }
    /**
     * Vpn encryption to be disabled or not.
     * 
     */
    @OutputExport(name="disableVpnEncryption", type=Boolean.class, parameters={})
    private Output</* @Nullable */ Boolean> disableVpnEncryption;

    /**
     * @return Vpn encryption to be disabled or not.
     * 
     */
    public Output</* @Nullable */ Boolean> getDisableVpnEncryption() {
        return this.disableVpnEncryption;
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
     * The office local breakout category.
     * 
     */
    @OutputExport(name="office365LocalBreakoutCategory", type=String.class, parameters={})
    private Output<String> office365LocalBreakoutCategory;

    /**
     * @return The office local breakout category.
     * 
     */
    public Output<String> getOffice365LocalBreakoutCategory() {
        return this.office365LocalBreakoutCategory;
    }
    /**
     * The provisioning state of the virtual WAN resource.
     * 
     */
    @OutputExport(name="provisioningState", type=String.class, parameters={})
    private Output<String> provisioningState;

    /**
     * @return The provisioning state of the virtual WAN resource.
     * 
     */
    public Output<String> getProvisioningState() {
        return this.provisioningState;
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
     * List of VirtualHubs in the VirtualWAN.
     * 
     */
    @OutputExport(name="virtualHubs", type=List.class, parameters={SubResourceResponse.class})
    private Output<List<SubResourceResponse>> virtualHubs;

    /**
     * @return List of VirtualHubs in the VirtualWAN.
     * 
     */
    public Output<List<SubResourceResponse>> getVirtualHubs() {
        return this.virtualHubs;
    }
    /**
     * List of VpnSites in the VirtualWAN.
     * 
     */
    @OutputExport(name="vpnSites", type=List.class, parameters={SubResourceResponse.class})
    private Output<List<SubResourceResponse>> vpnSites;

    /**
     * @return List of VpnSites in the VirtualWAN.
     * 
     */
    public Output<List<SubResourceResponse>> getVpnSites() {
        return this.vpnSites;
    }

    public interface BuilderApplicator {
        public void apply(VirtualWanArgs.Builder a);
    }
    private static io.pulumi.azurenative.network.VirtualWanArgs buildArgs(BuilderApplicator argsBuilder) {
        final var builder = io.pulumi.azurenative.network.VirtualWanArgs.builder();
        argsBuilder.apply(builder);
        return builder.build();
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param argsBuilder A function that configures a passed builder.
     */
    public VirtualWan(String name, BuilderApplicator argsBuilder) {
        this(name, buildArgs(argsBuilder), null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public VirtualWan(String name) {
        this(name, VirtualWanArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public VirtualWan(String name, VirtualWanArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public VirtualWan(String name, VirtualWanArgs args, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("azure-native:network:VirtualWan", name, args == null ? VirtualWanArgs.Empty : args, makeResourceOptions(options, Output.empty()));
    }

    private VirtualWan(String name, Output<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("azure-native:network:VirtualWan", name, null, makeResourceOptions(options, id));
    }

    private static io.pulumi.resources.CustomResourceOptions makeResourceOptions(@Nullable io.pulumi.resources.CustomResourceOptions options, @Nullable Output<String> id) {
        var defaultOptions = io.pulumi.resources.CustomResourceOptions.builder()
            .setVersion(Utilities.getVersion())
            .setAliases(List.of(
                Output.of(Alias.builder().setType("azure-native:network/v20180401:VirtualWan").build()),
                Output.of(Alias.builder().setType("azure-native:network/v20180601:VirtualWan").build()),
                Output.of(Alias.builder().setType("azure-native:network/v20180701:VirtualWan").build()),
                Output.of(Alias.builder().setType("azure-native:network/v20180801:VirtualWan").build()),
                Output.of(Alias.builder().setType("azure-native:network/v20181001:VirtualWan").build()),
                Output.of(Alias.builder().setType("azure-native:network/v20181101:VirtualWan").build()),
                Output.of(Alias.builder().setType("azure-native:network/v20181201:VirtualWan").build()),
                Output.of(Alias.builder().setType("azure-native:network/v20190201:VirtualWan").build()),
                Output.of(Alias.builder().setType("azure-native:network/v20190401:VirtualWan").build()),
                Output.of(Alias.builder().setType("azure-native:network/v20190601:VirtualWan").build()),
                Output.of(Alias.builder().setType("azure-native:network/v20190701:VirtualWan").build()),
                Output.of(Alias.builder().setType("azure-native:network/v20190801:VirtualWan").build()),
                Output.of(Alias.builder().setType("azure-native:network/v20190901:VirtualWan").build()),
                Output.of(Alias.builder().setType("azure-native:network/v20191101:VirtualWan").build()),
                Output.of(Alias.builder().setType("azure-native:network/v20191201:VirtualWan").build()),
                Output.of(Alias.builder().setType("azure-native:network/v20200301:VirtualWan").build()),
                Output.of(Alias.builder().setType("azure-native:network/v20200401:VirtualWan").build()),
                Output.of(Alias.builder().setType("azure-native:network/v20200501:VirtualWan").build()),
                Output.of(Alias.builder().setType("azure-native:network/v20200601:VirtualWan").build()),
                Output.of(Alias.builder().setType("azure-native:network/v20200701:VirtualWan").build()),
                Output.of(Alias.builder().setType("azure-native:network/v20200801:VirtualWan").build()),
                Output.of(Alias.builder().setType("azure-native:network/v20201101:VirtualWan").build()),
                Output.of(Alias.builder().setType("azure-native:network/v20210201:VirtualWan").build()),
                Output.of(Alias.builder().setType("azure-native:network/v20210301:VirtualWan").build()),
                Output.of(Alias.builder().setType("azure-native:network/v20210501:VirtualWan").build())
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
    public static VirtualWan get(String name, Output<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        return new VirtualWan(name, id, options);
    }
}
