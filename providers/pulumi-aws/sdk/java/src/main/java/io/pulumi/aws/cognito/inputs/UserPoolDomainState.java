// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.cognito.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class UserPoolDomainState extends io.pulumi.resources.ResourceArgs {

    public static final UserPoolDomainState Empty = new UserPoolDomainState();

    /**
     * The AWS account ID for the user pool owner.
     * 
     */
    @Import(name="awsAccountId")
      private final @Nullable Output<String> awsAccountId;

    public Output<String> getAwsAccountId() {
        return this.awsAccountId == null ? Output.empty() : this.awsAccountId;
    }

    /**
     * The ARN of an ISSUED ACM certificate in us-east-1 for a custom domain.
     * 
     */
    @Import(name="certificateArn")
      private final @Nullable Output<String> certificateArn;

    public Output<String> getCertificateArn() {
        return this.certificateArn == null ? Output.empty() : this.certificateArn;
    }

    /**
     * The URL of the CloudFront distribution. This is required to generate the ALIAS `aws.route53.Record`
     * 
     */
    @Import(name="cloudfrontDistributionArn")
      private final @Nullable Output<String> cloudfrontDistributionArn;

    public Output<String> getCloudfrontDistributionArn() {
        return this.cloudfrontDistributionArn == null ? Output.empty() : this.cloudfrontDistributionArn;
    }

    /**
     * The domain string.
     * 
     */
    @Import(name="domain")
      private final @Nullable Output<String> domain;

    public Output<String> getDomain() {
        return this.domain == null ? Output.empty() : this.domain;
    }

    /**
     * The S3 bucket where the static files for this domain are stored.
     * 
     */
    @Import(name="s3Bucket")
      private final @Nullable Output<String> s3Bucket;

    public Output<String> getS3Bucket() {
        return this.s3Bucket == null ? Output.empty() : this.s3Bucket;
    }

    /**
     * The user pool ID.
     * 
     */
    @Import(name="userPoolId")
      private final @Nullable Output<String> userPoolId;

    public Output<String> getUserPoolId() {
        return this.userPoolId == null ? Output.empty() : this.userPoolId;
    }

    /**
     * The app version.
     * 
     */
    @Import(name="version")
      private final @Nullable Output<String> version;

    public Output<String> getVersion() {
        return this.version == null ? Output.empty() : this.version;
    }

    public UserPoolDomainState(
        @Nullable Output<String> awsAccountId,
        @Nullable Output<String> certificateArn,
        @Nullable Output<String> cloudfrontDistributionArn,
        @Nullable Output<String> domain,
        @Nullable Output<String> s3Bucket,
        @Nullable Output<String> userPoolId,
        @Nullable Output<String> version) {
        this.awsAccountId = awsAccountId;
        this.certificateArn = certificateArn;
        this.cloudfrontDistributionArn = cloudfrontDistributionArn;
        this.domain = domain;
        this.s3Bucket = s3Bucket;
        this.userPoolId = userPoolId;
        this.version = version;
    }

    private UserPoolDomainState() {
        this.awsAccountId = Output.empty();
        this.certificateArn = Output.empty();
        this.cloudfrontDistributionArn = Output.empty();
        this.domain = Output.empty();
        this.s3Bucket = Output.empty();
        this.userPoolId = Output.empty();
        this.version = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(UserPoolDomainState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<String> awsAccountId;
        private @Nullable Output<String> certificateArn;
        private @Nullable Output<String> cloudfrontDistributionArn;
        private @Nullable Output<String> domain;
        private @Nullable Output<String> s3Bucket;
        private @Nullable Output<String> userPoolId;
        private @Nullable Output<String> version;

        public Builder() {
    	      // Empty
        }

        public Builder(UserPoolDomainState defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.awsAccountId = defaults.awsAccountId;
    	      this.certificateArn = defaults.certificateArn;
    	      this.cloudfrontDistributionArn = defaults.cloudfrontDistributionArn;
    	      this.domain = defaults.domain;
    	      this.s3Bucket = defaults.s3Bucket;
    	      this.userPoolId = defaults.userPoolId;
    	      this.version = defaults.version;
        }

        public Builder awsAccountId(@Nullable Output<String> awsAccountId) {
            this.awsAccountId = awsAccountId;
            return this;
        }
        public Builder awsAccountId(@Nullable String awsAccountId) {
            this.awsAccountId = Output.ofNullable(awsAccountId);
            return this;
        }
        public Builder certificateArn(@Nullable Output<String> certificateArn) {
            this.certificateArn = certificateArn;
            return this;
        }
        public Builder certificateArn(@Nullable String certificateArn) {
            this.certificateArn = Output.ofNullable(certificateArn);
            return this;
        }
        public Builder cloudfrontDistributionArn(@Nullable Output<String> cloudfrontDistributionArn) {
            this.cloudfrontDistributionArn = cloudfrontDistributionArn;
            return this;
        }
        public Builder cloudfrontDistributionArn(@Nullable String cloudfrontDistributionArn) {
            this.cloudfrontDistributionArn = Output.ofNullable(cloudfrontDistributionArn);
            return this;
        }
        public Builder domain(@Nullable Output<String> domain) {
            this.domain = domain;
            return this;
        }
        public Builder domain(@Nullable String domain) {
            this.domain = Output.ofNullable(domain);
            return this;
        }
        public Builder s3Bucket(@Nullable Output<String> s3Bucket) {
            this.s3Bucket = s3Bucket;
            return this;
        }
        public Builder s3Bucket(@Nullable String s3Bucket) {
            this.s3Bucket = Output.ofNullable(s3Bucket);
            return this;
        }
        public Builder userPoolId(@Nullable Output<String> userPoolId) {
            this.userPoolId = userPoolId;
            return this;
        }
        public Builder userPoolId(@Nullable String userPoolId) {
            this.userPoolId = Output.ofNullable(userPoolId);
            return this;
        }
        public Builder version(@Nullable Output<String> version) {
            this.version = version;
            return this;
        }
        public Builder version(@Nullable String version) {
            this.version = Output.ofNullable(version);
            return this;
        }        public UserPoolDomainState build() {
            return new UserPoolDomainState(awsAccountId, certificateArn, cloudfrontDistributionArn, domain, s3Bucket, userPoolId, version);
        }
    }
}