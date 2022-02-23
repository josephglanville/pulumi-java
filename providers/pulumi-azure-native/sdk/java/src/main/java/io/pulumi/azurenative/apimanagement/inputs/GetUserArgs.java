// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.apimanagement.inputs;

import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;


public final class GetUserArgs extends io.pulumi.resources.InvokeArgs {

    public static final GetUserArgs Empty = new GetUserArgs();

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

    /**
     * User identifier. Must be unique in the current API Management service instance.
     * 
     */
    @InputImport(name="userId", required=true)
      private final String userId;

    public String getUserId() {
        return this.userId;
    }

    public GetUserArgs(
        String resourceGroupName,
        String serviceName,
        String userId) {
        this.resourceGroupName = Objects.requireNonNull(resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
        this.serviceName = Objects.requireNonNull(serviceName, "expected parameter 'serviceName' to be non-null");
        this.userId = Objects.requireNonNull(userId, "expected parameter 'userId' to be non-null");
    }

    private GetUserArgs() {
        this.resourceGroupName = null;
        this.serviceName = null;
        this.userId = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetUserArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String resourceGroupName;
        private String serviceName;
        private String userId;

        public Builder() {
    	      // Empty
        }

        public Builder(GetUserArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.resourceGroupName = defaults.resourceGroupName;
    	      this.serviceName = defaults.serviceName;
    	      this.userId = defaults.userId;
        }

        public Builder setResourceGroupName(String resourceGroupName) {
            this.resourceGroupName = Objects.requireNonNull(resourceGroupName);
            return this;
        }

        public Builder setServiceName(String serviceName) {
            this.serviceName = Objects.requireNonNull(serviceName);
            return this;
        }

        public Builder setUserId(String userId) {
            this.userId = Objects.requireNonNull(userId);
            return this;
        }
        public GetUserArgs build() {
            return new GetUserArgs(resourceGroupName, serviceName, userId);
        }
    }
}
