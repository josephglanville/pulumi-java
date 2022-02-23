// *** WARNING: this file was generated by test. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.example;

import io.pulumi.core.Input;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.OutputExport;
import io.pulumi.core.annotations.ResourceType;
import io.pulumi.example.Dog;
import io.pulumi.example.GodArgs;
import io.pulumi.example.Utilities;
import javax.annotation.Nullable;

@ResourceType(type="example::God")
public class God extends io.pulumi.resources.CustomResource {
    @OutputExport(name="backwards", type=Dog.class, parameters={})
    private Output</* @Nullable */ Dog> backwards;

    public Output</* @Nullable */ Dog> getBackwards() {
        return this.backwards;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public God(String name) {
        this(name, GodArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public God(String name, @Nullable GodArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public God(String name, @Nullable GodArgs args, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("example::God", name, args == null ? GodArgs.Empty : args, makeResourceOptions(options, Input.empty()));
    }

    private God(String name, Input<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("example::God", name, null, makeResourceOptions(options, id));
    }

    private static io.pulumi.resources.CustomResourceOptions makeResourceOptions(@Nullable io.pulumi.resources.CustomResourceOptions options, @Nullable Input<String> id) {
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
    public static God get(String name, Input<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        return new God(name, id, options);
    }
}
