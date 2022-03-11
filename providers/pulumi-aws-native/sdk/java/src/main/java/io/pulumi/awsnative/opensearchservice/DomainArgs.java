// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.opensearchservice;

import io.pulumi.awsnative.opensearchservice.inputs.DomainAdvancedSecurityOptionsInputArgs;
import io.pulumi.awsnative.opensearchservice.inputs.DomainClusterConfigArgs;
import io.pulumi.awsnative.opensearchservice.inputs.DomainCognitoOptionsArgs;
import io.pulumi.awsnative.opensearchservice.inputs.DomainEBSOptionsArgs;
import io.pulumi.awsnative.opensearchservice.inputs.DomainEncryptionAtRestOptionsArgs;
import io.pulumi.awsnative.opensearchservice.inputs.DomainEndpointOptionsArgs;
import io.pulumi.awsnative.opensearchservice.inputs.DomainNodeToNodeEncryptionOptionsArgs;
import io.pulumi.awsnative.opensearchservice.inputs.DomainSnapshotOptionsArgs;
import io.pulumi.awsnative.opensearchservice.inputs.DomainTagArgs;
import io.pulumi.awsnative.opensearchservice.inputs.DomainVPCOptionsArgs;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.InputImport;
import java.lang.Object;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


public final class DomainArgs extends io.pulumi.resources.ResourceArgs {

    public static final DomainArgs Empty = new DomainArgs();

    @InputImport(name="accessPolicies")
      private final @Nullable Output<Object> accessPolicies;

    public Output<Object> getAccessPolicies() {
        return this.accessPolicies == null ? Output.empty() : this.accessPolicies;
    }

    @InputImport(name="advancedOptions")
      private final @Nullable Output<Object> advancedOptions;

    public Output<Object> getAdvancedOptions() {
        return this.advancedOptions == null ? Output.empty() : this.advancedOptions;
    }

    @InputImport(name="advancedSecurityOptions")
      private final @Nullable Output<DomainAdvancedSecurityOptionsInputArgs> advancedSecurityOptions;

    public Output<DomainAdvancedSecurityOptionsInputArgs> getAdvancedSecurityOptions() {
        return this.advancedSecurityOptions == null ? Output.empty() : this.advancedSecurityOptions;
    }

    @InputImport(name="clusterConfig")
      private final @Nullable Output<DomainClusterConfigArgs> clusterConfig;

    public Output<DomainClusterConfigArgs> getClusterConfig() {
        return this.clusterConfig == null ? Output.empty() : this.clusterConfig;
    }

    @InputImport(name="cognitoOptions")
      private final @Nullable Output<DomainCognitoOptionsArgs> cognitoOptions;

    public Output<DomainCognitoOptionsArgs> getCognitoOptions() {
        return this.cognitoOptions == null ? Output.empty() : this.cognitoOptions;
    }

    @InputImport(name="domainEndpointOptions")
      private final @Nullable Output<DomainEndpointOptionsArgs> domainEndpointOptions;

    public Output<DomainEndpointOptionsArgs> getDomainEndpointOptions() {
        return this.domainEndpointOptions == null ? Output.empty() : this.domainEndpointOptions;
    }

    @InputImport(name="domainName")
      private final @Nullable Output<String> domainName;

    public Output<String> getDomainName() {
        return this.domainName == null ? Output.empty() : this.domainName;
    }

    @InputImport(name="eBSOptions")
      private final @Nullable Output<DomainEBSOptionsArgs> eBSOptions;

    public Output<DomainEBSOptionsArgs> getEBSOptions() {
        return this.eBSOptions == null ? Output.empty() : this.eBSOptions;
    }

    @InputImport(name="encryptionAtRestOptions")
      private final @Nullable Output<DomainEncryptionAtRestOptionsArgs> encryptionAtRestOptions;

    public Output<DomainEncryptionAtRestOptionsArgs> getEncryptionAtRestOptions() {
        return this.encryptionAtRestOptions == null ? Output.empty() : this.encryptionAtRestOptions;
    }

    @InputImport(name="engineVersion")
      private final @Nullable Output<String> engineVersion;

    public Output<String> getEngineVersion() {
        return this.engineVersion == null ? Output.empty() : this.engineVersion;
    }

    @InputImport(name="logPublishingOptions")
      private final @Nullable Output<Object> logPublishingOptions;

    public Output<Object> getLogPublishingOptions() {
        return this.logPublishingOptions == null ? Output.empty() : this.logPublishingOptions;
    }

    @InputImport(name="nodeToNodeEncryptionOptions")
      private final @Nullable Output<DomainNodeToNodeEncryptionOptionsArgs> nodeToNodeEncryptionOptions;

    public Output<DomainNodeToNodeEncryptionOptionsArgs> getNodeToNodeEncryptionOptions() {
        return this.nodeToNodeEncryptionOptions == null ? Output.empty() : this.nodeToNodeEncryptionOptions;
    }

    @InputImport(name="snapshotOptions")
      private final @Nullable Output<DomainSnapshotOptionsArgs> snapshotOptions;

