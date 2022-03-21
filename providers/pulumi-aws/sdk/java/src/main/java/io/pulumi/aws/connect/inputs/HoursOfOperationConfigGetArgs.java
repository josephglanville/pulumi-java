// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.connect.inputs;

import io.pulumi.aws.connect.inputs.HoursOfOperationConfigEndTimeGetArgs;
import io.pulumi.aws.connect.inputs.HoursOfOperationConfigStartTimeGetArgs;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


public final class HoursOfOperationConfigGetArgs extends io.pulumi.resources.ResourceArgs {

    public static final HoursOfOperationConfigGetArgs Empty = new HoursOfOperationConfigGetArgs();

    /**
     * Specifies the day that the hours of operation applies to.
     * 
     */
    @Import(name="day", required=true)
      private final Output<String> day;

    public Output<String> getDay() {
        return this.day;
    }

    /**
     * A end time block specifies the time that your contact center closes. The `end_time` is documented below.
     * 
     */
    @Import(name="endTime", required=true)
      private final Output<HoursOfOperationConfigEndTimeGetArgs> endTime;

    public Output<HoursOfOperationConfigEndTimeGetArgs> getEndTime() {
        return this.endTime;
    }

    /**
     * A start time block specifies the time that your contact center opens. The `start_time` is documented below.
     * 
     */
    @Import(name="startTime", required=true)
      private final Output<HoursOfOperationConfigStartTimeGetArgs> startTime;

    public Output<HoursOfOperationConfigStartTimeGetArgs> getStartTime() {
        return this.startTime;
    }

    public HoursOfOperationConfigGetArgs(
        Output<String> day,
        Output<HoursOfOperationConfigEndTimeGetArgs> endTime,
        Output<HoursOfOperationConfigStartTimeGetArgs> startTime) {
        this.day = Objects.requireNonNull(day, "expected parameter 'day' to be non-null");
        this.endTime = Objects.requireNonNull(endTime, "expected parameter 'endTime' to be non-null");
        this.startTime = Objects.requireNonNull(startTime, "expected parameter 'startTime' to be non-null");
    }

    private HoursOfOperationConfigGetArgs() {
        this.day = Output.empty();
        this.endTime = Output.empty();
        this.startTime = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(HoursOfOperationConfigGetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Output<String> day;
        private Output<HoursOfOperationConfigEndTimeGetArgs> endTime;
        private Output<HoursOfOperationConfigStartTimeGetArgs> startTime;

        public Builder() {
    	      // Empty
        }

        public Builder(HoursOfOperationConfigGetArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.day = defaults.day;
    	      this.endTime = defaults.endTime;
    	      this.startTime = defaults.startTime;
        }

        public Builder day(Output<String> day) {
            this.day = Objects.requireNonNull(day);
            return this;
        }
        public Builder day(String day) {
            this.day = Output.of(Objects.requireNonNull(day));
            return this;
        }
        public Builder endTime(Output<HoursOfOperationConfigEndTimeGetArgs> endTime) {
            this.endTime = Objects.requireNonNull(endTime);
            return this;
        }
        public Builder endTime(HoursOfOperationConfigEndTimeGetArgs endTime) {
            this.endTime = Output.of(Objects.requireNonNull(endTime));
            return this;
        }
        public Builder startTime(Output<HoursOfOperationConfigStartTimeGetArgs> startTime) {
            this.startTime = Objects.requireNonNull(startTime);
            return this;
        }
        public Builder startTime(HoursOfOperationConfigStartTimeGetArgs startTime) {
            this.startTime = Output.of(Objects.requireNonNull(startTime));
            return this;
        }        public HoursOfOperationConfigGetArgs build() {
            return new HoursOfOperationConfigGetArgs(day, endTime, startTime);
        }
    }
}
