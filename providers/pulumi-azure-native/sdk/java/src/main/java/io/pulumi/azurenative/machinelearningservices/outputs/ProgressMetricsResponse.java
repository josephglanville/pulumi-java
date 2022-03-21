// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.machinelearningservices.outputs;

import io.pulumi.core.annotations.CustomType;
import java.lang.Double;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class ProgressMetricsResponse {
    /**
     * The completed datapoint count.
     * 
     */
    private final Double completedDatapointCount;
    /**
     * The time of last successful incremental dataset refresh in UTC.
     * 
     */
    private final String incrementalDatasetLastRefreshTime;
    /**
     * The skipped datapoint count.
     * 
     */
    private final Double skippedDatapointCount;
    /**
     * The total datapoint count.
     * 
     */
    private final Double totalDatapointCount;

    @CustomType.Constructor
    private ProgressMetricsResponse(
        @CustomType.Parameter("completedDatapointCount") Double completedDatapointCount,
        @CustomType.Parameter("incrementalDatasetLastRefreshTime") String incrementalDatasetLastRefreshTime,
        @CustomType.Parameter("skippedDatapointCount") Double skippedDatapointCount,
        @CustomType.Parameter("totalDatapointCount") Double totalDatapointCount) {
        this.completedDatapointCount = completedDatapointCount;
        this.incrementalDatasetLastRefreshTime = incrementalDatasetLastRefreshTime;
        this.skippedDatapointCount = skippedDatapointCount;
        this.totalDatapointCount = totalDatapointCount;
    }

    /**
     * The completed datapoint count.
     * 
    */
    public Double getCompletedDatapointCount() {
        return this.completedDatapointCount;
    }
    /**
     * The time of last successful incremental dataset refresh in UTC.
     * 
    */
    public String getIncrementalDatasetLastRefreshTime() {
        return this.incrementalDatasetLastRefreshTime;
    }
    /**
     * The skipped datapoint count.
     * 
    */
    public Double getSkippedDatapointCount() {
        return this.skippedDatapointCount;
    }
    /**
     * The total datapoint count.
     * 
    */
    public Double getTotalDatapointCount() {
        return this.totalDatapointCount;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ProgressMetricsResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Double completedDatapointCount;
        private String incrementalDatasetLastRefreshTime;
        private Double skippedDatapointCount;
        private Double totalDatapointCount;

        public Builder() {
    	      // Empty
        }

        public Builder(ProgressMetricsResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.completedDatapointCount = defaults.completedDatapointCount;
    	      this.incrementalDatasetLastRefreshTime = defaults.incrementalDatasetLastRefreshTime;
    	      this.skippedDatapointCount = defaults.skippedDatapointCount;
    	      this.totalDatapointCount = defaults.totalDatapointCount;
        }

        public Builder completedDatapointCount(Double completedDatapointCount) {
            this.completedDatapointCount = Objects.requireNonNull(completedDatapointCount);
            return this;
        }
        public Builder incrementalDatasetLastRefreshTime(String incrementalDatasetLastRefreshTime) {
            this.incrementalDatasetLastRefreshTime = Objects.requireNonNull(incrementalDatasetLastRefreshTime);
            return this;
        }
        public Builder skippedDatapointCount(Double skippedDatapointCount) {
            this.skippedDatapointCount = Objects.requireNonNull(skippedDatapointCount);
            return this;
        }
        public Builder totalDatapointCount(Double totalDatapointCount) {
            this.totalDatapointCount = Objects.requireNonNull(totalDatapointCount);
            return this;
        }        public ProgressMetricsResponse build() {
            return new ProgressMetricsResponse(completedDatapointCount, incrementalDatasetLastRefreshTime, skippedDatapointCount, totalDatapointCount);
        }
    }
}