    public Output<DomainSnapshotOptionsArgs> getSnapshotOptions() {
        return this.snapshotOptions == null ? Output.empty() : this.snapshotOptions;
    }

    /**
     * An arbitrary set of tags (key-value pairs) for this Domain.
     * 
     */
    @InputImport(name="tags")
      private final @Nullable Output<List<DomainTagArgs>> tags;

    public Output<List<DomainTagArgs>> getTags() {
        return this.tags == null ? Output.empty() : this.tags;
    }

    @InputImport(name="vPCOptions")
      private final @Nullable Output<DomainVPCOptionsArgs> vPCOptions;

    public Output<DomainVPCOptionsArgs> getVPCOptions() {
        return this.vPCOptions == null ? Output.empty() : this.vPCOptions;
    }

    public DomainArgs(
        @Nullable Output<Object> accessPolicies,
        @Nullable Output<Object> advancedOptions,
        @Nullable Output<DomainAdvancedSecurityOptionsInputArgs> advancedSecurityOptions,
        @Nullable Output<DomainClusterConfigArgs> clusterConfig,
        @Nullable Output<DomainCognitoOptionsArgs> cognitoOptions,
        @Nullable Output<DomainEndpointOptionsArgs> domainEndpointOptions,
        @Nullable Output<String> domainName,
        @Nullable Output<DomainEBSOptionsArgs> eBSOptions,
        @Nullable Output<DomainEncryptionAtRestOptionsArgs> encryptionAtRestOptions,
        @Nullable Output<String> engineVersion,
        @Nullable Output<Object> logPublishingOptions,
        @Nullable Output<DomainNodeToNodeEncryptionOptionsArgs> nodeToNodeEncryptionOptions,
        @Nullable Output<DomainSnapshotOptionsArgs> snapshotOptions,
        @Nullable Output<List<DomainTagArgs>> tags,
        @Nullable Output<DomainVPCOptionsArgs> vPCOptions) {
        this.accessPolicies = accessPolicies;
        this.advancedOptions = advancedOptions;
        this.advancedSecurityOptions = advancedSecurityOptions;
        this.clusterConfig = clusterConfig;
        this.cognitoOptions = cognitoOptions;
        this.domainEndpointOptions = domainEndpointOptions;
        this.domainName = domainName;
        this.eBSOptions = eBSOptions;
        this.encryptionAtRestOptions = encryptionAtRestOptions;
        this.engineVersion = engineVersion;
        this.logPublishingOptions = logPublishingOptions;
        this.nodeToNodeEncryptionOptions = nodeToNodeEncryptionOptions;
        this.snapshotOptions = snapshotOptions;
        this.tags = tags;
        this.vPCOptions = vPCOptions;
    }

