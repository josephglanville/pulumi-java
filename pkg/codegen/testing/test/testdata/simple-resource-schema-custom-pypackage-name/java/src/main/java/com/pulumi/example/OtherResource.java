// *** WARNING: this file was generated by test. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.example;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import com.pulumi.example.OtherResourceArgs;
import com.pulumi.example.Resource;
import com.pulumi.example.Utilities;
import com.pulumi.resources.ComponentResource;
import com.pulumi.resources.ComponentResourceOptions;
import com.pulumi.resources.CustomResourceOptions;
import java.util.Optional;
import javax.annotation.Nullable;

@ResourceType(type="example::OtherResource")
public class OtherResource extends ComponentResource {
    @Export(name="foo", type=Resource.class, parameters={})
    private Output</* @Nullable */ Resource> foo;

    public Output<Optional<Resource>> foo() {
        return Codegen.optional(this.foo);
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public OtherResource(String name) {
        this(name, OtherResourceArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public OtherResource(String name, @Nullable OtherResourceArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public OtherResource(String name, @Nullable OtherResourceArgs args, @Nullable ComponentResourceOptions options) {
        super("example::OtherResource", name, args == null ? OtherResourceArgs.Empty : args, makeResourceOptions(options, Codegen.empty()), true);
    }

    private static ComponentResourceOptions makeResourceOptions(@Nullable ComponentResourceOptions options, @Nullable Output<String> id) {
        var defaultOptions = ComponentResourceOptions.builder()
            .version(Utilities.getVersion())
            .build();
        return ComponentResourceOptions.merge(defaultOptions, options, id);
    }

}
