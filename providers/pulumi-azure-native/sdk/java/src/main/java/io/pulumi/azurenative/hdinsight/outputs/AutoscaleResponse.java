// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.hdinsight.outputs;

import io.pulumi.azurenative.hdinsight.outputs.AutoscaleCapacityResponse;
import io.pulumi.azurenative.hdinsight.outputs.AutoscaleRecurrenceResponse;
import io.pulumi.core.annotations.CustomType;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class AutoscaleResponse {
    /**
     * Parameters for load-based autoscale
     * 
     */
    private final @Nullable AutoscaleCapacityResponse capacity;
    /**
     * Parameters for schedule-based autoscale
     * 
     */
    private final @Nullable AutoscaleRecurrenceResponse recurrence;

    @CustomType.Constructor
    private AutoscaleResponse(
        @CustomType.Parameter("capacity") @Nullable AutoscaleCapacityResponse capacity,
        @CustomType.Parameter("recurrence") @Nullable AutoscaleRecurrenceResponse recurrence) {
        this.capacity = capacity;
        this.recurrence = recurrence;
    }

    /**
     * Parameters for load-based autoscale
     * 
    */
    public Optional<AutoscaleCapacityResponse> getCapacity() {
        return Optional.ofNullable(this.capacity);
    }
    /**
     * Parameters for schedule-based autoscale
     * 
    */
    public Optional<AutoscaleRecurrenceResponse> getRecurrence() {
        return Optional.ofNullable(this.recurrence);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(AutoscaleResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable AutoscaleCapacityResponse capacity;
        private @Nullable AutoscaleRecurrenceResponse recurrence;

        public Builder() {
    	      // Empty
        }

        public Builder(AutoscaleResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.capacity = defaults.capacity;
    	      this.recurrence = defaults.recurrence;
        }

        public Builder capacity(@Nullable AutoscaleCapacityResponse capacity) {
            this.capacity = capacity;
            return this;
        }
        public Builder recurrence(@Nullable AutoscaleRecurrenceResponse recurrence) {
            this.recurrence = recurrence;
            return this;
        }        public AutoscaleResponse build() {
            return new AutoscaleResponse(capacity, recurrence);
        }
    }
}
