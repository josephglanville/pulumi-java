// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.insights.inputs;

import io.pulumi.core.internal.annotations.InputImport;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Objects;


public final class RecurrentScheduleResponse extends io.pulumi.resources.InvokeArgs {

    public static final RecurrentScheduleResponse Empty = new RecurrentScheduleResponse();

    @InputImport(name="days", required=true)
    private final List<String> days;

    public List<String> getDays() {
        return this.days;
    }

    @InputImport(name="hours", required=true)
    private final List<Integer> hours;

    public List<Integer> getHours() {
        return this.hours;
    }

    @InputImport(name="minutes", required=true)
    private final List<Integer> minutes;

    public List<Integer> getMinutes() {
        return this.minutes;
    }

    @InputImport(name="timeZone", required=true)
    private final String timeZone;

    public String getTimeZone() {
        return this.timeZone;
    }

    public RecurrentScheduleResponse(
        List<String> days,
        List<Integer> hours,
        List<Integer> minutes,
        String timeZone) {
        this.days = Objects.requireNonNull(days, "expected parameter 'days' to be non-null");
        this.hours = Objects.requireNonNull(hours, "expected parameter 'hours' to be non-null");
        this.minutes = Objects.requireNonNull(minutes, "expected parameter 'minutes' to be non-null");
        this.timeZone = Objects.requireNonNull(timeZone, "expected parameter 'timeZone' to be non-null");
    }

    private RecurrentScheduleResponse() {
        this.days = List.of();
        this.hours = List.of();
        this.minutes = List.of();
        this.timeZone = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(RecurrentScheduleResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private List<String> days;
        private List<Integer> hours;
        private List<Integer> minutes;
        private String timeZone;

        public Builder() {
    	      // Empty
        }

        public Builder(RecurrentScheduleResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.days = defaults.days;
    	      this.hours = defaults.hours;
    	      this.minutes = defaults.minutes;
    	      this.timeZone = defaults.timeZone;
        }

        public Builder setDays(List<String> days) {
            this.days = Objects.requireNonNull(days);
            return this;
        }

        public Builder setHours(List<Integer> hours) {
            this.hours = Objects.requireNonNull(hours);
            return this;
        }

        public Builder setMinutes(List<Integer> minutes) {
            this.minutes = Objects.requireNonNull(minutes);
            return this;
        }

        public Builder setTimeZone(String timeZone) {
            this.timeZone = Objects.requireNonNull(timeZone);
            return this;
        }

        public RecurrentScheduleResponse build() {
            return new RecurrentScheduleResponse(days, hours, minutes, timeZone);
        }
    }
}
