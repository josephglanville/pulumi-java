// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.athena;

import io.pulumi.aws.Utilities;
import io.pulumi.aws.athena.WorkgroupArgs;
import io.pulumi.aws.athena.inputs.WorkgroupState;
import io.pulumi.aws.athena.outputs.WorkgroupConfiguration;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.Export;
import io.pulumi.core.annotations.ResourceType;
import io.pulumi.core.internal.Codegen;
import java.lang.Boolean;
import java.lang.String;
import java.util.Map;
import javax.annotation.Nullable;

/**
 * Provides an Athena Workgroup.
 * 
 * ## Example Usage
 * 
 * ## Import
 * 
 * Athena Workgroups can be imported using their name, e.g.,
 * 
 * ```sh
 *  $ pulumi import aws:athena/workgroup:Workgroup example example
 * ```
 * 
 */
@ResourceType(type="aws:athena/workgroup:Workgroup")
public class Workgroup extends io.pulumi.resources.CustomResource {
    /**
     * Amazon Resource Name (ARN) of the workgroup
     * 
     */
    @Export(name="arn", type=String.class, parameters={})
    private Output<String> arn;

    /**
     * @return Amazon Resource Name (ARN) of the workgroup
     * 
     */
    public Output<String> getArn() {
        return this.arn;
    }
    /**
     * Configuration block with various settings for the workgroup. Documented below.
     * 
     */
    @Export(name="configuration", type=WorkgroupConfiguration.class, parameters={})
    private Output</* @Nullable */ WorkgroupConfiguration> configuration;

    /**
     * @return Configuration block with various settings for the workgroup. Documented below.
     * 
     */
    public Output</* @Nullable */ WorkgroupConfiguration> getConfiguration() {
        return this.configuration;
    }
    /**
     * Description of the workgroup.
     * 
     */
    @Export(name="description", type=String.class, parameters={})
    private Output</* @Nullable */ String> description;

    /**
     * @return Description of the workgroup.
     * 
     */
    public Output</* @Nullable */ String> getDescription() {
        return this.description;
    }
    /**
     * The option to delete the workgroup and its contents even if the workgroup contains any named queries.
     * 
     */
    @Export(name="forceDestroy", type=Boolean.class, parameters={})
    private Output</* @Nullable */ Boolean> forceDestroy;

    /**
     * @return The option to delete the workgroup and its contents even if the workgroup contains any named queries.
     * 
     */
    public Output</* @Nullable */ Boolean> getForceDestroy() {
        return this.forceDestroy;
    }
    /**
     * Name of the workgroup.
     * 
     */
    @Export(name="name", type=String.class, parameters={})
    private Output<String> name;

    /**
     * @return Name of the workgroup.
     * 
     */
    public Output<String> getName() {
        return this.name;
    }
    /**
     * State of the workgroup. Valid values are `DISABLED` or `ENABLED`. Defaults to `ENABLED`.
     * 
     */
    @Export(name="state", type=String.class, parameters={})
    private Output</* @Nullable */ String> state;

    /**
     * @return State of the workgroup. Valid values are `DISABLED` or `ENABLED`. Defaults to `ENABLED`.
     * 
     */
    public Output</* @Nullable */ String> getState() {
        return this.state;
    }
    /**
     * Key-value map of resource tags for the workgroup. .If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
     * 
     */
    @Export(name="tags", type=Map.class, parameters={String.class, String.class})
    private Output</* @Nullable */ Map<String,String>> tags;

    /**
     * @return Key-value map of resource tags for the workgroup. .If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
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
    public Workgroup(String name) {
        this(name, WorkgroupArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public Workgroup(String name, @Nullable WorkgroupArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public Workgroup(String name, @Nullable WorkgroupArgs args, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("aws:athena/workgroup:Workgroup", name, args == null ? WorkgroupArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private Workgroup(String name, Output<String> id, @Nullable WorkgroupState state, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("aws:athena/workgroup:Workgroup", name, state, makeResourceOptions(options, id));
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
    public static Workgroup get(String name, Output<String> id, @Nullable WorkgroupState state, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        return new Workgroup(name, id, state, options);
    }
}
