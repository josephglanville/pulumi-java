// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.desktopvirtualization.inputs;

import io.pulumi.core.annotations.InputImport;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Scaling plan schedule.
 * 
 */
public final class ScalingScheduleResponse extends io.pulumi.resources.InvokeArgs {

    public static final ScalingScheduleResponse Empty = new ScalingScheduleResponse();

    /**
     * Set of days of the week on which this schedule is active.
     * 
     */
    @InputImport(name="daysOfWeek")
      private final @Nullable List<String> daysOfWeek;

    public List<String> getDaysOfWeek() {
        return this.daysOfWeek == null ? List.of() : this.daysOfWeek;
    }

    /**
     * Name of the scaling schedule.
     * 
     */
    @InputImport(name="name")
      private final @Nullable String name;

    public Optional<String> getName() {
        return this.name == null ? Optional.empty() : Optional.ofNullable(this.name);
    }

    /**
     * Load balancing algorithm for off-peak period.
     * 
     */
    @InputImport(name="offPeakLoadBalancingAlgorithm")
      private final @Nullable String offPeakLoadBalancingAlgorithm;

    public Optional<String> getOffPeakLoadBalancingAlgorithm() {
        return this.offPeakLoadBalancingAlgorithm == null ? Optional.empty() : Optional.ofNullable(this.offPeakLoadBalancingAlgorithm);
    }

    /**
     * Starting time for off-peak period.
     * 
     */
    @InputImport(name="offPeakStartTime")
      private final @Nullable String offPeakStartTime;

    public Optional<String> getOffPeakStartTime() {
        return this.offPeakStartTime == null ? Optional.empty() : Optional.ofNullable(this.offPeakStartTime);
    }

    /**
     * Load balancing algorithm for peak period.
     * 
     */
    @InputImport(name="peakLoadBalancingAlgorithm")
      private final @Nullable String peakLoadBalancingAlgorithm;

    public Optional<String> getPeakLoadBalancingAlgorithm() {
        return this.peakLoadBalancingAlgorithm == null ? Optional.empty() : Optional.ofNullable(this.peakLoadBalancingAlgorithm);
    }

    /**
     * Starting time for peak period.
     * 
     */
    @InputImport(name="peakStartTime")
      private final @Nullable String peakStartTime;

    public Optional<String> getPeakStartTime() {
        return this.peakStartTime == null ? Optional.empty() : Optional.ofNullable(this.peakStartTime);
    }

    /**
     * Capacity threshold for ramp down period.
     * 
     */
    @InputImport(name="rampDownCapacityThresholdPct")
      private final @Nullable Integer rampDownCapacityThresholdPct;

    public Optional<Integer> getRampDownCapacityThresholdPct() {
        return this.rampDownCapacityThresholdPct == null ? Optional.empty() : Optional.ofNullable(this.rampDownCapacityThresholdPct);
    }

    /**
     * Should users be logged off forcefully from hosts.
     * 
     */
    @InputImport(name="rampDownForceLogoffUsers")
      private final @Nullable Boolean rampDownForceLogoffUsers;

    public Optional<Boolean> getRampDownForceLogoffUsers() {
        return this.rampDownForceLogoffUsers == null ? Optional.empty() : Optional.ofNullable(this.rampDownForceLogoffUsers);
    }

    /**
     * Load balancing algorithm for ramp down period.
     * 
     */
    @InputImport(name="rampDownLoadBalancingAlgorithm")
      private final @Nullable String rampDownLoadBalancingAlgorithm;

    public Optional<String> getRampDownLoadBalancingAlgorithm() {
        return this.rampDownLoadBalancingAlgorithm == null ? Optional.empty() : Optional.ofNullable(this.rampDownLoadBalancingAlgorithm);
    }

    /**
     * Minimum host percentage for ramp down period.
     * 
     */
    @InputImport(name="rampDownMinimumHostsPct")
      private final @Nullable Integer rampDownMinimumHostsPct;

    public Optional<Integer> getRampDownMinimumHostsPct() {
        return this.rampDownMinimumHostsPct == null ? Optional.empty() : Optional.ofNullable(this.rampDownMinimumHostsPct);
    }

    /**
     * Notification message for users during ramp down period.
     * 
     */
    @InputImport(name="rampDownNotificationMessage")
      private final @Nullable String rampDownNotificationMessage;

