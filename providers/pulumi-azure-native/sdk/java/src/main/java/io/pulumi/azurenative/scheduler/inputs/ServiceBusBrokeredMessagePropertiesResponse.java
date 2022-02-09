// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.scheduler.inputs;

import io.pulumi.core.internal.annotations.InputImport;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class ServiceBusBrokeredMessagePropertiesResponse extends io.pulumi.resources.InvokeArgs {

    public static final ServiceBusBrokeredMessagePropertiesResponse Empty = new ServiceBusBrokeredMessagePropertiesResponse();

    @InputImport(name="contentType")
    private final @Nullable String contentType;

    public Optional<String> getContentType() {
        return this.contentType == null ? Optional.empty() : Optional.ofNullable(this.contentType);
    }

    @InputImport(name="correlationId")
    private final @Nullable String correlationId;

    public Optional<String> getCorrelationId() {
        return this.correlationId == null ? Optional.empty() : Optional.ofNullable(this.correlationId);
    }

    @InputImport(name="forcePersistence")
    private final @Nullable Boolean forcePersistence;

    public Optional<Boolean> getForcePersistence() {
        return this.forcePersistence == null ? Optional.empty() : Optional.ofNullable(this.forcePersistence);
    }

    @InputImport(name="label")
    private final @Nullable String label;

    public Optional<String> getLabel() {
        return this.label == null ? Optional.empty() : Optional.ofNullable(this.label);
    }

    @InputImport(name="messageId")
    private final @Nullable String messageId;

    public Optional<String> getMessageId() {
        return this.messageId == null ? Optional.empty() : Optional.ofNullable(this.messageId);
    }

    @InputImport(name="partitionKey")
    private final @Nullable String partitionKey;

    public Optional<String> getPartitionKey() {
        return this.partitionKey == null ? Optional.empty() : Optional.ofNullable(this.partitionKey);
    }

    @InputImport(name="replyTo")
    private final @Nullable String replyTo;

    public Optional<String> getReplyTo() {
        return this.replyTo == null ? Optional.empty() : Optional.ofNullable(this.replyTo);
    }

    @InputImport(name="replyToSessionId")
    private final @Nullable String replyToSessionId;

    public Optional<String> getReplyToSessionId() {
        return this.replyToSessionId == null ? Optional.empty() : Optional.ofNullable(this.replyToSessionId);
    }

    @InputImport(name="scheduledEnqueueTimeUtc")
    private final @Nullable String scheduledEnqueueTimeUtc;

    public Optional<String> getScheduledEnqueueTimeUtc() {
        return this.scheduledEnqueueTimeUtc == null ? Optional.empty() : Optional.ofNullable(this.scheduledEnqueueTimeUtc);
    }

    @InputImport(name="sessionId")
    private final @Nullable String sessionId;

    public Optional<String> getSessionId() {
        return this.sessionId == null ? Optional.empty() : Optional.ofNullable(this.sessionId);
    }

    @InputImport(name="timeToLive")
    private final @Nullable String timeToLive;

    public Optional<String> getTimeToLive() {
        return this.timeToLive == null ? Optional.empty() : Optional.ofNullable(this.timeToLive);
    }

    @InputImport(name="to")
    private final @Nullable String to;

    public Optional<String> getTo() {
        return this.to == null ? Optional.empty() : Optional.ofNullable(this.to);
    }

    @InputImport(name="viaPartitionKey")
    private final @Nullable String viaPartitionKey;

    public Optional<String> getViaPartitionKey() {
        return this.viaPartitionKey == null ? Optional.empty() : Optional.ofNullable(this.viaPartitionKey);
    }

    public ServiceBusBrokeredMessagePropertiesResponse(
        @Nullable String contentType,
        @Nullable String correlationId,
        @Nullable Boolean forcePersistence,
        @Nullable String label,
        @Nullable String messageId,
        @Nullable String partitionKey,
        @Nullable String replyTo,
        @Nullable String replyToSessionId,
        @Nullable String scheduledEnqueueTimeUtc,
        @Nullable String sessionId,
        @Nullable String timeToLive,
        @Nullable String to,
        @Nullable String viaPartitionKey) {
        this.contentType = contentType;
        this.correlationId = correlationId;
        this.forcePersistence = forcePersistence;
        this.label = label;
        this.messageId = messageId;
        this.partitionKey = partitionKey;
        this.replyTo = replyTo;
        this.replyToSessionId = replyToSessionId;
        this.scheduledEnqueueTimeUtc = scheduledEnqueueTimeUtc;
        this.sessionId = sessionId;
        this.timeToLive = timeToLive;
        this.to = to;
        this.viaPartitionKey = viaPartitionKey;
    }

    private ServiceBusBrokeredMessagePropertiesResponse() {
        this.contentType = null;
        this.correlationId = null;
        this.forcePersistence = null;
        this.label = null;
        this.messageId = null;
        this.partitionKey = null;
        this.replyTo = null;
        this.replyToSessionId = null;
        this.scheduledEnqueueTimeUtc = null;
        this.sessionId = null;
        this.timeToLive = null;
        this.to = null;
        this.viaPartitionKey = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ServiceBusBrokeredMessagePropertiesResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String contentType;
        private @Nullable String correlationId;
        private @Nullable Boolean forcePersistence;
        private @Nullable String label;
        private @Nullable String messageId;
        private @Nullable String partitionKey;
        private @Nullable String replyTo;
        private @Nullable String replyToSessionId;
        private @Nullable String scheduledEnqueueTimeUtc;
        private @Nullable String sessionId;
        private @Nullable String timeToLive;
        private @Nullable String to;
        private @Nullable String viaPartitionKey;

        public Builder() {
    	      // Empty
        }

        public Builder(ServiceBusBrokeredMessagePropertiesResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.contentType = defaults.contentType;
    	      this.correlationId = defaults.correlationId;
    	      this.forcePersistence = defaults.forcePersistence;
    	      this.label = defaults.label;
    	      this.messageId = defaults.messageId;
    	      this.partitionKey = defaults.partitionKey;
    	      this.replyTo = defaults.replyTo;
    	      this.replyToSessionId = defaults.replyToSessionId;
    	      this.scheduledEnqueueTimeUtc = defaults.scheduledEnqueueTimeUtc;
    	      this.sessionId = defaults.sessionId;
    	      this.timeToLive = defaults.timeToLive;
    	      this.to = defaults.to;
    	      this.viaPartitionKey = defaults.viaPartitionKey;
        }

        public Builder setContentType(@Nullable String contentType) {
            this.contentType = contentType;
            return this;
        }

        public Builder setCorrelationId(@Nullable String correlationId) {
            this.correlationId = correlationId;
            return this;
        }

        public Builder setForcePersistence(@Nullable Boolean forcePersistence) {
            this.forcePersistence = forcePersistence;
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

        public Builder setPartitionKey(@Nullable String partitionKey) {
            this.partitionKey = partitionKey;
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

        public Builder setScheduledEnqueueTimeUtc(@Nullable String scheduledEnqueueTimeUtc) {
            this.scheduledEnqueueTimeUtc = scheduledEnqueueTimeUtc;
            return this;
        }

        public Builder setSessionId(@Nullable String sessionId) {
            this.sessionId = sessionId;
            return this;
        }

        public Builder setTimeToLive(@Nullable String timeToLive) {
            this.timeToLive = timeToLive;
            return this;
        }

        public Builder setTo(@Nullable String to) {
            this.to = to;
            return this;
        }

        public Builder setViaPartitionKey(@Nullable String viaPartitionKey) {
            this.viaPartitionKey = viaPartitionKey;
            return this;
        }

        public ServiceBusBrokeredMessagePropertiesResponse build() {
            return new ServiceBusBrokeredMessagePropertiesResponse(contentType, correlationId, forcePersistence, label, messageId, partitionKey, replyTo, replyToSessionId, scheduledEnqueueTimeUtc, sessionId, timeToLive, to, viaPartitionKey);
        }
    }
}
