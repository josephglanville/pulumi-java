// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.logic.outputs;

import io.pulumi.core.internal.annotations.OutputCustomType;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class RecurrenceScheduleOccurrenceResponse {
    private final @Nullable String day;
    private final @Nullable Integer occurrence;

    @OutputCustomType.Constructor({"day","occurrence"})
    private RecurrenceScheduleOccurrenceResponse(
        @Nullable String day,
        @Nullable Integer occurrence) {
        this.day = day;
        this.occurrence = occurrence;
    }

    public Optional<String> getDay() {
        return Optional.ofNullable(this.day);
    }
    public Optional<Integer> getOccurrence() {
        return Optional.ofNullable(this.occurrence);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(RecurrenceScheduleOccurrenceResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String day;
        private @Nullable Integer occurrence;

        public Builder() {
    	      // Empty
        }

        public Builder(RecurrenceScheduleOccurrenceResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.day = defaults.day;
    	      this.occurrence = defaults.occurrence;
        }

        public Builder setDay(@Nullable String day) {
            this.day = day;
            return this;
        }

        public Builder setOccurrence(@Nullable Integer occurrence) {
            this.occurrence = occurrence;
            return this;
        }

        public RecurrenceScheduleOccurrenceResponse build() {
            return new RecurrenceScheduleOccurrenceResponse(day, occurrence);
        }
    }
}
