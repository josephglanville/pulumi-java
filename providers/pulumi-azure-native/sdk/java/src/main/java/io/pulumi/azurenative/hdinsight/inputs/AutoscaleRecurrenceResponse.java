// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.hdinsight.inputs;

import io.pulumi.azurenative.hdinsight.inputs.AutoscaleScheduleResponse;
import io.pulumi.core.internal.annotations.InputImport;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class AutoscaleRecurrenceResponse extends io.pulumi.resources.InvokeArgs {

    public static final AutoscaleRecurrenceResponse Empty = new AutoscaleRecurrenceResponse();

    @InputImport(name="schedule")
    private final @Nullable List<AutoscaleScheduleResponse> schedule;

    public List<AutoscaleScheduleResponse> getSchedule() {
        return this.schedule == null ? List.of() : this.schedule;
    }

    @InputImport(name="timeZone")
    private final @Nullable String timeZone;

    public Optional<String> getTimeZone() {
        return this.timeZone == null ? Optional.empty() : Optional.ofNullable(this.timeZone);
    }

    public AutoscaleRecurrenceResponse(
        @Nullable List<AutoscaleScheduleResponse> schedule,
        @Nullable String timeZone) {
        this.schedule = schedule;
        this.timeZone = timeZone;
    }

    private AutoscaleRecurrenceResponse() {
        this.schedule = List.of();
        this.timeZone = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(AutoscaleRecurrenceResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable List<AutoscaleScheduleResponse> schedule;
        private @Nullable String timeZone;

        public Builder() {
    	      // Empty
        }

        public Builder(AutoscaleRecurrenceResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.schedule = defaults.schedule;
    	      this.timeZone = defaults.timeZone;
        }

        public Builder setSchedule(@Nullable List<AutoscaleScheduleResponse> schedule) {
            this.schedule = schedule;
            return this;
        }

        public Builder setTimeZone(@Nullable String timeZone) {
            this.timeZone = timeZone;
            return this;
        }

        public AutoscaleRecurrenceResponse build() {
            return new AutoscaleRecurrenceResponse(schedule, timeZone);
        }
    }
}