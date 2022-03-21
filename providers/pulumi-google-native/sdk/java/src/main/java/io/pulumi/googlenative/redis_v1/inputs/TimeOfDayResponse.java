// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.redis_v1.inputs;

import io.pulumi.core.annotations.Import;
import java.lang.Integer;
import java.util.Objects;


/**
 * Represents a time of day. The date and time zone are either not significant or are specified elsewhere. An API may choose to allow leap seconds. Related types are google.type.Date and `google.protobuf.Timestamp`.
 * 
 */
public final class TimeOfDayResponse extends io.pulumi.resources.InvokeArgs {

    public static final TimeOfDayResponse Empty = new TimeOfDayResponse();

    /**
     * Hours of day in 24 hour format. Should be from 0 to 23. An API may choose to allow the value "24:00:00" for scenarios like business closing time.
     * 
     */
    @Import(name="hours", required=true)
      private final Integer hours;

    public Integer getHours() {
        return this.hours;
    }

    /**
     * Minutes of hour of day. Must be from 0 to 59.
     * 
     */
    @Import(name="minutes", required=true)
      private final Integer minutes;

    public Integer getMinutes() {
        return this.minutes;
    }

    /**
     * Fractions of seconds in nanoseconds. Must be from 0 to 999,999,999.
     * 
     */
    @Import(name="nanos", required=true)
      private final Integer nanos;

    public Integer getNanos() {
        return this.nanos;
    }

    /**
     * Seconds of minutes of the time. Must normally be from 0 to 59. An API may allow the value 60 if it allows leap-seconds.
     * 
     */
    @Import(name="seconds", required=true)
      private final Integer seconds;

    public Integer getSeconds() {
        return this.seconds;
    }

    public TimeOfDayResponse(
        Integer hours,
        Integer minutes,
        Integer nanos,
        Integer seconds) {
        this.hours = Objects.requireNonNull(hours, "expected parameter 'hours' to be non-null");
        this.minutes = Objects.requireNonNull(minutes, "expected parameter 'minutes' to be non-null");
        this.nanos = Objects.requireNonNull(nanos, "expected parameter 'nanos' to be non-null");
        this.seconds = Objects.requireNonNull(seconds, "expected parameter 'seconds' to be non-null");
    }

    private TimeOfDayResponse() {
        this.hours = null;
        this.minutes = null;
        this.nanos = null;
        this.seconds = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(TimeOfDayResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Integer hours;
        private Integer minutes;
        private Integer nanos;
        private Integer seconds;

        public Builder() {
    	      // Empty
        }

        public Builder(TimeOfDayResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.hours = defaults.hours;
    	      this.minutes = defaults.minutes;
    	      this.nanos = defaults.nanos;
    	      this.seconds = defaults.seconds;
        }

        public Builder hours(Integer hours) {
            this.hours = Objects.requireNonNull(hours);
            return this;
        }
        public Builder minutes(Integer minutes) {
            this.minutes = Objects.requireNonNull(minutes);
            return this;
        }
        public Builder nanos(Integer nanos) {
            this.nanos = Objects.requireNonNull(nanos);
            return this;
        }
        public Builder seconds(Integer seconds) {
            this.seconds = Objects.requireNonNull(seconds);
            return this;
        }        public TimeOfDayResponse build() {
            return new TimeOfDayResponse(hours, minutes, nanos, seconds);
        }
    }
}
