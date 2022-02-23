// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.portal;

import io.pulumi.azurenative.Utilities;
import io.pulumi.azurenative.portal.UserSettingsArgs;
import io.pulumi.azurenative.portal.outputs.UserPropertiesResponse;
import io.pulumi.core.Alias;
import io.pulumi.core.Input;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.OutputExport;
import io.pulumi.core.annotations.ResourceType;
import java.util.List;
import javax.annotation.Nullable;

/**
 * Response to get user settings
 * API Version: 2018-10-01.
 * 
 * ## Example Usage
 * 
 * ## Import
 * 
 * An existing resource can be imported using its type token, name, and identifier, e.g.
 * 
 * ```sh
 * $ pulumi import azure-native:portal:UserSettings myresource1 /providers/Microsoft.Portal/userSettings/{userSettingsName} 
 * ```
 * 
 */
@ResourceType(type="azure-native:portal:UserSettings")
public class UserSettings extends io.pulumi.resources.CustomResource {
    /**
     * The cloud shell user settings properties.
     * 
     */
    @OutputExport(name="properties", type=UserPropertiesResponse.class, parameters={})
    private Output<UserPropertiesResponse> properties;

    /**
     * @return The cloud shell user settings properties.
     * 
     */
    public Output<UserPropertiesResponse> getProperties() {
        return this.properties;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public UserSettings(String name) {
        this(name, UserSettingsArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public UserSettings(String name, UserSettingsArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public UserSettings(String name, UserSettingsArgs args, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("azure-native:portal:UserSettings", name, args == null ? UserSettingsArgs.Empty : args, makeResourceOptions(options, Input.empty()));
    }

    private UserSettings(String name, Input<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("azure-native:portal:UserSettings", name, null, makeResourceOptions(options, id));
    }

    private static io.pulumi.resources.CustomResourceOptions makeResourceOptions(@Nullable io.pulumi.resources.CustomResourceOptions options, @Nullable Input<String> id) {
        var defaultOptions = io.pulumi.resources.CustomResourceOptions.builder()
            .setVersion(Utilities.getVersion())
            .setAliases(List.of(
                Input.of(Alias.builder().setType("azure-native:portal/v20181001:UserSettings").build())
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
    public static UserSettings get(String name, Input<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        return new UserSettings(name, id, options);
    }
}
