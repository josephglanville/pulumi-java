// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.devtestlab.outputs;

import io.pulumi.core.annotations.CustomType;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class ArtifactDeploymentStatusPropertiesResponse {
    /**
     * The total count of the artifacts that were successfully applied.
     * 
     */
    private final @Nullable Integer artifactsApplied;
    /**
     * The deployment status of the artifact.
     * 
     */
    private final @Nullable String deploymentStatus;
    /**
     * The total count of the artifacts that were tentatively applied.
     * 
     */
    private final @Nullable Integer totalArtifacts;

    @CustomType.Constructor
    private ArtifactDeploymentStatusPropertiesResponse(
        @CustomType.Parameter("artifactsApplied") @Nullable Integer artifactsApplied,
        @CustomType.Parameter("deploymentStatus") @Nullable String deploymentStatus,
        @CustomType.Parameter("totalArtifacts") @Nullable Integer totalArtifacts) {
        this.artifactsApplied = artifactsApplied;
        this.deploymentStatus = deploymentStatus;
        this.totalArtifacts = totalArtifacts;
    }

    /**
     * The total count of the artifacts that were successfully applied.
     * 
    */
    public Optional<Integer> getArtifactsApplied() {
        return Optional.ofNullable(this.artifactsApplied);
    }
    /**
     * The deployment status of the artifact.
     * 
    */
    public Optional<String> getDeploymentStatus() {
        return Optional.ofNullable(this.deploymentStatus);
    }
    /**
     * The total count of the artifacts that were tentatively applied.
     * 
    */
    public Optional<Integer> getTotalArtifacts() {
        return Optional.ofNullable(this.totalArtifacts);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ArtifactDeploymentStatusPropertiesResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Integer artifactsApplied;
        private @Nullable String deploymentStatus;
        private @Nullable Integer totalArtifacts;

        public Builder() {
    	      // Empty
        }

        public Builder(ArtifactDeploymentStatusPropertiesResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.artifactsApplied = defaults.artifactsApplied;
    	      this.deploymentStatus = defaults.deploymentStatus;
    	      this.totalArtifacts = defaults.totalArtifacts;
        }

        public Builder artifactsApplied(@Nullable Integer artifactsApplied) {
            this.artifactsApplied = artifactsApplied;
            return this;
        }
        public Builder deploymentStatus(@Nullable String deploymentStatus) {
            this.deploymentStatus = deploymentStatus;
            return this;
        }
        public Builder totalArtifacts(@Nullable Integer totalArtifacts) {
            this.totalArtifacts = totalArtifacts;
            return this;
        }        public ArtifactDeploymentStatusPropertiesResponse build() {
            return new ArtifactDeploymentStatusPropertiesResponse(artifactsApplied, deploymentStatus, totalArtifacts);
        }
    }
}
