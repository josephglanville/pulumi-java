// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.apigee_v1.inputs;

import io.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.List;
import java.util.Objects;


public final class GoogleCloudApigeeV1QueryMetadataResponse extends io.pulumi.resources.InvokeArgs {

    public static final GoogleCloudApigeeV1QueryMetadataResponse Empty = new GoogleCloudApigeeV1QueryMetadataResponse();

    /**
     * Dimensions of the AsyncQuery.
     * 
     */
    @Import(name="dimensions", required=true)
      private final List<String> dimensions;

    public List<String> getDimensions() {
        return this.dimensions;
    }

    /**
     * End timestamp of the query range.
     * 
     */
    @Import(name="endTimestamp", required=true)
      private final String endTimestamp;

    public String getEndTimestamp() {
        return this.endTimestamp;
    }

    /**
     * Metrics of the AsyncQuery. Example: ["name:message_count,func:sum,alias:sum_message_count"]
     * 
     */
    @Import(name="metrics", required=true)
      private final List<String> metrics;

    public List<String> getMetrics() {
        return this.metrics;
    }

    /**
     * Output format.
     * 
     */
    @Import(name="outputFormat", required=true)
      private final String outputFormat;

    public String getOutputFormat() {
        return this.outputFormat;
    }

    /**
     * Start timestamp of the query range.
     * 
     */
    @Import(name="startTimestamp", required=true)
      private final String startTimestamp;

    public String getStartTimestamp() {
        return this.startTimestamp;
    }

    /**
     * Query GroupBy time unit.
     * 
     */
    @Import(name="timeUnit", required=true)
      private final String timeUnit;

    public String getTimeUnit() {
        return this.timeUnit;
    }

    public GoogleCloudApigeeV1QueryMetadataResponse(
        List<String> dimensions,
        String endTimestamp,
        List<String> metrics,
        String outputFormat,
        String startTimestamp,
        String timeUnit) {
        this.dimensions = Objects.requireNonNull(dimensions, "expected parameter 'dimensions' to be non-null");
        this.endTimestamp = Objects.requireNonNull(endTimestamp, "expected parameter 'endTimestamp' to be non-null");
        this.metrics = Objects.requireNonNull(metrics, "expected parameter 'metrics' to be non-null");
        this.outputFormat = Objects.requireNonNull(outputFormat, "expected parameter 'outputFormat' to be non-null");
        this.startTimestamp = Objects.requireNonNull(startTimestamp, "expected parameter 'startTimestamp' to be non-null");
        this.timeUnit = Objects.requireNonNull(timeUnit, "expected parameter 'timeUnit' to be non-null");
    }

    private GoogleCloudApigeeV1QueryMetadataResponse() {
        this.dimensions = List.of();
        this.endTimestamp = null;
        this.metrics = List.of();
        this.outputFormat = null;
        this.startTimestamp = null;
        this.timeUnit = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GoogleCloudApigeeV1QueryMetadataResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private List<String> dimensions;
        private String endTimestamp;
        private List<String> metrics;
        private String outputFormat;
        private String startTimestamp;
        private String timeUnit;

        public Builder() {
    	      // Empty
        }

        public Builder(GoogleCloudApigeeV1QueryMetadataResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.dimensions = defaults.dimensions;
    	      this.endTimestamp = defaults.endTimestamp;
    	      this.metrics = defaults.metrics;
    	      this.outputFormat = defaults.outputFormat;
    	      this.startTimestamp = defaults.startTimestamp;
    	      this.timeUnit = defaults.timeUnit;
        }

        public Builder dimensions(List<String> dimensions) {
            this.dimensions = Objects.requireNonNull(dimensions);
            return this;
        }
        public Builder dimensions(String... dimensions) {
            return dimensions(List.of(dimensions));
        }
        public Builder endTimestamp(String endTimestamp) {
            this.endTimestamp = Objects.requireNonNull(endTimestamp);
            return this;
        }
        public Builder metrics(List<String> metrics) {
            this.metrics = Objects.requireNonNull(metrics);
            return this;
        }
        public Builder metrics(String... metrics) {
            return metrics(List.of(metrics));
        }
        public Builder outputFormat(String outputFormat) {
            this.outputFormat = Objects.requireNonNull(outputFormat);
            return this;
        }
        public Builder startTimestamp(String startTimestamp) {
            this.startTimestamp = Objects.requireNonNull(startTimestamp);
            return this;
        }
        public Builder timeUnit(String timeUnit) {
            this.timeUnit = Objects.requireNonNull(timeUnit);
            return this;
        }        public GoogleCloudApigeeV1QueryMetadataResponse build() {
            return new GoogleCloudApigeeV1QueryMetadataResponse(dimensions, endTimestamp, metrics, outputFormat, startTimestamp, timeUnit);
        }
    }
}
