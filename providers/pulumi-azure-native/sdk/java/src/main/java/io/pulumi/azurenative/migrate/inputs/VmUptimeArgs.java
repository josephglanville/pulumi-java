// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.migrate.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.internal.annotations.InputImport;
import java.lang.Double;
import java.util.Objects;
import javax.annotation.Nullable;


public final class VmUptimeArgs extends io.pulumi.resources.ResourceArgs {

    public static final VmUptimeArgs Empty = new VmUptimeArgs();

    @InputImport(name="daysPerMonth")
    private final @Nullable Input<Double> daysPerMonth;

    public Input<Double> getDaysPerMonth() {
        return this.daysPerMonth == null ? Input.empty() : this.daysPerMonth;
    }

    @InputImport(name="hoursPerDay")
    private final @Nullable Input<Double> hoursPerDay;

    public Input<Double> getHoursPerDay() {
        return this.hoursPerDay == null ? Input.empty() : this.hoursPerDay;
    }

    public VmUptimeArgs(
        @Nullable Input<Double> daysPerMonth,
        @Nullable Input<Double> hoursPerDay) {
        this.daysPerMonth = daysPerMonth;
        this.hoursPerDay = hoursPerDay;
    }

    private VmUptimeArgs() {
        this.daysPerMonth = Input.empty();
        this.hoursPerDay = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(VmUptimeArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<Double> daysPerMonth;
        private @Nullable Input<Double> hoursPerDay;

        public Builder() {
    	      // Empty
        }

        public Builder(VmUptimeArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.daysPerMonth = defaults.daysPerMonth;
    	      this.hoursPerDay = defaults.hoursPerDay;
        }

        public Builder setDaysPerMonth(@Nullable Input<Double> daysPerMonth) {
            this.daysPerMonth = daysPerMonth;
            return this;
        }

        public Builder setDaysPerMonth(@Nullable Double daysPerMonth) {
            this.daysPerMonth = Input.ofNullable(daysPerMonth);
            return this;
        }

        public Builder setHoursPerDay(@Nullable Input<Double> hoursPerDay) {
            this.hoursPerDay = hoursPerDay;
            return this;
        }

        public Builder setHoursPerDay(@Nullable Double hoursPerDay) {
            this.hoursPerDay = Input.ofNullable(hoursPerDay);
            return this;
        }

        public VmUptimeArgs build() {
            return new VmUptimeArgs(daysPerMonth, hoursPerDay);
        }
    }
}
