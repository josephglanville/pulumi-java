// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.notebooks_v1.inputs;

import io.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.List;
import java.util.Objects;


/**
 * Reservation Affinity for consuming Zonal reservation.
 * 
 */
public final class ReservationAffinityResponse extends io.pulumi.resources.InvokeArgs {

    public static final ReservationAffinityResponse Empty = new ReservationAffinityResponse();

    /**
     * Optional. Type of reservation to consume
     * 
     */
    @Import(name="consumeReservationType", required=true)
      private final String consumeReservationType;

    public String getConsumeReservationType() {
        return this.consumeReservationType;
    }

    /**
     * Optional. Corresponds to the label key of reservation resource.
     * 
     */
    @Import(name="key", required=true)
      private final String key;

    public String getKey() {
        return this.key;
    }

    /**
     * Optional. Corresponds to the label values of reservation resource.
     * 
     */
    @Import(name="values", required=true)
      private final List<String> values;

    public List<String> getValues() {
        return this.values;
    }

    public ReservationAffinityResponse(
        String consumeReservationType,
        String key,
        List<String> values) {
        this.consumeReservationType = Objects.requireNonNull(consumeReservationType, "expected parameter 'consumeReservationType' to be non-null");
        this.key = Objects.requireNonNull(key, "expected parameter 'key' to be non-null");
        this.values = Objects.requireNonNull(values, "expected parameter 'values' to be non-null");
    }

    private ReservationAffinityResponse() {
        this.consumeReservationType = null;
        this.key = null;
        this.values = List.of();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ReservationAffinityResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String consumeReservationType;
        private String key;
        private List<String> values;

        public Builder() {
    	      // Empty
        }

        public Builder(ReservationAffinityResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.consumeReservationType = defaults.consumeReservationType;
    	      this.key = defaults.key;
    	      this.values = defaults.values;
        }

        public Builder consumeReservationType(String consumeReservationType) {
            this.consumeReservationType = Objects.requireNonNull(consumeReservationType);
            return this;
        }
        public Builder key(String key) {
            this.key = Objects.requireNonNull(key);
            return this;
        }
        public Builder values(List<String> values) {
            this.values = Objects.requireNonNull(values);
            return this;
        }
        public Builder values(String... values) {
            return values(List.of(values));
        }        public ReservationAffinityResponse build() {
            return new ReservationAffinityResponse(consumeReservationType, key, values);
        }
    }
}
