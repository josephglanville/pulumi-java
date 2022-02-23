// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.recoveryservices.inputs;

import io.pulumi.azurenative.recoveryservices.enums.BackupManagementType;
import io.pulumi.azurenative.recoveryservices.inputs.DPMContainerExtendedInfoArgs;
import io.pulumi.core.Either;
import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.Boolean;
import java.lang.Double;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * DPM workload-specific protection container.
 * 
 */
public final class DpmContainerArgs extends io.pulumi.resources.ResourceArgs {

    public static final DpmContainerArgs Empty = new DpmContainerArgs();

    /**
     * Type of backup management for the container.
     * 
     */
    @InputImport(name="backupManagementType")
      private final @Nullable Input<Either<String,BackupManagementType>> backupManagementType;

    public Input<Either<String,BackupManagementType>> getBackupManagementType() {
        return this.backupManagementType == null ? Input.empty() : this.backupManagementType;
    }

    /**
     * Specifies whether the container is re-registrable.
     * 
     */
    @InputImport(name="canReRegister")
      private final @Nullable Input<Boolean> canReRegister;

    public Input<Boolean> getCanReRegister() {
        return this.canReRegister == null ? Input.empty() : this.canReRegister;
    }

    /**
     * ID of container.
     * 
     */
    @InputImport(name="containerId")
      private final @Nullable Input<String> containerId;

    public Input<String> getContainerId() {
        return this.containerId == null ? Input.empty() : this.containerId;
    }

    /**
     * Type of the container. The value of this property for: 1. Compute Azure VM is Microsoft.Compute/virtualMachines 2.
     * Classic Compute Azure VM is Microsoft.ClassicCompute/virtualMachines 3. Windows machines (like MAB, DPM etc) is
     * Windows 4. Azure SQL instance is AzureSqlContainer. 5. Storage containers is StorageContainer. 6. Azure workload
     * Backup is VMAppContainer
     * Expected value is 'DPMContainer'.
     * 
     */
    @InputImport(name="containerType", required=true)
      private final Input<String> containerType;

    public Input<String> getContainerType() {
        return this.containerType;
    }

    /**
     * Backup engine Agent version
     * 
     */
    @InputImport(name="dpmAgentVersion")
      private final @Nullable Input<String> dpmAgentVersion;

    public Input<String> getDpmAgentVersion() {
        return this.dpmAgentVersion == null ? Input.empty() : this.dpmAgentVersion;
    }

    /**
     * List of BackupEngines protecting the container
     * 
     */
    @InputImport(name="dpmServers")
      private final @Nullable Input<List<String>> dpmServers;

    public Input<List<String>> getDpmServers() {
        return this.dpmServers == null ? Input.empty() : this.dpmServers;
    }

    /**
     * Extended Info of the container.
     * 
     */
    @InputImport(name="extendedInfo")
      private final @Nullable Input<DPMContainerExtendedInfoArgs> extendedInfo;

    public Input<DPMContainerExtendedInfoArgs> getExtendedInfo() {
        return this.extendedInfo == null ? Input.empty() : this.extendedInfo;
    }

    /**
     * Friendly name of the container.
     * 
     */
    @InputImport(name="friendlyName")
      private final @Nullable Input<String> friendlyName;

    public Input<String> getFriendlyName() {
        return this.friendlyName == null ? Input.empty() : this.friendlyName;
    }

    /**
     * Status of health of the container.
     * 
     */
    @InputImport(name="healthStatus")
      private final @Nullable Input<String> healthStatus;

    public Input<String> getHealthStatus() {
        return this.healthStatus == null ? Input.empty() : this.healthStatus;
    }

    /**
     * Number of protected items in the BackupEngine
     * 
     */
    @InputImport(name="protectedItemCount")
      private final @Nullable Input<Double> protectedItemCount;

    public Input<Double> getProtectedItemCount() {
        return this.protectedItemCount == null ? Input.empty() : this.protectedItemCount;
    }

    /**
     * Protection status of the container.
     * 
     */
    @InputImport(name="protectionStatus")
      private final @Nullable Input<String> protectionStatus;

    public Input<String> getProtectionStatus() {
        return this.protectionStatus == null ? Input.empty() : this.protectionStatus;
    }

    /**
     * Status of registration of the container with the Recovery Services Vault.
     * 
     */
    @InputImport(name="registrationStatus")
      private final @Nullable Input<String> registrationStatus;

    public Input<String> getRegistrationStatus() {
        return this.registrationStatus == null ? Input.empty() : this.registrationStatus;
    }

    /**
     * To check if upgrade available
     * 
     */
    @InputImport(name="upgradeAvailable")
      private final @Nullable Input<Boolean> upgradeAvailable;

    public Input<Boolean> getUpgradeAvailable() {
        return this.upgradeAvailable == null ? Input.empty() : this.upgradeAvailable;
    }

    public DpmContainerArgs(
        @Nullable Input<Either<String,BackupManagementType>> backupManagementType,
        @Nullable Input<Boolean> canReRegister,
        @Nullable Input<String> containerId,
        Input<String> containerType,
        @Nullable Input<String> dpmAgentVersion,
        @Nullable Input<List<String>> dpmServers,
        @Nullable Input<DPMContainerExtendedInfoArgs> extendedInfo,
        @Nullable Input<String> friendlyName,
        @Nullable Input<String> healthStatus,
        @Nullable Input<Double> protectedItemCount,
        @Nullable Input<String> protectionStatus,
        @Nullable Input<String> registrationStatus,
        @Nullable Input<Boolean> upgradeAvailable) {
        this.backupManagementType = backupManagementType;
        this.canReRegister = canReRegister;
        this.containerId = containerId;
        this.containerType = Objects.requireNonNull(containerType, "expected parameter 'containerType' to be non-null");
        this.dpmAgentVersion = dpmAgentVersion;
        this.dpmServers = dpmServers;
        this.extendedInfo = extendedInfo;
        this.friendlyName = friendlyName;
        this.healthStatus = healthStatus;
        this.protectedItemCount = protectedItemCount;
        this.protectionStatus = protectionStatus;
        this.registrationStatus = registrationStatus;
        this.upgradeAvailable = upgradeAvailable;
    }

