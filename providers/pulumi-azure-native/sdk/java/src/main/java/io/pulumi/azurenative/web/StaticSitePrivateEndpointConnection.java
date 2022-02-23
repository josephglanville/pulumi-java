// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.web;

import io.pulumi.azurenative.Utilities;
import io.pulumi.azurenative.web.StaticSitePrivateEndpointConnectionArgs;
import io.pulumi.azurenative.web.outputs.ArmIdWrapperResponse;
import io.pulumi.azurenative.web.outputs.PrivateLinkConnectionStateResponse;
import io.pulumi.core.Alias;
import io.pulumi.core.Input;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.OutputExport;
import io.pulumi.core.annotations.ResourceType;
import java.lang.String;
import java.util.List;
import javax.annotation.Nullable;

/**
 * Remote Private Endpoint Connection ARM resource.
 * API Version: 2020-12-01.
 * 
 * ## Example Usage
 * 
 * ## Import
 * 
 * An existing resource can be imported using its type token, name, and identifier, e.g.
 * 
 * ```sh
 * $ pulumi import azure-native:web:StaticSitePrivateEndpointConnection myresource1 /subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/Microsoft.Web/staticSites/{name}/privateEndpointConnections/{privateEndpointConnectionName} 
 * ```
 * 
 */
@ResourceType(type="azure-native:web:StaticSitePrivateEndpointConnection")
public class StaticSitePrivateEndpointConnection extends io.pulumi.resources.CustomResource {
    /**
     * Private IPAddresses mapped to the remote private endpoint
     * 
     */
    @OutputExport(name="ipAddresses", type=List.class, parameters={String.class})
    private Output</* @Nullable */ List<String>> ipAddresses;

    /**
     * @return Private IPAddresses mapped to the remote private endpoint
     * 
     */
    public Output</* @Nullable */ List<String>> getIpAddresses() {
        return this.ipAddresses;
    }
    /**
     * Kind of resource.
     * 
     */
    @OutputExport(name="kind", type=String.class, parameters={})
    private Output</* @Nullable */ String> kind;

    /**
     * @return Kind of resource.
     * 
     */
    public Output</* @Nullable */ String> getKind() {
        return this.kind;
    }
    /**
     * Resource Name.
     * 
     */
    @OutputExport(name="name", type=String.class, parameters={})
    private Output<String> name;

    /**
     * @return Resource Name.
     * 
     */
    public Output<String> getName() {
        return this.name;
    }
    /**
     * PrivateEndpoint of a remote private endpoint connection
     * 
     */
    @OutputExport(name="privateEndpoint", type=ArmIdWrapperResponse.class, parameters={})
    private Output</* @Nullable */ ArmIdWrapperResponse> privateEndpoint;

    /**
     * @return PrivateEndpoint of a remote private endpoint connection
     * 
     */
    public Output</* @Nullable */ ArmIdWrapperResponse> getPrivateEndpoint() {
        return this.privateEndpoint;
    }
    /**
     * The state of a private link connection
     * 
     */
    @OutputExport(name="privateLinkServiceConnectionState", type=PrivateLinkConnectionStateResponse.class, parameters={})
    private Output</* @Nullable */ PrivateLinkConnectionStateResponse> privateLinkServiceConnectionState;

    /**
     * @return The state of a private link connection
     * 
     */
    public Output</* @Nullable */ PrivateLinkConnectionStateResponse> getPrivateLinkServiceConnectionState() {
        return this.privateLinkServiceConnectionState;
    }
    @OutputExport(name="provisioningState", type=String.class, parameters={})
    private Output<String> provisioningState;

    public Output<String> getProvisioningState() {
        return this.provisioningState;
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
    public StaticSitePrivateEndpointConnection(String name) {
        this(name, StaticSitePrivateEndpointConnectionArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public StaticSitePrivateEndpointConnection(String name, StaticSitePrivateEndpointConnectionArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public StaticSitePrivateEndpointConnection(String name, StaticSitePrivateEndpointConnectionArgs args, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("azure-native:web:StaticSitePrivateEndpointConnection", name, args == null ? StaticSitePrivateEndpointConnectionArgs.Empty : args, makeResourceOptions(options, Input.empty()));
    }

    private StaticSitePrivateEndpointConnection(String name, Input<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("azure-native:web:StaticSitePrivateEndpointConnection", name, null, makeResourceOptions(options, id));
    }

    private static io.pulumi.resources.CustomResourceOptions makeResourceOptions(@Nullable io.pulumi.resources.CustomResourceOptions options, @Nullable Input<String> id) {
        var defaultOptions = io.pulumi.resources.CustomResourceOptions.builder()
            .setVersion(Utilities.getVersion())
            .setAliases(List.of(
                Input.of(Alias.builder().setType("azure-native:web/v20201201:StaticSitePrivateEndpointConnection").build()),
                Input.of(Alias.builder().setType("azure-native:web/v20210101:StaticSitePrivateEndpointConnection").build()),
                Input.of(Alias.builder().setType("azure-native:web/v20210115:StaticSitePrivateEndpointConnection").build()),
                Input.of(Alias.builder().setType("azure-native:web/v20210201:StaticSitePrivateEndpointConnection").build()),
                Input.of(Alias.builder().setType("azure-native:web/v20210301:StaticSitePrivateEndpointConnection").build())
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
    public static StaticSitePrivateEndpointConnection get(String name, Input<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        return new StaticSitePrivateEndpointConnection(name, id, options);
    }
}
