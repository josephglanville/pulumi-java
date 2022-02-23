// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.iot.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class DeviceConfigArgs extends io.pulumi.resources.ResourceArgs {

    public static final DeviceConfigArgs Empty = new DeviceConfigArgs();

    @InputImport(name="binaryData")
      private final @Nullable Input<String> binaryData;

    public Input<String> getBinaryData() {
        return this.binaryData == null ? Input.empty() : this.binaryData;
    }

    @InputImport(name="cloudUpdateTime")
      private final @Nullable Input<String> cloudUpdateTime;

    public Input<String> getCloudUpdateTime() {
        return this.cloudUpdateTime == null ? Input.empty() : this.cloudUpdateTime;
    }

    @InputImport(name="deviceAckTime")
      private final @Nullable Input<String> deviceAckTime;

    public Input<String> getDeviceAckTime() {
        return this.deviceAckTime == null ? Input.empty() : this.deviceAckTime;
    }

    @InputImport(name="version")
      private final @Nullable Input<String> version;

    public Input<String> getVersion() {
        return this.version == null ? Input.empty() : this.version;
    }

    public DeviceConfigArgs(
        @Nullable Input<String> binaryData,
        @Nullable Input<String> cloudUpdateTime,
        @Nullable Input<String> deviceAckTime,
        @Nullable Input<String> version) {
        this.binaryData = binaryData;
        this.cloudUpdateTime = cloudUpdateTime;
        this.deviceAckTime = deviceAckTime;
        this.version = version;
    }

    private DeviceConfigArgs() {
        this.binaryData = Input.empty();
        this.cloudUpdateTime = Input.empty();
        this.deviceAckTime = Input.empty();
        this.version = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(DeviceConfigArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<String> binaryData;
        private @Nullable Input<String> cloudUpdateTime;
        private @Nullable Input<String> deviceAckTime;
        private @Nullable Input<String> version;

        public Builder() {
    	      // Empty
        }

        public Builder(DeviceConfigArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.binaryData = defaults.binaryData;
    	      this.cloudUpdateTime = defaults.cloudUpdateTime;
    	      this.deviceAckTime = defaults.deviceAckTime;
    	      this.version = defaults.version;
        }

        public Builder setBinaryData(@Nullable Input<String> binaryData) {
            this.binaryData = binaryData;
            return this;
        }

        public Builder setBinaryData(@Nullable String binaryData) {
            this.binaryData = Input.ofNullable(binaryData);
            return this;
        }

        public Builder setCloudUpdateTime(@Nullable Input<String> cloudUpdateTime) {
            this.cloudUpdateTime = cloudUpdateTime;
            return this;
        }

        public Builder setCloudUpdateTime(@Nullable String cloudUpdateTime) {
            this.cloudUpdateTime = Input.ofNullable(cloudUpdateTime);
            return this;
        }

        public Builder setDeviceAckTime(@Nullable Input<String> deviceAckTime) {
            this.deviceAckTime = deviceAckTime;
            return this;
        }

        public Builder setDeviceAckTime(@Nullable String deviceAckTime) {
            this.deviceAckTime = Input.ofNullable(deviceAckTime);
            return this;
        }

        public Builder setVersion(@Nullable Input<String> version) {
            this.version = version;
            return this;
        }

        public Builder setVersion(@Nullable String version) {
            this.version = Input.ofNullable(version);
            return this;
        }
        public DeviceConfigArgs build() {
            return new DeviceConfigArgs(binaryData, cloudUpdateTime, deviceAckTime, version);
        }
    }
}
