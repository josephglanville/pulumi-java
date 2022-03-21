// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.emr.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class InstanceFleetLaunchSpecificationsSpotSpecificationGetArgs extends io.pulumi.resources.ResourceArgs {

    public static final InstanceFleetLaunchSpecificationsSpotSpecificationGetArgs Empty = new InstanceFleetLaunchSpecificationsSpotSpecificationGetArgs();

    /**
     * Specifies the strategy to use in launching Spot instance fleets. Currently, the only option is `capacity-optimized` (the default), which launches instances from Spot instance pools with optimal capacity for the number of instances that are launching.
     * 
     */
    @Import(name="allocationStrategy", required=true)
      private final Output<String> allocationStrategy;

    public Output<String> getAllocationStrategy() {
        return this.allocationStrategy;
    }

    /**
     * The defined duration for Spot instances (also known as Spot blocks) in minutes. When specified, the Spot instance does not terminate before the defined duration expires, and defined duration pricing for Spot instances applies. Valid values are 60, 120, 180, 240, 300, or 360. The duration period starts as soon as a Spot instance receives its instance ID. At the end of the duration, Amazon EC2 marks the Spot instance for termination and provides a Spot instance termination notice, which gives the instance a two-minute warning before it terminates.
     * 
     */
    @Import(name="blockDurationMinutes")
      private final @Nullable Output<Integer> blockDurationMinutes;

    public Output<Integer> getBlockDurationMinutes() {
        return this.blockDurationMinutes == null ? Output.empty() : this.blockDurationMinutes;
    }

    /**
     * The action to take when TargetSpotCapacity has not been fulfilled when the TimeoutDurationMinutes has expired; that is, when all Spot instances could not be provisioned within the Spot provisioning timeout. Valid values are `TERMINATE_CLUSTER` and `SWITCH_TO_ON_DEMAND`. SWITCH_TO_ON_DEMAND specifies that if no Spot instances are available, On-Demand Instances should be provisioned to fulfill any remaining Spot capacity.
     * 
     */
    @Import(name="timeoutAction", required=true)
      private final Output<String> timeoutAction;

    public Output<String> getTimeoutAction() {
        return this.timeoutAction;
    }

    /**
     * The spot provisioning timeout period in minutes. If Spot instances are not provisioned within this time period, the TimeOutAction is taken. Minimum value is 5 and maximum value is 1440. The timeout applies only during initial provisioning, when the cluster is first created.
     * 
     */
    @Import(name="timeoutDurationMinutes", required=true)
      private final Output<Integer> timeoutDurationMinutes;

    public Output<Integer> getTimeoutDurationMinutes() {
        return this.timeoutDurationMinutes;
    }

    public InstanceFleetLaunchSpecificationsSpotSpecificationGetArgs(
        Output<String> allocationStrategy,
        @Nullable Output<Integer> blockDurationMinutes,
        Output<String> timeoutAction,
        Output<Integer> timeoutDurationMinutes) {
        this.allocationStrategy = Objects.requireNonNull(allocationStrategy, "expected parameter 'allocationStrategy' to be non-null");
        this.blockDurationMinutes = blockDurationMinutes;
        this.timeoutAction = Objects.requireNonNull(timeoutAction, "expected parameter 'timeoutAction' to be non-null");
        this.timeoutDurationMinutes = Objects.requireNonNull(timeoutDurationMinutes, "expected parameter 'timeoutDurationMinutes' to be non-null");
    }

    private InstanceFleetLaunchSpecificationsSpotSpecificationGetArgs() {
        this.allocationStrategy = Output.empty();
        this.blockDurationMinutes = Output.empty();
        this.timeoutAction = Output.empty();
        this.timeoutDurationMinutes = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(InstanceFleetLaunchSpecificationsSpotSpecificationGetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Output<String> allocationStrategy;
        private @Nullable Output<Integer> blockDurationMinutes;
        private Output<String> timeoutAction;
        private Output<Integer> timeoutDurationMinutes;

        public Builder() {
    	      // Empty
        }

        public Builder(InstanceFleetLaunchSpecificationsSpotSpecificationGetArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.allocationStrategy = defaults.allocationStrategy;
    	      this.blockDurationMinutes = defaults.blockDurationMinutes;
    	      this.timeoutAction = defaults.timeoutAction;
    	      this.timeoutDurationMinutes = defaults.timeoutDurationMinutes;
        }

        public Builder allocationStrategy(Output<String> allocationStrategy) {
            this.allocationStrategy = Objects.requireNonNull(allocationStrategy);
            return this;
        }
        public Builder allocationStrategy(String allocationStrategy) {
            this.allocationStrategy = Output.of(Objects.requireNonNull(allocationStrategy));
            return this;
        }
        public Builder blockDurationMinutes(@Nullable Output<Integer> blockDurationMinutes) {
            this.blockDurationMinutes = blockDurationMinutes;
            return this;
        }
        public Builder blockDurationMinutes(@Nullable Integer blockDurationMinutes) {
            this.blockDurationMinutes = Output.ofNullable(blockDurationMinutes);
            return this;
        }
        public Builder timeoutAction(Output<String> timeoutAction) {
            this.timeoutAction = Objects.requireNonNull(timeoutAction);
            return this;
        }
        public Builder timeoutAction(String timeoutAction) {
            this.timeoutAction = Output.of(Objects.requireNonNull(timeoutAction));
            return this;
        }
        public Builder timeoutDurationMinutes(Output<Integer> timeoutDurationMinutes) {
            this.timeoutDurationMinutes = Objects.requireNonNull(timeoutDurationMinutes);
            return this;
        }
        public Builder timeoutDurationMinutes(Integer timeoutDurationMinutes) {
            this.timeoutDurationMinutes = Output.of(Objects.requireNonNull(timeoutDurationMinutes));
            return this;
        }        public InstanceFleetLaunchSpecificationsSpotSpecificationGetArgs build() {
            return new InstanceFleetLaunchSpecificationsSpotSpecificationGetArgs(allocationStrategy, blockDurationMinutes, timeoutAction, timeoutDurationMinutes);
        }
    }
}
