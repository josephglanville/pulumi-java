// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.compute;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Export;
import io.pulumi.core.annotations.ResourceType;
import io.pulumi.gcp.Utilities;
import io.pulumi.gcp.compute.RegionPerInstanceConfigArgs;
import io.pulumi.gcp.compute.inputs.RegionPerInstanceConfigState;
import io.pulumi.gcp.compute.outputs.RegionPerInstanceConfigPreservedState;
import java.lang.Boolean;
import java.lang.String;
import javax.annotation.Nullable;

/**
 * A config defined for a single managed instance that belongs to an instance group manager. It preserves the instance name
 * across instance group manager operations and can define stateful disks or metadata that are unique to the instance.
 * This resource works with regional instance group managers.
 * 
 * To get more information about RegionPerInstanceConfig, see:
 * 
 * * [API documentation](https://cloud.google.com/compute/docs/reference/rest/v1/instanceGroupManagers)
 * * How-to Guides
 *     * [Official Documentation](https://cloud.google.com/compute/docs/instance-groups/stateful-migs#per-instance_configs)
 * 
 * ## Example Usage
 * 
 * ## Import
 * 
 * RegionPerInstanceConfig can be imported using any of these accepted formats
 * 
 * ```sh
 *  $ pulumi import gcp:compute/regionPerInstanceConfig:RegionPerInstanceConfig default projects/{{project}}/regions/{{region}}/instanceGroupManagers/{{region_instance_group_manager}}/{{name}}
 * ```
 * 
 * ```sh
 *  $ pulumi import gcp:compute/regionPerInstanceConfig:RegionPerInstanceConfig default {{project}}/{{region}}/{{region_instance_group_manager}}/{{name}}
 * ```
 * 
 * ```sh
 *  $ pulumi import gcp:compute/regionPerInstanceConfig:RegionPerInstanceConfig default {{region}}/{{region_instance_group_manager}}/{{name}}
 * ```
 * 
 * ```sh
 *  $ pulumi import gcp:compute/regionPerInstanceConfig:RegionPerInstanceConfig default {{region_instance_group_manager}}/{{name}}
 * ```
 * 
 */
@ResourceType(type="gcp:compute/regionPerInstanceConfig:RegionPerInstanceConfig")
public class RegionPerInstanceConfig extends io.pulumi.resources.CustomResource {
    /**
     * The minimal action to perform on the instance during an update.
     * Default is `NONE`. Possible values are:
     * * REPLACE
     * * RESTART
     * * REFRESH
     * * NONE
     * 
     */
    @Export(name="minimalAction", type=String.class, parameters={})
    private Output</* @Nullable */ String> minimalAction;

    /**
     * @return The minimal action to perform on the instance during an update.
     * Default is `NONE`. Possible values are:
     * * REPLACE
     * * RESTART
     * * REFRESH
     * * NONE
     * 
     */
    public Output</* @Nullable */ String> getMinimalAction() {
        return this.minimalAction;
    }
    /**
     * The most disruptive action to perform on the instance during an update.
     * Default is `REPLACE`. Possible values are:
     * * REPLACE
     * * RESTART
     * * REFRESH
     * * NONE
     * 
     */
    @Export(name="mostDisruptiveAllowedAction", type=String.class, parameters={})
    private Output</* @Nullable */ String> mostDisruptiveAllowedAction;

    /**
     * @return The most disruptive action to perform on the instance during an update.
     * Default is `REPLACE`. Possible values are:
     * * REPLACE
     * * RESTART
     * * REFRESH
     * * NONE
     * 
     */
    public Output</* @Nullable */ String> getMostDisruptiveAllowedAction() {
        return this.mostDisruptiveAllowedAction;
    }
    /**
     * The name for this per-instance config and its corresponding instance.
     * 
     */
    @Export(name="name", type=String.class, parameters={})
    private Output<String> name;

