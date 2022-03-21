// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.msk.inputs;

import io.pulumi.aws.msk.inputs.ClusterBrokerNodeGroupInfoGetArgs;
import io.pulumi.aws.msk.inputs.ClusterClientAuthenticationGetArgs;
import io.pulumi.aws.msk.inputs.ClusterConfigurationInfoGetArgs;
import io.pulumi.aws.msk.inputs.ClusterEncryptionInfoGetArgs;
import io.pulumi.aws.msk.inputs.ClusterLoggingInfoGetArgs;
import io.pulumi.aws.msk.inputs.ClusterOpenMonitoringGetArgs;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import java.lang.Integer;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import javax.annotation.Nullable;


public final class ClusterState extends io.pulumi.resources.ResourceArgs {

    public static final ClusterState Empty = new ClusterState();

    /**
     * Amazon Resource Name (ARN) of the MSK Configuration to use in the cluster.
     * 
     */
    @Import(name="arn")
      private final @Nullable Output<String> arn;

    public Output<String> getArn() {
        return this.arn == null ? Output.empty() : this.arn;
    }

    /**
     * Comma separated list of one or more hostname:port pairs of kafka brokers suitable to bootstrap connectivity to the kafka cluster. Contains a value if `encryption_info.0.encryption_in_transit.0.client_broker` is set to `PLAINTEXT` or `TLS_PLAINTEXT`. The resource sorts values alphabetically. AWS may not always return all endpoints so this value is not guaranteed to be stable across applies.
     * 
     */
    @Import(name="bootstrapBrokers")
      private final @Nullable Output<String> bootstrapBrokers;

    public Output<String> getBootstrapBrokers() {
        return this.bootstrapBrokers == null ? Output.empty() : this.bootstrapBrokers;
    }

    /**
     * One or more DNS names (or IP addresses) and SASL IAM port pairs. For example, `b-1.exampleClusterName.abcde.c2.kafka.us-east-1.amazonaws.com:9098,b-2.exampleClusterName.abcde.c2.kafka.us-east-1.amazonaws.com:9098,b-3.exampleClusterName.abcde.c2.kafka.us-east-1.amazonaws.com:9098`. This attribute will have a value if `encryption_info.0.encryption_in_transit.0.client_broker` is set to `TLS_PLAINTEXT` or `TLS` and `client_authentication.0.sasl.0.iam` is set to `true`. The resource sorts the list alphabetically. AWS may not always return all endpoints so the values may not be stable across applies.
     * 
     */
    @Import(name="bootstrapBrokersSaslIam")
      private final @Nullable Output<String> bootstrapBrokersSaslIam;

    public Output<String> getBootstrapBrokersSaslIam() {
        return this.bootstrapBrokersSaslIam == null ? Output.empty() : this.bootstrapBrokersSaslIam;
    }

    /**
     * One or more DNS names (or IP addresses) and SASL SCRAM port pairs. For example, `b-1.exampleClusterName.abcde.c2.kafka.us-east-1.amazonaws.com:9096,b-2.exampleClusterName.abcde.c2.kafka.us-east-1.amazonaws.com:9096,b-3.exampleClusterName.abcde.c2.kafka.us-east-1.amazonaws.com:9096`. This attribute will have a value if `encryption_info.0.encryption_in_transit.0.client_broker` is set to `TLS_PLAINTEXT` or `TLS` and `client_authentication.0.sasl.0.scram` is set to `true`. The resource sorts the list alphabetically. AWS may not always return all endpoints so the values may not be stable across applies.
     * 
     */
    @Import(name="bootstrapBrokersSaslScram")
      private final @Nullable Output<String> bootstrapBrokersSaslScram;

    public Output<String> getBootstrapBrokersSaslScram() {
        return this.bootstrapBrokersSaslScram == null ? Output.empty() : this.bootstrapBrokersSaslScram;
    }

    /**
     * One or more DNS names (or IP addresses) and TLS port pairs. For example, `b-1.exampleClusterName.abcde.c2.kafka.us-east-1.amazonaws.com:9094,b-2.exampleClusterName.abcde.c2.kafka.us-east-1.amazonaws.com:9094,b-3.exampleClusterName.abcde.c2.kafka.us-east-1.amazonaws.com:9094`. This attribute will have a value if `encryption_info.0.encryption_in_transit.0.client_broker` is set to `TLS_PLAINTEXT` or `TLS`. The resource sorts the list alphabetically. AWS may not always return all endpoints so the values may not be stable across applies.
     * 
     */
    @Import(name="bootstrapBrokersTls")
      private final @Nullable Output<String> bootstrapBrokersTls;

