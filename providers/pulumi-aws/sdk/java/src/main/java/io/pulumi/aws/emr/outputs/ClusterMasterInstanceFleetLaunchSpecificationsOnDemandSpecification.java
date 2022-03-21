// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.emr.outputs;

import io.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class ClusterMasterInstanceFleetLaunchSpecificationsOnDemandSpecification {
    /**
     * Specifies the strategy to use in launching Spot instance fleets. Currently, the only option is `capacity-optimized` (the default), which launches instances from Spot instance pools with optimal capacity for the number of instances that are launching.
     * 
     */
    private final String allocationStrategy;

    @CustomType.Constructor
    private ClusterMasterInstanceFleetLaunchSpecificationsOnDemandSpecification(@CustomType.Parameter("allocationStrategy") String allocationStrategy) {
        this.allocationStrategy = allocationStrategy;
    }

    /**
     * Specifies the strategy to use in launching Spot instance fleets. Currently, the only option is `capacity-optimized` (the default), which launches instances from Spot instance pools with optimal capacity for the number of instances that are launching.
     * 
    */
    public String getAllocationStrategy() {
        return this.allocationStrategy;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ClusterMasterInstanceFleetLaunchSpecificationsOnDemandSpecification defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String allocationStrategy;

        public Builder() {
    	      // Empty
        }

        public Builder(ClusterMasterInstanceFleetLaunchSpecificationsOnDemandSpecification defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.allocationStrategy = defaults.allocationStrategy;
        }

        public Builder allocationStrategy(String allocationStrategy) {
            this.allocationStrategy = Objects.requireNonNull(allocationStrategy);
            return this;
        }        public ClusterMasterInstanceFleetLaunchSpecificationsOnDemandSpecification build() {
            return new ClusterMasterInstanceFleetLaunchSpecificationsOnDemandSpecification(allocationStrategy);
        }
    }
}
