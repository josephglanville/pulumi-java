// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.compute.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import io.pulumi.gcp.compute.inputs.ReservationSpecificReservationInstancePropertiesGetArgs;
import java.lang.Integer;
import java.util.Objects;
import javax.annotation.Nullable;


public final class ReservationSpecificReservationGetArgs extends io.pulumi.resources.ResourceArgs {

    public static final ReservationSpecificReservationGetArgs Empty = new ReservationSpecificReservationGetArgs();

    /**
     * The number of resources that are allocated.
     * 
     */
    @InputImport(name="count", required=true)
      private final Input<Integer> count;

    public Input<Integer> getCount() {
        return this.count;
    }

    /**
     * - 
     * How many instances are in use.
     * 
     */
    @InputImport(name="inUseCount")
      private final @Nullable Input<Integer> inUseCount;

    public Input<Integer> getInUseCount() {
        return this.inUseCount == null ? Input.empty() : this.inUseCount;
    }

    /**
     * The instance properties for the reservation.
     * Structure is documented below.
     * 
     */
    @InputImport(name="instanceProperties", required=true)
      private final Input<ReservationSpecificReservationInstancePropertiesGetArgs> instanceProperties;

    public Input<ReservationSpecificReservationInstancePropertiesGetArgs> getInstanceProperties() {
        return this.instanceProperties;
    }

    public ReservationSpecificReservationGetArgs(
        Input<Integer> count,
        @Nullable Input<Integer> inUseCount,
        Input<ReservationSpecificReservationInstancePropertiesGetArgs> instanceProperties) {
        this.count = Objects.requireNonNull(count, "expected parameter 'count' to be non-null");
        this.inUseCount = inUseCount;
        this.instanceProperties = Objects.requireNonNull(instanceProperties, "expected parameter 'instanceProperties' to be non-null");
    }

    private ReservationSpecificReservationGetArgs() {
        this.count = Input.empty();
        this.inUseCount = Input.empty();
        this.instanceProperties = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ReservationSpecificReservationGetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Input<Integer> count;
        private @Nullable Input<Integer> inUseCount;
        private Input<ReservationSpecificReservationInstancePropertiesGetArgs> instanceProperties;

        public Builder() {
    	      // Empty
        }

        public Builder(ReservationSpecificReservationGetArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.count = defaults.count;
    	      this.inUseCount = defaults.inUseCount;
    	      this.instanceProperties = defaults.instanceProperties;
        }

        public Builder setCount(Input<Integer> count) {
            this.count = Objects.requireNonNull(count);
            return this;
        }

        public Builder setCount(Integer count) {
            this.count = Input.of(Objects.requireNonNull(count));
            return this;
        }

        public Builder setInUseCount(@Nullable Input<Integer> inUseCount) {
            this.inUseCount = inUseCount;
            return this;
        }

        public Builder setInUseCount(@Nullable Integer inUseCount) {
            this.inUseCount = Input.ofNullable(inUseCount);
            return this;
        }

        public Builder setInstanceProperties(Input<ReservationSpecificReservationInstancePropertiesGetArgs> instanceProperties) {
            this.instanceProperties = Objects.requireNonNull(instanceProperties);
            return this;
        }

        public Builder setInstanceProperties(ReservationSpecificReservationInstancePropertiesGetArgs instanceProperties) {
            this.instanceProperties = Input.of(Objects.requireNonNull(instanceProperties));
            return this;
        }
        public ReservationSpecificReservationGetArgs build() {
            return new ReservationSpecificReservationGetArgs(count, inUseCount, instanceProperties);
        }
    }
}
