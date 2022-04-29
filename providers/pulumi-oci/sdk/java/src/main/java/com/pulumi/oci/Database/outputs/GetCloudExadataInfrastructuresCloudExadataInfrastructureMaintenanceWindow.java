// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.oci.Database.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.oci.Database.outputs.GetCloudExadataInfrastructuresCloudExadataInfrastructureMaintenanceWindowDaysOfWeek;
import com.pulumi.oci.Database.outputs.GetCloudExadataInfrastructuresCloudExadataInfrastructureMaintenanceWindowMonth;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Objects;

@CustomType
public final class GetCloudExadataInfrastructuresCloudExadataInfrastructureMaintenanceWindow {
    /**
     * @return Determines the amount of time the system will wait before the start of each database server patching operation. Custom action timeout is in minutes and valid value is between 15 to 120 (inclusive).
     * 
     */
    private final Integer customActionTimeoutInMins;
    /**
     * @return Days during the week when maintenance should be performed.
     * 
     */
    private final List<GetCloudExadataInfrastructuresCloudExadataInfrastructureMaintenanceWindowDaysOfWeek> daysOfWeeks;
    /**
     * @return The window of hours during the day when maintenance should be performed. The window is a 4 hour slot. Valid values are
     * * 0 - represents time slot 0:00 - 3:59 UTC - 4 - represents time slot 4:00 - 7:59 UTC - 8 - represents time slot 8:00 - 11:59 UTC - 12 - represents time slot 12:00 - 15:59 UTC - 16 - represents time slot 16:00 - 19:59 UTC - 20 - represents time slot 20:00 - 23:59 UTC
     * 
     */
    private final List<Integer> hoursOfDays;
    /**
     * @return If true, enables the configuration of a custom action timeout (waiting period) between database server patching operations.
     * 
     */
    private final Boolean isCustomActionTimeoutEnabled;
    /**
     * @return Lead time window allows user to set a lead time to prepare for a down time. The lead time is in weeks and valid value is between 1 to 4.
     * 
     */
    private final Integer leadTimeInWeeks;
    /**
     * @return Months during the year when maintenance should be performed.
     * 
     */
    private final List<GetCloudExadataInfrastructuresCloudExadataInfrastructureMaintenanceWindowMonth> months;
    /**
     * @return Cloud Exadata infrastructure node patching method, either &#34;ROLLING&#34; or &#34;NONROLLING&#34;. Default value is ROLLING.
     * 
     */
    private final String patchingMode;
    /**
     * @return The maintenance window scheduling preference.
     * 
     */
    private final String preference;
    /**
     * @return Weeks during the month when maintenance should be performed. Weeks start on the 1st, 8th, 15th, and 22nd days of the month, and have a duration of 7 days. Weeks start and end based on calendar dates, not days of the week. For example, to allow maintenance during the 2nd week of the month (from the 8th day to the 14th day of the month), use the value 2. Maintenance cannot be scheduled for the fifth week of months that contain more than 28 days. Note that this parameter works in conjunction with the  daysOfWeek and hoursOfDay parameters to allow you to specify specific days of the week and hours that maintenance will be performed.
     * 
     */
    private final List<Integer> weeksOfMonths;

