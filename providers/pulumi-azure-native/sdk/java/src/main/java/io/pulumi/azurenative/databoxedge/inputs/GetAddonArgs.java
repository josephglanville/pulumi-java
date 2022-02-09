// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.databoxedge.inputs;

import io.pulumi.core.internal.annotations.InputImport;
import java.lang.String;
import java.util.Objects;


public final class GetAddonArgs extends io.pulumi.resources.InvokeArgs {

    public static final GetAddonArgs Empty = new GetAddonArgs();

    @InputImport(name="addonName", required=true)
    private final String addonName;

    public String getAddonName() {
        return this.addonName;
    }

    @InputImport(name="deviceName", required=true)
    private final String deviceName;

    public String getDeviceName() {
        return this.deviceName;
    }

    @InputImport(name="resourceGroupName", required=true)
    private final String resourceGroupName;

    public String getResourceGroupName() {
        return this.resourceGroupName;
    }

    @InputImport(name="roleName", required=true)
    private final String roleName;

    public String getRoleName() {
        return this.roleName;
    }

    public GetAddonArgs(
        String addonName,
        String deviceName,
        String resourceGroupName,
        String roleName) {
        this.addonName = Objects.requireNonNull(addonName, "expected parameter 'addonName' to be non-null");
        this.deviceName = Objects.requireNonNull(deviceName, "expected parameter 'deviceName' to be non-null");
        this.resourceGroupName = Objects.requireNonNull(resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
        this.roleName = Objects.requireNonNull(roleName, "expected parameter 'roleName' to be non-null");
    }

    private GetAddonArgs() {
        this.addonName = null;
        this.deviceName = null;
        this.resourceGroupName = null;
        this.roleName = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetAddonArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String addonName;
        private String deviceName;
        private String resourceGroupName;
        private String roleName;

        public Builder() {
    	      // Empty
        }

        public Builder(GetAddonArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.addonName = defaults.addonName;
    	      this.deviceName = defaults.deviceName;
    	      this.resourceGroupName = defaults.resourceGroupName;
    	      this.roleName = defaults.roleName;
        }

        public Builder setAddonName(String addonName) {
            this.addonName = Objects.requireNonNull(addonName);
            return this;
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

        public GetAddonArgs build() {
            return new GetAddonArgs(addonName, deviceName, resourceGroupName, roleName);
        }
    }
}
