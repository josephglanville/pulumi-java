// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.apigateway.outputs;

import io.pulumi.core.internal.annotations.OutputCustomType;
import java.lang.Double;
import java.lang.Integer;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class UsagePlanThrottleSettings {
    private final @Nullable Integer burstLimit;
    private final @Nullable Double rateLimit;

    @OutputCustomType.Constructor({"burstLimit","rateLimit"})
    private UsagePlanThrottleSettings(
        @Nullable Integer burstLimit,
        @Nullable Double rateLimit) {
        this.burstLimit = burstLimit;
        this.rateLimit = rateLimit;
    }

    public Optional<Integer> getBurstLimit() {
        return Optional.ofNullable(this.burstLimit);
    }
    public Optional<Double> getRateLimit() {
        return Optional.ofNullable(this.rateLimit);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(UsagePlanThrottleSettings defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Integer burstLimit;
        private @Nullable Double rateLimit;

        public Builder() {
    	      // Empty
        }

        public Builder(UsagePlanThrottleSettings defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.burstLimit = defaults.burstLimit;
    	      this.rateLimit = defaults.rateLimit;
        }

        public Builder setBurstLimit(@Nullable Integer burstLimit) {
            this.burstLimit = burstLimit;
            return this;
        }

        public Builder setRateLimit(@Nullable Double rateLimit) {
            this.rateLimit = rateLimit;
            return this;
        }

        public UsagePlanThrottleSettings build() {
            return new UsagePlanThrottleSettings(burstLimit, rateLimit);
        }
    }
}