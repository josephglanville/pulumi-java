// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.devtestlab.inputs;

import io.pulumi.azurenative.devtestlab.enums.EnableStatus;
import io.pulumi.azurenative.devtestlab.inputs.DayDetailsArgs;
import io.pulumi.azurenative.devtestlab.inputs.HourDetailsArgs;
import io.pulumi.azurenative.devtestlab.inputs.NotificationSettingsArgs;
import io.pulumi.azurenative.devtestlab.inputs.WeekDetailsArgs;
import io.pulumi.core.Either;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * Properties for creating a schedule.
 * 
 */
public final class ScheduleCreationParameterArgs extends io.pulumi.resources.ResourceArgs {

    public static final ScheduleCreationParameterArgs Empty = new ScheduleCreationParameterArgs();

    /**
     * If the schedule will occur once each day of the week, specify the daily recurrence.
     * 
     */
    @Import(name="dailyRecurrence")
      private final @Nullable Output<DayDetailsArgs> dailyRecurrence;

    public Output<DayDetailsArgs> getDailyRecurrence() {
        return this.dailyRecurrence == null ? Output.empty() : this.dailyRecurrence;
    }

    /**
     * If the schedule will occur multiple times a day, specify the hourly recurrence.
     * 
     */
    @Import(name="hourlyRecurrence")
      private final @Nullable Output<HourDetailsArgs> hourlyRecurrence;

    public Output<HourDetailsArgs> getHourlyRecurrence() {
        return this.hourlyRecurrence == null ? Output.empty() : this.hourlyRecurrence;
    }

    /**
     * The name of the virtual machine or environment
     * 
     */
    @Import(name="name")
      private final @Nullable Output<String> name;

    public Output<String> getName() {
        return this.name == null ? Output.empty() : this.name;
    }

    /**
     * Notification settings.
     * 
     */
    @Import(name="notificationSettings")
      private final @Nullable Output<NotificationSettingsArgs> notificationSettings;

    public Output<NotificationSettingsArgs> getNotificationSettings() {
        return this.notificationSettings == null ? Output.empty() : this.notificationSettings;
    }

    /**
     * The status of the schedule (i.e. Enabled, Disabled)
     * 
     */
    @Import(name="status")
      private final @Nullable Output<Either<String,EnableStatus>> status;

    public Output<Either<String,EnableStatus>> getStatus() {
        return this.status == null ? Output.empty() : this.status;
    }

    /**
     * The tags of the resource.
     * 
     */
    @Import(name="tags")
      private final @Nullable Output<Map<String,String>> tags;

    public Output<Map<String,String>> getTags() {
        return this.tags == null ? Output.empty() : this.tags;
    }

    /**
     * The resource ID to which the schedule belongs
     * 
     */
    @Import(name="targetResourceId")
      private final @Nullable Output<String> targetResourceId;

    public Output<String> getTargetResourceId() {
        return this.targetResourceId == null ? Output.empty() : this.targetResourceId;
    }

    /**
     * The task type of the schedule (e.g. LabVmsShutdownTask, LabVmAutoStart).
     * 
     */
    @Import(name="taskType")
      private final @Nullable Output<String> taskType;

    public Output<String> getTaskType() {
        return this.taskType == null ? Output.empty() : this.taskType;
    }

    /**
     * The time zone ID (e.g. Pacific Standard time).
     * 
     */
    @Import(name="timeZoneId")
      private final @Nullable Output<String> timeZoneId;

    public Output<String> getTimeZoneId() {
        return this.timeZoneId == null ? Output.empty() : this.timeZoneId;
    }

    /**
     * If the schedule will occur only some days of the week, specify the weekly recurrence.
     * 
     */
    @Import(name="weeklyRecurrence")
      private final @Nullable Output<WeekDetailsArgs> weeklyRecurrence;

    public Output<WeekDetailsArgs> getWeeklyRecurrence() {
        return this.weeklyRecurrence == null ? Output.empty() : this.weeklyRecurrence;
    }

    public ScheduleCreationParameterArgs(
        @Nullable Output<DayDetailsArgs> dailyRecurrence,
        @Nullable Output<HourDetailsArgs> hourlyRecurrence,
        @Nullable Output<String> name,
        @Nullable Output<NotificationSettingsArgs> notificationSettings,
        @Nullable Output<Either<String,EnableStatus>> status,
        @Nullable Output<Map<String,String>> tags,
        @Nullable Output<String> targetResourceId,
        @Nullable Output<String> taskType,
        @Nullable Output<String> timeZoneId,
        @Nullable Output<WeekDetailsArgs> weeklyRecurrence) {
        this.dailyRecurrence = dailyRecurrence;
        this.hourlyRecurrence = hourlyRecurrence;
        this.name = name;
        this.notificationSettings = notificationSettings;
        this.status = status == null ? Output.ofLeft("Disabled") : status;
        this.tags = tags;
        this.targetResourceId = targetResourceId;
        this.taskType = taskType;
        this.timeZoneId = timeZoneId;
        this.weeklyRecurrence = weeklyRecurrence;
    }

