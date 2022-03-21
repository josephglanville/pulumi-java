// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.notebooks.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


public final class InstanceReservationAffinityArgs extends io.pulumi.resources.ResourceArgs {

    public static final InstanceReservationAffinityArgs Empty = new InstanceReservationAffinityArgs();

    /**
     * The type of Compute Reservation.
     * Possible values are `NO_RESERVATION`, `ANY_RESERVATION`, and `SPECIFIC_RESERVATION`.
     * 
     */
    @Import(name="consumeReservationType", required=true)
      private final Output<String> consumeReservationType;

    public Output<String> getConsumeReservationType() {
        return this.consumeReservationType;
    }

    /**
     * Corresponds to the label key of reservation resource.
     * 
     */
    @Import(name="key")
      private final @Nullable Output<String> key;

    public Output<String> getKey() {
        return this.key == null ? Output.empty() : this.key;
    }

    /**
     * Corresponds to the label values of reservation resource.
     * 
     */
    @Import(name="values")
      private final @Nullable Output<List<String>> values;

    public Output<List<String>> getValues() {
        return this.values == null ? Output.empty() : this.values;
    }

    public InstanceReservationAffinityArgs(
        Output<String> consumeReservationType,
        @Nullable Output<String> key,
        @Nullable Output<List<String>> values) {
        this.consumeReservationType = Objects.requireNonNull(consumeReservationType, "expected parameter 'consumeReservationType' to be non-null");
        this.key = key;
        this.values = values;
    }

    private InstanceReservationAffinityArgs() {
        this.consumeReservationType = Output.empty();
        this.key = Output.empty();
        this.values = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(InstanceReservationAffinityArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Output<String> consumeReservationType;
        private @Nullable Output<String> key;
        private @Nullable Output<List<String>> values;

        public Builder() {
    	      // Empty
        }

        public Builder(InstanceReservationAffinityArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.consumeReservationType = defaults.consumeReservationType;
    	      this.key = defaults.key;
    	      this.values = defaults.values;
        }

        public Builder consumeReservationType(Output<String> consumeReservationType) {
            this.consumeReservationType = Objects.requireNonNull(consumeReservationType);
            return this;
        }
        public Builder consumeReservationType(String consumeReservationType) {
            this.consumeReservationType = Output.of(Objects.requireNonNull(consumeReservationType));
            return this;
        }
        public Builder key(@Nullable Output<String> key) {
            this.key = key;
            return this;
        }
        public Builder key(@Nullable String key) {
            this.key = Output.ofNullable(key);
            return this;
        }
        public Builder values(@Nullable Output<List<String>> values) {
            this.values = values;
            return this;
        }
        public Builder values(@Nullable List<String> values) {
            this.values = Output.ofNullable(values);
            return this;
        }
        public Builder values(String... values) {
            return values(List.of(values));
        }        public InstanceReservationAffinityArgs build() {
            return new InstanceReservationAffinityArgs(consumeReservationType, key, values);
        }
    }
}
