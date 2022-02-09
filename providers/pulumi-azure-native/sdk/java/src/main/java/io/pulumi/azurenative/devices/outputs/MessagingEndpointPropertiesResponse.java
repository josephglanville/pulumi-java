// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.devices.outputs;

import io.pulumi.core.internal.annotations.OutputCustomType;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class MessagingEndpointPropertiesResponse {
    private final @Nullable String lockDurationAsIso8601;
    private final @Nullable Integer maxDeliveryCount;
    private final @Nullable String ttlAsIso8601;

    @OutputCustomType.Constructor({"lockDurationAsIso8601","maxDeliveryCount","ttlAsIso8601"})
    private MessagingEndpointPropertiesResponse(
        @Nullable String lockDurationAsIso8601,
        @Nullable Integer maxDeliveryCount,
        @Nullable String ttlAsIso8601) {
        this.lockDurationAsIso8601 = lockDurationAsIso8601;
        this.maxDeliveryCount = maxDeliveryCount;
        this.ttlAsIso8601 = ttlAsIso8601;
    }

    public Optional<String> getLockDurationAsIso8601() {
        return Optional.ofNullable(this.lockDurationAsIso8601);
    }
    public Optional<Integer> getMaxDeliveryCount() {
        return Optional.ofNullable(this.maxDeliveryCount);
    }
    public Optional<String> getTtlAsIso8601() {
        return Optional.ofNullable(this.ttlAsIso8601);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(MessagingEndpointPropertiesResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String lockDurationAsIso8601;
        private @Nullable Integer maxDeliveryCount;
        private @Nullable String ttlAsIso8601;

        public Builder() {
    	      // Empty
        }

        public Builder(MessagingEndpointPropertiesResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.lockDurationAsIso8601 = defaults.lockDurationAsIso8601;
    	      this.maxDeliveryCount = defaults.maxDeliveryCount;
    	      this.ttlAsIso8601 = defaults.ttlAsIso8601;
        }

        public Builder setLockDurationAsIso8601(@Nullable String lockDurationAsIso8601) {
            this.lockDurationAsIso8601 = lockDurationAsIso8601;
            return this;
        }

        public Builder setMaxDeliveryCount(@Nullable Integer maxDeliveryCount) {
            this.maxDeliveryCount = maxDeliveryCount;
            return this;
        }

        public Builder setTtlAsIso8601(@Nullable String ttlAsIso8601) {
            this.ttlAsIso8601 = ttlAsIso8601;
            return this;
        }

        public MessagingEndpointPropertiesResponse build() {
            return new MessagingEndpointPropertiesResponse(lockDurationAsIso8601, maxDeliveryCount, ttlAsIso8601);
        }
    }
}
