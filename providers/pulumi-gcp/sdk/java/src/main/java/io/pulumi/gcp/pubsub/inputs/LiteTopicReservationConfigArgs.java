// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.pubsub.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class LiteTopicReservationConfigArgs extends io.pulumi.resources.ResourceArgs {

    public static final LiteTopicReservationConfigArgs Empty = new LiteTopicReservationConfigArgs();

    /**
     * The Reservation to use for this topic's throughput capacity.
     * 
     */
    @InputImport(name="throughputReservation")
      private final @Nullable Output<String> throughputReservation;

    public Output<String> getThroughputReservation() {
        return this.throughputReservation == null ? Output.empty() : this.throughputReservation;
    }

    public LiteTopicReservationConfigArgs(@Nullable Output<String> throughputReservation) {
        this.throughputReservation = throughputReservation;
    }

    private LiteTopicReservationConfigArgs() {
        this.throughputReservation = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(LiteTopicReservationConfigArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<String> throughputReservation;

        public Builder() {
    	      // Empty
        }

        public Builder(LiteTopicReservationConfigArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.throughputReservation = defaults.throughputReservation;
        }

        public Builder throughputReservation(@Nullable Output<String> throughputReservation) {
            this.throughputReservation = throughputReservation;
            return this;
        }

        public Builder throughputReservation(@Nullable String throughputReservation) {
            this.throughputReservation = Output.ofNullable(throughputReservation);
            return this;
        }
        public LiteTopicReservationConfigArgs build() {
            return new LiteTopicReservationConfigArgs(throughputReservation);
        }
    }
}
