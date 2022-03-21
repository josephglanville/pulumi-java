// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.redis.outputs;

import io.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class GetInstanceMaintenanceSchedule {
    private final String endTime;
    private final String scheduleDeadlineTime;
    private final String startTime;

    @CustomType.Constructor
    private GetInstanceMaintenanceSchedule(
        @CustomType.Parameter("endTime") String endTime,
        @CustomType.Parameter("scheduleDeadlineTime") String scheduleDeadlineTime,
        @CustomType.Parameter("startTime") String startTime) {
        this.endTime = endTime;
        this.scheduleDeadlineTime = scheduleDeadlineTime;
        this.startTime = startTime;
    }

    public String getEndTime() {
        return this.endTime;
    }
    public String getScheduleDeadlineTime() {
        return this.scheduleDeadlineTime;
    }
    public String getStartTime() {
        return this.startTime;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetInstanceMaintenanceSchedule defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String endTime;
        private String scheduleDeadlineTime;
        private String startTime;

        public Builder() {
    	      // Empty
        }

        public Builder(GetInstanceMaintenanceSchedule defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.endTime = defaults.endTime;
    	      this.scheduleDeadlineTime = defaults.scheduleDeadlineTime;
    	      this.startTime = defaults.startTime;
        }

        public Builder endTime(String endTime) {
            this.endTime = Objects.requireNonNull(endTime);
            return this;
        }
        public Builder scheduleDeadlineTime(String scheduleDeadlineTime) {
            this.scheduleDeadlineTime = Objects.requireNonNull(scheduleDeadlineTime);
            return this;
        }
        public Builder startTime(String startTime) {
            this.startTime = Objects.requireNonNull(startTime);
            return this;
        }        public GetInstanceMaintenanceSchedule build() {
            return new GetInstanceMaintenanceSchedule(endTime, scheduleDeadlineTime, startTime);
        }
    }
}
