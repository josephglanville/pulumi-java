// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.s3.inputs;

import io.pulumi.aws.s3.inputs.BucketReplicationConfigurationRuleDestinationAccessControlTranslationArgs;
import io.pulumi.aws.s3.inputs.BucketReplicationConfigurationRuleDestinationMetricsArgs;
import io.pulumi.aws.s3.inputs.BucketReplicationConfigurationRuleDestinationReplicationTimeArgs;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class BucketReplicationConfigurationRuleDestinationArgs extends io.pulumi.resources.ResourceArgs {

    public static final BucketReplicationConfigurationRuleDestinationArgs Empty = new BucketReplicationConfigurationRuleDestinationArgs();

    /**
     * Specifies the overrides to use for object owners on replication. Must be used in conjunction with `account_id` owner override configuration.
     * 
     */
    @Import(name="accessControlTranslation")
      private final @Nullable Output<BucketReplicationConfigurationRuleDestinationAccessControlTranslationArgs> accessControlTranslation;

    public Output<BucketReplicationConfigurationRuleDestinationAccessControlTranslationArgs> getAccessControlTranslation() {
        return this.accessControlTranslation == null ? Output.empty() : this.accessControlTranslation;
    }

    /**
     * The Account ID to use for overriding the object owner on replication. Must be used in conjunction with `access_control_translation` override configuration.
     * 
     */
    @Import(name="accountId")
      private final @Nullable Output<String> accountId;

    public Output<String> getAccountId() {
        return this.accountId == null ? Output.empty() : this.accountId;
    }

    /**
     * The ARN of the S3 bucket where you want Amazon S3 to store replicas of the object identified by the rule.
     * 
     */
    @Import(name="bucket", required=true)
      private final Output<String> bucket;

    public Output<String> getBucket() {
        return this.bucket;
    }

    /**
     * Enables replication metrics (required for S3 RTC) (documented below).
     * 
     */
    @Import(name="metrics")
      private final @Nullable Output<BucketReplicationConfigurationRuleDestinationMetricsArgs> metrics;

    public Output<BucketReplicationConfigurationRuleDestinationMetricsArgs> getMetrics() {
        return this.metrics == null ? Output.empty() : this.metrics;
    }

    /**
     * Destination KMS encryption key ARN for SSE-KMS replication. Must be used in conjunction with
     * `sse_kms_encrypted_objects` source selection criteria.
     * 
     */
    @Import(name="replicaKmsKeyId")
      private final @Nullable Output<String> replicaKmsKeyId;

    public Output<String> getReplicaKmsKeyId() {
        return this.replicaKmsKeyId == null ? Output.empty() : this.replicaKmsKeyId;
    }

    /**
     * Enables S3 Replication Time Control (S3 RTC) (documented below).
     * 
     */
    @Import(name="replicationTime")
      private final @Nullable Output<BucketReplicationConfigurationRuleDestinationReplicationTimeArgs> replicationTime;

    public Output<BucketReplicationConfigurationRuleDestinationReplicationTimeArgs> getReplicationTime() {
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

    public BucketReplicationConfigurationRuleDestinationArgs(
        @Nullable Output<BucketReplicationConfigurationRuleDestinationAccessControlTranslationArgs> accessControlTranslation,
        @Nullable Output<String> accountId,
        Output<String> bucket,
        @Nullable Output<BucketReplicationConfigurationRuleDestinationMetricsArgs> metrics,
        @Nullable Output<String> replicaKmsKeyId,
        @Nullable Output<BucketReplicationConfigurationRuleDestinationReplicationTimeArgs> replicationTime,
        @Nullable Output<String> storageClass) {
        this.accessControlTranslation = accessControlTranslation;
        this.accountId = accountId;
        this.bucket = Objects.requireNonNull(bucket, "expected parameter 'bucket' to be non-null");
        this.metrics = metrics;
        this.replicaKmsKeyId = replicaKmsKeyId;
        this.replicationTime = replicationTime;
        this.storageClass = storageClass;
    }

    private BucketReplicationConfigurationRuleDestinationArgs() {
        this.accessControlTranslation = Output.empty();
        this.accountId = Output.empty();
        this.bucket = Output.empty();
        this.metrics = Output.empty();
        this.replicaKmsKeyId = Output.empty();
        this.replicationTime = Output.empty();
        this.storageClass = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(BucketReplicationConfigurationRuleDestinationArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<BucketReplicationConfigurationRuleDestinationAccessControlTranslationArgs> accessControlTranslation;
        private @Nullable Output<String> accountId;
        private Output<String> bucket;
        private @Nullable Output<BucketReplicationConfigurationRuleDestinationMetricsArgs> metrics;
        private @Nullable Output<String> replicaKmsKeyId;
        private @Nullable Output<BucketReplicationConfigurationRuleDestinationReplicationTimeArgs> replicationTime;
        private @Nullable Output<String> storageClass;

        public Builder() {
    	      // Empty
        }

        public Builder(BucketReplicationConfigurationRuleDestinationArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.accessControlTranslation = defaults.accessControlTranslation;
    	      this.accountId = defaults.accountId;
    	      this.bucket = defaults.bucket;
    	      this.metrics = defaults.metrics;
    	      this.replicaKmsKeyId = defaults.replicaKmsKeyId;
    	      this.replicationTime = defaults.replicationTime;
    	      this.storageClass = defaults.storageClass;
        }

        public Builder accessControlTranslation(@Nullable Output<BucketReplicationConfigurationRuleDestinationAccessControlTranslationArgs> accessControlTranslation) {
            this.accessControlTranslation = accessControlTranslation;
            return this;
        }
        public Builder accessControlTranslation(@Nullable BucketReplicationConfigurationRuleDestinationAccessControlTranslationArgs accessControlTranslation) {
            this.accessControlTranslation = Output.ofNullable(accessControlTranslation);
            return this;
        }
        public Builder accountId(@Nullable Output<String> accountId) {
            this.accountId = accountId;
            return this;
        }
        public Builder accountId(@Nullable String accountId) {
            this.accountId = Output.ofNullable(accountId);
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
        public Builder metrics(@Nullable Output<BucketReplicationConfigurationRuleDestinationMetricsArgs> metrics) {
            this.metrics = metrics;
            return this;
        }
        public Builder metrics(@Nullable BucketReplicationConfigurationRuleDestinationMetricsArgs metrics) {
            this.metrics = Output.ofNullable(metrics);
            return this;
        }
        public Builder replicaKmsKeyId(@Nullable Output<String> replicaKmsKeyId) {
            this.replicaKmsKeyId = replicaKmsKeyId;
            return this;
        }
        public Builder replicaKmsKeyId(@Nullable String replicaKmsKeyId) {
            this.replicaKmsKeyId = Output.ofNullable(replicaKmsKeyId);
            return this;
        }
        public Builder replicationTime(@Nullable Output<BucketReplicationConfigurationRuleDestinationReplicationTimeArgs> replicationTime) {
            this.replicationTime = replicationTime;
            return this;
        }
        public Builder replicationTime(@Nullable BucketReplicationConfigurationRuleDestinationReplicationTimeArgs replicationTime) {
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
        }        public BucketReplicationConfigurationRuleDestinationArgs build() {
            return new BucketReplicationConfigurationRuleDestinationArgs(accessControlTranslation, accountId, bucket, metrics, replicaKmsKeyId, replicationTime, storageClass);
        }
    }
}