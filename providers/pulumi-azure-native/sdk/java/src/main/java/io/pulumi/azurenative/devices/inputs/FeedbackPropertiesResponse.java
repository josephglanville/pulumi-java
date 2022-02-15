// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.devices.inputs;

import io.pulumi.core.internal.annotations.InputImport;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class FeedbackPropertiesResponse extends io.pulumi.resources.InvokeArgs {

    public static final FeedbackPropertiesResponse Empty = new FeedbackPropertiesResponse();

    @InputImport(name="lockDurationAsIso8601")
    private final @Nullable String lockDurationAsIso8601;

    public Optional<String> getLockDurationAsIso8601() {
        return this.lockDurationAsIso8601 == null ? Optional.empty() : Optional.ofNullable(this.lockDurationAsIso8601);
    }

    @InputImport(name="maxDeliveryCount")
    private final @Nullable Integer maxDeliveryCount;

    public Optional<Integer> getMaxDeliveryCount() {
        return this.maxDeliveryCount == null ? Optional.empty() : Optional.ofNullable(this.maxDeliveryCount);
    }

    @InputImport(name="ttlAsIso8601")
    private final @Nullable String ttlAsIso8601;

    public Optional<String> getTtlAsIso8601() {
        return this.ttlAsIso8601 == null ? Optional.empty() : Optional.ofNullable(this.ttlAsIso8601);
    }

    public FeedbackPropertiesResponse(
        @Nullable String lockDurationAsIso8601,
        @Nullable Integer maxDeliveryCount,
        @Nullable String ttlAsIso8601) {
        this.lockDurationAsIso8601 = lockDurationAsIso8601;
        this.maxDeliveryCount = maxDeliveryCount;
        this.ttlAsIso8601 = ttlAsIso8601;
    }

    private FeedbackPropertiesResponse() {
        this.lockDurationAsIso8601 = null;
        this.maxDeliveryCount = null;
        this.ttlAsIso8601 = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(FeedbackPropertiesResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String lockDurationAsIso8601;
        private @Nullable Integer maxDeliveryCount;
        private @Nullable String ttlAsIso8601;

        public Builder() {
    	      // Empty
        }

        public Builder(FeedbackPropertiesResponse defaults) {
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

        public FeedbackPropertiesResponse build() {
            return new FeedbackPropertiesResponse(lockDurationAsIso8601, maxDeliveryCount, ttlAsIso8601);
        }
    }
}