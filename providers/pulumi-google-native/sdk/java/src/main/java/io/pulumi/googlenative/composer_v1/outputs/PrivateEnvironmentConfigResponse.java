// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.composer_v1.outputs;

import io.pulumi.core.internal.annotations.OutputCustomType;
import io.pulumi.googlenative.composer_v1.outputs.PrivateClusterConfigResponse;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;

@OutputCustomType
public final class PrivateEnvironmentConfigResponse {
    private final String cloudComposerNetworkIpv4CidrBlock;
    private final String cloudComposerNetworkIpv4ReservedRange;
    private final String cloudSqlIpv4CidrBlock;
    private final Boolean enablePrivateEnvironment;
    private final PrivateClusterConfigResponse privateClusterConfig;
    private final String webServerIpv4CidrBlock;
    private final String webServerIpv4ReservedRange;

    @OutputCustomType.Constructor({"cloudComposerNetworkIpv4CidrBlock","cloudComposerNetworkIpv4ReservedRange","cloudSqlIpv4CidrBlock","enablePrivateEnvironment","privateClusterConfig","webServerIpv4CidrBlock","webServerIpv4ReservedRange"})
    private PrivateEnvironmentConfigResponse(
        String cloudComposerNetworkIpv4CidrBlock,
        String cloudComposerNetworkIpv4ReservedRange,
        String cloudSqlIpv4CidrBlock,
        Boolean enablePrivateEnvironment,
        PrivateClusterConfigResponse privateClusterConfig,
        String webServerIpv4CidrBlock,
        String webServerIpv4ReservedRange) {
        this.cloudComposerNetworkIpv4CidrBlock = Objects.requireNonNull(cloudComposerNetworkIpv4CidrBlock);
        this.cloudComposerNetworkIpv4ReservedRange = Objects.requireNonNull(cloudComposerNetworkIpv4ReservedRange);
        this.cloudSqlIpv4CidrBlock = Objects.requireNonNull(cloudSqlIpv4CidrBlock);
        this.enablePrivateEnvironment = Objects.requireNonNull(enablePrivateEnvironment);
        this.privateClusterConfig = Objects.requireNonNull(privateClusterConfig);
        this.webServerIpv4CidrBlock = Objects.requireNonNull(webServerIpv4CidrBlock);
        this.webServerIpv4ReservedRange = Objects.requireNonNull(webServerIpv4ReservedRange);
    }

    public String getCloudComposerNetworkIpv4CidrBlock() {
        return this.cloudComposerNetworkIpv4CidrBlock;
    }
    public String getCloudComposerNetworkIpv4ReservedRange() {
        return this.cloudComposerNetworkIpv4ReservedRange;
    }
    public String getCloudSqlIpv4CidrBlock() {
        return this.cloudSqlIpv4CidrBlock;
    }
    public Boolean getEnablePrivateEnvironment() {
        return this.enablePrivateEnvironment;
    }
    public PrivateClusterConfigResponse getPrivateClusterConfig() {
        return this.privateClusterConfig;
    }
    public String getWebServerIpv4CidrBlock() {
        return this.webServerIpv4CidrBlock;
    }
    public String getWebServerIpv4ReservedRange() {
        return this.webServerIpv4ReservedRange;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(PrivateEnvironmentConfigResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String cloudComposerNetworkIpv4CidrBlock;
        private String cloudComposerNetworkIpv4ReservedRange;
        private String cloudSqlIpv4CidrBlock;
        private Boolean enablePrivateEnvironment;
        private PrivateClusterConfigResponse privateClusterConfig;
        private String webServerIpv4CidrBlock;
        private String webServerIpv4ReservedRange;

        public Builder() {
    	      // Empty
        }

        public Builder(PrivateEnvironmentConfigResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.cloudComposerNetworkIpv4CidrBlock = defaults.cloudComposerNetworkIpv4CidrBlock;
    	      this.cloudComposerNetworkIpv4ReservedRange = defaults.cloudComposerNetworkIpv4ReservedRange;
    	      this.cloudSqlIpv4CidrBlock = defaults.cloudSqlIpv4CidrBlock;
    	      this.enablePrivateEnvironment = defaults.enablePrivateEnvironment;
    	      this.privateClusterConfig = defaults.privateClusterConfig;
    	      this.webServerIpv4CidrBlock = defaults.webServerIpv4CidrBlock;
    	      this.webServerIpv4ReservedRange = defaults.webServerIpv4ReservedRange;
        }

        public Builder setCloudComposerNetworkIpv4CidrBlock(String cloudComposerNetworkIpv4CidrBlock) {
            this.cloudComposerNetworkIpv4CidrBlock = Objects.requireNonNull(cloudComposerNetworkIpv4CidrBlock);
            return this;
        }

        public Builder setCloudComposerNetworkIpv4ReservedRange(String cloudComposerNetworkIpv4ReservedRange) {
            this.cloudComposerNetworkIpv4ReservedRange = Objects.requireNonNull(cloudComposerNetworkIpv4ReservedRange);
            return this;
        }

        public Builder setCloudSqlIpv4CidrBlock(String cloudSqlIpv4CidrBlock) {
            this.cloudSqlIpv4CidrBlock = Objects.requireNonNull(cloudSqlIpv4CidrBlock);
            return this;
        }

        public Builder setEnablePrivateEnvironment(Boolean enablePrivateEnvironment) {
            this.enablePrivateEnvironment = Objects.requireNonNull(enablePrivateEnvironment);
            return this;
        }

        public Builder setPrivateClusterConfig(PrivateClusterConfigResponse privateClusterConfig) {
            this.privateClusterConfig = Objects.requireNonNull(privateClusterConfig);
            return this;
        }

        public Builder setWebServerIpv4CidrBlock(String webServerIpv4CidrBlock) {
            this.webServerIpv4CidrBlock = Objects.requireNonNull(webServerIpv4CidrBlock);
            return this;
        }

        public Builder setWebServerIpv4ReservedRange(String webServerIpv4ReservedRange) {
            this.webServerIpv4ReservedRange = Objects.requireNonNull(webServerIpv4ReservedRange);
            return this;
        }

        public PrivateEnvironmentConfigResponse build() {
            return new PrivateEnvironmentConfigResponse(cloudComposerNetworkIpv4CidrBlock, cloudComposerNetworkIpv4ReservedRange, cloudSqlIpv4CidrBlock, enablePrivateEnvironment, privateClusterConfig, webServerIpv4CidrBlock, webServerIpv4ReservedRange);
        }
    }
}