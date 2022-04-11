// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.gamelift;

import io.pulumi.aws.Utilities;
import io.pulumi.aws.gamelift.AliasArgs;
import io.pulumi.aws.gamelift.inputs.AliasState;
import io.pulumi.aws.gamelift.outputs.AliasRoutingStrategy;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.Export;
import io.pulumi.core.annotations.ResourceType;
import io.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.Map;
import javax.annotation.Nullable;

/**
 * Provides a Gamelift Alias resource.
 * 
 * ## Example Usage
 * 
 * ## Import
 * 
 * Gamelift Aliases can be imported using the ID, e.g.,
 * 
 * ```sh
 *  $ pulumi import aws:gamelift/alias:Alias example <alias-id>
 * ```
 * 
 */
@ResourceType(type="aws:gamelift/alias:Alias")
public class Alias extends io.pulumi.resources.CustomResource {
    /**
     * Alias ARN.
     * 
     */
    @Export(name="arn", type=String.class, parameters={})
    private Output<String> arn;

    /**
     * @return Alias ARN.
     * 
     */
    public Output<String> getArn() {
        return this.arn;
    }
    /**
     * Description of the alias.
     * 
     */
    @Export(name="description", type=String.class, parameters={})
    private Output</* @Nullable */ String> description;

    /**
     * @return Description of the alias.
     * 
     */
    public Output</* @Nullable */ String> getDescription() {
        return this.description;
    }
    /**
     * Name of the alias.
     * 
     */
    @Export(name="name", type=String.class, parameters={})
    private Output<String> name;

    /**
     * @return Name of the alias.
     * 
     */
    public Output<String> getName() {
        return this.name;
    }
    /**
     * Specifies the fleet and/or routing type to use for the alias.
     * 
     */
    @Export(name="routingStrategy", type=AliasRoutingStrategy.class, parameters={})
    private Output<AliasRoutingStrategy> routingStrategy;

    /**
     * @return Specifies the fleet and/or routing type to use for the alias.
     * 
     */
    public Output<AliasRoutingStrategy> getRoutingStrategy() {
        return this.routingStrategy;
    }
    /**
     * Key-value map of resource tags. .If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
     * 
     */
    @Export(name="tags", type=Map.class, parameters={String.class, String.class})
    private Output</* @Nullable */ Map<String,String>> tags;

    /**
     * @return Key-value map of resource tags. .If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
     * 
     */
    public Output</* @Nullable */ Map<String,String>> getTags() {
        return this.tags;
    }
    /**
     * A map of tags assigned to the resource, including those inherited from the provider .
     * 
     */
    @Export(name="tagsAll", type=Map.class, parameters={String.class, String.class})
    private Output<Map<String,String>> tagsAll;

    /**
     * @return A map of tags assigned to the resource, including those inherited from the provider .
     * 
     */
    public Output<Map<String,String>> getTagsAll() {
        return this.tagsAll;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public Alias(String name) {
        this(name, AliasArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public Alias(String name, AliasArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public Alias(String name, AliasArgs args, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("aws:gamelift/alias:Alias", name, args == null ? AliasArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private Alias(String name, Output<String> id, @Nullable AliasState state, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("aws:gamelift/alias:Alias", name, state, makeResourceOptions(options, id));
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
     * @param state
     * @param options Optional settings to control the behavior of the CustomResource.
     */
    public static Alias get(String name, Output<String> id, @Nullable AliasState state, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        return new Alias(name, id, state, options);
    }
}
