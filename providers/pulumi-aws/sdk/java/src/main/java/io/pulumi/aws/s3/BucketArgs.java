// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.s3;

import io.pulumi.aws.s3.enums.CannedAcl;
import io.pulumi.aws.s3.inputs.BucketCorsRuleArgs;
import io.pulumi.aws.s3.inputs.BucketGrantArgs;
import io.pulumi.aws.s3.inputs.BucketLifecycleRuleArgs;
import io.pulumi.aws.s3.inputs.BucketLoggingArgs;
import io.pulumi.aws.s3.inputs.BucketObjectLockConfigurationArgs;
import io.pulumi.aws.s3.inputs.BucketReplicationConfigurationArgs;
import io.pulumi.aws.s3.inputs.BucketServerSideEncryptionConfigurationArgs;
import io.pulumi.aws.s3.inputs.BucketVersioningArgs;
import io.pulumi.aws.s3.inputs.BucketWebsiteArgs;
import io.pulumi.core.Either;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import javax.annotation.Nullable;


public final class BucketArgs extends io.pulumi.resources.ResourceArgs {

    public static final BucketArgs Empty = new BucketArgs();

    /**
     * Sets the accelerate configuration of an existing bucket. Can be `Enabled` or `Suspended`.
     * 
     */
    @Import(name="accelerationStatus")
      private final @Nullable Output<String> accelerationStatus;

    public Output<String> getAccelerationStatus() {
        return this.accelerationStatus == null ? Output.empty() : this.accelerationStatus;
    }

    /**
     * The [canned ACL](https://docs.aws.amazon.com/AmazonS3/latest/dev/acl-overview.html#canned-acl) to apply. Valid values are `private`, `public-read`, `public-read-write`, `aws-exec-read`, `authenticated-read`, and `log-delivery-write`. Defaults to `private`.  Conflicts with `grant`.
     * 
     */
    @Import(name="acl")
      private final @Nullable Output<Either<String,CannedAcl>> acl;

    public Output<Either<String,CannedAcl>> getAcl() {
        return this.acl == null ? Output.empty() : this.acl;
    }

    /**
     * The ARN of the bucket. Will be of format `arn:aws:s3:::bucketname`.
     * 
     */
    @Import(name="arn")
      private final @Nullable Output<String> arn;

    public Output<String> getArn() {
        return this.arn == null ? Output.empty() : this.arn;
    }

    /**
     * The name of the bucket. If omitted, this provider will assign a random, unique name. Must be lowercase and less than or equal to 63 characters in length. A full list of bucket naming rules [may be found here](https://docs.aws.amazon.com/AmazonS3/latest/userguide/bucketnamingrules.html).
     * 
     */
    @Import(name="bucket")
      private final @Nullable Output<String> bucket;

    public Output<String> getBucket() {
        return this.bucket == null ? Output.empty() : this.bucket;
    }

    /**
     * Creates a unique bucket name beginning with the specified prefix. Conflicts with `bucket`. Must be lowercase and less than or equal to 37 characters in length. A full list of bucket naming rules [may be found here](https://docs.aws.amazon.com/AmazonS3/latest/userguide/bucketnamingrules.html).
     * 
     */
    @Import(name="bucketPrefix")
      private final @Nullable Output<String> bucketPrefix;

    public Output<String> getBucketPrefix() {
        return this.bucketPrefix == null ? Output.empty() : this.bucketPrefix;
    }

    /**
     * A rule of [Cross-Origin Resource Sharing](https://docs.aws.amazon.com/AmazonS3/latest/dev/cors.html) (documented below).
     * 
     */
    @Import(name="corsRules")
      private final @Nullable Output<List<BucketCorsRuleArgs>> corsRules;

    public Output<List<BucketCorsRuleArgs>> getCorsRules() {
        return this.corsRules == null ? Output.empty() : this.corsRules;
    }

