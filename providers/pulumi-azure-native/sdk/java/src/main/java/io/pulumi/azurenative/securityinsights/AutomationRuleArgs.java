// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.securityinsights;

import io.pulumi.azurenative.securityinsights.inputs.AutomationRuleModifyPropertiesActionArgs;
import io.pulumi.azurenative.securityinsights.inputs.AutomationRuleRunPlaybookActionArgs;
import io.pulumi.azurenative.securityinsights.inputs.AutomationRuleTriggeringLogicArgs;
import io.pulumi.core.Either;
import io.pulumi.core.Input;
import io.pulumi.core.internal.annotations.InputImport;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


public final class AutomationRuleArgs extends io.pulumi.resources.ResourceArgs {

    public static final AutomationRuleArgs Empty = new AutomationRuleArgs();

    @InputImport(name="actions", required=true)
    private final Input<List<Either<AutomationRuleModifyPropertiesActionArgs,AutomationRuleRunPlaybookActionArgs>>> actions;

    public Input<List<Either<AutomationRuleModifyPropertiesActionArgs,AutomationRuleRunPlaybookActionArgs>>> getActions() {
        return this.actions;
    }

    @InputImport(name="automationRuleId")
    private final @Nullable Input<String> automationRuleId;

    public Input<String> getAutomationRuleId() {
        return this.automationRuleId == null ? Input.empty() : this.automationRuleId;
    }

    @InputImport(name="displayName", required=true)
    private final Input<String> displayName;

    public Input<String> getDisplayName() {
        return this.displayName;
    }

    @InputImport(name="operationalInsightsResourceProvider", required=true)
    private final Input<String> operationalInsightsResourceProvider;

    public Input<String> getOperationalInsightsResourceProvider() {
        return this.operationalInsightsResourceProvider;
    }

    @InputImport(name="order", required=true)
    private final Input<Integer> order;

    public Input<Integer> getOrder() {
        return this.order;
    }

    @InputImport(name="resourceGroupName", required=true)
    private final Input<String> resourceGroupName;

    public Input<String> getResourceGroupName() {
        return this.resourceGroupName;
    }

    @InputImport(name="triggeringLogic", required=true)
    private final Input<AutomationRuleTriggeringLogicArgs> triggeringLogic;

    public Input<AutomationRuleTriggeringLogicArgs> getTriggeringLogic() {
        return this.triggeringLogic;
    }

    @InputImport(name="workspaceName", required=true)
    private final Input<String> workspaceName;

    public Input<String> getWorkspaceName() {
        return this.workspaceName;
    }

