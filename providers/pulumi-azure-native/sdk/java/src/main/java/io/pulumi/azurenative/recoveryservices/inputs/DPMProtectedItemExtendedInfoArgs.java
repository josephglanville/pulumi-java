// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.recoveryservices.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * Additional information of DPM Protected item.
 * 
 */
public final class DPMProtectedItemExtendedInfoArgs extends io.pulumi.resources.ResourceArgs {

    public static final DPMProtectedItemExtendedInfoArgs Empty = new DPMProtectedItemExtendedInfoArgs();

    /**
     * Used Disk storage in bytes.
     * 
     */
    @Import(name="diskStorageUsedInBytes")
      private final @Nullable Output<String> diskStorageUsedInBytes;

    public Output<String> getDiskStorageUsedInBytes() {
        return this.diskStorageUsedInBytes == null ? Codegen.empty() : this.diskStorageUsedInBytes;
    }

    /**
     * To check if backup item is collocated.
     * 
     */
    @Import(name="isCollocated")
      private final @Nullable Output<Boolean> isCollocated;

    public Output<Boolean> getIsCollocated() {
        return this.isCollocated == null ? Codegen.empty() : this.isCollocated;
    }

    /**
     * To check if backup item is cloud protected.
     * 
     */
    @Import(name="isPresentOnCloud")
      private final @Nullable Output<Boolean> isPresentOnCloud;

    public Output<Boolean> getIsPresentOnCloud() {
        return this.isPresentOnCloud == null ? Codegen.empty() : this.isPresentOnCloud;
    }

    /**
     * Last backup status information on backup item.
     * 
     */
    @Import(name="lastBackupStatus")
      private final @Nullable Output<String> lastBackupStatus;

    public Output<String> getLastBackupStatus() {
        return this.lastBackupStatus == null ? Codegen.empty() : this.lastBackupStatus;
    }

    /**
     * Last refresh time on backup item.
     * 
     */
    @Import(name="lastRefreshedAt")
      private final @Nullable Output<String> lastRefreshedAt;

    public Output<String> getLastRefreshedAt() {
        return this.lastRefreshedAt == null ? Codegen.empty() : this.lastRefreshedAt;
    }

    /**
     * Oldest cloud recovery point time.
     * 
     */
    @Import(name="oldestRecoveryPoint")
      private final @Nullable Output<String> oldestRecoveryPoint;

    public Output<String> getOldestRecoveryPoint() {
        return this.oldestRecoveryPoint == null ? Codegen.empty() : this.oldestRecoveryPoint;
    }

    /**
     * latest disk recovery point time.
     * 
     */
    @Import(name="onPremiseLatestRecoveryPoint")
      private final @Nullable Output<String> onPremiseLatestRecoveryPoint;

    public Output<String> getOnPremiseLatestRecoveryPoint() {
        return this.onPremiseLatestRecoveryPoint == null ? Codegen.empty() : this.onPremiseLatestRecoveryPoint;
    }

    /**
     * Oldest disk recovery point time.
     * 
     */
    @Import(name="onPremiseOldestRecoveryPoint")
      private final @Nullable Output<String> onPremiseOldestRecoveryPoint;

    public Output<String> getOnPremiseOldestRecoveryPoint() {
        return this.onPremiseOldestRecoveryPoint == null ? Codegen.empty() : this.onPremiseOldestRecoveryPoint;
    }

    /**
     * disk recovery point count.
     * 
     */
    @Import(name="onPremiseRecoveryPointCount")
      private final @Nullable Output<Integer> onPremiseRecoveryPointCount;

    public Output<Integer> getOnPremiseRecoveryPointCount() {
        return this.onPremiseRecoveryPointCount == null ? Codegen.empty() : this.onPremiseRecoveryPointCount;
    }

    /**
     * Attribute to provide information on various DBs.
     * 
     */
    @Import(name="protectableObjectLoadPath")
      private final @Nullable Output<Map<String,String>> protectableObjectLoadPath;

    public Output<Map<String,String>> getProtectableObjectLoadPath() {
        return this.protectableObjectLoadPath == null ? Codegen.empty() : this.protectableObjectLoadPath;
    }

