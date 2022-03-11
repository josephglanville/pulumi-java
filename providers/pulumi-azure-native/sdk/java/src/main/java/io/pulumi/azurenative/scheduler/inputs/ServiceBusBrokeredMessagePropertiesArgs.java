// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.scheduler.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.InputImport;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class ServiceBusBrokeredMessagePropertiesArgs extends io.pulumi.resources.ResourceArgs {

    public static final ServiceBusBrokeredMessagePropertiesArgs Empty = new ServiceBusBrokeredMessagePropertiesArgs();

    /**
     * Gets or sets the content type.
     * 
     */
    @InputImport(name="contentType")
      private final @Nullable Output<String> contentType;

    public Output<String> getContentType() {
        return this.contentType == null ? Output.empty() : this.contentType;
    }

    /**
     * Gets or sets the correlation ID.
     * 
     */
    @InputImport(name="correlationId")
      private final @Nullable Output<String> correlationId;

    public Output<String> getCorrelationId() {
        return this.correlationId == null ? Output.empty() : this.correlationId;
    }

    /**
     * Gets or sets the force persistence.
     * 
     */
    @InputImport(name="forcePersistence")
      private final @Nullable Output<Boolean> forcePersistence;

    public Output<Boolean> getForcePersistence() {
        return this.forcePersistence == null ? Output.empty() : this.forcePersistence;
    }

    /**
     * Gets or sets the label.
     * 
     */
    @InputImport(name="label")
      private final @Nullable Output<String> label;

    public Output<String> getLabel() {
        return this.label == null ? Output.empty() : this.label;
    }

    /**
     * Gets or sets the message ID.
     * 
     */
    @InputImport(name="messageId")
      private final @Nullable Output<String> messageId;

    public Output<String> getMessageId() {
        return this.messageId == null ? Output.empty() : this.messageId;
    }

    /**
     * Gets or sets the partition key.
     * 
     */
    @InputImport(name="partitionKey")
      private final @Nullable Output<String> partitionKey;

    public Output<String> getPartitionKey() {
        return this.partitionKey == null ? Output.empty() : this.partitionKey;
    }

    /**
     * Gets or sets the reply to.
     * 
     */
    @InputImport(name="replyTo")
      private final @Nullable Output<String> replyTo;

    public Output<String> getReplyTo() {
        return this.replyTo == null ? Output.empty() : this.replyTo;
    }

    /**
     * Gets or sets the reply to session ID.
     * 
     */
    @InputImport(name="replyToSessionId")
      private final @Nullable Output<String> replyToSessionId;

    public Output<String> getReplyToSessionId() {
        return this.replyToSessionId == null ? Output.empty() : this.replyToSessionId;
    }

    /**
     * Gets or sets the scheduled enqueue time UTC.
     * 
     */
    @InputImport(name="scheduledEnqueueTimeUtc")
      private final @Nullable Output<String> scheduledEnqueueTimeUtc;

    public Output<String> getScheduledEnqueueTimeUtc() {
        return this.scheduledEnqueueTimeUtc == null ? Output.empty() : this.scheduledEnqueueTimeUtc;
    }

    /**
     * Gets or sets the session ID.
     * 
     */
    @InputImport(name="sessionId")
      private final @Nullable Output<String> sessionId;

    public Output<String> getSessionId() {
        return this.sessionId == null ? Output.empty() : this.sessionId;
    }

    /**
     * Gets or sets the time to live.
     * 
     */
    @InputImport(name="timeToLive")
      private final @Nullable Output<String> timeToLive;

    public Output<String> getTimeToLive() {
        return this.timeToLive == null ? Output.empty() : this.timeToLive;
    }

    /**
     * Gets or sets the to.
     * 
     */
    @InputImport(name="to")
      private final @Nullable Output<String> to;

    public Output<String> getTo() {
        return this.to == null ? Output.empty() : this.to;
    }

    /**
     * Gets or sets the via partition key.
     * 
     */
    @InputImport(name="viaPartitionKey")
      private final @Nullable Output<String> viaPartitionKey;

    public Output<String> getViaPartitionKey() {
        return this.viaPartitionKey == null ? Output.empty() : this.viaPartitionKey;
    }

    public ServiceBusBrokeredMessagePropertiesArgs(
        @Nullable Output<String> contentType,
        @Nullable Output<String> correlationId,
        @Nullable Output<Boolean> forcePersistence,
        @Nullable Output<String> label,
        @Nullable Output<String> messageId,
        @Nullable Output<String> partitionKey,
        @Nullable Output<String> replyTo,
        @Nullable Output<String> replyToSessionId,
        @Nullable Output<String> scheduledEnqueueTimeUtc,
        @Nullable Output<String> sessionId,
        @Nullable Output<String> timeToLive,
        @Nullable Output<String> to,
        @Nullable Output<String> viaPartitionKey) {
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

    private ServiceBusBrokeredMessagePropertiesArgs() {
        this.contentType = Output.empty();
        this.correlationId = Output.empty();
        this.forcePersistence = Output.empty();
        this.label = Output.empty();
        this.messageId = Output.empty();
        this.partitionKey = Output.empty();
        this.replyTo = Output.empty();
        this.replyToSessionId = Output.empty();
        this.scheduledEnqueueTimeUtc = Output.empty();
        this.sessionId = Output.empty();
        this.timeToLive = Output.empty();
        this.to = Output.empty();
        this.viaPartitionKey = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ServiceBusBrokeredMessagePropertiesArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<String> contentType;
        private @Nullable Output<String> correlationId;
        private @Nullable Output<Boolean> forcePersistence;
        private @Nullable Output<String> label;
        private @Nullable Output<String> messageId;
        private @Nullable Output<String> partitionKey;
        private @Nullable Output<String> replyTo;
        private @Nullable Output<String> replyToSessionId;
        private @Nullable Output<String> scheduledEnqueueTimeUtc;
        private @Nullable Output<String> sessionId;
        private @Nullable Output<String> timeToLive;
        private @Nullable Output<String> to;
        private @Nullable Output<String> viaPartitionKey;

        public Builder() {
    	      // Empty
        }

        public Builder(ServiceBusBrokeredMessagePropertiesArgs defaults) {
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

        public Builder forcePersistence(@Nullable Output<Boolean> forcePersistence) {
            this.forcePersistence = forcePersistence;
            return this;
        }

        public Builder forcePersistence(@Nullable Boolean forcePersistence) {
            this.forcePersistence = Output.ofNullable(forcePersistence);
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

        public Builder partitionKey(@Nullable Output<String> partitionKey) {
            this.partitionKey = partitionKey;
            return this;
        }

        public Builder partitionKey(@Nullable String partitionKey) {
            this.partitionKey = Output.ofNullable(partitionKey);
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

        public Builder scheduledEnqueueTimeUtc(@Nullable Output<String> scheduledEnqueueTimeUtc) {
            this.scheduledEnqueueTimeUtc = scheduledEnqueueTimeUtc;
            return this;
        }

        public Builder scheduledEnqueueTimeUtc(@Nullable String scheduledEnqueueTimeUtc) {
            this.scheduledEnqueueTimeUtc = Output.ofNullable(scheduledEnqueueTimeUtc);
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

        public Builder timeToLive(@Nullable Output<String> timeToLive) {
            this.timeToLive = timeToLive;
            return this;
        }

        public Builder timeToLive(@Nullable String timeToLive) {
            this.timeToLive = Output.ofNullable(timeToLive);
            return this;
        }

        public Builder to(@Nullable Output<String> to) {
            this.to = to;
            return this;
        }

        public Builder to(@Nullable String to) {
            this.to = Output.ofNullable(to);
            return this;
        }

        public Builder viaPartitionKey(@Nullable Output<String> viaPartitionKey) {
            this.viaPartitionKey = viaPartitionKey;
            return this;
        }

        public Builder viaPartitionKey(@Nullable String viaPartitionKey) {
            this.viaPartitionKey = Output.ofNullable(viaPartitionKey);
            return this;
        }
        public ServiceBusBrokeredMessagePropertiesArgs build() {
            return new ServiceBusBrokeredMessagePropertiesArgs(contentType, correlationId, forcePersistence, label, messageId, partitionKey, replyTo, replyToSessionId, scheduledEnqueueTimeUtc, sessionId, timeToLive, to, viaPartitionKey);
        }
    }
}
