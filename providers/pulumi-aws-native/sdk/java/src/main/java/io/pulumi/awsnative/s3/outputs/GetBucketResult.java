// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.s3.outputs;

import io.pulumi.awsnative.s3.enums.BucketAccessControl;
import io.pulumi.awsnative.s3.outputs.BucketAccelerateConfiguration;
import io.pulumi.awsnative.s3.outputs.BucketAnalyticsConfiguration;
import io.pulumi.awsnative.s3.outputs.BucketCorsConfiguration;
import io.pulumi.awsnative.s3.outputs.BucketEncryption;
import io.pulumi.awsnative.s3.outputs.BucketIntelligentTieringConfiguration;
import io.pulumi.awsnative.s3.outputs.BucketInventoryConfiguration;
import io.pulumi.awsnative.s3.outputs.BucketLifecycleConfiguration;
import io.pulumi.awsnative.s3.outputs.BucketLoggingConfiguration;
import io.pulumi.awsnative.s3.outputs.BucketMetricsConfiguration;
import io.pulumi.awsnative.s3.outputs.BucketNotificationConfiguration;
import io.pulumi.awsnative.s3.outputs.BucketObjectLockConfiguration;
import io.pulumi.awsnative.s3.outputs.BucketOwnershipControls;
import io.pulumi.awsnative.s3.outputs.BucketPublicAccessBlockConfiguration;
import io.pulumi.awsnative.s3.outputs.BucketReplicationConfiguration;
import io.pulumi.awsnative.s3.outputs.BucketTag;
import io.pulumi.awsnative.s3.outputs.BucketVersioningConfiguration;
import io.pulumi.awsnative.s3.outputs.BucketWebsiteConfiguration;
import io.pulumi.core.internal.annotations.OutputCustomType;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class GetBucketResult {
    private final @Nullable BucketAccelerateConfiguration accelerateConfiguration;
    private final @Nullable BucketAccessControl accessControl;
    private final @Nullable List<BucketAnalyticsConfiguration> analyticsConfigurations;
    private final @Nullable String arn;
    private final @Nullable BucketEncryption bucketEncryption;
    private final @Nullable BucketCorsConfiguration corsConfiguration;
    private final @Nullable String domainName;
    private final @Nullable String dualStackDomainName;
    private final @Nullable List<BucketIntelligentTieringConfiguration> intelligentTieringConfigurations;
    private final @Nullable List<BucketInventoryConfiguration> inventoryConfigurations;
    private final @Nullable BucketLifecycleConfiguration lifecycleConfiguration;
    private final @Nullable BucketLoggingConfiguration loggingConfiguration;
    private final @Nullable List<BucketMetricsConfiguration> metricsConfigurations;
    private final @Nullable BucketNotificationConfiguration notificationConfiguration;
    private final @Nullable BucketObjectLockConfiguration objectLockConfiguration;
    private final @Nullable BucketOwnershipControls ownershipControls;
    private final @Nullable BucketPublicAccessBlockConfiguration publicAccessBlockConfiguration;
    private final @Nullable String regionalDomainName;
    private final @Nullable BucketReplicationConfiguration replicationConfiguration;
    private final @Nullable List<BucketTag> tags;
    private final @Nullable BucketVersioningConfiguration versioningConfiguration;
    private final @Nullable BucketWebsiteConfiguration websiteConfiguration;
    private final @Nullable String websiteURL;

    @OutputCustomType.Constructor({"accelerateConfiguration","accessControl","analyticsConfigurations","arn","bucketEncryption","corsConfiguration","domainName","dualStackDomainName","intelligentTieringConfigurations","inventoryConfigurations","lifecycleConfiguration","loggingConfiguration","metricsConfigurations","notificationConfiguration","objectLockConfiguration","ownershipControls","publicAccessBlockConfiguration","regionalDomainName","replicationConfiguration","tags","versioningConfiguration","websiteConfiguration","websiteURL"})
    private GetBucketResult(
        @Nullable BucketAccelerateConfiguration accelerateConfiguration,
        @Nullable BucketAccessControl accessControl,
        @Nullable List<BucketAnalyticsConfiguration> analyticsConfigurations,
        @Nullable String arn,
        @Nullable BucketEncryption bucketEncryption,
        @Nullable BucketCorsConfiguration corsConfiguration,
        @Nullable String domainName,
        @Nullable String dualStackDomainName,
        @Nullable List<BucketIntelligentTieringConfiguration> intelligentTieringConfigurations,
        @Nullable List<BucketInventoryConfiguration> inventoryConfigurations,
        @Nullable BucketLifecycleConfiguration lifecycleConfiguration,
        @Nullable BucketLoggingConfiguration loggingConfiguration,
        @Nullable List<BucketMetricsConfiguration> metricsConfigurations,
        @Nullable BucketNotificationConfiguration notificationConfiguration,
        @Nullable BucketObjectLockConfiguration objectLockConfiguration,
        @Nullable BucketOwnershipControls ownershipControls,
        @Nullable BucketPublicAccessBlockConfiguration publicAccessBlockConfiguration,
        @Nullable String regionalDomainName,
        @Nullable BucketReplicationConfiguration replicationConfiguration,
        @Nullable List<BucketTag> tags,
        @Nullable BucketVersioningConfiguration versioningConfiguration,
        @Nullable BucketWebsiteConfiguration websiteConfiguration,
        @Nullable String websiteURL) {
        this.accelerateConfiguration = accelerateConfiguration;
        this.accessControl = accessControl;
        this.analyticsConfigurations = analyticsConfigurations;
        this.arn = arn;
        this.bucketEncryption = bucketEncryption;
        this.corsConfiguration = corsConfiguration;
        this.domainName = domainName;
        this.dualStackDomainName = dualStackDomainName;
        this.intelligentTieringConfigurations = intelligentTieringConfigurations;
        this.inventoryConfigurations = inventoryConfigurations;
        this.lifecycleConfiguration = lifecycleConfiguration;
        this.loggingConfiguration = loggingConfiguration;
        this.metricsConfigurations = metricsConfigurations;
        this.notificationConfiguration = notificationConfiguration;
        this.objectLockConfiguration = objectLockConfiguration;
        this.ownershipControls = ownershipControls;
        this.publicAccessBlockConfiguration = publicAccessBlockConfiguration;
        this.regionalDomainName = regionalDomainName;
        this.replicationConfiguration = replicationConfiguration;
        this.tags = tags;
        this.versioningConfiguration = versioningConfiguration;
        this.websiteConfiguration = websiteConfiguration;
        this.websiteURL = websiteURL;
    }

    public Optional<BucketAccelerateConfiguration> getAccelerateConfiguration() {
        return Optional.ofNullable(this.accelerateConfiguration);
    }
    public Optional<BucketAccessControl> getAccessControl() {
        return Optional.ofNullable(this.accessControl);
    }
    public List<BucketAnalyticsConfiguration> getAnalyticsConfigurations() {
        return this.analyticsConfigurations == null ? List.of() : this.analyticsConfigurations;
    }
    public Optional<String> getArn() {
        return Optional.ofNullable(this.arn);
    }
    public Optional<BucketEncryption> getBucketEncryption() {
        return Optional.ofNullable(this.bucketEncryption);
    }
    public Optional<BucketCorsConfiguration> getCorsConfiguration() {
        return Optional.ofNullable(this.corsConfiguration);
    }
    public Optional<String> getDomainName() {
        return Optional.ofNullable(this.domainName);
    }
    public Optional<String> getDualStackDomainName() {
        return Optional.ofNullable(this.dualStackDomainName);
    }
    public List<BucketIntelligentTieringConfiguration> getIntelligentTieringConfigurations() {
        return this.intelligentTieringConfigurations == null ? List.of() : this.intelligentTieringConfigurations;
    }
    public List<BucketInventoryConfiguration> getInventoryConfigurations() {
        return this.inventoryConfigurations == null ? List.of() : this.inventoryConfigurations;
    }
    public Optional<BucketLifecycleConfiguration> getLifecycleConfiguration() {
        return Optional.ofNullable(this.lifecycleConfiguration);
    }
    public Optional<BucketLoggingConfiguration> getLoggingConfiguration() {
        return Optional.ofNullable(this.loggingConfiguration);
    }
    public List<BucketMetricsConfiguration> getMetricsConfigurations() {
        return this.metricsConfigurations == null ? List.of() : this.metricsConfigurations;
    }
    public Optional<BucketNotificationConfiguration> getNotificationConfiguration() {
        return Optional.ofNullable(this.notificationConfiguration);
    }
    public Optional<BucketObjectLockConfiguration> getObjectLockConfiguration() {
        return Optional.ofNullable(this.objectLockConfiguration);
    }
    public Optional<BucketOwnershipControls> getOwnershipControls() {
        return Optional.ofNullable(this.ownershipControls);
    }
    public Optional<BucketPublicAccessBlockConfiguration> getPublicAccessBlockConfiguration() {
        return Optional.ofNullable(this.publicAccessBlockConfiguration);
    }
    public Optional<String> getRegionalDomainName() {
        return Optional.ofNullable(this.regionalDomainName);
    }
    public Optional<BucketReplicationConfiguration> getReplicationConfiguration() {
        return Optional.ofNullable(this.replicationConfiguration);
    }
    public List<BucketTag> getTags() {
        return this.tags == null ? List.of() : this.tags;
    }
    public Optional<BucketVersioningConfiguration> getVersioningConfiguration() {
        return Optional.ofNullable(this.versioningConfiguration);
    }
    public Optional<BucketWebsiteConfiguration> getWebsiteConfiguration() {
        return Optional.ofNullable(this.websiteConfiguration);
    }
    public Optional<String> getWebsiteURL() {
        return Optional.ofNullable(this.websiteURL);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetBucketResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable BucketAccelerateConfiguration accelerateConfiguration;
        private @Nullable BucketAccessControl accessControl;
        private @Nullable List<BucketAnalyticsConfiguration> analyticsConfigurations;
        private @Nullable String arn;
        private @Nullable BucketEncryption bucketEncryption;
        private @Nullable BucketCorsConfiguration corsConfiguration;
        private @Nullable String domainName;
        private @Nullable String dualStackDomainName;
        private @Nullable List<BucketIntelligentTieringConfiguration> intelligentTieringConfigurations;
        private @Nullable List<BucketInventoryConfiguration> inventoryConfigurations;
        private @Nullable BucketLifecycleConfiguration lifecycleConfiguration;
        private @Nullable BucketLoggingConfiguration loggingConfiguration;
        private @Nullable List<BucketMetricsConfiguration> metricsConfigurations;
        private @Nullable BucketNotificationConfiguration notificationConfiguration;
        private @Nullable BucketObjectLockConfiguration objectLockConfiguration;
        private @Nullable BucketOwnershipControls ownershipControls;
        private @Nullable BucketPublicAccessBlockConfiguration publicAccessBlockConfiguration;
        private @Nullable String regionalDomainName;
        private @Nullable BucketReplicationConfiguration replicationConfiguration;
        private @Nullable List<BucketTag> tags;
        private @Nullable BucketVersioningConfiguration versioningConfiguration;
        private @Nullable BucketWebsiteConfiguration websiteConfiguration;
        private @Nullable String websiteURL;

        public Builder() {
    	      // Empty
        }

        public Builder(GetBucketResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.accelerateConfiguration = defaults.accelerateConfiguration;
    	      this.accessControl = defaults.accessControl;
    	      this.analyticsConfigurations = defaults.analyticsConfigurations;
    	      this.arn = defaults.arn;
    	      this.bucketEncryption = defaults.bucketEncryption;
    	      this.corsConfiguration = defaults.corsConfiguration;
    	      this.domainName = defaults.domainName;
    	      this.dualStackDomainName = defaults.dualStackDomainName;
    	      this.intelligentTieringConfigurations = defaults.intelligentTieringConfigurations;
    	      this.inventoryConfigurations = defaults.inventoryConfigurations;
    	      this.lifecycleConfiguration = defaults.lifecycleConfiguration;
    	      this.loggingConfiguration = defaults.loggingConfiguration;
    	      this.metricsConfigurations = defaults.metricsConfigurations;
    	      this.notificationConfiguration = defaults.notificationConfiguration;
    	      this.objectLockConfiguration = defaults.objectLockConfiguration;
    	      this.ownershipControls = defaults.ownershipControls;
    	      this.publicAccessBlockConfiguration = defaults.publicAccessBlockConfiguration;
    	      this.regionalDomainName = defaults.regionalDomainName;
    	      this.replicationConfiguration = defaults.replicationConfiguration;
    	      this.tags = defaults.tags;
    	      this.versioningConfiguration = defaults.versioningConfiguration;
    	      this.websiteConfiguration = defaults.websiteConfiguration;
    	      this.websiteURL = defaults.websiteURL;
        }

        public Builder setAccelerateConfiguration(@Nullable BucketAccelerateConfiguration accelerateConfiguration) {
            this.accelerateConfiguration = accelerateConfiguration;
            return this;
        }

        public Builder setAccessControl(@Nullable BucketAccessControl accessControl) {
            this.accessControl = accessControl;
            return this;
        }

        public Builder setAnalyticsConfigurations(@Nullable List<BucketAnalyticsConfiguration> analyticsConfigurations) {
            this.analyticsConfigurations = analyticsConfigurations;
            return this;
        }

        public Builder setArn(@Nullable String arn) {
            this.arn = arn;
            return this;
        }

        public Builder setBucketEncryption(@Nullable BucketEncryption bucketEncryption) {
            this.bucketEncryption = bucketEncryption;
            return this;
        }

        public Builder setCorsConfiguration(@Nullable BucketCorsConfiguration corsConfiguration) {
            this.corsConfiguration = corsConfiguration;
            return this;
        }

        public Builder setDomainName(@Nullable String domainName) {
            this.domainName = domainName;
            return this;
        }

        public Builder setDualStackDomainName(@Nullable String dualStackDomainName) {
            this.dualStackDomainName = dualStackDomainName;
            return this;
        }

        public Builder setIntelligentTieringConfigurations(@Nullable List<BucketIntelligentTieringConfiguration> intelligentTieringConfigurations) {
            this.intelligentTieringConfigurations = intelligentTieringConfigurations;
            return this;
        }

        public Builder setInventoryConfigurations(@Nullable List<BucketInventoryConfiguration> inventoryConfigurations) {
            this.inventoryConfigurations = inventoryConfigurations;
            return this;
        }

        public Builder setLifecycleConfiguration(@Nullable BucketLifecycleConfiguration lifecycleConfiguration) {
            this.lifecycleConfiguration = lifecycleConfiguration;
            return this;
        }

        public Builder setLoggingConfiguration(@Nullable BucketLoggingConfiguration loggingConfiguration) {
            this.loggingConfiguration = loggingConfiguration;
            return this;
        }

        public Builder setMetricsConfigurations(@Nullable List<BucketMetricsConfiguration> metricsConfigurations) {
            this.metricsConfigurations = metricsConfigurations;
            return this;
        }

        public Builder setNotificationConfiguration(@Nullable BucketNotificationConfiguration notificationConfiguration) {
            this.notificationConfiguration = notificationConfiguration;
            return this;
        }

        public Builder setObjectLockConfiguration(@Nullable BucketObjectLockConfiguration objectLockConfiguration) {
            this.objectLockConfiguration = objectLockConfiguration;
            return this;
        }

        public Builder setOwnershipControls(@Nullable BucketOwnershipControls ownershipControls) {
            this.ownershipControls = ownershipControls;
            return this;
        }

        public Builder setPublicAccessBlockConfiguration(@Nullable BucketPublicAccessBlockConfiguration publicAccessBlockConfiguration) {
            this.publicAccessBlockConfiguration = publicAccessBlockConfiguration;
            return this;
        }

        public Builder setRegionalDomainName(@Nullable String regionalDomainName) {
            this.regionalDomainName = regionalDomainName;
            return this;
        }

        public Builder setReplicationConfiguration(@Nullable BucketReplicationConfiguration replicationConfiguration) {
            this.replicationConfiguration = replicationConfiguration;
            return this;
        }

        public Builder setTags(@Nullable List<BucketTag> tags) {
            this.tags = tags;
            return this;
        }

        public Builder setVersioningConfiguration(@Nullable BucketVersioningConfiguration versioningConfiguration) {
            this.versioningConfiguration = versioningConfiguration;
            return this;
        }

        public Builder setWebsiteConfiguration(@Nullable BucketWebsiteConfiguration websiteConfiguration) {
            this.websiteConfiguration = websiteConfiguration;
            return this;
        }

        public Builder setWebsiteURL(@Nullable String websiteURL) {
            this.websiteURL = websiteURL;
            return this;
        }

        public GetBucketResult build() {
            return new GetBucketResult(accelerateConfiguration, accessControl, analyticsConfigurations, arn, bucketEncryption, corsConfiguration, domainName, dualStackDomainName, intelligentTieringConfigurations, inventoryConfigurations, lifecycleConfiguration, loggingConfiguration, metricsConfigurations, notificationConfiguration, objectLockConfiguration, ownershipControls, publicAccessBlockConfiguration, regionalDomainName, replicationConfiguration, tags, versioningConfiguration, websiteConfiguration, websiteURL);
        }
    }
}