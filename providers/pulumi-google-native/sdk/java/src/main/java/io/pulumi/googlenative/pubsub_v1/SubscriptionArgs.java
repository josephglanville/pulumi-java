// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.pubsub_v1;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.googlenative.pubsub_v1.inputs.DeadLetterPolicyArgs;
import io.pulumi.googlenative.pubsub_v1.inputs.ExpirationPolicyArgs;
import io.pulumi.googlenative.pubsub_v1.inputs.PushConfigArgs;
import io.pulumi.googlenative.pubsub_v1.inputs.RetryPolicyArgs;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import javax.annotation.Nullable;


public final class SubscriptionArgs extends io.pulumi.resources.ResourceArgs {

    public static final SubscriptionArgs Empty = new SubscriptionArgs();

    /**
     * The approximate amount of time (on a best-effort basis) Pub/Sub waits for the subscriber to acknowledge receipt before resending the message. In the interval after the message is delivered and before it is acknowledged, it is considered to be *outstanding*. During that time period, the message will not be redelivered (on a best-effort basis). For pull subscriptions, this value is used as the initial value for the ack deadline. To override this value for a given message, call `ModifyAckDeadline` with the corresponding `ack_id` if using non-streaming pull or send the `ack_id` in a `StreamingModifyAckDeadlineRequest` if using streaming pull. The minimum custom deadline you can specify is 10 seconds. The maximum custom deadline you can specify is 600 seconds (10 minutes). If this parameter is 0, a default value of 10 seconds is used. For push delivery, this value is also used to set the request timeout for the call to the push endpoint. If the subscriber never acknowledges the message, the Pub/Sub system will eventually redeliver the message.
     * 
     */
    @Import(name="ackDeadlineSeconds")
      private final @Nullable Output<Integer> ackDeadlineSeconds;

    public Output<Integer> getAckDeadlineSeconds() {
        return this.ackDeadlineSeconds == null ? Output.empty() : this.ackDeadlineSeconds;
    }

    /**
     * A policy that specifies the conditions for dead lettering messages in this subscription. If dead_letter_policy is not set, dead lettering is disabled. The Cloud Pub/Sub service account associated with this subscriptions's parent project (i.e., service-{project_number}@gcp-sa-pubsub.iam.gserviceaccount.com) must have permission to Acknowledge() messages on this subscription.
     * 
     */
    @Import(name="deadLetterPolicy")
      private final @Nullable Output<DeadLetterPolicyArgs> deadLetterPolicy;

    public Output<DeadLetterPolicyArgs> getDeadLetterPolicy() {
        return this.deadLetterPolicy == null ? Output.empty() : this.deadLetterPolicy;
    }

    /**
     * Indicates whether the subscription is detached from its topic. Detached subscriptions don't receive messages from their topic and don't retain any backlog. `Pull` and `StreamingPull` requests will return FAILED_PRECONDITION. If the subscription is a push subscription, pushes to the endpoint will not be made.
     * 
     */
    @Import(name="detached")
      private final @Nullable Output<Boolean> detached;

    public Output<Boolean> getDetached() {
        return this.detached == null ? Output.empty() : this.detached;
    }

    /**
     * If true, messages published with the same `ordering_key` in `PubsubMessage` will be delivered to the subscribers in the order in which they are received by the Pub/Sub system. Otherwise, they may be delivered in any order.
     * 
     */
    @Import(name="enableMessageOrdering")
      private final @Nullable Output<Boolean> enableMessageOrdering;

    public Output<Boolean> getEnableMessageOrdering() {
        return this.enableMessageOrdering == null ? Output.empty() : this.enableMessageOrdering;
    }

    /**
     * A policy that specifies the conditions for this subscription's expiration. A subscription is considered active as long as any connected subscriber is successfully consuming messages from the subscription or is issuing operations on the subscription. If `expiration_policy` is not set, a *default policy* with `ttl` of 31 days will be used. The minimum allowed value for `expiration_policy.ttl` is 1 day. If `expiration_policy` is set, but `expiration_policy.ttl` is not set, the subscription never expires.
     * 
     */
    @Import(name="expirationPolicy")
      private final @Nullable Output<ExpirationPolicyArgs> expirationPolicy;

    public Output<ExpirationPolicyArgs> getExpirationPolicy() {
        return this.expirationPolicy == null ? Output.empty() : this.expirationPolicy;
    }

