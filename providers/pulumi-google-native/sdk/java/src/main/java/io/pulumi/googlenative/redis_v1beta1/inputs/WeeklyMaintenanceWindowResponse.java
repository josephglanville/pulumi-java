// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.redis_v1beta1.inputs;

import io.pulumi.core.annotations.Import;
import io.pulumi.googlenative.redis_v1beta1.inputs.TimeOfDayResponse;
import java.lang.String;
import java.util.Objects;


/**
 * Time window in which disruptive maintenance updates occur. Non-disruptive updates can occur inside or outside this window.
 * 
 */
public final class WeeklyMaintenanceWindowResponse extends io.pulumi.resources.InvokeArgs {

    public static final WeeklyMaintenanceWindowResponse Empty = new WeeklyMaintenanceWindowResponse();

    /**
     * The day of week that maintenance updates occur.
     * 
     */
    @Import(name="day", required=true)
      private final String day;

    public String getDay() {
        return this.day;
    }

    /**
     * Duration of the maintenance window. The current window is fixed at 1 hour.
     * 
     */
    @Import(name="duration", required=true)
      private final String duration;

    public String getDuration() {
        return this.duration;
    }

    /**
     * Start time of the window in UTC time.
     * 
     */
    @Import(name="startTime", required=true)
      private final TimeOfDayResponse startTime;

    public TimeOfDayResponse getStartTime() {
        return this.startTime;
    }

    public WeeklyMaintenanceWindowResponse(
        String day,
        String duration,
        TimeOfDayResponse startTime) {
        this.day = Objects.requireNonNull(day, "expected parameter 'day' to be non-null");
        this.duration = Objects.requireNonNull(duration, "expected parameter 'duration' to be non-null");
        this.startTime = Objects.requireNonNull(startTime, "expected parameter 'startTime' to be non-null");
    }

    private WeeklyMaintenanceWindowResponse() {
        this.day = null;
        this.duration = null;
        this.startTime = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(WeeklyMaintenanceWindowResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String day;
        private String duration;
        private TimeOfDayResponse startTime;

        public Builder() {
    	      // Empty
        }

        public Builder(WeeklyMaintenanceWindowResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.day = defaults.day;
    	      this.duration = defaults.duration;
    	      this.startTime = defaults.startTime;
        }

        public Builder day(String day) {
            this.day = Objects.requireNonNull(day);
            return this;
        }
        public Builder duration(String duration) {
            this.duration = Objects.requireNonNull(duration);
            return this;
        }
        public Builder startTime(TimeOfDayResponse startTime) {
            this.startTime = Objects.requireNonNull(startTime);
            return this;
        }        public WeeklyMaintenanceWindowResponse build() {
            return new WeeklyMaintenanceWindowResponse(day, duration, startTime);
        }
    }
}
