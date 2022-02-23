// *** WARNING: this file was generated by test. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.plant.tree_v1;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.ResourceType;
import io.pulumi.plant.Utilities;
import io.pulumi.plant.tree_v1.NurseryArgs;
import javax.annotation.Nullable;

@ResourceType(type="plant:tree/v1:Nursery")
public class Nursery extends io.pulumi.resources.CustomResource {
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public Nursery(String name) {
        this(name, NurseryArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public Nursery(String name, NurseryArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public Nursery(String name, NurseryArgs args, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("plant:tree/v1:Nursery", name, args == null ? NurseryArgs.Empty : args, makeResourceOptions(options, Input.empty()));
    }

    private Nursery(String name, Input<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("plant:tree/v1:Nursery", name, null, makeResourceOptions(options, id));
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
    public static Nursery get(String name, Input<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        return new Nursery(name, id, options);
    }
}
