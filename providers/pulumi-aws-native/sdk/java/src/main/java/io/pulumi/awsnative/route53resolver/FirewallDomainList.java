// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.route53resolver;

import io.pulumi.awsnative.Utilities;
import io.pulumi.awsnative.route53resolver.FirewallDomainListArgs;
import io.pulumi.awsnative.route53resolver.enums.FirewallDomainListStatus;
import io.pulumi.awsnative.route53resolver.outputs.FirewallDomainListTag;
import io.pulumi.core.Input;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.OutputExport;
import io.pulumi.core.annotations.ResourceType;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import javax.annotation.Nullable;

/**
 * Resource schema for AWS::Route53Resolver::FirewallDomainList.
 * 
 */
@ResourceType(type="aws-native:route53resolver:FirewallDomainList")
public class FirewallDomainList extends io.pulumi.resources.CustomResource {
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
     * Count
     * 
     */
    @OutputExport(name="domainCount", type=Integer.class, parameters={})
    private Output<Integer> domainCount;

    /**
     * @return Count
     * 
     */
    public Output<Integer> getDomainCount() {
        return this.domainCount;
    }
    /**
     * S3 URL to import domains from.
     * 
     */
    @OutputExport(name="domainFileUrl", type=String.class, parameters={})
    private Output</* @Nullable */ String> domainFileUrl;

    /**
     * @return S3 URL to import domains from.
     * 
     */
    public Output</* @Nullable */ String> getDomainFileUrl() {
        return this.domainFileUrl;
    }
    @OutputExport(name="domains", type=List.class, parameters={String.class})
    private Output</* @Nullable */ List<String>> domains;

    public Output</* @Nullable */ List<String>> getDomains() {
        return this.domains;
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
     * FirewallDomainListName
     * 
     */
    @OutputExport(name="name", type=String.class, parameters={})
    private Output</* @Nullable */ String> name;

    /**
     * @return FirewallDomainListName
     * 
     */
    public Output</* @Nullable */ String> getName() {
        return this.name;
    }
    /**
     * ResolverFirewallDomainList, possible values are COMPLETE, DELETING, UPDATING, COMPLETE_IMPORT_FAILED, IMPORTING, and INACTIVE_OWNER_ACCOUNT_CLOSED.
     * 
     */
    @OutputExport(name="status", type=FirewallDomainListStatus.class, parameters={})
    private Output<FirewallDomainListStatus> status;

    /**
     * @return ResolverFirewallDomainList, possible values are COMPLETE, DELETING, UPDATING, COMPLETE_IMPORT_FAILED, IMPORTING, and INACTIVE_OWNER_ACCOUNT_CLOSED.
     * 
     */
    public Output<FirewallDomainListStatus> getStatus() {
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
    @OutputExport(name="tags", type=List.class, parameters={FirewallDomainListTag.class})
    private Output</* @Nullable */ List<FirewallDomainListTag>> tags;

    /**
     * @return Tags
     * 
     */
    public Output</* @Nullable */ List<FirewallDomainListTag>> getTags() {
        return this.tags;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public FirewallDomainList(String name) {
        this(name, FirewallDomainListArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public FirewallDomainList(String name, @Nullable FirewallDomainListArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public FirewallDomainList(String name, @Nullable FirewallDomainListArgs args, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("aws-native:route53resolver:FirewallDomainList", name, args == null ? FirewallDomainListArgs.Empty : args, makeResourceOptions(options, Input.empty()));
    }

    private FirewallDomainList(String name, Input<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("aws-native:route53resolver:FirewallDomainList", name, null, makeResourceOptions(options, id));
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
    public static FirewallDomainList get(String name, Input<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        return new FirewallDomainList(name, id, options);
    }
}
