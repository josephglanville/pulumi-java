// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.pubsublite_v1.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * The settings for this topic's Reservation usage.
 * 
 */
public final class ReservationConfigArgs extends io.pulumi.resources.ResourceArgs {

    public static final ReservationConfigArgs Empty = new ReservationConfigArgs();

    /**
     * The Reservation to use for this topic's throughput capacity. Structured like: projects/{project_number}/locations/{location}/reservations/{reservation_id}
     * 
     */
    @Import(name="throughputReservation")
      private final @Nullable Output<String> throughputReservation;

    public Output<String> getThroughputReservation() {
        return this.throughputReservation == null ? Codegen.empty() : this.throughputReservation;
    }

    public ReservationConfigArgs(@Nullable Output<String> throughputReservation) {
        this.throughputReservation = throughputReservation;
    }

    private ReservationConfigArgs() {
        this.throughputReservation = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ReservationConfigArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<String> throughputReservation;

        public Builder() {
    	      // Empty
        }

        public Builder(ReservationConfigArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.throughputReservation = defaults.throughputReservation;
        }

        public Builder throughputReservation(@Nullable Output<String> throughputReservation) {
            this.throughputReservation = throughputReservation;
            return this;
        }
        public Builder throughputReservation(@Nullable String throughputReservation) {
            this.throughputReservation = Codegen.ofNullable(throughputReservation);
            return this;
        }        public ReservationConfigArgs build() {
            return new ReservationConfigArgs(throughputReservation);
        }
    }
}
