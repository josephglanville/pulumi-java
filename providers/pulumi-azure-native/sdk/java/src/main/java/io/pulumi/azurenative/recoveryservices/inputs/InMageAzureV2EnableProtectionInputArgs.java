// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.recoveryservices.inputs;

import io.pulumi.azurenative.recoveryservices.enums.DiskAccountType;
import io.pulumi.azurenative.recoveryservices.inputs.InMageAzureV2DiskInputDetailsArgs;
import io.pulumi.core.Either;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * VMware Azure specific enable protection input.
 * 
 */
public final class InMageAzureV2EnableProtectionInputArgs extends io.pulumi.resources.ResourceArgs {

    public static final InMageAzureV2EnableProtectionInputArgs Empty = new InMageAzureV2EnableProtectionInputArgs();

    /**
     * The DiskEncryptionSet ARM ID.
     * 
     */
    @Import(name="diskEncryptionSetId")
      private final @Nullable Output<String> diskEncryptionSetId;

    public Output<String> getDiskEncryptionSetId() {
        return this.diskEncryptionSetId == null ? Output.empty() : this.diskEncryptionSetId;
    }

    /**
     * The DiskType.
     * 
     */
    @Import(name="diskType")
      private final @Nullable Output<Either<String,DiskAccountType>> diskType;

    public Output<Either<String,DiskAccountType>> getDiskType() {
        return this.diskType == null ? Output.empty() : this.diskType;
    }

    /**
     * The disks to include list.
     * 
     */
    @Import(name="disksToInclude")
      private final @Nullable Output<List<InMageAzureV2DiskInputDetailsArgs>> disksToInclude;

    public Output<List<InMageAzureV2DiskInputDetailsArgs>> getDisksToInclude() {
        return this.disksToInclude == null ? Output.empty() : this.disksToInclude;
    }

    /**
     * The selected option to enable RDP\SSH on target vm after failover. String value of {SrsDataContract.EnableRDPOnTargetOption} enum.
     * 
     */
    @Import(name="enableRdpOnTargetOption")
      private final @Nullable Output<String> enableRdpOnTargetOption;

    public Output<String> getEnableRdpOnTargetOption() {
        return this.enableRdpOnTargetOption == null ? Output.empty() : this.enableRdpOnTargetOption;
    }

    /**
     * The class type.
     * Expected value is 'InMageAzureV2'.
     * 
     */
    @Import(name="instanceType")
      private final @Nullable Output<String> instanceType;

    public Output<String> getInstanceType() {
        return this.instanceType == null ? Output.empty() : this.instanceType;
    }

    /**
     * The storage account to be used for logging during replication.
     * 
     */
    @Import(name="logStorageAccountId")
      private final @Nullable Output<String> logStorageAccountId;

    public Output<String> getLogStorageAccountId() {
        return this.logStorageAccountId == null ? Output.empty() : this.logStorageAccountId;
    }

    /**
     * The Master target Id.
     * 
     */
    @Import(name="masterTargetId")
      private final @Nullable Output<String> masterTargetId;

    public Output<String> getMasterTargetId() {
        return this.masterTargetId == null ? Output.empty() : this.masterTargetId;
    }

    /**
     * The multi vm group Id.
     * 
     */
    @Import(name="multiVmGroupId")
      private final @Nullable Output<String> multiVmGroupId;

    public Output<String> getMultiVmGroupId() {
        return this.multiVmGroupId == null ? Output.empty() : this.multiVmGroupId;
    }

    /**
     * The multi vm group name.
     * 
     */
    @Import(name="multiVmGroupName")
      private final @Nullable Output<String> multiVmGroupName;

    public Output<String> getMultiVmGroupName() {
        return this.multiVmGroupName == null ? Output.empty() : this.multiVmGroupName;
    }

    /**
     * The Process Server Id.
     * 
     */
    @Import(name="processServerId")
      private final @Nullable Output<String> processServerId;

    public Output<String> getProcessServerId() {
        return this.processServerId == null ? Output.empty() : this.processServerId;
    }

    /**
     * The CS account Id.
     * 
     */
    @Import(name="runAsAccountId")
      private final @Nullable Output<String> runAsAccountId;

    public Output<String> getRunAsAccountId() {
        return this.runAsAccountId == null ? Output.empty() : this.runAsAccountId;
    }

    /**
     * The storage account name.
     * 
     */
    @Import(name="storageAccountId")
      private final @Nullable Output<String> storageAccountId;

    public Output<String> getStorageAccountId() {
        return this.storageAccountId == null ? Output.empty() : this.storageAccountId;
    }

