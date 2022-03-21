// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.sagemaker.inputs;

import io.pulumi.aws.sagemaker.inputs.DomainDefaultUserSettingsGetArgs;
import io.pulumi.aws.sagemaker.inputs.DomainRetentionPolicyGetArgs;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import javax.annotation.Nullable;


public final class DomainState extends io.pulumi.resources.ResourceArgs {

    public static final DomainState Empty = new DomainState();

    /**
     * Specifies the VPC used for non-EFS traffic. The default value is `PublicInternetOnly`. Valid values are `PublicInternetOnly` and `VpcOnly`.
     * 
     */
    @Import(name="appNetworkAccessType")
      private final @Nullable Output<String> appNetworkAccessType;

    public Output<String> getAppNetworkAccessType() {
        return this.appNetworkAccessType == null ? Output.empty() : this.appNetworkAccessType;
    }

    /**
     * The Amazon Resource Name (ARN) assigned by AWS to this Domain.
     * 
     */
    @Import(name="arn")
      private final @Nullable Output<String> arn;

    public Output<String> getArn() {
        return this.arn == null ? Output.empty() : this.arn;
    }

    /**
     * The mode of authentication that members use to access the domain. Valid values are `IAM` and `SSO`.
     * 
     */
    @Import(name="authMode")
      private final @Nullable Output<String> authMode;

    public Output<String> getAuthMode() {
        return this.authMode == null ? Output.empty() : this.authMode;
    }

    /**
     * The default user settings. See Default User Settings below.
     * 
     */
    @Import(name="defaultUserSettings")
      private final @Nullable Output<DomainDefaultUserSettingsGetArgs> defaultUserSettings;

    public Output<DomainDefaultUserSettingsGetArgs> getDefaultUserSettings() {
        return this.defaultUserSettings == null ? Output.empty() : this.defaultUserSettings;
    }

    /**
     * The domain name.
     * 
     */
    @Import(name="domainName")
      private final @Nullable Output<String> domainName;

    public Output<String> getDomainName() {
        return this.domainName == null ? Output.empty() : this.domainName;
    }

    /**
     * The ID of the Amazon Elastic File System (EFS) managed by this Domain.
     * 
     */
    @Import(name="homeEfsFileSystemId")
      private final @Nullable Output<String> homeEfsFileSystemId;

    public Output<String> getHomeEfsFileSystemId() {
        return this.homeEfsFileSystemId == null ? Output.empty() : this.homeEfsFileSystemId;
    }

    /**
     * The AWS KMS customer managed CMK used to encrypt the EFS volume attached to the domain.
     * 
     */
    @Import(name="kmsKeyId")
      private final @Nullable Output<String> kmsKeyId;

    public Output<String> getKmsKeyId() {
        return this.kmsKeyId == null ? Output.empty() : this.kmsKeyId;
    }

    /**
     * The retention policy for this domain, which specifies whether resources will be retained after the Domain is deleted. By default, all resources are retained. See Retention Policy below.
     * 
     */
    @Import(name="retentionPolicy")
      private final @Nullable Output<DomainRetentionPolicyGetArgs> retentionPolicy;

    public Output<DomainRetentionPolicyGetArgs> getRetentionPolicy() {
        return this.retentionPolicy == null ? Output.empty() : this.retentionPolicy;
    }

    /**
     * The SSO managed application instance ID.
     * 
     */
    @Import(name="singleSignOnManagedApplicationInstanceId")
      private final @Nullable Output<String> singleSignOnManagedApplicationInstanceId;

    public Output<String> getSingleSignOnManagedApplicationInstanceId() {
        return this.singleSignOnManagedApplicationInstanceId == null ? Output.empty() : this.singleSignOnManagedApplicationInstanceId;
    }

    /**
     * The VPC subnets that Studio uses for communication.
     * 
     */
    @Import(name="subnetIds")
      private final @Nullable Output<List<String>> subnetIds;

    public Output<List<String>> getSubnetIds() {
        return this.subnetIds == null ? Output.empty() : this.subnetIds;
    }

    /**
     * A map of tags to assign to the resource. .If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
     * 
     */
    @Import(name="tags")
      private final @Nullable Output<Map<String,String>> tags;

    public Output<Map<String,String>> getTags() {
        return this.tags == null ? Output.empty() : this.tags;
    }

    /**
     * A map of tags assigned to the resource, including those inherited from the provider .
     * 
     */
    @Import(name="tagsAll")
      private final @Nullable Output<Map<String,String>> tagsAll;

