// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.databoxedge;

import io.pulumi.azurenative.databoxedge.enums.DayOfWeek;
import io.pulumi.core.Either;
import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


public final class BandwidthScheduleArgs extends io.pulumi.resources.ResourceArgs {

    public static final BandwidthScheduleArgs Empty = new BandwidthScheduleArgs();

    /**
     * The days of the week when this schedule is applicable.
     * 
     */
    @InputImport(name="days", required=true)
      private final Input<List<Either<String,DayOfWeek>>> days;

    public Input<List<Either<String,DayOfWeek>>> getDays() {
        return this.days;
    }

    /**
     * The device name.
     * 
     */
    @InputImport(name="deviceName", required=true)
      private final Input<String> deviceName;

    public Input<String> getDeviceName() {
        return this.deviceName;
    }

    /**
     * The bandwidth schedule name which needs to be added/updated.
     * 
     */
    @InputImport(name="name")
      private final @Nullable Input<String> name;

    public Input<String> getName() {
        return this.name == null ? Input.empty() : this.name;
    }

    /**
     * The bandwidth rate in Mbps.
     * 
     */
    @InputImport(name="rateInMbps", required=true)
      private final Input<Integer> rateInMbps;

    public Input<Integer> getRateInMbps() {
        return this.rateInMbps;
    }

    /**
     * The resource group name.
     * 
     */
    @InputImport(name="resourceGroupName", required=true)
      private final Input<String> resourceGroupName;

    public Input<String> getResourceGroupName() {
        return this.resourceGroupName;
    }

    /**
     * The start time of the schedule in UTC.
     * 
     */
    @InputImport(name="start", required=true)
      private final Input<String> start;

    public Input<String> getStart() {
        return this.start;
    }

    /**
     * The stop time of the schedule in UTC.
     * 
     */
    @InputImport(name="stop", required=true)
      private final Input<String> stop;

    public Input<String> getStop() {
        return this.stop;
    }

    public BandwidthScheduleArgs(
        Input<List<Either<String,DayOfWeek>>> days,
        Input<String> deviceName,
        @Nullable Input<String> name,
        Input<Integer> rateInMbps,
        Input<String> resourceGroupName,
        Input<String> start,
        Input<String> stop) {
        this.days = Objects.requireNonNull(days, "expected parameter 'days' to be non-null");
        this.deviceName = Objects.requireNonNull(deviceName, "expected parameter 'deviceName' to be non-null");
        this.name = name;
        this.rateInMbps = Objects.requireNonNull(rateInMbps, "expected parameter 'rateInMbps' to be non-null");
        this.resourceGroupName = Objects.requireNonNull(resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
        this.start = Objects.requireNonNull(start, "expected parameter 'start' to be non-null");
        this.stop = Objects.requireNonNull(stop, "expected parameter 'stop' to be non-null");
    }

    private BandwidthScheduleArgs() {
        this.days = Input.empty();
        this.deviceName = Input.empty();
        this.name = Input.empty();
        this.rateInMbps = Input.empty();
        this.resourceGroupName = Input.empty();
        this.start = Input.empty();
        this.stop = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(BandwidthScheduleArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Input<List<Either<String,DayOfWeek>>> days;
        private Input<String> deviceName;
        private @Nullable Input<String> name;
        private Input<Integer> rateInMbps;
        private Input<String> resourceGroupName;
        private Input<String> start;
        private Input<String> stop;

        public Builder() {
    	      // Empty
        }

        public Builder(BandwidthScheduleArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.days = defaults.days;
    	      this.deviceName = defaults.deviceName;
    	      this.name = defaults.name;
    	      this.rateInMbps = defaults.rateInMbps;
    	      this.resourceGroupName = defaults.resourceGroupName;
    	      this.start = defaults.start;
    	      this.stop = defaults.stop;
        }

        public Builder setDays(Input<List<Either<String,DayOfWeek>>> days) {
            this.days = Objects.requireNonNull(days);
            return this;
        }

        public Builder setDays(List<Either<String,DayOfWeek>> days) {
            this.days = Input.of(Objects.requireNonNull(days));
            return this;
        }

        public Builder setDeviceName(Input<String> deviceName) {
            this.deviceName = Objects.requireNonNull(deviceName);
            return this;
        }

        public Builder setDeviceName(String deviceName) {
            this.deviceName = Input.of(Objects.requireNonNull(deviceName));
            return this;
        }

        public Builder setName(@Nullable Input<String> name) {
            this.name = name;
            return this;
        }

        public Builder setName(@Nullable String name) {
            this.name = Input.ofNullable(name);
            return this;
        }

        public Builder setRateInMbps(Input<Integer> rateInMbps) {
            this.rateInMbps = Objects.requireNonNull(rateInMbps);
            return this;
        }

        public Builder setRateInMbps(Integer rateInMbps) {
            this.rateInMbps = Input.of(Objects.requireNonNull(rateInMbps));
            return this;
        }

        public Builder setResourceGroupName(Input<String> resourceGroupName) {
            this.resourceGroupName = Objects.requireNonNull(resourceGroupName);
            return this;
        }

        public Builder setResourceGroupName(String resourceGroupName) {
            this.resourceGroupName = Input.of(Objects.requireNonNull(resourceGroupName));
            return this;
        }

        public Builder setStart(Input<String> start) {
            this.start = Objects.requireNonNull(start);
            return this;
        }

        public Builder setStart(String start) {
            this.start = Input.of(Objects.requireNonNull(start));
            return this;
        }

        public Builder setStop(Input<String> stop) {
            this.stop = Objects.requireNonNull(stop);
            return this;
        }

        public Builder setStop(String stop) {
            this.stop = Input.of(Objects.requireNonNull(stop));
            return this;
        }
        public BandwidthScheduleArgs build() {
            return new BandwidthScheduleArgs(days, deviceName, name, rateInMbps, resourceGroupName, start, stop);
        }
    }
}
