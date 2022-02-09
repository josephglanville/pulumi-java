// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.labservices;

import io.pulumi.azurenative.labservices.inputs.RecurrencePatternArgs;
import io.pulumi.core.Input;
import io.pulumi.core.internal.annotations.InputImport;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class ScheduleArgs extends io.pulumi.resources.ResourceArgs {

    public static final ScheduleArgs Empty = new ScheduleArgs();

    @InputImport(name="labName", required=true)
    private final Input<String> labName;

    public Input<String> getLabName() {
        return this.labName;
    }

    @InputImport(name="notes")
    private final @Nullable Input<String> notes;

    public Input<String> getNotes() {
        return this.notes == null ? Input.empty() : this.notes;
    }

    @InputImport(name="recurrencePattern")
    private final @Nullable Input<RecurrencePatternArgs> recurrencePattern;

    public Input<RecurrencePatternArgs> getRecurrencePattern() {
        return this.recurrencePattern == null ? Input.empty() : this.recurrencePattern;
    }

    @InputImport(name="resourceGroupName", required=true)
    private final Input<String> resourceGroupName;

    public Input<String> getResourceGroupName() {
        return this.resourceGroupName;
    }

    @InputImport(name="scheduleName")
    private final @Nullable Input<String> scheduleName;

    public Input<String> getScheduleName() {
        return this.scheduleName == null ? Input.empty() : this.scheduleName;
    }

    @InputImport(name="startAt")
    private final @Nullable Input<String> startAt;

    public Input<String> getStartAt() {
        return this.startAt == null ? Input.empty() : this.startAt;
    }

    @InputImport(name="stopAt", required=true)
    private final Input<String> stopAt;

    public Input<String> getStopAt() {
        return this.stopAt;
    }

    @InputImport(name="timeZoneId", required=true)
    private final Input<String> timeZoneId;

    public Input<String> getTimeZoneId() {
        return this.timeZoneId;
    }

    public ScheduleArgs(
        Input<String> labName,
        @Nullable Input<String> notes,
        @Nullable Input<RecurrencePatternArgs> recurrencePattern,
        Input<String> resourceGroupName,
        @Nullable Input<String> scheduleName,
        @Nullable Input<String> startAt,
        Input<String> stopAt,
        Input<String> timeZoneId) {
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
        this.labName = Input.empty();
        this.notes = Input.empty();
        this.recurrencePattern = Input.empty();
        this.resourceGroupName = Input.empty();
        this.scheduleName = Input.empty();
        this.startAt = Input.empty();
        this.stopAt = Input.empty();
        this.timeZoneId = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ScheduleArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Input<String> labName;
        private @Nullable Input<String> notes;
        private @Nullable Input<RecurrencePatternArgs> recurrencePattern;
        private Input<String> resourceGroupName;
        private @Nullable Input<String> scheduleName;
        private @Nullable Input<String> startAt;
        private Input<String> stopAt;
        private Input<String> timeZoneId;

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

        public Builder setLabName(Input<String> labName) {
            this.labName = Objects.requireNonNull(labName);
            return this;
        }

        public Builder setLabName(String labName) {
            this.labName = Input.of(Objects.requireNonNull(labName));
            return this;
        }

        public Builder setNotes(@Nullable Input<String> notes) {
            this.notes = notes;
            return this;
        }

        public Builder setNotes(@Nullable String notes) {
            this.notes = Input.ofNullable(notes);
            return this;
        }

        public Builder setRecurrencePattern(@Nullable Input<RecurrencePatternArgs> recurrencePattern) {
            this.recurrencePattern = recurrencePattern;
            return this;
        }

        public Builder setRecurrencePattern(@Nullable RecurrencePatternArgs recurrencePattern) {
            this.recurrencePattern = Input.ofNullable(recurrencePattern);
            return this;
        }

        public Builder setResourceGroupName(Input<String> resourceGroupName) {
            this.resourceGroupName = Objects.requireNonNull(resourceGroupName);
            return this;
        }

        public Builder setResourceGroupName(String resourceGroupName) {
            this.resourceGroupName = Input.of(Objects.requireNonNull(resourceGroupName));
            return this;
        }

        public Builder setScheduleName(@Nullable Input<String> scheduleName) {
            this.scheduleName = scheduleName;
            return this;
        }

        public Builder setScheduleName(@Nullable String scheduleName) {
            this.scheduleName = Input.ofNullable(scheduleName);
            return this;
        }

        public Builder setStartAt(@Nullable Input<String> startAt) {
            this.startAt = startAt;
            return this;
        }

        public Builder setStartAt(@Nullable String startAt) {
            this.startAt = Input.ofNullable(startAt);
            return this;
        }

        public Builder setStopAt(Input<String> stopAt) {
            this.stopAt = Objects.requireNonNull(stopAt);
            return this;
        }

        public Builder setStopAt(String stopAt) {
            this.stopAt = Input.of(Objects.requireNonNull(stopAt));
            return this;
        }

        public Builder setTimeZoneId(Input<String> timeZoneId) {
            this.timeZoneId = Objects.requireNonNull(timeZoneId);
            return this;
        }

        public Builder setTimeZoneId(String timeZoneId) {
            this.timeZoneId = Input.of(Objects.requireNonNull(timeZoneId));
            return this;
        }

        public ScheduleArgs build() {
            return new ScheduleArgs(labName, notes, recurrencePattern, resourceGroupName, scheduleName, startAt, stopAt, timeZoneId);
        }
    }
}
