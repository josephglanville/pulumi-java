// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.migrate;

import io.pulumi.azurenative.Utilities;
import io.pulumi.azurenative.migrate.MigrateProjectArgs;
import io.pulumi.azurenative.migrate.outputs.MigrateProjectPropertiesResponse;
import io.pulumi.azurenative.migrate.outputs.MigrateProjectResponseTags;
import io.pulumi.core.Alias;
import io.pulumi.core.Input;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.OutputExport;
import io.pulumi.core.annotations.ResourceType;
import java.lang.String;
import java.util.List;
import javax.annotation.Nullable;

/**
 * Migrate Project REST Resource.
 * API Version: 2018-09-01-preview.
 * 
 * ## Example Usage
 * 
 * ## Import
 * 
 * An existing resource can be imported using its type token, name, and identifier, e.g.
 * 
 * ```sh
 * $ pulumi import azure-native:migrate:MigrateProject project01 /subscriptions/75dd7e42-4fd1-4512-af04-83ad9864335b/resourceGroups/myResourceGroup/providers/Microsoft.Migrate/MigrateProjects/project01 
 * ```
 * 
 */
@ResourceType(type="azure-native:migrate:MigrateProject")
public class MigrateProject extends io.pulumi.resources.CustomResource {
    /**
     * Gets or sets the eTag for concurrency control.
     * 
     */
    @OutputExport(name="eTag", type=String.class, parameters={})
    private Output</* @Nullable */ String> eTag;

    /**
     * @return Gets or sets the eTag for concurrency control.
     * 
     */
    public Output</* @Nullable */ String> getETag() {
        return this.eTag;
    }
    /**
     * Gets or sets the Azure location in which migrate project is created.
     * 
     */
    @OutputExport(name="location", type=String.class, parameters={})
    private Output</* @Nullable */ String> location;

    /**
     * @return Gets or sets the Azure location in which migrate project is created.
     * 
     */
    public Output</* @Nullable */ String> getLocation() {
        return this.location;
    }
    /**
     * Gets the name of the migrate project.
     * 
     */
    @OutputExport(name="name", type=String.class, parameters={})
    private Output<String> name;

    /**
     * @return Gets the name of the migrate project.
     * 
     */
    public Output<String> getName() {
        return this.name;
    }
    /**
     * Gets or sets the nested properties.
     * 
     */
    @OutputExport(name="properties", type=MigrateProjectPropertiesResponse.class, parameters={})
    private Output<MigrateProjectPropertiesResponse> properties;

    /**
     * @return Gets or sets the nested properties.
     * 
     */
    public Output<MigrateProjectPropertiesResponse> getProperties() {
        return this.properties;
    }
    /**
     * Gets or sets the tags.
     * 
     */
    @OutputExport(name="tags", type=MigrateProjectResponseTags.class, parameters={})
    private Output</* @Nullable */ MigrateProjectResponseTags> tags;

    /**
     * @return Gets or sets the tags.
     * 
     */
    public Output</* @Nullable */ MigrateProjectResponseTags> getTags() {
        return this.tags;
    }
    /**
     * Handled by resource provider. Type = Microsoft.Migrate/MigrateProject.
     * 
     */
    @OutputExport(name="type", type=String.class, parameters={})
    private Output<String> type;

    /**
     * @return Handled by resource provider. Type = Microsoft.Migrate/MigrateProject.
     * 
     */
    public Output<String> getType() {
        return this.type;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public MigrateProject(String name) {
        this(name, MigrateProjectArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public MigrateProject(String name, MigrateProjectArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public MigrateProject(String name, MigrateProjectArgs args, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("azure-native:migrate:MigrateProject", name, args == null ? MigrateProjectArgs.Empty : args, makeResourceOptions(options, Input.empty()));
    }

    private MigrateProject(String name, Input<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("azure-native:migrate:MigrateProject", name, null, makeResourceOptions(options, id));
    }

    private static io.pulumi.resources.CustomResourceOptions makeResourceOptions(@Nullable io.pulumi.resources.CustomResourceOptions options, @Nullable Input<String> id) {
        var defaultOptions = io.pulumi.resources.CustomResourceOptions.builder()
            .setVersion(Utilities.getVersion())
            .setAliases(List.of(
                Input.of(Alias.builder().setType("azure-native:migrate/v20180901preview:MigrateProject").build()),
                Input.of(Alias.builder().setType("azure-native:migrate/v20200501:MigrateProject").build())
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
    public static MigrateProject get(String name, Input<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        return new MigrateProject(name, id, options);
    }
}
