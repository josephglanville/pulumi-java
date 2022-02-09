// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.recoveryservices.inputs;

import io.pulumi.azurenative.recoveryservices.enums.BackupManagementType;
import io.pulumi.core.Either;
import io.pulumi.core.Input;
import io.pulumi.core.internal.annotations.InputImport;
import java.lang.Double;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class AzureStorageContainerArgs extends io.pulumi.resources.ResourceArgs {

    public static final AzureStorageContainerArgs Empty = new AzureStorageContainerArgs();

    @InputImport(name="backupManagementType")
    private final @Nullable Input<Either<String,BackupManagementType>> backupManagementType;

    public Input<Either<String,BackupManagementType>> getBackupManagementType() {
        return this.backupManagementType == null ? Input.empty() : this.backupManagementType;
    }

    @InputImport(name="containerType", required=true)
    private final Input<String> containerType;

    public Input<String> getContainerType() {
        return this.containerType;
    }

    @InputImport(name="friendlyName")
    private final @Nullable Input<String> friendlyName;

    public Input<String> getFriendlyName() {
        return this.friendlyName == null ? Input.empty() : this.friendlyName;
    }

    @InputImport(name="healthStatus")
    private final @Nullable Input<String> healthStatus;

    public Input<String> getHealthStatus() {
        return this.healthStatus == null ? Input.empty() : this.healthStatus;
    }

    @InputImport(name="protectedItemCount")
    private final @Nullable Input<Double> protectedItemCount;

    public Input<Double> getProtectedItemCount() {
        return this.protectedItemCount == null ? Input.empty() : this.protectedItemCount;
    }

    @InputImport(name="registrationStatus")
    private final @Nullable Input<String> registrationStatus;

    public Input<String> getRegistrationStatus() {
        return this.registrationStatus == null ? Input.empty() : this.registrationStatus;
    }

    @InputImport(name="resourceGroup")
    private final @Nullable Input<String> resourceGroup;

    public Input<String> getResourceGroup() {
        return this.resourceGroup == null ? Input.empty() : this.resourceGroup;
    }

    @InputImport(name="sourceResourceId")
    private final @Nullable Input<String> sourceResourceId;

    public Input<String> getSourceResourceId() {
        return this.sourceResourceId == null ? Input.empty() : this.sourceResourceId;
    }

    @InputImport(name="storageAccountVersion")
    private final @Nullable Input<String> storageAccountVersion;

    public Input<String> getStorageAccountVersion() {
        return this.storageAccountVersion == null ? Input.empty() : this.storageAccountVersion;
    }

    public AzureStorageContainerArgs(
        @Nullable Input<Either<String,BackupManagementType>> backupManagementType,
        Input<String> containerType,
        @Nullable Input<String> friendlyName,
        @Nullable Input<String> healthStatus,
        @Nullable Input<Double> protectedItemCount,
        @Nullable Input<String> registrationStatus,
        @Nullable Input<String> resourceGroup,
        @Nullable Input<String> sourceResourceId,
        @Nullable Input<String> storageAccountVersion) {
        this.backupManagementType = backupManagementType;
        this.containerType = Objects.requireNonNull(containerType, "expected parameter 'containerType' to be non-null");
        this.friendlyName = friendlyName;
        this.healthStatus = healthStatus;
        this.protectedItemCount = protectedItemCount;
        this.registrationStatus = registrationStatus;
        this.resourceGroup = resourceGroup;
        this.sourceResourceId = sourceResourceId;
        this.storageAccountVersion = storageAccountVersion;
    }

    private AzureStorageContainerArgs() {
        this.backupManagementType = Input.empty();
        this.containerType = Input.empty();
        this.friendlyName = Input.empty();
        this.healthStatus = Input.empty();
        this.protectedItemCount = Input.empty();
        this.registrationStatus = Input.empty();
        this.resourceGroup = Input.empty();
        this.sourceResourceId = Input.empty();
        this.storageAccountVersion = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(AzureStorageContainerArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<Either<String,BackupManagementType>> backupManagementType;
        private Input<String> containerType;
        private @Nullable Input<String> friendlyName;
        private @Nullable Input<String> healthStatus;
        private @Nullable Input<Double> protectedItemCount;
        private @Nullable Input<String> registrationStatus;
        private @Nullable Input<String> resourceGroup;
        private @Nullable Input<String> sourceResourceId;
        private @Nullable Input<String> storageAccountVersion;

        public Builder() {
    	      // Empty
        }

        public Builder(AzureStorageContainerArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.backupManagementType = defaults.backupManagementType;
    	      this.containerType = defaults.containerType;
    	      this.friendlyName = defaults.friendlyName;
    	      this.healthStatus = defaults.healthStatus;
    	      this.protectedItemCount = defaults.protectedItemCount;
    	      this.registrationStatus = defaults.registrationStatus;
    	      this.resourceGroup = defaults.resourceGroup;
    	      this.sourceResourceId = defaults.sourceResourceId;
    	      this.storageAccountVersion = defaults.storageAccountVersion;
        }

        public Builder setBackupManagementType(@Nullable Input<Either<String,BackupManagementType>> backupManagementType) {
            this.backupManagementType = backupManagementType;
            return this;
        }

        public Builder setBackupManagementType(@Nullable Either<String,BackupManagementType> backupManagementType) {
            this.backupManagementType = Input.ofNullable(backupManagementType);
            return this;
        }

        public Builder setContainerType(Input<String> containerType) {
            this.containerType = Objects.requireNonNull(containerType);
            return this;
        }

        public Builder setContainerType(String containerType) {
            this.containerType = Input.of(Objects.requireNonNull(containerType));
            return this;
        }

        public Builder setFriendlyName(@Nullable Input<String> friendlyName) {
            this.friendlyName = friendlyName;
            return this;
        }

        public Builder setFriendlyName(@Nullable String friendlyName) {
            this.friendlyName = Input.ofNullable(friendlyName);
            return this;
        }

        public Builder setHealthStatus(@Nullable Input<String> healthStatus) {
            this.healthStatus = healthStatus;
            return this;
        }

        public Builder setHealthStatus(@Nullable String healthStatus) {
            this.healthStatus = Input.ofNullable(healthStatus);
            return this;
        }

        public Builder setProtectedItemCount(@Nullable Input<Double> protectedItemCount) {
            this.protectedItemCount = protectedItemCount;
            return this;
        }

        public Builder setProtectedItemCount(@Nullable Double protectedItemCount) {
            this.protectedItemCount = Input.ofNullable(protectedItemCount);
            return this;
        }

        public Builder setRegistrationStatus(@Nullable Input<String> registrationStatus) {
            this.registrationStatus = registrationStatus;
            return this;
        }

        public Builder setRegistrationStatus(@Nullable String registrationStatus) {
            this.registrationStatus = Input.ofNullable(registrationStatus);
            return this;
        }

        public Builder setResourceGroup(@Nullable Input<String> resourceGroup) {
            this.resourceGroup = resourceGroup;
            return this;
        }

        public Builder setResourceGroup(@Nullable String resourceGroup) {
            this.resourceGroup = Input.ofNullable(resourceGroup);
            return this;
        }

        public Builder setSourceResourceId(@Nullable Input<String> sourceResourceId) {
            this.sourceResourceId = sourceResourceId;
            return this;
        }

        public Builder setSourceResourceId(@Nullable String sourceResourceId) {
            this.sourceResourceId = Input.ofNullable(sourceResourceId);
            return this;
        }

        public Builder setStorageAccountVersion(@Nullable Input<String> storageAccountVersion) {
            this.storageAccountVersion = storageAccountVersion;
            return this;
        }

        public Builder setStorageAccountVersion(@Nullable String storageAccountVersion) {
            this.storageAccountVersion = Input.ofNullable(storageAccountVersion);
            return this;
        }

        public AzureStorageContainerArgs build() {
            return new AzureStorageContainerArgs(backupManagementType, containerType, friendlyName, healthStatus, protectedItemCount, registrationStatus, resourceGroup, sourceResourceId, storageAccountVersion);
        }
    }
}
