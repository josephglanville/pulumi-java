// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.ec2.inputs;

import io.pulumi.aws.ec2.inputs.LaunchTemplateBlockDeviceMappingEbsArgs;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class LaunchTemplateBlockDeviceMappingArgs extends io.pulumi.resources.ResourceArgs {

    public static final LaunchTemplateBlockDeviceMappingArgs Empty = new LaunchTemplateBlockDeviceMappingArgs();

    /**
     * The name of the device to mount.
     * 
     */
    @Import(name="deviceName")
      private final @Nullable Output<String> deviceName;

    public Output<String> getDeviceName() {
        return this.deviceName == null ? Output.empty() : this.deviceName;
    }

    /**
     * Configure EBS volume properties.
     * 
     */
    @Import(name="ebs")
      private final @Nullable Output<LaunchTemplateBlockDeviceMappingEbsArgs> ebs;

    public Output<LaunchTemplateBlockDeviceMappingEbsArgs> getEbs() {
        return this.ebs == null ? Output.empty() : this.ebs;
    }

    /**
     * Suppresses the specified device included in the AMI's block device mapping.
     * 
     */
    @Import(name="noDevice")
      private final @Nullable Output<String> noDevice;

    public Output<String> getNoDevice() {
        return this.noDevice == null ? Output.empty() : this.noDevice;
    }

    /**
     * The [Instance Store Device
     * Name](https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/InstanceStorage.html#InstanceStoreDeviceNames)
     * (e.g., `"ephemeral0"`).
     * 
     */
    @Import(name="virtualName")
      private final @Nullable Output<String> virtualName;

    public Output<String> getVirtualName() {
        return this.virtualName == null ? Output.empty() : this.virtualName;
    }

    public LaunchTemplateBlockDeviceMappingArgs(
        @Nullable Output<String> deviceName,
        @Nullable Output<LaunchTemplateBlockDeviceMappingEbsArgs> ebs,
        @Nullable Output<String> noDevice,
        @Nullable Output<String> virtualName) {
        this.deviceName = deviceName;
        this.ebs = ebs;
        this.noDevice = noDevice;
        this.virtualName = virtualName;
    }

    private LaunchTemplateBlockDeviceMappingArgs() {
        this.deviceName = Output.empty();
        this.ebs = Output.empty();
        this.noDevice = Output.empty();
        this.virtualName = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(LaunchTemplateBlockDeviceMappingArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<String> deviceName;
        private @Nullable Output<LaunchTemplateBlockDeviceMappingEbsArgs> ebs;
        private @Nullable Output<String> noDevice;
        private @Nullable Output<String> virtualName;

        public Builder() {
    	      // Empty
        }

        public Builder(LaunchTemplateBlockDeviceMappingArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.deviceName = defaults.deviceName;
    	      this.ebs = defaults.ebs;
    	      this.noDevice = defaults.noDevice;
    	      this.virtualName = defaults.virtualName;
        }

        public Builder deviceName(@Nullable Output<String> deviceName) {
            this.deviceName = deviceName;
            return this;
        }
        public Builder deviceName(@Nullable String deviceName) {
            this.deviceName = Output.ofNullable(deviceName);
            return this;
        }
        public Builder ebs(@Nullable Output<LaunchTemplateBlockDeviceMappingEbsArgs> ebs) {
            this.ebs = ebs;
            return this;
        }
        public Builder ebs(@Nullable LaunchTemplateBlockDeviceMappingEbsArgs ebs) {
            this.ebs = Output.ofNullable(ebs);
            return this;
        }
        public Builder noDevice(@Nullable Output<String> noDevice) {
            this.noDevice = noDevice;
            return this;
        }
        public Builder noDevice(@Nullable String noDevice) {
            this.noDevice = Output.ofNullable(noDevice);
            return this;
        }
        public Builder virtualName(@Nullable Output<String> virtualName) {
            this.virtualName = virtualName;
            return this;
        }
        public Builder virtualName(@Nullable String virtualName) {
            this.virtualName = Output.ofNullable(virtualName);
            return this;
        }        public LaunchTemplateBlockDeviceMappingArgs build() {
            return new LaunchTemplateBlockDeviceMappingArgs(deviceName, ebs, noDevice, virtualName);
        }
    }
}