    /**
     * An expression written in the Pub/Sub [filter language](https://cloud.google.com/pubsub/docs/filtering). If non-empty, then only `PubsubMessage`s whose `attributes` field matches the filter are delivered on this subscription. If empty, then no messages are filtered out.
     * 
     */
    @Import(name="filter")
      private final @Nullable Output<String> filter;

    public Output<String> getFilter() {
        return this.filter == null ? Output.empty() : this.filter;
    }

    /**
     * See Creating and managing labels.
     * 
     */
    @Import(name="labels")
      private final @Nullable Output<Map<String,String>> labels;

    public Output<Map<String,String>> getLabels() {
        return this.labels == null ? Output.empty() : this.labels;
    }

    /**
     * How long to retain unacknowledged messages in the subscription's backlog, from the moment a message is published. If `retain_acked_messages` is true, then this also configures the retention of acknowledged messages, and thus configures how far back in time a `Seek` can be done. Defaults to 7 days. Cannot be more than 7 days or less than 10 minutes.
     * 
     */
    @Import(name="messageRetentionDuration")
      private final @Nullable Output<String> messageRetentionDuration;

    public Output<String> getMessageRetentionDuration() {
        return this.messageRetentionDuration == null ? Output.empty() : this.messageRetentionDuration;
    }

    /**
     * The name of the subscription. It must have the format `"projects/{project}/subscriptions/{subscription}"`. `{subscription}` must start with a letter, and contain only letters (`[A-Za-z]`), numbers (`[0-9]`), dashes (`-`), underscores (`_`), periods (`.`), tildes (`~`), plus (`+`) or percent signs (`%`). It must be between 3 and 255 characters in length, and it must not start with `"goog"`.
     * 
     */
    @Import(name="name")
      private final @Nullable Output<String> name;

    public Output<String> getName() {
        return this.name == null ? Output.empty() : this.name;
    }

    @Import(name="project")
      private final @Nullable Output<String> project;

    public Output<String> getProject() {
        return this.project == null ? Output.empty() : this.project;
    }

    /**
     * If push delivery is used with this subscription, this field is used to configure it. At most one of `pushConfig` and `bigQueryConfig` can be set. If both are empty, then the subscriber will pull and ack messages using API methods.
     * 
     */
    @Import(name="pushConfig")
      private final @Nullable Output<PushConfigArgs> pushConfig;

    public Output<PushConfigArgs> getPushConfig() {
        return this.pushConfig == null ? Output.empty() : this.pushConfig;
    }

    /**
     * Indicates whether to retain acknowledged messages. If true, then messages are not expunged from the subscription's backlog, even if they are acknowledged, until they fall out of the `message_retention_duration` window. This must be true if you would like to [`Seek` to a timestamp] (https://cloud.google.com/pubsub/docs/replay-overview#seek_to_a_time) in the past to replay previously-acknowledged messages.
     * 
     */
    @Import(name="retainAckedMessages")
      private final @Nullable Output<Boolean> retainAckedMessages;

    public Output<Boolean> getRetainAckedMessages() {
        return this.retainAckedMessages == null ? Output.empty() : this.retainAckedMessages;
    }

    /**
     * A policy that specifies how Pub/Sub retries message delivery for this subscription. If not set, the default retry policy is applied. This generally implies that messages will be retried as soon as possible for healthy subscribers. RetryPolicy will be triggered on NACKs or acknowledgement deadline exceeded events for a given message.
     * 
     */
    @Import(name="retryPolicy")
      private final @Nullable Output<RetryPolicyArgs> retryPolicy;

    public Output<RetryPolicyArgs> getRetryPolicy() {
        return this.retryPolicy == null ? Output.empty() : this.retryPolicy;
    }

    @Import(name="subscriptionId", required=true)
      private final Output<String> subscriptionId;

    public Output<String> getSubscriptionId() {
        return this.subscriptionId;
    }

    /**
     * The name of the topic from which this subscription is receiving messages. Format is `projects/{project}/topics/{topic}`. The value of this field will be `_deleted-topic_` if the topic has been deleted.
     * 
     */
    @Import(name="topic", required=true)
      private final Output<String> topic;

    public Output<String> getTopic() {
        return this.topic;
    }

