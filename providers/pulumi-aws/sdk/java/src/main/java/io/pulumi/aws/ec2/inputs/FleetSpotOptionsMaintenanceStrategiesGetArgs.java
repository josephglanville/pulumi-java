// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.ec2.inputs;

import io.pulumi.aws.ec2.inputs.FleetSpotOptionsMaintenanceStrategiesCapacityRebalanceGetArgs;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import java.util.Objects;
import javax.annotation.Nullable;


public final class FleetSpotOptionsMaintenanceStrategiesGetArgs extends io.pulumi.resources.ResourceArgs {

    public static final FleetSpotOptionsMaintenanceStrategiesGetArgs Empty = new FleetSpotOptionsMaintenanceStrategiesGetArgs();

    /**
     * Nested argument containing the capacity rebalance for your fleet request. Defined below.
     * 
     */
    @Import(name="capacityRebalance")
      private final @Nullable Output<FleetSpotOptionsMaintenanceStrategiesCapacityRebalanceGetArgs> capacityRebalance;

    public Output<FleetSpotOptionsMaintenanceStrategiesCapacityRebalanceGetArgs> getCapacityRebalance() {
        return this.capacityRebalance == null ? Output.empty() : this.capacityRebalance;
    }

    public FleetSpotOptionsMaintenanceStrategiesGetArgs(@Nullable Output<FleetSpotOptionsMaintenanceStrategiesCapacityRebalanceGetArgs> capacityRebalance) {
        this.capacityRebalance = capacityRebalance;
    }

    private FleetSpotOptionsMaintenanceStrategiesGetArgs() {
        this.capacityRebalance = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(FleetSpotOptionsMaintenanceStrategiesGetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<FleetSpotOptionsMaintenanceStrategiesCapacityRebalanceGetArgs> capacityRebalance;

        public Builder() {
    	      // Empty
        }

        public Builder(FleetSpotOptionsMaintenanceStrategiesGetArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.capacityRebalance = defaults.capacityRebalance;
        }

        public Builder capacityRebalance(@Nullable Output<FleetSpotOptionsMaintenanceStrategiesCapacityRebalanceGetArgs> capacityRebalance) {
            this.capacityRebalance = capacityRebalance;
            return this;
        }
        public Builder capacityRebalance(@Nullable FleetSpotOptionsMaintenanceStrategiesCapacityRebalanceGetArgs capacityRebalance) {
            this.capacityRebalance = Output.ofNullable(capacityRebalance);
            return this;
        }        public FleetSpotOptionsMaintenanceStrategiesGetArgs build() {
            return new FleetSpotOptionsMaintenanceStrategiesGetArgs(capacityRebalance);
        }
    }
}