    private DpmContainerArgs() {
        this.backupManagementType = Input.empty();
        this.canReRegister = Input.empty();
        this.containerId = Input.empty();
        this.containerType = Input.empty();
        this.dpmAgentVersion = Input.empty();
        this.dpmServers = Input.empty();
        this.extendedInfo = Input.empty();
        this.friendlyName = Input.empty();
        this.healthStatus = Input.empty();
        this.protectedItemCount = Input.empty();
        this.protectionStatus = Input.empty();
        this.registrationStatus = Input.empty();
        this.upgradeAvailable = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(DpmContainerArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<Either<String,BackupManagementType>> backupManagementType;
        private @Nullable Input<Boolean> canReRegister;
        private @Nullable Input<String> containerId;
        private Input<String> containerType;
        private @Nullable Input<String> dpmAgentVersion;
        private @Nullable Input<List<String>> dpmServers;
        private @Nullable Input<DPMContainerExtendedInfoArgs> extendedInfo;
        private @Nullable Input<String> friendlyName;
        private @Nullable Input<String> healthStatus;
        private @Nullable Input<Double> protectedItemCount;
        private @Nullable Input<String> protectionStatus;
        private @Nullable Input<String> registrationStatus;
        private @Nullable Input<Boolean> upgradeAvailable;

        public Builder() {
    	      // Empty
        }

        public Builder(DpmContainerArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.backupManagementType = defaults.backupManagementType;
    	      this.canReRegister = defaults.canReRegister;
    	      this.containerId = defaults.containerId;
    	      this.containerType = defaults.containerType;
    	      this.dpmAgentVersion = defaults.dpmAgentVersion;
    	      this.dpmServers = defaults.dpmServers;
    	      this.extendedInfo = defaults.extendedInfo;
    	      this.friendlyName = defaults.friendlyName;
    	      this.healthStatus = defaults.healthStatus;
    	      this.protectedItemCount = defaults.protectedItemCount;
    	      this.protectionStatus = defaults.protectionStatus;
    	      this.registrationStatus = defaults.registrationStatus;
    	      this.upgradeAvailable = defaults.upgradeAvailable;
        }

        public Builder setBackupManagementType(@Nullable Input<Either<String,BackupManagementType>> backupManagementType) {
            this.backupManagementType = backupManagementType;
            return this;
        }

        public Builder setBackupManagementType(@Nullable Either<String,BackupManagementType> backupManagementType) {
            this.backupManagementType = Input.ofNullable(backupManagementType);
            return this;
        }

        public Builder setCanReRegister(@Nullable Input<Boolean> canReRegister) {
            this.canReRegister = canReRegister;
            return this;
        }

        public Builder setCanReRegister(@Nullable Boolean canReRegister) {
            this.canReRegister = Input.ofNullable(canReRegister);
            return this;
        }

        public Builder setContainerId(@Nullable Input<String> containerId) {
            this.containerId = containerId;
            return this;
        }

        public Builder setContainerId(@Nullable String containerId) {
            this.containerId = Input.ofNullable(containerId);
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

        public Builder setDpmAgentVersion(@Nullable Input<String> dpmAgentVersion) {
            this.dpmAgentVersion = dpmAgentVersion;
            return this;
        }

        public Builder setDpmAgentVersion(@Nullable String dpmAgentVersion) {
            this.dpmAgentVersion = Input.ofNullable(dpmAgentVersion);
            return this;
        }

        public Builder setDpmServers(@Nullable Input<List<String>> dpmServers) {
            this.dpmServers = dpmServers;
            return this;
        }

        public Builder setDpmServers(@Nullable List<String> dpmServers) {
            this.dpmServers = Input.ofNullable(dpmServers);
            return this;
        }

        public Builder setExtendedInfo(@Nullable Input<DPMContainerExtendedInfoArgs> extendedInfo) {
            this.extendedInfo = extendedInfo;
            return this;
        }

        public Builder setExtendedInfo(@Nullable DPMContainerExtendedInfoArgs extendedInfo) {
            this.extendedInfo = Input.ofNullable(extendedInfo);
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

        public Builder setProtectionStatus(@Nullable Input<String> protectionStatus) {
            this.protectionStatus = protectionStatus;
            return this;
        }

        public Builder setProtectionStatus(@Nullable String protectionStatus) {
            this.protectionStatus = Input.ofNullable(protectionStatus);
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

        public Builder setUpgradeAvailable(@Nullable Input<Boolean> upgradeAvailable) {
            this.upgradeAvailable = upgradeAvailable;
            return this;
        }

        public Builder setUpgradeAvailable(@Nullable Boolean upgradeAvailable) {
            this.upgradeAvailable = Input.ofNullable(upgradeAvailable);
            return this;
        }
        public DpmContainerArgs build() {
            return new DpmContainerArgs(backupManagementType, canReRegister, containerId, containerType, dpmAgentVersion, dpmServers, extendedInfo, friendlyName, healthStatus, protectedItemCount, protectionStatus, registrationStatus, upgradeAvailable);
        }
    }
}
