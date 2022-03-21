// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.pubsub.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import java.lang.Integer;
import java.util.Objects;


public final class LiteTopicPartitionConfigCapacityGetArgs extends io.pulumi.resources.ResourceArgs {

    public static final LiteTopicPartitionConfigCapacityGetArgs Empty = new LiteTopicPartitionConfigCapacityGetArgs();

    /**
     * Subscribe throughput capacity per partition in MiB/s. Must be >= 4 and <= 16.
     * 
     */
    @Import(name="publishMibPerSec", required=true)
      private final Output<Integer> publishMibPerSec;

    public Output<Integer> getPublishMibPerSec() {
        return this.publishMibPerSec;
    }

    /**
     * Publish throughput capacity per partition in MiB/s. Must be >= 4 and <= 16.
     * 
     */
    @Import(name="subscribeMibPerSec", required=true)
      private final Output<Integer> subscribeMibPerSec;

    public Output<Integer> getSubscribeMibPerSec() {
        return this.subscribeMibPerSec;
    }

    public LiteTopicPartitionConfigCapacityGetArgs(
        Output<Integer> publishMibPerSec,
        Output<Integer> subscribeMibPerSec) {
        this.publishMibPerSec = Objects.requireNonNull(publishMibPerSec, "expected parameter 'publishMibPerSec' to be non-null");
        this.subscribeMibPerSec = Objects.requireNonNull(subscribeMibPerSec, "expected parameter 'subscribeMibPerSec' to be non-null");
    }

    private LiteTopicPartitionConfigCapacityGetArgs() {
        this.publishMibPerSec = Output.empty();
        this.subscribeMibPerSec = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(LiteTopicPartitionConfigCapacityGetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Output<Integer> publishMibPerSec;
        private Output<Integer> subscribeMibPerSec;

        public Builder() {
    	      // Empty
        }

        public Builder(LiteTopicPartitionConfigCapacityGetArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.publishMibPerSec = defaults.publishMibPerSec;
    	      this.subscribeMibPerSec = defaults.subscribeMibPerSec;
        }

        public Builder publishMibPerSec(Output<Integer> publishMibPerSec) {
            this.publishMibPerSec = Objects.requireNonNull(publishMibPerSec);
            return this;
        }
        public Builder publishMibPerSec(Integer publishMibPerSec) {
            this.publishMibPerSec = Output.of(Objects.requireNonNull(publishMibPerSec));
            return this;
        }
        public Builder subscribeMibPerSec(Output<Integer> subscribeMibPerSec) {
            this.subscribeMibPerSec = Objects.requireNonNull(subscribeMibPerSec);
            return this;
        }
        public Builder subscribeMibPerSec(Integer subscribeMibPerSec) {
            this.subscribeMibPerSec = Output.of(Objects.requireNonNull(subscribeMibPerSec));
            return this;
        }        public LiteTopicPartitionConfigCapacityGetArgs build() {
            return new LiteTopicPartitionConfigCapacityGetArgs(publishMibPerSec, subscribeMibPerSec);
        }
    }
}
