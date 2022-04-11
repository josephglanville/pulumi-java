// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.eks.inputs;

import io.pulumi.aws.Provider;
import io.pulumi.aws.ec2.SecurityGroup;
import io.pulumi.aws.eks.Cluster;
import io.pulumi.aws.eks.FargateProfile;
import io.pulumi.aws.eks.inputs.ClusterEncryptionConfigArgs;
import io.pulumi.aws.iam.OpenIdConnectProvider;
import io.pulumi.aws.iam.Role;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import io.pulumi.eks.VpcCni;
import io.pulumi.eks.inputs.ClusterNodeGroupOptionsArgs;
import io.pulumi.kubernetes.core_v1.ConfigMap;
import io.pulumi.kubernetes.storage.k8s.io_v1.StorageClass;
import java.lang.Object;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * Defines the core set of data associated with an EKS cluster, including the network in which it runs.
 * 
 */
public final class CoreDataArgs extends io.pulumi.resources.ResourceArgs {

    public static final CoreDataArgs Empty = new CoreDataArgs();

    @Import(name="awsProvider")
      private final @Nullable Output<Provider> awsProvider;

    public Output<Provider> getAwsProvider() {
        return this.awsProvider == null ? Codegen.empty() : this.awsProvider;
    }

    @Import(name="cluster", required=true)
      private final Output<Cluster> cluster;

    public Output<Cluster> getCluster() {
        return this.cluster;
    }

    @Import(name="clusterSecurityGroup", required=true)
      private final Output<SecurityGroup> clusterSecurityGroup;

    public Output<SecurityGroup> getClusterSecurityGroup() {
        return this.clusterSecurityGroup;
    }

    @Import(name="eksNodeAccess")
      private final @Nullable Output<ConfigMap> eksNodeAccess;

    public Output<ConfigMap> getEksNodeAccess() {
        return this.eksNodeAccess == null ? Codegen.empty() : this.eksNodeAccess;
    }

    @Import(name="encryptionConfig")
      private final @Nullable Output<ClusterEncryptionConfigArgs> encryptionConfig;

    public Output<ClusterEncryptionConfigArgs> getEncryptionConfig() {
        return this.encryptionConfig == null ? Codegen.empty() : this.encryptionConfig;
    }

    @Import(name="endpoint", required=true)
      private final Output<String> endpoint;

    public Output<String> getEndpoint() {
        return this.endpoint;
    }

    @Import(name="fargateProfile")
      private final @Nullable Output<FargateProfile> fargateProfile;

    public Output<FargateProfile> getFargateProfile() {
        return this.fargateProfile == null ? Codegen.empty() : this.fargateProfile;
    }

    @Import(name="instanceRoles", required=true)
      private final Output<List<Role>> instanceRoles;

    public Output<List<Role>> getInstanceRoles() {
        return this.instanceRoles;
    }

    @Import(name="kubeconfig")
      private final @Nullable Output<Object> kubeconfig;

    public Output<Object> getKubeconfig() {
        return this.kubeconfig == null ? Codegen.empty() : this.kubeconfig;
    }

    @Import(name="nodeGroupOptions", required=true)
      private final Output<ClusterNodeGroupOptionsArgs> nodeGroupOptions;

    public Output<ClusterNodeGroupOptionsArgs> getNodeGroupOptions() {
        return this.nodeGroupOptions;
    }

    @Import(name="nodeSecurityGroupTags")
      private final @Nullable Output<Map<String,String>> nodeSecurityGroupTags;

    public Output<Map<String,String>> getNodeSecurityGroupTags() {
        return this.nodeSecurityGroupTags == null ? Codegen.empty() : this.nodeSecurityGroupTags;
    }

    @Import(name="oidcProvider")
      private final @Nullable Output<OpenIdConnectProvider> oidcProvider;

    public Output<OpenIdConnectProvider> getOidcProvider() {
        return this.oidcProvider == null ? Codegen.empty() : this.oidcProvider;
    }