    public Output<Map<String,String>> getTagsAll() {
        return this.tagsAll == null ? Output.empty() : this.tagsAll;
    }

    /**
     * The domain's URL.
     * 
     */
    @Import(name="url")
      private final @Nullable Output<String> url;

    public Output<String> getUrl() {
        return this.url == null ? Output.empty() : this.url;
    }

    /**
     * The ID of the Amazon Virtual Private Cloud (VPC) that Studio uses for communication.
     * 
     */
    @Import(name="vpcId")
      private final @Nullable Output<String> vpcId;

    public Output<String> getVpcId() {
        return this.vpcId == null ? Output.empty() : this.vpcId;
    }

    public DomainState(
        @Nullable Output<String> appNetworkAccessType,
        @Nullable Output<String> arn,
        @Nullable Output<String> authMode,
        @Nullable Output<DomainDefaultUserSettingsGetArgs> defaultUserSettings,
        @Nullable Output<String> domainName,
        @Nullable Output<String> homeEfsFileSystemId,
        @Nullable Output<String> kmsKeyId,
        @Nullable Output<DomainRetentionPolicyGetArgs> retentionPolicy,
        @Nullable Output<String> singleSignOnManagedApplicationInstanceId,
        @Nullable Output<List<String>> subnetIds,
        @Nullable Output<Map<String,String>> tags,
        @Nullable Output<Map<String,String>> tagsAll,
        @Nullable Output<String> url,
        @Nullable Output<String> vpcId) {
        this.appNetworkAccessType = appNetworkAccessType;
        this.arn = arn;
        this.authMode = authMode;
        this.defaultUserSettings = defaultUserSettings;
        this.domainName = domainName;
        this.homeEfsFileSystemId = homeEfsFileSystemId;
        this.kmsKeyId = kmsKeyId;
        this.retentionPolicy = retentionPolicy;
        this.singleSignOnManagedApplicationInstanceId = singleSignOnManagedApplicationInstanceId;
        this.subnetIds = subnetIds;
        this.tags = tags;
        this.tagsAll = tagsAll;
        this.url = url;
        this.vpcId = vpcId;
    }

