// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.emr.outputs;

import io.pulumi.aws.emr.outputs.ClusterMasterInstanceFleetInstanceTypeConfig;
import io.pulumi.aws.emr.outputs.ClusterMasterInstanceFleetLaunchSpecifications;
import io.pulumi.core.annotations.CustomType;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class ClusterMasterInstanceFleet {
    /**
     * ID of the cluster.
     * 
     */
    private final @Nullable String id;
    /**
     * Configuration block for instance fleet.
     * 
     */
    private final @Nullable List<ClusterMasterInstanceFleetInstanceTypeConfig> instanceTypeConfigs;
    /**
     * Configuration block for launch specification.
     * 
     */
    private final @Nullable ClusterMasterInstanceFleetLaunchSpecifications launchSpecifications;
    /**
     * Name of the step.
     * 
     */
    private final @Nullable String name;
    private final @Nullable Integer provisionedOnDemandCapacity;
    private final @Nullable Integer provisionedSpotCapacity;
    /**
     * Target capacity of On-Demand units for the instance fleet, which determines how many On-Demand instances to provision.
     * 
     */
    private final @Nullable Integer targetOnDemandCapacity;
    /**
     * Target capacity of Spot units for the instance fleet, which determines how many Spot instances to provision.
     * 
     */
    private final @Nullable Integer targetSpotCapacity;

    @CustomType.Constructor
    private ClusterMasterInstanceFleet(
        @CustomType.Parameter("id") @Nullable String id,
        @CustomType.Parameter("instanceTypeConfigs") @Nullable List<ClusterMasterInstanceFleetInstanceTypeConfig> instanceTypeConfigs,
        @CustomType.Parameter("launchSpecifications") @Nullable ClusterMasterInstanceFleetLaunchSpecifications launchSpecifications,
        @CustomType.Parameter("name") @Nullable String name,
        @CustomType.Parameter("provisionedOnDemandCapacity") @Nullable Integer provisionedOnDemandCapacity,
        @CustomType.Parameter("provisionedSpotCapacity") @Nullable Integer provisionedSpotCapacity,
        @CustomType.Parameter("targetOnDemandCapacity") @Nullable Integer targetOnDemandCapacity,
        @CustomType.Parameter("targetSpotCapacity") @Nullable Integer targetSpotCapacity) {
        this.id = id;
        this.instanceTypeConfigs = instanceTypeConfigs;
        this.launchSpecifications = launchSpecifications;
        this.name = name;
        this.provisionedOnDemandCapacity = provisionedOnDemandCapacity;
        this.provisionedSpotCapacity = provisionedSpotCapacity;
        this.targetOnDemandCapacity = targetOnDemandCapacity;
        this.targetSpotCapacity = targetSpotCapacity;
    }

    /**
     * ID of the cluster.
     * 
    */
    public Optional<String> getId() {
        return Optional.ofNullable(this.id);
    }
    /**
     * Configuration block for instance fleet.
     * 
    */
    public List<ClusterMasterInstanceFleetInstanceTypeConfig> getInstanceTypeConfigs() {
        return this.instanceTypeConfigs == null ? List.of() : this.instanceTypeConfigs;
    }
    /**
     * Configuration block for launch specification.
     * 
    */
    public Optional<ClusterMasterInstanceFleetLaunchSpecifications> getLaunchSpecifications() {
        return Optional.ofNullable(this.launchSpecifications);
    }
    /**
     * Name of the step.
     * 
    */
    public Optional<String> getName() {
        return Optional.ofNullable(this.name);
    }
    public Optional<Integer> getProvisionedOnDemandCapacity() {
        return Optional.ofNullable(this.provisionedOnDemandCapacity);
    }
    public Optional<Integer> getProvisionedSpotCapacity() {
        return Optional.ofNullable(this.provisionedSpotCapacity);
    }
    /**
     * Target capacity of On-Demand units for the instance fleet, which determines how many On-Demand instances to provision.
     * 
    */
    public Optional<Integer> getTargetOnDemandCapacity() {
        return Optional.ofNullable(this.targetOnDemandCapacity);
    }
    /**
     * Target capacity of Spot units for the instance fleet, which determines how many Spot instances to provision.
     * 
    */
    public Optional<Integer> getTargetSpotCapacity() {
        return Optional.ofNullable(this.targetSpotCapacity);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ClusterMasterInstanceFleet defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String id;
        private @Nullable List<ClusterMasterInstanceFleetInstanceTypeConfig> instanceTypeConfigs;
        private @Nullable ClusterMasterInstanceFleetLaunchSpecifications launchSpecifications;
        private @Nullable String name;
        private @Nullable Integer provisionedOnDemandCapacity;
        private @Nullable Integer provisionedSpotCapacity;
        private @Nullable Integer targetOnDemandCapacity;
        private @Nullable Integer targetSpotCapacity;

        public Builder() {
    	      // Empty
        }

        public Builder(ClusterMasterInstanceFleet defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.id = defaults.id;
    	      this.instanceTypeConfigs = defaults.instanceTypeConfigs;
    	      this.launchSpecifications = defaults.launchSpecifications;
    	      this.name = defaults.name;
    	      this.provisionedOnDemandCapacity = defaults.provisionedOnDemandCapacity;
    	      this.provisionedSpotCapacity = defaults.provisionedSpotCapacity;
    	      this.targetOnDemandCapacity = defaults.targetOnDemandCapacity;
    	      this.targetSpotCapacity = defaults.targetSpotCapacity;
        }

        public Builder id(@Nullable String id) {
            this.id = id;
            return this;
        }
        public Builder instanceTypeConfigs(@Nullable List<ClusterMasterInstanceFleetInstanceTypeConfig> instanceTypeConfigs) {
            this.instanceTypeConfigs = instanceTypeConfigs;
            return this;
        }
        public Builder instanceTypeConfigs(ClusterMasterInstanceFleetInstanceTypeConfig... instanceTypeConfigs) {
            return instanceTypeConfigs(List.of(instanceTypeConfigs));
        }
        public Builder launchSpecifications(@Nullable ClusterMasterInstanceFleetLaunchSpecifications launchSpecifications) {
            this.launchSpecifications = launchSpecifications;
            return this;
        }
        public Builder name(@Nullable String name) {
            this.name = name;
            return this;
        }
        public Builder provisionedOnDemandCapacity(@Nullable Integer provisionedOnDemandCapacity) {
            this.provisionedOnDemandCapacity = provisionedOnDemandCapacity;
            return this;
        }
        public Builder provisionedSpotCapacity(@Nullable Integer provisionedSpotCapacity) {
            this.provisionedSpotCapacity = provisionedSpotCapacity;
            return this;
        }
        public Builder targetOnDemandCapacity(@Nullable Integer targetOnDemandCapacity) {
            this.targetOnDemandCapacity = targetOnDemandCapacity;
            return this;
        }
        public Builder targetSpotCapacity(@Nullable Integer targetSpotCapacity) {
            this.targetSpotCapacity = targetSpotCapacity;
            return this;
        }        public ClusterMasterInstanceFleet build() {
            return new ClusterMasterInstanceFleet(id, instanceTypeConfigs, launchSpecifications, name, provisionedOnDemandCapacity, provisionedSpotCapacity, targetOnDemandCapacity, targetSpotCapacity);
        }
    }
}