    /**
     * The availability set ARM Id.
     * 
     */
    @Import(name="targetAvailabilitySetId")
      private final @Nullable Output<String> targetAvailabilitySetId;

    public Output<String> getTargetAvailabilitySetId() {
        return this.targetAvailabilitySetId == null ? Output.empty() : this.targetAvailabilitySetId;
    }

    /**
     * The target availability zone.
     * 
     */
    @Import(name="targetAvailabilityZone")
      private final @Nullable Output<String> targetAvailabilityZone;

    public Output<String> getTargetAvailabilityZone() {
        return this.targetAvailabilityZone == null ? Output.empty() : this.targetAvailabilityZone;
    }

    /**
     * The selected target Azure network Id.
     * 
     */
    @Import(name="targetAzureNetworkId")
      private final @Nullable Output<String> targetAzureNetworkId;

    public Output<String> getTargetAzureNetworkId() {
        return this.targetAzureNetworkId == null ? Output.empty() : this.targetAzureNetworkId;
    }

    /**
     * The selected target Azure subnet Id.
     * 
     */
    @Import(name="targetAzureSubnetId")
      private final @Nullable Output<String> targetAzureSubnetId;

    public Output<String> getTargetAzureSubnetId() {
        return this.targetAzureSubnetId == null ? Output.empty() : this.targetAzureSubnetId;
    }

    /**
     * The Id of the target resource group (for classic deployment) in which the failover VM is to be created.
     * 
     */
    @Import(name="targetAzureV1ResourceGroupId")
      private final @Nullable Output<String> targetAzureV1ResourceGroupId;

    public Output<String> getTargetAzureV1ResourceGroupId() {
        return this.targetAzureV1ResourceGroupId == null ? Output.empty() : this.targetAzureV1ResourceGroupId;
    }

    /**
     * The Id of the target resource group (for resource manager deployment) in which the failover VM is to be created.
     * 
     */
    @Import(name="targetAzureV2ResourceGroupId")
      private final @Nullable Output<String> targetAzureV2ResourceGroupId;

    public Output<String> getTargetAzureV2ResourceGroupId() {
        return this.targetAzureV2ResourceGroupId == null ? Output.empty() : this.targetAzureV2ResourceGroupId;
    }

    /**
     * The target azure Vm Name.
     * 
     */
    @Import(name="targetAzureVmName")
      private final @Nullable Output<String> targetAzureVmName;

    public Output<String> getTargetAzureVmName() {
        return this.targetAzureVmName == null ? Output.empty() : this.targetAzureVmName;
    }

    /**
     * The proximity placement group ARM Id.
     * 
     */
    @Import(name="targetProximityPlacementGroupId")
      private final @Nullable Output<String> targetProximityPlacementGroupId;

    public Output<String> getTargetProximityPlacementGroupId() {
        return this.targetProximityPlacementGroupId == null ? Output.empty() : this.targetProximityPlacementGroupId;
    }

    /**
     * The target VM size.
     * 
     */
    @Import(name="targetVmSize")
      private final @Nullable Output<String> targetVmSize;

    public Output<String> getTargetVmSize() {
        return this.targetVmSize == null ? Output.empty() : this.targetVmSize;
    }

    public InMageAzureV2EnableProtectionInputArgs(
        @Nullable Output<String> diskEncryptionSetId,
        @Nullable Output<Either<String,DiskAccountType>> diskType,
        @Nullable Output<List<InMageAzureV2DiskInputDetailsArgs>> disksToInclude,
        @Nullable Output<String> enableRdpOnTargetOption,
        @Nullable Output<String> instanceType,
        @Nullable Output<String> logStorageAccountId,
        @Nullable Output<String> masterTargetId,
        @Nullable Output<String> multiVmGroupId,
        @Nullable Output<String> multiVmGroupName,
        @Nullable Output<String> processServerId,
        @Nullable Output<String> runAsAccountId,
        @Nullable Output<String> storageAccountId,
        @Nullable Output<String> targetAvailabilitySetId,
        @Nullable Output<String> targetAvailabilityZone,
        @Nullable Output<String> targetAzureNetworkId,
        @Nullable Output<String> targetAzureSubnetId,
        @Nullable Output<String> targetAzureV1ResourceGroupId,
        @Nullable Output<String> targetAzureV2ResourceGroupId,
        @Nullable Output<String> targetAzureVmName,
        @Nullable Output<String> targetProximityPlacementGroupId,
        @Nullable Output<String> targetVmSize) {
        this.diskEncryptionSetId = diskEncryptionSetId;
        this.diskType = diskType;
        this.disksToInclude = disksToInclude;
        this.enableRdpOnTargetOption = enableRdpOnTargetOption;
        this.instanceType = instanceType;
        this.logStorageAccountId = logStorageAccountId;
        this.masterTargetId = masterTargetId;
        this.multiVmGroupId = multiVmGroupId;
        this.multiVmGroupName = multiVmGroupName;
        this.processServerId = processServerId;
        this.runAsAccountId = runAsAccountId;
        this.storageAccountId = storageAccountId;
        this.targetAvailabilitySetId = targetAvailabilitySetId;
        this.targetAvailabilityZone = targetAvailabilityZone;
        this.targetAzureNetworkId = targetAzureNetworkId;
        this.targetAzureSubnetId = targetAzureSubnetId;
        this.targetAzureV1ResourceGroupId = targetAzureV1ResourceGroupId;
        this.targetAzureV2ResourceGroupId = targetAzureV2ResourceGroupId;
        this.targetAzureVmName = targetAzureVmName;
        this.targetProximityPlacementGroupId = targetProximityPlacementGroupId;
        this.targetVmSize = targetVmSize;
    }

