// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.netapp.outputs;

import io.pulumi.core.internal.annotations.OutputCustomType;
import java.lang.Double;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class MonthlyScheduleResponse {
    private final @Nullable String daysOfMonth;
    private final @Nullable Integer hour;
    private final @Nullable Integer minute;
    private final @Nullable Integer snapshotsToKeep;
    private final @Nullable Double usedBytes;

    @OutputCustomType.Constructor({"daysOfMonth","hour","minute","snapshotsToKeep","usedBytes"})
    private MonthlyScheduleResponse(
        @Nullable String daysOfMonth,
        @Nullable Integer hour,
        @Nullable Integer minute,
        @Nullable Integer snapshotsToKeep,
        @Nullable Double usedBytes) {
        this.daysOfMonth = daysOfMonth;
        this.hour = hour;
        this.minute = minute;
        this.snapshotsToKeep = snapshotsToKeep;
        this.usedBytes = usedBytes;
    }

    public Optional<String> getDaysOfMonth() {
        return Optional.ofNullable(this.daysOfMonth);
    }
    public Optional<Integer> getHour() {
        return Optional.ofNullable(this.hour);
    }
    public Optional<Integer> getMinute() {
        return Optional.ofNullable(this.minute);
    }
    public Optional<Integer> getSnapshotsToKeep() {
        return Optional.ofNullable(this.snapshotsToKeep);
    }
    public Optional<Double> getUsedBytes() {
        return Optional.ofNullable(this.usedBytes);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(MonthlyScheduleResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String daysOfMonth;
        private @Nullable Integer hour;
        private @Nullable Integer minute;
        private @Nullable Integer snapshotsToKeep;
        private @Nullable Double usedBytes;

        public Builder() {
    	      // Empty
        }

        public Builder(MonthlyScheduleResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.daysOfMonth = defaults.daysOfMonth;
    	      this.hour = defaults.hour;
    	      this.minute = defaults.minute;
    	      this.snapshotsToKeep = defaults.snapshotsToKeep;
    	      this.usedBytes = defaults.usedBytes;
        }

        public Builder setDaysOfMonth(@Nullable String daysOfMonth) {
            this.daysOfMonth = daysOfMonth;
            return this;
        }

        public Builder setHour(@Nullable Integer hour) {
            this.hour = hour;
            return this;
        }

        public Builder setMinute(@Nullable Integer minute) {
            this.minute = minute;
            return this;
        }

        public Builder setSnapshotsToKeep(@Nullable Integer snapshotsToKeep) {
            this.snapshotsToKeep = snapshotsToKeep;
            return this;
        }

        public Builder setUsedBytes(@Nullable Double usedBytes) {
            this.usedBytes = usedBytes;
            return this;
        }

        public MonthlyScheduleResponse build() {
            return new MonthlyScheduleResponse(daysOfMonth, hour, minute, snapshotsToKeep, usedBytes);
        }
    }
}
