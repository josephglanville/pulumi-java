// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.logic.inputs;

import io.pulumi.core.internal.annotations.InputImport;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class RecurrenceScheduleOccurrenceResponse extends io.pulumi.resources.InvokeArgs {

    public static final RecurrenceScheduleOccurrenceResponse Empty = new RecurrenceScheduleOccurrenceResponse();

    @InputImport(name="day")
    private final @Nullable String day;

    public Optional<String> getDay() {
        return this.day == null ? Optional.empty() : Optional.ofNullable(this.day);
    }

    @InputImport(name="occurrence")
    private final @Nullable Integer occurrence;

    public Optional<Integer> getOccurrence() {
        return this.occurrence == null ? Optional.empty() : Optional.ofNullable(this.occurrence);
    }

    public RecurrenceScheduleOccurrenceResponse(
        @Nullable String day,
        @Nullable Integer occurrence) {
        this.day = day;
        this.occurrence = occurrence;
    }

    private RecurrenceScheduleOccurrenceResponse() {
        this.day = null;
        this.occurrence = null;
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
