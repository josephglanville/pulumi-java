// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.cloudscheduler.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import javax.annotation.Nullable;


public final class JobPubsubTargetGetArgs extends io.pulumi.resources.ResourceArgs {

    public static final JobPubsubTargetGetArgs Empty = new JobPubsubTargetGetArgs();

    /**
     * Attributes for PubsubMessage.
     * Pubsub message must contain either non-empty data, or at least one attribute.
     * 
     */
    @InputImport(name="attributes")
      private final @Nullable Input<Map<String,String>> attributes;

    public Input<Map<String,String>> getAttributes() {
        return this.attributes == null ? Input.empty() : this.attributes;
    }

    /**
     * The message payload for PubsubMessage.
     * Pubsub message must contain either non-empty data, or at least one attribute.
     * A base64-encoded string.
     * 
     */
    @InputImport(name="data")
      private final @Nullable Input<String> data;

    public Input<String> getData() {
        return this.data == null ? Input.empty() : this.data;
    }

    /**
     * The full resource name for the Cloud Pub/Sub topic to which
     * messages will be published when a job is delivered. ~>**NOTE:**
     * The topic name must be in the same format as required by PubSub's
     * PublishRequest.name, e.g. `projects/my-project/topics/my-topic`.
     * 
     */
    @InputImport(name="topicName", required=true)
      private final Input<String> topicName;

    public Input<String> getTopicName() {
        return this.topicName;
    }

    public JobPubsubTargetGetArgs(
        @Nullable Input<Map<String,String>> attributes,
        @Nullable Input<String> data,
        Input<String> topicName) {
        this.attributes = attributes;
        this.data = data;
        this.topicName = Objects.requireNonNull(topicName, "expected parameter 'topicName' to be non-null");
    }

    private JobPubsubTargetGetArgs() {
        this.attributes = Input.empty();
        this.data = Input.empty();
        this.topicName = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(JobPubsubTargetGetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<Map<String,String>> attributes;
        private @Nullable Input<String> data;
        private Input<String> topicName;

        public Builder() {
    	      // Empty
        }

        public Builder(JobPubsubTargetGetArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.attributes = defaults.attributes;
    	      this.data = defaults.data;
    	      this.topicName = defaults.topicName;
        }

        public Builder setAttributes(@Nullable Input<Map<String,String>> attributes) {
            this.attributes = attributes;
            return this;
        }

        public Builder setAttributes(@Nullable Map<String,String> attributes) {
            this.attributes = Input.ofNullable(attributes);
            return this;
        }

        public Builder setData(@Nullable Input<String> data) {
            this.data = data;
            return this;
        }

        public Builder setData(@Nullable String data) {
            this.data = Input.ofNullable(data);
            return this;
        }

        public Builder setTopicName(Input<String> topicName) {
            this.topicName = Objects.requireNonNull(topicName);
            return this;
        }

        public Builder setTopicName(String topicName) {
            this.topicName = Input.of(Objects.requireNonNull(topicName));
            return this;
        }
        public JobPubsubTargetGetArgs build() {
            return new JobPubsubTargetGetArgs(attributes, data, topicName);
        }
    }
}
