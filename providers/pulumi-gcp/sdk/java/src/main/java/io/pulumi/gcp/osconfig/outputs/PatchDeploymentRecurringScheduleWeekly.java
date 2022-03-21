// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.osconfig.outputs;

import io.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class PatchDeploymentRecurringScheduleWeekly {
    /**
     * A day of the week.
     * Possible values are `MONDAY`, `TUESDAY`, `WEDNESDAY`, `THURSDAY`, `FRIDAY`, `SATURDAY`, and `SUNDAY`.
     * 
     */
    private final String dayOfWeek;

    @CustomType.Constructor
    private PatchDeploymentRecurringScheduleWeekly(@CustomType.Parameter("dayOfWeek") String dayOfWeek) {
        this.dayOfWeek = dayOfWeek;
    }

    /**
     * A day of the week.
     * Possible values are `MONDAY`, `TUESDAY`, `WEDNESDAY`, `THURSDAY`, `FRIDAY`, `SATURDAY`, and `SUNDAY`.
     * 
    */
    public String getDayOfWeek() {
        return this.dayOfWeek;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(PatchDeploymentRecurringScheduleWeekly defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String dayOfWeek;

        public Builder() {
    	      // Empty
        }

        public Builder(PatchDeploymentRecurringScheduleWeekly defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.dayOfWeek = defaults.dayOfWeek;
        }

        public Builder dayOfWeek(String dayOfWeek) {
            this.dayOfWeek = Objects.requireNonNull(dayOfWeek);
            return this;
        }        public PatchDeploymentRecurringScheduleWeekly build() {
            return new PatchDeploymentRecurringScheduleWeekly(dayOfWeek);
        }
    }
}
