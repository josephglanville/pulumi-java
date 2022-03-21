// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.ec2.inputs;

import io.pulumi.awsnative.ec2.enums.SpotFleetRequestConfigDataAllocationStrategy;
import io.pulumi.awsnative.ec2.enums.SpotFleetRequestConfigDataExcessCapacityTerminationPolicy;
import io.pulumi.awsnative.ec2.enums.SpotFleetRequestConfigDataInstanceInterruptionBehavior;
import io.pulumi.awsnative.ec2.enums.SpotFleetRequestConfigDataTargetCapacityUnitType;
import io.pulumi.awsnative.ec2.enums.SpotFleetRequestConfigDataType;
import io.pulumi.awsnative.ec2.inputs.SpotFleetLaunchSpecificationArgs;
import io.pulumi.awsnative.ec2.inputs.SpotFleetLaunchTemplateConfigArgs;
import io.pulumi.awsnative.ec2.inputs.SpotFleetLoadBalancersConfigArgs;
import io.pulumi.awsnative.ec2.inputs.SpotFleetSpotMaintenanceStrategiesArgs;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


public final class SpotFleetRequestConfigDataArgs extends io.pulumi.resources.ResourceArgs {

    public static final SpotFleetRequestConfigDataArgs Empty = new SpotFleetRequestConfigDataArgs();

    @Import(name="allocationStrategy")
      private final @Nullable Output<SpotFleetRequestConfigDataAllocationStrategy> allocationStrategy;

    public Output<SpotFleetRequestConfigDataAllocationStrategy> getAllocationStrategy() {
        return this.allocationStrategy == null ? Output.empty() : this.allocationStrategy;
    }

    @Import(name="context")
      private final @Nullable Output<String> context;

    public Output<String> getContext() {
        return this.context == null ? Output.empty() : this.context;
    }

    @Import(name="excessCapacityTerminationPolicy")
      private final @Nullable Output<SpotFleetRequestConfigDataExcessCapacityTerminationPolicy> excessCapacityTerminationPolicy;

    public Output<SpotFleetRequestConfigDataExcessCapacityTerminationPolicy> getExcessCapacityTerminationPolicy() {
        return this.excessCapacityTerminationPolicy == null ? Output.empty() : this.excessCapacityTerminationPolicy;
    }

    @Import(name="iamFleetRole", required=true)
      private final Output<String> iamFleetRole;

    public Output<String> getIamFleetRole() {
        return this.iamFleetRole;
    }

    @Import(name="instanceInterruptionBehavior")
      private final @Nullable Output<SpotFleetRequestConfigDataInstanceInterruptionBehavior> instanceInterruptionBehavior;

    public Output<SpotFleetRequestConfigDataInstanceInterruptionBehavior> getInstanceInterruptionBehavior() {
        return this.instanceInterruptionBehavior == null ? Output.empty() : this.instanceInterruptionBehavior;
    }

    @Import(name="instancePoolsToUseCount")
      private final @Nullable Output<Integer> instancePoolsToUseCount;

    public Output<Integer> getInstancePoolsToUseCount() {
        return this.instancePoolsToUseCount == null ? Output.empty() : this.instancePoolsToUseCount;
    }

    @Import(name="launchSpecifications")
      private final @Nullable Output<List<SpotFleetLaunchSpecificationArgs>> launchSpecifications;

    public Output<List<SpotFleetLaunchSpecificationArgs>> getLaunchSpecifications() {
        return this.launchSpecifications == null ? Output.empty() : this.launchSpecifications;
    }

    @Import(name="launchTemplateConfigs")
      private final @Nullable Output<List<SpotFleetLaunchTemplateConfigArgs>> launchTemplateConfigs;

    public Output<List<SpotFleetLaunchTemplateConfigArgs>> getLaunchTemplateConfigs() {
        return this.launchTemplateConfigs == null ? Output.empty() : this.launchTemplateConfigs;
    }

    @Import(name="loadBalancersConfig")
      private final @Nullable Output<SpotFleetLoadBalancersConfigArgs> loadBalancersConfig;

    public Output<SpotFleetLoadBalancersConfigArgs> getLoadBalancersConfig() {
        return this.loadBalancersConfig == null ? Output.empty() : this.loadBalancersConfig;
    }

