// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.ec2;

import io.pulumi.aws.Utilities;
import io.pulumi.aws.ec2.DefaultSecurityGroupArgs;
import io.pulumi.aws.ec2.inputs.DefaultSecurityGroupState;
import io.pulumi.aws.ec2.outputs.DefaultSecurityGroupEgress;
import io.pulumi.aws.ec2.outputs.DefaultSecurityGroupIngress;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.Export;
import io.pulumi.core.annotations.ResourceType;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Map;
import javax.annotation.Nullable;

/**
 * Provides a resource to manage a default security group. This resource can manage the default security group of the default or a non-default VPC.
 * 
 * > **NOTE:** This is an advanced resource with special caveats. Please read this document in its entirety before using this resource. The `aws.ec2.DefaultSecurityGroup` resource behaves differently from normal resources. This provider does not _create_ this resource but instead attempts to "adopt" it into management.
 * 
 * For EC2 Classic accounts, each region comes with a default security group. Additionally, each VPC created in AWS comes with a default security group that can be managed but not destroyed.
 * 
 * When the provider first adopts the default security group, it **immediately removes all ingress and egress rules in the Security Group**. It then creates any rules specified in the configuration. This way only the rules specified in the configuration are created.
 * 
 * This resource treats its inline rules as absolute; only the rules defined inline are created, and any additions/removals external to this resource will result in diff shown. For these reasons, this resource is incompatible with the `aws.ec2.SecurityGroupRule` resource.
 * 
 * For more information about default security groups, see the AWS documentation on [Default Security Groups][aws-default-security-groups]. To manage normal security groups, see the `aws.ec2.SecurityGroup` resource.
 * 
 * ## Example Usage
 * ### Removing `aws.ec2.DefaultSecurityGroup` From Your Configuration
 * 
 * Removing this resource from your configuration will remove it from your statefile and management, but will not destroy the Security Group. All ingress or egress rules will be left as they are at the time of removal. You can resume managing them via the AWS Console.
 * 
 * ## Import
 * 
 * Security Groups can be imported using the `security group id`, e.g.,
 * 
 * ```sh
 *  $ pulumi import aws:ec2/defaultSecurityGroup:DefaultSecurityGroup default_sg sg-903004f8
 * ```
 * 
 */
@ResourceType(type="aws:ec2/defaultSecurityGroup:DefaultSecurityGroup")
public class DefaultSecurityGroup extends io.pulumi.resources.CustomResource {
    /**
     * ARN of the security group.
     * 
     */
    @Export(name="arn", type=String.class, parameters={})
    private Output<String> arn;

    /**
     * @return ARN of the security group.
     * 
     */
    public Output<String> getArn() {
        return this.arn;
    }
    /**
     * Description of this rule.
     * 
     */
    @Export(name="description", type=String.class, parameters={})
    private Output<String> description;

    /**
     * @return Description of this rule.
     * 
     */
    public Output<String> getDescription() {
        return this.description;
    }
    /**
     * Configuration block. Detailed below.
     * 
     */
    @Export(name="egress", type=List.class, parameters={DefaultSecurityGroupEgress.class})
    private Output<List<DefaultSecurityGroupEgress>> egress;

    /**
     * @return Configuration block. Detailed below.
     * 
     */
    public Output<List<DefaultSecurityGroupEgress>> getEgress() {
        return this.egress;
    }
    /**
     * Configuration block. Detailed below.
     * 
     */
    @Export(name="ingress", type=List.class, parameters={DefaultSecurityGroupIngress.class})
    private Output<List<DefaultSecurityGroupIngress>> ingress;

    /**
     * @return Configuration block. Detailed below.
     * 
     */
    public Output<List<DefaultSecurityGroupIngress>> getIngress() {
        return this.ingress;
    }
    /**
     * Name of the security group.
     * 
     */
    @Export(name="name", type=String.class, parameters={})
    private Output<String> name;

    /**
     * @return Name of the security group.
     * 
     */
    public Output<String> getName() {
        return this.name;
    }
    /**
     * Owner ID.
     * 
     */
    @Export(name="ownerId", type=String.class, parameters={})
    private Output<String> ownerId;

    /**
     * @return Owner ID.
     * 
     */
    public Output<String> getOwnerId() {
        return this.ownerId;
    }
    @Export(name="revokeRulesOnDelete", type=Boolean.class, parameters={})
    private Output</* @Nullable */ Boolean> revokeRulesOnDelete;

    public Output</* @Nullable */ Boolean> getRevokeRulesOnDelete() {
        return this.revokeRulesOnDelete;
    }
    /**
     * Map of tags to assign to the resource. .If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
     * 
     */
    @Export(name="tags", type=Map.class, parameters={String.class, String.class})
    private Output</* @Nullable */ Map<String,String>> tags;

    /**
     * @return Map of tags to assign to the resource. .If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
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
     * VPC ID. **Note that changing the `vpc_id` will _not_ restore any default security group rules that were modified, added, or removed.** It will be left in its current state.
     * 
     */
    @Export(name="vpcId", type=String.class, parameters={})
    private Output<String> vpcId;

    /**
     * @return VPC ID. **Note that changing the `vpc_id` will _not_ restore any default security group rules that were modified, added, or removed.** It will be left in its current state.
     * 
     */
    public Output<String> getVpcId() {
        return this.vpcId;
    }

    public interface BuilderApplicator {
        public void apply(@Nullable DefaultSecurityGroupArgs.Builder a);
    }
    private static io.pulumi.aws.ec2.DefaultSecurityGroupArgs buildArgs(BuilderApplicator argsBuilder) {
        final var builder = io.pulumi.aws.ec2.DefaultSecurityGroupArgs.builder();
        argsBuilder.apply(builder);
        return builder.build();
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param argsBuilder A function that configures a passed builder.
     */
    public DefaultSecurityGroup(String name, BuilderApplicator argsBuilder) {
        this(name, buildArgs(argsBuilder), null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public DefaultSecurityGroup(String name) {
        this(name, DefaultSecurityGroupArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public DefaultSecurityGroup(String name, @Nullable DefaultSecurityGroupArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public DefaultSecurityGroup(String name, @Nullable DefaultSecurityGroupArgs args, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("aws:ec2/defaultSecurityGroup:DefaultSecurityGroup", name, args == null ? DefaultSecurityGroupArgs.Empty : args, makeResourceOptions(options, Output.empty()));
    }

    private DefaultSecurityGroup(String name, Output<String> id, @Nullable DefaultSecurityGroupState state, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("aws:ec2/defaultSecurityGroup:DefaultSecurityGroup", name, state, makeResourceOptions(options, id));
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
    public static DefaultSecurityGroup get(String name, Output<String> id, @Nullable DefaultSecurityGroupState state, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        return new DefaultSecurityGroup(name, id, state, options);
    }
}
