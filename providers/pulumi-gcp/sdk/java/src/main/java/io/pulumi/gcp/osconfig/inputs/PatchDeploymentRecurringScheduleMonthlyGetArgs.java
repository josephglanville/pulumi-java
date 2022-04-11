// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.osconfig.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import io.pulumi.gcp.osconfig.inputs.PatchDeploymentRecurringScheduleMonthlyWeekDayOfMonthGetArgs;
import java.lang.Integer;
import java.util.Objects;
import javax.annotation.Nullable;


public final class PatchDeploymentRecurringScheduleMonthlyGetArgs extends io.pulumi.resources.ResourceArgs {

    public static final PatchDeploymentRecurringScheduleMonthlyGetArgs Empty = new PatchDeploymentRecurringScheduleMonthlyGetArgs();

    /**
     * One day of the month. 1-31 indicates the 1st to the 31st day. -1 indicates the last day of the month.
     * Months without the target day will be skipped. For example, a schedule to run "every month on the 31st"
     * will not run in February, April, June, etc.
     * 
     */
    @Import(name="monthDay")
      private final @Nullable Output<Integer> monthDay;

    public Output<Integer> getMonthDay() {
        return this.monthDay == null ? Codegen.empty() : this.monthDay;
    }

    /**
     * Week day in a month.
     * Structure is documented below.
     * 
     */
    @Import(name="weekDayOfMonth")
      private final @Nullable Output<PatchDeploymentRecurringScheduleMonthlyWeekDayOfMonthGetArgs> weekDayOfMonth;

    public Output<PatchDeploymentRecurringScheduleMonthlyWeekDayOfMonthGetArgs> getWeekDayOfMonth() {
        return this.weekDayOfMonth == null ? Codegen.empty() : this.weekDayOfMonth;
    }

    public PatchDeploymentRecurringScheduleMonthlyGetArgs(
        @Nullable Output<Integer> monthDay,
        @Nullable Output<PatchDeploymentRecurringScheduleMonthlyWeekDayOfMonthGetArgs> weekDayOfMonth) {
        this.monthDay = monthDay;
        this.weekDayOfMonth = weekDayOfMonth;
    }

    private PatchDeploymentRecurringScheduleMonthlyGetArgs() {
        this.monthDay = Codegen.empty();
        this.weekDayOfMonth = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(PatchDeploymentRecurringScheduleMonthlyGetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<Integer> monthDay;
        private @Nullable Output<PatchDeploymentRecurringScheduleMonthlyWeekDayOfMonthGetArgs> weekDayOfMonth;

        public Builder() {
    	      // Empty
        }

        public Builder(PatchDeploymentRecurringScheduleMonthlyGetArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.monthDay = defaults.monthDay;
    	      this.weekDayOfMonth = defaults.weekDayOfMonth;
        }

        public Builder monthDay(@Nullable Output<Integer> monthDay) {
            this.monthDay = monthDay;
            return this;
        }
        public Builder monthDay(@Nullable Integer monthDay) {
            this.monthDay = Codegen.ofNullable(monthDay);
            return this;
        }
        public Builder weekDayOfMonth(@Nullable Output<PatchDeploymentRecurringScheduleMonthlyWeekDayOfMonthGetArgs> weekDayOfMonth) {
            this.weekDayOfMonth = weekDayOfMonth;
            return this;
        }
        public Builder weekDayOfMonth(@Nullable PatchDeploymentRecurringScheduleMonthlyWeekDayOfMonthGetArgs weekDayOfMonth) {
            this.weekDayOfMonth = Codegen.ofNullable(weekDayOfMonth);
            return this;
        }        public PatchDeploymentRecurringScheduleMonthlyGetArgs build() {
            return new PatchDeploymentRecurringScheduleMonthlyGetArgs(monthDay, weekDayOfMonth);
        }
    }
}