    private DomainArgs() {
        this.accessPolicies = Output.empty();
        this.advancedOptions = Output.empty();
        this.advancedSecurityOptions = Output.empty();
        this.clusterConfig = Output.empty();
        this.cognitoOptions = Output.empty();
        this.domainEndpointOptions = Output.empty();
        this.domainName = Output.empty();
        this.eBSOptions = Output.empty();
        this.encryptionAtRestOptions = Output.empty();
        this.engineVersion = Output.empty();
        this.logPublishingOptions = Output.empty();
        this.nodeToNodeEncryptionOptions = Output.empty();
        this.snapshotOptions = Output.empty();
        this.tags = Output.empty();
        this.vPCOptions = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(DomainArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<Object> accessPolicies;
        private @Nullable Output<Object> advancedOptions;
        private @Nullable Output<DomainAdvancedSecurityOptionsInputArgs> advancedSecurityOptions;
        private @Nullable Output<DomainClusterConfigArgs> clusterConfig;
        private @Nullable Output<DomainCognitoOptionsArgs> cognitoOptions;
        private @Nullable Output<DomainEndpointOptionsArgs> domainEndpointOptions;
        private @Nullable Output<String> domainName;
        private @Nullable Output<DomainEBSOptionsArgs> eBSOptions;
        private @Nullable Output<DomainEncryptionAtRestOptionsArgs> encryptionAtRestOptions;
        private @Nullable Output<String> engineVersion;
        private @Nullable Output<Object> logPublishingOptions;
        private @Nullable Output<DomainNodeToNodeEncryptionOptionsArgs> nodeToNodeEncryptionOptions;
        private @Nullable Output<DomainSnapshotOptionsArgs> snapshotOptions;
        private @Nullable Output<List<DomainTagArgs>> tags;
        private @Nullable Output<DomainVPCOptionsArgs> vPCOptions;

        public Builder() {
    	      // Empty
        }

        public Builder(DomainArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.accessPolicies = defaults.accessPolicies;
    	      this.advancedOptions = defaults.advancedOptions;
    	      this.advancedSecurityOptions = defaults.advancedSecurityOptions;
    	      this.clusterConfig = defaults.clusterConfig;
    	      this.cognitoOptions = defaults.cognitoOptions;
    	      this.domainEndpointOptions = defaults.domainEndpointOptions;
    	      this.domainName = defaults.domainName;
    	      this.eBSOptions = defaults.eBSOptions;
    	      this.encryptionAtRestOptions = defaults.encryptionAtRestOptions;
    	      this.engineVersion = defaults.engineVersion;
    	      this.logPublishingOptions = defaults.logPublishingOptions;
    	      this.nodeToNodeEncryptionOptions = defaults.nodeToNodeEncryptionOptions;
    	      this.snapshotOptions = defaults.snapshotOptions;
    	      this.tags = defaults.tags;
    	      this.vPCOptions = defaults.vPCOptions;
        }

        public Builder accessPolicies(@Nullable Output<Object> accessPolicies) {
            this.accessPolicies = accessPolicies;
            return this;
        }

        public Builder accessPolicies(@Nullable Object accessPolicies) {
            this.accessPolicies = Output.ofNullable(accessPolicies);
            return this;
        }

        public Builder advancedOptions(@Nullable Output<Object> advancedOptions) {
            this.advancedOptions = advancedOptions;
            return this;
        }

        public Builder advancedOptions(@Nullable Object advancedOptions) {
            this.advancedOptions = Output.ofNullable(advancedOptions);
            return this;
        }

        public Builder advancedSecurityOptions(@Nullable Output<DomainAdvancedSecurityOptionsInputArgs> advancedSecurityOptions) {
            this.advancedSecurityOptions = advancedSecurityOptions;
            return this;
        }

        public Builder advancedSecurityOptions(@Nullable DomainAdvancedSecurityOptionsInputArgs advancedSecurityOptions) {
            this.advancedSecurityOptions = Output.ofNullable(advancedSecurityOptions);
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

        public Builder domainEndpointOptions(@Nullable Output<DomainEndpointOptionsArgs> domainEndpointOptions) {
            this.domainEndpointOptions = domainEndpointOptions;
            return this;
        }

        public Builder domainEndpointOptions(@Nullable DomainEndpointOptionsArgs domainEndpointOptions) {
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

        public Builder eBSOptions(@Nullable Output<DomainEBSOptionsArgs> eBSOptions) {
            this.eBSOptions = eBSOptions;
            return this;
        }

        public Builder eBSOptions(@Nullable DomainEBSOptionsArgs eBSOptions) {
            this.eBSOptions = Output.ofNullable(eBSOptions);
            return this;
        }

        public Builder encryptionAtRestOptions(@Nullable Output<DomainEncryptionAtRestOptionsArgs> encryptionAtRestOptions) {
            this.encryptionAtRestOptions = encryptionAtRestOptions;
            return this;
        }

        public Builder encryptionAtRestOptions(@Nullable DomainEncryptionAtRestOptionsArgs encryptionAtRestOptions) {
            this.encryptionAtRestOptions = Output.ofNullable(encryptionAtRestOptions);
            return this;
        }

        public Builder engineVersion(@Nullable Output<String> engineVersion) {
            this.engineVersion = engineVersion;
            return this;
        }

        public Builder engineVersion(@Nullable String engineVersion) {
            this.engineVersion = Output.ofNullable(engineVersion);
            return this;
        }

        public Builder logPublishingOptions(@Nullable Output<Object> logPublishingOptions) {
            this.logPublishingOptions = logPublishingOptions;
            return this;
        }

        public Builder logPublishingOptions(@Nullable Object logPublishingOptions) {
            this.logPublishingOptions = Output.ofNullable(logPublishingOptions);
            return this;
        }

        public Builder nodeToNodeEncryptionOptions(@Nullable Output<DomainNodeToNodeEncryptionOptionsArgs> nodeToNodeEncryptionOptions) {
            this.nodeToNodeEncryptionOptions = nodeToNodeEncryptionOptions;
            return this;
        }

        public Builder nodeToNodeEncryptionOptions(@Nullable DomainNodeToNodeEncryptionOptionsArgs nodeToNodeEncryptionOptions) {
            this.nodeToNodeEncryptionOptions = Output.ofNullable(nodeToNodeEncryptionOptions);
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

        public Builder tags(@Nullable Output<List<DomainTagArgs>> tags) {
            this.tags = tags;
            return this;
        }

        public Builder tags(@Nullable List<DomainTagArgs> tags) {
            this.tags = Output.ofNullable(tags);
            return this;
        }

        public Builder vPCOptions(@Nullable Output<DomainVPCOptionsArgs> vPCOptions) {
            this.vPCOptions = vPCOptions;
            return this;
        }

        public Builder vPCOptions(@Nullable DomainVPCOptionsArgs vPCOptions) {
            this.vPCOptions = Output.ofNullable(vPCOptions);
            return this;
        }
        public DomainArgs build() {
            return new DomainArgs(accessPolicies, advancedOptions, advancedSecurityOptions, clusterConfig, cognitoOptions, domainEndpointOptions, domainName, eBSOptions, encryptionAtRestOptions, engineVersion, logPublishingOptions, nodeToNodeEncryptionOptions, snapshotOptions, tags, vPCOptions);
        }
    }
}
