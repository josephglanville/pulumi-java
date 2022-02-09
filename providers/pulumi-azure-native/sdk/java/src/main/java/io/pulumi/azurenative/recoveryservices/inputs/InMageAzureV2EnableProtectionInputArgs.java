// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.recoveryservices.inputs;

import io.pulumi.azurenative.recoveryservices.enums.DiskAccountType;
import io.pulumi.azurenative.recoveryservices.inputs.InMageAzureV2DiskInputDetailsArgs;
import io.pulumi.core.Either;
import io.pulumi.core.Input;
import io.pulumi.core.internal.annotations.InputImport;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


public final class InMageAzureV2EnableProtectionInputArgs extends io.pulumi.resources.ResourceArgs {

    public static final InMageAzureV2EnableProtectionInputArgs Empty = new InMageAzureV2EnableProtectionInputArgs();

    @InputImport(name="diskEncryptionSetId")
    private final @Nullable Input<String> diskEncryptionSetId;

    public Input<String> getDiskEncryptionSetId() {
        return this.diskEncryptionSetId == null ? Input.empty() : this.diskEncryptionSetId;
    }

    @InputImport(name="diskType")
    private final @Nullable Input<Either<String,DiskAccountType>> diskType;

    public Input<Either<String,DiskAccountType>> getDiskType() {
        return this.diskType == null ? Input.empty() : this.diskType;
    }

    @InputImport(name="disksToInclude")
    private final @Nullable Input<List<InMageAzureV2DiskInputDetailsArgs>> disksToInclude;

    public Input<List<InMageAzureV2DiskInputDetailsArgs>> getDisksToInclude() {
        return this.disksToInclude == null ? Input.empty() : this.disksToInclude;
    }

    @InputImport(name="enableRdpOnTargetOption")
    private final @Nullable Input<String> enableRdpOnTargetOption;

    public Input<String> getEnableRdpOnTargetOption() {
        return this.enableRdpOnTargetOption == null ? Input.empty() : this.enableRdpOnTargetOption;
    }

    @InputImport(name="instanceType")
    private final @Nullable Input<String> instanceType;

    public Input<String> getInstanceType() {
        return this.instanceType == null ? Input.empty() : this.instanceType;
    }

    @InputImport(name="logStorageAccountId")
    private final @Nullable Input<String> logStorageAccountId;

    public Input<String> getLogStorageAccountId() {
        return this.logStorageAccountId == null ? Input.empty() : this.logStorageAccountId;
    }

    @InputImport(name="masterTargetId")
    private final @Nullable Input<String> masterTargetId;

    public Input<String> getMasterTargetId() {
        return this.masterTargetId == null ? Input.empty() : this.masterTargetId;
    }

    @InputImport(name="multiVmGroupId")
    private final @Nullable Input<String> multiVmGroupId;

    public Input<String> getMultiVmGroupId() {
        return this.multiVmGroupId == null ? Input.empty() : this.multiVmGroupId;
    }

    @InputImport(name="multiVmGroupName")
    private final @Nullable Input<String> multiVmGroupName;

    public Input<String> getMultiVmGroupName() {
        return this.multiVmGroupName == null ? Input.empty() : this.multiVmGroupName;
    }

    @InputImport(name="processServerId")
    private final @Nullable Input<String> processServerId;

    public Input<String> getProcessServerId() {
        return this.processServerId == null ? Input.empty() : this.processServerId;
    }

    @InputImport(name="runAsAccountId")
    private final @Nullable Input<String> runAsAccountId;

    public Input<String> getRunAsAccountId() {
        return this.runAsAccountId == null ? Input.empty() : this.runAsAccountId;
    }

    @InputImport(name="storageAccountId")
    private final @Nullable Input<String> storageAccountId;

    public Input<String> getStorageAccountId() {
        return this.storageAccountId == null ? Input.empty() : this.storageAccountId;
    }

    @InputImport(name="targetAvailabilitySetId")
    private final @Nullable Input<String> targetAvailabilitySetId;

    public Input<String> getTargetAvailabilitySetId() {
        return this.targetAvailabilitySetId == null ? Input.empty() : this.targetAvailabilitySetId;
    }

    @InputImport(name="targetAvailabilityZone")
    private final @Nullable Input<String> targetAvailabilityZone;

    public Input<String> getTargetAvailabilityZone() {
        return this.targetAvailabilityZone == null ? Input.empty() : this.targetAvailabilityZone;
    }

    @InputImport(name="targetAzureNetworkId")
    private final @Nullable Input<String> targetAzureNetworkId;