    public SubscriptionArgs(
        @Nullable Output<Integer> ackDeadlineSeconds,
        @Nullable Output<DeadLetterPolicyArgs> deadLetterPolicy,
        @Nullable Output<Boolean> detached,
        @Nullable Output<Boolean> enableMessageOrdering,
        @Nullable Output<ExpirationPolicyArgs> expirationPolicy,
        @Nullable Output<String> filter,
        @Nullable Output<Map<String,String>> labels,
        @Nullable Output<String> messageRetentionDuration,
        @Nullable Output<String> name,
        @Nullable Output<String> project,
        @Nullable Output<PushConfigArgs> pushConfig,
        @Nullable Output<Boolean> retainAckedMessages,
        @Nullable Output<RetryPolicyArgs> retryPolicy,
        Output<String> subscriptionId,
        Output<String> topic) {
        this.ackDeadlineSeconds = ackDeadlineSeconds;
        this.deadLetterPolicy = deadLetterPolicy;
        this.detached = detached;
        this.enableMessageOrdering = enableMessageOrdering;
        this.expirationPolicy = expirationPolicy;
        this.filter = filter;
        this.labels = labels;
        this.messageRetentionDuration = messageRetentionDuration;
        this.name = name;
        this.project = project;
        this.pushConfig = pushConfig;
        this.retainAckedMessages = retainAckedMessages;
        this.retryPolicy = retryPolicy;
        this.subscriptionId = Objects.requireNonNull(subscriptionId, "expected parameter 'subscriptionId' to be non-null");
        this.topic = Objects.requireNonNull(topic, "expected parameter 'topic' to be non-null");
    }

