// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.oci.Kms;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import com.pulumi.oci.Kms.VaultArgs;
import com.pulumi.oci.Kms.inputs.VaultState;
import com.pulumi.oci.Kms.outputs.VaultReplicaDetail;
import com.pulumi.oci.Kms.outputs.VaultRestoreFromFile;
import com.pulumi.oci.Kms.outputs.VaultRestoreFromObjectStore;
import com.pulumi.oci.Utilities;
import java.lang.Boolean;
import java.lang.Object;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import javax.annotation.Nullable;

/**
 * This resource provides the Vault resource in Oracle Cloud Infrastructure Kms service.
 * 
 * Creates a new vault. The type of vault you create determines key placement, pricing, and
 * available options. Options include storage isolation, a dedicated service endpoint instead
 * of a shared service endpoint for API calls, and either a dedicated hardware security module
 * (HSM) or a multitenant HSM.
 * 
 * As a provisioning operation, this call is subject to a Key Management limit that applies to
 * the total number of requests across all provisioning write operations. Key Management might
 * throttle this call to reject an otherwise valid request when the total rate of provisioning
 * write operations exceeds 10 requests per second for a given tenancy.
 * 
 * ## Example Usage
 * 
 * ## Import
 * 
 * Vaults can be imported using the `id`, e.g.
 * 
 * ```sh
 *  $ pulumi import oci:Kms/vault:Vault test_vault &#34;id&#34;
 * ```
 * 
 */
@ResourceType(type="oci:Kms/vault:Vault")
public class Vault extends com.pulumi.resources.CustomResource {
    /**
     * (Updatable) The OCID of the compartment where you want to create this vault.
     * 
     */
    @Export(name="compartmentId", type=String.class, parameters={})
    private Output<String> compartmentId;

    /**
     * @return (Updatable) The OCID of the compartment where you want to create this vault.
     * 
     */
    public Output<String> compartmentId() {
        return this.compartmentId;
    }
    /**
     * The service endpoint to perform cryptographic operations against. Cryptographic operations include [Encrypt](https://docs.cloud.oracle.com/iaas/api/#/en/key/latest/EncryptedData/Encrypt), [Decrypt](https://docs.cloud.oracle.com/iaas/api/#/en/key/latest/DecryptedData/Decrypt), and [GenerateDataEncryptionKey](https://docs.cloud.oracle.com/iaas/api/#/en/key/latest/GeneratedKey/GenerateDataEncryptionKey) operations.
     * 
     */
    @Export(name="cryptoEndpoint", type=String.class, parameters={})
    private Output<String> cryptoEndpoint;

    /**
     * @return The service endpoint to perform cryptographic operations against. Cryptographic operations include [Encrypt](https://docs.cloud.oracle.com/iaas/api/#/en/key/latest/EncryptedData/Encrypt), [Decrypt](https://docs.cloud.oracle.com/iaas/api/#/en/key/latest/DecryptedData/Decrypt), and [GenerateDataEncryptionKey](https://docs.cloud.oracle.com/iaas/api/#/en/key/latest/GeneratedKey/GenerateDataEncryptionKey) operations.
     * 
     */
    public Output<String> cryptoEndpoint() {
        return this.cryptoEndpoint;
    }
    /**
     * (Updatable) Defined tags for this resource. Each key is predefined and scoped to a namespace. For more information, see [Resource Tags](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/resourcetags.htm). Example: `{&#34;Operations.CostCenter&#34;: &#34;42&#34;}`
     * 
     */
    @Export(name="definedTags", type=Map.class, parameters={String.class, Object.class})
    private Output<Map<String,Object>> definedTags;

    /**
     * @return (Updatable) Defined tags for this resource. Each key is predefined and scoped to a namespace. For more information, see [Resource Tags](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/resourcetags.htm). Example: `{&#34;Operations.CostCenter&#34;: &#34;42&#34;}`
     * 
     */
    public Output<Map<String,Object>> definedTags() {
        return this.definedTags;
    }
    /**
     * (Updatable) A user-friendly name for the vault. It does not have to be unique, and it is changeable. Avoid entering confidential information.
     * 
     */
    @Export(name="displayName", type=String.class, parameters={})
    private Output<String> displayName;

    /**
     * @return (Updatable) A user-friendly name for the vault. It does not have to be unique, and it is changeable. Avoid entering confidential information.
     * 
     */
    public Output<String> displayName() {
        return this.displayName;
    }
    /**
     * (Updatable) Free-form tags for this resource. Each tag is a simple key-value pair with no predefined name, type, or namespace. For more information, see [Resource Tags](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/resourcetags.htm). Example: `{&#34;Department&#34;: &#34;Finance&#34;}`
     * 
     */
    @Export(name="freeformTags", type=Map.class, parameters={String.class, Object.class})
    private Output<Map<String,Object>> freeformTags;

    /**
     * @return (Updatable) Free-form tags for this resource. Each tag is a simple key-value pair with no predefined name, type, or namespace. For more information, see [Resource Tags](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/resourcetags.htm). Example: `{&#34;Department&#34;: &#34;Finance&#34;}`
     * 
     */
    public Output<Map<String,Object>> freeformTags() {
        return this.freeformTags;
    }
    /**
     * A boolean that will be true when vault is primary, and will be false when vault is a replica from a primary vault.
     * 
     */
    @Export(name="isPrimary", type=Boolean.class, parameters={})
    private Output<Boolean> isPrimary;

    /**
     * @return A boolean that will be true when vault is primary, and will be false when vault is a replica from a primary vault.
     * 
     */
    public Output<Boolean> isPrimary() {
        return this.isPrimary;
    }
    /**
     * The service endpoint to perform management operations against. Management operations include &#34;Create,&#34; &#34;Update,&#34; &#34;List,&#34; &#34;Get,&#34; and &#34;Delete&#34; operations.
     * 
     */
    @Export(name="managementEndpoint", type=String.class, parameters={})
    private Output<String> managementEndpoint;

