// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.billing.outputs;

import io.pulumi.core.annotations.CustomType;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class BudgetAllUpdatesRule {
    /**
     * Boolean. When set to true, disables default notifications sent
     * when a threshold is exceeded. Default recipients are
     * those with Billing Account Administrators and Billing
     * Account Users IAM roles for the target account.
     * 
     */
    private final @Nullable Boolean disableDefaultIamRecipients;
    /**
     * The full resource name of a monitoring notification
     * channel in the form
     * projects/{project_id}/notificationChannels/{channel_id}.
     * A maximum of 5 channels are allowed.
     * 
     */
    private final @Nullable List<String> monitoringNotificationChannels;
    /**
     * The name of the Cloud Pub/Sub topic where budget related
     * messages will be published, in the form
     * projects/{project_id}/topics/{topic_id}. Updates are sent
     * at regular intervals to the topic.
     * 
     */
    private final @Nullable String pubsubTopic;
    /**
     * The schema version of the notification. Only "1.0" is
     * accepted. It represents the JSON schema as defined in
     * https://cloud.google.com/billing/docs/how-to/budgets#notification_format.
     * 
     */
    private final @Nullable String schemaVersion;

    @CustomType.Constructor
    private BudgetAllUpdatesRule(
        @CustomType.Parameter("disableDefaultIamRecipients") @Nullable Boolean disableDefaultIamRecipients,
        @CustomType.Parameter("monitoringNotificationChannels") @Nullable List<String> monitoringNotificationChannels,
        @CustomType.Parameter("pubsubTopic") @Nullable String pubsubTopic,
        @CustomType.Parameter("schemaVersion") @Nullable String schemaVersion) {
        this.disableDefaultIamRecipients = disableDefaultIamRecipients;
        this.monitoringNotificationChannels = monitoringNotificationChannels;
        this.pubsubTopic = pubsubTopic;
        this.schemaVersion = schemaVersion;
    }

    /**
     * Boolean. When set to true, disables default notifications sent
     * when a threshold is exceeded. Default recipients are
     * those with Billing Account Administrators and Billing
     * Account Users IAM roles for the target account.
     * 
    */
    public Optional<Boolean> getDisableDefaultIamRecipients() {
        return Optional.ofNullable(this.disableDefaultIamRecipients);
    }
    /**
     * The full resource name of a monitoring notification
     * channel in the form
     * projects/{project_id}/notificationChannels/{channel_id}.
     * A maximum of 5 channels are allowed.
     * 
    */
    public List<String> getMonitoringNotificationChannels() {
        return this.monitoringNotificationChannels == null ? List.of() : this.monitoringNotificationChannels;
    }
    /**
     * The name of the Cloud Pub/Sub topic where budget related
     * messages will be published, in the form
     * projects/{project_id}/topics/{topic_id}. Updates are sent
     * at regular intervals to the topic.
     * 
    */
    public Optional<String> getPubsubTopic() {
        return Optional.ofNullable(this.pubsubTopic);
    }
    /**
     * The schema version of the notification. Only "1.0" is
     * accepted. It represents the JSON schema as defined in
     * https://cloud.google.com/billing/docs/how-to/budgets#notification_format.
     * 
    */
    public Optional<String> getSchemaVersion() {
        return Optional.ofNullable(this.schemaVersion);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(BudgetAllUpdatesRule defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Boolean disableDefaultIamRecipients;
        private @Nullable List<String> monitoringNotificationChannels;
        private @Nullable String pubsubTopic;
        private @Nullable String schemaVersion;

        public Builder() {
    	      // Empty
        }

        public Builder(BudgetAllUpdatesRule defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.disableDefaultIamRecipients = defaults.disableDefaultIamRecipients;
    	      this.monitoringNotificationChannels = defaults.monitoringNotificationChannels;
    	      this.pubsubTopic = defaults.pubsubTopic;
    	      this.schemaVersion = defaults.schemaVersion;
        }

        public Builder disableDefaultIamRecipients(@Nullable Boolean disableDefaultIamRecipients) {
            this.disableDefaultIamRecipients = disableDefaultIamRecipients;
            return this;
        }
        public Builder monitoringNotificationChannels(@Nullable List<String> monitoringNotificationChannels) {
            this.monitoringNotificationChannels = monitoringNotificationChannels;
            return this;
        }
        public Builder monitoringNotificationChannels(String... monitoringNotificationChannels) {
            return monitoringNotificationChannels(List.of(monitoringNotificationChannels));
        }
        public Builder pubsubTopic(@Nullable String pubsubTopic) {
            this.pubsubTopic = pubsubTopic;
            return this;
        }
        public Builder schemaVersion(@Nullable String schemaVersion) {
            this.schemaVersion = schemaVersion;
            return this;
        }        public BudgetAllUpdatesRule build() {
            return new BudgetAllUpdatesRule(disableDefaultIamRecipients, monitoringNotificationChannels, pubsubTopic, schemaVersion);
        }
    }
}