    public Optional<String> getRampDownNotificationMessage() {
        return this.rampDownNotificationMessage == null ? Optional.empty() : Optional.ofNullable(this.rampDownNotificationMessage);
    }

    /**
     * Starting time for ramp down period.
     * 
     */
    @InputImport(name="rampDownStartTime")
      private final @Nullable String rampDownStartTime;

    public Optional<String> getRampDownStartTime() {
        return this.rampDownStartTime == null ? Optional.empty() : Optional.ofNullable(this.rampDownStartTime);
    }

    /**
     * Specifies when to stop hosts during ramp down period.
     * 
     */
    @InputImport(name="rampDownStopHostsWhen")
      private final @Nullable String rampDownStopHostsWhen;

    public Optional<String> getRampDownStopHostsWhen() {
        return this.rampDownStopHostsWhen == null ? Optional.empty() : Optional.ofNullable(this.rampDownStopHostsWhen);
    }

    /**
     * Number of minutes to wait to stop hosts during ramp down period.
     * 
     */
    @InputImport(name="rampDownWaitTimeMinutes")
      private final @Nullable Integer rampDownWaitTimeMinutes;

    public Optional<Integer> getRampDownWaitTimeMinutes() {
        return this.rampDownWaitTimeMinutes == null ? Optional.empty() : Optional.ofNullable(this.rampDownWaitTimeMinutes);
    }

    /**
     * Capacity threshold for ramp up period.
     * 
     */
    @InputImport(name="rampUpCapacityThresholdPct")
      private final @Nullable Integer rampUpCapacityThresholdPct;

    public Optional<Integer> getRampUpCapacityThresholdPct() {
        return this.rampUpCapacityThresholdPct == null ? Optional.empty() : Optional.ofNullable(this.rampUpCapacityThresholdPct);
    }

    /**
     * Load balancing algorithm for ramp up period.
     * 
     */
    @InputImport(name="rampUpLoadBalancingAlgorithm")
      private final @Nullable String rampUpLoadBalancingAlgorithm;

    public Optional<String> getRampUpLoadBalancingAlgorithm() {
        return this.rampUpLoadBalancingAlgorithm == null ? Optional.empty() : Optional.ofNullable(this.rampUpLoadBalancingAlgorithm);
    }

    /**
     * Minimum host percentage for ramp up period.
     * 
     */
    @InputImport(name="rampUpMinimumHostsPct")
      private final @Nullable Integer rampUpMinimumHostsPct;

    public Optional<Integer> getRampUpMinimumHostsPct() {
        return this.rampUpMinimumHostsPct == null ? Optional.empty() : Optional.ofNullable(this.rampUpMinimumHostsPct);
    }

    /**
     * Starting time for ramp up period.
     * 
     */
    @InputImport(name="rampUpStartTime")
      private final @Nullable String rampUpStartTime;

    public Optional<String> getRampUpStartTime() {
        return this.rampUpStartTime == null ? Optional.empty() : Optional.ofNullable(this.rampUpStartTime);
    }

    public ScalingScheduleResponse(
        @Nullable List<String> daysOfWeek,
        @Nullable String name,
        @Nullable String offPeakLoadBalancingAlgorithm,
        @Nullable String offPeakStartTime,
        @Nullable String peakLoadBalancingAlgorithm,
        @Nullable String peakStartTime,
        @Nullable Integer rampDownCapacityThresholdPct,
        @Nullable Boolean rampDownForceLogoffUsers,
        @Nullable String rampDownLoadBalancingAlgorithm,
        @Nullable Integer rampDownMinimumHostsPct,
        @Nullable String rampDownNotificationMessage,
        @Nullable String rampDownStartTime,
        @Nullable String rampDownStopHostsWhen,
        @Nullable Integer rampDownWaitTimeMinutes,
        @Nullable Integer rampUpCapacityThresholdPct,
        @Nullable String rampUpLoadBalancingAlgorithm,
        @Nullable Integer rampUpMinimumHostsPct,
        @Nullable String rampUpStartTime) {
        this.daysOfWeek = daysOfWeek;
        this.name = name;
        this.offPeakLoadBalancingAlgorithm = offPeakLoadBalancingAlgorithm;
        this.offPeakStartTime = offPeakStartTime;
        this.peakLoadBalancingAlgorithm = peakLoadBalancingAlgorithm;
        this.peakStartTime = peakStartTime;
        this.rampDownCapacityThresholdPct = rampDownCapacityThresholdPct;
        this.rampDownForceLogoffUsers = rampDownForceLogoffUsers;
        this.rampDownLoadBalancingAlgorithm = rampDownLoadBalancingAlgorithm;
        this.rampDownMinimumHostsPct = rampDownMinimumHostsPct;
        this.rampDownNotificationMessage = rampDownNotificationMessage;
        this.rampDownStartTime = rampDownStartTime;
        this.rampDownStopHostsWhen = rampDownStopHostsWhen;
        this.rampDownWaitTimeMinutes = rampDownWaitTimeMinutes;
        this.rampUpCapacityThresholdPct = rampUpCapacityThresholdPct;
        this.rampUpLoadBalancingAlgorithm = rampUpLoadBalancingAlgorithm;
        this.rampUpMinimumHostsPct = rampUpMinimumHostsPct;
        this.rampUpStartTime = rampUpStartTime;
    }

