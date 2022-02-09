// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.containerregistry.inputs;

import io.pulumi.core.internal.annotations.InputImport;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class TimerTriggerDescriptorResponse extends io.pulumi.resources.InvokeArgs {

    public static final TimerTriggerDescriptorResponse Empty = new TimerTriggerDescriptorResponse();

    @InputImport(name="scheduleOccurrence")
    private final @Nullable String scheduleOccurrence;

    public Optional<String> getScheduleOccurrence() {
        return this.scheduleOccurrence == null ? Optional.empty() : Optional.ofNullable(this.scheduleOccurrence);
    }

    @InputImport(name="timerTriggerName")
    private final @Nullable String timerTriggerName;

    public Optional<String> getTimerTriggerName() {
        return this.timerTriggerName == null ? Optional.empty() : Optional.ofNullable(this.timerTriggerName);
    }

    public TimerTriggerDescriptorResponse(
        @Nullable String scheduleOccurrence,
        @Nullable String timerTriggerName) {
        this.scheduleOccurrence = scheduleOccurrence;
        this.timerTriggerName = timerTriggerName;
    }

    private TimerTriggerDescriptorResponse() {
        this.scheduleOccurrence = null;
        this.timerTriggerName = null;
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
