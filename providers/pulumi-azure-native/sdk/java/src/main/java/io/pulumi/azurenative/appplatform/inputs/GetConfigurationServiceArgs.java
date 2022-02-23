// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.appplatform.inputs;

import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;


public final class GetConfigurationServiceArgs extends io.pulumi.resources.InvokeArgs {

    public static final GetConfigurationServiceArgs Empty = new GetConfigurationServiceArgs();

    /**
     * The name of Application Configuration Service.
     * 
     */
    @InputImport(name="configurationServiceName", required=true)
      private final String configurationServiceName;

    public String getConfigurationServiceName() {
        return this.configurationServiceName;
    }

    /**
     * The name of the resource group that contains the resource. You can obtain this value from the Azure Resource Manager API or the portal.
     * 
     */
    @InputImport(name="resourceGroupName", required=true)
      private final String resourceGroupName;

    public String getResourceGroupName() {
        return this.resourceGroupName;
    }

    /**
     * The name of the Service resource.
     * 
     */
    @InputImport(name="serviceName", required=true)
      private final String serviceName;

    public String getServiceName() {
        return this.serviceName;
    }

    public GetConfigurationServiceArgs(
        String configurationServiceName,
        String resourceGroupName,
        String serviceName) {
        this.configurationServiceName = Objects.requireNonNull(configurationServiceName, "expected parameter 'configurationServiceName' to be non-null");
        this.resourceGroupName = Objects.requireNonNull(resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
        this.serviceName = Objects.requireNonNull(serviceName, "expected parameter 'serviceName' to be non-null");
    }

    private GetConfigurationServiceArgs() {
        this.configurationServiceName = null;
        this.resourceGroupName = null;
        this.serviceName = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetConfigurationServiceArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String configurationServiceName;
        private String resourceGroupName;
        private String serviceName;

        public Builder() {
    	      // Empty
        }

        public Builder(GetConfigurationServiceArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.configurationServiceName = defaults.configurationServiceName;
    	      this.resourceGroupName = defaults.resourceGroupName;
    	      this.serviceName = defaults.serviceName;
        }

        public Builder setConfigurationServiceName(String configurationServiceName) {
            this.configurationServiceName = Objects.requireNonNull(configurationServiceName);
            return this;
        }

        public Builder setResourceGroupName(String resourceGroupName) {
            this.resourceGroupName = Objects.requireNonNull(resourceGroupName);
            return this;
        }

        public Builder setServiceName(String serviceName) {
            this.serviceName = Objects.requireNonNull(serviceName);
            return this;
        }
        public GetConfigurationServiceArgs build() {
            return new GetConfigurationServiceArgs(configurationServiceName, resourceGroupName, serviceName);
        }
    }
}
