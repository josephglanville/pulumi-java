// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.devtestlab;

import io.pulumi.azurenative.devtestlab.enums.EnableStatus;
import io.pulumi.azurenative.devtestlab.inputs.DayDetailsArgs;
import io.pulumi.azurenative.devtestlab.inputs.HourDetailsArgs;
import io.pulumi.azurenative.devtestlab.inputs.NotificationSettingsArgs;
import io.pulumi.azurenative.devtestlab.inputs.WeekDetailsArgs;
import io.pulumi.core.Either;
import io.pulumi.core.Input;
import io.pulumi.core.internal.annotations.InputImport;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import javax.annotation.Nullable;


public final class ScheduleArgs extends io.pulumi.resources.ResourceArgs {

    public static final ScheduleArgs Empty = new ScheduleArgs();

    @InputImport(name="dailyRecurrence")
    private final @Nullable Input<DayDetailsArgs> dailyRecurrence;

    public Input<DayDetailsArgs> getDailyRecurrence() {
        return this.dailyRecurrence == null ? Input.empty() : this.dailyRecurrence;
    }

    @InputImport(name="hourlyRecurrence")
    private final @Nullable Input<HourDetailsArgs> hourlyRecurrence;

    public Input<HourDetailsArgs> getHourlyRecurrence() {
        return this.hourlyRecurrence == null ? Input.empty() : this.hourlyRecurrence;
    }

    @InputImport(name="labName", required=true)
    private final Input<String> labName;

    public Input<String> getLabName() {
        return this.labName;
    }

    @InputImport(name="location")
    private final @Nullable Input<String> location;

    public Input<String> getLocation() {
        return this.location == null ? Input.empty() : this.location;
    }

    @InputImport(name="name")
    private final @Nullable Input<String> name;

    public Input<String> getName() {
        return this.name == null ? Input.empty() : this.name;
    }

    @InputImport(name="notificationSettings")
    private final @Nullable Input<NotificationSettingsArgs> notificationSettings;

    public Input<NotificationSettingsArgs> getNotificationSettings() {
        return this.notificationSettings == null ? Input.empty() : this.notificationSettings;
    }

    @InputImport(name="resourceGroupName", required=true)
    private final Input<String> resourceGroupName;

    public Input<String> getResourceGroupName() {
        return this.resourceGroupName;
    }

    @InputImport(name="status")
    private final @Nullable Input<Either<String,EnableStatus>> status;

    public Input<Either<String,EnableStatus>> getStatus() {
        return this.status == null ? Input.empty() : this.status;
    }

    @InputImport(name="tags")
    private final @Nullable Input<Map<String,String>> tags;

    public Input<Map<String,String>> getTags() {
        return this.tags == null ? Input.empty() : this.tags;
    }

    @InputImport(name="targetResourceId")
    private final @Nullable Input<String> targetResourceId;

    public Input<String> getTargetResourceId() {
        return this.targetResourceId == null ? Input.empty() : this.targetResourceId;
    }

    @InputImport(name="taskType")
    private final @Nullable Input<String> taskType;

    public Input<String> getTaskType() {
        return this.taskType == null ? Input.empty() : this.taskType;
    }

    @InputImport(name="timeZoneId")
    private final @Nullable Input<String> timeZoneId;

    public Input<String> getTimeZoneId() {
        return this.timeZoneId == null ? Input.empty() : this.timeZoneId;
    }

    @InputImport(name="weeklyRecurrence")
    private final @Nullable Input<WeekDetailsArgs> weeklyRecurrence;

    public Input<WeekDetailsArgs> getWeeklyRecurrence() {
        return this.weeklyRecurrence == null ? Input.empty() : this.weeklyRecurrence;
    }

