// *** WARNING: this file was generated by test. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.example;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.OutputExport;
import io.pulumi.core.annotations.ResourceType;
import io.pulumi.example.DogArgs;
import io.pulumi.example.Utilities;
import java.lang.String;
import javax.annotation.Nullable;

@ResourceType(type="example::Dog")
public class Dog extends io.pulumi.resources.CustomResource {
    @OutputExport(name="bone", type=String.class, parameters={})
    private Output</* @Nullable */ String> bone;

    public Output</* @Nullable */ String> getBone() {
        return this.bone;
    }

    public interface BuilderApplicator {
        public void apply(@Nullable DogArgs.Builder a);
    }
    private static io.pulumi.example.DogArgs buildArgs(BuilderApplicator argsBuilder) {
        final var builder = io.pulumi.example.DogArgs.builder();
        argsBuilder.apply(builder);
        return builder.build();
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param argsBuilder A function that configures a passed builder.
     */
    public Dog(String name, BuilderApplicator argsBuilder) {
        this(name, buildArgs(argsBuilder), null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public Dog(String name) {
        this(name, DogArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public Dog(String name, @Nullable DogArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public Dog(String name, @Nullable DogArgs args, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("example::Dog", name, args == null ? DogArgs.Empty : args, makeResourceOptions(options, Output.empty()));
    }

    private Dog(String name, Output<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("example::Dog", name, null, makeResourceOptions(options, id));
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
     * @param options Optional settings to control the behavior of the CustomResource.
     */
    public static Dog get(String name, Output<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        return new Dog(name, id, options);
    }
}
