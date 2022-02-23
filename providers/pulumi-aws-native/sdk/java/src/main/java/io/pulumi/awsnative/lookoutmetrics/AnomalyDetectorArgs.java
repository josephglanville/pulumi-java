// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.lookoutmetrics;

import io.pulumi.awsnative.lookoutmetrics.inputs.AnomalyDetectorConfigArgs;
import io.pulumi.awsnative.lookoutmetrics.inputs.AnomalyDetectorMetricSetArgs;
import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


public final class AnomalyDetectorArgs extends io.pulumi.resources.ResourceArgs {

    public static final AnomalyDetectorArgs Empty = new AnomalyDetectorArgs();

    /**
     * Configuration options for the AnomalyDetector
     * 
     */
    @InputImport(name="anomalyDetectorConfig", required=true)
      private final Input<AnomalyDetectorConfigArgs> anomalyDetectorConfig;

    public Input<AnomalyDetectorConfigArgs> getAnomalyDetectorConfig() {
        return this.anomalyDetectorConfig;
    }

    /**
     * A description for the AnomalyDetector.
     * 
     */
    @InputImport(name="anomalyDetectorDescription")
      private final @Nullable Input<String> anomalyDetectorDescription;

    public Input<String> getAnomalyDetectorDescription() {
        return this.anomalyDetectorDescription == null ? Input.empty() : this.anomalyDetectorDescription;
    }

    /**
     * Name for the Amazon Lookout for Metrics Anomaly Detector
     * 
     */
    @InputImport(name="anomalyDetectorName")
      private final @Nullable Input<String> anomalyDetectorName;

    public Input<String> getAnomalyDetectorName() {
        return this.anomalyDetectorName == null ? Input.empty() : this.anomalyDetectorName;
    }

    /**
     * KMS key used to encrypt the AnomalyDetector data
     * 
     */
    @InputImport(name="kmsKeyArn")
      private final @Nullable Input<String> kmsKeyArn;

    public Input<String> getKmsKeyArn() {
        return this.kmsKeyArn == null ? Input.empty() : this.kmsKeyArn;
    }

    /**
     * List of metric sets for anomaly detection
     * 
     */
    @InputImport(name="metricSetList", required=true)
      private final Input<List<AnomalyDetectorMetricSetArgs>> metricSetList;

    public Input<List<AnomalyDetectorMetricSetArgs>> getMetricSetList() {
        return this.metricSetList;
    }

    public AnomalyDetectorArgs(
        Input<AnomalyDetectorConfigArgs> anomalyDetectorConfig,
        @Nullable Input<String> anomalyDetectorDescription,
        @Nullable Input<String> anomalyDetectorName,
        @Nullable Input<String> kmsKeyArn,
        Input<List<AnomalyDetectorMetricSetArgs>> metricSetList) {
        this.anomalyDetectorConfig = Objects.requireNonNull(anomalyDetectorConfig, "expected parameter 'anomalyDetectorConfig' to be non-null");
        this.anomalyDetectorDescription = anomalyDetectorDescription;
        this.anomalyDetectorName = anomalyDetectorName;
        this.kmsKeyArn = kmsKeyArn;
        this.metricSetList = Objects.requireNonNull(metricSetList, "expected parameter 'metricSetList' to be non-null");
    }

    private AnomalyDetectorArgs() {
        this.anomalyDetectorConfig = Input.empty();
        this.anomalyDetectorDescription = Input.empty();
        this.anomalyDetectorName = Input.empty();
        this.kmsKeyArn = Input.empty();
        this.metricSetList = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(AnomalyDetectorArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Input<AnomalyDetectorConfigArgs> anomalyDetectorConfig;
        private @Nullable Input<String> anomalyDetectorDescription;
        private @Nullable Input<String> anomalyDetectorName;
        private @Nullable Input<String> kmsKeyArn;
        private Input<List<AnomalyDetectorMetricSetArgs>> metricSetList;

        public Builder() {
    	      // Empty
        }

        public Builder(AnomalyDetectorArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.anomalyDetectorConfig = defaults.anomalyDetectorConfig;
    	      this.anomalyDetectorDescription = defaults.anomalyDetectorDescription;
    	      this.anomalyDetectorName = defaults.anomalyDetectorName;
    	      this.kmsKeyArn = defaults.kmsKeyArn;
    	      this.metricSetList = defaults.metricSetList;
        }

        public Builder setAnomalyDetectorConfig(Input<AnomalyDetectorConfigArgs> anomalyDetectorConfig) {
            this.anomalyDetectorConfig = Objects.requireNonNull(anomalyDetectorConfig);
            return this;
        }

        public Builder setAnomalyDetectorConfig(AnomalyDetectorConfigArgs anomalyDetectorConfig) {
            this.anomalyDetectorConfig = Input.of(Objects.requireNonNull(anomalyDetectorConfig));
            return this;
        }

        public Builder setAnomalyDetectorDescription(@Nullable Input<String> anomalyDetectorDescription) {
            this.anomalyDetectorDescription = anomalyDetectorDescription;
            return this;
        }

        public Builder setAnomalyDetectorDescription(@Nullable String anomalyDetectorDescription) {
            this.anomalyDetectorDescription = Input.ofNullable(anomalyDetectorDescription);
            return this;
        }

        public Builder setAnomalyDetectorName(@Nullable Input<String> anomalyDetectorName) {
            this.anomalyDetectorName = anomalyDetectorName;
            return this;
        }

        public Builder setAnomalyDetectorName(@Nullable String anomalyDetectorName) {
            this.anomalyDetectorName = Input.ofNullable(anomalyDetectorName);
            return this;
        }

        public Builder setKmsKeyArn(@Nullable Input<String> kmsKeyArn) {
            this.kmsKeyArn = kmsKeyArn;
            return this;
        }

        public Builder setKmsKeyArn(@Nullable String kmsKeyArn) {
            this.kmsKeyArn = Input.ofNullable(kmsKeyArn);
            return this;
        }

        public Builder setMetricSetList(Input<List<AnomalyDetectorMetricSetArgs>> metricSetList) {
            this.metricSetList = Objects.requireNonNull(metricSetList);
            return this;
        }

        public Builder setMetricSetList(List<AnomalyDetectorMetricSetArgs> metricSetList) {
            this.metricSetList = Input.of(Objects.requireNonNull(metricSetList));
            return this;
        }
        public AnomalyDetectorArgs build() {
            return new AnomalyDetectorArgs(anomalyDetectorConfig, anomalyDetectorDescription, anomalyDetectorName, kmsKeyArn, metricSetList);
        }
    }
}
