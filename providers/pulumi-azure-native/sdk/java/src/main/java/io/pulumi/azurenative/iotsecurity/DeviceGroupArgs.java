// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.iotsecurity;

import io.pulumi.core.Input;
import io.pulumi.core.internal.annotations.InputImport;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class DeviceGroupArgs extends io.pulumi.resources.ResourceArgs {

    public static final DeviceGroupArgs Empty = new DeviceGroupArgs();

    @InputImport(name="deviceGroupName")
    private final @Nullable Input<String> deviceGroupName;

    public Input<String> getDeviceGroupName() {
        return this.deviceGroupName == null ? Input.empty() : this.deviceGroupName;
    }

    @InputImport(name="iotDefenderLocation", required=true)
    private final Input<String> iotDefenderLocation;

    public Input<String> getIotDefenderLocation() {
        return this.iotDefenderLocation;
    }

    public DeviceGroupArgs(
        @Nullable Input<String> deviceGroupName,
        Input<String> iotDefenderLocation) {
        this.deviceGroupName = deviceGroupName;
        this.iotDefenderLocation = Objects.requireNonNull(iotDefenderLocation, "expected parameter 'iotDefenderLocation' to be non-null");
    }

    private DeviceGroupArgs() {
        this.deviceGroupName = Input.empty();
        this.iotDefenderLocation = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(DeviceGroupArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<String> deviceGroupName;
        private Input<String> iotDefenderLocation;

        public Builder() {
    	      // Empty
        }

        public Builder(DeviceGroupArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.deviceGroupName = defaults.deviceGroupName;
    	      this.iotDefenderLocation = defaults.iotDefenderLocation;
        }

        public Builder setDeviceGroupName(@Nullable Input<String> deviceGroupName) {
            this.deviceGroupName = deviceGroupName;
            return this;
        }

        public Builder setDeviceGroupName(@Nullable String deviceGroupName) {
            this.deviceGroupName = Input.ofNullable(deviceGroupName);
            return this;
        }

        public Builder setIotDefenderLocation(Input<String> iotDefenderLocation) {
            this.iotDefenderLocation = Objects.requireNonNull(iotDefenderLocation);
            return this;
        }

        public Builder setIotDefenderLocation(String iotDefenderLocation) {
            this.iotDefenderLocation = Input.of(Objects.requireNonNull(iotDefenderLocation));
            return this;
        }

        public DeviceGroupArgs build() {
            return new DeviceGroupArgs(deviceGroupName, iotDefenderLocation);
        }
    }
}
