// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.docker;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.OutputExport;
import io.pulumi.core.annotations.ResourceType;
import io.pulumi.docker.Utilities;
import io.pulumi.docker.VolumeArgs;
import io.pulumi.docker.inputs.VolumeState;
import io.pulumi.docker.outputs.VolumeLabel;
import java.lang.Object;
import java.lang.String;
import java.util.List;
import java.util.Map;
import javax.annotation.Nullable;

/**
 * <!-- Bug: Type and Name are switched -->
 * Creates and destroys a volume in Docker. This can be used alongside docker.Container to prepare volumes that can be shared across containers.
 * 
 * ## Example Usage
 * ## Schema
 * 
 * ### Optional
 * 
 * - **driver** (String) Driver type for the volume. Defaults to `local`.
 * - **driver_opts** (Map of String) Options specific to the driver.
 * - **id** (String) The ID of this resource.
 * - **labels** (Block Set) User-defined key/value metadata (see below for nested schema)
 * - **name** (String) The name of the Docker volume (will be generated if not provided).
 * 
 * ### Read-Only
 * 
 * - **mountpoint** (String) The mountpoint of the volume.
 * 
 * <a id="nestedblock--labels"></a>
 * ### Nested Schema for `labels`
 * 
 * Required:
 * 
 * - **label** (String) Name of the label
 * - **value** (String) Value of the label
 * 
 * ## Import
 * 
 * ### Example Assuming you created a `volume` as follows #!/bin/bash docker volume create # prints the long ID 524b0457aa2a87dd2b75c74c3e4e53f406974249e63ab3ed9bf21e5644f9dc7d you provide the definition for the resource as follows terraform resource "docker_volume" "foo" {
 * 
 *  name = "524b0457aa2a87dd2b75c74c3e4e53f406974249e63ab3ed9bf21e5644f9dc7d" } then the import command is as follows #!/bin/bash
 * 
 * ```sh
 *  $ pulumi import docker:index/volume:Volume foo 524b0457aa2a87dd2b75c74c3e4e53f406974249e63ab3ed9bf21e5644f9dc7d
 * ```
 * 
 */
@ResourceType(type="docker:index/volume:Volume")
public class Volume extends io.pulumi.resources.CustomResource {
    /**
     * Driver type for the volume. Defaults to `local`.
     * 
     */
    @OutputExport(name="driver", type=String.class, parameters={})
    private Output<String> driver;

    /**
     * @return Driver type for the volume. Defaults to `local`.
     * 
     */
    public Output<String> getDriver() {
        return this.driver;
    }
    /**
     * Options specific to the driver.
     * 
     */
    @OutputExport(name="driverOpts", type=Map.class, parameters={String.class, Object.class})
    private Output</* @Nullable */ Map<String,Object>> driverOpts;

    /**
     * @return Options specific to the driver.
     * 
     */
    public Output</* @Nullable */ Map<String,Object>> getDriverOpts() {
        return this.driverOpts;
    }
    /**
     * User-defined key/value metadata
     * 
     */
    @OutputExport(name="labels", type=List.class, parameters={VolumeLabel.class})
    private Output</* @Nullable */ List<VolumeLabel>> labels;

    /**
     * @return User-defined key/value metadata
     * 
     */
    public Output</* @Nullable */ List<VolumeLabel>> getLabels() {
        return this.labels;
    }
    /**
     * The mountpoint of the volume.
     * 
     */
    @OutputExport(name="mountpoint", type=String.class, parameters={})
    private Output<String> mountpoint;

    /**
     * @return The mountpoint of the volume.
     * 
     */
    public Output<String> getMountpoint() {
        return this.mountpoint;
    }
    /**
     * The name of the Docker volume (will be generated if not provided).
     * 
     */
    @OutputExport(name="name", type=String.class, parameters={})
    private Output<String> name;

    /**
     * @return The name of the Docker volume (will be generated if not provided).
     * 
     */
    public Output<String> getName() {
        return this.name;
    }

    public interface BuilderApplicator {
        public void apply(@Nullable VolumeArgs.Builder a);
    }
    private static io.pulumi.docker.VolumeArgs buildArgs(BuilderApplicator argsBuilder) {
        final var builder = io.pulumi.docker.VolumeArgs.builder();
        argsBuilder.apply(builder);
        return builder.build();
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param argsBuilder A function that configures a passed builder.
     */
    public Volume(String name, BuilderApplicator argsBuilder) {
        this(name, buildArgs(argsBuilder), null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public Volume(String name) {
        this(name, VolumeArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public Volume(String name, @Nullable VolumeArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public Volume(String name, @Nullable VolumeArgs args, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("docker:index/volume:Volume", name, args == null ? VolumeArgs.Empty : args, makeResourceOptions(options, Output.empty()));
    }

    private Volume(String name, Output<String> id, @Nullable VolumeState state, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("docker:index/volume:Volume", name, state, makeResourceOptions(options, id));
    }

    private static io.pulumi.resources.CustomResourceOptions makeResourceOptions(@Nullable io.pulumi.resources.CustomResourceOptions options, @Nullable Output<String> id) {
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
     * @param state
     * @param options Optional settings to control the behavior of the CustomResource.
     */
    public static Volume get(String name, Output<String> id, @Nullable VolumeState state, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        return new Volume(name, id, state, options);
    }
}
