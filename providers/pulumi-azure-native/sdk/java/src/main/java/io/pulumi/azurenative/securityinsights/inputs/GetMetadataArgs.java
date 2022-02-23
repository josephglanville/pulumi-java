// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.securityinsights.inputs;

import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;


public final class GetMetadataArgs extends io.pulumi.resources.InvokeArgs {

    public static final GetMetadataArgs Empty = new GetMetadataArgs();

    /**
     * The Metadata name.
     * 
     */
    @InputImport(name="metadataName", required=true)
      private final String metadataName;

    public String getMetadataName() {
        return this.metadataName;
    }

    /**
     * The namespace of workspaces resource provider- Microsoft.OperationalInsights.
     * 
     */
    @InputImport(name="operationalInsightsResourceProvider", required=true)
      private final String operationalInsightsResourceProvider;

    public String getOperationalInsightsResourceProvider() {
        return this.operationalInsightsResourceProvider;
    }

    /**
     * The name of the resource group. The name is case insensitive.
     * 
     */
    @InputImport(name="resourceGroupName", required=true)
      private final String resourceGroupName;

    public String getResourceGroupName() {
        return this.resourceGroupName;
    }

    /**
     * The name of the workspace.
     * 
     */
    @InputImport(name="workspaceName", required=true)
      private final String workspaceName;

    public String getWorkspaceName() {
        return this.workspaceName;
    }

    public GetMetadataArgs(
        String metadataName,
        String operationalInsightsResourceProvider,
        String resourceGroupName,
        String workspaceName) {
        this.metadataName = Objects.requireNonNull(metadataName, "expected parameter 'metadataName' to be non-null");
        this.operationalInsightsResourceProvider = Objects.requireNonNull(operationalInsightsResourceProvider, "expected parameter 'operationalInsightsResourceProvider' to be non-null");
        this.resourceGroupName = Objects.requireNonNull(resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
        this.workspaceName = Objects.requireNonNull(workspaceName, "expected parameter 'workspaceName' to be non-null");
    }

    private GetMetadataArgs() {
        this.metadataName = null;
        this.operationalInsightsResourceProvider = null;
        this.resourceGroupName = null;
        this.workspaceName = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetMetadataArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String metadataName;
        private String operationalInsightsResourceProvider;
        private String resourceGroupName;
        private String workspaceName;

        public Builder() {
    	      // Empty
        }

        public Builder(GetMetadataArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.metadataName = defaults.metadataName;
    	      this.operationalInsightsResourceProvider = defaults.operationalInsightsResourceProvider;
    	      this.resourceGroupName = defaults.resourceGroupName;
    	      this.workspaceName = defaults.workspaceName;
        }

        public Builder setMetadataName(String metadataName) {
            this.metadataName = Objects.requireNonNull(metadataName);
            return this;
        }

        public Builder setOperationalInsightsResourceProvider(String operationalInsightsResourceProvider) {
            this.operationalInsightsResourceProvider = Objects.requireNonNull(operationalInsightsResourceProvider);
            return this;
        }

        public Builder setResourceGroupName(String resourceGroupName) {
            this.resourceGroupName = Objects.requireNonNull(resourceGroupName);
            return this;
        }

        public Builder setWorkspaceName(String workspaceName) {
            this.workspaceName = Objects.requireNonNull(workspaceName);
            return this;
        }
        public GetMetadataArgs build() {
            return new GetMetadataArgs(metadataName, operationalInsightsResourceProvider, resourceGroupName, workspaceName);
        }
    }
}
