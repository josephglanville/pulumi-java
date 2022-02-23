// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.apimanagement.inputs;

import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;


public final class GetGatewayHostnameConfigurationArgs extends io.pulumi.resources.InvokeArgs {

    public static final GetGatewayHostnameConfigurationArgs Empty = new GetGatewayHostnameConfigurationArgs();

    /**
     * Gateway entity identifier. Must be unique in the current API Management service instance. Must not have value 'managed'
     * 
     */
    @InputImport(name="gatewayId", required=true)
      private final String gatewayId;

    public String getGatewayId() {
        return this.gatewayId;
    }

    /**
     * Gateway hostname configuration identifier. Must be unique in the scope of parent Gateway entity.
     * 
     */
    @InputImport(name="hcId", required=true)
      private final String hcId;

    public String getHcId() {
        return this.hcId;
    }

    /**
     * The name of the resource group.
     * 
     */
    @InputImport(name="resourceGroupName", required=true)
      private final String resourceGroupName;

    public String getResourceGroupName() {
        return this.resourceGroupName;
    }

    /**
     * The name of the API Management service.
     * 
     */
    @InputImport(name="serviceName", required=true)
      private final String serviceName;

    public String getServiceName() {
        return this.serviceName;
    }

    public GetGatewayHostnameConfigurationArgs(
        String gatewayId,
        String hcId,
        String resourceGroupName,
        String serviceName) {
        this.gatewayId = Objects.requireNonNull(gatewayId, "expected parameter 'gatewayId' to be non-null");
        this.hcId = Objects.requireNonNull(hcId, "expected parameter 'hcId' to be non-null");
        this.resourceGroupName = Objects.requireNonNull(resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
        this.serviceName = Objects.requireNonNull(serviceName, "expected parameter 'serviceName' to be non-null");
    }

    private GetGatewayHostnameConfigurationArgs() {
        this.gatewayId = null;
        this.hcId = null;
        this.resourceGroupName = null;
        this.serviceName = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetGatewayHostnameConfigurationArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String gatewayId;
        private String hcId;
        private String resourceGroupName;
        private String serviceName;

        public Builder() {
    	      // Empty
        }

        public Builder(GetGatewayHostnameConfigurationArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.gatewayId = defaults.gatewayId;
    	      this.hcId = defaults.hcId;
    	      this.resourceGroupName = defaults.resourceGroupName;
    	      this.serviceName = defaults.serviceName;
        }

        public Builder setGatewayId(String gatewayId) {
            this.gatewayId = Objects.requireNonNull(gatewayId);
            return this;
        }

        public Builder setHcId(String hcId) {
            this.hcId = Objects.requireNonNull(hcId);
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
        public GetGatewayHostnameConfigurationArgs build() {
            return new GetGatewayHostnameConfigurationArgs(gatewayId, hcId, resourceGroupName, serviceName);
        }
    }
}
