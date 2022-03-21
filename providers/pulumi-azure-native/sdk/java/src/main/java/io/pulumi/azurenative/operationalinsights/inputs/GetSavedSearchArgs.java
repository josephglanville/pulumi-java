// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.operationalinsights.inputs;

import io.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


public final class GetSavedSearchArgs extends io.pulumi.resources.InvokeArgs {

    public static final GetSavedSearchArgs Empty = new GetSavedSearchArgs();

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
     * The id of the saved search.
     * 
     */
    @Import(name="savedSearchId", required=true)
      private final String savedSearchId;

    public String getSavedSearchId() {
        return this.savedSearchId;
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

    public GetSavedSearchArgs(
        String resourceGroupName,
        String savedSearchId,
        String workspaceName) {
        this.resourceGroupName = Objects.requireNonNull(resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
        this.savedSearchId = Objects.requireNonNull(savedSearchId, "expected parameter 'savedSearchId' to be non-null");
        this.workspaceName = Objects.requireNonNull(workspaceName, "expected parameter 'workspaceName' to be non-null");
    }

    private GetSavedSearchArgs() {
        this.resourceGroupName = null;
        this.savedSearchId = null;
        this.workspaceName = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetSavedSearchArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String resourceGroupName;
        private String savedSearchId;
        private String workspaceName;

        public Builder() {
    	      // Empty
        }

        public Builder(GetSavedSearchArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.resourceGroupName = defaults.resourceGroupName;
    	      this.savedSearchId = defaults.savedSearchId;
    	      this.workspaceName = defaults.workspaceName;
        }

        public Builder resourceGroupName(String resourceGroupName) {
            this.resourceGroupName = Objects.requireNonNull(resourceGroupName);
            return this;
        }
        public Builder savedSearchId(String savedSearchId) {
            this.savedSearchId = Objects.requireNonNull(savedSearchId);
            return this;
        }
        public Builder workspaceName(String workspaceName) {
            this.workspaceName = Objects.requireNonNull(workspaceName);
            return this;
        }        public GetSavedSearchArgs build() {
            return new GetSavedSearchArgs(resourceGroupName, savedSearchId, workspaceName);
        }
    }
}
