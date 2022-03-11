// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.ssoadmin;

import io.pulumi.aws.Utilities;
import io.pulumi.aws.ssoadmin.PermissionSetInlinePolicyArgs;
import io.pulumi.aws.ssoadmin.inputs.PermissionSetInlinePolicyState;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.OutputExport;
import io.pulumi.core.annotations.ResourceType;
import java.lang.String;
import javax.annotation.Nullable;

/**
 * Provides an IAM inline policy for a Single Sign-On (SSO) Permission Set resource
 * 
 * > **NOTE:** AWS Single Sign-On (SSO) only supports one IAM inline policy per `aws.ssoadmin.PermissionSet` resource.
 * Creating or updating this resource will automatically [Provision the Permission Set](https://docs.aws.amazon.com/singlesignon/latest/APIReference/API_ProvisionPermissionSet.html) to apply the corresponding updates to all assigned accounts.
 * 
 * ## Import
 * 
 * SSO Permission Set Inline Policies can be imported using the `permission_set_arn` and `instance_arn` separated by a comma (`,`) e.g.,
 * 
 * ```sh
 *  $ pulumi import aws:ssoadmin/permissionSetInlinePolicy:PermissionSetInlinePolicy example arn:aws:sso:::permissionSet/ssoins-2938j0x8920sbj72/ps-80383020jr9302rk,arn:aws:sso:::instance/ssoins-2938j0x8920sbj72
 * ```
 * 
 */
@ResourceType(type="aws:ssoadmin/permissionSetInlinePolicy:PermissionSetInlinePolicy")
public class PermissionSetInlinePolicy extends io.pulumi.resources.CustomResource {
    /**
     * The IAM inline policy to attach to a Permission Set.
     * 
     */
    @OutputExport(name="inlinePolicy", type=String.class, parameters={})
    private Output<String> inlinePolicy;

    /**
     * @return The IAM inline policy to attach to a Permission Set.
     * 
     */
    public Output<String> getInlinePolicy() {
        return this.inlinePolicy;
    }
    /**
     * The Amazon Resource Name (ARN) of the SSO Instance under which the operation will be executed.
     * 
     */
    @OutputExport(name="instanceArn", type=String.class, parameters={})
    private Output<String> instanceArn;

    /**
     * @return The Amazon Resource Name (ARN) of the SSO Instance under which the operation will be executed.
     * 
     */
    public Output<String> getInstanceArn() {
        return this.instanceArn;
    }
    /**
     * The Amazon Resource Name (ARN) of the Permission Set.
     * 
     */
    @OutputExport(name="permissionSetArn", type=String.class, parameters={})
    private Output<String> permissionSetArn;

    /**
     * @return The Amazon Resource Name (ARN) of the Permission Set.
     * 
     */
    public Output<String> getPermissionSetArn() {
        return this.permissionSetArn;
    }

    public interface BuilderApplicator {
        public void apply(PermissionSetInlinePolicyArgs.Builder a);
    }
    private static io.pulumi.aws.ssoadmin.PermissionSetInlinePolicyArgs buildArgs(BuilderApplicator argsBuilder) {
        final var builder = io.pulumi.aws.ssoadmin.PermissionSetInlinePolicyArgs.builder();
        argsBuilder.apply(builder);
        return builder.build();
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param argsBuilder A function that configures a passed builder.
     */
    public PermissionSetInlinePolicy(String name, BuilderApplicator argsBuilder) {
        this(name, buildArgs(argsBuilder), null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public PermissionSetInlinePolicy(String name) {
        this(name, PermissionSetInlinePolicyArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public PermissionSetInlinePolicy(String name, PermissionSetInlinePolicyArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public PermissionSetInlinePolicy(String name, PermissionSetInlinePolicyArgs args, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("aws:ssoadmin/permissionSetInlinePolicy:PermissionSetInlinePolicy", name, args == null ? PermissionSetInlinePolicyArgs.Empty : args, makeResourceOptions(options, Output.empty()));
    }

    private PermissionSetInlinePolicy(String name, Output<String> id, @Nullable PermissionSetInlinePolicyState state, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("aws:ssoadmin/permissionSetInlinePolicy:PermissionSetInlinePolicy", name, state, makeResourceOptions(options, id));
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
    public static PermissionSetInlinePolicy get(String name, Output<String> id, @Nullable PermissionSetInlinePolicyState state, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        return new PermissionSetInlinePolicy(name, id, state, options);
    }
}
