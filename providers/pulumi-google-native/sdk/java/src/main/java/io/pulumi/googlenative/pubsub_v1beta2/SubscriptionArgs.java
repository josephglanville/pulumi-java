// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.pubsub_v1beta2;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import io.pulumi.googlenative.pubsub_v1beta2.inputs.PushConfigArgs;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class SubscriptionArgs extends io.pulumi.resources.ResourceArgs {

    public static final SubscriptionArgs Empty = new SubscriptionArgs();

    /**
     * This value is the maximum time after a subscriber receives a message before the subscriber should acknowledge the message. After message delivery but before the ack deadline expires and before the message is acknowledged, it is an outstanding message and will not be delivered again during that time (on a best-effort basis). For pull subscriptions, this value is used as the initial value for the ack deadline. To override this value for a given message, call `ModifyAckDeadline` with the corresponding `ack_id` if using pull. The maximum custom deadline you can specify is 600 seconds (10 minutes). For push delivery, this value is also used to set the request timeout for the call to the push endpoint. If the subscriber never acknowledges the message, the Pub/Sub system will eventually redeliver the message. If this parameter is 0, a default value of 10 seconds is used.
     * 
     */
    @Import(name="ackDeadlineSeconds")
      private final @Nullable Output<Integer> ackDeadlineSeconds;

    public Output<Integer> getAckDeadlineSeconds() {
        return this.ackDeadlineSeconds == null ? Codegen.empty() : this.ackDeadlineSeconds;
    }

    /**
     * The name of the subscription. It must have the format `"projects/{project}/subscriptions/{subscription}"`. `{subscription}` must start with a letter, and contain only letters (`[A-Za-z]`), numbers (`[0-9]`), dashes (`-`), underscores (`_`), periods (`.`), tildes (`~`), plus (`+`) or percent signs (`%`). It must be between 3 and 255 characters in length, and it must not start with `"goog"`.
     * 
     */
    @Import(name="name")
      private final @Nullable Output<String> name;

    public Output<String> getName() {
        return this.name == null ? Codegen.empty() : this.name;
    }

    @Import(name="project")
      private final @Nullable Output<String> project;

    public Output<String> getProject() {
        return this.project == null ? Codegen.empty() : this.project;
    }

    /**
     * If push delivery is used with this subscription, this field is used to configure it. An empty `pushConfig` signifies that the subscriber will pull and ack messages using API methods.
     * 
     */
    @Import(name="pushConfig")
      private final @Nullable Output<PushConfigArgs> pushConfig;

    public Output<PushConfigArgs> getPushConfig() {
        return this.pushConfig == null ? Codegen.empty() : this.pushConfig;
    }

    @Import(name="subscriptionId", required=true)
      private final Output<String> subscriptionId;

    public Output<String> getSubscriptionId() {
        return this.subscriptionId;
    }

    /**
     * The name of the topic from which this subscription is receiving messages. The value of this field will be `_deleted-topic_` if the topic has been deleted.
     * 
     */
    @Import(name="topic")
      private final @Nullable Output<String> topic;

    public Output<String> getTopic() {
        return this.topic == null ? Codegen.empty() : this.topic;
    }

    public SubscriptionArgs(
        @Nullable Output<Integer> ackDeadlineSeconds,
        @Nullable Output<String> name,
        @Nullable Output<String> project,
        @Nullable Output<PushConfigArgs> pushConfig,
        Output<String> subscriptionId,
        @Nullable Output<String> topic) {
        this.ackDeadlineSeconds = ackDeadlineSeconds;
        this.name = name;
        this.project = project;
        this.pushConfig = pushConfig;
        this.subscriptionId = Objects.requireNonNull(subscriptionId, "expected parameter 'subscriptionId' to be non-null");
        this.topic = topic;
    }

    private SubscriptionArgs() {
        this.ackDeadlineSeconds = Codegen.empty();
        this.name = Codegen.empty();
        this.project = Codegen.empty();
        this.pushConfig = Codegen.empty();
        this.subscriptionId = Codegen.empty();
        this.topic = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(SubscriptionArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<Integer> ackDeadlineSeconds;
        private @Nullable Output<String> name;
        private @Nullable Output<String> project;
        private @Nullable Output<PushConfigArgs> pushConfig;
        private Output<String> subscriptionId;
        private @Nullable Output<String> topic;

        public Builder() {
    	      // Empty
        }

        public Builder(SubscriptionArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.ackDeadlineSeconds = defaults.ackDeadlineSeconds;
    	      this.name = defaults.name;
    	      this.project = defaults.project;
    	      this.pushConfig = defaults.pushConfig;
    	      this.subscriptionId = defaults.subscriptionId;
    	      this.topic = defaults.topic;
        }

        public Builder ackDeadlineSeconds(@Nullable Output<Integer> ackDeadlineSeconds) {
            this.ackDeadlineSeconds = ackDeadlineSeconds;
            return this;
        }
        public Builder ackDeadlineSeconds(@Nullable Integer ackDeadlineSeconds) {
            this.ackDeadlineSeconds = Codegen.ofNullable(ackDeadlineSeconds);
            return this;
        }
        public Builder name(@Nullable Output<String> name) {
            this.name = name;
            return this;
        }
        public Builder name(@Nullable String name) {
            this.name = Codegen.ofNullable(name);
            return this;
        }
        public Builder project(@Nullable Output<String> project) {
            this.project = project;
            return this;
        }
        public Builder project(@Nullable String project) {
            this.project = Codegen.ofNullable(project);
            return this;
        }
        public Builder pushConfig(@Nullable Output<PushConfigArgs> pushConfig) {
            this.pushConfig = pushConfig;
            return this;
        }
        public Builder pushConfig(@Nullable PushConfigArgs pushConfig) {
            this.pushConfig = Codegen.ofNullable(pushConfig);
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
        public Builder topic(@Nullable Output<String> topic) {
            this.topic = topic;
            return this;
        }
        public Builder topic(@Nullable String topic) {
            this.topic = Codegen.ofNullable(topic);
            return this;
        }        public SubscriptionArgs build() {
            return new SubscriptionArgs(ackDeadlineSeconds, name, project, pushConfig, subscriptionId, topic);
        }
    }
}
