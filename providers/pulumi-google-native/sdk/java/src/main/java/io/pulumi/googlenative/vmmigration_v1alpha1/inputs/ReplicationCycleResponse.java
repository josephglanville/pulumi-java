// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.vmmigration_v1alpha1.inputs;

import io.pulumi.core.annotations.Import;
import io.pulumi.googlenative.vmmigration_v1alpha1.inputs.CycleStepResponse;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Objects;


/**
 * ReplicationCycle contains information about the current replication cycle status.
 * 
 */
public final class ReplicationCycleResponse extends io.pulumi.resources.InvokeArgs {

    public static final ReplicationCycleResponse Empty = new ReplicationCycleResponse();

    /**
     * The time the replication cycle has ended.
     * 
     */
    @Import(name="endTime", required=true)
      private final String endTime;

    public String getEndTime() {
        return this.endTime;
    }

    /**
     * The current progress in percentage of this cycle.
     * 
     */
    @Import(name="progress", required=true)
      private final Integer progress;

    public Integer getProgress() {
        return this.progress;
    }

    /**
     * The current progress in percentage of this cycle.
     * 
     */
    @Import(name="progressPercent", required=true)
      private final Integer progressPercent;

    public Integer getProgressPercent() {
        return this.progressPercent;
    }

    /**
     * The time the replication cycle has started.
     * 
     */
    @Import(name="startTime", required=true)
      private final String startTime;

    public String getStartTime() {
        return this.startTime;
    }

    /**
     * The cycle's steps list reflecting its progress.
     * 
     */
    @Import(name="steps", required=true)
      private final List<CycleStepResponse> steps;

    public List<CycleStepResponse> getSteps() {
        return this.steps;
    }

    /**
     * The accumulated duration the replication cycle was paused.
     * 
     */
    @Import(name="totalPauseDuration", required=true)
      private final String totalPauseDuration;

    public String getTotalPauseDuration() {
        return this.totalPauseDuration;
    }

    public ReplicationCycleResponse(
        String endTime,
        Integer progress,
        Integer progressPercent,
        String startTime,
        List<CycleStepResponse> steps,
        String totalPauseDuration) {
        this.endTime = Objects.requireNonNull(endTime, "expected parameter 'endTime' to be non-null");
        this.progress = Objects.requireNonNull(progress, "expected parameter 'progress' to be non-null");
        this.progressPercent = Objects.requireNonNull(progressPercent, "expected parameter 'progressPercent' to be non-null");
        this.startTime = Objects.requireNonNull(startTime, "expected parameter 'startTime' to be non-null");
        this.steps = Objects.requireNonNull(steps, "expected parameter 'steps' to be non-null");
        this.totalPauseDuration = Objects.requireNonNull(totalPauseDuration, "expected parameter 'totalPauseDuration' to be non-null");
    }

    private ReplicationCycleResponse() {
        this.endTime = null;
        this.progress = null;
        this.progressPercent = null;
        this.startTime = null;
        this.steps = List.of();
        this.totalPauseDuration = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ReplicationCycleResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String endTime;
        private Integer progress;
        private Integer progressPercent;
        private String startTime;
        private List<CycleStepResponse> steps;
        private String totalPauseDuration;

        public Builder() {
    	      // Empty
        }

        public Builder(ReplicationCycleResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.endTime = defaults.endTime;
    	      this.progress = defaults.progress;
    	      this.progressPercent = defaults.progressPercent;
    	      this.startTime = defaults.startTime;
    	      this.steps = defaults.steps;
    	      this.totalPauseDuration = defaults.totalPauseDuration;
        }

        public Builder endTime(String endTime) {
            this.endTime = Objects.requireNonNull(endTime);
            return this;
        }
        public Builder progress(Integer progress) {
            this.progress = Objects.requireNonNull(progress);
            return this;
        }
        public Builder progressPercent(Integer progressPercent) {
            this.progressPercent = Objects.requireNonNull(progressPercent);
            return this;
        }
        public Builder startTime(String startTime) {
            this.startTime = Objects.requireNonNull(startTime);
            return this;
        }
        public Builder steps(List<CycleStepResponse> steps) {
            this.steps = Objects.requireNonNull(steps);
            return this;
        }
        public Builder steps(CycleStepResponse... steps) {
            return steps(List.of(steps));
        }
        public Builder totalPauseDuration(String totalPauseDuration) {
            this.totalPauseDuration = Objects.requireNonNull(totalPauseDuration);
            return this;
        }        public ReplicationCycleResponse build() {
            return new ReplicationCycleResponse(endTime, progress, progressPercent, startTime, steps, totalPauseDuration);
        }
    }
}