    /**
     * To check if backup item is disk protected.
     * 
     */
    @Import(name="protected")
      private final @Nullable Output<Boolean> protected_;

    public Output<Boolean> getProtected_() {
        return this.protected_ == null ? Codegen.empty() : this.protected_;
    }

    /**
     * Protection group name of the backup item.
     * 
     */
    @Import(name="protectionGroupName")
      private final @Nullable Output<String> protectionGroupName;

    public Output<String> getProtectionGroupName() {
        return this.protectionGroupName == null ? Codegen.empty() : this.protectionGroupName;
    }

    /**
     * cloud recovery point count.
     * 
     */
    @Import(name="recoveryPointCount")
      private final @Nullable Output<Integer> recoveryPointCount;

    public Output<Integer> getRecoveryPointCount() {
        return this.recoveryPointCount == null ? Codegen.empty() : this.recoveryPointCount;
    }

    /**
     * total Disk storage in bytes.
     * 
     */
    @Import(name="totalDiskStorageSizeInBytes")
      private final @Nullable Output<String> totalDiskStorageSizeInBytes;

    public Output<String> getTotalDiskStorageSizeInBytes() {
        return this.totalDiskStorageSizeInBytes == null ? Codegen.empty() : this.totalDiskStorageSizeInBytes;
    }

    public DPMProtectedItemExtendedInfoArgs(
        @Nullable Output<String> diskStorageUsedInBytes,
        @Nullable Output<Boolean> isCollocated,
        @Nullable Output<Boolean> isPresentOnCloud,
        @Nullable Output<String> lastBackupStatus,
        @Nullable Output<String> lastRefreshedAt,
        @Nullable Output<String> oldestRecoveryPoint,
        @Nullable Output<String> onPremiseLatestRecoveryPoint,
        @Nullable Output<String> onPremiseOldestRecoveryPoint,
        @Nullable Output<Integer> onPremiseRecoveryPointCount,
        @Nullable Output<Map<String,String>> protectableObjectLoadPath,
        @Nullable Output<Boolean> protected_,
        @Nullable Output<String> protectionGroupName,
        @Nullable Output<Integer> recoveryPointCount,
        @Nullable Output<String> totalDiskStorageSizeInBytes) {
        this.diskStorageUsedInBytes = diskStorageUsedInBytes;
        this.isCollocated = isCollocated;
        this.isPresentOnCloud = isPresentOnCloud;
        this.lastBackupStatus = lastBackupStatus;
        this.lastRefreshedAt = lastRefreshedAt;
        this.oldestRecoveryPoint = oldestRecoveryPoint;
        this.onPremiseLatestRecoveryPoint = onPremiseLatestRecoveryPoint;
        this.onPremiseOldestRecoveryPoint = onPremiseOldestRecoveryPoint;
        this.onPremiseRecoveryPointCount = onPremiseRecoveryPointCount;
        this.protectableObjectLoadPath = protectableObjectLoadPath;
        this.protected_ = protected_;
        this.protectionGroupName = protectionGroupName;
        this.recoveryPointCount = recoveryPointCount;
        this.totalDiskStorageSizeInBytes = totalDiskStorageSizeInBytes;
    }

