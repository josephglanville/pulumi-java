// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.s3.inputs;

import io.pulumi.aws.s3.inputs.BucketReplicationConfigRuleDestinationMetricsEventThresholdGetArgs;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class BucketReplicationConfigRuleDestinationMetricsGetArgs extends io.pulumi.resources.ResourceArgs {

    public static final BucketReplicationConfigRuleDestinationMetricsGetArgs Empty = new BucketReplicationConfigRuleDestinationMetricsGetArgs();

    /**
     * A configuration block that specifies the time threshold for emitting the `s3:Replication:OperationMissedThreshold` event documented below.
     * 
     */
    @Import(name="eventThreshold")
      private final @Nullable Output<BucketReplicationConfigRuleDestinationMetricsEventThresholdGetArgs> eventThreshold;

    public Output<BucketReplicationConfigRuleDestinationMetricsEventThresholdGetArgs> getEventThreshold() {
        return this.eventThreshold == null ? Output.empty() : this.eventThreshold;
    }

    /**
     * The status of the Destination Metrics. Either `"Enabled"` or `"Disabled"`.
     * 
     */
    @Import(name="status", required=true)
      private final Output<String> status;

    public Output<String> getStatus() {
        return this.status;
    }

    public BucketReplicationConfigRuleDestinationMetricsGetArgs(
        @Nullable Output<BucketReplicationConfigRuleDestinationMetricsEventThresholdGetArgs> eventThreshold,
        Output<String> status) {
        this.eventThreshold = eventThreshold;
        this.status = Objects.requireNonNull(status, "expected parameter 'status' to be non-null");
    }

    private BucketReplicationConfigRuleDestinationMetricsGetArgs() {
        this.eventThreshold = Output.empty();
        this.status = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(BucketReplicationConfigRuleDestinationMetricsGetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<BucketReplicationConfigRuleDestinationMetricsEventThresholdGetArgs> eventThreshold;
        private Output<String> status;

        public Builder() {
    	      // Empty
        }

        public Builder(BucketReplicationConfigRuleDestinationMetricsGetArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.eventThreshold = defaults.eventThreshold;
    	      this.status = defaults.status;
        }

        public Builder eventThreshold(@Nullable Output<BucketReplicationConfigRuleDestinationMetricsEventThresholdGetArgs> eventThreshold) {
            this.eventThreshold = eventThreshold;
            return this;
        }
        public Builder eventThreshold(@Nullable BucketReplicationConfigRuleDestinationMetricsEventThresholdGetArgs eventThreshold) {
            this.eventThreshold = Output.ofNullable(eventThreshold);
            return this;
        }
        public Builder status(Output<String> status) {
            this.status = Objects.requireNonNull(status);
            return this;
        }
        public Builder status(String status) {
            this.status = Output.of(Objects.requireNonNull(status));
            return this;
        }        public BucketReplicationConfigRuleDestinationMetricsGetArgs build() {
            return new BucketReplicationConfigRuleDestinationMetricsGetArgs(eventThreshold, status);
        }
    }
}
