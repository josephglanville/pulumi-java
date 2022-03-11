// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.kms;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.OutputExport;
import io.pulumi.core.annotations.ResourceType;
import io.pulumi.gcp.Utilities;
import io.pulumi.gcp.kms.KeyRingArgs;
import io.pulumi.gcp.kms.inputs.KeyRingState;
import java.lang.String;
import javax.annotation.Nullable;

/**
 * A `KeyRing` is a toplevel logical grouping of `CryptoKeys`.
 * 
 * > **Note:** KeyRings cannot be deleted from Google Cloud Platform.
 * Destroying a provider-managed KeyRing will remove it from state but
 * *will not delete the resource from the project.*
 * 
 * To get more information about KeyRing, see:
 * 
 * * [API documentation](https://cloud.google.com/kms/docs/reference/rest/v1/projects.locations.keyRings)
 * * How-to Guides
 *     * [Creating a key ring](https://cloud.google.com/kms/docs/creating-keys#create_a_key_ring)
 * 
 * ## Example Usage
 * 
 * ## Import
 * 
 * KeyRing can be imported using any of these accepted formats
 * 
 * ```sh
 *  $ pulumi import gcp:kms/keyRing:KeyRing default projects/{{project}}/locations/{{location}}/keyRings/{{name}}
 * ```
 * 
 * ```sh
 *  $ pulumi import gcp:kms/keyRing:KeyRing default {{project}}/{{location}}/{{name}}
 * ```
 * 
 * ```sh
 *  $ pulumi import gcp:kms/keyRing:KeyRing default {{location}}/{{name}}
 * ```
 * 
 */
@ResourceType(type="gcp:kms/keyRing:KeyRing")
public class KeyRing extends io.pulumi.resources.CustomResource {
    /**
     * The location for the KeyRing.
     * A full list of valid locations can be found by running `gcloud kms locations list`.
     * 
     */
    @OutputExport(name="location", type=String.class, parameters={})
    private Output<String> location;

    /**
     * @return The location for the KeyRing.
     * A full list of valid locations can be found by running `gcloud kms locations list`.
     * 
     */
    public Output<String> getLocation() {
        return this.location;
    }
    /**
     * The resource name for the KeyRing.
     * 
     */
    @OutputExport(name="name", type=String.class, parameters={})
    private Output<String> name;

    /**
     * @return The resource name for the KeyRing.
     * 
     */
    public Output<String> getName() {
        return this.name;
    }
    /**
     * The ID of the project in which the resource belongs.
     * If it is not provided, the provider project is used.
     * 
     */
    @OutputExport(name="project", type=String.class, parameters={})
    private Output<String> project;

    /**
     * @return The ID of the project in which the resource belongs.
     * If it is not provided, the provider project is used.
     * 
     */
    public Output<String> getProject() {
        return this.project;
    }

    public interface BuilderApplicator {
        public void apply(KeyRingArgs.Builder a);
    }
    private static io.pulumi.gcp.kms.KeyRingArgs buildArgs(BuilderApplicator argsBuilder) {
        final var builder = io.pulumi.gcp.kms.KeyRingArgs.builder();
        argsBuilder.apply(builder);
        return builder.build();
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param argsBuilder A function that configures a passed builder.
     */
    public KeyRing(String name, BuilderApplicator argsBuilder) {
        this(name, buildArgs(argsBuilder), null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public KeyRing(String name) {
        this(name, KeyRingArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public KeyRing(String name, KeyRingArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public KeyRing(String name, KeyRingArgs args, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("gcp:kms/keyRing:KeyRing", name, args == null ? KeyRingArgs.Empty : args, makeResourceOptions(options, Output.empty()));
    }

    private KeyRing(String name, Output<String> id, @Nullable KeyRingState state, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("gcp:kms/keyRing:KeyRing", name, state, makeResourceOptions(options, id));
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
    public static KeyRing get(String name, Output<String> id, @Nullable KeyRingState state, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        return new KeyRing(name, id, state, options);
    }
}
