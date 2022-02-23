// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.alertsmanagement;

import io.pulumi.azurenative.alertsmanagement.enums.AlertRuleState;
import io.pulumi.azurenative.alertsmanagement.enums.Severity;
import io.pulumi.azurenative.alertsmanagement.inputs.ActionGroupsInformationArgs;
import io.pulumi.azurenative.alertsmanagement.inputs.DetectorArgs;
import io.pulumi.azurenative.alertsmanagement.inputs.ThrottlingInformationArgs;
import io.pulumi.core.Either;
import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import javax.annotation.Nullable;


public final class SmartDetectorAlertRuleArgs extends io.pulumi.resources.ResourceArgs {

    public static final SmartDetectorAlertRuleArgs Empty = new SmartDetectorAlertRuleArgs();

    /**
     * The alert rule actions.
     * 
     */
    @InputImport(name="actionGroups", required=true)
      private final Input<ActionGroupsInformationArgs> actionGroups;

    public Input<ActionGroupsInformationArgs> getActionGroups() {
        return this.actionGroups;
    }

    /**
     * The name of the alert rule.
     * 
     */
    @InputImport(name="alertRuleName")
      private final @Nullable Input<String> alertRuleName;

    public Input<String> getAlertRuleName() {
        return this.alertRuleName == null ? Input.empty() : this.alertRuleName;
    }

    /**
     * The alert rule description.
     * 
     */
    @InputImport(name="description")
      private final @Nullable Input<String> description;

    public Input<String> getDescription() {
        return this.description == null ? Input.empty() : this.description;
    }

    /**
     * The alert rule's detector.
     * 
     */
    @InputImport(name="detector", required=true)
      private final Input<DetectorArgs> detector;

    public Input<DetectorArgs> getDetector() {
        return this.detector;
    }

    /**
     * The alert rule frequency in ISO8601 format. The time granularity must be in minutes and minimum value is 5 minutes.
     * 
     */
    @InputImport(name="frequency", required=true)
      private final Input<String> frequency;

    public Input<String> getFrequency() {
        return this.frequency;
    }

    /**
     * The resource location.
     * 
     */
    @InputImport(name="location")
      private final @Nullable Input<String> location;

    public Input<String> getLocation() {
        return this.location == null ? Input.empty() : this.location;
    }

    /**
     * The name of the resource group.
     * 
     */
    @InputImport(name="resourceGroupName", required=true)
      private final Input<String> resourceGroupName;

    public Input<String> getResourceGroupName() {
        return this.resourceGroupName;
    }

    /**
     * The alert rule resources scope.
     * 
     */
    @InputImport(name="scope", required=true)
      private final Input<List<String>> scope;

    public Input<List<String>> getScope() {
        return this.scope;
    }

    /**
     * The alert rule severity.
     * 
     */
    @InputImport(name="severity", required=true)
      private final Input<Either<String,Severity>> severity;

    public Input<Either<String,Severity>> getSeverity() {
        return this.severity;
    }

    /**
     * The alert rule state.
     * 
     */
    @InputImport(name="state", required=true)
      private final Input<Either<String,AlertRuleState>> state;

    public Input<Either<String,AlertRuleState>> getState() {
        return this.state;
    }

    /**
     * The resource tags.
     * 
     */
    @InputImport(name="tags")
      private final @Nullable Input<Map<String,String>> tags;

    public Input<Map<String,String>> getTags() {
        return this.tags == null ? Input.empty() : this.tags;
    }

    /**
     * The alert rule throttling information.
     * 
     */
    @InputImport(name="throttling")
      private final @Nullable Input<ThrottlingInformationArgs> throttling;

    public Input<ThrottlingInformationArgs> getThrottling() {
        return this.throttling == null ? Input.empty() : this.throttling;
    }

