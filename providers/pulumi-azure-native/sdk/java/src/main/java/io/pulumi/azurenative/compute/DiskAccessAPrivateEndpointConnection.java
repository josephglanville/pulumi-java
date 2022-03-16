// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.compute;

import io.pulumi.azurenative.Utilities;
import io.pulumi.azurenative.compute.DiskAccessAPrivateEndpointConnectionArgs;
import io.pulumi.azurenative.compute.outputs.PrivateEndpointResponse;
import io.pulumi.azurenative.compute.outputs.PrivateLinkServiceConnectionStateResponse;
import io.pulumi.core.Alias;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.Export;
import io.pulumi.core.annotations.ResourceType;
import java.lang.String;
import java.util.List;
import javax.annotation.Nullable;

/**
 * The Private Endpoint Connection resource.
 * API Version: 2020-12-01.
 * 
 * ## Example Usage
 * 
 * ## Import
 * 
 * An existing resource can be imported using its type token, name, and identifier, e.g.
 * 
 * ```sh
 * $ pulumi import azure-native:compute:DiskAccessAPrivateEndpointConnection myPrivateEndpointConenction /subscriptions/{subscription-id}/resourceGroups/myResourceGroup/providers/Microsoft.Compute/diskAccesses/myDiskAccess/privateEndpoinConnections/myPrivateEndpointConnectionName 
 * ```
 * 
 */
@ResourceType(type="azure-native:compute:DiskAccessAPrivateEndpointConnection")
public class DiskAccessAPrivateEndpointConnection extends io.pulumi.resources.CustomResource {
    /**
     * private endpoint connection name
     * 
     */
    @Export(name="name", type=String.class, parameters={})
    private Output<String> name;

    /**
     * @return private endpoint connection name
     * 
     */
    public Output<String> getName() {
        return this.name;
    }
    /**
     * The resource of private end point.
     * 
     */
    @Export(name="privateEndpoint", type=PrivateEndpointResponse.class, parameters={})
    private Output<PrivateEndpointResponse> privateEndpoint;

    /**
     * @return The resource of private end point.
     * 
     */
    public Output<PrivateEndpointResponse> getPrivateEndpoint() {
        return this.privateEndpoint;
    }
    /**
     * A collection of information about the state of the connection between DiskAccess and Virtual Network.
     * 
     */
    @Export(name="privateLinkServiceConnectionState", type=PrivateLinkServiceConnectionStateResponse.class, parameters={})
    private Output<PrivateLinkServiceConnectionStateResponse> privateLinkServiceConnectionState;

    /**
     * @return A collection of information about the state of the connection between DiskAccess and Virtual Network.
     * 
     */
    public Output<PrivateLinkServiceConnectionStateResponse> getPrivateLinkServiceConnectionState() {
        return this.privateLinkServiceConnectionState;
    }
    /**
     * The provisioning state of the private endpoint connection resource.
     * 
     */
    @Export(name="provisioningState", type=String.class, parameters={})
    private Output<String> provisioningState;

    /**
     * @return The provisioning state of the private endpoint connection resource.
     * 
     */
    public Output<String> getProvisioningState() {
        return this.provisioningState;
    }
    /**
     * private endpoint connection type
     * 
     */
    @Export(name="type", type=String.class, parameters={})
    private Output<String> type;

    /**
     * @return private endpoint connection type
     * 
     */
    public Output<String> getType() {
        return this.type;
    }

    public interface BuilderApplicator {
        public void apply(DiskAccessAPrivateEndpointConnectionArgs.Builder a);
    }
    private static io.pulumi.azurenative.compute.DiskAccessAPrivateEndpointConnectionArgs buildArgs(BuilderApplicator argsBuilder) {
        final var builder = io.pulumi.azurenative.compute.DiskAccessAPrivateEndpointConnectionArgs.builder();
        argsBuilder.apply(builder);
        return builder.build();
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param argsBuilder A function that configures a passed builder.
     */
    public DiskAccessAPrivateEndpointConnection(String name, BuilderApplicator argsBuilder) {
        this(name, buildArgs(argsBuilder), null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public DiskAccessAPrivateEndpointConnection(String name) {
        this(name, DiskAccessAPrivateEndpointConnectionArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public DiskAccessAPrivateEndpointConnection(String name, DiskAccessAPrivateEndpointConnectionArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public DiskAccessAPrivateEndpointConnection(String name, DiskAccessAPrivateEndpointConnectionArgs args, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("azure-native:compute:DiskAccessAPrivateEndpointConnection", name, args == null ? DiskAccessAPrivateEndpointConnectionArgs.Empty : args, makeResourceOptions(options, Output.empty()));
    }

    private DiskAccessAPrivateEndpointConnection(String name, Output<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("azure-native:compute:DiskAccessAPrivateEndpointConnection", name, null, makeResourceOptions(options, id));
    }

    private static io.pulumi.resources.CustomResourceOptions makeResourceOptions(@Nullable io.pulumi.resources.CustomResourceOptions options, @Nullable Output<String> id) {
        var defaultOptions = io.pulumi.resources.CustomResourceOptions.builder()
            .version(Utilities.getVersion())
            .aliases(List.of(
                Output.of(Alias.builder().type("azure-native:compute/v20200930:DiskAccessAPrivateEndpointConnection").build()),
                Output.of(Alias.builder().type("azure-native:compute/v20201201:DiskAccessAPrivateEndpointConnection").build()),
                Output.of(Alias.builder().type("azure-native:compute/v20210401:DiskAccessAPrivateEndpointConnection").build()),
                Output.of(Alias.builder().type("azure-native:compute/v20210801:DiskAccessAPrivateEndpointConnection").build())
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
    public static DiskAccessAPrivateEndpointConnection get(String name, Output<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        return new DiskAccessAPrivateEndpointConnection(name, id, options);
    }
}
