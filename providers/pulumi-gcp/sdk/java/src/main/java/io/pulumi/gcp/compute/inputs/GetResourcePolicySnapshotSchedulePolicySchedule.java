// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.compute.inputs;

import io.pulumi.core.annotations.Import;
import io.pulumi.gcp.compute.inputs.GetResourcePolicySnapshotSchedulePolicyScheduleDailySchedule;
import io.pulumi.gcp.compute.inputs.GetResourcePolicySnapshotSchedulePolicyScheduleHourlySchedule;
import io.pulumi.gcp.compute.inputs.GetResourcePolicySnapshotSchedulePolicyScheduleWeeklySchedule;
import java.util.List;
import java.util.Objects;


public final class GetResourcePolicySnapshotSchedulePolicySchedule extends io.pulumi.resources.InvokeArgs {

    public static final GetResourcePolicySnapshotSchedulePolicySchedule Empty = new GetResourcePolicySnapshotSchedulePolicySchedule();

    @Import(name="dailySchedules", required=true)
      private final List<GetResourcePolicySnapshotSchedulePolicyScheduleDailySchedule> dailySchedules;

    public List<GetResourcePolicySnapshotSchedulePolicyScheduleDailySchedule> getDailySchedules() {
        return this.dailySchedules;
    }

    @Import(name="hourlySchedules", required=true)
      private final List<GetResourcePolicySnapshotSchedulePolicyScheduleHourlySchedule> hourlySchedules;

    public List<GetResourcePolicySnapshotSchedulePolicyScheduleHourlySchedule> getHourlySchedules() {
        return this.hourlySchedules;
    }

    @Import(name="weeklySchedules", required=true)
      private final List<GetResourcePolicySnapshotSchedulePolicyScheduleWeeklySchedule> weeklySchedules;

    public List<GetResourcePolicySnapshotSchedulePolicyScheduleWeeklySchedule> getWeeklySchedules() {
        return this.weeklySchedules;
    }

    public GetResourcePolicySnapshotSchedulePolicySchedule(
        List<GetResourcePolicySnapshotSchedulePolicyScheduleDailySchedule> dailySchedules,
        List<GetResourcePolicySnapshotSchedulePolicyScheduleHourlySchedule> hourlySchedules,
        List<GetResourcePolicySnapshotSchedulePolicyScheduleWeeklySchedule> weeklySchedules) {
        this.dailySchedules = Objects.requireNonNull(dailySchedules, "expected parameter 'dailySchedules' to be non-null");
        this.hourlySchedules = Objects.requireNonNull(hourlySchedules, "expected parameter 'hourlySchedules' to be non-null");
        this.weeklySchedules = Objects.requireNonNull(weeklySchedules, "expected parameter 'weeklySchedules' to be non-null");
    }

    private GetResourcePolicySnapshotSchedulePolicySchedule() {
        this.dailySchedules = List.of();
        this.hourlySchedules = List.of();
        this.weeklySchedules = List.of();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetResourcePolicySnapshotSchedulePolicySchedule defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private List<GetResourcePolicySnapshotSchedulePolicyScheduleDailySchedule> dailySchedules;
        private List<GetResourcePolicySnapshotSchedulePolicyScheduleHourlySchedule> hourlySchedules;
        private List<GetResourcePolicySnapshotSchedulePolicyScheduleWeeklySchedule> weeklySchedules;

        public Builder() {
    	      // Empty
        }

        public Builder(GetResourcePolicySnapshotSchedulePolicySchedule defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.dailySchedules = defaults.dailySchedules;
    	      this.hourlySchedules = defaults.hourlySchedules;
    	      this.weeklySchedules = defaults.weeklySchedules;
        }

        public Builder dailySchedules(List<GetResourcePolicySnapshotSchedulePolicyScheduleDailySchedule> dailySchedules) {
            this.dailySchedules = Objects.requireNonNull(dailySchedules);
            return this;
        }
        public Builder dailySchedules(GetResourcePolicySnapshotSchedulePolicyScheduleDailySchedule... dailySchedules) {
            return dailySchedules(List.of(dailySchedules));
        }
        public Builder hourlySchedules(List<GetResourcePolicySnapshotSchedulePolicyScheduleHourlySchedule> hourlySchedules) {
            this.hourlySchedules = Objects.requireNonNull(hourlySchedules);
            return this;
        }
        public Builder hourlySchedules(GetResourcePolicySnapshotSchedulePolicyScheduleHourlySchedule... hourlySchedules) {
            return hourlySchedules(List.of(hourlySchedules));
        }
        public Builder weeklySchedules(List<GetResourcePolicySnapshotSchedulePolicyScheduleWeeklySchedule> weeklySchedules) {
            this.weeklySchedules = Objects.requireNonNull(weeklySchedules);
            return this;
        }
        public Builder weeklySchedules(GetResourcePolicySnapshotSchedulePolicyScheduleWeeklySchedule... weeklySchedules) {
            return weeklySchedules(List.of(weeklySchedules));
        }        public GetResourcePolicySnapshotSchedulePolicySchedule build() {
            return new GetResourcePolicySnapshotSchedulePolicySchedule(dailySchedules, hourlySchedules, weeklySchedules);
        }
    }
}
