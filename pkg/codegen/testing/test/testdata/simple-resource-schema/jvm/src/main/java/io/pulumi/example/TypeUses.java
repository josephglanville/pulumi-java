// *** WARNING: this file was generated by test. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.example;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Export;
import io.pulumi.core.annotations.ResourceType;
import io.pulumi.core.internal.Codegen;
import io.pulumi.example.TypeUsesArgs;
import io.pulumi.example.Utilities;
import io.pulumi.example.outputs.Object;
import io.pulumi.example.outputs.ObjectWithNodeOptionalInputs;
import io.pulumi.example.outputs.SomeOtherObject;
import javax.annotation.Nullable;

@ResourceType(type="example::TypeUses")
public class TypeUses extends io.pulumi.resources.CustomResource {
    @Export(name="bar", type=SomeOtherObject.class, parameters={})
    private Output</* @Nullable */ SomeOtherObject> bar;

    public Output</* @Nullable */ SomeOtherObject> getBar() {
        return this.bar;
    }
    @Export(name="baz", type=ObjectWithNodeOptionalInputs.class, parameters={})
    private Output</* @Nullable */ ObjectWithNodeOptionalInputs> baz;

    public Output</* @Nullable */ ObjectWithNodeOptionalInputs> getBaz() {
        return this.baz;
    }
    @Export(name="foo", type=Object.class, parameters={})
    private Output</* @Nullable */ Object> foo;

    public Output</* @Nullable */ Object> getFoo() {
        return this.foo;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public TypeUses(String name) {
        this(name, TypeUsesArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public TypeUses(String name, @Nullable TypeUsesArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public TypeUses(String name, @Nullable TypeUsesArgs args, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("example::TypeUses", name, args == null ? TypeUsesArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private TypeUses(String name, Output<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("example::TypeUses", name, null, makeResourceOptions(options, id));
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
    public static TypeUses get(String name, Output<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        return new TypeUses(name, id, options);
    }
}
