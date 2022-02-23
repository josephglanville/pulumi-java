// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.devtestlab.inputs;

import io.pulumi.core.annotations.InputImport;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Notification settings for a schedule.
 * 
 */
public final class NotificationSettingsResponse extends io.pulumi.resources.InvokeArgs {

    public static final NotificationSettingsResponse Empty = new NotificationSettingsResponse();

    /**
     * The email recipient to send notifications to (can be a list of semi-colon separated email addresses).
     * 
     */
    @InputImport(name="emailRecipient")
      private final @Nullable String emailRecipient;

    public Optional<String> getEmailRecipient() {
        return this.emailRecipient == null ? Optional.empty() : Optional.ofNullable(this.emailRecipient);
    }

    /**
     * The locale to use when sending a notification (fallback for unsupported languages is EN).
     * 
     */
    @InputImport(name="notificationLocale")
      private final @Nullable String notificationLocale;

    public Optional<String> getNotificationLocale() {
        return this.notificationLocale == null ? Optional.empty() : Optional.ofNullable(this.notificationLocale);
    }

    /**
     * If notifications are enabled for this schedule (i.e. Enabled, Disabled).
     * 
     */
    @InputImport(name="status")
      private final @Nullable String status;

    public Optional<String> getStatus() {
        return this.status == null ? Optional.empty() : Optional.ofNullable(this.status);
    }

    /**
     * Time in minutes before event at which notification will be sent.
     * 
     */
    @InputImport(name="timeInMinutes")
      private final @Nullable Integer timeInMinutes;

    public Optional<Integer> getTimeInMinutes() {
        return this.timeInMinutes == null ? Optional.empty() : Optional.ofNullable(this.timeInMinutes);
    }

    /**
     * The webhook URL to which the notification will be sent.
     * 
     */
    @InputImport(name="webhookUrl")
      private final @Nullable String webhookUrl;

    public Optional<String> getWebhookUrl() {
        return this.webhookUrl == null ? Optional.empty() : Optional.ofNullable(this.webhookUrl);
    }

    public NotificationSettingsResponse(
        @Nullable String emailRecipient,
        @Nullable String notificationLocale,
        @Nullable String status,
        @Nullable Integer timeInMinutes,
        @Nullable String webhookUrl) {
        this.emailRecipient = emailRecipient;
        this.notificationLocale = notificationLocale;
        this.status = status == null ? "Disabled" : status;
        this.timeInMinutes = timeInMinutes;
        this.webhookUrl = webhookUrl;
    }

    private NotificationSettingsResponse() {
        this.emailRecipient = null;
        this.notificationLocale = null;
        this.status = null;
        this.timeInMinutes = null;
        this.webhookUrl = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(NotificationSettingsResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String emailRecipient;
        private @Nullable String notificationLocale;
        private @Nullable String status;
        private @Nullable Integer timeInMinutes;
        private @Nullable String webhookUrl;

        public Builder() {
    	      // Empty
        }

        public Builder(NotificationSettingsResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.emailRecipient = defaults.emailRecipient;
    	      this.notificationLocale = defaults.notificationLocale;
    	      this.status = defaults.status;
    	      this.timeInMinutes = defaults.timeInMinutes;
    	      this.webhookUrl = defaults.webhookUrl;
        }

        public Builder setEmailRecipient(@Nullable String emailRecipient) {
            this.emailRecipient = emailRecipient;
            return this;
        }

        public Builder setNotificationLocale(@Nullable String notificationLocale) {
            this.notificationLocale = notificationLocale;
            return this;
        }

        public Builder setStatus(@Nullable String status) {
            this.status = status;
            return this;
        }

        public Builder setTimeInMinutes(@Nullable Integer timeInMinutes) {
            this.timeInMinutes = timeInMinutes;
            return this;
        }

        public Builder setWebhookUrl(@Nullable String webhookUrl) {
            this.webhookUrl = webhookUrl;
            return this;
        }
        public NotificationSettingsResponse build() {
            return new NotificationSettingsResponse(emailRecipient, notificationLocale, status, timeInMinutes, webhookUrl);
        }
    }
}
