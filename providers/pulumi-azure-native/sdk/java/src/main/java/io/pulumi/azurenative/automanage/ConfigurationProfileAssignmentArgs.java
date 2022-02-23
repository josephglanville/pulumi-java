// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.automanage;

import io.pulumi.azurenative.automanage.inputs.ConfigurationProfileAssignmentPropertiesArgs;
import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class ConfigurationProfileAssignmentArgs extends io.pulumi.resources.ResourceArgs {

    public static final ConfigurationProfileAssignmentArgs Empty = new ConfigurationProfileAssignmentArgs();

    /**
     * Name of the configuration profile assignment. Only default is supported.
     * 
     */
    @InputImport(name="configurationProfileAssignmentName")
      private final @Nullable Input<String> configurationProfileAssignmentName;

    public Input<String> getConfigurationProfileAssignmentName() {
        return this.configurationProfileAssignmentName == null ? Input.empty() : this.configurationProfileAssignmentName;
    }

    /**
     * Properties of the configuration profile assignment.
     * 
     */
    @InputImport(name="properties")
      private final @Nullable Input<ConfigurationProfileAssignmentPropertiesArgs> properties;

    public Input<ConfigurationProfileAssignmentPropertiesArgs> getProperties() {
        return this.properties == null ? Input.empty() : this.properties;
    }

    /**
     * The name of the resource group. The name is case insensitive.
     * 
     */
    @InputImport(name="resourceGroupName", required=true)
      private final Input<String> resourceGroupName;

    public Input<String> getResourceGroupName() {
        return this.resourceGroupName;
    }

    /**
     * The name of the virtual machine.
     * 
     */
    @InputImport(name="vmName", required=true)
      private final Input<String> vmName;

    public Input<String> getVmName() {
        return this.vmName;
    }

    public ConfigurationProfileAssignmentArgs(
        @Nullable Input<String> configurationProfileAssignmentName,
        @Nullable Input<ConfigurationProfileAssignmentPropertiesArgs> properties,
        Input<String> resourceGroupName,
        Input<String> vmName) {
        this.configurationProfileAssignmentName = configurationProfileAssignmentName;
        this.properties = properties;
        this.resourceGroupName = Objects.requireNonNull(resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
        this.vmName = Objects.requireNonNull(vmName, "expected parameter 'vmName' to be non-null");
    }

    private ConfigurationProfileAssignmentArgs() {
        this.configurationProfileAssignmentName = Input.empty();
        this.properties = Input.empty();
        this.resourceGroupName = Input.empty();
        this.vmName = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ConfigurationProfileAssignmentArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<String> configurationProfileAssignmentName;
        private @Nullable Input<ConfigurationProfileAssignmentPropertiesArgs> properties;
        private Input<String> resourceGroupName;
        private Input<String> vmName;

        public Builder() {
    	      // Empty
        }

        public Builder(ConfigurationProfileAssignmentArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.configurationProfileAssignmentName = defaults.configurationProfileAssignmentName;
    	      this.properties = defaults.properties;
    	      this.resourceGroupName = defaults.resourceGroupName;
    	      this.vmName = defaults.vmName;
        }

        public Builder setConfigurationProfileAssignmentName(@Nullable Input<String> configurationProfileAssignmentName) {
            this.configurationProfileAssignmentName = configurationProfileAssignmentName;
            return this;
        }

        public Builder setConfigurationProfileAssignmentName(@Nullable String configurationProfileAssignmentName) {
            this.configurationProfileAssignmentName = Input.ofNullable(configurationProfileAssignmentName);
            return this;
        }

        public Builder setProperties(@Nullable Input<ConfigurationProfileAssignmentPropertiesArgs> properties) {
            this.properties = properties;
            return this;
        }

        public Builder setProperties(@Nullable ConfigurationProfileAssignmentPropertiesArgs properties) {
            this.properties = Input.ofNullable(properties);
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

        public Builder setVmName(Input<String> vmName) {
            this.vmName = Objects.requireNonNull(vmName);
            return this;
        }

        public Builder setVmName(String vmName) {
            this.vmName = Input.of(Objects.requireNonNull(vmName));
            return this;
        }
        public ConfigurationProfileAssignmentArgs build() {
            return new ConfigurationProfileAssignmentArgs(configurationProfileAssignmentName, properties, resourceGroupName, vmName);
        }
    }
}
