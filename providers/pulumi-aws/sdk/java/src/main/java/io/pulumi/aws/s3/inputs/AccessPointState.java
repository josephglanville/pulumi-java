// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.s3.inputs;

import io.pulumi.aws.s3.inputs.AccessPointPublicAccessBlockConfigurationGetArgs;
import io.pulumi.aws.s3.inputs.AccessPointVpcConfigurationGetArgs;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import java.lang.Boolean;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import javax.annotation.Nullable;


public final class AccessPointState extends io.pulumi.resources.ResourceArgs {

    public static final AccessPointState Empty = new AccessPointState();

    /**
     * AWS account ID for the owner of the bucket for which you want to create an access point. Defaults to automatically determined account ID of the AWS provider.
     * 
     */
    @Import(name="accountId")
      private final @Nullable Output<String> accountId;

    public Output<String> getAccountId() {
        return this.accountId == null ? Codegen.empty() : this.accountId;
    }

    /**
     * The alias of the S3 Access Point.
     * 
     */
    @Import(name="alias")
      private final @Nullable Output<String> alias;

    public Output<String> getAlias() {
        return this.alias == null ? Codegen.empty() : this.alias;
    }

    /**
     * Amazon Resource Name (ARN) of the S3 Access Point.
     * 
     */
    @Import(name="arn")
      private final @Nullable Output<String> arn;

    public Output<String> getArn() {
        return this.arn == null ? Codegen.empty() : this.arn;
    }

    /**
     * Name of an AWS Partition S3 Bucket or the Amazon Resource Name (ARN) of S3 on Outposts Bucket that you want to associate this access point with.
     * 
     */
    @Import(name="bucket")
      private final @Nullable Output<String> bucket;

    public Output<String> getBucket() {
        return this.bucket == null ? Codegen.empty() : this.bucket;
    }

    /**
     * The DNS domain name of the S3 Access Point in the format _`name`_-_`account_id`_.s3-accesspoint._region_.amazonaws.com.
     * Note: S3 access points only support secure access by HTTPS. HTTP isn't supported.
     * 
     */
    @Import(name="domainName")
      private final @Nullable Output<String> domainName;

    public Output<String> getDomainName() {
        return this.domainName == null ? Codegen.empty() : this.domainName;
    }

    /**
     * The VPC endpoints for the S3 Access Point.
     * 
     */
    @Import(name="endpoints")
      private final @Nullable Output<Map<String,String>> endpoints;

    public Output<Map<String,String>> getEndpoints() {
        return this.endpoints == null ? Codegen.empty() : this.endpoints;
    }

    /**
     * Indicates whether this access point currently has a policy that allows public access.
     * 
     */
    @Import(name="hasPublicAccessPolicy")
      private final @Nullable Output<Boolean> hasPublicAccessPolicy;

    public Output<Boolean> getHasPublicAccessPolicy() {
        return this.hasPublicAccessPolicy == null ? Codegen.empty() : this.hasPublicAccessPolicy;
    }

    /**
     * Name you want to assign to this access point.
     * 
     */
    @Import(name="name")
      private final @Nullable Output<String> name;

    public Output<String> getName() {
        return this.name == null ? Codegen.empty() : this.name;
    }

    /**
     * Indicates whether this access point allows access from the public Internet. Values are `VPC` (the access point doesn't allow access from the public Internet) and `Internet` (the access point allows access from the public Internet, subject to the access point and bucket access policies).
     * 
     */
    @Import(name="networkOrigin")
      private final @Nullable Output<String> networkOrigin;

    public Output<String> getNetworkOrigin() {
        return this.networkOrigin == null ? Codegen.empty() : this.networkOrigin;
    }

    /**
     * Valid JSON document that specifies the policy that you want to apply to this access point. Removing `policy` from your configuration or setting `policy` to null or an empty string (i.e., `policy = ""`) _will not_ delete the policy since it could have been set by `aws.s3control.AccessPointPolicy`. To remove the `policy`, set it to `"{}"` (an empty JSON document).
     * 
     */
    @Import(name="policy")
      private final @Nullable Output<String> policy;

