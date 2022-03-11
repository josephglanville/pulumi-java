// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.compute;

import io.pulumi.azurenative.Utilities;
import io.pulumi.azurenative.compute.RestorePointCollectionArgs;
import io.pulumi.azurenative.compute.outputs.RestorePointCollectionSourcePropertiesResponse;
import io.pulumi.azurenative.compute.outputs.RestorePointResponse;
import io.pulumi.core.Alias;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.OutputExport;
import io.pulumi.core.annotations.ResourceType;
import java.lang.String;
import java.util.List;
import java.util.Map;
import javax.annotation.Nullable;

/**
 * Create or update Restore Point collection parameters.
 * API Version: 2021-03-01.
 * 
 * ## Example Usage
 * 
 * ## Import
 * 
 * An existing resource can be imported using its type token, name, and identifier, e.g.
 * 
 * ```sh
 * $ pulumi import azure-native:compute:RestorePointCollection myRpc /subscriptions/{subscription-id}/resourceGroups/myResourceGroup/providers/Microsoft.Compute/restorePointCollections/myRpc 
 * ```
 * 
 */
@ResourceType(type="azure-native:compute:RestorePointCollection")
public class RestorePointCollection extends io.pulumi.resources.CustomResource {
    /**
     * Resource location
     * 
     */
    @OutputExport(name="location", type=String.class, parameters={})
    private Output<String> location;

    /**
     * @return Resource location
     * 
     */
    public Output<String> getLocation() {
        return this.location;
    }
    /**
     * Resource name
     * 
     */
    @OutputExport(name="name", type=String.class, parameters={})
    private Output<String> name;

    /**
     * @return Resource name
     * 
     */
    public Output<String> getName() {
        return this.name;
    }
    /**
     * The provisioning state of the restore point collection.
     * 
     */
    @OutputExport(name="provisioningState", type=String.class, parameters={})
    private Output<String> provisioningState;

    /**
     * @return The provisioning state of the restore point collection.
     * 
     */
    public Output<String> getProvisioningState() {
        return this.provisioningState;
    }
    /**
     * The unique id of the restore point collection.
     * 
     */
    @OutputExport(name="restorePointCollectionId", type=String.class, parameters={})
    private Output<String> restorePointCollectionId;

    /**
     * @return The unique id of the restore point collection.
     * 
     */
    public Output<String> getRestorePointCollectionId() {
        return this.restorePointCollectionId;
    }
    /**
     * A list containing all restore points created under this restore point collection.
     * 
     */
    @OutputExport(name="restorePoints", type=List.class, parameters={RestorePointResponse.class})
    private Output<List<RestorePointResponse>> restorePoints;

    /**
     * @return A list containing all restore points created under this restore point collection.
     * 
     */
    public Output<List<RestorePointResponse>> getRestorePoints() {
        return this.restorePoints;
    }
    /**
     * The properties of the source resource that this restore point collection is created from.
     * 
     */
    @OutputExport(name="source", type=RestorePointCollectionSourcePropertiesResponse.class, parameters={})
    private Output</* @Nullable */ RestorePointCollectionSourcePropertiesResponse> source;

    /**
     * @return The properties of the source resource that this restore point collection is created from.
     * 
     */
    public Output</* @Nullable */ RestorePointCollectionSourcePropertiesResponse> getSource() {
        return this.source;
    }
    /**
     * Resource tags
     * 
     */
    @OutputExport(name="tags", type=Map.class, parameters={String.class, String.class})
    private Output</* @Nullable */ Map<String,String>> tags;

    /**
     * @return Resource tags
     * 
     */
    public Output</* @Nullable */ Map<String,String>> getTags() {
        return this.tags;
    }
    /**
     * Resource type
     * 
     */
    @OutputExport(name="type", type=String.class, parameters={})
    private Output<String> type;

    /**
     * @return Resource type
     * 
     */
    public Output<String> getType() {
        return this.type;
    }

    public interface BuilderApplicator {
        public void apply(RestorePointCollectionArgs.Builder a);
    }
    private static io.pulumi.azurenative.compute.RestorePointCollectionArgs buildArgs(BuilderApplicator argsBuilder) {
        final var builder = io.pulumi.azurenative.compute.RestorePointCollectionArgs.builder();
        argsBuilder.apply(builder);
        return builder.build();
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param argsBuilder A function that configures a passed builder.
     */
    public RestorePointCollection(String name, BuilderApplicator argsBuilder) {
        this(name, buildArgs(argsBuilder), null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public RestorePointCollection(String name) {
        this(name, RestorePointCollectionArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public RestorePointCollection(String name, RestorePointCollectionArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public RestorePointCollection(String name, RestorePointCollectionArgs args, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("azure-native:compute:RestorePointCollection", name, args == null ? RestorePointCollectionArgs.Empty : args, makeResourceOptions(options, Output.empty()));
    }

    private RestorePointCollection(String name, Output<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("azure-native:compute:RestorePointCollection", name, null, makeResourceOptions(options, id));
    }

    private static io.pulumi.resources.CustomResourceOptions makeResourceOptions(@Nullable io.pulumi.resources.CustomResourceOptions options, @Nullable Output<String> id) {
        var defaultOptions = io.pulumi.resources.CustomResourceOptions.builder()
            .setVersion(Utilities.getVersion())
            .setAliases(List.of(
                Output.of(Alias.builder().setType("azure-native:compute/v20210301:RestorePointCollection").build()),
                Output.of(Alias.builder().setType("azure-native:compute/v20210401:RestorePointCollection").build()),
                Output.of(Alias.builder().setType("azure-native:compute/v20210701:RestorePointCollection").build()),
                Output.of(Alias.builder().setType("azure-native:compute/v20211101:RestorePointCollection").build())
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
    public static RestorePointCollection get(String name, Output<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        return new RestorePointCollection(name, id, options);
    }
}
