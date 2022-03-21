// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.sqladmin_v1.inputs;

import io.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


/**
 * Deny maintenance Periods. This specifies a date range during when all CSA rollout will be denied.
 * 
 */
public final class DenyMaintenancePeriodResponse extends io.pulumi.resources.InvokeArgs {

    public static final DenyMaintenancePeriodResponse Empty = new DenyMaintenancePeriodResponse();

    /**
     * "deny maintenance period" end date. If the year of the end date is empty, the year of the start date also must be empty. In this case, it means the no maintenance interval recurs every year. The date is in format yyyy-mm-dd i.e., 2020-11-01, or mm-dd, i.e., 11-01
     * 
     */
    @Import(name="endDate", required=true)
      private final String endDate;

    public String getEndDate() {
        return this.endDate;
    }

    /**
     * "deny maintenance period" start date. If the year of the start date is empty, the year of the end date also must be empty. In this case, it means the deny maintenance period recurs every year. The date is in format yyyy-mm-dd i.e., 2020-11-01, or mm-dd, i.e., 11-01
     * 
     */
    @Import(name="startDate", required=true)
      private final String startDate;

    public String getStartDate() {
        return this.startDate;
    }

    /**
     * Time in UTC when the "deny maintenance period" starts on start_date and ends on end_date. The time is in format: HH:mm:SS, i.e., 00:00:00
     * 
     */
    @Import(name="time", required=true)
      private final String time;

    public String getTime() {
        return this.time;
    }

    public DenyMaintenancePeriodResponse(
        String endDate,
        String startDate,
        String time) {
        this.endDate = Objects.requireNonNull(endDate, "expected parameter 'endDate' to be non-null");
        this.startDate = Objects.requireNonNull(startDate, "expected parameter 'startDate' to be non-null");
        this.time = Objects.requireNonNull(time, "expected parameter 'time' to be non-null");
    }

    private DenyMaintenancePeriodResponse() {
        this.endDate = null;
        this.startDate = null;
        this.time = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(DenyMaintenancePeriodResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String endDate;
        private String startDate;
        private String time;

        public Builder() {
    	      // Empty
        }

        public Builder(DenyMaintenancePeriodResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.endDate = defaults.endDate;
    	      this.startDate = defaults.startDate;
    	      this.time = defaults.time;
        }

        public Builder endDate(String endDate) {
            this.endDate = Objects.requireNonNull(endDate);
            return this;
        }
        public Builder startDate(String startDate) {
            this.startDate = Objects.requireNonNull(startDate);
            return this;
        }
        public Builder time(String time) {
            this.time = Objects.requireNonNull(time);
            return this;
        }        public DenyMaintenancePeriodResponse build() {
            return new DenyMaintenancePeriodResponse(endDate, startDate, time);
        }
    }
}