    public Output<String> getPolicy() {
        return this.policy == null ? Codegen.empty() : this.policy;
    }

    /**
     * Configuration block to manage the `PublicAccessBlock` configuration that you want to apply to this Amazon S3 bucket. You can enable the configuration options in any combination. Detailed below.
     * 
     */
    @Import(name="publicAccessBlockConfiguration")
      private final @Nullable Output<AccessPointPublicAccessBlockConfigurationGetArgs> publicAccessBlockConfiguration;

    public Output<AccessPointPublicAccessBlockConfigurationGetArgs> getPublicAccessBlockConfiguration() {
        return this.publicAccessBlockConfiguration == null ? Codegen.empty() : this.publicAccessBlockConfiguration;
    }

    /**
     * Configuration block to restrict access to this access point to requests from the specified Virtual Private Cloud (VPC). Required for S3 on Outposts. Detailed below.
     * 
     */
    @Import(name="vpcConfiguration")
      private final @Nullable Output<AccessPointVpcConfigurationGetArgs> vpcConfiguration;

    public Output<AccessPointVpcConfigurationGetArgs> getVpcConfiguration() {
        return this.vpcConfiguration == null ? Codegen.empty() : this.vpcConfiguration;
    }

    public AccessPointState(
        @Nullable Output<String> accountId,
        @Nullable Output<String> alias,
        @Nullable Output<String> arn,
        @Nullable Output<String> bucket,
        @Nullable Output<String> domainName,
        @Nullable Output<Map<String,String>> endpoints,
        @Nullable Output<Boolean> hasPublicAccessPolicy,
        @Nullable Output<String> name,
        @Nullable Output<String> networkOrigin,
        @Nullable Output<String> policy,
        @Nullable Output<AccessPointPublicAccessBlockConfigurationGetArgs> publicAccessBlockConfiguration,
        @Nullable Output<AccessPointVpcConfigurationGetArgs> vpcConfiguration) {
        this.accountId = accountId;
        this.alias = alias;
        this.arn = arn;
        this.bucket = bucket;
        this.domainName = domainName;
        this.endpoints = endpoints;
        this.hasPublicAccessPolicy = hasPublicAccessPolicy;
        this.name = name;
        this.networkOrigin = networkOrigin;
        this.policy = policy;
        this.publicAccessBlockConfiguration = publicAccessBlockConfiguration;
        this.vpcConfiguration = vpcConfiguration;
    }

