// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.pubsub.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.gcp.pubsub.inputs.LiteTopicPartitionConfigCapacityGetArgs;
import java.lang.Integer;
import java.util.Objects;
import javax.annotation.Nullable;


public final class LiteTopicPartitionConfigGetArgs extends io.pulumi.resources.ResourceArgs {

    public static final LiteTopicPartitionConfigGetArgs Empty = new LiteTopicPartitionConfigGetArgs();

    /**
     * The capacity configuration.
     * Structure is documented below.
     * 
     */
    @Import(name="capacity")
      private final @Nullable Output<LiteTopicPartitionConfigCapacityGetArgs> capacity;

    public Output<LiteTopicPartitionConfigCapacityGetArgs> getCapacity() {
        return this.capacity == null ? Output.empty() : this.capacity;
    }

    /**
     * The number of partitions in the topic. Must be at least 1.
     * 
     */
    @Import(name="count", required=true)
      private final Output<Integer> count;

    public Output<Integer> getCount() {
        return this.count;
    }

    public LiteTopicPartitionConfigGetArgs(
        @Nullable Output<LiteTopicPartitionConfigCapacityGetArgs> capacity,
        Output<Integer> count) {
        this.capacity = capacity;
        this.count = Objects.requireNonNull(count, "expected parameter 'count' to be non-null");
    }

    private LiteTopicPartitionConfigGetArgs() {
        this.capacity = Output.empty();
        this.count = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(LiteTopicPartitionConfigGetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<LiteTopicPartitionConfigCapacityGetArgs> capacity;
        private Output<Integer> count;

        public Builder() {
    	      // Empty
        }

        public Builder(LiteTopicPartitionConfigGetArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.capacity = defaults.capacity;
    	      this.count = defaults.count;
        }

        public Builder capacity(@Nullable Output<LiteTopicPartitionConfigCapacityGetArgs> capacity) {
            this.capacity = capacity;
            return this;
        }
        public Builder capacity(@Nullable LiteTopicPartitionConfigCapacityGetArgs capacity) {
            this.capacity = Output.ofNullable(capacity);
            return this;
        }
        public Builder count(Output<Integer> count) {
            this.count = Objects.requireNonNull(count);
            return this;
        }
        public Builder count(Integer count) {
            this.count = Output.of(Objects.requireNonNull(count));
            return this;
        }        public LiteTopicPartitionConfigGetArgs build() {
            return new LiteTopicPartitionConfigGetArgs(capacity, count);
        }
    }
}
