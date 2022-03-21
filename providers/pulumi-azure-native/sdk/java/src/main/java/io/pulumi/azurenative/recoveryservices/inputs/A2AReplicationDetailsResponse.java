// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.recoveryservices.inputs;

import io.pulumi.azurenative.recoveryservices.inputs.A2AProtectedDiskDetailsResponse;
import io.pulumi.azurenative.recoveryservices.inputs.A2AProtectedManagedDiskDetailsResponse;
import io.pulumi.azurenative.recoveryservices.inputs.A2AUnprotectedDiskDetailsResponse;
import io.pulumi.azurenative.recoveryservices.inputs.AzureToAzureVmSyncedConfigDetailsResponse;
import io.pulumi.azurenative.recoveryservices.inputs.VMNicDetailsResponse;
import io.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.lang.Double;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * A2A provider specific settings.
 * 
 */
public final class A2AReplicationDetailsResponse extends io.pulumi.resources.InvokeArgs {

    public static final A2AReplicationDetailsResponse Empty = new A2AReplicationDetailsResponse();

    /**
     * The agent version.
     * 
     */
    @Import(name="agentVersion")
      private final @Nullable String agentVersion;

    public Optional<String> getAgentVersion() {
        return this.agentVersion == null ? Optional.empty() : Optional.ofNullable(this.agentVersion);
    }

    /**
     * The fabric specific object Id of the virtual machine.
     * 
     */
    @Import(name="fabricObjectId")
      private final @Nullable String fabricObjectId;

    public Optional<String> getFabricObjectId() {
        return this.fabricObjectId == null ? Optional.empty() : Optional.ofNullable(this.fabricObjectId);
    }

    /**
     * The initial primary fabric location.
     * 
     */
    @Import(name="initialPrimaryFabricLocation", required=true)
      private final String initialPrimaryFabricLocation;

    public String getInitialPrimaryFabricLocation() {
        return this.initialPrimaryFabricLocation;
    }

    /**
     * The initial primary availability zone.
     * 
     */
    @Import(name="initialPrimaryZone", required=true)
      private final String initialPrimaryZone;

    public String getInitialPrimaryZone() {
        return this.initialPrimaryZone;
    }

    /**
     * The initial recovery fabric location.
     * 
     */
    @Import(name="initialRecoveryFabricLocation", required=true)
      private final String initialRecoveryFabricLocation;

    public String getInitialRecoveryFabricLocation() {
        return this.initialRecoveryFabricLocation;
    }

    /**
     * The initial recovery availability zone.
     * 
     */
    @Import(name="initialRecoveryZone", required=true)
      private final String initialRecoveryZone;

    public String getInitialRecoveryZone() {
        return this.initialRecoveryZone;
    }

    /**
     * Gets the Instance type.
     * Expected value is 'A2A'.
     * 
     */
    @Import(name="instanceType", required=true)
      private final String instanceType;

    public String getInstanceType() {
        return this.instanceType;
    }

    /**
     * A value indicating whether replication agent update is required.
     * 
     */
    @Import(name="isReplicationAgentUpdateRequired")
      private final @Nullable Boolean isReplicationAgentUpdateRequired;

    public Optional<Boolean> getIsReplicationAgentUpdateRequired() {
        return this.isReplicationAgentUpdateRequired == null ? Optional.empty() : Optional.ofNullable(this.isReplicationAgentUpdateRequired);
    }

    /**
     * The last heartbeat received from the source server.
     * 
     */
    @Import(name="lastHeartbeat")
      private final @Nullable String lastHeartbeat;

    public Optional<String> getLastHeartbeat() {
        return this.lastHeartbeat == null ? Optional.empty() : Optional.ofNullable(this.lastHeartbeat);
    }

    /**
     * The time (in UTC) when the last RPO value was calculated by Protection Service.
     * 
     */
    @Import(name="lastRpoCalculatedTime")
      private final @Nullable String lastRpoCalculatedTime;

    public Optional<String> getLastRpoCalculatedTime() {
        return this.lastRpoCalculatedTime == null ? Optional.empty() : Optional.ofNullable(this.lastRpoCalculatedTime);
    }

