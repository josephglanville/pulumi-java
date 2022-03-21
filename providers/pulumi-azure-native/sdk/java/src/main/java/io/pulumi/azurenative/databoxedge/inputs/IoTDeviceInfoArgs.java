// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.databoxedge.inputs;

import io.pulumi.azurenative.databoxedge.inputs.AuthenticationArgs;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * Metadata of IoT device/IoT Edge device to be configured.
 * 
 */
public final class IoTDeviceInfoArgs extends io.pulumi.resources.ResourceArgs {

    public static final IoTDeviceInfoArgs Empty = new IoTDeviceInfoArgs();

    /**
     * Encrypted IoT device/IoT edge device connection string.
     * 
     */
    @Import(name="authentication")
      private final @Nullable Output<AuthenticationArgs> authentication;

    public Output<AuthenticationArgs> getAuthentication() {
        return this.authentication == null ? Output.empty() : this.authentication;
    }

    /**
     * ID of the IoT device/edge device.
     * 
     */
    @Import(name="deviceId", required=true)
      private final Output<String> deviceId;

    public Output<String> getDeviceId() {
        return this.deviceId;
    }

    /**
     * Host name for the IoT hub associated to the device.
     * 
     */
    @Import(name="ioTHostHub", required=true)
      private final Output<String> ioTHostHub;

    public Output<String> getIoTHostHub() {
        return this.ioTHostHub;
    }

    /**
     * Id for the IoT hub associated to the device.
     * 
     */
    @Import(name="ioTHostHubId")
      private final @Nullable Output<String> ioTHostHubId;

    public Output<String> getIoTHostHubId() {
        return this.ioTHostHubId == null ? Output.empty() : this.ioTHostHubId;
    }

    public IoTDeviceInfoArgs(
        @Nullable Output<AuthenticationArgs> authentication,
        Output<String> deviceId,
        Output<String> ioTHostHub,
        @Nullable Output<String> ioTHostHubId) {
        this.authentication = authentication;
        this.deviceId = Objects.requireNonNull(deviceId, "expected parameter 'deviceId' to be non-null");
        this.ioTHostHub = Objects.requireNonNull(ioTHostHub, "expected parameter 'ioTHostHub' to be non-null");
        this.ioTHostHubId = ioTHostHubId;
    }

    private IoTDeviceInfoArgs() {
        this.authentication = Output.empty();
        this.deviceId = Output.empty();
        this.ioTHostHub = Output.empty();
        this.ioTHostHubId = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(IoTDeviceInfoArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<AuthenticationArgs> authentication;
        private Output<String> deviceId;
        private Output<String> ioTHostHub;
        private @Nullable Output<String> ioTHostHubId;

        public Builder() {
    	      // Empty
        }

        public Builder(IoTDeviceInfoArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.authentication = defaults.authentication;
    	      this.deviceId = defaults.deviceId;
    	      this.ioTHostHub = defaults.ioTHostHub;
    	      this.ioTHostHubId = defaults.ioTHostHubId;
        }

        public Builder authentication(@Nullable Output<AuthenticationArgs> authentication) {
            this.authentication = authentication;
            return this;
        }
        public Builder authentication(@Nullable AuthenticationArgs authentication) {
            this.authentication = Output.ofNullable(authentication);
            return this;
        }
        public Builder deviceId(Output<String> deviceId) {
            this.deviceId = Objects.requireNonNull(deviceId);
            return this;
        }
        public Builder deviceId(String deviceId) {
            this.deviceId = Output.of(Objects.requireNonNull(deviceId));
            return this;
        }
        public Builder ioTHostHub(Output<String> ioTHostHub) {
            this.ioTHostHub = Objects.requireNonNull(ioTHostHub);
            return this;
        }
        public Builder ioTHostHub(String ioTHostHub) {
            this.ioTHostHub = Output.of(Objects.requireNonNull(ioTHostHub));
            return this;
        }
        public Builder ioTHostHubId(@Nullable Output<String> ioTHostHubId) {
            this.ioTHostHubId = ioTHostHubId;
            return this;
        }
        public Builder ioTHostHubId(@Nullable String ioTHostHubId) {
            this.ioTHostHubId = Output.ofNullable(ioTHostHubId);
            return this;
        }        public IoTDeviceInfoArgs build() {
            return new IoTDeviceInfoArgs(authentication, deviceId, ioTHostHub, ioTHostHubId);
        }
    }
}
