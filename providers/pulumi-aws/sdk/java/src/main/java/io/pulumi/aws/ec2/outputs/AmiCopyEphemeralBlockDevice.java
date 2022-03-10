// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.ec2.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class AmiCopyEphemeralBlockDevice {
    /**
     * The path at which the device is exposed to created instances.
     * 
     */
    private final @Nullable String deviceName;
    /**
     * A name for the ephemeral device, of the form "ephemeralN" where
     * *N* is a volume number starting from zero.
     * 
     */
    private final @Nullable String virtualName;

    @OutputCustomType.Constructor
    private AmiCopyEphemeralBlockDevice(
        @OutputCustomType.Parameter("deviceName") @Nullable String deviceName,
        @OutputCustomType.Parameter("virtualName") @Nullable String virtualName) {
        this.deviceName = deviceName;
        this.virtualName = virtualName;
    }

    /**
     * The path at which the device is exposed to created instances.
     * 
    */
    public Optional<String> getDeviceName() {
        return Optional.ofNullable(this.deviceName);
    }
    /**
     * A name for the ephemeral device, of the form "ephemeralN" where
     * *N* is a volume number starting from zero.
     * 
    */
    public Optional<String> getVirtualName() {
        return Optional.ofNullable(this.virtualName);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(AmiCopyEphemeralBlockDevice defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String deviceName;
        private @Nullable String virtualName;

        public Builder() {
    	      // Empty
        }

        public Builder(AmiCopyEphemeralBlockDevice defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.deviceName = defaults.deviceName;
    	      this.virtualName = defaults.virtualName;
        }

        public Builder setDeviceName(@Nullable String deviceName) {
            this.deviceName = deviceName;
            return this;
        }

        public Builder setVirtualName(@Nullable String virtualName) {
            this.virtualName = virtualName;
            return this;
        }
        public AmiCopyEphemeralBlockDevice build() {
            return new AmiCopyEphemeralBlockDevice(deviceName, virtualName);
        }
    }
}
