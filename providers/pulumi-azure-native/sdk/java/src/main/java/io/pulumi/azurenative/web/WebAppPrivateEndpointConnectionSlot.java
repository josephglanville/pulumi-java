// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.web;

import io.pulumi.azurenative.Utilities;
import io.pulumi.azurenative.web.WebAppPrivateEndpointConnectionSlotArgs;
import io.pulumi.azurenative.web.outputs.ArmIdWrapperResponse;
import io.pulumi.azurenative.web.outputs.PrivateLinkConnectionStateResponse;
import io.pulumi.core.Alias;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.Export;
import io.pulumi.core.annotations.ResourceType;
import io.pulumi.core.internal.Codegen;
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
 * $ pulumi import azure-native:web:WebAppPrivateEndpointConnectionSlot myresource1 /subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/Microsoft.Web/sites/{name}/slots/{slot}/privateEndpointConnections/{privateEndpointConnectionName} 
 * ```
 * 
 */
@ResourceType(type="azure-native:web:WebAppPrivateEndpointConnectionSlot")
public class WebAppPrivateEndpointConnectionSlot extends io.pulumi.resources.CustomResource {
    /**
     * Private IPAddresses mapped to the remote private endpoint
     * 
     */
    @Export(name="ipAddresses", type=List.class, parameters={String.class})
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
    @Export(name="kind", type=String.class, parameters={})
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
    @Export(name="name", type=String.class, parameters={})
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
    @Export(name="privateEndpoint", type=ArmIdWrapperResponse.class, parameters={})
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
    @Export(name="privateLinkServiceConnectionState", type=PrivateLinkConnectionStateResponse.class, parameters={})
    private Output</* @Nullable */ PrivateLinkConnectionStateResponse> privateLinkServiceConnectionState;

    /**
     * @return The state of a private link connection
     * 
     */
    public Output</* @Nullable */ PrivateLinkConnectionStateResponse> getPrivateLinkServiceConnectionState() {
        return this.privateLinkServiceConnectionState;
    }
    @Export(name="provisioningState", type=String.class, parameters={})
    private Output<String> provisioningState;

    public Output<String> getProvisioningState() {
        return this.provisioningState;
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
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public WebAppPrivateEndpointConnectionSlot(String name) {
        this(name, WebAppPrivateEndpointConnectionSlotArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public WebAppPrivateEndpointConnectionSlot(String name, WebAppPrivateEndpointConnectionSlotArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public WebAppPrivateEndpointConnectionSlot(String name, WebAppPrivateEndpointConnectionSlotArgs args, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("azure-native:web:WebAppPrivateEndpointConnectionSlot", name, args == null ? WebAppPrivateEndpointConnectionSlotArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private WebAppPrivateEndpointConnectionSlot(String name, Output<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("azure-native:web:WebAppPrivateEndpointConnectionSlot", name, null, makeResourceOptions(options, id));
    }

    private static io.pulumi.resources.CustomResourceOptions makeResourceOptions(@Nullable io.pulumi.resources.CustomResourceOptions options, @Nullable Output<String> id) {
        var defaultOptions = io.pulumi.resources.CustomResourceOptions.builder()
            .version(Utilities.getVersion())
            .aliases(List.of(
                Output.of(Alias.builder().type("azure-native:web/v20201201:WebAppPrivateEndpointConnectionSlot").build()),
                Output.of(Alias.builder().type("azure-native:web/v20210101:WebAppPrivateEndpointConnectionSlot").build()),
                Output.of(Alias.builder().type("azure-native:web/v20210115:WebAppPrivateEndpointConnectionSlot").build()),
                Output.of(Alias.builder().type("azure-native:web/v20210201:WebAppPrivateEndpointConnectionSlot").build()),
                Output.of(Alias.builder().type("azure-native:web/v20210301:WebAppPrivateEndpointConnectionSlot").build())
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
    public static WebAppPrivateEndpointConnectionSlot get(String name, Output<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        return new WebAppPrivateEndpointConnectionSlot(name, id, options);
    }
}
