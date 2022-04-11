// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.recoveryservices.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * Azure specific enable protection input.
 * 
 */
public final class HyperVReplicaAzureEnableProtectionInputArgs extends io.pulumi.resources.ResourceArgs {

    public static final HyperVReplicaAzureEnableProtectionInputArgs Empty = new HyperVReplicaAzureEnableProtectionInputArgs();

    /**
     * The list of VHD IDs of disks to be protected.
     * 
     */
    @Import(name="disksToInclude")
      private final @Nullable Output<List<String>> disksToInclude;

    public Output<List<String>> getDisksToInclude() {
        return this.disksToInclude == null ? Codegen.empty() : this.disksToInclude;
    }

    /**
     * The selected option to enable RDP\SSH on target vm after failover. String value of {SrsDataContract.EnableRDPOnTargetOption} enum.
     * 
     */
    @Import(name="enableRdpOnTargetOption")
      private final @Nullable Output<String> enableRdpOnTargetOption;

    public Output<String> getEnableRdpOnTargetOption() {
        return this.enableRdpOnTargetOption == null ? Codegen.empty() : this.enableRdpOnTargetOption;
    }

    /**
     * The Hyper-V host Vm Id.
     * 
     */
    @Import(name="hvHostVmId")
      private final @Nullable Output<String> hvHostVmId;

    public Output<String> getHvHostVmId() {
        return this.hvHostVmId == null ? Codegen.empty() : this.hvHostVmId;
    }

    /**
     * The class type.
     * Expected value is 'HyperVReplicaAzure'.
     * 
     */
    @Import(name="instanceType")
      private final @Nullable Output<String> instanceType;

    public Output<String> getInstanceType() {
        return this.instanceType == null ? Codegen.empty() : this.instanceType;
    }

    /**
     * The storage account to be used for logging during replication.
     * 
     */
    @Import(name="logStorageAccountId")
      private final @Nullable Output<String> logStorageAccountId;

    public Output<String> getLogStorageAccountId() {
        return this.logStorageAccountId == null ? Codegen.empty() : this.logStorageAccountId;
    }

    /**
     * The OS type associated with vm.
     * 
     */
    @Import(name="osType")
      private final @Nullable Output<String> osType;

    public Output<String> getOsType() {
        return this.osType == null ? Codegen.empty() : this.osType;
    }

    /**
     * The availability set ARM Id.
     * 
     */
    @Import(name="targetAvailabilitySetId")
      private final @Nullable Output<String> targetAvailabilitySetId;

    public Output<String> getTargetAvailabilitySetId() {
        return this.targetAvailabilitySetId == null ? Codegen.empty() : this.targetAvailabilitySetId;
    }

    /**
     * The target availability zone.
     * 
     */
    @Import(name="targetAvailabilityZone")
      private final @Nullable Output<String> targetAvailabilityZone;

    public Output<String> getTargetAvailabilityZone() {
        return this.targetAvailabilityZone == null ? Codegen.empty() : this.targetAvailabilityZone;
    }

    /**
     * The selected target Azure network Id.
     * 
     */
    @Import(name="targetAzureNetworkId")
      private final @Nullable Output<String> targetAzureNetworkId;

    public Output<String> getTargetAzureNetworkId() {
        return this.targetAzureNetworkId == null ? Codegen.empty() : this.targetAzureNetworkId;
    }

    /**
     * The selected target Azure subnet Id.
     * 
     */
    @Import(name="targetAzureSubnetId")
      private final @Nullable Output<String> targetAzureSubnetId;

    public Output<String> getTargetAzureSubnetId() {
        return this.targetAzureSubnetId == null ? Codegen.empty() : this.targetAzureSubnetId;
    }

    /**
     * The Id of the target resource group (for classic deployment) in which the failover VM is to be created.
     * 
     */
    @Import(name="targetAzureV1ResourceGroupId")
      private final @Nullable Output<String> targetAzureV1ResourceGroupId;

