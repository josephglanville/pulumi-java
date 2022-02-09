// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.recoveryservices.outputs;

import io.pulumi.azurenative.recoveryservices.outputs.DailyRetentionScheduleResponse;
import io.pulumi.azurenative.recoveryservices.outputs.MonthlyRetentionScheduleResponse;
import io.pulumi.azurenative.recoveryservices.outputs.WeeklyRetentionScheduleResponse;
import io.pulumi.azurenative.recoveryservices.outputs.YearlyRetentionScheduleResponse;
import io.pulumi.core.internal.annotations.OutputCustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class LongTermRetentionPolicyResponse {
    private final @Nullable DailyRetentionScheduleResponse dailySchedule;
    private final @Nullable MonthlyRetentionScheduleResponse monthlySchedule;
    private final String retentionPolicyType;
    private final @Nullable WeeklyRetentionScheduleResponse weeklySchedule;
    private final @Nullable YearlyRetentionScheduleResponse yearlySchedule;

    @OutputCustomType.Constructor({"dailySchedule","monthlySchedule","retentionPolicyType","weeklySchedule","yearlySchedule"})
    private LongTermRetentionPolicyResponse(
        @Nullable DailyRetentionScheduleResponse dailySchedule,
        @Nullable MonthlyRetentionScheduleResponse monthlySchedule,
        String retentionPolicyType,
        @Nullable WeeklyRetentionScheduleResponse weeklySchedule,
        @Nullable YearlyRetentionScheduleResponse yearlySchedule) {
        this.dailySchedule = dailySchedule;
        this.monthlySchedule = monthlySchedule;
        this.retentionPolicyType = Objects.requireNonNull(retentionPolicyType);
        this.weeklySchedule = weeklySchedule;
        this.yearlySchedule = yearlySchedule;
    }

    public Optional<DailyRetentionScheduleResponse> getDailySchedule() {
        return Optional.ofNullable(this.dailySchedule);
    }
    public Optional<MonthlyRetentionScheduleResponse> getMonthlySchedule() {
        return Optional.ofNullable(this.monthlySchedule);
    }
    public String getRetentionPolicyType() {
        return this.retentionPolicyType;
    }
    public Optional<WeeklyRetentionScheduleResponse> getWeeklySchedule() {
        return Optional.ofNullable(this.weeklySchedule);
    }
    public Optional<YearlyRetentionScheduleResponse> getYearlySchedule() {
        return Optional.ofNullable(this.yearlySchedule);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(LongTermRetentionPolicyResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable DailyRetentionScheduleResponse dailySchedule;
        private @Nullable MonthlyRetentionScheduleResponse monthlySchedule;
        private String retentionPolicyType;
        private @Nullable WeeklyRetentionScheduleResponse weeklySchedule;
        private @Nullable YearlyRetentionScheduleResponse yearlySchedule;

        public Builder() {
    	      // Empty
        }

        public Builder(LongTermRetentionPolicyResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.dailySchedule = defaults.dailySchedule;
    	      this.monthlySchedule = defaults.monthlySchedule;
    	      this.retentionPolicyType = defaults.retentionPolicyType;
    	      this.weeklySchedule = defaults.weeklySchedule;
    	      this.yearlySchedule = defaults.yearlySchedule;
        }

        public Builder setDailySchedule(@Nullable DailyRetentionScheduleResponse dailySchedule) {
            this.dailySchedule = dailySchedule;
            return this;
        }

        public Builder setMonthlySchedule(@Nullable MonthlyRetentionScheduleResponse monthlySchedule) {
            this.monthlySchedule = monthlySchedule;
            return this;
        }

        public Builder setRetentionPolicyType(String retentionPolicyType) {
            this.retentionPolicyType = Objects.requireNonNull(retentionPolicyType);
            return this;
        }

        public Builder setWeeklySchedule(@Nullable WeeklyRetentionScheduleResponse weeklySchedule) {
            this.weeklySchedule = weeklySchedule;
            return this;
        }

        public Builder setYearlySchedule(@Nullable YearlyRetentionScheduleResponse yearlySchedule) {
            this.yearlySchedule = yearlySchedule;
            return this;
        }

        public LongTermRetentionPolicyResponse build() {
            return new LongTermRetentionPolicyResponse(dailySchedule, monthlySchedule, retentionPolicyType, weeklySchedule, yearlySchedule);
        }
    }
}