    private InMageAzureV2EnableProtectionInputArgs() {
        this.diskEncryptionSetId = Output.empty();
        this.diskType = Output.empty();
        this.disksToInclude = Output.empty();
        this.enableRdpOnTargetOption = Output.empty();
        this.instanceType = Output.empty();
        this.logStorageAccountId = Output.empty();
        this.masterTargetId = Output.empty();
        this.multiVmGroupId = Output.empty();
        this.multiVmGroupName = Output.empty();
        this.processServerId = Output.empty();
        this.runAsAccountId = Output.empty();
        this.storageAccountId = Output.empty();
        this.targetAvailabilitySetId = Output.empty();
        this.targetAvailabilityZone = Output.empty();
        this.targetAzureNetworkId = Output.empty();
        this.targetAzureSubnetId = Output.empty();
        this.targetAzureV1ResourceGroupId = Output.empty();
        this.targetAzureV2ResourceGroupId = Output.empty();
        this.targetAzureVmName = Output.empty();
        this.targetProximityPlacementGroupId = Output.empty();
        this.targetVmSize = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(InMageAzureV2EnableProtectionInputArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<String> diskEncryptionSetId;
        private @Nullable Output<Either<String,DiskAccountType>> diskType;
        private @Nullable Output<List<InMageAzureV2DiskInputDetailsArgs>> disksToInclude;
        private @Nullable Output<String> enableRdpOnTargetOption;
        private @Nullable Output<String> instanceType;
        private @Nullable Output<String> logStorageAccountId;
        private @Nullable Output<String> masterTargetId;
        private @Nullable Output<String> multiVmGroupId;
        private @Nullable Output<String> multiVmGroupName;
        private @Nullable Output<String> processServerId;
        private @Nullable Output<String> runAsAccountId;
        private @Nullable Output<String> storageAccountId;
        private @Nullable Output<String> targetAvailabilitySetId;
        private @Nullable Output<String> targetAvailabilityZone;
        private @Nullable Output<String> targetAzureNetworkId;
        private @Nullable Output<String> targetAzureSubnetId;
        private @Nullable Output<String> targetAzureV1ResourceGroupId;
        private @Nullable Output<String> targetAzureV2ResourceGroupId;
        private @Nullable Output<String> targetAzureVmName;
        private @Nullable Output<String> targetProximityPlacementGroupId;
        private @Nullable Output<String> targetVmSize;

        public Builder() {
    	      // Empty
        }

        public Builder(InMageAzureV2EnableProtectionInputArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.diskEncryptionSetId = defaults.diskEncryptionSetId;
    	      this.diskType = defaults.diskType;
    	      this.disksToInclude = defaults.disksToInclude;
    	      this.enableRdpOnTargetOption = defaults.enableRdpOnTargetOption;
    	      this.instanceType = defaults.instanceType;
    	      this.logStorageAccountId = defaults.logStorageAccountId;
    	      this.masterTargetId = defaults.masterTargetId;
    	      this.multiVmGroupId = defaults.multiVmGroupId;
    	      this.multiVmGroupName = defaults.multiVmGroupName;
    	      this.processServerId = defaults.processServerId;
    	      this.runAsAccountId = defaults.runAsAccountId;
    	      this.storageAccountId = defaults.storageAccountId;
    	      this.targetAvailabilitySetId = defaults.targetAvailabilitySetId;
    	      this.targetAvailabilityZone = defaults.targetAvailabilityZone;
    	      this.targetAzureNetworkId = defaults.targetAzureNetworkId;
    	      this.targetAzureSubnetId = defaults.targetAzureSubnetId;
    	      this.targetAzureV1ResourceGroupId = defaults.targetAzureV1ResourceGroupId;
    	      this.targetAzureV2ResourceGroupId = defaults.targetAzureV2ResourceGroupId;
    	      this.targetAzureVmName = defaults.targetAzureVmName;
    	      this.targetProximityPlacementGroupId = defaults.targetProximityPlacementGroupId;
    	      this.targetVmSize = defaults.targetVmSize;
        }

        public Builder diskEncryptionSetId(@Nullable Output<String> diskEncryptionSetId) {
            this.diskEncryptionSetId = diskEncryptionSetId;
            return this;
        }
        public Builder diskEncryptionSetId(@Nullable String diskEncryptionSetId) {
            this.diskEncryptionSetId = Output.ofNullable(diskEncryptionSetId);
            return this;
        }
        public Builder diskType(@Nullable Output<Either<String,DiskAccountType>> diskType) {
            this.diskType = diskType;
            return this;
        }
        public Builder diskType(@Nullable Either<String,DiskAccountType> diskType) {
            this.diskType = Output.ofNullable(diskType);
            return this;
        }
        public Builder disksToInclude(@Nullable Output<List<InMageAzureV2DiskInputDetailsArgs>> disksToInclude) {
            this.disksToInclude = disksToInclude;
            return this;
        }
        public Builder disksToInclude(@Nullable List<InMageAzureV2DiskInputDetailsArgs> disksToInclude) {
            this.disksToInclude = Output.ofNullable(disksToInclude);
            return this;
        }
        public Builder disksToInclude(InMageAzureV2DiskInputDetailsArgs... disksToInclude) {
            return disksToInclude(List.of(disksToInclude));
        }
        public Builder enableRdpOnTargetOption(@Nullable Output<String> enableRdpOnTargetOption) {
            this.enableRdpOnTargetOption = enableRdpOnTargetOption;
            return this;
        }
        public Builder enableRdpOnTargetOption(@Nullable String enableRdpOnTargetOption) {
            this.enableRdpOnTargetOption = Output.ofNullable(enableRdpOnTargetOption);
            return this;
        }
        public Builder instanceType(@Nullable Output<String> instanceType) {
            this.instanceType = instanceType;
            return this;
        }
        public Builder instanceType(@Nullable String instanceType) {
            this.instanceType = Output.ofNullable(instanceType);
            return this;
        }
        public Builder logStorageAccountId(@Nullable Output<String> logStorageAccountId) {
            this.logStorageAccountId = logStorageAccountId;
            return this;
        }
        public Builder logStorageAccountId(@Nullable String logStorageAccountId) {
            this.logStorageAccountId = Output.ofNullable(logStorageAccountId);
            return this;
        }
        public Builder masterTargetId(@Nullable Output<String> masterTargetId) {
            this.masterTargetId = masterTargetId;
            return this;
        }
        public Builder masterTargetId(@Nullable String masterTargetId) {
            this.masterTargetId = Output.ofNullable(masterTargetId);
            return this;
        }
        public Builder multiVmGroupId(@Nullable Output<String> multiVmGroupId) {
            this.multiVmGroupId = multiVmGroupId;
            return this;
        }
        public Builder multiVmGroupId(@Nullable String multiVmGroupId) {
            this.multiVmGroupId = Output.ofNullable(multiVmGroupId);
            return this;
        }
        public Builder multiVmGroupName(@Nullable Output<String> multiVmGroupName) {
            this.multiVmGroupName = multiVmGroupName;
            return this;
        }
        public Builder multiVmGroupName(@Nullable String multiVmGroupName) {
            this.multiVmGroupName = Output.ofNullable(multiVmGroupName);
            return this;
        }
        public Builder processServerId(@Nullable Output<String> processServerId) {
            this.processServerId = processServerId;
            return this;
        }
        public Builder processServerId(@Nullable String processServerId) {
            this.processServerId = Output.ofNullable(processServerId);
            return this;
        }
        public Builder runAsAccountId(@Nullable Output<String> runAsAccountId) {
            this.runAsAccountId = runAsAccountId;
            return this;
        }
        public Builder runAsAccountId(@Nullable String runAsAccountId) {
            this.runAsAccountId = Output.ofNullable(runAsAccountId);
            return this;
        }
        public Builder storageAccountId(@Nullable Output<String> storageAccountId) {
            this.storageAccountId = storageAccountId;
            return this;
        }
        public Builder storageAccountId(@Nullable String storageAccountId) {
            this.storageAccountId = Output.ofNullable(storageAccountId);
            return this;
        }
        public Builder targetAvailabilitySetId(@Nullable Output<String> targetAvailabilitySetId) {
            this.targetAvailabilitySetId = targetAvailabilitySetId;
            return this;
        }
        public Builder targetAvailabilitySetId(@Nullable String targetAvailabilitySetId) {
            this.targetAvailabilitySetId = Output.ofNullable(targetAvailabilitySetId);
            return this;
        }
        public Builder targetAvailabilityZone(@Nullable Output<String> targetAvailabilityZone) {
            this.targetAvailabilityZone = targetAvailabilityZone;
            return this;
        }
        public Builder targetAvailabilityZone(@Nullable String targetAvailabilityZone) {
            this.targetAvailabilityZone = Output.ofNullable(targetAvailabilityZone);
            return this;
        }
        public Builder targetAzureNetworkId(@Nullable Output<String> targetAzureNetworkId) {
            this.targetAzureNetworkId = targetAzureNetworkId;
            return this;
        }
        public Builder targetAzureNetworkId(@Nullable String targetAzureNetworkId) {
            this.targetAzureNetworkId = Output.ofNullable(targetAzureNetworkId);
            return this;
        }
        public Builder targetAzureSubnetId(@Nullable Output<String> targetAzureSubnetId) {
            this.targetAzureSubnetId = targetAzureSubnetId;
            return this;
        }
        public Builder targetAzureSubnetId(@Nullable String targetAzureSubnetId) {
            this.targetAzureSubnetId = Output.ofNullable(targetAzureSubnetId);
            return this;
        }
        public Builder targetAzureV1ResourceGroupId(@Nullable Output<String> targetAzureV1ResourceGroupId) {
            this.targetAzureV1ResourceGroupId = targetAzureV1ResourceGroupId;
            return this;
        }
        public Builder targetAzureV1ResourceGroupId(@Nullable String targetAzureV1ResourceGroupId) {
            this.targetAzureV1ResourceGroupId = Output.ofNullable(targetAzureV1ResourceGroupId);
            return this;
        }
        public Builder targetAzureV2ResourceGroupId(@Nullable Output<String> targetAzureV2ResourceGroupId) {
            this.targetAzureV2ResourceGroupId = targetAzureV2ResourceGroupId;
            return this;
        }
        public Builder targetAzureV2ResourceGroupId(@Nullable String targetAzureV2ResourceGroupId) {
            this.targetAzureV2ResourceGroupId = Output.ofNullable(targetAzureV2ResourceGroupId);
            return this;
        }
        public Builder targetAzureVmName(@Nullable Output<String> targetAzureVmName) {
            this.targetAzureVmName = targetAzureVmName;
            return this;
        }
        public Builder targetAzureVmName(@Nullable String targetAzureVmName) {
            this.targetAzureVmName = Output.ofNullable(targetAzureVmName);
            return this;
        }
        public Builder targetProximityPlacementGroupId(@Nullable Output<String> targetProximityPlacementGroupId) {
            this.targetProximityPlacementGroupId = targetProximityPlacementGroupId;
            return this;
        }
        public Builder targetProximityPlacementGroupId(@Nullable String targetProximityPlacementGroupId) {
            this.targetProximityPlacementGroupId = Output.ofNullable(targetProximityPlacementGroupId);
            return this;
        }
        public Builder targetVmSize(@Nullable Output<String> targetVmSize) {
            this.targetVmSize = targetVmSize;
            return this;
        }
        public Builder targetVmSize(@Nullable String targetVmSize) {
            this.targetVmSize = Output.ofNullable(targetVmSize);
            return this;
        }        public InMageAzureV2EnableProtectionInputArgs build() {
            return new InMageAzureV2EnableProtectionInputArgs(diskEncryptionSetId, diskType, disksToInclude, enableRdpOnTargetOption, instanceType, logStorageAccountId, masterTargetId, multiVmGroupId, multiVmGroupName, processServerId, runAsAccountId, storageAccountId, targetAvailabilitySetId, targetAvailabilityZone, targetAzureNetworkId, targetAzureSubnetId, targetAzureV1ResourceGroupId, targetAzureV2ResourceGroupId, targetAzureVmName, targetProximityPlacementGroupId, targetVmSize);
        }
    }
}
