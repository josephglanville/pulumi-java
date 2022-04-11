// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.shield;

import io.pulumi.aws.Utilities;
import io.pulumi.aws.shield.ProtectionArgs;
import io.pulumi.aws.shield.inputs.ProtectionState;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.Export;
import io.pulumi.core.annotations.ResourceType;
import io.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.Map;
import javax.annotation.Nullable;

/**
 * Enables AWS Shield Advanced for a specific AWS resource.
 * The resource can be an Amazon CloudFront distribution, Elastic Load Balancing load balancer, AWS Global Accelerator accelerator, Elastic IP Address, or an Amazon Route 53 hosted zone.
 * 
 * ## Example Usage
 * 
 * ## Import
 * 
 * Shield protection resources can be imported by specifying their ID e.g.,
 * 
 * ```sh
 *  $ pulumi import aws:shield/protection:Protection example ff9592dc-22f3-4e88-afa1-7b29fde9669a
 * ```
 * 
 */
@ResourceType(type="aws:shield/protection:Protection")
public class Protection extends io.pulumi.resources.CustomResource {
    /**
     * The ARN of the Protection.
     * 
     */
    @Export(name="arn", type=String.class, parameters={})
    private Output<String> arn;

    /**
     * @return The ARN of the Protection.
     * 
     */
    public Output<String> getArn() {
        return this.arn;
    }
    /**
     * A friendly name for the Protection you are creating.
     * 
     */
    @Export(name="name", type=String.class, parameters={})
    private Output<String> name;

    /**
     * @return A friendly name for the Protection you are creating.
     * 
     */
    public Output<String> getName() {
        return this.name;
    }
    /**
     * The ARN (Amazon Resource Name) of the resource to be protected.
     * 
     */
    @Export(name="resourceArn", type=String.class, parameters={})
    private Output<String> resourceArn;

    /**
     * @return The ARN (Amazon Resource Name) of the resource to be protected.
     * 
     */
    public Output<String> getResourceArn() {
        return this.resourceArn;
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

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public Protection(String name) {
        this(name, ProtectionArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public Protection(String name, ProtectionArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public Protection(String name, ProtectionArgs args, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("aws:shield/protection:Protection", name, args == null ? ProtectionArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private Protection(String name, Output<String> id, @Nullable ProtectionState state, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("aws:shield/protection:Protection", name, state, makeResourceOptions(options, id));
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
    public static Protection get(String name, Output<String> id, @Nullable ProtectionState state, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        return new Protection(name, id, state, options);
    }
}
