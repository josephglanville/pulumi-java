// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.docker.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.docker.inputs.ServiceTaskSpecResourcesLimitsArgs;
import io.pulumi.docker.inputs.ServiceTaskSpecResourcesReservationArgs;
import java.util.Objects;
import javax.annotation.Nullable;


public final class ServiceTaskSpecResourcesArgs extends io.pulumi.resources.ResourceArgs {

    public static final ServiceTaskSpecResourcesArgs Empty = new ServiceTaskSpecResourcesArgs();

    @Import(name="limits")
      private final @Nullable Output<ServiceTaskSpecResourcesLimitsArgs> limits;

    public Output<ServiceTaskSpecResourcesLimitsArgs> getLimits() {
        return this.limits == null ? Output.empty() : this.limits;
    }

    @Import(name="reservation")
      private final @Nullable Output<ServiceTaskSpecResourcesReservationArgs> reservation;

    public Output<ServiceTaskSpecResourcesReservationArgs> getReservation() {
        return this.reservation == null ? Output.empty() : this.reservation;
    }

    public ServiceTaskSpecResourcesArgs(
        @Nullable Output<ServiceTaskSpecResourcesLimitsArgs> limits,
        @Nullable Output<ServiceTaskSpecResourcesReservationArgs> reservation) {
        this.limits = limits;
        this.reservation = reservation;
    }

    private ServiceTaskSpecResourcesArgs() {
        this.limits = Output.empty();
        this.reservation = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ServiceTaskSpecResourcesArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<ServiceTaskSpecResourcesLimitsArgs> limits;
        private @Nullable Output<ServiceTaskSpecResourcesReservationArgs> reservation;

        public Builder() {
    	      // Empty
        }

        public Builder(ServiceTaskSpecResourcesArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.limits = defaults.limits;
    	      this.reservation = defaults.reservation;
        }

        public Builder limits(@Nullable Output<ServiceTaskSpecResourcesLimitsArgs> limits) {
            this.limits = limits;
            return this;
        }
        public Builder limits(@Nullable ServiceTaskSpecResourcesLimitsArgs limits) {
            this.limits = Output.ofNullable(limits);
            return this;
        }
        public Builder reservation(@Nullable Output<ServiceTaskSpecResourcesReservationArgs> reservation) {
            this.reservation = reservation;
            return this;
        }
        public Builder reservation(@Nullable ServiceTaskSpecResourcesReservationArgs reservation) {
            this.reservation = Output.ofNullable(reservation);
            return this;
        }        public ServiceTaskSpecResourcesArgs build() {
            return new ServiceTaskSpecResourcesArgs(limits, reservation);
        }
    }
}
