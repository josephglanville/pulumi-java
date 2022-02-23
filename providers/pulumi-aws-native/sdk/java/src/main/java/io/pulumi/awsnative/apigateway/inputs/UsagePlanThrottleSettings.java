// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.apigateway.inputs;

import io.pulumi.core.annotations.InputImport;
import java.lang.Double;
import java.lang.Integer;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class UsagePlanThrottleSettings extends io.pulumi.resources.InvokeArgs {

    public static final UsagePlanThrottleSettings Empty = new UsagePlanThrottleSettings();

    /**
     * The maximum API request rate limit over a time ranging from one to a few seconds. The maximum API request rate limit depends on whether the underlying token bucket is at its full capacity.
     * 
     */
    @InputImport(name="burstLimit")
      private final @Nullable Integer burstLimit;

    public Optional<Integer> getBurstLimit() {
        return this.burstLimit == null ? Optional.empty() : Optional.ofNullable(this.burstLimit);
    }

    /**
     * The API request steady-state rate limit (average requests per second over an extended period of time).
     * 
     */
    @InputImport(name="rateLimit")
      private final @Nullable Double rateLimit;

    public Optional<Double> getRateLimit() {
        return this.rateLimit == null ? Optional.empty() : Optional.ofNullable(this.rateLimit);
    }

    public UsagePlanThrottleSettings(
        @Nullable Integer burstLimit,
        @Nullable Double rateLimit) {
        this.burstLimit = burstLimit;
        this.rateLimit = rateLimit;
    }

    private UsagePlanThrottleSettings() {
        this.burstLimit = null;
        this.rateLimit = null;
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
