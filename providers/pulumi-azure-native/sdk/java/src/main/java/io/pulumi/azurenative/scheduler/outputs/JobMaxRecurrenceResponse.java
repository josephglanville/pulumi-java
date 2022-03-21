// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.scheduler.outputs;

import io.pulumi.core.annotations.CustomType;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class JobMaxRecurrenceResponse {
    /**
     * Gets or sets the frequency of recurrence (second, minute, hour, day, week, month).
     * 
     */
    private final @Nullable String frequency;
    /**
     * Gets or sets the interval between retries.
     * 
     */
    private final @Nullable Integer interval;

    @CustomType.Constructor
    private JobMaxRecurrenceResponse(
        @CustomType.Parameter("frequency") @Nullable String frequency,
        @CustomType.Parameter("interval") @Nullable Integer interval) {
        this.frequency = frequency;
        this.interval = interval;
    }

    /**
     * Gets or sets the frequency of recurrence (second, minute, hour, day, week, month).
     * 
    */
    public Optional<String> getFrequency() {
        return Optional.ofNullable(this.frequency);
    }
    /**
     * Gets or sets the interval between retries.
     * 
    */
    public Optional<Integer> getInterval() {
        return Optional.ofNullable(this.interval);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(JobMaxRecurrenceResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String frequency;
        private @Nullable Integer interval;

        public Builder() {
    	      // Empty
        }

        public Builder(JobMaxRecurrenceResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.frequency = defaults.frequency;
    	      this.interval = defaults.interval;
        }

        public Builder frequency(@Nullable String frequency) {
            this.frequency = frequency;
            return this;
        }
        public Builder interval(@Nullable Integer interval) {
            this.interval = interval;
            return this;
        }        public JobMaxRecurrenceResponse build() {
            return new JobMaxRecurrenceResponse(frequency, interval);
        }
    }
}
