// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.keyvault.inputs;

import io.pulumi.azurenative.keyvault.enums.CreateMode;
import io.pulumi.azurenative.keyvault.enums.VaultProvisioningState;
import io.pulumi.azurenative.keyvault.inputs.AccessPolicyEntryArgs;
import io.pulumi.azurenative.keyvault.inputs.NetworkRuleSetArgs;
import io.pulumi.azurenative.keyvault.inputs.SkuArgs;
import io.pulumi.core.Either;
import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * Properties of the vault
 * 
 */
public final class VaultPropertiesArgs extends io.pulumi.resources.ResourceArgs {

    public static final VaultPropertiesArgs Empty = new VaultPropertiesArgs();

    /**
     * An array of 0 to 1024 identities that have access to the key vault. All identities in the array must use the same tenant ID as the key vault's tenant ID. When `createMode` is set to `recover`, access policies are not required. Otherwise, access policies are required.
     * 
     */
    @InputImport(name="accessPolicies")
      private final @Nullable Input<List<AccessPolicyEntryArgs>> accessPolicies;

    public Input<List<AccessPolicyEntryArgs>> getAccessPolicies() {
        return this.accessPolicies == null ? Input.empty() : this.accessPolicies;
    }

    /**
     * The vault's create mode to indicate whether the vault need to be recovered or not.
     * 
     */
    @InputImport(name="createMode")
      private final @Nullable Input<CreateMode> createMode;

    public Input<CreateMode> getCreateMode() {
        return this.createMode == null ? Input.empty() : this.createMode;
    }

    /**
     * Property specifying whether protection against purge is enabled for this vault. Setting this property to true activates protection against purge for this vault and its content - only the Key Vault service may initiate a hard, irrecoverable deletion. The setting is effective only if soft delete is also enabled. Enabling this functionality is irreversible - that is, the property does not accept false as its value.
     * 
     */
    @InputImport(name="enablePurgeProtection")
      private final @Nullable Input<Boolean> enablePurgeProtection;

    public Input<Boolean> getEnablePurgeProtection() {
        return this.enablePurgeProtection == null ? Input.empty() : this.enablePurgeProtection;
    }

    /**
     * Property that controls how data actions are authorized. When true, the key vault will use Role Based Access Control (RBAC) for authorization of data actions, and the access policies specified in vault properties will be  ignored. When false, the key vault will use the access policies specified in vault properties, and any policy stored on Azure Resource Manager will be ignored. If null or not specified, the vault is created with the default value of false. Note that management actions are always authorized with RBAC.
     * 
     */
    @InputImport(name="enableRbacAuthorization")
      private final @Nullable Input<Boolean> enableRbacAuthorization;

    public Input<Boolean> getEnableRbacAuthorization() {
        return this.enableRbacAuthorization == null ? Input.empty() : this.enableRbacAuthorization;
    }

    /**
     * Property to specify whether the 'soft delete' functionality is enabled for this key vault. If it's not set to any value(true or false) when creating new key vault, it will be set to true by default. Once set to true, it cannot be reverted to false.
     * 
     */
    @InputImport(name="enableSoftDelete")
      private final @Nullable Input<Boolean> enableSoftDelete;

    public Input<Boolean> getEnableSoftDelete() {
        return this.enableSoftDelete == null ? Input.empty() : this.enableSoftDelete;
    }

    /**
     * Property to specify whether Azure Virtual Machines are permitted to retrieve certificates stored as secrets from the key vault.
     * 
     */
    @InputImport(name="enabledForDeployment")
      private final @Nullable Input<Boolean> enabledForDeployment;

    public Input<Boolean> getEnabledForDeployment() {
        return this.enabledForDeployment == null ? Input.empty() : this.enabledForDeployment;
    }

    /**
     * Property to specify whether Azure Disk Encryption is permitted to retrieve secrets from the vault and unwrap keys.
     * 
     */
    @InputImport(name="enabledForDiskEncryption")
      private final @Nullable Input<Boolean> enabledForDiskEncryption;

    public Input<Boolean> getEnabledForDiskEncryption() {
        return this.enabledForDiskEncryption == null ? Input.empty() : this.enabledForDiskEncryption;
    }

