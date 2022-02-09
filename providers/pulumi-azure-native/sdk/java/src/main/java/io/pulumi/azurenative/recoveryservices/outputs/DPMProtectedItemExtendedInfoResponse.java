// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.recoveryservices.outputs;

import io.pulumi.core.internal.annotations.OutputCustomType;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class DPMProtectedItemExtendedInfoResponse {
    private final @Nullable String diskStorageUsedInBytes;
    private final @Nullable Boolean isCollocated;
    private final @Nullable Boolean isPresentOnCloud;
    private final @Nullable String lastBackupStatus;
    private final @Nullable String lastRefreshedAt;
    private final @Nullable String oldestRecoveryPoint;
    private final @Nullable String onPremiseLatestRecoveryPoint;
    private final @Nullable String onPremiseOldestRecoveryPoint;
    private final @Nullable Integer onPremiseRecoveryPointCount;
    private final @Nullable Map<String,String> protectableObjectLoadPath;
    private final @Nullable Boolean $protected;
    private final @Nullable String protectionGroupName;
    private final @Nullable Integer recoveryPointCount;
    private final @Nullable String totalDiskStorageSizeInBytes;

    @OutputCustomType.Constructor({"diskStorageUsedInBytes","isCollocated","isPresentOnCloud","lastBackupStatus","lastRefreshedAt","oldestRecoveryPoint","onPremiseLatestRecoveryPoint","onPremiseOldestRecoveryPoint","onPremiseRecoveryPointCount","protectableObjectLoadPath","$protected","protectionGroupName","recoveryPointCount","totalDiskStorageSizeInBytes"})
    private DPMProtectedItemExtendedInfoResponse(
        @Nullable String diskStorageUsedInBytes,
        @Nullable Boolean isCollocated,
        @Nullable Boolean isPresentOnCloud,
        @Nullable String lastBackupStatus,
        @Nullable String lastRefreshedAt,
        @Nullable String oldestRecoveryPoint,
        @Nullable String onPremiseLatestRecoveryPoint,
        @Nullable String onPremiseOldestRecoveryPoint,
        @Nullable Integer onPremiseRecoveryPointCount,
        @Nullable Map<String,String> protectableObjectLoadPath,
        @Nullable Boolean $protected,
        @Nullable String protectionGroupName,
        @Nullable Integer recoveryPointCount,
        @Nullable String totalDiskStorageSizeInBytes) {
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
        this.$protected = $protected;
        this.protectionGroupName = protectionGroupName;
        this.recoveryPointCount = recoveryPointCount;
        this.totalDiskStorageSizeInBytes = totalDiskStorageSizeInBytes;
    }

    public Optional<String> getDiskStorageUsedInBytes() {
        return Optional.ofNullable(this.diskStorageUsedInBytes);
    }
    public Optional<Boolean> getIsCollocated() {
        return Optional.ofNullable(this.isCollocated);
    }
    public Optional<Boolean> getIsPresentOnCloud() {
        return Optional.ofNullable(this.isPresentOnCloud);
    }
    public Optional<String> getLastBackupStatus() {
        return Optional.ofNullable(this.lastBackupStatus);
    }
    public Optional<String> getLastRefreshedAt() {
        return Optional.ofNullable(this.lastRefreshedAt);
    }
    public Optional<String> getOldestRecoveryPoint() {
        return Optional.ofNullable(this.oldestRecoveryPoint);
    }
    public Optional<String> getOnPremiseLatestRecoveryPoint() {
        return Optional.ofNullable(this.onPremiseLatestRecoveryPoint);
    }
    public Optional<String> getOnPremiseOldestRecoveryPoint() {
        return Optional.ofNullable(this.onPremiseOldestRecoveryPoint);
    }
    public Optional<Integer> getOnPremiseRecoveryPointCount() {
        return Optional.ofNullable(this.onPremiseRecoveryPointCount);
    }
    public Map<String,String> getProtectableObjectLoadPath() {
        return this.protectableObjectLoadPath == null ? Map.of() : this.protectableObjectLoadPath;
    }
    public Optional<Boolean> get$protected() {
        return Optional.ofNullable(this.$protected);
    }
    public Optional<String> getProtectionGroupName() {
        return Optional.ofNullable(this.protectionGroupName);
    }
    public Optional<Integer> getRecoveryPointCount() {
        return Optional.ofNullable(this.recoveryPointCount);
    }
    public Optional<String> getTotalDiskStorageSizeInBytes() {
        return Optional.ofNullable(this.totalDiskStorageSizeInBytes);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(DPMProtectedItemExtendedInfoResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String diskStorageUsedInBytes;
        private @Nullable Boolean isCollocated;
        private @Nullable Boolean isPresentOnCloud;
        private @Nullable String lastBackupStatus;
        private @Nullable String lastRefreshedAt;
        private @Nullable String oldestRecoveryPoint;
        private @Nullable String onPremiseLatestRecoveryPoint;
        private @Nullable String onPremiseOldestRecoveryPoint;
        private @Nullable Integer onPremiseRecoveryPointCount;
        private @Nullable Map<String,String> protectableObjectLoadPath;
        private @Nullable Boolean $protected;
        private @Nullable String protectionGroupName;
        private @Nullable Integer recoveryPointCount;
        private @Nullable String totalDiskStorageSizeInBytes;

        public Builder() {
    	      // Empty
        }

        public Builder(DPMProtectedItemExtendedInfoResponse defaults) {
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
    	      this.$protected = defaults.$protected;
    	      this.protectionGroupName = defaults.protectionGroupName;
    	      this.recoveryPointCount = defaults.recoveryPointCount;
    	      this.totalDiskStorageSizeInBytes = defaults.totalDiskStorageSizeInBytes;
        }

        public Builder setDiskStorageUsedInBytes(@Nullable String diskStorageUsedInBytes) {
            this.diskStorageUsedInBytes = diskStorageUsedInBytes;
            return this;
        }

        public Builder setIsCollocated(@Nullable Boolean isCollocated) {
            this.isCollocated = isCollocated;
            return this;
        }

        public Builder setIsPresentOnCloud(@Nullable Boolean isPresentOnCloud) {
            this.isPresentOnCloud = isPresentOnCloud;
            return this;
        }

        public Builder setLastBackupStatus(@Nullable String lastBackupStatus) {
            this.lastBackupStatus = lastBackupStatus;
            return this;
        }

        public Builder setLastRefreshedAt(@Nullable String lastRefreshedAt) {
            this.lastRefreshedAt = lastRefreshedAt;
            return this;
        }

        public Builder setOldestRecoveryPoint(@Nullable String oldestRecoveryPoint) {
            this.oldestRecoveryPoint = oldestRecoveryPoint;
            return this;
        }

        public Builder setOnPremiseLatestRecoveryPoint(@Nullable String onPremiseLatestRecoveryPoint) {
            this.onPremiseLatestRecoveryPoint = onPremiseLatestRecoveryPoint;
            return this;
        }

        public Builder setOnPremiseOldestRecoveryPoint(@Nullable String onPremiseOldestRecoveryPoint) {
            this.onPremiseOldestRecoveryPoint = onPremiseOldestRecoveryPoint;
            return this;
        }

        public Builder setOnPremiseRecoveryPointCount(@Nullable Integer onPremiseRecoveryPointCount) {
            this.onPremiseRecoveryPointCount = onPremiseRecoveryPointCount;
            return this;
        }

        public Builder setProtectableObjectLoadPath(@Nullable Map<String,String> protectableObjectLoadPath) {
            this.protectableObjectLoadPath = protectableObjectLoadPath;
            return this;
        }

        public Builder set$protected(@Nullable Boolean $protected) {
            this.$protected = $protected;
            return this;
        }

        public Builder setProtectionGroupName(@Nullable String protectionGroupName) {
            this.protectionGroupName = protectionGroupName;
            return this;
        }

        public Builder setRecoveryPointCount(@Nullable Integer recoveryPointCount) {
            this.recoveryPointCount = recoveryPointCount;
            return this;
        }

        public Builder setTotalDiskStorageSizeInBytes(@Nullable String totalDiskStorageSizeInBytes) {
            this.totalDiskStorageSizeInBytes = totalDiskStorageSizeInBytes;
            return this;
        }

        public DPMProtectedItemExtendedInfoResponse build() {
            return new DPMProtectedItemExtendedInfoResponse(diskStorageUsedInBytes, isCollocated, isPresentOnCloud, lastBackupStatus, lastRefreshedAt, oldestRecoveryPoint, onPremiseLatestRecoveryPoint, onPremiseOldestRecoveryPoint, onPremiseRecoveryPointCount, protectableObjectLoadPath, $protected, protectionGroupName, recoveryPointCount, totalDiskStorageSizeInBytes);
        }
    }
}
