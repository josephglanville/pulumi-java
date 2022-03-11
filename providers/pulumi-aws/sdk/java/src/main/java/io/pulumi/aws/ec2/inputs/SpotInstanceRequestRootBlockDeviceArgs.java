// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.ec2.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.InputImport;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import javax.annotation.Nullable;


public final class SpotInstanceRequestRootBlockDeviceArgs extends io.pulumi.resources.ResourceArgs {

    public static final SpotInstanceRequestRootBlockDeviceArgs Empty = new SpotInstanceRequestRootBlockDeviceArgs();

    /**
     * Whether the volume should be destroyed on instance termination. Defaults to `true`.
     * 
     */
    @InputImport(name="deleteOnTermination")
      private final @Nullable Output<Boolean> deleteOnTermination;

    public Output<Boolean> getDeleteOnTermination() {
        return this.deleteOnTermination == null ? Output.empty() : this.deleteOnTermination;
    }

    /**
     * Name of the device to mount.
     * 
     */
    @InputImport(name="deviceName")
      private final @Nullable Output<String> deviceName;

    public Output<String> getDeviceName() {
        return this.deviceName == null ? Output.empty() : this.deviceName;
    }

    /**
     * Whether to enable volume encryption. Defaults to `false`. Must be configured to perform drift detection.
     * 
     */
    @InputImport(name="encrypted")
      private final @Nullable Output<Boolean> encrypted;

    public Output<Boolean> getEncrypted() {
        return this.encrypted == null ? Output.empty() : this.encrypted;
    }

    /**
     * Amount of provisioned [IOPS](https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/ebs-io-characteristics.html). Only valid for volume_type of `io1`, `io2` or `gp3`.
     * 
     */
    @InputImport(name="iops")
      private final @Nullable Output<Integer> iops;

    public Output<Integer> getIops() {
        return this.iops == null ? Output.empty() : this.iops;
    }

    /**
     * Amazon Resource Name (ARN) of the KMS Key to use when encrypting the volume. Must be configured to perform drift detection.
     * 
     */
    @InputImport(name="kmsKeyId")
      private final @Nullable Output<String> kmsKeyId;

    public Output<String> getKmsKeyId() {
        return this.kmsKeyId == null ? Output.empty() : this.kmsKeyId;
    }

    /**
     * A map of tags to assign to the device.
     * 
     */
    @InputImport(name="tags")
      private final @Nullable Output<Map<String,String>> tags;

    public Output<Map<String,String>> getTags() {
        return this.tags == null ? Output.empty() : this.tags;
    }

    /**
     * Throughput to provision for a volume in mebibytes per second (MiB/s). This is only valid for `volume_type` of `gp3`.
     * 
     */
    @InputImport(name="throughput")
      private final @Nullable Output<Integer> throughput;

    public Output<Integer> getThroughput() {
        return this.throughput == null ? Output.empty() : this.throughput;
    }

    @InputImport(name="volumeId")
      private final @Nullable Output<String> volumeId;

    public Output<String> getVolumeId() {
        return this.volumeId == null ? Output.empty() : this.volumeId;
    }

    /**
     * Size of the volume in gibibytes (GiB).
     * 
     */
    @InputImport(name="volumeSize")
      private final @Nullable Output<Integer> volumeSize;

    public Output<Integer> getVolumeSize() {
        return this.volumeSize == null ? Output.empty() : this.volumeSize;
    }

    /**
     * Type of volume. Valid values include `standard`, `gp2`, `gp3`, `io1`, `io2`, `sc1`, or `st1`. Defaults to `gp2`.
     * 
     */
    @InputImport(name="volumeType")
      private final @Nullable Output<String> volumeType;

    public Output<String> getVolumeType() {
        return this.volumeType == null ? Output.empty() : this.volumeType;
    }

    public SpotInstanceRequestRootBlockDeviceArgs(
        @Nullable Output<Boolean> deleteOnTermination,
        @Nullable Output<String> deviceName,
        @Nullable Output<Boolean> encrypted,
        @Nullable Output<Integer> iops,
        @Nullable Output<String> kmsKeyId,
        @Nullable Output<Map<String,String>> tags,
        @Nullable Output<Integer> throughput,
        @Nullable Output<String> volumeId,
        @Nullable Output<Integer> volumeSize,
        @Nullable Output<String> volumeType) {
        this.deleteOnTermination = deleteOnTermination;
        this.deviceName = deviceName;
        this.encrypted = encrypted;
        this.iops = iops;
        this.kmsKeyId = kmsKeyId;
        this.tags = tags;
        this.throughput = throughput;
        this.volumeId = volumeId;
        this.volumeSize = volumeSize;
        this.volumeType = volumeType;
    }

    private SpotInstanceRequestRootBlockDeviceArgs() {
        this.deleteOnTermination = Output.empty();
        this.deviceName = Output.empty();
        this.encrypted = Output.empty();
        this.iops = Output.empty();
        this.kmsKeyId = Output.empty();
        this.tags = Output.empty();
        this.throughput = Output.empty();
        this.volumeId = Output.empty();
        this.volumeSize = Output.empty();
        this.volumeType = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(SpotInstanceRequestRootBlockDeviceArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<Boolean> deleteOnTermination;
        private @Nullable Output<String> deviceName;
        private @Nullable Output<Boolean> encrypted;
        private @Nullable Output<Integer> iops;
        private @Nullable Output<String> kmsKeyId;
        private @Nullable Output<Map<String,String>> tags;
        private @Nullable Output<Integer> throughput;
        private @Nullable Output<String> volumeId;
        private @Nullable Output<Integer> volumeSize;
        private @Nullable Output<String> volumeType;

        public Builder() {
    	      // Empty
        }

        public Builder(SpotInstanceRequestRootBlockDeviceArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.deleteOnTermination = defaults.deleteOnTermination;
    	      this.deviceName = defaults.deviceName;
    	      this.encrypted = defaults.encrypted;
    	      this.iops = defaults.iops;
    	      this.kmsKeyId = defaults.kmsKeyId;
    	      this.tags = defaults.tags;
    	      this.throughput = defaults.throughput;
    	      this.volumeId = defaults.volumeId;
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

        public Builder deviceName(@Nullable Output<String> deviceName) {
            this.deviceName = deviceName;
            return this;
        }

        public Builder deviceName(@Nullable String deviceName) {
            this.deviceName = Output.ofNullable(deviceName);
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

        public Builder kmsKeyId(@Nullable Output<String> kmsKeyId) {
            this.kmsKeyId = kmsKeyId;
            return this;
        }

        public Builder kmsKeyId(@Nullable String kmsKeyId) {
            this.kmsKeyId = Output.ofNullable(kmsKeyId);
            return this;
        }

        public Builder tags(@Nullable Output<Map<String,String>> tags) {
            this.tags = tags;
            return this;
        }

        public Builder tags(@Nullable Map<String,String> tags) {
            this.tags = Output.ofNullable(tags);
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

        public Builder volumeId(@Nullable Output<String> volumeId) {
            this.volumeId = volumeId;
            return this;
        }

        public Builder volumeId(@Nullable String volumeId) {
            this.volumeId = Output.ofNullable(volumeId);
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
        public SpotInstanceRequestRootBlockDeviceArgs build() {
            return new SpotInstanceRequestRootBlockDeviceArgs(deleteOnTermination, deviceName, encrypted, iops, kmsKeyId, tags, throughput, volumeId, volumeSize, volumeType);
        }
    }
}
