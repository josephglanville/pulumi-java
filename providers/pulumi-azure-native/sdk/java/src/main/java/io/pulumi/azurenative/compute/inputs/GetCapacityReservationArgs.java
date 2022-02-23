// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.compute.inputs;

import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetCapacityReservationArgs extends io.pulumi.resources.InvokeArgs {

    public static final GetCapacityReservationArgs Empty = new GetCapacityReservationArgs();

    /**
     * The name of the capacity reservation group.
     * 
     */
    @InputImport(name="capacityReservationGroupName", required=true)
      private final String capacityReservationGroupName;

    public String getCapacityReservationGroupName() {
        return this.capacityReservationGroupName;
    }

    /**
     * The name of the capacity reservation.
     * 
     */
    @InputImport(name="capacityReservationName", required=true)
      private final String capacityReservationName;

    public String getCapacityReservationName() {
        return this.capacityReservationName;
    }

    /**
     * The expand expression to apply on the operation. 'InstanceView' retrieves a snapshot of the runtime properties of the capacity reservation that is managed by the platform and can change outside of control plane operations.
     * 
     */
    @InputImport(name="expand")
      private final @Nullable String expand;

    public Optional<String> getExpand() {
        return this.expand == null ? Optional.empty() : Optional.ofNullable(this.expand);
    }

    /**
     * The name of the resource group.
     * 
     */
    @InputImport(name="resourceGroupName", required=true)
      private final String resourceGroupName;

    public String getResourceGroupName() {
        return this.resourceGroupName;
    }

    public GetCapacityReservationArgs(
        String capacityReservationGroupName,
        String capacityReservationName,
        @Nullable String expand,
        String resourceGroupName) {
        this.capacityReservationGroupName = Objects.requireNonNull(capacityReservationGroupName, "expected parameter 'capacityReservationGroupName' to be non-null");
        this.capacityReservationName = Objects.requireNonNull(capacityReservationName, "expected parameter 'capacityReservationName' to be non-null");
        this.expand = expand;
        this.resourceGroupName = Objects.requireNonNull(resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
    }

    private GetCapacityReservationArgs() {
        this.capacityReservationGroupName = null;
        this.capacityReservationName = null;
        this.expand = null;
        this.resourceGroupName = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetCapacityReservationArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String capacityReservationGroupName;
        private String capacityReservationName;
        private @Nullable String expand;
        private String resourceGroupName;

        public Builder() {
    	      // Empty
        }

        public Builder(GetCapacityReservationArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.capacityReservationGroupName = defaults.capacityReservationGroupName;
    	      this.capacityReservationName = defaults.capacityReservationName;
    	      this.expand = defaults.expand;
    	      this.resourceGroupName = defaults.resourceGroupName;
        }

        public Builder setCapacityReservationGroupName(String capacityReservationGroupName) {
            this.capacityReservationGroupName = Objects.requireNonNull(capacityReservationGroupName);
            return this;
        }

        public Builder setCapacityReservationName(String capacityReservationName) {
            this.capacityReservationName = Objects.requireNonNull(capacityReservationName);
            return this;
        }

        public Builder setExpand(@Nullable String expand) {
            this.expand = expand;
            return this;
        }

        public Builder setResourceGroupName(String resourceGroupName) {
            this.resourceGroupName = Objects.requireNonNull(resourceGroupName);
            return this;
        }
        public GetCapacityReservationArgs build() {
            return new GetCapacityReservationArgs(capacityReservationGroupName, capacityReservationName, expand, resourceGroupName);
        }
    }
}
