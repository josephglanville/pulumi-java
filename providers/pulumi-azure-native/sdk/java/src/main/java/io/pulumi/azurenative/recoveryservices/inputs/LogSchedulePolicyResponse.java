// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.recoveryservices.inputs;

import io.pulumi.core.annotations.Import;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Log policy schedule.
 * 
 */
public final class LogSchedulePolicyResponse extends io.pulumi.resources.InvokeArgs {

    public static final LogSchedulePolicyResponse Empty = new LogSchedulePolicyResponse();

    /**
     * Frequency of the log schedule operation of this policy in minutes.
     * 
     */
    @Import(name="scheduleFrequencyInMins")
      private final @Nullable Integer scheduleFrequencyInMins;

    public Optional<Integer> getScheduleFrequencyInMins() {
        return this.scheduleFrequencyInMins == null ? Optional.empty() : Optional.ofNullable(this.scheduleFrequencyInMins);
    }

    /**
     * This property will be used as the discriminator for deciding the specific types in the polymorphic chain of types.
     * Expected value is 'LogSchedulePolicy'.
     * 
     */
    @Import(name="schedulePolicyType", required=true)
      private final String schedulePolicyType;

    public String getSchedulePolicyType() {
        return this.schedulePolicyType;
    }

    public LogSchedulePolicyResponse(
        @Nullable Integer scheduleFrequencyInMins,
        String schedulePolicyType) {
        this.scheduleFrequencyInMins = scheduleFrequencyInMins;
        this.schedulePolicyType = Objects.requireNonNull(schedulePolicyType, "expected parameter 'schedulePolicyType' to be non-null");
    }

    private LogSchedulePolicyResponse() {
        this.scheduleFrequencyInMins = null;
        this.schedulePolicyType = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(LogSchedulePolicyResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Integer scheduleFrequencyInMins;
        private String schedulePolicyType;

        public Builder() {
    	      // Empty
        }

        public Builder(LogSchedulePolicyResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.scheduleFrequencyInMins = defaults.scheduleFrequencyInMins;
    	      this.schedulePolicyType = defaults.schedulePolicyType;
        }

        public Builder scheduleFrequencyInMins(@Nullable Integer scheduleFrequencyInMins) {
            this.scheduleFrequencyInMins = scheduleFrequencyInMins;
            return this;
        }
        public Builder schedulePolicyType(String schedulePolicyType) {
            this.schedulePolicyType = Objects.requireNonNull(schedulePolicyType);
            return this;
        }        public LogSchedulePolicyResponse build() {
            return new LogSchedulePolicyResponse(scheduleFrequencyInMins, schedulePolicyType);
        }
    }
}
