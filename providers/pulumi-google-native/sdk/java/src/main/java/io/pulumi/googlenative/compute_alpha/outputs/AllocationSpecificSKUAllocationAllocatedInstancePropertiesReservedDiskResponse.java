// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.compute_alpha.outputs;

import io.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class AllocationSpecificSKUAllocationAllocatedInstancePropertiesReservedDiskResponse {
    /**
     * Specifies the size of the disk in base-2 GB.
     * 
     */
    private final String diskSizeGb;
    /**
     * Specifies the disk interface to use for attaching this disk, which is either SCSI or NVME. The default is SCSI. For performance characteristics of SCSI over NVMe, see Local SSD performance.
     * 
     */
    private final String $interface;

    @CustomType.Constructor
    private AllocationSpecificSKUAllocationAllocatedInstancePropertiesReservedDiskResponse(
        @CustomType.Parameter("diskSizeGb") String diskSizeGb,
        @CustomType.Parameter("interface") String $interface) {
        this.diskSizeGb = diskSizeGb;
        this.$interface = $interface;
    }

    /**
     * Specifies the size of the disk in base-2 GB.
     * 
    */
    public String getDiskSizeGb() {
        return this.diskSizeGb;
    }
    /**
     * Specifies the disk interface to use for attaching this disk, which is either SCSI or NVME. The default is SCSI. For performance characteristics of SCSI over NVMe, see Local SSD performance.
     * 
    */
    public String get$interface() {
        return this.$interface;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(AllocationSpecificSKUAllocationAllocatedInstancePropertiesReservedDiskResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String diskSizeGb;
        private String $interface;

        public Builder() {
    	      // Empty
        }

        public Builder(AllocationSpecificSKUAllocationAllocatedInstancePropertiesReservedDiskResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.diskSizeGb = defaults.diskSizeGb;
    	      this.$interface = defaults.$interface;
        }

        public Builder diskSizeGb(String diskSizeGb) {
            this.diskSizeGb = Objects.requireNonNull(diskSizeGb);
            return this;
        }
        public Builder $interface(String $interface) {
            this.$interface = Objects.requireNonNull($interface);
            return this;
        }        public AllocationSpecificSKUAllocationAllocatedInstancePropertiesReservedDiskResponse build() {
            return new AllocationSpecificSKUAllocationAllocatedInstancePropertiesReservedDiskResponse(diskSizeGb, $interface);
        }
    }
}
