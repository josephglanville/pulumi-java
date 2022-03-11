// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.osconfig.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.InputImport;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;


public final class PatchDeploymentRecurringScheduleMonthlyWeekDayOfMonthGetArgs extends io.pulumi.resources.ResourceArgs {

    public static final PatchDeploymentRecurringScheduleMonthlyWeekDayOfMonthGetArgs Empty = new PatchDeploymentRecurringScheduleMonthlyWeekDayOfMonthGetArgs();

    /**
     * A day of the week.
     * Possible values are `MONDAY`, `TUESDAY`, `WEDNESDAY`, `THURSDAY`, `FRIDAY`, `SATURDAY`, and `SUNDAY`.
     * 
     */
    @InputImport(name="dayOfWeek", required=true)
      private final Output<String> dayOfWeek;

    public Output<String> getDayOfWeek() {
        return this.dayOfWeek;
    }

    /**
     * Week number in a month. 1-4 indicates the 1st to 4th week of the month. -1 indicates the last week of the month.
     * 
     */
    @InputImport(name="weekOrdinal", required=true)
      private final Output<Integer> weekOrdinal;

    public Output<Integer> getWeekOrdinal() {
        return this.weekOrdinal;
    }

    public PatchDeploymentRecurringScheduleMonthlyWeekDayOfMonthGetArgs(
        Output<String> dayOfWeek,
        Output<Integer> weekOrdinal) {
        this.dayOfWeek = Objects.requireNonNull(dayOfWeek, "expected parameter 'dayOfWeek' to be non-null");
        this.weekOrdinal = Objects.requireNonNull(weekOrdinal, "expected parameter 'weekOrdinal' to be non-null");
    }

    private PatchDeploymentRecurringScheduleMonthlyWeekDayOfMonthGetArgs() {
        this.dayOfWeek = Output.empty();
        this.weekOrdinal = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(PatchDeploymentRecurringScheduleMonthlyWeekDayOfMonthGetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Output<String> dayOfWeek;
        private Output<Integer> weekOrdinal;

        public Builder() {
    	      // Empty
        }

        public Builder(PatchDeploymentRecurringScheduleMonthlyWeekDayOfMonthGetArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.dayOfWeek = defaults.dayOfWeek;
    	      this.weekOrdinal = defaults.weekOrdinal;
        }

        public Builder dayOfWeek(Output<String> dayOfWeek) {
            this.dayOfWeek = Objects.requireNonNull(dayOfWeek);
            return this;
        }

        public Builder dayOfWeek(String dayOfWeek) {
            this.dayOfWeek = Output.of(Objects.requireNonNull(dayOfWeek));
            return this;
        }

        public Builder weekOrdinal(Output<Integer> weekOrdinal) {
            this.weekOrdinal = Objects.requireNonNull(weekOrdinal);
            return this;
        }

        public Builder weekOrdinal(Integer weekOrdinal) {
            this.weekOrdinal = Output.of(Objects.requireNonNull(weekOrdinal));
            return this;
        }
        public PatchDeploymentRecurringScheduleMonthlyWeekDayOfMonthGetArgs build() {
            return new PatchDeploymentRecurringScheduleMonthlyWeekDayOfMonthGetArgs(dayOfWeek, weekOrdinal);
        }
    }
}