    /**
     * A boolean that indicates all objects (including any [locked objects](https://docs.aws.amazon.com/AmazonS3/latest/dev/object-lock-overview.html)) should be deleted from the bucket so that the bucket can be destroyed without error. These objects are *not* recoverable.
     * 
     */
    @Import(name="forceDestroy")
      private final @Nullable Output<Boolean> forceDestroy;

    public Output<Boolean> getForceDestroy() {
        return this.forceDestroy == null ? Output.empty() : this.forceDestroy;
    }

    /**
     * An [ACL policy grant](https://docs.aws.amazon.com/AmazonS3/latest/dev/acl-overview.html#sample-acl) (documented below). Conflicts with `acl`.
     * 
     */
    @Import(name="grants")
      private final @Nullable Output<List<BucketGrantArgs>> grants;

    public Output<List<BucketGrantArgs>> getGrants() {
        return this.grants == null ? Output.empty() : this.grants;
    }

    /**
     * The [Route 53 Hosted Zone ID](https://docs.aws.amazon.com/general/latest/gr/rande.html#s3_website_region_endpoints) for this bucket's region.
     * 
     */
    @Import(name="hostedZoneId")
      private final @Nullable Output<String> hostedZoneId;

    public Output<String> getHostedZoneId() {
        return this.hostedZoneId == null ? Output.empty() : this.hostedZoneId;
    }

    /**
     * A configuration of [object lifecycle management](http://docs.aws.amazon.com/AmazonS3/latest/dev/object-lifecycle-mgmt.html) (documented below).
     * 
     */
    @Import(name="lifecycleRules")
      private final @Nullable Output<List<BucketLifecycleRuleArgs>> lifecycleRules;

    public Output<List<BucketLifecycleRuleArgs>> getLifecycleRules() {
        return this.lifecycleRules == null ? Output.empty() : this.lifecycleRules;
    }

    /**
     * A settings of [bucket logging](https://docs.aws.amazon.com/AmazonS3/latest/UG/ManagingBucketLogging.html) (documented below).
     * 
     */
    @Import(name="loggings")
      private final @Nullable Output<List<BucketLoggingArgs>> loggings;

    public Output<List<BucketLoggingArgs>> getLoggings() {
        return this.loggings == null ? Output.empty() : this.loggings;
    }

    /**
     * A configuration of [S3 object locking](https://docs.aws.amazon.com/AmazonS3/latest/dev/object-lock.html) (documented below)
     * 
     */
    @Import(name="objectLockConfiguration")
      private final @Nullable Output<BucketObjectLockConfigurationArgs> objectLockConfiguration;

    public Output<BucketObjectLockConfigurationArgs> getObjectLockConfiguration() {
        return this.objectLockConfiguration == null ? Output.empty() : this.objectLockConfiguration;
    }

    /**
     * A valid [bucket policy](https://docs.aws.amazon.com/AmazonS3/latest/dev/example-bucket-policies.html) JSON document. Note that if the policy document is not specific enough (but still valid), the provider may view the policy as constantly changing in a `pulumi up / preview / update`. In this case, please make sure you use the verbose/specific version of the policy.
     * 
     */
    @Import(name="policy")
      private final @Nullable Output<String> policy;

    public Output<String> getPolicy() {
        return this.policy == null ? Output.empty() : this.policy;
    }

    /**
     * A configuration of [replication configuration](http://docs.aws.amazon.com/AmazonS3/latest/dev/crr.html) (documented below).
     * 
     */
    @Import(name="replicationConfiguration")
      private final @Nullable Output<BucketReplicationConfigurationArgs> replicationConfiguration;

    public Output<BucketReplicationConfigurationArgs> getReplicationConfiguration() {
        return this.replicationConfiguration == null ? Output.empty() : this.replicationConfiguration;
    }