    public Output<String> getBootstrapBrokersTls() {
        return this.bootstrapBrokersTls == null ? Output.empty() : this.bootstrapBrokersTls;
    }

    /**
     * Configuration block for the broker nodes of the Kafka cluster.
     * 
     */
    @Import(name="brokerNodeGroupInfo")
      private final @Nullable Output<ClusterBrokerNodeGroupInfoGetArgs> brokerNodeGroupInfo;

    public Output<ClusterBrokerNodeGroupInfoGetArgs> getBrokerNodeGroupInfo() {
        return this.brokerNodeGroupInfo == null ? Output.empty() : this.brokerNodeGroupInfo;
    }

    /**
     * Configuration block for specifying a client authentication. See below.
     * 
     */
    @Import(name="clientAuthentication")
      private final @Nullable Output<ClusterClientAuthenticationGetArgs> clientAuthentication;

    public Output<ClusterClientAuthenticationGetArgs> getClientAuthentication() {
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
      private final @Nullable Output<ClusterConfigurationInfoGetArgs> configurationInfo;

    public Output<ClusterConfigurationInfoGetArgs> getConfigurationInfo() {
        return this.configurationInfo == null ? Output.empty() : this.configurationInfo;
    }

    /**
     * Current version of the MSK Cluster used for updates, e.g., `K13V1IB3VIYZZH`
     * * `encryption_info.0.encryption_at_rest_kms_key_arn` - The ARN of the KMS key used for encryption at rest of the broker data volumes.
     * 
     */
    @Import(name="currentVersion")
      private final @Nullable Output<String> currentVersion;

    public Output<String> getCurrentVersion() {
        return this.currentVersion == null ? Output.empty() : this.currentVersion;
    }

    /**
     * Configuration block for specifying encryption. See below.
     * 
     */
    @Import(name="encryptionInfo")
      private final @Nullable Output<ClusterEncryptionInfoGetArgs> encryptionInfo;

    public Output<ClusterEncryptionInfoGetArgs> getEncryptionInfo() {
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
    @Import(name="kafkaVersion")
      private final @Nullable Output<String> kafkaVersion;

    public Output<String> getKafkaVersion() {
        return this.kafkaVersion == null ? Output.empty() : this.kafkaVersion;
    }

    /**
     * Configuration block for streaming broker logs to Cloudwatch/S3/Kinesis Firehose. See below.
     * 
     */
    @Import(name="loggingInfo")
      private final @Nullable Output<ClusterLoggingInfoGetArgs> loggingInfo;

    public Output<ClusterLoggingInfoGetArgs> getLoggingInfo() {
        return this.loggingInfo == null ? Output.empty() : this.loggingInfo;
    }

    /**
     * The desired total number of broker nodes in the kafka cluster.  It must be a multiple of the number of specified client subnets.
     * 
     */
    @Import(name="numberOfBrokerNodes")
      private final @Nullable Output<Integer> numberOfBrokerNodes;

    public Output<Integer> getNumberOfBrokerNodes() {
        return this.numberOfBrokerNodes == null ? Output.empty() : this.numberOfBrokerNodes;
    }

    /**
     * Configuration block for JMX and Node monitoring for the MSK cluster. See below.
     * 
     */
    @Import(name="openMonitoring")
      private final @Nullable Output<ClusterOpenMonitoringGetArgs> openMonitoring;

    public Output<ClusterOpenMonitoringGetArgs> getOpenMonitoring() {
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
     * A comma separated list of one or more hostname:port pairs to use to connect to the Apache Zookeeper cluster. The returned values are sorted alphbetically. The AWS API may not return all endpoints, so this value is not guaranteed to be stable across applies.
     * 
     */
    @Import(name="zookeeperConnectString")
      private final @Nullable Output<String> zookeeperConnectString;

    public Output<String> getZookeeperConnectString() {
        return this.zookeeperConnectString == null ? Output.empty() : this.zookeeperConnectString;
    }

    /**
     * A comma separated list of one or more hostname:port pairs to use to connect to the Apache Zookeeper cluster via TLS. The returned values are sorted alphbetically. The AWS API may not return all endpoints, so this value is not guaranteed to be stable across applies.
     * 
     */
    @Import(name="zookeeperConnectStringTls")
      private final @Nullable Output<String> zookeeperConnectStringTls;

    public Output<String> getZookeeperConnectStringTls() {
        return this.zookeeperConnectStringTls == null ? Output.empty() : this.zookeeperConnectStringTls;
    }

    public ClusterState(
        @Nullable Output<String> arn,
        @Nullable Output<String> bootstrapBrokers,
        @Nullable Output<String> bootstrapBrokersSaslIam,
        @Nullable Output<String> bootstrapBrokersSaslScram,
        @Nullable Output<String> bootstrapBrokersTls,
        @Nullable Output<ClusterBrokerNodeGroupInfoGetArgs> brokerNodeGroupInfo,
        @Nullable Output<ClusterClientAuthenticationGetArgs> clientAuthentication,
        @Nullable Output<String> clusterName,
        @Nullable Output<ClusterConfigurationInfoGetArgs> configurationInfo,
        @Nullable Output<String> currentVersion,
        @Nullable Output<ClusterEncryptionInfoGetArgs> encryptionInfo,
        @Nullable Output<String> enhancedMonitoring,
        @Nullable Output<String> kafkaVersion,
        @Nullable Output<ClusterLoggingInfoGetArgs> loggingInfo,
        @Nullable Output<Integer> numberOfBrokerNodes,
        @Nullable Output<ClusterOpenMonitoringGetArgs> openMonitoring,
        @Nullable Output<Map<String,String>> tags,
        @Nullable Output<Map<String,String>> tagsAll,
        @Nullable Output<String> zookeeperConnectString,
        @Nullable Output<String> zookeeperConnectStringTls) {
        this.arn = arn;
        this.bootstrapBrokers = bootstrapBrokers;
        this.bootstrapBrokersSaslIam = bootstrapBrokersSaslIam;
        this.bootstrapBrokersSaslScram = bootstrapBrokersSaslScram;
        this.bootstrapBrokersTls = bootstrapBrokersTls;
        this.brokerNodeGroupInfo = brokerNodeGroupInfo;
        this.clientAuthentication = clientAuthentication;
        this.clusterName = clusterName;
        this.configurationInfo = configurationInfo;
        this.currentVersion = currentVersion;
        this.encryptionInfo = encryptionInfo;
        this.enhancedMonitoring = enhancedMonitoring;
        this.kafkaVersion = kafkaVersion;
        this.loggingInfo = loggingInfo;
        this.numberOfBrokerNodes = numberOfBrokerNodes;
        this.openMonitoring = openMonitoring;
        this.tags = tags;
        this.tagsAll = tagsAll;
        this.zookeeperConnectString = zookeeperConnectString;
        this.zookeeperConnectStringTls = zookeeperConnectStringTls;
    }

    private ClusterState() {
        this.arn = Output.empty();
        this.bootstrapBrokers = Output.empty();
        this.bootstrapBrokersSaslIam = Output.empty();
        this.bootstrapBrokersSaslScram = Output.empty();
        this.bootstrapBrokersTls = Output.empty();
        this.brokerNodeGroupInfo = Output.empty();
        this.clientAuthentication = Output.empty();
        this.clusterName = Output.empty();
        this.configurationInfo = Output.empty();
        this.currentVersion = Output.empty();
        this.encryptionInfo = Output.empty();
        this.enhancedMonitoring = Output.empty();
        this.kafkaVersion = Output.empty();
        this.loggingInfo = Output.empty();
        this.numberOfBrokerNodes = Output.empty();
        this.openMonitoring = Output.empty();
        this.tags = Output.empty();
        this.tagsAll = Output.empty();
        this.zookeeperConnectString = Output.empty();
        this.zookeeperConnectStringTls = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ClusterState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<String> arn;
        private @Nullable Output<String> bootstrapBrokers;
        private @Nullable Output<String> bootstrapBrokersSaslIam;
        private @Nullable Output<String> bootstrapBrokersSaslScram;
        private @Nullable Output<String> bootstrapBrokersTls;
        private @Nullable Output<ClusterBrokerNodeGroupInfoGetArgs> brokerNodeGroupInfo;
        private @Nullable Output<ClusterClientAuthenticationGetArgs> clientAuthentication;
        private @Nullable Output<String> clusterName;
        private @Nullable Output<ClusterConfigurationInfoGetArgs> configurationInfo;
        private @Nullable Output<String> currentVersion;
        private @Nullable Output<ClusterEncryptionInfoGetArgs> encryptionInfo;
        private @Nullable Output<String> enhancedMonitoring;
        private @Nullable Output<String> kafkaVersion;
        private @Nullable Output<ClusterLoggingInfoGetArgs> loggingInfo;
        private @Nullable Output<Integer> numberOfBrokerNodes;
        private @Nullable Output<ClusterOpenMonitoringGetArgs> openMonitoring;
        private @Nullable Output<Map<String,String>> tags;
        private @Nullable Output<Map<String,String>> tagsAll;
        private @Nullable Output<String> zookeeperConnectString;
        private @Nullable Output<String> zookeeperConnectStringTls;

        public Builder() {
    	      // Empty
        }

        public Builder(ClusterState defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.arn = defaults.arn;
    	      this.bootstrapBrokers = defaults.bootstrapBrokers;
    	      this.bootstrapBrokersSaslIam = defaults.bootstrapBrokersSaslIam;
    	      this.bootstrapBrokersSaslScram = defaults.bootstrapBrokersSaslScram;
    	      this.bootstrapBrokersTls = defaults.bootstrapBrokersTls;
    	      this.brokerNodeGroupInfo = defaults.brokerNodeGroupInfo;
    	      this.clientAuthentication = defaults.clientAuthentication;
    	      this.clusterName = defaults.clusterName;
    	      this.configurationInfo = defaults.configurationInfo;
    	      this.currentVersion = defaults.currentVersion;
    	      this.encryptionInfo = defaults.encryptionInfo;
    	      this.enhancedMonitoring = defaults.enhancedMonitoring;
    	      this.kafkaVersion = defaults.kafkaVersion;
    	      this.loggingInfo = defaults.loggingInfo;
    	      this.numberOfBrokerNodes = defaults.numberOfBrokerNodes;
    	      this.openMonitoring = defaults.openMonitoring;
    	      this.tags = defaults.tags;
    	      this.tagsAll = defaults.tagsAll;
    	      this.zookeeperConnectString = defaults.zookeeperConnectString;
    	      this.zookeeperConnectStringTls = defaults.zookeeperConnectStringTls;
        }

        public Builder arn(@Nullable Output<String> arn) {
            this.arn = arn;
            return this;
        }
        public Builder arn(@Nullable String arn) {
            this.arn = Output.ofNullable(arn);
            return this;
        }
        public Builder bootstrapBrokers(@Nullable Output<String> bootstrapBrokers) {
            this.bootstrapBrokers = bootstrapBrokers;
            return this;
        }
        public Builder bootstrapBrokers(@Nullable String bootstrapBrokers) {
            this.bootstrapBrokers = Output.ofNullable(bootstrapBrokers);
            return this;
        }
        public Builder bootstrapBrokersSaslIam(@Nullable Output<String> bootstrapBrokersSaslIam) {
            this.bootstrapBrokersSaslIam = bootstrapBrokersSaslIam;
            return this;
        }
        public Builder bootstrapBrokersSaslIam(@Nullable String bootstrapBrokersSaslIam) {
            this.bootstrapBrokersSaslIam = Output.ofNullable(bootstrapBrokersSaslIam);
            return this;
        }
        public Builder bootstrapBrokersSaslScram(@Nullable Output<String> bootstrapBrokersSaslScram) {
            this.bootstrapBrokersSaslScram = bootstrapBrokersSaslScram;
            return this;
        }
        public Builder bootstrapBrokersSaslScram(@Nullable String bootstrapBrokersSaslScram) {
            this.bootstrapBrokersSaslScram = Output.ofNullable(bootstrapBrokersSaslScram);
            return this;
        }
        public Builder bootstrapBrokersTls(@Nullable Output<String> bootstrapBrokersTls) {
            this.bootstrapBrokersTls = bootstrapBrokersTls;
            return this;
        }
        public Builder bootstrapBrokersTls(@Nullable String bootstrapBrokersTls) {
            this.bootstrapBrokersTls = Output.ofNullable(bootstrapBrokersTls);
            return this;
        }
        public Builder brokerNodeGroupInfo(@Nullable Output<ClusterBrokerNodeGroupInfoGetArgs> brokerNodeGroupInfo) {
            this.brokerNodeGroupInfo = brokerNodeGroupInfo;
            return this;
        }
        public Builder brokerNodeGroupInfo(@Nullable ClusterBrokerNodeGroupInfoGetArgs brokerNodeGroupInfo) {
            this.brokerNodeGroupInfo = Output.ofNullable(brokerNodeGroupInfo);
            return this;
        }
        public Builder clientAuthentication(@Nullable Output<ClusterClientAuthenticationGetArgs> clientAuthentication) {
            this.clientAuthentication = clientAuthentication;
            return this;
        }
        public Builder clientAuthentication(@Nullable ClusterClientAuthenticationGetArgs clientAuthentication) {
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
        public Builder configurationInfo(@Nullable Output<ClusterConfigurationInfoGetArgs> configurationInfo) {
            this.configurationInfo = configurationInfo;
            return this;
        }
        public Builder configurationInfo(@Nullable ClusterConfigurationInfoGetArgs configurationInfo) {
            this.configurationInfo = Output.ofNullable(configurationInfo);
            return this;
        }
        public Builder currentVersion(@Nullable Output<String> currentVersion) {
            this.currentVersion = currentVersion;
            return this;
        }
        public Builder currentVersion(@Nullable String currentVersion) {
            this.currentVersion = Output.ofNullable(currentVersion);
            return this;
        }
        public Builder encryptionInfo(@Nullable Output<ClusterEncryptionInfoGetArgs> encryptionInfo) {
            this.encryptionInfo = encryptionInfo;
            return this;
        }
        public Builder encryptionInfo(@Nullable ClusterEncryptionInfoGetArgs encryptionInfo) {
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
        public Builder kafkaVersion(@Nullable Output<String> kafkaVersion) {
            this.kafkaVersion = kafkaVersion;
            return this;
        }
        public Builder kafkaVersion(@Nullable String kafkaVersion) {
            this.kafkaVersion = Output.ofNullable(kafkaVersion);
            return this;
        }
        public Builder loggingInfo(@Nullable Output<ClusterLoggingInfoGetArgs> loggingInfo) {
            this.loggingInfo = loggingInfo;
            return this;
        }
        public Builder loggingInfo(@Nullable ClusterLoggingInfoGetArgs loggingInfo) {
            this.loggingInfo = Output.ofNullable(loggingInfo);
            return this;
        }
        public Builder numberOfBrokerNodes(@Nullable Output<Integer> numberOfBrokerNodes) {
            this.numberOfBrokerNodes = numberOfBrokerNodes;
            return this;
        }
        public Builder numberOfBrokerNodes(@Nullable Integer numberOfBrokerNodes) {
            this.numberOfBrokerNodes = Output.ofNullable(numberOfBrokerNodes);
            return this;
        }
        public Builder openMonitoring(@Nullable Output<ClusterOpenMonitoringGetArgs> openMonitoring) {
            this.openMonitoring = openMonitoring;
            return this;
        }
        public Builder openMonitoring(@Nullable ClusterOpenMonitoringGetArgs openMonitoring) {
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
        }
        public Builder tagsAll(@Nullable Output<Map<String,String>> tagsAll) {
            this.tagsAll = tagsAll;
            return this;
        }
        public Builder tagsAll(@Nullable Map<String,String> tagsAll) {
            this.tagsAll = Output.ofNullable(tagsAll);
            return this;
        }
        public Builder zookeeperConnectString(@Nullable Output<String> zookeeperConnectString) {
            this.zookeeperConnectString = zookeeperConnectString;
            return this;
        }
        public Builder zookeeperConnectString(@Nullable String zookeeperConnectString) {
            this.zookeeperConnectString = Output.ofNullable(zookeeperConnectString);
            return this;
        }
        public Builder zookeeperConnectStringTls(@Nullable Output<String> zookeeperConnectStringTls) {
            this.zookeeperConnectStringTls = zookeeperConnectStringTls;
            return this;
        }
        public Builder zookeeperConnectStringTls(@Nullable String zookeeperConnectStringTls) {
            this.zookeeperConnectStringTls = Output.ofNullable(zookeeperConnectStringTls);
            return this;
        }        public ClusterState build() {
            return new ClusterState(arn, bootstrapBrokers, bootstrapBrokersSaslIam, bootstrapBrokersSaslScram, bootstrapBrokersTls, brokerNodeGroupInfo, clientAuthentication, clusterName, configurationInfo, currentVersion, encryptionInfo, enhancedMonitoring, kafkaVersion, loggingInfo, numberOfBrokerNodes, openMonitoring, tags, tagsAll, zookeeperConnectString, zookeeperConnectStringTls);
        }
    }
}
