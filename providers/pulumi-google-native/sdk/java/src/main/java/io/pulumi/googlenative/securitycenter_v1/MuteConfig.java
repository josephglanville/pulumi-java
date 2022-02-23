// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.securitycenter_v1;

import io.pulumi.core.Input;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.OutputExport;
import io.pulumi.core.annotations.ResourceType;
import io.pulumi.googlenative.Utilities;
import io.pulumi.googlenative.securitycenter_v1.MuteConfigArgs;
import java.lang.String;
import javax.annotation.Nullable;

/**
 * Creates a mute config.
 * Auto-naming is currently not supported for this resource.
 * 
 */
@ResourceType(type="google-native:securitycenter/v1:MuteConfig")
public class MuteConfig extends io.pulumi.resources.CustomResource {
    /**
     * The time at which the mute config was created. This field is set by the server and will be ignored if provided on config creation.
     * 
     */
    @OutputExport(name="createTime", type=String.class, parameters={})
    private Output<String> createTime;

    /**
     * @return The time at which the mute config was created. This field is set by the server and will be ignored if provided on config creation.
     * 
     */
    public Output<String> getCreateTime() {
        return this.createTime;
    }
    /**
     * A description of the mute config.
     * 
     */
    @OutputExport(name="description", type=String.class, parameters={})
    private Output<String> description;

    /**
     * @return A description of the mute config.
     * 
     */
    public Output<String> getDescription() {
        return this.description;
    }
    /**
     * The human readable name to be displayed for the mute config.
     * 
     */
    @OutputExport(name="displayName", type=String.class, parameters={})
    private Output<String> displayName;

    /**
     * @return The human readable name to be displayed for the mute config.
     * 
     */
    public Output<String> getDisplayName() {
        return this.displayName;
    }
    /**
     * An expression that defines the filter to apply across create/update events of findings. While creating a filter string, be mindful of the scope in which the mute configuration is being created. E.g., If a filter contains project = X but is created under the project = Y scope, it might not match any findings. The following field and operator combinations are supported: * severity: `=`, `:` * category: `=`, `:` * resource.name: `=`, `:` * resource.project_name: `=`, `:` * resource.project_display_name: `=`, `:` * resource.folders.resource_folder: `=`, `:` * resource.parent_name: `=`, `:` * resource.parent_display_name: `=`, `:` * resource.type: `=`, `:` * finding_class: `=`, `:` * indicator.ip_addresses: `=`, `:` * indicator.domains: `=`, `:`
     * 
     */
    @OutputExport(name="filter", type=String.class, parameters={})
    private Output<String> filter;

    /**
     * @return An expression that defines the filter to apply across create/update events of findings. While creating a filter string, be mindful of the scope in which the mute configuration is being created. E.g., If a filter contains project = X but is created under the project = Y scope, it might not match any findings. The following field and operator combinations are supported: * severity: `=`, `:` * category: `=`, `:` * resource.name: `=`, `:` * resource.project_name: `=`, `:` * resource.project_display_name: `=`, `:` * resource.folders.resource_folder: `=`, `:` * resource.parent_name: `=`, `:` * resource.parent_display_name: `=`, `:` * resource.type: `=`, `:` * finding_class: `=`, `:` * indicator.ip_addresses: `=`, `:` * indicator.domains: `=`, `:`
     * 
     */
    public Output<String> getFilter() {
        return this.filter;
    }
    /**
     * Email address of the user who last edited the mute config. This field is set by the server and will be ignored if provided on config creation or update.
     * 
     */
    @OutputExport(name="mostRecentEditor", type=String.class, parameters={})
    private Output<String> mostRecentEditor;

    /**
     * @return Email address of the user who last edited the mute config. This field is set by the server and will be ignored if provided on config creation or update.
     * 
     */
    public Output<String> getMostRecentEditor() {
        return this.mostRecentEditor;
    }
    /**
     * This field will be ignored if provided on config creation. Format "organizations/{organization}/muteConfigs/{mute_config}" "folders/{folder}/muteConfigs/{mute_config}" "projects/{project}/muteConfigs/{mute_config}"
     * 
     */
    @OutputExport(name="name", type=String.class, parameters={})
    private Output<String> name;

    /**
     * @return This field will be ignored if provided on config creation. Format "organizations/{organization}/muteConfigs/{mute_config}" "folders/{folder}/muteConfigs/{mute_config}" "projects/{project}/muteConfigs/{mute_config}"
     * 
     */
    public Output<String> getName() {
        return this.name;
    }
    /**
     * The most recent time at which the mute config was updated. This field is set by the server and will be ignored if provided on config creation or update.
     * 
     */
    @OutputExport(name="updateTime", type=String.class, parameters={})
    private Output<String> updateTime;

    /**
     * @return The most recent time at which the mute config was updated. This field is set by the server and will be ignored if provided on config creation or update.
     * 
     */
    public Output<String> getUpdateTime() {
        return this.updateTime;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public MuteConfig(String name) {
        this(name, MuteConfigArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public MuteConfig(String name, MuteConfigArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public MuteConfig(String name, MuteConfigArgs args, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("google-native:securitycenter/v1:MuteConfig", name, args == null ? MuteConfigArgs.Empty : args, makeResourceOptions(options, Input.empty()));
    }

    private MuteConfig(String name, Input<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("google-native:securitycenter/v1:MuteConfig", name, null, makeResourceOptions(options, id));
    }

    private static io.pulumi.resources.CustomResourceOptions makeResourceOptions(@Nullable io.pulumi.resources.CustomResourceOptions options, @Nullable Input<String> id) {
        var defaultOptions = io.pulumi.resources.CustomResourceOptions.builder()
            .setVersion(Utilities.getVersion())
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
    public static MuteConfig get(String name, Input<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        return new MuteConfig(name, id, options);
    }
}
