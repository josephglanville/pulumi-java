// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.servicefabric.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.internal.annotations.InputImport;
import java.lang.Double;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class ApplicationMetricDescriptionArgs extends io.pulumi.resources.ResourceArgs {

    public static final ApplicationMetricDescriptionArgs Empty = new ApplicationMetricDescriptionArgs();

    @InputImport(name="maximumCapacity")
    private final @Nullable Input<Double> maximumCapacity;

    public Input<Double> getMaximumCapacity() {
        return this.maximumCapacity == null ? Input.empty() : this.maximumCapacity;
    }

    @InputImport(name="name")
    private final @Nullable Input<String> name;

    public Input<String> getName() {
        return this.name == null ? Input.empty() : this.name;
    }

    @InputImport(name="reservationCapacity")
    private final @Nullable Input<Double> reservationCapacity;

    public Input<Double> getReservationCapacity() {
        return this.reservationCapacity == null ? Input.empty() : this.reservationCapacity;
    }

    @InputImport(name="totalApplicationCapacity")
    private final @Nullable Input<Double> totalApplicationCapacity;

    public Input<Double> getTotalApplicationCapacity() {
        return this.totalApplicationCapacity == null ? Input.empty() : this.totalApplicationCapacity;
    }

    public ApplicationMetricDescriptionArgs(
        @Nullable Input<Double> maximumCapacity,
        @Nullable Input<String> name,
        @Nullable Input<Double> reservationCapacity,
        @Nullable Input<Double> totalApplicationCapacity) {
        this.maximumCapacity = maximumCapacity;
        this.name = name;
        this.reservationCapacity = reservationCapacity;
        this.totalApplicationCapacity = totalApplicationCapacity;
    }

    private ApplicationMetricDescriptionArgs() {
        this.maximumCapacity = Input.empty();
        this.name = Input.empty();
        this.reservationCapacity = Input.empty();
        this.totalApplicationCapacity = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ApplicationMetricDescriptionArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<Double> maximumCapacity;
        private @Nullable Input<String> name;
        private @Nullable Input<Double> reservationCapacity;
        private @Nullable Input<Double> totalApplicationCapacity;

        public Builder() {
    	      // Empty
        }

        public Builder(ApplicationMetricDescriptionArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.maximumCapacity = defaults.maximumCapacity;
    	      this.name = defaults.name;
    	      this.reservationCapacity = defaults.reservationCapacity;
    	      this.totalApplicationCapacity = defaults.totalApplicationCapacity;
        }

        public Builder setMaximumCapacity(@Nullable Input<Double> maximumCapacity) {
            this.maximumCapacity = maximumCapacity;
            return this;
        }

        public Builder setMaximumCapacity(@Nullable Double maximumCapacity) {
            this.maximumCapacity = Input.ofNullable(maximumCapacity);
            return this;
        }

        public Builder setName(@Nullable Input<String> name) {
            this.name = name;
            return this;
        }

        public Builder setName(@Nullable String name) {
            this.name = Input.ofNullable(name);
            return this;
        }

        public Builder setReservationCapacity(@Nullable Input<Double> reservationCapacity) {
            this.reservationCapacity = reservationCapacity;
            return this;
        }

        public Builder setReservationCapacity(@Nullable Double reservationCapacity) {
            this.reservationCapacity = Input.ofNullable(reservationCapacity);
            return this;
        }

        public Builder setTotalApplicationCapacity(@Nullable Input<Double> totalApplicationCapacity) {
            this.totalApplicationCapacity = totalApplicationCapacity;
            return this;
        }

        public Builder setTotalApplicationCapacity(@Nullable Double totalApplicationCapacity) {
            this.totalApplicationCapacity = Input.ofNullable(totalApplicationCapacity);
            return this;
        }

        public ApplicationMetricDescriptionArgs build() {
            return new ApplicationMetricDescriptionArgs(maximumCapacity, name, reservationCapacity, totalApplicationCapacity);
        }
    }
}