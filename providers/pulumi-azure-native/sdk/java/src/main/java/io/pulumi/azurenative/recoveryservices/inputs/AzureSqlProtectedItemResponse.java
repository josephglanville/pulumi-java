// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.recoveryservices.inputs;

import io.pulumi.azurenative.recoveryservices.inputs.AzureSqlProtectedItemExtendedInfoResponse;
import io.pulumi.core.internal.annotations.InputImport;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class AzureSqlProtectedItemResponse extends io.pulumi.resources.InvokeArgs {

    public static final AzureSqlProtectedItemResponse Empty = new AzureSqlProtectedItemResponse();

    @InputImport(name="backupManagementType")
    private final @Nullable String backupManagementType;

    public Optional<String> getBackupManagementType() {
        return this.backupManagementType == null ? Optional.empty() : Optional.ofNullable(this.backupManagementType);
    }

    @InputImport(name="backupSetName")
    private final @Nullable String backupSetName;

    public Optional<String> getBackupSetName() {
        return this.backupSetName == null ? Optional.empty() : Optional.ofNullable(this.backupSetName);
    }

    @InputImport(name="containerName")
    private final @Nullable String containerName;

    public Optional<String> getContainerName() {
        return this.containerName == null ? Optional.empty() : Optional.ofNullable(this.containerName);
    }

    @InputImport(name="createMode")
    private final @Nullable String createMode;

    public Optional<String> getCreateMode() {
        return this.createMode == null ? Optional.empty() : Optional.ofNullable(this.createMode);
    }

    @InputImport(name="deferredDeleteTimeInUTC")
    private final @Nullable String deferredDeleteTimeInUTC;

    public Optional<String> getDeferredDeleteTimeInUTC() {
        return this.deferredDeleteTimeInUTC == null ? Optional.empty() : Optional.ofNullable(this.deferredDeleteTimeInUTC);
    }

    @InputImport(name="deferredDeleteTimeRemaining")
    private final @Nullable String deferredDeleteTimeRemaining;

    public Optional<String> getDeferredDeleteTimeRemaining() {
        return this.deferredDeleteTimeRemaining == null ? Optional.empty() : Optional.ofNullable(this.deferredDeleteTimeRemaining);
    }

    @InputImport(name="extendedInfo")
    private final @Nullable AzureSqlProtectedItemExtendedInfoResponse extendedInfo;

    public Optional<AzureSqlProtectedItemExtendedInfoResponse> getExtendedInfo() {
        return this.extendedInfo == null ? Optional.empty() : Optional.ofNullable(this.extendedInfo);
    }

    @InputImport(name="isDeferredDeleteScheduleUpcoming")
    private final @Nullable Boolean isDeferredDeleteScheduleUpcoming;

    public Optional<Boolean> getIsDeferredDeleteScheduleUpcoming() {
        return this.isDeferredDeleteScheduleUpcoming == null ? Optional.empty() : Optional.ofNullable(this.isDeferredDeleteScheduleUpcoming);
    }

    @InputImport(name="isRehydrate")
    private final @Nullable Boolean isRehydrate;

    public Optional<Boolean> getIsRehydrate() {
        return this.isRehydrate == null ? Optional.empty() : Optional.ofNullable(this.isRehydrate);
    }

    @InputImport(name="isScheduledForDeferredDelete")
    private final @Nullable Boolean isScheduledForDeferredDelete;

    public Optional<Boolean> getIsScheduledForDeferredDelete() {
        return this.isScheduledForDeferredDelete == null ? Optional.empty() : Optional.ofNullable(this.isScheduledForDeferredDelete);
    }

    @InputImport(name="lastRecoveryPoint")
    private final @Nullable String lastRecoveryPoint;

    public Optional<String> getLastRecoveryPoint() {
        return this.lastRecoveryPoint == null ? Optional.empty() : Optional.ofNullable(this.lastRecoveryPoint);
    }

    @InputImport(name="policyId")
    private final @Nullable String policyId;

    public Optional<String> getPolicyId() {
        return this.policyId == null ? Optional.empty() : Optional.ofNullable(this.policyId);
    }

    @InputImport(name="protectedItemDataId")
    private final @Nullable String protectedItemDataId;

    public Optional<String> getProtectedItemDataId() {
        return this.protectedItemDataId == null ? Optional.empty() : Optional.ofNullable(this.protectedItemDataId);
    }

    @InputImport(name="protectedItemType", required=true)
    private final String protectedItemType;

    public String getProtectedItemType() {
        return this.protectedItemType;
    }

    @InputImport(name="protectionState")
    private final @Nullable String protectionState;

    public Optional<String> getProtectionState() {
        return this.protectionState == null ? Optional.empty() : Optional.ofNullable(this.protectionState);
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

    public AzureSqlProtectedItemResponse(
        @Nullable String backupManagementType,
        @Nullable String backupSetName,
        @Nullable String containerName,
        @Nullable String createMode,
        @Nullable String deferredDeleteTimeInUTC,
        @Nullable String deferredDeleteTimeRemaining,
        @Nullable AzureSqlProtectedItemExtendedInfoResponse extendedInfo,
        @Nullable Boolean isDeferredDeleteScheduleUpcoming,
        @Nullable Boolean isRehydrate,
        @Nullable Boolean isScheduledForDeferredDelete,
        @Nullable String lastRecoveryPoint,
        @Nullable String policyId,
        @Nullable String protectedItemDataId,
        String protectedItemType,
        @Nullable String protectionState,
        @Nullable String sourceResourceId,
        @Nullable String workloadType) {
        this.backupManagementType = backupManagementType;
        this.backupSetName = backupSetName;
        this.containerName = containerName;
        this.createMode = createMode;
        this.deferredDeleteTimeInUTC = deferredDeleteTimeInUTC;
        this.deferredDeleteTimeRemaining = deferredDeleteTimeRemaining;
        this.extendedInfo = extendedInfo;
        this.isDeferredDeleteScheduleUpcoming = isDeferredDeleteScheduleUpcoming;
        this.isRehydrate = isRehydrate;
        this.isScheduledForDeferredDelete = isScheduledForDeferredDelete;
        this.lastRecoveryPoint = lastRecoveryPoint;
        this.policyId = policyId;
        this.protectedItemDataId = protectedItemDataId;
        this.protectedItemType = Objects.requireNonNull(protectedItemType, "expected parameter 'protectedItemType' to be non-null");
        this.protectionState = protectionState;
        this.sourceResourceId = sourceResourceId;
        this.workloadType = workloadType;
    }

    private AzureSqlProtectedItemResponse() {
        this.backupManagementType = null;
        this.backupSetName = null;
        this.containerName = null;
        this.createMode = null;
        this.deferredDeleteTimeInUTC = null;
        this.deferredDeleteTimeRemaining = null;
        this.extendedInfo = null;
        this.isDeferredDeleteScheduleUpcoming = null;
        this.isRehydrate = null;
        this.isScheduledForDeferredDelete = null;
        this.lastRecoveryPoint = null;
        this.policyId = null;
        this.protectedItemDataId = null;
        this.protectedItemType = null;
        this.protectionState = null;
        this.sourceResourceId = null;
        this.workloadType = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(AzureSqlProtectedItemResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String backupManagementType;
        private @Nullable String backupSetName;
        private @Nullable String containerName;
        private @Nullable String createMode;
        private @Nullable String deferredDeleteTimeInUTC;
        private @Nullable String deferredDeleteTimeRemaining;
        private @Nullable AzureSqlProtectedItemExtendedInfoResponse extendedInfo;
        private @Nullable Boolean isDeferredDeleteScheduleUpcoming;
        private @Nullable Boolean isRehydrate;
        private @Nullable Boolean isScheduledForDeferredDelete;
        private @Nullable String lastRecoveryPoint;
        private @Nullable String policyId;
        private @Nullable String protectedItemDataId;
        private String protectedItemType;
        private @Nullable String protectionState;
        private @Nullable String sourceResourceId;
        private @Nullable String workloadType;

        public Builder() {
    	      // Empty
        }

        public Builder(AzureSqlProtectedItemResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.backupManagementType = defaults.backupManagementType;
    	      this.backupSetName = defaults.backupSetName;
    	      this.containerName = defaults.containerName;
    	      this.createMode = defaults.createMode;
    	      this.deferredDeleteTimeInUTC = defaults.deferredDeleteTimeInUTC;
    	      this.deferredDeleteTimeRemaining = defaults.deferredDeleteTimeRemaining;
    	      this.extendedInfo = defaults.extendedInfo;
    	      this.isDeferredDeleteScheduleUpcoming = defaults.isDeferredDeleteScheduleUpcoming;
    	      this.isRehydrate = defaults.isRehydrate;
    	      this.isScheduledForDeferredDelete = defaults.isScheduledForDeferredDelete;
    	      this.lastRecoveryPoint = defaults.lastRecoveryPoint;
    	      this.policyId = defaults.policyId;
    	      this.protectedItemDataId = defaults.protectedItemDataId;
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

        public Builder setExtendedInfo(@Nullable AzureSqlProtectedItemExtendedInfoResponse extendedInfo) {
            this.extendedInfo = extendedInfo;
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

        public Builder setLastRecoveryPoint(@Nullable String lastRecoveryPoint) {
            this.lastRecoveryPoint = lastRecoveryPoint;
            return this;
        }

        public Builder setPolicyId(@Nullable String policyId) {
            this.policyId = policyId;
            return this;
        }

        public Builder setProtectedItemDataId(@Nullable String protectedItemDataId) {
            this.protectedItemDataId = protectedItemDataId;
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

        public AzureSqlProtectedItemResponse build() {
            return new AzureSqlProtectedItemResponse(backupManagementType, backupSetName, containerName, createMode, deferredDeleteTimeInUTC, deferredDeleteTimeRemaining, extendedInfo, isDeferredDeleteScheduleUpcoming, isRehydrate, isScheduledForDeferredDelete, lastRecoveryPoint, policyId, protectedItemDataId, protectedItemType, protectionState, sourceResourceId, workloadType);
        }
    }
}
