// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.operationalinsights.inputs;

import io.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


public final class GetStorageInsightConfigArgs extends io.pulumi.resources.InvokeArgs {

    public static final GetStorageInsightConfigArgs Empty = new GetStorageInsightConfigArgs();

    /**
     * The name of the resource group. The name is case insensitive.
     * 
     */
    @Import(name="resourceGroupName", required=true)
      private final String resourceGroupName;

    public String getResourceGroupName() {
        return this.resourceGroupName;
    }

    /**
     * Name of the storageInsightsConfigs resource
     * 
     */
    @Import(name="storageInsightName", required=true)
      private final String storageInsightName;

    public String getStorageInsightName() {
        return this.storageInsightName;
    }

    /**
     * The name of the workspace.
     * 
     */
    @Import(name="workspaceName", required=true)
      private final String workspaceName;

    public String getWorkspaceName() {
        return this.workspaceName;
    }

    public GetStorageInsightConfigArgs(
        String resourceGroupName,
        String storageInsightName,
        String workspaceName) {
        this.resourceGroupName = Objects.requireNonNull(resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
        this.storageInsightName = Objects.requireNonNull(storageInsightName, "expected parameter 'storageInsightName' to be non-null");
        this.workspaceName = Objects.requireNonNull(workspaceName, "expected parameter 'workspaceName' to be non-null");
    }

    private GetStorageInsightConfigArgs() {
        this.resourceGroupName = null;
        this.storageInsightName = null;
        this.workspaceName = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetStorageInsightConfigArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String resourceGroupName;
        private String storageInsightName;
        private String workspaceName;

        public Builder() {
    	      // Empty
        }

        public Builder(GetStorageInsightConfigArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.resourceGroupName = defaults.resourceGroupName;
    	      this.storageInsightName = defaults.storageInsightName;
    	      this.workspaceName = defaults.workspaceName;
        }

        public Builder resourceGroupName(String resourceGroupName) {
            this.resourceGroupName = Objects.requireNonNull(resourceGroupName);
            return this;
        }
        public Builder storageInsightName(String storageInsightName) {
            this.storageInsightName = Objects.requireNonNull(storageInsightName);
            return this;
        }
        public Builder workspaceName(String workspaceName) {
            this.workspaceName = Objects.requireNonNull(workspaceName);
            return this;
        }        public GetStorageInsightConfigArgs build() {
            return new GetStorageInsightConfigArgs(resourceGroupName, storageInsightName, workspaceName);
        }
    }
}
