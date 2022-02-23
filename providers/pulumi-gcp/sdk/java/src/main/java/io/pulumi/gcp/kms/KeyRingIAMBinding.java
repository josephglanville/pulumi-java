// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.kms;

import io.pulumi.core.Input;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.OutputExport;
import io.pulumi.core.annotations.ResourceType;
import io.pulumi.gcp.Utilities;
import io.pulumi.gcp.kms.KeyRingIAMBindingArgs;
import io.pulumi.gcp.kms.inputs.KeyRingIAMBindingState;
import io.pulumi.gcp.kms.outputs.KeyRingIAMBindingCondition;
import java.lang.String;
import java.util.List;
import javax.annotation.Nullable;

/**
 * Three different resources help you manage your IAM policy for KMS key ring. Each of these resources serves a different use case:
 * 
 * * `gcp.kms.KeyRingIAMPolicy`: Authoritative. Sets the IAM policy for the key ring and replaces any existing policy already attached.
 * * `gcp.kms.KeyRingIAMBinding`: Authoritative for a given role. Updates the IAM policy to grant a role to a list of members. Other roles within the IAM policy for the key ring are preserved.
 * * `gcp.kms.KeyRingIAMMember`: Non-authoritative. Updates the IAM policy to grant a role to a new member. Other members for the role for the key ring are preserved.
 * 
 * > **Note:** `gcp.kms.KeyRingIAMPolicy` **cannot** be used in conjunction with `gcp.kms.KeyRingIAMBinding` and `gcp.kms.KeyRingIAMMember` or they will fight over what your policy should be.
 * 
 * > **Note:** `gcp.kms.KeyRingIAMBinding` resources **can be** used in conjunction with `gcp.kms.KeyRingIAMMember` resources **only if** they do not grant privilege to the same role.
 * 
 * ## google\_kms\_key\_ring\_iam\_policy
 * 
 * With IAM Conditions:
 * 
 * ## google\_kms\_key\_ring\_iam\_binding
 * 
 * With IAM Conditions:
 * 
 * ## google\_kms\_key\_ring\_iam\_member
 * 
 * With IAM Conditions:
 * 
 * ## Import
 * 
 * IAM member imports use space-delimited identifiers; the resource in question, the role, and the account.
 * 
 * This member resource can be imported using the `key_ring_id`, role, and account e.g.
 * 
 * ```sh
 *  $ pulumi import gcp:kms/keyRingIAMBinding:KeyRingIAMBinding key_ring_iam "your-project-id/location-name/key-ring-name roles/viewer user:foo@example.com"
 * ```
 * 
 *  IAM binding imports use space-delimited identifiers; the resource in question and the role.
 * 
 * This binding resource can be imported using the `key_ring_id` and role, e.g.
 * 
 * ```sh
 *  $ pulumi import gcp:kms/keyRingIAMBinding:KeyRingIAMBinding key_ring_iam "your-project-id/location-name/key-ring-name roles/viewer"
 * ```
 * 
 *  IAM policy imports use the identifier of the resource in question.
 * 
 * This policy resource can be imported using the `key_ring_id`, e.g.
 * 
 * ```sh
 *  $ pulumi import gcp:kms/keyRingIAMBinding:KeyRingIAMBinding key_ring_iam your-project-id/location-name/key-ring-name
 * ```
 * 
 */
@ResourceType(type="gcp:kms/keyRingIAMBinding:KeyRingIAMBinding")
public class KeyRingIAMBinding extends io.pulumi.resources.CustomResource {
    /**
     * ) An [IAM Condition](https://cloud.google.com/iam/docs/conditions-overview) for a given binding.
     * Structure is documented below.
     * 
     */
    @OutputExport(name="condition", type=KeyRingIAMBindingCondition.class, parameters={})
    private Output</* @Nullable */ KeyRingIAMBindingCondition> condition;

    /**
     * @return ) An [IAM Condition](https://cloud.google.com/iam/docs/conditions-overview) for a given binding.
     * Structure is documented below.
     * 
     */
    public Output</* @Nullable */ KeyRingIAMBindingCondition> getCondition() {
        return this.condition;
    }
    /**
     * (Computed) The etag of the key ring's IAM policy.
     * 
     */
    @OutputExport(name="etag", type=String.class, parameters={})
    private Output<String> etag;

    /**
     * @return (Computed) The etag of the key ring's IAM policy.
     * 
     */
    public Output<String> getEtag() {
        return this.etag;
    }
    /**
     * The key ring ID, in the form
     * `{project_id}/{location_name}/{key_ring_name}` or
     * `{location_name}/{key_ring_name}`. In the second form, the provider's
     * project setting will be used as a fallback.
     * 
     */
    @OutputExport(name="keyRingId", type=String.class, parameters={})
    private Output<String> keyRingId;

    /**
     * @return The key ring ID, in the form
     * `{project_id}/{location_name}/{key_ring_name}` or
     * `{location_name}/{key_ring_name}`. In the second form, the provider's
     * project setting will be used as a fallback.
     * 
     */
    public Output<String> getKeyRingId() {
        return this.keyRingId;
    }
    @OutputExport(name="members", type=List.class, parameters={String.class})
    private Output<List<String>> members;

    public Output<List<String>> getMembers() {
        return this.members;
    }
    /**
     * The role that should be applied. Only one
     * `gcp.kms.KeyRingIAMBinding` can be used per role. Note that custom roles must be of the format
     * `[projects|organizations]/{parent-name}/roles/{role-name}`.
     * 
     */
    @OutputExport(name="role", type=String.class, parameters={})
    private Output<String> role;

    /**
     * @return The role that should be applied. Only one
     * `gcp.kms.KeyRingIAMBinding` can be used per role. Note that custom roles must be of the format
     * `[projects|organizations]/{parent-name}/roles/{role-name}`.
     * 
     */
    public Output<String> getRole() {
        return this.role;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public KeyRingIAMBinding(String name) {
        this(name, KeyRingIAMBindingArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public KeyRingIAMBinding(String name, KeyRingIAMBindingArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public KeyRingIAMBinding(String name, KeyRingIAMBindingArgs args, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("gcp:kms/keyRingIAMBinding:KeyRingIAMBinding", name, args == null ? KeyRingIAMBindingArgs.Empty : args, makeResourceOptions(options, Input.empty()));
    }

    private KeyRingIAMBinding(String name, Input<String> id, @Nullable KeyRingIAMBindingState state, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("gcp:kms/keyRingIAMBinding:KeyRingIAMBinding", name, state, makeResourceOptions(options, id));
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
     * @param state
     * @param options Optional settings to control the behavior of the CustomResource.
     */
    public static KeyRingIAMBinding get(String name, Input<String> id, @Nullable KeyRingIAMBindingState state, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        return new KeyRingIAMBinding(name, id, state, options);
    }
}