    /**
     * Specifies who should bear the cost of Amazon S3 data transfer.
     * Can be either `BucketOwner` or `Requester`. By default, the owner of the S3 bucket would incur
     * the costs of any data transfer. See [Requester Pays Buckets](http://docs.aws.amazon.com/AmazonS3/latest/dev/RequesterPaysBuckets.html)
     * developer guide for more information.
     * 
     */
    @Import(name="requestPayer")
      private final @Nullable Output<String> requestPayer;

    public Output<String> getRequestPayer() {
        return this.requestPayer == null ? Output.empty() : this.requestPayer;
    }

    /**
     * A configuration of [server-side encryption configuration](http://docs.aws.amazon.com/AmazonS3/latest/dev/bucket-encryption.html) (documented below)
     * 
     */
    @Import(name="serverSideEncryptionConfiguration")
      private final @Nullable Output<BucketServerSideEncryptionConfigurationArgs> serverSideEncryptionConfiguration;

    public Output<BucketServerSideEncryptionConfigurationArgs> getServerSideEncryptionConfiguration() {
        return this.serverSideEncryptionConfiguration == null ? Output.empty() : this.serverSideEncryptionConfiguration;
    }

    /**
     * A mapping of tags to assign to the bucket.
     * 
     */
    @Import(name="tags")
      private final @Nullable Output<Map<String,String>> tags;

    public Output<Map<String,String>> getTags() {
        return this.tags == null ? Output.empty() : this.tags;
    }

    /**
     * A state of [versioning](https://docs.aws.amazon.com/AmazonS3/latest/dev/Versioning.html) (documented below)
     * 
     */
    @Import(name="versioning")
      private final @Nullable Output<BucketVersioningArgs> versioning;

    public Output<BucketVersioningArgs> getVersioning() {
        return this.versioning == null ? Output.empty() : this.versioning;
    }

    /**
     * A website object (documented below).
     * 
     */
    @Import(name="website")
      private final @Nullable Output<BucketWebsiteArgs> website;

    public Output<BucketWebsiteArgs> getWebsite() {
        return this.website == null ? Output.empty() : this.website;
    }

    /**
     * The domain of the website endpoint, if the bucket is configured with a website. If not, this will be an empty string. This is used to create Route 53 alias records.
     * 
     */
    @Import(name="websiteDomain")
      private final @Nullable Output<String> websiteDomain;

    public Output<String> getWebsiteDomain() {
        return this.websiteDomain == null ? Output.empty() : this.websiteDomain;
    }

    /**
     * The website endpoint, if the bucket is configured with a website. If not, this will be an empty string.
     * 
     */
    @Import(name="websiteEndpoint")
      private final @Nullable Output<String> websiteEndpoint;

    public Output<String> getWebsiteEndpoint() {
        return this.websiteEndpoint == null ? Output.empty() : this.websiteEndpoint;
    }

    public BucketArgs(
        @Nullable Output<String> accelerationStatus,
        @Nullable Output<Either<String,CannedAcl>> acl,
        @Nullable Output<String> arn,
        @Nullable Output<String> bucket,
        @Nullable Output<String> bucketPrefix,
        @Nullable Output<List<BucketCorsRuleArgs>> corsRules,
        @Nullable Output<Boolean> forceDestroy,
        @Nullable Output<List<BucketGrantArgs>> grants,
        @Nullable Output<String> hostedZoneId,
        @Nullable Output<List<BucketLifecycleRuleArgs>> lifecycleRules,
        @Nullable Output<List<BucketLoggingArgs>> loggings,
        @Nullable Output<BucketObjectLockConfigurationArgs> objectLockConfiguration,
        @Nullable Output<String> policy,
        @Nullable Output<BucketReplicationConfigurationArgs> replicationConfiguration,
        @Nullable Output<String> requestPayer,
        @Nullable Output<BucketServerSideEncryptionConfigurationArgs> serverSideEncryptionConfiguration,
        @Nullable Output<Map<String,String>> tags,
        @Nullable Output<BucketVersioningArgs> versioning,
        @Nullable Output<BucketWebsiteArgs> website,
        @Nullable Output<String> websiteDomain,
        @Nullable Output<String> websiteEndpoint) {
        this.accelerationStatus = accelerationStatus;
        this.acl = acl;
        this.arn = arn;
        this.bucket = bucket;
        this.bucketPrefix = bucketPrefix;
        this.corsRules = corsRules;
        this.forceDestroy = forceDestroy;
        this.grants = grants;
        this.hostedZoneId = hostedZoneId;
        this.lifecycleRules = lifecycleRules;
        this.loggings = loggings;
        this.objectLockConfiguration = objectLockConfiguration;
        this.policy = policy;
        this.replicationConfiguration = replicationConfiguration;
        this.requestPayer = requestPayer;
        this.serverSideEncryptionConfiguration = serverSideEncryptionConfiguration;
        this.tags = tags;
        this.versioning = versioning;
        this.website = website;
        this.websiteDomain = websiteDomain;
        this.websiteEndpoint = websiteEndpoint;
    }

