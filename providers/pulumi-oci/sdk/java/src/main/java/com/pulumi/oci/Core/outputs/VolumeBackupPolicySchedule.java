// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.oci.Core.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class VolumeBackupPolicySchedule {
    /**
     * @return (Updatable) The type of volume backup to create.
     * 
     */
    private final String backupType;
    /**
     * @return (Updatable) The day of the month to schedule the volume backup.
     * 
     */
    private final @Nullable Integer dayOfMonth;
    /**
     * @return (Updatable) The day of the week to schedule the volume backup.
     * 
     */
    private final @Nullable String dayOfWeek;
    /**
     * @return (Updatable) The hour of the day to schedule the volume backup.
     * 
     */
    private final @Nullable Integer hourOfDay;
    /**
     * @return (Updatable) The month of the year to schedule the volume backup.
     * 
     */
    private final @Nullable String month;
    /**
     * @return (Updatable) The number of seconds that the volume backup start time should be shifted from the default interval boundaries specified by the period. The volume backup start time is the frequency start time plus the offset.
     * 
     */
    private final @Nullable Integer offsetSeconds;
    /**
     * @return (Updatable) Indicates how the offset is defined. If value is `STRUCTURED`, then `hourOfDay`, `dayOfWeek`, `dayOfMonth`, and `month` fields are used and `offsetSeconds` will be ignored in requests and users should ignore its value from the responses.
     * 
     */
    private final @Nullable String offsetType;
    /**
     * @return (Updatable) The volume backup frequency.
     * 
     */
    private final String period;
    /**
     * @return (Updatable) How long, in seconds, to keep the volume backups created by this schedule.
     * 
     */
    private final Integer retentionSeconds;
    /**
     * @return (Updatable) Specifies what time zone is the schedule in
     * enum:
     * - `UTC`
     * - `REGIONAL_DATA_CENTER_TIME`
     * 
     */
    private final @Nullable String timeZone;

    @CustomType.Constructor
    private VolumeBackupPolicySchedule(
        @CustomType.Parameter("backupType") String backupType,
        @CustomType.Parameter("dayOfMonth") @Nullable Integer dayOfMonth,
        @CustomType.Parameter("dayOfWeek") @Nullable String dayOfWeek,
        @CustomType.Parameter("hourOfDay") @Nullable Integer hourOfDay,
        @CustomType.Parameter("month") @Nullable String month,
        @CustomType.Parameter("offsetSeconds") @Nullable Integer offsetSeconds,
        @CustomType.Parameter("offsetType") @Nullable String offsetType,
        @CustomType.Parameter("period") String period,
        @CustomType.Parameter("retentionSeconds") Integer retentionSeconds,
        @CustomType.Parameter("timeZone") @Nullable String timeZone) {
        this.backupType = backupType;
        this.dayOfMonth = dayOfMonth;
        this.dayOfWeek = dayOfWeek;
        this.hourOfDay = hourOfDay;
        this.month = month;
        this.offsetSeconds = offsetSeconds;
        this.offsetType = offsetType;
        this.period = period;
        this.retentionSeconds = retentionSeconds;
        this.timeZone = timeZone;
    }

    /**
     * @return (Updatable) The type of volume backup to create.
     * 
     */
    public String backupType() {
        return this.backupType;
    }
    /**
     * @return (Updatable) The day of the month to schedule the volume backup.
     * 
     */
    public Optional<Integer> dayOfMonth() {
        return Optional.ofNullable(this.dayOfMonth);
    }
    /**
     * @return (Updatable) The day of the week to schedule the volume backup.
     * 
     */
    public Optional<String> dayOfWeek() {
        return Optional.ofNullable(this.dayOfWeek);
    }
    /**
     * @return (Updatable) The hour of the day to schedule the volume backup.
     * 
     */
    public Optional<Integer> hourOfDay() {
        return Optional.ofNullable(this.hourOfDay);
    }
    /**
     * @return (Updatable) The month of the year to schedule the volume backup.
     * 
     */
    public Optional<String> month() {
        return Optional.ofNullable(this.month);
    }
    /**
     * @return (Updatable) The number of seconds that the volume backup start time should be shifted from the default interval boundaries specified by the period. The volume backup start time is the frequency start time plus the offset.
     * 
     */
    public Optional<Integer> offsetSeconds() {
        return Optional.ofNullable(this.offsetSeconds);
    }
    /**
     * @return (Updatable) Indicates how the offset is defined. If value is `STRUCTURED`, then `hourOfDay`, `dayOfWeek`, `dayOfMonth`, and `month` fields are used and `offsetSeconds` will be ignored in requests and users should ignore its value from the responses.
     * 
     */
    public Optional<String> offsetType() {
        return Optional.ofNullable(this.offsetType);
    }
    /**
     * @return (Updatable) The volume backup frequency.
     * 
     */
    public String period() {
        return this.period;
    }
    /**
     * @return (Updatable) How long, in seconds, to keep the volume backups created by this schedule.
     * 
     */
    public Integer retentionSeconds() {
        return this.retentionSeconds;
    }
    /**
     * @return (Updatable) Specifies what time zone is the schedule in
     * enum:
     * - `UTC`
     * - `REGIONAL_DATA_CENTER_TIME`
     * 
     */
    public Optional<String> timeZone() {
        return Optional.ofNullable(this.timeZone);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(VolumeBackupPolicySchedule defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String backupType;
        private @Nullable Integer dayOfMonth;
        private @Nullable String dayOfWeek;
        private @Nullable Integer hourOfDay;
        private @Nullable String month;
        private @Nullable Integer offsetSeconds;
        private @Nullable String offsetType;
        private String period;
        private Integer retentionSeconds;
        private @Nullable String timeZone;

        public Builder() {
    	      // Empty
        }

        public Builder(VolumeBackupPolicySchedule defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.backupType = defaults.backupType;
    	      this.dayOfMonth = defaults.dayOfMonth;
    	      this.dayOfWeek = defaults.dayOfWeek;
    	      this.hourOfDay = defaults.hourOfDay;
    	      this.month = defaults.month;
    	      this.offsetSeconds = defaults.offsetSeconds;
    	      this.offsetType = defaults.offsetType;
    	      this.period = defaults.period;
    	      this.retentionSeconds = defaults.retentionSeconds;
    	      this.timeZone = defaults.timeZone;
        }

        public Builder backupType(String backupType) {
            this.backupType = Objects.requireNonNull(backupType);
            return this;
        }
        public Builder dayOfMonth(@Nullable Integer dayOfMonth) {
            this.dayOfMonth = dayOfMonth;
            return this;
        }
        public Builder dayOfWeek(@Nullable String dayOfWeek) {
            this.dayOfWeek = dayOfWeek;
            return this;
        }
        public Builder hourOfDay(@Nullable Integer hourOfDay) {
            this.hourOfDay = hourOfDay;
            return this;
        }
        public Builder month(@Nullable String month) {
            this.month = month;
            return this;
        }
        public Builder offsetSeconds(@Nullable Integer offsetSeconds) {
            this.offsetSeconds = offsetSeconds;
            return this;
        }
        public Builder offsetType(@Nullable String offsetType) {
            this.offsetType = offsetType;
            return this;
        }
        public Builder period(String period) {
            this.period = Objects.requireNonNull(period);
            return this;
        }
        public Builder retentionSeconds(Integer retentionSeconds) {
            this.retentionSeconds = Objects.requireNonNull(retentionSeconds);
            return this;
        }
        public Builder timeZone(@Nullable String timeZone) {
            this.timeZone = timeZone;
            return this;
        }        public VolumeBackupPolicySchedule build() {
            return new VolumeBackupPolicySchedule(backupType, dayOfMonth, dayOfWeek, hourOfDay, month, offsetSeconds, offsetType, period, retentionSeconds, timeZone);
        }
    }
}
