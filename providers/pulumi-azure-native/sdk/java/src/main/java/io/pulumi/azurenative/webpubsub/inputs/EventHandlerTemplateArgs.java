// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.webpubsub.inputs;

import io.pulumi.azurenative.webpubsub.inputs.UpstreamAuthSettingsArgs;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
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
    @Import(name="auth")
      private final @Nullable Output<UpstreamAuthSettingsArgs> auth;

    public Output<UpstreamAuthSettingsArgs> getAuth() {
        return this.auth == null ? Output.empty() : this.auth;
    }

    /**
     * Gets ot sets the system event pattern.
     * There are 2 kind of patterns supported:
     *     1. The single event name, for example, "connect", it matches "connect"
     *     2. Combine multiple events with ",", for example "connect,disconnected", it matches event "connect" and "disconnected"
     * 
     */
    @Import(name="systemEventPattern")
      private final @Nullable Output<String> systemEventPattern;

    public Output<String> getSystemEventPattern() {
        return this.systemEventPattern == null ? Output.empty() : this.systemEventPattern;
    }

    /**
     * Gets or sets the EventHandler URL template. You can use a predefined parameter {hub} and {event} inside the template, the value of the EventHandler URL is dynamically calculated when the client request comes in.
     * For example, UrlTemplate can be `http://example.com/api/{hub}/{event}`. The host part can't contains parameters.
     * 
     */
    @Import(name="urlTemplate", required=true)
      private final Output<String> urlTemplate;

    public Output<String> getUrlTemplate() {
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
    @Import(name="userEventPattern")
      private final @Nullable Output<String> userEventPattern;

    public Output<String> getUserEventPattern() {
        return this.userEventPattern == null ? Output.empty() : this.userEventPattern;
    }

    public EventHandlerTemplateArgs(
        @Nullable Output<UpstreamAuthSettingsArgs> auth,
        @Nullable Output<String> systemEventPattern,
        Output<String> urlTemplate,
        @Nullable Output<String> userEventPattern) {
        this.auth = auth;
        this.systemEventPattern = systemEventPattern;
        this.urlTemplate = Objects.requireNonNull(urlTemplate, "expected parameter 'urlTemplate' to be non-null");
        this.userEventPattern = userEventPattern;
    }

    private EventHandlerTemplateArgs() {
        this.auth = Output.empty();
        this.systemEventPattern = Output.empty();
        this.urlTemplate = Output.empty();
        this.userEventPattern = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(EventHandlerTemplateArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<UpstreamAuthSettingsArgs> auth;
        private @Nullable Output<String> systemEventPattern;
        private Output<String> urlTemplate;
        private @Nullable Output<String> userEventPattern;

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

        public Builder auth(@Nullable Output<UpstreamAuthSettingsArgs> auth) {
            this.auth = auth;
            return this;
        }
        public Builder auth(@Nullable UpstreamAuthSettingsArgs auth) {
            this.auth = Output.ofNullable(auth);
            return this;
        }
        public Builder systemEventPattern(@Nullable Output<String> systemEventPattern) {
            this.systemEventPattern = systemEventPattern;
            return this;
        }
        public Builder systemEventPattern(@Nullable String systemEventPattern) {
            this.systemEventPattern = Output.ofNullable(systemEventPattern);
            return this;
        }
        public Builder urlTemplate(Output<String> urlTemplate) {
            this.urlTemplate = Objects.requireNonNull(urlTemplate);
            return this;
        }
        public Builder urlTemplate(String urlTemplate) {
            this.urlTemplate = Output.of(Objects.requireNonNull(urlTemplate));
            return this;
        }
        public Builder userEventPattern(@Nullable Output<String> userEventPattern) {
            this.userEventPattern = userEventPattern;
            return this;
        }
        public Builder userEventPattern(@Nullable String userEventPattern) {
            this.userEventPattern = Output.ofNullable(userEventPattern);
            return this;
        }        public EventHandlerTemplateArgs build() {
            return new EventHandlerTemplateArgs(auth, systemEventPattern, urlTemplate, userEventPattern);
        }
    }
}
