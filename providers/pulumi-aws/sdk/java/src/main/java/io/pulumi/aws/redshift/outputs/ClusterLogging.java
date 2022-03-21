// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.redshift.outputs;

import io.pulumi.core.annotations.CustomType;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class ClusterLogging {
    /**
     * The name of an existing S3 bucket where the log files are to be stored. Must be in the same region as the cluster and the cluster must have read bucket and put object permissions.
     * For more information on the permissions required for the bucket, please read the AWS [documentation](http://docs.aws.amazon.com/redshift/latest/mgmt/db-auditing.html#db-auditing-enable-logging)
     * 
     */
    private final @Nullable String bucketName;
    /**
     * Enables logging information such as queries and connection attempts, for the specified Amazon Redshift cluster.
     * 
     */
    private final Boolean enable;
    /**
     * The prefix applied to the log file names.
     * 
     */
    private final @Nullable String s3KeyPrefix;

    @CustomType.Constructor
    private ClusterLogging(
        @CustomType.Parameter("bucketName") @Nullable String bucketName,
        @CustomType.Parameter("enable") Boolean enable,
        @CustomType.Parameter("s3KeyPrefix") @Nullable String s3KeyPrefix) {
        this.bucketName = bucketName;
        this.enable = enable;
        this.s3KeyPrefix = s3KeyPrefix;
    }

    /**
     * The name of an existing S3 bucket where the log files are to be stored. Must be in the same region as the cluster and the cluster must have read bucket and put object permissions.
     * For more information on the permissions required for the bucket, please read the AWS [documentation](http://docs.aws.amazon.com/redshift/latest/mgmt/db-auditing.html#db-auditing-enable-logging)
     * 
    */
    public Optional<String> getBucketName() {
        return Optional.ofNullable(this.bucketName);
    }
    /**
     * Enables logging information such as queries and connection attempts, for the specified Amazon Redshift cluster.
     * 
    */
    public Boolean getEnable() {
        return this.enable;
    }
    /**
     * The prefix applied to the log file names.
     * 
    */
    public Optional<String> getS3KeyPrefix() {
        return Optional.ofNullable(this.s3KeyPrefix);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ClusterLogging defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String bucketName;
        private Boolean enable;
        private @Nullable String s3KeyPrefix;

        public Builder() {
    	      // Empty
        }

        public Builder(ClusterLogging defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.bucketName = defaults.bucketName;
    	      this.enable = defaults.enable;
    	      this.s3KeyPrefix = defaults.s3KeyPrefix;
        }

        public Builder bucketName(@Nullable String bucketName) {
            this.bucketName = bucketName;
            return this;
        }
        public Builder enable(Boolean enable) {
            this.enable = Objects.requireNonNull(enable);
            return this;
        }
        public Builder s3KeyPrefix(@Nullable String s3KeyPrefix) {
            this.s3KeyPrefix = s3KeyPrefix;
            return this;
        }        public ClusterLogging build() {
            return new ClusterLogging(bucketName, enable, s3KeyPrefix);
        }
    }
}