    private BucketArgs() {
        this.accelerationStatus = Output.empty();
        this.acl = Output.empty();
        this.arn = Output.empty();
        this.bucket = Output.empty();
        this.bucketPrefix = Output.empty();
        this.corsRules = Output.empty();
        this.forceDestroy = Output.empty();
        this.grants = Output.empty();
        this.hostedZoneId = Output.empty();
        this.lifecycleRules = Output.empty();
        this.loggings = Output.empty();
        this.objectLockConfiguration = Output.empty();
        this.policy = Output.empty();
        this.replicationConfiguration = Output.empty();
        this.requestPayer = Output.empty();
        this.serverSideEncryptionConfiguration = Output.empty();
        this.tags = Output.empty();
        this.versioning = Output.empty();
        this.website = Output.empty();
        this.websiteDomain = Output.empty();
        this.websiteEndpoint = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(BucketArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<String> accelerationStatus;
        private @Nullable Output<Either<String,CannedAcl>> acl;
        private @Nullable Output<String> arn;
        private @Nullable Output<String> bucket;
        private @Nullable Output<String> bucketPrefix;
        private @Nullable Output<List<BucketCorsRuleArgs>> corsRules;
        private @Nullable Output<Boolean> forceDestroy;
        private @Nullable Output<List<BucketGrantArgs>> grants;
        private @Nullable Output<String> hostedZoneId;
        private @Nullable Output<List<BucketLifecycleRuleArgs>> lifecycleRules;
        private @Nullable Output<List<BucketLoggingArgs>> loggings;
        private @Nullable Output<BucketObjectLockConfigurationArgs> objectLockConfiguration;
        private @Nullable Output<String> policy;
        private @Nullable Output<BucketReplicationConfigurationArgs> replicationConfiguration;
        private @Nullable Output<String> requestPayer;
        private @Nullable Output<BucketServerSideEncryptionConfigurationArgs> serverSideEncryptionConfiguration;
        private @Nullable Output<Map<String,String>> tags;
        private @Nullable Output<BucketVersioningArgs> versioning;
        private @Nullable Output<BucketWebsiteArgs> website;
        private @Nullable Output<String> websiteDomain;
        private @Nullable Output<String> websiteEndpoint;

        public Builder() {
    	      // Empty
        }

        public Builder(BucketArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.accelerationStatus = defaults.accelerationStatus;
    	      this.acl = defaults.acl;
    	      this.arn = defaults.arn;
    	      this.bucket = defaults.bucket;
    	      this.bucketPrefix = defaults.bucketPrefix;
    	      this.corsRules = defaults.corsRules;
    	      this.forceDestroy = defaults.forceDestroy;
    	      this.grants = defaults.grants;
    	      this.hostedZoneId = defaults.hostedZoneId;
    	      this.lifecycleRules = defaults.lifecycleRules;
    	      this.loggings = defaults.loggings;
    	      this.objectLockConfiguration = defaults.objectLockConfiguration;
    	      this.policy = defaults.policy;
    	      this.replicationConfiguration = defaults.replicationConfiguration;
    	      this.requestPayer = defaults.requestPayer;
    	      this.serverSideEncryptionConfiguration = defaults.serverSideEncryptionConfiguration;
    	      this.tags = defaults.tags;
    	      this.versioning = defaults.versioning;
    	      this.website = defaults.website;
    	      this.websiteDomain = defaults.websiteDomain;
    	      this.websiteEndpoint = defaults.websiteEndpoint;
        }

        public Builder accelerationStatus(@Nullable Output<String> accelerationStatus) {
            this.accelerationStatus = accelerationStatus;
            return this;
        }
        public Builder accelerationStatus(@Nullable String accelerationStatus) {
            this.accelerationStatus = Output.ofNullable(accelerationStatus);
            return this;
        }
        public Builder acl(@Nullable Output<Either<String,CannedAcl>> acl) {
            this.acl = acl;
            return this;
        }
        public Builder acl(@Nullable Either<String,CannedAcl> acl) {
            this.acl = Output.ofNullable(acl);
            return this;
        }
        public Builder arn(@Nullable Output<String> arn) {
            this.arn = arn;
            return this;
        }
        public Builder arn(@Nullable String arn) {
            this.arn = Output.ofNullable(arn);
            return this;
        }
        public Builder bucket(@Nullable Output<String> bucket) {
            this.bucket = bucket;
            return this;
        }
        public Builder bucket(@Nullable String bucket) {
            this.bucket = Output.ofNullable(bucket);
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
        public Builder corsRules(@Nullable Output<List<BucketCorsRuleArgs>> corsRules) {
            this.corsRules = corsRules;
            return this;
        }
        public Builder corsRules(@Nullable List<BucketCorsRuleArgs> corsRules) {
            this.corsRules = Output.ofNullable(corsRules);
            return this;
        }
        public Builder corsRules(BucketCorsRuleArgs... corsRules) {
            return corsRules(List.of(corsRules));
        }
        public Builder forceDestroy(@Nullable Output<Boolean> forceDestroy) {
            this.forceDestroy = forceDestroy;
            return this;
        }
        public Builder forceDestroy(@Nullable Boolean forceDestroy) {
            this.forceDestroy = Output.ofNullable(forceDestroy);
            return this;
        }
        public Builder grants(@Nullable Output<List<BucketGrantArgs>> grants) {
            this.grants = grants;
            return this;
        }
        public Builder grants(@Nullable List<BucketGrantArgs> grants) {
            this.grants = Output.ofNullable(grants);
            return this;
        }
        public Builder grants(BucketGrantArgs... grants) {
            return grants(List.of(grants));
        }
        public Builder hostedZoneId(@Nullable Output<String> hostedZoneId) {
            this.hostedZoneId = hostedZoneId;
            return this;
        }
        public Builder hostedZoneId(@Nullable String hostedZoneId) {
            this.hostedZoneId = Output.ofNullable(hostedZoneId);
            return this;
        }
        public Builder lifecycleRules(@Nullable Output<List<BucketLifecycleRuleArgs>> lifecycleRules) {
            this.lifecycleRules = lifecycleRules;
            return this;
        }
        public Builder lifecycleRules(@Nullable List<BucketLifecycleRuleArgs> lifecycleRules) {
            this.lifecycleRules = Output.ofNullable(lifecycleRules);
            return this;
        }
        public Builder lifecycleRules(BucketLifecycleRuleArgs... lifecycleRules) {
            return lifecycleRules(List.of(lifecycleRules));
        }
        public Builder loggings(@Nullable Output<List<BucketLoggingArgs>> loggings) {
            this.loggings = loggings;
            return this;
        }
        public Builder loggings(@Nullable List<BucketLoggingArgs> loggings) {
            this.loggings = Output.ofNullable(loggings);
            return this;
        }
        public Builder loggings(BucketLoggingArgs... loggings) {
            return loggings(List.of(loggings));
        }
        public Builder objectLockConfiguration(@Nullable Output<BucketObjectLockConfigurationArgs> objectLockConfiguration) {
            this.objectLockConfiguration = objectLockConfiguration;
            return this;
        }
        public Builder objectLockConfiguration(@Nullable BucketObjectLockConfigurationArgs objectLockConfiguration) {
            this.objectLockConfiguration = Output.ofNullable(objectLockConfiguration);
            return this;
        }
        public Builder policy(@Nullable Output<String> policy) {
            this.policy = policy;
            return this;
        }
        public Builder replicationConfiguration(@Nullable Output<BucketReplicationConfigurationArgs> replicationConfiguration) {
            this.replicationConfiguration = replicationConfiguration;
            return this;
        }
        public Builder replicationConfiguration(@Nullable BucketReplicationConfigurationArgs replicationConfiguration) {
            this.replicationConfiguration = Output.ofNullable(replicationConfiguration);
            return this;
        }
        public Builder requestPayer(@Nullable Output<String> requestPayer) {
            this.requestPayer = requestPayer;
            return this;
        }
        public Builder requestPayer(@Nullable String requestPayer) {
            this.requestPayer = Output.ofNullable(requestPayer);
            return this;
        }
        public Builder serverSideEncryptionConfiguration(@Nullable Output<BucketServerSideEncryptionConfigurationArgs> serverSideEncryptionConfiguration) {
            this.serverSideEncryptionConfiguration = serverSideEncryptionConfiguration;
            return this;
        }
        public Builder serverSideEncryptionConfiguration(@Nullable BucketServerSideEncryptionConfigurationArgs serverSideEncryptionConfiguration) {
            this.serverSideEncryptionConfiguration = Output.ofNullable(serverSideEncryptionConfiguration);
            return this;
        }
        public Builder tags(@Nullable Output<Map<String,String>> tags) {
            this.tags = tags;
            return this;
        }
        public Builder tags(@Nullable Map<String,String> tags) {
            this.tags = Output.ofNullable(tags);
            return this;
        }
        public Builder versioning(@Nullable Output<BucketVersioningArgs> versioning) {
            this.versioning = versioning;
            return this;
        }
        public Builder versioning(@Nullable BucketVersioningArgs versioning) {
            this.versioning = Output.ofNullable(versioning);
            return this;
        }
        public Builder website(@Nullable Output<BucketWebsiteArgs> website) {
            this.website = website;
            return this;
        }
        public Builder website(@Nullable BucketWebsiteArgs website) {
            this.website = Output.ofNullable(website);
            return this;
        }
        public Builder websiteDomain(@Nullable Output<String> websiteDomain) {
            this.websiteDomain = websiteDomain;
            return this;
        }
        public Builder websiteDomain(@Nullable String websiteDomain) {
            this.websiteDomain = Output.ofNullable(websiteDomain);
            return this;
        }
        public Builder websiteEndpoint(@Nullable Output<String> websiteEndpoint) {
            this.websiteEndpoint = websiteEndpoint;
            return this;
        }
        public Builder websiteEndpoint(@Nullable String websiteEndpoint) {
            this.websiteEndpoint = Output.ofNullable(websiteEndpoint);
            return this;
        }        public BucketArgs build() {
            return new BucketArgs(accelerationStatus, acl, arn, bucket, bucketPrefix, corsRules, forceDestroy, grants, hostedZoneId, lifecycleRules, loggings, objectLockConfiguration, policy, replicationConfiguration, requestPayer, serverSideEncryptionConfiguration, tags, versioning, website, websiteDomain, websiteEndpoint);
        }
    }
}
