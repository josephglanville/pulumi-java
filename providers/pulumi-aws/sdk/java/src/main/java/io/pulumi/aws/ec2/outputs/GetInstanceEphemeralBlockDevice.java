// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.ec2.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class GetInstanceEphemeralBlockDevice {
    /**
     * The physical name of the device.
     * 
     */
    private final String deviceName;
    /**
     * Whether the specified device included in the device mapping was suppressed or not (Boolean).
     * 
     */
    private final @Nullable Boolean noDevice;
    /**
     * The virtual device name.
     * 
     */
    private final @Nullable String virtualName;

    @OutputCustomType.Constructor
    private GetInstanceEphemeralBlockDevice(
        @OutputCustomType.Parameter("deviceName") String deviceName,
        @OutputCustomType.Parameter("noDevice") @Nullable Boolean noDevice,
        @OutputCustomType.Parameter("virtualName") @Nullable String virtualName) {
        this.deviceName = deviceName;
        this.noDevice = noDevice;
        this.virtualName = virtualName;
    }

    /**
     * The physical name of the device.
     * 
    */
    public String getDeviceName() {
        return this.deviceName;
    }
    /**
     * Whether the specified device included in the device mapping was suppressed or not (Boolean).
     * 
    */
    public Optional<Boolean> getNoDevice() {
        return Optional.ofNullable(this.noDevice);
    }
    /**
     * The virtual device name.
     * 
    */
    public Optional<String> getVirtualName() {
        return Optional.ofNullable(this.virtualName);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetInstanceEphemeralBlockDevice defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String deviceName;
        private @Nullable Boolean noDevice;
        private @Nullable String virtualName;

        public Builder() {
    	      // Empty
        }

        public Builder(GetInstanceEphemeralBlockDevice defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.deviceName = defaults.deviceName;
    	      this.noDevice = defaults.noDevice;
    	      this.virtualName = defaults.virtualName;
        }

        public Builder setDeviceName(String deviceName) {
            this.deviceName = Objects.requireNonNull(deviceName);
            return this;
        }

        public Builder setNoDevice(@Nullable Boolean noDevice) {
            this.noDevice = noDevice;
            return this;
        }

        public Builder setVirtualName(@Nullable String virtualName) {
            this.virtualName = virtualName;
            return this;
        }
        public GetInstanceEphemeralBlockDevice build() {
            return new GetInstanceEphemeralBlockDevice(deviceName, noDevice, virtualName);
        }
    }
}
