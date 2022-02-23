// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.dataproc.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class WorkflowTemplatePlacementManagedClusterConfigWorkerConfigDiskConfigArgs extends io.pulumi.resources.ResourceArgs {

    public static final WorkflowTemplatePlacementManagedClusterConfigWorkerConfigDiskConfigArgs Empty = new WorkflowTemplatePlacementManagedClusterConfigWorkerConfigDiskConfigArgs();

    /**
     * Optional. Size in GB of the boot disk (default is 500GB).
     * 
     */
    @InputImport(name="bootDiskSizeGb")
      private final @Nullable Input<Integer> bootDiskSizeGb;

    public Input<Integer> getBootDiskSizeGb() {
        return this.bootDiskSizeGb == null ? Input.empty() : this.bootDiskSizeGb;
    }

    /**
     * Optional. Type of the boot disk (default is "pd-standard"). Valid values: "pd-ssd" (Persistent Disk Solid State Drive) or "pd-standard" (Persistent Disk Hard Disk Drive).
     * 
     */
    @InputImport(name="bootDiskType")
      private final @Nullable Input<String> bootDiskType;

    public Input<String> getBootDiskType() {
        return this.bootDiskType == null ? Input.empty() : this.bootDiskType;
    }

    /**
     * Optional. Number of attached SSDs, from 0 to 4 (default is 0). If SSDs are not attached, the boot disk is used to store runtime logs and (https://hadoop.apache.org/docs/r1.2.1/hdfs_user_guide.html) data. If one or more SSDs are attached, this runtime bulk data is spread across them, and the boot disk contains only basic config and installed binaries.
     * 
     */
    @InputImport(name="numLocalSsds")
      private final @Nullable Input<Integer> numLocalSsds;

    public Input<Integer> getNumLocalSsds() {
        return this.numLocalSsds == null ? Input.empty() : this.numLocalSsds;
    }

    public WorkflowTemplatePlacementManagedClusterConfigWorkerConfigDiskConfigArgs(
        @Nullable Input<Integer> bootDiskSizeGb,
        @Nullable Input<String> bootDiskType,
        @Nullable Input<Integer> numLocalSsds) {
        this.bootDiskSizeGb = bootDiskSizeGb;
        this.bootDiskType = bootDiskType;
        this.numLocalSsds = numLocalSsds;
    }

    private WorkflowTemplatePlacementManagedClusterConfigWorkerConfigDiskConfigArgs() {
        this.bootDiskSizeGb = Input.empty();
        this.bootDiskType = Input.empty();
        this.numLocalSsds = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(WorkflowTemplatePlacementManagedClusterConfigWorkerConfigDiskConfigArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<Integer> bootDiskSizeGb;
        private @Nullable Input<String> bootDiskType;
        private @Nullable Input<Integer> numLocalSsds;

        public Builder() {
    	      // Empty
        }

        public Builder(WorkflowTemplatePlacementManagedClusterConfigWorkerConfigDiskConfigArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.bootDiskSizeGb = defaults.bootDiskSizeGb;
    	      this.bootDiskType = defaults.bootDiskType;
    	      this.numLocalSsds = defaults.numLocalSsds;
        }

        public Builder setBootDiskSizeGb(@Nullable Input<Integer> bootDiskSizeGb) {
            this.bootDiskSizeGb = bootDiskSizeGb;
            return this;
        }

        public Builder setBootDiskSizeGb(@Nullable Integer bootDiskSizeGb) {
            this.bootDiskSizeGb = Input.ofNullable(bootDiskSizeGb);
            return this;
        }

        public Builder setBootDiskType(@Nullable Input<String> bootDiskType) {
            this.bootDiskType = bootDiskType;
            return this;
        }

        public Builder setBootDiskType(@Nullable String bootDiskType) {
            this.bootDiskType = Input.ofNullable(bootDiskType);
            return this;
        }

        public Builder setNumLocalSsds(@Nullable Input<Integer> numLocalSsds) {
            this.numLocalSsds = numLocalSsds;
            return this;
        }

        public Builder setNumLocalSsds(@Nullable Integer numLocalSsds) {
            this.numLocalSsds = Input.ofNullable(numLocalSsds);
            return this;
        }
        public WorkflowTemplatePlacementManagedClusterConfigWorkerConfigDiskConfigArgs build() {
            return new WorkflowTemplatePlacementManagedClusterConfigWorkerConfigDiskConfigArgs(bootDiskSizeGb, bootDiskType, numLocalSsds);
        }
    }
}
