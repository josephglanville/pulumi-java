// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.appplatform;

import io.pulumi.azurenative.appplatform.inputs.ConfigurationServicePropertiesArgs;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class ConfigurationServiceArgs extends io.pulumi.resources.ResourceArgs {

    public static final ConfigurationServiceArgs Empty = new ConfigurationServiceArgs();

    /**
     * The name of Application Configuration Service.
     * 
     */
    @Import(name="configurationServiceName")
      private final @Nullable Output<String> configurationServiceName;

    public Output<String> getConfigurationServiceName() {
        return this.configurationServiceName == null ? Output.empty() : this.configurationServiceName;
    }

    /**
     * Application Configuration Service properties payload
     * 
     */
    @Import(name="properties")
      private final @Nullable Output<ConfigurationServicePropertiesArgs> properties;

    public Output<ConfigurationServicePropertiesArgs> getProperties() {
        return this.properties == null ? Output.empty() : this.properties;
    }

    /**
     * The name of the resource group that contains the resource. You can obtain this value from the Azure Resource Manager API or the portal.
     * 
     */
    @Import(name="resourceGroupName", required=true)
      private final Output<String> resourceGroupName;

    public Output<String> getResourceGroupName() {
        return this.resourceGroupName;
    }

    /**
     * The name of the Service resource.
     * 
     */
    @Import(name="serviceName", required=true)
      private final Output<String> serviceName;

    public Output<String> getServiceName() {
        return this.serviceName;
    }

    public ConfigurationServiceArgs(
        @Nullable Output<String> configurationServiceName,
        @Nullable Output<ConfigurationServicePropertiesArgs> properties,
        Output<String> resourceGroupName,
        Output<String> serviceName) {
        this.configurationServiceName = configurationServiceName;
        this.properties = properties;
        this.resourceGroupName = Objects.requireNonNull(resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
        this.serviceName = Objects.requireNonNull(serviceName, "expected parameter 'serviceName' to be non-null");
    }

    private ConfigurationServiceArgs() {
        this.configurationServiceName = Output.empty();
        this.properties = Output.empty();
        this.resourceGroupName = Output.empty();
        this.serviceName = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ConfigurationServiceArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<String> configurationServiceName;
        private @Nullable Output<ConfigurationServicePropertiesArgs> properties;
        private Output<String> resourceGroupName;
        private Output<String> serviceName;

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

        public Builder configurationServiceName(@Nullable Output<String> configurationServiceName) {
            this.configurationServiceName = configurationServiceName;
            return this;
        }
        public Builder configurationServiceName(@Nullable String configurationServiceName) {
            this.configurationServiceName = Output.ofNullable(configurationServiceName);
            return this;
        }
        public Builder properties(@Nullable Output<ConfigurationServicePropertiesArgs> properties) {
            this.properties = properties;
            return this;
        }
        public Builder properties(@Nullable ConfigurationServicePropertiesArgs properties) {
            this.properties = Output.ofNullable(properties);
            return this;
        }
        public Builder resourceGroupName(Output<String> resourceGroupName) {
            this.resourceGroupName = Objects.requireNonNull(resourceGroupName);
            return this;
        }
        public Builder resourceGroupName(String resourceGroupName) {
            this.resourceGroupName = Output.of(Objects.requireNonNull(resourceGroupName));
            return this;
        }
        public Builder serviceName(Output<String> serviceName) {
            this.serviceName = Objects.requireNonNull(serviceName);
            return this;
        }
        public Builder serviceName(String serviceName) {
            this.serviceName = Output.of(Objects.requireNonNull(serviceName));
            return this;
        }        public ConfigurationServiceArgs build() {
            return new ConfigurationServiceArgs(configurationServiceName, properties, resourceGroupName, serviceName);
        }
    }
}
