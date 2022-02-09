// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.storsimple;

import io.pulumi.azurenative.storsimple.enums.BackupType;
import io.pulumi.azurenative.storsimple.enums.Kind;
import io.pulumi.azurenative.storsimple.enums.ScheduleStatus;
import io.pulumi.azurenative.storsimple.inputs.ScheduleRecurrenceArgs;
import io.pulumi.core.Input;
import io.pulumi.core.internal.annotations.InputImport;
import java.lang.Double;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class BackupScheduleArgs extends io.pulumi.resources.ResourceArgs {

    public static final BackupScheduleArgs Empty = new BackupScheduleArgs();

    @InputImport(name="backupPolicyName", required=true)
    private final Input<String> backupPolicyName;

    public Input<String> getBackupPolicyName() {
        return this.backupPolicyName;
    }

    @InputImport(name="backupScheduleName")
    private final @Nullable Input<String> backupScheduleName;

    public Input<String> getBackupScheduleName() {
        return this.backupScheduleName == null ? Input.empty() : this.backupScheduleName;
    }

    @InputImport(name="backupType", required=true)
    private final Input<BackupType> backupType;

    public Input<BackupType> getBackupType() {
        return this.backupType;
    }

    @InputImport(name="deviceName", required=true)
    private final Input<String> deviceName;

    public Input<String> getDeviceName() {
        return this.deviceName;
    }

    @InputImport(name="kind")
    private final @Nullable Input<Kind> kind;

    public Input<Kind> getKind() {
        return this.kind == null ? Input.empty() : this.kind;
    }

    @InputImport(name="managerName", required=true)
    private final Input<String> managerName;

    public Input<String> getManagerName() {
        return this.managerName;
    }

    @InputImport(name="resourceGroupName", required=true)
    private final Input<String> resourceGroupName;

    public Input<String> getResourceGroupName() {
        return this.resourceGroupName;
    }

    @InputImport(name="retentionCount", required=true)
    private final Input<Double> retentionCount;

    public Input<Double> getRetentionCount() {
        return this.retentionCount;
    }

    @InputImport(name="scheduleRecurrence", required=true)
    private final Input<ScheduleRecurrenceArgs> scheduleRecurrence;

    public Input<ScheduleRecurrenceArgs> getScheduleRecurrence() {
        return this.scheduleRecurrence;
    }

    @InputImport(name="scheduleStatus", required=true)
    private final Input<ScheduleStatus> scheduleStatus;

    public Input<ScheduleStatus> getScheduleStatus() {
        return this.scheduleStatus;
    }

    @InputImport(name="startTime", required=true)
    private final Input<String> startTime;

    public Input<String> getStartTime() {
        return this.startTime;
    }

    public BackupScheduleArgs(
        Input<String> backupPolicyName,
        @Nullable Input<String> backupScheduleName,
        Input<BackupType> backupType,
        Input<String> deviceName,
        @Nullable Input<Kind> kind,
        Input<String> managerName,
        Input<String> resourceGroupName,
        Input<Double> retentionCount,
        Input<ScheduleRecurrenceArgs> scheduleRecurrence,
        Input<ScheduleStatus> scheduleStatus,
        Input<String> startTime) {
        this.backupPolicyName = Objects.requireNonNull(backupPolicyName, "expected parameter 'backupPolicyName' to be non-null");
        this.backupScheduleName = backupScheduleName;
        this.backupType = Objects.requireNonNull(backupType, "expected parameter 'backupType' to be non-null");
        this.deviceName = Objects.requireNonNull(deviceName, "expected parameter 'deviceName' to be non-null");
        this.kind = kind;
        this.managerName = Objects.requireNonNull(managerName, "expected parameter 'managerName' to be non-null");
        this.resourceGroupName = Objects.requireNonNull(resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
        this.retentionCount = Objects.requireNonNull(retentionCount, "expected parameter 'retentionCount' to be non-null");
        this.scheduleRecurrence = Objects.requireNonNull(scheduleRecurrence, "expected parameter 'scheduleRecurrence' to be non-null");
        this.scheduleStatus = Objects.requireNonNull(scheduleStatus, "expected parameter 'scheduleStatus' to be non-null");
        this.startTime = Objects.requireNonNull(startTime, "expected parameter 'startTime' to be non-null");
    }

    private BackupScheduleArgs() {
        this.backupPolicyName = Input.empty();
        this.backupScheduleName = Input.empty();
        this.backupType = Input.empty();
        this.deviceName = Input.empty();
        this.kind = Input.empty();
        this.managerName = Input.empty();
        this.resourceGroupName = Input.empty();
        this.retentionCount = Input.empty();
        this.scheduleRecurrence = Input.empty();
        this.scheduleStatus = Input.empty();
        this.startTime = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(BackupScheduleArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Input<String> backupPolicyName;
        private @Nullable Input<String> backupScheduleName;
        private Input<BackupType> backupType;
        private Input<String> deviceName;
        private @Nullable Input<Kind> kind;
        private Input<String> managerName;
        private Input<String> resourceGroupName;
        private Input<Double> retentionCount;
        private Input<ScheduleRecurrenceArgs> scheduleRecurrence;
        private Input<ScheduleStatus> scheduleStatus;
        private Input<String> startTime;

        public Builder() {
    	      // Empty
        }

        public Builder(BackupScheduleArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.backupPolicyName = defaults.backupPolicyName;
    	      this.backupScheduleName = defaults.backupScheduleName;
    	      this.backupType = defaults.backupType;
    	      this.deviceName = defaults.deviceName;
    	      this.kind = defaults.kind;
    	      this.managerName = defaults.managerName;
    	      this.resourceGroupName = defaults.resourceGroupName;
    	      this.retentionCount = defaults.retentionCount;
    	      this.scheduleRecurrence = defaults.scheduleRecurrence;
    	      this.scheduleStatus = defaults.scheduleStatus;
    	      this.startTime = defaults.startTime;
        }

        public Builder setBackupPolicyName(Input<String> backupPolicyName) {
            this.backupPolicyName = Objects.requireNonNull(backupPolicyName);
            return this;
        }

        public Builder setBackupPolicyName(String backupPolicyName) {
            this.backupPolicyName = Input.of(Objects.requireNonNull(backupPolicyName));
            return this;
        }

        public Builder setBackupScheduleName(@Nullable Input<String> backupScheduleName) {
            this.backupScheduleName = backupScheduleName;
            return this;
        }

        public Builder setBackupScheduleName(@Nullable String backupScheduleName) {
            this.backupScheduleName = Input.ofNullable(backupScheduleName);
            return this;
        }

        public Builder setBackupType(Input<BackupType> backupType) {
            this.backupType = Objects.requireNonNull(backupType);
            return this;
        }

        public Builder setBackupType(BackupType backupType) {
            this.backupType = Input.of(Objects.requireNonNull(backupType));
            return this;
        }

        public Builder setDeviceName(Input<String> deviceName) {
            this.deviceName = Objects.requireNonNull(deviceName);
            return this;
        }

        public Builder setDeviceName(String deviceName) {
            this.deviceName = Input.of(Objects.requireNonNull(deviceName));
            return this;
        }

        public Builder setKind(@Nullable Input<Kind> kind) {
            this.kind = kind;
            return this;
        }

        public Builder setKind(@Nullable Kind kind) {
            this.kind = Input.ofNullable(kind);
            return this;
        }

        public Builder setManagerName(Input<String> managerName) {
            this.managerName = Objects.requireNonNull(managerName);
            return this;
        }

        public Builder setManagerName(String managerName) {
            this.managerName = Input.of(Objects.requireNonNull(managerName));
            return this;
        }

        public Builder setResourceGroupName(Input<String> resourceGroupName) {
            this.resourceGroupName = Objects.requireNonNull(resourceGroupName);
            return this;
        }

        public Builder setResourceGroupName(String resourceGroupName) {
            this.resourceGroupName = Input.of(Objects.requireNonNull(resourceGroupName));
            return this;
        }

        public Builder setRetentionCount(Input<Double> retentionCount) {
            this.retentionCount = Objects.requireNonNull(retentionCount);
            return this;
        }

        public Builder setRetentionCount(Double retentionCount) {
            this.retentionCount = Input.of(Objects.requireNonNull(retentionCount));
            return this;
        }

        public Builder setScheduleRecurrence(Input<ScheduleRecurrenceArgs> scheduleRecurrence) {
            this.scheduleRecurrence = Objects.requireNonNull(scheduleRecurrence);
            return this;
        }

        public Builder setScheduleRecurrence(ScheduleRecurrenceArgs scheduleRecurrence) {
            this.scheduleRecurrence = Input.of(Objects.requireNonNull(scheduleRecurrence));
            return this;
        }

        public Builder setScheduleStatus(Input<ScheduleStatus> scheduleStatus) {
            this.scheduleStatus = Objects.requireNonNull(scheduleStatus);
            return this;
        }

        public Builder setScheduleStatus(ScheduleStatus scheduleStatus) {
            this.scheduleStatus = Input.of(Objects.requireNonNull(scheduleStatus));
            return this;
        }

        public Builder setStartTime(Input<String> startTime) {
            this.startTime = Objects.requireNonNull(startTime);
            return this;
        }

        public Builder setStartTime(String startTime) {
            this.startTime = Input.of(Objects.requireNonNull(startTime));
            return this;
        }

        public BackupScheduleArgs build() {
            return new BackupScheduleArgs(backupPolicyName, backupScheduleName, backupType, deviceName, kind, managerName, resourceGroupName, retentionCount, scheduleRecurrence, scheduleStatus, startTime);
        }
    }
}
