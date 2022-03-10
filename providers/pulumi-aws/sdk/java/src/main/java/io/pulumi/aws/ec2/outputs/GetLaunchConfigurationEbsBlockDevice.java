// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.ec2.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;

@OutputCustomType
public final class GetLaunchConfigurationEbsBlockDevice {
    /**
     * Whether the EBS Volume will be deleted on instance termination.
     * 
     */
    private final Boolean deleteOnTermination;
    /**
     * The Name of the device.
     * 
     */
    private final String deviceName;
    /**
     * Whether the volume is Encrypted.
     * 
     */
    private final Boolean encrypted;
    /**
     * The provisioned IOPs of the volume.
     * 
     */
    private final Integer iops;
    /**
     * Whether the device in the block device mapping of the AMI is suppressed.
     * 
     */
    private final Boolean noDevice;
    /**
     * The Snapshot ID of the mount.
     * 
     */
    private final String snapshotId;
    /**
     * The Throughput of the volume.
     * 
     */
    private final Boolean throughput;
    /**
     * The Size of the volume.
     * 
     */
    private final Integer volumeSize;
    /**
     * The Type of the volume.
     * 
     */
    private final String volumeType;

    @OutputCustomType.Constructor
    private GetLaunchConfigurationEbsBlockDevice(
        @OutputCustomType.Parameter("deleteOnTermination") Boolean deleteOnTermination,
        @OutputCustomType.Parameter("deviceName") String deviceName,
        @OutputCustomType.Parameter("encrypted") Boolean encrypted,
        @OutputCustomType.Parameter("iops") Integer iops,
        @OutputCustomType.Parameter("noDevice") Boolean noDevice,
        @OutputCustomType.Parameter("snapshotId") String snapshotId,
        @OutputCustomType.Parameter("throughput") Boolean throughput,
        @OutputCustomType.Parameter("volumeSize") Integer volumeSize,
        @OutputCustomType.Parameter("volumeType") String volumeType) {
        this.deleteOnTermination = deleteOnTermination;
        this.deviceName = deviceName;
        this.encrypted = encrypted;
        this.iops = iops;
        this.noDevice = noDevice;
        this.snapshotId = snapshotId;
        this.throughput = throughput;
        this.volumeSize = volumeSize;
        this.volumeType = volumeType;
    }

    /**
     * Whether the EBS Volume will be deleted on instance termination.
     * 
    */
    public Boolean getDeleteOnTermination() {
        return this.deleteOnTermination;
    }
    /**
     * The Name of the device.
     * 
    */
    public String getDeviceName() {
        return this.deviceName;
    }
    /**
     * Whether the volume is Encrypted.
     * 
    */
    public Boolean getEncrypted() {
        return this.encrypted;
    }
    /**
     * The provisioned IOPs of the volume.
     * 
    */
    public Integer getIops() {
        return this.iops;
    }
    /**
     * Whether the device in the block device mapping of the AMI is suppressed.
     * 
    */
    public Boolean getNoDevice() {
        return this.noDevice;
    }
    /**
     * The Snapshot ID of the mount.
     * 
    */
    public String getSnapshotId() {
        return this.snapshotId;
    }
    /**
     * The Throughput of the volume.
     * 
    */
    public Boolean getThroughput() {
        return this.throughput;
    }
    /**
     * The Size of the volume.
     * 
    */
    public Integer getVolumeSize() {
        return this.volumeSize;
    }
    /**
     * The Type of the volume.
     * 
    */
    public String getVolumeType() {
        return this.volumeType;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetLaunchConfigurationEbsBlockDevice defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Boolean deleteOnTermination;
        private String deviceName;
        private Boolean encrypted;
        private Integer iops;
        private Boolean noDevice;
        private String snapshotId;
        private Boolean throughput;
        private Integer volumeSize;
        private String volumeType;

        public Builder() {
    	      // Empty
        }

        public Builder(GetLaunchConfigurationEbsBlockDevice defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.deleteOnTermination = defaults.deleteOnTermination;
    	      this.deviceName = defaults.deviceName;
    	      this.encrypted = defaults.encrypted;
    	      this.iops = defaults.iops;
    	      this.noDevice = defaults.noDevice;
    	      this.snapshotId = defaults.snapshotId;
    	      this.throughput = defaults.throughput;
    	      this.volumeSize = defaults.volumeSize;
    	      this.volumeType = defaults.volumeType;
        }

        public Builder setDeleteOnTermination(Boolean deleteOnTermination) {
            this.deleteOnTermination = Objects.requireNonNull(deleteOnTermination);
            return this;
        }

        public Builder setDeviceName(String deviceName) {
            this.deviceName = Objects.requireNonNull(deviceName);
            return this;
        }

        public Builder setEncrypted(Boolean encrypted) {
            this.encrypted = Objects.requireNonNull(encrypted);
            return this;
        }

        public Builder setIops(Integer iops) {
            this.iops = Objects.requireNonNull(iops);
            return this;
        }

        public Builder setNoDevice(Boolean noDevice) {
            this.noDevice = Objects.requireNonNull(noDevice);
            return this;
        }

        public Builder setSnapshotId(String snapshotId) {
            this.snapshotId = Objects.requireNonNull(snapshotId);
            return this;
        }

        public Builder setThroughput(Boolean throughput) {
            this.throughput = Objects.requireNonNull(throughput);
            return this;
        }

        public Builder setVolumeSize(Integer volumeSize) {
            this.volumeSize = Objects.requireNonNull(volumeSize);
            return this;
        }

        public Builder setVolumeType(String volumeType) {
            this.volumeType = Objects.requireNonNull(volumeType);
            return this;
        }
        public GetLaunchConfigurationEbsBlockDevice build() {
            return new GetLaunchConfigurationEbsBlockDevice(deleteOnTermination, deviceName, encrypted, iops, noDevice, snapshotId, throughput, volumeSize, volumeType);
        }
    }
}
