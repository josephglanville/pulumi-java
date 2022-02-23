// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.compute.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import io.pulumi.gcp.compute.inputs.ResourcePolicySnapshotSchedulePolicyScheduleDailyScheduleGetArgs;
import io.pulumi.gcp.compute.inputs.ResourcePolicySnapshotSchedulePolicyScheduleHourlyScheduleGetArgs;
import io.pulumi.gcp.compute.inputs.ResourcePolicySnapshotSchedulePolicyScheduleWeeklyScheduleGetArgs;
import java.util.Objects;
import javax.annotation.Nullable;


public final class ResourcePolicySnapshotSchedulePolicyScheduleGetArgs extends io.pulumi.resources.ResourceArgs {

    public static final ResourcePolicySnapshotSchedulePolicyScheduleGetArgs Empty = new ResourcePolicySnapshotSchedulePolicyScheduleGetArgs();

    /**
     * The policy will execute every nth day at the specified time.
     * Structure is documented below.
     * 
     */
    @InputImport(name="dailySchedule")
      private final @Nullable Input<ResourcePolicySnapshotSchedulePolicyScheduleDailyScheduleGetArgs> dailySchedule;

    public Input<ResourcePolicySnapshotSchedulePolicyScheduleDailyScheduleGetArgs> getDailySchedule() {
        return this.dailySchedule == null ? Input.empty() : this.dailySchedule;
    }

    /**
     * The policy will execute every nth hour starting at the specified time.
     * Structure is documented below.
     * 
     */
    @InputImport(name="hourlySchedule")
      private final @Nullable Input<ResourcePolicySnapshotSchedulePolicyScheduleHourlyScheduleGetArgs> hourlySchedule;

    public Input<ResourcePolicySnapshotSchedulePolicyScheduleHourlyScheduleGetArgs> getHourlySchedule() {
        return this.hourlySchedule == null ? Input.empty() : this.hourlySchedule;
    }

    /**
     * Allows specifying a snapshot time for each day of the week.
     * Structure is documented below.
     * 
     */
    @InputImport(name="weeklySchedule")
      private final @Nullable Input<ResourcePolicySnapshotSchedulePolicyScheduleWeeklyScheduleGetArgs> weeklySchedule;

    public Input<ResourcePolicySnapshotSchedulePolicyScheduleWeeklyScheduleGetArgs> getWeeklySchedule() {
        return this.weeklySchedule == null ? Input.empty() : this.weeklySchedule;
    }

    public ResourcePolicySnapshotSchedulePolicyScheduleGetArgs(
        @Nullable Input<ResourcePolicySnapshotSchedulePolicyScheduleDailyScheduleGetArgs> dailySchedule,
        @Nullable Input<ResourcePolicySnapshotSchedulePolicyScheduleHourlyScheduleGetArgs> hourlySchedule,
        @Nullable Input<ResourcePolicySnapshotSchedulePolicyScheduleWeeklyScheduleGetArgs> weeklySchedule) {
        this.dailySchedule = dailySchedule;
        this.hourlySchedule = hourlySchedule;
        this.weeklySchedule = weeklySchedule;
    }

    private ResourcePolicySnapshotSchedulePolicyScheduleGetArgs() {
        this.dailySchedule = Input.empty();
        this.hourlySchedule = Input.empty();
        this.weeklySchedule = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ResourcePolicySnapshotSchedulePolicyScheduleGetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<ResourcePolicySnapshotSchedulePolicyScheduleDailyScheduleGetArgs> dailySchedule;
        private @Nullable Input<ResourcePolicySnapshotSchedulePolicyScheduleHourlyScheduleGetArgs> hourlySchedule;
        private @Nullable Input<ResourcePolicySnapshotSchedulePolicyScheduleWeeklyScheduleGetArgs> weeklySchedule;

        public Builder() {
    	      // Empty
        }

        public Builder(ResourcePolicySnapshotSchedulePolicyScheduleGetArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.dailySchedule = defaults.dailySchedule;
    	      this.hourlySchedule = defaults.hourlySchedule;
    	      this.weeklySchedule = defaults.weeklySchedule;
        }

        public Builder setDailySchedule(@Nullable Input<ResourcePolicySnapshotSchedulePolicyScheduleDailyScheduleGetArgs> dailySchedule) {
            this.dailySchedule = dailySchedule;
            return this;
        }

        public Builder setDailySchedule(@Nullable ResourcePolicySnapshotSchedulePolicyScheduleDailyScheduleGetArgs dailySchedule) {
            this.dailySchedule = Input.ofNullable(dailySchedule);
            return this;
        }

        public Builder setHourlySchedule(@Nullable Input<ResourcePolicySnapshotSchedulePolicyScheduleHourlyScheduleGetArgs> hourlySchedule) {
            this.hourlySchedule = hourlySchedule;
            return this;
        }

        public Builder setHourlySchedule(@Nullable ResourcePolicySnapshotSchedulePolicyScheduleHourlyScheduleGetArgs hourlySchedule) {
            this.hourlySchedule = Input.ofNullable(hourlySchedule);
            return this;
        }

        public Builder setWeeklySchedule(@Nullable Input<ResourcePolicySnapshotSchedulePolicyScheduleWeeklyScheduleGetArgs> weeklySchedule) {
            this.weeklySchedule = weeklySchedule;
            return this;
        }

        public Builder setWeeklySchedule(@Nullable ResourcePolicySnapshotSchedulePolicyScheduleWeeklyScheduleGetArgs weeklySchedule) {
            this.weeklySchedule = Input.ofNullable(weeklySchedule);
            return this;
        }
        public ResourcePolicySnapshotSchedulePolicyScheduleGetArgs build() {
            return new ResourcePolicySnapshotSchedulePolicyScheduleGetArgs(dailySchedule, hourlySchedule, weeklySchedule);
        }
    }
}
