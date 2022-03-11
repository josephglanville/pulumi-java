// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.gamelift;

import io.pulumi.aws.Utilities;
import io.pulumi.aws.gamelift.BuildArgs;
import io.pulumi.aws.gamelift.inputs.BuildState;
import io.pulumi.aws.gamelift.outputs.BuildStorageLocation;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.OutputExport;
import io.pulumi.core.annotations.ResourceType;
import java.lang.String;
import java.util.Map;
import javax.annotation.Nullable;

/**
 * Provides an Gamelift Build resource.
 * 
 * ## Example Usage
 * 
 * ## Import
 * 
 * Gamelift Builds cannot be imported at this time.
 * 
 */
@ResourceType(type="aws:gamelift/build:Build")
public class Build extends io.pulumi.resources.CustomResource {
    /**
     * Gamelift Build ARN.
     * 
     */
    @OutputExport(name="arn", type=String.class, parameters={})
    private Output<String> arn;

    /**
     * @return Gamelift Build ARN.
     * 
     */
    public Output<String> getArn() {
        return this.arn;
    }
    /**
     * Name of the build
     * 
     */
    @OutputExport(name="name", type=String.class, parameters={})
    private Output<String> name;

    /**
     * @return Name of the build
     * 
     */
    public Output<String> getName() {
        return this.name;
    }
    /**
     * Operating system that the game server binaries are built to run onE.g., `WINDOWS_2012`, `AMAZON_LINUX` or `AMAZON_LINUX_2`.
     * 
     */
    @OutputExport(name="operatingSystem", type=String.class, parameters={})
    private Output<String> operatingSystem;

    /**
     * @return Operating system that the game server binaries are built to run onE.g., `WINDOWS_2012`, `AMAZON_LINUX` or `AMAZON_LINUX_2`.
     * 
     */
    public Output<String> getOperatingSystem() {
        return this.operatingSystem;
    }
    /**
     * Information indicating where your game build files are stored. See below.
     * 
     */
    @OutputExport(name="storageLocation", type=BuildStorageLocation.class, parameters={})
    private Output<BuildStorageLocation> storageLocation;

    /**
     * @return Information indicating where your game build files are stored. See below.
     * 
     */
    public Output<BuildStorageLocation> getStorageLocation() {
        return this.storageLocation;
    }
    /**
     * Key-value map of resource tags. .If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
     * 
     */
    @OutputExport(name="tags", type=Map.class, parameters={String.class, String.class})
    private Output</* @Nullable */ Map<String,String>> tags;

    /**
     * @return Key-value map of resource tags. .If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
     * 
     */
    public Output</* @Nullable */ Map<String,String>> getTags() {
        return this.tags;
    }
    /**
     * A map of tags assigned to the resource, including those inherited from the provider .
     * 
     */
    @OutputExport(name="tagsAll", type=Map.class, parameters={String.class, String.class})
    private Output<Map<String,String>> tagsAll;

    /**
     * @return A map of tags assigned to the resource, including those inherited from the provider .
     * 
     */
    public Output<Map<String,String>> getTagsAll() {
        return this.tagsAll;
    }
    /**
     * Version that is associated with this build.
     * 
     */
    @OutputExport(name="version", type=String.class, parameters={})
    private Output</* @Nullable */ String> version;

    /**
     * @return Version that is associated with this build.
     * 
     */
    public Output</* @Nullable */ String> getVersion() {
        return this.version;
    }

    public interface BuilderApplicator {
        public void apply(BuildArgs.Builder a);
    }
    private static io.pulumi.aws.gamelift.BuildArgs buildArgs(BuilderApplicator argsBuilder) {
        final var builder = io.pulumi.aws.gamelift.BuildArgs.builder();
        argsBuilder.apply(builder);
        return builder.build();
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param argsBuilder A function that configures a passed builder.
     */
    public Build(String name, BuilderApplicator argsBuilder) {
        this(name, buildArgs(argsBuilder), null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public Build(String name) {
        this(name, BuildArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public Build(String name, BuildArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public Build(String name, BuildArgs args, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("aws:gamelift/build:Build", name, args == null ? BuildArgs.Empty : args, makeResourceOptions(options, Output.empty()));
    }

    private Build(String name, Output<String> id, @Nullable BuildState state, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("aws:gamelift/build:Build", name, state, makeResourceOptions(options, id));
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
    public static Build get(String name, Output<String> id, @Nullable BuildState state, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        return new Build(name, id, state, options);
    }
}
