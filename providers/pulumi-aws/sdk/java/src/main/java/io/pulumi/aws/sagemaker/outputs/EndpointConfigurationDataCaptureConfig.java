// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.sagemaker.outputs;

import io.pulumi.aws.sagemaker.outputs.EndpointConfigurationDataCaptureConfigCaptureContentTypeHeader;
import io.pulumi.aws.sagemaker.outputs.EndpointConfigurationDataCaptureConfigCaptureOption;
import io.pulumi.core.annotations.OutputCustomType;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class EndpointConfigurationDataCaptureConfig {
    /**
     * The content type headers to capture. Fields are documented below.
     * 
     */
    private final @Nullable EndpointConfigurationDataCaptureConfigCaptureContentTypeHeader captureContentTypeHeader;
    /**
     * Specifies what data to capture. Fields are documented below.
     * 
     */
    private final List<EndpointConfigurationDataCaptureConfigCaptureOption> captureOptions;
    /**
     * The URL for S3 location where the captured data is stored.
     * 
     */
    private final String destinationS3Uri;
    /**
     * Flag to enable data capture. Defaults to `false`.
     * 
     */
    private final @Nullable Boolean enableCapture;
    /**
     * Portion of data to capture. Should be between 0 and 100.
     * 
     */
    private final Integer initialSamplingPercentage;
    /**
     * The Amazon Web Services Key Management Service (Amazon Web Services KMS) key that Amazon SageMaker uses to encrypt the asynchronous inference output in Amazon S3.
     * 
     */
    private final @Nullable String kmsKeyId;

    @OutputCustomType.Constructor
    private EndpointConfigurationDataCaptureConfig(
        @OutputCustomType.Parameter("captureContentTypeHeader") @Nullable EndpointConfigurationDataCaptureConfigCaptureContentTypeHeader captureContentTypeHeader,
        @OutputCustomType.Parameter("captureOptions") List<EndpointConfigurationDataCaptureConfigCaptureOption> captureOptions,
        @OutputCustomType.Parameter("destinationS3Uri") String destinationS3Uri,
        @OutputCustomType.Parameter("enableCapture") @Nullable Boolean enableCapture,
        @OutputCustomType.Parameter("initialSamplingPercentage") Integer initialSamplingPercentage,
        @OutputCustomType.Parameter("kmsKeyId") @Nullable String kmsKeyId) {
        this.captureContentTypeHeader = captureContentTypeHeader;
        this.captureOptions = captureOptions;
        this.destinationS3Uri = destinationS3Uri;
        this.enableCapture = enableCapture;
        this.initialSamplingPercentage = initialSamplingPercentage;
        this.kmsKeyId = kmsKeyId;
    }

    /**
     * The content type headers to capture. Fields are documented below.
     * 
    */
    public Optional<EndpointConfigurationDataCaptureConfigCaptureContentTypeHeader> getCaptureContentTypeHeader() {
        return Optional.ofNullable(this.captureContentTypeHeader);
    }
    /**
     * Specifies what data to capture. Fields are documented below.
     * 
    */
    public List<EndpointConfigurationDataCaptureConfigCaptureOption> getCaptureOptions() {
        return this.captureOptions;
    }
    /**
     * The URL for S3 location where the captured data is stored.
     * 
    */
    public String getDestinationS3Uri() {
        return this.destinationS3Uri;
    }
    /**
     * Flag to enable data capture. Defaults to `false`.
     * 
    */
    public Optional<Boolean> getEnableCapture() {
        return Optional.ofNullable(this.enableCapture);
    }
    /**
     * Portion of data to capture. Should be between 0 and 100.
     * 
    */
    public Integer getInitialSamplingPercentage() {
        return this.initialSamplingPercentage;
    }
    /**
     * The Amazon Web Services Key Management Service (Amazon Web Services KMS) key that Amazon SageMaker uses to encrypt the asynchronous inference output in Amazon S3.
     * 
    */
    public Optional<String> getKmsKeyId() {
        return Optional.ofNullable(this.kmsKeyId);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(EndpointConfigurationDataCaptureConfig defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable EndpointConfigurationDataCaptureConfigCaptureContentTypeHeader captureContentTypeHeader;
        private List<EndpointConfigurationDataCaptureConfigCaptureOption> captureOptions;
        private String destinationS3Uri;
        private @Nullable Boolean enableCapture;
        private Integer initialSamplingPercentage;
        private @Nullable String kmsKeyId;

        public Builder() {
    	      // Empty
        }

        public Builder(EndpointConfigurationDataCaptureConfig defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.captureContentTypeHeader = defaults.captureContentTypeHeader;
    	      this.captureOptions = defaults.captureOptions;
    	      this.destinationS3Uri = defaults.destinationS3Uri;
    	      this.enableCapture = defaults.enableCapture;
    	      this.initialSamplingPercentage = defaults.initialSamplingPercentage;
    	      this.kmsKeyId = defaults.kmsKeyId;
        }

        public Builder setCaptureContentTypeHeader(@Nullable EndpointConfigurationDataCaptureConfigCaptureContentTypeHeader captureContentTypeHeader) {
            this.captureContentTypeHeader = captureContentTypeHeader;
            return this;
        }

        public Builder setCaptureOptions(List<EndpointConfigurationDataCaptureConfigCaptureOption> captureOptions) {
            this.captureOptions = Objects.requireNonNull(captureOptions);
            return this;
        }

        public Builder setDestinationS3Uri(String destinationS3Uri) {
            this.destinationS3Uri = Objects.requireNonNull(destinationS3Uri);
            return this;
        }

        public Builder setEnableCapture(@Nullable Boolean enableCapture) {
            this.enableCapture = enableCapture;
            return this;
        }

        public Builder setInitialSamplingPercentage(Integer initialSamplingPercentage) {
            this.initialSamplingPercentage = Objects.requireNonNull(initialSamplingPercentage);
            return this;
        }

        public Builder setKmsKeyId(@Nullable String kmsKeyId) {
            this.kmsKeyId = kmsKeyId;
            return this;
        }
        public EndpointConfigurationDataCaptureConfig build() {
            return new EndpointConfigurationDataCaptureConfig(captureContentTypeHeader, captureOptions, destinationS3Uri, enableCapture, initialSamplingPercentage, kmsKeyId);
        }
    }
}
