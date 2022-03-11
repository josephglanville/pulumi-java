// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.sqs;

import io.pulumi.awsnative.sqs.inputs.QueueTagArgs;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.InputImport;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.Object;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


public final class QueueArgs extends io.pulumi.resources.ResourceArgs {

    public static final QueueArgs Empty = new QueueArgs();

    /**
     * For first-in-first-out (FIFO) queues, specifies whether to enable content-based deduplication. During the deduplication interval, Amazon SQS treats messages that are sent with identical content as duplicates and delivers only one copy of the message.
     * 
     */
    @InputImport(name="contentBasedDeduplication")
      private final @Nullable Output<Boolean> contentBasedDeduplication;

    public Output<Boolean> getContentBasedDeduplication() {
        return this.contentBasedDeduplication == null ? Output.empty() : this.contentBasedDeduplication;
    }

    /**
     * Specifies whether message deduplication occurs at the message group or queue level. Valid values are messageGroup and queue.
     * 
     */
    @InputImport(name="deduplicationScope")
      private final @Nullable Output<String> deduplicationScope;

    public Output<String> getDeduplicationScope() {
        return this.deduplicationScope == null ? Output.empty() : this.deduplicationScope;
    }

    /**
     * The time in seconds for which the delivery of all messages in the queue is delayed. You can specify an integer value of 0 to 900 (15 minutes). The default value is 0.
     * 
     */
    @InputImport(name="delaySeconds")
      private final @Nullable Output<Integer> delaySeconds;

    public Output<Integer> getDelaySeconds() {
        return this.delaySeconds == null ? Output.empty() : this.delaySeconds;
    }

    /**
     * If set to true, creates a FIFO queue. If you don't specify this property, Amazon SQS creates a standard queue.
     * 
     */
    @InputImport(name="fifoQueue")
      private final @Nullable Output<Boolean> fifoQueue;

    public Output<Boolean> getFifoQueue() {
        return this.fifoQueue == null ? Output.empty() : this.fifoQueue;
    }

    /**
     * Specifies whether the FIFO queue throughput quota applies to the entire queue or per message group. Valid values are perQueue and perMessageGroupId. The perMessageGroupId value is allowed only when the value for DeduplicationScope is messageGroup.
     * 
     */
    @InputImport(name="fifoThroughputLimit")
      private final @Nullable Output<String> fifoThroughputLimit;

    public Output<String> getFifoThroughputLimit() {
        return this.fifoThroughputLimit == null ? Output.empty() : this.fifoThroughputLimit;
    }

    /**
     * The length of time in seconds for which Amazon SQS can reuse a data key to encrypt or decrypt messages before calling AWS KMS again. The value must be an integer between 60 (1 minute) and 86,400 (24 hours). The default is 300 (5 minutes).
     * 
     */
    @InputImport(name="kmsDataKeyReusePeriodSeconds")
      private final @Nullable Output<Integer> kmsDataKeyReusePeriodSeconds;

    public Output<Integer> getKmsDataKeyReusePeriodSeconds() {
        return this.kmsDataKeyReusePeriodSeconds == null ? Output.empty() : this.kmsDataKeyReusePeriodSeconds;
    }

    /**
     * The ID of an AWS managed customer master key (CMK) for Amazon SQS or a custom CMK. To use the AWS managed CMK for Amazon SQS, specify the (default) alias alias/aws/sqs.
     * 
     */
    @InputImport(name="kmsMasterKeyId")
      private final @Nullable Output<String> kmsMasterKeyId;

    public Output<String> getKmsMasterKeyId() {
        return this.kmsMasterKeyId == null ? Output.empty() : this.kmsMasterKeyId;
    }

    /**
     * The limit of how many bytes that a message can contain before Amazon SQS rejects it. You can specify an integer value from 1,024 bytes (1 KiB) to 262,144 bytes (256 KiB). The default value is 262,144 (256 KiB).
     * 
     */
    @InputImport(name="maximumMessageSize")
      private final @Nullable Output<Integer> maximumMessageSize;

    public Output<Integer> getMaximumMessageSize() {
        return this.maximumMessageSize == null ? Output.empty() : this.maximumMessageSize;
    }

    /**
     * The number of seconds that Amazon SQS retains a message. You can specify an integer value from 60 seconds (1 minute) to 1,209,600 seconds (14 days). The default value is 345,600 seconds (4 days).
     * 
     */
    @InputImport(name="messageRetentionPeriod")
      private final @Nullable Output<Integer> messageRetentionPeriod;

