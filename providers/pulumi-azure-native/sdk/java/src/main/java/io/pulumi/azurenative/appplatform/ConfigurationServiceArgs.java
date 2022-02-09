// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.appplatform;

import io.pulumi.azurenative.appplatform.inputs.ConfigurationServicePropertiesArgs;
import io.pulumi.core.Input;
import io.pulumi.core.internal.annotations.InputImport;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class ConfigurationServiceArgs extends io.pulumi.resources.ResourceArgs {

    public static final ConfigurationServiceArgs Empty = new ConfigurationServiceArgs();

    @InputImport(name="configurationServiceName")
    private final @Nullable Input<String> configurationServiceName;

    public Input<String> getConfigurationServiceName() {
        return this.configurationServiceName == null ? Input.empty() : this.configurationServiceName;
    }

    @InputImport(name="properties")
    private final @Nullable Input<ConfigurationServicePropertiesArgs> properties;

    public Input<ConfigurationServicePropertiesArgs> getProperties() {
        return this.properties == null ? Input.empty() : this.properties;
    }

    @InputImport(name="resourceGroupName", required=true)
    private final Input<String> resourceGroupName;

    public Input<String> getResourceGroupName() {
        return this.resourceGroupName;
    }

    @InputImport(name="serviceName", required=true)
    private final Input<String> serviceName;

    public Input<String> getServiceName() {
        return this.serviceName;
    }

    public ConfigurationServiceArgs(
        @Nullable Input<String> configurationServiceName,
        @Nullable Input<ConfigurationServicePropertiesArgs> properties,
        Input<String> resourceGroupName,
        Input<String> serviceName) {
        this.configurationServiceName = configurationServiceName;
        this.properties = properties;
        this.resourceGroupName = Objects.requireNonNull(resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
        this.serviceName = Objects.requireNonNull(serviceName, "expected parameter 'serviceName' to be non-null");
    }

    private ConfigurationServiceArgs() {
        this.configurationServiceName = Input.empty();
        this.properties = Input.empty();
        this.resourceGroupName = Input.empty();
        this.serviceName = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ConfigurationServiceArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<String> configurationServiceName;
        private @Nullable Input<ConfigurationServicePropertiesArgs> properties;
        private Input<String> resourceGroupName;
        private Input<String> serviceName;

        public Builder() {
    	      // Empty
        }

        public Builder(ConfigurationServiceArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.configurationServiceName = defaults.configurationServiceName;
    	      this.properties = defaults.properties;
    	      this.resourceGroupName = defaults.resourceGroupName;
    	      this.serviceName = defaults.serviceName;
        }

        public Builder setConfigurationServiceName(@Nullable Input<String> configurationServiceName) {
            this.configurationServiceName = configurationServiceName;
            return this;
        }

        public Builder setConfigurationServiceName(@Nullable String configurationServiceName) {
            this.configurationServiceName = Input.ofNullable(configurationServiceName);
            return this;
        }

        public Builder setProperties(@Nullable Input<ConfigurationServicePropertiesArgs> properties) {
            this.properties = properties;
            return this;
        }

        public Builder setProperties(@Nullable ConfigurationServicePropertiesArgs properties) {
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

        public Builder setServiceName(Input<String> serviceName) {
            this.serviceName = Objects.requireNonNull(serviceName);
            return this;
        }

        public Builder setServiceName(String serviceName) {
            this.serviceName = Input.of(Objects.requireNonNull(serviceName));
            return this;
        }

        public ConfigurationServiceArgs build() {
            return new ConfigurationServiceArgs(configurationServiceName, properties, resourceGroupName, serviceName);
        }
    }
}