    /**
     * Property to specify whether Azure Resource Manager is permitted to retrieve secrets from the key vault.
     * 
     */
    @InputImport(name="enabledForTemplateDeployment")
      private final @Nullable Input<Boolean> enabledForTemplateDeployment;

    public Input<Boolean> getEnabledForTemplateDeployment() {
        return this.enabledForTemplateDeployment == null ? Input.empty() : this.enabledForTemplateDeployment;
    }

    /**
     * Rules governing the accessibility of the key vault from specific network locations.
     * 
     */
    @InputImport(name="networkAcls")
      private final @Nullable Input<NetworkRuleSetArgs> networkAcls;

    public Input<NetworkRuleSetArgs> getNetworkAcls() {
        return this.networkAcls == null ? Input.empty() : this.networkAcls;
    }

    /**
     * Provisioning state of the vault.
     * 
     */
    @InputImport(name="provisioningState")
      private final @Nullable Input<Either<String,VaultProvisioningState>> provisioningState;

    public Input<Either<String,VaultProvisioningState>> getProvisioningState() {
        return this.provisioningState == null ? Input.empty() : this.provisioningState;
    }

    /**
     * SKU details
     * 
     */
    @InputImport(name="sku", required=true)
      private final Input<SkuArgs> sku;

    public Input<SkuArgs> getSku() {
        return this.sku;
    }

    /**
     * softDelete data retention days. It accepts >=7 and <=90.
     * 
     */
    @InputImport(name="softDeleteRetentionInDays")
      private final @Nullable Input<Integer> softDeleteRetentionInDays;

    public Input<Integer> getSoftDeleteRetentionInDays() {
        return this.softDeleteRetentionInDays == null ? Input.empty() : this.softDeleteRetentionInDays;
    }

    /**
     * The Azure Active Directory tenant ID that should be used for authenticating requests to the key vault.
     * 
     */
    @InputImport(name="tenantId", required=true)
      private final Input<String> tenantId;

    public Input<String> getTenantId() {
        return this.tenantId;
    }

    /**
     * The URI of the vault for performing operations on keys and secrets. This property is readonly
     * 
     */
    @InputImport(name="vaultUri")
      private final @Nullable Input<String> vaultUri;

    public Input<String> getVaultUri() {
        return this.vaultUri == null ? Input.empty() : this.vaultUri;
    }

    public VaultPropertiesArgs(
        @Nullable Input<List<AccessPolicyEntryArgs>> accessPolicies,
        @Nullable Input<CreateMode> createMode,
        @Nullable Input<Boolean> enablePurgeProtection,
        @Nullable Input<Boolean> enableRbacAuthorization,
        @Nullable Input<Boolean> enableSoftDelete,
        @Nullable Input<Boolean> enabledForDeployment,
        @Nullable Input<Boolean> enabledForDiskEncryption,
        @Nullable Input<Boolean> enabledForTemplateDeployment,
        @Nullable Input<NetworkRuleSetArgs> networkAcls,
        @Nullable Input<Either<String,VaultProvisioningState>> provisioningState,
        Input<SkuArgs> sku,
        @Nullable Input<Integer> softDeleteRetentionInDays,
        Input<String> tenantId,
        @Nullable Input<String> vaultUri) {
        this.accessPolicies = accessPolicies;
        this.createMode = createMode;
        this.enablePurgeProtection = enablePurgeProtection;
        this.enableRbacAuthorization = enableRbacAuthorization == null ? Input.ofNullable(false) : enableRbacAuthorization;
        this.enableSoftDelete = enableSoftDelete == null ? Input.ofNullable(true) : enableSoftDelete;
        this.enabledForDeployment = enabledForDeployment;
        this.enabledForDiskEncryption = enabledForDiskEncryption;
        this.enabledForTemplateDeployment = enabledForTemplateDeployment;
        this.networkAcls = networkAcls;
        this.provisioningState = provisioningState;
        this.sku = Objects.requireNonNull(sku, "expected parameter 'sku' to be non-null");
        this.softDeleteRetentionInDays = softDeleteRetentionInDays == null ? Input.ofNullable(90) : softDeleteRetentionInDays;
        this.tenantId = Objects.requireNonNull(tenantId, "expected parameter 'tenantId' to be non-null");
        this.vaultUri = vaultUri;
    }