    private ScalingScheduleResponse() {
        this.daysOfWeek = List.of();
        this.name = null;
        this.offPeakLoadBalancingAlgorithm = null;
        this.offPeakStartTime = null;
        this.peakLoadBalancingAlgorithm = null;
        this.peakStartTime = null;
        this.rampDownCapacityThresholdPct = null;
        this.rampDownForceLogoffUsers = null;
        this.rampDownLoadBalancingAlgorithm = null;
        this.rampDownMinimumHostsPct = null;
        this.rampDownNotificationMessage = null;
        this.rampDownStartTime = null;
        this.rampDownStopHostsWhen = null;
        this.rampDownWaitTimeMinutes = null;
        this.rampUpCapacityThresholdPct = null;
        this.rampUpLoadBalancingAlgorithm = null;
        this.rampUpMinimumHostsPct = null;
        this.rampUpStartTime = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ScalingScheduleResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable List<String> daysOfWeek;
        private @Nullable String name;
        private @Nullable String offPeakLoadBalancingAlgorithm;
        private @Nullable String offPeakStartTime;
        private @Nullable String peakLoadBalancingAlgorithm;
        private @Nullable String peakStartTime;
        private @Nullable Integer rampDownCapacityThresholdPct;
        private @Nullable Boolean rampDownForceLogoffUsers;
        private @Nullable String rampDownLoadBalancingAlgorithm;
        private @Nullable Integer rampDownMinimumHostsPct;
        private @Nullable String rampDownNotificationMessage;
        private @Nullable String rampDownStartTime;
        private @Nullable String rampDownStopHostsWhen;
        private @Nullable Integer rampDownWaitTimeMinutes;
        private @Nullable Integer rampUpCapacityThresholdPct;
        private @Nullable String rampUpLoadBalancingAlgorithm;
        private @Nullable Integer rampUpMinimumHostsPct;
        private @Nullable String rampUpStartTime;

        public Builder() {
    	      // Empty
        }

        public Builder(ScalingScheduleResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.daysOfWeek = defaults.daysOfWeek;
    	      this.name = defaults.name;
    	      this.offPeakLoadBalancingAlgorithm = defaults.offPeakLoadBalancingAlgorithm;
    	      this.offPeakStartTime = defaults.offPeakStartTime;
    	      this.peakLoadBalancingAlgorithm = defaults.peakLoadBalancingAlgorithm;
    	      this.peakStartTime = defaults.peakStartTime;
    	      this.rampDownCapacityThresholdPct = defaults.rampDownCapacityThresholdPct;
    	      this.rampDownForceLogoffUsers = defaults.rampDownForceLogoffUsers;
    	      this.rampDownLoadBalancingAlgorithm = defaults.rampDownLoadBalancingAlgorithm;
    	      this.rampDownMinimumHostsPct = defaults.rampDownMinimumHostsPct;
    	      this.rampDownNotificationMessage = defaults.rampDownNotificationMessage;
    	      this.rampDownStartTime = defaults.rampDownStartTime;
    	      this.rampDownStopHostsWhen = defaults.rampDownStopHostsWhen;
    	      this.rampDownWaitTimeMinutes = defaults.rampDownWaitTimeMinutes;
    	      this.rampUpCapacityThresholdPct = defaults.rampUpCapacityThresholdPct;
    	      this.rampUpLoadBalancingAlgorithm = defaults.rampUpLoadBalancingAlgorithm;
    	      this.rampUpMinimumHostsPct = defaults.rampUpMinimumHostsPct;
    	      this.rampUpStartTime = defaults.rampUpStartTime;
        }

        public Builder setDaysOfWeek(@Nullable List<String> daysOfWeek) {
            this.daysOfWeek = daysOfWeek;
            return this;
        }

        public Builder setName(@Nullable String name) {
            this.name = name;
            return this;
        }

        public Builder setOffPeakLoadBalancingAlgorithm(@Nullable String offPeakLoadBalancingAlgorithm) {
            this.offPeakLoadBalancingAlgorithm = offPeakLoadBalancingAlgorithm;
            return this;
        }

        public Builder setOffPeakStartTime(@Nullable String offPeakStartTime) {
            this.offPeakStartTime = offPeakStartTime;
            return this;
        }

        public Builder setPeakLoadBalancingAlgorithm(@Nullable String peakLoadBalancingAlgorithm) {
            this.peakLoadBalancingAlgorithm = peakLoadBalancingAlgorithm;
            return this;
        }

        public Builder setPeakStartTime(@Nullable String peakStartTime) {
            this.peakStartTime = peakStartTime;
            return this;
        }

        public Builder setRampDownCapacityThresholdPct(@Nullable Integer rampDownCapacityThresholdPct) {
            this.rampDownCapacityThresholdPct = rampDownCapacityThresholdPct;
            return this;
        }

        public Builder setRampDownForceLogoffUsers(@Nullable Boolean rampDownForceLogoffUsers) {
            this.rampDownForceLogoffUsers = rampDownForceLogoffUsers;
            return this;
        }

        public Builder setRampDownLoadBalancingAlgorithm(@Nullable String rampDownLoadBalancingAlgorithm) {
            this.rampDownLoadBalancingAlgorithm = rampDownLoadBalancingAlgorithm;
            return this;
        }

        public Builder setRampDownMinimumHostsPct(@Nullable Integer rampDownMinimumHostsPct) {
            this.rampDownMinimumHostsPct = rampDownMinimumHostsPct;
            return this;
        }

        public Builder setRampDownNotificationMessage(@Nullable String rampDownNotificationMessage) {
            this.rampDownNotificationMessage = rampDownNotificationMessage;
            return this;
        }

        public Builder setRampDownStartTime(@Nullable String rampDownStartTime) {
            this.rampDownStartTime = rampDownStartTime;
            return this;
        }

        public Builder setRampDownStopHostsWhen(@Nullable String rampDownStopHostsWhen) {
            this.rampDownStopHostsWhen = rampDownStopHostsWhen;
            return this;
        }

        public Builder setRampDownWaitTimeMinutes(@Nullable Integer rampDownWaitTimeMinutes) {
            this.rampDownWaitTimeMinutes = rampDownWaitTimeMinutes;
            return this;
        }

        public Builder setRampUpCapacityThresholdPct(@Nullable Integer rampUpCapacityThresholdPct) {
            this.rampUpCapacityThresholdPct = rampUpCapacityThresholdPct;
            return this;
        }

        public Builder setRampUpLoadBalancingAlgorithm(@Nullable String rampUpLoadBalancingAlgorithm) {
            this.rampUpLoadBalancingAlgorithm = rampUpLoadBalancingAlgorithm;
            return this;
        }

        public Builder setRampUpMinimumHostsPct(@Nullable Integer rampUpMinimumHostsPct) {
            this.rampUpMinimumHostsPct = rampUpMinimumHostsPct;
            return this;
        }

        public Builder setRampUpStartTime(@Nullable String rampUpStartTime) {
            this.rampUpStartTime = rampUpStartTime;
            return this;
        }
        public ScalingScheduleResponse build() {
            return new ScalingScheduleResponse(daysOfWeek, name, offPeakLoadBalancingAlgorithm, offPeakStartTime, peakLoadBalancingAlgorithm, peakStartTime, rampDownCapacityThresholdPct, rampDownForceLogoffUsers, rampDownLoadBalancingAlgorithm, rampDownMinimumHostsPct, rampDownNotificationMessage, rampDownStartTime, rampDownStopHostsWhen, rampDownWaitTimeMinutes, rampUpCapacityThresholdPct, rampUpLoadBalancingAlgorithm, rampUpMinimumHostsPct, rampUpStartTime);
        }
    }
}
