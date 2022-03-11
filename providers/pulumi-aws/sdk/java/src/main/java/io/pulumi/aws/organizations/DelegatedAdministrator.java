// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.organizations;

import io.pulumi.aws.Utilities;
import io.pulumi.aws.organizations.DelegatedAdministratorArgs;
import io.pulumi.aws.organizations.inputs.DelegatedAdministratorState;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.OutputExport;
import io.pulumi.core.annotations.ResourceType;
import java.lang.String;
import javax.annotation.Nullable;

/**
 * Provides a resource to manage an [AWS Organizations Delegated Administrator](https://docs.aws.amazon.com/organizations/latest/APIReference/API_RegisterDelegatedAdministrator.html).
 * 
 * ## Example Usage
 * 
 * ## Import
 * 
 * `aws_organizations_delegated_administrator` can be imported by using the account ID and its service principal, e.g.,
 * 
 * ```sh
 *  $ pulumi import aws:organizations/delegatedAdministrator:DelegatedAdministrator example 123456789012/config.amazonaws.com
 * ```
 * 
 */
@ResourceType(type="aws:organizations/delegatedAdministrator:DelegatedAdministrator")
public class DelegatedAdministrator extends io.pulumi.resources.CustomResource {
    /**
     * The account ID number of the member account in the organization to register as a delegated administrator.
     * 
     */
    @OutputExport(name="accountId", type=String.class, parameters={})
    private Output<String> accountId;

    /**
     * @return The account ID number of the member account in the organization to register as a delegated administrator.
     * 
     */
    public Output<String> getAccountId() {
        return this.accountId;
    }
    /**
     * The Amazon Resource Name (ARN) of the delegated administrator's account.
     * 
     */
    @OutputExport(name="arn", type=String.class, parameters={})
    private Output<String> arn;

    /**
     * @return The Amazon Resource Name (ARN) of the delegated administrator's account.
     * 
     */
    public Output<String> getArn() {
        return this.arn;
    }
    /**
     * The date when the account was made a delegated administrator.
     * 
     */
    @OutputExport(name="delegationEnabledDate", type=String.class, parameters={})
    private Output<String> delegationEnabledDate;

    /**
     * @return The date when the account was made a delegated administrator.
     * 
     */
    public Output<String> getDelegationEnabledDate() {
        return this.delegationEnabledDate;
    }
    /**
     * The email address that is associated with the delegated administrator's AWS account.
     * 
     */
    @OutputExport(name="email", type=String.class, parameters={})
    private Output<String> email;

    /**
     * @return The email address that is associated with the delegated administrator's AWS account.
     * 
     */
    public Output<String> getEmail() {
        return this.email;
    }
    /**
     * The method by which the delegated administrator's account joined the organization.
     * 
     */
    @OutputExport(name="joinedMethod", type=String.class, parameters={})
    private Output<String> joinedMethod;

    /**
     * @return The method by which the delegated administrator's account joined the organization.
     * 
     */
    public Output<String> getJoinedMethod() {
        return this.joinedMethod;
    }
    /**
     * The date when the delegated administrator's account became a part of the organization.
     * 
     */
    @OutputExport(name="joinedTimestamp", type=String.class, parameters={})
    private Output<String> joinedTimestamp;

    /**
     * @return The date when the delegated administrator's account became a part of the organization.
     * 
     */
    public Output<String> getJoinedTimestamp() {
        return this.joinedTimestamp;
    }
    /**
     * The friendly name of the delegated administrator's account.
     * 
     */
    @OutputExport(name="name", type=String.class, parameters={})
    private Output<String> name;

    /**
     * @return The friendly name of the delegated administrator's account.
     * 
     */
    public Output<String> getName() {
        return this.name;
    }
    /**
     * The service principal of the AWS service for which you want to make the member account a delegated administrator.
     * 
     */
    @OutputExport(name="servicePrincipal", type=String.class, parameters={})
    private Output<String> servicePrincipal;

    /**
     * @return The service principal of the AWS service for which you want to make the member account a delegated administrator.
     * 
     */
    public Output<String> getServicePrincipal() {
        return this.servicePrincipal;
    }
    /**
     * The status of the delegated administrator's account in the organization.
     * 
     */
    @OutputExport(name="status", type=String.class, parameters={})
    private Output<String> status;

    /**
     * @return The status of the delegated administrator's account in the organization.
     * 
     */
    public Output<String> getStatus() {
        return this.status;
    }

    public interface BuilderApplicator {
        public void apply(DelegatedAdministratorArgs.Builder a);
    }
    private static io.pulumi.aws.organizations.DelegatedAdministratorArgs buildArgs(BuilderApplicator argsBuilder) {
        final var builder = io.pulumi.aws.organizations.DelegatedAdministratorArgs.builder();
        argsBuilder.apply(builder);
        return builder.build();
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param argsBuilder A function that configures a passed builder.
     */
    public DelegatedAdministrator(String name, BuilderApplicator argsBuilder) {
        this(name, buildArgs(argsBuilder), null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public DelegatedAdministrator(String name) {
        this(name, DelegatedAdministratorArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public DelegatedAdministrator(String name, DelegatedAdministratorArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public DelegatedAdministrator(String name, DelegatedAdministratorArgs args, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("aws:organizations/delegatedAdministrator:DelegatedAdministrator", name, args == null ? DelegatedAdministratorArgs.Empty : args, makeResourceOptions(options, Output.empty()));
    }

    private DelegatedAdministrator(String name, Output<String> id, @Nullable DelegatedAdministratorState state, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("aws:organizations/delegatedAdministrator:DelegatedAdministrator", name, state, makeResourceOptions(options, id));
    }

    private static io.pulumi.resources.CustomResourceOptions makeResourceOptions(@Nullable io.pulumi.resources.CustomResourceOptions options, @Nullable Output<String> id) {
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
     * @param state
     * @param options Optional settings to control the behavior of the CustomResource.
     */
    public static DelegatedAdministrator get(String name, Output<String> id, @Nullable DelegatedAdministratorState state, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        return new DelegatedAdministrator(name, id, state, options);
    }
}
