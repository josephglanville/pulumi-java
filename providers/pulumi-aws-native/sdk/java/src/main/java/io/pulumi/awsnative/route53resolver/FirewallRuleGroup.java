// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.route53resolver;

import io.pulumi.awsnative.Utilities;
import io.pulumi.awsnative.route53resolver.FirewallRuleGroupArgs;
import io.pulumi.awsnative.route53resolver.enums.FirewallRuleGroupShareStatus;
import io.pulumi.awsnative.route53resolver.enums.FirewallRuleGroupStatus;
import io.pulumi.awsnative.route53resolver.outputs.FirewallRuleGroupFirewallRule;
import io.pulumi.awsnative.route53resolver.outputs.FirewallRuleGroupTag;
import io.pulumi.core.Input;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.OutputExport;
import io.pulumi.core.annotations.ResourceType;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import javax.annotation.Nullable;

/**
 * Resource schema for AWS::Route53Resolver::FirewallRuleGroup.
 * 
 */
@ResourceType(type="aws-native:route53resolver:FirewallRuleGroup")
public class FirewallRuleGroup extends io.pulumi.resources.CustomResource {
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
     * FirewallRules
     * 
     */
    @OutputExport(name="firewallRules", type=List.class, parameters={FirewallRuleGroupFirewallRule.class})
    private Output</* @Nullable */ List<FirewallRuleGroupFirewallRule>> firewallRules;

    /**
     * @return FirewallRules
     * 
     */
    public Output</* @Nullable */ List<FirewallRuleGroupFirewallRule>> getFirewallRules() {
        return this.firewallRules;
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
     * FirewallRuleGroupName
     * 
     */
    @OutputExport(name="name", type=String.class, parameters={})
    private Output</* @Nullable */ String> name;

    /**
     * @return FirewallRuleGroupName
     * 
     */
    public Output</* @Nullable */ String> getName() {
        return this.name;
    }
    /**
     * AccountId
     * 
     */
    @OutputExport(name="ownerId", type=String.class, parameters={})
    private Output<String> ownerId;

    /**
     * @return AccountId
     * 
     */
    public Output<String> getOwnerId() {
        return this.ownerId;
    }
    /**
     * Count
     * 
     */
    @OutputExport(name="ruleCount", type=Integer.class, parameters={})
    private Output<Integer> ruleCount;

    /**
     * @return Count
     * 
     */
    public Output<Integer> getRuleCount() {
        return this.ruleCount;
    }
    /**
     * ShareStatus, possible values are NOT_SHARED, SHARED_WITH_ME, SHARED_BY_ME.
     * 
     */
    @OutputExport(name="shareStatus", type=FirewallRuleGroupShareStatus.class, parameters={})
    private Output<FirewallRuleGroupShareStatus> shareStatus;

    /**
     * @return ShareStatus, possible values are NOT_SHARED, SHARED_WITH_ME, SHARED_BY_ME.
     * 
     */
    public Output<FirewallRuleGroupShareStatus> getShareStatus() {
        return this.shareStatus;
    }
    /**
     * ResolverFirewallRuleGroupAssociation, possible values are COMPLETE, DELETING, UPDATING, and INACTIVE_OWNER_ACCOUNT_CLOSED.
     * 
     */
    @OutputExport(name="status", type=FirewallRuleGroupStatus.class, parameters={})
    private Output<FirewallRuleGroupStatus> status;

    /**
     * @return ResolverFirewallRuleGroupAssociation, possible values are COMPLETE, DELETING, UPDATING, and INACTIVE_OWNER_ACCOUNT_CLOSED.
     * 
     */
    public Output<FirewallRuleGroupStatus> getStatus() {
        return this.status;
    }
    /**
     * FirewallRuleGroupStatus
     * 
     */
    @OutputExport(name="statusMessage", type=String.class, parameters={})
    private Output<String> statusMessage;

    /**
     * @return FirewallRuleGroupStatus
     * 
     */
    public Output<String> getStatusMessage() {
        return this.statusMessage;
    }
    /**
     * Tags
     * 
     */
    @OutputExport(name="tags", type=List.class, parameters={FirewallRuleGroupTag.class})
    private Output</* @Nullable */ List<FirewallRuleGroupTag>> tags;

    /**
     * @return Tags
     * 
     */
    public Output</* @Nullable */ List<FirewallRuleGroupTag>> getTags() {
        return this.tags;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public FirewallRuleGroup(String name) {
        this(name, FirewallRuleGroupArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public FirewallRuleGroup(String name, @Nullable FirewallRuleGroupArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public FirewallRuleGroup(String name, @Nullable FirewallRuleGroupArgs args, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("aws-native:route53resolver:FirewallRuleGroup", name, args == null ? FirewallRuleGroupArgs.Empty : args, makeResourceOptions(options, Input.empty()));
    }

    private FirewallRuleGroup(String name, Input<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("aws-native:route53resolver:FirewallRuleGroup", name, null, makeResourceOptions(options, id));
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
    public static FirewallRuleGroup get(String name, Input<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        return new FirewallRuleGroup(name, id, options);
    }
}
