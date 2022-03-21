// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.alertsmanagement.inputs;

import io.pulumi.azurenative.alertsmanagement.inputs.ConditionArgs;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
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
    @Import(name="alertContext")
      private final @Nullable Output<ConditionArgs> alertContext;

    public Output<ConditionArgs> getAlertContext() {
        return this.alertContext == null ? Output.empty() : this.alertContext;
    }

    /**
     * filter alerts by alert rule id
     * 
     */
    @Import(name="alertRuleId")
      private final @Nullable Output<ConditionArgs> alertRuleId;

    public Output<ConditionArgs> getAlertRuleId() {
        return this.alertRuleId == null ? Output.empty() : this.alertRuleId;
    }

    /**
     * filter alerts by alert rule description
     * 
     */
    @Import(name="description")
      private final @Nullable Output<ConditionArgs> description;

    public Output<ConditionArgs> getDescription() {
        return this.description == null ? Output.empty() : this.description;
    }

    /**
     * filter alerts by monitor condition
     * 
     */
    @Import(name="monitorCondition")
      private final @Nullable Output<ConditionArgs> monitorCondition;

    public Output<ConditionArgs> getMonitorCondition() {
        return this.monitorCondition == null ? Output.empty() : this.monitorCondition;
    }

    /**
     * filter alerts by monitor service
     * 
     */
    @Import(name="monitorService")
      private final @Nullable Output<ConditionArgs> monitorService;

    public Output<ConditionArgs> getMonitorService() {
        return this.monitorService == null ? Output.empty() : this.monitorService;
    }

    /**
     * filter alerts by severity
     * 
     */
    @Import(name="severity")
      private final @Nullable Output<ConditionArgs> severity;

    public Output<ConditionArgs> getSeverity() {
        return this.severity == null ? Output.empty() : this.severity;
    }

    /**
     * filter alerts by target resource type
     * 
     */
    @Import(name="targetResourceType")
      private final @Nullable Output<ConditionArgs> targetResourceType;

    public Output<ConditionArgs> getTargetResourceType() {
        return this.targetResourceType == null ? Output.empty() : this.targetResourceType;
    }

    public ConditionsArgs(
        @Nullable Output<ConditionArgs> alertContext,
        @Nullable Output<ConditionArgs> alertRuleId,
        @Nullable Output<ConditionArgs> description,
        @Nullable Output<ConditionArgs> monitorCondition,
        @Nullable Output<ConditionArgs> monitorService,
        @Nullable Output<ConditionArgs> severity,
        @Nullable Output<ConditionArgs> targetResourceType) {
        this.alertContext = alertContext;
        this.alertRuleId = alertRuleId;
        this.description = description;
        this.monitorCondition = monitorCondition;
        this.monitorService = monitorService;
        this.severity = severity;
        this.targetResourceType = targetResourceType;
    }

    private ConditionsArgs() {
        this.alertContext = Output.empty();
        this.alertRuleId = Output.empty();
        this.description = Output.empty();
        this.monitorCondition = Output.empty();
        this.monitorService = Output.empty();
        this.severity = Output.empty();
        this.targetResourceType = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ConditionsArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<ConditionArgs> alertContext;
        private @Nullable Output<ConditionArgs> alertRuleId;
        private @Nullable Output<ConditionArgs> description;
        private @Nullable Output<ConditionArgs> monitorCondition;
        private @Nullable Output<ConditionArgs> monitorService;
        private @Nullable Output<ConditionArgs> severity;
        private @Nullable Output<ConditionArgs> targetResourceType;

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

        public Builder alertContext(@Nullable Output<ConditionArgs> alertContext) {
            this.alertContext = alertContext;
            return this;
        }
        public Builder alertContext(@Nullable ConditionArgs alertContext) {
            this.alertContext = Output.ofNullable(alertContext);
            return this;
        }
        public Builder alertRuleId(@Nullable Output<ConditionArgs> alertRuleId) {
            this.alertRuleId = alertRuleId;
            return this;
        }
        public Builder alertRuleId(@Nullable ConditionArgs alertRuleId) {
            this.alertRuleId = Output.ofNullable(alertRuleId);
            return this;
        }
        public Builder description(@Nullable Output<ConditionArgs> description) {
            this.description = description;
            return this;
        }
        public Builder description(@Nullable ConditionArgs description) {
            this.description = Output.ofNullable(description);
            return this;
        }
        public Builder monitorCondition(@Nullable Output<ConditionArgs> monitorCondition) {
            this.monitorCondition = monitorCondition;
            return this;
        }
        public Builder monitorCondition(@Nullable ConditionArgs monitorCondition) {
            this.monitorCondition = Output.ofNullable(monitorCondition);
            return this;
        }
        public Builder monitorService(@Nullable Output<ConditionArgs> monitorService) {
            this.monitorService = monitorService;
            return this;
        }
        public Builder monitorService(@Nullable ConditionArgs monitorService) {
            this.monitorService = Output.ofNullable(monitorService);
            return this;
        }
        public Builder severity(@Nullable Output<ConditionArgs> severity) {
            this.severity = severity;
            return this;
        }
        public Builder severity(@Nullable ConditionArgs severity) {
            this.severity = Output.ofNullable(severity);
            return this;
        }
        public Builder targetResourceType(@Nullable Output<ConditionArgs> targetResourceType) {
            this.targetResourceType = targetResourceType;
            return this;
        }
        public Builder targetResourceType(@Nullable ConditionArgs targetResourceType) {
            this.targetResourceType = Output.ofNullable(targetResourceType);
            return this;
        }        public ConditionsArgs build() {
            return new ConditionsArgs(alertContext, alertRuleId, description, monitorCondition, monitorService, severity, targetResourceType);
        }
    }
}
