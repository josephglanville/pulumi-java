// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.datafactory.inputs;

import io.pulumi.azurenative.datafactory.enums.DayOfWeek;
import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.Integer;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * The recurrence schedule occurrence.
 * 
 */
public final class RecurrenceScheduleOccurrenceArgs extends io.pulumi.resources.ResourceArgs {

    public static final RecurrenceScheduleOccurrenceArgs Empty = new RecurrenceScheduleOccurrenceArgs();

    /**
     * The day of the week.
     * 
     */
    @InputImport(name="day")
      private final @Nullable Input<DayOfWeek> day;

    public Input<DayOfWeek> getDay() {
        return this.day == null ? Input.empty() : this.day;
    }

    /**
     * The occurrence.
     * 
     */
    @InputImport(name="occurrence")
      private final @Nullable Input<Integer> occurrence;

    public Input<Integer> getOccurrence() {
        return this.occurrence == null ? Input.empty() : this.occurrence;
    }

    public RecurrenceScheduleOccurrenceArgs(
        @Nullable Input<DayOfWeek> day,
        @Nullable Input<Integer> occurrence) {
        this.day = day;
        this.occurrence = occurrence;
    }

    private RecurrenceScheduleOccurrenceArgs() {
        this.day = Input.empty();
        this.occurrence = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(RecurrenceScheduleOccurrenceArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<DayOfWeek> day;
        private @Nullable Input<Integer> occurrence;

        public Builder() {
    	      // Empty
        }

        public Builder(RecurrenceScheduleOccurrenceArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.day = defaults.day;
    	      this.occurrence = defaults.occurrence;
        }

        public Builder setDay(@Nullable Input<DayOfWeek> day) {
            this.day = day;
            return this;
        }

        public Builder setDay(@Nullable DayOfWeek day) {
            this.day = Input.ofNullable(day);
            return this;
        }

        public Builder setOccurrence(@Nullable Input<Integer> occurrence) {
            this.occurrence = occurrence;
            return this;
        }

        public Builder setOccurrence(@Nullable Integer occurrence) {
            this.occurrence = Input.ofNullable(occurrence);
            return this;
        }
        public RecurrenceScheduleOccurrenceArgs build() {
            return new RecurrenceScheduleOccurrenceArgs(day, occurrence);
        }
    }
}
