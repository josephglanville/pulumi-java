// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.insights.outputs;

import io.pulumi.azurenative.insights.outputs.RecurrentScheduleResponse;
import io.pulumi.core.internal.annotations.OutputCustomType;
import java.lang.String;
import java.util.Objects;

@OutputCustomType
public final class RecurrenceResponse {
    private final String frequency;
    private final RecurrentScheduleResponse schedule;

    @OutputCustomType.Constructor({"frequency","schedule"})
    private RecurrenceResponse(
        String frequency,
        RecurrentScheduleResponse schedule) {
        this.frequency = Objects.requireNonNull(frequency);
        this.schedule = Objects.requireNonNull(schedule);
    }

    public String getFrequency() {
        return this.frequency;
    }
    public RecurrentScheduleResponse getSchedule() {
        return this.schedule;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(RecurrenceResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String frequency;
        private RecurrentScheduleResponse schedule;

        public Builder() {
    	      // Empty
        }

        public Builder(RecurrenceResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.frequency = defaults.frequency;
    	      this.schedule = defaults.schedule;
        }

        public Builder setFrequency(String frequency) {
            this.frequency = Objects.requireNonNull(frequency);
            return this;
        }

        public Builder setSchedule(RecurrentScheduleResponse schedule) {
            this.schedule = Objects.requireNonNull(schedule);
            return this;
        }

        public RecurrenceResponse build() {
            return new RecurrenceResponse(frequency, schedule);
        }
    }
}
