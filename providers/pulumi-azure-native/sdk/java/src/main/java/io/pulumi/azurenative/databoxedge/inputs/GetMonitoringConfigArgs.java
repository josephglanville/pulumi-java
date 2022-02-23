// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.databoxedge.inputs;

import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;


public final class GetMonitoringConfigArgs extends io.pulumi.resources.InvokeArgs {

    public static final GetMonitoringConfigArgs Empty = new GetMonitoringConfigArgs();

    /**
     * The device name.
     * 
     */
    @InputImport(name="deviceName", required=true)
      private final String deviceName;

    public String getDeviceName() {
        return this.deviceName;
    }

    /**
     * The resource group name.
     * 
     */
    @InputImport(name="resourceGroupName", required=true)
      private final String resourceGroupName;

    public String getResourceGroupName() {
        return this.resourceGroupName;
    }

    /**
     * The role name.
     * 
     */
    @InputImport(name="roleName", required=true)
      private final String roleName;

    public String getRoleName() {
        return this.roleName;
    }

    public GetMonitoringConfigArgs(
        String deviceName,
        String resourceGroupName,
        String roleName) {
        this.deviceName = Objects.requireNonNull(deviceName, "expected parameter 'deviceName' to be non-null");
        this.resourceGroupName = Objects.requireNonNull(resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
        this.roleName = Objects.requireNonNull(roleName, "expected parameter 'roleName' to be non-null");
    }

    private GetMonitoringConfigArgs() {
        this.deviceName = null;
        this.resourceGroupName = null;
        this.roleName = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetMonitoringConfigArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String deviceName;
        private String resourceGroupName;
        private String roleName;

        public Builder() {
    	      // Empty
        }

        public Builder(GetMonitoringConfigArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.deviceName = defaults.deviceName;
    	      this.resourceGroupName = defaults.resourceGroupName;
    	      this.roleName = defaults.roleName;
        }

        public Builder setDeviceName(String deviceName) {
            this.deviceName = Objects.requireNonNull(deviceName);
            return this;
        }

        public Builder setResourceGroupName(String resourceGroupName) {
            this.resourceGroupName = Objects.requireNonNull(resourceGroupName);
            return this;
        }

        public Builder setRoleName(String roleName) {
            this.roleName = Objects.requireNonNull(roleName);
            return this;
        }
        public GetMonitoringConfigArgs build() {
            return new GetMonitoringConfigArgs(deviceName, resourceGroupName, roleName);
        }
    }
}