    public SmartDetectorAlertRuleArgs(
        Input<ActionGroupsInformationArgs> actionGroups,
        @Nullable Input<String> alertRuleName,
        @Nullable Input<String> description,
        Input<DetectorArgs> detector,
        Input<String> frequency,
        @Nullable Input<String> location,
        Input<String> resourceGroupName,
        Input<List<String>> scope,
        Input<Either<String,Severity>> severity,
        Input<Either<String,AlertRuleState>> state,
        @Nullable Input<Map<String,String>> tags,
        @Nullable Input<ThrottlingInformationArgs> throttling) {
        this.actionGroups = Objects.requireNonNull(actionGroups, "expected parameter 'actionGroups' to be non-null");
        this.alertRuleName = alertRuleName;
        this.description = description;
        this.detector = Objects.requireNonNull(detector, "expected parameter 'detector' to be non-null");
        this.frequency = Objects.requireNonNull(frequency, "expected parameter 'frequency' to be non-null");
        this.location = location == null ? Input.ofNullable("global") : location;
        this.resourceGroupName = Objects.requireNonNull(resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
        this.scope = Objects.requireNonNull(scope, "expected parameter 'scope' to be non-null");
        this.severity = Objects.requireNonNull(severity, "expected parameter 'severity' to be non-null");
        this.state = Objects.requireNonNull(state, "expected parameter 'state' to be non-null");
        this.tags = tags;
        this.throttling = throttling;
    }

    private SmartDetectorAlertRuleArgs() {
        this.actionGroups = Input.empty();
        this.alertRuleName = Input.empty();
        this.description = Input.empty();
        this.detector = Input.empty();
        this.frequency = Input.empty();
        this.location = Input.empty();
        this.resourceGroupName = Input.empty();
        this.scope = Input.empty();
        this.severity = Input.empty();
        this.state = Input.empty();
        this.tags = Input.empty();
        this.throttling = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(SmartDetectorAlertRuleArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Input<ActionGroupsInformationArgs> actionGroups;
        private @Nullable Input<String> alertRuleName;
        private @Nullable Input<String> description;
        private Input<DetectorArgs> detector;
        private Input<String> frequency;
        private @Nullable Input<String> location;
        private Input<String> resourceGroupName;
        private Input<List<String>> scope;
        private Input<Either<String,Severity>> severity;
        private Input<Either<String,AlertRuleState>> state;
        private @Nullable Input<Map<String,String>> tags;
        private @Nullable Input<ThrottlingInformationArgs> throttling;

        public Builder() {
    	      // Empty
        }

        public Builder(SmartDetectorAlertRuleArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.actionGroups = defaults.actionGroups;
    	      this.alertRuleName = defaults.alertRuleName;
    	      this.description = defaults.description;
    	      this.detector = defaults.detector;
    	      this.frequency = defaults.frequency;
    	      this.location = defaults.location;
    	      this.resourceGroupName = defaults.resourceGroupName;
    	      this.scope = defaults.scope;
    	      this.severity = defaults.severity;
    	      this.state = defaults.state;
    	      this.tags = defaults.tags;
    	      this.throttling = defaults.throttling;
        }

        public Builder setActionGroups(Input<ActionGroupsInformationArgs> actionGroups) {
            this.actionGroups = Objects.requireNonNull(actionGroups);
            return this;
        }

        public Builder setActionGroups(ActionGroupsInformationArgs actionGroups) {
            this.actionGroups = Input.of(Objects.requireNonNull(actionGroups));
            return this;
        }

        public Builder setAlertRuleName(@Nullable Input<String> alertRuleName) {
            this.alertRuleName = alertRuleName;
            return this;
        }

        public Builder setAlertRuleName(@Nullable String alertRuleName) {
            this.alertRuleName = Input.ofNullable(alertRuleName);
            return this;
        }

        public Builder setDescription(@Nullable Input<String> description) {
            this.description = description;
            return this;
        }

        public Builder setDescription(@Nullable String description) {
            this.description = Input.ofNullable(description);
            return this;
        }

        public Builder setDetector(Input<DetectorArgs> detector) {
            this.detector = Objects.requireNonNull(detector);
            return this;
        }

        public Builder setDetector(DetectorArgs detector) {
            this.detector = Input.of(Objects.requireNonNull(detector));
            return this;
        }

        public Builder setFrequency(Input<String> frequency) {
            this.frequency = Objects.requireNonNull(frequency);
            return this;
        }

        public Builder setFrequency(String frequency) {
            this.frequency = Input.of(Objects.requireNonNull(frequency));
            return this;
        }

        public Builder setLocation(@Nullable Input<String> location) {
            this.location = location;
            return this;
        }

        public Builder setLocation(@Nullable String location) {
            this.location = Input.ofNullable(location);
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

        public Builder setScope(Input<List<String>> scope) {
            this.scope = Objects.requireNonNull(scope);
            return this;
        }

        public Builder setScope(List<String> scope) {
            this.scope = Input.of(Objects.requireNonNull(scope));
            return this;
        }

        public Builder setSeverity(Input<Either<String,Severity>> severity) {
            this.severity = Objects.requireNonNull(severity);
            return this;
        }

        public Builder setSeverity(Either<String,Severity> severity) {
            this.severity = Input.of(Objects.requireNonNull(severity));
            return this;
        }

        public Builder setState(Input<Either<String,AlertRuleState>> state) {
            this.state = Objects.requireNonNull(state);
            return this;
        }

        public Builder setState(Either<String,AlertRuleState> state) {
            this.state = Input.of(Objects.requireNonNull(state));
            return this;
        }

        public Builder setTags(@Nullable Input<Map<String,String>> tags) {
            this.tags = tags;
            return this;
        }

        public Builder setTags(@Nullable Map<String,String> tags) {
            this.tags = Input.ofNullable(tags);
            return this;
        }

        public Builder setThrottling(@Nullable Input<ThrottlingInformationArgs> throttling) {
            this.throttling = throttling;
            return this;
        }

        public Builder setThrottling(@Nullable ThrottlingInformationArgs throttling) {
            this.throttling = Input.ofNullable(throttling);
            return this;
        }
        public SmartDetectorAlertRuleArgs build() {
            return new SmartDetectorAlertRuleArgs(actionGroups, alertRuleName, description, detector, frequency, location, resourceGroupName, scope, severity, state, tags, throttling);
        }
    }
}
