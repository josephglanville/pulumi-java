// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.network.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * List of properties of the device.
 * 
 */
public final class DevicePropertiesArgs extends io.pulumi.resources.ResourceArgs {

    public static final DevicePropertiesArgs Empty = new DevicePropertiesArgs();

    /**
     * Model of the device.
     * 
     */
    @Import(name="deviceModel")
      private final @Nullable Output<String> deviceModel;

    public Output<String> getDeviceModel() {
        return this.deviceModel == null ? Codegen.empty() : this.deviceModel;
    }

    /**
     * Name of the device Vendor.
     * 
     */
    @Import(name="deviceVendor")
      private final @Nullable Output<String> deviceVendor;

    public Output<String> getDeviceVendor() {
        return this.deviceVendor == null ? Codegen.empty() : this.deviceVendor;
    }

    /**
     * Link speed.
     * 
     */
    @Import(name="linkSpeedInMbps")
      private final @Nullable Output<Integer> linkSpeedInMbps;

    public Output<Integer> getLinkSpeedInMbps() {
        return this.linkSpeedInMbps == null ? Codegen.empty() : this.linkSpeedInMbps;
    }

    public DevicePropertiesArgs(
        @Nullable Output<String> deviceModel,
        @Nullable Output<String> deviceVendor,
        @Nullable Output<Integer> linkSpeedInMbps) {
        this.deviceModel = deviceModel;
        this.deviceVendor = deviceVendor;
        this.linkSpeedInMbps = linkSpeedInMbps;
    }

    private DevicePropertiesArgs() {
        this.deviceModel = Codegen.empty();
        this.deviceVendor = Codegen.empty();
        this.linkSpeedInMbps = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(DevicePropertiesArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<String> deviceModel;
        private @Nullable Output<String> deviceVendor;
        private @Nullable Output<Integer> linkSpeedInMbps;

        public Builder() {
    	      // Empty
        }

        public Builder(DevicePropertiesArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.deviceModel = defaults.deviceModel;
    	      this.deviceVendor = defaults.deviceVendor;
    	      this.linkSpeedInMbps = defaults.linkSpeedInMbps;
        }

        public Builder deviceModel(@Nullable Output<String> deviceModel) {
            this.deviceModel = deviceModel;
            return this;
        }
        public Builder deviceModel(@Nullable String deviceModel) {
            this.deviceModel = Codegen.ofNullable(deviceModel);
            return this;
        }
        public Builder deviceVendor(@Nullable Output<String> deviceVendor) {
            this.deviceVendor = deviceVendor;
            return this;
        }
        public Builder deviceVendor(@Nullable String deviceVendor) {
            this.deviceVendor = Codegen.ofNullable(deviceVendor);
            return this;
        }
        public Builder linkSpeedInMbps(@Nullable Output<Integer> linkSpeedInMbps) {
            this.linkSpeedInMbps = linkSpeedInMbps;
            return this;
        }
        public Builder linkSpeedInMbps(@Nullable Integer linkSpeedInMbps) {
            this.linkSpeedInMbps = Codegen.ofNullable(linkSpeedInMbps);
            return this;
        }        public DevicePropertiesArgs build() {
            return new DevicePropertiesArgs(deviceModel, deviceVendor, linkSpeedInMbps);
        }
    }
}
