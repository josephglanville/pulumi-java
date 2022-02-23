// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.batch;

import io.pulumi.azurenative.Utilities;
import io.pulumi.azurenative.batch.BatchAccountArgs;
import io.pulumi.azurenative.batch.outputs.AutoStoragePropertiesResponse;
import io.pulumi.azurenative.batch.outputs.BatchAccountIdentityResponse;
import io.pulumi.azurenative.batch.outputs.EncryptionPropertiesResponse;
import io.pulumi.azurenative.batch.outputs.KeyVaultReferenceResponse;
import io.pulumi.azurenative.batch.outputs.PrivateEndpointConnectionResponse;
import io.pulumi.azurenative.batch.outputs.VirtualMachineFamilyCoreQuotaResponse;
import io.pulumi.core.Alias;
import io.pulumi.core.Input;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.OutputExport;
import io.pulumi.core.annotations.ResourceType;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Map;
import javax.annotation.Nullable;

/**
 * Contains information about an Azure Batch account.
 * API Version: 2021-01-01.
 * 
 * ## Example Usage
 * 
 * ## Import
 * 
 * An existing resource can be imported using its type token, name, and identifier, e.g.
 * 
 * ```sh
 * $ pulumi import azure-native:batch:BatchAccount sampleacct /subscriptions/subid/resourceGroups/default-azurebatch-japaneast/providers/Microsoft.Batch/batchAccounts/sampleacct 
 * ```
 * 
 */
@ResourceType(type="azure-native:batch:BatchAccount")
public class BatchAccount extends io.pulumi.resources.CustomResource {
    /**
     * The account endpoint used to interact with the Batch service.
     * 
     */
    @OutputExport(name="accountEndpoint", type=String.class, parameters={})
    private Output<String> accountEndpoint;

    /**
     * @return The account endpoint used to interact with the Batch service.
     * 
     */
    public Output<String> getAccountEndpoint() {
        return this.accountEndpoint;
    }
    @OutputExport(name="activeJobAndJobScheduleQuota", type=Integer.class, parameters={})
    private Output<Integer> activeJobAndJobScheduleQuota;

    public Output<Integer> getActiveJobAndJobScheduleQuota() {
        return this.activeJobAndJobScheduleQuota;
    }
    /**
     * Contains information about the auto-storage account associated with a Batch account.
     * 
     */
    @OutputExport(name="autoStorage", type=AutoStoragePropertiesResponse.class, parameters={})
    private Output<AutoStoragePropertiesResponse> autoStorage;

    /**
     * @return Contains information about the auto-storage account associated with a Batch account.
     * 
     */
    public Output<AutoStoragePropertiesResponse> getAutoStorage() {
        return this.autoStorage;
    }
    /**
     * For accounts with PoolAllocationMode set to UserSubscription, quota is managed on the subscription so this value is not returned.
     * 
     */
    @OutputExport(name="dedicatedCoreQuota", type=Integer.class, parameters={})
    private Output<Integer> dedicatedCoreQuota;

    /**
     * @return For accounts with PoolAllocationMode set to UserSubscription, quota is managed on the subscription so this value is not returned.
     * 
     */
    public Output<Integer> getDedicatedCoreQuota() {
        return this.dedicatedCoreQuota;
    }
    /**
     * A list of the dedicated core quota per Virtual Machine family for the Batch account. For accounts with PoolAllocationMode set to UserSubscription, quota is managed on the subscription so this value is not returned.
     * 
     */
    @OutputExport(name="dedicatedCoreQuotaPerVMFamily", type=List.class, parameters={VirtualMachineFamilyCoreQuotaResponse.class})
    private Output<List<VirtualMachineFamilyCoreQuotaResponse>> dedicatedCoreQuotaPerVMFamily;

