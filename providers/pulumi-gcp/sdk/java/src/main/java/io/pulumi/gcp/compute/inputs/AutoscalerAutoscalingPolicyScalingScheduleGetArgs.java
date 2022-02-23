// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.compute.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class AutoscalerAutoscalingPolicyScalingScheduleGetArgs extends io.pulumi.resources.ResourceArgs {

    public static final AutoscalerAutoscalingPolicyScalingScheduleGetArgs Empty = new AutoscalerAutoscalingPolicyScalingScheduleGetArgs();

    /**
     * An optional description of this resource.
     * 
     */
    @InputImport(name="description")
      private final @Nullable Input<String> description;

    public Input<String> getDescription() {
        return this.description == null ? Input.empty() : this.description;
    }

    /**
     * A boolean value that specifies if a scaling schedule can influence autoscaler recommendations. If set to true, then a scaling schedule has no effect.
     * 
     */
    @InputImport(name="disabled")
      private final @Nullable Input<Boolean> disabled;

    public Input<Boolean> getDisabled() {
        return this.disabled == null ? Input.empty() : this.disabled;
    }

    /**
     * The duration of time intervals (in seconds) for which this scaling schedule will be running. The minimum allowed value is 300.
     * 
     */
    @InputImport(name="durationSec", required=true)
      private final Input<Integer> durationSec;

    public Input<Integer> getDurationSec() {
        return this.durationSec;
    }

    /**
     * Minimum number of VM instances that autoscaler will recommend in time intervals starting according to schedule.
     * 
     */
    @InputImport(name="minRequiredReplicas", required=true)
      private final Input<Integer> minRequiredReplicas;

    public Input<Integer> getMinRequiredReplicas() {
        return this.minRequiredReplicas;
    }

    /**
     * The identifier for this object. Format specified above.
     * 
     */
    @InputImport(name="name", required=true)
      private final Input<String> name;

    public Input<String> getName() {
        return this.name;
    }

    /**
     * The start timestamps of time intervals when this scaling schedule should provide a scaling signal. This field uses the extended cron format (with an optional year field).
     * 
     */
    @InputImport(name="schedule", required=true)
      private final Input<String> schedule;

    public Input<String> getSchedule() {
        return this.schedule;
    }

    /**
     * The time zone to be used when interpreting the schedule. The value of this field must be a time zone name from the tz database: http://en.wikipedia.org/wiki/Tz_database.
     * 
     */
    @InputImport(name="timeZone")
      private final @Nullable Input<String> timeZone;

    public Input<String> getTimeZone() {
        return this.timeZone == null ? Input.empty() : this.timeZone;
    }

    public AutoscalerAutoscalingPolicyScalingScheduleGetArgs(
        @Nullable Input<String> description,
        @Nullable Input<Boolean> disabled,
        Input<Integer> durationSec,
        Input<Integer> minRequiredReplicas,
        Input<String> name,
        Input<String> schedule,
        @Nullable Input<String> timeZone) {
        this.description = description;
        this.disabled = disabled;
        this.durationSec = Objects.requireNonNull(durationSec, "expected parameter 'durationSec' to be non-null");
        this.minRequiredReplicas = Objects.requireNonNull(minRequiredReplicas, "expected parameter 'minRequiredReplicas' to be non-null");
        this.name = Objects.requireNonNull(name, "expected parameter 'name' to be non-null");
        this.schedule = Objects.requireNonNull(schedule, "expected parameter 'schedule' to be non-null");
        this.timeZone = timeZone;
    }

    private AutoscalerAutoscalingPolicyScalingScheduleGetArgs() {
        this.description = Input.empty();
        this.disabled = Input.empty();
        this.durationSec = Input.empty();
        this.minRequiredReplicas = Input.empty();
        this.name = Input.empty();
        this.schedule = Input.empty();
        this.timeZone = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(AutoscalerAutoscalingPolicyScalingScheduleGetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<String> description;
        private @Nullable Input<Boolean> disabled;
        private Input<Integer> durationSec;
        private Input<Integer> minRequiredReplicas;
        private Input<String> name;
        private Input<String> schedule;
        private @Nullable Input<String> timeZone;

        public Builder() {
    	      // Empty
        }

        public Builder(AutoscalerAutoscalingPolicyScalingScheduleGetArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.description = defaults.description;
    	      this.disabled = defaults.disabled;
    	      this.durationSec = defaults.durationSec;
    	      this.minRequiredReplicas = defaults.minRequiredReplicas;
    	      this.name = defaults.name;
    	      this.schedule = defaults.schedule;
    	      this.timeZone = defaults.timeZone;
        }

        public Builder setDescription(@Nullable Input<String> description) {
            this.description = description;
            return this;
        }

        public Builder setDescription(@Nullable String description) {
            this.description = Input.ofNullable(description);
            return this;
        }

        public Builder setDisabled(@Nullable Input<Boolean> disabled) {
            this.disabled = disabled;
            return this;
        }

        public Builder setDisabled(@Nullable Boolean disabled) {
            this.disabled = Input.ofNullable(disabled);
            return this;
        }

        public Builder setDurationSec(Input<Integer> durationSec) {
            this.durationSec = Objects.requireNonNull(durationSec);
            return this;
        }

        public Builder setDurationSec(Integer durationSec) {
            this.durationSec = Input.of(Objects.requireNonNull(durationSec));
            return this;
        }

        public Builder setMinRequiredReplicas(Input<Integer> minRequiredReplicas) {
            this.minRequiredReplicas = Objects.requireNonNull(minRequiredReplicas);
            return this;
        }

        public Builder setMinRequiredReplicas(Integer minRequiredReplicas) {
            this.minRequiredReplicas = Input.of(Objects.requireNonNull(minRequiredReplicas));
            return this;
        }

        public Builder setName(Input<String> name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }

        public Builder setName(String name) {
            this.name = Input.of(Objects.requireNonNull(name));
            return this;
        }

        public Builder setSchedule(Input<String> schedule) {
            this.schedule = Objects.requireNonNull(schedule);
            return this;
        }

        public Builder setSchedule(String schedule) {
            this.schedule = Input.of(Objects.requireNonNull(schedule));
            return this;
        }

        public Builder setTimeZone(@Nullable Input<String> timeZone) {
            this.timeZone = timeZone;
            return this;
        }

        public Builder setTimeZone(@Nullable String timeZone) {
            this.timeZone = Input.ofNullable(timeZone);
            return this;
        }
        public AutoscalerAutoscalingPolicyScalingScheduleGetArgs build() {
            return new AutoscalerAutoscalingPolicyScalingScheduleGetArgs(description, disabled, durationSec, minRequiredReplicas, name, schedule, timeZone);
        }
    }
}
