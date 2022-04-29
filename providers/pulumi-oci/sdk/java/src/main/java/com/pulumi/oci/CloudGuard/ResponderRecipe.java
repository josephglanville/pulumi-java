// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.oci.CloudGuard;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import com.pulumi.oci.CloudGuard.ResponderRecipeArgs;
import com.pulumi.oci.CloudGuard.inputs.ResponderRecipeState;
import com.pulumi.oci.CloudGuard.outputs.ResponderRecipeEffectiveResponderRule;
import com.pulumi.oci.CloudGuard.outputs.ResponderRecipeResponderRule;
import com.pulumi.oci.Utilities;
import java.lang.Object;
import java.lang.String;
import java.util.List;
import java.util.Map;
import javax.annotation.Nullable;

/**
 * This resource provides the Responder Recipe resource in Oracle Cloud Infrastructure Cloud Guard service.
 * 
 * Create a ResponderRecipe.
 * 
 * ## Import
 * 
 * ResponderRecipes can be imported using the `id`, e.g.
 * 
 * ```sh
 *  $ pulumi import oci:CloudGuard/responderRecipe:ResponderRecipe test_responder_recipe &#34;id&#34;
 * ```
 * 
 */
@ResourceType(type="oci:CloudGuard/responderRecipe:ResponderRecipe")
public class ResponderRecipe extends com.pulumi.resources.CustomResource {
    /**
     * (Updatable) Compartment Identifier
     * 
     */
    @Export(name="compartmentId", type=String.class, parameters={})
    private Output<String> compartmentId;

    /**
     * @return (Updatable) Compartment Identifier
     * 
     */
    public Output<String> compartmentId() {
        return this.compartmentId;
    }
    /**
     * (Updatable) Defined tags for this resource. Each key is predefined and scoped to a namespace. Example: `{&#34;foo-namespace.bar-key&#34;: &#34;value&#34;}`
     * 
     */
    @Export(name="definedTags", type=Map.class, parameters={String.class, Object.class})
    private Output<Map<String,Object>> definedTags;

    /**
     * @return (Updatable) Defined tags for this resource. Each key is predefined and scoped to a namespace. Example: `{&#34;foo-namespace.bar-key&#34;: &#34;value&#34;}`
     * 
     */
    public Output<Map<String,Object>> definedTags() {
        return this.definedTags;
    }
    /**
     * (Updatable) ResponderRecipe Description
     * 
     */
    @Export(name="description", type=String.class, parameters={})
    private Output<String> description;

    /**
     * @return (Updatable) ResponderRecipe Description
     * 
     */
    public Output<String> description() {
        return this.description;
    }
    /**
     * (Updatable) ResponderRecipe Display Name
     * 
     */
    @Export(name="displayName", type=String.class, parameters={})
    private Output<String> displayName;

    /**
     * @return (Updatable) ResponderRecipe Display Name
     * 
     */
    public Output<String> displayName() {
        return this.displayName;
    }
    /**
     * List of responder rules associated with the recipe
     * 
     */
    @Export(name="effectiveResponderRules", type=List.class, parameters={ResponderRecipeEffectiveResponderRule.class})
    private Output<List<ResponderRecipeEffectiveResponderRule>> effectiveResponderRules;

    /**
     * @return List of responder rules associated with the recipe
     * 
     */
    public Output<List<ResponderRecipeEffectiveResponderRule>> effectiveResponderRules() {
        return this.effectiveResponderRules;
    }
    /**
     * (Updatable) Simple key-value pair that is applied without any predefined name, type or scope. Exists for cross-compatibility only. Example: `{&#34;bar-key&#34;: &#34;value&#34;}`
     * 
     */
    @Export(name="freeformTags", type=Map.class, parameters={String.class, Object.class})
    private Output<Map<String,Object>> freeformTags;

    /**
     * @return (Updatable) Simple key-value pair that is applied without any predefined name, type or scope. Exists for cross-compatibility only. Example: `{&#34;bar-key&#34;: &#34;value&#34;}`
     * 
     */
    public Output<Map<String,Object>> freeformTags() {
        return this.freeformTags;
    }
    /**
     * A message describing the current state in more detail. For example, can be used to provide actionable information for a resource in Failed state.
     * 
     */
    @Export(name="lifecycleDetails", type=String.class, parameters={})
    private Output<String> lifecycleDetails;

