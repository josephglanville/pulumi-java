// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.monitoring.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class MetricDescriptorMetadataArgs extends io.pulumi.resources.ResourceArgs {

    public static final MetricDescriptorMetadataArgs Empty = new MetricDescriptorMetadataArgs();

    /**
     * The delay of data points caused by ingestion. Data points older than this age are guaranteed to be ingested and available to be read, excluding data loss due to errors. In `[duration format](https://developers.google.com/protocol-buffers/docs/reference/google.protobuf?&_ga=2.264881487.1507873253.1593446723-935052455.1591817775#google.protobuf.Duration)`.
     * 
     */
    @Import(name="ingestDelay")
      private final @Nullable Output<String> ingestDelay;

    public Output<String> getIngestDelay() {
        return this.ingestDelay == null ? Output.empty() : this.ingestDelay;
    }

    /**
     * The sampling period of metric data points. For metrics which are written periodically, consecutive data points are stored at this time interval, excluding data loss due to errors. Metrics with a higher granularity have a smaller sampling period. In `[duration format](https://developers.google.com/protocol-buffers/docs/reference/google.protobuf?&_ga=2.264881487.1507873253.1593446723-935052455.1591817775#google.protobuf.Duration)`.
     * 
     */
    @Import(name="samplePeriod")
      private final @Nullable Output<String> samplePeriod;

    public Output<String> getSamplePeriod() {
        return this.samplePeriod == null ? Output.empty() : this.samplePeriod;
    }

    public MetricDescriptorMetadataArgs(
        @Nullable Output<String> ingestDelay,
        @Nullable Output<String> samplePeriod) {
        this.ingestDelay = ingestDelay;
        this.samplePeriod = samplePeriod;
    }

    private MetricDescriptorMetadataArgs() {
        this.ingestDelay = Output.empty();
        this.samplePeriod = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(MetricDescriptorMetadataArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<String> ingestDelay;
        private @Nullable Output<String> samplePeriod;

        public Builder() {
    	      // Empty
        }

        public Builder(MetricDescriptorMetadataArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.ingestDelay = defaults.ingestDelay;
    	      this.samplePeriod = defaults.samplePeriod;
        }

        public Builder ingestDelay(@Nullable Output<String> ingestDelay) {
            this.ingestDelay = ingestDelay;
            return this;
        }
        public Builder ingestDelay(@Nullable String ingestDelay) {
            this.ingestDelay = Output.ofNullable(ingestDelay);
            return this;
        }
        public Builder samplePeriod(@Nullable Output<String> samplePeriod) {
            this.samplePeriod = samplePeriod;
            return this;
        }
        public Builder samplePeriod(@Nullable String samplePeriod) {
            this.samplePeriod = Output.ofNullable(samplePeriod);
            return this;
        }        public MetricDescriptorMetadataArgs build() {
            return new MetricDescriptorMetadataArgs(ingestDelay, samplePeriod);
        }
    }
}
