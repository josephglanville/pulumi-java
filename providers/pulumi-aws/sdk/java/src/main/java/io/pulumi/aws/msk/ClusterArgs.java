// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.msk;

import io.pulumi.aws.msk.inputs.ClusterBrokerNodeGroupInfoArgs;
import io.pulumi.aws.msk.inputs.ClusterClientAuthenticationArgs;
import io.pulumi.aws.msk.inputs.ClusterConfigurationInfoArgs;
import io.pulumi.aws.msk.inputs.ClusterEncryptionInfoArgs;
import io.pulumi.aws.msk.inputs.ClusterLoggingInfoArgs;
import io.pulumi.aws.msk.inputs.ClusterOpenMonitoringArgs;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import java.lang.Integer;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import javax.annotation.Nullable;


public final class ClusterArgs extends io.pulumi.resources.ResourceArgs {

    public static final ClusterArgs Empty = new ClusterArgs();

    /**
     * Configuration block for the broker nodes of the Kafka cluster.
     * 
     */
    @Import(name="brokerNodeGroupInfo", required=true)
      private final Output<ClusterBrokerNodeGroupInfoArgs> brokerNodeGroupInfo;

    public Output<ClusterBrokerNodeGroupInfoArgs> getBrokerNodeGroupInfo() {
        return this.brokerNodeGroupInfo;
    }

    /**
     * Configuration block for specifying a client authentication. See below.
     * 
     */
    @Import(name="clientAuthentication")
      private final @Nullable Output<ClusterClientAuthenticationArgs> clientAuthentication;

    public Output<ClusterClientAuthenticationArgs> getClientAuthentication() {
        return this.clientAuthentication == null ? Output.empty() : this.clientAuthentication;
    }

    /**
     * Name of the MSK cluster.
     * 
     */
    @Import(name="clusterName")
      private final @Nullable Output<String> clusterName;

    public Output<String> getClusterName() {
        return this.clusterName == null ? Output.empty() : this.clusterName;
    }

    /**
     * Configuration block for specifying a MSK Configuration to attach to Kafka brokers. See below.
     * 
     */
    @Import(name="configurationInfo")
      private final @Nullable Output<ClusterConfigurationInfoArgs> configurationInfo;

    public Output<ClusterConfigurationInfoArgs> getConfigurationInfo() {
        return this.configurationInfo == null ? Output.empty() : this.configurationInfo;
    }

    /**
     * Configuration block for specifying encryption. See below.
     * 
     */
    @Import(name="encryptionInfo")
      private final @Nullable Output<ClusterEncryptionInfoArgs> encryptionInfo;

    public Output<ClusterEncryptionInfoArgs> getEncryptionInfo() {
        return this.encryptionInfo == null ? Output.empty() : this.encryptionInfo;
    }

    /**
     * Specify the desired enhanced MSK CloudWatch monitoring level.  See [Monitoring Amazon MSK with Amazon CloudWatch](https://docs.aws.amazon.com/msk/latest/developerguide/monitoring.html)
     * 
     */
    @Import(name="enhancedMonitoring")
      private final @Nullable Output<String> enhancedMonitoring;

    public Output<String> getEnhancedMonitoring() {
        return this.enhancedMonitoring == null ? Output.empty() : this.enhancedMonitoring;
    }

    /**
     * Specify the desired Kafka software version.
     * 
     */
    @Import(name="kafkaVersion", required=true)
      private final Output<String> kafkaVersion;

    public Output<String> getKafkaVersion() {
        return this.kafkaVersion;
    }

    /**
     * Configuration block for streaming broker logs to Cloudwatch/S3/Kinesis Firehose. See below.
     * 
     */
    @Import(name="loggingInfo")
      private final @Nullable Output<ClusterLoggingInfoArgs> loggingInfo;

    public Output<ClusterLoggingInfoArgs> getLoggingInfo() {
        return this.loggingInfo == null ? Output.empty() : this.loggingInfo;
    }

    /**
     * The desired total number of broker nodes in the kafka cluster.  It must be a multiple of the number of specified client subnets.
     * 
     */
    @Import(name="numberOfBrokerNodes", required=true)
      private final Output<Integer> numberOfBrokerNodes;

    public Output<Integer> getNumberOfBrokerNodes() {
        return this.numberOfBrokerNodes;
    }