    /**
     * An id associated with the PE that survives actions like switch protection which change the backing PE/CPE objects internally.The lifecycle id gets carried forward to have a link/continuity in being able to have an Id that denotes the "same" protected item even though other internal Ids/ARM Id might be changing.
     * 
     */
    @Import(name="lifecycleId")
      private final @Nullable String lifecycleId;

    public Optional<String> getLifecycleId() {
        return this.lifecycleId == null ? Optional.empty() : Optional.ofNullable(this.lifecycleId);
    }

    /**
     * The management Id.
     * 
     */
    @Import(name="managementId")
      private final @Nullable String managementId;

    public Optional<String> getManagementId() {
        return this.managementId == null ? Optional.empty() : Optional.ofNullable(this.managementId);
    }

    /**
     * The type of the monitoring job. The progress is contained in MonitoringPercentageCompletion property.
     * 
     */
    @Import(name="monitoringJobType")
      private final @Nullable String monitoringJobType;

    public Optional<String> getMonitoringJobType() {
        return this.monitoringJobType == null ? Optional.empty() : Optional.ofNullable(this.monitoringJobType);
    }

    /**
     * The percentage of the monitoring job. The type of the monitoring job is defined by MonitoringJobType property.
     * 
     */
    @Import(name="monitoringPercentageCompletion")
      private final @Nullable Integer monitoringPercentageCompletion;

    public Optional<Integer> getMonitoringPercentageCompletion() {
        return this.monitoringPercentageCompletion == null ? Optional.empty() : Optional.ofNullable(this.monitoringPercentageCompletion);
    }

    /**
     * Whether Multi VM group is auto created or specified by user.
     * 
     */
    @Import(name="multiVmGroupCreateOption")
      private final @Nullable String multiVmGroupCreateOption;

    public Optional<String> getMultiVmGroupCreateOption() {
        return this.multiVmGroupCreateOption == null ? Optional.empty() : Optional.ofNullable(this.multiVmGroupCreateOption);
    }

    /**
     * The multi vm group Id.
     * 
     */
    @Import(name="multiVmGroupId")
      private final @Nullable String multiVmGroupId;

    public Optional<String> getMultiVmGroupId() {
        return this.multiVmGroupId == null ? Optional.empty() : Optional.ofNullable(this.multiVmGroupId);
    }

    /**
     * The multi vm group name.
     * 
     */
    @Import(name="multiVmGroupName")
      private final @Nullable String multiVmGroupName;

    public Optional<String> getMultiVmGroupName() {
        return this.multiVmGroupName == null ? Optional.empty() : Optional.ofNullable(this.multiVmGroupName);
    }

    /**
     * The type of operating system.
     * 
     */
    @Import(name="osType")
      private final @Nullable String osType;

    public Optional<String> getOsType() {
        return this.osType == null ? Optional.empty() : Optional.ofNullable(this.osType);
    }

    /**
     * Primary fabric location.
     * 
     */
    @Import(name="primaryFabricLocation")
      private final @Nullable String primaryFabricLocation;

    public Optional<String> getPrimaryFabricLocation() {
        return this.primaryFabricLocation == null ? Optional.empty() : Optional.ofNullable(this.primaryFabricLocation);
    }

    /**
     * The list of protected disks.
     * 
     */
    @Import(name="protectedDisks")
      private final @Nullable List<A2AProtectedDiskDetailsResponse> protectedDisks;

    public List<A2AProtectedDiskDetailsResponse> getProtectedDisks() {
        return this.protectedDisks == null ? List.of() : this.protectedDisks;
    }

    /**
     * The list of protected managed disks.
     * 
     */
    @Import(name="protectedManagedDisks")
      private final @Nullable List<A2AProtectedManagedDiskDetailsResponse> protectedManagedDisks;

    public List<A2AProtectedManagedDiskDetailsResponse> getProtectedManagedDisks() {
        return this.protectedManagedDisks == null ? List.of() : this.protectedManagedDisks;
    }

    /**
     * The recovery availability set.
     * 
     */
    @Import(name="recoveryAvailabilitySet")
      private final @Nullable String recoveryAvailabilitySet;

    public Optional<String> getRecoveryAvailabilitySet() {
        return this.recoveryAvailabilitySet == null ? Optional.empty() : Optional.ofNullable(this.recoveryAvailabilitySet);
    }