    @Import(name="privateSubnetIds")
      private final @Nullable Output<List<String>> privateSubnetIds;

    public Output<List<String>> getPrivateSubnetIds() {
        return this.privateSubnetIds == null ? Codegen.empty() : this.privateSubnetIds;
    }

    @Import(name="provider", required=true)
      private final Output<io.pulumi.kubernetes.Provider> provider;

    public Output<io.pulumi.kubernetes.Provider> getProvider() {
        return this.provider;
    }

    @Import(name="publicSubnetIds")
      private final @Nullable Output<List<String>> publicSubnetIds;

    public Output<List<String>> getPublicSubnetIds() {
        return this.publicSubnetIds == null ? Codegen.empty() : this.publicSubnetIds;
    }

    @Import(name="storageClasses")
      private final @Nullable Output<Map<String,StorageClass>> storageClasses;

    public Output<Map<String,StorageClass>> getStorageClasses() {
        return this.storageClasses == null ? Codegen.empty() : this.storageClasses;
    }

    @Import(name="subnetIds", required=true)
      private final Output<List<String>> subnetIds;

    public Output<List<String>> getSubnetIds() {
        return this.subnetIds;
    }

    @Import(name="tags")
      private final @Nullable Output<Map<String,String>> tags;

    public Output<Map<String,String>> getTags() {
        return this.tags == null ? Codegen.empty() : this.tags;
    }

    @Import(name="vpcCni")
      private final @Nullable Output<VpcCni> vpcCni;

    public Output<VpcCni> getVpcCni() {
        return this.vpcCni == null ? Codegen.empty() : this.vpcCni;
    }

    @Import(name="vpcId", required=true)
      private final Output<String> vpcId;

    public Output<String> getVpcId() {
        return this.vpcId;
    }

    public CoreDataArgs(
        @Nullable Output<Provider> awsProvider,
        Output<Cluster> cluster,
        Output<SecurityGroup> clusterSecurityGroup,
        @Nullable Output<ConfigMap> eksNodeAccess,
        @Nullable Output<ClusterEncryptionConfigArgs> encryptionConfig,
        Output<String> endpoint,
        @Nullable Output<FargateProfile> fargateProfile,
        Output<List<Role>> instanceRoles,
        @Nullable Output<Object> kubeconfig,
        Output<ClusterNodeGroupOptionsArgs> nodeGroupOptions,
        @Nullable Output<Map<String,String>> nodeSecurityGroupTags,
        @Nullable Output<OpenIdConnectProvider> oidcProvider,
        @Nullable Output<List<String>> privateSubnetIds,
        Output<io.pulumi.kubernetes.Provider> provider,
        @Nullable Output<List<String>> publicSubnetIds,
        @Nullable Output<Map<String,StorageClass>> storageClasses,
        Output<List<String>> subnetIds,
        @Nullable Output<Map<String,String>> tags,
        @Nullable Output<VpcCni> vpcCni,
        Output<String> vpcId) {
        this.awsProvider = awsProvider;
        this.cluster = Objects.requireNonNull(cluster, "expected parameter 'cluster' to be non-null");
        this.clusterSecurityGroup = Objects.requireNonNull(clusterSecurityGroup, "expected parameter 'clusterSecurityGroup' to be non-null");
        this.eksNodeAccess = eksNodeAccess;
        this.encryptionConfig = encryptionConfig;
        this.endpoint = Objects.requireNonNull(endpoint, "expected parameter 'endpoint' to be non-null");
        this.fargateProfile = fargateProfile;
        this.instanceRoles = Objects.requireNonNull(instanceRoles, "expected parameter 'instanceRoles' to be non-null");
        this.kubeconfig = kubeconfig;
        this.nodeGroupOptions = Objects.requireNonNull(nodeGroupOptions, "expected parameter 'nodeGroupOptions' to be non-null");
        this.nodeSecurityGroupTags = nodeSecurityGroupTags;
        this.oidcProvider = oidcProvider;
        this.privateSubnetIds = privateSubnetIds;
        this.provider = Objects.requireNonNull(provider, "expected parameter 'provider' to be non-null");
        this.publicSubnetIds = publicSubnetIds;
        this.storageClasses = storageClasses;
        this.subnetIds = Objects.requireNonNull(subnetIds, "expected parameter 'subnetIds' to be non-null");
        this.tags = tags;
        this.vpcCni = vpcCni;
        this.vpcId = Objects.requireNonNull(vpcId, "expected parameter 'vpcId' to be non-null");
    }

