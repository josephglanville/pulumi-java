// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.redis_v1beta1.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import java.lang.Integer;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * Represents a time of day. The date and time zone are either not significant or are specified elsewhere. An API may choose to allow leap seconds. Related types are google.type.Date and `google.protobuf.Timestamp`.
 * 
 */
public final class TimeOfDayArgs extends io.pulumi.resources.ResourceArgs {

    public static final TimeOfDayArgs Empty = new TimeOfDayArgs();

    /**
     * Hours of day in 24 hour format. Should be from 0 to 23. An API may choose to allow the value "24:00:00" for scenarios like business closing time.
     * 
     */
    @Import(name="hours")
      private final @Nullable Output<Integer> hours;

    public Output<Integer> getHours() {
        return this.hours == null ? Output.empty() : this.hours;
    }

    /**
     * Minutes of hour of day. Must be from 0 to 59.
     * 
     */
    @Import(name="minutes")
      private final @Nullable Output<Integer> minutes;

    public Output<Integer> getMinutes() {
        return this.minutes == null ? Output.empty() : this.minutes;
    }

    /**
     * Fractions of seconds in nanoseconds. Must be from 0 to 999,999,999.
     * 
     */
    @Import(name="nanos")
      private final @Nullable Output<Integer> nanos;

    public Output<Integer> getNanos() {
        return this.nanos == null ? Output.empty() : this.nanos;
    }

    /**
     * Seconds of minutes of the time. Must normally be from 0 to 59. An API may allow the value 60 if it allows leap-seconds.
     * 
     */
    @Import(name="seconds")
      private final @Nullable Output<Integer> seconds;

    public Output<Integer> getSeconds() {
        return this.seconds == null ? Output.empty() : this.seconds;
    }

    public TimeOfDayArgs(
        @Nullable Output<Integer> hours,
        @Nullable Output<Integer> minutes,
        @Nullable Output<Integer> nanos,
        @Nullable Output<Integer> seconds) {
        this.hours = hours;
        this.minutes = minutes;
        this.nanos = nanos;
        this.seconds = seconds;
    }

    private TimeOfDayArgs() {
        this.hours = Output.empty();
        this.minutes = Output.empty();
        this.nanos = Output.empty();
        this.seconds = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(TimeOfDayArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<Integer> hours;
        private @Nullable Output<Integer> minutes;
        private @Nullable Output<Integer> nanos;
        private @Nullable Output<Integer> seconds;

        public Builder() {
    	      // Empty
        }

        public Builder(TimeOfDayArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.hours = defaults.hours;
    	      this.minutes = defaults.minutes;
    	      this.nanos = defaults.nanos;
    	      this.seconds = defaults.seconds;
        }

        public Builder hours(@Nullable Output<Integer> hours) {
            this.hours = hours;
            return this;
        }
        public Builder hours(@Nullable Integer hours) {
            this.hours = Output.ofNullable(hours);
            return this;
        }
        public Builder minutes(@Nullable Output<Integer> minutes) {
            this.minutes = minutes;
            return this;
        }
        public Builder minutes(@Nullable Integer minutes) {
            this.minutes = Output.ofNullable(minutes);
            return this;
        }
        public Builder nanos(@Nullable Output<Integer> nanos) {
            this.nanos = nanos;
            return this;
        }
        public Builder nanos(@Nullable Integer nanos) {
            this.nanos = Output.ofNullable(nanos);
            return this;
        }
        public Builder seconds(@Nullable Output<Integer> seconds) {
            this.seconds = seconds;
            return this;
        }
        public Builder seconds(@Nullable Integer seconds) {
            this.seconds = Output.ofNullable(seconds);
            return this;
        }        public TimeOfDayArgs build() {
            return new TimeOfDayArgs(hours, minutes, nanos, seconds);
        }
    }
}
