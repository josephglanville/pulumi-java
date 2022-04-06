// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.elasticsearch;

import io.pulumi.aws.elasticsearch.inputs.DomainAdvancedSecurityOptionsArgs;
import io.pulumi.aws.elasticsearch.inputs.DomainAutoTuneOptionsArgs;
import io.pulumi.aws.elasticsearch.inputs.DomainClusterConfigArgs;
import io.pulumi.aws.elasticsearch.inputs.DomainCognitoOptionsArgs;
import io.pulumi.aws.elasticsearch.inputs.DomainDomainEndpointOptionsArgs;
import io.pulumi.aws.elasticsearch.inputs.DomainEbsOptionsArgs;
import io.pulumi.aws.elasticsearch.inputs.DomainEncryptAtRestArgs;
import io.pulumi.aws.elasticsearch.inputs.DomainLogPublishingOptionArgs;
import io.pulumi.aws.elasticsearch.inputs.DomainNodeToNodeEncryptionArgs;
import io.pulumi.aws.elasticsearch.inputs.DomainSnapshotOptionsArgs;
import io.pulumi.aws.elasticsearch.inputs.DomainVpcOptionsArgs;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import javax.annotation.Nullable;


public final class DomainArgs extends io.pulumi.resources.ResourceArgs {

    public static final DomainArgs Empty = new DomainArgs();

    /**
     * IAM policy document specifying the access policies for the domain.
     * 
     */
    @Import(name="accessPolicies")
      private final @Nullable Output<String> accessPolicies;

    public Output<String> getAccessPolicies() {
        return this.accessPolicies == null ? Output.empty() : this.accessPolicies;
    }

    @Import(name="advancedOptions")
      private final @Nullable Output<Map<String,String>> advancedOptions;

    public Output<Map<String,String>> getAdvancedOptions() {
        return this.advancedOptions == null ? Output.empty() : this.advancedOptions;
    }

    /**
     * Configuration block for [fine-grained access control](https://docs.aws.amazon.com/elasticsearch-service/latest/developerguide/fgac.html). Detailed below.
     * 
     */
    @Import(name="advancedSecurityOptions")
      private final @Nullable Output<DomainAdvancedSecurityOptionsArgs> advancedSecurityOptions;

    public Output<DomainAdvancedSecurityOptionsArgs> getAdvancedSecurityOptions() {
        return this.advancedSecurityOptions == null ? Output.empty() : this.advancedSecurityOptions;
    }

    /**
     * Configuration block for the Auto-Tune options of the domain. Detailed below.
     * 
     */
    @Import(name="autoTuneOptions")
      private final @Nullable Output<DomainAutoTuneOptionsArgs> autoTuneOptions;

    public Output<DomainAutoTuneOptionsArgs> getAutoTuneOptions() {
        return this.autoTuneOptions == null ? Output.empty() : this.autoTuneOptions;
    }

    /**
     * Configuration block for the cluster of the domain. Detailed below.
     * 
     */
    @Import(name="clusterConfig")
      private final @Nullable Output<DomainClusterConfigArgs> clusterConfig;

    public Output<DomainClusterConfigArgs> getClusterConfig() {
        return this.clusterConfig == null ? Output.empty() : this.clusterConfig;
    }

    /**
     * Configuration block for authenticating Kibana with Cognito. Detailed below.
     * 
     */
    @Import(name="cognitoOptions")
      private final @Nullable Output<DomainCognitoOptionsArgs> cognitoOptions;

    public Output<DomainCognitoOptionsArgs> getCognitoOptions() {
        return this.cognitoOptions == null ? Output.empty() : this.cognitoOptions;
    }

    /**
     * Configuration block for domain endpoint HTTP(S) related options. Detailed below.
     * 
     */
    @Import(name="domainEndpointOptions")
      private final @Nullable Output<DomainDomainEndpointOptionsArgs> domainEndpointOptions;

    public Output<DomainDomainEndpointOptionsArgs> getDomainEndpointOptions() {
        return this.domainEndpointOptions == null ? Output.empty() : this.domainEndpointOptions;
    }

    /**
     * Name of the domain.
     * 
     */
    @Import(name="domainName")
      private final @Nullable Output<String> domainName;

    public Output<String> getDomainName() {
        return this.domainName == null ? Output.empty() : this.domainName;
    }

    /**
     * Configuration block for EBS related options, may be required based on chosen [instance size](https://aws.amazon.com/elasticsearch-service/pricing/). Detailed below.
     * 
     */
    @Import(name="ebsOptions")
      private final @Nullable Output<DomainEbsOptionsArgs> ebsOptions;

    public Output<DomainEbsOptionsArgs> getEbsOptions() {
        return this.ebsOptions == null ? Output.empty() : this.ebsOptions;
    }

