// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.neptune;

import io.pulumi.aws.Utilities;
import io.pulumi.aws.neptune.ClusterParameterGroupArgs;
import io.pulumi.aws.neptune.inputs.ClusterParameterGroupState;
import io.pulumi.aws.neptune.outputs.ClusterParameterGroupParameter;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.Export;
import io.pulumi.core.annotations.ResourceType;
import java.lang.String;
import java.util.List;
import java.util.Map;
import javax.annotation.Nullable;

/**
 * Manages a Neptune Cluster Parameter Group
 * 
 * ## Example Usage
 * 
 * ## Import
 * 
 * Neptune Cluster Parameter Groups can be imported using the `name`, e.g.,
 * 
 * ```sh
 *  $ pulumi import aws:neptune/clusterParameterGroup:ClusterParameterGroup cluster_pg production-pg-1
 * ```
 * 
 */
@ResourceType(type="aws:neptune/clusterParameterGroup:ClusterParameterGroup")
public class ClusterParameterGroup extends io.pulumi.resources.CustomResource {
    /**
     * The ARN of the neptune cluster parameter group.
     * 
     */
    @Export(name="arn", type=String.class, parameters={})
    private Output<String> arn;

    /**
     * @return The ARN of the neptune cluster parameter group.
     * 
     */
    public Output<String> getArn() {
        return this.arn;
    }
    /**
     * The description of the neptune cluster parameter group. Defaults to "Managed by Pulumi".
     * 
     */
    @Export(name="description", type=String.class, parameters={})
    private Output</* @Nullable */ String> description;

    /**
     * @return The description of the neptune cluster parameter group. Defaults to "Managed by Pulumi".
     * 
     */
    public Output</* @Nullable */ String> getDescription() {
        return this.description;
    }
    /**
     * The family of the neptune cluster parameter group.
     * 
     */
    @Export(name="family", type=String.class, parameters={})
    private Output<String> family;

    /**
     * @return The family of the neptune cluster parameter group.
     * 
     */
    public Output<String> getFamily() {
        return this.family;
    }
    /**
     * The name of the neptune parameter.
     * 
     */
    @Export(name="name", type=String.class, parameters={})
    private Output<String> name;

    /**
     * @return The name of the neptune parameter.
     * 
     */
    public Output<String> getName() {
        return this.name;
    }
    /**
     * Creates a unique name beginning with the specified prefix. Conflicts with `name`.
     * 
     */
    @Export(name="namePrefix", type=String.class, parameters={})
    private Output<String> namePrefix;

    /**
     * @return Creates a unique name beginning with the specified prefix. Conflicts with `name`.
     * 
     */
    public Output<String> getNamePrefix() {
        return this.namePrefix;
    }
    /**
     * A list of neptune parameters to apply.
     * 
     */
    @Export(name="parameters", type=List.class, parameters={ClusterParameterGroupParameter.class})
    private Output</* @Nullable */ List<ClusterParameterGroupParameter>> parameters;

    /**
     * @return A list of neptune parameters to apply.
     * 
     */
    public Output</* @Nullable */ List<ClusterParameterGroupParameter>> getParameters() {
        return this.parameters;
    }
    /**
     * A map of tags to assign to the resource. .If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
     * 
     */
    @Export(name="tags", type=Map.class, parameters={String.class, String.class})
    private Output</* @Nullable */ Map<String,String>> tags;

    /**
     * @return A map of tags to assign to the resource. .If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
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
    public ClusterParameterGroup(String name) {
        this(name, ClusterParameterGroupArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public ClusterParameterGroup(String name, ClusterParameterGroupArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public ClusterParameterGroup(String name, ClusterParameterGroupArgs args, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("aws:neptune/clusterParameterGroup:ClusterParameterGroup", name, args == null ? ClusterParameterGroupArgs.Empty : args, makeResourceOptions(options, Output.empty()));
    }

    private ClusterParameterGroup(String name, Output<String> id, @Nullable ClusterParameterGroupState state, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("aws:neptune/clusterParameterGroup:ClusterParameterGroup", name, state, makeResourceOptions(options, id));
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
    public static ClusterParameterGroup get(String name, Output<String> id, @Nullable ClusterParameterGroupState state, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        return new ClusterParameterGroup(name, id, state, options);
    }
}