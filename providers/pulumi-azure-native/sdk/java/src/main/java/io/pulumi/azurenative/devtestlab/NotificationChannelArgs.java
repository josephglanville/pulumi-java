// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.devtestlab;

import io.pulumi.azurenative.devtestlab.inputs.EventArgs;
import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import javax.annotation.Nullable;


public final class NotificationChannelArgs extends io.pulumi.resources.ResourceArgs {

    public static final NotificationChannelArgs Empty = new NotificationChannelArgs();

    /**
     * Description of notification.
     * 
     */
    @InputImport(name="description")
      private final @Nullable Input<String> description;

    public Input<String> getDescription() {
        return this.description == null ? Input.empty() : this.description;
    }

    /**
     * The email recipient to send notifications to (can be a list of semi-colon separated email addresses).
     * 
     */
    @InputImport(name="emailRecipient")
      private final @Nullable Input<String> emailRecipient;

    public Input<String> getEmailRecipient() {
        return this.emailRecipient == null ? Input.empty() : this.emailRecipient;
    }

    /**
     * The list of event for which this notification is enabled.
     * 
     */
    @InputImport(name="events")
      private final @Nullable Input<List<EventArgs>> events;

    public Input<List<EventArgs>> getEvents() {
        return this.events == null ? Input.empty() : this.events;
    }

    /**
     * The name of the lab.
     * 
     */
    @InputImport(name="labName", required=true)
      private final Input<String> labName;

    public Input<String> getLabName() {
        return this.labName;
    }

    /**
     * The location of the resource.
     * 
     */
    @InputImport(name="location")
      private final @Nullable Input<String> location;

    public Input<String> getLocation() {
        return this.location == null ? Input.empty() : this.location;
    }

    /**
     * The name of the notification channel.
     * 
     */
    @InputImport(name="name")
      private final @Nullable Input<String> name;

    public Input<String> getName() {
        return this.name == null ? Input.empty() : this.name;
    }

    /**
     * The locale to use when sending a notification (fallback for unsupported languages is EN).
     * 
     */
    @InputImport(name="notificationLocale")
      private final @Nullable Input<String> notificationLocale;

    public Input<String> getNotificationLocale() {
        return this.notificationLocale == null ? Input.empty() : this.notificationLocale;
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
     * The tags of the resource.
     * 
     */
    @InputImport(name="tags")
      private final @Nullable Input<Map<String,String>> tags;

    public Input<Map<String,String>> getTags() {
        return this.tags == null ? Input.empty() : this.tags;
    }

    /**
     * The webhook URL to send notifications to.
     * 
     */
    @InputImport(name="webHookUrl")
      private final @Nullable Input<String> webHookUrl;

    public Input<String> getWebHookUrl() {
        return this.webHookUrl == null ? Input.empty() : this.webHookUrl;
    }

    public NotificationChannelArgs(
        @Nullable Input<String> description,
        @Nullable Input<String> emailRecipient,
        @Nullable Input<List<EventArgs>> events,
        Input<String> labName,
        @Nullable Input<String> location,
        @Nullable Input<String> name,
        @Nullable Input<String> notificationLocale,
        Input<String> resourceGroupName,
        @Nullable Input<Map<String,String>> tags,
        @Nullable Input<String> webHookUrl) {
        this.description = description;
        this.emailRecipient = emailRecipient;
        this.events = events;
        this.labName = Objects.requireNonNull(labName, "expected parameter 'labName' to be non-null");
        this.location = location;
        this.name = name;
        this.notificationLocale = notificationLocale;
        this.resourceGroupName = Objects.requireNonNull(resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
        this.tags = tags;
        this.webHookUrl = webHookUrl;
    }

    private NotificationChannelArgs() {
        this.description = Input.empty();
        this.emailRecipient = Input.empty();
        this.events = Input.empty();
        this.labName = Input.empty();
        this.location = Input.empty();
        this.name = Input.empty();
        this.notificationLocale = Input.empty();
        this.resourceGroupName = Input.empty();
        this.tags = Input.empty();
        this.webHookUrl = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(NotificationChannelArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<String> description;
        private @Nullable Input<String> emailRecipient;
        private @Nullable Input<List<EventArgs>> events;
        private Input<String> labName;
        private @Nullable Input<String> location;
        private @Nullable Input<String> name;
        private @Nullable Input<String> notificationLocale;
        private Input<String> resourceGroupName;
        private @Nullable Input<Map<String,String>> tags;
        private @Nullable Input<String> webHookUrl;

        public Builder() {
    	      // Empty
        }

        public Builder(NotificationChannelArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.description = defaults.description;
    	      this.emailRecipient = defaults.emailRecipient;
    	      this.events = defaults.events;
    	      this.labName = defaults.labName;
    	      this.location = defaults.location;
    	      this.name = defaults.name;
    	      this.notificationLocale = defaults.notificationLocale;
    	      this.resourceGroupName = defaults.resourceGroupName;
    	      this.tags = defaults.tags;
    	      this.webHookUrl = defaults.webHookUrl;
        }

        public Builder setDescription(@Nullable Input<String> description) {
            this.description = description;
            return this;
        }

        public Builder setDescription(@Nullable String description) {
            this.description = Input.ofNullable(description);
            return this;
        }

        public Builder setEmailRecipient(@Nullable Input<String> emailRecipient) {
            this.emailRecipient = emailRecipient;
            return this;
        }

        public Builder setEmailRecipient(@Nullable String emailRecipient) {
            this.emailRecipient = Input.ofNullable(emailRecipient);
            return this;
        }

        public Builder setEvents(@Nullable Input<List<EventArgs>> events) {
            this.events = events;
            return this;
        }

        public Builder setEvents(@Nullable List<EventArgs> events) {
            this.events = Input.ofNullable(events);
            return this;
        }

        public Builder setLabName(Input<String> labName) {
            this.labName = Objects.requireNonNull(labName);
            return this;
        }

        public Builder setLabName(String labName) {
            this.labName = Input.of(Objects.requireNonNull(labName));
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

        public Builder setName(@Nullable Input<String> name) {
            this.name = name;
            return this;
        }

        public Builder setName(@Nullable String name) {
            this.name = Input.ofNullable(name);
            return this;
        }

        public Builder setNotificationLocale(@Nullable Input<String> notificationLocale) {
            this.notificationLocale = notificationLocale;
            return this;
        }

        public Builder setNotificationLocale(@Nullable String notificationLocale) {
            this.notificationLocale = Input.ofNullable(notificationLocale);
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

        public Builder setTags(@Nullable Input<Map<String,String>> tags) {
            this.tags = tags;
            return this;
        }

        public Builder setTags(@Nullable Map<String,String> tags) {
            this.tags = Input.ofNullable(tags);
            return this;
        }

        public Builder setWebHookUrl(@Nullable Input<String> webHookUrl) {
            this.webHookUrl = webHookUrl;
            return this;
        }

        public Builder setWebHookUrl(@Nullable String webHookUrl) {
            this.webHookUrl = Input.ofNullable(webHookUrl);
            return this;
        }
        public NotificationChannelArgs build() {
            return new NotificationChannelArgs(description, emailRecipient, events, labName, location, name, notificationLocale, resourceGroupName, tags, webHookUrl);
        }
    }
}
