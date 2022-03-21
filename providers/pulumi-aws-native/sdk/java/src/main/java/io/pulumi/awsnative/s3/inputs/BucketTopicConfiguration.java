// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.s3.inputs;

import io.pulumi.awsnative.s3.inputs.BucketNotificationFilter;
import io.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * The topic to which notifications are sent and the events for which notifications are generated.
 * 
 */
public final class BucketTopicConfiguration extends io.pulumi.resources.InvokeArgs {

    public static final BucketTopicConfiguration Empty = new BucketTopicConfiguration();

    /**
     * The Amazon S3 bucket event about which to send notifications.
     * 
     */
    @Import(name="event", required=true)
      private final String event;

    public String getEvent() {
        return this.event;
    }

    /**
     * The filtering rules that determine for which objects to send notifications.
     * 
     */
    @Import(name="filter")
      private final @Nullable BucketNotificationFilter filter;

    public Optional<BucketNotificationFilter> getFilter() {
        return this.filter == null ? Optional.empty() : Optional.ofNullable(this.filter);
    }

    /**
     * The Amazon Resource Name (ARN) of the Amazon SNS topic to which Amazon S3 publishes a message when it detects events of the specified type.
     * 
     */
    @Import(name="topic", required=true)
      private final String topic;

    public String getTopic() {
        return this.topic;
    }

    public BucketTopicConfiguration(
        String event,
        @Nullable BucketNotificationFilter filter,
        String topic) {
        this.event = Objects.requireNonNull(event, "expected parameter 'event' to be non-null");
        this.filter = filter;
        this.topic = Objects.requireNonNull(topic, "expected parameter 'topic' to be non-null");
    }

    private BucketTopicConfiguration() {
        this.event = null;
        this.filter = null;
        this.topic = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(BucketTopicConfiguration defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String event;
        private @Nullable BucketNotificationFilter filter;
        private String topic;

        public Builder() {
    	      // Empty
        }

        public Builder(BucketTopicConfiguration defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.event = defaults.event;
    	      this.filter = defaults.filter;
    	      this.topic = defaults.topic;
        }

        public Builder event(String event) {
            this.event = Objects.requireNonNull(event);
            return this;
        }
        public Builder filter(@Nullable BucketNotificationFilter filter) {
            this.filter = filter;
            return this;
        }
        public Builder topic(String topic) {
            this.topic = Objects.requireNonNull(topic);
            return this;
        }        public BucketTopicConfiguration build() {
            return new BucketTopicConfiguration(event, filter, topic);
        }
    }
}
