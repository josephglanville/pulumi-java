// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.billingbudgets_v1.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.InputImport;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * NotificationsRule defines notifications that are sent based on budget spend and thresholds.
 * 
 */
public final class GoogleCloudBillingBudgetsV1NotificationsRuleArgs extends io.pulumi.resources.ResourceArgs {

    public static final GoogleCloudBillingBudgetsV1NotificationsRuleArgs Empty = new GoogleCloudBillingBudgetsV1NotificationsRuleArgs();

    /**
     * Optional. When set to true, disables default notifications sent when a threshold is exceeded. Default notifications are sent to those with Billing Account Administrator and Billing Account User IAM roles for the target account.
     * 
     */
    @InputImport(name="disableDefaultIamRecipients")
      private final @Nullable Output<Boolean> disableDefaultIamRecipients;

    public Output<Boolean> getDisableDefaultIamRecipients() {
        return this.disableDefaultIamRecipients == null ? Output.empty() : this.disableDefaultIamRecipients;
    }

    /**
     * Optional. Email targets to send notifications to when a threshold is exceeded. This is in addition to the `DefaultIamRecipients` who receive alert emails based on their billing account IAM role. The value is the full REST resource name of a Cloud Monitoring email notification channel with the form `projects/{project_id}/notificationChannels/{channel_id}`. A maximum of 5 email notifications are allowed. To customize budget alert email recipients with monitoring notification channels, you _must create the monitoring notification channels before you link them to a budget_. For guidance on setting up notification channels to use with budgets, see [Customize budget alert email recipients](https://cloud.google.com/billing/docs/how-to/budgets-notification-recipients). For Cloud Billing budget alerts, you _must use email notification channels_. The other types of notification channels are _not_ supported, such as Slack, SMS, or PagerDuty. If you want to [send budget notifications to Slack](https://cloud.google.com/billing/docs/how-to/notify#send_notifications_to_slack), use a pubsubTopic and configure [programmatic notifications](https://cloud.google.com/billing/docs/how-to/budgets-programmatic-notifications).
     * 
     */
    @InputImport(name="monitoringNotificationChannels")
      private final @Nullable Output<List<String>> monitoringNotificationChannels;

    public Output<List<String>> getMonitoringNotificationChannels() {
        return this.monitoringNotificationChannels == null ? Output.empty() : this.monitoringNotificationChannels;
    }

    /**
     * Optional. The name of the Pub/Sub topic where budget-related messages are published, in the form `projects/{project_id}/topics/{topic_id}`. Updates are sent to the topic at regular intervals; the timing of the updates is not dependent on the [threshold rules](#thresholdrule) you've set. Note that if you want your [Pub/Sub JSON object](https://cloud.google.com/billing/docs/how-to/budgets-programmatic-notifications#notification_format) to contain data for `alertThresholdExceeded`, you need at least one [alert threshold rule](#thresholdrule). When you set threshold rules, you must also enable at least one of the email notification options, either using the default IAM recipients or Cloud Monitoring email notification channels. To use Pub/Sub topics with budgets, you must do the following: 1. Create the Pub/Sub topic before connecting it to your budget. For guidance, see [Manage programmatic budget alert notifications](https://cloud.google.com/billing/docs/how-to/budgets-programmatic-notifications). 2. Grant the API caller the `pubsub.topics.setIamPolicy` permission on the Pub/Sub topic. If not set, the API call fails with PERMISSION_DENIED. For additional details on Pub/Sub roles and permissions, see [Permissions required for this task](https://cloud.google.com/billing/docs/how-to/budgets-programmatic-notifications#permissions_required_for_this_task).
     * 
     */
    @InputImport(name="pubsubTopic")
      private final @Nullable Output<String> pubsubTopic;

    public Output<String> getPubsubTopic() {
        return this.pubsubTopic == null ? Output.empty() : this.pubsubTopic;
    }

