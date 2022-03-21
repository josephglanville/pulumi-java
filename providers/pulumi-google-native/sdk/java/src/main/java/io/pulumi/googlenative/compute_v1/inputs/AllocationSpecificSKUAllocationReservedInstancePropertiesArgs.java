// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.compute_v1.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.googlenative.compute_v1.inputs.AcceleratorConfigArgs;
import io.pulumi.googlenative.compute_v1.inputs.AllocationSpecificSKUAllocationAllocatedInstancePropertiesReservedDiskArgs;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * Properties of the SKU instances being reserved. Next ID: 9
 * 
 */
public final class AllocationSpecificSKUAllocationReservedInstancePropertiesArgs extends io.pulumi.resources.ResourceArgs {

    public static final AllocationSpecificSKUAllocationReservedInstancePropertiesArgs Empty = new AllocationSpecificSKUAllocationReservedInstancePropertiesArgs();

    /**
     * Specifies accelerator type and count.
     * 
     */
    @Import(name="guestAccelerators")
      private final @Nullable Output<List<AcceleratorConfigArgs>> guestAccelerators;

    public Output<List<AcceleratorConfigArgs>> getGuestAccelerators() {
        return this.guestAccelerators == null ? Output.empty() : this.guestAccelerators;
    }

    /**
     * Specifies amount of local ssd to reserve with each instance. The type of disk is local-ssd.
     * 
     */
    @Import(name="localSsds")
      private final @Nullable Output<List<AllocationSpecificSKUAllocationAllocatedInstancePropertiesReservedDiskArgs>> localSsds;

    public Output<List<AllocationSpecificSKUAllocationAllocatedInstancePropertiesReservedDiskArgs>> getLocalSsds() {
        return this.localSsds == null ? Output.empty() : this.localSsds;
    }

    /**
     * An opaque location hint used to place the allocation close to other resources. This field is for use by internal tools that use the public API.
     * 
     */
    @Import(name="locationHint")
      private final @Nullable Output<String> locationHint;

    public Output<String> getLocationHint() {
        return this.locationHint == null ? Output.empty() : this.locationHint;
    }

    /**
     * Specifies type of machine (name only) which has fixed number of vCPUs and fixed amount of memory. This also includes specifying custom machine type following custom-NUMBER_OF_CPUS-AMOUNT_OF_MEMORY pattern.
     * 
     */
    @Import(name="machineType")
      private final @Nullable Output<String> machineType;

    public Output<String> getMachineType() {
        return this.machineType == null ? Output.empty() : this.machineType;
    }

    /**
     * Minimum cpu platform the reservation.
     * 
     */
    @Import(name="minCpuPlatform")
      private final @Nullable Output<String> minCpuPlatform;

    public Output<String> getMinCpuPlatform() {
        return this.minCpuPlatform == null ? Output.empty() : this.minCpuPlatform;
    }

    public AllocationSpecificSKUAllocationReservedInstancePropertiesArgs(
        @Nullable Output<List<AcceleratorConfigArgs>> guestAccelerators,
        @Nullable Output<List<AllocationSpecificSKUAllocationAllocatedInstancePropertiesReservedDiskArgs>> localSsds,
        @Nullable Output<String> locationHint,
        @Nullable Output<String> machineType,
        @Nullable Output<String> minCpuPlatform) {
        this.guestAccelerators = guestAccelerators;
        this.localSsds = localSsds;
        this.locationHint = locationHint;
        this.machineType = machineType;
        this.minCpuPlatform = minCpuPlatform;
    }

    private AllocationSpecificSKUAllocationReservedInstancePropertiesArgs() {
        this.guestAccelerators = Output.empty();
        this.localSsds = Output.empty();
        this.locationHint = Output.empty();
        this.machineType = Output.empty();
        this.minCpuPlatform = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(AllocationSpecificSKUAllocationReservedInstancePropertiesArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<List<AcceleratorConfigArgs>> guestAccelerators;
        private @Nullable Output<List<AllocationSpecificSKUAllocationAllocatedInstancePropertiesReservedDiskArgs>> localSsds;
        private @Nullable Output<String> locationHint;
        private @Nullable Output<String> machineType;
        private @Nullable Output<String> minCpuPlatform;

        public Builder() {
    	      // Empty
        }

        public Builder(AllocationSpecificSKUAllocationReservedInstancePropertiesArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.guestAccelerators = defaults.guestAccelerators;
    	      this.localSsds = defaults.localSsds;
    	      this.locationHint = defaults.locationHint;
    	      this.machineType = defaults.machineType;
    	      this.minCpuPlatform = defaults.minCpuPlatform;
        }

        public Builder guestAccelerators(@Nullable Output<List<AcceleratorConfigArgs>> guestAccelerators) {
            this.guestAccelerators = guestAccelerators;
            return this;
        }
        public Builder guestAccelerators(@Nullable List<AcceleratorConfigArgs> guestAccelerators) {
            this.guestAccelerators = Output.ofNullable(guestAccelerators);
            return this;
        }
        public Builder guestAccelerators(AcceleratorConfigArgs... guestAccelerators) {
            return guestAccelerators(List.of(guestAccelerators));
        }
        public Builder localSsds(@Nullable Output<List<AllocationSpecificSKUAllocationAllocatedInstancePropertiesReservedDiskArgs>> localSsds) {
            this.localSsds = localSsds;
            return this;
        }
        public Builder localSsds(@Nullable List<AllocationSpecificSKUAllocationAllocatedInstancePropertiesReservedDiskArgs> localSsds) {
            this.localSsds = Output.ofNullable(localSsds);
            return this;
        }
        public Builder localSsds(AllocationSpecificSKUAllocationAllocatedInstancePropertiesReservedDiskArgs... localSsds) {
            return localSsds(List.of(localSsds));
        }
        public Builder locationHint(@Nullable Output<String> locationHint) {
            this.locationHint = locationHint;
            return this;
        }
        public Builder locationHint(@Nullable String locationHint) {
            this.locationHint = Output.ofNullable(locationHint);
            return this;
        }
        public Builder machineType(@Nullable Output<String> machineType) {
            this.machineType = machineType;
            return this;
        }
        public Builder machineType(@Nullable String machineType) {
            this.machineType = Output.ofNullable(machineType);
            return this;
        }
        public Builder minCpuPlatform(@Nullable Output<String> minCpuPlatform) {
            this.minCpuPlatform = minCpuPlatform;
            return this;
        }
        public Builder minCpuPlatform(@Nullable String minCpuPlatform) {
            this.minCpuPlatform = Output.ofNullable(minCpuPlatform);
            return this;
        }        public AllocationSpecificSKUAllocationReservedInstancePropertiesArgs build() {
            return new AllocationSpecificSKUAllocationReservedInstancePropertiesArgs(guestAccelerators, localSsds, locationHint, machineType, minCpuPlatform);
        }
    }
}
