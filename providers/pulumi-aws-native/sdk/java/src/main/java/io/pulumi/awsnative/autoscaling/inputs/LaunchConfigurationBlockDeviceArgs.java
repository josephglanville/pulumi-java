// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.autoscaling.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.InputImport;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * BlockDevice is a subproperty of BlockDeviceMapping that describes an Amazon EBS volume.
 * 
 */
public final class LaunchConfigurationBlockDeviceArgs extends io.pulumi.resources.ResourceArgs {

    public static final LaunchConfigurationBlockDeviceArgs Empty = new LaunchConfigurationBlockDeviceArgs();

    /**
     * Indicates whether the volume is deleted on instance termination.
     * 
     */
    @InputImport(name="deleteOnTermination")
      private final @Nullable Output<Boolean> deleteOnTermination;

    public Output<Boolean> getDeleteOnTermination() {
        return this.deleteOnTermination == null ? Output.empty() : this.deleteOnTermination;
    }

    /**
     * Specifies whether the volume should be encrypted.
     * 
     */
    @InputImport(name="encrypted")
      private final @Nullable Output<Boolean> encrypted;

    public Output<Boolean> getEncrypted() {
        return this.encrypted == null ? Output.empty() : this.encrypted;
    }

    /**
     * The number of input/output (I/O) operations per second (IOPS) to provision for the volume.
     * 
     */
    @InputImport(name="iops")
      private final @Nullable Output<Integer> iops;

    public Output<Integer> getIops() {
        return this.iops == null ? Output.empty() : this.iops;
    }

    /**
     * The snapshot ID of the volume to use.
     * 
     */
    @InputImport(name="snapshotId")
      private final @Nullable Output<String> snapshotId;

    public Output<String> getSnapshotId() {
        return this.snapshotId == null ? Output.empty() : this.snapshotId;
    }

    /**
     * The throughput (MiBps) to provision for a gp3 volume.
     * 
     */
    @InputImport(name="throughput")
      private final @Nullable Output<Integer> throughput;

    public Output<Integer> getThroughput() {
        return this.throughput == null ? Output.empty() : this.throughput;
    }

    /**
     * The volume size, in GiBs.
     * 
     */
    @InputImport(name="volumeSize")
      private final @Nullable Output<Integer> volumeSize;

    public Output<Integer> getVolumeSize() {
        return this.volumeSize == null ? Output.empty() : this.volumeSize;
    }

    /**
     * The volume type.
     * 
     */
    @InputImport(name="volumeType")
      private final @Nullable Output<String> volumeType;

    public Output<String> getVolumeType() {
        return this.volumeType == null ? Output.empty() : this.volumeType;
    }

    public LaunchConfigurationBlockDeviceArgs(
        @Nullable Output<Boolean> deleteOnTermination,
        @Nullable Output<Boolean> encrypted,
        @Nullable Output<Integer> iops,
        @Nullable Output<String> snapshotId,
        @Nullable Output<Integer> throughput,
        @Nullable Output<Integer> volumeSize,
        @Nullable Output<String> volumeType) {
        this.deleteOnTermination = deleteOnTermination;
        this.encrypted = encrypted;
        this.iops = iops;
        this.snapshotId = snapshotId;
        this.throughput = throughput;
        this.volumeSize = volumeSize;
        this.volumeType = volumeType;
    }

    private LaunchConfigurationBlockDeviceArgs() {
        this.deleteOnTermination = Output.empty();
        this.encrypted = Output.empty();
        this.iops = Output.empty();
        this.snapshotId = Output.empty();
        this.throughput = Output.empty();
        this.volumeSize = Output.empty();
        this.volumeType = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(LaunchConfigurationBlockDeviceArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<Boolean> deleteOnTermination;
        private @Nullable Output<Boolean> encrypted;
        private @Nullable Output<Integer> iops;
        private @Nullable Output<String> snapshotId;
        private @Nullable Output<Integer> throughput;
        private @Nullable Output<Integer> volumeSize;
        private @Nullable Output<String> volumeType;

        public Builder() {
    	      // Empty
        }

        public Builder(LaunchConfigurationBlockDeviceArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.deleteOnTermination = defaults.deleteOnTermination;
    	      this.encrypted = defaults.encrypted;
    	      this.iops = defaults.iops;
    	      this.snapshotId = defaults.snapshotId;
    	      this.throughput = defaults.throughput;
    	      this.volumeSize = defaults.volumeSize;
    	      this.volumeType = defaults.volumeType;
        }

        public Builder deleteOnTermination(@Nullable Output<Boolean> deleteOnTermination) {
            this.deleteOnTermination = deleteOnTermination;
            return this;
        }

        public Builder deleteOnTermination(@Nullable Boolean deleteOnTermination) {
            this.deleteOnTermination = Output.ofNullable(deleteOnTermination);
            return this;
        }

        public Builder encrypted(@Nullable Output<Boolean> encrypted) {
            this.encrypted = encrypted;
            return this;
        }

        public Builder encrypted(@Nullable Boolean encrypted) {
            this.encrypted = Output.ofNullable(encrypted);
            return this;
        }

        public Builder iops(@Nullable Output<Integer> iops) {
            this.iops = iops;
            return this;
        }

        public Builder iops(@Nullable Integer iops) {
            this.iops = Output.ofNullable(iops);
            return this;
        }

        public Builder snapshotId(@Nullable Output<String> snapshotId) {
            this.snapshotId = snapshotId;
            return this;
        }

        public Builder snapshotId(@Nullable String snapshotId) {
            this.snapshotId = Output.ofNullable(snapshotId);
            return this;
        }

        public Builder throughput(@Nullable Output<Integer> throughput) {
            this.throughput = throughput;
            return this;
        }

        public Builder throughput(@Nullable Integer throughput) {
            this.throughput = Output.ofNullable(throughput);
            return this;
        }

        public Builder volumeSize(@Nullable Output<Integer> volumeSize) {
            this.volumeSize = volumeSize;
            return this;
        }

        public Builder volumeSize(@Nullable Integer volumeSize) {
            this.volumeSize = Output.ofNullable(volumeSize);
            return this;
        }

        public Builder volumeType(@Nullable Output<String> volumeType) {
            this.volumeType = volumeType;
            return this;
        }

        public Builder volumeType(@Nullable String volumeType) {
            this.volumeType = Output.ofNullable(volumeType);
            return this;
        }
        public LaunchConfigurationBlockDeviceArgs build() {
            return new LaunchConfigurationBlockDeviceArgs(deleteOnTermination, encrypted, iops, snapshotId, throughput, volumeSize, volumeType);
        }
    }
}
