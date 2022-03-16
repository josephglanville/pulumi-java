// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.shield;

import io.pulumi.aws.Utilities;
import io.pulumi.aws.shield.ProtectionGroupArgs;
import io.pulumi.aws.shield.inputs.ProtectionGroupState;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.Export;
import io.pulumi.core.annotations.ResourceType;
import java.lang.String;
import java.util.List;
import java.util.Map;
import javax.annotation.Nullable;

/**
 * Creates a grouping of protected resources so they can be handled as a collective.
 * This resource grouping improves the accuracy of detection and reduces false positives. For more information see
 * [Managing AWS Shield Advanced protection groups](https://docs.aws.amazon.com/waf/latest/developerguide/manage-protection-group.html)
 * 
 * ## Example Usage
 * 
 * ## Import
 * 
 * Shield protection group resources can be imported by specifying their protection group id.
 * 
 * ```sh
 *  $ pulumi import aws:shield/protectionGroup:ProtectionGroup example example
 * ```
 * 
 */
@ResourceType(type="aws:shield/protectionGroup:ProtectionGroup")
public class ProtectionGroup extends io.pulumi.resources.CustomResource {
    /**
     * Defines how AWS Shield combines resource data for the group in order to detect, mitigate, and report events.
     * 
     */
    @Export(name="aggregation", type=String.class, parameters={})
    private Output<String> aggregation;

    /**
     * @return Defines how AWS Shield combines resource data for the group in order to detect, mitigate, and report events.
     * 
     */
    public Output<String> getAggregation() {
        return this.aggregation;
    }
    /**
     * The Amazon Resource Names (ARNs) of the resources to include in the protection group. You must set this when you set `pattern` to ARBITRARY and you must not set it for any other `pattern` setting.
     * 
     */
    @Export(name="members", type=List.class, parameters={String.class})
    private Output</* @Nullable */ List<String>> members;

    /**
     * @return The Amazon Resource Names (ARNs) of the resources to include in the protection group. You must set this when you set `pattern` to ARBITRARY and you must not set it for any other `pattern` setting.
     * 
     */
    public Output</* @Nullable */ List<String>> getMembers() {
        return this.members;
    }
    /**
     * The criteria to use to choose the protected resources for inclusion in the group.
     * 
     */
    @Export(name="pattern", type=String.class, parameters={})
    private Output<String> pattern;

    /**
     * @return The criteria to use to choose the protected resources for inclusion in the group.
     * 
     */
    public Output<String> getPattern() {
        return this.pattern;
    }
    /**
     * The ARN (Amazon Resource Name) of the protection group.
     * 
     */
    @Export(name="protectionGroupArn", type=String.class, parameters={})
    private Output<String> protectionGroupArn;

    /**
     * @return The ARN (Amazon Resource Name) of the protection group.
     * 
     */
    public Output<String> getProtectionGroupArn() {
        return this.protectionGroupArn;
    }
    /**
     * The name of the protection group.
     * 
     */
    @Export(name="protectionGroupId", type=String.class, parameters={})
    private Output<String> protectionGroupId;

    /**
     * @return The name of the protection group.
     * 
     */
    public Output<String> getProtectionGroupId() {
        return this.protectionGroupId;
    }
    /**
     * The resource type to include in the protection group. You must set this when you set `pattern` to BY_RESOURCE_TYPE and you must not set it for any other `pattern` setting.
     * 
     */
    @Export(name="resourceType", type=String.class, parameters={})
    private Output</* @Nullable */ String> resourceType;

    /**
     * @return The resource type to include in the protection group. You must set this when you set `pattern` to BY_RESOURCE_TYPE and you must not set it for any other `pattern` setting.
     * 
     */
    public Output</* @Nullable */ String> getPropResourceType() {
        return this.resourceType;
    }
    /**
     * Key-value map of resource tags. If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
     * 
     */
    @Export(name="tags", type=Map.class, parameters={String.class, String.class})
    private Output</* @Nullable */ Map<String,String>> tags;

    /**
     * @return Key-value map of resource tags. If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
     * 
     */
    public Output</* @Nullable */ Map<String,String>> getTags() {
        return this.tags;
    }
    /**
     * A map of tags assigned to the resource, including those inherited from the provider `default_tags` configuration block.
     * 
     */
    @Export(name="tagsAll", type=Map.class, parameters={String.class, String.class})
    private Output<Map<String,String>> tagsAll;

    /**
     * @return A map of tags assigned to the resource, including those inherited from the provider `default_tags` configuration block.
     * 
     */
    public Output<Map<String,String>> getTagsAll() {
        return this.tagsAll;
    }

    public interface BuilderApplicator {
        public void apply(ProtectionGroupArgs.Builder a);
    }
    private static io.pulumi.aws.shield.ProtectionGroupArgs buildArgs(BuilderApplicator argsBuilder) {
        final var builder = io.pulumi.aws.shield.ProtectionGroupArgs.builder();
        argsBuilder.apply(builder);
        return builder.build();
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param argsBuilder A function that configures a passed builder.
     */
    public ProtectionGroup(String name, BuilderApplicator argsBuilder) {
        this(name, buildArgs(argsBuilder), null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public ProtectionGroup(String name) {
        this(name, ProtectionGroupArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public ProtectionGroup(String name, ProtectionGroupArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public ProtectionGroup(String name, ProtectionGroupArgs args, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("aws:shield/protectionGroup:ProtectionGroup", name, args == null ? ProtectionGroupArgs.Empty : args, makeResourceOptions(options, Output.empty()));
    }

    private ProtectionGroup(String name, Output<String> id, @Nullable ProtectionGroupState state, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("aws:shield/protectionGroup:ProtectionGroup", name, state, makeResourceOptions(options, id));
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
    public static ProtectionGroup get(String name, Output<String> id, @Nullable ProtectionGroupState state, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        return new ProtectionGroup(name, id, state, options);
    }
}
