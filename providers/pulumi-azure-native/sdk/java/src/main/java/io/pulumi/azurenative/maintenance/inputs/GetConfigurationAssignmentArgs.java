// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.maintenance.inputs;

import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;


public final class GetConfigurationAssignmentArgs extends io.pulumi.resources.InvokeArgs {

    public static final GetConfigurationAssignmentArgs Empty = new GetConfigurationAssignmentArgs();

    /**
     * Configuration assignment name
     * 
     */
    @InputImport(name="configurationAssignmentName", required=true)
      private final String configurationAssignmentName;

    public String getConfigurationAssignmentName() {
        return this.configurationAssignmentName;
    }

    /**
     * Resource provider name
     * 
     */
    @InputImport(name="providerName", required=true)
      private final String providerName;

    public String getProviderName() {
        return this.providerName;
    }

    /**
     * Resource group name
     * 
     */
    @InputImport(name="resourceGroupName", required=true)
      private final String resourceGroupName;

    public String getResourceGroupName() {
        return this.resourceGroupName;
    }

    /**
     * Resource identifier
     * 
     */
    @InputImport(name="resourceName", required=true)
      private final String resourceName;

    public String getPropResourceName() {
        return this.resourceName;
    }

    /**
     * Resource type
     * 
     */
    @InputImport(name="resourceType", required=true)
      private final String resourceType;

    public String getPropResourceType() {
        return this.resourceType;
    }

    public GetConfigurationAssignmentArgs(
        String configurationAssignmentName,
        String providerName,
        String resourceGroupName,
        String resourceName,
        String resourceType) {
        this.configurationAssignmentName = Objects.requireNonNull(configurationAssignmentName, "expected parameter 'configurationAssignmentName' to be non-null");
        this.providerName = Objects.requireNonNull(providerName, "expected parameter 'providerName' to be non-null");
        this.resourceGroupName = Objects.requireNonNull(resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
        this.resourceName = Objects.requireNonNull(resourceName, "expected parameter 'resourceName' to be non-null");
        this.resourceType = Objects.requireNonNull(resourceType, "expected parameter 'resourceType' to be non-null");
    }

    private GetConfigurationAssignmentArgs() {
        this.configurationAssignmentName = null;
        this.providerName = null;
        this.resourceGroupName = null;
        this.resourceName = null;
        this.resourceType = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetConfigurationAssignmentArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String configurationAssignmentName;
        private String providerName;
        private String resourceGroupName;
        private String resourceName;
        private String resourceType;

        public Builder() {
    	      // Empty
        }

        public Builder(GetConfigurationAssignmentArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.configurationAssignmentName = defaults.configurationAssignmentName;
    	      this.providerName = defaults.providerName;
    	      this.resourceGroupName = defaults.resourceGroupName;
    	      this.resourceName = defaults.resourceName;
    	      this.resourceType = defaults.resourceType;
        }

        public Builder setConfigurationAssignmentName(String configurationAssignmentName) {
            this.configurationAssignmentName = Objects.requireNonNull(configurationAssignmentName);
            return this;
        }

        public Builder setProviderName(String providerName) {
            this.providerName = Objects.requireNonNull(providerName);
            return this;
        }

        public Builder setResourceGroupName(String resourceGroupName) {
            this.resourceGroupName = Objects.requireNonNull(resourceGroupName);
            return this;
        }

        public Builder setResourceName(String resourceName) {
            this.resourceName = Objects.requireNonNull(resourceName);
            return this;
        }

        public Builder setResourceType(String resourceType) {
            this.resourceType = Objects.requireNonNull(resourceType);
            return this;
        }
        public GetConfigurationAssignmentArgs build() {
            return new GetConfigurationAssignmentArgs(configurationAssignmentName, providerName, resourceGroupName, resourceName, resourceType);
        }
    }
}
