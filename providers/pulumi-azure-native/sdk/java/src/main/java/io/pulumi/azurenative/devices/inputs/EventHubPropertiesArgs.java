// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.devices.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.internal.annotations.InputImport;
import java.lang.Double;
import java.lang.Integer;
import java.util.Objects;
import javax.annotation.Nullable;


public final class EventHubPropertiesArgs extends io.pulumi.resources.ResourceArgs {

    public static final EventHubPropertiesArgs Empty = new EventHubPropertiesArgs();

    @InputImport(name="partitionCount")
    private final @Nullable Input<Integer> partitionCount;

    public Input<Integer> getPartitionCount() {
        return this.partitionCount == null ? Input.empty() : this.partitionCount;
    }

    @InputImport(name="retentionTimeInDays")
    private final @Nullable Input<Double> retentionTimeInDays;

    public Input<Double> getRetentionTimeInDays() {
        return this.retentionTimeInDays == null ? Input.empty() : this.retentionTimeInDays;
    }

    public EventHubPropertiesArgs(
        @Nullable Input<Integer> partitionCount,
        @Nullable Input<Double> retentionTimeInDays) {
        this.partitionCount = partitionCount;
        this.retentionTimeInDays = retentionTimeInDays;
    }

    private EventHubPropertiesArgs() {
        this.partitionCount = Input.empty();
        this.retentionTimeInDays = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(EventHubPropertiesArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<Integer> partitionCount;
        private @Nullable Input<Double> retentionTimeInDays;

        public Builder() {
    	      // Empty
        }

        public Builder(EventHubPropertiesArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.partitionCount = defaults.partitionCount;
    	      this.retentionTimeInDays = defaults.retentionTimeInDays;
        }

        public Builder setPartitionCount(@Nullable Input<Integer> partitionCount) {
            this.partitionCount = partitionCount;
            return this;
        }

        public Builder setPartitionCount(@Nullable Integer partitionCount) {
            this.partitionCount = Input.ofNullable(partitionCount);
            return this;
        }

        public Builder setRetentionTimeInDays(@Nullable Input<Double> retentionTimeInDays) {
            this.retentionTimeInDays = retentionTimeInDays;
            return this;
        }

        public Builder setRetentionTimeInDays(@Nullable Double retentionTimeInDays) {
            this.retentionTimeInDays = Input.ofNullable(retentionTimeInDays);
            return this;
        }

        public EventHubPropertiesArgs build() {
            return new EventHubPropertiesArgs(partitionCount, retentionTimeInDays);
        }
    }
}
