// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.hdinsight.inputs;

import io.pulumi.azurenative.hdinsight.enums.DaysOfWeek;
import io.pulumi.azurenative.hdinsight.inputs.AutoscaleTimeAndCapacityArgs;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * Parameters for a schedule-based autoscale rule, consisting of an array of days + a time and capacity
 * 
 */
public final class AutoscaleScheduleArgs extends io.pulumi.resources.ResourceArgs {

    public static final AutoscaleScheduleArgs Empty = new AutoscaleScheduleArgs();

    /**
     * Days of the week for a schedule-based autoscale rule
     * 
     */
    @Import(name="days")
      private final @Nullable Output<List<DaysOfWeek>> days;

    public Output<List<DaysOfWeek>> getDays() {
        return this.days == null ? Output.empty() : this.days;
    }

    /**
     * Time and capacity for a schedule-based autoscale rule
     * 
     */
    @Import(name="timeAndCapacity")
      private final @Nullable Output<AutoscaleTimeAndCapacityArgs> timeAndCapacity;

    public Output<AutoscaleTimeAndCapacityArgs> getTimeAndCapacity() {
        return this.timeAndCapacity == null ? Output.empty() : this.timeAndCapacity;
    }

    public AutoscaleScheduleArgs(
        @Nullable Output<List<DaysOfWeek>> days,
        @Nullable Output<AutoscaleTimeAndCapacityArgs> timeAndCapacity) {
        this.days = days;
        this.timeAndCapacity = timeAndCapacity;
    }

    private AutoscaleScheduleArgs() {
        this.days = Output.empty();
        this.timeAndCapacity = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(AutoscaleScheduleArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<List<DaysOfWeek>> days;
        private @Nullable Output<AutoscaleTimeAndCapacityArgs> timeAndCapacity;

        public Builder() {
    	      // Empty
        }

        public Builder(AutoscaleScheduleArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.days = defaults.days;
    	      this.timeAndCapacity = defaults.timeAndCapacity;
        }

        public Builder days(@Nullable Output<List<DaysOfWeek>> days) {
            this.days = days;
            return this;
        }
        public Builder days(@Nullable List<DaysOfWeek> days) {
            this.days = Output.ofNullable(days);
            return this;
        }
        public Builder days(DaysOfWeek... days) {
            return days(List.of(days));
        }
        public Builder timeAndCapacity(@Nullable Output<AutoscaleTimeAndCapacityArgs> timeAndCapacity) {
            this.timeAndCapacity = timeAndCapacity;
            return this;
        }
        public Builder timeAndCapacity(@Nullable AutoscaleTimeAndCapacityArgs timeAndCapacity) {
            this.timeAndCapacity = Output.ofNullable(timeAndCapacity);
            return this;
        }        public AutoscaleScheduleArgs build() {
            return new AutoscaleScheduleArgs(days, timeAndCapacity);
        }
    }
}
