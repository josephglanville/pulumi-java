// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.network;

import io.pulumi.azurenative.Utilities;
import io.pulumi.azurenative.network.PrivateEndpointArgs;
import io.pulumi.azurenative.network.outputs.CustomDnsConfigPropertiesFormatResponse;
import io.pulumi.azurenative.network.outputs.ExtendedLocationResponse;
import io.pulumi.azurenative.network.outputs.NetworkInterfaceResponse;
import io.pulumi.azurenative.network.outputs.PrivateLinkServiceConnectionResponse;
import io.pulumi.azurenative.network.outputs.SubnetResponse;
import io.pulumi.core.Alias;
import io.pulumi.core.Input;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.OutputExport;
import io.pulumi.core.annotations.ResourceType;
import java.lang.String;
import java.util.List;
import java.util.Map;
import javax.annotation.Nullable;

/**
 * Private endpoint resource.
 * API Version: 2020-11-01.
 * 
 * ## Example Usage
 * 
 * ## Import
 * 
 * An existing resource can be imported using its type token, name, and identifier, e.g.
 * 
 * ```sh
 * $ pulumi import azure-native:network:PrivateEndpoint testPe /subscriptions/subId/resourceGroups/rg1/providers/Microsoft.Network/privateEndpoints/testPe 
 * ```
 * 
 */
@ResourceType(type="azure-native:network:PrivateEndpoint")
public class PrivateEndpoint extends io.pulumi.resources.CustomResource {
    /**
     * An array of custom dns configurations.
     * 
     */
    @OutputExport(name="customDnsConfigs", type=List.class, parameters={CustomDnsConfigPropertiesFormatResponse.class})
    private Output</* @Nullable */ List<CustomDnsConfigPropertiesFormatResponse>> customDnsConfigs;

