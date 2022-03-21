// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.timestreamwrite.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class TableMagneticStoreWritePropertiesMagneticStoreRejectedDataLocationS3ConfigurationArgs extends io.pulumi.resources.ResourceArgs {

    public static final TableMagneticStoreWritePropertiesMagneticStoreRejectedDataLocationS3ConfigurationArgs Empty = new TableMagneticStoreWritePropertiesMagneticStoreRejectedDataLocationS3ConfigurationArgs();

    /**
     * Bucket name of the customer S3 bucket.
     * 
     */
    @Import(name="bucketName")
      private final @Nullable Output<String> bucketName;

    public Output<String> getBucketName() {
        return this.bucketName == null ? Output.empty() : this.bucketName;
    }

    /**
     * Encryption option for the customer s3 location. Options are S3 server side encryption with an S3-managed key or KMS managed key. Valid values are `SSE_KMS` and `SSE_S3`.
     * 
     */
    @Import(name="encryptionOption")
      private final @Nullable Output<String> encryptionOption;

    public Output<String> getEncryptionOption() {
        return this.encryptionOption == null ? Output.empty() : this.encryptionOption;
    }

    /**
     * KMS key arn for the customer s3 location when encrypting with a KMS managed key.
     * 
     */
    @Import(name="kmsKeyId")
      private final @Nullable Output<String> kmsKeyId;

    public Output<String> getKmsKeyId() {
        return this.kmsKeyId == null ? Output.empty() : this.kmsKeyId;
    }

    /**
     * Object key prefix for the customer S3 location.
     * 
     */
    @Import(name="objectKeyPrefix")
      private final @Nullable Output<String> objectKeyPrefix;

    public Output<String> getObjectKeyPrefix() {
        return this.objectKeyPrefix == null ? Output.empty() : this.objectKeyPrefix;
    }

    public TableMagneticStoreWritePropertiesMagneticStoreRejectedDataLocationS3ConfigurationArgs(
        @Nullable Output<String> bucketName,
        @Nullable Output<String> encryptionOption,
        @Nullable Output<String> kmsKeyId,
        @Nullable Output<String> objectKeyPrefix) {
        this.bucketName = bucketName;
        this.encryptionOption = encryptionOption;
        this.kmsKeyId = kmsKeyId;
        this.objectKeyPrefix = objectKeyPrefix;
    }

    private TableMagneticStoreWritePropertiesMagneticStoreRejectedDataLocationS3ConfigurationArgs() {
        this.bucketName = Output.empty();
        this.encryptionOption = Output.empty();
        this.kmsKeyId = Output.empty();
        this.objectKeyPrefix = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(TableMagneticStoreWritePropertiesMagneticStoreRejectedDataLocationS3ConfigurationArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<String> bucketName;
        private @Nullable Output<String> encryptionOption;
        private @Nullable Output<String> kmsKeyId;
        private @Nullable Output<String> objectKeyPrefix;

        public Builder() {
    	      // Empty
        }

        public Builder(TableMagneticStoreWritePropertiesMagneticStoreRejectedDataLocationS3ConfigurationArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.bucketName = defaults.bucketName;
    	      this.encryptionOption = defaults.encryptionOption;
    	      this.kmsKeyId = defaults.kmsKeyId;
    	      this.objectKeyPrefix = defaults.objectKeyPrefix;
        }

        public Builder bucketName(@Nullable Output<String> bucketName) {
            this.bucketName = bucketName;
            return this;
        }
        public Builder bucketName(@Nullable String bucketName) {
            this.bucketName = Output.ofNullable(bucketName);
            return this;
        }
        public Builder encryptionOption(@Nullable Output<String> encryptionOption) {
            this.encryptionOption = encryptionOption;
            return this;
        }
        public Builder encryptionOption(@Nullable String encryptionOption) {
            this.encryptionOption = Output.ofNullable(encryptionOption);
            return this;
        }
        public Builder kmsKeyId(@Nullable Output<String> kmsKeyId) {
            this.kmsKeyId = kmsKeyId;
            return this;
        }
        public Builder kmsKeyId(@Nullable String kmsKeyId) {
            this.kmsKeyId = Output.ofNullable(kmsKeyId);
            return this;
        }
        public Builder objectKeyPrefix(@Nullable Output<String> objectKeyPrefix) {
            this.objectKeyPrefix = objectKeyPrefix;
            return this;
        }
        public Builder objectKeyPrefix(@Nullable String objectKeyPrefix) {
            this.objectKeyPrefix = Output.ofNullable(objectKeyPrefix);
            return this;
        }        public TableMagneticStoreWritePropertiesMagneticStoreRejectedDataLocationS3ConfigurationArgs build() {
            return new TableMagneticStoreWritePropertiesMagneticStoreRejectedDataLocationS3ConfigurationArgs(bucketName, encryptionOption, kmsKeyId, objectKeyPrefix);
        }
    }
}
