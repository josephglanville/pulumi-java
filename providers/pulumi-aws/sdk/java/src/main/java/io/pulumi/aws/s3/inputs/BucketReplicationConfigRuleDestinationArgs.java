// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.s3.inputs;

import io.pulumi.aws.s3.inputs.BucketReplicationConfigRuleDestinationAccessControlTranslationArgs;
import io.pulumi.aws.s3.inputs.BucketReplicationConfigRuleDestinationEncryptionConfigurationArgs;
import io.pulumi.aws.s3.inputs.BucketReplicationConfigRuleDestinationMetricsArgs;
import io.pulumi.aws.s3.inputs.BucketReplicationConfigRuleDestinationReplicationTimeArgs;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class BucketReplicationConfigRuleDestinationArgs extends io.pulumi.resources.ResourceArgs {

    public static final BucketReplicationConfigRuleDestinationArgs Empty = new BucketReplicationConfigRuleDestinationArgs();

    /**
     * A configuration block that specifies the overrides to use for object owners on replication documented below. Specify this only in a cross-account scenario (where source and destination bucket owners are not the same), and you want to change replica ownership to the AWS account that owns the destination bucket. If this is not specified in the replication configuration, the replicas are owned by same AWS account that owns the source object. Must be used in conjunction with `account` owner override configuration.
     * 
     */
    @Import(name="accessControlTranslation")
      private final @Nullable Output<BucketReplicationConfigRuleDestinationAccessControlTranslationArgs> accessControlTranslation;

    public Output<BucketReplicationConfigRuleDestinationAccessControlTranslationArgs> getAccessControlTranslation() {
        return this.accessControlTranslation == null ? Output.empty() : this.accessControlTranslation;
    }

    /**
     * The Account ID to specify the replica ownership. Must be used in conjunction with `access_control_translation` override configuration.
     * 
     */
    @Import(name="account")
      private final @Nullable Output<String> account;

    public Output<String> getAccount() {
        return this.account == null ? Output.empty() : this.account;
    }

    /**
     * The ARN of the S3 bucket where you want Amazon S3 to store replicas of the objects identified by the rule.
     * 
     */
    @Import(name="bucket", required=true)
      private final Output<String> bucket;

    public Output<String> getBucket() {
        return this.bucket;
    }

    /**
     * A configuration block that provides information about encryption documented below. If `source_selection_criteria` is specified, you must specify this element.
     * 
     */
    @Import(name="encryptionConfiguration")
      private final @Nullable Output<BucketReplicationConfigRuleDestinationEncryptionConfigurationArgs> encryptionConfiguration;

    public Output<BucketReplicationConfigRuleDestinationEncryptionConfigurationArgs> getEncryptionConfiguration() {
        return this.encryptionConfiguration == null ? Output.empty() : this.encryptionConfiguration;
    }

    /**
     * A configuration block that specifies replication metrics-related settings enabling replication metrics and events documented below.
     * 
     */
    @Import(name="metrics")
      private final @Nullable Output<BucketReplicationConfigRuleDestinationMetricsArgs> metrics;

    public Output<BucketReplicationConfigRuleDestinationMetricsArgs> getMetrics() {
        return this.metrics == null ? Output.empty() : this.metrics;
    }

    /**
     * A configuration block that specifies S3 Replication Time Control (S3 RTC), including whether S3 RTC is enabled and the time when all objects and operations on objects must be replicated documented below. Replication Time Control must be used in conjunction with `metrics`.
     * 
     */
    @Import(name="replicationTime")
      private final @Nullable Output<BucketReplicationConfigRuleDestinationReplicationTimeArgs> replicationTime;

    public Output<BucketReplicationConfigRuleDestinationReplicationTimeArgs> getReplicationTime() {
        return this.replicationTime == null ? Output.empty() : this.replicationTime;
    }

    /**
     * The [storage class](https://docs.aws.amazon.com/AmazonS3/latest/API/API_Destination.html#AmazonS3-Type-Destination-StorageClass) used to store the object. By default, Amazon S3 uses the storage class of the source object to create the object replica.
     * 
     */
    @Import(name="storageClass")
      private final @Nullable Output<String> storageClass;

    public Output<String> getStorageClass() {
        return this.storageClass == null ? Output.empty() : this.storageClass;
    }

    public BucketReplicationConfigRuleDestinationArgs(
        @Nullable Output<BucketReplicationConfigRuleDestinationAccessControlTranslationArgs> accessControlTranslation,
        @Nullable Output<String> account,
        Output<String> bucket,
        @Nullable Output<BucketReplicationConfigRuleDestinationEncryptionConfigurationArgs> encryptionConfiguration,
        @Nullable Output<BucketReplicationConfigRuleDestinationMetricsArgs> metrics,
        @Nullable Output<BucketReplicationConfigRuleDestinationReplicationTimeArgs> replicationTime,
        @Nullable Output<String> storageClass) {
        this.accessControlTranslation = accessControlTranslation;
        this.account = account;
        this.bucket = Objects.requireNonNull(bucket, "expected parameter 'bucket' to be non-null");
        this.encryptionConfiguration = encryptionConfiguration;
        this.metrics = metrics;
        this.replicationTime = replicationTime;
        this.storageClass = storageClass;
    }

    private BucketReplicationConfigRuleDestinationArgs() {
        this.accessControlTranslation = Output.empty();
        this.account = Output.empty();
        this.bucket = Output.empty();
        this.encryptionConfiguration = Output.empty();
        this.metrics = Output.empty();
        this.replicationTime = Output.empty();
        this.storageClass = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(BucketReplicationConfigRuleDestinationArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<BucketReplicationConfigRuleDestinationAccessControlTranslationArgs> accessControlTranslation;
        private @Nullable Output<String> account;
        private Output<String> bucket;
        private @Nullable Output<BucketReplicationConfigRuleDestinationEncryptionConfigurationArgs> encryptionConfiguration;
        private @Nullable Output<BucketReplicationConfigRuleDestinationMetricsArgs> metrics;
        private @Nullable Output<BucketReplicationConfigRuleDestinationReplicationTimeArgs> replicationTime;
        private @Nullable Output<String> storageClass;

        public Builder() {
    	      // Empty
        }

        public Builder(BucketReplicationConfigRuleDestinationArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.accessControlTranslation = defaults.accessControlTranslation;
    	      this.account = defaults.account;
    	      this.bucket = defaults.bucket;
    	      this.encryptionConfiguration = defaults.encryptionConfiguration;
    	      this.metrics = defaults.metrics;
    	      this.replicationTime = defaults.replicationTime;
    	      this.storageClass = defaults.storageClass;
        }

        public Builder accessControlTranslation(@Nullable Output<BucketReplicationConfigRuleDestinationAccessControlTranslationArgs> accessControlTranslation) {
            this.accessControlTranslation = accessControlTranslation;
            return this;
        }
        public Builder accessControlTranslation(@Nullable BucketReplicationConfigRuleDestinationAccessControlTranslationArgs accessControlTranslation) {
            this.accessControlTranslation = Output.ofNullable(accessControlTranslation);
            return this;
        }
        public Builder account(@Nullable Output<String> account) {
            this.account = account;
            return this;
        }
        public Builder account(@Nullable String account) {
            this.account = Output.ofNullable(account);
            return this;
        }
        public Builder bucket(Output<String> bucket) {
            this.bucket = Objects.requireNonNull(bucket);
            return this;
        }
        public Builder bucket(String bucket) {
            this.bucket = Output.of(Objects.requireNonNull(bucket));
            return this;
        }
        public Builder encryptionConfiguration(@Nullable Output<BucketReplicationConfigRuleDestinationEncryptionConfigurationArgs> encryptionConfiguration) {
            this.encryptionConfiguration = encryptionConfiguration;
            return this;
        }
        public Builder encryptionConfiguration(@Nullable BucketReplicationConfigRuleDestinationEncryptionConfigurationArgs encryptionConfiguration) {
            this.encryptionConfiguration = Output.ofNullable(encryptionConfiguration);
            return this;
        }
        public Builder metrics(@Nullable Output<BucketReplicationConfigRuleDestinationMetricsArgs> metrics) {
            this.metrics = metrics;
            return this;
        }
        public Builder metrics(@Nullable BucketReplicationConfigRuleDestinationMetricsArgs metrics) {
            this.metrics = Output.ofNullable(metrics);
            return this;
        }
        public Builder replicationTime(@Nullable Output<BucketReplicationConfigRuleDestinationReplicationTimeArgs> replicationTime) {
            this.replicationTime = replicationTime;
            return this;
        }
        public Builder replicationTime(@Nullable BucketReplicationConfigRuleDestinationReplicationTimeArgs replicationTime) {
            this.replicationTime = Output.ofNullable(replicationTime);
            return this;
        }
        public Builder storageClass(@Nullable Output<String> storageClass) {
            this.storageClass = storageClass;
            return this;
        }
        public Builder storageClass(@Nullable String storageClass) {
            this.storageClass = Output.ofNullable(storageClass);
            return this;
        }        public BucketReplicationConfigRuleDestinationArgs build() {
            return new BucketReplicationConfigRuleDestinationArgs(accessControlTranslation, account, bucket, encryptionConfiguration, metrics, replicationTime, storageClass);
        }
    }
}