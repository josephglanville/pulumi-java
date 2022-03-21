// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.s3.inputs;

import io.pulumi.awsnative.s3.inputs.BucketNotificationFilterArgs;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * The topic to which notifications are sent and the events for which notifications are generated.
 * 
 */
public final class BucketTopicConfigurationArgs extends io.pulumi.resources.ResourceArgs {

    public static final BucketTopicConfigurationArgs Empty = new BucketTopicConfigurationArgs();

    /**
     * The Amazon S3 bucket event about which to send notifications.
     * 
     */
    @Import(name="event", required=true)
      private final Output<String> event;

    public Output<String> getEvent() {
        return this.event;
    }

    /**
     * The filtering rules that determine for which objects to send notifications.
     * 
     */
    @Import(name="filter")
      private final @Nullable Output<BucketNotificationFilterArgs> filter;

    public Output<BucketNotificationFilterArgs> getFilter() {
        return this.filter == null ? Output.empty() : this.filter;
    }

    /**
     * The Amazon Resource Name (ARN) of the Amazon SNS topic to which Amazon S3 publishes a message when it detects events of the specified type.
     * 
     */
    @Import(name="topic", required=true)
      private final Output<String> topic;

    public Output<String> getTopic() {
        return this.topic;
    }

    public BucketTopicConfigurationArgs(
        Output<String> event,
        @Nullable Output<BucketNotificationFilterArgs> filter,
        Output<String> topic) {
        this.event = Objects.requireNonNull(event, "expected parameter 'event' to be non-null");
        this.filter = filter;
        this.topic = Objects.requireNonNull(topic, "expected parameter 'topic' to be non-null");
    }

    private BucketTopicConfigurationArgs() {
        this.event = Output.empty();
        this.filter = Output.empty();
        this.topic = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(BucketTopicConfigurationArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Output<String> event;
        private @Nullable Output<BucketNotificationFilterArgs> filter;
        private Output<String> topic;

        public Builder() {
    	      // Empty
        }

        public Builder(BucketTopicConfigurationArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.event = defaults.event;
    	      this.filter = defaults.filter;
    	      this.topic = defaults.topic;
        }

        public Builder event(Output<String> event) {
            this.event = Objects.requireNonNull(event);
            return this;
        }
        public Builder event(String event) {
            this.event = Output.of(Objects.requireNonNull(event));
            return this;
        }
        public Builder filter(@Nullable Output<BucketNotificationFilterArgs> filter) {
            this.filter = filter;
            return this;
        }
        public Builder filter(@Nullable BucketNotificationFilterArgs filter) {
            this.filter = Output.ofNullable(filter);
            return this;
        }
        public Builder topic(Output<String> topic) {
            this.topic = Objects.requireNonNull(topic);
            return this;
        }
        public Builder topic(String topic) {
            this.topic = Output.of(Objects.requireNonNull(topic));
            return this;
        }        public BucketTopicConfigurationArgs build() {
            return new BucketTopicConfigurationArgs(event, filter, topic);
        }
    }
}