    private SubscriptionArgs() {
        this.ackDeadlineSeconds = Output.empty();
        this.deadLetterPolicy = Output.empty();
        this.detached = Output.empty();
        this.enableMessageOrdering = Output.empty();
        this.expirationPolicy = Output.empty();
        this.filter = Output.empty();
        this.labels = Output.empty();
        this.messageRetentionDuration = Output.empty();
        this.name = Output.empty();
        this.project = Output.empty();
        this.pushConfig = Output.empty();
        this.retainAckedMessages = Output.empty();
        this.retryPolicy = Output.empty();
        this.subscriptionId = Output.empty();
        this.topic = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(SubscriptionArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<Integer> ackDeadlineSeconds;
        private @Nullable Output<DeadLetterPolicyArgs> deadLetterPolicy;
        private @Nullable Output<Boolean> detached;
        private @Nullable Output<Boolean> enableMessageOrdering;
        private @Nullable Output<ExpirationPolicyArgs> expirationPolicy;
        private @Nullable Output<String> filter;
        private @Nullable Output<Map<String,String>> labels;
        private @Nullable Output<String> messageRetentionDuration;
        private @Nullable Output<String> name;
        private @Nullable Output<String> project;
        private @Nullable Output<PushConfigArgs> pushConfig;
        private @Nullable Output<Boolean> retainAckedMessages;
        private @Nullable Output<RetryPolicyArgs> retryPolicy;
        private Output<String> subscriptionId;
        private Output<String> topic;

        public Builder() {
    	      // Empty
        }

        public Builder(SubscriptionArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.ackDeadlineSeconds = defaults.ackDeadlineSeconds;
    	      this.deadLetterPolicy = defaults.deadLetterPolicy;
    	      this.detached = defaults.detached;
    	      this.enableMessageOrdering = defaults.enableMessageOrdering;
    	      this.expirationPolicy = defaults.expirationPolicy;
    	      this.filter = defaults.filter;
    	      this.labels = defaults.labels;
    	      this.messageRetentionDuration = defaults.messageRetentionDuration;
    	      this.name = defaults.name;
    	      this.project = defaults.project;
    	      this.pushConfig = defaults.pushConfig;
    	      this.retainAckedMessages = defaults.retainAckedMessages;
    	      this.retryPolicy = defaults.retryPolicy;
    	      this.subscriptionId = defaults.subscriptionId;
    	      this.topic = defaults.topic;
        }

        public Builder ackDeadlineSeconds(@Nullable Output<Integer> ackDeadlineSeconds) {
            this.ackDeadlineSeconds = ackDeadlineSeconds;
            return this;
        }
        public Builder ackDeadlineSeconds(@Nullable Integer ackDeadlineSeconds) {
            this.ackDeadlineSeconds = Output.ofNullable(ackDeadlineSeconds);
            return this;
        }
        public Builder deadLetterPolicy(@Nullable Output<DeadLetterPolicyArgs> deadLetterPolicy) {
            this.deadLetterPolicy = deadLetterPolicy;
            return this;
        }
        public Builder deadLetterPolicy(@Nullable DeadLetterPolicyArgs deadLetterPolicy) {
            this.deadLetterPolicy = Output.ofNullable(deadLetterPolicy);
            return this;
        }
        public Builder detached(@Nullable Output<Boolean> detached) {
            this.detached = detached;
            return this;
        }
        public Builder detached(@Nullable Boolean detached) {
            this.detached = Output.ofNullable(detached);
            return this;
        }
        public Builder enableMessageOrdering(@Nullable Output<Boolean> enableMessageOrdering) {
            this.enableMessageOrdering = enableMessageOrdering;
            return this;
        }
        public Builder enableMessageOrdering(@Nullable Boolean enableMessageOrdering) {
            this.enableMessageOrdering = Output.ofNullable(enableMessageOrdering);
            return this;
        }
        public Builder expirationPolicy(@Nullable Output<ExpirationPolicyArgs> expirationPolicy) {
            this.expirationPolicy = expirationPolicy;
            return this;
        }
        public Builder expirationPolicy(@Nullable ExpirationPolicyArgs expirationPolicy) {
            this.expirationPolicy = Output.ofNullable(expirationPolicy);
            return this;
        }
        public Builder filter(@Nullable Output<String> filter) {
            this.filter = filter;
            return this;
        }
        public Builder filter(@Nullable String filter) {
            this.filter = Output.ofNullable(filter);
            return this;
        }
        public Builder labels(@Nullable Output<Map<String,String>> labels) {
            this.labels = labels;
            return this;
        }
        public Builder labels(@Nullable Map<String,String> labels) {
            this.labels = Output.ofNullable(labels);
            return this;
        }
        public Builder messageRetentionDuration(@Nullable Output<String> messageRetentionDuration) {
            this.messageRetentionDuration = messageRetentionDuration;
            return this;
        }
        public Builder messageRetentionDuration(@Nullable String messageRetentionDuration) {
            this.messageRetentionDuration = Output.ofNullable(messageRetentionDuration);
            return this;
        }
        public Builder name(@Nullable Output<String> name) {
            this.name = name;
            return this;
        }
        public Builder name(@Nullable String name) {
            this.name = Output.ofNullable(name);
            return this;
        }
        public Builder project(@Nullable Output<String> project) {
            this.project = project;
            return this;
        }
        public Builder project(@Nullable String project) {
            this.project = Output.ofNullable(project);
            return this;
        }
        public Builder pushConfig(@Nullable Output<PushConfigArgs> pushConfig) {
            this.pushConfig = pushConfig;
            return this;
        }
        public Builder pushConfig(@Nullable PushConfigArgs pushConfig) {
            this.pushConfig = Output.ofNullable(pushConfig);
            return this;
        }
        public Builder retainAckedMessages(@Nullable Output<Boolean> retainAckedMessages) {
            this.retainAckedMessages = retainAckedMessages;
            return this;
        }
        public Builder retainAckedMessages(@Nullable Boolean retainAckedMessages) {
            this.retainAckedMessages = Output.ofNullable(retainAckedMessages);
            return this;
        }
        public Builder retryPolicy(@Nullable Output<RetryPolicyArgs> retryPolicy) {
            this.retryPolicy = retryPolicy;
            return this;
        }
        public Builder retryPolicy(@Nullable RetryPolicyArgs retryPolicy) {
            this.retryPolicy = Output.ofNullable(retryPolicy);
            return this;
        }
        public Builder subscriptionId(Output<String> subscriptionId) {
            this.subscriptionId = Objects.requireNonNull(subscriptionId);
            return this;
        }
        public Builder subscriptionId(String subscriptionId) {
            this.subscriptionId = Output.of(Objects.requireNonNull(subscriptionId));
            return this;
        }
        public Builder topic(Output<String> topic) {
            this.topic = Objects.requireNonNull(topic);
            return this;
        }
        public Builder topic(String topic) {
            this.topic = Output.of(Objects.requireNonNull(topic));
            return this;
        }        public SubscriptionArgs build() {
            return new SubscriptionArgs(ackDeadlineSeconds, deadLetterPolicy, detached, enableMessageOrdering, expirationPolicy, filter, labels, messageRetentionDuration, name, project, pushConfig, retainAckedMessages, retryPolicy, subscriptionId, topic);
        }
    }
}
