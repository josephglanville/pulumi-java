// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.ec2.outputs;

import io.pulumi.core.annotations.CustomType;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class SpotInstanceRequestEphemeralBlockDevice {
    /**
     * The name of the block device to mount on the instance.
     * 
     */
    private final String deviceName;
    /**
     * Suppresses the specified device included in the AMI's block device mapping.
     * 
     */
    private final @Nullable Boolean noDevice;
    /**
     * [Instance Store Device Name](https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/InstanceStorage.html#InstanceStoreDeviceNames) (e.g., `ephemeral0`).
     * 
     */
    private final @Nullable String virtualName;

    @CustomType.Constructor
    private SpotInstanceRequestEphemeralBlockDevice(
        @CustomType.Parameter("deviceName") String deviceName,
        @CustomType.Parameter("noDevice") @Nullable Boolean noDevice,
        @CustomType.Parameter("virtualName") @Nullable String virtualName) {
        this.deviceName = deviceName;
        this.noDevice = noDevice;
        this.virtualName = virtualName;
    }

    /**
     * The name of the block device to mount on the instance.
     * 
    */
    public String getDeviceName() {
        return this.deviceName;
    }
    /**
     * Suppresses the specified device included in the AMI's block device mapping.
     * 
    */
    public Optional<Boolean> getNoDevice() {
        return Optional.ofNullable(this.noDevice);
    }
    /**
     * [Instance Store Device Name](https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/InstanceStorage.html#InstanceStoreDeviceNames) (e.g., `ephemeral0`).
     * 
    */
    public Optional<String> getVirtualName() {
        return Optional.ofNullable(this.virtualName);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(SpotInstanceRequestEphemeralBlockDevice defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String deviceName;
        private @Nullable Boolean noDevice;
        private @Nullable String virtualName;

        public Builder() {
    	      // Empty
        }

        public Builder(SpotInstanceRequestEphemeralBlockDevice defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.deviceName = defaults.deviceName;
    	      this.noDevice = defaults.noDevice;
    	      this.virtualName = defaults.virtualName;
        }

        public Builder deviceName(String deviceName) {
            this.deviceName = Objects.requireNonNull(deviceName);
            return this;
        }
        public Builder noDevice(@Nullable Boolean noDevice) {
            this.noDevice = noDevice;
            return this;
        }
        public Builder virtualName(@Nullable String virtualName) {
            this.virtualName = virtualName;
            return this;
        }        public SpotInstanceRequestEphemeralBlockDevice build() {
            return new SpotInstanceRequestEphemeralBlockDevice(deviceName, noDevice, virtualName);
        }
    }
}