    private VaultPropertiesArgs() {
        this.accessPolicies = Input.empty();
        this.createMode = Input.empty();
        this.enablePurgeProtection = Input.empty();
        this.enableRbacAuthorization = Input.empty();
        this.enableSoftDelete = Input.empty();
        this.enabledForDeployment = Input.empty();
        this.enabledForDiskEncryption = Input.empty();
        this.enabledForTemplateDeployment = Input.empty();
        this.networkAcls = Input.empty();
        this.provisioningState = Input.empty();
        this.sku = Input.empty();
        this.softDeleteRetentionInDays = Input.empty();
        this.tenantId = Input.empty();
        this.vaultUri = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(VaultPropertiesArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<List<AccessPolicyEntryArgs>> accessPolicies;
        private @Nullable Input<CreateMode> createMode;
        private @Nullable Input<Boolean> enablePurgeProtection;
        private @Nullable Input<Boolean> enableRbacAuthorization;
        private @Nullable Input<Boolean> enableSoftDelete;
        private @Nullable Input<Boolean> enabledForDeployment;
        private @Nullable Input<Boolean> enabledForDiskEncryption;
        private @Nullable Input<Boolean> enabledForTemplateDeployment;
        private @Nullable Input<NetworkRuleSetArgs> networkAcls;
        private @Nullable Input<Either<String,VaultProvisioningState>> provisioningState;
        private Input<SkuArgs> sku;
        private @Nullable Input<Integer> softDeleteRetentionInDays;
        private Input<String> tenantId;
        private @Nullable Input<String> vaultUri;

        public Builder() {
    	      // Empty
        }

        public Builder(VaultPropertiesArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.accessPolicies = defaults.accessPolicies;
    	      this.createMode = defaults.createMode;
    	      this.enablePurgeProtection = defaults.enablePurgeProtection;
    	      this.enableRbacAuthorization = defaults.enableRbacAuthorization;
    	      this.enableSoftDelete = defaults.enableSoftDelete;
    	      this.enabledForDeployment = defaults.enabledForDeployment;
    	      this.enabledForDiskEncryption = defaults.enabledForDiskEncryption;
    	      this.enabledForTemplateDeployment = defaults.enabledForTemplateDeployment;
    	      this.networkAcls = defaults.networkAcls;
    	      this.provisioningState = defaults.provisioningState;
    	      this.sku = defaults.sku;
    	      this.softDeleteRetentionInDays = defaults.softDeleteRetentionInDays;
    	      this.tenantId = defaults.tenantId;
    	      this.vaultUri = defaults.vaultUri;
        }

        public Builder setAccessPolicies(@Nullable Input<List<AccessPolicyEntryArgs>> accessPolicies) {
            this.accessPolicies = accessPolicies;
            return this;
        }

        public Builder setAccessPolicies(@Nullable List<AccessPolicyEntryArgs> accessPolicies) {
            this.accessPolicies = Input.ofNullable(accessPolicies);
            return this;
        }

        public Builder setCreateMode(@Nullable Input<CreateMode> createMode) {
            this.createMode = createMode;
            return this;
        }

        public Builder setCreateMode(@Nullable CreateMode createMode) {
            this.createMode = Input.ofNullable(createMode);
            return this;
        }

        public Builder setEnablePurgeProtection(@Nullable Input<Boolean> enablePurgeProtection) {
            this.enablePurgeProtection = enablePurgeProtection;
            return this;
        }

        public Builder setEnablePurgeProtection(@Nullable Boolean enablePurgeProtection) {
            this.enablePurgeProtection = Input.ofNullable(enablePurgeProtection);
            return this;
        }

        public Builder setEnableRbacAuthorization(@Nullable Input<Boolean> enableRbacAuthorization) {
            this.enableRbacAuthorization = enableRbacAuthorization;
            return this;
        }

        public Builder setEnableRbacAuthorization(@Nullable Boolean enableRbacAuthorization) {
            this.enableRbacAuthorization = Input.ofNullable(enableRbacAuthorization);
            return this;
        }

        public Builder setEnableSoftDelete(@Nullable Input<Boolean> enableSoftDelete) {
            this.enableSoftDelete = enableSoftDelete;
            return this;
        }

        public Builder setEnableSoftDelete(@Nullable Boolean enableSoftDelete) {
            this.enableSoftDelete = Input.ofNullable(enableSoftDelete);
            return this;
        }

        public Builder setEnabledForDeployment(@Nullable Input<Boolean> enabledForDeployment) {
            this.enabledForDeployment = enabledForDeployment;
            return this;
        }

        public Builder setEnabledForDeployment(@Nullable Boolean enabledForDeployment) {
            this.enabledForDeployment = Input.ofNullable(enabledForDeployment);
            return this;
        }

        public Builder setEnabledForDiskEncryption(@Nullable Input<Boolean> enabledForDiskEncryption) {
            this.enabledForDiskEncryption = enabledForDiskEncryption;
            return this;
        }

        public Builder setEnabledForDiskEncryption(@Nullable Boolean enabledForDiskEncryption) {
            this.enabledForDiskEncryption = Input.ofNullable(enabledForDiskEncryption);
            return this;
        }

        public Builder setEnabledForTemplateDeployment(@Nullable Input<Boolean> enabledForTemplateDeployment) {
            this.enabledForTemplateDeployment = enabledForTemplateDeployment;
            return this;
        }

        public Builder setEnabledForTemplateDeployment(@Nullable Boolean enabledForTemplateDeployment) {
            this.enabledForTemplateDeployment = Input.ofNullable(enabledForTemplateDeployment);
            return this;
        }

        public Builder setNetworkAcls(@Nullable Input<NetworkRuleSetArgs> networkAcls) {
            this.networkAcls = networkAcls;
            return this;
        }

        public Builder setNetworkAcls(@Nullable NetworkRuleSetArgs networkAcls) {
            this.networkAcls = Input.ofNullable(networkAcls);
            return this;
        }

        public Builder setProvisioningState(@Nullable Input<Either<String,VaultProvisioningState>> provisioningState) {
            this.provisioningState = provisioningState;
            return this;
        }

        public Builder setProvisioningState(@Nullable Either<String,VaultProvisioningState> provisioningState) {
            this.provisioningState = Input.ofNullable(provisioningState);
            return this;
        }

        public Builder setSku(Input<SkuArgs> sku) {
            this.sku = Objects.requireNonNull(sku);
            return this;
        }

        public Builder setSku(SkuArgs sku) {
            this.sku = Input.of(Objects.requireNonNull(sku));
            return this;
        }

        public Builder setSoftDeleteRetentionInDays(@Nullable Input<Integer> softDeleteRetentionInDays) {
            this.softDeleteRetentionInDays = softDeleteRetentionInDays;
            return this;
        }

        public Builder setSoftDeleteRetentionInDays(@Nullable Integer softDeleteRetentionInDays) {
            this.softDeleteRetentionInDays = Input.ofNullable(softDeleteRetentionInDays);
            return this;
        }

        public Builder setTenantId(Input<String> tenantId) {
            this.tenantId = Objects.requireNonNull(tenantId);
            return this;
        }

        public Builder setTenantId(String tenantId) {
            this.tenantId = Input.of(Objects.requireNonNull(tenantId));
            return this;
        }

        public Builder setVaultUri(@Nullable Input<String> vaultUri) {
            this.vaultUri = vaultUri;
            return this;
        }

        public Builder setVaultUri(@Nullable String vaultUri) {
            this.vaultUri = Input.ofNullable(vaultUri);
            return this;
        }
        public VaultPropertiesArgs build() {
            return new VaultPropertiesArgs(accessPolicies, createMode, enablePurgeProtection, enableRbacAuthorization, enableSoftDelete, enabledForDeployment, enabledForDiskEncryption, enabledForTemplateDeployment, networkAcls, provisioningState, sku, softDeleteRetentionInDays, tenantId, vaultUri);
        }
    }
}
