// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.eventarc_v1beta1.inputs;

import io.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


/**
 * Represents a Pub/Sub transport.
 * 
 */
public final class PubsubResponse extends io.pulumi.resources.InvokeArgs {

    public static final PubsubResponse Empty = new PubsubResponse();

    /**
     * The name of the Pub/Sub subscription created and managed by Eventarc system as a transport for the event delivery. Format: `projects/{PROJECT_ID}/subscriptions/{SUBSCRIPTION_NAME}`.
     * 
     */
    @Import(name="subscription", required=true)
      private final String subscription;

    public String getSubscription() {
        return this.subscription;
    }

    /**
     * Optional. The name of the Pub/Sub topic created and managed by Eventarc system as a transport for the event delivery. Format: `projects/{PROJECT_ID}/topics/{TOPIC_NAME}`. You may set an existing topic for triggers of the type `google.cloud.pubsub.topic.v1.messagePublished` only. The topic you provide here will not be deleted by Eventarc at trigger deletion.
     * 
     */
    @Import(name="topic", required=true)
      private final String topic;

    public String getTopic() {
        return this.topic;
    }

    public PubsubResponse(
        String subscription,
        String topic) {
        this.subscription = Objects.requireNonNull(subscription, "expected parameter 'subscription' to be non-null");
        this.topic = Objects.requireNonNull(topic, "expected parameter 'topic' to be non-null");
    }

    private PubsubResponse() {
        this.subscription = null;
        this.topic = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(PubsubResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String subscription;
        private String topic;

        public Builder() {
    	      // Empty
        }

        public Builder(PubsubResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.subscription = defaults.subscription;
    	      this.topic = defaults.topic;
        }

        public Builder subscription(String subscription) {
            this.subscription = Objects.requireNonNull(subscription);
            return this;
        }
        public Builder topic(String topic) {
            this.topic = Objects.requireNonNull(topic);
            return this;
        }        public PubsubResponse build() {
            return new PubsubResponse(subscription, topic);
        }
    }
}
