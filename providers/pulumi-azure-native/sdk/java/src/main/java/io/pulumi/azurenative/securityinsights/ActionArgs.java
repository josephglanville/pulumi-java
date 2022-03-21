// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.securityinsights;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class ActionArgs extends io.pulumi.resources.ResourceArgs {

    public static final ActionArgs Empty = new ActionArgs();

    /**
     * Action ID
     * 
     */
    @Import(name="actionId")
      private final @Nullable Output<String> actionId;

    public Output<String> getActionId() {
        return this.actionId == null ? Output.empty() : this.actionId;
    }

    /**
     * Logic App Resource Id, /subscriptions/{my-subscription}/resourceGroups/{my-resource-group}/providers/Microsoft.Logic/workflows/{my-workflow-id}.
     * 
     */
    @Import(name="logicAppResourceId", required=true)
      private final Output<String> logicAppResourceId;

    public Output<String> getLogicAppResourceId() {
        return this.logicAppResourceId;
    }

    /**
     * The name of the resource group within the user's subscription. The name is case insensitive.
     * 
     */
    @Import(name="resourceGroupName", required=true)
      private final Output<String> resourceGroupName;

    public Output<String> getResourceGroupName() {
        return this.resourceGroupName;
    }

    /**
     * Alert rule ID
     * 
     */
    @Import(name="ruleId", required=true)
      private final Output<String> ruleId;

    public Output<String> getRuleId() {
        return this.ruleId;
    }

    /**
     * Logic App Callback URL for this specific workflow.
     * 
     */
    @Import(name="triggerUri", required=true)
      private final Output<String> triggerUri;

    public Output<String> getTriggerUri() {
        return this.triggerUri;
    }

    /**
     * The name of the workspace.
     * 
     */
    @Import(name="workspaceName", required=true)
      private final Output<String> workspaceName;

    public Output<String> getWorkspaceName() {
        return this.workspaceName;
    }

    public ActionArgs(
        @Nullable Output<String> actionId,
        Output<String> logicAppResourceId,
        Output<String> resourceGroupName,
        Output<String> ruleId,
        Output<String> triggerUri,
        Output<String> workspaceName) {
        this.actionId = actionId;
        this.logicAppResourceId = Objects.requireNonNull(logicAppResourceId, "expected parameter 'logicAppResourceId' to be non-null");
        this.resourceGroupName = Objects.requireNonNull(resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
        this.ruleId = Objects.requireNonNull(ruleId, "expected parameter 'ruleId' to be non-null");
        this.triggerUri = Objects.requireNonNull(triggerUri, "expected parameter 'triggerUri' to be non-null");
        this.workspaceName = Objects.requireNonNull(workspaceName, "expected parameter 'workspaceName' to be non-null");
    }

    private ActionArgs() {
        this.actionId = Output.empty();
        this.logicAppResourceId = Output.empty();
        this.resourceGroupName = Output.empty();
        this.ruleId = Output.empty();
        this.triggerUri = Output.empty();
        this.workspaceName = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ActionArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<String> actionId;
        private Output<String> logicAppResourceId;
        private Output<String> resourceGroupName;
        private Output<String> ruleId;
        private Output<String> triggerUri;
        private Output<String> workspaceName;

        public Builder() {
    	      // Empty
        }

        public Builder(ActionArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.actionId = defaults.actionId;
    	      this.logicAppResourceId = defaults.logicAppResourceId;
    	      this.resourceGroupName = defaults.resourceGroupName;
    	      this.ruleId = defaults.ruleId;
    	      this.triggerUri = defaults.triggerUri;
    	      this.workspaceName = defaults.workspaceName;
        }

        public Builder actionId(@Nullable Output<String> actionId) {
            this.actionId = actionId;
            return this;
        }
        public Builder actionId(@Nullable String actionId) {
            this.actionId = Output.ofNullable(actionId);
            return this;
        }
        public Builder logicAppResourceId(Output<String> logicAppResourceId) {
            this.logicAppResourceId = Objects.requireNonNull(logicAppResourceId);
            return this;
        }
        public Builder logicAppResourceId(String logicAppResourceId) {
            this.logicAppResourceId = Output.of(Objects.requireNonNull(logicAppResourceId));
            return this;
        }
        public Builder resourceGroupName(Output<String> resourceGroupName) {
            this.resourceGroupName = Objects.requireNonNull(resourceGroupName);
            return this;
        }
        public Builder resourceGroupName(String resourceGroupName) {
            this.resourceGroupName = Output.of(Objects.requireNonNull(resourceGroupName));
            return this;
        }
        public Builder ruleId(Output<String> ruleId) {
            this.ruleId = Objects.requireNonNull(ruleId);
            return this;
        }
        public Builder ruleId(String ruleId) {
            this.ruleId = Output.of(Objects.requireNonNull(ruleId));
            return this;
        }
        public Builder triggerUri(Output<String> triggerUri) {
            this.triggerUri = Objects.requireNonNull(triggerUri);
            return this;
        }
        public Builder triggerUri(String triggerUri) {
            this.triggerUri = Output.of(Objects.requireNonNull(triggerUri));
            return this;
        }
        public Builder workspaceName(Output<String> workspaceName) {
            this.workspaceName = Objects.requireNonNull(workspaceName);
            return this;
        }
        public Builder workspaceName(String workspaceName) {
            this.workspaceName = Output.of(Objects.requireNonNull(workspaceName));
            return this;
        }        public ActionArgs build() {
            return new ActionArgs(actionId, logicAppResourceId, resourceGroupName, ruleId, triggerUri, workspaceName);
        }
    }
}