    private CoreDataArgs() {
        this.awsProvider = Codegen.empty();
        this.cluster = Codegen.empty();
        this.clusterSecurityGroup = Codegen.empty();
        this.eksNodeAccess = Codegen.empty();
        this.encryptionConfig = Codegen.empty();
        this.endpoint = Codegen.empty();
        this.fargateProfile = Codegen.empty();
        this.instanceRoles = Codegen.empty();
        this.kubeconfig = Codegen.empty();
        this.nodeGroupOptions = Codegen.empty();
        this.nodeSecurityGroupTags = Codegen.empty();
        this.oidcProvider = Codegen.empty();
        this.privateSubnetIds = Codegen.empty();
        this.provider = Codegen.empty();
        this.publicSubnetIds = Codegen.empty();
        this.storageClasses = Codegen.empty();
        this.subnetIds = Codegen.empty();
        this.tags = Codegen.empty();
        this.vpcCni = Codegen.empty();
        this.vpcId = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(CoreDataArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<Provider> awsProvider;
        private Output<Cluster> cluster;
        private Output<SecurityGroup> clusterSecurityGroup;
        private @Nullable Output<ConfigMap> eksNodeAccess;
        private @Nullable Output<ClusterEncryptionConfigArgs> encryptionConfig;
        private Output<String> endpoint;
        private @Nullable Output<FargateProfile> fargateProfile;
        private Output<List<Role>> instanceRoles;
        private @Nullable Output<Object> kubeconfig;
        private Output<ClusterNodeGroupOptionsArgs> nodeGroupOptions;
        private @Nullable Output<Map<String,String>> nodeSecurityGroupTags;
        private @Nullable Output<OpenIdConnectProvider> oidcProvider;
        private @Nullable Output<List<String>> privateSubnetIds;
        private Output<io.pulumi.kubernetes.Provider> provider;
        private @Nullable Output<List<String>> publicSubnetIds;
        private @Nullable Output<Map<String,StorageClass>> storageClasses;
        private Output<List<String>> subnetIds;
        private @Nullable Output<Map<String,String>> tags;
        private @Nullable Output<VpcCni> vpcCni;
        private Output<String> vpcId;

        public Builder() {
    	      // Empty
        }

        public Builder(CoreDataArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.awsProvider = defaults.awsProvider;
    	      this.cluster = defaults.cluster;
    	      this.clusterSecurityGroup = defaults.clusterSecurityGroup;
    	      this.eksNodeAccess = defaults.eksNodeAccess;
    	      this.encryptionConfig = defaults.encryptionConfig;
    	      this.endpoint = defaults.endpoint;
    	      this.fargateProfile = defaults.fargateProfile;
    	      this.instanceRoles = defaults.instanceRoles;
    	      this.kubeconfig = defaults.kubeconfig;
    	      this.nodeGroupOptions = defaults.nodeGroupOptions;
    	      this.nodeSecurityGroupTags = defaults.nodeSecurityGroupTags;
    	      this.oidcProvider = defaults.oidcProvider;
    	      this.privateSubnetIds = defaults.privateSubnetIds;
    	      this.provider = defaults.provider;
    	      this.publicSubnetIds = defaults.publicSubnetIds;
    	      this.storageClasses = defaults.storageClasses;
    	      this.subnetIds = defaults.subnetIds;
    	      this.tags = defaults.tags;
    	      this.vpcCni = defaults.vpcCni;
    	      this.vpcId = defaults.vpcId;
        }

        public Builder awsProvider(@Nullable Output<Provider> awsProvider) {
            this.awsProvider = awsProvider;
            return this;
        }
        public Builder awsProvider(@Nullable Provider awsProvider) {
            this.awsProvider = Codegen.ofNullable(awsProvider);
            return this;
        }
        public Builder cluster(Output<Cluster> cluster) {
            this.cluster = Objects.requireNonNull(cluster);
            return this;
        }
        public Builder cluster(Cluster cluster) {
            this.cluster = Output.of(Objects.requireNonNull(cluster));
            return this;
        }
        public Builder clusterSecurityGroup(Output<SecurityGroup> clusterSecurityGroup) {
            this.clusterSecurityGroup = Objects.requireNonNull(clusterSecurityGroup);
            return this;
        }
        public Builder clusterSecurityGroup(SecurityGroup clusterSecurityGroup) {
            this.clusterSecurityGroup = Output.of(Objects.requireNonNull(clusterSecurityGroup));
            return this;
        }
        public Builder eksNodeAccess(@Nullable Output<ConfigMap> eksNodeAccess) {
            this.eksNodeAccess = eksNodeAccess;
            return this;
        }
        public Builder eksNodeAccess(@Nullable ConfigMap eksNodeAccess) {
            this.eksNodeAccess = Codegen.ofNullable(eksNodeAccess);
            return this;
        }
        public Builder encryptionConfig(@Nullable Output<ClusterEncryptionConfigArgs> encryptionConfig) {
            this.encryptionConfig = encryptionConfig;
            return this;
        }
        public Builder encryptionConfig(@Nullable ClusterEncryptionConfigArgs encryptionConfig) {
            this.encryptionConfig = Codegen.ofNullable(encryptionConfig);
            return this;
        }
        public Builder endpoint(Output<String> endpoint) {
            this.endpoint = Objects.requireNonNull(endpoint);
            return this;
        }
        public Builder endpoint(String endpoint) {
            this.endpoint = Output.of(Objects.requireNonNull(endpoint));
            return this;
        }
        public Builder fargateProfile(@Nullable Output<FargateProfile> fargateProfile) {
            this.fargateProfile = fargateProfile;
            return this;
        }
        public Builder fargateProfile(@Nullable FargateProfile fargateProfile) {
            this.fargateProfile = Codegen.ofNullable(fargateProfile);
            return this;
        }
        public Builder instanceRoles(Output<List<Role>> instanceRoles) {
            this.instanceRoles = Objects.requireNonNull(instanceRoles);
            return this;
        }
        public Builder instanceRoles(List<Role> instanceRoles) {
            this.instanceRoles = Output.of(Objects.requireNonNull(instanceRoles));
            return this;
        }
        public Builder instanceRoles(Role... instanceRoles) {
            return instanceRoles(List.of(instanceRoles));
        }
        public Builder kubeconfig(@Nullable Output<Object> kubeconfig) {
            this.kubeconfig = kubeconfig;
            return this;
        }
        public Builder kubeconfig(@Nullable Object kubeconfig) {
            this.kubeconfig = Codegen.ofNullable(kubeconfig);
            return this;
        }
        public Builder nodeGroupOptions(Output<ClusterNodeGroupOptionsArgs> nodeGroupOptions) {
            this.nodeGroupOptions = Objects.requireNonNull(nodeGroupOptions);
            return this;
        }
        public Builder nodeGroupOptions(ClusterNodeGroupOptionsArgs nodeGroupOptions) {
            this.nodeGroupOptions = Output.of(Objects.requireNonNull(nodeGroupOptions));
            return this;
        }
        public Builder nodeSecurityGroupTags(@Nullable Output<Map<String,String>> nodeSecurityGroupTags) {
            this.nodeSecurityGroupTags = nodeSecurityGroupTags;
            return this;
        }
        public Builder nodeSecurityGroupTags(@Nullable Map<String,String> nodeSecurityGroupTags) {
            this.nodeSecurityGroupTags = Codegen.ofNullable(nodeSecurityGroupTags);
            return this;
        }
        public Builder oidcProvider(@Nullable Output<OpenIdConnectProvider> oidcProvider) {
            this.oidcProvider = oidcProvider;
            return this;
        }
        public Builder oidcProvider(@Nullable OpenIdConnectProvider oidcProvider) {
            this.oidcProvider = Codegen.ofNullable(oidcProvider);
            return this;
        }
        public Builder privateSubnetIds(@Nullable Output<List<String>> privateSubnetIds) {
            this.privateSubnetIds = privateSubnetIds;
            return this;
        }
        public Builder privateSubnetIds(@Nullable List<String> privateSubnetIds) {
            this.privateSubnetIds = Codegen.ofNullable(privateSubnetIds);
            return this;
        }
        public Builder privateSubnetIds(String... privateSubnetIds) {
            return privateSubnetIds(List.of(privateSubnetIds));
        }
        public Builder provider(Output<io.pulumi.kubernetes.Provider> provider) {
            this.provider = Objects.requireNonNull(provider);
            return this;
        }
        public Builder provider(io.pulumi.kubernetes.Provider provider) {
            this.provider = Output.of(Objects.requireNonNull(provider));
            return this;
        }
        public Builder publicSubnetIds(@Nullable Output<List<String>> publicSubnetIds) {
            this.publicSubnetIds = publicSubnetIds;
            return this;
        }
        public Builder publicSubnetIds(@Nullable List<String> publicSubnetIds) {
            this.publicSubnetIds = Codegen.ofNullable(publicSubnetIds);
            return this;
        }
        public Builder publicSubnetIds(String... publicSubnetIds) {
            return publicSubnetIds(List.of(publicSubnetIds));
        }
        public Builder storageClasses(@Nullable Output<Map<String,StorageClass>> storageClasses) {
            this.storageClasses = storageClasses;
            return this;
        }
        public Builder storageClasses(@Nullable Map<String,StorageClass> storageClasses) {
            this.storageClasses = Codegen.ofNullable(storageClasses);
            return this;
        }
        public Builder subnetIds(Output<List<String>> subnetIds) {
            this.subnetIds = Objects.requireNonNull(subnetIds);
            return this;
        }
        public Builder subnetIds(List<String> subnetIds) {
            this.subnetIds = Output.of(Objects.requireNonNull(subnetIds));
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
            this.tags = Codegen.ofNullable(tags);
            return this;
        }
        public Builder vpcCni(@Nullable Output<VpcCni> vpcCni) {
            this.vpcCni = vpcCni;
            return this;
        }
        public Builder vpcCni(@Nullable VpcCni vpcCni) {
            this.vpcCni = Codegen.ofNullable(vpcCni);
            return this;
        }
        public Builder vpcId(Output<String> vpcId) {
            this.vpcId = Objects.requireNonNull(vpcId);
            return this;
        }
        public Builder vpcId(String vpcId) {
            this.vpcId = Output.of(Objects.requireNonNull(vpcId));
            return this;
        }        public CoreDataArgs build() {
            return new CoreDataArgs(awsProvider, cluster, clusterSecurityGroup, eksNodeAccess, encryptionConfig, endpoint, fargateProfile, instanceRoles, kubeconfig, nodeGroupOptions, nodeSecurityGroupTags, oidcProvider, privateSubnetIds, provider, publicSubnetIds, storageClasses, subnetIds, tags, vpcCni, vpcId);
        }
    }
}
