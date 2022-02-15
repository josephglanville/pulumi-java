// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.securityinsights.inputs;

import io.pulumi.core.internal.annotations.InputImport;
import java.lang.String;
import java.util.Objects;


public final class GetEntityQueryArgs extends io.pulumi.resources.InvokeArgs {

    public static final GetEntityQueryArgs Empty = new GetEntityQueryArgs();

    @InputImport(name="entityQueryId", required=true)
    private final String entityQueryId;

    public String getEntityQueryId() {
        return this.entityQueryId;
    }

    @InputImport(name="operationalInsightsResourceProvider", required=true)
    private final String operationalInsightsResourceProvider;

    public String getOperationalInsightsResourceProvider() {
        return this.operationalInsightsResourceProvider;
    }

    @InputImport(name="resourceGroupName", required=true)
    private final String resourceGroupName;

    public String getResourceGroupName() {
        return this.resourceGroupName;
    }

    @InputImport(name="workspaceName", required=true)
    private final String workspaceName;

    public String getWorkspaceName() {
        return this.workspaceName;
    }

    public GetEntityQueryArgs(
        String entityQueryId,
        String operationalInsightsResourceProvider,
        String resourceGroupName,
        String workspaceName) {
        this.entityQueryId = Objects.requireNonNull(entityQueryId, "expected parameter 'entityQueryId' to be non-null");
        this.operationalInsightsResourceProvider = Objects.requireNonNull(operationalInsightsResourceProvider, "expected parameter 'operationalInsightsResourceProvider' to be non-null");
        this.resourceGroupName = Objects.requireNonNull(resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
        this.workspaceName = Objects.requireNonNull(workspaceName, "expected parameter 'workspaceName' to be non-null");
    }

    private GetEntityQueryArgs() {
        this.entityQueryId = null;
        this.operationalInsightsResourceProvider = null;
        this.resourceGroupName = null;
        this.workspaceName = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetEntityQueryArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String entityQueryId;
        private String operationalInsightsResourceProvider;
        private String resourceGroupName;
        private String workspaceName;

        public Builder() {
    	      // Empty
        }

        public Builder(GetEntityQueryArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.entityQueryId = defaults.entityQueryId;
    	      this.operationalInsightsResourceProvider = defaults.operationalInsightsResourceProvider;
    	      this.resourceGroupName = defaults.resourceGroupName;
    	      this.workspaceName = defaults.workspaceName;
        }

        public Builder setEntityQueryId(String entityQueryId) {
            this.entityQueryId = Objects.requireNonNull(entityQueryId);
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

        public GetEntityQueryArgs build() {
            return new GetEntityQueryArgs(entityQueryId, operationalInsightsResourceProvider, resourceGroupName, workspaceName);
        }
    }
}