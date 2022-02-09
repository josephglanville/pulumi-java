// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.devtestlab.outputs;

import io.pulumi.azurenative.devtestlab.outputs.DayDetailsResponse;
import io.pulumi.azurenative.devtestlab.outputs.HourDetailsResponse;
import io.pulumi.azurenative.devtestlab.outputs.NotificationSettingsResponse;
import io.pulumi.azurenative.devtestlab.outputs.WeekDetailsResponse;
import io.pulumi.core.internal.annotations.OutputCustomType;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class GetGlobalScheduleResult {
    private final String createdDate;
    private final @Nullable DayDetailsResponse dailyRecurrence;
    private final @Nullable HourDetailsResponse hourlyRecurrence;
    private final String id;
    private final @Nullable String location;
    private final String name;
    private final @Nullable NotificationSettingsResponse notificationSettings;
    private final String provisioningState;
    private final @Nullable String status;
    private final @Nullable Map<String,String> tags;
    private final @Nullable String targetResourceId;
    private final @Nullable String taskType;
    private final @Nullable String timeZoneId;
    private final String type;
    private final String uniqueIdentifier;
    private final @Nullable WeekDetailsResponse weeklyRecurrence;

    @OutputCustomType.Constructor({"createdDate","dailyRecurrence","hourlyRecurrence","id","location","name","notificationSettings","provisioningState","status","tags","targetResourceId","taskType","timeZoneId","type","uniqueIdentifier","weeklyRecurrence"})
    private GetGlobalScheduleResult(
        String createdDate,
        @Nullable DayDetailsResponse dailyRecurrence,
        @Nullable HourDetailsResponse hourlyRecurrence,
        String id,
        @Nullable String location,
        String name,
        @Nullable NotificationSettingsResponse notificationSettings,
        String provisioningState,
        @Nullable String status,
        @Nullable Map<String,String> tags,
        @Nullable String targetResourceId,
        @Nullable String taskType,
        @Nullable String timeZoneId,
        String type,
        String uniqueIdentifier,
        @Nullable WeekDetailsResponse weeklyRecurrence) {
        this.createdDate = Objects.requireNonNull(createdDate);
        this.dailyRecurrence = dailyRecurrence;
        this.hourlyRecurrence = hourlyRecurrence;
        this.id = Objects.requireNonNull(id);
        this.location = location;
        this.name = Objects.requireNonNull(name);
        this.notificationSettings = notificationSettings;
        this.provisioningState = Objects.requireNonNull(provisioningState);
        this.status = status;
        this.tags = tags;
        this.targetResourceId = targetResourceId;
        this.taskType = taskType;
        this.timeZoneId = timeZoneId;
        this.type = Objects.requireNonNull(type);
        this.uniqueIdentifier = Objects.requireNonNull(uniqueIdentifier);
        this.weeklyRecurrence = weeklyRecurrence;
    }

    public String getCreatedDate() {
        return this.createdDate;
    }
    public Optional<DayDetailsResponse> getDailyRecurrence() {
        return Optional.ofNullable(this.dailyRecurrence);
    }
    public Optional<HourDetailsResponse> getHourlyRecurrence() {
        return Optional.ofNullable(this.hourlyRecurrence);
    }
    public String getId() {
        return this.id;
    }
    public Optional<String> getLocation() {
        return Optional.ofNullable(this.location);
    }
    public String getName() {
        return this.name;
    }
    public Optional<NotificationSettingsResponse> getNotificationSettings() {
        return Optional.ofNullable(this.notificationSettings);
    }
    public String getProvisioningState() {
        return this.provisioningState;
    }
    public Optional<String> getStatus() {
        return Optional.ofNullable(this.status);
    }
    public Map<String,String> getTags() {
        return this.tags == null ? Map.of() : this.tags;
    }
    public Optional<String> getTargetResourceId() {
        return Optional.ofNullable(this.targetResourceId);
    }
    public Optional<String> getTaskType() {
        return Optional.ofNullable(this.taskType);
    }
    public Optional<String> getTimeZoneId() {
        return Optional.ofNullable(this.timeZoneId);
    }
    public String getType() {
        return this.type;
    }
    public String getUniqueIdentifier() {
        return this.uniqueIdentifier;
    }
    public Optional<WeekDetailsResponse> getWeeklyRecurrence() {
        return Optional.ofNullable(this.weeklyRecurrence);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetGlobalScheduleResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String createdDate;
        private @Nullable DayDetailsResponse dailyRecurrence;
        private @Nullable HourDetailsResponse hourlyRecurrence;
        private String id;
        private @Nullable String location;
        private String name;
        private @Nullable NotificationSettingsResponse notificationSettings;
        private String provisioningState;
        private @Nullable String status;
        private @Nullable Map<String,String> tags;
        private @Nullable String targetResourceId;
        private @Nullable String taskType;
        private @Nullable String timeZoneId;
        private String type;
        private String uniqueIdentifier;
        private @Nullable WeekDetailsResponse weeklyRecurrence;

        public Builder() {
    	      // Empty
        }

        public Builder(GetGlobalScheduleResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.createdDate = defaults.createdDate;
    	      this.dailyRecurrence = defaults.dailyRecurrence;
    	      this.hourlyRecurrence = defaults.hourlyRecurrence;
    	      this.id = defaults.id;
    	      this.location = defaults.location;
    	      this.name = defaults.name;
    	      this.notificationSettings = defaults.notificationSettings;
    	      this.provisioningState = defaults.provisioningState;
    	      this.status = defaults.status;
    	      this.tags = defaults.tags;
    	      this.targetResourceId = defaults.targetResourceId;
    	      this.taskType = defaults.taskType;
    	      this.timeZoneId = defaults.timeZoneId;
    	      this.type = defaults.type;
    	      this.uniqueIdentifier = defaults.uniqueIdentifier;
    	      this.weeklyRecurrence = defaults.weeklyRecurrence;
        }

        public Builder setCreatedDate(String createdDate) {
            this.createdDate = Objects.requireNonNull(createdDate);
            return this;
        }

        public Builder setDailyRecurrence(@Nullable DayDetailsResponse dailyRecurrence) {
            this.dailyRecurrence = dailyRecurrence;
            return this;
        }

        public Builder setHourlyRecurrence(@Nullable HourDetailsResponse hourlyRecurrence) {
            this.hourlyRecurrence = hourlyRecurrence;
            return this;
        }

        public Builder setId(String id) {
            this.id = Objects.requireNonNull(id);
            return this;
        }

        public Builder setLocation(@Nullable String location) {
            this.location = location;
            return this;
        }

        public Builder setName(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }

        public Builder setNotificationSettings(@Nullable NotificationSettingsResponse notificationSettings) {
            this.notificationSettings = notificationSettings;
            return this;
        }

        public Builder setProvisioningState(String provisioningState) {
            this.provisioningState = Objects.requireNonNull(provisioningState);
            return this;
        }

        public Builder setStatus(@Nullable String status) {
            this.status = status;
            return this;
        }

        public Builder setTags(@Nullable Map<String,String> tags) {
            this.tags = tags;
            return this;
        }

        public Builder setTargetResourceId(@Nullable String targetResourceId) {
            this.targetResourceId = targetResourceId;
            return this;
        }

        public Builder setTaskType(@Nullable String taskType) {
            this.taskType = taskType;
            return this;
        }

        public Builder setTimeZoneId(@Nullable String timeZoneId) {
            this.timeZoneId = timeZoneId;
            return this;
        }

        public Builder setType(String type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }

        public Builder setUniqueIdentifier(String uniqueIdentifier) {
            this.uniqueIdentifier = Objects.requireNonNull(uniqueIdentifier);
            return this;
        }

        public Builder setWeeklyRecurrence(@Nullable WeekDetailsResponse weeklyRecurrence) {
            this.weeklyRecurrence = weeklyRecurrence;
            return this;
        }

        public GetGlobalScheduleResult build() {
            return new GetGlobalScheduleResult(createdDate, dailyRecurrence, hourlyRecurrence, id, location, name, notificationSettings, provisioningState, status, tags, targetResourceId, taskType, timeZoneId, type, uniqueIdentifier, weeklyRecurrence);
        }
    }
}
