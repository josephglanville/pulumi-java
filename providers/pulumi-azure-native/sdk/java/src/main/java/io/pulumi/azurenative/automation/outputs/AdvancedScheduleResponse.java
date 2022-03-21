// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.automation.outputs;

import io.pulumi.azurenative.automation.outputs.AdvancedScheduleMonthlyOccurrenceResponse;
import io.pulumi.core.annotations.CustomType;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;

@CustomType
public final class AdvancedScheduleResponse {
    /**
     * Days of the month that the job should execute on. Must be between 1 and 31.
     * 
     */
    private final @Nullable List<Integer> monthDays;
    /**
     * Occurrences of days within a month.
     * 
     */
    private final @Nullable List<AdvancedScheduleMonthlyOccurrenceResponse> monthlyOccurrences;
    /**
     * Days of the week that the job should execute on.
     * 
     */
    private final @Nullable List<String> weekDays;

    @CustomType.Constructor
    private AdvancedScheduleResponse(
        @CustomType.Parameter("monthDays") @Nullable List<Integer> monthDays,
        @CustomType.Parameter("monthlyOccurrences") @Nullable List<AdvancedScheduleMonthlyOccurrenceResponse> monthlyOccurrences,
        @CustomType.Parameter("weekDays") @Nullable List<String> weekDays) {
        this.monthDays = monthDays;
        this.monthlyOccurrences = monthlyOccurrences;
        this.weekDays = weekDays;
    }

    /**
     * Days of the month that the job should execute on. Must be between 1 and 31.
     * 
    */
    public List<Integer> getMonthDays() {
        return this.monthDays == null ? List.of() : this.monthDays;
    }
    /**
     * Occurrences of days within a month.
     * 
    */
    public List<AdvancedScheduleMonthlyOccurrenceResponse> getMonthlyOccurrences() {
        return this.monthlyOccurrences == null ? List.of() : this.monthlyOccurrences;
    }
    /**
     * Days of the week that the job should execute on.
     * 
    */
    public List<String> getWeekDays() {
        return this.weekDays == null ? List.of() : this.weekDays;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(AdvancedScheduleResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable List<Integer> monthDays;
        private @Nullable List<AdvancedScheduleMonthlyOccurrenceResponse> monthlyOccurrences;
        private @Nullable List<String> weekDays;

        public Builder() {
    	      // Empty
        }

        public Builder(AdvancedScheduleResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.monthDays = defaults.monthDays;
    	      this.monthlyOccurrences = defaults.monthlyOccurrences;
    	      this.weekDays = defaults.weekDays;
        }

        public Builder monthDays(@Nullable List<Integer> monthDays) {
            this.monthDays = monthDays;
            return this;
        }
        public Builder monthDays(Integer... monthDays) {
            return monthDays(List.of(monthDays));
        }
        public Builder monthlyOccurrences(@Nullable List<AdvancedScheduleMonthlyOccurrenceResponse> monthlyOccurrences) {
            this.monthlyOccurrences = monthlyOccurrences;
            return this;
        }
        public Builder monthlyOccurrences(AdvancedScheduleMonthlyOccurrenceResponse... monthlyOccurrences) {
            return monthlyOccurrences(List.of(monthlyOccurrences));
        }
        public Builder weekDays(@Nullable List<String> weekDays) {
            this.weekDays = weekDays;
            return this;
        }
        public Builder weekDays(String... weekDays) {
            return weekDays(List.of(weekDays));
        }        public AdvancedScheduleResponse build() {
            return new AdvancedScheduleResponse(monthDays, monthlyOccurrences, weekDays);
        }
    }
}
