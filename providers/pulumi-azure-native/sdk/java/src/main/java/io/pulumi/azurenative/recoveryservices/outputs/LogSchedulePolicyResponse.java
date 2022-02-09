// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.recoveryservices.outputs;

import io.pulumi.core.internal.annotations.OutputCustomType;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class LogSchedulePolicyResponse {
    private final @Nullable Integer scheduleFrequencyInMins;
    private final String schedulePolicyType;

    @OutputCustomType.Constructor({"scheduleFrequencyInMins","schedulePolicyType"})
    private LogSchedulePolicyResponse(
        @Nullable Integer scheduleFrequencyInMins,
        String schedulePolicyType) {
        this.scheduleFrequencyInMins = scheduleFrequencyInMins;
        this.schedulePolicyType = Objects.requireNonNull(schedulePolicyType);
    }

    public Optional<Integer> getScheduleFrequencyInMins() {
        return Optional.ofNullable(this.scheduleFrequencyInMins);
    }
    public String getSchedulePolicyType() {
        return this.schedulePolicyType;
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

        public Builder setScheduleFrequencyInMins(@Nullable Integer scheduleFrequencyInMins) {
            this.scheduleFrequencyInMins = scheduleFrequencyInMins;
            return this;
        }

        public Builder setSchedulePolicyType(String schedulePolicyType) {
            this.schedulePolicyType = Objects.requireNonNull(schedulePolicyType);
            return this;
        }

        public LogSchedulePolicyResponse build() {
            return new LogSchedulePolicyResponse(scheduleFrequencyInMins, schedulePolicyType);
        }
    }
}
