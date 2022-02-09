// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.keyvault.outputs;

import io.pulumi.azurenative.keyvault.outputs.AccessPolicyEntryResponse;
import io.pulumi.azurenative.keyvault.outputs.NetworkRuleSetResponse;
import io.pulumi.azurenative.keyvault.outputs.PrivateEndpointConnectionItemResponse;
import io.pulumi.azurenative.keyvault.outputs.SkuResponse;
import io.pulumi.core.internal.annotations.OutputCustomType;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class VaultPropertiesResponse {
    private final @Nullable List<AccessPolicyEntryResponse> accessPolicies;
    private final @Nullable Boolean enablePurgeProtection;
    private final @Nullable Boolean enableRbacAuthorization;
    private final @Nullable Boolean enableSoftDelete;
    private final @Nullable Boolean enabledForDeployment;
    private final @Nullable Boolean enabledForDiskEncryption;
    private final @Nullable Boolean enabledForTemplateDeployment;
    private final String hsmPoolResourceId;
    private final @Nullable NetworkRuleSetResponse networkAcls;
    private final List<PrivateEndpointConnectionItemResponse> privateEndpointConnections;
    private final @Nullable String provisioningState;
    private final SkuResponse sku;
    private final @Nullable Integer softDeleteRetentionInDays;
    private final String tenantId;
    private final @Nullable String vaultUri;

    @OutputCustomType.Constructor({"accessPolicies","enablePurgeProtection","enableRbacAuthorization","enableSoftDelete","enabledForDeployment","enabledForDiskEncryption","enabledForTemplateDeployment","hsmPoolResourceId","networkAcls","privateEndpointConnections","provisioningState","sku","softDeleteRetentionInDays","tenantId","vaultUri"})
    private VaultPropertiesResponse(
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
        this.enableRbacAuthorization = enableRbacAuthorization;
        this.enableSoftDelete = enableSoftDelete;
        this.enabledForDeployment = enabledForDeployment;
        this.enabledForDiskEncryption = enabledForDiskEncryption;
        this.enabledForTemplateDeployment = enabledForTemplateDeployment;
        this.hsmPoolResourceId = Objects.requireNonNull(hsmPoolResourceId);
        this.networkAcls = networkAcls;
        this.privateEndpointConnections = Objects.requireNonNull(privateEndpointConnections);
        this.provisioningState = provisioningState;
        this.sku = Objects.requireNonNull(sku);
        this.softDeleteRetentionInDays = softDeleteRetentionInDays;
        this.tenantId = Objects.requireNonNull(tenantId);
        this.vaultUri = vaultUri;
    }

    public List<AccessPolicyEntryResponse> getAccessPolicies() {
        return this.accessPolicies == null ? List.of() : this.accessPolicies;
    }
    public Optional<Boolean> getEnablePurgeProtection() {
        return Optional.ofNullable(this.enablePurgeProtection);
    }
    public Optional<Boolean> getEnableRbacAuthorization() {
        return Optional.ofNullable(this.enableRbacAuthorization);
    }
    public Optional<Boolean> getEnableSoftDelete() {
        return Optional.ofNullable(this.enableSoftDelete);
    }
    public Optional<Boolean> getEnabledForDeployment() {
        return Optional.ofNullable(this.enabledForDeployment);
    }
    public Optional<Boolean> getEnabledForDiskEncryption() {
        return Optional.ofNullable(this.enabledForDiskEncryption);
    }
    public Optional<Boolean> getEnabledForTemplateDeployment() {
        return Optional.ofNullable(this.enabledForTemplateDeployment);
    }
    public String getHsmPoolResourceId() {
        return this.hsmPoolResourceId;
    }
    public Optional<NetworkRuleSetResponse> getNetworkAcls() {
        return Optional.ofNullable(this.networkAcls);
    }
    public List<PrivateEndpointConnectionItemResponse> getPrivateEndpointConnections() {
        return this.privateEndpointConnections;
    }
    public Optional<String> getProvisioningState() {
        return Optional.ofNullable(this.provisioningState);
    }
    public SkuResponse getSku() {
        return this.sku;
    }
    public Optional<Integer> getSoftDeleteRetentionInDays() {
        return Optional.ofNullable(this.softDeleteRetentionInDays);
    }
    public String getTenantId() {
        return this.tenantId;
    }
    public Optional<String> getVaultUri() {
        return Optional.ofNullable(this.vaultUri);
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
