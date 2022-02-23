// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.recoveryservices.inputs;

import io.pulumi.azurenative.recoveryservices.inputs.DPMContainerExtendedInfoResponse;
import io.pulumi.core.annotations.InputImport;
import java.lang.Boolean;
import java.lang.Double;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * AzureBackupServer (DPMVenus) workload-specific protection container.
 * 
 */
public final class AzureBackupServerContainerResponse extends io.pulumi.resources.InvokeArgs {

    public static final AzureBackupServerContainerResponse Empty = new AzureBackupServerContainerResponse();

    /**
     * Type of backup management for the container.
     * 
     */
    @InputImport(name="backupManagementType")
      private final @Nullable String backupManagementType;

    public Optional<String> getBackupManagementType() {
        return this.backupManagementType == null ? Optional.empty() : Optional.ofNullable(this.backupManagementType);
    }

    /**
     * Specifies whether the container is re-registrable.
     * 
     */
    @InputImport(name="canReRegister")
      private final @Nullable Boolean canReRegister;

    public Optional<Boolean> getCanReRegister() {
        return this.canReRegister == null ? Optional.empty() : Optional.ofNullable(this.canReRegister);
    }

    /**
     * ID of container.
     * 
     */
    @InputImport(name="containerId")
      private final @Nullable String containerId;

    public Optional<String> getContainerId() {
        return this.containerId == null ? Optional.empty() : Optional.ofNullable(this.containerId);
    }

    /**
     * Type of the container. The value of this property for: 1. Compute Azure VM is Microsoft.Compute/virtualMachines 2.
     * Classic Compute Azure VM is Microsoft.ClassicCompute/virtualMachines 3. Windows machines (like MAB, DPM etc) is
     * Windows 4. Azure SQL instance is AzureSqlContainer. 5. Storage containers is StorageContainer. 6. Azure workload
     * Backup is VMAppContainer
     * Expected value is 'AzureBackupServerContainer'.
     * 
     */
    @InputImport(name="containerType", required=true)
      private final String containerType;

    public String getContainerType() {
        return this.containerType;
    }

    /**
     * Backup engine Agent version
     * 
     */
    @InputImport(name="dpmAgentVersion")
      private final @Nullable String dpmAgentVersion;

    public Optional<String> getDpmAgentVersion() {
        return this.dpmAgentVersion == null ? Optional.empty() : Optional.ofNullable(this.dpmAgentVersion);
    }

    /**
     * List of BackupEngines protecting the container
     * 
     */
    @InputImport(name="dpmServers")
      private final @Nullable List<String> dpmServers;

    public List<String> getDpmServers() {
        return this.dpmServers == null ? List.of() : this.dpmServers;
    }

    /**
     * Extended Info of the container.
     * 
     */
    @InputImport(name="extendedInfo")
      private final @Nullable DPMContainerExtendedInfoResponse extendedInfo;

    public Optional<DPMContainerExtendedInfoResponse> getExtendedInfo() {
        return this.extendedInfo == null ? Optional.empty() : Optional.ofNullable(this.extendedInfo);
    }

    /**
     * Friendly name of the container.
     * 
     */
    @InputImport(name="friendlyName")
      private final @Nullable String friendlyName;

    public Optional<String> getFriendlyName() {
        return this.friendlyName == null ? Optional.empty() : Optional.ofNullable(this.friendlyName);
    }

    /**
     * Status of health of the container.
     * 
     */
    @InputImport(name="healthStatus")
      private final @Nullable String healthStatus;

    public Optional<String> getHealthStatus() {
        return this.healthStatus == null ? Optional.empty() : Optional.ofNullable(this.healthStatus);
    }

    /**
     * Number of protected items in the BackupEngine
     * 
     */
    @InputImport(name="protectedItemCount")
      private final @Nullable Double protectedItemCount;

    public Optional<Double> getProtectedItemCount() {
        return this.protectedItemCount == null ? Optional.empty() : Optional.ofNullable(this.protectedItemCount);
    }

    /**
     * Protection status of the container.
     * 
     */
    @InputImport(name="protectionStatus")
      private final @Nullable String protectionStatus;

    public Optional<String> getProtectionStatus() {
        return this.protectionStatus == null ? Optional.empty() : Optional.ofNullable(this.protectionStatus);
    }

