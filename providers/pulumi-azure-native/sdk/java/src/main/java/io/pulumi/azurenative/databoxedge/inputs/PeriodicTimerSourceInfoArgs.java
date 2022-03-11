// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.databoxedge.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * Periodic timer event source.
 * 
 */
public final class PeriodicTimerSourceInfoArgs extends io.pulumi.resources.ResourceArgs {

    public static final PeriodicTimerSourceInfoArgs Empty = new PeriodicTimerSourceInfoArgs();

    /**
     * Periodic frequency at which timer event needs to be raised. Supports daily, hourly, minutes, and seconds.
     * 
     */
    @InputImport(name="schedule", required=true)
      private final Output<String> schedule;

    public Output<String> getSchedule() {
        return this.schedule;
    }

    /**
     * The time of the day that results in a valid trigger. Schedule is computed with reference to the time specified upto seconds. If timezone is not specified the time will considered to be in device timezone. The value will always be returned as UTC time.
     * 
     */
    @InputImport(name="startTime", required=true)
      private final Output<String> startTime;

    public Output<String> getStartTime() {
        return this.startTime;
    }

    /**
     * Topic where periodic events are published to IoT device.
     * 
     */
    @InputImport(name="topic")
      private final @Nullable Output<String> topic;

    public Output<String> getTopic() {
        return this.topic == null ? Output.empty() : this.topic;
    }

    public PeriodicTimerSourceInfoArgs(
        Output<String> schedule,
        Output<String> startTime,
        @Nullable Output<String> topic) {
        this.schedule = Objects.requireNonNull(schedule, "expected parameter 'schedule' to be non-null");
        this.startTime = Objects.requireNonNull(startTime, "expected parameter 'startTime' to be non-null");
        this.topic = topic;
    }

    private PeriodicTimerSourceInfoArgs() {
        this.schedule = Output.empty();
        this.startTime = Output.empty();
        this.topic = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(PeriodicTimerSourceInfoArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Output<String> schedule;
        private Output<String> startTime;
        private @Nullable Output<String> topic;

        public Builder() {
    	      // Empty
        }

        public Builder(PeriodicTimerSourceInfoArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.schedule = defaults.schedule;
    	      this.startTime = defaults.startTime;
    	      this.topic = defaults.topic;
        }

        public Builder schedule(Output<String> schedule) {
            this.schedule = Objects.requireNonNull(schedule);
            return this;
        }

        public Builder schedule(String schedule) {
            this.schedule = Output.of(Objects.requireNonNull(schedule));
            return this;
        }

        public Builder startTime(Output<String> startTime) {
            this.startTime = Objects.requireNonNull(startTime);
            return this;
        }

        public Builder startTime(String startTime) {
            this.startTime = Output.of(Objects.requireNonNull(startTime));
            return this;
        }

        public Builder topic(@Nullable Output<String> topic) {
            this.topic = topic;
            return this;
        }

        public Builder topic(@Nullable String topic) {
            this.topic = Output.ofNullable(topic);
            return this;
        }
        public PeriodicTimerSourceInfoArgs build() {
            return new PeriodicTimerSourceInfoArgs(schedule, startTime, topic);
        }
    }
}
