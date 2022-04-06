// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.ec2.inputs;

import io.pulumi.aws.ec2.inputs.FleetSpotOptionsMaintenanceStrategiesCapacityRebalanceArgs;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import java.util.Objects;
import javax.annotation.Nullable;


public final class FleetSpotOptionsMaintenanceStrategiesArgs extends io.pulumi.resources.ResourceArgs {

    public static final FleetSpotOptionsMaintenanceStrategiesArgs Empty = new FleetSpotOptionsMaintenanceStrategiesArgs();

    /**
     * Nested argument containing the capacity rebalance for your fleet request. Defined below.
     * 
     */
    @Import(name="capacityRebalance")
      private final @Nullable Output<FleetSpotOptionsMaintenanceStrategiesCapacityRebalanceArgs> capacityRebalance;

    public Output<FleetSpotOptionsMaintenanceStrategiesCapacityRebalanceArgs> getCapacityRebalance() {
        return this.capacityRebalance == null ? Output.empty() : this.capacityRebalance;
    }

    public FleetSpotOptionsMaintenanceStrategiesArgs(@Nullable Output<FleetSpotOptionsMaintenanceStrategiesCapacityRebalanceArgs> capacityRebalance) {
        this.capacityRebalance = capacityRebalance;
    }

    private FleetSpotOptionsMaintenanceStrategiesArgs() {
        this.capacityRebalance = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(FleetSpotOptionsMaintenanceStrategiesArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<FleetSpotOptionsMaintenanceStrategiesCapacityRebalanceArgs> capacityRebalance;

        public Builder() {
    	      // Empty
        }

        public Builder(FleetSpotOptionsMaintenanceStrategiesArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.capacityRebalance = defaults.capacityRebalance;
        }

        public Builder capacityRebalance(@Nullable Output<FleetSpotOptionsMaintenanceStrategiesCapacityRebalanceArgs> capacityRebalance) {
            this.capacityRebalance = capacityRebalance;
            return this;
        }
        public Builder capacityRebalance(@Nullable FleetSpotOptionsMaintenanceStrategiesCapacityRebalanceArgs capacityRebalance) {
            this.capacityRebalance = Output.ofNullable(capacityRebalance);
            return this;
        }        public FleetSpotOptionsMaintenanceStrategiesArgs build() {
            return new FleetSpotOptionsMaintenanceStrategiesArgs(capacityRebalance);
        }
    }
}