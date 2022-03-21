// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.emr.outputs;

import io.pulumi.core.annotations.CustomType;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class ClusterCoreInstanceGroupEbsConfig {
    /**
     * Number of I/O operations per second (IOPS) that the volume supports.
     * 
     */
    private final @Nullable Integer iops;
    /**
     * Volume size, in gibibytes (GiB).
     * 
     */
    private final Integer size;
    /**
     * Volume type. Valid options are `gp2`, `io1`, `standard` and `st1`. See [EBS Volume Types](https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/EBSVolumeTypes.html).
     * 
     */
    private final String type;
    /**
     * Number of EBS volumes with this configuration to attach to each EC2 instance in the instance group (default is 1).
     * 
     */
    private final @Nullable Integer volumesPerInstance;

    @CustomType.Constructor
    private ClusterCoreInstanceGroupEbsConfig(
        @CustomType.Parameter("iops") @Nullable Integer iops,
        @CustomType.Parameter("size") Integer size,
        @CustomType.Parameter("type") String type,
        @CustomType.Parameter("volumesPerInstance") @Nullable Integer volumesPerInstance) {
        this.iops = iops;
        this.size = size;
        this.type = type;
        this.volumesPerInstance = volumesPerInstance;
    }

    /**
     * Number of I/O operations per second (IOPS) that the volume supports.
     * 
    */
    public Optional<Integer> getIops() {
        return Optional.ofNullable(this.iops);
    }
    /**
     * Volume size, in gibibytes (GiB).
     * 
    */
    public Integer getSize() {
        return this.size;
    }
    /**
     * Volume type. Valid options are `gp2`, `io1`, `standard` and `st1`. See [EBS Volume Types](https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/EBSVolumeTypes.html).
     * 
    */
    public String getType() {
        return this.type;
    }
    /**
     * Number of EBS volumes with this configuration to attach to each EC2 instance in the instance group (default is 1).
     * 
    */
    public Optional<Integer> getVolumesPerInstance() {
        return Optional.ofNullable(this.volumesPerInstance);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ClusterCoreInstanceGroupEbsConfig defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Integer iops;
        private Integer size;
        private String type;
        private @Nullable Integer volumesPerInstance;

        public Builder() {
    	      // Empty
        }

        public Builder(ClusterCoreInstanceGroupEbsConfig defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.iops = defaults.iops;
    	      this.size = defaults.size;
    	      this.type = defaults.type;
    	      this.volumesPerInstance = defaults.volumesPerInstance;
        }

        public Builder iops(@Nullable Integer iops) {
            this.iops = iops;
            return this;
        }
        public Builder size(Integer size) {
            this.size = Objects.requireNonNull(size);
            return this;
        }
        public Builder type(String type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }
        public Builder volumesPerInstance(@Nullable Integer volumesPerInstance) {
            this.volumesPerInstance = volumesPerInstance;
            return this;
        }        public ClusterCoreInstanceGroupEbsConfig build() {
            return new ClusterCoreInstanceGroupEbsConfig(iops, size, type, volumesPerInstance);
        }
    }
}
