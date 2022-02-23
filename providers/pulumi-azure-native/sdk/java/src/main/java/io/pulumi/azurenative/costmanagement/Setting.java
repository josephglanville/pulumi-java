// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.costmanagement;

import io.pulumi.azurenative.Utilities;
import io.pulumi.azurenative.costmanagement.SettingArgs;
import io.pulumi.azurenative.costmanagement.outputs.SettingsPropertiesResponseCache;
import io.pulumi.core.Alias;
import io.pulumi.core.Input;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.OutputExport;
import io.pulumi.core.annotations.ResourceType;
import java.lang.String;
import java.util.List;
import javax.annotation.Nullable;

/**
 * State of the myscope setting.
 * API Version: 2019-11-01.
 * 
 * ## Example Usage
 * 
 * ## Import
 * 
 * An existing resource can be imported using its type token, name, and identifier, e.g.
 * 
 * ```sh
 * $ pulumi import azure-native:costmanagement:Setting myscope /providers/Microsoft.CostManagement/settings/myscope 
 * ```
 * 
 */
@ResourceType(type="azure-native:costmanagement:Setting")
public class Setting extends io.pulumi.resources.CustomResource {
    /**
     * Array of scopes with additional details used by Cost Management in the Azure portal.
     * 
     */
    @OutputExport(name="cache", type=List.class, parameters={SettingsPropertiesResponseCache.class})
    private Output</* @Nullable */ List<SettingsPropertiesResponseCache>> cache;

    /**
     * @return Array of scopes with additional details used by Cost Management in the Azure portal.
     * 
     */
    public Output</* @Nullable */ List<SettingsPropertiesResponseCache>> getCache() {
        return this.cache;
    }
    /**
     * Resource kind.
     * 
     */
    @OutputExport(name="kind", type=String.class, parameters={})
    private Output<String> kind;

    /**
     * @return Resource kind.
     * 
     */
    public Output<String> getKind() {
        return this.kind;
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
     * Sets the default scope the current user will see when they sign into Azure Cost Management in the Azure portal.
     * 
     */
    @OutputExport(name="scope", type=String.class, parameters={})
    private Output<String> scope;

    /**
     * @return Sets the default scope the current user will see when they sign into Azure Cost Management in the Azure portal.
     * 
     */
    public Output<String> getScope() {
        return this.scope;
    }
    /**
     * Indicates what scope Cost Management in the Azure portal should default to. Allowed values: LastUsed.
     * 
     */
    @OutputExport(name="startOn", type=String.class, parameters={})
    private Output</* @Nullable */ String> startOn;

    /**
     * @return Indicates what scope Cost Management in the Azure portal should default to. Allowed values: LastUsed.
     * 
     */
    public Output</* @Nullable */ String> getStartOn() {
        return this.startOn;
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
    public Setting(String name) {
        this(name, SettingArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public Setting(String name, SettingArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public Setting(String name, SettingArgs args, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("azure-native:costmanagement:Setting", name, args == null ? SettingArgs.Empty : args, makeResourceOptions(options, Input.empty()));
    }

    private Setting(String name, Input<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("azure-native:costmanagement:Setting", name, null, makeResourceOptions(options, id));
    }

    private static io.pulumi.resources.CustomResourceOptions makeResourceOptions(@Nullable io.pulumi.resources.CustomResourceOptions options, @Nullable Input<String> id) {
        var defaultOptions = io.pulumi.resources.CustomResourceOptions.builder()
            .setVersion(Utilities.getVersion())
            .setAliases(List.of(
                Input.of(Alias.builder().setType("azure-native:costmanagement/v20191101:Setting").build())
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
    public static Setting get(String name, Input<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        return new Setting(name, id, options);
    }
}
