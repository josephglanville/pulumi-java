// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.containerregistry.outputs;

import io.pulumi.core.internal.annotations.OutputCustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class TimerTriggerDescriptorResponse {
    private final @Nullable String scheduleOccurrence;
    private final @Nullable String timerTriggerName;

    @OutputCustomType.Constructor({"scheduleOccurrence","timerTriggerName"})
    private TimerTriggerDescriptorResponse(
        @Nullable String scheduleOccurrence,
        @Nullable String timerTriggerName) {
        this.scheduleOccurrence = scheduleOccurrence;
        this.timerTriggerName = timerTriggerName;
    }

    public Optional<String> getScheduleOccurrence() {
        return Optional.ofNullable(this.scheduleOccurrence);
    }
    public Optional<String> getTimerTriggerName() {
        return Optional.ofNullable(this.timerTriggerName);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(TimerTriggerDescriptorResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String scheduleOccurrence;
        private @Nullable String timerTriggerName;

        public Builder() {
    	      // Empty
        }

        public Builder(TimerTriggerDescriptorResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.scheduleOccurrence = defaults.scheduleOccurrence;
    	      this.timerTriggerName = defaults.timerTriggerName;
        }

        public Builder setScheduleOccurrence(@Nullable String scheduleOccurrence) {
            this.scheduleOccurrence = scheduleOccurrence;
            return this;
        }

        public Builder setTimerTriggerName(@Nullable String timerTriggerName) {
            this.timerTriggerName = timerTriggerName;
            return this;
        }

        public TimerTriggerDescriptorResponse build() {
            return new TimerTriggerDescriptorResponse(scheduleOccurrence, timerTriggerName);
        }
    }
}
