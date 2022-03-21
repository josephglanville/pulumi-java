// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.storage.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import java.lang.Integer;
import java.util.Objects;


public final class TransferJobScheduleScheduleStartDateArgs extends io.pulumi.resources.ResourceArgs {

    public static final TransferJobScheduleScheduleStartDateArgs Empty = new TransferJobScheduleScheduleStartDateArgs();

    /**
     * Day of month. Must be from 1 to 31 and valid for the year and month.
     * 
     */
    @Import(name="day", required=true)
      private final Output<Integer> day;

    public Output<Integer> getDay() {
        return this.day;
    }

    /**
     * Month of year. Must be from 1 to 12.
     * 
     */
    @Import(name="month", required=true)
      private final Output<Integer> month;

    public Output<Integer> getMonth() {
        return this.month;
    }

    /**
     * Year of date. Must be from 1 to 9999.
     * 
     */
    @Import(name="year", required=true)
      private final Output<Integer> year;

    public Output<Integer> getYear() {
        return this.year;
    }

    public TransferJobScheduleScheduleStartDateArgs(
        Output<Integer> day,
        Output<Integer> month,
        Output<Integer> year) {
        this.day = Objects.requireNonNull(day, "expected parameter 'day' to be non-null");
        this.month = Objects.requireNonNull(month, "expected parameter 'month' to be non-null");
        this.year = Objects.requireNonNull(year, "expected parameter 'year' to be non-null");
    }

    private TransferJobScheduleScheduleStartDateArgs() {
        this.day = Output.empty();
        this.month = Output.empty();
        this.year = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(TransferJobScheduleScheduleStartDateArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Output<Integer> day;
        private Output<Integer> month;
        private Output<Integer> year;

        public Builder() {
    	      // Empty
        }

        public Builder(TransferJobScheduleScheduleStartDateArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.day = defaults.day;
    	      this.month = defaults.month;
    	      this.year = defaults.year;
        }

        public Builder day(Output<Integer> day) {
            this.day = Objects.requireNonNull(day);
            return this;
        }
        public Builder day(Integer day) {
            this.day = Output.of(Objects.requireNonNull(day));
            return this;
        }
        public Builder month(Output<Integer> month) {
            this.month = Objects.requireNonNull(month);
            return this;
        }
        public Builder month(Integer month) {
            this.month = Output.of(Objects.requireNonNull(month));
            return this;
        }
        public Builder year(Output<Integer> year) {
            this.year = Objects.requireNonNull(year);
            return this;
        }
        public Builder year(Integer year) {
            this.year = Output.of(Objects.requireNonNull(year));
            return this;
        }        public TransferJobScheduleScheduleStartDateArgs build() {
            return new TransferJobScheduleScheduleStartDateArgs(day, month, year);
        }
    }
}
