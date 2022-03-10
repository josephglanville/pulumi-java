// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.cloudwatch.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class EventTargetKinesisTarget {
    /**
     * The JSON path to be extracted from the event and used as the partition key.
     * 
     */
    private final @Nullable String partitionKeyPath;

    @OutputCustomType.Constructor
    private EventTargetKinesisTarget(@OutputCustomType.Parameter("partitionKeyPath") @Nullable String partitionKeyPath) {
        this.partitionKeyPath = partitionKeyPath;
    }

    /**
     * The JSON path to be extracted from the event and used as the partition key.
     * 
    */
    public Optional<String> getPartitionKeyPath() {
        return Optional.ofNullable(this.partitionKeyPath);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(EventTargetKinesisTarget defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String partitionKeyPath;

        public Builder() {
    	      // Empty
        }

        public Builder(EventTargetKinesisTarget defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.partitionKeyPath = defaults.partitionKeyPath;
        }

        public Builder setPartitionKeyPath(@Nullable String partitionKeyPath) {
            this.partitionKeyPath = partitionKeyPath;
            return this;
        }
        public EventTargetKinesisTarget build() {
            return new EventTargetKinesisTarget(partitionKeyPath);
        }
    }
}