    @Import(name="onDemandAllocationStrategy")
      private final @Nullable Output<String> onDemandAllocationStrategy;

    public Output<String> getOnDemandAllocationStrategy() {
        return this.onDemandAllocationStrategy == null ? Output.empty() : this.onDemandAllocationStrategy;
    }

    @Import(name="onDemandMaxTotalPrice")
      private final @Nullable Output<String> onDemandMaxTotalPrice;

    public Output<String> getOnDemandMaxTotalPrice() {
        return this.onDemandMaxTotalPrice == null ? Output.empty() : this.onDemandMaxTotalPrice;
    }

    @Import(name="onDemandTargetCapacity")
      private final @Nullable Output<Integer> onDemandTargetCapacity;

    public Output<Integer> getOnDemandTargetCapacity() {
        return this.onDemandTargetCapacity == null ? Output.empty() : this.onDemandTargetCapacity;
    }

    @Import(name="replaceUnhealthyInstances")
      private final @Nullable Output<Boolean> replaceUnhealthyInstances;

    public Output<Boolean> getReplaceUnhealthyInstances() {
        return this.replaceUnhealthyInstances == null ? Output.empty() : this.replaceUnhealthyInstances;
    }

    @Import(name="spotMaintenanceStrategies")
      private final @Nullable Output<SpotFleetSpotMaintenanceStrategiesArgs> spotMaintenanceStrategies;

    public Output<SpotFleetSpotMaintenanceStrategiesArgs> getSpotMaintenanceStrategies() {
        return this.spotMaintenanceStrategies == null ? Output.empty() : this.spotMaintenanceStrategies;
    }

    @Import(name="spotMaxTotalPrice")
      private final @Nullable Output<String> spotMaxTotalPrice;

    public Output<String> getSpotMaxTotalPrice() {
        return this.spotMaxTotalPrice == null ? Output.empty() : this.spotMaxTotalPrice;
    }

    @Import(name="spotPrice")
      private final @Nullable Output<String> spotPrice;

    public Output<String> getSpotPrice() {
        return this.spotPrice == null ? Output.empty() : this.spotPrice;
    }

    @Import(name="targetCapacity", required=true)
      private final Output<Integer> targetCapacity;

    public Output<Integer> getTargetCapacity() {
        return this.targetCapacity;
    }

    @Import(name="targetCapacityUnitType")
      private final @Nullable Output<SpotFleetRequestConfigDataTargetCapacityUnitType> targetCapacityUnitType;

    public Output<SpotFleetRequestConfigDataTargetCapacityUnitType> getTargetCapacityUnitType() {
        return this.targetCapacityUnitType == null ? Output.empty() : this.targetCapacityUnitType;
    }

    @Import(name="terminateInstancesWithExpiration")
      private final @Nullable Output<Boolean> terminateInstancesWithExpiration;

    public Output<Boolean> getTerminateInstancesWithExpiration() {
        return this.terminateInstancesWithExpiration == null ? Output.empty() : this.terminateInstancesWithExpiration;
    }

    @Import(name="type")
      private final @Nullable Output<SpotFleetRequestConfigDataType> type;

    public Output<SpotFleetRequestConfigDataType> getType() {
        return this.type == null ? Output.empty() : this.type;
    }

    @Import(name="validFrom")
      private final @Nullable Output<String> validFrom;

    public Output<String> getValidFrom() {
        return this.validFrom == null ? Output.empty() : this.validFrom;
    }

    @Import(name="validUntil")
      private final @Nullable Output<String> validUntil;

    public Output<String> getValidUntil() {
        return this.validUntil == null ? Output.empty() : this.validUntil;
    }

