// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.containerservice.inputs;

import io.pulumi.core.internal.annotations.InputImport;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class TimeInWeekResponse extends io.pulumi.resources.InvokeArgs {

    public static final TimeInWeekResponse Empty = new TimeInWeekResponse();

    @InputImport(name="day")
    private final @Nullable String day;

    public Optional<String> getDay() {
        return this.day == null ? Optional.empty() : Optional.ofNullable(this.day);
    }

    @InputImport(name="hourSlots")
    private final @Nullable List<Integer> hourSlots;

    public List<Integer> getHourSlots() {
        return this.hourSlots == null ? List.of() : this.hourSlots;
    }

    public TimeInWeekResponse(
        @Nullable String day,
        @Nullable List<Integer> hourSlots) {
        this.day = day;
        this.hourSlots = hourSlots;
    }

    private TimeInWeekResponse() {
        this.day = null;
        this.hourSlots = List.of();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(TimeInWeekResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String day;
        private @Nullable List<Integer> hourSlots;

        public Builder() {
    	      // Empty
        }

        public Builder(TimeInWeekResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.day = defaults.day;
    	      this.hourSlots = defaults.hourSlots;
        }

        public Builder setDay(@Nullable String day) {
            this.day = day;
            return this;
        }

        public Builder setHourSlots(@Nullable List<Integer> hourSlots) {
            this.hourSlots = hourSlots;
            return this;
        }

        public TimeInWeekResponse build() {
            return new TimeInWeekResponse(day, hourSlots);
        }
    }
}
