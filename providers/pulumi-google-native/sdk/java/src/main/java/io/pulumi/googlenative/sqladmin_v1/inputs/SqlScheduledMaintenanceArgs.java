// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.sqladmin_v1.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.InputImport;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * Any scheduled maintenancce for this instance.
 * 
 */
public final class SqlScheduledMaintenanceArgs extends io.pulumi.resources.ResourceArgs {

    public static final SqlScheduledMaintenanceArgs Empty = new SqlScheduledMaintenanceArgs();

    @InputImport(name="canDefer")
      private final @Nullable Output<Boolean> canDefer;

    public Output<Boolean> getCanDefer() {
        return this.canDefer == null ? Output.empty() : this.canDefer;
    }

    /**
     * If the scheduled maintenance can be rescheduled.
     * 
     */
    @InputImport(name="canReschedule")
      private final @Nullable Output<Boolean> canReschedule;

    public Output<Boolean> getCanReschedule() {
        return this.canReschedule == null ? Output.empty() : this.canReschedule;
    }

    /**
     * Maintenance cannot be rescheduled to start beyond this deadline.
     * 
     */
    @InputImport(name="scheduleDeadlineTime")
      private final @Nullable Output<String> scheduleDeadlineTime;

    public Output<String> getScheduleDeadlineTime() {
        return this.scheduleDeadlineTime == null ? Output.empty() : this.scheduleDeadlineTime;
    }

    /**
     * The start time of any upcoming scheduled maintenance for this instance.
     * 
     */
    @InputImport(name="startTime")
      private final @Nullable Output<String> startTime;

    public Output<String> getStartTime() {
        return this.startTime == null ? Output.empty() : this.startTime;
    }

    public SqlScheduledMaintenanceArgs(
        @Nullable Output<Boolean> canDefer,
        @Nullable Output<Boolean> canReschedule,
        @Nullable Output<String> scheduleDeadlineTime,
        @Nullable Output<String> startTime) {
        this.canDefer = canDefer;
        this.canReschedule = canReschedule;
        this.scheduleDeadlineTime = scheduleDeadlineTime;
        this.startTime = startTime;
    }

    private SqlScheduledMaintenanceArgs() {
        this.canDefer = Output.empty();
        this.canReschedule = Output.empty();
        this.scheduleDeadlineTime = Output.empty();
        this.startTime = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(SqlScheduledMaintenanceArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<Boolean> canDefer;
        private @Nullable Output<Boolean> canReschedule;
        private @Nullable Output<String> scheduleDeadlineTime;
        private @Nullable Output<String> startTime;

        public Builder() {
    	      // Empty
        }

        public Builder(SqlScheduledMaintenanceArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.canDefer = defaults.canDefer;
    	      this.canReschedule = defaults.canReschedule;
    	      this.scheduleDeadlineTime = defaults.scheduleDeadlineTime;
    	      this.startTime = defaults.startTime;
        }

        public Builder canDefer(@Nullable Output<Boolean> canDefer) {
            this.canDefer = canDefer;
            return this;
        }

        public Builder canDefer(@Nullable Boolean canDefer) {
            this.canDefer = Output.ofNullable(canDefer);
            return this;
        }

        public Builder canReschedule(@Nullable Output<Boolean> canReschedule) {
            this.canReschedule = canReschedule;
            return this;
        }

        public Builder canReschedule(@Nullable Boolean canReschedule) {
            this.canReschedule = Output.ofNullable(canReschedule);
            return this;
        }

        public Builder scheduleDeadlineTime(@Nullable Output<String> scheduleDeadlineTime) {
            this.scheduleDeadlineTime = scheduleDeadlineTime;
            return this;
        }

        public Builder scheduleDeadlineTime(@Nullable String scheduleDeadlineTime) {
            this.scheduleDeadlineTime = Output.ofNullable(scheduleDeadlineTime);
            return this;
        }

        public Builder startTime(@Nullable Output<String> startTime) {
            this.startTime = startTime;
            return this;
        }

        public Builder startTime(@Nullable String startTime) {
            this.startTime = Output.ofNullable(startTime);
            return this;
        }
        public SqlScheduledMaintenanceArgs build() {
            return new SqlScheduledMaintenanceArgs(canDefer, canReschedule, scheduleDeadlineTime, startTime);
        }
    }
}
