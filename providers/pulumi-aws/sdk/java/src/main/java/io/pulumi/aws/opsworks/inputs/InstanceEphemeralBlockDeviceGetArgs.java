// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.opsworks.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.Objects;


public final class InstanceEphemeralBlockDeviceGetArgs extends io.pulumi.resources.ResourceArgs {

    public static final InstanceEphemeralBlockDeviceGetArgs Empty = new InstanceEphemeralBlockDeviceGetArgs();

    @Import(name="deviceName", required=true)
      private final Output<String> deviceName;

    public Output<String> getDeviceName() {
        return this.deviceName;
    }

    @Import(name="virtualName", required=true)
      private final Output<String> virtualName;

    public Output<String> getVirtualName() {
        return this.virtualName;
    }

    public InstanceEphemeralBlockDeviceGetArgs(
        Output<String> deviceName,
        Output<String> virtualName) {
        this.deviceName = Objects.requireNonNull(deviceName, "expected parameter 'deviceName' to be non-null");
        this.virtualName = Objects.requireNonNull(virtualName, "expected parameter 'virtualName' to be non-null");
    }

    private InstanceEphemeralBlockDeviceGetArgs() {
        this.deviceName = Codegen.empty();
        this.virtualName = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(InstanceEphemeralBlockDeviceGetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Output<String> deviceName;
        private Output<String> virtualName;

        public Builder() {
    	      // Empty
        }

        public Builder(InstanceEphemeralBlockDeviceGetArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.deviceName = defaults.deviceName;
    	      this.virtualName = defaults.virtualName;
        }

        public Builder deviceName(Output<String> deviceName) {
            this.deviceName = Objects.requireNonNull(deviceName);
            return this;
        }
        public Builder deviceName(String deviceName) {
            this.deviceName = Output.of(Objects.requireNonNull(deviceName));
            return this;
        }
        public Builder virtualName(Output<String> virtualName) {
            this.virtualName = Objects.requireNonNull(virtualName);
            return this;
        }
        public Builder virtualName(String virtualName) {
            this.virtualName = Output.of(Objects.requireNonNull(virtualName));
            return this;
        }        public InstanceEphemeralBlockDeviceGetArgs build() {
            return new InstanceEphemeralBlockDeviceGetArgs(deviceName, virtualName);
        }
    }
}