    private DomainState() {
        this.appNetworkAccessType = Output.empty();
        this.arn = Output.empty();
        this.authMode = Output.empty();
        this.defaultUserSettings = Output.empty();
        this.domainName = Output.empty();
        this.homeEfsFileSystemId = Output.empty();
        this.kmsKeyId = Output.empty();
        this.retentionPolicy = Output.empty();
        this.singleSignOnManagedApplicationInstanceId = Output.empty();
        this.subnetIds = Output.empty();
        this.tags = Output.empty();
        this.tagsAll = Output.empty();
        this.url = Output.empty();
        this.vpcId = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(DomainState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<String> appNetworkAccessType;
        private @Nullable Output<String> arn;
        private @Nullable Output<String> authMode;
        private @Nullable Output<DomainDefaultUserSettingsGetArgs> defaultUserSettings;
        private @Nullable Output<String> domainName;
        private @Nullable Output<String> homeEfsFileSystemId;
        private @Nullable Output<String> kmsKeyId;
        private @Nullable Output<DomainRetentionPolicyGetArgs> retentionPolicy;
        private @Nullable Output<String> singleSignOnManagedApplicationInstanceId;
        private @Nullable Output<List<String>> subnetIds;
        private @Nullable Output<Map<String,String>> tags;
        private @Nullable Output<Map<String,String>> tagsAll;
        private @Nullable Output<String> url;
        private @Nullable Output<String> vpcId;

        public Builder() {
    	      // Empty
        }

        public Builder(DomainState defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.appNetworkAccessType = defaults.appNetworkAccessType;
    	      this.arn = defaults.arn;
    	      this.authMode = defaults.authMode;
    	      this.defaultUserSettings = defaults.defaultUserSettings;
    	      this.domainName = defaults.domainName;
    	      this.homeEfsFileSystemId = defaults.homeEfsFileSystemId;
    	      this.kmsKeyId = defaults.kmsKeyId;
    	      this.retentionPolicy = defaults.retentionPolicy;
    	      this.singleSignOnManagedApplicationInstanceId = defaults.singleSignOnManagedApplicationInstanceId;
    	      this.subnetIds = defaults.subnetIds;
    	      this.tags = defaults.tags;
    	      this.tagsAll = defaults.tagsAll;
    	      this.url = defaults.url;
    	      this.vpcId = defaults.vpcId;
        }

        public Builder appNetworkAccessType(@Nullable Output<String> appNetworkAccessType) {
            this.appNetworkAccessType = appNetworkAccessType;
            return this;
        }
        public Builder appNetworkAccessType(@Nullable String appNetworkAccessType) {
            this.appNetworkAccessType = Output.ofNullable(appNetworkAccessType);
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
        public Builder authMode(@Nullable Output<String> authMode) {
            this.authMode = authMode;
            return this;
        }
        public Builder authMode(@Nullable String authMode) {
            this.authMode = Output.ofNullable(authMode);
            return this;
        }
        public Builder defaultUserSettings(@Nullable Output<DomainDefaultUserSettingsGetArgs> defaultUserSettings) {
            this.defaultUserSettings = defaultUserSettings;
            return this;
        }
        public Builder defaultUserSettings(@Nullable DomainDefaultUserSettingsGetArgs defaultUserSettings) {
            this.defaultUserSettings = Output.ofNullable(defaultUserSettings);
            return this;
        }
        public Builder domainName(@Nullable Output<String> domainName) {
            this.domainName = domainName;
            return this;
        }
        public Builder domainName(@Nullable String domainName) {
            this.domainName = Output.ofNullable(domainName);
            return this;
        }
        public Builder homeEfsFileSystemId(@Nullable Output<String> homeEfsFileSystemId) {
            this.homeEfsFileSystemId = homeEfsFileSystemId;
            return this;
        }
        public Builder homeEfsFileSystemId(@Nullable String homeEfsFileSystemId) {
            this.homeEfsFileSystemId = Output.ofNullable(homeEfsFileSystemId);
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
        public Builder retentionPolicy(@Nullable Output<DomainRetentionPolicyGetArgs> retentionPolicy) {
            this.retentionPolicy = retentionPolicy;
            return this;
        }
        public Builder retentionPolicy(@Nullable DomainRetentionPolicyGetArgs retentionPolicy) {
            this.retentionPolicy = Output.ofNullable(retentionPolicy);
            return this;
        }
        public Builder singleSignOnManagedApplicationInstanceId(@Nullable Output<String> singleSignOnManagedApplicationInstanceId) {
            this.singleSignOnManagedApplicationInstanceId = singleSignOnManagedApplicationInstanceId;
            return this;
        }
        public Builder singleSignOnManagedApplicationInstanceId(@Nullable String singleSignOnManagedApplicationInstanceId) {
            this.singleSignOnManagedApplicationInstanceId = Output.ofNullable(singleSignOnManagedApplicationInstanceId);
            return this;
        }
        public Builder subnetIds(@Nullable Output<List<String>> subnetIds) {
            this.subnetIds = subnetIds;
            return this;
        }
        public Builder subnetIds(@Nullable List<String> subnetIds) {
            this.subnetIds = Output.ofNullable(subnetIds);
            return this;
        }
        public Builder subnetIds(String... subnetIds) {
            return subnetIds(List.of(subnetIds));
        }
        public Builder tags(@Nullable Output<Map<String,String>> tags) {
            this.tags = tags;
            return this;
        }
        public Builder tags(@Nullable Map<String,String> tags) {
            this.tags = Output.ofNullable(tags);
            return this;
        }
        public Builder tagsAll(@Nullable Output<Map<String,String>> tagsAll) {
            this.tagsAll = tagsAll;
            return this;
        }
        public Builder tagsAll(@Nullable Map<String,String> tagsAll) {
            this.tagsAll = Output.ofNullable(tagsAll);
            return this;
        }
        public Builder url(@Nullable Output<String> url) {
            this.url = url;
            return this;
        }
        public Builder url(@Nullable String url) {
            this.url = Output.ofNullable(url);
            return this;
        }
        public Builder vpcId(@Nullable Output<String> vpcId) {
            this.vpcId = vpcId;
            return this;
        }
        public Builder vpcId(@Nullable String vpcId) {
            this.vpcId = Output.ofNullable(vpcId);
            return this;
        }        public DomainState build() {
            return new DomainState(appNetworkAccessType, arn, authMode, defaultUserSettings, domainName, homeEfsFileSystemId, kmsKeyId, retentionPolicy, singleSignOnManagedApplicationInstanceId, subnetIds, tags, tagsAll, url, vpcId);
        }
    }
}