    /**
     * @return A list of the dedicated core quota per Virtual Machine family for the Batch account. For accounts with PoolAllocationMode set to UserSubscription, quota is managed on the subscription so this value is not returned.
     * 
     */
    public Output<List<VirtualMachineFamilyCoreQuotaResponse>> getDedicatedCoreQuotaPerVMFamily() {
        return this.dedicatedCoreQuotaPerVMFamily;
    }
    /**
     * Batch is transitioning its core quota system for dedicated cores to be enforced per Virtual Machine family. During this transitional phase, the dedicated core quota per Virtual Machine family may not yet be enforced. If this flag is false, dedicated core quota is enforced via the old dedicatedCoreQuota property on the account and does not consider Virtual Machine family. If this flag is true, dedicated core quota is enforced via the dedicatedCoreQuotaPerVMFamily property on the account, and the old dedicatedCoreQuota does not apply.
     * 
     */
    @OutputExport(name="dedicatedCoreQuotaPerVMFamilyEnforced", type=Boolean.class, parameters={})
    private Output<Boolean> dedicatedCoreQuotaPerVMFamilyEnforced;

    /**
     * @return Batch is transitioning its core quota system for dedicated cores to be enforced per Virtual Machine family. During this transitional phase, the dedicated core quota per Virtual Machine family may not yet be enforced. If this flag is false, dedicated core quota is enforced via the old dedicatedCoreQuota property on the account and does not consider Virtual Machine family. If this flag is true, dedicated core quota is enforced via the dedicatedCoreQuotaPerVMFamily property on the account, and the old dedicatedCoreQuota does not apply.
     * 
     */
    public Output<Boolean> getDedicatedCoreQuotaPerVMFamilyEnforced() {
        return this.dedicatedCoreQuotaPerVMFamilyEnforced;
    }
    /**
     * Configures how customer data is encrypted inside the Batch account. By default, accounts are encrypted using a Microsoft managed key. For additional control, a customer-managed key can be used instead.
     * 
     */
    @OutputExport(name="encryption", type=EncryptionPropertiesResponse.class, parameters={})
    private Output<EncryptionPropertiesResponse> encryption;

    /**
     * @return Configures how customer data is encrypted inside the Batch account. By default, accounts are encrypted using a Microsoft managed key. For additional control, a customer-managed key can be used instead.
     * 
     */
    public Output<EncryptionPropertiesResponse> getEncryption() {
        return this.encryption;
    }
    /**
     * The identity of the Batch account.
     * 
     */
    @OutputExport(name="identity", type=BatchAccountIdentityResponse.class, parameters={})
    private Output</* @Nullable */ BatchAccountIdentityResponse> identity;

    /**
     * @return The identity of the Batch account.
     * 
     */
    public Output</* @Nullable */ BatchAccountIdentityResponse> getIdentity() {
        return this.identity;
    }
    /**
     * Identifies the Azure key vault associated with a Batch account.
     * 
     */
    @OutputExport(name="keyVaultReference", type=KeyVaultReferenceResponse.class, parameters={})
    private Output<KeyVaultReferenceResponse> keyVaultReference;

    /**
     * @return Identifies the Azure key vault associated with a Batch account.
     * 
     */
    public Output<KeyVaultReferenceResponse> getKeyVaultReference() {
        return this.keyVaultReference;
    }
    /**
     * The location of the resource.
     * 
     */
    @OutputExport(name="location", type=String.class, parameters={})
    private Output<String> location;

    /**
     * @return The location of the resource.
     * 
     */
    public Output<String> getLocation() {
        return this.location;
    }
    /**
     * For accounts with PoolAllocationMode set to UserSubscription, quota is managed on the subscription so this value is not returned.
     * 
     */
    @OutputExport(name="lowPriorityCoreQuota", type=Integer.class, parameters={})
    private Output<Integer> lowPriorityCoreQuota;

    /**
     * @return For accounts with PoolAllocationMode set to UserSubscription, quota is managed on the subscription so this value is not returned.
     * 
     */
    public Output<Integer> getLowPriorityCoreQuota() {
        return this.lowPriorityCoreQuota;
    }
    /**
     * The name of the resource.
     * 
     */
    @OutputExport(name="name", type=String.class, parameters={})
    private Output<String> name;

    /**
     * @return The name of the resource.
     * 
     */
    public Output<String> getName() {
        return this.name;
    }
    /**
     * The allocation mode for creating pools in the Batch account.
     * 
     */
    @OutputExport(name="poolAllocationMode", type=String.class, parameters={})
    private Output<String> poolAllocationMode;

