// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.backup;

import io.pulumi.aws.Utilities;
import io.pulumi.aws.backup.RegionSettingsArgs;
import io.pulumi.aws.backup.inputs.RegionSettingsState;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.Export;
import io.pulumi.core.annotations.ResourceType;
import java.lang.Boolean;
import java.lang.String;
import java.util.Map;
import javax.annotation.Nullable;

/**
 * Provides an AWS Backup Region Settings resource.
 * 
 * ## Example Usage
 * 
 * ## Import
 * 
 * Backup Region Settings can be imported using the `region`, e.g.,
 * 
 * ```sh
 *  $ pulumi import aws:backup/regionSettings:RegionSettings test us-west-2
 * ```
 * 
 */
@ResourceType(type="aws:backup/regionSettings:RegionSettings")
public class RegionSettings extends io.pulumi.resources.CustomResource {
    /**
     * A map of services along with the management preferences for the Region.
     * 
     */
    @Export(name="resourceTypeManagementPreference", type=Map.class, parameters={String.class, Boolean.class})
    private Output<Map<String,Boolean>> resourceTypeManagementPreference;

    /**
     * @return A map of services along with the management preferences for the Region.
     * 
     */
    public Output<Map<String,Boolean>> getResourceTypeManagementPreference() {
        return this.resourceTypeManagementPreference;
    }
    /**
     * A map of services along with the opt-in preferences for the Region.
     * 
     */
    @Export(name="resourceTypeOptInPreference", type=Map.class, parameters={String.class, Boolean.class})
    private Output<Map<String,Boolean>> resourceTypeOptInPreference;

    /**
     * @return A map of services along with the opt-in preferences for the Region.
     * 
     */
    public Output<Map<String,Boolean>> getResourceTypeOptInPreference() {
        return this.resourceTypeOptInPreference;
    }

    public interface BuilderApplicator {
        public void apply(RegionSettingsArgs.Builder a);
    }
    private static io.pulumi.aws.backup.RegionSettingsArgs buildArgs(BuilderApplicator argsBuilder) {
        final var builder = io.pulumi.aws.backup.RegionSettingsArgs.builder();
        argsBuilder.apply(builder);
        return builder.build();
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param argsBuilder A function that configures a passed builder.
     */
    public RegionSettings(String name, BuilderApplicator argsBuilder) {
        this(name, buildArgs(argsBuilder), null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public RegionSettings(String name) {
        this(name, RegionSettingsArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public RegionSettings(String name, RegionSettingsArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public RegionSettings(String name, RegionSettingsArgs args, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("aws:backup/regionSettings:RegionSettings", name, args == null ? RegionSettingsArgs.Empty : args, makeResourceOptions(options, Output.empty()));
    }

    private RegionSettings(String name, Output<String> id, @Nullable RegionSettingsState state, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("aws:backup/regionSettings:RegionSettings", name, state, makeResourceOptions(options, id));
    }

    private static io.pulumi.resources.CustomResourceOptions makeResourceOptions(@Nullable io.pulumi.resources.CustomResourceOptions options, @Nullable Output<String> id) {
        var defaultOptions = io.pulumi.resources.CustomResourceOptions.builder()
            .version(Utilities.getVersion())
            .build();
        return io.pulumi.resources.CustomResourceOptions.merge(defaultOptions, options, id);
    }

    /**
     * Get an existing Host resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state
     * @param options Optional settings to control the behavior of the CustomResource.
     */
    public static RegionSettings get(String name, Output<String> id, @Nullable RegionSettingsState state, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        return new RegionSettings(name, id, state, options);
    }
}