    /**
     * @return A message describing the current state in more detail. For example, can be used to provide actionable information for a resource in Failed state.
     * 
     */
    public Output<String> lifecycleDetails() {
        return this.lifecycleDetails;
    }
    /**
     * Owner of ResponderRecipe
     * 
     */
    @Export(name="owner", type=String.class, parameters={})
    private Output<String> owner;

    /**
     * @return Owner of ResponderRecipe
     * 
     */
    public Output<String> owner() {
        return this.owner;
    }
    /**
     * (Updatable) Responder Rules to override from source responder recipe
     * 
     */
    @Export(name="responderRules", type=List.class, parameters={ResponderRecipeResponderRule.class})
    private Output<List<ResponderRecipeResponderRule>> responderRules;

    /**
     * @return (Updatable) Responder Rules to override from source responder recipe
     * 
     */
    public Output<List<ResponderRecipeResponderRule>> responderRules() {
        return this.responderRules;
    }
    /**
     * The id of the source responder recipe.
     * 
     */
    @Export(name="sourceResponderRecipeId", type=String.class, parameters={})
    private Output<String> sourceResponderRecipeId;

    /**
     * @return The id of the source responder recipe.
     * 
     */
    public Output<String> sourceResponderRecipeId() {
        return this.sourceResponderRecipeId;
    }
    /**
     * The current state of the Example.
     * 
     */
    @Export(name="state", type=String.class, parameters={})
    private Output<String> state;

    /**
     * @return The current state of the Example.
     * 
     */
    public Output<String> state() {
        return this.state;
    }
    /**
     * System tags for this resource. Each key is predefined and scoped to a namespace. For more information, see [Resource Tags](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/resourcetags.htm). System tags can be viewed by users, but can only be created by the system.  Example: `{&#34;orcl-cloud.free-tier-retained&#34;: &#34;true&#34;}`
     * 
     */
    @Export(name="systemTags", type=Map.class, parameters={String.class, Object.class})
    private Output<Map<String,Object>> systemTags;

    /**
     * @return System tags for this resource. Each key is predefined and scoped to a namespace. For more information, see [Resource Tags](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/resourcetags.htm). System tags can be viewed by users, but can only be created by the system.  Example: `{&#34;orcl-cloud.free-tier-retained&#34;: &#34;true&#34;}`
     * 
     */
    public Output<Map<String,Object>> systemTags() {
        return this.systemTags;
    }
    /**
     * The date and time the responder recipe was created. Format defined by RFC3339.
     * 
     */
    @Export(name="timeCreated", type=String.class, parameters={})
    private Output<String> timeCreated;

    /**
     * @return The date and time the responder recipe was created. Format defined by RFC3339.
     * 
     */
    public Output<String> timeCreated() {
        return this.timeCreated;
    }
    /**
     * The date and time the responder recipe was updated. Format defined by RFC3339.
     * 
     */
    @Export(name="timeUpdated", type=String.class, parameters={})
    private Output<String> timeUpdated;

    /**
     * @return The date and time the responder recipe was updated. Format defined by RFC3339.
     * 
     */
    public Output<String> timeUpdated() {
        return this.timeUpdated;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public ResponderRecipe(String name) {
        this(name, ResponderRecipeArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public ResponderRecipe(String name, ResponderRecipeArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public ResponderRecipe(String name, ResponderRecipeArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("oci:CloudGuard/responderRecipe:ResponderRecipe", name, args == null ? ResponderRecipeArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private ResponderRecipe(String name, Output<String> id, @Nullable ResponderRecipeState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("oci:CloudGuard/responderRecipe:ResponderRecipe", name, state, makeResourceOptions(options, id));
    }

    private static com.pulumi.resources.CustomResourceOptions makeResourceOptions(@Nullable com.pulumi.resources.CustomResourceOptions options, @Nullable Output<String> id) {
        var defaultOptions = com.pulumi.resources.CustomResourceOptions.builder()
            .version(Utilities.getVersion())
            .build();
        return com.pulumi.resources.CustomResourceOptions.merge(defaultOptions, options, id);
    }

    /**
     * Get an existing Host resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state
     * @param options Optional settings to control the behavior of the CustomResource.
     */
    public static ResponderRecipe get(String name, Output<String> id, @Nullable ResponderRecipeState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new ResponderRecipe(name, id, state, options);
    }
}
