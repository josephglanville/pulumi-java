// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.kinesisfirehose.outputs;

import io.pulumi.awsnative.kinesisfirehose.enums.DeliveryStreamElasticsearchDestinationConfigurationIndexRotationPeriod;
import io.pulumi.awsnative.kinesisfirehose.enums.DeliveryStreamElasticsearchDestinationConfigurationS3BackupMode;
import io.pulumi.awsnative.kinesisfirehose.outputs.DeliveryStreamCloudWatchLoggingOptions;
import io.pulumi.awsnative.kinesisfirehose.outputs.DeliveryStreamElasticsearchBufferingHints;
import io.pulumi.awsnative.kinesisfirehose.outputs.DeliveryStreamElasticsearchRetryOptions;
import io.pulumi.awsnative.kinesisfirehose.outputs.DeliveryStreamProcessingConfiguration;
import io.pulumi.awsnative.kinesisfirehose.outputs.DeliveryStreamS3DestinationConfiguration;
import io.pulumi.awsnative.kinesisfirehose.outputs.DeliveryStreamVpcConfiguration;
import io.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class DeliveryStreamElasticsearchDestinationConfiguration {
    private final @Nullable DeliveryStreamElasticsearchBufferingHints bufferingHints;
    private final @Nullable DeliveryStreamCloudWatchLoggingOptions cloudWatchLoggingOptions;
    private final @Nullable String clusterEndpoint;
    private final @Nullable String domainARN;
    private final String indexName;
    private final @Nullable DeliveryStreamElasticsearchDestinationConfigurationIndexRotationPeriod indexRotationPeriod;
    private final @Nullable DeliveryStreamProcessingConfiguration processingConfiguration;
    private final @Nullable DeliveryStreamElasticsearchRetryOptions retryOptions;
    private final String roleARN;
    private final @Nullable DeliveryStreamElasticsearchDestinationConfigurationS3BackupMode s3BackupMode;
    private final DeliveryStreamS3DestinationConfiguration s3Configuration;
    private final @Nullable String typeName;
    private final @Nullable DeliveryStreamVpcConfiguration vpcConfiguration;

    @CustomType.Constructor
    private DeliveryStreamElasticsearchDestinationConfiguration(
        @CustomType.Parameter("bufferingHints") @Nullable DeliveryStreamElasticsearchBufferingHints bufferingHints,
        @CustomType.Parameter("cloudWatchLoggingOptions") @Nullable DeliveryStreamCloudWatchLoggingOptions cloudWatchLoggingOptions,
        @CustomType.Parameter("clusterEndpoint") @Nullable String clusterEndpoint,
        @CustomType.Parameter("domainARN") @Nullable String domainARN,
        @CustomType.Parameter("indexName") String indexName,
        @CustomType.Parameter("indexRotationPeriod") @Nullable DeliveryStreamElasticsearchDestinationConfigurationIndexRotationPeriod indexRotationPeriod,
        @CustomType.Parameter("processingConfiguration") @Nullable DeliveryStreamProcessingConfiguration processingConfiguration,
        @CustomType.Parameter("retryOptions") @Nullable DeliveryStreamElasticsearchRetryOptions retryOptions,
        @CustomType.Parameter("roleARN") String roleARN,
        @CustomType.Parameter("s3BackupMode") @Nullable DeliveryStreamElasticsearchDestinationConfigurationS3BackupMode s3BackupMode,
        @CustomType.Parameter("s3Configuration") DeliveryStreamS3DestinationConfiguration s3Configuration,
        @CustomType.Parameter("typeName") @Nullable String typeName,
        @CustomType.Parameter("vpcConfiguration") @Nullable DeliveryStreamVpcConfiguration vpcConfiguration) {
        this.bufferingHints = bufferingHints;
        this.cloudWatchLoggingOptions = cloudWatchLoggingOptions;
        this.clusterEndpoint = clusterEndpoint;
        this.domainARN = domainARN;
        this.indexName = indexName;
        this.indexRotationPeriod = indexRotationPeriod;
        this.processingConfiguration = processingConfiguration;
        this.retryOptions = retryOptions;
        this.roleARN = roleARN;
        this.s3BackupMode = s3BackupMode;
        this.s3Configuration = s3Configuration;
        this.typeName = typeName;
        this.vpcConfiguration = vpcConfiguration;
    }

    public Optional<DeliveryStreamElasticsearchBufferingHints> getBufferingHints() {
        return Optional.ofNullable(this.bufferingHints);
    }
    public Optional<DeliveryStreamCloudWatchLoggingOptions> getCloudWatchLoggingOptions() {
        return Optional.ofNullable(this.cloudWatchLoggingOptions);
    }
    public Optional<String> getClusterEndpoint() {
        return Optional.ofNullable(this.clusterEndpoint);
    }
    public Optional<String> getDomainARN() {
        return Optional.ofNullable(this.domainARN);
    }
    public String getIndexName() {
        return this.indexName;
    }
    public Optional<DeliveryStreamElasticsearchDestinationConfigurationIndexRotationPeriod> getIndexRotationPeriod() {
        return Optional.ofNullable(this.indexRotationPeriod);
    }
    public Optional<DeliveryStreamProcessingConfiguration> getProcessingConfiguration() {
        return Optional.ofNullable(this.processingConfiguration);
    }
    public Optional<DeliveryStreamElasticsearchRetryOptions> getRetryOptions() {
        return Optional.ofNullable(this.retryOptions);
    }
    public String getRoleARN() {
        return this.roleARN;
    }
    public Optional<DeliveryStreamElasticsearchDestinationConfigurationS3BackupMode> getS3BackupMode() {
        return Optional.ofNullable(this.s3BackupMode);
    }
    public DeliveryStreamS3DestinationConfiguration getS3Configuration() {
        return this.s3Configuration;
    }
    public Optional<String> getTypeName() {
        return Optional.ofNullable(this.typeName);
    }
    public Optional<DeliveryStreamVpcConfiguration> getVpcConfiguration() {
        return Optional.ofNullable(this.vpcConfiguration);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(DeliveryStreamElasticsearchDestinationConfiguration defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable DeliveryStreamElasticsearchBufferingHints bufferingHints;
        private @Nullable DeliveryStreamCloudWatchLoggingOptions cloudWatchLoggingOptions;
        private @Nullable String clusterEndpoint;
        private @Nullable String domainARN;
        private String indexName;
        private @Nullable DeliveryStreamElasticsearchDestinationConfigurationIndexRotationPeriod indexRotationPeriod;
        private @Nullable DeliveryStreamProcessingConfiguration processingConfiguration;
        private @Nullable DeliveryStreamElasticsearchRetryOptions retryOptions;
        private String roleARN;
        private @Nullable DeliveryStreamElasticsearchDestinationConfigurationS3BackupMode s3BackupMode;
        private DeliveryStreamS3DestinationConfiguration s3Configuration;
        private @Nullable String typeName;
        private @Nullable DeliveryStreamVpcConfiguration vpcConfiguration;

        public Builder() {
    	      // Empty
        }

        public Builder(DeliveryStreamElasticsearchDestinationConfiguration defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.bufferingHints = defaults.bufferingHints;
    	      this.cloudWatchLoggingOptions = defaults.cloudWatchLoggingOptions;
    	      this.clusterEndpoint = defaults.clusterEndpoint;
    	      this.domainARN = defaults.domainARN;
    	      this.indexName = defaults.indexName;
    	      this.indexRotationPeriod = defaults.indexRotationPeriod;
    	      this.processingConfiguration = defaults.processingConfiguration;
    	      this.retryOptions = defaults.retryOptions;
    	      this.roleARN = defaults.roleARN;
    	      this.s3BackupMode = defaults.s3BackupMode;
    	      this.s3Configuration = defaults.s3Configuration;
    	      this.typeName = defaults.typeName;
    	      this.vpcConfiguration = defaults.vpcConfiguration;
        }

        public Builder bufferingHints(@Nullable DeliveryStreamElasticsearchBufferingHints bufferingHints) {
            this.bufferingHints = bufferingHints;
            return this;
        }
        public Builder cloudWatchLoggingOptions(@Nullable DeliveryStreamCloudWatchLoggingOptions cloudWatchLoggingOptions) {
            this.cloudWatchLoggingOptions = cloudWatchLoggingOptions;
            return this;
        }
        public Builder clusterEndpoint(@Nullable String clusterEndpoint) {
            this.clusterEndpoint = clusterEndpoint;
            return this;
        }
        public Builder domainARN(@Nullable String domainARN) {
            this.domainARN = domainARN;
            return this;
        }
        public Builder indexName(String indexName) {
            this.indexName = Objects.requireNonNull(indexName);
            return this;
        }
        public Builder indexRotationPeriod(@Nullable DeliveryStreamElasticsearchDestinationConfigurationIndexRotationPeriod indexRotationPeriod) {
            this.indexRotationPeriod = indexRotationPeriod;
            return this;
        }
        public Builder processingConfiguration(@Nullable DeliveryStreamProcessingConfiguration processingConfiguration) {
            this.processingConfiguration = processingConfiguration;
            return this;
        }
        public Builder retryOptions(@Nullable DeliveryStreamElasticsearchRetryOptions retryOptions) {
            this.retryOptions = retryOptions;
            return this;
        }
        public Builder roleARN(String roleARN) {
            this.roleARN = Objects.requireNonNull(roleARN);
            return this;
        }
        public Builder s3BackupMode(@Nullable DeliveryStreamElasticsearchDestinationConfigurationS3BackupMode s3BackupMode) {
            this.s3BackupMode = s3BackupMode;
            return this;
        }
        public Builder s3Configuration(DeliveryStreamS3DestinationConfiguration s3Configuration) {
            this.s3Configuration = Objects.requireNonNull(s3Configuration);
            return this;
        }
        public Builder typeName(@Nullable String typeName) {
            this.typeName = typeName;
            return this;
        }
        public Builder vpcConfiguration(@Nullable DeliveryStreamVpcConfiguration vpcConfiguration) {
            this.vpcConfiguration = vpcConfiguration;
            return this;
        }        public DeliveryStreamElasticsearchDestinationConfiguration build() {
            return new DeliveryStreamElasticsearchDestinationConfiguration(bufferingHints, cloudWatchLoggingOptions, clusterEndpoint, domainARN, indexName, indexRotationPeriod, processingConfiguration, retryOptions, roleARN, s3BackupMode, s3Configuration, typeName, vpcConfiguration);
        }
    }
}