    public Output<Integer> getMessageRetentionPeriod() {
        return this.messageRetentionPeriod == null ? Output.empty() : this.messageRetentionPeriod;
    }

    /**
     * A name for the queue. To create a FIFO queue, the name of your FIFO queue must end with the .fifo suffix.
     * 
     */
    @InputImport(name="queueName")
      private final @Nullable Output<String> queueName;

    public Output<String> getQueueName() {
        return this.queueName == null ? Output.empty() : this.queueName;
    }

    /**
     * Specifies the duration, in seconds, that the ReceiveMessage action call waits until a message is in the queue in order to include it in the response, rather than returning an empty response if a message isn't yet available. You can specify an integer from 1 to 20. Short polling is used as the default or when you specify 0 for this property.
     * 
     */
    @InputImport(name="receiveMessageWaitTimeSeconds")
      private final @Nullable Output<Integer> receiveMessageWaitTimeSeconds;

    public Output<Integer> getReceiveMessageWaitTimeSeconds() {
        return this.receiveMessageWaitTimeSeconds == null ? Output.empty() : this.receiveMessageWaitTimeSeconds;
    }

    /**
     * The string that includes the parameters for the permissions for the dead-letter queue redrive permission and which source queues can specify dead-letter queues as a JSON object.
     * 
     */
    @InputImport(name="redriveAllowPolicy")
      private final @Nullable Output<Object> redriveAllowPolicy;

    public Output<Object> getRedriveAllowPolicy() {
        return this.redriveAllowPolicy == null ? Output.empty() : this.redriveAllowPolicy;
    }

    /**
     * A string that includes the parameters for the dead-letter queue functionality (redrive policy) of the source queue.
     * 
     */
    @InputImport(name="redrivePolicy")
      private final @Nullable Output<Object> redrivePolicy;

    public Output<Object> getRedrivePolicy() {
        return this.redrivePolicy == null ? Output.empty() : this.redrivePolicy;
    }

    /**
     * The tags that you attach to this queue.
     * 
     */
    @InputImport(name="tags")
      private final @Nullable Output<List<QueueTagArgs>> tags;

    public Output<List<QueueTagArgs>> getTags() {
        return this.tags == null ? Output.empty() : this.tags;
    }

    /**
     * The length of time during which a message will be unavailable after a message is delivered from the queue. This blocks other components from receiving the same message and gives the initial component time to process and delete the message from the queue. Values must be from 0 to 43,200 seconds (12 hours). If you don't specify a value, AWS CloudFormation uses the default value of 30 seconds.
     * 
     */
    @InputImport(name="visibilityTimeout")
      private final @Nullable Output<Integer> visibilityTimeout;

    public Output<Integer> getVisibilityTimeout() {
        return this.visibilityTimeout == null ? Output.empty() : this.visibilityTimeout;
    }

    public QueueArgs(
        @Nullable Output<Boolean> contentBasedDeduplication,
        @Nullable Output<String> deduplicationScope,
        @Nullable Output<Integer> delaySeconds,
        @Nullable Output<Boolean> fifoQueue,
        @Nullable Output<String> fifoThroughputLimit,
        @Nullable Output<Integer> kmsDataKeyReusePeriodSeconds,
        @Nullable Output<String> kmsMasterKeyId,
        @Nullable Output<Integer> maximumMessageSize,
        @Nullable Output<Integer> messageRetentionPeriod,
        @Nullable Output<String> queueName,
        @Nullable Output<Integer> receiveMessageWaitTimeSeconds,
        @Nullable Output<Object> redriveAllowPolicy,
        @Nullable Output<Object> redrivePolicy,
        @Nullable Output<List<QueueTagArgs>> tags,
        @Nullable Output<Integer> visibilityTimeout) {
        this.contentBasedDeduplication = contentBasedDeduplication;
        this.deduplicationScope = deduplicationScope;
        this.delaySeconds = delaySeconds;
        this.fifoQueue = fifoQueue;
        this.fifoThroughputLimit = fifoThroughputLimit;
        this.kmsDataKeyReusePeriodSeconds = kmsDataKeyReusePeriodSeconds;
        this.kmsMasterKeyId = kmsMasterKeyId;
        this.maximumMessageSize = maximumMessageSize;
        this.messageRetentionPeriod = messageRetentionPeriod;
        this.queueName = queueName;
        this.receiveMessageWaitTimeSeconds = receiveMessageWaitTimeSeconds;
        this.redriveAllowPolicy = redriveAllowPolicy;
        this.redrivePolicy = redrivePolicy;
        this.tags = tags;
        this.visibilityTimeout = visibilityTimeout;
    }

