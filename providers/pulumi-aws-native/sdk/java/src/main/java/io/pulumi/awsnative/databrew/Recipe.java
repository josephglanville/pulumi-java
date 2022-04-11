// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.databrew;

import io.pulumi.awsnative.Utilities;
import io.pulumi.awsnative.databrew.RecipeArgs;
import io.pulumi.awsnative.databrew.outputs.RecipeStep;
import io.pulumi.awsnative.databrew.outputs.RecipeTag;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.Export;
import io.pulumi.core.annotations.ResourceType;
import io.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.List;
import javax.annotation.Nullable;

/**
 * Resource schema for AWS::DataBrew::Recipe.
 * 
 * ## Example Usage
 * 
 */
@ResourceType(type="aws-native:databrew:Recipe")
public class Recipe extends io.pulumi.resources.CustomResource {
    /**
     * Description of the recipe
     * 
     */
    @Export(name="description", type=String.class, parameters={})
    private Output</* @Nullable */ String> description;

    /**
     * @return Description of the recipe
     * 
     */
    public Output</* @Nullable */ String> getDescription() {
        return this.description;
    }
    /**
     * Recipe name
     * 
     */
    @Export(name="name", type=String.class, parameters={})
    private Output<String> name;

    /**
     * @return Recipe name
     * 
     */
    public Output<String> getName() {
        return this.name;
    }
    @Export(name="steps", type=List.class, parameters={RecipeStep.class})
    private Output<List<RecipeStep>> steps;

    public Output<List<RecipeStep>> getSteps() {
        return this.steps;
    }
    @Export(name="tags", type=List.class, parameters={RecipeTag.class})
    private Output</* @Nullable */ List<RecipeTag>> tags;

    public Output</* @Nullable */ List<RecipeTag>> getTags() {
        return this.tags;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public Recipe(String name) {
        this(name, RecipeArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public Recipe(String name, RecipeArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public Recipe(String name, RecipeArgs args, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("aws-native:databrew:Recipe", name, args == null ? RecipeArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private Recipe(String name, Output<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("aws-native:databrew:Recipe", name, null, makeResourceOptions(options, id));
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
    public static Recipe get(String name, Output<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        return new Recipe(name, id, options);
    }
}
