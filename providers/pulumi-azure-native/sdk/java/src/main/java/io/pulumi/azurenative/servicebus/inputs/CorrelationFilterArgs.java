// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.servicebus.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * Represents the correlation filter expression.
 * 
 */
public final class CorrelationFilterArgs extends io.pulumi.resources.ResourceArgs {

    public static final CorrelationFilterArgs Empty = new CorrelationFilterArgs();

    /**
     * Content type of the message.
     * 
     */
    @Import(name="contentType")
      private final @Nullable Output<String> contentType;

    public Output<String> getContentType() {
        return this.contentType == null ? Output.empty() : this.contentType;
    }

    /**
     * Identifier of the correlation.
     * 
     */
    @Import(name="correlationId")
      private final @Nullable Output<String> correlationId;

    public Output<String> getCorrelationId() {
        return this.correlationId == null ? Output.empty() : this.correlationId;
    }

    /**
     * Application specific label.
     * 
     */
    @Import(name="label")
      private final @Nullable Output<String> label;

    public Output<String> getLabel() {
        return this.label == null ? Output.empty() : this.label;
    }

    /**
     * Identifier of the message.
     * 
     */
    @Import(name="messageId")
      private final @Nullable Output<String> messageId;

    public Output<String> getMessageId() {
        return this.messageId == null ? Output.empty() : this.messageId;
    }

    /**
     * dictionary object for custom filters
     * 
     */
    @Import(name="properties")
      private final @Nullable Output<Map<String,String>> properties;

    public Output<Map<String,String>> getProperties() {
        return this.properties == null ? Output.empty() : this.properties;
    }

    /**
     * Address of the queue to reply to.
     * 
     */
    @Import(name="replyTo")
      private final @Nullable Output<String> replyTo;

    public Output<String> getReplyTo() {
        return this.replyTo == null ? Output.empty() : this.replyTo;
    }

    /**
     * Session identifier to reply to.
     * 
     */
    @Import(name="replyToSessionId")
      private final @Nullable Output<String> replyToSessionId;

    public Output<String> getReplyToSessionId() {
        return this.replyToSessionId == null ? Output.empty() : this.replyToSessionId;
    }

    /**
     * Value that indicates whether the rule action requires preprocessing.
     * 
     */
    @Import(name="requiresPreprocessing")
      private final @Nullable Output<Boolean> requiresPreprocessing;

    public Output<Boolean> getRequiresPreprocessing() {
        return this.requiresPreprocessing == null ? Output.empty() : this.requiresPreprocessing;
    }

    /**
     * Session identifier.
     * 
     */
    @Import(name="sessionId")
      private final @Nullable Output<String> sessionId;

    public Output<String> getSessionId() {
        return this.sessionId == null ? Output.empty() : this.sessionId;
    }

    /**
     * Address to send to.
     * 
     */
    @Import(name="to")
      private final @Nullable Output<String> to;

    public Output<String> getTo() {
        return this.to == null ? Output.empty() : this.to;
    }

    public CorrelationFilterArgs(
        @Nullable Output<String> contentType,
        @Nullable Output<String> correlationId,
        @Nullable Output<String> label,
        @Nullable Output<String> messageId,
        @Nullable Output<Map<String,String>> properties,
        @Nullable Output<String> replyTo,
        @Nullable Output<String> replyToSessionId,
        @Nullable Output<Boolean> requiresPreprocessing,
        @Nullable Output<String> sessionId,
        @Nullable Output<String> to) {
        this.contentType = contentType;
        this.correlationId = correlationId;
        this.label = label;
        this.messageId = messageId;
        this.properties = properties;
        this.replyTo = replyTo;
        this.replyToSessionId = replyToSessionId;
        this.requiresPreprocessing = requiresPreprocessing == null ? Output.ofNullable(true) : requiresPreprocessing;
        this.sessionId = sessionId;
        this.to = to;
    }

    private CorrelationFilterArgs() {
        this.contentType = Output.empty();
        this.correlationId = Output.empty();
        this.label = Output.empty();
        this.messageId = Output.empty();
        this.properties = Output.empty();
        this.replyTo = Output.empty();
        this.replyToSessionId = Output.empty();
        this.requiresPreprocessing = Output.empty();
        this.sessionId = Output.empty();
        this.to = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(CorrelationFilterArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<String> contentType;
        private @Nullable Output<String> correlationId;
        private @Nullable Output<String> label;
        private @Nullable Output<String> messageId;
        private @Nullable Output<Map<String,String>> properties;
        private @Nullable Output<String> replyTo;
        private @Nullable Output<String> replyToSessionId;
        private @Nullable Output<Boolean> requiresPreprocessing;
        private @Nullable Output<String> sessionId;
        private @Nullable Output<String> to;

        public Builder() {
    	      // Empty
        }

        public Builder(CorrelationFilterArgs defaults) {
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

        public Builder contentType(@Nullable Output<String> contentType) {
            this.contentType = contentType;
            return this;
        }
        public Builder contentType(@Nullable String contentType) {
            this.contentType = Output.ofNullable(contentType);
            return this;
        }
        public Builder correlationId(@Nullable Output<String> correlationId) {
            this.correlationId = correlationId;
            return this;
        }
        public Builder correlationId(@Nullable String correlationId) {
            this.correlationId = Output.ofNullable(correlationId);
            return this;
        }
        public Builder label(@Nullable Output<String> label) {
            this.label = label;
            return this;
        }
        public Builder label(@Nullable String label) {
            this.label = Output.ofNullable(label);
            return this;
        }
        public Builder messageId(@Nullable Output<String> messageId) {
            this.messageId = messageId;
            return this;
        }
        public Builder messageId(@Nullable String messageId) {
            this.messageId = Output.ofNullable(messageId);
            return this;
        }
        public Builder properties(@Nullable Output<Map<String,String>> properties) {
            this.properties = properties;
            return this;
        }
        public Builder properties(@Nullable Map<String,String> properties) {
            this.properties = Output.ofNullable(properties);
            return this;
        }
        public Builder replyTo(@Nullable Output<String> replyTo) {
            this.replyTo = replyTo;
            return this;
        }
        public Builder replyTo(@Nullable String replyTo) {
            this.replyTo = Output.ofNullable(replyTo);
            return this;
        }
        public Builder replyToSessionId(@Nullable Output<String> replyToSessionId) {
            this.replyToSessionId = replyToSessionId;
            return this;
        }
        public Builder replyToSessionId(@Nullable String replyToSessionId) {
            this.replyToSessionId = Output.ofNullable(replyToSessionId);
            return this;
        }
        public Builder requiresPreprocessing(@Nullable Output<Boolean> requiresPreprocessing) {
            this.requiresPreprocessing = requiresPreprocessing;
            return this;
        }
        public Builder requiresPreprocessing(@Nullable Boolean requiresPreprocessing) {
            this.requiresPreprocessing = Output.ofNullable(requiresPreprocessing);
            return this;
        }
        public Builder sessionId(@Nullable Output<String> sessionId) {
            this.sessionId = sessionId;
            return this;
        }
        public Builder sessionId(@Nullable String sessionId) {
            this.sessionId = Output.ofNullable(sessionId);
            return this;
        }
        public Builder to(@Nullable Output<String> to) {
            this.to = to;
            return this;
        }
        public Builder to(@Nullable String to) {
            this.to = Output.ofNullable(to);
            return this;
        }        public CorrelationFilterArgs build() {
            return new CorrelationFilterArgs(contentType, correlationId, label, messageId, properties, replyTo, replyToSessionId, requiresPreprocessing, sessionId, to);
        }
    }
}