    public AutomationRuleArgs(
        Input<List<Either<AutomationRuleModifyPropertiesActionArgs,AutomationRuleRunPlaybookActionArgs>>> actions,
        @Nullable Input<String> automationRuleId,
        Input<String> displayName,
        Input<String> operationalInsightsResourceProvider,
        Input<Integer> order,
        Input<String> resourceGroupName,
        Input<AutomationRuleTriggeringLogicArgs> triggeringLogic,
        Input<String> workspaceName) {
        this.actions = Objects.requireNonNull(actions, "expected parameter 'actions' to be non-null");
        this.automationRuleId = automationRuleId;
        this.displayName = Objects.requireNonNull(displayName, "expected parameter 'displayName' to be non-null");
        this.operationalInsightsResourceProvider = Objects.requireNonNull(operationalInsightsResourceProvider, "expected parameter 'operationalInsightsResourceProvider' to be non-null");
        this.order = Objects.requireNonNull(order, "expected parameter 'order' to be non-null");
        this.resourceGroupName = Objects.requireNonNull(resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
        this.triggeringLogic = Objects.requireNonNull(triggeringLogic, "expected parameter 'triggeringLogic' to be non-null");
        this.workspaceName = Objects.requireNonNull(workspaceName, "expected parameter 'workspaceName' to be non-null");
    }

    private AutomationRuleArgs() {
        this.actions = Input.empty();
        this.automationRuleId = Input.empty();
        this.displayName = Input.empty();
        this.operationalInsightsResourceProvider = Input.empty();
        this.order = Input.empty();
        this.resourceGroupName = Input.empty();
        this.triggeringLogic = Input.empty();
        this.workspaceName = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(AutomationRuleArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Input<List<Either<AutomationRuleModifyPropertiesActionArgs,AutomationRuleRunPlaybookActionArgs>>> actions;
        private @Nullable Input<String> automationRuleId;
        private Input<String> displayName;
        private Input<String> operationalInsightsResourceProvider;
        private Input<Integer> order;
        private Input<String> resourceGroupName;
        private Input<AutomationRuleTriggeringLogicArgs> triggeringLogic;
        private Input<String> workspaceName;

        public Builder() {
    	      // Empty
        }

        public Builder(AutomationRuleArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.actions = defaults.actions;
    	      this.automationRuleId = defaults.automationRuleId;
    	      this.displayName = defaults.displayName;
    	      this.operationalInsightsResourceProvider = defaults.operationalInsightsResourceProvider;
    	      this.order = defaults.order;
    	      this.resourceGroupName = defaults.resourceGroupName;
    	      this.triggeringLogic = defaults.triggeringLogic;
    	      this.workspaceName = defaults.workspaceName;
        }

        public Builder setActions(Input<List<Either<AutomationRuleModifyPropertiesActionArgs,AutomationRuleRunPlaybookActionArgs>>> actions) {
            this.actions = Objects.requireNonNull(actions);
            return this;
        }

        public Builder setActions(List<Either<AutomationRuleModifyPropertiesActionArgs,AutomationRuleRunPlaybookActionArgs>> actions) {
            this.actions = Input.of(Objects.requireNonNull(actions));
            return this;
        }

        public Builder setAutomationRuleId(@Nullable Input<String> automationRuleId) {
            this.automationRuleId = automationRuleId;
            return this;
        }

        public Builder setAutomationRuleId(@Nullable String automationRuleId) {
            this.automationRuleId = Input.ofNullable(automationRuleId);
            return this;
        }

        public Builder setDisplayName(Input<String> displayName) {
            this.displayName = Objects.requireNonNull(displayName);
            return this;
        }

        public Builder setDisplayName(String displayName) {
            this.displayName = Input.of(Objects.requireNonNull(displayName));
            return this;
        }

        public Builder setOperationalInsightsResourceProvider(Input<String> operationalInsightsResourceProvider) {
            this.operationalInsightsResourceProvider = Objects.requireNonNull(operationalInsightsResourceProvider);
            return this;
        }

        public Builder setOperationalInsightsResourceProvider(String operationalInsightsResourceProvider) {
            this.operationalInsightsResourceProvider = Input.of(Objects.requireNonNull(operationalInsightsResourceProvider));
            return this;
        }

        public Builder setOrder(Input<Integer> order) {
            this.order = Objects.requireNonNull(order);
            return this;
        }

        public Builder setOrder(Integer order) {
            this.order = Input.of(Objects.requireNonNull(order));
            return this;
        }

        public Builder setResourceGroupName(Input<String> resourceGroupName) {
            this.resourceGroupName = Objects.requireNonNull(resourceGroupName);
            return this;
        }

        public Builder setResourceGroupName(String resourceGroupName) {
            this.resourceGroupName = Input.of(Objects.requireNonNull(resourceGroupName));
            return this;
        }

        public Builder setTriggeringLogic(Input<AutomationRuleTriggeringLogicArgs> triggeringLogic) {
            this.triggeringLogic = Objects.requireNonNull(triggeringLogic);
            return this;
        }

        public Builder setTriggeringLogic(AutomationRuleTriggeringLogicArgs triggeringLogic) {
            this.triggeringLogic = Input.of(Objects.requireNonNull(triggeringLogic));
            return this;
        }

        public Builder setWorkspaceName(Input<String> workspaceName) {
            this.workspaceName = Objects.requireNonNull(workspaceName);
            return this;
        }

        public Builder setWorkspaceName(String workspaceName) {
            this.workspaceName = Input.of(Objects.requireNonNull(workspaceName));
            return this;
        }

        public AutomationRuleArgs build() {
            return new AutomationRuleArgs(actions, automationRuleId, displayName, operationalInsightsResourceProvider, order, resourceGroupName, triggeringLogic, workspaceName);
        }
    }
}
