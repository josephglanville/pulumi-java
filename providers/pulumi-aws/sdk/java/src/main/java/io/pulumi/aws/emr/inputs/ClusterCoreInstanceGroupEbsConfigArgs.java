// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.emr.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class ClusterCoreInstanceGroupEbsConfigArgs extends io.pulumi.resources.ResourceArgs {

    public static final ClusterCoreInstanceGroupEbsConfigArgs Empty = new ClusterCoreInstanceGroupEbsConfigArgs();

    /**
     * Number of I/O operations per second (IOPS) that the volume supports.
     * 
     */
    @Import(name="iops")
      private final @Nullable Output<Integer> iops;

    public Output<Integer> getIops() {
        return this.iops == null ? Output.empty() : this.iops;
    }

    /**
     * Volume size, in gibibytes (GiB).
     * 
     */
    @Import(name="size", required=true)
      private final Output<Integer> size;

    public Output<Integer> getSize() {
        return this.size;
    }

    /**
     * Volume type. Valid options are `gp2`, `io1`, `standard` and `st1`. See [EBS Volume Types](https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/EBSVolumeTypes.html).
     * 
     */
    @Import(name="type", required=true)
      private final Output<String> type;

    public Output<String> getType() {
        return this.type;
    }

    /**
     * Number of EBS volumes with this configuration to attach to each EC2 instance in the instance group (default is 1).
     * 
     */
    @Import(name="volumesPerInstance")
      private final @Nullable Output<Integer> volumesPerInstance;

    public Output<Integer> getVolumesPerInstance() {
        return this.volumesPerInstance == null ? Output.empty() : this.volumesPerInstance;
    }

    public ClusterCoreInstanceGroupEbsConfigArgs(
        @Nullable Output<Integer> iops,
        Output<Integer> size,
        Output<String> type,
        @Nullable Output<Integer> volumesPerInstance) {
        this.iops = iops;
        this.size = Objects.requireNonNull(size, "expected parameter 'size' to be non-null");
        this.type = Objects.requireNonNull(type, "expected parameter 'type' to be non-null");
        this.volumesPerInstance = volumesPerInstance;
    }

    private ClusterCoreInstanceGroupEbsConfigArgs() {
        this.iops = Output.empty();
        this.size = Output.empty();
        this.type = Output.empty();
        this.volumesPerInstance = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ClusterCoreInstanceGroupEbsConfigArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<Integer> iops;
        private Output<Integer> size;
        private Output<String> type;
        private @Nullable Output<Integer> volumesPerInstance;

        public Builder() {
    	      // Empty
        }

        public Builder(ClusterCoreInstanceGroupEbsConfigArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.iops = defaults.iops;
    	      this.size = defaults.size;
    	      this.type = defaults.type;
    	      this.volumesPerInstance = defaults.volumesPerInstance;
        }

        public Builder iops(@Nullable Output<Integer> iops) {
            this.iops = iops;
            return this;
        }
        public Builder iops(@Nullable Integer iops) {
            this.iops = Output.ofNullable(iops);
            return this;
        }
        public Builder size(Output<Integer> size) {
            this.size = Objects.requireNonNull(size);
            return this;
        }
        public Builder size(Integer size) {
            this.size = Output.of(Objects.requireNonNull(size));
            return this;
        }
        public Builder type(Output<String> type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }
        public Builder type(String type) {
            this.type = Output.of(Objects.requireNonNull(type));
            return this;
        }
        public Builder volumesPerInstance(@Nullable Output<Integer> volumesPerInstance) {
            this.volumesPerInstance = volumesPerInstance;
            return this;
        }
        public Builder volumesPerInstance(@Nullable Integer volumesPerInstance) {
            this.volumesPerInstance = Output.ofNullable(volumesPerInstance);
            return this;
        }        public ClusterCoreInstanceGroupEbsConfigArgs build() {
            return new ClusterCoreInstanceGroupEbsConfigArgs(iops, size, type, volumesPerInstance);
        }
    }
}
