// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.kms;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Export;
import io.pulumi.core.annotations.ResourceType;
import io.pulumi.gcp.Utilities;
import io.pulumi.gcp.kms.CryptoKeyIAMPolicyArgs;
import io.pulumi.gcp.kms.inputs.CryptoKeyIAMPolicyState;
import java.lang.String;
import javax.annotation.Nullable;

/**
 * Three different resources help you manage your IAM policy for KMS crypto key. Each of these resources serves a different use case:
 * 
 * * `gcp.kms.CryptoKeyIAMPolicy`: Authoritative. Sets the IAM policy for the crypto key and replaces any existing policy already attached.
 * * `gcp.kms.CryptoKeyIAMBinding`: Authoritative for a given role. Updates the IAM policy to grant a role to a list of members. Other roles within the IAM policy for the crypto key are preserved.
 * * `gcp.kms.CryptoKeyIAMMember`: Non-authoritative. Updates the IAM policy to grant a role to a new member. Other members for the role for the crypto key are preserved.
 * 
 * > **Note:** `gcp.kms.CryptoKeyIAMPolicy` **cannot** be used in conjunction with `gcp.kms.CryptoKeyIAMBinding` and `gcp.kms.CryptoKeyIAMMember` or they will fight over what your policy should be.
 * 
 * > **Note:** `gcp.kms.CryptoKeyIAMBinding` resources **can be** used in conjunction with `gcp.kms.CryptoKeyIAMMember` resources **only if** they do not grant privilege to the same role.
 * 
 * With IAM Conditions:
 * 
 * With IAM Conditions:
 * 
 * With IAM Conditions:
 * 
 * ## Import
 * 
 * IAM member imports use space-delimited identifiers; the resource in question, the role, and the account.
 * 
 * This member resource can be imported using the `crypto_key_id`, role, and member identity e.g.
 * 
 * ```sh
 *  $ pulumi import gcp:kms/cryptoKeyIAMPolicy:CryptoKeyIAMPolicy crypto_key "your-project-id/location-name/key-ring-name/key-name roles/viewer user:foo@example.com"
 * ```
 * 
 *  IAM binding imports use space-delimited identifiers; first the resource in question and then the role.
 * 
 * These bindings can be imported using the `crypto_key_id` and role, e.g.
 * 
 * ```sh
 *  $ pulumi import gcp:kms/cryptoKeyIAMPolicy:CryptoKeyIAMPolicy crypto_key "your-project-id/location-name/key-ring-name/key-name roles/editor"
 * ```
 * 
 *  IAM policy imports use the identifier of the resource in question.
 * 
 * This policy resource can be imported using the `crypto_key_id`, e.g.
 * 
 * ```sh
 *  $ pulumi import gcp:kms/cryptoKeyIAMPolicy:CryptoKeyIAMPolicy crypto_key your-project-id/location-name/key-ring-name/key-name
 * ```
 * 
 */
@ResourceType(type="gcp:kms/cryptoKeyIAMPolicy:CryptoKeyIAMPolicy")
public class CryptoKeyIAMPolicy extends io.pulumi.resources.CustomResource {
    /**
     * The crypto key ID, in the form
     * `{project_id}/{location_name}/{key_ring_name}/{crypto_key_name}` or
     * `{location_name}/{key_ring_name}/{crypto_key_name}`. In the second form,
     * the provider's project setting will be used as a fallback.
     * 
     */
    @Export(name="cryptoKeyId", type=String.class, parameters={})
    private Output<String> cryptoKeyId;

    /**
     * @return The crypto key ID, in the form
     * `{project_id}/{location_name}/{key_ring_name}/{crypto_key_name}` or
     * `{location_name}/{key_ring_name}/{crypto_key_name}`. In the second form,
     * the provider's project setting will be used as a fallback.
     * 
     */
    public Output<String> getCryptoKeyId() {
        return this.cryptoKeyId;
    }
    /**
     * (Computed) The etag of the project's IAM policy.
     * 
     */
    @Export(name="etag", type=String.class, parameters={})
    private Output<String> etag;

    /**
     * @return (Computed) The etag of the project's IAM policy.
     * 
     */
    public Output<String> getEtag() {
        return this.etag;
    }
    /**
     * The policy data generated by
     * a `gcp.organizations.getIAMPolicy` data source.
     * 
     */
    @Export(name="policyData", type=String.class, parameters={})
    private Output<String> policyData;

    /**
     * @return The policy data generated by
     * a `gcp.organizations.getIAMPolicy` data source.
     * 
     */
    public Output<String> getPolicyData() {
        return this.policyData;
    }

    public interface BuilderApplicator {
        public void apply(CryptoKeyIAMPolicyArgs.Builder a);
    }
    private static io.pulumi.gcp.kms.CryptoKeyIAMPolicyArgs buildArgs(BuilderApplicator argsBuilder) {
        final var builder = io.pulumi.gcp.kms.CryptoKeyIAMPolicyArgs.builder();
        argsBuilder.apply(builder);
        return builder.build();
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param argsBuilder A function that configures a passed builder.
     */
    public CryptoKeyIAMPolicy(String name, BuilderApplicator argsBuilder) {
        this(name, buildArgs(argsBuilder), null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public CryptoKeyIAMPolicy(String name) {
        this(name, CryptoKeyIAMPolicyArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public CryptoKeyIAMPolicy(String name, CryptoKeyIAMPolicyArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public CryptoKeyIAMPolicy(String name, CryptoKeyIAMPolicyArgs args, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("gcp:kms/cryptoKeyIAMPolicy:CryptoKeyIAMPolicy", name, args == null ? CryptoKeyIAMPolicyArgs.Empty : args, makeResourceOptions(options, Output.empty()));
    }

    private CryptoKeyIAMPolicy(String name, Output<String> id, @Nullable CryptoKeyIAMPolicyState state, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("gcp:kms/cryptoKeyIAMPolicy:CryptoKeyIAMPolicy", name, state, makeResourceOptions(options, id));
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
    public static CryptoKeyIAMPolicy get(String name, Output<String> id, @Nullable CryptoKeyIAMPolicyState state, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        return new CryptoKeyIAMPolicy(name, id, state, options);
    }
}