    /**
     * The recovery availability zone.
     * 
     */
    @Import(name="recoveryAvailabilityZone")
      private final @Nullable String recoveryAvailabilityZone;

    public Optional<String> getRecoveryAvailabilityZone() {
        return this.recoveryAvailabilityZone == null ? Optional.empty() : Optional.ofNullable(this.recoveryAvailabilityZone);
    }

    /**
     * The recovery resource group.
     * 
     */
    @Import(name="recoveryAzureResourceGroupId")
      private final @Nullable String recoveryAzureResourceGroupId;

    public Optional<String> getRecoveryAzureResourceGroupId() {
        return this.recoveryAzureResourceGroupId == null ? Optional.empty() : Optional.ofNullable(this.recoveryAzureResourceGroupId);
    }

    /**
     * The name of recovery virtual machine.
     * 
     */
    @Import(name="recoveryAzureVMName")
      private final @Nullable String recoveryAzureVMName;

    public Optional<String> getRecoveryAzureVMName() {
        return this.recoveryAzureVMName == null ? Optional.empty() : Optional.ofNullable(this.recoveryAzureVMName);
    }

    /**
     * The size of recovery virtual machine.
     * 
     */
    @Import(name="recoveryAzureVMSize")
      private final @Nullable String recoveryAzureVMSize;

    public Optional<String> getRecoveryAzureVMSize() {
        return this.recoveryAzureVMSize == null ? Optional.empty() : Optional.ofNullable(this.recoveryAzureVMSize);
    }

    /**
     * The recovery boot diagnostic storage account Arm Id.
     * 
     */
    @Import(name="recoveryBootDiagStorageAccountId")
      private final @Nullable String recoveryBootDiagStorageAccountId;

    public Optional<String> getRecoveryBootDiagStorageAccountId() {
        return this.recoveryBootDiagStorageAccountId == null ? Optional.empty() : Optional.ofNullable(this.recoveryBootDiagStorageAccountId);
    }

    /**
     * The recovery cloud service.
     * 
     */
    @Import(name="recoveryCloudService")
      private final @Nullable String recoveryCloudService;

    public Optional<String> getRecoveryCloudService() {
        return this.recoveryCloudService == null ? Optional.empty() : Optional.ofNullable(this.recoveryCloudService);
    }

    /**
     * The recovery fabric location.
     * 
     */
    @Import(name="recoveryFabricLocation")
      private final @Nullable String recoveryFabricLocation;

    public Optional<String> getRecoveryFabricLocation() {
        return this.recoveryFabricLocation == null ? Optional.empty() : Optional.ofNullable(this.recoveryFabricLocation);
    }

    /**
     * The recovery fabric object Id.
     * 
     */
    @Import(name="recoveryFabricObjectId")
      private final @Nullable String recoveryFabricObjectId;

    public Optional<String> getRecoveryFabricObjectId() {
        return this.recoveryFabricObjectId == null ? Optional.empty() : Optional.ofNullable(this.recoveryFabricObjectId);
    }

    /**
     * The recovery proximity placement group Id.
     * 
     */
    @Import(name="recoveryProximityPlacementGroupId")
      private final @Nullable String recoveryProximityPlacementGroupId;

    public Optional<String> getRecoveryProximityPlacementGroupId() {
        return this.recoveryProximityPlacementGroupId == null ? Optional.empty() : Optional.ofNullable(this.recoveryProximityPlacementGroupId);
    }

    /**
     * The last RPO value in seconds.
     * 
     */
    @Import(name="rpoInSeconds")
      private final @Nullable Double rpoInSeconds;

    public Optional<Double> getRpoInSeconds() {
        return this.rpoInSeconds == null ? Optional.empty() : Optional.ofNullable(this.rpoInSeconds);
    }

    /**
     * The recovery virtual network.
     * 
     */
    @Import(name="selectedRecoveryAzureNetworkId")
      private final @Nullable String selectedRecoveryAzureNetworkId;

    public Optional<String> getSelectedRecoveryAzureNetworkId() {
        return this.selectedRecoveryAzureNetworkId == null ? Optional.empty() : Optional.ofNullable(this.selectedRecoveryAzureNetworkId);
    }