    public Output<String> getTargetAzureV1ResourceGroupId() {
        return this.targetAzureV1ResourceGroupId == null ? Codegen.empty() : this.targetAzureV1ResourceGroupId;
    }

    /**
     * The Id of the target resource group (for resource manager deployment) in which the failover VM is to be created.
     * 
     */
    @Import(name="targetAzureV2ResourceGroupId")
      private final @Nullable Output<String> targetAzureV2ResourceGroupId;

    public Output<String> getTargetAzureV2ResourceGroupId() {
        return this.targetAzureV2ResourceGroupId == null ? Codegen.empty() : this.targetAzureV2ResourceGroupId;
    }

    /**
     * The target azure Vm Name.
     * 
     */
    @Import(name="targetAzureVmName")
      private final @Nullable Output<String> targetAzureVmName;

    public Output<String> getTargetAzureVmName() {
        return this.targetAzureVmName == null ? Codegen.empty() : this.targetAzureVmName;
    }

    /**
     * The proximity placement group ARM Id.
     * 
     */
    @Import(name="targetProximityPlacementGroupId")
      private final @Nullable Output<String> targetProximityPlacementGroupId;

    public Output<String> getTargetProximityPlacementGroupId() {
        return this.targetProximityPlacementGroupId == null ? Codegen.empty() : this.targetProximityPlacementGroupId;
    }

    /**
     * The storage account name.
     * 
     */
    @Import(name="targetStorageAccountId")
      private final @Nullable Output<String> targetStorageAccountId;

    public Output<String> getTargetStorageAccountId() {
        return this.targetStorageAccountId == null ? Codegen.empty() : this.targetStorageAccountId;
    }

    /**
     * The target VM size.
     * 
     */
    @Import(name="targetVmSize")
      private final @Nullable Output<String> targetVmSize;

    public Output<String> getTargetVmSize() {
        return this.targetVmSize == null ? Codegen.empty() : this.targetVmSize;
    }

    /**
     * A value indicating whether managed disks should be used during failover.
     * 
     */
    @Import(name="useManagedDisks")
      private final @Nullable Output<String> useManagedDisks;

    public Output<String> getUseManagedDisks() {
        return this.useManagedDisks == null ? Codegen.empty() : this.useManagedDisks;
    }

    /**
     * The OS disk VHD id associated with vm.
     * 
     */
    @Import(name="vhdId")
      private final @Nullable Output<String> vhdId;

    public Output<String> getVhdId() {
        return this.vhdId == null ? Codegen.empty() : this.vhdId;
    }

    /**
     * The Vm Name.
     * 
     */
    @Import(name="vmName")
      private final @Nullable Output<String> vmName;

    public Output<String> getVmName() {
        return this.vmName == null ? Codegen.empty() : this.vmName;
    }

    public HyperVReplicaAzureEnableProtectionInputArgs(
        @Nullable Output<List<String>> disksToInclude,
        @Nullable Output<String> enableRdpOnTargetOption,
        @Nullable Output<String> hvHostVmId,
        @Nullable Output<String> instanceType,
        @Nullable Output<String> logStorageAccountId,
        @Nullable Output<String> osType,
        @Nullable Output<String> targetAvailabilitySetId,
        @Nullable Output<String> targetAvailabilityZone,
        @Nullable Output<String> targetAzureNetworkId,
        @Nullable Output<String> targetAzureSubnetId,
        @Nullable Output<String> targetAzureV1ResourceGroupId,
        @Nullable Output<String> targetAzureV2ResourceGroupId,
        @Nullable Output<String> targetAzureVmName,
        @Nullable Output<String> targetProximityPlacementGroupId,
        @Nullable Output<String> targetStorageAccountId,
        @Nullable Output<String> targetVmSize,
        @Nullable Output<String> useManagedDisks,
        @Nullable Output<String> vhdId,
        @Nullable Output<String> vmName) {
        this.disksToInclude = disksToInclude;
        this.enableRdpOnTargetOption = enableRdpOnTargetOption;
        this.hvHostVmId = hvHostVmId;
        this.instanceType = instanceType;
        this.logStorageAccountId = logStorageAccountId;
        this.osType = osType;
        this.targetAvailabilitySetId = targetAvailabilitySetId;
        this.targetAvailabilityZone = targetAvailabilityZone;
        this.targetAzureNetworkId = targetAzureNetworkId;
        this.targetAzureSubnetId = targetAzureSubnetId;
        this.targetAzureV1ResourceGroupId = targetAzureV1ResourceGroupId;
        this.targetAzureV2ResourceGroupId = targetAzureV2ResourceGroupId;
        this.targetAzureVmName = targetAzureVmName;
        this.targetProximityPlacementGroupId = targetProximityPlacementGroupId;
        this.targetStorageAccountId = targetStorageAccountId;
        this.targetVmSize = targetVmSize;
        this.useManagedDisks = useManagedDisks;
        this.vhdId = vhdId;
        this.vmName = vmName;
    }

