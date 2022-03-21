// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.storsimple.inputs;

import io.pulumi.azurenative.storsimple.enums.DayOfWeek;
import io.pulumi.azurenative.storsimple.enums.RecurrenceType;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import java.lang.Integer;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * The schedule recurrence.
 * 
 */
public final class ScheduleRecurrenceArgs extends io.pulumi.resources.ResourceArgs {

    public static final ScheduleRecurrenceArgs Empty = new ScheduleRecurrenceArgs();

    /**
     * The recurrence type.
     * 
     */
    @Import(name="recurrenceType", required=true)
      private final Output<RecurrenceType> recurrenceType;

    public Output<RecurrenceType> getRecurrenceType() {
        return this.recurrenceType;
    }

    /**
     * The recurrence value.
     * 
     */
    @Import(name="recurrenceValue", required=true)
      private final Output<Integer> recurrenceValue;

    public Output<Integer> getRecurrenceValue() {
        return this.recurrenceValue;
    }

    /**
     * The week days list. Applicable only for schedules of recurrence type 'weekly'.
     * 
     */
    @Import(name="weeklyDaysList")
      private final @Nullable Output<List<DayOfWeek>> weeklyDaysList;

    public Output<List<DayOfWeek>> getWeeklyDaysList() {
        return this.weeklyDaysList == null ? Output.empty() : this.weeklyDaysList;
    }

    public ScheduleRecurrenceArgs(
        Output<RecurrenceType> recurrenceType,
        Output<Integer> recurrenceValue,
        @Nullable Output<List<DayOfWeek>> weeklyDaysList) {
        this.recurrenceType = Objects.requireNonNull(recurrenceType, "expected parameter 'recurrenceType' to be non-null");
        this.recurrenceValue = Objects.requireNonNull(recurrenceValue, "expected parameter 'recurrenceValue' to be non-null");
        this.weeklyDaysList = weeklyDaysList;
    }

    private ScheduleRecurrenceArgs() {
        this.recurrenceType = Output.empty();
        this.recurrenceValue = Output.empty();
        this.weeklyDaysList = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ScheduleRecurrenceArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Output<RecurrenceType> recurrenceType;
        private Output<Integer> recurrenceValue;
        private @Nullable Output<List<DayOfWeek>> weeklyDaysList;

        public Builder() {
    	      // Empty
        }

        public Builder(ScheduleRecurrenceArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.recurrenceType = defaults.recurrenceType;
    	      this.recurrenceValue = defaults.recurrenceValue;
    	      this.weeklyDaysList = defaults.weeklyDaysList;
        }

        public Builder recurrenceType(Output<RecurrenceType> recurrenceType) {
            this.recurrenceType = Objects.requireNonNull(recurrenceType);
            return this;
        }
        public Builder recurrenceType(RecurrenceType recurrenceType) {
            this.recurrenceType = Output.of(Objects.requireNonNull(recurrenceType));
            return this;
        }
        public Builder recurrenceValue(Output<Integer> recurrenceValue) {
            this.recurrenceValue = Objects.requireNonNull(recurrenceValue);
            return this;
        }
        public Builder recurrenceValue(Integer recurrenceValue) {
            this.recurrenceValue = Output.of(Objects.requireNonNull(recurrenceValue));
            return this;
        }
        public Builder weeklyDaysList(@Nullable Output<List<DayOfWeek>> weeklyDaysList) {
            this.weeklyDaysList = weeklyDaysList;
            return this;
        }
        public Builder weeklyDaysList(@Nullable List<DayOfWeek> weeklyDaysList) {
            this.weeklyDaysList = Output.ofNullable(weeklyDaysList);
            return this;
        }
        public Builder weeklyDaysList(DayOfWeek... weeklyDaysList) {
            return weeklyDaysList(List.of(weeklyDaysList));
        }        public ScheduleRecurrenceArgs build() {
            return new ScheduleRecurrenceArgs(recurrenceType, recurrenceValue, weeklyDaysList);
        }
    }
}