    /**
     * The test failover virtual network.
     * 
     */
    @Import(name="selectedTfoAzureNetworkId")
      private final @Nullable String selectedTfoAzureNetworkId;

    public Optional<String> getSelectedTfoAzureNetworkId() {
        return this.selectedTfoAzureNetworkId == null ? Optional.empty() : Optional.ofNullable(this.selectedTfoAzureNetworkId);
    }

    /**
     * The test failover fabric object Id.
     * 
     */
    @Import(name="testFailoverRecoveryFabricObjectId")
      private final @Nullable String testFailoverRecoveryFabricObjectId;

    public Optional<String> getTestFailoverRecoveryFabricObjectId() {
        return this.testFailoverRecoveryFabricObjectId == null ? Optional.empty() : Optional.ofNullable(this.testFailoverRecoveryFabricObjectId);
    }

    /**
     * The test failover VM name.
     * 
     */
    @Import(name="tfoAzureVMName")
      private final @Nullable String tfoAzureVMName;

    public Optional<String> getTfoAzureVMName() {
        return this.tfoAzureVMName == null ? Optional.empty() : Optional.ofNullable(this.tfoAzureVMName);
    }

    /**
     * The list of unprotected disks.
     * 
     */
    @Import(name="unprotectedDisks")
      private final @Nullable List<A2AUnprotectedDiskDetailsResponse> unprotectedDisks;

    public List<A2AUnprotectedDiskDetailsResponse> getUnprotectedDisks() {
        return this.unprotectedDisks == null ? List.of() : this.unprotectedDisks;
    }

    /**
     * The encryption type of the VM.
     * 
     */
    @Import(name="vmEncryptionType", required=true)
      private final String vmEncryptionType;

    public String getVmEncryptionType() {
        return this.vmEncryptionType;
    }

    /**
     * The virtual machine nic details.
     * 
     */
    @Import(name="vmNics")
      private final @Nullable List<VMNicDetailsResponse> vmNics;

    public List<VMNicDetailsResponse> getVmNics() {
        return this.vmNics == null ? List.of() : this.vmNics;
    }

    /**
     * The protection state for the vm.
     * 
     */
    @Import(name="vmProtectionState")
      private final @Nullable String vmProtectionState;

    public Optional<String> getVmProtectionState() {
        return this.vmProtectionState == null ? Optional.empty() : Optional.ofNullable(this.vmProtectionState);
    }

    /**
     * The protection state description for the vm.
     * 
     */
    @Import(name="vmProtectionStateDescription")
      private final @Nullable String vmProtectionStateDescription;

    public Optional<String> getVmProtectionStateDescription() {
        return this.vmProtectionStateDescription == null ? Optional.empty() : Optional.ofNullable(this.vmProtectionStateDescription);
    }

    /**
     * The synced configuration details.
     * 
     */
    @Import(name="vmSyncedConfigDetails")
      private final @Nullable AzureToAzureVmSyncedConfigDetailsResponse vmSyncedConfigDetails;

    public Optional<AzureToAzureVmSyncedConfigDetailsResponse> getVmSyncedConfigDetails() {
        return this.vmSyncedConfigDetails == null ? Optional.empty() : Optional.ofNullable(this.vmSyncedConfigDetails);
    }

