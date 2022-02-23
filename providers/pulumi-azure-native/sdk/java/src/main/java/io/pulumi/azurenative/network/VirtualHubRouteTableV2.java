// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.network;

import io.pulumi.azurenative.Utilities;
import io.pulumi.azurenative.network.VirtualHubRouteTableV2Args;
import io.pulumi.azurenative.network.outputs.VirtualHubRouteV2Response;
import io.pulumi.core.Alias;
import io.pulumi.core.Input;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.OutputExport;
import io.pulumi.core.annotations.ResourceType;
import java.lang.String;
import java.util.List;
import javax.annotation.Nullable;

/**
 * VirtualHubRouteTableV2 Resource.
 * API Version: 2020-11-01.
 * 
 * ## Example Usage
 * 
 * ## Import
 * 
 * An existing resource can be imported using its type token, name, and identifier, e.g.
 * 
 * ```sh
 * $ pulumi import azure-native:network:VirtualHubRouteTableV2 virtualHubRouteTable1a /subscriptions/subid/resourceGroups/rg1/providers/Microsoft.Network/virtualHubs/virtualHub1/routeTables/virtualHubRouteTable1a 
 * ```
 * 
 */
@ResourceType(type="azure-native:network:VirtualHubRouteTableV2")
public class VirtualHubRouteTableV2 extends io.pulumi.resources.CustomResource {
    /**
     * List of all connections attached to this route table v2.
     * 
     */
    @OutputExport(name="attachedConnections", type=List.class, parameters={String.class})
    private Output</* @Nullable */ List<String>> attachedConnections;

    /**
     * @return List of all connections attached to this route table v2.
     * 
     */
    public Output</* @Nullable */ List<String>> getAttachedConnections() {
        return this.attachedConnections;
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
     * The provisioning state of the virtual hub route table v2 resource.
     * 
     */
    @OutputExport(name="provisioningState", type=String.class, parameters={})
    private Output<String> provisioningState;

    /**
     * @return The provisioning state of the virtual hub route table v2 resource.
     * 
     */
    public Output<String> getProvisioningState() {
        return this.provisioningState;
    }
    /**
     * List of all routes.
     * 
     */
    @OutputExport(name="routes", type=List.class, parameters={VirtualHubRouteV2Response.class})
    private Output</* @Nullable */ List<VirtualHubRouteV2Response>> routes;

    /**
     * @return List of all routes.
     * 
     */
    public Output</* @Nullable */ List<VirtualHubRouteV2Response>> getRoutes() {
        return this.routes;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public VirtualHubRouteTableV2(String name) {
        this(name, VirtualHubRouteTableV2Args.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public VirtualHubRouteTableV2(String name, VirtualHubRouteTableV2Args args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public VirtualHubRouteTableV2(String name, VirtualHubRouteTableV2Args args, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("azure-native:network:VirtualHubRouteTableV2", name, args == null ? VirtualHubRouteTableV2Args.Empty : args, makeResourceOptions(options, Input.empty()));
    }

    private VirtualHubRouteTableV2(String name, Input<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("azure-native:network:VirtualHubRouteTableV2", name, null, makeResourceOptions(options, id));
    }

    private static io.pulumi.resources.CustomResourceOptions makeResourceOptions(@Nullable io.pulumi.resources.CustomResourceOptions options, @Nullable Input<String> id) {
        var defaultOptions = io.pulumi.resources.CustomResourceOptions.builder()
            .setVersion(Utilities.getVersion())
            .setAliases(List.of(
                Input.of(Alias.builder().setType("azure-native:network/v20190901:VirtualHubRouteTableV2").build()),
                Input.of(Alias.builder().setType("azure-native:network/v20191101:VirtualHubRouteTableV2").build()),
                Input.of(Alias.builder().setType("azure-native:network/v20191201:VirtualHubRouteTableV2").build()),
                Input.of(Alias.builder().setType("azure-native:network/v20200301:VirtualHubRouteTableV2").build()),
                Input.of(Alias.builder().setType("azure-native:network/v20200401:VirtualHubRouteTableV2").build()),
                Input.of(Alias.builder().setType("azure-native:network/v20200501:VirtualHubRouteTableV2").build()),
                Input.of(Alias.builder().setType("azure-native:network/v20200601:VirtualHubRouteTableV2").build()),
                Input.of(Alias.builder().setType("azure-native:network/v20200701:VirtualHubRouteTableV2").build()),
                Input.of(Alias.builder().setType("azure-native:network/v20200801:VirtualHubRouteTableV2").build()),
                Input.of(Alias.builder().setType("azure-native:network/v20201101:VirtualHubRouteTableV2").build()),
                Input.of(Alias.builder().setType("azure-native:network/v20210201:VirtualHubRouteTableV2").build()),
                Input.of(Alias.builder().setType("azure-native:network/v20210301:VirtualHubRouteTableV2").build()),
                Input.of(Alias.builder().setType("azure-native:network/v20210501:VirtualHubRouteTableV2").build())
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
    public static VirtualHubRouteTableV2 get(String name, Input<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        return new VirtualHubRouteTableV2(name, id, options);
    }
}
