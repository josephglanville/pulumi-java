// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.compute.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
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
    @Import(name="count", required=true)
      private final Output<Integer> count;

    public Output<Integer> getCount() {
        return this.count;
    }

    /**
     * - 
     * How many instances are in use.
     * 
     */
    @Import(name="inUseCount")
      private final @Nullable Output<Integer> inUseCount;

    public Output<Integer> getInUseCount() {
        return this.inUseCount == null ? Output.empty() : this.inUseCount;
    }

    /**
     * The instance properties for the reservation.
     * Structure is documented below.
     * 
     */
    @Import(name="instanceProperties", required=true)
      private final Output<ReservationSpecificReservationInstancePropertiesGetArgs> instanceProperties;

    public Output<ReservationSpecificReservationInstancePropertiesGetArgs> getInstanceProperties() {
        return this.instanceProperties;
    }

    public ReservationSpecificReservationGetArgs(
        Output<Integer> count,
        @Nullable Output<Integer> inUseCount,
        Output<ReservationSpecificReservationInstancePropertiesGetArgs> instanceProperties) {
        this.count = Objects.requireNonNull(count, "expected parameter 'count' to be non-null");
        this.inUseCount = inUseCount;
        this.instanceProperties = Objects.requireNonNull(instanceProperties, "expected parameter 'instanceProperties' to be non-null");
    }

    private ReservationSpecificReservationGetArgs() {
        this.count = Output.empty();
        this.inUseCount = Output.empty();
        this.instanceProperties = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ReservationSpecificReservationGetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Output<Integer> count;
        private @Nullable Output<Integer> inUseCount;
        private Output<ReservationSpecificReservationInstancePropertiesGetArgs> instanceProperties;

        public Builder() {
    	      // Empty
        }

        public Builder(ReservationSpecificReservationGetArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.count = defaults.count;
    	      this.inUseCount = defaults.inUseCount;
    	      this.instanceProperties = defaults.instanceProperties;
        }

        public Builder count(Output<Integer> count) {
            this.count = Objects.requireNonNull(count);
            return this;
        }
        public Builder count(Integer count) {
            this.count = Output.of(Objects.requireNonNull(count));
            return this;
        }
        public Builder inUseCount(@Nullable Output<Integer> inUseCount) {
            this.inUseCount = inUseCount;
            return this;
        }
        public Builder inUseCount(@Nullable Integer inUseCount) {
            this.inUseCount = Output.ofNullable(inUseCount);
            return this;
        }
        public Builder instanceProperties(Output<ReservationSpecificReservationInstancePropertiesGetArgs> instanceProperties) {
            this.instanceProperties = Objects.requireNonNull(instanceProperties);
            return this;
        }
        public Builder instanceProperties(ReservationSpecificReservationInstancePropertiesGetArgs instanceProperties) {
            this.instanceProperties = Output.of(Objects.requireNonNull(instanceProperties));
            return this;
        }        public ReservationSpecificReservationGetArgs build() {
            return new ReservationSpecificReservationGetArgs(count, inUseCount, instanceProperties);
        }
    }
}
