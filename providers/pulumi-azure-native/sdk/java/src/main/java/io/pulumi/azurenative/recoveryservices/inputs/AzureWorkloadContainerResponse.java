// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.recoveryservices.inputs;

import io.pulumi.azurenative.recoveryservices.inputs.AzureWorkloadContainerExtendedInfoResponse;
import io.pulumi.core.internal.annotations.InputImport;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class AzureWorkloadContainerResponse extends io.pulumi.resources.InvokeArgs {

    public static final AzureWorkloadContainerResponse Empty = new AzureWorkloadContainerResponse();

    @InputImport(name="backupManagementType")
    private final @Nullable String backupManagementType;

    public Optional<String> getBackupManagementType() {
        return this.backupManagementType == null ? Optional.empty() : Optional.ofNullable(this.backupManagementType);
    }

    @InputImport(name="containerType", required=true)
    private final String containerType;

    public String getContainerType() {
        return this.containerType;
    }

    @InputImport(name="extendedInfo")
    private final @Nullable AzureWorkloadContainerExtendedInfoResponse extendedInfo;

    public Optional<AzureWorkloadContainerExtendedInfoResponse> getExtendedInfo() {
        return this.extendedInfo == null ? Optional.empty() : Optional.ofNullable(this.extendedInfo);
    }

    @InputImport(name="friendlyName")
    private final @Nullable String friendlyName;

    public Optional<String> getFriendlyName() {
        return this.friendlyName == null ? Optional.empty() : Optional.ofNullable(this.friendlyName);
    }

    @InputImport(name="healthStatus")
    private final @Nullable String healthStatus;

    public Optional<String> getHealthStatus() {
        return this.healthStatus == null ? Optional.empty() : Optional.ofNullable(this.healthStatus);
    }

    @InputImport(name="lastUpdatedTime")
    private final @Nullable String lastUpdatedTime;

    public Optional<String> getLastUpdatedTime() {
        return this.lastUpdatedTime == null ? Optional.empty() : Optional.ofNullable(this.lastUpdatedTime);
    }

    @InputImport(name="operationType")
    private final @Nullable String operationType;

    public Optional<String> getOperationType() {
        return this.operationType == null ? Optional.empty() : Optional.ofNullable(this.operationType);
    }

    @InputImport(name="registrationStatus")
    private final @Nullable String registrationStatus;

    public Optional<String> getRegistrationStatus() {
        return this.registrationStatus == null ? Optional.empty() : Optional.ofNullable(this.registrationStatus);
    }

    @InputImport(name="sourceResourceId")
    private final @Nullable String sourceResourceId;

    public Optional<String> getSourceResourceId() {
        return this.sourceResourceId == null ? Optional.empty() : Optional.ofNullable(this.sourceResourceId);
    }

    @InputImport(name="workloadType")
    private final @Nullable String workloadType;

    public Optional<String> getWorkloadType() {
        return this.workloadType == null ? Optional.empty() : Optional.ofNullable(this.workloadType);
    }

    public AzureWorkloadContainerResponse(
        @Nullable String backupManagementType,
        String containerType,
        @Nullable AzureWorkloadContainerExtendedInfoResponse extendedInfo,
        @Nullable String friendlyName,
        @Nullable String healthStatus,
        @Nullable String lastUpdatedTime,
        @Nullable String operationType,
        @Nullable String registrationStatus,
        @Nullable String sourceResourceId,
        @Nullable String workloadType) {
        this.backupManagementType = backupManagementType;
        this.containerType = Objects.requireNonNull(containerType, "expected parameter 'containerType' to be non-null");
        this.extendedInfo = extendedInfo;
        this.friendlyName = friendlyName;
        this.healthStatus = healthStatus;
        this.lastUpdatedTime = lastUpdatedTime;
        this.operationType = operationType;
        this.registrationStatus = registrationStatus;
        this.sourceResourceId = sourceResourceId;
        this.workloadType = workloadType;
    }

    private AzureWorkloadContainerResponse() {
        this.backupManagementType = null;
        this.containerType = null;
        this.extendedInfo = null;
        this.friendlyName = null;
        this.healthStatus = null;
        this.lastUpdatedTime = null;
        this.operationType = null;
        this.registrationStatus = null;
        this.sourceResourceId = null;
        this.workloadType = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(AzureWorkloadContainerResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String backupManagementType;
        private String containerType;
        private @Nullable AzureWorkloadContainerExtendedInfoResponse extendedInfo;
        private @Nullable String friendlyName;
        private @Nullable String healthStatus;
        private @Nullable String lastUpdatedTime;
        private @Nullable String operationType;
        private @Nullable String registrationStatus;
        private @Nullable String sourceResourceId;
        private @Nullable String workloadType;

        public Builder() {
    	      // Empty
        }

        public Builder(AzureWorkloadContainerResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.backupManagementType = defaults.backupManagementType;
    	      this.containerType = defaults.containerType;
    	      this.extendedInfo = defaults.extendedInfo;
    	      this.friendlyName = defaults.friendlyName;
    	      this.healthStatus = defaults.healthStatus;
    	      this.lastUpdatedTime = defaults.lastUpdatedTime;
    	      this.operationType = defaults.operationType;
    	      this.registrationStatus = defaults.registrationStatus;
    	      this.sourceResourceId = defaults.sourceResourceId;
    	      this.workloadType = defaults.workloadType;
        }

        public Builder setBackupManagementType(@Nullable String backupManagementType) {
            this.backupManagementType = backupManagementType;
            return this;
        }

        public Builder setContainerType(String containerType) {
            this.containerType = Objects.requireNonNull(containerType);
            return this;
        }

        public Builder setExtendedInfo(@Nullable AzureWorkloadContainerExtendedInfoResponse extendedInfo) {
            this.extendedInfo = extendedInfo;
            return this;
        }

        public Builder setFriendlyName(@Nullable String friendlyName) {
            this.friendlyName = friendlyName;
            return this;
        }

        public Builder setHealthStatus(@Nullable String healthStatus) {
            this.healthStatus = healthStatus;
            return this;
        }

        public Builder setLastUpdatedTime(@Nullable String lastUpdatedTime) {
            this.lastUpdatedTime = lastUpdatedTime;
            return this;
        }

        public Builder setOperationType(@Nullable String operationType) {
            this.operationType = operationType;
            return this;
        }

        public Builder setRegistrationStatus(@Nullable String registrationStatus) {
            this.registrationStatus = registrationStatus;
            return this;
        }

        public Builder setSourceResourceId(@Nullable String sourceResourceId) {
            this.sourceResourceId = sourceResourceId;
            return this;
        }

        public Builder setWorkloadType(@Nullable String workloadType) {
            this.workloadType = workloadType;
            return this;
        }

        public AzureWorkloadContainerResponse build() {
            return new AzureWorkloadContainerResponse(backupManagementType, containerType, extendedInfo, friendlyName, healthStatus, lastUpdatedTime, operationType, registrationStatus, sourceResourceId, workloadType);
        }
    }
}
