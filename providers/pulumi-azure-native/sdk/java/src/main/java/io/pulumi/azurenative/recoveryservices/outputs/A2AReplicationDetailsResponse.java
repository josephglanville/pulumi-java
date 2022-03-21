// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.recoveryservices.outputs;

import io.pulumi.azurenative.recoveryservices.outputs.A2AProtectedDiskDetailsResponse;
import io.pulumi.azurenative.recoveryservices.outputs.A2AProtectedManagedDiskDetailsResponse;
import io.pulumi.azurenative.recoveryservices.outputs.A2AUnprotectedDiskDetailsResponse;
import io.pulumi.azurenative.recoveryservices.outputs.AzureToAzureVmSyncedConfigDetailsResponse;
import io.pulumi.azurenative.recoveryservices.outputs.VMNicDetailsResponse;
import io.pulumi.core.annotations.CustomType;
import java.lang.Boolean;
import java.lang.Double;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class A2AReplicationDetailsResponse {
    /**
     * The agent version.
     * 
     */
    private final @Nullable String agentVersion;
    /**
     * The fabric specific object Id of the virtual machine.
     * 
     */
    private final @Nullable String fabricObjectId;
    /**
     * The initial primary fabric location.
     * 
     */
    private final String initialPrimaryFabricLocation;
    /**
     * The initial primary availability zone.
     * 
     */
    private final String initialPrimaryZone;
    /**
     * The initial recovery fabric location.
     * 
     */
    private final String initialRecoveryFabricLocation;
    /**
     * The initial recovery availability zone.
     * 
     */
    private final String initialRecoveryZone;
    /**
     * Gets the Instance type.
     * Expected value is 'A2A'.
     * 
     */
    private final String instanceType;
    /**
     * A value indicating whether replication agent update is required.
     * 
     */
    private final @Nullable Boolean isReplicationAgentUpdateRequired;
    /**
     * The last heartbeat received from the source server.
     * 
     */
    private final @Nullable String lastHeartbeat;
    /**
     * The time (in UTC) when the last RPO value was calculated by Protection Service.
     * 
     */
    private final @Nullable String lastRpoCalculatedTime;
    /**
     * An id associated with the PE that survives actions like switch protection which change the backing PE/CPE objects internally.The lifecycle id gets carried forward to have a link/continuity in being able to have an Id that denotes the "same" protected item even though other internal Ids/ARM Id might be changing.
     * 
     */
    private final @Nullable String lifecycleId;
    /**
     * The management Id.
     * 
     */
    private final @Nullable String managementId;
    /**
     * The type of the monitoring job. The progress is contained in MonitoringPercentageCompletion property.
     * 
     */
    private final @Nullable String monitoringJobType;
    /**
     * The percentage of the monitoring job. The type of the monitoring job is defined by MonitoringJobType property.
     * 
     */
    private final @Nullable Integer monitoringPercentageCompletion;
    /**
     * Whether Multi VM group is auto created or specified by user.
     * 
     */
    private final @Nullable String multiVmGroupCreateOption;
    /**
     * The multi vm group Id.
     * 
     */
    private final @Nullable String multiVmGroupId;
    /**
     * The multi vm group name.
     * 
     */
    private final @Nullable String multiVmGroupName;
    /**
     * The type of operating system.
     * 
     */
    private final @Nullable String osType;
    /**
     * Primary fabric location.
     * 
     */
    private final @Nullable String primaryFabricLocation;
    /**
     * The list of protected disks.
     * 
     */
    private final @Nullable List<A2AProtectedDiskDetailsResponse> protectedDisks;
    /**
     * The list of protected managed disks.
     * 
     */
    private final @Nullable List<A2AProtectedManagedDiskDetailsResponse> protectedManagedDisks;
    /**
     * The recovery availability set.
     * 
     */
    private final @Nullable String recoveryAvailabilitySet;
    /**
     * The recovery availability zone.
     * 
     */
    private final @Nullable String recoveryAvailabilityZone;
    /**
     * The recovery resource group.
     * 
     */
    private final @Nullable String recoveryAzureResourceGroupId;
    /**
     * The name of recovery virtual machine.
     * 
     */
    private final @Nullable String recoveryAzureVMName;
    /**
     * The size of recovery virtual machine.
     * 
     */
    private final @Nullable String recoveryAzureVMSize;
    /**
     * The recovery boot diagnostic storage account Arm Id.
     * 
     */
    private final @Nullable String recoveryBootDiagStorageAccountId;
    /**
     * The recovery cloud service.
     * 
     */
    private final @Nullable String recoveryCloudService;
    /**
     * The recovery fabric location.
     * 
     */
    private final @Nullable String recoveryFabricLocation;
    /**
     * The recovery fabric object Id.
     * 
     */
    private final @Nullable String recoveryFabricObjectId;
    /**
     * The recovery proximity placement group Id.
     * 
     */
    private final @Nullable String recoveryProximityPlacementGroupId;
    /**
     * The last RPO value in seconds.
     * 
     */
    private final @Nullable Double rpoInSeconds;
    /**
     * The recovery virtual network.
     * 
     */
    private final @Nullable String selectedRecoveryAzureNetworkId;
    /**
     * The test failover virtual network.
     * 
     */
    private final @Nullable String selectedTfoAzureNetworkId;
    /**
     * The test failover fabric object Id.
     * 
     */
    private final @Nullable String testFailoverRecoveryFabricObjectId;
    /**
     * The test failover VM name.
     * 
     */
    private final @Nullable String tfoAzureVMName;
    /**
     * The list of unprotected disks.
     * 
     */
    private final @Nullable List<A2AUnprotectedDiskDetailsResponse> unprotectedDisks;
    /**
     * The encryption type of the VM.
     * 
     */
    private final String vmEncryptionType;
    /**
     * The virtual machine nic details.
     * 
     */
    private final @Nullable List<VMNicDetailsResponse> vmNics;
    /**
     * The protection state for the vm.
     * 
     */
    private final @Nullable String vmProtectionState;
    /**
     * The protection state description for the vm.
     * 
     */
    private final @Nullable String vmProtectionStateDescription;
    /**
     * The synced configuration details.
     * 
     */
    private final @Nullable AzureToAzureVmSyncedConfigDetailsResponse vmSyncedConfigDetails;

    @CustomType.Constructor
    private A2AReplicationDetailsResponse(
        @CustomType.Parameter("agentVersion") @Nullable String agentVersion,
        @CustomType.Parameter("fabricObjectId") @Nullable String fabricObjectId,
        @CustomType.Parameter("initialPrimaryFabricLocation") String initialPrimaryFabricLocation,
        @CustomType.Parameter("initialPrimaryZone") String initialPrimaryZone,
        @CustomType.Parameter("initialRecoveryFabricLocation") String initialRecoveryFabricLocation,
        @CustomType.Parameter("initialRecoveryZone") String initialRecoveryZone,
        @CustomType.Parameter("instanceType") String instanceType,
        @CustomType.Parameter("isReplicationAgentUpdateRequired") @Nullable Boolean isReplicationAgentUpdateRequired,
        @CustomType.Parameter("lastHeartbeat") @Nullable String lastHeartbeat,
        @CustomType.Parameter("lastRpoCalculatedTime") @Nullable String lastRpoCalculatedTime,
        @CustomType.Parameter("lifecycleId") @Nullable String lifecycleId,
        @CustomType.Parameter("managementId") @Nullable String managementId,
        @CustomType.Parameter("monitoringJobType") @Nullable String monitoringJobType,
        @CustomType.Parameter("monitoringPercentageCompletion") @Nullable Integer monitoringPercentageCompletion,
        @CustomType.Parameter("multiVmGroupCreateOption") @Nullable String multiVmGroupCreateOption,
        @CustomType.Parameter("multiVmGroupId") @Nullable String multiVmGroupId,
        @CustomType.Parameter("multiVmGroupName") @Nullable String multiVmGroupName,
        @CustomType.Parameter("osType") @Nullable String osType,
        @CustomType.Parameter("primaryFabricLocation") @Nullable String primaryFabricLocation,
        @CustomType.Parameter("protectedDisks") @Nullable List<A2AProtectedDiskDetailsResponse> protectedDisks,
        @CustomType.Parameter("protectedManagedDisks") @Nullable List<A2AProtectedManagedDiskDetailsResponse> protectedManagedDisks,
        @CustomType.Parameter("recoveryAvailabilitySet") @Nullable String recoveryAvailabilitySet,
        @CustomType.Parameter("recoveryAvailabilityZone") @Nullable String recoveryAvailabilityZone,
        @CustomType.Parameter("recoveryAzureResourceGroupId") @Nullable String recoveryAzureResourceGroupId,
        @CustomType.Parameter("recoveryAzureVMName") @Nullable String recoveryAzureVMName,
        @CustomType.Parameter("recoveryAzureVMSize") @Nullable String recoveryAzureVMSize,
        @CustomType.Parameter("recoveryBootDiagStorageAccountId") @Nullable String recoveryBootDiagStorageAccountId,
        @CustomType.Parameter("recoveryCloudService") @Nullable String recoveryCloudService,
        @CustomType.Parameter("recoveryFabricLocation") @Nullable String recoveryFabricLocation,
        @CustomType.Parameter("recoveryFabricObjectId") @Nullable String recoveryFabricObjectId,
        @CustomType.Parameter("recoveryProximityPlacementGroupId") @Nullable String recoveryProximityPlacementGroupId,
        @CustomType.Parameter("rpoInSeconds") @Nullable Double rpoInSeconds,
        @CustomType.Parameter("selectedRecoveryAzureNetworkId") @Nullable String selectedRecoveryAzureNetworkId,
        @CustomType.Parameter("selectedTfoAzureNetworkId") @Nullable String selectedTfoAzureNetworkId,
        @CustomType.Parameter("testFailoverRecoveryFabricObjectId") @Nullable String testFailoverRecoveryFabricObjectId,
        @CustomType.Parameter("tfoAzureVMName") @Nullable String tfoAzureVMName,
        @CustomType.Parameter("unprotectedDisks") @Nullable List<A2AUnprotectedDiskDetailsResponse> unprotectedDisks,
        @CustomType.Parameter("vmEncryptionType") String vmEncryptionType,
        @CustomType.Parameter("vmNics") @Nullable List<VMNicDetailsResponse> vmNics,
        @CustomType.Parameter("vmProtectionState") @Nullable String vmProtectionState,
        @CustomType.Parameter("vmProtectionStateDescription") @Nullable String vmProtectionStateDescription,
        @CustomType.Parameter("vmSyncedConfigDetails") @Nullable AzureToAzureVmSyncedConfigDetailsResponse vmSyncedConfigDetails) {
        this.agentVersion = agentVersion;
        this.fabricObjectId = fabricObjectId;
        this.initialPrimaryFabricLocation = initialPrimaryFabricLocation;
        this.initialPrimaryZone = initialPrimaryZone;
        this.initialRecoveryFabricLocation = initialRecoveryFabricLocation;
        this.initialRecoveryZone = initialRecoveryZone;
        this.instanceType = instanceType;
        this.isReplicationAgentUpdateRequired = isReplicationAgentUpdateRequired;
        this.lastHeartbeat = lastHeartbeat;
        this.lastRpoCalculatedTime = lastRpoCalculatedTime;
        this.lifecycleId = lifecycleId;
        this.managementId = managementId;
        this.monitoringJobType = monitoringJobType;
        this.monitoringPercentageCompletion = monitoringPercentageCompletion;
        this.multiVmGroupCreateOption = multiVmGroupCreateOption;
        this.multiVmGroupId = multiVmGroupId;
        this.multiVmGroupName = multiVmGroupName;
        this.osType = osType;
        this.primaryFabricLocation = primaryFabricLocation;
        this.protectedDisks = protectedDisks;
        this.protectedManagedDisks = protectedManagedDisks;
        this.recoveryAvailabilitySet = recoveryAvailabilitySet;
        this.recoveryAvailabilityZone = recoveryAvailabilityZone;
        this.recoveryAzureResourceGroupId = recoveryAzureResourceGroupId;
        this.recoveryAzureVMName = recoveryAzureVMName;
        this.recoveryAzureVMSize = recoveryAzureVMSize;
        this.recoveryBootDiagStorageAccountId = recoveryBootDiagStorageAccountId;
        this.recoveryCloudService = recoveryCloudService;
        this.recoveryFabricLocation = recoveryFabricLocation;
        this.recoveryFabricObjectId = recoveryFabricObjectId;
        this.recoveryProximityPlacementGroupId = recoveryProximityPlacementGroupId;
        this.rpoInSeconds = rpoInSeconds;
        this.selectedRecoveryAzureNetworkId = selectedRecoveryAzureNetworkId;
        this.selectedTfoAzureNetworkId = selectedTfoAzureNetworkId;
        this.testFailoverRecoveryFabricObjectId = testFailoverRecoveryFabricObjectId;
        this.tfoAzureVMName = tfoAzureVMName;
        this.unprotectedDisks = unprotectedDisks;
        this.vmEncryptionType = vmEncryptionType;
        this.vmNics = vmNics;
        this.vmProtectionState = vmProtectionState;
        this.vmProtectionStateDescription = vmProtectionStateDescription;
        this.vmSyncedConfigDetails = vmSyncedConfigDetails;
    }

    /**
     * The agent version.
     * 
    */
    public Optional<String> getAgentVersion() {
        return Optional.ofNullable(this.agentVersion);
    }
    /**
     * The fabric specific object Id of the virtual machine.
     * 
    */
    public Optional<String> getFabricObjectId() {
        return Optional.ofNullable(this.fabricObjectId);
    }
    /**
     * The initial primary fabric location.
     * 
    */
    public String getInitialPrimaryFabricLocation() {
        return this.initialPrimaryFabricLocation;
    }
    /**
     * The initial primary availability zone.
     * 
    */
    public String getInitialPrimaryZone() {
        return this.initialPrimaryZone;
    }
    /**
     * The initial recovery fabric location.
     * 
    */
    public String getInitialRecoveryFabricLocation() {
        return this.initialRecoveryFabricLocation;
    }
    /**
     * The initial recovery availability zone.
     * 
    */
    public String getInitialRecoveryZone() {
        return this.initialRecoveryZone;
    }
    /**
     * Gets the Instance type.
     * Expected value is 'A2A'.
     * 
    */
    public String getInstanceType() {
        return this.instanceType;
    }
    /**
     * A value indicating whether replication agent update is required.
     * 
    */
    public Optional<Boolean> getIsReplicationAgentUpdateRequired() {
        return Optional.ofNullable(this.isReplicationAgentUpdateRequired);
    }
    /**
     * The last heartbeat received from the source server.
     * 
    */
    public Optional<String> getLastHeartbeat() {
        return Optional.ofNullable(this.lastHeartbeat);
    }
    /**
     * The time (in UTC) when the last RPO value was calculated by Protection Service.
     * 
    */
    public Optional<String> getLastRpoCalculatedTime() {
        return Optional.ofNullable(this.lastRpoCalculatedTime);
    }
    /**
     * An id associated with the PE that survives actions like switch protection which change the backing PE/CPE objects internally.The lifecycle id gets carried forward to have a link/continuity in being able to have an Id that denotes the "same" protected item even though other internal Ids/ARM Id might be changing.
     * 
    */
    public Optional<String> getLifecycleId() {
        return Optional.ofNullable(this.lifecycleId);
    }
    /**
     * The management Id.
     * 
    */
    public Optional<String> getManagementId() {
        return Optional.ofNullable(this.managementId);
    }
    /**
     * The type of the monitoring job. The progress is contained in MonitoringPercentageCompletion property.
     * 
    */
    public Optional<String> getMonitoringJobType() {
        return Optional.ofNullable(this.monitoringJobType);
    }
    /**
     * The percentage of the monitoring job. The type of the monitoring job is defined by MonitoringJobType property.
     * 
    */
    public Optional<Integer> getMonitoringPercentageCompletion() {
        return Optional.ofNullable(this.monitoringPercentageCompletion);
    }
    /**
     * Whether Multi VM group is auto created or specified by user.
     * 
    */
    public Optional<String> getMultiVmGroupCreateOption() {
        return Optional.ofNullable(this.multiVmGroupCreateOption);
    }
    /**
     * The multi vm group Id.
     * 
    */
    public Optional<String> getMultiVmGroupId() {
        return Optional.ofNullable(this.multiVmGroupId);
    }
    /**
     * The multi vm group name.
     * 
    */
    public Optional<String> getMultiVmGroupName() {
        return Optional.ofNullable(this.multiVmGroupName);
    }
    /**
     * The type of operating system.
     * 
    */
    public Optional<String> getOsType() {
        return Optional.ofNullable(this.osType);
    }
    /**
     * Primary fabric location.
     * 
    */
    public Optional<String> getPrimaryFabricLocation() {
        return Optional.ofNullable(this.primaryFabricLocation);
    }
    /**
     * The list of protected disks.
     * 
    */
    public List<A2AProtectedDiskDetailsResponse> getProtectedDisks() {
        return this.protectedDisks == null ? List.of() : this.protectedDisks;
    }
    /**
     * The list of protected managed disks.
     * 
    */
    public List<A2AProtectedManagedDiskDetailsResponse> getProtectedManagedDisks() {
        return this.protectedManagedDisks == null ? List.of() : this.protectedManagedDisks;
    }
    /**
     * The recovery availability set.
     * 
    */
    public Optional<String> getRecoveryAvailabilitySet() {
        return Optional.ofNullable(this.recoveryAvailabilitySet);
    }
    /**
     * The recovery availability zone.
     * 
    */
    public Optional<String> getRecoveryAvailabilityZone() {
        return Optional.ofNullable(this.recoveryAvailabilityZone);
    }
    /**
     * The recovery resource group.
     * 
    */
    public Optional<String> getRecoveryAzureResourceGroupId() {
        return Optional.ofNullable(this.recoveryAzureResourceGroupId);
    }
    /**
     * The name of recovery virtual machine.
     * 
    */
    public Optional<String> getRecoveryAzureVMName() {
        return Optional.ofNullable(this.recoveryAzureVMName);
    }
    /**
     * The size of recovery virtual machine.
     * 
    */
    public Optional<String> getRecoveryAzureVMSize() {
        return Optional.ofNullable(this.recoveryAzureVMSize);
    }
    /**
     * The recovery boot diagnostic storage account Arm Id.
     * 
    */
    public Optional<String> getRecoveryBootDiagStorageAccountId() {
        return Optional.ofNullable(this.recoveryBootDiagStorageAccountId);
    }
    /**
     * The recovery cloud service.
     * 
    */
    public Optional<String> getRecoveryCloudService() {
        return Optional.ofNullable(this.recoveryCloudService);
    }
    /**
     * The recovery fabric location.
     * 
    */
    public Optional<String> getRecoveryFabricLocation() {
        return Optional.ofNullable(this.recoveryFabricLocation);
    }
    /**
     * The recovery fabric object Id.
     * 
    */
    public Optional<String> getRecoveryFabricObjectId() {
        return Optional.ofNullable(this.recoveryFabricObjectId);
    }
    /**
     * The recovery proximity placement group Id.
     * 
    */
    public Optional<String> getRecoveryProximityPlacementGroupId() {
        return Optional.ofNullable(this.recoveryProximityPlacementGroupId);
    }
    /**
     * The last RPO value in seconds.
     * 
    */
    public Optional<Double> getRpoInSeconds() {
        return Optional.ofNullable(this.rpoInSeconds);
    }
    /**
     * The recovery virtual network.
     * 
    */
    public Optional<String> getSelectedRecoveryAzureNetworkId() {
        return Optional.ofNullable(this.selectedRecoveryAzureNetworkId);
    }
    /**
     * The test failover virtual network.
     * 
    */
    public Optional<String> getSelectedTfoAzureNetworkId() {
        return Optional.ofNullable(this.selectedTfoAzureNetworkId);
    }
    /**
     * The test failover fabric object Id.
     * 
    */
    public Optional<String> getTestFailoverRecoveryFabricObjectId() {
        return Optional.ofNullable(this.testFailoverRecoveryFabricObjectId);
    }
    /**
     * The test failover VM name.
     * 
    */
    public Optional<String> getTfoAzureVMName() {
        return Optional.ofNullable(this.tfoAzureVMName);
    }
    /**
     * The list of unprotected disks.
     * 
    */
    public List<A2AUnprotectedDiskDetailsResponse> getUnprotectedDisks() {
        return this.unprotectedDisks == null ? List.of() : this.unprotectedDisks;
    }
    /**
     * The encryption type of the VM.
     * 
    */
    public String getVmEncryptionType() {
        return this.vmEncryptionType;
    }
    /**
     * The virtual machine nic details.
     * 
    */
    public List<VMNicDetailsResponse> getVmNics() {
        return this.vmNics == null ? List.of() : this.vmNics;
    }
    /**
     * The protection state for the vm.
     * 
    */
    public Optional<String> getVmProtectionState() {
        return Optional.ofNullable(this.vmProtectionState);
    }
    /**
     * The protection state description for the vm.
     * 
    */
    public Optional<String> getVmProtectionStateDescription() {
        return Optional.ofNullable(this.vmProtectionStateDescription);
    }
    /**
     * The synced configuration details.
     * 
    */
    public Optional<AzureToAzureVmSyncedConfigDetailsResponse> getVmSyncedConfigDetails() {
        return Optional.ofNullable(this.vmSyncedConfigDetails);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(A2AReplicationDetailsResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String agentVersion;
        private @Nullable String fabricObjectId;
        private String initialPrimaryFabricLocation;
        private String initialPrimaryZone;
        private String initialRecoveryFabricLocation;
        private String initialRecoveryZone;
        private String instanceType;
        private @Nullable Boolean isReplicationAgentUpdateRequired;
        private @Nullable String lastHeartbeat;
        private @Nullable String lastRpoCalculatedTime;
        private @Nullable String lifecycleId;
        private @Nullable String managementId;
        private @Nullable String monitoringJobType;
        private @Nullable Integer monitoringPercentageCompletion;
        private @Nullable String multiVmGroupCreateOption;
        private @Nullable String multiVmGroupId;
        private @Nullable String multiVmGroupName;
        private @Nullable String osType;
        private @Nullable String primaryFabricLocation;
        private @Nullable List<A2AProtectedDiskDetailsResponse> protectedDisks;
        private @Nullable List<A2AProtectedManagedDiskDetailsResponse> protectedManagedDisks;
        private @Nullable String recoveryAvailabilitySet;
        private @Nullable String recoveryAvailabilityZone;
        private @Nullable String recoveryAzureResourceGroupId;
        private @Nullable String recoveryAzureVMName;
        private @Nullable String recoveryAzureVMSize;
        private @Nullable String recoveryBootDiagStorageAccountId;
        private @Nullable String recoveryCloudService;
        private @Nullable String recoveryFabricLocation;
        private @Nullable String recoveryFabricObjectId;
        private @Nullable String recoveryProximityPlacementGroupId;
        private @Nullable Double rpoInSeconds;
        private @Nullable String selectedRecoveryAzureNetworkId;
        private @Nullable String selectedTfoAzureNetworkId;
        private @Nullable String testFailoverRecoveryFabricObjectId;
        private @Nullable String tfoAzureVMName;
        private @Nullable List<A2AUnprotectedDiskDetailsResponse> unprotectedDisks;
        private String vmEncryptionType;
        private @Nullable List<VMNicDetailsResponse> vmNics;
        private @Nullable String vmProtectionState;
        private @Nullable String vmProtectionStateDescription;
        private @Nullable AzureToAzureVmSyncedConfigDetailsResponse vmSyncedConfigDetails;

        public Builder() {
    	      // Empty
        }

        public Builder(A2AReplicationDetailsResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.agentVersion = defaults.agentVersion;
    	      this.fabricObjectId = defaults.fabricObjectId;
    	      this.initialPrimaryFabricLocation = defaults.initialPrimaryFabricLocation;
    	      this.initialPrimaryZone = defaults.initialPrimaryZone;
    	      this.initialRecoveryFabricLocation = defaults.initialRecoveryFabricLocation;
    	      this.initialRecoveryZone = defaults.initialRecoveryZone;
    	      this.instanceType = defaults.instanceType;
    	      this.isReplicationAgentUpdateRequired = defaults.isReplicationAgentUpdateRequired;
    	      this.lastHeartbeat = defaults.lastHeartbeat;
    	      this.lastRpoCalculatedTime = defaults.lastRpoCalculatedTime;
    	      this.lifecycleId = defaults.lifecycleId;
    	      this.managementId = defaults.managementId;
    	      this.monitoringJobType = defaults.monitoringJobType;
    	      this.monitoringPercentageCompletion = defaults.monitoringPercentageCompletion;
    	      this.multiVmGroupCreateOption = defaults.multiVmGroupCreateOption;
    	      this.multiVmGroupId = defaults.multiVmGroupId;
    	      this.multiVmGroupName = defaults.multiVmGroupName;
    	      this.osType = defaults.osType;
    	      this.primaryFabricLocation = defaults.primaryFabricLocation;
    	      this.protectedDisks = defaults.protectedDisks;
    	      this.protectedManagedDisks = defaults.protectedManagedDisks;
    	      this.recoveryAvailabilitySet = defaults.recoveryAvailabilitySet;
    	      this.recoveryAvailabilityZone = defaults.recoveryAvailabilityZone;
    	      this.recoveryAzureResourceGroupId = defaults.recoveryAzureResourceGroupId;
    	      this.recoveryAzureVMName = defaults.recoveryAzureVMName;
    	      this.recoveryAzureVMSize = defaults.recoveryAzureVMSize;
    	      this.recoveryBootDiagStorageAccountId = defaults.recoveryBootDiagStorageAccountId;
    	      this.recoveryCloudService = defaults.recoveryCloudService;
    	      this.recoveryFabricLocation = defaults.recoveryFabricLocation;
    	      this.recoveryFabricObjectId = defaults.recoveryFabricObjectId;
    	      this.recoveryProximityPlacementGroupId = defaults.recoveryProximityPlacementGroupId;
    	      this.rpoInSeconds = defaults.rpoInSeconds;
    	      this.selectedRecoveryAzureNetworkId = defaults.selectedRecoveryAzureNetworkId;
    	      this.selectedTfoAzureNetworkId = defaults.selectedTfoAzureNetworkId;
    	      this.testFailoverRecoveryFabricObjectId = defaults.testFailoverRecoveryFabricObjectId;
    	      this.tfoAzureVMName = defaults.tfoAzureVMName;
    	      this.unprotectedDisks = defaults.unprotectedDisks;
    	      this.vmEncryptionType = defaults.vmEncryptionType;
    	      this.vmNics = defaults.vmNics;
    	      this.vmProtectionState = defaults.vmProtectionState;
    	      this.vmProtectionStateDescription = defaults.vmProtectionStateDescription;
    	      this.vmSyncedConfigDetails = defaults.vmSyncedConfigDetails;
        }

        public Builder agentVersion(@Nullable String agentVersion) {
            this.agentVersion = agentVersion;
            return this;
        }
        public Builder fabricObjectId(@Nullable String fabricObjectId) {
            this.fabricObjectId = fabricObjectId;
            return this;
        }
        public Builder initialPrimaryFabricLocation(String initialPrimaryFabricLocation) {
            this.initialPrimaryFabricLocation = Objects.requireNonNull(initialPrimaryFabricLocation);
            return this;
        }
        public Builder initialPrimaryZone(String initialPrimaryZone) {
            this.initialPrimaryZone = Objects.requireNonNull(initialPrimaryZone);
            return this;
        }
        public Builder initialRecoveryFabricLocation(String initialRecoveryFabricLocation) {
            this.initialRecoveryFabricLocation = Objects.requireNonNull(initialRecoveryFabricLocation);
            return this;
        }
        public Builder initialRecoveryZone(String initialRecoveryZone) {
            this.initialRecoveryZone = Objects.requireNonNull(initialRecoveryZone);
            return this;
        }
        public Builder instanceType(String instanceType) {
            this.instanceType = Objects.requireNonNull(instanceType);
            return this;
        }
        public Builder isReplicationAgentUpdateRequired(@Nullable Boolean isReplicationAgentUpdateRequired) {
            this.isReplicationAgentUpdateRequired = isReplicationAgentUpdateRequired;
            return this;
        }
        public Builder lastHeartbeat(@Nullable String lastHeartbeat) {
            this.lastHeartbeat = lastHeartbeat;
            return this;
        }
        public Builder lastRpoCalculatedTime(@Nullable String lastRpoCalculatedTime) {
            this.lastRpoCalculatedTime = lastRpoCalculatedTime;
            return this;
        }
        public Builder lifecycleId(@Nullable String lifecycleId) {
            this.lifecycleId = lifecycleId;
            return this;
        }
        public Builder managementId(@Nullable String managementId) {
            this.managementId = managementId;
            return this;
        }
        public Builder monitoringJobType(@Nullable String monitoringJobType) {
            this.monitoringJobType = monitoringJobType;
            return this;
        }
        public Builder monitoringPercentageCompletion(@Nullable Integer monitoringPercentageCompletion) {
            this.monitoringPercentageCompletion = monitoringPercentageCompletion;
            return this;
        }
        public Builder multiVmGroupCreateOption(@Nullable String multiVmGroupCreateOption) {
            this.multiVmGroupCreateOption = multiVmGroupCreateOption;
            return this;
        }
        public Builder multiVmGroupId(@Nullable String multiVmGroupId) {
            this.multiVmGroupId = multiVmGroupId;
            return this;
        }
        public Builder multiVmGroupName(@Nullable String multiVmGroupName) {
            this.multiVmGroupName = multiVmGroupName;
            return this;
        }
        public Builder osType(@Nullable String osType) {
            this.osType = osType;
            return this;
        }
        public Builder primaryFabricLocation(@Nullable String primaryFabricLocation) {
            this.primaryFabricLocation = primaryFabricLocation;
            return this;
        }
        public Builder protectedDisks(@Nullable List<A2AProtectedDiskDetailsResponse> protectedDisks) {
            this.protectedDisks = protectedDisks;
            return this;
        }
        public Builder protectedDisks(A2AProtectedDiskDetailsResponse... protectedDisks) {
            return protectedDisks(List.of(protectedDisks));
        }
        public Builder protectedManagedDisks(@Nullable List<A2AProtectedManagedDiskDetailsResponse> protectedManagedDisks) {
            this.protectedManagedDisks = protectedManagedDisks;
            return this;
        }
        public Builder protectedManagedDisks(A2AProtectedManagedDiskDetailsResponse... protectedManagedDisks) {
            return protectedManagedDisks(List.of(protectedManagedDisks));
        }
        public Builder recoveryAvailabilitySet(@Nullable String recoveryAvailabilitySet) {
            this.recoveryAvailabilitySet = recoveryAvailabilitySet;
            return this;
        }
        public Builder recoveryAvailabilityZone(@Nullable String recoveryAvailabilityZone) {
            this.recoveryAvailabilityZone = recoveryAvailabilityZone;
            return this;
        }
        public Builder recoveryAzureResourceGroupId(@Nullable String recoveryAzureResourceGroupId) {
            this.recoveryAzureResourceGroupId = recoveryAzureResourceGroupId;
            return this;
        }
        public Builder recoveryAzureVMName(@Nullable String recoveryAzureVMName) {
            this.recoveryAzureVMName = recoveryAzureVMName;
            return this;
        }
        public Builder recoveryAzureVMSize(@Nullable String recoveryAzureVMSize) {
            this.recoveryAzureVMSize = recoveryAzureVMSize;
            return this;
        }
        public Builder recoveryBootDiagStorageAccountId(@Nullable String recoveryBootDiagStorageAccountId) {
            this.recoveryBootDiagStorageAccountId = recoveryBootDiagStorageAccountId;
            return this;
        }
        public Builder recoveryCloudService(@Nullable String recoveryCloudService) {
            this.recoveryCloudService = recoveryCloudService;
            return this;
        }
        public Builder recoveryFabricLocation(@Nullable String recoveryFabricLocation) {
            this.recoveryFabricLocation = recoveryFabricLocation;
            return this;
        }
        public Builder recoveryFabricObjectId(@Nullable String recoveryFabricObjectId) {
            this.recoveryFabricObjectId = recoveryFabricObjectId;
            return this;
        }
        public Builder recoveryProximityPlacementGroupId(@Nullable String recoveryProximityPlacementGroupId) {
            this.recoveryProximityPlacementGroupId = recoveryProximityPlacementGroupId;
            return this;
        }
        public Builder rpoInSeconds(@Nullable Double rpoInSeconds) {
            this.rpoInSeconds = rpoInSeconds;
            return this;
        }
        public Builder selectedRecoveryAzureNetworkId(@Nullable String selectedRecoveryAzureNetworkId) {
            this.selectedRecoveryAzureNetworkId = selectedRecoveryAzureNetworkId;
            return this;
        }
        public Builder selectedTfoAzureNetworkId(@Nullable String selectedTfoAzureNetworkId) {
            this.selectedTfoAzureNetworkId = selectedTfoAzureNetworkId;
            return this;
        }
        public Builder testFailoverRecoveryFabricObjectId(@Nullable String testFailoverRecoveryFabricObjectId) {
            this.testFailoverRecoveryFabricObjectId = testFailoverRecoveryFabricObjectId;
            return this;
        }
        public Builder tfoAzureVMName(@Nullable String tfoAzureVMName) {
            this.tfoAzureVMName = tfoAzureVMName;
            return this;
        }
        public Builder unprotectedDisks(@Nullable List<A2AUnprotectedDiskDetailsResponse> unprotectedDisks) {
            this.unprotectedDisks = unprotectedDisks;
            return this;
        }
        public Builder unprotectedDisks(A2AUnprotectedDiskDetailsResponse... unprotectedDisks) {
            return unprotectedDisks(List.of(unprotectedDisks));
        }
        public Builder vmEncryptionType(String vmEncryptionType) {
            this.vmEncryptionType = Objects.requireNonNull(vmEncryptionType);
            return this;
        }
        public Builder vmNics(@Nullable List<VMNicDetailsResponse> vmNics) {
            this.vmNics = vmNics;
            return this;
        }
        public Builder vmNics(VMNicDetailsResponse... vmNics) {
            return vmNics(List.of(vmNics));
        }
        public Builder vmProtectionState(@Nullable String vmProtectionState) {
            this.vmProtectionState = vmProtectionState;
            return this;
        }
        public Builder vmProtectionStateDescription(@Nullable String vmProtectionStateDescription) {
            this.vmProtectionStateDescription = vmProtectionStateDescription;
            return this;
        }
        public Builder vmSyncedConfigDetails(@Nullable AzureToAzureVmSyncedConfigDetailsResponse vmSyncedConfigDetails) {
            this.vmSyncedConfigDetails = vmSyncedConfigDetails;
            return this;
        }        public A2AReplicationDetailsResponse build() {
            return new A2AReplicationDetailsResponse(agentVersion, fabricObjectId, initialPrimaryFabricLocation, initialPrimaryZone, initialRecoveryFabricLocation, initialRecoveryZone, instanceType, isReplicationAgentUpdateRequired, lastHeartbeat, lastRpoCalculatedTime, lifecycleId, managementId, monitoringJobType, monitoringPercentageCompletion, multiVmGroupCreateOption, multiVmGroupId, multiVmGroupName, osType, primaryFabricLocation, protectedDisks, protectedManagedDisks, recoveryAvailabilitySet, recoveryAvailabilityZone, recoveryAzureResourceGroupId, recoveryAzureVMName, recoveryAzureVMSize, recoveryBootDiagStorageAccountId, recoveryCloudService, recoveryFabricLocation, recoveryFabricObjectId, recoveryProximityPlacementGroupId, rpoInSeconds, selectedRecoveryAzureNetworkId, selectedTfoAzureNetworkId, testFailoverRecoveryFabricObjectId, tfoAzureVMName, unprotectedDisks, vmEncryptionType, vmNics, vmProtectionState, vmProtectionStateDescription, vmSyncedConfigDetails);
        }
    }
}
