// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.logz.outputs;

import io.pulumi.azurenative.logz.outputs.SystemDataResponse;
import io.pulumi.core.annotations.CustomType;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class MonitoredResourceResponse {
    /**
     * The ARM id of the resource.
     * 
     */
    private final @Nullable String id;
    /**
     * Reason for why the resource is sending logs (or why it is not sending).
     * 
     */
    private final @Nullable String reasonForLogsStatus;
    /**
     * Reason for why the resource is sending metrics (or why it is not sending).
     * 
     */
    private final @Nullable String reasonForMetricsStatus;
    /**
     * Flag indicating if resource is sending logs to Logz.
     * 
     */
    private final @Nullable Boolean sendingLogs;
    /**
     * Flag indicating if resource is sending metrics to Logz.
     * 
     */
    private final @Nullable Boolean sendingMetrics;
    /**
     * Metadata pertaining to creation and last modification of the resource.
     * 
     */
    private final SystemDataResponse systemData;

    @CustomType.Constructor
    private MonitoredResourceResponse(
        @CustomType.Parameter("id") @Nullable String id,
        @CustomType.Parameter("reasonForLogsStatus") @Nullable String reasonForLogsStatus,
        @CustomType.Parameter("reasonForMetricsStatus") @Nullable String reasonForMetricsStatus,
        @CustomType.Parameter("sendingLogs") @Nullable Boolean sendingLogs,
        @CustomType.Parameter("sendingMetrics") @Nullable Boolean sendingMetrics,
        @CustomType.Parameter("systemData") SystemDataResponse systemData) {
        this.id = id;
        this.reasonForLogsStatus = reasonForLogsStatus;
        this.reasonForMetricsStatus = reasonForMetricsStatus;
        this.sendingLogs = sendingLogs;
        this.sendingMetrics = sendingMetrics;
        this.systemData = systemData;
    }

    /**
     * The ARM id of the resource.
     * 
    */
    public Optional<String> getId() {
        return Optional.ofNullable(this.id);
    }
    /**
     * Reason for why the resource is sending logs (or why it is not sending).
     * 
    */
    public Optional<String> getReasonForLogsStatus() {
        return Optional.ofNullable(this.reasonForLogsStatus);
    }
    /**
     * Reason for why the resource is sending metrics (or why it is not sending).
     * 
    */
    public Optional<String> getReasonForMetricsStatus() {
        return Optional.ofNullable(this.reasonForMetricsStatus);
    }
    /**
     * Flag indicating if resource is sending logs to Logz.
     * 
    */
    public Optional<Boolean> getSendingLogs() {
        return Optional.ofNullable(this.sendingLogs);
    }
    /**
     * Flag indicating if resource is sending metrics to Logz.
     * 
    */
    public Optional<Boolean> getSendingMetrics() {
        return Optional.ofNullable(this.sendingMetrics);
    }
    /**
     * Metadata pertaining to creation and last modification of the resource.
     * 
    */
    public SystemDataResponse getSystemData() {
        return this.systemData;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(MonitoredResourceResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String id;
        private @Nullable String reasonForLogsStatus;
        private @Nullable String reasonForMetricsStatus;
        private @Nullable Boolean sendingLogs;
        private @Nullable Boolean sendingMetrics;
        private SystemDataResponse systemData;

        public Builder() {
    	      // Empty
        }

        public Builder(MonitoredResourceResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.id = defaults.id;
    	      this.reasonForLogsStatus = defaults.reasonForLogsStatus;
    	      this.reasonForMetricsStatus = defaults.reasonForMetricsStatus;
    	      this.sendingLogs = defaults.sendingLogs;
    	      this.sendingMetrics = defaults.sendingMetrics;
    	      this.systemData = defaults.systemData;
        }

        public Builder id(@Nullable String id) {
            this.id = id;
            return this;
        }
        public Builder reasonForLogsStatus(@Nullable String reasonForLogsStatus) {
            this.reasonForLogsStatus = reasonForLogsStatus;
            return this;
        }
        public Builder reasonForMetricsStatus(@Nullable String reasonForMetricsStatus) {
            this.reasonForMetricsStatus = reasonForMetricsStatus;
            return this;
        }
        public Builder sendingLogs(@Nullable Boolean sendingLogs) {
            this.sendingLogs = sendingLogs;
            return this;
        }
        public Builder sendingMetrics(@Nullable Boolean sendingMetrics) {
            this.sendingMetrics = sendingMetrics;
            return this;
        }
        public Builder systemData(SystemDataResponse systemData) {
            this.systemData = Objects.requireNonNull(systemData);
            return this;
        }        public MonitoredResourceResponse build() {
            return new MonitoredResourceResponse(id, reasonForLogsStatus, reasonForMetricsStatus, sendingLogs, sendingMetrics, systemData);
        }
    }
}