    @CustomType.Constructor
    private GetCloudExadataInfrastructuresCloudExadataInfrastructureMaintenanceWindow(
        @CustomType.Parameter("customActionTimeoutInMins") Integer customActionTimeoutInMins,
        @CustomType.Parameter("daysOfWeeks") List<GetCloudExadataInfrastructuresCloudExadataInfrastructureMaintenanceWindowDaysOfWeek> daysOfWeeks,
        @CustomType.Parameter("hoursOfDays") List<Integer> hoursOfDays,
        @CustomType.Parameter("isCustomActionTimeoutEnabled") Boolean isCustomActionTimeoutEnabled,
        @CustomType.Parameter("leadTimeInWeeks") Integer leadTimeInWeeks,
        @CustomType.Parameter("months") List<GetCloudExadataInfrastructuresCloudExadataInfrastructureMaintenanceWindowMonth> months,
        @CustomType.Parameter("patchingMode") String patchingMode,
        @CustomType.Parameter("preference") String preference,
        @CustomType.Parameter("weeksOfMonths") List<Integer> weeksOfMonths) {
        this.customActionTimeoutInMins = customActionTimeoutInMins;
        this.daysOfWeeks = daysOfWeeks;
        this.hoursOfDays = hoursOfDays;
        this.isCustomActionTimeoutEnabled = isCustomActionTimeoutEnabled;
        this.leadTimeInWeeks = leadTimeInWeeks;
        this.months = months;
        this.patchingMode = patchingMode;
        this.preference = preference;
        this.weeksOfMonths = weeksOfMonths;
    }

