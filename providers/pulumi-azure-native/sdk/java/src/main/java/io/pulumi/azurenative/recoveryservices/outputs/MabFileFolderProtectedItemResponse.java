// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.recoveryservices.outputs;

import io.pulumi.azurenative.recoveryservices.outputs.MabFileFolderProtectedItemExtendedInfoResponse;
import io.pulumi.core.internal.annotations.OutputCustomType;
import java.lang.Boolean;
import java.lang.Double;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class MabFileFolderProtectedItemResponse {
    private final @Nullable String backupManagementType;
    private final @Nullable String backupSetName;
    private final @Nullable String computerName;
    private final @Nullable String containerName;
    private final @Nullable String createMode;
    private final @Nullable Double deferredDeleteSyncTimeInUTC;
    private final @Nullable String deferredDeleteTimeInUTC;
    private final @Nullable String deferredDeleteTimeRemaining;
    private final @Nullable MabFileFolderProtectedItemExtendedInfoResponse extendedInfo;
    private final @Nullable String friendlyName;
    private final @Nullable Boolean isDeferredDeleteScheduleUpcoming;
    private final @Nullable Boolean isRehydrate;
    private final @Nullable Boolean isScheduledForDeferredDelete;
    private final @Nullable String lastBackupStatus;
    private final @Nullable String lastBackupTime;
    private final @Nullable String lastRecoveryPoint;
    private final @Nullable String policyId;
    private final String protectedItemType;
    private final @Nullable String protectionState;
    private final @Nullable String sourceResourceId;
    private final @Nullable String workloadType;

    @OutputCustomType.Constructor({"backupManagementType","backupSetName","computerName","containerName","createMode","deferredDeleteSyncTimeInUTC","deferredDeleteTimeInUTC","deferredDeleteTimeRemaining","extendedInfo","friendlyName","isDeferredDeleteScheduleUpcoming","isRehydrate","isScheduledForDeferredDelete","lastBackupStatus","lastBackupTime","lastRecoveryPoint","policyId","protectedItemType","protectionState","sourceResourceId","workloadType"})
    private MabFileFolderProtectedItemResponse(
        @Nullable String backupManagementType,
        @Nullable String backupSetName,
        @Nullable String computerName,
        @Nullable String containerName,
        @Nullable String createMode,
        @Nullable Double deferredDeleteSyncTimeInUTC,
        @Nullable String deferredDeleteTimeInUTC,
        @Nullable String deferredDeleteTimeRemaining,
        @Nullable MabFileFolderProtectedItemExtendedInfoResponse extendedInfo,
        @Nullable String friendlyName,
        @Nullable Boolean isDeferredDeleteScheduleUpcoming,
        @Nullable Boolean isRehydrate,
        @Nullable Boolean isScheduledForDeferredDelete,
        @Nullable String lastBackupStatus,
        @Nullable String lastBackupTime,
        @Nullable String lastRecoveryPoint,
        @Nullable String policyId,
        String protectedItemType,
        @Nullable String protectionState,
        @Nullable String sourceResourceId,
        @Nullable String workloadType) {
        this.backupManagementType = backupManagementType;
        this.backupSetName = backupSetName;
        this.computerName = computerName;
        this.containerName = containerName;
        this.createMode = createMode;
        this.deferredDeleteSyncTimeInUTC = deferredDeleteSyncTimeInUTC;
        this.deferredDeleteTimeInUTC = deferredDeleteTimeInUTC;
        this.deferredDeleteTimeRemaining = deferredDeleteTimeRemaining;
        this.extendedInfo = extendedInfo;
        this.friendlyName = friendlyName;
        this.isDeferredDeleteScheduleUpcoming = isDeferredDeleteScheduleUpcoming;
        this.isRehydrate = isRehydrate;
        this.isScheduledForDeferredDelete = isScheduledForDeferredDelete;
        this.lastBackupStatus = lastBackupStatus;
        this.lastBackupTime = lastBackupTime;
        this.lastRecoveryPoint = lastRecoveryPoint;
        this.policyId = policyId;
        this.protectedItemType = Objects.requireNonNull(protectedItemType);
        this.protectionState = protectionState;
        this.sourceResourceId = sourceResourceId;
        this.workloadType = workloadType;
    }

    public Optional<String> getBackupManagementType() {
        return Optional.ofNullable(this.backupManagementType);
    }
    public Optional<String> getBackupSetName() {
        return Optional.ofNullable(this.backupSetName);
    }
    public Optional<String> getComputerName() {
        return Optional.ofNullable(this.computerName);
    }
    public Optional<String> getContainerName() {
        return Optional.ofNullable(this.containerName);
    }
    public Optional<String> getCreateMode() {
        return Optional.ofNullable(this.createMode);
    }
    public Optional<Double> getDeferredDeleteSyncTimeInUTC() {
        return Optional.ofNullable(this.deferredDeleteSyncTimeInUTC);
    }
    public Optional<String> getDeferredDeleteTimeInUTC() {
        return Optional.ofNullable(this.deferredDeleteTimeInUTC);
    }
    public Optional<String> getDeferredDeleteTimeRemaining() {
        return Optional.ofNullable(this.deferredDeleteTimeRemaining);
    }
    public Optional<MabFileFolderProtectedItemExtendedInfoResponse> getExtendedInfo() {
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
    public Optional<String> getLastBackupStatus() {
        return Optional.ofNullable(this.lastBackupStatus);
    }
    public Optional<String> getLastBackupTime() {
        return Optional.ofNullable(this.lastBackupTime);
    }
    public Optional<String> getLastRecoveryPoint() {
        return Optional.ofNullable(this.lastRecoveryPoint);
    }
    public Optional<String> getPolicyId() {
        return Optional.ofNullable(this.policyId);
    }
    public String getProtectedItemType() {
        return this.protectedItemType;
    }
    public Optional<String> getProtectionState() {
        return Optional.ofNullable(this.protectionState);
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

    public static Builder builder(MabFileFolderProtectedItemResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String backupManagementType;
        private @Nullable String backupSetName;
        private @Nullable String computerName;
        private @Nullable String containerName;
        private @Nullable String createMode;
        private @Nullable Double deferredDeleteSyncTimeInUTC;
        private @Nullable String deferredDeleteTimeInUTC;
        private @Nullable String deferredDeleteTimeRemaining;
        private @Nullable MabFileFolderProtectedItemExtendedInfoResponse extendedInfo;
        private @Nullable String friendlyName;
        private @Nullable Boolean isDeferredDeleteScheduleUpcoming;
        private @Nullable Boolean isRehydrate;
        private @Nullable Boolean isScheduledForDeferredDelete;
        private @Nullable String lastBackupStatus;
        private @Nullable String lastBackupTime;
        private @Nullable String lastRecoveryPoint;
        private @Nullable String policyId;
        private String protectedItemType;
        private @Nullable String protectionState;
        private @Nullable String sourceResourceId;
        private @Nullable String workloadType;

        public Builder() {
    	      // Empty
        }

        public Builder(MabFileFolderProtectedItemResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.backupManagementType = defaults.backupManagementType;
    	      this.backupSetName = defaults.backupSetName;
    	      this.computerName = defaults.computerName;
    	      this.containerName = defaults.containerName;
    	      this.createMode = defaults.createMode;
    	      this.deferredDeleteSyncTimeInUTC = defaults.deferredDeleteSyncTimeInUTC;
    	      this.deferredDeleteTimeInUTC = defaults.deferredDeleteTimeInUTC;
    	      this.deferredDeleteTimeRemaining = defaults.deferredDeleteTimeRemaining;
    	      this.extendedInfo = defaults.extendedInfo;
    	      this.friendlyName = defaults.friendlyName;
    	      this.isDeferredDeleteScheduleUpcoming = defaults.isDeferredDeleteScheduleUpcoming;
    	      this.isRehydrate = defaults.isRehydrate;
    	      this.isScheduledForDeferredDelete = defaults.isScheduledForDeferredDelete;
    	      this.lastBackupStatus = defaults.lastBackupStatus;
    	      this.lastBackupTime = defaults.lastBackupTime;
    	      this.lastRecoveryPoint = defaults.lastRecoveryPoint;
    	      this.policyId = defaults.policyId;
    	      this.protectedItemType = defaults.protectedItemType;
    	      this.protectionState = defaults.protectionState;
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

        public Builder setComputerName(@Nullable String computerName) {
            this.computerName = computerName;
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

        public Builder setDeferredDeleteSyncTimeInUTC(@Nullable Double deferredDeleteSyncTimeInUTC) {
            this.deferredDeleteSyncTimeInUTC = deferredDeleteSyncTimeInUTC;
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

        public Builder setExtendedInfo(@Nullable MabFileFolderProtectedItemExtendedInfoResponse extendedInfo) {
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

        public Builder setPolicyId(@Nullable String policyId) {
            this.policyId = policyId;
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

        public Builder setSourceResourceId(@Nullable String sourceResourceId) {
            this.sourceResourceId = sourceResourceId;
            return this;
        }

        public Builder setWorkloadType(@Nullable String workloadType) {
            this.workloadType = workloadType;
            return this;
        }

        public MabFileFolderProtectedItemResponse build() {
            return new MabFileFolderProtectedItemResponse(backupManagementType, backupSetName, computerName, containerName, createMode, deferredDeleteSyncTimeInUTC, deferredDeleteTimeInUTC, deferredDeleteTimeRemaining, extendedInfo, friendlyName, isDeferredDeleteScheduleUpcoming, isRehydrate, isScheduledForDeferredDelete, lastBackupStatus, lastBackupTime, lastRecoveryPoint, policyId, protectedItemType, protectionState, sourceResourceId, workloadType);
        }
    }
}