// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.eks.outputs;

import io.pulumi.aws.eks.outputs.GetClusterCertificateAuthority;
import io.pulumi.aws.eks.outputs.GetClusterIdentity;
import io.pulumi.aws.eks.outputs.GetClusterKubernetesNetworkConfig;
import io.pulumi.aws.eks.outputs.GetClusterVpcConfig;
import io.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;

@CustomType
public final class GetClusterResult {
    /**
     * The Amazon Resource Name (ARN) of the cluster.
     * 
     */
    private final String arn;
    /**
     * Nested attribute containing `certificate-authority-data` for your cluster.
     * 
     */
    private final GetClusterCertificateAuthority certificateAuthority;
    /**
     * The Unix epoch time stamp in seconds for when the cluster was created.
     * 
     */
    private final String createdAt;
    /**
     * The enabled control plane logs.
     * 
     */
    private final List<String> enabledClusterLogTypes;
    /**
     * The endpoint for your Kubernetes API server.
     * 
     */
    private final String endpoint;
    /**
     * The provider-assigned unique ID for this managed resource.
     * 
     */
    private final String id;
    /**
     * Nested attribute containing identity provider information for your cluster. Only available on Kubernetes version 1.13 and 1.14 clusters created or upgraded on or after September 3, 2019. For an example using this information to enable IAM Roles for Service Accounts, see the `aws.eks.Cluster` resource documentation.
     * 
     */
    private final List<GetClusterIdentity> identities;
    /**
     * Nested list containing Kubernetes Network Configuration.
     * 
     */
    private final List<GetClusterKubernetesNetworkConfig> kubernetesNetworkConfigs;
    private final String name;
    /**
     * The platform version for the cluster.
     * 
     */
    private final String platformVersion;
    /**
     * The Amazon Resource Name (ARN) of the IAM role that provides permissions for the Kubernetes control plane to make calls to AWS API operations on your behalf.
     * 
     */
    private final String roleArn;
    /**
     * The status of the EKS cluster. One of `CREATING`, `ACTIVE`, `DELETING`, `FAILED`.
     * 
     */
    private final String status;
    /**
     * Key-value map of resource tags.
     * 
     */
    private final Map<String,String> tags;
    /**
     * The Kubernetes server version for the cluster.
     * 
     */
    private final String version;
    /**
     * Nested list containing VPC configuration for the cluster.
     * 
     */
    private final GetClusterVpcConfig vpcConfig;

    @CustomType.Constructor
    private GetClusterResult(
        @CustomType.Parameter("arn") String arn,
        @CustomType.Parameter("certificateAuthority") GetClusterCertificateAuthority certificateAuthority,
        @CustomType.Parameter("createdAt") String createdAt,
        @CustomType.Parameter("enabledClusterLogTypes") List<String> enabledClusterLogTypes,
        @CustomType.Parameter("endpoint") String endpoint,
        @CustomType.Parameter("id") String id,
        @CustomType.Parameter("identities") List<GetClusterIdentity> identities,
        @CustomType.Parameter("kubernetesNetworkConfigs") List<GetClusterKubernetesNetworkConfig> kubernetesNetworkConfigs,
        @CustomType.Parameter("name") String name,
        @CustomType.Parameter("platformVersion") String platformVersion,
        @CustomType.Parameter("roleArn") String roleArn,
        @CustomType.Parameter("status") String status,
        @CustomType.Parameter("tags") Map<String,String> tags,
        @CustomType.Parameter("version") String version,
        @CustomType.Parameter("vpcConfig") GetClusterVpcConfig vpcConfig) {
        this.arn = arn;
        this.certificateAuthority = certificateAuthority;
        this.createdAt = createdAt;
        this.enabledClusterLogTypes = enabledClusterLogTypes;
        this.endpoint = endpoint;
        this.id = id;
        this.identities = identities;
        this.kubernetesNetworkConfigs = kubernetesNetworkConfigs;
        this.name = name;
        this.platformVersion = platformVersion;
        this.roleArn = roleArn;
        this.status = status;
        this.tags = tags;
        this.version = version;
        this.vpcConfig = vpcConfig;
    }