    /**
     * Optional. Required when NotificationsRule.pubsub_topic is set. The schema version of the notification sent to NotificationsRule.pubsub_topic. Only "1.0" is accepted. It represents the JSON schema as defined in https://cloud.google.com/billing/docs/how-to/budgets-programmatic-notifications#notification_format.
     * 
     */
    @InputImport(name="schemaVersion")
      private final @Nullable Output<String> schemaVersion;

    public Output<String> getSchemaVersion() {
        return this.schemaVersion == null ? Output.empty() : this.schemaVersion;
    }

    public GoogleCloudBillingBudgetsV1NotificationsRuleArgs(
        @Nullable Output<Boolean> disableDefaultIamRecipients,
        @Nullable Output<List<String>> monitoringNotificationChannels,
        @Nullable Output<String> pubsubTopic,
        @Nullable Output<String> schemaVersion) {
        this.disableDefaultIamRecipients = disableDefaultIamRecipients;
        this.monitoringNotificationChannels = monitoringNotificationChannels;
        this.pubsubTopic = pubsubTopic;
        this.schemaVersion = schemaVersion;
    }

    private GoogleCloudBillingBudgetsV1NotificationsRuleArgs() {
        this.disableDefaultIamRecipients = Output.empty();
        this.monitoringNotificationChannels = Output.empty();
        this.pubsubTopic = Output.empty();
        this.schemaVersion = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GoogleCloudBillingBudgetsV1NotificationsRuleArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<Boolean> disableDefaultIamRecipients;
        private @Nullable Output<List<String>> monitoringNotificationChannels;
        private @Nullable Output<String> pubsubTopic;
        private @Nullable Output<String> schemaVersion;

        public Builder() {
    	      // Empty
        }

        public Builder(GoogleCloudBillingBudgetsV1NotificationsRuleArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.disableDefaultIamRecipients = defaults.disableDefaultIamRecipients;
    	      this.monitoringNotificationChannels = defaults.monitoringNotificationChannels;
    	      this.pubsubTopic = defaults.pubsubTopic;
    	      this.schemaVersion = defaults.schemaVersion;
        }

        public Builder disableDefaultIamRecipients(@Nullable Output<Boolean> disableDefaultIamRecipients) {
            this.disableDefaultIamRecipients = disableDefaultIamRecipients;
            return this;
        }

        public Builder disableDefaultIamRecipients(@Nullable Boolean disableDefaultIamRecipients) {
            this.disableDefaultIamRecipients = Output.ofNullable(disableDefaultIamRecipients);
            return this;
        }

        public Builder monitoringNotificationChannels(@Nullable Output<List<String>> monitoringNotificationChannels) {
            this.monitoringNotificationChannels = monitoringNotificationChannels;
            return this;
        }

        public Builder monitoringNotificationChannels(@Nullable List<String> monitoringNotificationChannels) {
            this.monitoringNotificationChannels = Output.ofNullable(monitoringNotificationChannels);
            return this;
        }

        public Builder pubsubTopic(@Nullable Output<String> pubsubTopic) {
            this.pubsubTopic = pubsubTopic;
            return this;
        }

        public Builder pubsubTopic(@Nullable String pubsubTopic) {
            this.pubsubTopic = Output.ofNullable(pubsubTopic);
            return this;
        }

        public Builder schemaVersion(@Nullable Output<String> schemaVersion) {
            this.schemaVersion = schemaVersion;
            return this;
        }

        public Builder schemaVersion(@Nullable String schemaVersion) {
            this.schemaVersion = Output.ofNullable(schemaVersion);
            return this;
        }
        public GoogleCloudBillingBudgetsV1NotificationsRuleArgs build() {
            return new GoogleCloudBillingBudgetsV1NotificationsRuleArgs(disableDefaultIamRecipients, monitoringNotificationChannels, pubsubTopic, schemaVersion);
        }
    }
}
