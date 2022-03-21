// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.kinesis.inputs;

import io.pulumi.aws.kinesis.inputs.FirehoseDeliveryStreamRedshiftConfigurationS3BackupConfigurationCloudwatchLoggingOptionsArgs;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class FirehoseDeliveryStreamRedshiftConfigurationS3BackupConfigurationArgs extends io.pulumi.resources.ResourceArgs {

    public static final FirehoseDeliveryStreamRedshiftConfigurationS3BackupConfigurationArgs Empty = new FirehoseDeliveryStreamRedshiftConfigurationS3BackupConfigurationArgs();

    /**
     * The ARN of the S3 bucket
     * 
     */
    @Import(name="bucketArn", required=true)
      private final Output<String> bucketArn;

    public Output<String> getBucketArn() {
        return this.bucketArn;
    }

    /**
     * Buffer incoming data for the specified period of time, in seconds, before delivering it to the destination. The default value is 300.
     * 
     */
    @Import(name="bufferInterval")
      private final @Nullable Output<Integer> bufferInterval;

    public Output<Integer> getBufferInterval() {
        return this.bufferInterval == null ? Output.empty() : this.bufferInterval;
    }

    /**
     * Buffer incoming data to the specified size, in MBs, before delivering it to the destination. The default value is 5.
     * We recommend setting SizeInMBs to a value greater than the amount of data you typically ingest into the delivery stream in 10 seconds. For example, if you typically ingest data at 1 MB/sec set SizeInMBs to be 10 MB or higher.
     * 
     */
    @Import(name="bufferSize")
      private final @Nullable Output<Integer> bufferSize;

    public Output<Integer> getBufferSize() {
        return this.bufferSize == null ? Output.empty() : this.bufferSize;
    }

    /**
     * The CloudWatch Logging Options for the delivery stream. More details are given below
     * 
     */
    @Import(name="cloudwatchLoggingOptions")
      private final @Nullable Output<FirehoseDeliveryStreamRedshiftConfigurationS3BackupConfigurationCloudwatchLoggingOptionsArgs> cloudwatchLoggingOptions;

    public Output<FirehoseDeliveryStreamRedshiftConfigurationS3BackupConfigurationCloudwatchLoggingOptionsArgs> getCloudwatchLoggingOptions() {
        return this.cloudwatchLoggingOptions == null ? Output.empty() : this.cloudwatchLoggingOptions;
    }

    /**
     * The compression format. If no value is specified, the default is `UNCOMPRESSED`. Other supported values are `GZIP`, `ZIP`, `Snappy`, & `HADOOP_SNAPPY`.
     * 
     */
    @Import(name="compressionFormat")
      private final @Nullable Output<String> compressionFormat;

    public Output<String> getCompressionFormat() {
        return this.compressionFormat == null ? Output.empty() : this.compressionFormat;
    }

    /**
     * Prefix added to failed records before writing them to S3. Not currently supported for `redshift` destination. This prefix appears immediately following the bucket name. For information about how to specify this prefix, see [Custom Prefixes for Amazon S3 Objects](https://docs.aws.amazon.com/firehose/latest/dev/s3-prefixes.html).
     * 
     */
    @Import(name="errorOutputPrefix")
      private final @Nullable Output<String> errorOutputPrefix;

    public Output<String> getErrorOutputPrefix() {
        return this.errorOutputPrefix == null ? Output.empty() : this.errorOutputPrefix;
    }

    /**
     * Specifies the KMS key ARN the stream will use to encrypt data. If not set, no encryption will
     * be used.
     * 
     */
    @Import(name="kmsKeyArn")
      private final @Nullable Output<String> kmsKeyArn;

    public Output<String> getKmsKeyArn() {
        return this.kmsKeyArn == null ? Output.empty() : this.kmsKeyArn;
    }

    /**
     * The "YYYY/MM/DD/HH" time format prefix is automatically used for delivered S3 files. You can specify an extra prefix to be added in front of the time format prefix. Note that if the prefix ends with a slash, it appears as a folder in the S3 bucket
     * 
     */
    @Import(name="prefix")
      private final @Nullable Output<String> prefix;

    public Output<String> getPrefix() {
        return this.prefix == null ? Output.empty() : this.prefix;
    }

    /**
     * The role that Kinesis Data Firehose can use to access AWS Glue. This role must be in the same account you use for Kinesis Data Firehose. Cross-account roles aren't allowed.
     * 
     */
    @Import(name="roleArn", required=true)
      private final Output<String> roleArn;

    public Output<String> getRoleArn() {
        return this.roleArn;
    }

    public FirehoseDeliveryStreamRedshiftConfigurationS3BackupConfigurationArgs(
        Output<String> bucketArn,
        @Nullable Output<Integer> bufferInterval,
        @Nullable Output<Integer> bufferSize,
        @Nullable Output<FirehoseDeliveryStreamRedshiftConfigurationS3BackupConfigurationCloudwatchLoggingOptionsArgs> cloudwatchLoggingOptions,
        @Nullable Output<String> compressionFormat,
        @Nullable Output<String> errorOutputPrefix,
        @Nullable Output<String> kmsKeyArn,
        @Nullable Output<String> prefix,
        Output<String> roleArn) {
        this.bucketArn = Objects.requireNonNull(bucketArn, "expected parameter 'bucketArn' to be non-null");
        this.bufferInterval = bufferInterval;
        this.bufferSize = bufferSize;
        this.cloudwatchLoggingOptions = cloudwatchLoggingOptions;
        this.compressionFormat = compressionFormat;
        this.errorOutputPrefix = errorOutputPrefix;
        this.kmsKeyArn = kmsKeyArn;
        this.prefix = prefix;
        this.roleArn = Objects.requireNonNull(roleArn, "expected parameter 'roleArn' to be non-null");
    }

    private FirehoseDeliveryStreamRedshiftConfigurationS3BackupConfigurationArgs() {
        this.bucketArn = Output.empty();
        this.bufferInterval = Output.empty();
        this.bufferSize = Output.empty();
        this.cloudwatchLoggingOptions = Output.empty();
        this.compressionFormat = Output.empty();
        this.errorOutputPrefix = Output.empty();
        this.kmsKeyArn = Output.empty();
        this.prefix = Output.empty();
        this.roleArn = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(FirehoseDeliveryStreamRedshiftConfigurationS3BackupConfigurationArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Output<String> bucketArn;
        private @Nullable Output<Integer> bufferInterval;
        private @Nullable Output<Integer> bufferSize;
        private @Nullable Output<FirehoseDeliveryStreamRedshiftConfigurationS3BackupConfigurationCloudwatchLoggingOptionsArgs> cloudwatchLoggingOptions;
        private @Nullable Output<String> compressionFormat;
        private @Nullable Output<String> errorOutputPrefix;
        private @Nullable Output<String> kmsKeyArn;
        private @Nullable Output<String> prefix;
        private Output<String> roleArn;

        public Builder() {
    	      // Empty
        }

        public Builder(FirehoseDeliveryStreamRedshiftConfigurationS3BackupConfigurationArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.bucketArn = defaults.bucketArn;
    	      this.bufferInterval = defaults.bufferInterval;
    	      this.bufferSize = defaults.bufferSize;
    	      this.cloudwatchLoggingOptions = defaults.cloudwatchLoggingOptions;
    	      this.compressionFormat = defaults.compressionFormat;
    	      this.errorOutputPrefix = defaults.errorOutputPrefix;
    	      this.kmsKeyArn = defaults.kmsKeyArn;
    	      this.prefix = defaults.prefix;
    	      this.roleArn = defaults.roleArn;
        }

        public Builder bucketArn(Output<String> bucketArn) {
            this.bucketArn = Objects.requireNonNull(bucketArn);
            return this;
        }
        public Builder bucketArn(String bucketArn) {
            this.bucketArn = Output.of(Objects.requireNonNull(bucketArn));
            return this;
        }
        public Builder bufferInterval(@Nullable Output<Integer> bufferInterval) {
            this.bufferInterval = bufferInterval;
            return this;
        }
        public Builder bufferInterval(@Nullable Integer bufferInterval) {
            this.bufferInterval = Output.ofNullable(bufferInterval);
            return this;
        }
        public Builder bufferSize(@Nullable Output<Integer> bufferSize) {
            this.bufferSize = bufferSize;
            return this;
        }
        public Builder bufferSize(@Nullable Integer bufferSize) {
            this.bufferSize = Output.ofNullable(bufferSize);
            return this;
        }
        public Builder cloudwatchLoggingOptions(@Nullable Output<FirehoseDeliveryStreamRedshiftConfigurationS3BackupConfigurationCloudwatchLoggingOptionsArgs> cloudwatchLoggingOptions) {
            this.cloudwatchLoggingOptions = cloudwatchLoggingOptions;
            return this;
        }
        public Builder cloudwatchLoggingOptions(@Nullable FirehoseDeliveryStreamRedshiftConfigurationS3BackupConfigurationCloudwatchLoggingOptionsArgs cloudwatchLoggingOptions) {
            this.cloudwatchLoggingOptions = Output.ofNullable(cloudwatchLoggingOptions);
            return this;
        }
        public Builder compressionFormat(@Nullable Output<String> compressionFormat) {
            this.compressionFormat = compressionFormat;
            return this;
        }
        public Builder compressionFormat(@Nullable String compressionFormat) {
            this.compressionFormat = Output.ofNullable(compressionFormat);
            return this;
        }
        public Builder errorOutputPrefix(@Nullable Output<String> errorOutputPrefix) {
            this.errorOutputPrefix = errorOutputPrefix;
            return this;
        }
        public Builder errorOutputPrefix(@Nullable String errorOutputPrefix) {
            this.errorOutputPrefix = Output.ofNullable(errorOutputPrefix);
            return this;
        }
        public Builder kmsKeyArn(@Nullable Output<String> kmsKeyArn) {
            this.kmsKeyArn = kmsKeyArn;
            return this;
        }
        public Builder kmsKeyArn(@Nullable String kmsKeyArn) {
            this.kmsKeyArn = Output.ofNullable(kmsKeyArn);
            return this;
        }
        public Builder prefix(@Nullable Output<String> prefix) {
            this.prefix = prefix;
            return this;
        }
        public Builder prefix(@Nullable String prefix) {
            this.prefix = Output.ofNullable(prefix);
            return this;
        }
        public Builder roleArn(Output<String> roleArn) {
            this.roleArn = Objects.requireNonNull(roleArn);
            return this;
        }
        public Builder roleArn(String roleArn) {
            this.roleArn = Output.of(Objects.requireNonNull(roleArn));
            return this;
        }        public FirehoseDeliveryStreamRedshiftConfigurationS3BackupConfigurationArgs build() {
            return new FirehoseDeliveryStreamRedshiftConfigurationS3BackupConfigurationArgs(bucketArn, bufferInterval, bufferSize, cloudwatchLoggingOptions, compressionFormat, errorOutputPrefix, kmsKeyArn, prefix, roleArn);
        }
    }
}