    private QueueArgs() {
        this.contentBasedDeduplication = Output.empty();
        this.deduplicationScope = Output.empty();
        this.delaySeconds = Output.empty();
        this.fifoQueue = Output.empty();
        this.fifoThroughputLimit = Output.empty();
        this.kmsDataKeyReusePeriodSeconds = Output.empty();
        this.kmsMasterKeyId = Output.empty();
        this.maximumMessageSize = Output.empty();
        this.messageRetentionPeriod = Output.empty();
        this.queueName = Output.empty();
        this.receiveMessageWaitTimeSeconds = Output.empty();
        this.redriveAllowPolicy = Output.empty();
        this.redrivePolicy = Output.empty();
        this.tags = Output.empty();
        this.visibilityTimeout = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(QueueArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<Boolean> contentBasedDeduplication;
        private @Nullable Output<String> deduplicationScope;
        private @Nullable Output<Integer> delaySeconds;
        private @Nullable Output<Boolean> fifoQueue;
        private @Nullable Output<String> fifoThroughputLimit;
        private @Nullable Output<Integer> kmsDataKeyReusePeriodSeconds;
        private @Nullable Output<String> kmsMasterKeyId;
        private @Nullable Output<Integer> maximumMessageSize;
        private @Nullable Output<Integer> messageRetentionPeriod;
        private @Nullable Output<String> queueName;
        private @Nullable Output<Integer> receiveMessageWaitTimeSeconds;
        private @Nullable Output<Object> redriveAllowPolicy;
        private @Nullable Output<Object> redrivePolicy;
        private @Nullable Output<List<QueueTagArgs>> tags;
        private @Nullable Output<Integer> visibilityTimeout;

        public Builder() {
    	      // Empty
        }

        public Builder(QueueArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.contentBasedDeduplication = defaults.contentBasedDeduplication;
    	      this.deduplicationScope = defaults.deduplicationScope;
    	      this.delaySeconds = defaults.delaySeconds;
    	      this.fifoQueue = defaults.fifoQueue;
    	      this.fifoThroughputLimit = defaults.fifoThroughputLimit;
    	      this.kmsDataKeyReusePeriodSeconds = defaults.kmsDataKeyReusePeriodSeconds;
    	      this.kmsMasterKeyId = defaults.kmsMasterKeyId;
    	      this.maximumMessageSize = defaults.maximumMessageSize;
    	      this.messageRetentionPeriod = defaults.messageRetentionPeriod;
    	      this.queueName = defaults.queueName;
    	      this.receiveMessageWaitTimeSeconds = defaults.receiveMessageWaitTimeSeconds;
    	      this.redriveAllowPolicy = defaults.redriveAllowPolicy;
    	      this.redrivePolicy = defaults.redrivePolicy;
    	      this.tags = defaults.tags;
    	      this.visibilityTimeout = defaults.visibilityTimeout;
        }

        public Builder contentBasedDeduplication(@Nullable Output<Boolean> contentBasedDeduplication) {
            this.contentBasedDeduplication = contentBasedDeduplication;
            return this;
        }

        public Builder contentBasedDeduplication(@Nullable Boolean contentBasedDeduplication) {
            this.contentBasedDeduplication = Output.ofNullable(contentBasedDeduplication);
            return this;
        }

        public Builder deduplicationScope(@Nullable Output<String> deduplicationScope) {
            this.deduplicationScope = deduplicationScope;
            return this;
        }

        public Builder deduplicationScope(@Nullable String deduplicationScope) {
            this.deduplicationScope = Output.ofNullable(deduplicationScope);
            return this;
        }

        public Builder delaySeconds(@Nullable Output<Integer> delaySeconds) {
            this.delaySeconds = delaySeconds;
            return this;
        }

        public Builder delaySeconds(@Nullable Integer delaySeconds) {
            this.delaySeconds = Output.ofNullable(delaySeconds);
            return this;
        }

        public Builder fifoQueue(@Nullable Output<Boolean> fifoQueue) {
            this.fifoQueue = fifoQueue;
            return this;
        }

        public Builder fifoQueue(@Nullable Boolean fifoQueue) {
            this.fifoQueue = Output.ofNullable(fifoQueue);
            return this;
        }

        public Builder fifoThroughputLimit(@Nullable Output<String> fifoThroughputLimit) {
            this.fifoThroughputLimit = fifoThroughputLimit;
            return this;
        }

        public Builder fifoThroughputLimit(@Nullable String fifoThroughputLimit) {
            this.fifoThroughputLimit = Output.ofNullable(fifoThroughputLimit);
            return this;
        }

        public Builder kmsDataKeyReusePeriodSeconds(@Nullable Output<Integer> kmsDataKeyReusePeriodSeconds) {
            this.kmsDataKeyReusePeriodSeconds = kmsDataKeyReusePeriodSeconds;
            return this;
        }

        public Builder kmsDataKeyReusePeriodSeconds(@Nullable Integer kmsDataKeyReusePeriodSeconds) {
            this.kmsDataKeyReusePeriodSeconds = Output.ofNullable(kmsDataKeyReusePeriodSeconds);
            return this;
        }

        public Builder kmsMasterKeyId(@Nullable Output<String> kmsMasterKeyId) {
            this.kmsMasterKeyId = kmsMasterKeyId;
            return this;
        }

        public Builder kmsMasterKeyId(@Nullable String kmsMasterKeyId) {
            this.kmsMasterKeyId = Output.ofNullable(kmsMasterKeyId);
            return this;
        }

        public Builder maximumMessageSize(@Nullable Output<Integer> maximumMessageSize) {
            this.maximumMessageSize = maximumMessageSize;
            return this;
        }

        public Builder maximumMessageSize(@Nullable Integer maximumMessageSize) {
            this.maximumMessageSize = Output.ofNullable(maximumMessageSize);
            return this;
        }

        public Builder messageRetentionPeriod(@Nullable Output<Integer> messageRetentionPeriod) {
            this.messageRetentionPeriod = messageRetentionPeriod;
            return this;
        }

        public Builder messageRetentionPeriod(@Nullable Integer messageRetentionPeriod) {
            this.messageRetentionPeriod = Output.ofNullable(messageRetentionPeriod);
            return this;
        }

        public Builder queueName(@Nullable Output<String> queueName) {
            this.queueName = queueName;
            return this;
        }

        public Builder queueName(@Nullable String queueName) {
            this.queueName = Output.ofNullable(queueName);
            return this;
        }

        public Builder receiveMessageWaitTimeSeconds(@Nullable Output<Integer> receiveMessageWaitTimeSeconds) {
            this.receiveMessageWaitTimeSeconds = receiveMessageWaitTimeSeconds;
            return this;
        }

        public Builder receiveMessageWaitTimeSeconds(@Nullable Integer receiveMessageWaitTimeSeconds) {
            this.receiveMessageWaitTimeSeconds = Output.ofNullable(receiveMessageWaitTimeSeconds);
            return this;
        }

        public Builder redriveAllowPolicy(@Nullable Output<Object> redriveAllowPolicy) {
            this.redriveAllowPolicy = redriveAllowPolicy;
            return this;
        }

        public Builder redriveAllowPolicy(@Nullable Object redriveAllowPolicy) {
            this.redriveAllowPolicy = Output.ofNullable(redriveAllowPolicy);
            return this;
        }

        public Builder redrivePolicy(@Nullable Output<Object> redrivePolicy) {
            this.redrivePolicy = redrivePolicy;
            return this;
        }

        public Builder redrivePolicy(@Nullable Object redrivePolicy) {
            this.redrivePolicy = Output.ofNullable(redrivePolicy);
            return this;
        }

        public Builder tags(@Nullable Output<List<QueueTagArgs>> tags) {
            this.tags = tags;
            return this;
        }

        public Builder tags(@Nullable List<QueueTagArgs> tags) {
            this.tags = Output.ofNullable(tags);
            return this;
        }

        public Builder visibilityTimeout(@Nullable Output<Integer> visibilityTimeout) {
            this.visibilityTimeout = visibilityTimeout;
            return this;
        }

        public Builder visibilityTimeout(@Nullable Integer visibilityTimeout) {
            this.visibilityTimeout = Output.ofNullable(visibilityTimeout);
            return this;
        }
        public QueueArgs build() {
            return new QueueArgs(contentBasedDeduplication, deduplicationScope, delaySeconds, fifoQueue, fifoThroughputLimit, kmsDataKeyReusePeriodSeconds, kmsMasterKeyId, maximumMessageSize, messageRetentionPeriod, queueName, receiveMessageWaitTimeSeconds, redriveAllowPolicy, redrivePolicy, tags, visibilityTimeout);
        }
    }
}