    /**
     * Status of registration of the container with the Recovery Services Vault.
     * 
     */
    @InputImport(name="registrationStatus")
      private final @Nullable String registrationStatus;

    public Optional<String> getRegistrationStatus() {
        return this.registrationStatus == null ? Optional.empty() : Optional.ofNullable(this.registrationStatus);
    }

    /**
     * To check if upgrade available
     * 
     */
    @InputImport(name="upgradeAvailable")
      private final @Nullable Boolean upgradeAvailable;

    public Optional<Boolean> getUpgradeAvailable() {
        return this.upgradeAvailable == null ? Optional.empty() : Optional.ofNullable(this.upgradeAvailable);
    }

    public AzureBackupServerContainerResponse(
        @Nullable String backupManagementType,
        @Nullable Boolean canReRegister,
        @Nullable String containerId,
        String containerType,
        @Nullable String dpmAgentVersion,
        @Nullable List<String> dpmServers,
        @Nullable DPMContainerExtendedInfoResponse extendedInfo,
        @Nullable String friendlyName,
        @Nullable String healthStatus,
        @Nullable Double protectedItemCount,
        @Nullable String protectionStatus,
        @Nullable String registrationStatus,
        @Nullable Boolean upgradeAvailable) {
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

    private AzureBackupServerContainerResponse() {
        this.backupManagementType = null;
        this.canReRegister = null;
        this.containerId = null;
        this.containerType = null;
        this.dpmAgentVersion = null;
        this.dpmServers = List.of();
        this.extendedInfo = null;
        this.friendlyName = null;
        this.healthStatus = null;
        this.protectedItemCount = null;
        this.protectionStatus = null;
        this.registrationStatus = null;
        this.upgradeAvailable = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(AzureBackupServerContainerResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String backupManagementType;
        private @Nullable Boolean canReRegister;
        private @Nullable String containerId;
        private String containerType;
        private @Nullable String dpmAgentVersion;
        private @Nullable List<String> dpmServers;
        private @Nullable DPMContainerExtendedInfoResponse extendedInfo;
        private @Nullable String friendlyName;
        private @Nullable String healthStatus;
        private @Nullable Double protectedItemCount;
        private @Nullable String protectionStatus;
        private @Nullable String registrationStatus;
        private @Nullable Boolean upgradeAvailable;

        public Builder() {
    	      // Empty
        }

        public Builder(AzureBackupServerContainerResponse defaults) {
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

        public Builder setBackupManagementType(@Nullable String backupManagementType) {
            this.backupManagementType = backupManagementType;
            return this;
        }

        public Builder setCanReRegister(@Nullable Boolean canReRegister) {
            this.canReRegister = canReRegister;
            return this;
        }

        public Builder setContainerId(@Nullable String containerId) {
            this.containerId = containerId;
            return this;
        }

        public Builder setContainerType(String containerType) {
            this.containerType = Objects.requireNonNull(containerType);
            return this;
        }

        public Builder setDpmAgentVersion(@Nullable String dpmAgentVersion) {
            this.dpmAgentVersion = dpmAgentVersion;
            return this;
        }

        public Builder setDpmServers(@Nullable List<String> dpmServers) {
            this.dpmServers = dpmServers;
            return this;
        }

        public Builder setExtendedInfo(@Nullable DPMContainerExtendedInfoResponse extendedInfo) {
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

        public Builder setProtectedItemCount(@Nullable Double protectedItemCount) {
            this.protectedItemCount = protectedItemCount;
            return this;
        }

        public Builder setProtectionStatus(@Nullable String protectionStatus) {
            this.protectionStatus = protectionStatus;
            return this;
        }

        public Builder setRegistrationStatus(@Nullable String registrationStatus) {
            this.registrationStatus = registrationStatus;
            return this;
        }

        public Builder setUpgradeAvailable(@Nullable Boolean upgradeAvailable) {
            this.upgradeAvailable = upgradeAvailable;
            return this;
        }
        public AzureBackupServerContainerResponse build() {
            return new AzureBackupServerContainerResponse(backupManagementType, canReRegister, containerId, containerType, dpmAgentVersion, dpmServers, extendedInfo, friendlyName, healthStatus, protectedItemCount, protectionStatus, registrationStatus, upgradeAvailable);
        }
    }
}
