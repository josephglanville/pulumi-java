// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.ec2.inputs;

import io.pulumi.awsnative.ec2.enums.SpotFleetRequestConfigDataAllocationStrategy;
import io.pulumi.awsnative.ec2.enums.SpotFleetRequestConfigDataExcessCapacityTerminationPolicy;
import io.pulumi.awsnative.ec2.enums.SpotFleetRequestConfigDataInstanceInterruptionBehavior;
import io.pulumi.awsnative.ec2.enums.SpotFleetRequestConfigDataTargetCapacityUnitType;
import io.pulumi.awsnative.ec2.enums.SpotFleetRequestConfigDataType;
import io.pulumi.awsnative.ec2.inputs.SpotFleetLaunchSpecification;
import io.pulumi.awsnative.ec2.inputs.SpotFleetLaunchTemplateConfig;
import io.pulumi.awsnative.ec2.inputs.SpotFleetLoadBalancersConfig;
import io.pulumi.awsnative.ec2.inputs.SpotFleetSpotMaintenanceStrategies;
import io.pulumi.core.annotations.InputImport;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class SpotFleetRequestConfigData extends io.pulumi.resources.InvokeArgs {

    public static final SpotFleetRequestConfigData Empty = new SpotFleetRequestConfigData();

    @InputImport(name="allocationStrategy")
      private final @Nullable SpotFleetRequestConfigDataAllocationStrategy allocationStrategy;

    public Optional<SpotFleetRequestConfigDataAllocationStrategy> getAllocationStrategy() {
        return this.allocationStrategy == null ? Optional.empty() : Optional.ofNullable(this.allocationStrategy);
    }

    @InputImport(name="context")
      private final @Nullable String context;

    public Optional<String> getContext() {
        return this.context == null ? Optional.empty() : Optional.ofNullable(this.context);
    }

    @InputImport(name="excessCapacityTerminationPolicy")
      private final @Nullable SpotFleetRequestConfigDataExcessCapacityTerminationPolicy excessCapacityTerminationPolicy;

    public Optional<SpotFleetRequestConfigDataExcessCapacityTerminationPolicy> getExcessCapacityTerminationPolicy() {
        return this.excessCapacityTerminationPolicy == null ? Optional.empty() : Optional.ofNullable(this.excessCapacityTerminationPolicy);
    }

    @InputImport(name="iamFleetRole", required=true)
      private final String iamFleetRole;

    public String getIamFleetRole() {
        return this.iamFleetRole;
    }

    @InputImport(name="instanceInterruptionBehavior")
      private final @Nullable SpotFleetRequestConfigDataInstanceInterruptionBehavior instanceInterruptionBehavior;

    public Optional<SpotFleetRequestConfigDataInstanceInterruptionBehavior> getInstanceInterruptionBehavior() {
        return this.instanceInterruptionBehavior == null ? Optional.empty() : Optional.ofNullable(this.instanceInterruptionBehavior);
    }

    @InputImport(name="instancePoolsToUseCount")
      private final @Nullable Integer instancePoolsToUseCount;

    public Optional<Integer> getInstancePoolsToUseCount() {
        return this.instancePoolsToUseCount == null ? Optional.empty() : Optional.ofNullable(this.instancePoolsToUseCount);
    }

    @InputImport(name="launchSpecifications")
      private final @Nullable List<SpotFleetLaunchSpecification> launchSpecifications;

    public List<SpotFleetLaunchSpecification> getLaunchSpecifications() {
        return this.launchSpecifications == null ? List.of() : this.launchSpecifications;
    }

    @InputImport(name="launchTemplateConfigs")
      private final @Nullable List<SpotFleetLaunchTemplateConfig> launchTemplateConfigs;

    public List<SpotFleetLaunchTemplateConfig> getLaunchTemplateConfigs() {
        return this.launchTemplateConfigs == null ? List.of() : this.launchTemplateConfigs;
    }

    @InputImport(name="loadBalancersConfig")
      private final @Nullable SpotFleetLoadBalancersConfig loadBalancersConfig;

    public Optional<SpotFleetLoadBalancersConfig> getLoadBalancersConfig() {
        return this.loadBalancersConfig == null ? Optional.empty() : Optional.ofNullable(this.loadBalancersConfig);
    }

    @InputImport(name="onDemandAllocationStrategy")
      private final @Nullable String onDemandAllocationStrategy;

    public Optional<String> getOnDemandAllocationStrategy() {
        return this.onDemandAllocationStrategy == null ? Optional.empty() : Optional.ofNullable(this.onDemandAllocationStrategy);
    }

    @InputImport(name="onDemandMaxTotalPrice")
      private final @Nullable String onDemandMaxTotalPrice;

    public Optional<String> getOnDemandMaxTotalPrice() {
        return this.onDemandMaxTotalPrice == null ? Optional.empty() : Optional.ofNullable(this.onDemandMaxTotalPrice);
    }

    @InputImport(name="onDemandTargetCapacity")
      private final @Nullable Integer onDemandTargetCapacity;

    public Optional<Integer> getOnDemandTargetCapacity() {
        return this.onDemandTargetCapacity == null ? Optional.empty() : Optional.ofNullable(this.onDemandTargetCapacity);
    }

    @InputImport(name="replaceUnhealthyInstances")
      private final @Nullable Boolean replaceUnhealthyInstances;

    public Optional<Boolean> getReplaceUnhealthyInstances() {
        return this.replaceUnhealthyInstances == null ? Optional.empty() : Optional.ofNullable(this.replaceUnhealthyInstances);
    }

    @InputImport(name="spotMaintenanceStrategies")
      private final @Nullable SpotFleetSpotMaintenanceStrategies spotMaintenanceStrategies;

    public Optional<SpotFleetSpotMaintenanceStrategies> getSpotMaintenanceStrategies() {
        return this.spotMaintenanceStrategies == null ? Optional.empty() : Optional.ofNullable(this.spotMaintenanceStrategies);
    }

    @InputImport(name="spotMaxTotalPrice")
      private final @Nullable String spotMaxTotalPrice;

    public Optional<String> getSpotMaxTotalPrice() {
        return this.spotMaxTotalPrice == null ? Optional.empty() : Optional.ofNullable(this.spotMaxTotalPrice);
    }

    @InputImport(name="spotPrice")
      private final @Nullable String spotPrice;

    public Optional<String> getSpotPrice() {
        return this.spotPrice == null ? Optional.empty() : Optional.ofNullable(this.spotPrice);
    }

    @InputImport(name="targetCapacity", required=true)
      private final Integer targetCapacity;

    public Integer getTargetCapacity() {
        return this.targetCapacity;
    }

    @InputImport(name="targetCapacityUnitType")
      private final @Nullable SpotFleetRequestConfigDataTargetCapacityUnitType targetCapacityUnitType;

    public Optional<SpotFleetRequestConfigDataTargetCapacityUnitType> getTargetCapacityUnitType() {
        return this.targetCapacityUnitType == null ? Optional.empty() : Optional.ofNullable(this.targetCapacityUnitType);
    }

    @InputImport(name="terminateInstancesWithExpiration")
      private final @Nullable Boolean terminateInstancesWithExpiration;

    public Optional<Boolean> getTerminateInstancesWithExpiration() {
        return this.terminateInstancesWithExpiration == null ? Optional.empty() : Optional.ofNullable(this.terminateInstancesWithExpiration);
    }

    @InputImport(name="type")
      private final @Nullable SpotFleetRequestConfigDataType type;

    public Optional<SpotFleetRequestConfigDataType> getType() {
        return this.type == null ? Optional.empty() : Optional.ofNullable(this.type);
    }

    @InputImport(name="validFrom")
      private final @Nullable String validFrom;

    public Optional<String> getValidFrom() {
        return this.validFrom == null ? Optional.empty() : Optional.ofNullable(this.validFrom);
    }

    @InputImport(name="validUntil")
      private final @Nullable String validUntil;

    public Optional<String> getValidUntil() {
        return this.validUntil == null ? Optional.empty() : Optional.ofNullable(this.validUntil);
    }

    public SpotFleetRequestConfigData(
        @Nullable SpotFleetRequestConfigDataAllocationStrategy allocationStrategy,
        @Nullable String context,
        @Nullable SpotFleetRequestConfigDataExcessCapacityTerminationPolicy excessCapacityTerminationPolicy,
        String iamFleetRole,
        @Nullable SpotFleetRequestConfigDataInstanceInterruptionBehavior instanceInterruptionBehavior,
        @Nullable Integer instancePoolsToUseCount,
        @Nullable List<SpotFleetLaunchSpecification> launchSpecifications,
        @Nullable List<SpotFleetLaunchTemplateConfig> launchTemplateConfigs,
        @Nullable SpotFleetLoadBalancersConfig loadBalancersConfig,
        @Nullable String onDemandAllocationStrategy,
        @Nullable String onDemandMaxTotalPrice,
        @Nullable Integer onDemandTargetCapacity,
        @Nullable Boolean replaceUnhealthyInstances,
        @Nullable SpotFleetSpotMaintenanceStrategies spotMaintenanceStrategies,
        @Nullable String spotMaxTotalPrice,
        @Nullable String spotPrice,
        Integer targetCapacity,
        @Nullable SpotFleetRequestConfigDataTargetCapacityUnitType targetCapacityUnitType,
        @Nullable Boolean terminateInstancesWithExpiration,
        @Nullable SpotFleetRequestConfigDataType type,
        @Nullable String validFrom,
        @Nullable String validUntil) {
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

    private SpotFleetRequestConfigData() {
        this.allocationStrategy = null;
        this.context = null;
        this.excessCapacityTerminationPolicy = null;
        this.iamFleetRole = null;
        this.instanceInterruptionBehavior = null;
        this.instancePoolsToUseCount = null;
        this.launchSpecifications = List.of();
        this.launchTemplateConfigs = List.of();
        this.loadBalancersConfig = null;
        this.onDemandAllocationStrategy = null;
        this.onDemandMaxTotalPrice = null;
        this.onDemandTargetCapacity = null;
        this.replaceUnhealthyInstances = null;
        this.spotMaintenanceStrategies = null;
        this.spotMaxTotalPrice = null;
        this.spotPrice = null;
        this.targetCapacity = null;
        this.targetCapacityUnitType = null;
        this.terminateInstancesWithExpiration = null;
        this.type = null;
        this.validFrom = null;
        this.validUntil = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(SpotFleetRequestConfigData defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable SpotFleetRequestConfigDataAllocationStrategy allocationStrategy;
        private @Nullable String context;
        private @Nullable SpotFleetRequestConfigDataExcessCapacityTerminationPolicy excessCapacityTerminationPolicy;
        private String iamFleetRole;
        private @Nullable SpotFleetRequestConfigDataInstanceInterruptionBehavior instanceInterruptionBehavior;
        private @Nullable Integer instancePoolsToUseCount;
        private @Nullable List<SpotFleetLaunchSpecification> launchSpecifications;
        private @Nullable List<SpotFleetLaunchTemplateConfig> launchTemplateConfigs;
        private @Nullable SpotFleetLoadBalancersConfig loadBalancersConfig;
        private @Nullable String onDemandAllocationStrategy;
        private @Nullable String onDemandMaxTotalPrice;
        private @Nullable Integer onDemandTargetCapacity;
        private @Nullable Boolean replaceUnhealthyInstances;
        private @Nullable SpotFleetSpotMaintenanceStrategies spotMaintenanceStrategies;
        private @Nullable String spotMaxTotalPrice;
        private @Nullable String spotPrice;
        private Integer targetCapacity;
        private @Nullable SpotFleetRequestConfigDataTargetCapacityUnitType targetCapacityUnitType;
        private @Nullable Boolean terminateInstancesWithExpiration;
        private @Nullable SpotFleetRequestConfigDataType type;
        private @Nullable String validFrom;
        private @Nullable String validUntil;

        public Builder() {
    	      // Empty
        }

        public Builder(SpotFleetRequestConfigData defaults) {
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

        public Builder setAllocationStrategy(@Nullable SpotFleetRequestConfigDataAllocationStrategy allocationStrategy) {
            this.allocationStrategy = allocationStrategy;
            return this;
        }

        public Builder setContext(@Nullable String context) {
            this.context = context;
            return this;
        }

        public Builder setExcessCapacityTerminationPolicy(@Nullable SpotFleetRequestConfigDataExcessCapacityTerminationPolicy excessCapacityTerminationPolicy) {
            this.excessCapacityTerminationPolicy = excessCapacityTerminationPolicy;
            return this;
        }

        public Builder setIamFleetRole(String iamFleetRole) {
            this.iamFleetRole = Objects.requireNonNull(iamFleetRole);
            return this;
        }

        public Builder setInstanceInterruptionBehavior(@Nullable SpotFleetRequestConfigDataInstanceInterruptionBehavior instanceInterruptionBehavior) {
            this.instanceInterruptionBehavior = instanceInterruptionBehavior;
            return this;
        }

        public Builder setInstancePoolsToUseCount(@Nullable Integer instancePoolsToUseCount) {
            this.instancePoolsToUseCount = instancePoolsToUseCount;
            return this;
        }

        public Builder setLaunchSpecifications(@Nullable List<SpotFleetLaunchSpecification> launchSpecifications) {
            this.launchSpecifications = launchSpecifications;
            return this;
        }

        public Builder setLaunchTemplateConfigs(@Nullable List<SpotFleetLaunchTemplateConfig> launchTemplateConfigs) {
            this.launchTemplateConfigs = launchTemplateConfigs;
            return this;
        }

        public Builder setLoadBalancersConfig(@Nullable SpotFleetLoadBalancersConfig loadBalancersConfig) {
            this.loadBalancersConfig = loadBalancersConfig;
            return this;
        }

        public Builder setOnDemandAllocationStrategy(@Nullable String onDemandAllocationStrategy) {
            this.onDemandAllocationStrategy = onDemandAllocationStrategy;
            return this;
        }

        public Builder setOnDemandMaxTotalPrice(@Nullable String onDemandMaxTotalPrice) {
            this.onDemandMaxTotalPrice = onDemandMaxTotalPrice;
            return this;
        }

        public Builder setOnDemandTargetCapacity(@Nullable Integer onDemandTargetCapacity) {
            this.onDemandTargetCapacity = onDemandTargetCapacity;
            return this;
        }

        public Builder setReplaceUnhealthyInstances(@Nullable Boolean replaceUnhealthyInstances) {
            this.replaceUnhealthyInstances = replaceUnhealthyInstances;
            return this;
        }

        public Builder setSpotMaintenanceStrategies(@Nullable SpotFleetSpotMaintenanceStrategies spotMaintenanceStrategies) {
            this.spotMaintenanceStrategies = spotMaintenanceStrategies;
            return this;
        }

        public Builder setSpotMaxTotalPrice(@Nullable String spotMaxTotalPrice) {
            this.spotMaxTotalPrice = spotMaxTotalPrice;
            return this;
        }

        public Builder setSpotPrice(@Nullable String spotPrice) {
            this.spotPrice = spotPrice;
            return this;
        }

        public Builder setTargetCapacity(Integer targetCapacity) {
            this.targetCapacity = Objects.requireNonNull(targetCapacity);
            return this;
        }

        public Builder setTargetCapacityUnitType(@Nullable SpotFleetRequestConfigDataTargetCapacityUnitType targetCapacityUnitType) {
            this.targetCapacityUnitType = targetCapacityUnitType;
            return this;
        }

        public Builder setTerminateInstancesWithExpiration(@Nullable Boolean terminateInstancesWithExpiration) {
            this.terminateInstancesWithExpiration = terminateInstancesWithExpiration;
            return this;
        }

        public Builder setType(@Nullable SpotFleetRequestConfigDataType type) {
            this.type = type;
            return this;
        }

        public Builder setValidFrom(@Nullable String validFrom) {
            this.validFrom = validFrom;
            return this;
        }

        public Builder setValidUntil(@Nullable String validUntil) {
            this.validUntil = validUntil;
            return this;
        }
        public SpotFleetRequestConfigData build() {
            return new SpotFleetRequestConfigData(allocationStrategy, context, excessCapacityTerminationPolicy, iamFleetRole, instanceInterruptionBehavior, instancePoolsToUseCount, launchSpecifications, launchTemplateConfigs, loadBalancersConfig, onDemandAllocationStrategy, onDemandMaxTotalPrice, onDemandTargetCapacity, replaceUnhealthyInstances, spotMaintenanceStrategies, spotMaxTotalPrice, spotPrice, targetCapacity, targetCapacityUnitType, terminateInstancesWithExpiration, type, validFrom, validUntil);
        }
    }
}
