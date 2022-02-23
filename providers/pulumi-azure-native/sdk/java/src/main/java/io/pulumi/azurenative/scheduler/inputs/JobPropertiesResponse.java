// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.scheduler.inputs;

import io.pulumi.azurenative.scheduler.inputs.JobActionResponse;
import io.pulumi.azurenative.scheduler.inputs.JobRecurrenceResponse;
import io.pulumi.azurenative.scheduler.inputs.JobStatusResponse;
import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class JobPropertiesResponse extends io.pulumi.resources.InvokeArgs {

    public static final JobPropertiesResponse Empty = new JobPropertiesResponse();

    /**
     * Gets or sets the job action.
     * 
     */
    @InputImport(name="action")
      private final @Nullable JobActionResponse action;

    public Optional<JobActionResponse> getAction() {
        return this.action == null ? Optional.empty() : Optional.ofNullable(this.action);
    }

    /**
     * Gets or sets the job recurrence.
     * 
     */
    @InputImport(name="recurrence")
      private final @Nullable JobRecurrenceResponse recurrence;

    public Optional<JobRecurrenceResponse> getRecurrence() {
        return this.recurrence == null ? Optional.empty() : Optional.ofNullable(this.recurrence);
    }

    /**
     * Gets or sets the job start time.
     * 
     */
    @InputImport(name="startTime")
      private final @Nullable String startTime;

    public Optional<String> getStartTime() {
        return this.startTime == null ? Optional.empty() : Optional.ofNullable(this.startTime);
    }

    /**
     * Gets or set the job state.
     * 
     */
    @InputImport(name="state")
      private final @Nullable String state;

    public Optional<String> getState() {
        return this.state == null ? Optional.empty() : Optional.ofNullable(this.state);
    }

    /**
     * Gets the job status.
     * 
     */
    @InputImport(name="status", required=true)
      private final JobStatusResponse status;

    public JobStatusResponse getStatus() {
        return this.status;
    }

    public JobPropertiesResponse(
        @Nullable JobActionResponse action,
        @Nullable JobRecurrenceResponse recurrence,
        @Nullable String startTime,
        @Nullable String state,
        JobStatusResponse status) {
        this.action = action;
        this.recurrence = recurrence;
        this.startTime = startTime;
        this.state = state;
        this.status = Objects.requireNonNull(status, "expected parameter 'status' to be non-null");
    }

    private JobPropertiesResponse() {
        this.action = null;
        this.recurrence = null;
        this.startTime = null;
        this.state = null;
        this.status = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(JobPropertiesResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable JobActionResponse action;
        private @Nullable JobRecurrenceResponse recurrence;
        private @Nullable String startTime;
        private @Nullable String state;
        private JobStatusResponse status;

        public Builder() {
    	      // Empty
        }

        public Builder(JobPropertiesResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.action = defaults.action;
    	      this.recurrence = defaults.recurrence;
    	      this.startTime = defaults.startTime;
    	      this.state = defaults.state;
    	      this.status = defaults.status;
        }

        public Builder setAction(@Nullable JobActionResponse action) {
            this.action = action;
            return this;
        }

        public Builder setRecurrence(@Nullable JobRecurrenceResponse recurrence) {
            this.recurrence = recurrence;
            return this;
        }

        public Builder setStartTime(@Nullable String startTime) {
            this.startTime = startTime;
            return this;
        }

        public Builder setState(@Nullable String state) {
            this.state = state;
            return this;
        }

        public Builder setStatus(JobStatusResponse status) {
            this.status = Objects.requireNonNull(status);
            return this;
        }
        public JobPropertiesResponse build() {
            return new JobPropertiesResponse(action, recurrence, startTime, state, status);
        }
    }
}