    public SpotFleetRequestConfigDataArgs(
        @Nullable Output<SpotFleetRequestConfigDataAllocationStrategy> allocationStrategy,
        @Nullable Output<String> context,
        @Nullable Output<SpotFleetRequestConfigDataExcessCapacityTerminationPolicy> excessCapacityTerminationPolicy,
        Output<String> iamFleetRole,
        @Nullable Output<SpotFleetRequestConfigDataInstanceInterruptionBehavior> instanceInterruptionBehavior,
        @Nullable Output<Integer> instancePoolsToUseCount,
        @Nullable Output<List<SpotFleetLaunchSpecificationArgs>> launchSpecifications,
        @Nullable Output<List<SpotFleetLaunchTemplateConfigArgs>> launchTemplateConfigs,
        @Nullable Output<SpotFleetLoadBalancersConfigArgs> loadBalancersConfig,
        @Nullable Output<String> onDemandAllocationStrategy,
        @Nullable Output<String> onDemandMaxTotalPrice,
        @Nullable Output<Integer> onDemandTargetCapacity,
        @Nullable Output<Boolean> replaceUnhealthyInstances,
        @Nullable Output<SpotFleetSpotMaintenanceStrategiesArgs> spotMaintenanceStrategies,
        @Nullable Output<String> spotMaxTotalPrice,
        @Nullable Output<String> spotPrice,
        Output<Integer> targetCapacity,
        @Nullable Output<SpotFleetRequestConfigDataTargetCapacityUnitType> targetCapacityUnitType,
        @Nullable Output<Boolean> terminateInstancesWithExpiration,
        @Nullable Output<SpotFleetRequestConfigDataType> type,
        @Nullable Output<String> validFrom,
        @Nullable Output<String> validUntil) {
        this.allocationStrategy = allocationStrategy;
        this.context = context;
        this.excessCapacityTerminationPolicy = excessCapacityTerminationPolicy;
        this.iamFleetRole = Objects.requireNonNull(iamFleetRole, "expected parameter 'iamFleetRole' to be non-null");
        this.instanceInterruptionBehavior = instanceInterruptionBehavior;
        this.instancePoolsToUseCount = instancePoolsToUseCount;
        this.launchSpecifications = launchSpecifications;
        this.launchTemplateConfigs = launchTemplateConfigs;
        this.loadBalancersConfig = loadBalancersConfig;
        this.onDemandAllocationStrategy = onDemandAllocationStrategy;
        this.onDemandMaxTotalPrice = onDemandMaxTotalPrice;
        this.onDemandTargetCapacity = onDemandTargetCapacity;
        this.replaceUnhealthyInstances = replaceUnhealthyInstances;
        this.spotMaintenanceStrategies = spotMaintenanceStrategies;
        this.spotMaxTotalPrice = spotMaxTotalPrice;
        this.spotPrice = spotPrice;
        this.targetCapacity = Objects.requireNonNull(targetCapacity, "expected parameter 'targetCapacity' to be non-null");
        this.targetCapacityUnitType = targetCapacityUnitType;
        this.terminateInstancesWithExpiration = terminateInstancesWithExpiration;
        this.type = type;
        this.validFrom = validFrom;
        this.validUntil = validUntil;
    }

