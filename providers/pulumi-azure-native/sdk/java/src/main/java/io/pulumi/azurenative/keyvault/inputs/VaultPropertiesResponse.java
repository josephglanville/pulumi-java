// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.keyvault.inputs;

import io.pulumi.azurenative.keyvault.inputs.AccessPolicyEntryResponse;
import io.pulumi.azurenative.keyvault.inputs.NetworkRuleSetResponse;
import io.pulumi.azurenative.keyvault.inputs.PrivateEndpointConnectionItemResponse;
import io.pulumi.azurenative.keyvault.inputs.SkuResponse;
import io.pulumi.core.annotations.InputImport;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Properties of the vault
 * 
 */
public final class VaultPropertiesResponse extends io.pulumi.resources.InvokeArgs {

    public static final VaultPropertiesResponse Empty = new VaultPropertiesResponse();

    /**
     * An array of 0 to 1024 identities that have access to the key vault. All identities in the array must use the same tenant ID as the key vault's tenant ID. When `createMode` is set to `recover`, access policies are not required. Otherwise, access policies are required.
     * 
     */
    @InputImport(name="accessPolicies")
      private final @Nullable List<AccessPolicyEntryResponse> accessPolicies;

    public List<AccessPolicyEntryResponse> getAccessPolicies() {
        return this.accessPolicies == null ? List.of() : this.accessPolicies;
    }

    /**
     * Property specifying whether protection against purge is enabled for this vault. Setting this property to true activates protection against purge for this vault and its content - only the Key Vault service may initiate a hard, irrecoverable deletion. The setting is effective only if soft delete is also enabled. Enabling this functionality is irreversible - that is, the property does not accept false as its value.
     * 
     */
    @InputImport(name="enablePurgeProtection")
      private final @Nullable Boolean enablePurgeProtection;

    public Optional<Boolean> getEnablePurgeProtection() {
        return this.enablePurgeProtection == null ? Optional.empty() : Optional.ofNullable(this.enablePurgeProtection);
    }

    /**
     * Property that controls how data actions are authorized. When true, the key vault will use Role Based Access Control (RBAC) for authorization of data actions, and the access policies specified in vault properties will be  ignored. When false, the key vault will use the access policies specified in vault properties, and any policy stored on Azure Resource Manager will be ignored. If null or not specified, the vault is created with the default value of false. Note that management actions are always authorized with RBAC.
     * 
     */
    @InputImport(name="enableRbacAuthorization")
      private final @Nullable Boolean enableRbacAuthorization;

    public Optional<Boolean> getEnableRbacAuthorization() {
        return this.enableRbacAuthorization == null ? Optional.empty() : Optional.ofNullable(this.enableRbacAuthorization);
    }

    /**
     * Property to specify whether the 'soft delete' functionality is enabled for this key vault. If it's not set to any value(true or false) when creating new key vault, it will be set to true by default. Once set to true, it cannot be reverted to false.
     * 
     */
    @InputImport(name="enableSoftDelete")
      private final @Nullable Boolean enableSoftDelete;

    public Optional<Boolean> getEnableSoftDelete() {
        return this.enableSoftDelete == null ? Optional.empty() : Optional.ofNullable(this.enableSoftDelete);
    }

    /**
     * Property to specify whether Azure Virtual Machines are permitted to retrieve certificates stored as secrets from the key vault.
     * 
     */
    @InputImport(name="enabledForDeployment")
      private final @Nullable Boolean enabledForDeployment;

    public Optional<Boolean> getEnabledForDeployment() {
        return this.enabledForDeployment == null ? Optional.empty() : Optional.ofNullable(this.enabledForDeployment);
    }

    /**
     * Property to specify whether Azure Disk Encryption is permitted to retrieve secrets from the vault and unwrap keys.
     * 
     */
    @InputImport(name="enabledForDiskEncryption")
      private final @Nullable Boolean enabledForDiskEncryption;

    public Optional<Boolean> getEnabledForDiskEncryption() {
        return this.enabledForDiskEncryption == null ? Optional.empty() : Optional.ofNullable(this.enabledForDiskEncryption);
    }

    /**
     * Property to specify whether Azure Resource Manager is permitted to retrieve secrets from the key vault.
     * 
     */
    @InputImport(name="enabledForTemplateDeployment")
      private final @Nullable Boolean enabledForTemplateDeployment;

    public Optional<Boolean> getEnabledForTemplateDeployment() {
        return this.enabledForTemplateDeployment == null ? Optional.empty() : Optional.ofNullable(this.enabledForTemplateDeployment);
    }

    /**
     * The resource id of HSM Pool.
     * 
     */
    @InputImport(name="hsmPoolResourceId", required=true)
      private final String hsmPoolResourceId;

    public String getHsmPoolResourceId() {
        return this.hsmPoolResourceId;
    }

