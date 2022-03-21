// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.netapp.inputs;

import io.pulumi.core.annotations.Import;
import java.lang.Double;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Monthly Schedule properties
 * 
 */
public final class MonthlyScheduleResponse extends io.pulumi.resources.InvokeArgs {

    public static final MonthlyScheduleResponse Empty = new MonthlyScheduleResponse();

    /**
     * Indicates which days of the month snapshot should be taken. A comma delimited string.
     * 
     */
    @Import(name="daysOfMonth")
      private final @Nullable String daysOfMonth;

    public Optional<String> getDaysOfMonth() {
        return this.daysOfMonth == null ? Optional.empty() : Optional.ofNullable(this.daysOfMonth);
    }

    /**
     * Indicates which hour in UTC timezone a snapshot should be taken
     * 
     */
    @Import(name="hour")
      private final @Nullable Integer hour;

    public Optional<Integer> getHour() {
        return this.hour == null ? Optional.empty() : Optional.ofNullable(this.hour);
    }

    /**
     * Indicates which minute snapshot should be taken
     * 
     */
    @Import(name="minute")
      private final @Nullable Integer minute;

    public Optional<Integer> getMinute() {
        return this.minute == null ? Optional.empty() : Optional.ofNullable(this.minute);
    }

    /**
     * Monthly snapshot count to keep
     * 
     */
    @Import(name="snapshotsToKeep")
      private final @Nullable Integer snapshotsToKeep;

    public Optional<Integer> getSnapshotsToKeep() {
        return this.snapshotsToKeep == null ? Optional.empty() : Optional.ofNullable(this.snapshotsToKeep);
    }

    /**
     * Resource size in bytes, current storage usage for the volume in bytes
     * 
     */
    @Import(name="usedBytes")
      private final @Nullable Double usedBytes;

    public Optional<Double> getUsedBytes() {
        return this.usedBytes == null ? Optional.empty() : Optional.ofNullable(this.usedBytes);
    }

    public MonthlyScheduleResponse(
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

    private MonthlyScheduleResponse() {
        this.daysOfMonth = null;
        this.hour = null;
        this.minute = null;
        this.snapshotsToKeep = null;
        this.usedBytes = null;
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

        public Builder daysOfMonth(@Nullable String daysOfMonth) {
            this.daysOfMonth = daysOfMonth;
            return this;
        }
        public Builder hour(@Nullable Integer hour) {
            this.hour = hour;
            return this;
        }
        public Builder minute(@Nullable Integer minute) {
            this.minute = minute;
            return this;
        }
        public Builder snapshotsToKeep(@Nullable Integer snapshotsToKeep) {
            this.snapshotsToKeep = snapshotsToKeep;
            return this;
        }
        public Builder usedBytes(@Nullable Double usedBytes) {
            this.usedBytes = usedBytes;
            return this;
        }        public MonthlyScheduleResponse build() {
            return new MonthlyScheduleResponse(daysOfMonth, hour, minute, snapshotsToKeep, usedBytes);
        }
    }
}
