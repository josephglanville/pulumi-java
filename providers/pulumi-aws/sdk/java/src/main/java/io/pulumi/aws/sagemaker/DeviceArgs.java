// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.sagemaker;

import io.pulumi.aws.sagemaker.inputs.DeviceDeviceArgs;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


public final class DeviceArgs extends io.pulumi.resources.ResourceArgs {

    public static final DeviceArgs Empty = new DeviceArgs();

    /**
     * The device to register with SageMaker Edge Manager. See Device details below.
     * 
     */
    @Import(name="device", required=true)
      private final Output<DeviceDeviceArgs> device;

    public Output<DeviceDeviceArgs> getDevice() {
        return this.device;
    }

    /**
     * The name of the Device Fleet.
     * 
     */
    @Import(name="deviceFleetName", required=true)
      private final Output<String> deviceFleetName;

    public Output<String> getDeviceFleetName() {
        return this.deviceFleetName;
    }

    public DeviceArgs(
        Output<DeviceDeviceArgs> device,
        Output<String> deviceFleetName) {
        this.device = Objects.requireNonNull(device, "expected parameter 'device' to be non-null");
        this.deviceFleetName = Objects.requireNonNull(deviceFleetName, "expected parameter 'deviceFleetName' to be non-null");
    }

    private DeviceArgs() {
        this.device = Output.empty();
        this.deviceFleetName = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(DeviceArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Output<DeviceDeviceArgs> device;
        private Output<String> deviceFleetName;

        public Builder() {
    	      // Empty
        }

        public Builder(DeviceArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.device = defaults.device;
    	      this.deviceFleetName = defaults.deviceFleetName;
        }

        public Builder device(Output<DeviceDeviceArgs> device) {
            this.device = Objects.requireNonNull(device);
            return this;
        }
        public Builder device(DeviceDeviceArgs device) {
            this.device = Output.of(Objects.requireNonNull(device));
            return this;
        }
        public Builder deviceFleetName(Output<String> deviceFleetName) {
            this.deviceFleetName = Objects.requireNonNull(deviceFleetName);
            return this;
        }
        public Builder deviceFleetName(String deviceFleetName) {
            this.deviceFleetName = Output.of(Objects.requireNonNull(deviceFleetName));
            return this;
        }        public DeviceArgs build() {
            return new DeviceArgs(device, deviceFleetName);
        }
    }
}