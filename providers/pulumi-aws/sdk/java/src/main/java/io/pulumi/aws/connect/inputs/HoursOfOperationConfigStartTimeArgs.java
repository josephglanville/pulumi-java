// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.connect.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import java.lang.Integer;
import java.util.Objects;


public final class HoursOfOperationConfigStartTimeArgs extends io.pulumi.resources.ResourceArgs {

    public static final HoursOfOperationConfigStartTimeArgs Empty = new HoursOfOperationConfigStartTimeArgs();

    /**
     * Specifies the hour of opening.
     * 
     */
    @Import(name="hours", required=true)
      private final Output<Integer> hours;

    public Output<Integer> getHours() {
        return this.hours;
    }

    /**
     * Specifies the minute of opening.
     * 
     */
    @Import(name="minutes", required=true)
      private final Output<Integer> minutes;

    public Output<Integer> getMinutes() {
        return this.minutes;
    }

    public HoursOfOperationConfigStartTimeArgs(
        Output<Integer> hours,
        Output<Integer> minutes) {
        this.hours = Objects.requireNonNull(hours, "expected parameter 'hours' to be non-null");
        this.minutes = Objects.requireNonNull(minutes, "expected parameter 'minutes' to be non-null");
    }

    private HoursOfOperationConfigStartTimeArgs() {
        this.hours = Output.empty();
        this.minutes = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(HoursOfOperationConfigStartTimeArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Output<Integer> hours;
        private Output<Integer> minutes;

        public Builder() {
    	      // Empty
        }

        public Builder(HoursOfOperationConfigStartTimeArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.hours = defaults.hours;
    	      this.minutes = defaults.minutes;
        }

        public Builder hours(Output<Integer> hours) {
            this.hours = Objects.requireNonNull(hours);
            return this;
        }
        public Builder hours(Integer hours) {
            this.hours = Output.of(Objects.requireNonNull(hours));
            return this;
        }
        public Builder minutes(Output<Integer> minutes) {
            this.minutes = Objects.requireNonNull(minutes);
            return this;
        }
        public Builder minutes(Integer minutes) {
            this.minutes = Output.of(Objects.requireNonNull(minutes));
            return this;
        }        public HoursOfOperationConfigStartTimeArgs build() {
            return new HoursOfOperationConfigStartTimeArgs(hours, minutes);
        }
    }
}
