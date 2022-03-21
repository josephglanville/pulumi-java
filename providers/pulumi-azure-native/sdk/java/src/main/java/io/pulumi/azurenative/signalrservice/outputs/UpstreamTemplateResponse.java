// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.signalrservice.outputs;

import io.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class UpstreamTemplateResponse {
    /**
     * Gets or sets the matching pattern for category names. If not set, it matches any category.
     * There are 3 kind of patterns supported:
     *     1. "*", it to matches any category name
     *     2. Combine multiple categories with ",", for example "connections,messages", it matches category "connections" and "messages"
     *     3. The single category name, for example, "connections", it matches the category "connections"
     * 
     */
    private final @Nullable String categoryPattern;
    /**
     * Gets or sets the matching pattern for event names. If not set, it matches any event.
     * There are 3 kind of patterns supported:
     *     1. "*", it to matches any event name
     *     2. Combine multiple events with ",", for example "connect,disconnect", it matches event "connect" and "disconnect"
     *     3. The single event name, for example, "connect", it matches "connect"
     * 
     */
    private final @Nullable String eventPattern;
    /**
     * Gets or sets the matching pattern for hub names. If not set, it matches any hub.
     * There are 3 kind of patterns supported:
     *     1. "*", it to matches any hub name
     *     2. Combine multiple hubs with ",", for example "hub1,hub2", it matches "hub1" and "hub2"
     *     3. The single hub name, for example, "hub1", it matches "hub1"
     * 
     */
    private final @Nullable String hubPattern;
    /**
     * Gets or sets the Upstream URL template. You can use 3 predefined parameters {hub}, {category} {event} inside the template, the value of the Upstream URL is dynamically calculated when the client request comes in.
     * For example, if the urlTemplate is `http://example.com/{hub}/api/{event}`, with a client request from hub `chat` connects, it will first POST to this URL: `http://example.com/chat/api/connect`.
     * 
     */
    private final String urlTemplate;

    @CustomType.Constructor
    private UpstreamTemplateResponse(
        @CustomType.Parameter("categoryPattern") @Nullable String categoryPattern,
        @CustomType.Parameter("eventPattern") @Nullable String eventPattern,
        @CustomType.Parameter("hubPattern") @Nullable String hubPattern,
        @CustomType.Parameter("urlTemplate") String urlTemplate) {
        this.categoryPattern = categoryPattern;
        this.eventPattern = eventPattern;
        this.hubPattern = hubPattern;
        this.urlTemplate = urlTemplate;
    }

    /**
     * Gets or sets the matching pattern for category names. If not set, it matches any category.
     * There are 3 kind of patterns supported:
     *     1. "*", it to matches any category name
     *     2. Combine multiple categories with ",", for example "connections,messages", it matches category "connections" and "messages"
     *     3. The single category name, for example, "connections", it matches the category "connections"
     * 
    */
    public Optional<String> getCategoryPattern() {
        return Optional.ofNullable(this.categoryPattern);
    }
    /**
     * Gets or sets the matching pattern for event names. If not set, it matches any event.
     * There are 3 kind of patterns supported:
     *     1. "*", it to matches any event name
     *     2. Combine multiple events with ",", for example "connect,disconnect", it matches event "connect" and "disconnect"
     *     3. The single event name, for example, "connect", it matches "connect"
     * 
    */
    public Optional<String> getEventPattern() {
        return Optional.ofNullable(this.eventPattern);
    }
    /**
     * Gets or sets the matching pattern for hub names. If not set, it matches any hub.
     * There are 3 kind of patterns supported:
     *     1. "*", it to matches any hub name
     *     2. Combine multiple hubs with ",", for example "hub1,hub2", it matches "hub1" and "hub2"
     *     3. The single hub name, for example, "hub1", it matches "hub1"
     * 
    */
    public Optional<String> getHubPattern() {
        return Optional.ofNullable(this.hubPattern);
    }
    /**
     * Gets or sets the Upstream URL template. You can use 3 predefined parameters {hub}, {category} {event} inside the template, the value of the Upstream URL is dynamically calculated when the client request comes in.
     * For example, if the urlTemplate is `http://example.com/{hub}/api/{event}`, with a client request from hub `chat` connects, it will first POST to this URL: `http://example.com/chat/api/connect`.
     * 
    */
    public String getUrlTemplate() {
        return this.urlTemplate;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(UpstreamTemplateResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String categoryPattern;
        private @Nullable String eventPattern;
        private @Nullable String hubPattern;
        private String urlTemplate;

        public Builder() {
    	      // Empty
        }

        public Builder(UpstreamTemplateResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.categoryPattern = defaults.categoryPattern;
    	      this.eventPattern = defaults.eventPattern;
    	      this.hubPattern = defaults.hubPattern;
    	      this.urlTemplate = defaults.urlTemplate;
        }

        public Builder categoryPattern(@Nullable String categoryPattern) {
            this.categoryPattern = categoryPattern;
            return this;
        }
        public Builder eventPattern(@Nullable String eventPattern) {
            this.eventPattern = eventPattern;
            return this;
        }
        public Builder hubPattern(@Nullable String hubPattern) {
            this.hubPattern = hubPattern;
            return this;
        }
        public Builder urlTemplate(String urlTemplate) {
            this.urlTemplate = Objects.requireNonNull(urlTemplate);
            return this;
        }        public UpstreamTemplateResponse build() {
            return new UpstreamTemplateResponse(categoryPattern, eventPattern, hubPattern, urlTemplate);
        }
    }
}
