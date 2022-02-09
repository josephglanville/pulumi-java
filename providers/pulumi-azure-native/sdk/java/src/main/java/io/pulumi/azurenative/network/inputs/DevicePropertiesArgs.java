// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.network.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.internal.annotations.InputImport;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class DevicePropertiesArgs extends io.pulumi.resources.ResourceArgs {

    public static final DevicePropertiesArgs Empty = new DevicePropertiesArgs();

    @InputImport(name="deviceModel")
    private final @Nullable Input<String> deviceModel;

    public Input<String> getDeviceModel() {
        return this.deviceModel == null ? Input.empty() : this.deviceModel;
    }

    @InputImport(name="deviceVendor")
    private final @Nullable Input<String> deviceVendor;

    public Input<String> getDeviceVendor() {
        return this.deviceVendor == null ? Input.empty() : this.deviceVendor;
    }

    @InputImport(name="linkSpeedInMbps")
    private final @Nullable Input<Integer> linkSpeedInMbps;

    public Input<Integer> getLinkSpeedInMbps() {
        return this.linkSpeedInMbps == null ? Input.empty() : this.linkSpeedInMbps;
    }

    public DevicePropertiesArgs(
        @Nullable Input<String> deviceModel,
        @Nullable Input<String> deviceVendor,
        @Nullable Input<Integer> linkSpeedInMbps) {
        this.deviceModel = deviceModel;
        this.deviceVendor = deviceVendor;
        this.linkSpeedInMbps = linkSpeedInMbps;
    }

    private DevicePropertiesArgs() {
        this.deviceModel = Input.empty();
        this.deviceVendor = Input.empty();
        this.linkSpeedInMbps = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(DevicePropertiesArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<String> deviceModel;
        private @Nullable Input<String> deviceVendor;
        private @Nullable Input<Integer> linkSpeedInMbps;

        public Builder() {
    	      // Empty
        }

        public Builder(DevicePropertiesArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.deviceModel = defaults.deviceModel;
    	      this.deviceVendor = defaults.deviceVendor;
    	      this.linkSpeedInMbps = defaults.linkSpeedInMbps;
        }

        public Builder setDeviceModel(@Nullable Input<String> deviceModel) {
            this.deviceModel = deviceModel;
            return this;
        }

        public Builder setDeviceModel(@Nullable String deviceModel) {
            this.deviceModel = Input.ofNullable(deviceModel);
            return this;
        }

        public Builder setDeviceVendor(@Nullable Input<String> deviceVendor) {
            this.deviceVendor = deviceVendor;
            return this;
        }

        public Builder setDeviceVendor(@Nullable String deviceVendor) {
            this.deviceVendor = Input.ofNullable(deviceVendor);
            return this;
        }

        public Builder setLinkSpeedInMbps(@Nullable Input<Integer> linkSpeedInMbps) {
            this.linkSpeedInMbps = linkSpeedInMbps;
            return this;
        }

        public Builder setLinkSpeedInMbps(@Nullable Integer linkSpeedInMbps) {
            this.linkSpeedInMbps = Input.ofNullable(linkSpeedInMbps);
            return this;
        }

        public DevicePropertiesArgs build() {
            return new DevicePropertiesArgs(deviceModel, deviceVendor, linkSpeedInMbps);
        }
    }
}
