// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.eventgrid.inputs;

import io.pulumi.core.internal.annotations.InputImport;
import java.lang.Integer;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class RetryPolicyResponse extends io.pulumi.resources.InvokeArgs {

    public static final RetryPolicyResponse Empty = new RetryPolicyResponse();

    @InputImport(name="eventTimeToLiveInMinutes")
    private final @Nullable Integer eventTimeToLiveInMinutes;

    public Optional<Integer> getEventTimeToLiveInMinutes() {
        return this.eventTimeToLiveInMinutes == null ? Optional.empty() : Optional.ofNullable(this.eventTimeToLiveInMinutes);
    }

    @InputImport(name="maxDeliveryAttempts")
    private final @Nullable Integer maxDeliveryAttempts;

    public Optional<Integer> getMaxDeliveryAttempts() {
        return this.maxDeliveryAttempts == null ? Optional.empty() : Optional.ofNullable(this.maxDeliveryAttempts);
    }

    public RetryPolicyResponse(
        @Nullable Integer eventTimeToLiveInMinutes,
        @Nullable Integer maxDeliveryAttempts) {
        this.eventTimeToLiveInMinutes = eventTimeToLiveInMinutes;
        this.maxDeliveryAttempts = maxDeliveryAttempts;
    }

    private RetryPolicyResponse() {
        this.eventTimeToLiveInMinutes = null;
        this.maxDeliveryAttempts = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(RetryPolicyResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Integer eventTimeToLiveInMinutes;
        private @Nullable Integer maxDeliveryAttempts;

        public Builder() {
    	      // Empty
        }

        public Builder(RetryPolicyResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.eventTimeToLiveInMinutes = defaults.eventTimeToLiveInMinutes;
    	      this.maxDeliveryAttempts = defaults.maxDeliveryAttempts;
        }

        public Builder setEventTimeToLiveInMinutes(@Nullable Integer eventTimeToLiveInMinutes) {
            this.eventTimeToLiveInMinutes = eventTimeToLiveInMinutes;
            return this;
        }

        public Builder setMaxDeliveryAttempts(@Nullable Integer maxDeliveryAttempts) {
            this.maxDeliveryAttempts = maxDeliveryAttempts;
            return this;
        }

        public RetryPolicyResponse build() {
            return new RetryPolicyResponse(eventTimeToLiveInMinutes, maxDeliveryAttempts);
        }
    }
}