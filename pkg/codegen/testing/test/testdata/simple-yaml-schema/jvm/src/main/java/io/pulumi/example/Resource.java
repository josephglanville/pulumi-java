// *** WARNING: this file was generated by test. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.example;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.OutputExport;
import io.pulumi.core.annotations.ResourceType;
import io.pulumi.example.ResourceArgs;
import io.pulumi.example.Utilities;
import java.lang.String;
import java.util.List;
import javax.annotation.Nullable;

@ResourceType(type="example::Resource")
public class Resource extends io.pulumi.resources.CustomResource {
    @OutputExport(name="bar", type=String.class, parameters={})
    private Output</* @Nullable */ String> bar;

    public Output</* @Nullable */ String> getBar() {
        return this.bar;
    }

    public interface BuilderApplicator {
        public void apply(@Nullable ResourceArgs.Builder a);
    }
    private static io.pulumi.example.ResourceArgs buildArgs(BuilderApplicator argsBuilder) {
        final var builder = io.pulumi.example.ResourceArgs.builder();
        argsBuilder.apply(builder);
        return builder.build();
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param argsBuilder A function that configures a passed builder.
     */
    public Resource(String name, BuilderApplicator argsBuilder) {
        this(name, buildArgs(argsBuilder), null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public Resource(String name) {
        this(name, ResourceArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public Resource(String name, @Nullable ResourceArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public Resource(String name, @Nullable ResourceArgs args, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("example::Resource", name, args == null ? ResourceArgs.Empty : args, makeResourceOptions(options, Output.empty()));
    }

    private Resource(String name, Output<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("example::Resource", name, null, makeResourceOptions(options, id));
    }

    private static io.pulumi.resources.CustomResourceOptions makeResourceOptions(@Nullable io.pulumi.resources.CustomResourceOptions options, @Nullable Output<String> id) {
        var defaultOptions = io.pulumi.resources.CustomResourceOptions.builder()
            .setVersion(Utilities.getVersion())
            .setAdditionalSecretOutputs(List.of(
                "bar"
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
    public static Resource get(String name, Output<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        return new Resource(name, id, options);
    }
}
