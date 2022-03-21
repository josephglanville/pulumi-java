// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.iot.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class DeviceConfigArgs extends io.pulumi.resources.ResourceArgs {

    public static final DeviceConfigArgs Empty = new DeviceConfigArgs();

    @Import(name="binaryData")
      private final @Nullable Output<String> binaryData;

    public Output<String> getBinaryData() {
        return this.binaryData == null ? Output.empty() : this.binaryData;
    }

    @Import(name="cloudUpdateTime")
      private final @Nullable Output<String> cloudUpdateTime;

    public Output<String> getCloudUpdateTime() {
        return this.cloudUpdateTime == null ? Output.empty() : this.cloudUpdateTime;
    }

    @Import(name="deviceAckTime")
      private final @Nullable Output<String> deviceAckTime;

    public Output<String> getDeviceAckTime() {
        return this.deviceAckTime == null ? Output.empty() : this.deviceAckTime;
    }

    @Import(name="version")
      private final @Nullable Output<String> version;

    public Output<String> getVersion() {
        return this.version == null ? Output.empty() : this.version;
    }

    public DeviceConfigArgs(
        @Nullable Output<String> binaryData,
        @Nullable Output<String> cloudUpdateTime,
        @Nullable Output<String> deviceAckTime,
        @Nullable Output<String> version) {
        this.binaryData = binaryData;
        this.cloudUpdateTime = cloudUpdateTime;
        this.deviceAckTime = deviceAckTime;
        this.version = version;
    }

    private DeviceConfigArgs() {
        this.binaryData = Output.empty();
        this.cloudUpdateTime = Output.empty();
        this.deviceAckTime = Output.empty();
        this.version = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(DeviceConfigArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<String> binaryData;
        private @Nullable Output<String> cloudUpdateTime;
        private @Nullable Output<String> deviceAckTime;
        private @Nullable Output<String> version;

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

        public Builder binaryData(@Nullable Output<String> binaryData) {
            this.binaryData = binaryData;
            return this;
        }
        public Builder binaryData(@Nullable String binaryData) {
            this.binaryData = Output.ofNullable(binaryData);
            return this;
        }
        public Builder cloudUpdateTime(@Nullable Output<String> cloudUpdateTime) {
            this.cloudUpdateTime = cloudUpdateTime;
            return this;
        }
        public Builder cloudUpdateTime(@Nullable String cloudUpdateTime) {
            this.cloudUpdateTime = Output.ofNullable(cloudUpdateTime);
            return this;
        }
        public Builder deviceAckTime(@Nullable Output<String> deviceAckTime) {
            this.deviceAckTime = deviceAckTime;
            return this;
        }
        public Builder deviceAckTime(@Nullable String deviceAckTime) {
            this.deviceAckTime = Output.ofNullable(deviceAckTime);
            return this;
        }
        public Builder version(@Nullable Output<String> version) {
            this.version = version;
            return this;
        }
        public Builder version(@Nullable String version) {
            this.version = Output.ofNullable(version);
            return this;
        }        public DeviceConfigArgs build() {
            return new DeviceConfigArgs(binaryData, cloudUpdateTime, deviceAckTime, version);
        }
    }
}
