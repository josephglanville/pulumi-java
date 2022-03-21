// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.compute_beta.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.googlenative.compute_beta.enums.AllocationSpecificSKUAllocationAllocatedInstancePropertiesReservedDiskInterface;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class AllocationSpecificSKUAllocationAllocatedInstancePropertiesReservedDiskArgs extends io.pulumi.resources.ResourceArgs {

    public static final AllocationSpecificSKUAllocationAllocatedInstancePropertiesReservedDiskArgs Empty = new AllocationSpecificSKUAllocationAllocatedInstancePropertiesReservedDiskArgs();

    /**
     * Specifies the size of the disk in base-2 GB.
     * 
     */
    @Import(name="diskSizeGb")
      private final @Nullable Output<String> diskSizeGb;

    public Output<String> getDiskSizeGb() {
        return this.diskSizeGb == null ? Output.empty() : this.diskSizeGb;
    }

    /**
     * Specifies the disk interface to use for attaching this disk, which is either SCSI or NVME. The default is SCSI. For performance characteristics of SCSI over NVMe, see Local SSD performance.
     * 
     */
    @Import(name="interface")
      private final @Nullable Output<AllocationSpecificSKUAllocationAllocatedInstancePropertiesReservedDiskInterface> $interface;

    public Output<AllocationSpecificSKUAllocationAllocatedInstancePropertiesReservedDiskInterface> get$interface() {
        return this.$interface == null ? Output.empty() : this.$interface;
    }

    public AllocationSpecificSKUAllocationAllocatedInstancePropertiesReservedDiskArgs(
        @Nullable Output<String> diskSizeGb,
        @Nullable Output<AllocationSpecificSKUAllocationAllocatedInstancePropertiesReservedDiskInterface> $interface) {
        this.diskSizeGb = diskSizeGb;
        this.$interface = $interface;
    }

    private AllocationSpecificSKUAllocationAllocatedInstancePropertiesReservedDiskArgs() {
        this.diskSizeGb = Output.empty();
        this.$interface = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(AllocationSpecificSKUAllocationAllocatedInstancePropertiesReservedDiskArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<String> diskSizeGb;
        private @Nullable Output<AllocationSpecificSKUAllocationAllocatedInstancePropertiesReservedDiskInterface> $interface;

        public Builder() {
    	      // Empty
        }

        public Builder(AllocationSpecificSKUAllocationAllocatedInstancePropertiesReservedDiskArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.diskSizeGb = defaults.diskSizeGb;
    	      this.$interface = defaults.$interface;
        }

        public Builder diskSizeGb(@Nullable Output<String> diskSizeGb) {
            this.diskSizeGb = diskSizeGb;
            return this;
        }
        public Builder diskSizeGb(@Nullable String diskSizeGb) {
            this.diskSizeGb = Output.ofNullable(diskSizeGb);
            return this;
        }
        public Builder $interface(@Nullable Output<AllocationSpecificSKUAllocationAllocatedInstancePropertiesReservedDiskInterface> $interface) {
            this.$interface = $interface;
            return this;
        }
        public Builder $interface(@Nullable AllocationSpecificSKUAllocationAllocatedInstancePropertiesReservedDiskInterface $interface) {
            this.$interface = Output.ofNullable($interface);
            return this;
        }        public AllocationSpecificSKUAllocationAllocatedInstancePropertiesReservedDiskArgs build() {
            return new AllocationSpecificSKUAllocationAllocatedInstancePropertiesReservedDiskArgs(diskSizeGb, $interface);
        }
    }
}
