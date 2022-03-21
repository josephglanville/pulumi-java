// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.devices.inputs;

import io.pulumi.core.annotations.Import;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * The properties of the messaging endpoints used by this IoT hub.
 * 
 */
public final class MessagingEndpointPropertiesResponse extends io.pulumi.resources.InvokeArgs {

    public static final MessagingEndpointPropertiesResponse Empty = new MessagingEndpointPropertiesResponse();

    /**
     * The lock duration. See: https://docs.microsoft.com/azure/iot-hub/iot-hub-devguide-file-upload.
     * 
     */
    @Import(name="lockDurationAsIso8601")
      private final @Nullable String lockDurationAsIso8601;

    public Optional<String> getLockDurationAsIso8601() {
        return this.lockDurationAsIso8601 == null ? Optional.empty() : Optional.ofNullable(this.lockDurationAsIso8601);
    }

    /**
     * The number of times the IoT hub attempts to deliver a message. See: https://docs.microsoft.com/azure/iot-hub/iot-hub-devguide-file-upload.
     * 
     */
    @Import(name="maxDeliveryCount")
      private final @Nullable Integer maxDeliveryCount;

    public Optional<Integer> getMaxDeliveryCount() {
        return this.maxDeliveryCount == null ? Optional.empty() : Optional.ofNullable(this.maxDeliveryCount);
    }

    /**
     * The period of time for which a message is available to consume before it is expired by the IoT hub. See: https://docs.microsoft.com/azure/iot-hub/iot-hub-devguide-file-upload.
     * 
     */
    @Import(name="ttlAsIso8601")
      private final @Nullable String ttlAsIso8601;

    public Optional<String> getTtlAsIso8601() {
        return this.ttlAsIso8601 == null ? Optional.empty() : Optional.ofNullable(this.ttlAsIso8601);
    }

    public MessagingEndpointPropertiesResponse(
        @Nullable String lockDurationAsIso8601,
        @Nullable Integer maxDeliveryCount,
        @Nullable String ttlAsIso8601) {
        this.lockDurationAsIso8601 = lockDurationAsIso8601;
        this.maxDeliveryCount = maxDeliveryCount;
        this.ttlAsIso8601 = ttlAsIso8601;
    }

    private MessagingEndpointPropertiesResponse() {
        this.lockDurationAsIso8601 = null;
        this.maxDeliveryCount = null;
        this.ttlAsIso8601 = null;
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

        public Builder lockDurationAsIso8601(@Nullable String lockDurationAsIso8601) {
            this.lockDurationAsIso8601 = lockDurationAsIso8601;
            return this;
        }
        public Builder maxDeliveryCount(@Nullable Integer maxDeliveryCount) {
            this.maxDeliveryCount = maxDeliveryCount;
            return this;
        }
        public Builder ttlAsIso8601(@Nullable String ttlAsIso8601) {
            this.ttlAsIso8601 = ttlAsIso8601;
            return this;
        }        public MessagingEndpointPropertiesResponse build() {
            return new MessagingEndpointPropertiesResponse(lockDurationAsIso8601, maxDeliveryCount, ttlAsIso8601);
        }
    }
}
