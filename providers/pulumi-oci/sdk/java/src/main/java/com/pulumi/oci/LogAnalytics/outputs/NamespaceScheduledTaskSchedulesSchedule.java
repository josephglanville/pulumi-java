// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.oci.LogAnalytics.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class NamespaceScheduledTaskSchedulesSchedule {
    /**
     * @return (Updatable) Value in cron format.
     * 
     */
    private final @Nullable String expression;
    /**
     * @return (Updatable) Schedule misfire retry policy.
     * 
     */
    private final @Nullable String misfirePolicy;
    /**
     * @return (Updatable) Recurring interval in ISO 8601 extended format as described in https://en.wikipedia.org/wiki/ISO_8601#Durations. The largest supported unit is D, e.g. P14D (not P2W). The value must be at least 5 minutes (PT5M) and at most 3 weeks (P21D or PT30240M).
     * 
     */
    private final @Nullable String recurringInterval;
    /**
     * @return (Updatable) Number of times (0-based) to execute until auto-stop. Default value -1 will execute indefinitely. Value 0 will execute once.
     * 
     */
    private final @Nullable Integer repeatCount;
    /**
     * @return (Updatable) Time zone, by default UTC.
     * 
     */
    private final @Nullable String timeZone;
    /**
     * @return (Updatable) Schedule type discriminator.
     * 
     */
    private final String type;

    @CustomType.Constructor
    private NamespaceScheduledTaskSchedulesSchedule(
        @CustomType.Parameter("expression") @Nullable String expression,
        @CustomType.Parameter("misfirePolicy") @Nullable String misfirePolicy,
        @CustomType.Parameter("recurringInterval") @Nullable String recurringInterval,
        @CustomType.Parameter("repeatCount") @Nullable Integer repeatCount,
        @CustomType.Parameter("timeZone") @Nullable String timeZone,
        @CustomType.Parameter("type") String type) {
        this.expression = expression;
        this.misfirePolicy = misfirePolicy;
        this.recurringInterval = recurringInterval;
        this.repeatCount = repeatCount;
        this.timeZone = timeZone;
        this.type = type;
    }

    /**
     * @return (Updatable) Value in cron format.
     * 
     */
    public Optional<String> expression() {
        return Optional.ofNullable(this.expression);
    }
    /**
     * @return (Updatable) Schedule misfire retry policy.
     * 
     */
    public Optional<String> misfirePolicy() {
        return Optional.ofNullable(this.misfirePolicy);
    }
    /**
     * @return (Updatable) Recurring interval in ISO 8601 extended format as described in https://en.wikipedia.org/wiki/ISO_8601#Durations. The largest supported unit is D, e.g. P14D (not P2W). The value must be at least 5 minutes (PT5M) and at most 3 weeks (P21D or PT30240M).
     * 
     */
    public Optional<String> recurringInterval() {
        return Optional.ofNullable(this.recurringInterval);
    }
    /**
     * @return (Updatable) Number of times (0-based) to execute until auto-stop. Default value -1 will execute indefinitely. Value 0 will execute once.
     * 
     */
    public Optional<Integer> repeatCount() {
        return Optional.ofNullable(this.repeatCount);
    }
    /**
     * @return (Updatable) Time zone, by default UTC.
     * 
     */
    public Optional<String> timeZone() {
        return Optional.ofNullable(this.timeZone);
    }
    /**
     * @return (Updatable) Schedule type discriminator.
     * 
     */
    public String type() {
        return this.type;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(NamespaceScheduledTaskSchedulesSchedule defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String expression;
        private @Nullable String misfirePolicy;
        private @Nullable String recurringInterval;
        private @Nullable Integer repeatCount;
        private @Nullable String timeZone;
        private String type;

        public Builder() {
    	      // Empty
        }

        public Builder(NamespaceScheduledTaskSchedulesSchedule defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.expression = defaults.expression;
    	      this.misfirePolicy = defaults.misfirePolicy;
    	      this.recurringInterval = defaults.recurringInterval;
    	      this.repeatCount = defaults.repeatCount;
    	      this.timeZone = defaults.timeZone;
    	      this.type = defaults.type;
        }

        public Builder expression(@Nullable String expression) {
            this.expression = expression;
            return this;
        }
        public Builder misfirePolicy(@Nullable String misfirePolicy) {
            this.misfirePolicy = misfirePolicy;
            return this;
        }
        public Builder recurringInterval(@Nullable String recurringInterval) {
            this.recurringInterval = recurringInterval;
            return this;
        }
        public Builder repeatCount(@Nullable Integer repeatCount) {
            this.repeatCount = repeatCount;
            return this;
        }
        public Builder timeZone(@Nullable String timeZone) {
            this.timeZone = timeZone;
            return this;
        }
        public Builder type(String type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }        public NamespaceScheduledTaskSchedulesSchedule build() {
            return new NamespaceScheduledTaskSchedulesSchedule(expression, misfirePolicy, recurringInterval, repeatCount, timeZone, type);
        }
    }
}
