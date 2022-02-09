// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.maintenance;

import io.pulumi.core.Input;
import io.pulumi.core.internal.annotations.InputImport;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class ConfigurationAssignmentParentArgs extends io.pulumi.resources.ResourceArgs {

    public static final ConfigurationAssignmentParentArgs Empty = new ConfigurationAssignmentParentArgs();

    @InputImport(name="configurationAssignmentName")
    private final @Nullable Input<String> configurationAssignmentName;

    public Input<String> getConfigurationAssignmentName() {
        return this.configurationAssignmentName == null ? Input.empty() : this.configurationAssignmentName;
    }

    @InputImport(name="location")
    private final @Nullable Input<String> location;

    public Input<String> getLocation() {
        return this.location == null ? Input.empty() : this.location;
    }

    @InputImport(name="maintenanceConfigurationId")
    private final @Nullable Input<String> maintenanceConfigurationId;

    public Input<String> getMaintenanceConfigurationId() {
        return this.maintenanceConfigurationId == null ? Input.empty() : this.maintenanceConfigurationId;
    }

    @InputImport(name="providerName", required=true)
    private final Input<String> providerName;

    public Input<String> getProviderName() {
        return this.providerName;
    }

    @InputImport(name="resourceGroupName", required=true)
    private final Input<String> resourceGroupName;

    public Input<String> getResourceGroupName() {
        return this.resourceGroupName;
    }

    @InputImport(name="resourceId")
    private final @Nullable Input<String> resourceId;

    public Input<String> getResourceId() {
        return this.resourceId == null ? Input.empty() : this.resourceId;
    }

    @InputImport(name="resourceName", required=true)
    private final Input<String> resourceName;

    public Input<String> getPropResourceName() {
        return this.resourceName;
    }

    @InputImport(name="resourceParentName", required=true)
    private final Input<String> resourceParentName;

    public Input<String> getResourceParentName() {
        return this.resourceParentName;
    }

    @InputImport(name="resourceParentType", required=true)
    private final Input<String> resourceParentType;

    public Input<String> getResourceParentType() {
        return this.resourceParentType;
    }

    @InputImport(name="resourceType", required=true)
    private final Input<String> resourceType;

    public Input<String> getPropResourceType() {
        return this.resourceType;
    }

    public ConfigurationAssignmentParentArgs(
        @Nullable Input<String> configurationAssignmentName,
        @Nullable Input<String> location,
        @Nullable Input<String> maintenanceConfigurationId,
        Input<String> providerName,
        Input<String> resourceGroupName,
        @Nullable Input<String> resourceId,
        Input<String> resourceName,
        Input<String> resourceParentName,
        Input<String> resourceParentType,
        Input<String> resourceType) {
        this.configurationAssignmentName = configurationAssignmentName;
        this.location = location;
        this.maintenanceConfigurationId = maintenanceConfigurationId;
        this.providerName = Objects.requireNonNull(providerName, "expected parameter 'providerName' to be non-null");
        this.resourceGroupName = Objects.requireNonNull(resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
        this.resourceId = resourceId;
        this.resourceName = Objects.requireNonNull(resourceName, "expected parameter 'resourceName' to be non-null");
        this.resourceParentName = Objects.requireNonNull(resourceParentName, "expected parameter 'resourceParentName' to be non-null");
        this.resourceParentType = Objects.requireNonNull(resourceParentType, "expected parameter 'resourceParentType' to be non-null");
        this.resourceType = Objects.requireNonNull(resourceType, "expected parameter 'resourceType' to be non-null");
    }

    private ConfigurationAssignmentParentArgs() {
        this.configurationAssignmentName = Input.empty();
        this.location = Input.empty();
        this.maintenanceConfigurationId = Input.empty();
        this.providerName = Input.empty();
        this.resourceGroupName = Input.empty();
        this.resourceId = Input.empty();
        this.resourceName = Input.empty();
        this.resourceParentName = Input.empty();
        this.resourceParentType = Input.empty();
        this.resourceType = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ConfigurationAssignmentParentArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<String> configurationAssignmentName;
        private @Nullable Input<String> location;
        private @Nullable Input<String> maintenanceConfigurationId;
        private Input<String> providerName;
        private Input<String> resourceGroupName;
        private @Nullable Input<String> resourceId;
        private Input<String> resourceName;
        private Input<String> resourceParentName;
        private Input<String> resourceParentType;
        private Input<String> resourceType;

        public Builder() {
    	      // Empty
        }

        public Builder(ConfigurationAssignmentParentArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.configurationAssignmentName = defaults.configurationAssignmentName;
    	      this.location = defaults.location;
    	      this.maintenanceConfigurationId = defaults.maintenanceConfigurationId;
    	      this.providerName = defaults.providerName;
    	      this.resourceGroupName = defaults.resourceGroupName;
    	      this.resourceId = defaults.resourceId;
    	      this.resourceName = defaults.resourceName;
    	      this.resourceParentName = defaults.resourceParentName;
    	      this.resourceParentType = defaults.resourceParentType;
    	      this.resourceType = defaults.resourceType;
        }

        public Builder setConfigurationAssignmentName(@Nullable Input<String> configurationAssignmentName) {
            this.configurationAssignmentName = configurationAssignmentName;
            return this;
        }

        public Builder setConfigurationAssignmentName(@Nullable String configurationAssignmentName) {
            this.configurationAssignmentName = Input.ofNullable(configurationAssignmentName);
            return this;
        }

        public Builder setLocation(@Nullable Input<String> location) {
            this.location = location;
            return this;
        }

        public Builder setLocation(@Nullable String location) {
            this.location = Input.ofNullable(location);
            return this;
        }

        public Builder setMaintenanceConfigurationId(@Nullable Input<String> maintenanceConfigurationId) {
            this.maintenanceConfigurationId = maintenanceConfigurationId;
            return this;
        }

        public Builder setMaintenanceConfigurationId(@Nullable String maintenanceConfigurationId) {
            this.maintenanceConfigurationId = Input.ofNullable(maintenanceConfigurationId);
            return this;
        }

        public Builder setProviderName(Input<String> providerName) {
            this.providerName = Objects.requireNonNull(providerName);
            return this;
        }

        public Builder setProviderName(String providerName) {
            this.providerName = Input.of(Objects.requireNonNull(providerName));
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

        public Builder setResourceId(@Nullable Input<String> resourceId) {
            this.resourceId = resourceId;
            return this;
        }

        public Builder setResourceId(@Nullable String resourceId) {
            this.resourceId = Input.ofNullable(resourceId);
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

        public Builder setResourceParentName(Input<String> resourceParentName) {
            this.resourceParentName = Objects.requireNonNull(resourceParentName);
            return this;
        }

        public Builder setResourceParentName(String resourceParentName) {
            this.resourceParentName = Input.of(Objects.requireNonNull(resourceParentName));
            return this;
        }

        public Builder setResourceParentType(Input<String> resourceParentType) {
            this.resourceParentType = Objects.requireNonNull(resourceParentType);
            return this;
        }

        public Builder setResourceParentType(String resourceParentType) {
            this.resourceParentType = Input.of(Objects.requireNonNull(resourceParentType));
            return this;
        }

        public Builder setResourceType(Input<String> resourceType) {
            this.resourceType = Objects.requireNonNull(resourceType);
            return this;
        }

        public Builder setResourceType(String resourceType) {
            this.resourceType = Input.of(Objects.requireNonNull(resourceType));
            return this;
        }

        public ConfigurationAssignmentParentArgs build() {
            return new ConfigurationAssignmentParentArgs(configurationAssignmentName, location, maintenanceConfigurationId, providerName, resourceGroupName, resourceId, resourceName, resourceParentName, resourceParentType, resourceType);
        }
    }
}
