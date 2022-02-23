// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.greengrassv2;

import io.pulumi.awsnative.Utilities;
import io.pulumi.awsnative.greengrassv2.ComponentVersionArgs;
import io.pulumi.awsnative.greengrassv2.outputs.ComponentVersionLambdaFunctionRecipeSource;
import io.pulumi.core.Input;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.OutputExport;
import io.pulumi.core.annotations.ResourceType;
import java.lang.Object;
import java.lang.String;
import javax.annotation.Nullable;

/**
 * Resource for Greengrass component version.
 * 
 */
@ResourceType(type="aws-native:greengrassv2:ComponentVersion")
public class ComponentVersion extends io.pulumi.resources.CustomResource {
    @OutputExport(name="arn", type=String.class, parameters={})
    private Output<String> arn;

    public Output<String> getArn() {
        return this.arn;
    }
    @OutputExport(name="componentName", type=String.class, parameters={})
    private Output<String> componentName;

    public Output<String> getComponentName() {
        return this.componentName;
    }
    @OutputExport(name="componentVersion", type=String.class, parameters={})
    private Output<String> componentVersion;

    public Output<String> getComponentVersion() {
        return this.componentVersion;
    }
    @OutputExport(name="inlineRecipe", type=String.class, parameters={})
    private Output</* @Nullable */ String> inlineRecipe;

    public Output</* @Nullable */ String> getInlineRecipe() {
        return this.inlineRecipe;
    }
    @OutputExport(name="lambdaFunction", type=ComponentVersionLambdaFunctionRecipeSource.class, parameters={})
    private Output</* @Nullable */ ComponentVersionLambdaFunctionRecipeSource> lambdaFunction;

    public Output</* @Nullable */ ComponentVersionLambdaFunctionRecipeSource> getLambdaFunction() {
        return this.lambdaFunction;
    }
    @OutputExport(name="tags", type=Object.class, parameters={})
    private Output</* @Nullable */ Object> tags;

    public Output</* @Nullable */ Object> getTags() {
        return this.tags;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public ComponentVersion(String name) {
        this(name, ComponentVersionArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public ComponentVersion(String name, @Nullable ComponentVersionArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public ComponentVersion(String name, @Nullable ComponentVersionArgs args, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("aws-native:greengrassv2:ComponentVersion", name, args == null ? ComponentVersionArgs.Empty : args, makeResourceOptions(options, Input.empty()));
    }

    private ComponentVersion(String name, Input<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("aws-native:greengrassv2:ComponentVersion", name, null, makeResourceOptions(options, id));
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
    public static ComponentVersion get(String name, Input<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        return new ComponentVersion(name, id, options);
    }
}
