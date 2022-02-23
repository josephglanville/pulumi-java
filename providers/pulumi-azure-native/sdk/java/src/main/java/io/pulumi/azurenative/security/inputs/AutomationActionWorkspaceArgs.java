// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.security.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * The Log Analytics Workspace to which event data will be exported. Security alerts data will reside in the 'SecurityAlert' table and the assessments data will reside in the 'SecurityRecommendation' table (under the 'Security'/'SecurityCenterFree' solutions). Note that in order to view the data in the workspace, the Security Center Log Analytics free/standard solution needs to be enabled on that workspace. To learn more about Security Center continuous export capabilities, visit https://aka.ms/ASCExportLearnMore
 * 
 */
public final class AutomationActionWorkspaceArgs extends io.pulumi.resources.ResourceArgs {

    public static final AutomationActionWorkspaceArgs Empty = new AutomationActionWorkspaceArgs();

    /**
     * The type of the action that will be triggered by the Automation
     * Expected value is 'Workspace'.
     * 
     */
    @InputImport(name="actionType", required=true)
      private final Input<String> actionType;

    public Input<String> getActionType() {
        return this.actionType;
    }

    /**
     * The fully qualified Log Analytics Workspace Azure Resource ID.
     * 
     */
    @InputImport(name="workspaceResourceId")
      private final @Nullable Input<String> workspaceResourceId;

    public Input<String> getWorkspaceResourceId() {
        return this.workspaceResourceId == null ? Input.empty() : this.workspaceResourceId;
    }

    public AutomationActionWorkspaceArgs(
        Input<String> actionType,
        @Nullable Input<String> workspaceResourceId) {
        this.actionType = Objects.requireNonNull(actionType, "expected parameter 'actionType' to be non-null");
        this.workspaceResourceId = workspaceResourceId;
    }

    private AutomationActionWorkspaceArgs() {
        this.actionType = Input.empty();
        this.workspaceResourceId = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(AutomationActionWorkspaceArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Input<String> actionType;
        private @Nullable Input<String> workspaceResourceId;

        public Builder() {
    	      // Empty
        }

        public Builder(AutomationActionWorkspaceArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.actionType = defaults.actionType;
    	      this.workspaceResourceId = defaults.workspaceResourceId;
        }

        public Builder setActionType(Input<String> actionType) {
            this.actionType = Objects.requireNonNull(actionType);
            return this;
        }

        public Builder setActionType(String actionType) {
            this.actionType = Input.of(Objects.requireNonNull(actionType));
            return this;
        }

        public Builder setWorkspaceResourceId(@Nullable Input<String> workspaceResourceId) {
            this.workspaceResourceId = workspaceResourceId;
            return this;
        }

        public Builder setWorkspaceResourceId(@Nullable String workspaceResourceId) {
            this.workspaceResourceId = Input.ofNullable(workspaceResourceId);
            return this;
        }
        public AutomationActionWorkspaceArgs build() {
            return new AutomationActionWorkspaceArgs(actionType, workspaceResourceId);
        }
    }
}
