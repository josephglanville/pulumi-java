// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.redshift.inputs;

import io.pulumi.aws.redshift.inputs.ScheduledActionTargetActionPauseClusterArgs;
import io.pulumi.aws.redshift.inputs.ScheduledActionTargetActionResizeClusterArgs;
import io.pulumi.aws.redshift.inputs.ScheduledActionTargetActionResumeClusterArgs;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.InputImport;
import java.util.Objects;
import javax.annotation.Nullable;


public final class ScheduledActionTargetActionArgs extends io.pulumi.resources.ResourceArgs {

    public static final ScheduledActionTargetActionArgs Empty = new ScheduledActionTargetActionArgs();

    /**
     * An action that runs a `PauseCluster` API operation. Documented below.
     * 
     */
    @InputImport(name="pauseCluster")
      private final @Nullable Output<ScheduledActionTargetActionPauseClusterArgs> pauseCluster;

    public Output<ScheduledActionTargetActionPauseClusterArgs> getPauseCluster() {
        return this.pauseCluster == null ? Output.empty() : this.pauseCluster;
    }

    /**
     * An action that runs a `ResizeCluster` API operation. Documented below.
     * 
     */
    @InputImport(name="resizeCluster")
      private final @Nullable Output<ScheduledActionTargetActionResizeClusterArgs> resizeCluster;

    public Output<ScheduledActionTargetActionResizeClusterArgs> getResizeCluster() {
        return this.resizeCluster == null ? Output.empty() : this.resizeCluster;
    }

    /**
     * An action that runs a `ResumeCluster` API operation. Documented below.
     * 
     */
    @InputImport(name="resumeCluster")
      private final @Nullable Output<ScheduledActionTargetActionResumeClusterArgs> resumeCluster;

    public Output<ScheduledActionTargetActionResumeClusterArgs> getResumeCluster() {
        return this.resumeCluster == null ? Output.empty() : this.resumeCluster;
    }

    public ScheduledActionTargetActionArgs(
        @Nullable Output<ScheduledActionTargetActionPauseClusterArgs> pauseCluster,
        @Nullable Output<ScheduledActionTargetActionResizeClusterArgs> resizeCluster,
        @Nullable Output<ScheduledActionTargetActionResumeClusterArgs> resumeCluster) {
        this.pauseCluster = pauseCluster;
        this.resizeCluster = resizeCluster;
        this.resumeCluster = resumeCluster;
    }

    private ScheduledActionTargetActionArgs() {
        this.pauseCluster = Output.empty();
        this.resizeCluster = Output.empty();
        this.resumeCluster = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ScheduledActionTargetActionArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<ScheduledActionTargetActionPauseClusterArgs> pauseCluster;
        private @Nullable Output<ScheduledActionTargetActionResizeClusterArgs> resizeCluster;
        private @Nullable Output<ScheduledActionTargetActionResumeClusterArgs> resumeCluster;

        public Builder() {
    	      // Empty
        }

        public Builder(ScheduledActionTargetActionArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.pauseCluster = defaults.pauseCluster;
    	      this.resizeCluster = defaults.resizeCluster;
    	      this.resumeCluster = defaults.resumeCluster;
        }

        public Builder pauseCluster(@Nullable Output<ScheduledActionTargetActionPauseClusterArgs> pauseCluster) {
            this.pauseCluster = pauseCluster;
            return this;
        }

        public Builder pauseCluster(@Nullable ScheduledActionTargetActionPauseClusterArgs pauseCluster) {
            this.pauseCluster = Output.ofNullable(pauseCluster);
            return this;
        }

        public Builder resizeCluster(@Nullable Output<ScheduledActionTargetActionResizeClusterArgs> resizeCluster) {
            this.resizeCluster = resizeCluster;
            return this;
        }

        public Builder resizeCluster(@Nullable ScheduledActionTargetActionResizeClusterArgs resizeCluster) {
            this.resizeCluster = Output.ofNullable(resizeCluster);
            return this;
        }

        public Builder resumeCluster(@Nullable Output<ScheduledActionTargetActionResumeClusterArgs> resumeCluster) {
            this.resumeCluster = resumeCluster;
            return this;
        }

        public Builder resumeCluster(@Nullable ScheduledActionTargetActionResumeClusterArgs resumeCluster) {
            this.resumeCluster = Output.ofNullable(resumeCluster);
            return this;
        }
        public ScheduledActionTargetActionArgs build() {
            return new ScheduledActionTargetActionArgs(pauseCluster, resizeCluster, resumeCluster);
        }
    }
}
