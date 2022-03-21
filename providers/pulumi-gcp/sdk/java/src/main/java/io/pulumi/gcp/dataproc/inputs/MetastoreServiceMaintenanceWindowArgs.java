// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.dataproc.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;


public final class MetastoreServiceMaintenanceWindowArgs extends io.pulumi.resources.ResourceArgs {

    public static final MetastoreServiceMaintenanceWindowArgs Empty = new MetastoreServiceMaintenanceWindowArgs();

    /**
     * The day of week, when the window starts.
     * Possible values are `MONDAY`, `TUESDAY`, `WEDNESDAY`, `THURSDAY`, `FRIDAY`, `SATURDAY`, and `SUNDAY`.
     * 
     */
    @Import(name="dayOfWeek", required=true)
      private final Output<String> dayOfWeek;

    public Output<String> getDayOfWeek() {
        return this.dayOfWeek;
    }

    /**
     * The hour of day (0-23) when the window starts.
     * 
     */
    @Import(name="hourOfDay", required=true)
      private final Output<Integer> hourOfDay;

    public Output<Integer> getHourOfDay() {
        return this.hourOfDay;
    }

    public MetastoreServiceMaintenanceWindowArgs(
        Output<String> dayOfWeek,
        Output<Integer> hourOfDay) {
        this.dayOfWeek = Objects.requireNonNull(dayOfWeek, "expected parameter 'dayOfWeek' to be non-null");
        this.hourOfDay = Objects.requireNonNull(hourOfDay, "expected parameter 'hourOfDay' to be non-null");
    }

    private MetastoreServiceMaintenanceWindowArgs() {
        this.dayOfWeek = Output.empty();
        this.hourOfDay = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(MetastoreServiceMaintenanceWindowArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Output<String> dayOfWeek;
        private Output<Integer> hourOfDay;

        public Builder() {
    	      // Empty
        }

        public Builder(MetastoreServiceMaintenanceWindowArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.dayOfWeek = defaults.dayOfWeek;
    	      this.hourOfDay = defaults.hourOfDay;
        }

        public Builder dayOfWeek(Output<String> dayOfWeek) {
            this.dayOfWeek = Objects.requireNonNull(dayOfWeek);
            return this;
        }
        public Builder dayOfWeek(String dayOfWeek) {
            this.dayOfWeek = Output.of(Objects.requireNonNull(dayOfWeek));
            return this;
        }
        public Builder hourOfDay(Output<Integer> hourOfDay) {
            this.hourOfDay = Objects.requireNonNull(hourOfDay);
            return this;
        }
        public Builder hourOfDay(Integer hourOfDay) {
            this.hourOfDay = Output.of(Objects.requireNonNull(hourOfDay));
            return this;
        }        public MetastoreServiceMaintenanceWindowArgs build() {
            return new MetastoreServiceMaintenanceWindowArgs(dayOfWeek, hourOfDay);
        }
    }
}
