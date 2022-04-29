// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.oci.DevOps.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.Object;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class DeploymentDeploymentExecutionProgress {
    /**
     * @return Map of stage OCIDs to deploy stage execution progress model.
     * 
     */
    private final @Nullable Map<String,Object> deployStageExecutionProgress;
    /**
     * @return Time the deployment is finished. Format defined by [RFC3339](https://datatracker.ietf.org/doc/html/rfc3339).
     * 
     */
    private final @Nullable String timeFinished;
    /**
     * @return Time the deployment is started. Format defined by [RFC3339](https://datatracker.ietf.org/doc/html/rfc3339).
     * 
     */
    private final @Nullable String timeStarted;

    @CustomType.Constructor
    private DeploymentDeploymentExecutionProgress(
        @CustomType.Parameter("deployStageExecutionProgress") @Nullable Map<String,Object> deployStageExecutionProgress,
        @CustomType.Parameter("timeFinished") @Nullable String timeFinished,
        @CustomType.Parameter("timeStarted") @Nullable String timeStarted) {
        this.deployStageExecutionProgress = deployStageExecutionProgress;
        this.timeFinished = timeFinished;
        this.timeStarted = timeStarted;
    }

    /**
     * @return Map of stage OCIDs to deploy stage execution progress model.
     * 
     */
    public Map<String,Object> deployStageExecutionProgress() {
        return this.deployStageExecutionProgress == null ? Map.of() : this.deployStageExecutionProgress;
    }
    /**
     * @return Time the deployment is finished. Format defined by [RFC3339](https://datatracker.ietf.org/doc/html/rfc3339).
     * 
     */
    public Optional<String> timeFinished() {
        return Optional.ofNullable(this.timeFinished);
    }
    /**
     * @return Time the deployment is started. Format defined by [RFC3339](https://datatracker.ietf.org/doc/html/rfc3339).
     * 
     */
    public Optional<String> timeStarted() {
        return Optional.ofNullable(this.timeStarted);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(DeploymentDeploymentExecutionProgress defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Map<String,Object> deployStageExecutionProgress;
        private @Nullable String timeFinished;
        private @Nullable String timeStarted;

        public Builder() {
    	      // Empty
        }

        public Builder(DeploymentDeploymentExecutionProgress defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.deployStageExecutionProgress = defaults.deployStageExecutionProgress;
    	      this.timeFinished = defaults.timeFinished;
    	      this.timeStarted = defaults.timeStarted;
        }

        public Builder deployStageExecutionProgress(@Nullable Map<String,Object> deployStageExecutionProgress) {
            this.deployStageExecutionProgress = deployStageExecutionProgress;
            return this;
        }
        public Builder timeFinished(@Nullable String timeFinished) {
            this.timeFinished = timeFinished;
            return this;
        }
        public Builder timeStarted(@Nullable String timeStarted) {
            this.timeStarted = timeStarted;
            return this;
        }        public DeploymentDeploymentExecutionProgress build() {
            return new DeploymentDeploymentExecutionProgress(deployStageExecutionProgress, timeFinished, timeStarted);
        }
    }
}
