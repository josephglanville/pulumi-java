// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.ssoadmin;

import io.pulumi.aws.Utilities;
import io.pulumi.aws.ssoadmin.ManagedPolicyAttachmentArgs;
import io.pulumi.aws.ssoadmin.inputs.ManagedPolicyAttachmentState;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.Export;
import io.pulumi.core.annotations.ResourceType;
import java.lang.String;
import javax.annotation.Nullable;

/**
 * Provides an IAM managed policy for a Single Sign-On (SSO) Permission Set resource
 * 
 * > **NOTE:** Creating this resource will automatically [Provision the Permission Set](https://docs.aws.amazon.com/singlesignon/latest/APIReference/API_ProvisionPermissionSet.html) to apply the corresponding updates to all assigned accounts.
 * 
 * ## Import
 * 
 * SSO Managed Policy Attachments can be imported using the `managed_policy_arn`, `permission_set_arn`, and `instance_arn` separated by a comma (`,`) e.g.,
 * 
 * ```sh
 *  $ pulumi import aws:ssoadmin/managedPolicyAttachment:ManagedPolicyAttachment example arn:aws:iam::aws:policy/AlexaForBusinessDeviceSetup,arn:aws:sso:::permissionSet/ssoins-2938j0x8920sbj72/ps-80383020jr9302rk,arn:aws:sso:::instance/ssoins-2938j0x8920sbj72
 * ```
 * 
 */
@ResourceType(type="aws:ssoadmin/managedPolicyAttachment:ManagedPolicyAttachment")
public class ManagedPolicyAttachment extends io.pulumi.resources.CustomResource {
    /**
     * The Amazon Resource Name (ARN) of the SSO Instance under which the operation will be executed.
     * 
     */
    @Export(name="instanceArn", type=String.class, parameters={})
    private Output<String> instanceArn;

    /**
     * @return The Amazon Resource Name (ARN) of the SSO Instance under which the operation will be executed.
     * 
     */
    public Output<String> getInstanceArn() {
        return this.instanceArn;
    }
    /**
     * The IAM managed policy Amazon Resource Name (ARN) to be attached to the Permission Set.
     * 
     */
    @Export(name="managedPolicyArn", type=String.class, parameters={})
    private Output<String> managedPolicyArn;

    /**
     * @return The IAM managed policy Amazon Resource Name (ARN) to be attached to the Permission Set.
     * 
     */
    public Output<String> getManagedPolicyArn() {
        return this.managedPolicyArn;
    }
    /**
     * The name of the IAM Managed Policy.
     * 
     */
    @Export(name="managedPolicyName", type=String.class, parameters={})
    private Output<String> managedPolicyName;

    /**
     * @return The name of the IAM Managed Policy.
     * 
     */
    public Output<String> getManagedPolicyName() {
        return this.managedPolicyName;
    }
    /**
     * The Amazon Resource Name (ARN) of the Permission Set.
     * 
     */
    @Export(name="permissionSetArn", type=String.class, parameters={})
    private Output<String> permissionSetArn;

    /**
     * @return The Amazon Resource Name (ARN) of the Permission Set.
     * 
     */
    public Output<String> getPermissionSetArn() {
        return this.permissionSetArn;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public ManagedPolicyAttachment(String name) {
        this(name, ManagedPolicyAttachmentArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public ManagedPolicyAttachment(String name, ManagedPolicyAttachmentArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public ManagedPolicyAttachment(String name, ManagedPolicyAttachmentArgs args, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("aws:ssoadmin/managedPolicyAttachment:ManagedPolicyAttachment", name, args == null ? ManagedPolicyAttachmentArgs.Empty : args, makeResourceOptions(options, Output.empty()));
    }

    private ManagedPolicyAttachment(String name, Output<String> id, @Nullable ManagedPolicyAttachmentState state, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("aws:ssoadmin/managedPolicyAttachment:ManagedPolicyAttachment", name, state, makeResourceOptions(options, id));
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
    public static ManagedPolicyAttachment get(String name, Output<String> id, @Nullable ManagedPolicyAttachmentState state, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        return new ManagedPolicyAttachment(name, id, state, options);
    }
}