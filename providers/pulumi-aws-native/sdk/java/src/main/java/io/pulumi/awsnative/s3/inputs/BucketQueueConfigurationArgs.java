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
 * The Amazon Simple Queue Service queues to publish messages to and the events for which to publish messages.
 * 
 */
public final class BucketQueueConfigurationArgs extends io.pulumi.resources.ResourceArgs {

    public static final BucketQueueConfigurationArgs Empty = new BucketQueueConfigurationArgs();

    /**
     * The Amazon S3 bucket event about which you want to publish messages to Amazon SQS.
     * 
     */
    @Import(name="event", required=true)
      private final Output<String> event;

    public Output<String> getEvent() {
        return this.event;
    }

    /**
     * The filtering rules that determine which objects trigger notifications.
     * 
     */
    @Import(name="filter")
      private final @Nullable Output<BucketNotificationFilterArgs> filter;

    public Output<BucketNotificationFilterArgs> getFilter() {
        return this.filter == null ? Output.empty() : this.filter;
    }

    /**
     * The Amazon Resource Name (ARN) of the Amazon SQS queue to which Amazon S3 publishes a message when it detects events of the specified type.
     * 
     */
    @Import(name="queue", required=true)
      private final Output<String> queue;

    public Output<String> getQueue() {
        return this.queue;
    }

    public BucketQueueConfigurationArgs(
        Output<String> event,
        @Nullable Output<BucketNotificationFilterArgs> filter,
        Output<String> queue) {
        this.event = Objects.requireNonNull(event, "expected parameter 'event' to be non-null");
        this.filter = filter;
        this.queue = Objects.requireNonNull(queue, "expected parameter 'queue' to be non-null");
    }

    private BucketQueueConfigurationArgs() {
        this.event = Output.empty();
        this.filter = Output.empty();
        this.queue = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(BucketQueueConfigurationArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Output<String> event;
        private @Nullable Output<BucketNotificationFilterArgs> filter;
        private Output<String> queue;

        public Builder() {
    	      // Empty
        }

        public Builder(BucketQueueConfigurationArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.event = defaults.event;
    	      this.filter = defaults.filter;
    	      this.queue = defaults.queue;
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
        public Builder queue(Output<String> queue) {
            this.queue = Objects.requireNonNull(queue);
            return this;
        }
        public Builder queue(String queue) {
            this.queue = Output.of(Objects.requireNonNull(queue));
            return this;
        }        public BucketQueueConfigurationArgs build() {
            return new BucketQueueConfigurationArgs(event, filter, queue);
        }
    }
}