    private ScheduleCreationParameterArgs() {
        this.dailyRecurrence = Output.empty();
        this.hourlyRecurrence = Output.empty();
        this.name = Output.empty();
        this.notificationSettings = Output.empty();
        this.status = Output.empty();
        this.tags = Output.empty();
        this.targetResourceId = Output.empty();
        this.taskType = Output.empty();
        this.timeZoneId = Output.empty();
        this.weeklyRecurrence = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ScheduleCreationParameterArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<DayDetailsArgs> dailyRecurrence;
        private @Nullable Output<HourDetailsArgs> hourlyRecurrence;
        private @Nullable Output<String> name;
        private @Nullable Output<NotificationSettingsArgs> notificationSettings;
        private @Nullable Output<Either<String,EnableStatus>> status;
        private @Nullable Output<Map<String,String>> tags;
        private @Nullable Output<String> targetResourceId;
        private @Nullable Output<String> taskType;
        private @Nullable Output<String> timeZoneId;
        private @Nullable Output<WeekDetailsArgs> weeklyRecurrence;

        public Builder() {
    	      // Empty
        }

        public Builder(ScheduleCreationParameterArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.dailyRecurrence = defaults.dailyRecurrence;
    	      this.hourlyRecurrence = defaults.hourlyRecurrence;
    	      this.name = defaults.name;
    	      this.notificationSettings = defaults.notificationSettings;
    	      this.status = defaults.status;
    	      this.tags = defaults.tags;
    	      this.targetResourceId = defaults.targetResourceId;
    	      this.taskType = defaults.taskType;
    	      this.timeZoneId = defaults.timeZoneId;
    	      this.weeklyRecurrence = defaults.weeklyRecurrence;
        }

        public Builder dailyRecurrence(@Nullable Output<DayDetailsArgs> dailyRecurrence) {
            this.dailyRecurrence = dailyRecurrence;
            return this;
        }
        public Builder dailyRecurrence(@Nullable DayDetailsArgs dailyRecurrence) {
            this.dailyRecurrence = Output.ofNullable(dailyRecurrence);
            return this;
        }
        public Builder hourlyRecurrence(@Nullable Output<HourDetailsArgs> hourlyRecurrence) {
            this.hourlyRecurrence = hourlyRecurrence;
            return this;
        }
        public Builder hourlyRecurrence(@Nullable HourDetailsArgs hourlyRecurrence) {
            this.hourlyRecurrence = Output.ofNullable(hourlyRecurrence);
            return this;
        }
        public Builder name(@Nullable Output<String> name) {
            this.name = name;
            return this;
        }
        public Builder name(@Nullable String name) {
            this.name = Output.ofNullable(name);
            return this;
        }
        public Builder notificationSettings(@Nullable Output<NotificationSettingsArgs> notificationSettings) {
            this.notificationSettings = notificationSettings;
            return this;
        }
        public Builder notificationSettings(@Nullable NotificationSettingsArgs notificationSettings) {
            this.notificationSettings = Output.ofNullable(notificationSettings);
            return this;
        }
        public Builder status(@Nullable Output<Either<String,EnableStatus>> status) {
            this.status = status;
            return this;
        }
        public Builder status(@Nullable Either<String,EnableStatus> status) {
            this.status = Output.ofNullable(status);
            return this;
        }
        public Builder tags(@Nullable Output<Map<String,String>> tags) {
            this.tags = tags;
            return this;
        }
        public Builder tags(@Nullable Map<String,String> tags) {
            this.tags = Output.ofNullable(tags);
            return this;
        }
        public Builder targetResourceId(@Nullable Output<String> targetResourceId) {
            this.targetResourceId = targetResourceId;
            return this;
        }
        public Builder targetResourceId(@Nullable String targetResourceId) {
            this.targetResourceId = Output.ofNullable(targetResourceId);
            return this;
        }
        public Builder taskType(@Nullable Output<String> taskType) {
            this.taskType = taskType;
            return this;
        }
        public Builder taskType(@Nullable String taskType) {
            this.taskType = Output.ofNullable(taskType);
            return this;
        }
        public Builder timeZoneId(@Nullable Output<String> timeZoneId) {
            this.timeZoneId = timeZoneId;
            return this;
        }
        public Builder timeZoneId(@Nullable String timeZoneId) {
            this.timeZoneId = Output.ofNullable(timeZoneId);
            return this;
        }
        public Builder weeklyRecurrence(@Nullable Output<WeekDetailsArgs> weeklyRecurrence) {
            this.weeklyRecurrence = weeklyRecurrence;
            return this;
        }
        public Builder weeklyRecurrence(@Nullable WeekDetailsArgs weeklyRecurrence) {
            this.weeklyRecurrence = Output.ofNullable(weeklyRecurrence);
            return this;
        }        public ScheduleCreationParameterArgs build() {
            return new ScheduleCreationParameterArgs(dailyRecurrence, hourlyRecurrence, name, notificationSettings, status, tags, targetResourceId, taskType, timeZoneId, weeklyRecurrence);
        }
    }
}