    private SpotFleetRequestConfigDataArgs() {
        this.allocationStrategy = Output.empty();
        this.context = Output.empty();
        this.excessCapacityTerminationPolicy = Output.empty();
        this.iamFleetRole = Output.empty();
        this.instanceInterruptionBehavior = Output.empty();
        this.instancePoolsToUseCount = Output.empty();
        this.launchSpecifications = Output.empty();
        this.launchTemplateConfigs = Output.empty();
        this.loadBalancersConfig = Output.empty();
        this.onDemandAllocationStrategy = Output.empty();
        this.onDemandMaxTotalPrice = Output.empty();
        this.onDemandTargetCapacity = Output.empty();
        this.replaceUnhealthyInstances = Output.empty();
        this.spotMaintenanceStrategies = Output.empty();
        this.spotMaxTotalPrice = Output.empty();
        this.spotPrice = Output.empty();
        this.targetCapacity = Output.empty();
        this.targetCapacityUnitType = Output.empty();
        this.terminateInstancesWithExpiration = Output.empty();
        this.type = Output.empty();
        this.validFrom = Output.empty();
        this.validUntil = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(SpotFleetRequestConfigDataArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<SpotFleetRequestConfigDataAllocationStrategy> allocationStrategy;
        private @Nullable Output<String> context;
        private @Nullable Output<SpotFleetRequestConfigDataExcessCapacityTerminationPolicy> excessCapacityTerminationPolicy;
        private Output<String> iamFleetRole;
        private @Nullable Output<SpotFleetRequestConfigDataInstanceInterruptionBehavior> instanceInterruptionBehavior;
        private @Nullable Output<Integer> instancePoolsToUseCount;
        private @Nullable Output<List<SpotFleetLaunchSpecificationArgs>> launchSpecifications;
        private @Nullable Output<List<SpotFleetLaunchTemplateConfigArgs>> launchTemplateConfigs;
        private @Nullable Output<SpotFleetLoadBalancersConfigArgs> loadBalancersConfig;
        private @Nullable Output<String> onDemandAllocationStrategy;
        private @Nullable Output<String> onDemandMaxTotalPrice;
        private @Nullable Output<Integer> onDemandTargetCapacity;
        private @Nullable Output<Boolean> replaceUnhealthyInstances;
        private @Nullable Output<SpotFleetSpotMaintenanceStrategiesArgs> spotMaintenanceStrategies;
        private @Nullable Output<String> spotMaxTotalPrice;
        private @Nullable Output<String> spotPrice;
        private Output<Integer> targetCapacity;
        private @Nullable Output<SpotFleetRequestConfigDataTargetCapacityUnitType> targetCapacityUnitType;
        private @Nullable Output<Boolean> terminateInstancesWithExpiration;
        private @Nullable Output<SpotFleetRequestConfigDataType> type;
        private @Nullable Output<String> validFrom;
        private @Nullable Output<String> validUntil;

        public Builder() {
    	      // Empty
        }

        public Builder(SpotFleetRequestConfigDataArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.allocationStrategy = defaults.allocationStrategy;
    	      this.context = defaults.context;
    	      this.excessCapacityTerminationPolicy = defaults.excessCapacityTerminationPolicy;
    	      this.iamFleetRole = defaults.iamFleetRole;
    	      this.instanceInterruptionBehavior = defaults.instanceInterruptionBehavior;
    	      this.instancePoolsToUseCount = defaults.instancePoolsToUseCount;
    	      this.launchSpecifications = defaults.launchSpecifications;
    	      this.launchTemplateConfigs = defaults.launchTemplateConfigs;
    	      this.loadBalancersConfig = defaults.loadBalancersConfig;
    	      this.onDemandAllocationStrategy = defaults.onDemandAllocationStrategy;
    	      this.onDemandMaxTotalPrice = defaults.onDemandMaxTotalPrice;
    	      this.onDemandTargetCapacity = defaults.onDemandTargetCapacity;
    	      this.replaceUnhealthyInstances = defaults.replaceUnhealthyInstances;
    	      this.spotMaintenanceStrategies = defaults.spotMaintenanceStrategies;
    	      this.spotMaxTotalPrice = defaults.spotMaxTotalPrice;
    	      this.spotPrice = defaults.spotPrice;
    	      this.targetCapacity = defaults.targetCapacity;
    	      this.targetCapacityUnitType = defaults.targetCapacityUnitType;
    	      this.terminateInstancesWithExpiration = defaults.terminateInstancesWithExpiration;
    	      this.type = defaults.type;
    	      this.validFrom = defaults.validFrom;
    	      this.validUntil = defaults.validUntil;
        }

        public Builder allocationStrategy(@Nullable Output<SpotFleetRequestConfigDataAllocationStrategy> allocationStrategy) {
            this.allocationStrategy = allocationStrategy;
            return this;
        }
        public Builder allocationStrategy(@Nullable SpotFleetRequestConfigDataAllocationStrategy allocationStrategy) {
            this.allocationStrategy = Output.ofNullable(allocationStrategy);
            return this;
        }
        public Builder context(@Nullable Output<String> context) {
            this.context = context;
            return this;
        }
        public Builder context(@Nullable String context) {
            this.context = Output.ofNullable(context);
            return this;
        }
        public Builder excessCapacityTerminationPolicy(@Nullable Output<SpotFleetRequestConfigDataExcessCapacityTerminationPolicy> excessCapacityTerminationPolicy) {
            this.excessCapacityTerminationPolicy = excessCapacityTerminationPolicy;
            return this;
        }
        public Builder excessCapacityTerminationPolicy(@Nullable SpotFleetRequestConfigDataExcessCapacityTerminationPolicy excessCapacityTerminationPolicy) {
            this.excessCapacityTerminationPolicy = Output.ofNullable(excessCapacityTerminationPolicy);
            return this;
        }
        public Builder iamFleetRole(Output<String> iamFleetRole) {
            this.iamFleetRole = Objects.requireNonNull(iamFleetRole);
            return this;
        }
        public Builder iamFleetRole(String iamFleetRole) {
            this.iamFleetRole = Output.of(Objects.requireNonNull(iamFleetRole));
            return this;
        }
        public Builder instanceInterruptionBehavior(@Nullable Output<SpotFleetRequestConfigDataInstanceInterruptionBehavior> instanceInterruptionBehavior) {
            this.instanceInterruptionBehavior = instanceInterruptionBehavior;
            return this;
        }
        public Builder instanceInterruptionBehavior(@Nullable SpotFleetRequestConfigDataInstanceInterruptionBehavior instanceInterruptionBehavior) {
            this.instanceInterruptionBehavior = Output.ofNullable(instanceInterruptionBehavior);
            return this;
        }
        public Builder instancePoolsToUseCount(@Nullable Output<Integer> instancePoolsToUseCount) {
            this.instancePoolsToUseCount = instancePoolsToUseCount;
            return this;
        }
        public Builder instancePoolsToUseCount(@Nullable Integer instancePoolsToUseCount) {
            this.instancePoolsToUseCount = Output.ofNullable(instancePoolsToUseCount);
            return this;
        }
        public Builder launchSpecifications(@Nullable Output<List<SpotFleetLaunchSpecificationArgs>> launchSpecifications) {
            this.launchSpecifications = launchSpecifications;
            return this;
        }
        public Builder launchSpecifications(@Nullable List<SpotFleetLaunchSpecificationArgs> launchSpecifications) {
            this.launchSpecifications = Output.ofNullable(launchSpecifications);
            return this;
        }
        public Builder launchSpecifications(SpotFleetLaunchSpecificationArgs... launchSpecifications) {
            return launchSpecifications(List.of(launchSpecifications));
        }
        public Builder launchTemplateConfigs(@Nullable Output<List<SpotFleetLaunchTemplateConfigArgs>> launchTemplateConfigs) {
            this.launchTemplateConfigs = launchTemplateConfigs;
            return this;
        }
        public Builder launchTemplateConfigs(@Nullable List<SpotFleetLaunchTemplateConfigArgs> launchTemplateConfigs) {
            this.launchTemplateConfigs = Output.ofNullable(launchTemplateConfigs);
            return this;
        }
        public Builder launchTemplateConfigs(SpotFleetLaunchTemplateConfigArgs... launchTemplateConfigs) {
            return launchTemplateConfigs(List.of(launchTemplateConfigs));
        }
        public Builder loadBalancersConfig(@Nullable Output<SpotFleetLoadBalancersConfigArgs> loadBalancersConfig) {
            this.loadBalancersConfig = loadBalancersConfig;
            return this;
        }
        public Builder loadBalancersConfig(@Nullable SpotFleetLoadBalancersConfigArgs loadBalancersConfig) {
            this.loadBalancersConfig = Output.ofNullable(loadBalancersConfig);
            return this;
        }
        public Builder onDemandAllocationStrategy(@Nullable Output<String> onDemandAllocationStrategy) {
            this.onDemandAllocationStrategy = onDemandAllocationStrategy;
            return this;
        }
        public Builder onDemandAllocationStrategy(@Nullable String onDemandAllocationStrategy) {
            this.onDemandAllocationStrategy = Output.ofNullable(onDemandAllocationStrategy);
            return this;
        }
        public Builder onDemandMaxTotalPrice(@Nullable Output<String> onDemandMaxTotalPrice) {
            this.onDemandMaxTotalPrice = onDemandMaxTotalPrice;
            return this;
        }
        public Builder onDemandMaxTotalPrice(@Nullable String onDemandMaxTotalPrice) {
            this.onDemandMaxTotalPrice = Output.ofNullable(onDemandMaxTotalPrice);
            return this;
        }
        public Builder onDemandTargetCapacity(@Nullable Output<Integer> onDemandTargetCapacity) {
            this.onDemandTargetCapacity = onDemandTargetCapacity;
            return this;
        }
        public Builder onDemandTargetCapacity(@Nullable Integer onDemandTargetCapacity) {
            this.onDemandTargetCapacity = Output.ofNullable(onDemandTargetCapacity);
            return this;
        }
        public Builder replaceUnhealthyInstances(@Nullable Output<Boolean> replaceUnhealthyInstances) {
            this.replaceUnhealthyInstances = replaceUnhealthyInstances;
            return this;
        }
        public Builder replaceUnhealthyInstances(@Nullable Boolean replaceUnhealthyInstances) {
            this.replaceUnhealthyInstances = Output.ofNullable(replaceUnhealthyInstances);
            return this;
        }
        public Builder spotMaintenanceStrategies(@Nullable Output<SpotFleetSpotMaintenanceStrategiesArgs> spotMaintenanceStrategies) {
            this.spotMaintenanceStrategies = spotMaintenanceStrategies;
            return this;
        }
        public Builder spotMaintenanceStrategies(@Nullable SpotFleetSpotMaintenanceStrategiesArgs spotMaintenanceStrategies) {
            this.spotMaintenanceStrategies = Output.ofNullable(spotMaintenanceStrategies);
            return this;
        }
        public Builder spotMaxTotalPrice(@Nullable Output<String> spotMaxTotalPrice) {
            this.spotMaxTotalPrice = spotMaxTotalPrice;
            return this;
        }
        public Builder spotMaxTotalPrice(@Nullable String spotMaxTotalPrice) {
            this.spotMaxTotalPrice = Output.ofNullable(spotMaxTotalPrice);
            return this;
        }
        public Builder spotPrice(@Nullable Output<String> spotPrice) {
            this.spotPrice = spotPrice;
            return this;
        }
        public Builder spotPrice(@Nullable String spotPrice) {
            this.spotPrice = Output.ofNullable(spotPrice);
            return this;
        }
        public Builder targetCapacity(Output<Integer> targetCapacity) {
            this.targetCapacity = Objects.requireNonNull(targetCapacity);
            return this;
        }
        public Builder targetCapacity(Integer targetCapacity) {
            this.targetCapacity = Output.of(Objects.requireNonNull(targetCapacity));
            return this;
        }
        public Builder targetCapacityUnitType(@Nullable Output<SpotFleetRequestConfigDataTargetCapacityUnitType> targetCapacityUnitType) {
            this.targetCapacityUnitType = targetCapacityUnitType;
            return this;
        }
        public Builder targetCapacityUnitType(@Nullable SpotFleetRequestConfigDataTargetCapacityUnitType targetCapacityUnitType) {
            this.targetCapacityUnitType = Output.ofNullable(targetCapacityUnitType);
            return this;
        }
        public Builder terminateInstancesWithExpiration(@Nullable Output<Boolean> terminateInstancesWithExpiration) {
            this.terminateInstancesWithExpiration = terminateInstancesWithExpiration;
            return this;
        }
        public Builder terminateInstancesWithExpiration(@Nullable Boolean terminateInstancesWithExpiration) {
            this.terminateInstancesWithExpiration = Output.ofNullable(terminateInstancesWithExpiration);
            return this;
        }
        public Builder type(@Nullable Output<SpotFleetRequestConfigDataType> type) {
            this.type = type;
            return this;
        }
        public Builder type(@Nullable SpotFleetRequestConfigDataType type) {
            this.type = Output.ofNullable(type);
            return this;
        }
        public Builder validFrom(@Nullable Output<String> validFrom) {
            this.validFrom = validFrom;
            return this;
        }
        public Builder validFrom(@Nullable String validFrom) {
            this.validFrom = Output.ofNullable(validFrom);
            return this;
        }
        public Builder validUntil(@Nullable Output<String> validUntil) {
            this.validUntil = validUntil;
            return this;
        }
        public Builder validUntil(@Nullable String validUntil) {
            this.validUntil = Output.ofNullable(validUntil);
            return this;
        }        public SpotFleetRequestConfigDataArgs build() {
            return new SpotFleetRequestConfigDataArgs(allocationStrategy, context, excessCapacityTerminationPolicy, iamFleetRole, instanceInterruptionBehavior, instancePoolsToUseCount, launchSpecifications, launchTemplateConfigs, loadBalancersConfig, onDemandAllocationStrategy, onDemandMaxTotalPrice, onDemandTargetCapacity, replaceUnhealthyInstances, spotMaintenanceStrategies, spotMaxTotalPrice, spotPrice, targetCapacity, targetCapacityUnitType, terminateInstancesWithExpiration, type, validFrom, validUntil);
        }
    }
}
