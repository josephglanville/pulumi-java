// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.route53resolver;

import io.pulumi.awsnative.Utilities;
import io.pulumi.awsnative.route53resolver.FirewallRuleGroupAssociationArgs;
import io.pulumi.awsnative.route53resolver.enums.FirewallRuleGroupAssociationMutationProtection;
import io.pulumi.awsnative.route53resolver.enums.FirewallRuleGroupAssociationStatus;
import io.pulumi.awsnative.route53resolver.outputs.FirewallRuleGroupAssociationTag;
import io.pulumi.core.Input;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.OutputExport;
import io.pulumi.core.annotations.ResourceType;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import javax.annotation.Nullable;

/**
 * Resource schema for AWS::Route53Resolver::FirewallRuleGroupAssociation.
 * 
 */
@ResourceType(type="aws-native:route53resolver:FirewallRuleGroupAssociation")
public class FirewallRuleGroupAssociation extends io.pulumi.resources.CustomResource {
    /**
     * Arn
     * 
     */
    @OutputExport(name="arn", type=String.class, parameters={})
    private Output<String> arn;

    /**
     * @return Arn
     * 
     */
    public Output<String> getArn() {
        return this.arn;
    }
    /**
     * Rfc3339TimeString
     * 
     */
    @OutputExport(name="creationTime", type=String.class, parameters={})
    private Output<String> creationTime;

    /**
     * @return Rfc3339TimeString
     * 
     */
    public Output<String> getCreationTime() {
        return this.creationTime;
    }
    /**
     * The id of the creator request.
     * 
     */
    @OutputExport(name="creatorRequestId", type=String.class, parameters={})
    private Output<String> creatorRequestId;

    /**
     * @return The id of the creator request.
     * 
     */
    public Output<String> getCreatorRequestId() {
        return this.creatorRequestId;
    }
    /**
     * FirewallRuleGroupId
     * 
     */
    @OutputExport(name="firewallRuleGroupId", type=String.class, parameters={})
    private Output<String> firewallRuleGroupId;

    /**
     * @return FirewallRuleGroupId
     * 
     */
    public Output<String> getFirewallRuleGroupId() {
        return this.firewallRuleGroupId;
    }
    /**
     * ServicePrincipal
     * 
     */
    @OutputExport(name="managedOwnerName", type=String.class, parameters={})
    private Output<String> managedOwnerName;

    /**
     * @return ServicePrincipal
     * 
     */
    public Output<String> getManagedOwnerName() {
        return this.managedOwnerName;
    }
    /**
     * Rfc3339TimeString
     * 
     */
    @OutputExport(name="modificationTime", type=String.class, parameters={})
    private Output<String> modificationTime;

    /**
     * @return Rfc3339TimeString
     * 
     */
    public Output<String> getModificationTime() {
        return this.modificationTime;
    }
    /**
     * MutationProtectionStatus
     * 
     */
    @OutputExport(name="mutationProtection", type=FirewallRuleGroupAssociationMutationProtection.class, parameters={})
    private Output</* @Nullable */ FirewallRuleGroupAssociationMutationProtection> mutationProtection;

    /**
     * @return MutationProtectionStatus
     * 
     */
    public Output</* @Nullable */ FirewallRuleGroupAssociationMutationProtection> getMutationProtection() {
        return this.mutationProtection;
    }
    /**
     * FirewallRuleGroupAssociationName
     * 
     */
    @OutputExport(name="name", type=String.class, parameters={})
    private Output</* @Nullable */ String> name;

    /**
     * @return FirewallRuleGroupAssociationName
     * 
     */
    public Output</* @Nullable */ String> getName() {
        return this.name;
    }
    /**
     * Priority
     * 
     */
    @OutputExport(name="priority", type=Integer.class, parameters={})
    private Output<Integer> priority;

    /**
     * @return Priority
     * 
     */
    public Output<Integer> getPriority() {
        return this.priority;
    }
    /**
     * ResolverFirewallRuleGroupAssociation, possible values are COMPLETE, DELETING, UPDATING, and INACTIVE_OWNER_ACCOUNT_CLOSED.
     * 
     */
    @OutputExport(name="status", type=FirewallRuleGroupAssociationStatus.class, parameters={})
    private Output<FirewallRuleGroupAssociationStatus> status;

    /**
     * @return ResolverFirewallRuleGroupAssociation, possible values are COMPLETE, DELETING, UPDATING, and INACTIVE_OWNER_ACCOUNT_CLOSED.
     * 
     */
    public Output<FirewallRuleGroupAssociationStatus> getStatus() {
        return this.status;
    }
    /**
     * FirewallDomainListAssociationStatus
     * 
     */
    @OutputExport(name="statusMessage", type=String.class, parameters={})
    private Output<String> statusMessage;

    /**
     * @return FirewallDomainListAssociationStatus
     * 
     */
    public Output<String> getStatusMessage() {
        return this.statusMessage;
    }
    /**
     * Tags
     * 
     */
    @OutputExport(name="tags", type=List.class, parameters={FirewallRuleGroupAssociationTag.class})
    private Output</* @Nullable */ List<FirewallRuleGroupAssociationTag>> tags;

    /**
     * @return Tags
     * 
     */
    public Output</* @Nullable */ List<FirewallRuleGroupAssociationTag>> getTags() {
        return this.tags;
    }
    /**
     * VpcId
     * 
     */
    @OutputExport(name="vpcId", type=String.class, parameters={})
    private Output<String> vpcId;

    /**
     * @return VpcId
     * 
     */
    public Output<String> getVpcId() {
        return this.vpcId;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public FirewallRuleGroupAssociation(String name) {
        this(name, FirewallRuleGroupAssociationArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public FirewallRuleGroupAssociation(String name, FirewallRuleGroupAssociationArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public FirewallRuleGroupAssociation(String name, FirewallRuleGroupAssociationArgs args, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("aws-native:route53resolver:FirewallRuleGroupAssociation", name, args == null ? FirewallRuleGroupAssociationArgs.Empty : args, makeResourceOptions(options, Input.empty()));
    }

    private FirewallRuleGroupAssociation(String name, Input<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("aws-native:route53resolver:FirewallRuleGroupAssociation", name, null, makeResourceOptions(options, id));
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
    public static FirewallRuleGroupAssociation get(String name, Input<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        return new FirewallRuleGroupAssociation(name, id, options);
    }
}
