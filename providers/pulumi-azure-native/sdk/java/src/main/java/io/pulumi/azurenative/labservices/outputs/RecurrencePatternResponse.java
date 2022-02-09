// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.labservices.outputs;

import io.pulumi.core.internal.annotations.OutputCustomType;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class RecurrencePatternResponse {
    private final String expirationDate;
    private final String frequency;
    private final @Nullable Integer interval;
    private final @Nullable List<String> weekDays;

    @OutputCustomType.Constructor({"expirationDate","frequency","interval","weekDays"})
    private RecurrencePatternResponse(
        String expirationDate,
        String frequency,
        @Nullable Integer interval,
        @Nullable List<String> weekDays) {
        this.expirationDate = Objects.requireNonNull(expirationDate);
        this.frequency = Objects.requireNonNull(frequency);
        this.interval = interval;
        this.weekDays = weekDays;
    }

    public String getExpirationDate() {
        return this.expirationDate;
    }
    public String getFrequency() {
        return this.frequency;
    }
    public Optional<Integer> getInterval() {
        return Optional.ofNullable(this.interval);
    }
    public List<String> getWeekDays() {
        return this.weekDays == null ? List.of() : this.weekDays;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(RecurrencePatternResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String expirationDate;
        private String frequency;
        private @Nullable Integer interval;
        private @Nullable List<String> weekDays;

        public Builder() {
    	      // Empty
        }

        public Builder(RecurrencePatternResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.expirationDate = defaults.expirationDate;
    	      this.frequency = defaults.frequency;
    	      this.interval = defaults.interval;
    	      this.weekDays = defaults.weekDays;
        }

        public Builder setExpirationDate(String expirationDate) {
            this.expirationDate = Objects.requireNonNull(expirationDate);
            return this;
        }

        public Builder setFrequency(String frequency) {
            this.frequency = Objects.requireNonNull(frequency);
            return this;
        }

        public Builder setInterval(@Nullable Integer interval) {
            this.interval = interval;
            return this;
        }

        public Builder setWeekDays(@Nullable List<String> weekDays) {
            this.weekDays = weekDays;
            return this;
        }

        public RecurrencePatternResponse build() {
            return new RecurrencePatternResponse(expirationDate, frequency, interval, weekDays);
        }
    }
}
