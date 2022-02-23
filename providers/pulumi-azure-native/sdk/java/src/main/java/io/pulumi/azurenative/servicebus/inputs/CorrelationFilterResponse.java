// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.servicebus.inputs;

import io.pulumi.core.annotations.InputImport;
import java.lang.Boolean;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Represents the correlation filter expression.
 * 
 */
public final class CorrelationFilterResponse extends io.pulumi.resources.InvokeArgs {

    public static final CorrelationFilterResponse Empty = new CorrelationFilterResponse();

    /**
     * Content type of the message.
     * 
     */
    @InputImport(name="contentType")
      private final @Nullable String contentType;

    public Optional<String> getContentType() {
        return this.contentType == null ? Optional.empty() : Optional.ofNullable(this.contentType);
    }

    /**
     * Identifier of the correlation.
     * 
     */
    @InputImport(name="correlationId")
      private final @Nullable String correlationId;

    public Optional<String> getCorrelationId() {
        return this.correlationId == null ? Optional.empty() : Optional.ofNullable(this.correlationId);
    }

    /**
     * Application specific label.
     * 
     */
    @InputImport(name="label")
      private final @Nullable String label;

    public Optional<String> getLabel() {
        return this.label == null ? Optional.empty() : Optional.ofNullable(this.label);
    }

    /**
     * Identifier of the message.
     * 
     */
    @InputImport(name="messageId")
      private final @Nullable String messageId;

    public Optional<String> getMessageId() {
        return this.messageId == null ? Optional.empty() : Optional.ofNullable(this.messageId);
    }

    /**
     * dictionary object for custom filters
     * 
     */
    @InputImport(name="properties")
      private final @Nullable Map<String,String> properties;

    public Map<String,String> getProperties() {
        return this.properties == null ? Map.of() : this.properties;
    }

    /**
     * Address of the queue to reply to.
     * 
     */
    @InputImport(name="replyTo")
      private final @Nullable String replyTo;

    public Optional<String> getReplyTo() {
        return this.replyTo == null ? Optional.empty() : Optional.ofNullable(this.replyTo);
    }

    /**
     * Session identifier to reply to.
     * 
     */
    @InputImport(name="replyToSessionId")
      private final @Nullable String replyToSessionId;

    public Optional<String> getReplyToSessionId() {
        return this.replyToSessionId == null ? Optional.empty() : Optional.ofNullable(this.replyToSessionId);
    }

    /**
     * Value that indicates whether the rule action requires preprocessing.
     * 
     */
    @InputImport(name="requiresPreprocessing")
      private final @Nullable Boolean requiresPreprocessing;

    public Optional<Boolean> getRequiresPreprocessing() {
        return this.requiresPreprocessing == null ? Optional.empty() : Optional.ofNullable(this.requiresPreprocessing);
    }

    /**
     * Session identifier.
     * 
     */
    @InputImport(name="sessionId")
      private final @Nullable String sessionId;

    public Optional<String> getSessionId() {
        return this.sessionId == null ? Optional.empty() : Optional.ofNullable(this.sessionId);
    }

    /**
     * Address to send to.
     * 
     */
    @InputImport(name="to")
      private final @Nullable String to;

    public Optional<String> getTo() {
        return this.to == null ? Optional.empty() : Optional.ofNullable(this.to);
    }

    public CorrelationFilterResponse(
        @Nullable String contentType,
        @Nullable String correlationId,
        @Nullable String label,
        @Nullable String messageId,
        @Nullable Map<String,String> properties,
        @Nullable String replyTo,
        @Nullable String replyToSessionId,
        @Nullable Boolean requiresPreprocessing,
        @Nullable String sessionId,
        @Nullable String to) {
        this.contentType = contentType;
        this.correlationId = correlationId;
        this.label = label;
        this.messageId = messageId;
        this.properties = properties;
        this.replyTo = replyTo;
        this.replyToSessionId = replyToSessionId;
        this.requiresPreprocessing = requiresPreprocessing == null ? true : requiresPreprocessing;
        this.sessionId = sessionId;
        this.to = to;
    }

    private CorrelationFilterResponse() {
        this.contentType = null;
        this.correlationId = null;
        this.label = null;
        this.messageId = null;
        this.properties = Map.of();
        this.replyTo = null;
        this.replyToSessionId = null;
        this.requiresPreprocessing = null;
        this.sessionId = null;
        this.to = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(CorrelationFilterResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String contentType;
        private @Nullable String correlationId;
        private @Nullable String label;
        private @Nullable String messageId;
        private @Nullable Map<String,String> properties;
        private @Nullable String replyTo;
        private @Nullable String replyToSessionId;
        private @Nullable Boolean requiresPreprocessing;
        private @Nullable String sessionId;
        private @Nullable String to;

        public Builder() {
    	      // Empty
        }

        public Builder(CorrelationFilterResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.contentType = defaults.contentType;
    	      this.correlationId = defaults.correlationId;
    	      this.label = defaults.label;
    	      this.messageId = defaults.messageId;
    	      this.properties = defaults.properties;
    	      this.replyTo = defaults.replyTo;
    	      this.replyToSessionId = defaults.replyToSessionId;
    	      this.requiresPreprocessing = defaults.requiresPreprocessing;
    	      this.sessionId = defaults.sessionId;
    	      this.to = defaults.to;
        }

        public Builder setContentType(@Nullable String contentType) {
            this.contentType = contentType;
            return this;
        }

        public Builder setCorrelationId(@Nullable String correlationId) {
            this.correlationId = correlationId;
            return this;
        }

        public Builder setLabel(@Nullable String label) {
            this.label = label;
            return this;
        }

        public Builder setMessageId(@Nullable String messageId) {
            this.messageId = messageId;
            return this;
        }

        public Builder setProperties(@Nullable Map<String,String> properties) {
            this.properties = properties;
            return this;
        }

        public Builder setReplyTo(@Nullable String replyTo) {
            this.replyTo = replyTo;
            return this;
        }

        public Builder setReplyToSessionId(@Nullable String replyToSessionId) {
            this.replyToSessionId = replyToSessionId;
            return this;
        }

        public Builder setRequiresPreprocessing(@Nullable Boolean requiresPreprocessing) {
            this.requiresPreprocessing = requiresPreprocessing;
            return this;
        }

        public Builder setSessionId(@Nullable String sessionId) {
            this.sessionId = sessionId;
            return this;
        }

        public Builder setTo(@Nullable String to) {
            this.to = to;
            return this;
        }
        public CorrelationFilterResponse build() {
            return new CorrelationFilterResponse(contentType, correlationId, label, messageId, properties, replyTo, replyToSessionId, requiresPreprocessing, sessionId, to);
        }
    }
}
