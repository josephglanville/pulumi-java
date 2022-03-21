// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.securityinsights.inputs;

import io.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


public final class GetAutomationRuleArgs extends io.pulumi.resources.InvokeArgs {

    public static final GetAutomationRuleArgs Empty = new GetAutomationRuleArgs();

    /**
     * Automation rule ID
     * 
     */
    @Import(name="automationRuleId", required=true)
      private final String automationRuleId;

    public String getAutomationRuleId() {
        return this.automationRuleId;
    }

    /**
     * The namespace of workspaces resource provider- Microsoft.OperationalInsights.
     * 
     */
    @Import(name="operationalInsightsResourceProvider", required=true)
      private final String operationalInsightsResourceProvider;

    public String getOperationalInsightsResourceProvider() {
        return this.operationalInsightsResourceProvider;
    }

    /**
     * The name of the resource group within the user's subscription. The name is case insensitive.
     * 
     */
    @Import(name="resourceGroupName", required=true)
      private final String resourceGroupName;

    public String getResourceGroupName() {
        return this.resourceGroupName;
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

    public GetAutomationRuleArgs(
        String automationRuleId,
        String operationalInsightsResourceProvider,
        String resourceGroupName,
        String workspaceName) {
        this.automationRuleId = Objects.requireNonNull(automationRuleId, "expected parameter 'automationRuleId' to be non-null");
        this.operationalInsightsResourceProvider = Objects.requireNonNull(operationalInsightsResourceProvider, "expected parameter 'operationalInsightsResourceProvider' to be non-null");
        this.resourceGroupName = Objects.requireNonNull(resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
        this.workspaceName = Objects.requireNonNull(workspaceName, "expected parameter 'workspaceName' to be non-null");
    }

    private GetAutomationRuleArgs() {
        this.automationRuleId = null;
        this.operationalInsightsResourceProvider = null;
        this.resourceGroupName = null;
        this.workspaceName = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetAutomationRuleArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String automationRuleId;
        private String operationalInsightsResourceProvider;
        private String resourceGroupName;
        private String workspaceName;

        public Builder() {
    	      // Empty
        }

        public Builder(GetAutomationRuleArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.automationRuleId = defaults.automationRuleId;
    	      this.operationalInsightsResourceProvider = defaults.operationalInsightsResourceProvider;
    	      this.resourceGroupName = defaults.resourceGroupName;
    	      this.workspaceName = defaults.workspaceName;
        }

        public Builder automationRuleId(String automationRuleId) {
            this.automationRuleId = Objects.requireNonNull(automationRuleId);
            return this;
        }
        public Builder operationalInsightsResourceProvider(String operationalInsightsResourceProvider) {
            this.operationalInsightsResourceProvider = Objects.requireNonNull(operationalInsightsResourceProvider);
            return this;
        }
        public Builder resourceGroupName(String resourceGroupName) {
            this.resourceGroupName = Objects.requireNonNull(resourceGroupName);
            return this;
        }
        public Builder workspaceName(String workspaceName) {
            this.workspaceName = Objects.requireNonNull(workspaceName);
            return this;
        }        public GetAutomationRuleArgs build() {
            return new GetAutomationRuleArgs(automationRuleId, operationalInsightsResourceProvider, resourceGroupName, workspaceName);
        }
    }
}
