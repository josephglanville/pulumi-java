// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.composer_v1beta1.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.googlenative.composer_v1beta1.inputs.PrivateClusterConfigArgs;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * The configuration information for configuring a Private IP Cloud Composer environment.
 * 
 */
public final class PrivateEnvironmentConfigArgs extends io.pulumi.resources.ResourceArgs {

    public static final PrivateEnvironmentConfigArgs Empty = new PrivateEnvironmentConfigArgs();

    /**
     * Optional. When specified, the environment will use Private Service Connect instead of VPC peerings to connect to Cloud SQL in the Tenant Project, and the PSC endpoint in the Customer Project will use an IP address from this subnetwork.
     * 
     */
    @Import(name="cloudComposerConnectionSubnetwork")
      private final @Nullable Output<String> cloudComposerConnectionSubnetwork;

    public Output<String> getCloudComposerConnectionSubnetwork() {
        return this.cloudComposerConnectionSubnetwork == null ? Output.empty() : this.cloudComposerConnectionSubnetwork;
    }

    /**
     * Optional. The CIDR block from which IP range for Cloud Composer Network in tenant project will be reserved. Needs to be disjoint from private_cluster_config.master_ipv4_cidr_block and cloud_sql_ipv4_cidr_block. This field is supported for Cloud Composer environments in versions composer-2.*.*-airflow-*.*.* and newer.
     * 
     */
    @Import(name="cloudComposerNetworkIpv4CidrBlock")
      private final @Nullable Output<String> cloudComposerNetworkIpv4CidrBlock;

    public Output<String> getCloudComposerNetworkIpv4CidrBlock() {
        return this.cloudComposerNetworkIpv4CidrBlock == null ? Output.empty() : this.cloudComposerNetworkIpv4CidrBlock;
    }

    /**
     * Optional. The CIDR block from which IP range in tenant project will be reserved for Cloud SQL. Needs to be disjoint from web_server_ipv4_cidr_block
     * 
     */
    @Import(name="cloudSqlIpv4CidrBlock")
      private final @Nullable Output<String> cloudSqlIpv4CidrBlock;

    public Output<String> getCloudSqlIpv4CidrBlock() {
        return this.cloudSqlIpv4CidrBlock == null ? Output.empty() : this.cloudSqlIpv4CidrBlock;
    }

    /**
     * Optional. If `true`, a Private IP Cloud Composer environment is created. If this field is set to true, `IPAllocationPolicy.use_ip_aliases` must be set to true for Cloud Composer environments in versions composer-1.*.*-airflow-*.*.*.
     * 
     */
    @Import(name="enablePrivateEnvironment")
      private final @Nullable Output<Boolean> enablePrivateEnvironment;

    public Output<Boolean> getEnablePrivateEnvironment() {
        return this.enablePrivateEnvironment == null ? Output.empty() : this.enablePrivateEnvironment;
    }

    /**
     * Optional. When enabled, IPs from public (non-RFC1918) ranges can be used for `IPAllocationPolicy.cluster_ipv4_cidr_block` and `IPAllocationPolicy.service_ipv4_cidr_block`.
     * 
     */
    @Import(name="enablePrivatelyUsedPublicIps")
      private final @Nullable Output<Boolean> enablePrivatelyUsedPublicIps;

    public Output<Boolean> getEnablePrivatelyUsedPublicIps() {
        return this.enablePrivatelyUsedPublicIps == null ? Output.empty() : this.enablePrivatelyUsedPublicIps;
    }

    /**
     * Optional. Configuration for the private GKE cluster for a Private IP Cloud Composer environment.
     * 
     */
    @Import(name="privateClusterConfig")
      private final @Nullable Output<PrivateClusterConfigArgs> privateClusterConfig;

    public Output<PrivateClusterConfigArgs> getPrivateClusterConfig() {
        return this.privateClusterConfig == null ? Output.empty() : this.privateClusterConfig;
    }

    /**
     * Optional. The CIDR block from which IP range for web server will be reserved. Needs to be disjoint from private_cluster_config.master_ipv4_cidr_block and cloud_sql_ipv4_cidr_block. This field is supported for Cloud Composer environments in versions composer-1.*.*-airflow-*.*.*.
     * 
     */
    @Import(name="webServerIpv4CidrBlock")
      private final @Nullable Output<String> webServerIpv4CidrBlock;

    public Output<String> getWebServerIpv4CidrBlock() {
        return this.webServerIpv4CidrBlock == null ? Output.empty() : this.webServerIpv4CidrBlock;
    }

    public PrivateEnvironmentConfigArgs(
        @Nullable Output<String> cloudComposerConnectionSubnetwork,
        @Nullable Output<String> cloudComposerNetworkIpv4CidrBlock,
        @Nullable Output<String> cloudSqlIpv4CidrBlock,
        @Nullable Output<Boolean> enablePrivateEnvironment,
        @Nullable Output<Boolean> enablePrivatelyUsedPublicIps,
        @Nullable Output<PrivateClusterConfigArgs> privateClusterConfig,
        @Nullable Output<String> webServerIpv4CidrBlock) {
        this.cloudComposerConnectionSubnetwork = cloudComposerConnectionSubnetwork;
        this.cloudComposerNetworkIpv4CidrBlock = cloudComposerNetworkIpv4CidrBlock;
        this.cloudSqlIpv4CidrBlock = cloudSqlIpv4CidrBlock;
        this.enablePrivateEnvironment = enablePrivateEnvironment;
        this.enablePrivatelyUsedPublicIps = enablePrivatelyUsedPublicIps;
        this.privateClusterConfig = privateClusterConfig;
        this.webServerIpv4CidrBlock = webServerIpv4CidrBlock;
    }

