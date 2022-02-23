// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.migrate.inputs;

import io.pulumi.core.annotations.InputImport;
import java.lang.Double;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class VmUptimeResponse extends io.pulumi.resources.InvokeArgs {

    public static final VmUptimeResponse Empty = new VmUptimeResponse();

    /**
     * Number of days in a month for VM uptime.
     * 
     */
    @InputImport(name="daysPerMonth")
      private final @Nullable Double daysPerMonth;

    public Optional<Double> getDaysPerMonth() {
        return this.daysPerMonth == null ? Optional.empty() : Optional.ofNullable(this.daysPerMonth);
    }

    /**
     * Number of hours per day for VM uptime.
     * 
     */
    @InputImport(name="hoursPerDay")
      private final @Nullable Double hoursPerDay;

    public Optional<Double> getHoursPerDay() {
        return this.hoursPerDay == null ? Optional.empty() : Optional.ofNullable(this.hoursPerDay);
    }

    public VmUptimeResponse(
        @Nullable Double daysPerMonth,
        @Nullable Double hoursPerDay) {
        this.daysPerMonth = daysPerMonth;
        this.hoursPerDay = hoursPerDay;
    }

    private VmUptimeResponse() {
        this.daysPerMonth = null;
        this.hoursPerDay = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(VmUptimeResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Double daysPerMonth;
        private @Nullable Double hoursPerDay;

        public Builder() {
    	      // Empty
        }

        public Builder(VmUptimeResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.daysPerMonth = defaults.daysPerMonth;
    	      this.hoursPerDay = defaults.hoursPerDay;
        }

        public Builder setDaysPerMonth(@Nullable Double daysPerMonth) {
            this.daysPerMonth = daysPerMonth;
            return this;
        }

        public Builder setHoursPerDay(@Nullable Double hoursPerDay) {
            this.hoursPerDay = hoursPerDay;
            return this;
        }
        public VmUptimeResponse build() {
            return new VmUptimeResponse(daysPerMonth, hoursPerDay);
        }
    }
}
