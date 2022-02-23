// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.databoxedge;

import io.pulumi.azurenative.databoxedge.inputs.IoTDeviceInfoArgs;
import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class IoTAddonArgs extends io.pulumi.resources.ResourceArgs {

    public static final IoTAddonArgs Empty = new IoTAddonArgs();

    /**
     * The addon name.
     * 
     */
    @InputImport(name="addonName")
      private final @Nullable Input<String> addonName;

    public Input<String> getAddonName() {
        return this.addonName == null ? Input.empty() : this.addonName;
    }

    /**
     * The device name.
     * 
     */
    @InputImport(name="deviceName", required=true)
      private final Input<String> deviceName;

    public Input<String> getDeviceName() {
        return this.deviceName;
    }

    /**
     * IoT device metadata to which appliance needs to be connected.
     * 
     */
    @InputImport(name="ioTDeviceDetails", required=true)
      private final Input<IoTDeviceInfoArgs> ioTDeviceDetails;

    public Input<IoTDeviceInfoArgs> getIoTDeviceDetails() {
        return this.ioTDeviceDetails;
    }

    /**
     * IoT edge device to which the IoT Addon needs to be configured.
     * 
     */
    @InputImport(name="ioTEdgeDeviceDetails", required=true)
      private final Input<IoTDeviceInfoArgs> ioTEdgeDeviceDetails;

    public Input<IoTDeviceInfoArgs> getIoTEdgeDeviceDetails() {
        return this.ioTEdgeDeviceDetails;
    }

    /**
     * Addon type.
     * Expected value is 'IotEdge'.
     * 
     */
    @InputImport(name="kind", required=true)
      private final Input<String> kind;

    public Input<String> getKind() {
        return this.kind;
    }

    /**
     * The resource group name.
     * 
     */
    @InputImport(name="resourceGroupName", required=true)
      private final Input<String> resourceGroupName;

    public Input<String> getResourceGroupName() {
        return this.resourceGroupName;
    }

    /**
     * The role name.
     * 
     */
    @InputImport(name="roleName", required=true)
      private final Input<String> roleName;

    public Input<String> getRoleName() {
        return this.roleName;
    }

    public IoTAddonArgs(
        @Nullable Input<String> addonName,
        Input<String> deviceName,
        Input<IoTDeviceInfoArgs> ioTDeviceDetails,
        Input<IoTDeviceInfoArgs> ioTEdgeDeviceDetails,
        Input<String> kind,
        Input<String> resourceGroupName,
        Input<String> roleName) {
        this.addonName = addonName;
        this.deviceName = Objects.requireNonNull(deviceName, "expected parameter 'deviceName' to be non-null");
        this.ioTDeviceDetails = Objects.requireNonNull(ioTDeviceDetails, "expected parameter 'ioTDeviceDetails' to be non-null");
        this.ioTEdgeDeviceDetails = Objects.requireNonNull(ioTEdgeDeviceDetails, "expected parameter 'ioTEdgeDeviceDetails' to be non-null");
        this.kind = Objects.requireNonNull(kind, "expected parameter 'kind' to be non-null");
        this.resourceGroupName = Objects.requireNonNull(resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
        this.roleName = Objects.requireNonNull(roleName, "expected parameter 'roleName' to be non-null");
    }

    private IoTAddonArgs() {
        this.addonName = Input.empty();
        this.deviceName = Input.empty();
        this.ioTDeviceDetails = Input.empty();
        this.ioTEdgeDeviceDetails = Input.empty();
        this.kind = Input.empty();
        this.resourceGroupName = Input.empty();
        this.roleName = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(IoTAddonArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<String> addonName;
        private Input<String> deviceName;
        private Input<IoTDeviceInfoArgs> ioTDeviceDetails;
        private Input<IoTDeviceInfoArgs> ioTEdgeDeviceDetails;
        private Input<String> kind;
        private Input<String> resourceGroupName;
        private Input<String> roleName;

        public Builder() {
    	      // Empty
        }

        public Builder(IoTAddonArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.addonName = defaults.addonName;
    	      this.deviceName = defaults.deviceName;
    	      this.ioTDeviceDetails = defaults.ioTDeviceDetails;
    	      this.ioTEdgeDeviceDetails = defaults.ioTEdgeDeviceDetails;
    	      this.kind = defaults.kind;
    	      this.resourceGroupName = defaults.resourceGroupName;
    	      this.roleName = defaults.roleName;
        }

        public Builder setAddonName(@Nullable Input<String> addonName) {
            this.addonName = addonName;
            return this;
        }

        public Builder setAddonName(@Nullable String addonName) {
            this.addonName = Input.ofNullable(addonName);
            return this;
        }

        public Builder setDeviceName(Input<String> deviceName) {
            this.deviceName = Objects.requireNonNull(deviceName);
            return this;
        }

        public Builder setDeviceName(String deviceName) {
            this.deviceName = Input.of(Objects.requireNonNull(deviceName));
            return this;
        }

        public Builder setIoTDeviceDetails(Input<IoTDeviceInfoArgs> ioTDeviceDetails) {
            this.ioTDeviceDetails = Objects.requireNonNull(ioTDeviceDetails);
            return this;
        }

        public Builder setIoTDeviceDetails(IoTDeviceInfoArgs ioTDeviceDetails) {
            this.ioTDeviceDetails = Input.of(Objects.requireNonNull(ioTDeviceDetails));
            return this;
        }

        public Builder setIoTEdgeDeviceDetails(Input<IoTDeviceInfoArgs> ioTEdgeDeviceDetails) {
            this.ioTEdgeDeviceDetails = Objects.requireNonNull(ioTEdgeDeviceDetails);
            return this;
        }

        public Builder setIoTEdgeDeviceDetails(IoTDeviceInfoArgs ioTEdgeDeviceDetails) {
            this.ioTEdgeDeviceDetails = Input.of(Objects.requireNonNull(ioTEdgeDeviceDetails));
            return this;
        }

        public Builder setKind(Input<String> kind) {
            this.kind = Objects.requireNonNull(kind);
            return this;
        }

        public Builder setKind(String kind) {
            this.kind = Input.of(Objects.requireNonNull(kind));
            return this;
        }

        public Builder setResourceGroupName(Input<String> resourceGroupName) {
            this.resourceGroupName = Objects.requireNonNull(resourceGroupName);
            return this;
        }

        public Builder setResourceGroupName(String resourceGroupName) {
            this.resourceGroupName = Input.of(Objects.requireNonNull(resourceGroupName));
            return this;
        }

        public Builder setRoleName(Input<String> roleName) {
            this.roleName = Objects.requireNonNull(roleName);
            return this;
        }

        public Builder setRoleName(String roleName) {
            this.roleName = Input.of(Objects.requireNonNull(roleName));
            return this;
        }
        public IoTAddonArgs build() {
            return new IoTAddonArgs(addonName, deviceName, ioTDeviceDetails, ioTEdgeDeviceDetails, kind, resourceGroupName, roleName);
        }
    }
}
