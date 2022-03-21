// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.cloudfront.inputs;

import io.pulumi.aws.cloudfront.inputs.DistributionOriginCustomHeaderGetArgs;
import io.pulumi.aws.cloudfront.inputs.DistributionOriginCustomOriginConfigGetArgs;
import io.pulumi.aws.cloudfront.inputs.DistributionOriginOriginShieldGetArgs;
import io.pulumi.aws.cloudfront.inputs.DistributionOriginS3OriginConfigGetArgs;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


public final class DistributionOriginGetArgs extends io.pulumi.resources.ResourceArgs {

    public static final DistributionOriginGetArgs Empty = new DistributionOriginGetArgs();

    /**
     * The number of times that CloudFront attempts to connect to the origin. Must be between 1-3. Defaults to 3.
     * 
     */
    @Import(name="connectionAttempts")
      private final @Nullable Output<Integer> connectionAttempts;

    public Output<Integer> getConnectionAttempts() {
        return this.connectionAttempts == null ? Output.empty() : this.connectionAttempts;
    }

    /**
     * The number of seconds that CloudFront waits when trying to establish a connection to the origin. Must be between 1-10. Defaults to 10.
     * 
     */
    @Import(name="connectionTimeout")
      private final @Nullable Output<Integer> connectionTimeout;

    public Output<Integer> getConnectionTimeout() {
        return this.connectionTimeout == null ? Output.empty() : this.connectionTimeout;
    }

    /**
     * One or more sub-resources with `name` and
     * `value` parameters that specify header data that will be sent to the origin
     * (multiples allowed).
     * 
     */
    @Import(name="customHeaders")
      private final @Nullable Output<List<DistributionOriginCustomHeaderGetArgs>> customHeaders;

    public Output<List<DistributionOriginCustomHeaderGetArgs>> getCustomHeaders() {
        return this.customHeaders == null ? Output.empty() : this.customHeaders;
    }

    /**
     * The CloudFront custom
     * origin configuration information. If an S3
     * origin is required, use `s3_origin_config` instead.
     * 
     */
    @Import(name="customOriginConfig")
      private final @Nullable Output<DistributionOriginCustomOriginConfigGetArgs> customOriginConfig;

    public Output<DistributionOriginCustomOriginConfigGetArgs> getCustomOriginConfig() {
        return this.customOriginConfig == null ? Output.empty() : this.customOriginConfig;
    }

    /**
     * The DNS domain name of either the S3 bucket, or
     * web site of your custom origin.
     * 
     */
    @Import(name="domainName", required=true)
      private final Output<String> domainName;

    public Output<String> getDomainName() {
        return this.domainName;
    }

    /**
     * The unique identifier of the member origin
     * 
     */
    @Import(name="originId", required=true)
      private final Output<String> originId;

    public Output<String> getOriginId() {
        return this.originId;
    }

    /**
     * An optional element that causes CloudFront to
     * request your content from a directory in your Amazon S3 bucket or your
     * custom origin.
     * 
     */
    @Import(name="originPath")
      private final @Nullable Output<String> originPath;

    public Output<String> getOriginPath() {
        return this.originPath == null ? Output.empty() : this.originPath;
    }

    /**
     * The CloudFront Origin Shield
     * configuration information. Using Origin Shield can help reduce the load on your origin. For more information, see [Using Origin Shield](https://docs.aws.amazon.com/AmazonCloudFront/latest/DeveloperGuide/origin-shield.html) in the Amazon CloudFront Developer Guide.
     * 
     */
    @Import(name="originShield")
      private final @Nullable Output<DistributionOriginOriginShieldGetArgs> originShield;

    public Output<DistributionOriginOriginShieldGetArgs> getOriginShield() {
        return this.originShield == null ? Output.empty() : this.originShield;
    }

    /**
     * The CloudFront S3 origin
     * configuration information. If a custom origin is required, use
     * `custom_origin_config` instead.
     * 
     */
    @Import(name="s3OriginConfig")
      private final @Nullable Output<DistributionOriginS3OriginConfigGetArgs> s3OriginConfig;

    public Output<DistributionOriginS3OriginConfigGetArgs> getS3OriginConfig() {
        return this.s3OriginConfig == null ? Output.empty() : this.s3OriginConfig;
    }

    public DistributionOriginGetArgs(
        @Nullable Output<Integer> connectionAttempts,
        @Nullable Output<Integer> connectionTimeout,
        @Nullable Output<List<DistributionOriginCustomHeaderGetArgs>> customHeaders,
        @Nullable Output<DistributionOriginCustomOriginConfigGetArgs> customOriginConfig,
        Output<String> domainName,
        Output<String> originId,
        @Nullable Output<String> originPath,
        @Nullable Output<DistributionOriginOriginShieldGetArgs> originShield,
        @Nullable Output<DistributionOriginS3OriginConfigGetArgs> s3OriginConfig) {
        this.connectionAttempts = connectionAttempts;
        this.connectionTimeout = connectionTimeout;
        this.customHeaders = customHeaders;
        this.customOriginConfig = customOriginConfig;
        this.domainName = Objects.requireNonNull(domainName, "expected parameter 'domainName' to be non-null");
        this.originId = Objects.requireNonNull(originId, "expected parameter 'originId' to be non-null");
        this.originPath = originPath;
        this.originShield = originShield;
        this.s3OriginConfig = s3OriginConfig;
    }

