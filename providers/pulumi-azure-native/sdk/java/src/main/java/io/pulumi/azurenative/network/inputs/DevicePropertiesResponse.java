// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.network.inputs;

import io.pulumi.core.annotations.Import;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * List of properties of the device.
 * 
 */
public final class DevicePropertiesResponse extends io.pulumi.resources.InvokeArgs {

    public static final DevicePropertiesResponse Empty = new DevicePropertiesResponse();

    /**
     * Model of the device.
     * 
     */
    @Import(name="deviceModel")
      private final @Nullable String deviceModel;

    public Optional<String> getDeviceModel() {
        return this.deviceModel == null ? Optional.empty() : Optional.ofNullable(this.deviceModel);
    }

    /**
     * Name of the device Vendor.
     * 
     */
    @Import(name="deviceVendor")
      private final @Nullable String deviceVendor;

    public Optional<String> getDeviceVendor() {
        return this.deviceVendor == null ? Optional.empty() : Optional.ofNullable(this.deviceVendor);
    }

    /**
     * Link speed.
     * 
     */
    @Import(name="linkSpeedInMbps")
      private final @Nullable Integer linkSpeedInMbps;

    public Optional<Integer> getLinkSpeedInMbps() {
        return this.linkSpeedInMbps == null ? Optional.empty() : Optional.ofNullable(this.linkSpeedInMbps);
    }

    public DevicePropertiesResponse(
        @Nullable String deviceModel,
        @Nullable String deviceVendor,
        @Nullable Integer linkSpeedInMbps) {
        this.deviceModel = deviceModel;
        this.deviceVendor = deviceVendor;
        this.linkSpeedInMbps = linkSpeedInMbps;
    }

    private DevicePropertiesResponse() {
        this.deviceModel = null;
        this.deviceVendor = null;
        this.linkSpeedInMbps = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(DevicePropertiesResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String deviceModel;
        private @Nullable String deviceVendor;
        private @Nullable Integer linkSpeedInMbps;

        public Builder() {
    	      // Empty
        }

        public Builder(DevicePropertiesResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.deviceModel = defaults.deviceModel;
    	      this.deviceVendor = defaults.deviceVendor;
    	      this.linkSpeedInMbps = defaults.linkSpeedInMbps;
        }

        public Builder deviceModel(@Nullable String deviceModel) {
            this.deviceModel = deviceModel;
            return this;
        }
        public Builder deviceVendor(@Nullable String deviceVendor) {
            this.deviceVendor = deviceVendor;
            return this;
        }
        public Builder linkSpeedInMbps(@Nullable Integer linkSpeedInMbps) {
            this.linkSpeedInMbps = linkSpeedInMbps;
            return this;
        }        public DevicePropertiesResponse build() {
            return new DevicePropertiesResponse(deviceModel, deviceVendor, linkSpeedInMbps);
        }
    }
}