    /**
     * Rules governing the accessibility of the key vault from specific network locations.
     * 
     */
    @InputImport(name="networkAcls")
      private final @Nullable NetworkRuleSetResponse networkAcls;

    public Optional<NetworkRuleSetResponse> getNetworkAcls() {
        return this.networkAcls == null ? Optional.empty() : Optional.ofNullable(this.networkAcls);
    }

    /**
     * List of private endpoint connections associated with the key vault.
     * 
     */
    @InputImport(name="privateEndpointConnections", required=true)
      private final List<PrivateEndpointConnectionItemResponse> privateEndpointConnections;

    public List<PrivateEndpointConnectionItemResponse> getPrivateEndpointConnections() {
        return this.privateEndpointConnections;
    }

    /**
     * Provisioning state of the vault.
     * 
     */
    @InputImport(name="provisioningState")
      private final @Nullable String provisioningState;

    public Optional<String> getProvisioningState() {
        return this.provisioningState == null ? Optional.empty() : Optional.ofNullable(this.provisioningState);
    }

    /**
     * SKU details
     * 
     */
    @InputImport(name="sku", required=true)
      private final SkuResponse sku;

    public SkuResponse getSku() {
        return this.sku;
    }

    /**
     * softDelete data retention days. It accepts >=7 and <=90.
     * 
     */
    @InputImport(name="softDeleteRetentionInDays")
      private final @Nullable Integer softDeleteRetentionInDays;

    public Optional<Integer> getSoftDeleteRetentionInDays() {
        return this.softDeleteRetentionInDays == null ? Optional.empty() : Optional.ofNullable(this.softDeleteRetentionInDays);
    }

    /**
     * The Azure Active Directory tenant ID that should be used for authenticating requests to the key vault.
     * 
     */
    @InputImport(name="tenantId", required=true)
      private final String tenantId;

    public String getTenantId() {
        return this.tenantId;
    }

    /**
     * The URI of the vault for performing operations on keys and secrets. This property is readonly
     * 
     */
    @InputImport(name="vaultUri")
      private final @Nullable String vaultUri;

    public Optional<String> getVaultUri() {
        return this.vaultUri == null ? Optional.empty() : Optional.ofNullable(this.vaultUri);
    }

    public VaultPropertiesResponse(
        @Nullable List<AccessPolicyEntryResponse> accessPolicies,
        @Nullable Boolean enablePurgeProtection,
        @Nullable Boolean enableRbacAuthorization,
        @Nullable Boolean enableSoftDelete,
        @Nullable Boolean enabledForDeployment,
        @Nullable Boolean enabledForDiskEncryption,
        @Nullable Boolean enabledForTemplateDeployment,
        String hsmPoolResourceId,
        @Nullable NetworkRuleSetResponse networkAcls,
        List<PrivateEndpointConnectionItemResponse> privateEndpointConnections,
        @Nullable String provisioningState,
        SkuResponse sku,
        @Nullable Integer softDeleteRetentionInDays,
        String tenantId,
        @Nullable String vaultUri) {
        this.accessPolicies = accessPolicies;
        this.enablePurgeProtection = enablePurgeProtection;
        this.enableRbacAuthorization = enableRbacAuthorization == null ? false : enableRbacAuthorization;
        this.enableSoftDelete = enableSoftDelete == null ? true : enableSoftDelete;
        this.enabledForDeployment = enabledForDeployment;
        this.enabledForDiskEncryption = enabledForDiskEncryption;
        this.enabledForTemplateDeployment = enabledForTemplateDeployment;
        this.hsmPoolResourceId = Objects.requireNonNull(hsmPoolResourceId, "expected parameter 'hsmPoolResourceId' to be non-null");
        this.networkAcls = networkAcls;
        this.privateEndpointConnections = Objects.requireNonNull(privateEndpointConnections, "expected parameter 'privateEndpointConnections' to be non-null");
        this.provisioningState = provisioningState;
        this.sku = Objects.requireNonNull(sku, "expected parameter 'sku' to be non-null");
        this.softDeleteRetentionInDays = softDeleteRetentionInDays == null ? 90 : softDeleteRetentionInDays;
        this.tenantId = Objects.requireNonNull(tenantId, "expected parameter 'tenantId' to be non-null");
        this.vaultUri = vaultUri;
    }

