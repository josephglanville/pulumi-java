// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.storagesync.outputs;

import io.pulumi.core.internal.annotations.OutputCustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class GetCloudEndpointResult {
    private final @Nullable String azureFileShareName;
    private final String backupEnabled;
    private final @Nullable String friendlyName;
    private final String id;
    private final @Nullable String lastOperationName;
    private final @Nullable String lastWorkflowId;
    private final String name;
    private final @Nullable String partnershipId;
    private final @Nullable String provisioningState;
    private final @Nullable String storageAccountResourceId;
    private final @Nullable String storageAccountTenantId;
    private final String type;

    @OutputCustomType.Constructor({"azureFileShareName","backupEnabled","friendlyName","id","lastOperationName","lastWorkflowId","name","partnershipId","provisioningState","storageAccountResourceId","storageAccountTenantId","type"})
    private GetCloudEndpointResult(
        @Nullable String azureFileShareName,
        String backupEnabled,
        @Nullable String friendlyName,
        String id,
        @Nullable String lastOperationName,
        @Nullable String lastWorkflowId,
        String name,
        @Nullable String partnershipId,
        @Nullable String provisioningState,
        @Nullable String storageAccountResourceId,
        @Nullable String storageAccountTenantId,
        String type) {
        this.azureFileShareName = azureFileShareName;
        this.backupEnabled = Objects.requireNonNull(backupEnabled);
        this.friendlyName = friendlyName;
        this.id = Objects.requireNonNull(id);
        this.lastOperationName = lastOperationName;
        this.lastWorkflowId = lastWorkflowId;
        this.name = Objects.requireNonNull(name);
        this.partnershipId = partnershipId;
        this.provisioningState = provisioningState;
        this.storageAccountResourceId = storageAccountResourceId;
        this.storageAccountTenantId = storageAccountTenantId;
        this.type = Objects.requireNonNull(type);
    }

    public Optional<String> getAzureFileShareName() {
        return Optional.ofNullable(this.azureFileShareName);
    }
    public String getBackupEnabled() {
        return this.backupEnabled;
    }
    public Optional<String> getFriendlyName() {
        return Optional.ofNullable(this.friendlyName);
    }
    public String getId() {
        return this.id;
    }
    public Optional<String> getLastOperationName() {
        return Optional.ofNullable(this.lastOperationName);
    }
    public Optional<String> getLastWorkflowId() {
        return Optional.ofNullable(this.lastWorkflowId);
    }
    public String getName() {
        return this.name;
    }
    public Optional<String> getPartnershipId() {
        return Optional.ofNullable(this.partnershipId);
    }
    public Optional<String> getProvisioningState() {
        return Optional.ofNullable(this.provisioningState);
    }
    public Optional<String> getStorageAccountResourceId() {
        return Optional.ofNullable(this.storageAccountResourceId);
    }
    public Optional<String> getStorageAccountTenantId() {
        return Optional.ofNullable(this.storageAccountTenantId);
    }
    public String getType() {
        return this.type;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetCloudEndpointResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String azureFileShareName;
        private String backupEnabled;
        private @Nullable String friendlyName;
        private String id;
        private @Nullable String lastOperationName;
        private @Nullable String lastWorkflowId;
        private String name;
        private @Nullable String partnershipId;
        private @Nullable String provisioningState;
        private @Nullable String storageAccountResourceId;
        private @Nullable String storageAccountTenantId;
        private String type;

        public Builder() {
    	      // Empty
        }

        public Builder(GetCloudEndpointResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.azureFileShareName = defaults.azureFileShareName;
    	      this.backupEnabled = defaults.backupEnabled;
    	      this.friendlyName = defaults.friendlyName;
    	      this.id = defaults.id;
    	      this.lastOperationName = defaults.lastOperationName;
    	      this.lastWorkflowId = defaults.lastWorkflowId;
    	      this.name = defaults.name;
    	      this.partnershipId = defaults.partnershipId;
    	      this.provisioningState = defaults.provisioningState;
    	      this.storageAccountResourceId = defaults.storageAccountResourceId;
    	      this.storageAccountTenantId = defaults.storageAccountTenantId;
    	      this.type = defaults.type;
        }

        public Builder setAzureFileShareName(@Nullable String azureFileShareName) {
            this.azureFileShareName = azureFileShareName;
            return this;
        }

        public Builder setBackupEnabled(String backupEnabled) {
            this.backupEnabled = Objects.requireNonNull(backupEnabled);
            return this;
        }

        public Builder setFriendlyName(@Nullable String friendlyName) {
            this.friendlyName = friendlyName;
            return this;
        }

        public Builder setId(String id) {
            this.id = Objects.requireNonNull(id);
            return this;
        }

        public Builder setLastOperationName(@Nullable String lastOperationName) {
            this.lastOperationName = lastOperationName;
            return this;
        }

        public Builder setLastWorkflowId(@Nullable String lastWorkflowId) {
            this.lastWorkflowId = lastWorkflowId;
            return this;
        }

        public Builder setName(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }

        public Builder setPartnershipId(@Nullable String partnershipId) {
            this.partnershipId = partnershipId;
            return this;
        }

        public Builder setProvisioningState(@Nullable String provisioningState) {
            this.provisioningState = provisioningState;
            return this;
        }

        public Builder setStorageAccountResourceId(@Nullable String storageAccountResourceId) {
            this.storageAccountResourceId = storageAccountResourceId;
            return this;
        }

        public Builder setStorageAccountTenantId(@Nullable String storageAccountTenantId) {
            this.storageAccountTenantId = storageAccountTenantId;
            return this;
        }

        public Builder setType(String type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }

        public GetCloudEndpointResult build() {
            return new GetCloudEndpointResult(azureFileShareName, backupEnabled, friendlyName, id, lastOperationName, lastWorkflowId, name, partnershipId, provisioningState, storageAccountResourceId, storageAccountTenantId, type);
        }
    }
}