    public A2AReplicationDetailsResponse(
        @Nullable String agentVersion,
        @Nullable String fabricObjectId,
        String initialPrimaryFabricLocation,
        String initialPrimaryZone,
        String initialRecoveryFabricLocation,
        String initialRecoveryZone,
        String instanceType,
        @Nullable Boolean isReplicationAgentUpdateRequired,
        @Nullable String lastHeartbeat,
        @Nullable String lastRpoCalculatedTime,
        @Nullable String lifecycleId,
        @Nullable String managementId,
        @Nullable String monitoringJobType,
        @Nullable Integer monitoringPercentageCompletion,
        @Nullable String multiVmGroupCreateOption,
        @Nullable String multiVmGroupId,
        @Nullable String multiVmGroupName,
        @Nullable String osType,
        @Nullable String primaryFabricLocation,
        @Nullable List<A2AProtectedDiskDetailsResponse> protectedDisks,
        @Nullable List<A2AProtectedManagedDiskDetailsResponse> protectedManagedDisks,
        @Nullable String recoveryAvailabilitySet,
        @Nullable String recoveryAvailabilityZone,
        @Nullable String recoveryAzureResourceGroupId,
        @Nullable String recoveryAzureVMName,
        @Nullable String recoveryAzureVMSize,
        @Nullable String recoveryBootDiagStorageAccountId,
        @Nullable String recoveryCloudService,
        @Nullable String recoveryFabricLocation,
        @Nullable String recoveryFabricObjectId,
        @Nullable String recoveryProximityPlacementGroupId,
        @Nullable Double rpoInSeconds,
        @Nullable String selectedRecoveryAzureNetworkId,
        @Nullable String selectedTfoAzureNetworkId,
        @Nullable String testFailoverRecoveryFabricObjectId,
        @Nullable String tfoAzureVMName,
        @Nullable List<A2AUnprotectedDiskDetailsResponse> unprotectedDisks,
        String vmEncryptionType,
        @Nullable List<VMNicDetailsResponse> vmNics,
        @Nullable String vmProtectionState,
        @Nullable String vmProtectionStateDescription,
        @Nullable AzureToAzureVmSyncedConfigDetailsResponse vmSyncedConfigDetails) {
        this.agentVersion = agentVersion;
        this.fabricObjectId = fabricObjectId;
        this.initialPrimaryFabricLocation = Objects.requireNonNull(initialPrimaryFabricLocation, "expected parameter 'initialPrimaryFabricLocation' to be non-null");
        this.initialPrimaryZone = Objects.requireNonNull(initialPrimaryZone, "expected parameter 'initialPrimaryZone' to be non-null");
        this.initialRecoveryFabricLocation = Objects.requireNonNull(initialRecoveryFabricLocation, "expected parameter 'initialRecoveryFabricLocation' to be non-null");
        this.initialRecoveryZone = Objects.requireNonNull(initialRecoveryZone, "expected parameter 'initialRecoveryZone' to be non-null");
        this.instanceType = Objects.requireNonNull(instanceType, "expected parameter 'instanceType' to be non-null");
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
        this.vmEncryptionType = Objects.requireNonNull(vmEncryptionType, "expected parameter 'vmEncryptionType' to be non-null");
        this.vmNics = vmNics;
        this.vmProtectionState = vmProtectionState;
        this.vmProtectionStateDescription = vmProtectionStateDescription;
        this.vmSyncedConfigDetails = vmSyncedConfigDetails;
    }

    private A2AReplicationDetailsResponse() {
        this.agentVersion = null;
        this.fabricObjectId = null;
        this.initialPrimaryFabricLocation = null;
        this.initialPrimaryZone = null;
        this.initialRecoveryFabricLocation = null;
        this.initialRecoveryZone = null;
        this.instanceType = null;
        this.isReplicationAgentUpdateRequired = null;
        this.lastHeartbeat = null;
        this.lastRpoCalculatedTime = null;
        this.lifecycleId = null;
        this.managementId = null;
        this.monitoringJobType = null;
        this.monitoringPercentageCompletion = null;
        this.multiVmGroupCreateOption = null;
        this.multiVmGroupId = null;
        this.multiVmGroupName = null;
        this.osType = null;
        this.primaryFabricLocation = null;
        this.protectedDisks = List.of();
        this.protectedManagedDisks = List.of();
        this.recoveryAvailabilitySet = null;
        this.recoveryAvailabilityZone = null;
        this.recoveryAzureResourceGroupId = null;
        this.recoveryAzureVMName = null;
        this.recoveryAzureVMSize = null;
        this.recoveryBootDiagStorageAccountId = null;
        this.recoveryCloudService = null;
        this.recoveryFabricLocation = null;
        this.recoveryFabricObjectId = null;
        this.recoveryProximityPlacementGroupId = null;
        this.rpoInSeconds = null;
        this.selectedRecoveryAzureNetworkId = null;
        this.selectedTfoAzureNetworkId = null;
        this.testFailoverRecoveryFabricObjectId = null;
        this.tfoAzureVMName = null;
        this.unprotectedDisks = List.of();
        this.vmEncryptionType = null;
        this.vmNics = List.of();
        this.vmProtectionState = null;
        this.vmProtectionStateDescription = null;
        this.vmSyncedConfigDetails = null;
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