    /**
     * @return The service endpoint to perform management operations against. Management operations include &#34;Create,&#34; &#34;Update,&#34; &#34;List,&#34; &#34;Get,&#34; and &#34;Delete&#34; operations.
     * 
     */
    public Output<String> managementEndpoint() {
        return this.managementEndpoint;
    }
    /**
     * Vault replica details
     * 
     */
    @Export(name="replicaDetails", type=List.class, parameters={VaultReplicaDetail.class})
    private Output<List<VaultReplicaDetail>> replicaDetails;

    /**
     * @return Vault replica details
     * 
     */
    public Output<List<VaultReplicaDetail>> replicaDetails() {
        return this.replicaDetails;
    }
    /**
     * (Updatable) Details where vault was backed up.
     * 
     */
    @Export(name="restoreFromFile", type=VaultRestoreFromFile.class, parameters={})
    private Output</* @Nullable */ VaultRestoreFromFile> restoreFromFile;

    /**
     * @return (Updatable) Details where vault was backed up.
     * 
     */
    public Output<Optional<VaultRestoreFromFile>> restoreFromFile() {
        return Codegen.optional(this.restoreFromFile);
    }
    /**
     * (Updatable) Details where vault was backed up
     * 
     */
    @Export(name="restoreFromObjectStore", type=VaultRestoreFromObjectStore.class, parameters={})
    private Output</* @Nullable */ VaultRestoreFromObjectStore> restoreFromObjectStore;

    /**
     * @return (Updatable) Details where vault was backed up
     * 
     */
    public Output<Optional<VaultRestoreFromObjectStore>> restoreFromObjectStore() {
        return Codegen.optional(this.restoreFromObjectStore);
    }
    @Export(name="restoreTrigger", type=Boolean.class, parameters={})
    private Output</* @Nullable */ Boolean> restoreTrigger;

    public Output<Optional<Boolean>> restoreTrigger() {
        return Codegen.optional(this.restoreTrigger);
    }
    /**
     * The OCID of the vault from which this vault was restored, if it was restored from a backup file.  If you restore a vault to the same region, the vault retains the same OCID that it had when you  backed up the vault.
     * 
     */
    @Export(name="restoredFromVaultId", type=String.class, parameters={})
    private Output<String> restoredFromVaultId;

    /**
     * @return The OCID of the vault from which this vault was restored, if it was restored from a backup file.  If you restore a vault to the same region, the vault retains the same OCID that it had when you  backed up the vault.
     * 
     */
    public Output<String> restoredFromVaultId() {
        return this.restoredFromVaultId;
    }
    /**
     * The vault&#39;s current lifecycle state.  Example: `DELETED`
     * 
     */
    @Export(name="state", type=String.class, parameters={})
    private Output<String> state;

    /**
     * @return The vault&#39;s current lifecycle state.  Example: `DELETED`
     * 
     */
    public Output<String> state() {
        return this.state;
    }
    /**
     * The date and time this vault was created, expressed in [RFC 3339](https://tools.ietf.org/html/rfc3339) timestamp format.  Example: `2018-04-03T21:10:29.600Z`
     * 
     */
    @Export(name="timeCreated", type=String.class, parameters={})
    private Output<String> timeCreated;

    /**
     * @return The date and time this vault was created, expressed in [RFC 3339](https://tools.ietf.org/html/rfc3339) timestamp format.  Example: `2018-04-03T21:10:29.600Z`
     * 
     */
    public Output<String> timeCreated() {
        return this.timeCreated;
    }
    /**
     * (Updatable) An optional property for the deletion time of the vault, expressed in [RFC 3339](https://tools.ietf.org/html/rfc3339) timestamp format. Example: `2019-04-03T21:10:29.600Z`
     * 
     */
    @Export(name="timeOfDeletion", type=String.class, parameters={})
    private Output<String> timeOfDeletion;

    /**
     * @return (Updatable) An optional property for the deletion time of the vault, expressed in [RFC 3339](https://tools.ietf.org/html/rfc3339) timestamp format. Example: `2019-04-03T21:10:29.600Z`
     * 
     */
    public Output<String> timeOfDeletion() {
        return this.timeOfDeletion;
    }
    /**
     * The type of vault to create. Each type of vault stores the key with different degrees of isolation and has different options and pricing.
     * 
     */
    @Export(name="vaultType", type=String.class, parameters={})
    private Output<String> vaultType;

    /**
     * @return The type of vault to create. Each type of vault stores the key with different degrees of isolation and has different options and pricing.
     * 
     */
    public Output<String> vaultType() {
        return this.vaultType;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public Vault(String name) {
        this(name, VaultArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public Vault(String name, VaultArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public Vault(String name, VaultArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("oci:Kms/vault:Vault", name, args == null ? VaultArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private Vault(String name, Output<String> id, @Nullable VaultState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("oci:Kms/vault:Vault", name, state, makeResourceOptions(options, id));
    }

    private static com.pulumi.resources.CustomResourceOptions makeResourceOptions(@Nullable com.pulumi.resources.CustomResourceOptions options, @Nullable Output<String> id) {
        var defaultOptions = com.pulumi.resources.CustomResourceOptions.builder()
            .version(Utilities.getVersion())
            .build();
        return com.pulumi.resources.CustomResourceOptions.merge(defaultOptions, options, id);
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
    public static Vault get(String name, Output<String> id, @Nullable VaultState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new Vault(name, id, state, options);
    }
}
