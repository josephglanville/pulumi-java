// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.kinesisfirehose.inputs;

import io.pulumi.awsnative.kinesisfirehose.enums.DeliveryStreamExtendedS3DestinationConfigurationCompressionFormat;
import io.pulumi.awsnative.kinesisfirehose.enums.DeliveryStreamExtendedS3DestinationConfigurationS3BackupMode;
import io.pulumi.awsnative.kinesisfirehose.inputs.DeliveryStreamBufferingHintsArgs;
import io.pulumi.awsnative.kinesisfirehose.inputs.DeliveryStreamCloudWatchLoggingOptionsArgs;
import io.pulumi.awsnative.kinesisfirehose.inputs.DeliveryStreamDataFormatConversionConfigurationArgs;
import io.pulumi.awsnative.kinesisfirehose.inputs.DeliveryStreamDynamicPartitioningConfigurationArgs;
import io.pulumi.awsnative.kinesisfirehose.inputs.DeliveryStreamEncryptionConfigurationArgs;
import io.pulumi.awsnative.kinesisfirehose.inputs.DeliveryStreamProcessingConfigurationArgs;
import io.pulumi.awsnative.kinesisfirehose.inputs.DeliveryStreamS3DestinationConfigurationArgs;
import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class DeliveryStreamExtendedS3DestinationConfigurationArgs extends io.pulumi.resources.ResourceArgs {

    public static final DeliveryStreamExtendedS3DestinationConfigurationArgs Empty = new DeliveryStreamExtendedS3DestinationConfigurationArgs();

    @InputImport(name="bucketARN", required=true)
      private final Input<String> bucketARN;

    public Input<String> getBucketARN() {
        return this.bucketARN;
    }

    @InputImport(name="bufferingHints")
      private final @Nullable Input<DeliveryStreamBufferingHintsArgs> bufferingHints;

    public Input<DeliveryStreamBufferingHintsArgs> getBufferingHints() {
        return this.bufferingHints == null ? Input.empty() : this.bufferingHints;
    }

    @InputImport(name="cloudWatchLoggingOptions")
      private final @Nullable Input<DeliveryStreamCloudWatchLoggingOptionsArgs> cloudWatchLoggingOptions;

    public Input<DeliveryStreamCloudWatchLoggingOptionsArgs> getCloudWatchLoggingOptions() {
        return this.cloudWatchLoggingOptions == null ? Input.empty() : this.cloudWatchLoggingOptions;
    }

    @InputImport(name="compressionFormat")
      private final @Nullable Input<DeliveryStreamExtendedS3DestinationConfigurationCompressionFormat> compressionFormat;

    public Input<DeliveryStreamExtendedS3DestinationConfigurationCompressionFormat> getCompressionFormat() {
        return this.compressionFormat == null ? Input.empty() : this.compressionFormat;
    }

    @InputImport(name="dataFormatConversionConfiguration")
      private final @Nullable Input<DeliveryStreamDataFormatConversionConfigurationArgs> dataFormatConversionConfiguration;

    public Input<DeliveryStreamDataFormatConversionConfigurationArgs> getDataFormatConversionConfiguration() {
        return this.dataFormatConversionConfiguration == null ? Input.empty() : this.dataFormatConversionConfiguration;
    }

    @InputImport(name="dynamicPartitioningConfiguration")
      private final @Nullable Input<DeliveryStreamDynamicPartitioningConfigurationArgs> dynamicPartitioningConfiguration;

    public Input<DeliveryStreamDynamicPartitioningConfigurationArgs> getDynamicPartitioningConfiguration() {
        return this.dynamicPartitioningConfiguration == null ? Input.empty() : this.dynamicPartitioningConfiguration;
    }

    @InputImport(name="encryptionConfiguration")
      private final @Nullable Input<DeliveryStreamEncryptionConfigurationArgs> encryptionConfiguration;

    public Input<DeliveryStreamEncryptionConfigurationArgs> getEncryptionConfiguration() {
        return this.encryptionConfiguration == null ? Input.empty() : this.encryptionConfiguration;
    }

    @InputImport(name="errorOutputPrefix")
      private final @Nullable Input<String> errorOutputPrefix;

    public Input<String> getErrorOutputPrefix() {
        return this.errorOutputPrefix == null ? Input.empty() : this.errorOutputPrefix;
    }

    @InputImport(name="prefix")
      private final @Nullable Input<String> prefix;

    public Input<String> getPrefix() {
        return this.prefix == null ? Input.empty() : this.prefix;
    }

    @InputImport(name="processingConfiguration")
      private final @Nullable Input<DeliveryStreamProcessingConfigurationArgs> processingConfiguration;

    public Input<DeliveryStreamProcessingConfigurationArgs> getProcessingConfiguration() {
        return this.processingConfiguration == null ? Input.empty() : this.processingConfiguration;
    }

    @InputImport(name="roleARN", required=true)
      private final Input<String> roleARN;

    public Input<String> getRoleARN() {
        return this.roleARN;
    }

    @InputImport(name="s3BackupConfiguration")
      private final @Nullable Input<DeliveryStreamS3DestinationConfigurationArgs> s3BackupConfiguration;

    public Input<DeliveryStreamS3DestinationConfigurationArgs> getS3BackupConfiguration() {
        return this.s3BackupConfiguration == null ? Input.empty() : this.s3BackupConfiguration;
    }

    @InputImport(name="s3BackupMode")
      private final @Nullable Input<DeliveryStreamExtendedS3DestinationConfigurationS3BackupMode> s3BackupMode;

    public Input<DeliveryStreamExtendedS3DestinationConfigurationS3BackupMode> getS3BackupMode() {
        return this.s3BackupMode == null ? Input.empty() : this.s3BackupMode;
    }

    public DeliveryStreamExtendedS3DestinationConfigurationArgs(
        Input<String> bucketARN,
        @Nullable Input<DeliveryStreamBufferingHintsArgs> bufferingHints,
        @Nullable Input<DeliveryStreamCloudWatchLoggingOptionsArgs> cloudWatchLoggingOptions,
        @Nullable Input<DeliveryStreamExtendedS3DestinationConfigurationCompressionFormat> compressionFormat,
        @Nullable Input<DeliveryStreamDataFormatConversionConfigurationArgs> dataFormatConversionConfiguration,
        @Nullable Input<DeliveryStreamDynamicPartitioningConfigurationArgs> dynamicPartitioningConfiguration,
        @Nullable Input<DeliveryStreamEncryptionConfigurationArgs> encryptionConfiguration,
        @Nullable Input<String> errorOutputPrefix,
        @Nullable Input<String> prefix,
        @Nullable Input<DeliveryStreamProcessingConfigurationArgs> processingConfiguration,
        Input<String> roleARN,
        @Nullable Input<DeliveryStreamS3DestinationConfigurationArgs> s3BackupConfiguration,
        @Nullable Input<DeliveryStreamExtendedS3DestinationConfigurationS3BackupMode> s3BackupMode) {
        this.bucketARN = Objects.requireNonNull(bucketARN, "expected parameter 'bucketARN' to be non-null");
        this.bufferingHints = bufferingHints;
        this.cloudWatchLoggingOptions = cloudWatchLoggingOptions;
        this.compressionFormat = compressionFormat;
        this.dataFormatConversionConfiguration = dataFormatConversionConfiguration;
        this.dynamicPartitioningConfiguration = dynamicPartitioningConfiguration;
        this.encryptionConfiguration = encryptionConfiguration;
        this.errorOutputPrefix = errorOutputPrefix;
        this.prefix = prefix;
        this.processingConfiguration = processingConfiguration;
        this.roleARN = Objects.requireNonNull(roleARN, "expected parameter 'roleARN' to be non-null");
        this.s3BackupConfiguration = s3BackupConfiguration;
        this.s3BackupMode = s3BackupMode;
    }

    private DeliveryStreamExtendedS3DestinationConfigurationArgs() {
        this.bucketARN = Input.empty();
        this.bufferingHints = Input.empty();
        this.cloudWatchLoggingOptions = Input.empty();
        this.compressionFormat = Input.empty();
        this.dataFormatConversionConfiguration = Input.empty();
        this.dynamicPartitioningConfiguration = Input.empty();
        this.encryptionConfiguration = Input.empty();
        this.errorOutputPrefix = Input.empty();
        this.prefix = Input.empty();
        this.processingConfiguration = Input.empty();
        this.roleARN = Input.empty();
        this.s3BackupConfiguration = Input.empty();
        this.s3BackupMode = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(DeliveryStreamExtendedS3DestinationConfigurationArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Input<String> bucketARN;
        private @Nullable Input<DeliveryStreamBufferingHintsArgs> bufferingHints;
        private @Nullable Input<DeliveryStreamCloudWatchLoggingOptionsArgs> cloudWatchLoggingOptions;
        private @Nullable Input<DeliveryStreamExtendedS3DestinationConfigurationCompressionFormat> compressionFormat;
        private @Nullable Input<DeliveryStreamDataFormatConversionConfigurationArgs> dataFormatConversionConfiguration;
        private @Nullable Input<DeliveryStreamDynamicPartitioningConfigurationArgs> dynamicPartitioningConfiguration;
        private @Nullable Input<DeliveryStreamEncryptionConfigurationArgs> encryptionConfiguration;
        private @Nullable Input<String> errorOutputPrefix;
        private @Nullable Input<String> prefix;
        private @Nullable Input<DeliveryStreamProcessingConfigurationArgs> processingConfiguration;
        private Input<String> roleARN;
        private @Nullable Input<DeliveryStreamS3DestinationConfigurationArgs> s3BackupConfiguration;
        private @Nullable Input<DeliveryStreamExtendedS3DestinationConfigurationS3BackupMode> s3BackupMode;

        public Builder() {
    	      // Empty
        }

        public Builder(DeliveryStreamExtendedS3DestinationConfigurationArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.bucketARN = defaults.bucketARN;
    	      this.bufferingHints = defaults.bufferingHints;
    	      this.cloudWatchLoggingOptions = defaults.cloudWatchLoggingOptions;
    	      this.compressionFormat = defaults.compressionFormat;
    	      this.dataFormatConversionConfiguration = defaults.dataFormatConversionConfiguration;
    	      this.dynamicPartitioningConfiguration = defaults.dynamicPartitioningConfiguration;
    	      this.encryptionConfiguration = defaults.encryptionConfiguration;
    	      this.errorOutputPrefix = defaults.errorOutputPrefix;
    	      this.prefix = defaults.prefix;
    	      this.processingConfiguration = defaults.processingConfiguration;
    	      this.roleARN = defaults.roleARN;
    	      this.s3BackupConfiguration = defaults.s3BackupConfiguration;
    	      this.s3BackupMode = defaults.s3BackupMode;
        }

        public Builder setBucketARN(Input<String> bucketARN) {
            this.bucketARN = Objects.requireNonNull(bucketARN);
            return this;
        }

        public Builder setBucketARN(String bucketARN) {
            this.bucketARN = Input.of(Objects.requireNonNull(bucketARN));
            return this;
        }

        public Builder setBufferingHints(@Nullable Input<DeliveryStreamBufferingHintsArgs> bufferingHints) {
            this.bufferingHints = bufferingHints;
            return this;
        }

        public Builder setBufferingHints(@Nullable DeliveryStreamBufferingHintsArgs bufferingHints) {
            this.bufferingHints = Input.ofNullable(bufferingHints);
            return this;
        }

        public Builder setCloudWatchLoggingOptions(@Nullable Input<DeliveryStreamCloudWatchLoggingOptionsArgs> cloudWatchLoggingOptions) {
            this.cloudWatchLoggingOptions = cloudWatchLoggingOptions;
            return this;
        }

        public Builder setCloudWatchLoggingOptions(@Nullable DeliveryStreamCloudWatchLoggingOptionsArgs cloudWatchLoggingOptions) {
            this.cloudWatchLoggingOptions = Input.ofNullable(cloudWatchLoggingOptions);
            return this;
        }

        public Builder setCompressionFormat(@Nullable Input<DeliveryStreamExtendedS3DestinationConfigurationCompressionFormat> compressionFormat) {
            this.compressionFormat = compressionFormat;
            return this;
        }

        public Builder setCompressionFormat(@Nullable DeliveryStreamExtendedS3DestinationConfigurationCompressionFormat compressionFormat) {
            this.compressionFormat = Input.ofNullable(compressionFormat);
            return this;
        }

        public Builder setDataFormatConversionConfiguration(@Nullable Input<DeliveryStreamDataFormatConversionConfigurationArgs> dataFormatConversionConfiguration) {
            this.dataFormatConversionConfiguration = dataFormatConversionConfiguration;
            return this;
        }

        public Builder setDataFormatConversionConfiguration(@Nullable DeliveryStreamDataFormatConversionConfigurationArgs dataFormatConversionConfiguration) {
            this.dataFormatConversionConfiguration = Input.ofNullable(dataFormatConversionConfiguration);
            return this;
        }

        public Builder setDynamicPartitioningConfiguration(@Nullable Input<DeliveryStreamDynamicPartitioningConfigurationArgs> dynamicPartitioningConfiguration) {
            this.dynamicPartitioningConfiguration = dynamicPartitioningConfiguration;
            return this;
        }

        public Builder setDynamicPartitioningConfiguration(@Nullable DeliveryStreamDynamicPartitioningConfigurationArgs dynamicPartitioningConfiguration) {
            this.dynamicPartitioningConfiguration = Input.ofNullable(dynamicPartitioningConfiguration);
            return this;
        }

        public Builder setEncryptionConfiguration(@Nullable Input<DeliveryStreamEncryptionConfigurationArgs> encryptionConfiguration) {
            this.encryptionConfiguration = encryptionConfiguration;
            return this;
        }

        public Builder setEncryptionConfiguration(@Nullable DeliveryStreamEncryptionConfigurationArgs encryptionConfiguration) {
            this.encryptionConfiguration = Input.ofNullable(encryptionConfiguration);
            return this;
        }

        public Builder setErrorOutputPrefix(@Nullable Input<String> errorOutputPrefix) {
            this.errorOutputPrefix = errorOutputPrefix;
            return this;
        }

        public Builder setErrorOutputPrefix(@Nullable String errorOutputPrefix) {
            this.errorOutputPrefix = Input.ofNullable(errorOutputPrefix);
            return this;
        }

        public Builder setPrefix(@Nullable Input<String> prefix) {
            this.prefix = prefix;
            return this;
        }

        public Builder setPrefix(@Nullable String prefix) {
            this.prefix = Input.ofNullable(prefix);
            return this;
        }

        public Builder setProcessingConfiguration(@Nullable Input<DeliveryStreamProcessingConfigurationArgs> processingConfiguration) {
            this.processingConfiguration = processingConfiguration;
            return this;
        }

        public Builder setProcessingConfiguration(@Nullable DeliveryStreamProcessingConfigurationArgs processingConfiguration) {
            this.processingConfiguration = Input.ofNullable(processingConfiguration);
            return this;
        }

        public Builder setRoleARN(Input<String> roleARN) {
            this.roleARN = Objects.requireNonNull(roleARN);
            return this;
        }

        public Builder setRoleARN(String roleARN) {
            this.roleARN = Input.of(Objects.requireNonNull(roleARN));
            return this;
        }

        public Builder setS3BackupConfiguration(@Nullable Input<DeliveryStreamS3DestinationConfigurationArgs> s3BackupConfiguration) {
            this.s3BackupConfiguration = s3BackupConfiguration;
            return this;
        }

        public Builder setS3BackupConfiguration(@Nullable DeliveryStreamS3DestinationConfigurationArgs s3BackupConfiguration) {
            this.s3BackupConfiguration = Input.ofNullable(s3BackupConfiguration);
            return this;
        }

        public Builder setS3BackupMode(@Nullable Input<DeliveryStreamExtendedS3DestinationConfigurationS3BackupMode> s3BackupMode) {
            this.s3BackupMode = s3BackupMode;
            return this;
        }

        public Builder setS3BackupMode(@Nullable DeliveryStreamExtendedS3DestinationConfigurationS3BackupMode s3BackupMode) {
            this.s3BackupMode = Input.ofNullable(s3BackupMode);
            return this;
        }
        public DeliveryStreamExtendedS3DestinationConfigurationArgs build() {
            return new DeliveryStreamExtendedS3DestinationConfigurationArgs(bucketARN, bufferingHints, cloudWatchLoggingOptions, compressionFormat, dataFormatConversionConfiguration, dynamicPartitioningConfiguration, encryptionConfiguration, errorOutputPrefix, prefix, processingConfiguration, roleARN, s3BackupConfiguration, s3BackupMode);
        }
    }
}