    /**
     * The Amazon Resource Name (ARN) of the cluster.
     * 
    */
    public String getArn() {
        return this.arn;
    }
    /**
     * Nested attribute containing `certificate-authority-data` for your cluster.
     * 
    */
    public GetClusterCertificateAuthority getCertificateAuthority() {
        return this.certificateAuthority;
    }
    /**
     * The Unix epoch time stamp in seconds for when the cluster was created.
     * 
    */
    public String getCreatedAt() {
        return this.createdAt;
    }
    /**
     * The enabled control plane logs.
     * 
    */
    public List<String> getEnabledClusterLogTypes() {
        return this.enabledClusterLogTypes;
    }
    /**
     * The endpoint for your Kubernetes API server.
     * 
    */
    public String getEndpoint() {
        return this.endpoint;
    }
    /**
     * The provider-assigned unique ID for this managed resource.
     * 
    */
    public String getId() {
        return this.id;
    }
    /**
     * Nested attribute containing identity provider information for your cluster. Only available on Kubernetes version 1.13 and 1.14 clusters created or upgraded on or after September 3, 2019. For an example using this information to enable IAM Roles for Service Accounts, see the `aws.eks.Cluster` resource documentation.
     * 
    */
    public List<GetClusterIdentity> getIdentities() {
        return this.identities;
    }
    /**
     * Nested list containing Kubernetes Network Configuration.
     * 
    */
    public List<GetClusterKubernetesNetworkConfig> getKubernetesNetworkConfigs() {
        return this.kubernetesNetworkConfigs;
    }
    public String getName() {
        return this.name;
    }
    /**
     * The platform version for the cluster.
     * 
    */
    public String getPlatformVersion() {
        return this.platformVersion;
    }
    /**
     * The Amazon Resource Name (ARN) of the IAM role that provides permissions for the Kubernetes control plane to make calls to AWS API operations on your behalf.
     * 
    */
    public String getRoleArn() {
        return this.roleArn;
    }
    /**
     * The status of the EKS cluster. One of `CREATING`, `ACTIVE`, `DELETING`, `FAILED`.
     * 
    */
    public String getStatus() {
        return this.status;
    }
    /**
     * Key-value map of resource tags.
     * 
    */
    public Map<String,String> getTags() {
        return this.tags;
    }
    /**
     * The Kubernetes server version for the cluster.
     * 
    */
    public String getVersion() {
        return this.version;
    }
    /**
     * Nested list containing VPC configuration for the cluster.
     * 
    */
    public GetClusterVpcConfig getVpcConfig() {
        return this.vpcConfig;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetClusterResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String arn;
        private GetClusterCertificateAuthority certificateAuthority;
        private String createdAt;
        private List<String> enabledClusterLogTypes;
        private String endpoint;
        private String id;
        private List<GetClusterIdentity> identities;
        private List<GetClusterKubernetesNetworkConfig> kubernetesNetworkConfigs;
        private String name;
        private String platformVersion;
        private String roleArn;
        private String status;
        private Map<String,String> tags;
        private String version;
        private GetClusterVpcConfig vpcConfig;

        public Builder() {
    	      // Empty
        }

        public Builder(GetClusterResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.arn = defaults.arn;
    	      this.certificateAuthority = defaults.certificateAuthority;
    	      this.createdAt = defaults.createdAt;
    	      this.enabledClusterLogTypes = defaults.enabledClusterLogTypes;
    	      this.endpoint = defaults.endpoint;
    	      this.id = defaults.id;
    	      this.identities = defaults.identities;
    	      this.kubernetesNetworkConfigs = defaults.kubernetesNetworkConfigs;
    	      this.name = defaults.name;
    	      this.platformVersion = defaults.platformVersion;
    	      this.roleArn = defaults.roleArn;
    	      this.status = defaults.status;
    	      this.tags = defaults.tags;
    	      this.version = defaults.version;
    	      this.vpcConfig = defaults.vpcConfig;
        }

        public Builder arn(String arn) {
            this.arn = Objects.requireNonNull(arn);
            return this;
        }
        public Builder certificateAuthority(GetClusterCertificateAuthority certificateAuthority) {
            this.certificateAuthority = Objects.requireNonNull(certificateAuthority);
            return this;
        }
        public Builder createdAt(String createdAt) {
            this.createdAt = Objects.requireNonNull(createdAt);
            return this;
        }
        public Builder enabledClusterLogTypes(List<String> enabledClusterLogTypes) {
            this.enabledClusterLogTypes = Objects.requireNonNull(enabledClusterLogTypes);
            return this;
        }
        public Builder enabledClusterLogTypes(String... enabledClusterLogTypes) {
            return enabledClusterLogTypes(List.of(enabledClusterLogTypes));
        }
        public Builder endpoint(String endpoint) {
            this.endpoint = Objects.requireNonNull(endpoint);
            return this;
        }
        public Builder id(String id) {
            this.id = Objects.requireNonNull(id);
            return this;
        }
        public Builder identities(List<GetClusterIdentity> identities) {
            this.identities = Objects.requireNonNull(identities);
            return this;
        }
        public Builder identities(GetClusterIdentity... identities) {
            return identities(List.of(identities));
        }
        public Builder kubernetesNetworkConfigs(List<GetClusterKubernetesNetworkConfig> kubernetesNetworkConfigs) {
            this.kubernetesNetworkConfigs = Objects.requireNonNull(kubernetesNetworkConfigs);
            return this;
        }
        public Builder kubernetesNetworkConfigs(GetClusterKubernetesNetworkConfig... kubernetesNetworkConfigs) {
            return kubernetesNetworkConfigs(List.of(kubernetesNetworkConfigs));
        }
        public Builder name(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }
        public Builder platformVersion(String platformVersion) {
            this.platformVersion = Objects.requireNonNull(platformVersion);
            return this;
        }
        public Builder roleArn(String roleArn) {
            this.roleArn = Objects.requireNonNull(roleArn);
            return this;
        }
        public Builder status(String status) {
            this.status = Objects.requireNonNull(status);
            return this;
        }
        public Builder tags(Map<String,String> tags) {
            this.tags = Objects.requireNonNull(tags);
            return this;
        }
        public Builder version(String version) {
            this.version = Objects.requireNonNull(version);
            return this;
        }
        public Builder vpcConfig(GetClusterVpcConfig vpcConfig) {
            this.vpcConfig = Objects.requireNonNull(vpcConfig);
            return this;
        }        public GetClusterResult build() {
            return new GetClusterResult(arn, certificateAuthority, createdAt, enabledClusterLogTypes, endpoint, id, identities, kubernetesNetworkConfigs, name, platformVersion, roleArn, status, tags, version, vpcConfig);
        }
    }
}
