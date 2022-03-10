// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.emr.outputs;

import io.pulumi.aws.emr.outputs.InstanceFleetLaunchSpecificationsOnDemandSpecification;
import io.pulumi.aws.emr.outputs.InstanceFleetLaunchSpecificationsSpotSpecification;
import io.pulumi.core.annotations.OutputCustomType;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;

@OutputCustomType
public final class InstanceFleetLaunchSpecifications {
    /**
     * Configuration block for on demand instances launch specifications
     * 
     */
    private final @Nullable List<InstanceFleetLaunchSpecificationsOnDemandSpecification> onDemandSpecifications;
    /**
     * Configuration block for spot instances launch specifications
     * 
     */
    private final @Nullable List<InstanceFleetLaunchSpecificationsSpotSpecification> spotSpecifications;

    @OutputCustomType.Constructor
    private InstanceFleetLaunchSpecifications(
        @OutputCustomType.Parameter("onDemandSpecifications") @Nullable List<InstanceFleetLaunchSpecificationsOnDemandSpecification> onDemandSpecifications,
        @OutputCustomType.Parameter("spotSpecifications") @Nullable List<InstanceFleetLaunchSpecificationsSpotSpecification> spotSpecifications) {
        this.onDemandSpecifications = onDemandSpecifications;
        this.spotSpecifications = spotSpecifications;
    }

    /**
     * Configuration block for on demand instances launch specifications
     * 
    */
    public List<InstanceFleetLaunchSpecificationsOnDemandSpecification> getOnDemandSpecifications() {
        return this.onDemandSpecifications == null ? List.of() : this.onDemandSpecifications;
    }
    /**
     * Configuration block for spot instances launch specifications
     * 
    */
    public List<InstanceFleetLaunchSpecificationsSpotSpecification> getSpotSpecifications() {
        return this.spotSpecifications == null ? List.of() : this.spotSpecifications;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(InstanceFleetLaunchSpecifications defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable List<InstanceFleetLaunchSpecificationsOnDemandSpecification> onDemandSpecifications;
        private @Nullable List<InstanceFleetLaunchSpecificationsSpotSpecification> spotSpecifications;

        public Builder() {
    	      // Empty
        }

        public Builder(InstanceFleetLaunchSpecifications defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.onDemandSpecifications = defaults.onDemandSpecifications;
    	      this.spotSpecifications = defaults.spotSpecifications;
        }

        public Builder setOnDemandSpecifications(@Nullable List<InstanceFleetLaunchSpecificationsOnDemandSpecification> onDemandSpecifications) {
            this.onDemandSpecifications = onDemandSpecifications;
            return this;
        }

        public Builder setSpotSpecifications(@Nullable List<InstanceFleetLaunchSpecificationsSpotSpecification> spotSpecifications) {
            this.spotSpecifications = spotSpecifications;
            return this;
        }
        public InstanceFleetLaunchSpecifications build() {
            return new InstanceFleetLaunchSpecifications(onDemandSpecifications, spotSpecifications);
        }
    }
}
