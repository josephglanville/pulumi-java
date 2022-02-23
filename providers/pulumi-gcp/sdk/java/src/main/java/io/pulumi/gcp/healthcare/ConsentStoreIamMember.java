// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.healthcare;

import io.pulumi.core.Input;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.OutputExport;
import io.pulumi.core.annotations.ResourceType;
import io.pulumi.gcp.Utilities;
import io.pulumi.gcp.healthcare.ConsentStoreIamMemberArgs;
import io.pulumi.gcp.healthcare.inputs.ConsentStoreIamMemberState;
import io.pulumi.gcp.healthcare.outputs.ConsentStoreIamMemberCondition;
import java.lang.String;
import javax.annotation.Nullable;

/**
 * Three different resources help you manage your IAM policy for Cloud Healthcare ConsentStore. Each of these resources serves a different use case:
 * 
 * * `gcp.healthcare.ConsentStoreIamPolicy`: Authoritative. Sets the IAM policy for the consentstore and replaces any existing policy already attached.
 * * `gcp.healthcare.ConsentStoreIamBinding`: Authoritative for a given role. Updates the IAM policy to grant a role to a list of members. Other roles within the IAM policy for the consentstore are preserved.
 * * `gcp.healthcare.ConsentStoreIamMember`: Non-authoritative. Updates the IAM policy to grant a role to a new member. Other members for the role for the consentstore are preserved.
 * 
 * > **Note:** `gcp.healthcare.ConsentStoreIamPolicy` **cannot** be used in conjunction with `gcp.healthcare.ConsentStoreIamBinding` and `gcp.healthcare.ConsentStoreIamMember` or they will fight over what your policy should be.
 * 
 * > **Note:** `gcp.healthcare.ConsentStoreIamBinding` resources **can be** used in conjunction with `gcp.healthcare.ConsentStoreIamMember` resources **only if** they do not grant privilege to the same role.
 * 
 * ## google\_healthcare\_consent\_store\_iam\_policy
 * 
 * ## google\_healthcare\_consent\_store\_iam\_binding
 * 
 * ## google\_healthcare\_consent\_store\_iam\_member
 * 
 * ## Import
 * 
 * For all import syntaxes, the "resource in question" can take any of the following forms* {{dataset}}/consentStores/{{name}} * {{name}} Any variables not passed in the import command will be taken from the provider configuration. Cloud Healthcare consentstore IAM resources can be imported using the resource identifiers, role, and member. IAM member imports use space-delimited identifiersthe resource in question, the role, and the member identity, e.g.
 * 
 * ```sh
 *  $ pulumi import gcp:healthcare/consentStoreIamMember:ConsentStoreIamMember editor "{{dataset}}/consentStores/{{consent_store}} roles/viewer user:jane@example.com"
 * ```
 * 
 *  IAM binding imports use space-delimited identifiersthe resource in question and the role, e.g.
 * 
 * ```sh
 *  $ pulumi import gcp:healthcare/consentStoreIamMember:ConsentStoreIamMember editor "{{dataset}}/consentStores/{{consent_store}} roles/viewer"
 * ```
 * 
 *  IAM policy imports use the identifier of the resource in question, e.g.
 * 
 * ```sh
 *  $ pulumi import gcp:healthcare/consentStoreIamMember:ConsentStoreIamMember editor {{dataset}}/consentStores/{{consent_store}}
 * ```
 * 
 *  -> **Custom Roles**If you're importing a IAM resource with a custom role, make sure to use the
 * 
 * full name of the custom role, e.g. `[projects/my-project|organizations/my-org]/roles/my-custom-role`.
 * 
 */
@ResourceType(type="gcp:healthcare/consentStoreIamMember:ConsentStoreIamMember")
public class ConsentStoreIamMember extends io.pulumi.resources.CustomResource {
    @OutputExport(name="condition", type=ConsentStoreIamMemberCondition.class, parameters={})
    private Output</* @Nullable */ ConsentStoreIamMemberCondition> condition;

    public Output</* @Nullable */ ConsentStoreIamMemberCondition> getCondition() {
        return this.condition;
    }
    /**
     * Used to find the parent resource to bind the IAM policy to
     * 
     */
    @OutputExport(name="consentStoreId", type=String.class, parameters={})
    private Output<String> consentStoreId;

    /**
     * @return Used to find the parent resource to bind the IAM policy to
     * 
     */
    public Output<String> getConsentStoreId() {
        return this.consentStoreId;
    }
    /**
     * Identifies the dataset addressed by this request. Must be in the format
     * 'projects/{project}/locations/{location}/datasets/{dataset}'
     * Used to find the parent resource to bind the IAM policy to
     * 
     */
    @OutputExport(name="dataset", type=String.class, parameters={})
    private Output<String> dataset;

    /**
     * @return Identifies the dataset addressed by this request. Must be in the format
     * 'projects/{project}/locations/{location}/datasets/{dataset}'
     * Used to find the parent resource to bind the IAM policy to
     * 
     */
    public Output<String> getDataset() {
        return this.dataset;
    }
    /**
     * (Computed) The etag of the IAM policy.
     * 
     */
    @OutputExport(name="etag", type=String.class, parameters={})
    private Output<String> etag;

    /**
     * @return (Computed) The etag of the IAM policy.
     * 
     */
    public Output<String> getEtag() {
        return this.etag;
    }
    @OutputExport(name="member", type=String.class, parameters={})
    private Output<String> member;

    public Output<String> getMember() {
        return this.member;
    }
    /**
     * The role that should be applied. Only one
     * `gcp.healthcare.ConsentStoreIamBinding` can be used per role. Note that custom roles must be of the format
     * `[projects|organizations]/{parent-name}/roles/{role-name}`.
     * 
     */
    @OutputExport(name="role", type=String.class, parameters={})
    private Output<String> role;

    /**
     * @return The role that should be applied. Only one
     * `gcp.healthcare.ConsentStoreIamBinding` can be used per role. Note that custom roles must be of the format
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
    public ConsentStoreIamMember(String name) {
        this(name, ConsentStoreIamMemberArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public ConsentStoreIamMember(String name, ConsentStoreIamMemberArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public ConsentStoreIamMember(String name, ConsentStoreIamMemberArgs args, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("gcp:healthcare/consentStoreIamMember:ConsentStoreIamMember", name, args == null ? ConsentStoreIamMemberArgs.Empty : args, makeResourceOptions(options, Input.empty()));
    }

    private ConsentStoreIamMember(String name, Input<String> id, @Nullable ConsentStoreIamMemberState state, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("gcp:healthcare/consentStoreIamMember:ConsentStoreIamMember", name, state, makeResourceOptions(options, id));
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
    public static ConsentStoreIamMember get(String name, Input<String> id, @Nullable ConsentStoreIamMemberState state, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        return new ConsentStoreIamMember(name, id, state, options);
    }
}