    /**
     * @return Determines the amount of time the system will wait before the start of each database server patching operation. Custom action timeout is in minutes and valid value is between 15 to 120 (inclusive).
     * 
     */
    public Integer customActionTimeoutInMins() {
        return this.customActionTimeoutInMins;
    }
    /**
     * @return Days during the week when maintenance should be performed.
     * 
     */
    public List<GetCloudExadataInfrastructuresCloudExadataInfrastructureMaintenanceWindowDaysOfWeek> daysOfWeeks() {
        return this.daysOfWeeks;
    }
    /**
     * @return The window of hours during the day when maintenance should be performed. The window is a 4 hour slot. Valid values are
     * * 0 - represents time slot 0:00 - 3:59 UTC - 4 - represents time slot 4:00 - 7:59 UTC - 8 - represents time slot 8:00 - 11:59 UTC - 12 - represents time slot 12:00 - 15:59 UTC - 16 - represents time slot 16:00 - 19:59 UTC - 20 - represents time slot 20:00 - 23:59 UTC
     * 
     */
    public List<Integer> hoursOfDays() {
        return this.hoursOfDays;
    }
    /**
     * @return If true, enables the configuration of a custom action timeout (waiting period) between database server patching operations.
     * 
     */
    public Boolean isCustomActionTimeoutEnabled() {
        return this.isCustomActionTimeoutEnabled;
    }
    /**
     * @return Lead time window allows user to set a lead time to prepare for a down time. The lead time is in weeks and valid value is between 1 to 4.
     * 
     */
    public Integer leadTimeInWeeks() {
        return this.leadTimeInWeeks;
    }
    /**
     * @return Months during the year when maintenance should be performed.
     * 
     */
    public List<GetCloudExadataInfrastructuresCloudExadataInfrastructureMaintenanceWindowMonth> months() {
        return this.months;
    }
    /**
     * @return Cloud Exadata infrastructure node patching method, either &#34;ROLLING&#34; or &#34;NONROLLING&#34;. Default value is ROLLING.
     * 
     */
    public String patchingMode() {
        return this.patchingMode;
    }
    /**
     * @return The maintenance window scheduling preference.
     * 
     */
    public String preference() {
        return this.preference;
    }
    /**
     * @return Weeks during the month when maintenance should be performed. Weeks start on the 1st, 8th, 15th, and 22nd days of the month, and have a duration of 7 days. Weeks start and end based on calendar dates, not days of the week. For example, to allow maintenance during the 2nd week of the month (from the 8th day to the 14th day of the month), use the value 2. Maintenance cannot be scheduled for the fifth week of months that contain more than 28 days. Note that this parameter works in conjunction with the  daysOfWeek and hoursOfDay parameters to allow you to specify specific days of the week and hours that maintenance will be performed.
     * 
     */
    public List<Integer> weeksOfMonths() {
        return this.weeksOfMonths;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetCloudExadataInfrastructuresCloudExadataInfrastructureMaintenanceWindow defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Integer customActionTimeoutInMins;
        private List<GetCloudExadataInfrastructuresCloudExadataInfrastructureMaintenanceWindowDaysOfWeek> daysOfWeeks;
        private List<Integer> hoursOfDays;
        private Boolean isCustomActionTimeoutEnabled;
        private Integer leadTimeInWeeks;
        private List<GetCloudExadataInfrastructuresCloudExadataInfrastructureMaintenanceWindowMonth> months;
        private String patchingMode;
        private String preference;
        private List<Integer> weeksOfMonths;

        public Builder() {
    	      // Empty
        }

        public Builder(GetCloudExadataInfrastructuresCloudExadataInfrastructureMaintenanceWindow defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.customActionTimeoutInMins = defaults.customActionTimeoutInMins;
    	      this.daysOfWeeks = defaults.daysOfWeeks;
    	      this.hoursOfDays = defaults.hoursOfDays;
    	      this.isCustomActionTimeoutEnabled = defaults.isCustomActionTimeoutEnabled;
    	      this.leadTimeInWeeks = defaults.leadTimeInWeeks;
    	      this.months = defaults.months;
    	      this.patchingMode = defaults.patchingMode;
    	      this.preference = defaults.preference;
    	      this.weeksOfMonths = defaults.weeksOfMonths;
        }

        public Builder customActionTimeoutInMins(Integer customActionTimeoutInMins) {
            this.customActionTimeoutInMins = Objects.requireNonNull(customActionTimeoutInMins);
            return this;
        }
        public Builder daysOfWeeks(List<GetCloudExadataInfrastructuresCloudExadataInfrastructureMaintenanceWindowDaysOfWeek> daysOfWeeks) {
            this.daysOfWeeks = Objects.requireNonNull(daysOfWeeks);
            return this;
        }
        public Builder daysOfWeeks(GetCloudExadataInfrastructuresCloudExadataInfrastructureMaintenanceWindowDaysOfWeek... daysOfWeeks) {
            return daysOfWeeks(List.of(daysOfWeeks));
        }
        public Builder hoursOfDays(List<Integer> hoursOfDays) {
            this.hoursOfDays = Objects.requireNonNull(hoursOfDays);
            return this;
        }
        public Builder hoursOfDays(Integer... hoursOfDays) {
            return hoursOfDays(List.of(hoursOfDays));
        }
        public Builder isCustomActionTimeoutEnabled(Boolean isCustomActionTimeoutEnabled) {
            this.isCustomActionTimeoutEnabled = Objects.requireNonNull(isCustomActionTimeoutEnabled);
            return this;
        }
        public Builder leadTimeInWeeks(Integer leadTimeInWeeks) {
            this.leadTimeInWeeks = Objects.requireNonNull(leadTimeInWeeks);
            return this;
        }
        public Builder months(List<GetCloudExadataInfrastructuresCloudExadataInfrastructureMaintenanceWindowMonth> months) {
            this.months = Objects.requireNonNull(months);
            return this;
        }
        public Builder months(GetCloudExadataInfrastructuresCloudExadataInfrastructureMaintenanceWindowMonth... months) {
            return months(List.of(months));
        }
        public Builder patchingMode(String patchingMode) {
            this.patchingMode = Objects.requireNonNull(patchingMode);
            return this;
        }
        public Builder preference(String preference) {
            this.preference = Objects.requireNonNull(preference);
            return this;
        }
        public Builder weeksOfMonths(List<Integer> weeksOfMonths) {
            this.weeksOfMonths = Objects.requireNonNull(weeksOfMonths);
            return this;
        }
        public Builder weeksOfMonths(Integer... weeksOfMonths) {
            return weeksOfMonths(List.of(weeksOfMonths));
        }        public GetCloudExadataInfrastructuresCloudExadataInfrastructureMaintenanceWindow build() {
            return new GetCloudExadataInfrastructuresCloudExadataInfrastructureMaintenanceWindow(customActionTimeoutInMins, daysOfWeeks, hoursOfDays, isCustomActionTimeoutEnabled, leadTimeInWeeks, months, patchingMode, preference, weeksOfMonths);
        }
    }
}
