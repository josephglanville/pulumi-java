// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.sagemaker.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * Edge device you want to create
 * 
 */
public final class DeviceArgs extends io.pulumi.resources.ResourceArgs {

    public static final DeviceArgs Empty = new DeviceArgs();

    /**
     * Description of the device
     * 
     */
    @Import(name="description")
      private final @Nullable Output<String> description;

    public Output<String> getDescription() {
        return this.description == null ? Output.empty() : this.description;
    }

    /**
     * The name of the device
     * 
     */
    @Import(name="deviceName", required=true)
      private final Output<String> deviceName;

    public Output<String> getDeviceName() {
        return this.deviceName;
    }

    /**
     * AWS Internet of Things (IoT) object name.
     * 
     */
    @Import(name="iotThingName")
      private final @Nullable Output<String> iotThingName;

    public Output<String> getIotThingName() {
        return this.iotThingName == null ? Output.empty() : this.iotThingName;
    }

    public DeviceArgs(
        @Nullable Output<String> description,
        Output<String> deviceName,
        @Nullable Output<String> iotThingName) {
        this.description = description;
        this.deviceName = Objects.requireNonNull(deviceName, "expected parameter 'deviceName' to be non-null");
        this.iotThingName = iotThingName;
    }

    private DeviceArgs() {
        this.description = Output.empty();
        this.deviceName = Output.empty();
        this.iotThingName = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(DeviceArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<String> description;
        private Output<String> deviceName;
        private @Nullable Output<String> iotThingName;

        public Builder() {
    	      // Empty
        }

        public Builder(DeviceArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.description = defaults.description;
    	      this.deviceName = defaults.deviceName;
    	      this.iotThingName = defaults.iotThingName;
        }

        public Builder description(@Nullable Output<String> description) {
            this.description = description;
            return this;
        }
        public Builder description(@Nullable String description) {
            this.description = Output.ofNullable(description);
            return this;
        }
        public Builder deviceName(Output<String> deviceName) {
            this.deviceName = Objects.requireNonNull(deviceName);
            return this;
        }
        public Builder deviceName(String deviceName) {
            this.deviceName = Output.of(Objects.requireNonNull(deviceName));
            return this;
        }
        public Builder iotThingName(@Nullable Output<String> iotThingName) {
            this.iotThingName = iotThingName;
            return this;
        }
        public Builder iotThingName(@Nullable String iotThingName) {
            this.iotThingName = Output.ofNullable(iotThingName);
            return this;
        }        public DeviceArgs build() {
            return new DeviceArgs(description, deviceName, iotThingName);
        }
    }
}
