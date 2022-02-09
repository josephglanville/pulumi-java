// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.databoxedge;

import io.pulumi.core.Input;
import io.pulumi.core.internal.annotations.InputImport;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class ArcAddonArgs extends io.pulumi.resources.ResourceArgs {

    public static final ArcAddonArgs Empty = new ArcAddonArgs();

    @InputImport(name="addonName")
    private final @Nullable Input<String> addonName;

    public Input<String> getAddonName() {
        return this.addonName == null ? Input.empty() : this.addonName;
    }

    @InputImport(name="deviceName", required=true)
    private final Input<String> deviceName;

    public Input<String> getDeviceName() {
        return this.deviceName;
    }

    @InputImport(name="kind", required=true)
    private final Input<String> kind;

    public Input<String> getKind() {
        return this.kind;
    }

    @InputImport(name="resourceGroupName", required=true)
    private final Input<String> resourceGroupName;

    public Input<String> getResourceGroupName() {
        return this.resourceGroupName;
    }

    @InputImport(name="resourceLocation", required=true)
    private final Input<String> resourceLocation;

    public Input<String> getResourceLocation() {
        return this.resourceLocation;
    }

    @InputImport(name="resourceName", required=true)
    private final Input<String> resourceName;

    public Input<String> getPropResourceName() {
        return this.resourceName;
    }

    @InputImport(name="roleName", required=true)
    private final Input<String> roleName;

    public Input<String> getRoleName() {
        return this.roleName;
    }

    @InputImport(name="subscriptionId", required=true)
    private final Input<String> subscriptionId;

    public Input<String> getSubscriptionId() {
        return this.subscriptionId;
    }

    public ArcAddonArgs(
        @Nullable Input<String> addonName,
        Input<String> deviceName,
        Input<String> kind,
        Input<String> resourceGroupName,
        Input<String> resourceLocation,
        Input<String> resourceName,
        Input<String> roleName,
        Input<String> subscriptionId) {
        this.addonName = addonName;
        this.deviceName = Objects.requireNonNull(deviceName, "expected parameter 'deviceName' to be non-null");
        this.kind = Objects.requireNonNull(kind, "expected parameter 'kind' to be non-null");
        this.resourceGroupName = Objects.requireNonNull(resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
        this.resourceLocation = Objects.requireNonNull(resourceLocation, "expected parameter 'resourceLocation' to be non-null");
        this.resourceName = Objects.requireNonNull(resourceName, "expected parameter 'resourceName' to be non-null");
        this.roleName = Objects.requireNonNull(roleName, "expected parameter 'roleName' to be non-null");
        this.subscriptionId = Objects.requireNonNull(subscriptionId, "expected parameter 'subscriptionId' to be non-null");
    }

    private ArcAddonArgs() {
        this.addonName = Input.empty();
        this.deviceName = Input.empty();
        this.kind = Input.empty();
        this.resourceGroupName = Input.empty();
        this.resourceLocation = Input.empty();
        this.resourceName = Input.empty();
        this.roleName = Input.empty();
        this.subscriptionId = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ArcAddonArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<String> addonName;
        private Input<String> deviceName;
        private Input<String> kind;
        private Input<String> resourceGroupName;
        private Input<String> resourceLocation;
        private Input<String> resourceName;
        private Input<String> roleName;
        private Input<String> subscriptionId;

        public Builder() {
    	      // Empty
        }

        public Builder(ArcAddonArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.addonName = defaults.addonName;
    	      this.deviceName = defaults.deviceName;
    	      this.kind = defaults.kind;
    	      this.resourceGroupName = defaults.resourceGroupName;
    	      this.resourceLocation = defaults.resourceLocation;
    	      this.resourceName = defaults.resourceName;
    	      this.roleName = defaults.roleName;
    	      this.subscriptionId = defaults.subscriptionId;
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

        public Builder setResourceLocation(Input<String> resourceLocation) {
            this.resourceLocation = Objects.requireNonNull(resourceLocation);
            return this;
        }

        public Builder setResourceLocation(String resourceLocation) {
            this.resourceLocation = Input.of(Objects.requireNonNull(resourceLocation));
            return this;
        }

        public Builder setResourceName(Input<String> resourceName) {
            this.resourceName = Objects.requireNonNull(resourceName);
            return this;
        }

        public Builder setResourceName(String resourceName) {
            this.resourceName = Input.of(Objects.requireNonNull(resourceName));
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

        public Builder setSubscriptionId(Input<String> subscriptionId) {
            this.subscriptionId = Objects.requireNonNull(subscriptionId);
            return this;
        }

        public Builder setSubscriptionId(String subscriptionId) {
            this.subscriptionId = Input.of(Objects.requireNonNull(subscriptionId));
            return this;
        }

        public ArcAddonArgs build() {
            return new ArcAddonArgs(addonName, deviceName, kind, resourceGroupName, resourceLocation, resourceName, roleName, subscriptionId);
        }
    }
}
