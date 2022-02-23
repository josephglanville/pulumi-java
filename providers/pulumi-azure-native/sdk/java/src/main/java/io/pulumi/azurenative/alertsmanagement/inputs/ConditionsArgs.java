// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.alertsmanagement.inputs;

import io.pulumi.azurenative.alertsmanagement.inputs.ConditionArgs;
import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * Conditions in alert instance to be matched for a given action rule. Default value is all. Multiple values could be provided with comma separation.
 * 
 */
public final class ConditionsArgs extends io.pulumi.resources.ResourceArgs {

    public static final ConditionsArgs Empty = new ConditionsArgs();

    /**
     * filter alerts by alert context (payload)
     * 
     */
    @InputImport(name="alertContext")
      private final @Nullable Input<ConditionArgs> alertContext;

    public Input<ConditionArgs> getAlertContext() {
        return this.alertContext == null ? Input.empty() : this.alertContext;
    }

    /**
     * filter alerts by alert rule id
     * 
     */
    @InputImport(name="alertRuleId")
      private final @Nullable Input<ConditionArgs> alertRuleId;

    public Input<ConditionArgs> getAlertRuleId() {
        return this.alertRuleId == null ? Input.empty() : this.alertRuleId;
    }

    /**
     * filter alerts by alert rule description
     * 
     */
    @InputImport(name="description")
      private final @Nullable Input<ConditionArgs> description;

    public Input<ConditionArgs> getDescription() {
        return this.description == null ? Input.empty() : this.description;
    }

    /**
     * filter alerts by monitor condition
     * 
     */
    @InputImport(name="monitorCondition")
      private final @Nullable Input<ConditionArgs> monitorCondition;

    public Input<ConditionArgs> getMonitorCondition() {
        return this.monitorCondition == null ? Input.empty() : this.monitorCondition;
    }

    /**
     * filter alerts by monitor service
     * 
     */
    @InputImport(name="monitorService")
      private final @Nullable Input<ConditionArgs> monitorService;

    public Input<ConditionArgs> getMonitorService() {
        return this.monitorService == null ? Input.empty() : this.monitorService;
    }

    /**
     * filter alerts by severity
     * 
     */
    @InputImport(name="severity")
      private final @Nullable Input<ConditionArgs> severity;

    public Input<ConditionArgs> getSeverity() {
        return this.severity == null ? Input.empty() : this.severity;
    }

    /**
     * filter alerts by target resource type
     * 
     */
    @InputImport(name="targetResourceType")
      private final @Nullable Input<ConditionArgs> targetResourceType;

    public Input<ConditionArgs> getTargetResourceType() {
        return this.targetResourceType == null ? Input.empty() : this.targetResourceType;
    }

    public ConditionsArgs(
        @Nullable Input<ConditionArgs> alertContext,
        @Nullable Input<ConditionArgs> alertRuleId,
        @Nullable Input<ConditionArgs> description,
        @Nullable Input<ConditionArgs> monitorCondition,
        @Nullable Input<ConditionArgs> monitorService,
        @Nullable Input<ConditionArgs> severity,
        @Nullable Input<ConditionArgs> targetResourceType) {
        this.alertContext = alertContext;
        this.alertRuleId = alertRuleId;
        this.description = description;
        this.monitorCondition = monitorCondition;
        this.monitorService = monitorService;
        this.severity = severity;
        this.targetResourceType = targetResourceType;
    }

    private ConditionsArgs() {
        this.alertContext = Input.empty();
        this.alertRuleId = Input.empty();
        this.description = Input.empty();
        this.monitorCondition = Input.empty();
        this.monitorService = Input.empty();
        this.severity = Input.empty();
        this.targetResourceType = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ConditionsArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<ConditionArgs> alertContext;
        private @Nullable Input<ConditionArgs> alertRuleId;
        private @Nullable Input<ConditionArgs> description;
        private @Nullable Input<ConditionArgs> monitorCondition;
        private @Nullable Input<ConditionArgs> monitorService;
        private @Nullable Input<ConditionArgs> severity;
        private @Nullable Input<ConditionArgs> targetResourceType;

        public Builder() {
    	      // Empty
        }

        public Builder(ConditionsArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.alertContext = defaults.alertContext;
    	      this.alertRuleId = defaults.alertRuleId;
    	      this.description = defaults.description;
    	      this.monitorCondition = defaults.monitorCondition;
    	      this.monitorService = defaults.monitorService;
    	      this.severity = defaults.severity;
    	      this.targetResourceType = defaults.targetResourceType;
        }

        public Builder setAlertContext(@Nullable Input<ConditionArgs> alertContext) {
            this.alertContext = alertContext;
            return this;
        }

        public Builder setAlertContext(@Nullable ConditionArgs alertContext) {
            this.alertContext = Input.ofNullable(alertContext);
            return this;
        }

        public Builder setAlertRuleId(@Nullable Input<ConditionArgs> alertRuleId) {
            this.alertRuleId = alertRuleId;
            return this;
        }

        public Builder setAlertRuleId(@Nullable ConditionArgs alertRuleId) {
            this.alertRuleId = Input.ofNullable(alertRuleId);
            return this;
        }

        public Builder setDescription(@Nullable Input<ConditionArgs> description) {
            this.description = description;
            return this;
        }

        public Builder setDescription(@Nullable ConditionArgs description) {
            this.description = Input.ofNullable(description);
            return this;
        }

        public Builder setMonitorCondition(@Nullable Input<ConditionArgs> monitorCondition) {
            this.monitorCondition = monitorCondition;
            return this;
        }

        public Builder setMonitorCondition(@Nullable ConditionArgs monitorCondition) {
            this.monitorCondition = Input.ofNullable(monitorCondition);
            return this;
        }

        public Builder setMonitorService(@Nullable Input<ConditionArgs> monitorService) {
            this.monitorService = monitorService;
            return this;
        }

        public Builder setMonitorService(@Nullable ConditionArgs monitorService) {
            this.monitorService = Input.ofNullable(monitorService);
            return this;
        }

        public Builder setSeverity(@Nullable Input<ConditionArgs> severity) {
            this.severity = severity;
            return this;
        }

        public Builder setSeverity(@Nullable ConditionArgs severity) {
            this.severity = Input.ofNullable(severity);
            return this;
        }

        public Builder setTargetResourceType(@Nullable Input<ConditionArgs> targetResourceType) {
            this.targetResourceType = targetResourceType;
            return this;
        }

        public Builder setTargetResourceType(@Nullable ConditionArgs targetResourceType) {
            this.targetResourceType = Input.ofNullable(targetResourceType);
            return this;
        }
        public ConditionsArgs build() {
            return new ConditionsArgs(alertContext, alertRuleId, description, monitorCondition, monitorService, severity, targetResourceType);
        }
    }
}
