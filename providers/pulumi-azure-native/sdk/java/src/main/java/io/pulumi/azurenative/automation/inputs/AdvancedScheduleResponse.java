// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.automation.inputs;

import io.pulumi.azurenative.automation.inputs.AdvancedScheduleMonthlyOccurrenceResponse;
import io.pulumi.core.internal.annotations.InputImport;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class AdvancedScheduleResponse extends io.pulumi.resources.InvokeArgs {

    public static final AdvancedScheduleResponse Empty = new AdvancedScheduleResponse();

    @InputImport(name="monthDays")
    private final @Nullable List<Integer> monthDays;

    public List<Integer> getMonthDays() {
        return this.monthDays == null ? List.of() : this.monthDays;
    }

    @InputImport(name="monthlyOccurrences")
    private final @Nullable List<AdvancedScheduleMonthlyOccurrenceResponse> monthlyOccurrences;

    public List<AdvancedScheduleMonthlyOccurrenceResponse> getMonthlyOccurrences() {
        return this.monthlyOccurrences == null ? List.of() : this.monthlyOccurrences;
    }

    @InputImport(name="weekDays")
    private final @Nullable List<String> weekDays;

    public List<String> getWeekDays() {
        return this.weekDays == null ? List.of() : this.weekDays;
    }

    public AdvancedScheduleResponse(
        @Nullable List<Integer> monthDays,
        @Nullable List<AdvancedScheduleMonthlyOccurrenceResponse> monthlyOccurrences,
        @Nullable List<String> weekDays) {
        this.monthDays = monthDays;
        this.monthlyOccurrences = monthlyOccurrences;
        this.weekDays = weekDays;
    }

    private AdvancedScheduleResponse() {
        this.monthDays = List.of();
        this.monthlyOccurrences = List.of();
        this.weekDays = List.of();
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

        public Builder setMonthDays(@Nullable List<Integer> monthDays) {
            this.monthDays = monthDays;
            return this;
        }

        public Builder setMonthlyOccurrences(@Nullable List<AdvancedScheduleMonthlyOccurrenceResponse> monthlyOccurrences) {
            this.monthlyOccurrences = monthlyOccurrences;
            return this;
        }

        public Builder setWeekDays(@Nullable List<String> weekDays) {
            this.weekDays = weekDays;
            return this;
        }

        public AdvancedScheduleResponse build() {
            return new AdvancedScheduleResponse(monthDays, monthlyOccurrences, weekDays);
        }
    }
}
