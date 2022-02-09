// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.devtestlab.outputs;

import io.pulumi.core.internal.annotations.OutputCustomType;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class ArtifactDeploymentStatusPropertiesResponse {
    private final @Nullable Integer artifactsApplied;
    private final @Nullable String deploymentStatus;
    private final @Nullable Integer totalArtifacts;

    @OutputCustomType.Constructor({"artifactsApplied","deploymentStatus","totalArtifacts"})
    private ArtifactDeploymentStatusPropertiesResponse(
        @Nullable Integer artifactsApplied,
        @Nullable String deploymentStatus,
        @Nullable Integer totalArtifacts) {
        this.artifactsApplied = artifactsApplied;
        this.deploymentStatus = deploymentStatus;
        this.totalArtifacts = totalArtifacts;
    }

    public Optional<Integer> getArtifactsApplied() {
        return Optional.ofNullable(this.artifactsApplied);
    }
    public Optional<String> getDeploymentStatus() {
        return Optional.ofNullable(this.deploymentStatus);
    }
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

        public Builder setArtifactsApplied(@Nullable Integer artifactsApplied) {
            this.artifactsApplied = artifactsApplied;
            return this;
        }

        public Builder setDeploymentStatus(@Nullable String deploymentStatus) {
            this.deploymentStatus = deploymentStatus;
            return this;
        }

        public Builder setTotalArtifacts(@Nullable Integer totalArtifacts) {
            this.totalArtifacts = totalArtifacts;
            return this;
        }

        public ArtifactDeploymentStatusPropertiesResponse build() {
            return new ArtifactDeploymentStatusPropertiesResponse(artifactsApplied, deploymentStatus, totalArtifacts);
        }
    }
}
