// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.offazure;

import io.pulumi.azurenative.Utilities;
import io.pulumi.azurenative.offazure.PrivateEndpointConnectionArgs;
import io.pulumi.azurenative.offazure.outputs.PrivateEndpointConnectionPropertiesResponse;
import io.pulumi.azurenative.offazure.outputs.SystemDataResponse;
import io.pulumi.core.Alias;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.OutputExport;
import io.pulumi.core.annotations.ResourceType;
import java.lang.String;
import java.util.List;
import javax.annotation.Nullable;

/**
 * REST model used to encapsulate the user visible state of a PrivateEndpoint.
 * API Version: 2020-07-07.
 * 
 * ## Example Usage
 * 
 * ## Import
 * 
 * An existing resource can be imported using its type token, name, and identifier, e.g.
 * 
 * ```sh
 * $ pulumi import azure-native:offazure:PrivateEndpointConnection privateendpt1938mastersit9007pe.4f2f2970-0bfa-45d4-9ee1-d9f79502fc6f /subscriptions/4bd2aa0f-2bd2-4d67-91a8-5a4533d58600/resourceGroups/ayagrawrg/providers/Microsoft.OffAzure/MasterSites/privateendpt1938mastersite/privateEndpointConnections/privateendpt1938mastersit9007pe.4f2f2970-0bfa-45d4-9ee1-d9f79502fc6f 
 * ```
 * 
 */
@ResourceType(type="azure-native:offazure:PrivateEndpointConnection")
public class PrivateEndpointConnection extends io.pulumi.resources.CustomResource {
    /**
     * Gets the tag for optimistic concurrency control.
     * 
     */
    @OutputExport(name="eTag", type=String.class, parameters={})
    private Output<String> eTag;

    /**
     * @return Gets the tag for optimistic concurrency control.
     * 
     */
    public Output<String> getETag() {
        return this.eTag;
    }
    /**
     * Gets the name of the resource.
     * 
     */
    @OutputExport(name="name", type=String.class, parameters={})
    private Output<String> name;

    /**
     * @return Gets the name of the resource.
     * 
     */
    public Output<String> getName() {
        return this.name;
    }
    /**
     * Gets the properties of the object.
     * 
     */
    @OutputExport(name="properties", type=PrivateEndpointConnectionPropertiesResponse.class, parameters={})
    private Output<PrivateEndpointConnectionPropertiesResponse> properties;

    /**
     * @return Gets the properties of the object.
     * 
     */
    public Output<PrivateEndpointConnectionPropertiesResponse> getProperties() {
        return this.properties;
    }
    /**
     * Metadata pertaining to creation and last modification of the resource.
     * 
     */
    @OutputExport(name="systemData", type=SystemDataResponse.class, parameters={})
    private Output<SystemDataResponse> systemData;

    /**
     * @return Metadata pertaining to creation and last modification of the resource.
     * 
     */
    public Output<SystemDataResponse> getSystemData() {
        return this.systemData;
    }
    /**
     * Gets the resource type.
     * 
     */
    @OutputExport(name="type", type=String.class, parameters={})
    private Output<String> type;

    /**
     * @return Gets the resource type.
     * 
     */
    public Output<String> getType() {
        return this.type;
    }

    public interface BuilderApplicator {
        public void apply(PrivateEndpointConnectionArgs.Builder a);
    }
    private static io.pulumi.azurenative.offazure.PrivateEndpointConnectionArgs buildArgs(BuilderApplicator argsBuilder) {
        final var builder = io.pulumi.azurenative.offazure.PrivateEndpointConnectionArgs.builder();
        argsBuilder.apply(builder);
        return builder.build();
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param argsBuilder A function that configures a passed builder.
     */
    public PrivateEndpointConnection(String name, BuilderApplicator argsBuilder) {
        this(name, buildArgs(argsBuilder), null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public PrivateEndpointConnection(String name) {
        this(name, PrivateEndpointConnectionArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public PrivateEndpointConnection(String name, PrivateEndpointConnectionArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public PrivateEndpointConnection(String name, PrivateEndpointConnectionArgs args, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("azure-native:offazure:PrivateEndpointConnection", name, args == null ? PrivateEndpointConnectionArgs.Empty : args, makeResourceOptions(options, Output.empty()));
    }

    private PrivateEndpointConnection(String name, Output<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("azure-native:offazure:PrivateEndpointConnection", name, null, makeResourceOptions(options, id));
    }

    private static io.pulumi.resources.CustomResourceOptions makeResourceOptions(@Nullable io.pulumi.resources.CustomResourceOptions options, @Nullable Output<String> id) {
        var defaultOptions = io.pulumi.resources.CustomResourceOptions.builder()
            .setVersion(Utilities.getVersion())
            .setAliases(List.of(
                Output.of(Alias.builder().setType("azure-native:offazure/v20200707:PrivateEndpointConnection").build())
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
    public static PrivateEndpointConnection get(String name, Output<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        return new PrivateEndpointConnection(name, id, options);
    }
}
