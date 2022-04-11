// *** WARNING: this file was generated by test. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.foo.nested_module;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Export;
import io.pulumi.core.annotations.ResourceType;
import io.pulumi.core.internal.Codegen;
import io.pulumi.foo.Utilities;
import io.pulumi.foo.nested_module.ResourceArgs;
import java.lang.String;
import java.util.List;
import javax.annotation.Nullable;

@ResourceType(type="foo:nested/module:Resource")
public class Resource extends io.pulumi.resources.CustomResource {
    @Export(name="bar", type=String.class, parameters={})
    private Output</* @Nullable */ String> bar;

    public Output</* @Nullable */ String> getBar() {
        return this.bar;
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
        super("foo:nested/module:Resource", name, args == null ? ResourceArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private Resource(String name, Output<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("foo:nested/module:Resource", name, null, makeResourceOptions(options, id));
    }

    private static io.pulumi.resources.CustomResourceOptions makeResourceOptions(@Nullable io.pulumi.resources.CustomResourceOptions options, @Nullable Output<String> id) {
        var defaultOptions = io.pulumi.resources.CustomResourceOptions.builder()
            .version(Utilities.getVersion())
            .additionalSecretOutputs(List.of(
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
