// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.apimanagement.inputs;

import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;


public final class GetBackendArgs extends io.pulumi.resources.InvokeArgs {

    public static final GetBackendArgs Empty = new GetBackendArgs();

    /**
     * Identifier of the Backend entity. Must be unique in the current API Management service instance.
     * 
     */
    @InputImport(name="backendId", required=true)
      private final String backendId;

    public String getBackendId() {
        return this.backendId;
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

    public GetBackendArgs(
        String backendId,
        String resourceGroupName,
        String serviceName) {
        this.backendId = Objects.requireNonNull(backendId, "expected parameter 'backendId' to be non-null");
        this.resourceGroupName = Objects.requireNonNull(resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
        this.serviceName = Objects.requireNonNull(serviceName, "expected parameter 'serviceName' to be non-null");
    }

    private GetBackendArgs() {
        this.backendId = null;
        this.resourceGroupName = null;
        this.serviceName = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetBackendArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String backendId;
        private String resourceGroupName;
        private String serviceName;

        public Builder() {
    	      // Empty
        }

        public Builder(GetBackendArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.backendId = defaults.backendId;
    	      this.resourceGroupName = defaults.resourceGroupName;
    	      this.serviceName = defaults.serviceName;
        }

        public Builder setBackendId(String backendId) {
            this.backendId = Objects.requireNonNull(backendId);
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
        public GetBackendArgs build() {
            return new GetBackendArgs(backendId, resourceGroupName, serviceName);
        }
    }
}
