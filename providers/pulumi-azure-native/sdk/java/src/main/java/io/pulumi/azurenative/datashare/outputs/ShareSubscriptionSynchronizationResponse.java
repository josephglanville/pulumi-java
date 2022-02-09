// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.datashare.outputs;

import io.pulumi.core.internal.annotations.OutputCustomType;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;

@OutputCustomType
public final class ShareSubscriptionSynchronizationResponse {
    private final Integer durationMs;
    private final String endTime;
    private final String message;
    private final String startTime;
    private final String status;
    private final String synchronizationId;
    private final String synchronizationMode;

    @OutputCustomType.Constructor({"durationMs","endTime","message","startTime","status","synchronizationId","synchronizationMode"})
    private ShareSubscriptionSynchronizationResponse(
        Integer durationMs,
        String endTime,
        String message,
        String startTime,
        String status,
        String synchronizationId,
        String synchronizationMode) {
        this.durationMs = Objects.requireNonNull(durationMs);
        this.endTime = Objects.requireNonNull(endTime);
        this.message = Objects.requireNonNull(message);
        this.startTime = Objects.requireNonNull(startTime);
        this.status = Objects.requireNonNull(status);
        this.synchronizationId = Objects.requireNonNull(synchronizationId);
        this.synchronizationMode = Objects.requireNonNull(synchronizationMode);
    }

    public Integer getDurationMs() {
        return this.durationMs;
    }
    public String getEndTime() {
        return this.endTime;
    }
    public String getMessage() {
        return this.message;
    }
    public String getStartTime() {
        return this.startTime;
    }
    public String getStatus() {
        return this.status;
    }
    public String getSynchronizationId() {
        return this.synchronizationId;
    }
    public String getSynchronizationMode() {
        return this.synchronizationMode;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ShareSubscriptionSynchronizationResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Integer durationMs;
        private String endTime;
        private String message;
        private String startTime;
        private String status;
        private String synchronizationId;
        private String synchronizationMode;

        public Builder() {
    	      // Empty
        }

        public Builder(ShareSubscriptionSynchronizationResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.durationMs = defaults.durationMs;
    	      this.endTime = defaults.endTime;
    	      this.message = defaults.message;
    	      this.startTime = defaults.startTime;
    	      this.status = defaults.status;
    	      this.synchronizationId = defaults.synchronizationId;
    	      this.synchronizationMode = defaults.synchronizationMode;
        }

        public Builder setDurationMs(Integer durationMs) {
            this.durationMs = Objects.requireNonNull(durationMs);
            return this;
        }

        public Builder setEndTime(String endTime) {
            this.endTime = Objects.requireNonNull(endTime);
            return this;
        }

        public Builder setMessage(String message) {
            this.message = Objects.requireNonNull(message);
            return this;
        }

        public Builder setStartTime(String startTime) {
            this.startTime = Objects.requireNonNull(startTime);
            return this;
        }

        public Builder setStatus(String status) {
            this.status = Objects.requireNonNull(status);
            return this;
        }

        public Builder setSynchronizationId(String synchronizationId) {
            this.synchronizationId = Objects.requireNonNull(synchronizationId);
            return this;
        }

        public Builder setSynchronizationMode(String synchronizationMode) {
            this.synchronizationMode = Objects.requireNonNull(synchronizationMode);
            return this;
        }

        public ShareSubscriptionSynchronizationResponse build() {
            return new ShareSubscriptionSynchronizationResponse(durationMs, endTime, message, startTime, status, synchronizationId, synchronizationMode);
        }
    }
}