    /**
     * Version of Elasticsearch to deploy. Defaults to `1.5`.
     * 
     */
    @Import(name="elasticsearchVersion")
      private final @Nullable Output<String> elasticsearchVersion;

    public Output<String> getElasticsearchVersion() {
        return this.elasticsearchVersion == null ? Output.empty() : this.elasticsearchVersion;
    }

    /**
     * Configuration block for encrypt at rest options. Only available for [certain instance types](http://docs.aws.amazon.com/elasticsearch-service/latest/developerguide/aes-supported-instance-types.html). Detailed below.
     * 
     */
    @Import(name="encryptAtRest")
      private final @Nullable Output<DomainEncryptAtRestArgs> encryptAtRest;

    public Output<DomainEncryptAtRestArgs> getEncryptAtRest() {
        return this.encryptAtRest == null ? Output.empty() : this.encryptAtRest;
    }

    /**
     * Configuration block for publishing slow and application logs to CloudWatch Logs. This block can be declared multiple times, for each log_type, within the same resource. Detailed below.
     * 
     */
    @Import(name="logPublishingOptions")
      private final @Nullable Output<List<DomainLogPublishingOptionArgs>> logPublishingOptions;

    public Output<List<DomainLogPublishingOptionArgs>> getLogPublishingOptions() {
        return this.logPublishingOptions == null ? Output.empty() : this.logPublishingOptions;
    }

    /**
     * Configuration block for node-to-node encryption options. Detailed below.
     * 
     */
    @Import(name="nodeToNodeEncryption")
      private final @Nullable Output<DomainNodeToNodeEncryptionArgs> nodeToNodeEncryption;

    public Output<DomainNodeToNodeEncryptionArgs> getNodeToNodeEncryption() {
        return this.nodeToNodeEncryption == null ? Output.empty() : this.nodeToNodeEncryption;
    }

    /**
     * Configuration block for snapshot related options. Detailed below. DEPRECATED. For domains running Elasticsearch 5.3 and later, Amazon ES takes hourly automated snapshots, making this setting irrelevant. For domains running earlier versions of Elasticsearch, Amazon ES takes daily automated snapshots.
     * 
     */
    @Import(name="snapshotOptions")
      private final @Nullable Output<DomainSnapshotOptionsArgs> snapshotOptions;

    public Output<DomainSnapshotOptionsArgs> getSnapshotOptions() {
        return this.snapshotOptions == null ? Output.empty() : this.snapshotOptions;
    }

    /**
     * Map of tags to assign to the resource. If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
     * 
     */
    @Import(name="tags")
      private final @Nullable Output<Map<String,String>> tags;

    public Output<Map<String,String>> getTags() {
        return this.tags == null ? Output.empty() : this.tags;
    }

    /**
     * Configuration block for VPC related options. Adding or removing this configuration forces a new resource ([documentation](https://docs.aws.amazon.com/elasticsearch-service/latest/developerguide/es-vpc.html#es-vpc-limitations)). Detailed below.
     * 
     */
    @Import(name="vpcOptions")
      private final @Nullable Output<DomainVpcOptionsArgs> vpcOptions;

    public Output<DomainVpcOptionsArgs> getVpcOptions() {
        return this.vpcOptions == null ? Output.empty() : this.vpcOptions;
    }

    public DomainArgs(
        @Nullable Output<String> accessPolicies,
        @Nullable Output<Map<String,String>> advancedOptions,
        @Nullable Output<DomainAdvancedSecurityOptionsArgs> advancedSecurityOptions,
        @Nullable Output<DomainAutoTuneOptionsArgs> autoTuneOptions,
        @Nullable Output<DomainClusterConfigArgs> clusterConfig,
        @Nullable Output<DomainCognitoOptionsArgs> cognitoOptions,
        @Nullable Output<DomainDomainEndpointOptionsArgs> domainEndpointOptions,
        @Nullable Output<String> domainName,
        @Nullable Output<DomainEbsOptionsArgs> ebsOptions,
        @Nullable Output<String> elasticsearchVersion,
        @Nullable Output<DomainEncryptAtRestArgs> encryptAtRest,
        @Nullable Output<List<DomainLogPublishingOptionArgs>> logPublishingOptions,
        @Nullable Output<DomainNodeToNodeEncryptionArgs> nodeToNodeEncryption,
        @Nullable Output<DomainSnapshotOptionsArgs> snapshotOptions,
        @Nullable Output<Map<String,String>> tags,
        @Nullable Output<DomainVpcOptionsArgs> vpcOptions) {
        this.accessPolicies = accessPolicies;
        this.advancedOptions = advancedOptions;
        this.advancedSecurityOptions = advancedSecurityOptions;
        this.autoTuneOptions = autoTuneOptions;
        this.clusterConfig = clusterConfig;
        this.cognitoOptions = cognitoOptions;
        this.domainEndpointOptions = domainEndpointOptions;
        this.domainName = domainName;
        this.ebsOptions = ebsOptions;
        this.elasticsearchVersion = elasticsearchVersion;
        this.encryptAtRest = encryptAtRest;
        this.logPublishingOptions = logPublishingOptions;
        this.nodeToNodeEncryption = nodeToNodeEncryption;
        this.snapshotOptions = snapshotOptions;
        this.tags = tags;
        this.vpcOptions = vpcOptions;
    }