    private DistributionOriginGetArgs() {
        this.connectionAttempts = Output.empty();
        this.connectionTimeout = Output.empty();
        this.customHeaders = Output.empty();
        this.customOriginConfig = Output.empty();
        this.domainName = Output.empty();
        this.originId = Output.empty();
        this.originPath = Output.empty();
        this.originShield = Output.empty();
        this.s3OriginConfig = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(DistributionOriginGetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<Integer> connectionAttempts;
        private @Nullable Output<Integer> connectionTimeout;
        private @Nullable Output<List<DistributionOriginCustomHeaderGetArgs>> customHeaders;
        private @Nullable Output<DistributionOriginCustomOriginConfigGetArgs> customOriginConfig;
        private Output<String> domainName;
        private Output<String> originId;
        private @Nullable Output<String> originPath;
        private @Nullable Output<DistributionOriginOriginShieldGetArgs> originShield;
        private @Nullable Output<DistributionOriginS3OriginConfigGetArgs> s3OriginConfig;

        public Builder() {
    	      // Empty
        }

        public Builder(DistributionOriginGetArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.connectionAttempts = defaults.connectionAttempts;
    	      this.connectionTimeout = defaults.connectionTimeout;
    	      this.customHeaders = defaults.customHeaders;
    	      this.customOriginConfig = defaults.customOriginConfig;
    	      this.domainName = defaults.domainName;
    	      this.originId = defaults.originId;
    	      this.originPath = defaults.originPath;
    	      this.originShield = defaults.originShield;
    	      this.s3OriginConfig = defaults.s3OriginConfig;
        }

        public Builder connectionAttempts(@Nullable Output<Integer> connectionAttempts) {
            this.connectionAttempts = connectionAttempts;
            return this;
        }
        public Builder connectionAttempts(@Nullable Integer connectionAttempts) {
            this.connectionAttempts = Output.ofNullable(connectionAttempts);
            return this;
        }
        public Builder connectionTimeout(@Nullable Output<Integer> connectionTimeout) {
            this.connectionTimeout = connectionTimeout;
            return this;
        }
        public Builder connectionTimeout(@Nullable Integer connectionTimeout) {
            this.connectionTimeout = Output.ofNullable(connectionTimeout);
            return this;
        }
        public Builder customHeaders(@Nullable Output<List<DistributionOriginCustomHeaderGetArgs>> customHeaders) {
            this.customHeaders = customHeaders;
            return this;
        }
        public Builder customHeaders(@Nullable List<DistributionOriginCustomHeaderGetArgs> customHeaders) {
            this.customHeaders = Output.ofNullable(customHeaders);
            return this;
        }
        public Builder customHeaders(DistributionOriginCustomHeaderGetArgs... customHeaders) {
            return customHeaders(List.of(customHeaders));
        }
        public Builder customOriginConfig(@Nullable Output<DistributionOriginCustomOriginConfigGetArgs> customOriginConfig) {
            this.customOriginConfig = customOriginConfig;
            return this;
        }
        public Builder customOriginConfig(@Nullable DistributionOriginCustomOriginConfigGetArgs customOriginConfig) {
            this.customOriginConfig = Output.ofNullable(customOriginConfig);
            return this;
        }
        public Builder domainName(Output<String> domainName) {
            this.domainName = Objects.requireNonNull(domainName);
            return this;
        }
        public Builder domainName(String domainName) {
            this.domainName = Output.of(Objects.requireNonNull(domainName));
            return this;
        }
        public Builder originId(Output<String> originId) {
            this.originId = Objects.requireNonNull(originId);
            return this;
        }
        public Builder originId(String originId) {
            this.originId = Output.of(Objects.requireNonNull(originId));
            return this;
        }
        public Builder originPath(@Nullable Output<String> originPath) {
            this.originPath = originPath;
            return this;
        }
        public Builder originPath(@Nullable String originPath) {
            this.originPath = Output.ofNullable(originPath);
            return this;
        }
        public Builder originShield(@Nullable Output<DistributionOriginOriginShieldGetArgs> originShield) {
            this.originShield = originShield;
            return this;
        }
        public Builder originShield(@Nullable DistributionOriginOriginShieldGetArgs originShield) {
            this.originShield = Output.ofNullable(originShield);
            return this;
        }
        public Builder s3OriginConfig(@Nullable Output<DistributionOriginS3OriginConfigGetArgs> s3OriginConfig) {
            this.s3OriginConfig = s3OriginConfig;
            return this;
        }
        public Builder s3OriginConfig(@Nullable DistributionOriginS3OriginConfigGetArgs s3OriginConfig) {
            this.s3OriginConfig = Output.ofNullable(s3OriginConfig);
            return this;
        }        public DistributionOriginGetArgs build() {
            return new DistributionOriginGetArgs(connectionAttempts, connectionTimeout, customHeaders, customOriginConfig, domainName, originId, originPath, originShield, s3OriginConfig);
        }
    }
}
