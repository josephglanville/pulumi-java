// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.labservices;

import io.pulumi.azurenative.labservices.inputs.RecurrencePatternArgs;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class ScheduleArgs extends io.pulumi.resources.ResourceArgs {

    public static final ScheduleArgs Empty = new ScheduleArgs();

    /**
     * The name of the lab that uniquely identifies it within containing lab account. Used in resource URIs.
     * 
     */
    @Import(name="labName", required=true)
      private final Output<String> labName;

    public Output<String> getLabName() {
        return this.labName;
    }

    /**
     * Notes for this schedule.
     * 
     */
    @Import(name="notes")
      private final @Nullable Output<String> notes;

    public Output<String> getNotes() {
        return this.notes == null ? Output.empty() : this.notes;
    }

    /**
     * The recurrence pattern of the scheduled actions.
     * 
     */
    @Import(name="recurrencePattern")
      private final @Nullable Output<RecurrencePatternArgs> recurrencePattern;

    public Output<RecurrencePatternArgs> getRecurrencePattern() {
        return this.recurrencePattern == null ? Output.empty() : this.recurrencePattern;
    }

    /**
     * The name of the resource group. The name is case insensitive.
     * 
     */
    @Import(name="resourceGroupName", required=true)
      private final Output<String> resourceGroupName;

    public Output<String> getResourceGroupName() {
        return this.resourceGroupName;
    }

    /**
     * The name of the schedule that uniquely identifies it within containing lab. Used in resource URIs.
     * 
     */
    @Import(name="scheduleName")
      private final @Nullable Output<String> scheduleName;

    public Output<String> getScheduleName() {
        return this.scheduleName == null ? Output.empty() : this.scheduleName;
    }

    /**
     * When lab user virtual machines will be started. Timestamp offsets will be ignored and timeZoneId is used instead.
     * 
     */
    @Import(name="startAt")
      private final @Nullable Output<String> startAt;

    public Output<String> getStartAt() {
        return this.startAt == null ? Output.empty() : this.startAt;
    }

    /**
     * When lab user virtual machines will be stopped. Timestamp offsets will be ignored and timeZoneId is used instead.
     * 
     */
    @Import(name="stopAt", required=true)
      private final Output<String> stopAt;

    public Output<String> getStopAt() {
        return this.stopAt;
    }

    /**
     * The IANA timezone id for the schedule.
     * 
     */
    @Import(name="timeZoneId", required=true)
      private final Output<String> timeZoneId;

    public Output<String> getTimeZoneId() {
        return this.timeZoneId;
    }

    public ScheduleArgs(
        Output<String> labName,
        @Nullable Output<String> notes,
        @Nullable Output<RecurrencePatternArgs> recurrencePattern,
        Output<String> resourceGroupName,
        @Nullable Output<String> scheduleName,
        @Nullable Output<String> startAt,
        Output<String> stopAt,
        Output<String> timeZoneId) {
        this.labName = Objects.requireNonNull(labName, "expected parameter 'labName' to be non-null");
        this.notes = notes;
        this.recurrencePattern = recurrencePattern;
        this.resourceGroupName = Objects.requireNonNull(resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
        this.scheduleName = scheduleName;
        this.startAt = startAt;
        this.stopAt = Objects.requireNonNull(stopAt, "expected parameter 'stopAt' to be non-null");
        this.timeZoneId = Objects.requireNonNull(timeZoneId, "expected parameter 'timeZoneId' to be non-null");
    }

    private ScheduleArgs() {
        this.labName = Output.empty();
        this.notes = Output.empty();
        this.recurrencePattern = Output.empty();
        this.resourceGroupName = Output.empty();
        this.scheduleName = Output.empty();
        this.startAt = Output.empty();
        this.stopAt = Output.empty();
        this.timeZoneId = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ScheduleArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Output<String> labName;
        private @Nullable Output<String> notes;
        private @Nullable Output<RecurrencePatternArgs> recurrencePattern;
        private Output<String> resourceGroupName;
        private @Nullable Output<String> scheduleName;
        private @Nullable Output<String> startAt;
        private Output<String> stopAt;
        private Output<String> timeZoneId;

        public Builder() {
    	      // Empty
        }

        public Builder(ScheduleArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.labName = defaults.labName;
    	      this.notes = defaults.notes;
    	      this.recurrencePattern = defaults.recurrencePattern;
    	      this.resourceGroupName = defaults.resourceGroupName;
    	      this.scheduleName = defaults.scheduleName;
    	      this.startAt = defaults.startAt;
    	      this.stopAt = defaults.stopAt;
    	      this.timeZoneId = defaults.timeZoneId;
        }

        public Builder labName(Output<String> labName) {
            this.labName = Objects.requireNonNull(labName);
            return this;
        }
        public Builder labName(String labName) {
            this.labName = Output.of(Objects.requireNonNull(labName));
            return this;
        }
        public Builder notes(@Nullable Output<String> notes) {
            this.notes = notes;
            return this;
        }
        public Builder notes(@Nullable String notes) {
            this.notes = Output.ofNullable(notes);
            return this;
        }
        public Builder recurrencePattern(@Nullable Output<RecurrencePatternArgs> recurrencePattern) {
            this.recurrencePattern = recurrencePattern;
            return this;
        }
        public Builder recurrencePattern(@Nullable RecurrencePatternArgs recurrencePattern) {
            this.recurrencePattern = Output.ofNullable(recurrencePattern);
            return this;
        }
        public Builder resourceGroupName(Output<String> resourceGroupName) {
            this.resourceGroupName = Objects.requireNonNull(resourceGroupName);
            return this;
        }
        public Builder resourceGroupName(String resourceGroupName) {
            this.resourceGroupName = Output.of(Objects.requireNonNull(resourceGroupName));
            return this;
        }
        public Builder scheduleName(@Nullable Output<String> scheduleName) {
            this.scheduleName = scheduleName;
            return this;
        }
        public Builder scheduleName(@Nullable String scheduleName) {
            this.scheduleName = Output.ofNullable(scheduleName);
            return this;
        }
        public Builder startAt(@Nullable Output<String> startAt) {
            this.startAt = startAt;
            return this;
        }
        public Builder startAt(@Nullable String startAt) {
            this.startAt = Output.ofNullable(startAt);
            return this;
        }
        public Builder stopAt(Output<String> stopAt) {
            this.stopAt = Objects.requireNonNull(stopAt);
            return this;
        }
        public Builder stopAt(String stopAt) {
            this.stopAt = Output.of(Objects.requireNonNull(stopAt));
            return this;
        }
        public Builder timeZoneId(Output<String> timeZoneId) {
            this.timeZoneId = Objects.requireNonNull(timeZoneId);
            return this;
        }
        public Builder timeZoneId(String timeZoneId) {
            this.timeZoneId = Output.of(Objects.requireNonNull(timeZoneId));
            return this;
        }        public ScheduleArgs build() {
            return new ScheduleArgs(labName, notes, recurrencePattern, resourceGroupName, scheduleName, startAt, stopAt, timeZoneId);
        }
    }
}
