// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.servicefabric.inputs;

import io.pulumi.core.annotations.InputImport;
import java.lang.Double;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Describes capacity information for a custom resource balancing metric. This can be used to limit the total consumption of this metric by the services of this application.
 * 
 */
public final class ApplicationMetricDescriptionResponse extends io.pulumi.resources.InvokeArgs {

    public static final ApplicationMetricDescriptionResponse Empty = new ApplicationMetricDescriptionResponse();

    /**
     * The maximum node capacity for Service Fabric application.
     * This is the maximum Load for an instance of this application on a single node. Even if the capacity of node is greater than this value, Service Fabric will limit the total load of services within the application on each node to this value.
     * If set to zero, capacity for this metric is unlimited on each node.
     * When creating a new application with application capacity defined, the product of MaximumNodes and this value must always be smaller than or equal to TotalApplicationCapacity.
     * When updating existing application with application capacity, the product of MaximumNodes and this value must always be smaller than or equal to TotalApplicationCapacity.
     * 
     */
    @InputImport(name="maximumCapacity")
      private final @Nullable Double maximumCapacity;

    public Optional<Double> getMaximumCapacity() {
        return this.maximumCapacity == null ? Optional.empty() : Optional.ofNullable(this.maximumCapacity);
    }

    /**
     * The name of the metric.
     * 
     */
    @InputImport(name="name")
      private final @Nullable String name;

    public Optional<String> getName() {
        return this.name == null ? Optional.empty() : Optional.ofNullable(this.name);
    }

    /**
     * The node reservation capacity for Service Fabric application.
     * This is the amount of load which is reserved on nodes which have instances of this application.
     * If MinimumNodes is specified, then the product of these values will be the capacity reserved in the cluster for the application.
     * If set to zero, no capacity is reserved for this metric.
     * When setting application capacity or when updating application capacity; this value must be smaller than or equal to MaximumCapacity for each metric.
     * 
     */
    @InputImport(name="reservationCapacity")
      private final @Nullable Double reservationCapacity;

    public Optional<Double> getReservationCapacity() {
        return this.reservationCapacity == null ? Optional.empty() : Optional.ofNullable(this.reservationCapacity);
    }

    /**
     * The total metric capacity for Service Fabric application.
     * This is the total metric capacity for this application in the cluster. Service Fabric will try to limit the sum of loads of services within the application to this value.
     * When creating a new application with application capacity defined, the product of MaximumNodes and MaximumCapacity must always be smaller than or equal to this value.
     * 
     */
    @InputImport(name="totalApplicationCapacity")
      private final @Nullable Double totalApplicationCapacity;

    public Optional<Double> getTotalApplicationCapacity() {
        return this.totalApplicationCapacity == null ? Optional.empty() : Optional.ofNullable(this.totalApplicationCapacity);
    }

    public ApplicationMetricDescriptionResponse(
        @Nullable Double maximumCapacity,
        @Nullable String name,
        @Nullable Double reservationCapacity,
        @Nullable Double totalApplicationCapacity) {
        this.maximumCapacity = maximumCapacity;
        this.name = name;
        this.reservationCapacity = reservationCapacity;
        this.totalApplicationCapacity = totalApplicationCapacity;
    }

    private ApplicationMetricDescriptionResponse() {
        this.maximumCapacity = null;
        this.name = null;
        this.reservationCapacity = null;
        this.totalApplicationCapacity = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ApplicationMetricDescriptionResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Double maximumCapacity;
        private @Nullable String name;
        private @Nullable Double reservationCapacity;
        private @Nullable Double totalApplicationCapacity;

        public Builder() {
    	      // Empty
        }

        public Builder(ApplicationMetricDescriptionResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.maximumCapacity = defaults.maximumCapacity;
    	      this.name = defaults.name;
    	      this.reservationCapacity = defaults.reservationCapacity;
    	      this.totalApplicationCapacity = defaults.totalApplicationCapacity;
        }

        public Builder setMaximumCapacity(@Nullable Double maximumCapacity) {
            this.maximumCapacity = maximumCapacity;
            return this;
        }

        public Builder setName(@Nullable String name) {
            this.name = name;
            return this;
        }

        public Builder setReservationCapacity(@Nullable Double reservationCapacity) {
            this.reservationCapacity = reservationCapacity;
            return this;
        }

        public Builder setTotalApplicationCapacity(@Nullable Double totalApplicationCapacity) {
            this.totalApplicationCapacity = totalApplicationCapacity;
            return this;
        }
        public ApplicationMetricDescriptionResponse build() {
            return new ApplicationMetricDescriptionResponse(maximumCapacity, name, reservationCapacity, totalApplicationCapacity);
        }
    }
}
