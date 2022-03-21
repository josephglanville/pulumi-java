// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.sagemaker.outputs;

import io.pulumi.awsnative.sagemaker.enums.ModelBiasJobDefinitionEndpointInputS3DataDistributionType;
import io.pulumi.awsnative.sagemaker.enums.ModelBiasJobDefinitionEndpointInputS3InputMode;
import io.pulumi.core.annotations.CustomType;
import java.lang.Double;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class ModelBiasJobDefinitionEndpointInput {
    /**
     * Monitoring end time offset, e.g. PT0H
     * 
     */
    private final @Nullable String endTimeOffset;
    private final String endpointName;
    /**
     * JSONpath to locate features in JSONlines dataset
     * 
     */
    private final @Nullable String featuresAttribute;
    /**
     * Index or JSONpath to locate predicted label(s)
     * 
     */
    private final @Nullable String inferenceAttribute;
    /**
     * Path to the filesystem where the endpoint data is available to the container.
     * 
     */
    private final String localPath;
    /**
     * Index or JSONpath to locate probabilities
     * 
     */
    private final @Nullable String probabilityAttribute;
    private final @Nullable Double probabilityThresholdAttribute;
    /**
     * Whether input data distributed in Amazon S3 is fully replicated or sharded by an S3 key. Defauts to FullyReplicated
     * 
     */
    private final @Nullable ModelBiasJobDefinitionEndpointInputS3DataDistributionType s3DataDistributionType;
    /**
     * Whether the Pipe or File is used as the input mode for transfering data for the monitoring job. Pipe mode is recommended for large datasets. File mode is useful for small files that fit in memory. Defaults to File.
     * 
     */
    private final @Nullable ModelBiasJobDefinitionEndpointInputS3InputMode s3InputMode;
    /**
     * Monitoring start time offset, e.g. -PT1H
     * 
     */
    private final @Nullable String startTimeOffset;

    @CustomType.Constructor
    private ModelBiasJobDefinitionEndpointInput(
        @CustomType.Parameter("endTimeOffset") @Nullable String endTimeOffset,
        @CustomType.Parameter("endpointName") String endpointName,
        @CustomType.Parameter("featuresAttribute") @Nullable String featuresAttribute,
        @CustomType.Parameter("inferenceAttribute") @Nullable String inferenceAttribute,
        @CustomType.Parameter("localPath") String localPath,
        @CustomType.Parameter("probabilityAttribute") @Nullable String probabilityAttribute,
        @CustomType.Parameter("probabilityThresholdAttribute") @Nullable Double probabilityThresholdAttribute,
        @CustomType.Parameter("s3DataDistributionType") @Nullable ModelBiasJobDefinitionEndpointInputS3DataDistributionType s3DataDistributionType,
        @CustomType.Parameter("s3InputMode") @Nullable ModelBiasJobDefinitionEndpointInputS3InputMode s3InputMode,
        @CustomType.Parameter("startTimeOffset") @Nullable String startTimeOffset) {
        this.endTimeOffset = endTimeOffset;
        this.endpointName = endpointName;
        this.featuresAttribute = featuresAttribute;
        this.inferenceAttribute = inferenceAttribute;
        this.localPath = localPath;
        this.probabilityAttribute = probabilityAttribute;
        this.probabilityThresholdAttribute = probabilityThresholdAttribute;
        this.s3DataDistributionType = s3DataDistributionType;
        this.s3InputMode = s3InputMode;
        this.startTimeOffset = startTimeOffset;
    }

    /**
     * Monitoring end time offset, e.g. PT0H
     * 
    */
    public Optional<String> getEndTimeOffset() {
        return Optional.ofNullable(this.endTimeOffset);
    }
    public String getEndpointName() {
        return this.endpointName;
    }
    /**
     * JSONpath to locate features in JSONlines dataset
     * 
    */
    public Optional<String> getFeaturesAttribute() {
        return Optional.ofNullable(this.featuresAttribute);
    }
    /**
     * Index or JSONpath to locate predicted label(s)
     * 
    */
    public Optional<String> getInferenceAttribute() {
        return Optional.ofNullable(this.inferenceAttribute);
    }
    /**
     * Path to the filesystem where the endpoint data is available to the container.
     * 
    */
    public String getLocalPath() {
        return this.localPath;
    }
    /**
     * Index or JSONpath to locate probabilities
     * 
    */
    public Optional<String> getProbabilityAttribute() {
        return Optional.ofNullable(this.probabilityAttribute);
    }
    public Optional<Double> getProbabilityThresholdAttribute() {
        return Optional.ofNullable(this.probabilityThresholdAttribute);
    }
    /**
     * Whether input data distributed in Amazon S3 is fully replicated or sharded by an S3 key. Defauts to FullyReplicated
     * 
    */
    public Optional<ModelBiasJobDefinitionEndpointInputS3DataDistributionType> getS3DataDistributionType() {
        return Optional.ofNullable(this.s3DataDistributionType);
    }
    /**
     * Whether the Pipe or File is used as the input mode for transfering data for the monitoring job. Pipe mode is recommended for large datasets. File mode is useful for small files that fit in memory. Defaults to File.
     * 
    */
    public Optional<ModelBiasJobDefinitionEndpointInputS3InputMode> getS3InputMode() {
        return Optional.ofNullable(this.s3InputMode);
    }
    /**
     * Monitoring start time offset, e.g. -PT1H
     * 
    */
    public Optional<String> getStartTimeOffset() {
        return Optional.ofNullable(this.startTimeOffset);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ModelBiasJobDefinitionEndpointInput defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String endTimeOffset;
        private String endpointName;
        private @Nullable String featuresAttribute;
        private @Nullable String inferenceAttribute;
        private String localPath;
        private @Nullable String probabilityAttribute;
        private @Nullable Double probabilityThresholdAttribute;
        private @Nullable ModelBiasJobDefinitionEndpointInputS3DataDistributionType s3DataDistributionType;
        private @Nullable ModelBiasJobDefinitionEndpointInputS3InputMode s3InputMode;
        private @Nullable String startTimeOffset;

        public Builder() {
    	      // Empty
        }

        public Builder(ModelBiasJobDefinitionEndpointInput defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.endTimeOffset = defaults.endTimeOffset;
    	      this.endpointName = defaults.endpointName;
    	      this.featuresAttribute = defaults.featuresAttribute;
    	      this.inferenceAttribute = defaults.inferenceAttribute;
    	      this.localPath = defaults.localPath;
    	      this.probabilityAttribute = defaults.probabilityAttribute;
    	      this.probabilityThresholdAttribute = defaults.probabilityThresholdAttribute;
    	      this.s3DataDistributionType = defaults.s3DataDistributionType;
    	      this.s3InputMode = defaults.s3InputMode;
    	      this.startTimeOffset = defaults.startTimeOffset;
        }

        public Builder endTimeOffset(@Nullable String endTimeOffset) {
            this.endTimeOffset = endTimeOffset;
            return this;
        }
        public Builder endpointName(String endpointName) {
            this.endpointName = Objects.requireNonNull(endpointName);
            return this;
        }
        public Builder featuresAttribute(@Nullable String featuresAttribute) {
            this.featuresAttribute = featuresAttribute;
            return this;
        }
        public Builder inferenceAttribute(@Nullable String inferenceAttribute) {
            this.inferenceAttribute = inferenceAttribute;
            return this;
        }
        public Builder localPath(String localPath) {
            this.localPath = Objects.requireNonNull(localPath);
            return this;
        }
        public Builder probabilityAttribute(@Nullable String probabilityAttribute) {
            this.probabilityAttribute = probabilityAttribute;
            return this;
        }
        public Builder probabilityThresholdAttribute(@Nullable Double probabilityThresholdAttribute) {
            this.probabilityThresholdAttribute = probabilityThresholdAttribute;
            return this;
        }
        public Builder s3DataDistributionType(@Nullable ModelBiasJobDefinitionEndpointInputS3DataDistributionType s3DataDistributionType) {
            this.s3DataDistributionType = s3DataDistributionType;
            return this;
        }
        public Builder s3InputMode(@Nullable ModelBiasJobDefinitionEndpointInputS3InputMode s3InputMode) {
            this.s3InputMode = s3InputMode;
            return this;
        }
        public Builder startTimeOffset(@Nullable String startTimeOffset) {
            this.startTimeOffset = startTimeOffset;
            return this;
        }        public ModelBiasJobDefinitionEndpointInput build() {
            return new ModelBiasJobDefinitionEndpointInput(endTimeOffset, endpointName, featuresAttribute, inferenceAttribute, localPath, probabilityAttribute, probabilityThresholdAttribute, s3DataDistributionType, s3InputMode, startTimeOffset);
        }
    }
}