    private HyperVReplicaAzureEnableProtectionInputArgs() {
        this.disksToInclude = Codegen.empty();
        this.enableRdpOnTargetOption = Codegen.empty();
        this.hvHostVmId = Codegen.empty();
        this.instanceType = Codegen.empty();
        this.logStorageAccountId = Codegen.empty();
        this.osType = Codegen.empty();
        this.targetAvailabilitySetId = Codegen.empty();
        this.targetAvailabilityZone = Codegen.empty();
        this.targetAzureNetworkId = Codegen.empty();
        this.targetAzureSubnetId = Codegen.empty();
        this.targetAzureV1ResourceGroupId = Codegen.empty();
        this.targetAzureV2ResourceGroupId = Codegen.empty();
        this.targetAzureVmName = Codegen.empty();
        this.targetProximityPlacementGroupId = Codegen.empty();
        this.targetStorageAccountId = Codegen.empty();
        this.targetVmSize = Codegen.empty();
        this.useManagedDisks = Codegen.empty();
        this.vhdId = Codegen.empty();
        this.vmName = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(HyperVReplicaAzureEnableProtectionInputArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<List<String>> disksToInclude;
        private @Nullable Output<String> enableRdpOnTargetOption;
        private @Nullable Output<String> hvHostVmId;
        private @Nullable Output<String> instanceType;
        private @Nullable Output<String> logStorageAccountId;
        private @Nullable Output<String> osType;
        private @Nullable Output<String> targetAvailabilitySetId;
        private @Nullable Output<String> targetAvailabilityZone;
        private @Nullable Output<String> targetAzureNetworkId;
        private @Nullable Output<String> targetAzureSubnetId;
        private @Nullable Output<String> targetAzureV1ResourceGroupId;
        private @Nullable Output<String> targetAzureV2ResourceGroupId;
        private @Nullable Output<String> targetAzureVmName;
        private @Nullable Output<String> targetProximityPlacementGroupId;
        private @Nullable Output<String> targetStorageAccountId;
        private @Nullable Output<String> targetVmSize;
        private @Nullable Output<String> useManagedDisks;
        private @Nullable Output<String> vhdId;
        private @Nullable Output<String> vmName;

        public Builder() {
    	      // Empty
        }

        public Builder(HyperVReplicaAzureEnableProtectionInputArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.disksToInclude = defaults.disksToInclude;
    	      this.enableRdpOnTargetOption = defaults.enableRdpOnTargetOption;
    	      this.hvHostVmId = defaults.hvHostVmId;
    	      this.instanceType = defaults.instanceType;
    	      this.logStorageAccountId = defaults.logStorageAccountId;
    	      this.osType = defaults.osType;
    	      this.targetAvailabilitySetId = defaults.targetAvailabilitySetId;
    	      this.targetAvailabilityZone = defaults.targetAvailabilityZone;
    	      this.targetAzureNetworkId = defaults.targetAzureNetworkId;
    	      this.targetAzureSubnetId = defaults.targetAzureSubnetId;
    	      this.targetAzureV1ResourceGroupId = defaults.targetAzureV1ResourceGroupId;
    	      this.targetAzureV2ResourceGroupId = defaults.targetAzureV2ResourceGroupId;
    	      this.targetAzureVmName = defaults.targetAzureVmName;
    	      this.targetProximityPlacementGroupId = defaults.targetProximityPlacementGroupId;
    	      this.targetStorageAccountId = defaults.targetStorageAccountId;
    	      this.targetVmSize = defaults.targetVmSize;
    	      this.useManagedDisks = defaults.useManagedDisks;
    	      this.vhdId = defaults.vhdId;
    	      this.vmName = defaults.vmName;
        }

        public Builder disksToInclude(@Nullable Output<List<String>> disksToInclude) {
            this.disksToInclude = disksToInclude;
            return this;
        }
        public Builder disksToInclude(@Nullable List<String> disksToInclude) {
            this.disksToInclude = Codegen.ofNullable(disksToInclude);
            return this;
        }
        public Builder disksToInclude(String... disksToInclude) {
            return disksToInclude(List.of(disksToInclude));
        }
        public Builder enableRdpOnTargetOption(@Nullable Output<String> enableRdpOnTargetOption) {
            this.enableRdpOnTargetOption = enableRdpOnTargetOption;
            return this;
        }
        public Builder enableRdpOnTargetOption(@Nullable String enableRdpOnTargetOption) {
            this.enableRdpOnTargetOption = Codegen.ofNullable(enableRdpOnTargetOption);
            return this;
        }
        public Builder hvHostVmId(@Nullable Output<String> hvHostVmId) {
            this.hvHostVmId = hvHostVmId;
            return this;
        }
        public Builder hvHostVmId(@Nullable String hvHostVmId) {
            this.hvHostVmId = Codegen.ofNullable(hvHostVmId);
            return this;
        }
        public Builder instanceType(@Nullable Output<String> instanceType) {
            this.instanceType = instanceType;
            return this;
        }
        public Builder instanceType(@Nullable String instanceType) {
            this.instanceType = Codegen.ofNullable(instanceType);
            return this;
        }
        public Builder logStorageAccountId(@Nullable Output<String> logStorageAccountId) {
            this.logStorageAccountId = logStorageAccountId;
            return this;
        }
        public Builder logStorageAccountId(@Nullable String logStorageAccountId) {
            this.logStorageAccountId = Codegen.ofNullable(logStorageAccountId);
            return this;
        }
        public Builder osType(@Nullable Output<String> osType) {
            this.osType = osType;
            return this;
        }
        public Builder osType(@Nullable String osType) {
            this.osType = Codegen.ofNullable(osType);
            return this;
        }
        public Builder targetAvailabilitySetId(@Nullable Output<String> targetAvailabilitySetId) {
            this.targetAvailabilitySetId = targetAvailabilitySetId;
            return this;
        }
        public Builder targetAvailabilitySetId(@Nullable String targetAvailabilitySetId) {
            this.targetAvailabilitySetId = Codegen.ofNullable(targetAvailabilitySetId);
            return this;
        }
        public Builder targetAvailabilityZone(@Nullable Output<String> targetAvailabilityZone) {
            this.targetAvailabilityZone = targetAvailabilityZone;
            return this;
        }
        public Builder targetAvailabilityZone(@Nullable String targetAvailabilityZone) {
            this.targetAvailabilityZone = Codegen.ofNullable(targetAvailabilityZone);
            return this;
        }
        public Builder targetAzureNetworkId(@Nullable Output<String> targetAzureNetworkId) {
            this.targetAzureNetworkId = targetAzureNetworkId;
            return this;
        }
        public Builder targetAzureNetworkId(@Nullable String targetAzureNetworkId) {
            this.targetAzureNetworkId = Codegen.ofNullable(targetAzureNetworkId);
            return this;
        }
        public Builder targetAzureSubnetId(@Nullable Output<String> targetAzureSubnetId) {
            this.targetAzureSubnetId = targetAzureSubnetId;
            return this;
        }
        public Builder targetAzureSubnetId(@Nullable String targetAzureSubnetId) {
            this.targetAzureSubnetId = Codegen.ofNullable(targetAzureSubnetId);
            return this;
        }
        public Builder targetAzureV1ResourceGroupId(@Nullable Output<String> targetAzureV1ResourceGroupId) {
            this.targetAzureV1ResourceGroupId = targetAzureV1ResourceGroupId;
            return this;
        }
        public Builder targetAzureV1ResourceGroupId(@Nullable String targetAzureV1ResourceGroupId) {
            this.targetAzureV1ResourceGroupId = Codegen.ofNullable(targetAzureV1ResourceGroupId);
            return this;
        }
        public Builder targetAzureV2ResourceGroupId(@Nullable Output<String> targetAzureV2ResourceGroupId) {
            this.targetAzureV2ResourceGroupId = targetAzureV2ResourceGroupId;
            return this;
        }
        public Builder targetAzureV2ResourceGroupId(@Nullable String targetAzureV2ResourceGroupId) {
            this.targetAzureV2ResourceGroupId = Codegen.ofNullable(targetAzureV2ResourceGroupId);
            return this;
        }
        public Builder targetAzureVmName(@Nullable Output<String> targetAzureVmName) {
            this.targetAzureVmName = targetAzureVmName;
            return this;
        }
        public Builder targetAzureVmName(@Nullable String targetAzureVmName) {
            this.targetAzureVmName = Codegen.ofNullable(targetAzureVmName);
            return this;
        }
        public Builder targetProximityPlacementGroupId(@Nullable Output<String> targetProximityPlacementGroupId) {
            this.targetProximityPlacementGroupId = targetProximityPlacementGroupId;
            return this;
        }
        public Builder targetProximityPlacementGroupId(@Nullable String targetProximityPlacementGroupId) {
            this.targetProximityPlacementGroupId = Codegen.ofNullable(targetProximityPlacementGroupId);
            return this;
        }
        public Builder targetStorageAccountId(@Nullable Output<String> targetStorageAccountId) {
            this.targetStorageAccountId = targetStorageAccountId;
            return this;
        }
        public Builder targetStorageAccountId(@Nullable String targetStorageAccountId) {
            this.targetStorageAccountId = Codegen.ofNullable(targetStorageAccountId);
            return this;
        }
        public Builder targetVmSize(@Nullable Output<String> targetVmSize) {
            this.targetVmSize = targetVmSize;
            return this;
        }
        public Builder targetVmSize(@Nullable String targetVmSize) {
            this.targetVmSize = Codegen.ofNullable(targetVmSize);
            return this;
        }
        public Builder useManagedDisks(@Nullable Output<String> useManagedDisks) {
            this.useManagedDisks = useManagedDisks;
            return this;
        }
        public Builder useManagedDisks(@Nullable String useManagedDisks) {
            this.useManagedDisks = Codegen.ofNullable(useManagedDisks);
            return this;
        }
        public Builder vhdId(@Nullable Output<String> vhdId) {
            this.vhdId = vhdId;
            return this;
        }
        public Builder vhdId(@Nullable String vhdId) {
            this.vhdId = Codegen.ofNullable(vhdId);
            return this;
        }
        public Builder vmName(@Nullable Output<String> vmName) {
            this.vmName = vmName;
            return this;
        }
        public Builder vmName(@Nullable String vmName) {
            this.vmName = Codegen.ofNullable(vmName);
            return this;
        }        public HyperVReplicaAzureEnableProtectionInputArgs build() {
            return new HyperVReplicaAzureEnableProtectionInputArgs(disksToInclude, enableRdpOnTargetOption, hvHostVmId, instanceType, logStorageAccountId, osType, targetAvailabilitySetId, targetAvailabilityZone, targetAzureNetworkId, targetAzureSubnetId, targetAzureV1ResourceGroupId, targetAzureV2ResourceGroupId, targetAzureVmName, targetProximityPlacementGroupId, targetStorageAccountId, targetVmSize, useManagedDisks, vhdId, vmName);
        }
    }
}
