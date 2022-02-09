// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.datashare.outputs;

import io.pulumi.azurenative.datashare.outputs.SystemDataResponse;
import io.pulumi.core.internal.annotations.OutputCustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class GetBlobDataSetMappingResult {
    private final String containerName;
    private final String dataSetId;
    private final String dataSetMappingStatus;
    private final String filePath;
    private final String id;
    private final String kind;
    private final String name;
    private final @Nullable String outputType;
    private final String provisioningState;
    private final String resourceGroup;
    private final String storageAccountName;
    private final String subscriptionId;
    private final SystemDataResponse systemData;
    private final String type;

    @OutputCustomType.Constructor({"containerName","dataSetId","dataSetMappingStatus","filePath","id","kind","name","outputType","provisioningState","resourceGroup","storageAccountName","subscriptionId","systemData","type"})
    private GetBlobDataSetMappingResult(
        String containerName,
        String dataSetId,
        String dataSetMappingStatus,
        String filePath,
        String id,
        String kind,
        String name,
        @Nullable String outputType,
        String provisioningState,
        String resourceGroup,
        String storageAccountName,
        String subscriptionId,
        SystemDataResponse systemData,
        String type) {
        this.containerName = Objects.requireNonNull(containerName);
        this.dataSetId = Objects.requireNonNull(dataSetId);
        this.dataSetMappingStatus = Objects.requireNonNull(dataSetMappingStatus);
        this.filePath = Objects.requireNonNull(filePath);
        this.id = Objects.requireNonNull(id);
        this.kind = Objects.requireNonNull(kind);
        this.name = Objects.requireNonNull(name);
        this.outputType = outputType;
        this.provisioningState = Objects.requireNonNull(provisioningState);
        this.resourceGroup = Objects.requireNonNull(resourceGroup);
        this.storageAccountName = Objects.requireNonNull(storageAccountName);
        this.subscriptionId = Objects.requireNonNull(subscriptionId);
        this.systemData = Objects.requireNonNull(systemData);
        this.type = Objects.requireNonNull(type);
    }

    public String getContainerName() {
        return this.containerName;
    }
    public String getDataSetId() {
        return this.dataSetId;
    }
    public String getDataSetMappingStatus() {
        return this.dataSetMappingStatus;
    }
    public String getFilePath() {
        return this.filePath;
    }
    public String getId() {
        return this.id;
    }
    public String getKind() {
        return this.kind;
    }
    public String getName() {
        return this.name;
    }
    public Optional<String> getOutputType() {
        return Optional.ofNullable(this.outputType);
    }
    public String getProvisioningState() {
        return this.provisioningState;
    }
    public String getResourceGroup() {
        return this.resourceGroup;
    }
    public String getStorageAccountName() {
        return this.storageAccountName;
    }
    public String getSubscriptionId() {
        return this.subscriptionId;
    }
    public SystemDataResponse getSystemData() {
        return this.systemData;
    }
    public String getType() {
        return this.type;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetBlobDataSetMappingResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String containerName;
        private String dataSetId;
        private String dataSetMappingStatus;
        private String filePath;
        private String id;
        private String kind;
        private String name;
        private @Nullable String outputType;
        private String provisioningState;
        private String resourceGroup;
        private String storageAccountName;
        private String subscriptionId;
        private SystemDataResponse systemData;
        private String type;

        public Builder() {
    	      // Empty
        }

        public Builder(GetBlobDataSetMappingResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.containerName = defaults.containerName;
    	      this.dataSetId = defaults.dataSetId;
    	      this.dataSetMappingStatus = defaults.dataSetMappingStatus;
    	      this.filePath = defaults.filePath;
    	      this.id = defaults.id;
    	      this.kind = defaults.kind;
    	      this.name = defaults.name;
    	      this.outputType = defaults.outputType;
    	      this.provisioningState = defaults.provisioningState;
    	      this.resourceGroup = defaults.resourceGroup;
    	      this.storageAccountName = defaults.storageAccountName;
    	      this.subscriptionId = defaults.subscriptionId;
    	      this.systemData = defaults.systemData;
    	      this.type = defaults.type;
        }

        public Builder setContainerName(String containerName) {
            this.containerName = Objects.requireNonNull(containerName);
            return this;
        }

        public Builder setDataSetId(String dataSetId) {
            this.dataSetId = Objects.requireNonNull(dataSetId);
            return this;
        }

        public Builder setDataSetMappingStatus(String dataSetMappingStatus) {
            this.dataSetMappingStatus = Objects.requireNonNull(dataSetMappingStatus);
            return this;
        }

        public Builder setFilePath(String filePath) {
            this.filePath = Objects.requireNonNull(filePath);
            return this;
        }

        public Builder setId(String id) {
            this.id = Objects.requireNonNull(id);
            return this;
        }

        public Builder setKind(String kind) {
            this.kind = Objects.requireNonNull(kind);
            return this;
        }

        public Builder setName(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }

        public Builder setOutputType(@Nullable String outputType) {
            this.outputType = outputType;
            return this;
        }

        public Builder setProvisioningState(String provisioningState) {
            this.provisioningState = Objects.requireNonNull(provisioningState);
            return this;
        }

        public Builder setResourceGroup(String resourceGroup) {
            this.resourceGroup = Objects.requireNonNull(resourceGroup);
            return this;
        }

        public Builder setStorageAccountName(String storageAccountName) {
            this.storageAccountName = Objects.requireNonNull(storageAccountName);
            return this;
        }

        public Builder setSubscriptionId(String subscriptionId) {
            this.subscriptionId = Objects.requireNonNull(subscriptionId);
            return this;
        }

        public Builder setSystemData(SystemDataResponse systemData) {
            this.systemData = Objects.requireNonNull(systemData);
            return this;
        }

        public Builder setType(String type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }

        public GetBlobDataSetMappingResult build() {
            return new GetBlobDataSetMappingResult(containerName, dataSetId, dataSetMappingStatus, filePath, id, kind, name, outputType, provisioningState, resourceGroup, storageAccountName, subscriptionId, systemData, type);
        }
    }
}
