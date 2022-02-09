// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.securityinsights.inputs;

import io.pulumi.core.internal.annotations.InputImport;
import java.lang.String;
import java.util.Objects;


public final class GetIncidentCommentArgs extends io.pulumi.resources.InvokeArgs {

    public static final GetIncidentCommentArgs Empty = new GetIncidentCommentArgs();

    @InputImport(name="incidentCommentId", required=true)
    private final String incidentCommentId;

    public String getIncidentCommentId() {
        return this.incidentCommentId;
    }

    @InputImport(name="incidentId", required=true)
    private final String incidentId;

    public String getIncidentId() {
        return this.incidentId;
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

    public GetIncidentCommentArgs(
        String incidentCommentId,
        String incidentId,
        String operationalInsightsResourceProvider,
        String resourceGroupName,
        String workspaceName) {
        this.incidentCommentId = Objects.requireNonNull(incidentCommentId, "expected parameter 'incidentCommentId' to be non-null");
        this.incidentId = Objects.requireNonNull(incidentId, "expected parameter 'incidentId' to be non-null");
        this.operationalInsightsResourceProvider = Objects.requireNonNull(operationalInsightsResourceProvider, "expected parameter 'operationalInsightsResourceProvider' to be non-null");
        this.resourceGroupName = Objects.requireNonNull(resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
        this.workspaceName = Objects.requireNonNull(workspaceName, "expected parameter 'workspaceName' to be non-null");
    }

    private GetIncidentCommentArgs() {
        this.incidentCommentId = null;
        this.incidentId = null;
        this.operationalInsightsResourceProvider = null;
        this.resourceGroupName = null;
        this.workspaceName = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetIncidentCommentArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String incidentCommentId;
        private String incidentId;
        private String operationalInsightsResourceProvider;
        private String resourceGroupName;
        private String workspaceName;

        public Builder() {
    	      // Empty
        }

        public Builder(GetIncidentCommentArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.incidentCommentId = defaults.incidentCommentId;
    	      this.incidentId = defaults.incidentId;
    	      this.operationalInsightsResourceProvider = defaults.operationalInsightsResourceProvider;
    	      this.resourceGroupName = defaults.resourceGroupName;
    	      this.workspaceName = defaults.workspaceName;
        }

        public Builder setIncidentCommentId(String incidentCommentId) {
            this.incidentCommentId = Objects.requireNonNull(incidentCommentId);
            return this;
        }

        public Builder setIncidentId(String incidentId) {
            this.incidentId = Objects.requireNonNull(incidentId);
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

        public GetIncidentCommentArgs build() {
            return new GetIncidentCommentArgs(incidentCommentId, incidentId, operationalInsightsResourceProvider, resourceGroupName, workspaceName);
        }
    }
}
