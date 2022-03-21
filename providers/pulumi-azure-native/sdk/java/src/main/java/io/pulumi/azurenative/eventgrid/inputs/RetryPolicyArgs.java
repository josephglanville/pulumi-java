// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.eventgrid.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import java.lang.Integer;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * Information about the retry policy for an event subscription.
 * 
 */
public final class RetryPolicyArgs extends io.pulumi.resources.ResourceArgs {

    public static final RetryPolicyArgs Empty = new RetryPolicyArgs();

    /**
     * Time To Live (in minutes) for events.
     * 
     */
    @Import(name="eventTimeToLiveInMinutes")
      private final @Nullable Output<Integer> eventTimeToLiveInMinutes;

    public Output<Integer> getEventTimeToLiveInMinutes() {
        return this.eventTimeToLiveInMinutes == null ? Output.empty() : this.eventTimeToLiveInMinutes;
    }

    /**
     * Maximum number of delivery retry attempts for events.
     * 
     */
    @Import(name="maxDeliveryAttempts")
      private final @Nullable Output<Integer> maxDeliveryAttempts;

    public Output<Integer> getMaxDeliveryAttempts() {
        return this.maxDeliveryAttempts == null ? Output.empty() : this.maxDeliveryAttempts;
    }

    public RetryPolicyArgs(
        @Nullable Output<Integer> eventTimeToLiveInMinutes,
        @Nullable Output<Integer> maxDeliveryAttempts) {
        this.eventTimeToLiveInMinutes = eventTimeToLiveInMinutes;
        this.maxDeliveryAttempts = maxDeliveryAttempts;
    }

    private RetryPolicyArgs() {
        this.eventTimeToLiveInMinutes = Output.empty();
        this.maxDeliveryAttempts = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(RetryPolicyArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<Integer> eventTimeToLiveInMinutes;
        private @Nullable Output<Integer> maxDeliveryAttempts;

        public Builder() {
    	      // Empty
        }

        public Builder(RetryPolicyArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.eventTimeToLiveInMinutes = defaults.eventTimeToLiveInMinutes;
    	      this.maxDeliveryAttempts = defaults.maxDeliveryAttempts;
        }

        public Builder eventTimeToLiveInMinutes(@Nullable Output<Integer> eventTimeToLiveInMinutes) {
            this.eventTimeToLiveInMinutes = eventTimeToLiveInMinutes;
            return this;
        }
        public Builder eventTimeToLiveInMinutes(@Nullable Integer eventTimeToLiveInMinutes) {
            this.eventTimeToLiveInMinutes = Output.ofNullable(eventTimeToLiveInMinutes);
            return this;
        }
        public Builder maxDeliveryAttempts(@Nullable Output<Integer> maxDeliveryAttempts) {
            this.maxDeliveryAttempts = maxDeliveryAttempts;
            return this;
        }
        public Builder maxDeliveryAttempts(@Nullable Integer maxDeliveryAttempts) {
            this.maxDeliveryAttempts = Output.ofNullable(maxDeliveryAttempts);
            return this;
        }        public RetryPolicyArgs build() {
            return new RetryPolicyArgs(eventTimeToLiveInMinutes, maxDeliveryAttempts);
        }
    }
}