    /**
     * @return The name for this per-instance config and its corresponding instance.
     * 
     */
    public Output<String> getName() {
        return this.name;
    }
    /**
     * The preserved state for this instance.
     * Structure is documented below.
     * 
     */
    @Export(name="preservedState", type=RegionPerInstanceConfigPreservedState.class, parameters={})
    private Output</* @Nullable */ RegionPerInstanceConfigPreservedState> preservedState;

    /**
     * @return The preserved state for this instance.
     * Structure is documented below.
     * 
     */
    public Output</* @Nullable */ RegionPerInstanceConfigPreservedState> getPreservedState() {
        return this.preservedState;
    }
    /**
     * The ID of the project in which the resource belongs.
     * If it is not provided, the provider project is used.
     * 
     */
    @Export(name="project", type=String.class, parameters={})
    private Output<String> project;

    /**
     * @return The ID of the project in which the resource belongs.
     * If it is not provided, the provider project is used.
     * 
     */
    public Output<String> getProject() {
        return this.project;
    }
    /**
     * Region where the containing instance group manager is located
     * 
     */
    @Export(name="region", type=String.class, parameters={})
    private Output<String> region;

    /**
     * @return Region where the containing instance group manager is located
     * 
     */
    public Output<String> getRegion() {
        return this.region;
    }
    /**
     * The region instance group manager this instance config is part of.
     * 
     */
    @Export(name="regionInstanceGroupManager", type=String.class, parameters={})
    private Output<String> regionInstanceGroupManager;

    /**
     * @return The region instance group manager this instance config is part of.
     * 
     */
    public Output<String> getRegionInstanceGroupManager() {
        return this.regionInstanceGroupManager;
    }
    /**
     * When true, deleting this config will immediately remove any specified state from the underlying instance.
     * When false, deleting this config will *not* immediately remove any state from the underlying instance.
     * State will be removed on the next instance recreation or update.
     * 
     */
    @Export(name="removeInstanceStateOnDestroy", type=Boolean.class, parameters={})
    private Output</* @Nullable */ Boolean> removeInstanceStateOnDestroy;

    /**
     * @return When true, deleting this config will immediately remove any specified state from the underlying instance.
     * When false, deleting this config will *not* immediately remove any state from the underlying instance.
     * State will be removed on the next instance recreation or update.
     * 
     */
    public Output</* @Nullable */ Boolean> getRemoveInstanceStateOnDestroy() {
        return this.removeInstanceStateOnDestroy;
    }

    public interface BuilderApplicator {
        public void apply(RegionPerInstanceConfigArgs.Builder a);
    }
    private static io.pulumi.gcp.compute.RegionPerInstanceConfigArgs buildArgs(BuilderApplicator argsBuilder) {
        final var builder = io.pulumi.gcp.compute.RegionPerInstanceConfigArgs.builder();
        argsBuilder.apply(builder);
        return builder.build();
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param argsBuilder A function that configures a passed builder.
     */
    public RegionPerInstanceConfig(String name, BuilderApplicator argsBuilder) {
        this(name, buildArgs(argsBuilder), null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public RegionPerInstanceConfig(String name) {
        this(name, RegionPerInstanceConfigArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public RegionPerInstanceConfig(String name, RegionPerInstanceConfigArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public RegionPerInstanceConfig(String name, RegionPerInstanceConfigArgs args, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("gcp:compute/regionPerInstanceConfig:RegionPerInstanceConfig", name, args == null ? RegionPerInstanceConfigArgs.Empty : args, makeResourceOptions(options, Output.empty()));
    }

    private RegionPerInstanceConfig(String name, Output<String> id, @Nullable RegionPerInstanceConfigState state, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("gcp:compute/regionPerInstanceConfig:RegionPerInstanceConfig", name, state, makeResourceOptions(options, id));
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
    public static RegionPerInstanceConfig get(String name, Output<String> id, @Nullable RegionPerInstanceConfigState state, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        return new RegionPerInstanceConfig(name, id, state, options);
    }
}
