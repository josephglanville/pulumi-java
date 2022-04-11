// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.cloudscheduler_v1.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * Pub/Sub target. The job will be delivered by publishing a message to the given Pub/Sub topic.
 * 
 */
public final class PubsubTargetArgs extends io.pulumi.resources.ResourceArgs {

    public static final PubsubTargetArgs Empty = new PubsubTargetArgs();

    /**
     * Attributes for PubsubMessage. Pubsub message must contain either non-empty data, or at least one attribute.
     * 
     */
    @Import(name="attributes")
      private final @Nullable Output<Map<String,String>> attributes;

    public Output<Map<String,String>> getAttributes() {
        return this.attributes == null ? Codegen.empty() : this.attributes;
    }

    /**
     * The message payload for PubsubMessage. Pubsub message must contain either non-empty data, or at least one attribute.
     * 
     */
    @Import(name="data")
      private final @Nullable Output<String> data;

    public Output<String> getData() {
        return this.data == null ? Codegen.empty() : this.data;
    }

    /**
     * The name of the Cloud Pub/Sub topic to which messages will be published when a job is delivered. The topic name must be in the same format as required by PubSub's [PublishRequest.name](https://cloud.google.com/pubsub/docs/reference/rpc/google.pubsub.v1#publishrequest), for example `projects/PROJECT_ID/topics/TOPIC_ID`. The topic must be in the same project as the Cloud Scheduler job.
     * 
     */
    @Import(name="topicName", required=true)
      private final Output<String> topicName;

    public Output<String> getTopicName() {
        return this.topicName;
    }

    public PubsubTargetArgs(
        @Nullable Output<Map<String,String>> attributes,
        @Nullable Output<String> data,
        Output<String> topicName) {
        this.attributes = attributes;
        this.data = data;
        this.topicName = Objects.requireNonNull(topicName, "expected parameter 'topicName' to be non-null");
    }

    private PubsubTargetArgs() {
        this.attributes = Codegen.empty();
        this.data = Codegen.empty();
        this.topicName = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(PubsubTargetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<Map<String,String>> attributes;
        private @Nullable Output<String> data;
        private Output<String> topicName;

        public Builder() {
    	      // Empty
        }

        public Builder(PubsubTargetArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.attributes = defaults.attributes;
    	      this.data = defaults.data;
    	      this.topicName = defaults.topicName;
        }

        public Builder attributes(@Nullable Output<Map<String,String>> attributes) {
            this.attributes = attributes;
            return this;
        }
        public Builder attributes(@Nullable Map<String,String> attributes) {
            this.attributes = Codegen.ofNullable(attributes);
            return this;
        }
        public Builder data(@Nullable Output<String> data) {
            this.data = data;
            return this;
        }
        public Builder data(@Nullable String data) {
            this.data = Codegen.ofNullable(data);
            return this;
        }
        public Builder topicName(Output<String> topicName) {
            this.topicName = Objects.requireNonNull(topicName);
            return this;
        }
        public Builder topicName(String topicName) {
            this.topicName = Output.of(Objects.requireNonNull(topicName));
            return this;
        }        public PubsubTargetArgs build() {
            return new PubsubTargetArgs(attributes, data, topicName);
        }
    }
}
