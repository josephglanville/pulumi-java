// *** WARNING: this file was generated by test. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.example;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Export;
import io.pulumi.core.annotations.ResourceType;
import io.pulumi.example.FooResourceArgs;
import io.pulumi.example.Resource;
import io.pulumi.example.Utilities;
import javax.annotation.Nullable;

@ResourceType(type="foo::FooResource")
public class FooResource extends io.pulumi.resources.ComponentResource {
    @Export(name="foo", type=Resource.class, parameters={})
    private Output</* @Nullable */ Resource> foo;

    public Output</* @Nullable */ Resource> getFoo() {
        return this.foo;
    }

    public interface BuilderApplicator {
        public void apply(@Nullable FooResourceArgs.Builder a);
    }
    private static io.pulumi.example.FooResourceArgs buildArgs(BuilderApplicator argsBuilder) {
        final var builder = io.pulumi.example.FooResourceArgs.builder();
        argsBuilder.apply(builder);
        return builder.build();
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param argsBuilder A function that configures a passed builder.
     */
    public FooResource(String name, BuilderApplicator argsBuilder) {
        this(name, buildArgs(argsBuilder), null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public FooResource(String name) {
        this(name, FooResourceArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public FooResource(String name, @Nullable FooResourceArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public FooResource(String name, @Nullable FooResourceArgs args, @Nullable io.pulumi.resources.ComponentResourceOptions options) {
        super("foo::FooResource", name, args == null ? FooResourceArgs.Empty : args, makeResourceOptions(options, Output.empty()), true);
    }

    private static io.pulumi.resources.ComponentResourceOptions makeResourceOptions(@Nullable io.pulumi.resources.ComponentResourceOptions options, @Nullable Output<String> id) {
        var defaultOptions = io.pulumi.resources.ComponentResourceOptions.builder()
            .version(Utilities.getVersion())
            .build();
        return io.pulumi.resources.ComponentResourceOptions.merge(defaultOptions, options, id);
    }

}
