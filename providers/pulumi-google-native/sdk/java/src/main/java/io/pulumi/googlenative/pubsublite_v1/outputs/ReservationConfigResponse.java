// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.pubsublite_v1.outputs;

import io.pulumi.core.internal.annotations.OutputCustomType;
import java.lang.String;
import java.util.Objects;

@OutputCustomType
public final class ReservationConfigResponse {
    private final String throughputReservation;

    @OutputCustomType.Constructor({"throughputReservation"})
    private ReservationConfigResponse(String throughputReservation) {
        this.throughputReservation = Objects.requireNonNull(throughputReservation);
    }

    public String getThroughputReservation() {
        return this.throughputReservation;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ReservationConfigResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String throughputReservation;

        public Builder() {
    	      // Empty
        }

        public Builder(ReservationConfigResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.throughputReservation = defaults.throughputReservation;
        }

        public Builder setThroughputReservation(String throughputReservation) {
            this.throughputReservation = Objects.requireNonNull(throughputReservation);
            return this;
        }

        public ReservationConfigResponse build() {
            return new ReservationConfigResponse(throughputReservation);
        }
    }
}