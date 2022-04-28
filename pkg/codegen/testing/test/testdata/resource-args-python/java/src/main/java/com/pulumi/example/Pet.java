// *** WARNING: this file was generated by test. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.example;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import com.pulumi.example.PetArgs;
import com.pulumi.example.Utilities;
import com.pulumi.resources.CustomResource;
import com.pulumi.resources.CustomResourceOptions;
import java.lang.String;
import java.util.Optional;
import javax.annotation.Nullable;

@ResourceType(type="example::Pet")
public class Pet extends CustomResource {
    @Export(name="name", type=String.class, parameters={})
    private Output</* @Nullable */ String> name;

    public Output<Optional<String>> name() {
        return Codegen.optional(this.name);
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public Pet(String name) {
        this(name, PetArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public Pet(String name, @Nullable PetArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public Pet(String name, @Nullable PetArgs args, @Nullable CustomResourceOptions options) {
        super("example::Pet", name, args == null ? PetArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private Pet(String name, Output<String> id, @Nullable CustomResourceOptions options) {
        super("example::Pet", name, null, makeResourceOptions(options, id));
    }

    private static CustomResourceOptions makeResourceOptions(@Nullable CustomResourceOptions options, @Nullable Output<String> id) {
        var defaultOptions = CustomResourceOptions.builder()
            .version(Utilities.getVersion())
            .build();
        return CustomResourceOptions.merge(defaultOptions, options, id);
    }

    /**
     * Get an existing Host resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param options Optional settings to control the behavior of the CustomResource.
     */
    public static Pet get(String name, Output<String> id, @Nullable CustomResourceOptions options) {
        return new Pet(name, id, options);
    }
}