    private AccessPointState() {
        this.accountId = Codegen.empty();
        this.alias = Codegen.empty();
        this.arn = Codegen.empty();
        this.bucket = Codegen.empty();
        this.domainName = Codegen.empty();
        this.endpoints = Codegen.empty();
        this.hasPublicAccessPolicy = Codegen.empty();
        this.name = Codegen.empty();
        this.networkOrigin = Codegen.empty();
        this.policy = Codegen.empty();
        this.publicAccessBlockConfiguration = Codegen.empty();
        this.vpcConfiguration = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(AccessPointState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<String> accountId;
        private @Nullable Output<String> alias;
        private @Nullable Output<String> arn;
        private @Nullable Output<String> bucket;
        private @Nullable Output<String> domainName;
        private @Nullable Output<Map<String,String>> endpoints;
        private @Nullable Output<Boolean> hasPublicAccessPolicy;
        private @Nullable Output<String> name;
        private @Nullable Output<String> networkOrigin;
        private @Nullable Output<String> policy;
        private @Nullable Output<AccessPointPublicAccessBlockConfigurationGetArgs> publicAccessBlockConfiguration;
        private @Nullable Output<AccessPointVpcConfigurationGetArgs> vpcConfiguration;

        public Builder() {
    	      // Empty
        }

        public Builder(AccessPointState defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.accountId = defaults.accountId;
    	      this.alias = defaults.alias;
    	      this.arn = defaults.arn;
    	      this.bucket = defaults.bucket;
    	      this.domainName = defaults.domainName;
    	      this.endpoints = defaults.endpoints;
    	      this.hasPublicAccessPolicy = defaults.hasPublicAccessPolicy;
    	      this.name = defaults.name;
    	      this.networkOrigin = defaults.networkOrigin;
    	      this.policy = defaults.policy;
    	      this.publicAccessBlockConfiguration = defaults.publicAccessBlockConfiguration;
    	      this.vpcConfiguration = defaults.vpcConfiguration;
        }

        public Builder accountId(@Nullable Output<String> accountId) {
            this.accountId = accountId;
            return this;
        }
        public Builder accountId(@Nullable String accountId) {
            this.accountId = Codegen.ofNullable(accountId);
            return this;
        }
        public Builder alias(@Nullable Output<String> alias) {
            this.alias = alias;
            return this;
        }
        public Builder alias(@Nullable String alias) {
            this.alias = Codegen.ofNullable(alias);
            return this;
        }
        public Builder arn(@Nullable Output<String> arn) {
            this.arn = arn;
            return this;
        }
        public Builder arn(@Nullable String arn) {
            this.arn = Codegen.ofNullable(arn);
            return this;
        }
        public Builder bucket(@Nullable Output<String> bucket) {
            this.bucket = bucket;
            return this;
        }
        public Builder bucket(@Nullable String bucket) {
            this.bucket = Codegen.ofNullable(bucket);
            return this;
        }
        public Builder domainName(@Nullable Output<String> domainName) {
            this.domainName = domainName;
            return this;
        }
        public Builder domainName(@Nullable String domainName) {
            this.domainName = Codegen.ofNullable(domainName);
            return this;
        }
        public Builder endpoints(@Nullable Output<Map<String,String>> endpoints) {
            this.endpoints = endpoints;
            return this;
        }
        public Builder endpoints(@Nullable Map<String,String> endpoints) {
            this.endpoints = Codegen.ofNullable(endpoints);
            return this;
        }
        public Builder hasPublicAccessPolicy(@Nullable Output<Boolean> hasPublicAccessPolicy) {
            this.hasPublicAccessPolicy = hasPublicAccessPolicy;
            return this;
        }
        public Builder hasPublicAccessPolicy(@Nullable Boolean hasPublicAccessPolicy) {
            this.hasPublicAccessPolicy = Codegen.ofNullable(hasPublicAccessPolicy);
            return this;
        }
        public Builder name(@Nullable Output<String> name) {
            this.name = name;
            return this;
        }
        public Builder name(@Nullable String name) {
            this.name = Codegen.ofNullable(name);
            return this;
        }
        public Builder networkOrigin(@Nullable Output<String> networkOrigin) {
            this.networkOrigin = networkOrigin;
            return this;
        }
        public Builder networkOrigin(@Nullable String networkOrigin) {
            this.networkOrigin = Codegen.ofNullable(networkOrigin);
            return this;
        }
        public Builder policy(@Nullable Output<String> policy) {
            this.policy = policy;
            return this;
        }
        public Builder policy(@Nullable String policy) {
            this.policy = Codegen.ofNullable(policy);
            return this;
        }
        public Builder publicAccessBlockConfiguration(@Nullable Output<AccessPointPublicAccessBlockConfigurationGetArgs> publicAccessBlockConfiguration) {
            this.publicAccessBlockConfiguration = publicAccessBlockConfiguration;
            return this;
        }
        public Builder publicAccessBlockConfiguration(@Nullable AccessPointPublicAccessBlockConfigurationGetArgs publicAccessBlockConfiguration) {
            this.publicAccessBlockConfiguration = Codegen.ofNullable(publicAccessBlockConfiguration);
            return this;
        }
        public Builder vpcConfiguration(@Nullable Output<AccessPointVpcConfigurationGetArgs> vpcConfiguration) {
            this.vpcConfiguration = vpcConfiguration;
            return this;
        }
        public Builder vpcConfiguration(@Nullable AccessPointVpcConfigurationGetArgs vpcConfiguration) {
            this.vpcConfiguration = Codegen.ofNullable(vpcConfiguration);
            return this;
        }        public AccessPointState build() {
            return new AccessPointState(accountId, alias, arn, bucket, domainName, endpoints, hasPublicAccessPolicy, name, networkOrigin, policy, publicAccessBlockConfiguration, vpcConfiguration);
        }
    }
}
