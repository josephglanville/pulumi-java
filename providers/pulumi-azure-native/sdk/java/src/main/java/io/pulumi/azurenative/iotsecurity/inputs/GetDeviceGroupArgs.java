// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.iotsecurity.inputs;

import io.pulumi.core.internal.annotations.InputImport;
import java.lang.String;
import java.util.Objects;


public final class GetDeviceGroupArgs extends io.pulumi.resources.InvokeArgs {

    public static final GetDeviceGroupArgs Empty = new GetDeviceGroupArgs();

    @InputImport(name="deviceGroupName", required=true)
    private final String deviceGroupName;

    public String getDeviceGroupName() {
        return this.deviceGroupName;
    }

    @InputImport(name="iotDefenderLocation", required=true)
    private final String iotDefenderLocation;

    public String getIotDefenderLocation() {
        return this.iotDefenderLocation;
    }

    public GetDeviceGroupArgs(
        String deviceGroupName,
        String iotDefenderLocation) {
        this.deviceGroupName = Objects.requireNonNull(deviceGroupName, "expected parameter 'deviceGroupName' to be non-null");
        this.iotDefenderLocation = Objects.requireNonNull(iotDefenderLocation, "expected parameter 'iotDefenderLocation' to be non-null");
    }

    private GetDeviceGroupArgs() {
        this.deviceGroupName = null;
        this.iotDefenderLocation = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetDeviceGroupArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String deviceGroupName;
        private String iotDefenderLocation;

        public Builder() {
    	      // Empty
        }

        public Builder(GetDeviceGroupArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.deviceGroupName = defaults.deviceGroupName;
    	      this.iotDefenderLocation = defaults.iotDefenderLocation;
        }

        public Builder setDeviceGroupName(String deviceGroupName) {
            this.deviceGroupName = Objects.requireNonNull(deviceGroupName);
            return this;
        }

        public Builder setIotDefenderLocation(String iotDefenderLocation) {
            this.iotDefenderLocation = Objects.requireNonNull(iotDefenderLocation);
            return this;
        }

        public GetDeviceGroupArgs build() {
            return new GetDeviceGroupArgs(deviceGroupName, iotDefenderLocation);
        }
    }
}
