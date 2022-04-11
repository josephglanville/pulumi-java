// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.ec2.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class AmiFromInstanceEphemeralBlockDeviceGetArgs extends io.pulumi.resources.ResourceArgs {

    public static final AmiFromInstanceEphemeralBlockDeviceGetArgs Empty = new AmiFromInstanceEphemeralBlockDeviceGetArgs();

    /**
     * The path at which the device is exposed to created instances.
     * 
     */
    @Import(name="deviceName")
      private final @Nullable Output<String> deviceName;

    public Output<String> getDeviceName() {
        return this.deviceName == null ? Codegen.empty() : this.deviceName;
    }

    /**
     * A name for the ephemeral device, of the form "ephemeralN" where
     * *N* is a volume number starting from zero.
     * 
     */
    @Import(name="virtualName")
      private final @Nullable Output<String> virtualName;

    public Output<String> getVirtualName() {
        return this.virtualName == null ? Codegen.empty() : this.virtualName;
    }

    public AmiFromInstanceEphemeralBlockDeviceGetArgs(
        @Nullable Output<String> deviceName,
        @Nullable Output<String> virtualName) {
        this.deviceName = deviceName;
        this.virtualName = virtualName;
    }

    private AmiFromInstanceEphemeralBlockDeviceGetArgs() {
        this.deviceName = Codegen.empty();
        this.virtualName = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(AmiFromInstanceEphemeralBlockDeviceGetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<String> deviceName;
        private @Nullable Output<String> virtualName;

        public Builder() {
    	      // Empty
        }

        public Builder(AmiFromInstanceEphemeralBlockDeviceGetArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.deviceName = defaults.deviceName;
    	      this.virtualName = defaults.virtualName;
        }

        public Builder deviceName(@Nullable Output<String> deviceName) {
            this.deviceName = deviceName;
            return this;
        }
        public Builder deviceName(@Nullable String deviceName) {
            this.deviceName = Codegen.ofNullable(deviceName);
            return this;
        }
        public Builder virtualName(@Nullable Output<String> virtualName) {
            this.virtualName = virtualName;
            return this;
        }
        public Builder virtualName(@Nullable String virtualName) {
            this.virtualName = Codegen.ofNullable(virtualName);
            return this;
        }        public AmiFromInstanceEphemeralBlockDeviceGetArgs build() {
            return new AmiFromInstanceEphemeralBlockDeviceGetArgs(deviceName, virtualName);
        }
    }
}
