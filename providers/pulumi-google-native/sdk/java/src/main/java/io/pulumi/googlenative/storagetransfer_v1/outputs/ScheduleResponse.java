// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.storagetransfer_v1.outputs;

import io.pulumi.core.annotations.CustomType;
import io.pulumi.googlenative.storagetransfer_v1.outputs.DateResponse;
import io.pulumi.googlenative.storagetransfer_v1.outputs.TimeOfDayResponse;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class ScheduleResponse {
    /**
     * The time in UTC that no further transfer operations are scheduled. Combined with schedule_end_date, `end_time_of_day` specifies the end date and time for starting new transfer operations. This field must be greater than or equal to the timestamp corresponding to the combintation of schedule_start_date and start_time_of_day, and is subject to the following: * If `end_time_of_day` is not set and `schedule_end_date` is set, then a default value of `23:59:59` is used for `end_time_of_day`. * If `end_time_of_day` is set and `schedule_end_date` is not set, then INVALID_ARGUMENT is returned.
     * 
     */
    private final TimeOfDayResponse endTimeOfDay;
    /**
     * Interval between the start of each scheduled TransferOperation. If unspecified, the default value is 24 hours. This value may not be less than 1 hour.
     * 
     */
    private final String repeatInterval;
    /**
     * The last day a transfer runs. Date boundaries are determined relative to UTC time. A job runs once per 24 hours within the following guidelines: * If `schedule_end_date` and schedule_start_date are the same and in the future relative to UTC, the transfer is executed only one time. * If `schedule_end_date` is later than `schedule_start_date` and `schedule_end_date` is in the future relative to UTC, the job runs each day at start_time_of_day through `schedule_end_date`.
     * 
     */
    private final DateResponse scheduleEndDate;
    /**
     * The start date of a transfer. Date boundaries are determined relative to UTC time. If `schedule_start_date` and start_time_of_day are in the past relative to the job's creation time, the transfer starts the day after you schedule the transfer request. **Note:** When starting jobs at or near midnight UTC it is possible that a job starts later than expected. For example, if you send an outbound request on June 1 one millisecond prior to midnight UTC and the Storage Transfer Service server receives the request on June 2, then it creates a TransferJob with `schedule_start_date` set to June 2 and a `start_time_of_day` set to midnight UTC. The first scheduled TransferOperation takes place on June 3 at midnight UTC.
     * 
     */
    private final DateResponse scheduleStartDate;
    /**
     * The time in UTC that a transfer job is scheduled to run. Transfers may start later than this time. If `start_time_of_day` is not specified: * One-time transfers run immediately. * Recurring transfers run immediately, and each day at midnight UTC, through schedule_end_date. If `start_time_of_day` is specified: * One-time transfers run at the specified time. * Recurring transfers run at the specified time each day, through `schedule_end_date`.
     * 
     */
    private final TimeOfDayResponse startTimeOfDay;

    @CustomType.Constructor
    private ScheduleResponse(
        @CustomType.Parameter("endTimeOfDay") TimeOfDayResponse endTimeOfDay,
        @CustomType.Parameter("repeatInterval") String repeatInterval,
        @CustomType.Parameter("scheduleEndDate") DateResponse scheduleEndDate,
        @CustomType.Parameter("scheduleStartDate") DateResponse scheduleStartDate,
        @CustomType.Parameter("startTimeOfDay") TimeOfDayResponse startTimeOfDay) {
        this.endTimeOfDay = endTimeOfDay;
        this.repeatInterval = repeatInterval;
        this.scheduleEndDate = scheduleEndDate;
        this.scheduleStartDate = scheduleStartDate;
        this.startTimeOfDay = startTimeOfDay;
    }

    /**
     * The time in UTC that no further transfer operations are scheduled. Combined with schedule_end_date, `end_time_of_day` specifies the end date and time for starting new transfer operations. This field must be greater than or equal to the timestamp corresponding to the combintation of schedule_start_date and start_time_of_day, and is subject to the following: * If `end_time_of_day` is not set and `schedule_end_date` is set, then a default value of `23:59:59` is used for `end_time_of_day`. * If `end_time_of_day` is set and `schedule_end_date` is not set, then INVALID_ARGUMENT is returned.
     * 
    */
    public TimeOfDayResponse getEndTimeOfDay() {
        return this.endTimeOfDay;
    }
    /**
     * Interval between the start of each scheduled TransferOperation. If unspecified, the default value is 24 hours. This value may not be less than 1 hour.
     * 
    */
    public String getRepeatInterval() {
        return this.repeatInterval;
    }
    /**
     * The last day a transfer runs. Date boundaries are determined relative to UTC time. A job runs once per 24 hours within the following guidelines: * If `schedule_end_date` and schedule_start_date are the same and in the future relative to UTC, the transfer is executed only one time. * If `schedule_end_date` is later than `schedule_start_date` and `schedule_end_date` is in the future relative to UTC, the job runs each day at start_time_of_day through `schedule_end_date`.
     * 
    */
    public DateResponse getScheduleEndDate() {
        return this.scheduleEndDate;
    }
    /**
     * The start date of a transfer. Date boundaries are determined relative to UTC time. If `schedule_start_date` and start_time_of_day are in the past relative to the job's creation time, the transfer starts the day after you schedule the transfer request. **Note:** When starting jobs at or near midnight UTC it is possible that a job starts later than expected. For example, if you send an outbound request on June 1 one millisecond prior to midnight UTC and the Storage Transfer Service server receives the request on June 2, then it creates a TransferJob with `schedule_start_date` set to June 2 and a `start_time_of_day` set to midnight UTC. The first scheduled TransferOperation takes place on June 3 at midnight UTC.
     * 
    */
    public DateResponse getScheduleStartDate() {
        return this.scheduleStartDate;
    }
    /**
     * The time in UTC that a transfer job is scheduled to run. Transfers may start later than this time. If `start_time_of_day` is not specified: * One-time transfers run immediately. * Recurring transfers run immediately, and each day at midnight UTC, through schedule_end_date. If `start_time_of_day` is specified: * One-time transfers run at the specified time. * Recurring transfers run at the specified time each day, through `schedule_end_date`.
     * 
    */
    public TimeOfDayResponse getStartTimeOfDay() {
        return this.startTimeOfDay;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ScheduleResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private TimeOfDayResponse endTimeOfDay;
        private String repeatInterval;
        private DateResponse scheduleEndDate;
        private DateResponse scheduleStartDate;
        private TimeOfDayResponse startTimeOfDay;

        public Builder() {
    	      // Empty
        }

        public Builder(ScheduleResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.endTimeOfDay = defaults.endTimeOfDay;
    	      this.repeatInterval = defaults.repeatInterval;
    	      this.scheduleEndDate = defaults.scheduleEndDate;
    	      this.scheduleStartDate = defaults.scheduleStartDate;
    	      this.startTimeOfDay = defaults.startTimeOfDay;
        }

        public Builder endTimeOfDay(TimeOfDayResponse endTimeOfDay) {
            this.endTimeOfDay = Objects.requireNonNull(endTimeOfDay);
            return this;
        }
        public Builder repeatInterval(String repeatInterval) {
            this.repeatInterval = Objects.requireNonNull(repeatInterval);
            return this;
        }
        public Builder scheduleEndDate(DateResponse scheduleEndDate) {
            this.scheduleEndDate = Objects.requireNonNull(scheduleEndDate);
            return this;
        }
        public Builder scheduleStartDate(DateResponse scheduleStartDate) {
            this.scheduleStartDate = Objects.requireNonNull(scheduleStartDate);
            return this;
        }
        public Builder startTimeOfDay(TimeOfDayResponse startTimeOfDay) {
            this.startTimeOfDay = Objects.requireNonNull(startTimeOfDay);
            return this;
        }        public ScheduleResponse build() {
            return new ScheduleResponse(endTimeOfDay, repeatInterval, scheduleEndDate, scheduleStartDate, startTimeOfDay);
        }
    }
}
