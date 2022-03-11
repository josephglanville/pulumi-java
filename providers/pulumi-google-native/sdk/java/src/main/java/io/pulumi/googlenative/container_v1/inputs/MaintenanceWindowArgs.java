// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.container_v1.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.InputImport;
import io.pulumi.googlenative.container_v1.inputs.DailyMaintenanceWindowArgs;
import io.pulumi.googlenative.container_v1.inputs.RecurringTimeWindowArgs;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * MaintenanceWindow defines the maintenance window to be used for the cluster.
 * 
 */
public final class MaintenanceWindowArgs extends io.pulumi.resources.ResourceArgs {

    public static final MaintenanceWindowArgs Empty = new MaintenanceWindowArgs();

    /**
     * DailyMaintenanceWindow specifies a daily maintenance operation window.
     * 
     */
    @InputImport(name="dailyMaintenanceWindow")
      private final @Nullable Output<DailyMaintenanceWindowArgs> dailyMaintenanceWindow;

    public Output<DailyMaintenanceWindowArgs> getDailyMaintenanceWindow() {
        return this.dailyMaintenanceWindow == null ? Output.empty() : this.dailyMaintenanceWindow;
    }

    /**
     * Exceptions to maintenance window. Non-emergency maintenance should not occur in these windows.
     * 
     */
    @InputImport(name="maintenanceExclusions")
      private final @Nullable Output<Map<String,String>> maintenanceExclusions;

    public Output<Map<String,String>> getMaintenanceExclusions() {
        return this.maintenanceExclusions == null ? Output.empty() : this.maintenanceExclusions;
    }

    /**
     * RecurringWindow specifies some number of recurring time periods for maintenance to occur. The time windows may be overlapping. If no maintenance windows are set, maintenance can occur at any time.
     * 
     */
    @InputImport(name="recurringWindow")
      private final @Nullable Output<RecurringTimeWindowArgs> recurringWindow;

    public Output<RecurringTimeWindowArgs> getRecurringWindow() {
        return this.recurringWindow == null ? Output.empty() : this.recurringWindow;
    }

    public MaintenanceWindowArgs(
        @Nullable Output<DailyMaintenanceWindowArgs> dailyMaintenanceWindow,
        @Nullable Output<Map<String,String>> maintenanceExclusions,
        @Nullable Output<RecurringTimeWindowArgs> recurringWindow) {
        this.dailyMaintenanceWindow = dailyMaintenanceWindow;
        this.maintenanceExclusions = maintenanceExclusions;
        this.recurringWindow = recurringWindow;
    }

    private MaintenanceWindowArgs() {
        this.dailyMaintenanceWindow = Output.empty();
        this.maintenanceExclusions = Output.empty();
        this.recurringWindow = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(MaintenanceWindowArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<DailyMaintenanceWindowArgs> dailyMaintenanceWindow;
        private @Nullable Output<Map<String,String>> maintenanceExclusions;
        private @Nullable Output<RecurringTimeWindowArgs> recurringWindow;

        public Builder() {
    	      // Empty
        }

        public Builder(MaintenanceWindowArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.dailyMaintenanceWindow = defaults.dailyMaintenanceWindow;
    	      this.maintenanceExclusions = defaults.maintenanceExclusions;
    	      this.recurringWindow = defaults.recurringWindow;
        }

        public Builder dailyMaintenanceWindow(@Nullable Output<DailyMaintenanceWindowArgs> dailyMaintenanceWindow) {
            this.dailyMaintenanceWindow = dailyMaintenanceWindow;
            return this;
        }

        public Builder dailyMaintenanceWindow(@Nullable DailyMaintenanceWindowArgs dailyMaintenanceWindow) {
            this.dailyMaintenanceWindow = Output.ofNullable(dailyMaintenanceWindow);
            return this;
        }

        public Builder maintenanceExclusions(@Nullable Output<Map<String,String>> maintenanceExclusions) {
            this.maintenanceExclusions = maintenanceExclusions;
            return this;
        }

        public Builder maintenanceExclusions(@Nullable Map<String,String> maintenanceExclusions) {
            this.maintenanceExclusions = Output.ofNullable(maintenanceExclusions);
            return this;
        }

        public Builder recurringWindow(@Nullable Output<RecurringTimeWindowArgs> recurringWindow) {
            this.recurringWindow = recurringWindow;
            return this;
        }

        public Builder recurringWindow(@Nullable RecurringTimeWindowArgs recurringWindow) {
            this.recurringWindow = Output.ofNullable(recurringWindow);
            return this;
        }
        public MaintenanceWindowArgs build() {
            return new MaintenanceWindowArgs(dailyMaintenanceWindow, maintenanceExclusions, recurringWindow);
        }
    }
}
