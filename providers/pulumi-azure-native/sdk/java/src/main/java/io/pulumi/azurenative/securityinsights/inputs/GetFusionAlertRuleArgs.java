// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.securityinsights.inputs;

import io.pulumi.core.internal.annotations.InputImport;
import java.lang.String;
import java.util.Objects;


public final class GetFusionAlertRuleArgs extends io.pulumi.resources.InvokeArgs {

    public static final GetFusionAlertRuleArgs Empty = new GetFusionAlertRuleArgs();

    @InputImport(name="resourceGroupName", required=true)
    private final String resourceGroupName;

    public String getResourceGroupName() {
        return this.resourceGroupName;
    }

    @InputImport(name="ruleId", required=true)
    private final String ruleId;

    public String getRuleId() {
        return this.ruleId;
    }

    @InputImport(name="workspaceName", required=true)
    private final String workspaceName;

    public String getWorkspaceName() {
        return this.workspaceName;
    }

    public GetFusionAlertRuleArgs(
        String resourceGroupName,
        String ruleId,
        String workspaceName) {
        this.resourceGroupName = Objects.requireNonNull(resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
        this.ruleId = Objects.requireNonNull(ruleId, "expected parameter 'ruleId' to be non-null");
        this.workspaceName = Objects.requireNonNull(workspaceName, "expected parameter 'workspaceName' to be non-null");
    }

    private GetFusionAlertRuleArgs() {
        this.resourceGroupName = null;
        this.ruleId = null;
        this.workspaceName = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetFusionAlertRuleArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String resourceGroupName;
        private String ruleId;
        private String workspaceName;

        public Builder() {
    	      // Empty
        }

        public Builder(GetFusionAlertRuleArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.resourceGroupName = defaults.resourceGroupName;
    	      this.ruleId = defaults.ruleId;
    	      this.workspaceName = defaults.workspaceName;
        }

        public Builder setResourceGroupName(String resourceGroupName) {
            this.resourceGroupName = Objects.requireNonNull(resourceGroupName);
            return this;
        }

        public Builder setRuleId(String ruleId) {
            this.ruleId = Objects.requireNonNull(ruleId);
            return this;
        }

        public Builder setWorkspaceName(String workspaceName) {
            this.workspaceName = Objects.requireNonNull(workspaceName);
            return this;
        }

        public GetFusionAlertRuleArgs build() {
            return new GetFusionAlertRuleArgs(resourceGroupName, ruleId, workspaceName);
        }
    }
}
