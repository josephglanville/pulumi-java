// *** WARNING: this file was generated by test. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.foobar;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.ResourceType;
import io.pulumi.core.internal.Codegen;
import io.pulumi.foobar.ModuleResourceArgs;
import io.pulumi.foobar.Utilities;
import javax.annotation.Nullable;

@ResourceType(type="foobar::ModuleResource")
public class ModuleResource extends io.pulumi.resources.CustomResource {
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public ModuleResource(String name) {
        this(name, ModuleResourceArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public ModuleResource(String name, ModuleResourceArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public ModuleResource(String name, ModuleResourceArgs args, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("foobar::ModuleResource", name, makeArgs(args), makeResourceOptions(options, Codegen.empty()));
    }

    private ModuleResource(String name, Output<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("foobar::ModuleResource", name, null, makeResourceOptions(options, id));
    }

    private static ModuleResourceArgs makeArgs(ModuleResourceArgs args) {
        var builder = args == null ? ModuleResourceArgs.builder() : ModuleResourceArgs.builder(args);
        return builder
            .optional_const("val")
            .plain_optional_const("val")
            .plain_required_const("val")
            .build();
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
     * @param options Optional settings to control the behavior of the CustomResource.
     */
    public static ModuleResource get(String name, Output<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        return new ModuleResource(name, id, options);
    }
}
