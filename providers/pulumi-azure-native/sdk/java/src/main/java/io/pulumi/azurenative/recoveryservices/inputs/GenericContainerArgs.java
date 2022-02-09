// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.recoveryservices.inputs;

import io.pulumi.azurenative.recoveryservices.enums.BackupManagementType;
import io.pulumi.azurenative.recoveryservices.inputs.GenericContainerExtendedInfoArgs;
import io.pulumi.core.Either;
import io.pulumi.core.Input;
import io.pulumi.core.internal.annotations.InputImport;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class GenericContainerArgs extends io.pulumi.resources.ResourceArgs {

    public static final GenericContainerArgs Empty = new GenericContainerArgs();

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

    @InputImport(name="extendedInformation")
    private final @Nullable Input<GenericContainerExtendedInfoArgs> extendedInformation;

    public Input<GenericContainerExtendedInfoArgs> getExtendedInformation() {
        return this.extendedInformation == null ? Input.empty() : this.extendedInformation;
    }

    @InputImport(name="fabricName")
    private final @Nullable Input<String> fabricName;

    public Input<String> getFabricName() {
        return this.fabricName == null ? Input.empty() : this.fabricName;
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

    @InputImport(name="registrationStatus")
    private final @Nullable Input<String> registrationStatus;

    public Input<String> getRegistrationStatus() {
        return this.registrationStatus == null ? Input.empty() : this.registrationStatus;
    }

    public GenericContainerArgs(
        @Nullable Input<Either<String,BackupManagementType>> backupManagementType,
        Input<String> containerType,
        @Nullable Input<GenericContainerExtendedInfoArgs> extendedInformation,
        @Nullable Input<String> fabricName,
        @Nullable Input<String> friendlyName,
        @Nullable Input<String> healthStatus,
        @Nullable Input<String> registrationStatus) {
        this.backupManagementType = backupManagementType;
        this.containerType = Objects.requireNonNull(containerType, "expected parameter 'containerType' to be non-null");
        this.extendedInformation = extendedInformation;
        this.fabricName = fabricName;
        this.friendlyName = friendlyName;
        this.healthStatus = healthStatus;
        this.registrationStatus = registrationStatus;
    }

    private GenericContainerArgs() {
        this.backupManagementType = Input.empty();
        this.containerType = Input.empty();
        this.extendedInformation = Input.empty();
        this.fabricName = Input.empty();
        this.friendlyName = Input.empty();
        this.healthStatus = Input.empty();
        this.registrationStatus = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GenericContainerArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<Either<String,BackupManagementType>> backupManagementType;
        private Input<String> containerType;
        private @Nullable Input<GenericContainerExtendedInfoArgs> extendedInformation;
        private @Nullable Input<String> fabricName;
        private @Nullable Input<String> friendlyName;
        private @Nullable Input<String> healthStatus;
        private @Nullable Input<String> registrationStatus;

        public Builder() {
    	      // Empty
        }

        public Builder(GenericContainerArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.backupManagementType = defaults.backupManagementType;
    	      this.containerType = defaults.containerType;
    	      this.extendedInformation = defaults.extendedInformation;
    	      this.fabricName = defaults.fabricName;
    	      this.friendlyName = defaults.friendlyName;
    	      this.healthStatus = defaults.healthStatus;
    	      this.registrationStatus = defaults.registrationStatus;
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

        public Builder setExtendedInformation(@Nullable Input<GenericContainerExtendedInfoArgs> extendedInformation) {
            this.extendedInformation = extendedInformation;
            return this;
        }

        public Builder setExtendedInformation(@Nullable GenericContainerExtendedInfoArgs extendedInformation) {
            this.extendedInformation = Input.ofNullable(extendedInformation);
            return this;
        }

        public Builder setFabricName(@Nullable Input<String> fabricName) {
            this.fabricName = fabricName;
            return this;
        }

        public Builder setFabricName(@Nullable String fabricName) {
            this.fabricName = Input.ofNullable(fabricName);
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

        public Builder setRegistrationStatus(@Nullable Input<String> registrationStatus) {
            this.registrationStatus = registrationStatus;
            return this;
        }

        public Builder setRegistrationStatus(@Nullable String registrationStatus) {
            this.registrationStatus = Input.ofNullable(registrationStatus);
            return this;
        }

        public GenericContainerArgs build() {
            return new GenericContainerArgs(backupManagementType, containerType, extendedInformation, fabricName, friendlyName, healthStatus, registrationStatus);
        }
    }
}