    private VaultPropertiesResponse() {
        this.accessPolicies = List.of();
        this.enablePurgeProtection = null;
        this.enableRbacAuthorization = null;
        this.enableSoftDelete = null;
        this.enabledForDeployment = null;
        this.enabledForDiskEncryption = null;
        this.enabledForTemplateDeployment = null;
        this.hsmPoolResourceId = null;
        this.networkAcls = null;
        this.privateEndpointConnections = List.of();
        this.provisioningState = null;
        this.sku = null;
        this.softDeleteRetentionInDays = null;
        this.tenantId = null;
        this.vaultUri = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(VaultPropertiesResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable List<AccessPolicyEntryResponse> accessPolicies;
        private @Nullable Boolean enablePurgeProtection;
        private @Nullable Boolean enableRbacAuthorization;
        private @Nullable Boolean enableSoftDelete;
        private @Nullable Boolean enabledForDeployment;
        private @Nullable Boolean enabledForDiskEncryption;
        private @Nullable Boolean enabledForTemplateDeployment;
        private String hsmPoolResourceId;
        private @Nullable NetworkRuleSetResponse networkAcls;
        private List<PrivateEndpointConnectionItemResponse> privateEndpointConnections;
        private @Nullable String provisioningState;
        private SkuResponse sku;
        private @Nullable Integer softDeleteRetentionInDays;
        private String tenantId;
        private @Nullable String vaultUri;

        public Builder() {
    	      // Empty
        }

        public Builder(VaultPropertiesResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.accessPolicies = defaults.accessPolicies;
    	      this.enablePurgeProtection = defaults.enablePurgeProtection;
    	      this.enableRbacAuthorization = defaults.enableRbacAuthorization;
    	      this.enableSoftDelete = defaults.enableSoftDelete;
    	      this.enabledForDeployment = defaults.enabledForDeployment;
    	      this.enabledForDiskEncryption = defaults.enabledForDiskEncryption;
    	      this.enabledForTemplateDeployment = defaults.enabledForTemplateDeployment;
    	      this.hsmPoolResourceId = defaults.hsmPoolResourceId;
    	      this.networkAcls = defaults.networkAcls;
    	      this.privateEndpointConnections = defaults.privateEndpointConnections;
    	      this.provisioningState = defaults.provisioningState;
    	      this.sku = defaults.sku;
    	      this.softDeleteRetentionInDays = defaults.softDeleteRetentionInDays;
    	      this.tenantId = defaults.tenantId;
    	      this.vaultUri = defaults.vaultUri;
        }

        public Builder setAccessPolicies(@Nullable List<AccessPolicyEntryResponse> accessPolicies) {
            this.accessPolicies = accessPolicies;
            return this;
        }

        public Builder setEnablePurgeProtection(@Nullable Boolean enablePurgeProtection) {
            this.enablePurgeProtection = enablePurgeProtection;
            return this;
        }

        public Builder setEnableRbacAuthorization(@Nullable Boolean enableRbacAuthorization) {
            this.enableRbacAuthorization = enableRbacAuthorization;
            return this;
        }

        public Builder setEnableSoftDelete(@Nullable Boolean enableSoftDelete) {
            this.enableSoftDelete = enableSoftDelete;
            return this;
        }

        public Builder setEnabledForDeployment(@Nullable Boolean enabledForDeployment) {
            this.enabledForDeployment = enabledForDeployment;
            return this;
        }

        public Builder setEnabledForDiskEncryption(@Nullable Boolean enabledForDiskEncryption) {
            this.enabledForDiskEncryption = enabledForDiskEncryption;
            return this;
        }

        public Builder setEnabledForTemplateDeployment(@Nullable Boolean enabledForTemplateDeployment) {
            this.enabledForTemplateDeployment = enabledForTemplateDeployment;
            return this;
        }

        public Builder setHsmPoolResourceId(String hsmPoolResourceId) {
            this.hsmPoolResourceId = Objects.requireNonNull(hsmPoolResourceId);
            return this;
        }

        public Builder setNetworkAcls(@Nullable NetworkRuleSetResponse networkAcls) {
            this.networkAcls = networkAcls;
            return this;
        }

        public Builder setPrivateEndpointConnections(List<PrivateEndpointConnectionItemResponse> privateEndpointConnections) {
            this.privateEndpointConnections = Objects.requireNonNull(privateEndpointConnections);
            return this;
        }

        public Builder setProvisioningState(@Nullable String provisioningState) {
            this.provisioningState = provisioningState;
            return this;
        }

        public Builder setSku(SkuResponse sku) {
            this.sku = Objects.requireNonNull(sku);
            return this;
        }

        public Builder setSoftDeleteRetentionInDays(@Nullable Integer softDeleteRetentionInDays) {
            this.softDeleteRetentionInDays = softDeleteRetentionInDays;
            return this;
        }

        public Builder setTenantId(String tenantId) {
            this.tenantId = Objects.requireNonNull(tenantId);
            return this;
        }

        public Builder setVaultUri(@Nullable String vaultUri) {
            this.vaultUri = vaultUri;
            return this;
        }
        public VaultPropertiesResponse build() {
            return new VaultPropertiesResponse(accessPolicies, enablePurgeProtection, enableRbacAuthorization, enableSoftDelete, enabledForDeployment, enabledForDiskEncryption, enabledForTemplateDeployment, hsmPoolResourceId, networkAcls, privateEndpointConnections, provisioningState, sku, softDeleteRetentionInDays, tenantId, vaultUri);
        }
    }
}
