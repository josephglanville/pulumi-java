// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.storagesync.outputs;

import io.pulumi.core.annotations.CustomType;
import java.lang.Double;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class ServerEndpointSyncActivityStatusResponse {
    /**
     * Applied bytes
     * 
     */
    private final Double appliedBytes;
    /**
     * Applied item count.
     * 
     */
    private final Double appliedItemCount;
    /**
     * Per item error count
     * 
     */
    private final Double perItemErrorCount;
    /**
     * Sync mode
     * 
     */
    private final String syncMode;
    /**
     * Timestamp when properties were updated
     * 
     */
    private final String timestamp;
    /**
     * Total bytes (if available)
     * 
     */
    private final Double totalBytes;
    /**
     * Total item count (if available)
     * 
     */
    private final Double totalItemCount;

    @CustomType.Constructor
    private ServerEndpointSyncActivityStatusResponse(
        @CustomType.Parameter("appliedBytes") Double appliedBytes,
        @CustomType.Parameter("appliedItemCount") Double appliedItemCount,
        @CustomType.Parameter("perItemErrorCount") Double perItemErrorCount,
        @CustomType.Parameter("syncMode") String syncMode,
        @CustomType.Parameter("timestamp") String timestamp,
        @CustomType.Parameter("totalBytes") Double totalBytes,
        @CustomType.Parameter("totalItemCount") Double totalItemCount) {
        this.appliedBytes = appliedBytes;
        this.appliedItemCount = appliedItemCount;
        this.perItemErrorCount = perItemErrorCount;
        this.syncMode = syncMode;
        this.timestamp = timestamp;
        this.totalBytes = totalBytes;
        this.totalItemCount = totalItemCount;
    }

    /**
     * Applied bytes
     * 
    */
    public Double getAppliedBytes() {
        return this.appliedBytes;
    }
    /**
     * Applied item count.
     * 
    */
    public Double getAppliedItemCount() {
        return this.appliedItemCount;
    }
    /**
     * Per item error count
     * 
    */
    public Double getPerItemErrorCount() {
        return this.perItemErrorCount;
    }
    /**
     * Sync mode
     * 
    */
    public String getSyncMode() {
        return this.syncMode;
    }
    /**
     * Timestamp when properties were updated
     * 
    */
    public String getTimestamp() {
        return this.timestamp;
    }
    /**
     * Total bytes (if available)
     * 
    */
    public Double getTotalBytes() {
        return this.totalBytes;
    }
    /**
     * Total item count (if available)
     * 
    */
    public Double getTotalItemCount() {
        return this.totalItemCount;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ServerEndpointSyncActivityStatusResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Double appliedBytes;
        private Double appliedItemCount;
        private Double perItemErrorCount;
        private String syncMode;
        private String timestamp;
        private Double totalBytes;
        private Double totalItemCount;

        public Builder() {
    	      // Empty
        }

        public Builder(ServerEndpointSyncActivityStatusResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.appliedBytes = defaults.appliedBytes;
    	      this.appliedItemCount = defaults.appliedItemCount;
    	      this.perItemErrorCount = defaults.perItemErrorCount;
    	      this.syncMode = defaults.syncMode;
    	      this.timestamp = defaults.timestamp;
    	      this.totalBytes = defaults.totalBytes;
    	      this.totalItemCount = defaults.totalItemCount;
        }

        public Builder appliedBytes(Double appliedBytes) {
            this.appliedBytes = Objects.requireNonNull(appliedBytes);
            return this;
        }
        public Builder appliedItemCount(Double appliedItemCount) {
            this.appliedItemCount = Objects.requireNonNull(appliedItemCount);
            return this;
        }
        public Builder perItemErrorCount(Double perItemErrorCount) {
            this.perItemErrorCount = Objects.requireNonNull(perItemErrorCount);
            return this;
        }
        public Builder syncMode(String syncMode) {
            this.syncMode = Objects.requireNonNull(syncMode);
            return this;
        }
        public Builder timestamp(String timestamp) {
            this.timestamp = Objects.requireNonNull(timestamp);
            return this;
        }
        public Builder totalBytes(Double totalBytes) {
            this.totalBytes = Objects.requireNonNull(totalBytes);
            return this;
        }
        public Builder totalItemCount(Double totalItemCount) {
            this.totalItemCount = Objects.requireNonNull(totalItemCount);
            return this;
        }        public ServerEndpointSyncActivityStatusResponse build() {
            return new ServerEndpointSyncActivityStatusResponse(appliedBytes, appliedItemCount, perItemErrorCount, syncMode, timestamp, totalBytes, totalItemCount);
        }
    }
}