    /**
     * Configuration block for JMX and Node monitoring for the MSK cluster. See below.
     * 
     */
    @Import(name="openMonitoring")
      private final @Nullable Output<ClusterOpenMonitoringArgs> openMonitoring;

    public Output<ClusterOpenMonitoringArgs> getOpenMonitoring() {
        return this.openMonitoring == null ? Output.empty() : this.openMonitoring;
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

    public ClusterArgs(
        Output<ClusterBrokerNodeGroupInfoArgs> brokerNodeGroupInfo,
        @Nullable Output<ClusterClientAuthenticationArgs> clientAuthentication,
        @Nullable Output<String> clusterName,
        @Nullable Output<ClusterConfigurationInfoArgs> configurationInfo,
        @Nullable Output<ClusterEncryptionInfoArgs> encryptionInfo,
        @Nullable Output<String> enhancedMonitoring,
        Output<String> kafkaVersion,
        @Nullable Output<ClusterLoggingInfoArgs> loggingInfo,
        Output<Integer> numberOfBrokerNodes,
        @Nullable Output<ClusterOpenMonitoringArgs> openMonitoring,
        @Nullable Output<Map<String,String>> tags) {
        this.brokerNodeGroupInfo = Objects.requireNonNull(brokerNodeGroupInfo, "expected parameter 'brokerNodeGroupInfo' to be non-null");
        this.clientAuthentication = clientAuthentication;
        this.clusterName = clusterName;
        this.configurationInfo = configurationInfo;
        this.encryptionInfo = encryptionInfo;
        this.enhancedMonitoring = enhancedMonitoring;
        this.kafkaVersion = Objects.requireNonNull(kafkaVersion, "expected parameter 'kafkaVersion' to be non-null");
        this.loggingInfo = loggingInfo;
        this.numberOfBrokerNodes = Objects.requireNonNull(numberOfBrokerNodes, "expected parameter 'numberOfBrokerNodes' to be non-null");
        this.openMonitoring = openMonitoring;
        this.tags = tags;
    }

    private ClusterArgs() {
        this.brokerNodeGroupInfo = Output.empty();
        this.clientAuthentication = Output.empty();
        this.clusterName = Output.empty();
        this.configurationInfo = Output.empty();
        this.encryptionInfo = Output.empty();
        this.enhancedMonitoring = Output.empty();
        this.kafkaVersion = Output.empty();
        this.loggingInfo = Output.empty();
        this.numberOfBrokerNodes = Output.empty();
        this.openMonitoring = Output.empty();
        this.tags = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ClusterArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Output<ClusterBrokerNodeGroupInfoArgs> brokerNodeGroupInfo;
        private @Nullable Output<ClusterClientAuthenticationArgs> clientAuthentication;
        private @Nullable Output<String> clusterName;
        private @Nullable Output<ClusterConfigurationInfoArgs> configurationInfo;
        private @Nullable Output<ClusterEncryptionInfoArgs> encryptionInfo;
        private @Nullable Output<String> enhancedMonitoring;
        private Output<String> kafkaVersion;
        private @Nullable Output<ClusterLoggingInfoArgs> loggingInfo;
        private Output<Integer> numberOfBrokerNodes;
        private @Nullable Output<ClusterOpenMonitoringArgs> openMonitoring;
        private @Nullable Output<Map<String,String>> tags;

        public Builder() {
    	      // Empty
        }

        public Builder(ClusterArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.brokerNodeGroupInfo = defaults.brokerNodeGroupInfo;
    	      this.clientAuthentication = defaults.clientAuthentication;
    	      this.clusterName = defaults.clusterName;
    	      this.configurationInfo = defaults.configurationInfo;
    	      this.encryptionInfo = defaults.encryptionInfo;
    	      this.enhancedMonitoring = defaults.enhancedMonitoring;
    	      this.kafkaVersion = defaults.kafkaVersion;
    	      this.loggingInfo = defaults.loggingInfo;
    	      this.numberOfBrokerNodes = defaults.numberOfBrokerNodes;
    	      this.openMonitoring = defaults.openMonitoring;
    	      this.tags = defaults.tags;
        }

        public Builder brokerNodeGroupInfo(Output<ClusterBrokerNodeGroupInfoArgs> brokerNodeGroupInfo) {
            this.brokerNodeGroupInfo = Objects.requireNonNull(brokerNodeGroupInfo);
            return this;
        }
        public Builder brokerNodeGroupInfo(ClusterBrokerNodeGroupInfoArgs brokerNodeGroupInfo) {
            this.brokerNodeGroupInfo = Output.of(Objects.requireNonNull(brokerNodeGroupInfo));
            return this;
        }
        public Builder clientAuthentication(@Nullable Output<ClusterClientAuthenticationArgs> clientAuthentication) {
            this.clientAuthentication = clientAuthentication;
            return this;
        }
        public Builder clientAuthentication(@Nullable ClusterClientAuthenticationArgs clientAuthentication) {
            this.clientAuthentication = Output.ofNullable(clientAuthentication);
            return this;
        }
        public Builder clusterName(@Nullable Output<String> clusterName) {
            this.clusterName = clusterName;
            return this;
        }
        public Builder clusterName(@Nullable String clusterName) {
            this.clusterName = Output.ofNullable(clusterName);
            return this;
        }
        public Builder configurationInfo(@Nullable Output<ClusterConfigurationInfoArgs> configurationInfo) {
            this.configurationInfo = configurationInfo;
            return this;
        }
        public Builder configurationInfo(@Nullable ClusterConfigurationInfoArgs configurationInfo) {
            this.configurationInfo = Output.ofNullable(configurationInfo);
            return this;
        }
        public Builder encryptionInfo(@Nullable Output<ClusterEncryptionInfoArgs> encryptionInfo) {
            this.encryptionInfo = encryptionInfo;
            return this;
        }
        public Builder encryptionInfo(@Nullable ClusterEncryptionInfoArgs encryptionInfo) {
            this.encryptionInfo = Output.ofNullable(encryptionInfo);
            return this;
        }
        public Builder enhancedMonitoring(@Nullable Output<String> enhancedMonitoring) {
            this.enhancedMonitoring = enhancedMonitoring;
            return this;
        }
        public Builder enhancedMonitoring(@Nullable String enhancedMonitoring) {
            this.enhancedMonitoring = Output.ofNullable(enhancedMonitoring);
            return this;
        }
        public Builder kafkaVersion(Output<String> kafkaVersion) {
            this.kafkaVersion = Objects.requireNonNull(kafkaVersion);
            return this;
        }
        public Builder kafkaVersion(String kafkaVersion) {
            this.kafkaVersion = Output.of(Objects.requireNonNull(kafkaVersion));
            return this;
        }
        public Builder loggingInfo(@Nullable Output<ClusterLoggingInfoArgs> loggingInfo) {
            this.loggingInfo = loggingInfo;
            return this;
        }
        public Builder loggingInfo(@Nullable ClusterLoggingInfoArgs loggingInfo) {
            this.loggingInfo = Output.ofNullable(loggingInfo);
            return this;
        }
        public Builder numberOfBrokerNodes(Output<Integer> numberOfBrokerNodes) {
            this.numberOfBrokerNodes = Objects.requireNonNull(numberOfBrokerNodes);
            return this;
        }
        public Builder numberOfBrokerNodes(Integer numberOfBrokerNodes) {
            this.numberOfBrokerNodes = Output.of(Objects.requireNonNull(numberOfBrokerNodes));
            return this;
        }
        public Builder openMonitoring(@Nullable Output<ClusterOpenMonitoringArgs> openMonitoring) {
            this.openMonitoring = openMonitoring;
            return this;
        }
        public Builder openMonitoring(@Nullable ClusterOpenMonitoringArgs openMonitoring) {
            this.openMonitoring = Output.ofNullable(openMonitoring);
            return this;
        }
        public Builder tags(@Nullable Output<Map<String,String>> tags) {
            this.tags = tags;
            return this;
        }
        public Builder tags(@Nullable Map<String,String> tags) {
            this.tags = Output.ofNullable(tags);
            return this;
        }        public ClusterArgs build() {
            return new ClusterArgs(brokerNodeGroupInfo, clientAuthentication, clusterName, configurationInfo, encryptionInfo, enhancedMonitoring, kafkaVersion, loggingInfo, numberOfBrokerNodes, openMonitoring, tags);
        }
    }
}