// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.redshift.inputs;

import io.pulumi.awsnative.redshift.inputs.ScheduledActionPauseClusterMessage;
import io.pulumi.awsnative.redshift.inputs.ScheduledActionResizeClusterMessage;
import io.pulumi.awsnative.redshift.inputs.ScheduledActionResumeClusterMessage;
import io.pulumi.core.annotations.Import;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class ScheduledActionType extends io.pulumi.resources.InvokeArgs {

    public static final ScheduledActionType Empty = new ScheduledActionType();

    @Import(name="pauseCluster")
      private final @Nullable ScheduledActionPauseClusterMessage pauseCluster;

    public Optional<ScheduledActionPauseClusterMessage> getPauseCluster() {
        return this.pauseCluster == null ? Optional.empty() : Optional.ofNullable(this.pauseCluster);
    }

    @Import(name="resizeCluster")
      private final @Nullable ScheduledActionResizeClusterMessage resizeCluster;

    public Optional<ScheduledActionResizeClusterMessage> getResizeCluster() {
        return this.resizeCluster == null ? Optional.empty() : Optional.ofNullable(this.resizeCluster);
    }

    @Import(name="resumeCluster")
      private final @Nullable ScheduledActionResumeClusterMessage resumeCluster;

    public Optional<ScheduledActionResumeClusterMessage> getResumeCluster() {
        return this.resumeCluster == null ? Optional.empty() : Optional.ofNullable(this.resumeCluster);
    }

    public ScheduledActionType(
        @Nullable ScheduledActionPauseClusterMessage pauseCluster,
        @Nullable ScheduledActionResizeClusterMessage resizeCluster,
        @Nullable ScheduledActionResumeClusterMessage resumeCluster) {
        this.pauseCluster = pauseCluster;
        this.resizeCluster = resizeCluster;
        this.resumeCluster = resumeCluster;
    }

    private ScheduledActionType() {
        this.pauseCluster = null;
        this.resizeCluster = null;
        this.resumeCluster = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ScheduledActionType defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable ScheduledActionPauseClusterMessage pauseCluster;
        private @Nullable ScheduledActionResizeClusterMessage resizeCluster;
        private @Nullable ScheduledActionResumeClusterMessage resumeCluster;

        public Builder() {
    	      // Empty
        }

        public Builder(ScheduledActionType defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.pauseCluster = defaults.pauseCluster;
    	      this.resizeCluster = defaults.resizeCluster;
    	      this.resumeCluster = defaults.resumeCluster;
        }

        public Builder pauseCluster(@Nullable ScheduledActionPauseClusterMessage pauseCluster) {
            this.pauseCluster = pauseCluster;
            return this;
        }
        public Builder resizeCluster(@Nullable ScheduledActionResizeClusterMessage resizeCluster) {
            this.resizeCluster = resizeCluster;
            return this;
        }
        public Builder resumeCluster(@Nullable ScheduledActionResumeClusterMessage resumeCluster) {
            this.resumeCluster = resumeCluster;
            return this;
        }        public ScheduledActionType build() {
            return new ScheduledActionType(pauseCluster, resizeCluster, resumeCluster);
        }
    }
}
