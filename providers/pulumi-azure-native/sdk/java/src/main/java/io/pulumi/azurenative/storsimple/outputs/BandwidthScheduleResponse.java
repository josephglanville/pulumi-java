// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.storsimple.outputs;

import io.pulumi.azurenative.storsimple.outputs.TimeResponse;
import io.pulumi.core.annotations.CustomType;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Objects;

@CustomType
public final class BandwidthScheduleResponse {
    /**
     * The days of the week when this schedule is applicable.
     * 
     */
    private final List<String> days;
    /**
     * The rate in Mbps.
     * 
     */
    private final Integer rateInMbps;
    /**
     * The start time of the schedule.
     * 
     */
    private final TimeResponse start;
    /**
     * The stop time of the schedule.
     * 
     */
    private final TimeResponse stop;

    @CustomType.Constructor
    private BandwidthScheduleResponse(
        @CustomType.Parameter("days") List<String> days,
        @CustomType.Parameter("rateInMbps") Integer rateInMbps,
        @CustomType.Parameter("start") TimeResponse start,
        @CustomType.Parameter("stop") TimeResponse stop) {
        this.days = days;
        this.rateInMbps = rateInMbps;
        this.start = start;
        this.stop = stop;
    }

    /**
     * The days of the week when this schedule is applicable.
     * 
    */
    public List<String> getDays() {
        return this.days;
    }
    /**
     * The rate in Mbps.
     * 
    */
    public Integer getRateInMbps() {
        return this.rateInMbps;
    }
    /**
     * The start time of the schedule.
     * 
    */
    public TimeResponse getStart() {
        return this.start;
    }
    /**
     * The stop time of the schedule.
     * 
    */
    public TimeResponse getStop() {
        return this.stop;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(BandwidthScheduleResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private List<String> days;
        private Integer rateInMbps;
        private TimeResponse start;
        private TimeResponse stop;

        public Builder() {
    	      // Empty
        }

        public Builder(BandwidthScheduleResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.days = defaults.days;
    	      this.rateInMbps = defaults.rateInMbps;
    	      this.start = defaults.start;
    	      this.stop = defaults.stop;
        }

        public Builder days(List<String> days) {
            this.days = Objects.requireNonNull(days);
            return this;
        }
        public Builder days(String... days) {
            return days(List.of(days));
        }
        public Builder rateInMbps(Integer rateInMbps) {
            this.rateInMbps = Objects.requireNonNull(rateInMbps);
            return this;
        }
        public Builder start(TimeResponse start) {
            this.start = Objects.requireNonNull(start);
            return this;
        }
        public Builder stop(TimeResponse stop) {
            this.stop = Objects.requireNonNull(stop);
            return this;
        }        public BandwidthScheduleResponse build() {
            return new BandwidthScheduleResponse(days, rateInMbps, start, stop);
        }
    }
}
