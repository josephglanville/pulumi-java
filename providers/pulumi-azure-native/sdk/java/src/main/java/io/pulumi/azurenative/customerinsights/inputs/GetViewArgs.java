// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.customerinsights.inputs;

import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;


public final class GetViewArgs extends io.pulumi.resources.InvokeArgs {

    public static final GetViewArgs Empty = new GetViewArgs();

    /**
     * The name of the hub.
     * 
     */
    @InputImport(name="hubName", required=true)
      private final String hubName;

    public String getHubName() {
        return this.hubName;
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
     * The user ID. Use * to retrieve hub level view.
     * 
     */
    @InputImport(name="userId", required=true)
      private final String userId;

    public String getUserId() {
        return this.userId;
    }

    /**
     * The name of the view.
     * 
     */
    @InputImport(name="viewName", required=true)
      private final String viewName;

    public String getViewName() {
        return this.viewName;
    }

    public GetViewArgs(
        String hubName,
        String resourceGroupName,
        String userId,
        String viewName) {
        this.hubName = Objects.requireNonNull(hubName, "expected parameter 'hubName' to be non-null");
        this.resourceGroupName = Objects.requireNonNull(resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
        this.userId = Objects.requireNonNull(userId, "expected parameter 'userId' to be non-null");
        this.viewName = Objects.requireNonNull(viewName, "expected parameter 'viewName' to be non-null");
    }

    private GetViewArgs() {
        this.hubName = null;
        this.resourceGroupName = null;
        this.userId = null;
        this.viewName = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetViewArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String hubName;
        private String resourceGroupName;
        private String userId;
        private String viewName;

        public Builder() {
    	      // Empty
        }

        public Builder(GetViewArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.hubName = defaults.hubName;
    	      this.resourceGroupName = defaults.resourceGroupName;
    	      this.userId = defaults.userId;
    	      this.viewName = defaults.viewName;
        }

        public Builder setHubName(String hubName) {
            this.hubName = Objects.requireNonNull(hubName);
            return this;
        }

        public Builder setResourceGroupName(String resourceGroupName) {
            this.resourceGroupName = Objects.requireNonNull(resourceGroupName);
            return this;
        }

        public Builder setUserId(String userId) {
            this.userId = Objects.requireNonNull(userId);
            return this;
        }

        public Builder setViewName(String viewName) {
            this.viewName = Objects.requireNonNull(viewName);
            return this;
        }
        public GetViewArgs build() {
            return new GetViewArgs(hubName, resourceGroupName, userId, viewName);
        }
    }
}