    private DomainArgs() {
        this.accessPolicies = Output.empty();
        this.advancedOptions = Output.empty();
        this.advancedSecurityOptions = Output.empty();
        this.autoTuneOptions = Output.empty();
        this.clusterConfig = Output.empty();
        this.cognitoOptions = Output.empty();
        this.domainEndpointOptions = Output.empty();
        this.domainName = Output.empty();
        this.ebsOptions = Output.empty();
        this.elasticsearchVersion = Output.empty();
        this.encryptAtRest = Output.empty();
        this.logPublishingOptions = Output.empty();
        this.nodeToNodeEncryption = Output.empty();
        this.snapshotOptions = Output.empty();
        this.tags = Output.empty();
        this.vpcOptions = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(DomainArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<String> accessPolicies;
        private @Nullable Output<Map<String,String>> advancedOptions;
        private @Nullable Output<DomainAdvancedSecurityOptionsArgs> advancedSecurityOptions;
        private @Nullable Output<DomainAutoTuneOptionsArgs> autoTuneOptions;
        private @Nullable Output<DomainClusterConfigArgs> clusterConfig;
        private @Nullable Output<DomainCognitoOptionsArgs> cognitoOptions;
        private @Nullable Output<DomainDomainEndpointOptionsArgs> domainEndpointOptions;
        private @Nullable Output<String> domainName;
        private @Nullable Output<DomainEbsOptionsArgs> ebsOptions;
        private @Nullable Output<String> elasticsearchVersion;
        private @Nullable Output<DomainEncryptAtRestArgs> encryptAtRest;
        private @Nullable Output<List<DomainLogPublishingOptionArgs>> logPublishingOptions;
        private @Nullable Output<DomainNodeToNodeEncryptionArgs> nodeToNodeEncryption;
        private @Nullable Output<DomainSnapshotOptionsArgs> snapshotOptions;
        private @Nullable Output<Map<String,String>> tags;
        private @Nullable Output<DomainVpcOptionsArgs> vpcOptions;

        public Builder() {
    	      // Empty
        }

        public Builder(DomainArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.accessPolicies = defaults.accessPolicies;
    	      this.advancedOptions = defaults.advancedOptions;
    	      this.advancedSecurityOptions = defaults.advancedSecurityOptions;
    	      this.autoTuneOptions = defaults.autoTuneOptions;
    	      this.clusterConfig = defaults.clusterConfig;
    	      this.cognitoOptions = defaults.cognitoOptions;
    	      this.domainEndpointOptions = defaults.domainEndpointOptions;
    	      this.domainName = defaults.domainName;
    	      this.ebsOptions = defaults.ebsOptions;
    	      this.elasticsearchVersion = defaults.elasticsearchVersion;
    	      this.encryptAtRest = defaults.encryptAtRest;
    	      this.logPublishingOptions = defaults.logPublishingOptions;
    	      this.nodeToNodeEncryption = defaults.nodeToNodeEncryption;
    	      this.snapshotOptions = defaults.snapshotOptions;
    	      this.tags = defaults.tags;
    	      this.vpcOptions = defaults.vpcOptions;
        }

        public Builder accessPolicies(@Nullable Output<String> accessPolicies) {
            this.accessPolicies = accessPolicies;
            return this;
        }
        public Builder advancedOptions(@Nullable Output<Map<String,String>> advancedOptions) {
            this.advancedOptions = advancedOptions;
            return this;
        }
        public Builder advancedOptions(@Nullable Map<String,String> advancedOptions) {
            this.advancedOptions = Output.ofNullable(advancedOptions);
            return this;
        }
        public Builder advancedSecurityOptions(@Nullable Output<DomainAdvancedSecurityOptionsArgs> advancedSecurityOptions) {
            this.advancedSecurityOptions = advancedSecurityOptions;
            return this;
        }
        public Builder advancedSecurityOptions(@Nullable DomainAdvancedSecurityOptionsArgs advancedSecurityOptions) {
            this.advancedSecurityOptions = Output.ofNullable(advancedSecurityOptions);
            return this;
        }
        public Builder autoTuneOptions(@Nullable Output<DomainAutoTuneOptionsArgs> autoTuneOptions) {
            this.autoTuneOptions = autoTuneOptions;
            return this;
        }
        public Builder autoTuneOptions(@Nullable DomainAutoTuneOptionsArgs autoTuneOptions) {
            this.autoTuneOptions = Output.ofNullable(autoTuneOptions);
            return this;
        }
        public Builder clusterConfig(@Nullable Output<DomainClusterConfigArgs> clusterConfig) {
            this.clusterConfig = clusterConfig;
            return this;
        }
        public Builder clusterConfig(@Nullable DomainClusterConfigArgs clusterConfig) {
            this.clusterConfig = Output.ofNullable(clusterConfig);
            return this;
        }
        public Builder cognitoOptions(@Nullable Output<DomainCognitoOptionsArgs> cognitoOptions) {
            this.cognitoOptions = cognitoOptions;
            return this;
        }
        public Builder cognitoOptions(@Nullable DomainCognitoOptionsArgs cognitoOptions) {
            this.cognitoOptions = Output.ofNullable(cognitoOptions);
            return this;
        }
        public Builder domainEndpointOptions(@Nullable Output<DomainDomainEndpointOptionsArgs> domainEndpointOptions) {
            this.domainEndpointOptions = domainEndpointOptions;
            return this;
        }
        public Builder domainEndpointOptions(@Nullable DomainDomainEndpointOptionsArgs domainEndpointOptions) {
            this.domainEndpointOptions = Output.ofNullable(domainEndpointOptions);
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
        public Builder ebsOptions(@Nullable Output<DomainEbsOptionsArgs> ebsOptions) {
            this.ebsOptions = ebsOptions;
            return this;
        }
        public Builder ebsOptions(@Nullable DomainEbsOptionsArgs ebsOptions) {
            this.ebsOptions = Output.ofNullable(ebsOptions);
            return this;
        }
        public Builder elasticsearchVersion(@Nullable Output<String> elasticsearchVersion) {
            this.elasticsearchVersion = elasticsearchVersion;
            return this;
        }
        public Builder elasticsearchVersion(@Nullable String elasticsearchVersion) {
            this.elasticsearchVersion = Output.ofNullable(elasticsearchVersion);
            return this;
        }
        public Builder encryptAtRest(@Nullable Output<DomainEncryptAtRestArgs> encryptAtRest) {
            this.encryptAtRest = encryptAtRest;
            return this;
        }
        public Builder encryptAtRest(@Nullable DomainEncryptAtRestArgs encryptAtRest) {
            this.encryptAtRest = Output.ofNullable(encryptAtRest);
            return this;
        }
        public Builder logPublishingOptions(@Nullable Output<List<DomainLogPublishingOptionArgs>> logPublishingOptions) {
            this.logPublishingOptions = logPublishingOptions;
            return this;
        }
        public Builder logPublishingOptions(@Nullable List<DomainLogPublishingOptionArgs> logPublishingOptions) {
            this.logPublishingOptions = Output.ofNullable(logPublishingOptions);
            return this;
        }
        public Builder logPublishingOptions(DomainLogPublishingOptionArgs... logPublishingOptions) {
            return logPublishingOptions(List.of(logPublishingOptions));
        }
        public Builder nodeToNodeEncryption(@Nullable Output<DomainNodeToNodeEncryptionArgs> nodeToNodeEncryption) {
            this.nodeToNodeEncryption = nodeToNodeEncryption;
            return this;
        }
        public Builder nodeToNodeEncryption(@Nullable DomainNodeToNodeEncryptionArgs nodeToNodeEncryption) {
            this.nodeToNodeEncryption = Output.ofNullable(nodeToNodeEncryption);
            return this;
        }
        public Builder snapshotOptions(@Nullable Output<DomainSnapshotOptionsArgs> snapshotOptions) {
            this.snapshotOptions = snapshotOptions;
            return this;
        }
        public Builder snapshotOptions(@Nullable DomainSnapshotOptionsArgs snapshotOptions) {
            this.snapshotOptions = Output.ofNullable(snapshotOptions);
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
        public Builder vpcOptions(@Nullable Output<DomainVpcOptionsArgs> vpcOptions) {
            this.vpcOptions = vpcOptions;
            return this;
        }
        public Builder vpcOptions(@Nullable DomainVpcOptionsArgs vpcOptions) {
            this.vpcOptions = Output.ofNullable(vpcOptions);
            return this;
        }        public DomainArgs build() {
            return new DomainArgs(accessPolicies, advancedOptions, advancedSecurityOptions, autoTuneOptions, clusterConfig, cognitoOptions, domainEndpointOptions, domainName, ebsOptions, elasticsearchVersion, encryptAtRest, logPublishingOptions, nodeToNodeEncryption, snapshotOptions, tags, vpcOptions);
        }
    }
}