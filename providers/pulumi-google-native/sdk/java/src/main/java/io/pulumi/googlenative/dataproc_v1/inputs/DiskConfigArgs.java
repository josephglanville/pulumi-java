// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.dataproc_v1.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * Specifies the config of disk options for a group of VM instances.
 * 
 */
public final class DiskConfigArgs extends io.pulumi.resources.ResourceArgs {

    public static final DiskConfigArgs Empty = new DiskConfigArgs();

    /**
     * Optional. Size in GB of the boot disk (default is 500GB).
     * 
     */
    @Import(name="bootDiskSizeGb")
      private final @Nullable Output<Integer> bootDiskSizeGb;

    public Output<Integer> getBootDiskSizeGb() {
        return this.bootDiskSizeGb == null ? Codegen.empty() : this.bootDiskSizeGb;
    }

    /**
     * Optional. Type of the boot disk (default is "pd-standard"). Valid values: "pd-balanced" (Persistent Disk Balanced Solid State Drive), "pd-ssd" (Persistent Disk Solid State Drive), or "pd-standard" (Persistent Disk Hard Disk Drive). See Disk types (https://cloud.google.com/compute/docs/disks#disk-types).
     * 
     */
    @Import(name="bootDiskType")
      private final @Nullable Output<String> bootDiskType;

    public Output<String> getBootDiskType() {
        return this.bootDiskType == null ? Codegen.empty() : this.bootDiskType;
    }

    /**
     * Optional. Interface type of local SSDs (default is "scsi"). Valid values: "scsi" (Small Computer System Interface), "nvme" (Non-Volatile Memory Express). See local SSD performance (https://cloud.google.com/compute/docs/disks/local-ssd#performance).
     * 
     */
    @Import(name="localSsdInterface")
      private final @Nullable Output<String> localSsdInterface;

    public Output<String> getLocalSsdInterface() {
        return this.localSsdInterface == null ? Codegen.empty() : this.localSsdInterface;
    }

    /**
     * Optional. Number of attached SSDs, from 0 to 4 (default is 0). If SSDs are not attached, the boot disk is used to store runtime logs and HDFS (https://hadoop.apache.org/docs/r1.2.1/hdfs_user_guide.html) data. If one or more SSDs are attached, this runtime bulk data is spread across them, and the boot disk contains only basic config and installed binaries.
     * 
     */
    @Import(name="numLocalSsds")
      private final @Nullable Output<Integer> numLocalSsds;

    public Output<Integer> getNumLocalSsds() {
        return this.numLocalSsds == null ? Codegen.empty() : this.numLocalSsds;
    }

    public DiskConfigArgs(
        @Nullable Output<Integer> bootDiskSizeGb,
        @Nullable Output<String> bootDiskType,
        @Nullable Output<String> localSsdInterface,
        @Nullable Output<Integer> numLocalSsds) {
        this.bootDiskSizeGb = bootDiskSizeGb;
        this.bootDiskType = bootDiskType;
        this.localSsdInterface = localSsdInterface;
        this.numLocalSsds = numLocalSsds;
    }

    private DiskConfigArgs() {
        this.bootDiskSizeGb = Codegen.empty();
        this.bootDiskType = Codegen.empty();
        this.localSsdInterface = Codegen.empty();
        this.numLocalSsds = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(DiskConfigArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<Integer> bootDiskSizeGb;
        private @Nullable Output<String> bootDiskType;
        private @Nullable Output<String> localSsdInterface;
        private @Nullable Output<Integer> numLocalSsds;

        public Builder() {
    	      // Empty
        }

        public Builder(DiskConfigArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.bootDiskSizeGb = defaults.bootDiskSizeGb;
    	      this.bootDiskType = defaults.bootDiskType;
    	      this.localSsdInterface = defaults.localSsdInterface;
    	      this.numLocalSsds = defaults.numLocalSsds;
        }

        public Builder bootDiskSizeGb(@Nullable Output<Integer> bootDiskSizeGb) {
            this.bootDiskSizeGb = bootDiskSizeGb;
            return this;
        }
        public Builder bootDiskSizeGb(@Nullable Integer bootDiskSizeGb) {
            this.bootDiskSizeGb = Codegen.ofNullable(bootDiskSizeGb);
            return this;
        }
        public Builder bootDiskType(@Nullable Output<String> bootDiskType) {
            this.bootDiskType = bootDiskType;
            return this;
        }
        public Builder bootDiskType(@Nullable String bootDiskType) {
            this.bootDiskType = Codegen.ofNullable(bootDiskType);
            return this;
        }
        public Builder localSsdInterface(@Nullable Output<String> localSsdInterface) {
            this.localSsdInterface = localSsdInterface;
            return this;
        }
        public Builder localSsdInterface(@Nullable String localSsdInterface) {
            this.localSsdInterface = Codegen.ofNullable(localSsdInterface);
            return this;
        }
        public Builder numLocalSsds(@Nullable Output<Integer> numLocalSsds) {
            this.numLocalSsds = numLocalSsds;
            return this;
        }
        public Builder numLocalSsds(@Nullable Integer numLocalSsds) {
            this.numLocalSsds = Codegen.ofNullable(numLocalSsds);
            return this;
        }        public DiskConfigArgs build() {
            return new DiskConfigArgs(bootDiskSizeGb, bootDiskType, localSsdInterface, numLocalSsds);
        }
    }
}
