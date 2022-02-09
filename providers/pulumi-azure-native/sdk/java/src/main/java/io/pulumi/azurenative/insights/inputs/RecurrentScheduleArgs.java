// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.insights.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.internal.annotations.InputImport;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Objects;


public final class RecurrentScheduleArgs extends io.pulumi.resources.ResourceArgs {

    public static final RecurrentScheduleArgs Empty = new RecurrentScheduleArgs();

    @InputImport(name="days", required=true)
    private final Input<List<String>> days;

    public Input<List<String>> getDays() {
        return this.days;
    }

    @InputImport(name="hours", required=true)
    private final Input<List<Integer>> hours;

    public Input<List<Integer>> getHours() {
        return this.hours;
    }

    @InputImport(name="minutes", required=true)
    private final Input<List<Integer>> minutes;

    public Input<List<Integer>> getMinutes() {
        return this.minutes;
    }

    @InputImport(name="timeZone", required=true)
    private final Input<String> timeZone;

    public Input<String> getTimeZone() {
        return this.timeZone;
    }

    public RecurrentScheduleArgs(
        Input<List<String>> days,
        Input<List<Integer>> hours,
        Input<List<Integer>> minutes,
        Input<String> timeZone) {
        this.days = Objects.requireNonNull(days, "expected parameter 'days' to be non-null");
        this.hours = Objects.requireNonNull(hours, "expected parameter 'hours' to be non-null");
        this.minutes = Objects.requireNonNull(minutes, "expected parameter 'minutes' to be non-null");
        this.timeZone = Objects.requireNonNull(timeZone, "expected parameter 'timeZone' to be non-null");
    }

    private RecurrentScheduleArgs() {
        this.days = Input.empty();
        this.hours = Input.empty();
        this.minutes = Input.empty();
        this.timeZone = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(RecurrentScheduleArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Input<List<String>> days;
        private Input<List<Integer>> hours;
        private Input<List<Integer>> minutes;
        private Input<String> timeZone;

        public Builder() {
    	      // Empty
        }

        public Builder(RecurrentScheduleArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.days = defaults.days;
    	      this.hours = defaults.hours;
    	      this.minutes = defaults.minutes;
    	      this.timeZone = defaults.timeZone;
        }

        public Builder setDays(Input<List<String>> days) {
            this.days = Objects.requireNonNull(days);
            return this;
        }

        public Builder setDays(List<String> days) {
            this.days = Input.of(Objects.requireNonNull(days));
            return this;
        }

        public Builder setHours(Input<List<Integer>> hours) {
            this.hours = Objects.requireNonNull(hours);
            return this;
        }

        public Builder setHours(List<Integer> hours) {
            this.hours = Input.of(Objects.requireNonNull(hours));
            return this;
        }

        public Builder setMinutes(Input<List<Integer>> minutes) {
            this.minutes = Objects.requireNonNull(minutes);
            return this;
        }

        public Builder setMinutes(List<Integer> minutes) {
            this.minutes = Input.of(Objects.requireNonNull(minutes));
            return this;
        }

        public Builder setTimeZone(Input<String> timeZone) {
            this.timeZone = Objects.requireNonNull(timeZone);
            return this;
        }

        public Builder setTimeZone(String timeZone) {
            this.timeZone = Input.of(Objects.requireNonNull(timeZone));
            return this;
        }

        public RecurrentScheduleArgs build() {
            return new RecurrentScheduleArgs(days, hours, minutes, timeZone);
        }
    }
}