    private PrivateEnvironmentConfigArgs() {
        this.cloudComposerConnectionSubnetwork = Output.empty();
        this.cloudComposerNetworkIpv4CidrBlock = Output.empty();
        this.cloudSqlIpv4CidrBlock = Output.empty();
        this.enablePrivateEnvironment = Output.empty();
        this.enablePrivatelyUsedPublicIps = Output.empty();
        this.privateClusterConfig = Output.empty();
        this.webServerIpv4CidrBlock = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(PrivateEnvironmentConfigArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<String> cloudComposerConnectionSubnetwork;
        private @Nullable Output<String> cloudComposerNetworkIpv4CidrBlock;
        private @Nullable Output<String> cloudSqlIpv4CidrBlock;
        private @Nullable Output<Boolean> enablePrivateEnvironment;
        private @Nullable Output<Boolean> enablePrivatelyUsedPublicIps;
        private @Nullable Output<PrivateClusterConfigArgs> privateClusterConfig;
        private @Nullable Output<String> webServerIpv4CidrBlock;

        public Builder() {
    	      // Empty
        }

        public Builder(PrivateEnvironmentConfigArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.cloudComposerConnectionSubnetwork = defaults.cloudComposerConnectionSubnetwork;
    	      this.cloudComposerNetworkIpv4CidrBlock = defaults.cloudComposerNetworkIpv4CidrBlock;
    	      this.cloudSqlIpv4CidrBlock = defaults.cloudSqlIpv4CidrBlock;
    	      this.enablePrivateEnvironment = defaults.enablePrivateEnvironment;
    	      this.enablePrivatelyUsedPublicIps = defaults.enablePrivatelyUsedPublicIps;
    	      this.privateClusterConfig = defaults.privateClusterConfig;
    	      this.webServerIpv4CidrBlock = defaults.webServerIpv4CidrBlock;
        }

        public Builder cloudComposerConnectionSubnetwork(@Nullable Output<String> cloudComposerConnectionSubnetwork) {
            this.cloudComposerConnectionSubnetwork = cloudComposerConnectionSubnetwork;
            return this;
        }
        public Builder cloudComposerConnectionSubnetwork(@Nullable String cloudComposerConnectionSubnetwork) {
            this.cloudComposerConnectionSubnetwork = Output.ofNullable(cloudComposerConnectionSubnetwork);
            return this;
        }
        public Builder cloudComposerNetworkIpv4CidrBlock(@Nullable Output<String> cloudComposerNetworkIpv4CidrBlock) {
            this.cloudComposerNetworkIpv4CidrBlock = cloudComposerNetworkIpv4CidrBlock;
            return this;
        }
        public Builder cloudComposerNetworkIpv4CidrBlock(@Nullable String cloudComposerNetworkIpv4CidrBlock) {
            this.cloudComposerNetworkIpv4CidrBlock = Output.ofNullable(cloudComposerNetworkIpv4CidrBlock);
            return this;
        }
        public Builder cloudSqlIpv4CidrBlock(@Nullable Output<String> cloudSqlIpv4CidrBlock) {
            this.cloudSqlIpv4CidrBlock = cloudSqlIpv4CidrBlock;
            return this;
        }
        public Builder cloudSqlIpv4CidrBlock(@Nullable String cloudSqlIpv4CidrBlock) {
            this.cloudSqlIpv4CidrBlock = Output.ofNullable(cloudSqlIpv4CidrBlock);
            return this;
        }
        public Builder enablePrivateEnvironment(@Nullable Output<Boolean> enablePrivateEnvironment) {
            this.enablePrivateEnvironment = enablePrivateEnvironment;
            return this;
        }
        public Builder enablePrivateEnvironment(@Nullable Boolean enablePrivateEnvironment) {
            this.enablePrivateEnvironment = Output.ofNullable(enablePrivateEnvironment);
            return this;
        }
        public Builder enablePrivatelyUsedPublicIps(@Nullable Output<Boolean> enablePrivatelyUsedPublicIps) {
            this.enablePrivatelyUsedPublicIps = enablePrivatelyUsedPublicIps;
            return this;
        }
        public Builder enablePrivatelyUsedPublicIps(@Nullable Boolean enablePrivatelyUsedPublicIps) {
            this.enablePrivatelyUsedPublicIps = Output.ofNullable(enablePrivatelyUsedPublicIps);
            return this;
        }
        public Builder privateClusterConfig(@Nullable Output<PrivateClusterConfigArgs> privateClusterConfig) {
            this.privateClusterConfig = privateClusterConfig;
            return this;
        }
        public Builder privateClusterConfig(@Nullable PrivateClusterConfigArgs privateClusterConfig) {
            this.privateClusterConfig = Output.ofNullable(privateClusterConfig);
            return this;
        }
        public Builder webServerIpv4CidrBlock(@Nullable Output<String> webServerIpv4CidrBlock) {
            this.webServerIpv4CidrBlock = webServerIpv4CidrBlock;
            return this;
        }
        public Builder webServerIpv4CidrBlock(@Nullable String webServerIpv4CidrBlock) {
            this.webServerIpv4CidrBlock = Output.ofNullable(webServerIpv4CidrBlock);
            return this;
        }        public PrivateEnvironmentConfigArgs build() {
            return new PrivateEnvironmentConfigArgs(cloudComposerConnectionSubnetwork, cloudComposerNetworkIpv4CidrBlock, cloudSqlIpv4CidrBlock, enablePrivateEnvironment, enablePrivatelyUsedPublicIps, privateClusterConfig, webServerIpv4CidrBlock);
        }
    }
}
