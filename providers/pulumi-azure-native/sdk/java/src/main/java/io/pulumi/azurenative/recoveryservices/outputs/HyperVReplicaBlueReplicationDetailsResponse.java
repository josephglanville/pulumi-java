// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.recoveryservices.outputs;

import io.pulumi.azurenative.recoveryservices.outputs.DiskDetailsResponse;
import io.pulumi.azurenative.recoveryservices.outputs.InitialReplicationDetailsResponse;
import io.pulumi.azurenative.recoveryservices.outputs.VMNicDetailsResponse;
import io.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class HyperVReplicaBlueReplicationDetailsResponse {
    /**
     * Initial replication details.
     * 
     */
    private final @Nullable InitialReplicationDetailsResponse initialReplicationDetails;
    /**
     * Gets the Instance type.
     * Expected value is 'HyperVReplica2012R2'.
     * 
     */
    private final String instanceType;
    /**
     * The Last replication time.
     * 
     */
    private final @Nullable String lastReplicatedTime;
    /**
     * VM disk details.
     * 
     */
    private final @Nullable List<DiskDetailsResponse> vMDiskDetails;
    /**
     * The virtual machine Id.
     * 
     */
    private final @Nullable String vmId;
    /**
     * The PE Network details.
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

    @CustomType.Constructor
    private HyperVReplicaBlueReplicationDetailsResponse(
        @CustomType.Parameter("initialReplicationDetails") @Nullable InitialReplicationDetailsResponse initialReplicationDetails,
        @CustomType.Parameter("instanceType") String instanceType,
        @CustomType.Parameter("lastReplicatedTime") @Nullable String lastReplicatedTime,
        @CustomType.Parameter("vMDiskDetails") @Nullable List<DiskDetailsResponse> vMDiskDetails,
        @CustomType.Parameter("vmId") @Nullable String vmId,
        @CustomType.Parameter("vmNics") @Nullable List<VMNicDetailsResponse> vmNics,
        @CustomType.Parameter("vmProtectionState") @Nullable String vmProtectionState,
        @CustomType.Parameter("vmProtectionStateDescription") @Nullable String vmProtectionStateDescription) {
        this.initialReplicationDetails = initialReplicationDetails;
        this.instanceType = instanceType;
        this.lastReplicatedTime = lastReplicatedTime;
        this.vMDiskDetails = vMDiskDetails;
        this.vmId = vmId;
        this.vmNics = vmNics;
        this.vmProtectionState = vmProtectionState;
        this.vmProtectionStateDescription = vmProtectionStateDescription;
    }

    /**
     * Initial replication details.
     * 
    */
    public Optional<InitialReplicationDetailsResponse> getInitialReplicationDetails() {
        return Optional.ofNullable(this.initialReplicationDetails);
    }
    /**
     * Gets the Instance type.
     * Expected value is 'HyperVReplica2012R2'.
     * 
    */
    public String getInstanceType() {
        return this.instanceType;
    }
    /**
     * The Last replication time.
     * 
    */
    public Optional<String> getLastReplicatedTime() {
        return Optional.ofNullable(this.lastReplicatedTime);
    }
    /**
     * VM disk details.
     * 
    */
    public List<DiskDetailsResponse> getVMDiskDetails() {
        return this.vMDiskDetails == null ? List.of() : this.vMDiskDetails;
    }
    /**
     * The virtual machine Id.
     * 
    */
    public Optional<String> getVmId() {
        return Optional.ofNullable(this.vmId);
    }
    /**
     * The PE Network details.
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

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(HyperVReplicaBlueReplicationDetailsResponse defaults) {
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

        public Builder(HyperVReplicaBlueReplicationDetailsResponse defaults) {
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

        public Builder initialReplicationDetails(@Nullable InitialReplicationDetailsResponse initialReplicationDetails) {
            this.initialReplicationDetails = initialReplicationDetails;
            return this;
        }
        public Builder instanceType(String instanceType) {
            this.instanceType = Objects.requireNonNull(instanceType);
            return this;
        }
        public Builder lastReplicatedTime(@Nullable String lastReplicatedTime) {
            this.lastReplicatedTime = lastReplicatedTime;
            return this;
        }
        public Builder vMDiskDetails(@Nullable List<DiskDetailsResponse> vMDiskDetails) {
            this.vMDiskDetails = vMDiskDetails;
            return this;
        }
        public Builder vMDiskDetails(DiskDetailsResponse... vMDiskDetails) {
            return vMDiskDetails(List.of(vMDiskDetails));
        }
        public Builder vmId(@Nullable String vmId) {
            this.vmId = vmId;
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
        }        public HyperVReplicaBlueReplicationDetailsResponse build() {
            return new HyperVReplicaBlueReplicationDetailsResponse(initialReplicationDetails, instanceType, lastReplicatedTime, vMDiskDetails, vmId, vmNics, vmProtectionState, vmProtectionStateDescription);
        }
    }
}
