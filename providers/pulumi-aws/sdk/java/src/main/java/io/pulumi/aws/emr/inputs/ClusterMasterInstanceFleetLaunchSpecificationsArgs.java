// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.emr.inputs;

import io.pulumi.aws.emr.inputs.ClusterMasterInstanceFleetLaunchSpecificationsOnDemandSpecificationArgs;
import io.pulumi.aws.emr.inputs.ClusterMasterInstanceFleetLaunchSpecificationsSpotSpecificationArgs;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


public final class ClusterMasterInstanceFleetLaunchSpecificationsArgs extends io.pulumi.resources.ResourceArgs {

    public static final ClusterMasterInstanceFleetLaunchSpecificationsArgs Empty = new ClusterMasterInstanceFleetLaunchSpecificationsArgs();

    /**
     * Configuration block for on demand instances launch specifications.
     * 
     */
    @Import(name="onDemandSpecifications")
      private final @Nullable Output<List<ClusterMasterInstanceFleetLaunchSpecificationsOnDemandSpecificationArgs>> onDemandSpecifications;

    public Output<List<ClusterMasterInstanceFleetLaunchSpecificationsOnDemandSpecificationArgs>> getOnDemandSpecifications() {
        return this.onDemandSpecifications == null ? Codegen.empty() : this.onDemandSpecifications;
    }

    /**
     * Configuration block for spot instances launch specifications.
     * 
     */
    @Import(name="spotSpecifications")
      private final @Nullable Output<List<ClusterMasterInstanceFleetLaunchSpecificationsSpotSpecificationArgs>> spotSpecifications;

    public Output<List<ClusterMasterInstanceFleetLaunchSpecificationsSpotSpecificationArgs>> getSpotSpecifications() {
        return this.spotSpecifications == null ? Codegen.empty() : this.spotSpecifications;
    }

    public ClusterMasterInstanceFleetLaunchSpecificationsArgs(
        @Nullable Output<List<ClusterMasterInstanceFleetLaunchSpecificationsOnDemandSpecificationArgs>> onDemandSpecifications,
        @Nullable Output<List<ClusterMasterInstanceFleetLaunchSpecificationsSpotSpecificationArgs>> spotSpecifications) {
        this.onDemandSpecifications = onDemandSpecifications;
        this.spotSpecifications = spotSpecifications;
    }

    private ClusterMasterInstanceFleetLaunchSpecificationsArgs() {
        this.onDemandSpecifications = Codegen.empty();
        this.spotSpecifications = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ClusterMasterInstanceFleetLaunchSpecificationsArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<List<ClusterMasterInstanceFleetLaunchSpecificationsOnDemandSpecificationArgs>> onDemandSpecifications;
        private @Nullable Output<List<ClusterMasterInstanceFleetLaunchSpecificationsSpotSpecificationArgs>> spotSpecifications;

        public Builder() {
    	      // Empty
        }

        public Builder(ClusterMasterInstanceFleetLaunchSpecificationsArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.onDemandSpecifications = defaults.onDemandSpecifications;
    	      this.spotSpecifications = defaults.spotSpecifications;
        }

        public Builder onDemandSpecifications(@Nullable Output<List<ClusterMasterInstanceFleetLaunchSpecificationsOnDemandSpecificationArgs>> onDemandSpecifications) {
            this.onDemandSpecifications = onDemandSpecifications;
            return this;
        }
        public Builder onDemandSpecifications(@Nullable List<ClusterMasterInstanceFleetLaunchSpecificationsOnDemandSpecificationArgs> onDemandSpecifications) {
            this.onDemandSpecifications = Codegen.ofNullable(onDemandSpecifications);
            return this;
        }
        public Builder onDemandSpecifications(ClusterMasterInstanceFleetLaunchSpecificationsOnDemandSpecificationArgs... onDemandSpecifications) {
            return onDemandSpecifications(List.of(onDemandSpecifications));
        }
        public Builder spotSpecifications(@Nullable Output<List<ClusterMasterInstanceFleetLaunchSpecificationsSpotSpecificationArgs>> spotSpecifications) {
            this.spotSpecifications = spotSpecifications;
            return this;
        }
        public Builder spotSpecifications(@Nullable List<ClusterMasterInstanceFleetLaunchSpecificationsSpotSpecificationArgs> spotSpecifications) {
            this.spotSpecifications = Codegen.ofNullable(spotSpecifications);
            return this;
        }
        public Builder spotSpecifications(ClusterMasterInstanceFleetLaunchSpecificationsSpotSpecificationArgs... spotSpecifications) {
            return spotSpecifications(List.of(spotSpecifications));
        }        public ClusterMasterInstanceFleetLaunchSpecificationsArgs build() {
            return new ClusterMasterInstanceFleetLaunchSpecificationsArgs(onDemandSpecifications, spotSpecifications);
        }
    }
}
