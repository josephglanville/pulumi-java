// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.monitoring.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.gcp.monitoring.inputs.AlertPolicyConditionConditionAbsentGetArgs;
import io.pulumi.gcp.monitoring.inputs.AlertPolicyConditionConditionMatchedLogGetArgs;
import io.pulumi.gcp.monitoring.inputs.AlertPolicyConditionConditionMonitoringQueryLanguageGetArgs;
import io.pulumi.gcp.monitoring.inputs.AlertPolicyConditionConditionThresholdGetArgs;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class AlertPolicyConditionGetArgs extends io.pulumi.resources.ResourceArgs {

    public static final AlertPolicyConditionGetArgs Empty = new AlertPolicyConditionGetArgs();

    /**
     * A condition that checks that a time series
     * continues to receive new data points.
     * Structure is documented below.
     * 
     */
    @Import(name="conditionAbsent")
      private final @Nullable Output<AlertPolicyConditionConditionAbsentGetArgs> conditionAbsent;

    public Output<AlertPolicyConditionConditionAbsentGetArgs> getConditionAbsent() {
        return this.conditionAbsent == null ? Output.empty() : this.conditionAbsent;
    }

    /**
     * A condition that checks for log messages matching given constraints.
     * If set, no other conditions can be present.
     * Structure is documented below.
     * 
     */
    @Import(name="conditionMatchedLog")
      private final @Nullable Output<AlertPolicyConditionConditionMatchedLogGetArgs> conditionMatchedLog;

    public Output<AlertPolicyConditionConditionMatchedLogGetArgs> getConditionMatchedLog() {
        return this.conditionMatchedLog == null ? Output.empty() : this.conditionMatchedLog;
    }

    /**
     * A Monitoring Query Language query that outputs a boolean stream
     * Structure is documented below.
     * 
     */
    @Import(name="conditionMonitoringQueryLanguage")
      private final @Nullable Output<AlertPolicyConditionConditionMonitoringQueryLanguageGetArgs> conditionMonitoringQueryLanguage;

    public Output<AlertPolicyConditionConditionMonitoringQueryLanguageGetArgs> getConditionMonitoringQueryLanguage() {
        return this.conditionMonitoringQueryLanguage == null ? Output.empty() : this.conditionMonitoringQueryLanguage;
    }

    /**
     * A condition that compares a time series against a
     * threshold.
     * Structure is documented below.
     * 
     */
    @Import(name="conditionThreshold")
      private final @Nullable Output<AlertPolicyConditionConditionThresholdGetArgs> conditionThreshold;

    public Output<AlertPolicyConditionConditionThresholdGetArgs> getConditionThreshold() {
        return this.conditionThreshold == null ? Output.empty() : this.conditionThreshold;
    }

    /**
     * A short name or phrase used to identify the
     * condition in dashboards, notifications, and
     * incidents. To avoid confusion, don't use the same
     * display name for multiple conditions in the same
     * policy.
     * 
     */
    @Import(name="displayName", required=true)
      private final Output<String> displayName;

    public Output<String> getDisplayName() {
        return this.displayName;
    }

    /**
     * - 
     * The unique resource name for this condition.
     * Its syntax is:
     * projects/[PROJECT_ID]/alertPolicies/[POLICY_ID]/conditions/[CONDITION_ID]
     * [CONDITION_ID] is assigned by Stackdriver Monitoring when
     * the condition is created as part of a new or updated alerting
     * policy.
     * 
     */
    @Import(name="name")
      private final @Nullable Output<String> name;

    public Output<String> getName() {
        return this.name == null ? Output.empty() : this.name;
    }

    public AlertPolicyConditionGetArgs(
        @Nullable Output<AlertPolicyConditionConditionAbsentGetArgs> conditionAbsent,
        @Nullable Output<AlertPolicyConditionConditionMatchedLogGetArgs> conditionMatchedLog,
        @Nullable Output<AlertPolicyConditionConditionMonitoringQueryLanguageGetArgs> conditionMonitoringQueryLanguage,
        @Nullable Output<AlertPolicyConditionConditionThresholdGetArgs> conditionThreshold,
        Output<String> displayName,
        @Nullable Output<String> name) {
        this.conditionAbsent = conditionAbsent;
        this.conditionMatchedLog = conditionMatchedLog;
        this.conditionMonitoringQueryLanguage = conditionMonitoringQueryLanguage;
        this.conditionThreshold = conditionThreshold;
        this.displayName = Objects.requireNonNull(displayName, "expected parameter 'displayName' to be non-null");
        this.name = name;
    }

    private AlertPolicyConditionGetArgs() {
        this.conditionAbsent = Output.empty();
        this.conditionMatchedLog = Output.empty();
        this.conditionMonitoringQueryLanguage = Output.empty();
        this.conditionThreshold = Output.empty();
        this.displayName = Output.empty();
        this.name = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(AlertPolicyConditionGetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<AlertPolicyConditionConditionAbsentGetArgs> conditionAbsent;
        private @Nullable Output<AlertPolicyConditionConditionMatchedLogGetArgs> conditionMatchedLog;
        private @Nullable Output<AlertPolicyConditionConditionMonitoringQueryLanguageGetArgs> conditionMonitoringQueryLanguage;
        private @Nullable Output<AlertPolicyConditionConditionThresholdGetArgs> conditionThreshold;
        private Output<String> displayName;
        private @Nullable Output<String> name;

        public Builder() {
    	      // Empty
        }

        public Builder(AlertPolicyConditionGetArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.conditionAbsent = defaults.conditionAbsent;
    	      this.conditionMatchedLog = defaults.conditionMatchedLog;
    	      this.conditionMonitoringQueryLanguage = defaults.conditionMonitoringQueryLanguage;
    	      this.conditionThreshold = defaults.conditionThreshold;
    	      this.displayName = defaults.displayName;
    	      this.name = defaults.name;
        }

        public Builder conditionAbsent(@Nullable Output<AlertPolicyConditionConditionAbsentGetArgs> conditionAbsent) {
            this.conditionAbsent = conditionAbsent;
            return this;
        }
        public Builder conditionAbsent(@Nullable AlertPolicyConditionConditionAbsentGetArgs conditionAbsent) {
            this.conditionAbsent = Output.ofNullable(conditionAbsent);
            return this;
        }
        public Builder conditionMatchedLog(@Nullable Output<AlertPolicyConditionConditionMatchedLogGetArgs> conditionMatchedLog) {
            this.conditionMatchedLog = conditionMatchedLog;
            return this;
        }
        public Builder conditionMatchedLog(@Nullable AlertPolicyConditionConditionMatchedLogGetArgs conditionMatchedLog) {
            this.conditionMatchedLog = Output.ofNullable(conditionMatchedLog);
            return this;
        }
        public Builder conditionMonitoringQueryLanguage(@Nullable Output<AlertPolicyConditionConditionMonitoringQueryLanguageGetArgs> conditionMonitoringQueryLanguage) {
            this.conditionMonitoringQueryLanguage = conditionMonitoringQueryLanguage;
            return this;
        }
        public Builder conditionMonitoringQueryLanguage(@Nullable AlertPolicyConditionConditionMonitoringQueryLanguageGetArgs conditionMonitoringQueryLanguage) {
            this.conditionMonitoringQueryLanguage = Output.ofNullable(conditionMonitoringQueryLanguage);
            return this;
        }
        public Builder conditionThreshold(@Nullable Output<AlertPolicyConditionConditionThresholdGetArgs> conditionThreshold) {
            this.conditionThreshold = conditionThreshold;
            return this;
        }
        public Builder conditionThreshold(@Nullable AlertPolicyConditionConditionThresholdGetArgs conditionThreshold) {
            this.conditionThreshold = Output.ofNullable(conditionThreshold);
            return this;
        }
        public Builder displayName(Output<String> displayName) {
            this.displayName = Objects.requireNonNull(displayName);
            return this;
        }
        public Builder displayName(String displayName) {
            this.displayName = Output.of(Objects.requireNonNull(displayName));
            return this;
        }
        public Builder name(@Nullable Output<String> name) {
            this.name = name;
            return this;
        }
        public Builder name(@Nullable String name) {
            this.name = Output.ofNullable(name);
            return this;
        }        public AlertPolicyConditionGetArgs build() {
            return new AlertPolicyConditionGetArgs(conditionAbsent, conditionMatchedLog, conditionMonitoringQueryLanguage, conditionThreshold, displayName, name);
        }
    }
}
