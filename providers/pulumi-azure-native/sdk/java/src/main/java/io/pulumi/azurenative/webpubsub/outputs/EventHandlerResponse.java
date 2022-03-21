// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.webpubsub.outputs;

import io.pulumi.azurenative.webpubsub.outputs.UpstreamAuthSettingsResponse;
import io.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class EventHandlerResponse {
    /**
     * Upstream auth settings. If not set, no auth is used for upstream messages.
     * 
     */
    private final @Nullable UpstreamAuthSettingsResponse auth;
    /**
     * Gets ot sets the list of system events.
     * 
     */
    private final @Nullable List<String> systemEvents;
    /**
     * Gets or sets the EventHandler URL template. You can use a predefined parameter {hub} and {event} inside the template, the value of the EventHandler URL is dynamically calculated when the client request comes in.
     * For example, UrlTemplate can be `http://example.com/api/{hub}/{event}`. The host part can't contains parameters.
     * 
     */
    private final String urlTemplate;
    /**
     * Gets or sets the matching pattern for event names.
     * There are 3 kind of patterns supported:
     *     1. "*", it to matches any event name
     *     2. Combine multiple events with ",", for example "event1,event2", it matches event "event1" and "event2"
     *     3. The single event name, for example, "event1", it matches "event1"
     * 
     */
    private final @Nullable String userEventPattern;

    @CustomType.Constructor
    private EventHandlerResponse(
        @CustomType.Parameter("auth") @Nullable UpstreamAuthSettingsResponse auth,
        @CustomType.Parameter("systemEvents") @Nullable List<String> systemEvents,
        @CustomType.Parameter("urlTemplate") String urlTemplate,
        @CustomType.Parameter("userEventPattern") @Nullable String userEventPattern) {
        this.auth = auth;
        this.systemEvents = systemEvents;
        this.urlTemplate = urlTemplate;
        this.userEventPattern = userEventPattern;
    }

    /**
     * Upstream auth settings. If not set, no auth is used for upstream messages.
     * 
    */
    public Optional<UpstreamAuthSettingsResponse> getAuth() {
        return Optional.ofNullable(this.auth);
    }
    /**
     * Gets ot sets the list of system events.
     * 
    */
    public List<String> getSystemEvents() {
        return this.systemEvents == null ? List.of() : this.systemEvents;
    }
    /**
     * Gets or sets the EventHandler URL template. You can use a predefined parameter {hub} and {event} inside the template, the value of the EventHandler URL is dynamically calculated when the client request comes in.
     * For example, UrlTemplate can be `http://example.com/api/{hub}/{event}`. The host part can't contains parameters.
     * 
    */
    public String getUrlTemplate() {
        return this.urlTemplate;
    }
    /**
     * Gets or sets the matching pattern for event names.
     * There are 3 kind of patterns supported:
     *     1. "*", it to matches any event name
     *     2. Combine multiple events with ",", for example "event1,event2", it matches event "event1" and "event2"
     *     3. The single event name, for example, "event1", it matches "event1"
     * 
    */
    public Optional<String> getUserEventPattern() {
        return Optional.ofNullable(this.userEventPattern);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(EventHandlerResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable UpstreamAuthSettingsResponse auth;
        private @Nullable List<String> systemEvents;
        private String urlTemplate;
        private @Nullable String userEventPattern;

        public Builder() {
    	      // Empty
        }

        public Builder(EventHandlerResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.auth = defaults.auth;
    	      this.systemEvents = defaults.systemEvents;
    	      this.urlTemplate = defaults.urlTemplate;
    	      this.userEventPattern = defaults.userEventPattern;
        }

        public Builder auth(@Nullable UpstreamAuthSettingsResponse auth) {
            this.auth = auth;
            return this;
        }
        public Builder systemEvents(@Nullable List<String> systemEvents) {
            this.systemEvents = systemEvents;
            return this;
        }
        public Builder systemEvents(String... systemEvents) {
            return systemEvents(List.of(systemEvents));
        }
        public Builder urlTemplate(String urlTemplate) {
            this.urlTemplate = Objects.requireNonNull(urlTemplate);
            return this;
        }
        public Builder userEventPattern(@Nullable String userEventPattern) {
            this.userEventPattern = userEventPattern;
            return this;
        }        public EventHandlerResponse build() {
            return new EventHandlerResponse(auth, systemEvents, urlTemplate, userEventPattern);
        }
    }
}