    private DPMProtectedItemExtendedInfoArgs() {
        this.diskStorageUsedInBytes = Codegen.empty();
        this.isCollocated = Codegen.empty();
        this.isPresentOnCloud = Codegen.empty();
        this.lastBackupStatus = Codegen.empty();
        this.lastRefreshedAt = Codegen.empty();
        this.oldestRecoveryPoint = Codegen.empty();
        this.onPremiseLatestRecoveryPoint = Codegen.empty();
        this.onPremiseOldestRecoveryPoint = Codegen.empty();
        this.onPremiseRecoveryPointCount = Codegen.empty();
        this.protectableObjectLoadPath = Codegen.empty();
        this.protected_ = Codegen.empty();
        this.protectionGroupName = Codegen.empty();
        this.recoveryPointCount = Codegen.empty();
        this.totalDiskStorageSizeInBytes = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(DPMProtectedItemExtendedInfoArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<String> diskStorageUsedInBytes;
        private @Nullable Output<Boolean> isCollocated;
        private @Nullable Output<Boolean> isPresentOnCloud;
        private @Nullable Output<String> lastBackupStatus;
        private @Nullable Output<String> lastRefreshedAt;
        private @Nullable Output<String> oldestRecoveryPoint;
        private @Nullable Output<String> onPremiseLatestRecoveryPoint;
        private @Nullable Output<String> onPremiseOldestRecoveryPoint;
        private @Nullable Output<Integer> onPremiseRecoveryPointCount;
        private @Nullable Output<Map<String,String>> protectableObjectLoadPath;
        private @Nullable Output<Boolean> protected_;
        private @Nullable Output<String> protectionGroupName;
        private @Nullable Output<Integer> recoveryPointCount;
        private @Nullable Output<String> totalDiskStorageSizeInBytes;

        public Builder() {
    	      // Empty
        }

        public Builder(DPMProtectedItemExtendedInfoArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.diskStorageUsedInBytes = defaults.diskStorageUsedInBytes;
    	      this.isCollocated = defaults.isCollocated;
    	      this.isPresentOnCloud = defaults.isPresentOnCloud;
    	      this.lastBackupStatus = defaults.lastBackupStatus;
    	      this.lastRefreshedAt = defaults.lastRefreshedAt;
    	      this.oldestRecoveryPoint = defaults.oldestRecoveryPoint;
    	      this.onPremiseLatestRecoveryPoint = defaults.onPremiseLatestRecoveryPoint;
    	      this.onPremiseOldestRecoveryPoint = defaults.onPremiseOldestRecoveryPoint;
    	      this.onPremiseRecoveryPointCount = defaults.onPremiseRecoveryPointCount;
    	      this.protectableObjectLoadPath = defaults.protectableObjectLoadPath;
    	      this.protected_ = defaults.protected_;
    	      this.protectionGroupName = defaults.protectionGroupName;
    	      this.recoveryPointCount = defaults.recoveryPointCount;
    	      this.totalDiskStorageSizeInBytes = defaults.totalDiskStorageSizeInBytes;
        }

        public Builder diskStorageUsedInBytes(@Nullable Output<String> diskStorageUsedInBytes) {
            this.diskStorageUsedInBytes = diskStorageUsedInBytes;
            return this;
        }
        public Builder diskStorageUsedInBytes(@Nullable String diskStorageUsedInBytes) {
            this.diskStorageUsedInBytes = Codegen.ofNullable(diskStorageUsedInBytes);
            return this;
        }
        public Builder isCollocated(@Nullable Output<Boolean> isCollocated) {
            this.isCollocated = isCollocated;
            return this;
        }
        public Builder isCollocated(@Nullable Boolean isCollocated) {
            this.isCollocated = Codegen.ofNullable(isCollocated);
            return this;
        }
        public Builder isPresentOnCloud(@Nullable Output<Boolean> isPresentOnCloud) {
            this.isPresentOnCloud = isPresentOnCloud;
            return this;
        }
        public Builder isPresentOnCloud(@Nullable Boolean isPresentOnCloud) {
            this.isPresentOnCloud = Codegen.ofNullable(isPresentOnCloud);
            return this;
        }
        public Builder lastBackupStatus(@Nullable Output<String> lastBackupStatus) {
            this.lastBackupStatus = lastBackupStatus;
            return this;
        }
        public Builder lastBackupStatus(@Nullable String lastBackupStatus) {
            this.lastBackupStatus = Codegen.ofNullable(lastBackupStatus);
            return this;
        }
        public Builder lastRefreshedAt(@Nullable Output<String> lastRefreshedAt) {
            this.lastRefreshedAt = lastRefreshedAt;
            return this;
        }
        public Builder lastRefreshedAt(@Nullable String lastRefreshedAt) {
            this.lastRefreshedAt = Codegen.ofNullable(lastRefreshedAt);
            return this;
        }
        public Builder oldestRecoveryPoint(@Nullable Output<String> oldestRecoveryPoint) {
            this.oldestRecoveryPoint = oldestRecoveryPoint;
            return this;
        }
        public Builder oldestRecoveryPoint(@Nullable String oldestRecoveryPoint) {
            this.oldestRecoveryPoint = Codegen.ofNullable(oldestRecoveryPoint);
            return this;
        }
        public Builder onPremiseLatestRecoveryPoint(@Nullable Output<String> onPremiseLatestRecoveryPoint) {
            this.onPremiseLatestRecoveryPoint = onPremiseLatestRecoveryPoint;
            return this;
        }
        public Builder onPremiseLatestRecoveryPoint(@Nullable String onPremiseLatestRecoveryPoint) {
            this.onPremiseLatestRecoveryPoint = Codegen.ofNullable(onPremiseLatestRecoveryPoint);
            return this;
        }
        public Builder onPremiseOldestRecoveryPoint(@Nullable Output<String> onPremiseOldestRecoveryPoint) {
            this.onPremiseOldestRecoveryPoint = onPremiseOldestRecoveryPoint;
            return this;
        }
        public Builder onPremiseOldestRecoveryPoint(@Nullable String onPremiseOldestRecoveryPoint) {
            this.onPremiseOldestRecoveryPoint = Codegen.ofNullable(onPremiseOldestRecoveryPoint);
            return this;
        }
        public Builder onPremiseRecoveryPointCount(@Nullable Output<Integer> onPremiseRecoveryPointCount) {
            this.onPremiseRecoveryPointCount = onPremiseRecoveryPointCount;
            return this;
        }
        public Builder onPremiseRecoveryPointCount(@Nullable Integer onPremiseRecoveryPointCount) {
            this.onPremiseRecoveryPointCount = Codegen.ofNullable(onPremiseRecoveryPointCount);
            return this;
        }
        public Builder protectableObjectLoadPath(@Nullable Output<Map<String,String>> protectableObjectLoadPath) {
            this.protectableObjectLoadPath = protectableObjectLoadPath;
            return this;
        }
        public Builder protectableObjectLoadPath(@Nullable Map<String,String> protectableObjectLoadPath) {
            this.protectableObjectLoadPath = Codegen.ofNullable(protectableObjectLoadPath);
            return this;
        }
        public Builder protected_(@Nullable Output<Boolean> protected_) {
            this.protected_ = protected_;
            return this;
        }
        public Builder protected_(@Nullable Boolean protected_) {
            this.protected_ = Codegen.ofNullable(protected_);
            return this;
        }
        public Builder protectionGroupName(@Nullable Output<String> protectionGroupName) {
            this.protectionGroupName = protectionGroupName;
            return this;
        }
        public Builder protectionGroupName(@Nullable String protectionGroupName) {
            this.protectionGroupName = Codegen.ofNullable(protectionGroupName);
            return this;
        }
        public Builder recoveryPointCount(@Nullable Output<Integer> recoveryPointCount) {
            this.recoveryPointCount = recoveryPointCount;
            return this;
        }
        public Builder recoveryPointCount(@Nullable Integer recoveryPointCount) {
            this.recoveryPointCount = Codegen.ofNullable(recoveryPointCount);
            return this;
        }
        public Builder totalDiskStorageSizeInBytes(@Nullable Output<String> totalDiskStorageSizeInBytes) {
            this.totalDiskStorageSizeInBytes = totalDiskStorageSizeInBytes;
            return this;
        }
        public Builder totalDiskStorageSizeInBytes(@Nullable String totalDiskStorageSizeInBytes) {
            this.totalDiskStorageSizeInBytes = Codegen.ofNullable(totalDiskStorageSizeInBytes);
            return this;
        }        public DPMProtectedItemExtendedInfoArgs build() {
            return new DPMProtectedItemExtendedInfoArgs(diskStorageUsedInBytes, isCollocated, isPresentOnCloud, lastBackupStatus, lastRefreshedAt, oldestRecoveryPoint, onPremiseLatestRecoveryPoint, onPremiseOldestRecoveryPoint, onPremiseRecoveryPointCount, protectableObjectLoadPath, protected_, protectionGroupName, recoveryPointCount, totalDiskStorageSizeInBytes);
        }
    }
}
