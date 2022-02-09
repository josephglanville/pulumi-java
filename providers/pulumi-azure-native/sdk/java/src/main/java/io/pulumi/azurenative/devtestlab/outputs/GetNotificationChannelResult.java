// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.devtestlab.outputs;

import io.pulumi.azurenative.devtestlab.outputs.EventResponse;
import io.pulumi.core.internal.annotations.OutputCustomType;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class GetNotificationChannelResult {
    private final String createdDate;
    private final @Nullable String description;
    private final @Nullable String emailRecipient;
    private final @Nullable List<EventResponse> events;
    private final String id;
    private final @Nullable String location;
    private final String name;
    private final @Nullable String notificationLocale;
    private final String provisioningState;
    private final @Nullable Map<String,String> tags;
    private final String type;
    private final String uniqueIdentifier;
    private final @Nullable String webHookUrl;

    @OutputCustomType.Constructor({"createdDate","description","emailRecipient","events","id","location","name","notificationLocale","provisioningState","tags","type","uniqueIdentifier","webHookUrl"})
    private GetNotificationChannelResult(
        String createdDate,
        @Nullable String description,
        @Nullable String emailRecipient,
        @Nullable List<EventResponse> events,
        String id,
        @Nullable String location,
        String name,
        @Nullable String notificationLocale,
        String provisioningState,
        @Nullable Map<String,String> tags,
        String type,
        String uniqueIdentifier,
        @Nullable String webHookUrl) {
        this.createdDate = Objects.requireNonNull(createdDate);
        this.description = description;
        this.emailRecipient = emailRecipient;
        this.events = events;
        this.id = Objects.requireNonNull(id);
        this.location = location;
        this.name = Objects.requireNonNull(name);
        this.notificationLocale = notificationLocale;
        this.provisioningState = Objects.requireNonNull(provisioningState);
        this.tags = tags;
        this.type = Objects.requireNonNull(type);
        this.uniqueIdentifier = Objects.requireNonNull(uniqueIdentifier);
        this.webHookUrl = webHookUrl;
    }

    public String getCreatedDate() {
        return this.createdDate;
    }
    public Optional<String> getDescription() {
        return Optional.ofNullable(this.description);
    }
    public Optional<String> getEmailRecipient() {
        return Optional.ofNullable(this.emailRecipient);
    }
    public List<EventResponse> getEvents() {
        return this.events == null ? List.of() : this.events;
    }
    public String getId() {
        return this.id;
    }
    public Optional<String> getLocation() {
        return Optional.ofNullable(this.location);
    }
    public String getName() {
        return this.name;
    }
    public Optional<String> getNotificationLocale() {
        return Optional.ofNullable(this.notificationLocale);
    }
    public String getProvisioningState() {
        return this.provisioningState;
    }
    public Map<String,String> getTags() {
        return this.tags == null ? Map.of() : this.tags;
    }
    public String getType() {
        return this.type;
    }
    public String getUniqueIdentifier() {
        return this.uniqueIdentifier;
    }
    public Optional<String> getWebHookUrl() {
        return Optional.ofNullable(this.webHookUrl);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetNotificationChannelResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String createdDate;
        private @Nullable String description;
        private @Nullable String emailRecipient;
        private @Nullable List<EventResponse> events;
        private String id;
        private @Nullable String location;
        private String name;
        private @Nullable String notificationLocale;
        private String provisioningState;
        private @Nullable Map<String,String> tags;
        private String type;
        private String uniqueIdentifier;
        private @Nullable String webHookUrl;

        public Builder() {
    	      // Empty
        }

        public Builder(GetNotificationChannelResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.createdDate = defaults.createdDate;
    	      this.description = defaults.description;
    	      this.emailRecipient = defaults.emailRecipient;
    	      this.events = defaults.events;
    	      this.id = defaults.id;
    	      this.location = defaults.location;
    	      this.name = defaults.name;
    	      this.notificationLocale = defaults.notificationLocale;
    	      this.provisioningState = defaults.provisioningState;
    	      this.tags = defaults.tags;
    	      this.type = defaults.type;
    	      this.uniqueIdentifier = defaults.uniqueIdentifier;
    	      this.webHookUrl = defaults.webHookUrl;
        }

        public Builder setCreatedDate(String createdDate) {
            this.createdDate = Objects.requireNonNull(createdDate);
            return this;
        }

        public Builder setDescription(@Nullable String description) {
            this.description = description;
            return this;
        }

        public Builder setEmailRecipient(@Nullable String emailRecipient) {
            this.emailRecipient = emailRecipient;
            return this;
        }

        public Builder setEvents(@Nullable List<EventResponse> events) {
            this.events = events;
            return this;
        }

        public Builder setId(String id) {
            this.id = Objects.requireNonNull(id);
            return this;
        }

        public Builder setLocation(@Nullable String location) {
            this.location = location;
            return this;
        }

        public Builder setName(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }

        public Builder setNotificationLocale(@Nullable String notificationLocale) {
            this.notificationLocale = notificationLocale;
            return this;
        }

        public Builder setProvisioningState(String provisioningState) {
            this.provisioningState = Objects.requireNonNull(provisioningState);
            return this;
        }

        public Builder setTags(@Nullable Map<String,String> tags) {
            this.tags = tags;
            return this;
        }

        public Builder setType(String type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }

        public Builder setUniqueIdentifier(String uniqueIdentifier) {
            this.uniqueIdentifier = Objects.requireNonNull(uniqueIdentifier);
            return this;
        }

        public Builder setWebHookUrl(@Nullable String webHookUrl) {
            this.webHookUrl = webHookUrl;
            return this;
        }

        public GetNotificationChannelResult build() {
            return new GetNotificationChannelResult(createdDate, description, emailRecipient, events, id, location, name, notificationLocale, provisioningState, tags, type, uniqueIdentifier, webHookUrl);
        }
    }
}
