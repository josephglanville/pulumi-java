// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.monitoring;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import io.pulumi.gcp.monitoring.inputs.AlertPolicyAlertStrategyArgs;
import io.pulumi.gcp.monitoring.inputs.AlertPolicyConditionArgs;
import io.pulumi.gcp.monitoring.inputs.AlertPolicyDocumentationArgs;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import javax.annotation.Nullable;


public final class AlertPolicyArgs extends io.pulumi.resources.ResourceArgs {

    public static final AlertPolicyArgs Empty = new AlertPolicyArgs();

    /**
     * Control over how this alert policy's notification channels are notified.
     * Structure is documented below.
     * 
     */
    @InputImport(name="alertStrategy")
      private final @Nullable Input<AlertPolicyAlertStrategyArgs> alertStrategy;

    public Input<AlertPolicyAlertStrategyArgs> getAlertStrategy() {
        return this.alertStrategy == null ? Input.empty() : this.alertStrategy;
    }

    /**
     * How to combine the results of multiple conditions to
     * determine if an incident should be opened.
     * Possible values are `AND`, `OR`, and `AND_WITH_MATCHING_RESOURCE`.
     * 
     */
    @InputImport(name="combiner", required=true)
      private final Input<String> combiner;

    public Input<String> getCombiner() {
        return this.combiner;
    }

    /**
     * A list of conditions for the policy. The conditions are combined by
     * AND or OR according to the combiner field. If the combined conditions
     * evaluate to true, then an incident is created. A policy can have from
     * one to six conditions.
     * Structure is documented below.
     * 
     */
    @InputImport(name="conditions", required=true)
      private final Input<List<AlertPolicyConditionArgs>> conditions;

    public Input<List<AlertPolicyConditionArgs>> getConditions() {
        return this.conditions;
    }

    /**
     * A short name or phrase used to identify the
     * condition in dashboards, notifications, and
     * incidents. To avoid confusion, don't use the same
     * display name for multiple conditions in the same
     * policy.
     * 
     */
    @InputImport(name="displayName", required=true)
      private final Input<String> displayName;

    public Input<String> getDisplayName() {
        return this.displayName;
    }

    /**
     * Documentation that is included with notifications and incidents related
     * to this policy. Best practice is for the documentation to include information
     * to help responders understand, mitigate, escalate, and correct the underlying
     * problems detected by the alerting policy. Notification channels that have
     * limited capacity might not show this documentation.
     * Structure is documented below.
     * 
     */
    @InputImport(name="documentation")
      private final @Nullable Input<AlertPolicyDocumentationArgs> documentation;

    public Input<AlertPolicyDocumentationArgs> getDocumentation() {
        return this.documentation == null ? Input.empty() : this.documentation;
    }

    /**
     * Whether or not the policy is enabled. The default is true.
     * 
     */
    @InputImport(name="enabled")
      private final @Nullable Input<Boolean> enabled;

    public Input<Boolean> getEnabled() {
        return this.enabled == null ? Input.empty() : this.enabled;
    }

    /**
     * Identifies the notification channels to which notifications should be
     * sent when incidents are opened or closed or when new violations occur
     * on an already opened incident. Each element of this array corresponds
     * to the name field in each of the NotificationChannel objects that are
     * returned from the notificationChannels.list method. The syntax of the
     * entries in this field is
     * `projects/[PROJECT_ID]/notificationChannels/[CHANNEL_ID]`
     * 
     */
    @InputImport(name="notificationChannels")
      private final @Nullable Input<List<String>> notificationChannels;

    public Input<List<String>> getNotificationChannels() {
        return this.notificationChannels == null ? Input.empty() : this.notificationChannels;
    }

    /**
     * The ID of the project in which the resource belongs.
     * If it is not provided, the provider project is used.
     * 
     */
    @InputImport(name="project")
      private final @Nullable Input<String> project;

    public Input<String> getProject() {
        return this.project == null ? Input.empty() : this.project;
    }

    /**
     * This field is intended to be used for organizing and identifying the AlertPolicy
     * objects.The field can contain up to 64 entries. Each key and value is limited
     * to 63 Unicode characters or 128 bytes, whichever is smaller. Labels and values
     * can contain only lowercase letters, numerals, underscores, and dashes. Keys
     * must begin with a letter.
     * 
     */
    @InputImport(name="userLabels")
      private final @Nullable Input<Map<String,String>> userLabels;

    public Input<Map<String,String>> getUserLabels() {
        return this.userLabels == null ? Input.empty() : this.userLabels;
    }

