// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.recoveryservices.outputs;

import io.pulumi.azurenative.recoveryservices.outputs.AzureVmWorkloadProtectedItemExtendedInfoResponse;
import io.pulumi.azurenative.recoveryservices.outputs.ErrorDetailResponse;
import io.pulumi.azurenative.recoveryservices.outputs.KPIResourceHealthDetailsResponse;
import io.pulumi.core.internal.annotations.OutputCustomType;
import java.lang.Boolean;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class AzureVmWorkloadProtectedItemResponse {
    private final @Nullable String backupManagementType;
    private final @Nullable String backupSetName;
    private final @Nullable String containerName;
    private final @Nullable String createMode;
    private final @Nullable String deferredDeleteTimeInUTC;
    private final @Nullable String deferredDeleteTimeRemaining;
    private final @Nullable AzureVmWorkloadProtectedItemExtendedInfoResponse extendedInfo;
    private final @Nullable String friendlyName;
    private final @Nullable Boolean isDeferredDeleteScheduleUpcoming;
    private final @Nullable Boolean isRehydrate;
    private final @Nullable Boolean isScheduledForDeferredDelete;
    private final @Nullable Map<String,KPIResourceHealthDetailsResponse> kpisHealths;
    private final @Nullable ErrorDetailResponse lastBackupErrorDetail;
    private final @Nullable String lastBackupStatus;
    private final @Nullable String lastBackupTime;
    private final @Nullable String lastRecoveryPoint;
    private final @Nullable String parentName;
    private final @Nullable String parentType;
    private final @Nullable String policyId;
    private final @Nullable String protectedItemDataSourceId;
    private final @Nullable String protectedItemHealthStatus;
    private final String protectedItemType;
    private final @Nullable String protectionState;
    private final @Nullable String protectionStatus;
    private final @Nullable String serverName;
    private final @Nullable String sourceResourceId;
    private final @Nullable String workloadType;

    @OutputCustomType.Constructor({"backupManagementType","backupSetName","containerName","createMode","deferredDeleteTimeInUTC","deferredDeleteTimeRemaining","extendedInfo","friendlyName","isDeferredDeleteScheduleUpcoming","isRehydrate","isScheduledForDeferredDelete","kpisHealths","lastBackupErrorDetail","lastBackupStatus","lastBackupTime","lastRecoveryPoint","parentName","parentType","policyId","protectedItemDataSourceId","protectedItemHealthStatus","protectedItemType","protectionState","protectionStatus","serverName","sourceResourceId","workloadType"})
    private AzureVmWorkloadProtectedItemResponse(
        @Nullable String backupManagementType,
        @Nullable String backupSetName,
        @Nullable String containerName,
        @Nullable String createMode,
        @Nullable String deferredDeleteTimeInUTC,
        @Nullable String deferredDeleteTimeRemaining,
        @Nullable AzureVmWorkloadProtectedItemExtendedInfoResponse extendedInfo,
        @Nullable String friendlyName,
        @Nullable Boolean isDeferredDeleteScheduleUpcoming,
        @Nullable Boolean isRehydrate,
        @Nullable Boolean isScheduledForDeferredDelete,
        @Nullable Map<String,KPIResourceHealthDetailsResponse> kpisHealths,
        @Nullable ErrorDetailResponse lastBackupErrorDetail,
        @Nullable String lastBackupStatus,
        @Nullable String lastBackupTime,
        @Nullable String lastRecoveryPoint,
        @Nullable String parentName,
        @Nullable String parentType,
        @Nullable String policyId,
        @Nullable String protectedItemDataSourceId,
        @Nullable String protectedItemHealthStatus,
        String protectedItemType,
        @Nullable String protectionState,
        @Nullable String protectionStatus,
        @Nullable String serverName,
        @Nullable String sourceResourceId,
        @Nullable String workloadType) {
        this.backupManagementType = backupManagementType;
        this.backupSetName = backupSetName;
        this.containerName = containerName;
        this.createMode = createMode;
        this.deferredDeleteTimeInUTC = deferredDeleteTimeInUTC;
        this.deferredDeleteTimeRemaining = deferredDeleteTimeRemaining;
        this.extendedInfo = extendedInfo;
        this.friendlyName = friendlyName;
        this.isDeferredDeleteScheduleUpcoming = isDeferredDeleteScheduleUpcoming;
        this.isRehydrate = isRehydrate;
        this.isScheduledForDeferredDelete = isScheduledForDeferredDelete;
        this.kpisHealths = kpisHealths;
        this.lastBackupErrorDetail = lastBackupErrorDetail;
        this.lastBackupStatus = lastBackupStatus;
        this.lastBackupTime = lastBackupTime;
        this.lastRecoveryPoint = lastRecoveryPoint;
        this.parentName = parentName;
        this.parentType = parentType;
        this.policyId = policyId;
        this.protectedItemDataSourceId = protectedItemDataSourceId;
        this.protectedItemHealthStatus = protectedItemHealthStatus;
        this.protectedItemType = Objects.requireNonNull(protectedItemType);
        this.protectionState = protectionState;
        this.protectionStatus = protectionStatus;
        this.serverName = serverName;
        this.sourceResourceId = sourceResourceId;
        this.workloadType = workloadType;
    }

    public Optional<String> getBackupManagementType() {
        return Optional.ofNullable(this.backupManagementType);
    }
    public Optional<String> getBackupSetName() {
        return Optional.ofNullable(this.backupSetName);
    }
    public Optional<String> getContainerName() {
        return Optional.ofNullable(this.containerName);
    }
    public Optional<String> getCreateMode() {
        return Optional.ofNullable(this.createMode);
    }
    public Optional<String> getDeferredDeleteTimeInUTC() {
        return Optional.ofNullable(this.deferredDeleteTimeInUTC);
    }
    public Optional<String> getDeferredDeleteTimeRemaining() {
        return Optional.ofNullable(this.deferredDeleteTimeRemaining);
    }
    public Optional<AzureVmWorkloadProtectedItemExtendedInfoResponse> getExtendedInfo() {
        return Optional.ofNullable(this.extendedInfo);
    }
    public Optional<String> getFriendlyName() {
        return Optional.ofNullable(this.friendlyName);
    }
    public Optional<Boolean> getIsDeferredDeleteScheduleUpcoming() {
        return Optional.ofNullable(this.isDeferredDeleteScheduleUpcoming);
    }
    public Optional<Boolean> getIsRehydrate() {
        return Optional.ofNullable(this.isRehydrate);
    }
    public Optional<Boolean> getIsScheduledForDeferredDelete() {
        return Optional.ofNullable(this.isScheduledForDeferredDelete);
    }
    public Map<String,KPIResourceHealthDetailsResponse> getKpisHealths() {
        return this.kpisHealths == null ? Map.of() : this.kpisHealths;
    }
    public Optional<ErrorDetailResponse> getLastBackupErrorDetail() {
        return Optional.ofNullable(this.lastBackupErrorDetail);
    }
    public Optional<String> getLastBackupStatus() {
        return Optional.ofNullable(this.lastBackupStatus);
    }
    public Optional<String> getLastBackupTime() {
        return Optional.ofNullable(this.lastBackupTime);
    }
    public Optional<String> getLastRecoveryPoint() {
        return Optional.ofNullable(this.lastRecoveryPoint);
    }
    public Optional<String> getParentName() {
        return Optional.ofNullable(this.parentName);
    }
    public Optional<String> getParentType() {
        return Optional.ofNullable(this.parentType);
    }
    public Optional<String> getPolicyId() {
        return Optional.ofNullable(this.policyId);
    }
    public Optional<String> getProtectedItemDataSourceId() {
        return Optional.ofNullable(this.protectedItemDataSourceId);
    }
    public Optional<String> getProtectedItemHealthStatus() {
        return Optional.ofNullable(this.protectedItemHealthStatus);
    }
    public String getProtectedItemType() {
        return this.protectedItemType;
    }
    public Optional<String> getProtectionState() {
        return Optional.ofNullable(this.protectionState);
    }
    public Optional<String> getProtectionStatus() {
        return Optional.ofNullable(this.protectionStatus);
    }
    public Optional<String> getServerName() {
        return Optional.ofNullable(this.serverName);
    }
    public Optional<String> getSourceResourceId() {
        return Optional.ofNullable(this.sourceResourceId);
    }
    public Optional<String> getWorkloadType() {
        return Optional.ofNullable(this.workloadType);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(AzureVmWorkloadProtectedItemResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String backupManagementType;
        private @Nullable String backupSetName;
        private @Nullable String containerName;
        private @Nullable String createMode;
        private @Nullable String deferredDeleteTimeInUTC;
        private @Nullable String deferredDeleteTimeRemaining;
        private @Nullable AzureVmWorkloadProtectedItemExtendedInfoResponse extendedInfo;
        private @Nullable String friendlyName;
        private @Nullable Boolean isDeferredDeleteScheduleUpcoming;
        private @Nullable Boolean isRehydrate;
        private @Nullable Boolean isScheduledForDeferredDelete;
        private @Nullable Map<String,KPIResourceHealthDetailsResponse> kpisHealths;
        private @Nullable ErrorDetailResponse lastBackupErrorDetail;
        private @Nullable String lastBackupStatus;
        private @Nullable String lastBackupTime;
        private @Nullable String lastRecoveryPoint;
        private @Nullable String parentName;
        private @Nullable String parentType;
        private @Nullable String policyId;
        private @Nullable String protectedItemDataSourceId;
        private @Nullable String protectedItemHealthStatus;
        private String protectedItemType;
        private @Nullable String protectionState;
        private @Nullable String protectionStatus;
        private @Nullable String serverName;
        private @Nullable String sourceResourceId;
        private @Nullable String workloadType;

        public Builder() {
    	      // Empty
        }

        public Builder(AzureVmWorkloadProtectedItemResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.backupManagementType = defaults.backupManagementType;
    	      this.backupSetName = defaults.backupSetName;
    	      this.containerName = defaults.containerName;
    	      this.createMode = defaults.createMode;
    	      this.deferredDeleteTimeInUTC = defaults.deferredDeleteTimeInUTC;
    	      this.deferredDeleteTimeRemaining = defaults.deferredDeleteTimeRemaining;
    	      this.extendedInfo = defaults.extendedInfo;
    	      this.friendlyName = defaults.friendlyName;
    	      this.isDeferredDeleteScheduleUpcoming = defaults.isDeferredDeleteScheduleUpcoming;
    	      this.isRehydrate = defaults.isRehydrate;
    	      this.isScheduledForDeferredDelete = defaults.isScheduledForDeferredDelete;
    	      this.kpisHealths = defaults.kpisHealths;
    	      this.lastBackupErrorDetail = defaults.lastBackupErrorDetail;
    	      this.lastBackupStatus = defaults.lastBackupStatus;
    	      this.lastBackupTime = defaults.lastBackupTime;
    	      this.lastRecoveryPoint = defaults.lastRecoveryPoint;
    	      this.parentName = defaults.parentName;
    	      this.parentType = defaults.parentType;
    	      this.policyId = defaults.policyId;
    	      this.protectedItemDataSourceId = defaults.protectedItemDataSourceId;
    	      this.protectedItemHealthStatus = defaults.protectedItemHealthStatus;
    	      this.protectedItemType = defaults.protectedItemType;
    	      this.protectionState = defaults.protectionState;
    	      this.protectionStatus = defaults.protectionStatus;
    	      this.serverName = defaults.serverName;
    	      this.sourceResourceId = defaults.sourceResourceId;
    	      this.workloadType = defaults.workloadType;
        }

        public Builder setBackupManagementType(@Nullable String backupManagementType) {
            this.backupManagementType = backupManagementType;
            return this;
        }

        public Builder setBackupSetName(@Nullable String backupSetName) {
            this.backupSetName = backupSetName;
            return this;
        }

        public Builder setContainerName(@Nullable String containerName) {
            this.containerName = containerName;
            return this;
        }

        public Builder setCreateMode(@Nullable String createMode) {
            this.createMode = createMode;
            return this;
        }

        public Builder setDeferredDeleteTimeInUTC(@Nullable String deferredDeleteTimeInUTC) {
            this.deferredDeleteTimeInUTC = deferredDeleteTimeInUTC;
            return this;
        }

        public Builder setDeferredDeleteTimeRemaining(@Nullable String deferredDeleteTimeRemaining) {
            this.deferredDeleteTimeRemaining = deferredDeleteTimeRemaining;
            return this;
        }

        public Builder setExtendedInfo(@Nullable AzureVmWorkloadProtectedItemExtendedInfoResponse extendedInfo) {
            this.extendedInfo = extendedInfo;
            return this;
        }

        public Builder setFriendlyName(@Nullable String friendlyName) {
            this.friendlyName = friendlyName;
            return this;
        }

        public Builder setIsDeferredDeleteScheduleUpcoming(@Nullable Boolean isDeferredDeleteScheduleUpcoming) {
            this.isDeferredDeleteScheduleUpcoming = isDeferredDeleteScheduleUpcoming;
            return this;
        }

        public Builder setIsRehydrate(@Nullable Boolean isRehydrate) {
            this.isRehydrate = isRehydrate;
            return this;
        }

        public Builder setIsScheduledForDeferredDelete(@Nullable Boolean isScheduledForDeferredDelete) {
            this.isScheduledForDeferredDelete = isScheduledForDeferredDelete;
            return this;
        }

        public Builder setKpisHealths(@Nullable Map<String,KPIResourceHealthDetailsResponse> kpisHealths) {
            this.kpisHealths = kpisHealths;
            return this;
        }

        public Builder setLastBackupErrorDetail(@Nullable ErrorDetailResponse lastBackupErrorDetail) {
            this.lastBackupErrorDetail = lastBackupErrorDetail;
            return this;
        }

        public Builder setLastBackupStatus(@Nullable String lastBackupStatus) {
            this.lastBackupStatus = lastBackupStatus;
            return this;
        }

        public Builder setLastBackupTime(@Nullable String lastBackupTime) {
            this.lastBackupTime = lastBackupTime;
            return this;
        }

        public Builder setLastRecoveryPoint(@Nullable String lastRecoveryPoint) {
            this.lastRecoveryPoint = lastRecoveryPoint;
            return this;
        }

        public Builder setParentName(@Nullable String parentName) {
            this.parentName = parentName;
            return this;
        }

        public Builder setParentType(@Nullable String parentType) {
            this.parentType = parentType;
            return this;
        }

        public Builder setPolicyId(@Nullable String policyId) {
            this.policyId = policyId;
            return this;
        }

        public Builder setProtectedItemDataSourceId(@Nullable String protectedItemDataSourceId) {
            this.protectedItemDataSourceId = protectedItemDataSourceId;
            return this;
        }

        public Builder setProtectedItemHealthStatus(@Nullable String protectedItemHealthStatus) {
            this.protectedItemHealthStatus = protectedItemHealthStatus;
            return this;
        }

        public Builder setProtectedItemType(String protectedItemType) {
            this.protectedItemType = Objects.requireNonNull(protectedItemType);
            return this;
        }

        public Builder setProtectionState(@Nullable String protectionState) {
            this.protectionState = protectionState;
            return this;
        }

        public Builder setProtectionStatus(@Nullable String protectionStatus) {
            this.protectionStatus = protectionStatus;
            return this;
        }

        public Builder setServerName(@Nullable String serverName) {
            this.serverName = serverName;
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

        public AzureVmWorkloadProtectedItemResponse build() {
            return new AzureVmWorkloadProtectedItemResponse(backupManagementType, backupSetName, containerName, createMode, deferredDeleteTimeInUTC, deferredDeleteTimeRemaining, extendedInfo, friendlyName, isDeferredDeleteScheduleUpcoming, isRehydrate, isScheduledForDeferredDelete, kpisHealths, lastBackupErrorDetail, lastBackupStatus, lastBackupTime, lastRecoveryPoint, parentName, parentType, policyId, protectedItemDataSourceId, protectedItemHealthStatus, protectedItemType, protectionState, protectionStatus, serverName, sourceResourceId, workloadType);
        }
    }
}