    /**
     * @return An array of custom dns configurations.
     * 
     */
    public Output</* @Nullable */ List<CustomDnsConfigPropertiesFormatResponse>> getCustomDnsConfigs() {
        return this.customDnsConfigs;
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
     * The extended location of the load balancer.
     * 
     */
    @OutputExport(name="extendedLocation", type=ExtendedLocationResponse.class, parameters={})
    private Output</* @Nullable */ ExtendedLocationResponse> extendedLocation;

    /**
     * @return The extended location of the load balancer.
     * 
     */
    public Output</* @Nullable */ ExtendedLocationResponse> getExtendedLocation() {
        return this.extendedLocation;
    }
    /**
     * Resource location.
     * 
     */
    @OutputExport(name="location", type=String.class, parameters={})
    private Output</* @Nullable */ String> location;

    /**
     * @return Resource location.
     * 
     */
    public Output</* @Nullable */ String> getLocation() {
        return this.location;
    }
    /**
     * A grouping of information about the connection to the remote resource. Used when the network admin does not have access to approve connections to the remote resource.
     * 
     */
    @OutputExport(name="manualPrivateLinkServiceConnections", type=List.class, parameters={PrivateLinkServiceConnectionResponse.class})
    private Output</* @Nullable */ List<PrivateLinkServiceConnectionResponse>> manualPrivateLinkServiceConnections;

    /**
     * @return A grouping of information about the connection to the remote resource. Used when the network admin does not have access to approve connections to the remote resource.
     * 
     */
    public Output</* @Nullable */ List<PrivateLinkServiceConnectionResponse>> getManualPrivateLinkServiceConnections() {
        return this.manualPrivateLinkServiceConnections;
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
     * An array of references to the network interfaces created for this private endpoint.
     * 
     */
    @OutputExport(name="networkInterfaces", type=List.class, parameters={NetworkInterfaceResponse.class})
    private Output<List<NetworkInterfaceResponse>> networkInterfaces;

    /**
     * @return An array of references to the network interfaces created for this private endpoint.
     * 
     */
    public Output<List<NetworkInterfaceResponse>> getNetworkInterfaces() {
        return this.networkInterfaces;
    }
    /**
     * A grouping of information about the connection to the remote resource.
     * 
     */
    @OutputExport(name="privateLinkServiceConnections", type=List.class, parameters={PrivateLinkServiceConnectionResponse.class})
    private Output</* @Nullable */ List<PrivateLinkServiceConnectionResponse>> privateLinkServiceConnections;

    /**
     * @return A grouping of information about the connection to the remote resource.
     * 
     */
    public Output</* @Nullable */ List<PrivateLinkServiceConnectionResponse>> getPrivateLinkServiceConnections() {
        return this.privateLinkServiceConnections;
    }
    /**
     * The provisioning state of the private endpoint resource.
     * 
     */
    @OutputExport(name="provisioningState", type=String.class, parameters={})
    private Output<String> provisioningState;

    /**
     * @return The provisioning state of the private endpoint resource.
     * 
     */
    public Output<String> getProvisioningState() {
        return this.provisioningState;
    }
    /**
     * The ID of the subnet from which the private IP will be allocated.
     * 
     */
    @OutputExport(name="subnet", type=SubnetResponse.class, parameters={})
    private Output</* @Nullable */ SubnetResponse> subnet;

    /**
     * @return The ID of the subnet from which the private IP will be allocated.
     * 
     */
    public Output</* @Nullable */ SubnetResponse> getSubnet() {
        return this.subnet;
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
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public PrivateEndpoint(String name) {
        this(name, PrivateEndpointArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public PrivateEndpoint(String name, PrivateEndpointArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public PrivateEndpoint(String name, PrivateEndpointArgs args, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("azure-native:network:PrivateEndpoint", name, args == null ? PrivateEndpointArgs.Empty : args, makeResourceOptions(options, Input.empty()));
    }

    private PrivateEndpoint(String name, Input<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("azure-native:network:PrivateEndpoint", name, null, makeResourceOptions(options, id));
    }

    private static io.pulumi.resources.CustomResourceOptions makeResourceOptions(@Nullable io.pulumi.resources.CustomResourceOptions options, @Nullable Input<String> id) {
        var defaultOptions = io.pulumi.resources.CustomResourceOptions.builder()
            .setVersion(Utilities.getVersion())
            .setAliases(List.of(
                Input.of(Alias.builder().setType("azure-native:network/v20180801:PrivateEndpoint").build()),
                Input.of(Alias.builder().setType("azure-native:network/v20181001:PrivateEndpoint").build()),
                Input.of(Alias.builder().setType("azure-native:network/v20181101:PrivateEndpoint").build()),
                Input.of(Alias.builder().setType("azure-native:network/v20181201:PrivateEndpoint").build()),
                Input.of(Alias.builder().setType("azure-native:network/v20190201:PrivateEndpoint").build()),
                Input.of(Alias.builder().setType("azure-native:network/v20190401:PrivateEndpoint").build()),
                Input.of(Alias.builder().setType("azure-native:network/v20190601:PrivateEndpoint").build()),
                Input.of(Alias.builder().setType("azure-native:network/v20190701:PrivateEndpoint").build()),
                Input.of(Alias.builder().setType("azure-native:network/v20190801:PrivateEndpoint").build()),
                Input.of(Alias.builder().setType("azure-native:network/v20190901:PrivateEndpoint").build()),
                Input.of(Alias.builder().setType("azure-native:network/v20191101:PrivateEndpoint").build()),
                Input.of(Alias.builder().setType("azure-native:network/v20191201:PrivateEndpoint").build()),
                Input.of(Alias.builder().setType("azure-native:network/v20200301:PrivateEndpoint").build()),
                Input.of(Alias.builder().setType("azure-native:network/v20200401:PrivateEndpoint").build()),
                Input.of(Alias.builder().setType("azure-native:network/v20200501:PrivateEndpoint").build()),
                Input.of(Alias.builder().setType("azure-native:network/v20200601:PrivateEndpoint").build()),
                Input.of(Alias.builder().setType("azure-native:network/v20200701:PrivateEndpoint").build()),
                Input.of(Alias.builder().setType("azure-native:network/v20200801:PrivateEndpoint").build()),
                Input.of(Alias.builder().setType("azure-native:network/v20201101:PrivateEndpoint").build()),
                Input.of(Alias.builder().setType("azure-native:network/v20210201:PrivateEndpoint").build()),
                Input.of(Alias.builder().setType("azure-native:network/v20210301:PrivateEndpoint").build()),
                Input.of(Alias.builder().setType("azure-native:network/v20210501:PrivateEndpoint").build())
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
    public static PrivateEndpoint get(String name, Input<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        return new PrivateEndpoint(name, id, options);
    }
}
