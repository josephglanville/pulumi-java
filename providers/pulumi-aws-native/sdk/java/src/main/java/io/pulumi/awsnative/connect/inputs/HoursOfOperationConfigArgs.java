// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.connect.inputs;

import io.pulumi.awsnative.connect.enums.HoursOfOperationConfigDay;
import io.pulumi.awsnative.connect.inputs.HoursOfOperationTimeSliceArgs;
import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.util.Objects;


/**
 * Contains information about the hours of operation.
 * 
 */
public final class HoursOfOperationConfigArgs extends io.pulumi.resources.ResourceArgs {

    public static final HoursOfOperationConfigArgs Empty = new HoursOfOperationConfigArgs();

    /**
     * The day that the hours of operation applies to.
     * 
     */
    @InputImport(name="day", required=true)
      private final Input<HoursOfOperationConfigDay> day;

    public Input<HoursOfOperationConfigDay> getDay() {
        return this.day;
    }

    /**
     * The end time that your contact center closes.
     * 
     */
    @InputImport(name="endTime", required=true)
      private final Input<HoursOfOperationTimeSliceArgs> endTime;

    public Input<HoursOfOperationTimeSliceArgs> getEndTime() {
        return this.endTime;
    }

    /**
     * The start time that your contact center opens.
     * 
     */
    @InputImport(name="startTime", required=true)
      private final Input<HoursOfOperationTimeSliceArgs> startTime;

    public Input<HoursOfOperationTimeSliceArgs> getStartTime() {
        return this.startTime;
    }

    public HoursOfOperationConfigArgs(
        Input<HoursOfOperationConfigDay> day,
        Input<HoursOfOperationTimeSliceArgs> endTime,
        Input<HoursOfOperationTimeSliceArgs> startTime) {
        this.day = Objects.requireNonNull(day, "expected parameter 'day' to be non-null");
        this.endTime = Objects.requireNonNull(endTime, "expected parameter 'endTime' to be non-null");
        this.startTime = Objects.requireNonNull(startTime, "expected parameter 'startTime' to be non-null");
    }

    private HoursOfOperationConfigArgs() {
        this.day = Input.empty();
        this.endTime = Input.empty();
        this.startTime = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(HoursOfOperationConfigArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Input<HoursOfOperationConfigDay> day;
        private Input<HoursOfOperationTimeSliceArgs> endTime;
        private Input<HoursOfOperationTimeSliceArgs> startTime;

        public Builder() {
    	      // Empty
        }

        public Builder(HoursOfOperationConfigArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.day = defaults.day;
    	      this.endTime = defaults.endTime;
    	      this.startTime = defaults.startTime;
        }

        public Builder setDay(Input<HoursOfOperationConfigDay> day) {
            this.day = Objects.requireNonNull(day);
            return this;
        }

        public Builder setDay(HoursOfOperationConfigDay day) {
            this.day = Input.of(Objects.requireNonNull(day));
            return this;
        }

        public Builder setEndTime(Input<HoursOfOperationTimeSliceArgs> endTime) {
            this.endTime = Objects.requireNonNull(endTime);
            return this;
        }

        public Builder setEndTime(HoursOfOperationTimeSliceArgs endTime) {
            this.endTime = Input.of(Objects.requireNonNull(endTime));
            return this;
        }

        public Builder setStartTime(Input<HoursOfOperationTimeSliceArgs> startTime) {
            this.startTime = Objects.requireNonNull(startTime);
            return this;
        }

        public Builder setStartTime(HoursOfOperationTimeSliceArgs startTime) {
            this.startTime = Input.of(Objects.requireNonNull(startTime));
            return this;
        }
        public HoursOfOperationConfigArgs build() {
            return new HoursOfOperationConfigArgs(day, endTime, startTime);
        }
    }
}