    /**
     * @return The allocation mode for creating pools in the Batch account.
     * 
     */
    public Output<String> getPoolAllocationMode() {
        return this.poolAllocationMode;
    }
    @OutputExport(name="poolQuota", type=Integer.class, parameters={})
    private Output<Integer> poolQuota;

    public Output<Integer> getPoolQuota() {
        return this.poolQuota;
    }
    /**
     * List of private endpoint connections associated with the Batch account
     * 
     */
    @OutputExport(name="privateEndpointConnections", type=List.class, parameters={PrivateEndpointConnectionResponse.class})
    private Output<List<PrivateEndpointConnectionResponse>> privateEndpointConnections;

    /**
     * @return List of private endpoint connections associated with the Batch account
     * 
     */
    public Output<List<PrivateEndpointConnectionResponse>> getPrivateEndpointConnections() {
        return this.privateEndpointConnections;
    }
    /**
     * The provisioned state of the resource
     * 
     */
    @OutputExport(name="provisioningState", type=String.class, parameters={})
    private Output<String> provisioningState;

    /**
     * @return The provisioned state of the resource
     * 
     */
    public Output<String> getProvisioningState() {
        return this.provisioningState;
    }
    /**
     * If not specified, the default value is 'enabled'.
     * 
     */
    @OutputExport(name="publicNetworkAccess", type=String.class, parameters={})
    private Output<String> publicNetworkAccess;

    /**
     * @return If not specified, the default value is 'enabled'.
     * 
     */
    public Output<String> getPublicNetworkAccess() {
        return this.publicNetworkAccess;
    }
    /**
     * The tags of the resource.
     * 
     */
    @OutputExport(name="tags", type=Map.class, parameters={String.class, String.class})
    private Output<Map<String,String>> tags;

    /**
     * @return The tags of the resource.
     * 
     */
    public Output<Map<String,String>> getTags() {
        return this.tags;
    }
    /**
     * The type of the resource.
     * 
     */
    @OutputExport(name="type", type=String.class, parameters={})
    private Output<String> type;

    /**
     * @return The type of the resource.
     * 
     */
    public Output<String> getType() {
        return this.type;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public BatchAccount(String name) {
        this(name, BatchAccountArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public BatchAccount(String name, BatchAccountArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public BatchAccount(String name, BatchAccountArgs args, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("azure-native:batch:BatchAccount", name, args == null ? BatchAccountArgs.Empty : args, makeResourceOptions(options, Input.empty()));
    }

    private BatchAccount(String name, Input<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("azure-native:batch:BatchAccount", name, null, makeResourceOptions(options, id));
    }

    private static io.pulumi.resources.CustomResourceOptions makeResourceOptions(@Nullable io.pulumi.resources.CustomResourceOptions options, @Nullable Input<String> id) {
        var defaultOptions = io.pulumi.resources.CustomResourceOptions.builder()
            .setVersion(Utilities.getVersion())
            .setAliases(List.of(
                Input.of(Alias.builder().setType("azure-native:batch/v20151201:BatchAccount").build()),
                Input.of(Alias.builder().setType("azure-native:batch/v20170101:BatchAccount").build()),
                Input.of(Alias.builder().setType("azure-native:batch/v20170501:BatchAccount").build()),
                Input.of(Alias.builder().setType("azure-native:batch/v20170901:BatchAccount").build()),
                Input.of(Alias.builder().setType("azure-native:batch/v20181201:BatchAccount").build()),
                Input.of(Alias.builder().setType("azure-native:batch/v20190401:BatchAccount").build()),
                Input.of(Alias.builder().setType("azure-native:batch/v20190801:BatchAccount").build()),
                Input.of(Alias.builder().setType("azure-native:batch/v20200301:BatchAccount").build()),
                Input.of(Alias.builder().setType("azure-native:batch/v20200501:BatchAccount").build()),
                Input.of(Alias.builder().setType("azure-native:batch/v20200901:BatchAccount").build()),
                Input.of(Alias.builder().setType("azure-native:batch/v20210101:BatchAccount").build()),
                Input.of(Alias.builder().setType("azure-native:batch/v20210601:BatchAccount").build())
            ))
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
    public static BatchAccount get(String name, Input<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        return new BatchAccount(name, id, options);
    }
}
