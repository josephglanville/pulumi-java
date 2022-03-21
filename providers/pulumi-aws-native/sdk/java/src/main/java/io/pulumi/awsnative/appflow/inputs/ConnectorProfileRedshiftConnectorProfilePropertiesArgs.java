// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.appflow.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class ConnectorProfileRedshiftConnectorProfilePropertiesArgs extends io.pulumi.resources.ResourceArgs {

    public static final ConnectorProfileRedshiftConnectorProfilePropertiesArgs Empty = new ConnectorProfileRedshiftConnectorProfilePropertiesArgs();

    /**
     * The name of the Amazon S3 bucket associated with Redshift.
     * 
     */
    @Import(name="bucketName", required=true)
      private final Output<String> bucketName;

    public Output<String> getBucketName() {
        return this.bucketName;
    }

    /**
     * The object key for the destination bucket in which Amazon AppFlow will place the ﬁles.
     * 
     */
    @Import(name="bucketPrefix")
      private final @Nullable Output<String> bucketPrefix;

    public Output<String> getBucketPrefix() {
        return this.bucketPrefix == null ? Output.empty() : this.bucketPrefix;
    }

    /**
     * The JDBC URL of the Amazon Redshift cluster.
     * 
     */
    @Import(name="databaseUrl", required=true)
      private final Output<String> databaseUrl;

    public Output<String> getDatabaseUrl() {
        return this.databaseUrl;
    }

    /**
     * The Amazon Resource Name (ARN) of the IAM role.
     * 
     */
    @Import(name="roleArn", required=true)
      private final Output<String> roleArn;

    public Output<String> getRoleArn() {
        return this.roleArn;
    }

    public ConnectorProfileRedshiftConnectorProfilePropertiesArgs(
        Output<String> bucketName,
        @Nullable Output<String> bucketPrefix,
        Output<String> databaseUrl,
        Output<String> roleArn) {
        this.bucketName = Objects.requireNonNull(bucketName, "expected parameter 'bucketName' to be non-null");
        this.bucketPrefix = bucketPrefix;
        this.databaseUrl = Objects.requireNonNull(databaseUrl, "expected parameter 'databaseUrl' to be non-null");
        this.roleArn = Objects.requireNonNull(roleArn, "expected parameter 'roleArn' to be non-null");
    }

    private ConnectorProfileRedshiftConnectorProfilePropertiesArgs() {
        this.bucketName = Output.empty();
        this.bucketPrefix = Output.empty();
        this.databaseUrl = Output.empty();
        this.roleArn = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ConnectorProfileRedshiftConnectorProfilePropertiesArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Output<String> bucketName;
        private @Nullable Output<String> bucketPrefix;
        private Output<String> databaseUrl;
        private Output<String> roleArn;

        public Builder() {
    	      // Empty
        }

        public Builder(ConnectorProfileRedshiftConnectorProfilePropertiesArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.bucketName = defaults.bucketName;
    	      this.bucketPrefix = defaults.bucketPrefix;
    	      this.databaseUrl = defaults.databaseUrl;
    	      this.roleArn = defaults.roleArn;
        }

        public Builder bucketName(Output<String> bucketName) {
            this.bucketName = Objects.requireNonNull(bucketName);
            return this;
        }
        public Builder bucketName(String bucketName) {
            this.bucketName = Output.of(Objects.requireNonNull(bucketName));
            return this;
        }
        public Builder bucketPrefix(@Nullable Output<String> bucketPrefix) {
            this.bucketPrefix = bucketPrefix;
            return this;
        }
        public Builder bucketPrefix(@Nullable String bucketPrefix) {
            this.bucketPrefix = Output.ofNullable(bucketPrefix);
            return this;
        }
        public Builder databaseUrl(Output<String> databaseUrl) {
            this.databaseUrl = Objects.requireNonNull(databaseUrl);
            return this;
        }
        public Builder databaseUrl(String databaseUrl) {
            this.databaseUrl = Output.of(Objects.requireNonNull(databaseUrl));
            return this;
        }
        public Builder roleArn(Output<String> roleArn) {
            this.roleArn = Objects.requireNonNull(roleArn);
            return this;
        }
        public Builder roleArn(String roleArn) {
            this.roleArn = Output.of(Objects.requireNonNull(roleArn));
            return this;
        }        public ConnectorProfileRedshiftConnectorProfilePropertiesArgs build() {
            return new ConnectorProfileRedshiftConnectorProfilePropertiesArgs(bucketName, bucketPrefix, databaseUrl, roleArn);
        }
    }
}
