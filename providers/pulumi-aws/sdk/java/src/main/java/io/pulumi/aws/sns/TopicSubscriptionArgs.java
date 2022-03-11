// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.sns;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.InputImport;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class TopicSubscriptionArgs extends io.pulumi.resources.ResourceArgs {

    public static final TopicSubscriptionArgs Empty = new TopicSubscriptionArgs();

    /**
     * Integer indicating number of minutes to wait in retrying mode for fetching subscription arn before marking it as failure. Only applicable for http and https protocols. Default is `1`.
     * 
     */
    @InputImport(name="confirmationTimeoutInMinutes")
      private final @Nullable Output<Integer> confirmationTimeoutInMinutes;

    public Output<Integer> getConfirmationTimeoutInMinutes() {
        return this.confirmationTimeoutInMinutes == null ? Output.empty() : this.confirmationTimeoutInMinutes;
    }

    /**
     * JSON String with the delivery policy (retries, backoff, etc.) that will be used in the subscription - this only applies to HTTP/S subscriptions. Refer to the [SNS docs](https://docs.aws.amazon.com/sns/latest/dg/DeliveryPolicies.html) for more details.
     * 
     */
    @InputImport(name="deliveryPolicy")
      private final @Nullable Output<String> deliveryPolicy;

    public Output<String> getDeliveryPolicy() {
        return this.deliveryPolicy == null ? Output.empty() : this.deliveryPolicy;
    }

    /**
     * Endpoint to send data to. The contents vary with the protocol. See details below.
     * 
     */
    @InputImport(name="endpoint", required=true)
      private final Output<String> endpoint;

    public Output<String> getEndpoint() {
        return this.endpoint;
    }

    /**
     * Whether the endpoint is capable of [auto confirming subscription](http://docs.aws.amazon.com/sns/latest/dg/SendMessageToHttp.html#SendMessageToHttp.prepare) (e.g., PagerDuty). Default is `false`.
     * 
     */
    @InputImport(name="endpointAutoConfirms")
      private final @Nullable Output<Boolean> endpointAutoConfirms;

    public Output<Boolean> getEndpointAutoConfirms() {
        return this.endpointAutoConfirms == null ? Output.empty() : this.endpointAutoConfirms;
    }

    /**
     * JSON String with the filter policy that will be used in the subscription to filter messages seen by the target resource. Refer to the [SNS docs](https://docs.aws.amazon.com/sns/latest/dg/message-filtering.html) for more details.
     * 
     */
    @InputImport(name="filterPolicy")
      private final @Nullable Output<String> filterPolicy;

    public Output<String> getFilterPolicy() {
        return this.filterPolicy == null ? Output.empty() : this.filterPolicy;
    }

    /**
     * Protocol to use. Valid values are: `sqs`, `sms`, `lambda`, `firehose`, and `application`. Protocols `email`, `email-json`, `http` and `https` are also valid but partially supported. See details below.
     * 
     */
    @InputImport(name="protocol", required=true)
      private final Output<String> protocol;

    public Output<String> getProtocol() {
        return this.protocol;
    }

    /**
     * Whether to enable raw message delivery (the original message is directly passed, not wrapped in JSON with the original message in the message property). Default is `false`.
     * 
     */
    @InputImport(name="rawMessageDelivery")
      private final @Nullable Output<Boolean> rawMessageDelivery;

    public Output<Boolean> getRawMessageDelivery() {
        return this.rawMessageDelivery == null ? Output.empty() : this.rawMessageDelivery;
    }

    /**
     * JSON String with the redrive policy that will be used in the subscription. Refer to the [SNS docs](https://docs.aws.amazon.com/sns/latest/dg/sns-dead-letter-queues.html#how-messages-moved-into-dead-letter-queue) for more details.
     * 
     */
    @InputImport(name="redrivePolicy")
      private final @Nullable Output<String> redrivePolicy;

    public Output<String> getRedrivePolicy() {
        return this.redrivePolicy == null ? Output.empty() : this.redrivePolicy;
    }

    /**
     * ARN of the IAM role to publish to Kinesis Data Firehose delivery stream. Refer to [SNS docs](https://docs.aws.amazon.com/sns/latest/dg/sns-firehose-as-subscriber.html).
     * 
     */
    @InputImport(name="subscriptionRoleArn")
      private final @Nullable Output<String> subscriptionRoleArn;

    public Output<String> getSubscriptionRoleArn() {
        return this.subscriptionRoleArn == null ? Output.empty() : this.subscriptionRoleArn;
    }

    /**
     * ARN of the SNS topic to subscribe to.
     * 
     */
    @InputImport(name="topic", required=true)
      private final Output<String> topic;

    public Output<String> getTopic() {
        return this.topic;
    }

    public TopicSubscriptionArgs(
        @Nullable Output<Integer> confirmationTimeoutInMinutes,
        @Nullable Output<String> deliveryPolicy,
        Output<String> endpoint,
        @Nullable Output<Boolean> endpointAutoConfirms,
        @Nullable Output<String> filterPolicy,
        Output<String> protocol,
        @Nullable Output<Boolean> rawMessageDelivery,
        @Nullable Output<String> redrivePolicy,
        @Nullable Output<String> subscriptionRoleArn,
        Output<String> topic) {
        this.confirmationTimeoutInMinutes = confirmationTimeoutInMinutes;
        this.deliveryPolicy = deliveryPolicy;
        this.endpoint = Objects.requireNonNull(endpoint, "expected parameter 'endpoint' to be non-null");
        this.endpointAutoConfirms = endpointAutoConfirms;
        this.filterPolicy = filterPolicy;
        this.protocol = Objects.requireNonNull(protocol, "expected parameter 'protocol' to be non-null");
        this.rawMessageDelivery = rawMessageDelivery;
        this.redrivePolicy = redrivePolicy;
        this.subscriptionRoleArn = subscriptionRoleArn;
        this.topic = Objects.requireNonNull(topic, "expected parameter 'topic' to be non-null");
    }

    private TopicSubscriptionArgs() {
        this.confirmationTimeoutInMinutes = Output.empty();
        this.deliveryPolicy = Output.empty();
        this.endpoint = Output.empty();
        this.endpointAutoConfirms = Output.empty();
        this.filterPolicy = Output.empty();
        this.protocol = Output.empty();
        this.rawMessageDelivery = Output.empty();
        this.redrivePolicy = Output.empty();
        this.subscriptionRoleArn = Output.empty();
        this.topic = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(TopicSubscriptionArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<Integer> confirmationTimeoutInMinutes;
        private @Nullable Output<String> deliveryPolicy;
        private Output<String> endpoint;
        private @Nullable Output<Boolean> endpointAutoConfirms;
        private @Nullable Output<String> filterPolicy;
        private Output<String> protocol;
        private @Nullable Output<Boolean> rawMessageDelivery;
        private @Nullable Output<String> redrivePolicy;
        private @Nullable Output<String> subscriptionRoleArn;
        private Output<String> topic;

        public Builder() {
    	      // Empty
        }

        public Builder(TopicSubscriptionArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.confirmationTimeoutInMinutes = defaults.confirmationTimeoutInMinutes;
    	      this.deliveryPolicy = defaults.deliveryPolicy;
    	      this.endpoint = defaults.endpoint;
    	      this.endpointAutoConfirms = defaults.endpointAutoConfirms;
    	      this.filterPolicy = defaults.filterPolicy;
    	      this.protocol = defaults.protocol;
    	      this.rawMessageDelivery = defaults.rawMessageDelivery;
    	      this.redrivePolicy = defaults.redrivePolicy;
    	      this.subscriptionRoleArn = defaults.subscriptionRoleArn;
    	      this.topic = defaults.topic;
        }

        public Builder confirmationTimeoutInMinutes(@Nullable Output<Integer> confirmationTimeoutInMinutes) {
            this.confirmationTimeoutInMinutes = confirmationTimeoutInMinutes;
            return this;
        }

        public Builder confirmationTimeoutInMinutes(@Nullable Integer confirmationTimeoutInMinutes) {
            this.confirmationTimeoutInMinutes = Output.ofNullable(confirmationTimeoutInMinutes);
            return this;
        }

        public Builder deliveryPolicy(@Nullable Output<String> deliveryPolicy) {
            this.deliveryPolicy = deliveryPolicy;
            return this;
        }

        public Builder deliveryPolicy(@Nullable String deliveryPolicy) {
            this.deliveryPolicy = Output.ofNullable(deliveryPolicy);
            return this;
        }

        public Builder endpoint(Output<String> endpoint) {
            this.endpoint = Objects.requireNonNull(endpoint);
            return this;
        }

        public Builder endpoint(String endpoint) {
            this.endpoint = Output.of(Objects.requireNonNull(endpoint));
            return this;
        }

        public Builder endpointAutoConfirms(@Nullable Output<Boolean> endpointAutoConfirms) {
            this.endpointAutoConfirms = endpointAutoConfirms;
            return this;
        }

        public Builder endpointAutoConfirms(@Nullable Boolean endpointAutoConfirms) {
            this.endpointAutoConfirms = Output.ofNullable(endpointAutoConfirms);
            return this;
        }

        public Builder filterPolicy(@Nullable Output<String> filterPolicy) {
            this.filterPolicy = filterPolicy;
            return this;
        }

        public Builder filterPolicy(@Nullable String filterPolicy) {
            this.filterPolicy = Output.ofNullable(filterPolicy);
            return this;
        }

        public Builder protocol(Output<String> protocol) {
            this.protocol = Objects.requireNonNull(protocol);
            return this;
        }

        public Builder protocol(String protocol) {
            this.protocol = Output.of(Objects.requireNonNull(protocol));
            return this;
        }

        public Builder rawMessageDelivery(@Nullable Output<Boolean> rawMessageDelivery) {
            this.rawMessageDelivery = rawMessageDelivery;
            return this;
        }

        public Builder rawMessageDelivery(@Nullable Boolean rawMessageDelivery) {
            this.rawMessageDelivery = Output.ofNullable(rawMessageDelivery);
            return this;
        }

        public Builder redrivePolicy(@Nullable Output<String> redrivePolicy) {
            this.redrivePolicy = redrivePolicy;
            return this;
        }

        public Builder redrivePolicy(@Nullable String redrivePolicy) {
            this.redrivePolicy = Output.ofNullable(redrivePolicy);
            return this;
        }

        public Builder subscriptionRoleArn(@Nullable Output<String> subscriptionRoleArn) {
            this.subscriptionRoleArn = subscriptionRoleArn;
            return this;
        }

        public Builder subscriptionRoleArn(@Nullable String subscriptionRoleArn) {
            this.subscriptionRoleArn = Output.ofNullable(subscriptionRoleArn);
            return this;
        }

        public Builder topic(Output<String> topic) {
            this.topic = Objects.requireNonNull(topic);
            return this;
        }
        public TopicSubscriptionArgs build() {
            return new TopicSubscriptionArgs(confirmationTimeoutInMinutes, deliveryPolicy, endpoint, endpointAutoConfirms, filterPolicy, protocol, rawMessageDelivery, redrivePolicy, subscriptionRoleArn, topic);
        }
    }
}
