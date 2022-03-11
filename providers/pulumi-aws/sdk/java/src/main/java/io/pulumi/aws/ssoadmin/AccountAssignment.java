// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.ssoadmin;

import io.pulumi.aws.Utilities;
import io.pulumi.aws.ssoadmin.AccountAssignmentArgs;
import io.pulumi.aws.ssoadmin.inputs.AccountAssignmentState;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.OutputExport;
import io.pulumi.core.annotations.ResourceType;
import java.lang.String;
import javax.annotation.Nullable;

/**
 * Provides a Single Sign-On (SSO) Account Assignment resource
 * 
 * ## Import
 * 
 * SSO Account Assignments can be imported using the `principal_id`, `principal_type`, `target_id`, `target_type`, `permission_set_arn`, `instance_arn` separated by commas (`,`) e.g.,
 * 
 * ```sh
 *  $ pulumi import aws:ssoadmin/accountAssignment:AccountAssignment example f81d4fae-7dec-11d0-a765-00a0c91e6bf6,GROUP,1234567890,AWS_ACCOUNT,arn:aws:sso:::permissionSet/ssoins-0123456789abcdef/ps-0123456789abcdef,arn:aws:sso:::instance/ssoins-0123456789abcdef
 * ```
 * 
 */
@ResourceType(type="aws:ssoadmin/accountAssignment:AccountAssignment")
public class AccountAssignment extends io.pulumi.resources.CustomResource {
    /**
     * The Amazon Resource Name (ARN) of the SSO Instance.
     * 
     */
    @OutputExport(name="instanceArn", type=String.class, parameters={})
    private Output<String> instanceArn;

    /**
     * @return The Amazon Resource Name (ARN) of the SSO Instance.
     * 
     */
    public Output<String> getInstanceArn() {
        return this.instanceArn;
    }
    /**
     * The Amazon Resource Name (ARN) of the Permission Set that the admin wants to grant the principal access to.
     * 
     */
    @OutputExport(name="permissionSetArn", type=String.class, parameters={})
    private Output<String> permissionSetArn;

    /**
     * @return The Amazon Resource Name (ARN) of the Permission Set that the admin wants to grant the principal access to.
     * 
     */
    public Output<String> getPermissionSetArn() {
        return this.permissionSetArn;
    }
    /**
     * An identifier for an object in SSO, such as a user or group. PrincipalIds are GUIDs (For example, `f81d4fae-7dec-11d0-a765-00a0c91e6bf6`).
     * 
     */
    @OutputExport(name="principalId", type=String.class, parameters={})
    private Output<String> principalId;

    /**
     * @return An identifier for an object in SSO, such as a user or group. PrincipalIds are GUIDs (For example, `f81d4fae-7dec-11d0-a765-00a0c91e6bf6`).
     * 
     */
    public Output<String> getPrincipalId() {
        return this.principalId;
    }
    /**
     * The entity type for which the assignment will be created. Valid values: `USER`, `GROUP`.
     * 
     */
    @OutputExport(name="principalType", type=String.class, parameters={})
    private Output<String> principalType;

    /**
     * @return The entity type for which the assignment will be created. Valid values: `USER`, `GROUP`.
     * 
     */
    public Output<String> getPrincipalType() {
        return this.principalType;
    }
    /**
     * An AWS account identifier, typically a 10-12 digit string.
     * 
     */
    @OutputExport(name="targetId", type=String.class, parameters={})
    private Output<String> targetId;

    /**
     * @return An AWS account identifier, typically a 10-12 digit string.
     * 
     */
    public Output<String> getTargetId() {
        return this.targetId;
    }
    /**
     * The entity type for which the assignment will be created. Valid values: `AWS_ACCOUNT`.
     * 
     */
    @OutputExport(name="targetType", type=String.class, parameters={})
    private Output</* @Nullable */ String> targetType;

    /**
     * @return The entity type for which the assignment will be created. Valid values: `AWS_ACCOUNT`.
     * 
     */
    public Output</* @Nullable */ String> getTargetType() {
        return this.targetType;
    }

    public interface BuilderApplicator {
        public void apply(AccountAssignmentArgs.Builder a);
    }
    private static io.pulumi.aws.ssoadmin.AccountAssignmentArgs buildArgs(BuilderApplicator argsBuilder) {
        final var builder = io.pulumi.aws.ssoadmin.AccountAssignmentArgs.builder();
        argsBuilder.apply(builder);
        return builder.build();
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param argsBuilder A function that configures a passed builder.
     */
    public AccountAssignment(String name, BuilderApplicator argsBuilder) {
        this(name, buildArgs(argsBuilder), null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public AccountAssignment(String name) {
        this(name, AccountAssignmentArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public AccountAssignment(String name, AccountAssignmentArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public AccountAssignment(String name, AccountAssignmentArgs args, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("aws:ssoadmin/accountAssignment:AccountAssignment", name, args == null ? AccountAssignmentArgs.Empty : args, makeResourceOptions(options, Output.empty()));
    }

    private AccountAssignment(String name, Output<String> id, @Nullable AccountAssignmentState state, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("aws:ssoadmin/accountAssignment:AccountAssignment", name, state, makeResourceOptions(options, id));
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
    public static AccountAssignment get(String name, Output<String> id, @Nullable AccountAssignmentState state, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        return new AccountAssignment(name, id, state, options);
    }
}
