// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.ec2.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class AmiFromInstanceEbsBlockDevice {
    /**
     * Boolean controlling whether the EBS volumes created to
     * support each created instance will be deleted once that instance is terminated.
     * 
     */
    private final @Nullable Boolean deleteOnTermination;
    /**
     * The path at which the device is exposed to created instances.
     * 
     */
    private final @Nullable String deviceName;
    /**
     * Boolean controlling whether the created EBS volumes will be encrypted. Can't be used with `snapshot_id`.
     * 
     */
    private final @Nullable Boolean encrypted;
    /**
     * Number of I/O operations per second the
     * created volumes will support.
     * 
     */
    private final @Nullable Integer iops;
    /**
     * The id of an EBS snapshot that will be used to initialize the created
     * EBS volumes. If set, the `volume_size` attribute must be at least as large as the referenced
     * snapshot.
     * 
     */
    private final @Nullable String snapshotId;
    /**
     * The throughput that the EBS volume supports, in MiB/s. Only valid for `volume_type` of `gp3`.
     * 
     */
    private final @Nullable Integer throughput;
    /**
     * The size of created volumes in GiB.
     * If `snapshot_id` is set and `volume_size` is omitted then the volume will have the same size
     * as the selected snapshot.
     * 
     */
    private final @Nullable Integer volumeSize;
    /**
     * The type of EBS volume to create. Can be `standard`, `gp2`, `gp3`, `io1`, `io2`, `sc1` or `st1` (Default: `standard`).
     * 
     */
    private final @Nullable String volumeType;

    @OutputCustomType.Constructor
    private AmiFromInstanceEbsBlockDevice(
        @OutputCustomType.Parameter("deleteOnTermination") @Nullable Boolean deleteOnTermination,
        @OutputCustomType.Parameter("deviceName") @Nullable String deviceName,
        @OutputCustomType.Parameter("encrypted") @Nullable Boolean encrypted,
        @OutputCustomType.Parameter("iops") @Nullable Integer iops,
        @OutputCustomType.Parameter("snapshotId") @Nullable String snapshotId,
        @OutputCustomType.Parameter("throughput") @Nullable Integer throughput,
        @OutputCustomType.Parameter("volumeSize") @Nullable Integer volumeSize,
        @OutputCustomType.Parameter("volumeType") @Nullable String volumeType) {
        this.deleteOnTermination = deleteOnTermination;
        this.deviceName = deviceName;
        this.encrypted = encrypted;
        this.iops = iops;
        this.snapshotId = snapshotId;
        this.throughput = throughput;
        this.volumeSize = volumeSize;
        this.volumeType = volumeType;
    }

    /**
     * Boolean controlling whether the EBS volumes created to
     * support each created instance will be deleted once that instance is terminated.
     * 
    */
    public Optional<Boolean> getDeleteOnTermination() {
        return Optional.ofNullable(this.deleteOnTermination);
    }
    /**
     * The path at which the device is exposed to created instances.
     * 
    */
    public Optional<String> getDeviceName() {
        return Optional.ofNullable(this.deviceName);
    }
    /**
     * Boolean controlling whether the created EBS volumes will be encrypted. Can't be used with `snapshot_id`.
     * 
    */
    public Optional<Boolean> getEncrypted() {
        return Optional.ofNullable(this.encrypted);
    }
    /**
     * Number of I/O operations per second the
     * created volumes will support.
     * 
    */
    public Optional<Integer> getIops() {
        return Optional.ofNullable(this.iops);
    }
    /**
     * The id of an EBS snapshot that will be used to initialize the created
     * EBS volumes. If set, the `volume_size` attribute must be at least as large as the referenced
     * snapshot.
     * 
    */
    public Optional<String> getSnapshotId() {
        return Optional.ofNullable(this.snapshotId);
    }
    /**
     * The throughput that the EBS volume supports, in MiB/s. Only valid for `volume_type` of `gp3`.
     * 
    */
    public Optional<Integer> getThroughput() {
        return Optional.ofNullable(this.throughput);
    }
    /**
     * The size of created volumes in GiB.
     * If `snapshot_id` is set and `volume_size` is omitted then the volume will have the same size
     * as the selected snapshot.
     * 
    */
    public Optional<Integer> getVolumeSize() {
        return Optional.ofNullable(this.volumeSize);
    }
    /**
     * The type of EBS volume to create. Can be `standard`, `gp2`, `gp3`, `io1`, `io2`, `sc1` or `st1` (Default: `standard`).
     * 
    */
    public Optional<String> getVolumeType() {
        return Optional.ofNullable(this.volumeType);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(AmiFromInstanceEbsBlockDevice defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Boolean deleteOnTermination;
        private @Nullable String deviceName;
        private @Nullable Boolean encrypted;
        private @Nullable Integer iops;
        private @Nullable String snapshotId;
        private @Nullable Integer throughput;
        private @Nullable Integer volumeSize;
        private @Nullable String volumeType;

        public Builder() {
    	      // Empty
        }

        public Builder(AmiFromInstanceEbsBlockDevice defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.deleteOnTermination = defaults.deleteOnTermination;
    	      this.deviceName = defaults.deviceName;
    	      this.encrypted = defaults.encrypted;
    	      this.iops = defaults.iops;
    	      this.snapshotId = defaults.snapshotId;
    	      this.throughput = defaults.throughput;
    	      this.volumeSize = defaults.volumeSize;
    	      this.volumeType = defaults.volumeType;
        }

        public Builder setDeleteOnTermination(@Nullable Boolean deleteOnTermination) {
            this.deleteOnTermination = deleteOnTermination;
            return this;
        }

        public Builder setDeviceName(@Nullable String deviceName) {
            this.deviceName = deviceName;
            return this;
        }

        public Builder setEncrypted(@Nullable Boolean encrypted) {
            this.encrypted = encrypted;
            return this;
        }

        public Builder setIops(@Nullable Integer iops) {
            this.iops = iops;
            return this;
        }

        public Builder setSnapshotId(@Nullable String snapshotId) {
            this.snapshotId = snapshotId;
            return this;
        }

        public Builder setThroughput(@Nullable Integer throughput) {
            this.throughput = throughput;
            return this;
        }

        public Builder setVolumeSize(@Nullable Integer volumeSize) {
            this.volumeSize = volumeSize;
            return this;
        }

        public Builder setVolumeType(@Nullable String volumeType) {
            this.volumeType = volumeType;
            return this;
        }
        public AmiFromInstanceEbsBlockDevice build() {
            return new AmiFromInstanceEbsBlockDevice(deleteOnTermination, deviceName, encrypted, iops, snapshotId, throughput, volumeSize, volumeType);
        }
    }
}
