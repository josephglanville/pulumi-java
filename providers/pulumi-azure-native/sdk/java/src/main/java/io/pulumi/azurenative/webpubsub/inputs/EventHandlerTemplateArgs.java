// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.webpubsub.inputs;

import io.pulumi.azurenative.webpubsub.inputs.UpstreamAuthSettingsArgs;
import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * EventHandler template item settings.
 * 
 */
public final class EventHandlerTemplateArgs extends io.pulumi.resources.ResourceArgs {

    public static final EventHandlerTemplateArgs Empty = new EventHandlerTemplateArgs();

    /**
     * Gets or sets the auth settings for an event handler. If not set, no auth is used.
     * 
     */
    @InputImport(name="auth")
      private final @Nullable Input<UpstreamAuthSettingsArgs> auth;

    public Input<UpstreamAuthSettingsArgs> getAuth() {
        return this.auth == null ? Input.empty() : this.auth;
    }

    /**
     * Gets ot sets the system event pattern.
     * There are 2 kind of patterns supported:
     *     1. The single event name, for example, "connect", it matches "connect"
     *     2. Combine multiple events with ",", for example "connect,disconnected", it matches event "connect" and "disconnected"
     * 
     */
    @InputImport(name="systemEventPattern")
      private final @Nullable Input<String> systemEventPattern;

    public Input<String> getSystemEventPattern() {
        return this.systemEventPattern == null ? Input.empty() : this.systemEventPattern;
    }

    /**
     * Gets or sets the EventHandler URL template. You can use a predefined parameter {hub} and {event} inside the template, the value of the EventHandler URL is dynamically calculated when the client request comes in.
     * For example, UrlTemplate can be `http://example.com/api/{hub}/{event}`. The host part can't contains parameters.
     * 
     */
    @InputImport(name="urlTemplate", required=true)
      private final Input<String> urlTemplate;

    public Input<String> getUrlTemplate() {
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
    @InputImport(name="userEventPattern")
      private final @Nullable Input<String> userEventPattern;

    public Input<String> getUserEventPattern() {
        return this.userEventPattern == null ? Input.empty() : this.userEventPattern;
    }

    public EventHandlerTemplateArgs(
        @Nullable Input<UpstreamAuthSettingsArgs> auth,
        @Nullable Input<String> systemEventPattern,
        Input<String> urlTemplate,
        @Nullable Input<String> userEventPattern) {
        this.auth = auth;
        this.systemEventPattern = systemEventPattern;
        this.urlTemplate = Objects.requireNonNull(urlTemplate, "expected parameter 'urlTemplate' to be non-null");
        this.userEventPattern = userEventPattern;
    }

    private EventHandlerTemplateArgs() {
        this.auth = Input.empty();
        this.systemEventPattern = Input.empty();
        this.urlTemplate = Input.empty();
        this.userEventPattern = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(EventHandlerTemplateArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<UpstreamAuthSettingsArgs> auth;
        private @Nullable Input<String> systemEventPattern;
        private Input<String> urlTemplate;
        private @Nullable Input<String> userEventPattern;

        public Builder() {
    	      // Empty
        }

        public Builder(EventHandlerTemplateArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.auth = defaults.auth;
    	      this.systemEventPattern = defaults.systemEventPattern;
    	      this.urlTemplate = defaults.urlTemplate;
    	      this.userEventPattern = defaults.userEventPattern;
        }

        public Builder setAuth(@Nullable Input<UpstreamAuthSettingsArgs> auth) {
            this.auth = auth;
            return this;
        }

        public Builder setAuth(@Nullable UpstreamAuthSettingsArgs auth) {
            this.auth = Input.ofNullable(auth);
            return this;
        }

        public Builder setSystemEventPattern(@Nullable Input<String> systemEventPattern) {
            this.systemEventPattern = systemEventPattern;
            return this;
        }

        public Builder setSystemEventPattern(@Nullable String systemEventPattern) {
            this.systemEventPattern = Input.ofNullable(systemEventPattern);
            return this;
        }

        public Builder setUrlTemplate(Input<String> urlTemplate) {
            this.urlTemplate = Objects.requireNonNull(urlTemplate);
            return this;
        }

        public Builder setUrlTemplate(String urlTemplate) {
            this.urlTemplate = Input.of(Objects.requireNonNull(urlTemplate));
            return this;
        }

        public Builder setUserEventPattern(@Nullable Input<String> userEventPattern) {
            this.userEventPattern = userEventPattern;
            return this;
        }

        public Builder setUserEventPattern(@Nullable String userEventPattern) {
            this.userEventPattern = Input.ofNullable(userEventPattern);
            return this;
        }
        public EventHandlerTemplateArgs build() {
            return new EventHandlerTemplateArgs(auth, systemEventPattern, urlTemplate, userEventPattern);
        }
    }
}
