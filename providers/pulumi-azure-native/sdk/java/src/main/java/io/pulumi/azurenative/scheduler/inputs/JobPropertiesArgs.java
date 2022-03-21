// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.scheduler.inputs;

import io.pulumi.azurenative.scheduler.enums.JobState;
import io.pulumi.azurenative.scheduler.inputs.JobActionArgs;
import io.pulumi.azurenative.scheduler.inputs.JobRecurrenceArgs;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class JobPropertiesArgs extends io.pulumi.resources.ResourceArgs {

    public static final JobPropertiesArgs Empty = new JobPropertiesArgs();

    /**
     * Gets or sets the job action.
     * 
     */
    @Import(name="action")
      private final @Nullable Output<JobActionArgs> action;

    public Output<JobActionArgs> getAction() {
        return this.action == null ? Output.empty() : this.action;
    }

    /**
     * Gets or sets the job recurrence.
     * 
     */
    @Import(name="recurrence")
      private final @Nullable Output<JobRecurrenceArgs> recurrence;

    public Output<JobRecurrenceArgs> getRecurrence() {
        return this.recurrence == null ? Output.empty() : this.recurrence;
    }

    /**
     * Gets or sets the job start time.
     * 
     */
    @Import(name="startTime")
      private final @Nullable Output<String> startTime;

    public Output<String> getStartTime() {
        return this.startTime == null ? Output.empty() : this.startTime;
    }

    /**
     * Gets or set the job state.
     * 
     */
    @Import(name="state")
      private final @Nullable Output<JobState> state;

    public Output<JobState> getState() {
        return this.state == null ? Output.empty() : this.state;
    }

    public JobPropertiesArgs(
        @Nullable Output<JobActionArgs> action,
        @Nullable Output<JobRecurrenceArgs> recurrence,
        @Nullable Output<String> startTime,
        @Nullable Output<JobState> state) {
        this.action = action;
        this.recurrence = recurrence;
        this.startTime = startTime;
        this.state = state;
    }

    private JobPropertiesArgs() {
        this.action = Output.empty();
        this.recurrence = Output.empty();
        this.startTime = Output.empty();
        this.state = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(JobPropertiesArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<JobActionArgs> action;
        private @Nullable Output<JobRecurrenceArgs> recurrence;
        private @Nullable Output<String> startTime;
        private @Nullable Output<JobState> state;

        public Builder() {
    	      // Empty
        }

        public Builder(JobPropertiesArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.action = defaults.action;
    	      this.recurrence = defaults.recurrence;
    	      this.startTime = defaults.startTime;
    	      this.state = defaults.state;
        }

        public Builder action(@Nullable Output<JobActionArgs> action) {
            this.action = action;
            return this;
        }
        public Builder action(@Nullable JobActionArgs action) {
            this.action = Output.ofNullable(action);
            return this;
        }
        public Builder recurrence(@Nullable Output<JobRecurrenceArgs> recurrence) {
            this.recurrence = recurrence;
            return this;
        }
        public Builder recurrence(@Nullable JobRecurrenceArgs recurrence) {
            this.recurrence = Output.ofNullable(recurrence);
            return this;
        }
        public Builder startTime(@Nullable Output<String> startTime) {
            this.startTime = startTime;
            return this;
        }
        public Builder startTime(@Nullable String startTime) {
            this.startTime = Output.ofNullable(startTime);
            return this;
        }
        public Builder state(@Nullable Output<JobState> state) {
            this.state = state;
            return this;
        }
        public Builder state(@Nullable JobState state) {
            this.state = Output.ofNullable(state);
            return this;
        }        public JobPropertiesArgs build() {
            return new JobPropertiesArgs(action, recurrence, startTime, state);
        }
    }
}