    public ScheduleArgs(
        @Nullable Input<DayDetailsArgs> dailyRecurrence,
        @Nullable Input<HourDetailsArgs> hourlyRecurrence,
        Input<String> labName,
        @Nullable Input<String> location,
        @Nullable Input<String> name,
        @Nullable Input<NotificationSettingsArgs> notificationSettings,
        Input<String> resourceGroupName,
        @Nullable Input<Either<String,EnableStatus>> status,
        @Nullable Input<Map<String,String>> tags,
        @Nullable Input<String> targetResourceId,
        @Nullable Input<String> taskType,
        @Nullable Input<String> timeZoneId,
        @Nullable Input<WeekDetailsArgs> weeklyRecurrence) {
        this.dailyRecurrence = dailyRecurrence;
        this.hourlyRecurrence = hourlyRecurrence;
        this.labName = Objects.requireNonNull(labName, "expected parameter 'labName' to be non-null");
        this.location = location;
        this.name = name;
        this.notificationSettings = notificationSettings;
        this.resourceGroupName = Objects.requireNonNull(resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
        this.status = status == null ? Input.ofLeft("Disabled") : status;
        this.tags = tags;
        this.targetResourceId = targetResourceId;
        this.taskType = taskType;
        this.timeZoneId = timeZoneId;
        this.weeklyRecurrence = weeklyRecurrence;
    }

    private ScheduleArgs() {
        this.dailyRecurrence = Input.empty();
        this.hourlyRecurrence = Input.empty();
        this.labName = Input.empty();
        this.location = Input.empty();
        this.name = Input.empty();
        this.notificationSettings = Input.empty();
        this.resourceGroupName = Input.empty();
        this.status = Input.empty();
        this.tags = Input.empty();
        this.targetResourceId = Input.empty();
        this.taskType = Input.empty();
        this.timeZoneId = Input.empty();
        this.weeklyRecurrence = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ScheduleArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<DayDetailsArgs> dailyRecurrence;
        private @Nullable Input<HourDetailsArgs> hourlyRecurrence;
        private Input<String> labName;
        private @Nullable Input<String> location;
        private @Nullable Input<String> name;
        private @Nullable Input<NotificationSettingsArgs> notificationSettings;
        private Input<String> resourceGroupName;
        private @Nullable Input<Either<String,EnableStatus>> status;
        private @Nullable Input<Map<String,String>> tags;
        private @Nullable Input<String> targetResourceId;
        private @Nullable Input<String> taskType;
        private @Nullable Input<String> timeZoneId;
        private @Nullable Input<WeekDetailsArgs> weeklyRecurrence;

        public Builder() {
    	      // Empty
        }

        public Builder(ScheduleArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.dailyRecurrence = defaults.dailyRecurrence;
    	      this.hourlyRecurrence = defaults.hourlyRecurrence;
    	      this.labName = defaults.labName;
    	      this.location = defaults.location;
    	      this.name = defaults.name;
    	      this.notificationSettings = defaults.notificationSettings;
    	      this.resourceGroupName = defaults.resourceGroupName;
    	      this.status = defaults.status;
    	      this.tags = defaults.tags;
    	      this.targetResourceId = defaults.targetResourceId;
    	      this.taskType = defaults.taskType;
    	      this.timeZoneId = defaults.timeZoneId;
    	      this.weeklyRecurrence = defaults.weeklyRecurrence;
        }

        public Builder setDailyRecurrence(@Nullable Input<DayDetailsArgs> dailyRecurrence) {
            this.dailyRecurrence = dailyRecurrence;
            return this;
        }

        public Builder setDailyRecurrence(@Nullable DayDetailsArgs dailyRecurrence) {
            this.dailyRecurrence = Input.ofNullable(dailyRecurrence);
            return this;
        }

        public Builder setHourlyRecurrence(@Nullable Input<HourDetailsArgs> hourlyRecurrence) {
            this.hourlyRecurrence = hourlyRecurrence;
            return this;
        }

        public Builder setHourlyRecurrence(@Nullable HourDetailsArgs hourlyRecurrence) {
            this.hourlyRecurrence = Input.ofNullable(hourlyRecurrence);
            return this;
        }

        public Builder setLabName(Input<String> labName) {
            this.labName = Objects.requireNonNull(labName);
            return this;
        }

        public Builder setLabName(String labName) {
            this.labName = Input.of(Objects.requireNonNull(labName));
            return this;
        }

        public Builder setLocation(@Nullable Input<String> location) {
            this.location = location;
            return this;
        }

        public Builder setLocation(@Nullable String location) {
            this.location = Input.ofNullable(location);
            return this;
        }

        public Builder setName(@Nullable Input<String> name) {
            this.name = name;
            return this;
        }

        public Builder setName(@Nullable String name) {
            this.name = Input.ofNullable(name);
            return this;
        }

        public Builder setNotificationSettings(@Nullable Input<NotificationSettingsArgs> notificationSettings) {
            this.notificationSettings = notificationSettings;
            return this;
        }

        public Builder setNotificationSettings(@Nullable NotificationSettingsArgs notificationSettings) {
            this.notificationSettings = Input.ofNullable(notificationSettings);
            return this;
        }

        public Builder setResourceGroupName(Input<String> resourceGroupName) {
            this.resourceGroupName = Objects.requireNonNull(resourceGroupName);
            return this;
        }

        public Builder setResourceGroupName(String resourceGroupName) {
            this.resourceGroupName = Input.of(Objects.requireNonNull(resourceGroupName));
            return this;
        }

        public Builder setStatus(@Nullable Input<Either<String,EnableStatus>> status) {
            this.status = status;
            return this;
        }

        public Builder setStatus(@Nullable Either<String,EnableStatus> status) {
            this.status = Input.ofNullable(status);
            return this;
        }

        public Builder setTags(@Nullable Input<Map<String,String>> tags) {
            this.tags = tags;
            return this;
        }

        public Builder setTags(@Nullable Map<String,String> tags) {
            this.tags = Input.ofNullable(tags);
            return this;
        }

        public Builder setTargetResourceId(@Nullable Input<String> targetResourceId) {
            this.targetResourceId = targetResourceId;
            return this;
        }

        public Builder setTargetResourceId(@Nullable String targetResourceId) {
            this.targetResourceId = Input.ofNullable(targetResourceId);
            return this;
        }

        public Builder setTaskType(@Nullable Input<String> taskType) {
            this.taskType = taskType;
            return this;
        }

        public Builder setTaskType(@Nullable String taskType) {
            this.taskType = Input.ofNullable(taskType);
            return this;
        }

        public Builder setTimeZoneId(@Nullable Input<String> timeZoneId) {
            this.timeZoneId = timeZoneId;
            return this;
        }

        public Builder setTimeZoneId(@Nullable String timeZoneId) {
            this.timeZoneId = Input.ofNullable(timeZoneId);
            return this;
        }

        public Builder setWeeklyRecurrence(@Nullable Input<WeekDetailsArgs> weeklyRecurrence) {
            this.weeklyRecurrence = weeklyRecurrence;
            return this;
        }

        public Builder setWeeklyRecurrence(@Nullable WeekDetailsArgs weeklyRecurrence) {
            this.weeklyRecurrence = Input.ofNullable(weeklyRecurrence);
            return this;
        }

        public ScheduleArgs build() {
            return new ScheduleArgs(dailyRecurrence, hourlyRecurrence, labName, location, name, notificationSettings, resourceGroupName, status, tags, targetResourceId, taskType, timeZoneId, weeklyRecurrence);
        }
    }
}