    public Input<String> getTargetAzureNetworkId() {
        return this.targetAzureNetworkId == null ? Input.empty() : this.targetAzureNetworkId;
    }

    @InputImport(name="targetAzureSubnetId")
    private final @Nullable Input<String> targetAzureSubnetId;

    public Input<String> getTargetAzureSubnetId() {
        return this.targetAzureSubnetId == null ? Input.empty() : this.targetAzureSubnetId;
    }

    @InputImport(name="targetAzureV1ResourceGroupId")
    private final @Nullable Input<String> targetAzureV1ResourceGroupId;

    public Input<String> getTargetAzureV1ResourceGroupId() {
        return this.targetAzureV1ResourceGroupId == null ? Input.empty() : this.targetAzureV1ResourceGroupId;
    }

    @InputImport(name="targetAzureV2ResourceGroupId")
    private final @Nullable Input<String> targetAzureV2ResourceGroupId;

    public Input<String> getTargetAzureV2ResourceGroupId() {
        return this.targetAzureV2ResourceGroupId == null ? Input.empty() : this.targetAzureV2ResourceGroupId;
    }

    @InputImport(name="targetAzureVmName")
    private final @Nullable Input<String> targetAzureVmName;

    public Input<String> getTargetAzureVmName() {
        return this.targetAzureVmName == null ? Input.empty() : this.targetAzureVmName;
    }

    @InputImport(name="targetProximityPlacementGroupId")
    private final @Nullable Input<String> targetProximityPlacementGroupId;

    public Input<String> getTargetProximityPlacementGroupId() {
        return this.targetProximityPlacementGroupId == null ? Input.empty() : this.targetProximityPlacementGroupId;
    }

    @InputImport(name="targetVmSize")
    private final @Nullable Input<String> targetVmSize;

    public Input<String> getTargetVmSize() {
        return this.targetVmSize == null ? Input.empty() : this.targetVmSize;
    }

