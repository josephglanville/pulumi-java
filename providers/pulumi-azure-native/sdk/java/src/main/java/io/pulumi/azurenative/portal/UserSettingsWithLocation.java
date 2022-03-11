// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.portal;

import io.pulumi.azurenative.Utilities;
import io.pulumi.azurenative.portal.UserSettingsWithLocationArgs;
import io.pulumi.azurenative.portal.outputs.UserPropertiesResponse;
import io.pulumi.core.Alias;
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
 * $ pulumi import azure-native:portal:UserSettingsWithLocation myresource1 /providers/Microsoft.Portal/locations/{location}/userSettings/{userSettingsName} 
 * ```
 * 
 */
@ResourceType(type="azure-native:portal:UserSettingsWithLocation")
public class UserSettingsWithLocation extends io.pulumi.resources.CustomResource {
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

    public interface BuilderApplicator {
        public void apply(UserSettingsWithLocationArgs.Builder a);
    }
    private static io.pulumi.azurenative.portal.UserSettingsWithLocationArgs buildArgs(BuilderApplicator argsBuilder) {
        final var builder = io.pulumi.azurenative.portal.UserSettingsWithLocationArgs.builder();
        argsBuilder.apply(builder);
        return builder.build();
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param argsBuilder A function that configures a passed builder.
     */
    public UserSettingsWithLocation(String name, BuilderApplicator argsBuilder) {
        this(name, buildArgs(argsBuilder), null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public UserSettingsWithLocation(String name) {
        this(name, UserSettingsWithLocationArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public UserSettingsWithLocation(String name, UserSettingsWithLocationArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public UserSettingsWithLocation(String name, UserSettingsWithLocationArgs args, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("azure-native:portal:UserSettingsWithLocation", name, args == null ? UserSettingsWithLocationArgs.Empty : args, makeResourceOptions(options, Output.empty()));
    }

    private UserSettingsWithLocation(String name, Output<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("azure-native:portal:UserSettingsWithLocation", name, null, makeResourceOptions(options, id));
    }

    private static io.pulumi.resources.CustomResourceOptions makeResourceOptions(@Nullable io.pulumi.resources.CustomResourceOptions options, @Nullable Output<String> id) {
        var defaultOptions = io.pulumi.resources.CustomResourceOptions.builder()
            .setVersion(Utilities.getVersion())
            .setAliases(List.of(
                Output.of(Alias.builder().setType("azure-native:portal/v20181001:UserSettingsWithLocation").build())
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
    public static UserSettingsWithLocation get(String name, Output<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        return new UserSettingsWithLocation(name, id, options);
    }
}
