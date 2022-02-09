// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.recoveryservices.inputs;

import io.pulumi.azurenative.recoveryservices.inputs.RetentionDurationResponse;
import io.pulumi.core.internal.annotations.InputImport;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class WeeklyRetentionScheduleResponse extends io.pulumi.resources.InvokeArgs {

    public static final WeeklyRetentionScheduleResponse Empty = new WeeklyRetentionScheduleResponse();

    @InputImport(name="daysOfTheWeek")
    private final @Nullable List<String> daysOfTheWeek;

    public List<String> getDaysOfTheWeek() {
        return this.daysOfTheWeek == null ? List.of() : this.daysOfTheWeek;
    }

    @InputImport(name="retentionDuration")
    private final @Nullable RetentionDurationResponse retentionDuration;

    public Optional<RetentionDurationResponse> getRetentionDuration() {
        return this.retentionDuration == null ? Optional.empty() : Optional.ofNullable(this.retentionDuration);
    }

    @InputImport(name="retentionTimes")
    private final @Nullable List<String> retentionTimes;

    public List<String> getRetentionTimes() {
        return this.retentionTimes == null ? List.of() : this.retentionTimes;
    }

    public WeeklyRetentionScheduleResponse(
        @Nullable List<String> daysOfTheWeek,
        @Nullable RetentionDurationResponse retentionDuration,
        @Nullable List<String> retentionTimes) {
        this.daysOfTheWeek = daysOfTheWeek;
        this.retentionDuration = retentionDuration;
        this.retentionTimes = retentionTimes;
    }

    private WeeklyRetentionScheduleResponse() {
        this.daysOfTheWeek = List.of();
        this.retentionDuration = null;
        this.retentionTimes = List.of();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(WeeklyRetentionScheduleResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable List<String> daysOfTheWeek;
        private @Nullable RetentionDurationResponse retentionDuration;
        private @Nullable List<String> retentionTimes;

        public Builder() {
    	      // Empty
        }

        public Builder(WeeklyRetentionScheduleResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.daysOfTheWeek = defaults.daysOfTheWeek;
    	      this.retentionDuration = defaults.retentionDuration;
    	      this.retentionTimes = defaults.retentionTimes;
        }

        public Builder setDaysOfTheWeek(@Nullable List<String> daysOfTheWeek) {
            this.daysOfTheWeek = daysOfTheWeek;
            return this;
        }

        public Builder setRetentionDuration(@Nullable RetentionDurationResponse retentionDuration) {
            this.retentionDuration = retentionDuration;
            return this;
        }

        public Builder setRetentionTimes(@Nullable List<String> retentionTimes) {
            this.retentionTimes = retentionTimes;
            return this;
        }

        public WeeklyRetentionScheduleResponse build() {
            return new WeeklyRetentionScheduleResponse(daysOfTheWeek, retentionDuration, retentionTimes);
        }
    }
}
