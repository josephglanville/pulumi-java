// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.recoveryservices.inputs;

import io.pulumi.azurenative.recoveryservices.inputs.DiskDetailsResponse;
import io.pulumi.azurenative.recoveryservices.inputs.InitialReplicationDetailsResponse;
import io.pulumi.azurenative.recoveryservices.inputs.VMNicDetailsResponse;
import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * HyperV replica 2012 replication details.
 * 
 */
public final class HyperVReplicaReplicationDetailsResponse extends io.pulumi.resources.InvokeArgs {

    public static final HyperVReplicaReplicationDetailsResponse Empty = new HyperVReplicaReplicationDetailsResponse();

    /**
     * Initial replication details.
     * 
     */
    @InputImport(name="initialReplicationDetails")
      private final @Nullable InitialReplicationDetailsResponse initialReplicationDetails;

    public Optional<InitialReplicationDetailsResponse> getInitialReplicationDetails() {
        return this.initialReplicationDetails == null ? Optional.empty() : Optional.ofNullable(this.initialReplicationDetails);
    }

    /**
     * Gets the Instance type.
     * Expected value is 'HyperVReplica2012'.
     * 
     */
    @InputImport(name="instanceType", required=true)
      private final String instanceType;

    public String getInstanceType() {
        return this.instanceType;
    }

    /**
     * The Last replication time.
     * 
     */
    @InputImport(name="lastReplicatedTime")
      private final @Nullable String lastReplicatedTime;

    public Optional<String> getLastReplicatedTime() {
        return this.lastReplicatedTime == null ? Optional.empty() : Optional.ofNullable(this.lastReplicatedTime);
    }

    /**
     * VM disk details.
     * 
     */
    @InputImport(name="vMDiskDetails")
      private final @Nullable List<DiskDetailsResponse> vMDiskDetails;

    public List<DiskDetailsResponse> getVMDiskDetails() {
        return this.vMDiskDetails == null ? List.of() : this.vMDiskDetails;
    }

    /**
     * The virtual machine Id.
     * 
     */
    @InputImport(name="vmId")
      private final @Nullable String vmId;

    public Optional<String> getVmId() {
        return this.vmId == null ? Optional.empty() : Optional.ofNullable(this.vmId);
    }

    /**
     * The PE Network details.
     * 
     */
    @InputImport(name="vmNics")
      private final @Nullable List<VMNicDetailsResponse> vmNics;

    public List<VMNicDetailsResponse> getVmNics() {
        return this.vmNics == null ? List.of() : this.vmNics;
    }

    /**
     * The protection state for the vm.
     * 
     */
    @InputImport(name="vmProtectionState")
      private final @Nullable String vmProtectionState;

    public Optional<String> getVmProtectionState() {
        return this.vmProtectionState == null ? Optional.empty() : Optional.ofNullable(this.vmProtectionState);
    }

    /**
     * The protection state description for the vm.
     * 
     */
    @InputImport(name="vmProtectionStateDescription")
      private final @Nullable String vmProtectionStateDescription;

    public Optional<String> getVmProtectionStateDescription() {
        return this.vmProtectionStateDescription == null ? Optional.empty() : Optional.ofNullable(this.vmProtectionStateDescription);
    }

    public HyperVReplicaReplicationDetailsResponse(
        @Nullable InitialReplicationDetailsResponse initialReplicationDetails,
        String instanceType,
        @Nullable String lastReplicatedTime,
        @Nullable List<DiskDetailsResponse> vMDiskDetails,
        @Nullable String vmId,
        @Nullable List<VMNicDetailsResponse> vmNics,
        @Nullable String vmProtectionState,
        @Nullable String vmProtectionStateDescription) {
        this.initialReplicationDetails = initialReplicationDetails;
        this.instanceType = Objects.requireNonNull(instanceType, "expected parameter 'instanceType' to be non-null");
        this.lastReplicatedTime = lastReplicatedTime;
        this.vMDiskDetails = vMDiskDetails;
        this.vmId = vmId;
        this.vmNics = vmNics;
        this.vmProtectionState = vmProtectionState;
        this.vmProtectionStateDescription = vmProtectionStateDescription;
    }

    private HyperVReplicaReplicationDetailsResponse() {
        this.initialReplicationDetails = null;
        this.instanceType = null;
        this.lastReplicatedTime = null;
        this.vMDiskDetails = List.of();
        this.vmId = null;
        this.vmNics = List.of();
        this.vmProtectionState = null;
        this.vmProtectionStateDescription = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(HyperVReplicaReplicationDetailsResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable InitialReplicationDetailsResponse initialReplicationDetails;
        private String instanceType;
        private @Nullable String lastReplicatedTime;
        private @Nullable List<DiskDetailsResponse> vMDiskDetails;
        private @Nullable String vmId;
        private @Nullable List<VMNicDetailsResponse> vmNics;
        private @Nullable String vmProtectionState;
        private @Nullable String vmProtectionStateDescription;

        public Builder() {
    	      // Empty
        }

        public Builder(HyperVReplicaReplicationDetailsResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.initialReplicationDetails = defaults.initialReplicationDetails;
    	      this.instanceType = defaults.instanceType;
    	      this.lastReplicatedTime = defaults.lastReplicatedTime;
    	      this.vMDiskDetails = defaults.vMDiskDetails;
    	      this.vmId = defaults.vmId;
    	      this.vmNics = defaults.vmNics;
    	      this.vmProtectionState = defaults.vmProtectionState;
    	      this.vmProtectionStateDescription = defaults.vmProtectionStateDescription;
        }

        public Builder setInitialReplicationDetails(@Nullable InitialReplicationDetailsResponse initialReplicationDetails) {
            this.initialReplicationDetails = initialReplicationDetails;
            return this;
        }

        public Builder setInstanceType(String instanceType) {
            this.instanceType = Objects.requireNonNull(instanceType);
            return this;
        }

        public Builder setLastReplicatedTime(@Nullable String lastReplicatedTime) {
            this.lastReplicatedTime = lastReplicatedTime;
            return this;
        }

        public Builder setVMDiskDetails(@Nullable List<DiskDetailsResponse> vMDiskDetails) {
            this.vMDiskDetails = vMDiskDetails;
            return this;
        }

        public Builder setVmId(@Nullable String vmId) {
            this.vmId = vmId;
            return this;
        }

        public Builder setVmNics(@Nullable List<VMNicDetailsResponse> vmNics) {
            this.vmNics = vmNics;
            return this;
        }

        public Builder setVmProtectionState(@Nullable String vmProtectionState) {
            this.vmProtectionState = vmProtectionState;
            return this;
        }

        public Builder setVmProtectionStateDescription(@Nullable String vmProtectionStateDescription) {
            this.vmProtectionStateDescription = vmProtectionStateDescription;
            return this;
        }
        public HyperVReplicaReplicationDetailsResponse build() {
            return new HyperVReplicaReplicationDetailsResponse(initialReplicationDetails, instanceType, lastReplicatedTime, vMDiskDetails, vmId, vmNics, vmProtectionState, vmProtectionStateDescription);
        }
    }
}