    public AlertPolicyArgs(
        @Nullable Input<AlertPolicyAlertStrategyArgs> alertStrategy,
        Input<String> combiner,
        Input<List<AlertPolicyConditionArgs>> conditions,
        Input<String> displayName,
        @Nullable Input<AlertPolicyDocumentationArgs> documentation,
        @Nullable Input<Boolean> enabled,
        @Nullable Input<List<String>> notificationChannels,
        @Nullable Input<String> project,
        @Nullable Input<Map<String,String>> userLabels) {
        this.alertStrategy = alertStrategy;
        this.combiner = Objects.requireNonNull(combiner, "expected parameter 'combiner' to be non-null");
        this.conditions = Objects.requireNonNull(conditions, "expected parameter 'conditions' to be non-null");
        this.displayName = Objects.requireNonNull(displayName, "expected parameter 'displayName' to be non-null");
        this.documentation = documentation;
        this.enabled = enabled;
        this.notificationChannels = notificationChannels;
        this.project = project;
        this.userLabels = userLabels;
    }

    private AlertPolicyArgs() {
        this.alertStrategy = Input.empty();
        this.combiner = Input.empty();
        this.conditions = Input.empty();
        this.displayName = Input.empty();
        this.documentation = Input.empty();
        this.enabled = Input.empty();
        this.notificationChannels = Input.empty();
        this.project = Input.empty();
        this.userLabels = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(AlertPolicyArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<AlertPolicyAlertStrategyArgs> alertStrategy;
        private Input<String> combiner;
        private Input<List<AlertPolicyConditionArgs>> conditions;
        private Input<String> displayName;
        private @Nullable Input<AlertPolicyDocumentationArgs> documentation;
        private @Nullable Input<Boolean> enabled;
        private @Nullable Input<List<String>> notificationChannels;
        private @Nullable Input<String> project;
        private @Nullable Input<Map<String,String>> userLabels;

        public Builder() {
    	      // Empty
        }

        public Builder(AlertPolicyArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.alertStrategy = defaults.alertStrategy;
    	      this.combiner = defaults.combiner;
    	      this.conditions = defaults.conditions;
    	      this.displayName = defaults.displayName;
    	      this.documentation = defaults.documentation;
    	      this.enabled = defaults.enabled;
    	      this.notificationChannels = defaults.notificationChannels;
    	      this.project = defaults.project;
    	      this.userLabels = defaults.userLabels;
        }

        public Builder setAlertStrategy(@Nullable Input<AlertPolicyAlertStrategyArgs> alertStrategy) {
            this.alertStrategy = alertStrategy;
            return this;
        }

        public Builder setAlertStrategy(@Nullable AlertPolicyAlertStrategyArgs alertStrategy) {
            this.alertStrategy = Input.ofNullable(alertStrategy);
            return this;
        }

        public Builder setCombiner(Input<String> combiner) {
            this.combiner = Objects.requireNonNull(combiner);
            return this;
        }

        public Builder setCombiner(String combiner) {
            this.combiner = Input.of(Objects.requireNonNull(combiner));
            return this;
        }

        public Builder setConditions(Input<List<AlertPolicyConditionArgs>> conditions) {
            this.conditions = Objects.requireNonNull(conditions);
            return this;
        }

        public Builder setConditions(List<AlertPolicyConditionArgs> conditions) {
            this.conditions = Input.of(Objects.requireNonNull(conditions));
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

        public Builder setDocumentation(@Nullable Input<AlertPolicyDocumentationArgs> documentation) {
            this.documentation = documentation;
            return this;
        }

        public Builder setDocumentation(@Nullable AlertPolicyDocumentationArgs documentation) {
            this.documentation = Input.ofNullable(documentation);
            return this;
        }

        public Builder setEnabled(@Nullable Input<Boolean> enabled) {
            this.enabled = enabled;
            return this;
        }

        public Builder setEnabled(@Nullable Boolean enabled) {
            this.enabled = Input.ofNullable(enabled);
            return this;
        }

        public Builder setNotificationChannels(@Nullable Input<List<String>> notificationChannels) {
            this.notificationChannels = notificationChannels;
            return this;
        }

        public Builder setNotificationChannels(@Nullable List<String> notificationChannels) {
            this.notificationChannels = Input.ofNullable(notificationChannels);
            return this;
        }

        public Builder setProject(@Nullable Input<String> project) {
            this.project = project;
            return this;
        }

        public Builder setProject(@Nullable String project) {
            this.project = Input.ofNullable(project);
            return this;
        }

        public Builder setUserLabels(@Nullable Input<Map<String,String>> userLabels) {
            this.userLabels = userLabels;
            return this;
        }

        public Builder setUserLabels(@Nullable Map<String,String> userLabels) {
            this.userLabels = Input.ofNullable(userLabels);
            return this;
        }
        public AlertPolicyArgs build() {
            return new AlertPolicyArgs(alertStrategy, combiner, conditions, displayName, documentation, enabled, notificationChannels, project, userLabels);
        }
    }
}