    public InMageAzureV2EnableProtectionInputArgs(
        @Nullable Input<String> diskEncryptionSetId,
        @Nullable Input<Either<String,DiskAccountType>> diskType,
        @Nullable Input<List<InMageAzureV2DiskInputDetailsArgs>> disksToInclude,
        @Nullable Input<String> enableRdpOnTargetOption,
        @Nullable Input<String> instanceType,
        @Nullable Input<String> logStorageAccountId,
        @Nullable Input<String> masterTargetId,
        @Nullable Input<String> multiVmGroupId,
        @Nullable Input<String> multiVmGroupName,
        @Nullable Input<String> processServerId,
        @Nullable Input<String> runAsAccountId,
        @Nullable Input<String> storageAccountId,
        @Nullable Input<String> targetAvailabilitySetId,
        @Nullable Input<String> targetAvailabilityZone,
        @Nullable Input<String> targetAzureNetworkId,
        @Nullable Input<String> targetAzureSubnetId,
        @Nullable Input<String> targetAzureV1ResourceGroupId,
        @Nullable Input<String> targetAzureV2ResourceGroupId,
        @Nullable Input<String> targetAzureVmName,
        @Nullable Input<String> targetProximityPlacementGroupId,
        @Nullable Input<String> targetVmSize) {
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
        this.diskEncryptionSetId = Input.empty();
        this.diskType = Input.empty();
        this.disksToInclude = Input.empty();
        this.enableRdpOnTargetOption = Input.empty();
        this.instanceType = Input.empty();
        this.logStorageAccountId = Input.empty();
        this.masterTargetId = Input.empty();
        this.multiVmGroupId = Input.empty();
        this.multiVmGroupName = Input.empty();
        this.processServerId = Input.empty();
        this.runAsAccountId = Input.empty();
        this.storageAccountId = Input.empty();
        this.targetAvailabilitySetId = Input.empty();
        this.targetAvailabilityZone = Input.empty();
        this.targetAzureNetworkId = Input.empty();
        this.targetAzureSubnetId = Input.empty();
        this.targetAzureV1ResourceGroupId = Input.empty();
        this.targetAzureV2ResourceGroupId = Input.empty();
        this.targetAzureVmName = Input.empty();
        this.targetProximityPlacementGroupId = Input.empty();
        this.targetVmSize = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(InMageAzureV2EnableProtectionInputArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<String> diskEncryptionSetId;
        private @Nullable Input<Either<String,DiskAccountType>> diskType;
        private @Nullable Input<List<InMageAzureV2DiskInputDetailsArgs>> disksToInclude;
        private @Nullable Input<String> enableRdpOnTargetOption;
        private @Nullable Input<String> instanceType;
        private @Nullable Input<String> logStorageAccountId;
        private @Nullable Input<String> masterTargetId;
        private @Nullable Input<String> multiVmGroupId;
        private @Nullable Input<String> multiVmGroupName;
        private @Nullable Input<String> processServerId;
        private @Nullable Input<String> runAsAccountId;
        private @Nullable Input<String> storageAccountId;
        private @Nullable Input<String> targetAvailabilitySetId;
        private @Nullable Input<String> targetAvailabilityZone;
        private @Nullable Input<String> targetAzureNetworkId;
        private @Nullable Input<String> targetAzureSubnetId;
        private @Nullable Input<String> targetAzureV1ResourceGroupId;
        private @Nullable Input<String> targetAzureV2ResourceGroupId;
        private @Nullable Input<String> targetAzureVmName;
        private @Nullable Input<String> targetProximityPlacementGroupId;
        private @Nullable Input<String> targetVmSize;

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

        public Builder setDiskEncryptionSetId(@Nullable Input<String> diskEncryptionSetId) {
            this.diskEncryptionSetId = diskEncryptionSetId;
            return this;
        }

        public Builder setDiskEncryptionSetId(@Nullable String diskEncryptionSetId) {
            this.diskEncryptionSetId = Input.ofNullable(diskEncryptionSetId);
            return this;
        }

        public Builder setDiskType(@Nullable Input<Either<String,DiskAccountType>> diskType) {
            this.diskType = diskType;
            return this;
        }

        public Builder setDiskType(@Nullable Either<String,DiskAccountType> diskType) {
            this.diskType = Input.ofNullable(diskType);
            return this;
        }

        public Builder setDisksToInclude(@Nullable Input<List<InMageAzureV2DiskInputDetailsArgs>> disksToInclude) {
            this.disksToInclude = disksToInclude;
            return this;
        }

        public Builder setDisksToInclude(@Nullable List<InMageAzureV2DiskInputDetailsArgs> disksToInclude) {
            this.disksToInclude = Input.ofNullable(disksToInclude);
            return this;
        }

        public Builder setEnableRdpOnTargetOption(@Nullable Input<String> enableRdpOnTargetOption) {
            this.enableRdpOnTargetOption = enableRdpOnTargetOption;
            return this;
        }

        public Builder setEnableRdpOnTargetOption(@Nullable String enableRdpOnTargetOption) {
            this.enableRdpOnTargetOption = Input.ofNullable(enableRdpOnTargetOption);
            return this;
        }

        public Builder setInstanceType(@Nullable Input<String> instanceType) {
            this.instanceType = instanceType;
            return this;
        }

        public Builder setInstanceType(@Nullable String instanceType) {
            this.instanceType = Input.ofNullable(instanceType);
            return this;
        }

        public Builder setLogStorageAccountId(@Nullable Input<String> logStorageAccountId) {
            this.logStorageAccountId = logStorageAccountId;
            return this;
        }

        public Builder setLogStorageAccountId(@Nullable String logStorageAccountId) {
            this.logStorageAccountId = Input.ofNullable(logStorageAccountId);
            return this;
        }

        public Builder setMasterTargetId(@Nullable Input<String> masterTargetId) {
            this.masterTargetId = masterTargetId;
            return this;
        }

        public Builder setMasterTargetId(@Nullable String masterTargetId) {
            this.masterTargetId = Input.ofNullable(masterTargetId);
            return this;
        }

        public Builder setMultiVmGroupId(@Nullable Input<String> multiVmGroupId) {
            this.multiVmGroupId = multiVmGroupId;
            return this;
        }

        public Builder setMultiVmGroupId(@Nullable String multiVmGroupId) {
            this.multiVmGroupId = Input.ofNullable(multiVmGroupId);
            return this;
        }

        public Builder setMultiVmGroupName(@Nullable Input<String> multiVmGroupName) {
            this.multiVmGroupName = multiVmGroupName;
            return this;
        }

        public Builder setMultiVmGroupName(@Nullable String multiVmGroupName) {
            this.multiVmGroupName = Input.ofNullable(multiVmGroupName);
            return this;
        }

        public Builder setProcessServerId(@Nullable Input<String> processServerId) {
            this.processServerId = processServerId;
            return this;
        }

        public Builder setProcessServerId(@Nullable String processServerId) {
            this.processServerId = Input.ofNullable(processServerId);
            return this;
        }

        public Builder setRunAsAccountId(@Nullable Input<String> runAsAccountId) {
            this.runAsAccountId = runAsAccountId;
            return this;
        }

        public Builder setRunAsAccountId(@Nullable String runAsAccountId) {
            this.runAsAccountId = Input.ofNullable(runAsAccountId);
            return this;
        }

        public Builder setStorageAccountId(@Nullable Input<String> storageAccountId) {
            this.storageAccountId = storageAccountId;
            return this;
        }

        public Builder setStorageAccountId(@Nullable String storageAccountId) {
            this.storageAccountId = Input.ofNullable(storageAccountId);
            return this;
        }

        public Builder setTargetAvailabilitySetId(@Nullable Input<String> targetAvailabilitySetId) {
            this.targetAvailabilitySetId = targetAvailabilitySetId;
            return this;
        }

        public Builder setTargetAvailabilitySetId(@Nullable String targetAvailabilitySetId) {
            this.targetAvailabilitySetId = Input.ofNullable(targetAvailabilitySetId);
            return this;
        }

        public Builder setTargetAvailabilityZone(@Nullable Input<String> targetAvailabilityZone) {
            this.targetAvailabilityZone = targetAvailabilityZone;
            return this;
        }

        public Builder setTargetAvailabilityZone(@Nullable String targetAvailabilityZone) {
            this.targetAvailabilityZone = Input.ofNullable(targetAvailabilityZone);
            return this;
        }

        public Builder setTargetAzureNetworkId(@Nullable Input<String> targetAzureNetworkId) {
            this.targetAzureNetworkId = targetAzureNetworkId;
            return this;
        }

        public Builder setTargetAzureNetworkId(@Nullable String targetAzureNetworkId) {
            this.targetAzureNetworkId = Input.ofNullable(targetAzureNetworkId);
            return this;
        }

        public Builder setTargetAzureSubnetId(@Nullable Input<String> targetAzureSubnetId) {
            this.targetAzureSubnetId = targetAzureSubnetId;
            return this;
        }

        public Builder setTargetAzureSubnetId(@Nullable String targetAzureSubnetId) {
            this.targetAzureSubnetId = Input.ofNullable(targetAzureSubnetId);
            return this;
        }

        public Builder setTargetAzureV1ResourceGroupId(@Nullable Input<String> targetAzureV1ResourceGroupId) {
            this.targetAzureV1ResourceGroupId = targetAzureV1ResourceGroupId;
            return this;
        }

        public Builder setTargetAzureV1ResourceGroupId(@Nullable String targetAzureV1ResourceGroupId) {
            this.targetAzureV1ResourceGroupId = Input.ofNullable(targetAzureV1ResourceGroupId);
            return this;
        }

        public Builder setTargetAzureV2ResourceGroupId(@Nullable Input<String> targetAzureV2ResourceGroupId) {
            this.targetAzureV2ResourceGroupId = targetAzureV2ResourceGroupId;
            return this;
        }

        public Builder setTargetAzureV2ResourceGroupId(@Nullable String targetAzureV2ResourceGroupId) {
            this.targetAzureV2ResourceGroupId = Input.ofNullable(targetAzureV2ResourceGroupId);
            return this;
        }

        public Builder setTargetAzureVmName(@Nullable Input<String> targetAzureVmName) {
            this.targetAzureVmName = targetAzureVmName;
            return this;
        }

        public Builder setTargetAzureVmName(@Nullable String targetAzureVmName) {
            this.targetAzureVmName = Input.ofNullable(targetAzureVmName);
            return this;
        }

        public Builder setTargetProximityPlacementGroupId(@Nullable Input<String> targetProximityPlacementGroupId) {
            this.targetProximityPlacementGroupId = targetProximityPlacementGroupId;
            return this;
        }

        public Builder setTargetProximityPlacementGroupId(@Nullable String targetProximityPlacementGroupId) {
            this.targetProximityPlacementGroupId = Input.ofNullable(targetProximityPlacementGroupId);
            return this;
        }

        public Builder setTargetVmSize(@Nullable Input<String> targetVmSize) {
            this.targetVmSize = targetVmSize;
            return this;
        }

        public Builder setTargetVmSize(@Nullable String targetVmSize) {
            this.targetVmSize = Input.ofNullable(targetVmSize);
            return this;
        }

        public InMageAzureV2EnableProtectionInputArgs build() {
            return new InMageAzureV2EnableProtectionInputArgs(diskEncryptionSetId, diskType, disksToInclude, enableRdpOnTargetOption, instanceType, logStorageAccountId, masterTargetId, multiVmGroupId, multiVmGroupName, processServerId, runAsAccountId, storageAccountId, targetAvailabilitySetId, targetAvailabilityZone, targetAzureNetworkId, targetAzureSubnetId, targetAzureV1ResourceGroupId, targetAzureV2ResourceGroupId, targetAzureVmName, targetProximityPlacementGroupId, targetVmSize);
        }
    }
}
