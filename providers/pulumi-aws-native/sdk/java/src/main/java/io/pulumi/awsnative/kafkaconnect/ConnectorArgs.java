// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.kafkaconnect;

import io.pulumi.awsnative.kafkaconnect.inputs.ConnectorCapacityArgs;
import io.pulumi.awsnative.kafkaconnect.inputs.ConnectorKafkaClusterArgs;
import io.pulumi.awsnative.kafkaconnect.inputs.ConnectorKafkaClusterClientAuthenticationArgs;
import io.pulumi.awsnative.kafkaconnect.inputs.ConnectorKafkaClusterEncryptionInTransitArgs;
import io.pulumi.awsnative.kafkaconnect.inputs.ConnectorLogDeliveryArgs;
import io.pulumi.awsnative.kafkaconnect.inputs.ConnectorPluginArgs;
import io.pulumi.awsnative.kafkaconnect.inputs.ConnectorWorkerConfigurationArgs;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.InputImport;
import java.lang.Object;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


public final class ConnectorArgs extends io.pulumi.resources.ResourceArgs {

    public static final ConnectorArgs Empty = new ConnectorArgs();

    @InputImport(name="capacity", required=true)
      private final Output<ConnectorCapacityArgs> capacity;

    public Output<ConnectorCapacityArgs> getCapacity() {
        return this.capacity;
    }

    /**
     * The configuration for the connector.
     * 
     */
    @InputImport(name="connectorConfiguration", required=true)
      private final Output<Object> connectorConfiguration;

    public Output<Object> getConnectorConfiguration() {
        return this.connectorConfiguration;
    }

    /**
     * A summary description of the connector.
     * 
     */
    @InputImport(name="connectorDescription")
      private final @Nullable Output<String> connectorDescription;

    public Output<String> getConnectorDescription() {
        return this.connectorDescription == null ? Output.empty() : this.connectorDescription;
    }

    /**
     * The name of the connector.
     * 
     */
    @InputImport(name="connectorName")
      private final @Nullable Output<String> connectorName;

    public Output<String> getConnectorName() {
        return this.connectorName == null ? Output.empty() : this.connectorName;
    }

    @InputImport(name="kafkaCluster", required=true)
      private final Output<ConnectorKafkaClusterArgs> kafkaCluster;

    public Output<ConnectorKafkaClusterArgs> getKafkaCluster() {
        return this.kafkaCluster;
    }

    @InputImport(name="kafkaClusterClientAuthentication", required=true)
      private final Output<ConnectorKafkaClusterClientAuthenticationArgs> kafkaClusterClientAuthentication;

    public Output<ConnectorKafkaClusterClientAuthenticationArgs> getKafkaClusterClientAuthentication() {
        return this.kafkaClusterClientAuthentication;
    }

    @InputImport(name="kafkaClusterEncryptionInTransit", required=true)
      private final Output<ConnectorKafkaClusterEncryptionInTransitArgs> kafkaClusterEncryptionInTransit;

    public Output<ConnectorKafkaClusterEncryptionInTransitArgs> getKafkaClusterEncryptionInTransit() {
        return this.kafkaClusterEncryptionInTransit;
    }

    /**
     * The version of Kafka Connect. It has to be compatible with both the Kafka cluster's version and the plugins.
     * 
     */
    @InputImport(name="kafkaConnectVersion", required=true)
      private final Output<String> kafkaConnectVersion;

    public Output<String> getKafkaConnectVersion() {
        return this.kafkaConnectVersion;
    }

    @InputImport(name="logDelivery")
      private final @Nullable Output<ConnectorLogDeliveryArgs> logDelivery;

    public Output<ConnectorLogDeliveryArgs> getLogDelivery() {
        return this.logDelivery == null ? Output.empty() : this.logDelivery;
    }

    /**
     * List of plugins to use with the connector.
     * 
     */
    @InputImport(name="plugins", required=true)
      private final Output<List<ConnectorPluginArgs>> plugins;

    public Output<List<ConnectorPluginArgs>> getPlugins() {
        return this.plugins;
    }

    /**
     * The Amazon Resource Name (ARN) of the IAM role used by the connector to access Amazon S3 objects and other external resources.
     * 
     */
    @InputImport(name="serviceExecutionRoleArn", required=true)
      private final Output<String> serviceExecutionRoleArn;

    public Output<String> getServiceExecutionRoleArn() {
        return this.serviceExecutionRoleArn;
    }

    @InputImport(name="workerConfiguration")
      private final @Nullable Output<ConnectorWorkerConfigurationArgs> workerConfiguration;

    public Output<ConnectorWorkerConfigurationArgs> getWorkerConfiguration() {
        return this.workerConfiguration == null ? Output.empty() : this.workerConfiguration;
    }

    public ConnectorArgs(
        Output<ConnectorCapacityArgs> capacity,
        Output<Object> connectorConfiguration,
        @Nullable Output<String> connectorDescription,
        @Nullable Output<String> connectorName,
        Output<ConnectorKafkaClusterArgs> kafkaCluster,
        Output<ConnectorKafkaClusterClientAuthenticationArgs> kafkaClusterClientAuthentication,
        Output<ConnectorKafkaClusterEncryptionInTransitArgs> kafkaClusterEncryptionInTransit,
        Output<String> kafkaConnectVersion,
        @Nullable Output<ConnectorLogDeliveryArgs> logDelivery,
        Output<List<ConnectorPluginArgs>> plugins,
        Output<String> serviceExecutionRoleArn,
        @Nullable Output<ConnectorWorkerConfigurationArgs> workerConfiguration) {
        this.capacity = Objects.requireNonNull(capacity, "expected parameter 'capacity' to be non-null");
        this.connectorConfiguration = Objects.requireNonNull(connectorConfiguration, "expected parameter 'connectorConfiguration' to be non-null");
        this.connectorDescription = connectorDescription;
        this.connectorName = connectorName;
        this.kafkaCluster = Objects.requireNonNull(kafkaCluster, "expected parameter 'kafkaCluster' to be non-null");
        this.kafkaClusterClientAuthentication = Objects.requireNonNull(kafkaClusterClientAuthentication, "expected parameter 'kafkaClusterClientAuthentication' to be non-null");
        this.kafkaClusterEncryptionInTransit = Objects.requireNonNull(kafkaClusterEncryptionInTransit, "expected parameter 'kafkaClusterEncryptionInTransit' to be non-null");
        this.kafkaConnectVersion = Objects.requireNonNull(kafkaConnectVersion, "expected parameter 'kafkaConnectVersion' to be non-null");
        this.logDelivery = logDelivery;
        this.plugins = Objects.requireNonNull(plugins, "expected parameter 'plugins' to be non-null");
        this.serviceExecutionRoleArn = Objects.requireNonNull(serviceExecutionRoleArn, "expected parameter 'serviceExecutionRoleArn' to be non-null");
        this.workerConfiguration = workerConfiguration;
    }

    private ConnectorArgs() {
        this.capacity = Output.empty();
        this.connectorConfiguration = Output.empty();
        this.connectorDescription = Output.empty();
        this.connectorName = Output.empty();
        this.kafkaCluster = Output.empty();
        this.kafkaClusterClientAuthentication = Output.empty();
        this.kafkaClusterEncryptionInTransit = Output.empty();
        this.kafkaConnectVersion = Output.empty();
        this.logDelivery = Output.empty();
        this.plugins = Output.empty();
        this.serviceExecutionRoleArn = Output.empty();
        this.workerConfiguration = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ConnectorArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Output<ConnectorCapacityArgs> capacity;
        private Output<Object> connectorConfiguration;
        private @Nullable Output<String> connectorDescription;
        private @Nullable Output<String> connectorName;
        private Output<ConnectorKafkaClusterArgs> kafkaCluster;
        private Output<ConnectorKafkaClusterClientAuthenticationArgs> kafkaClusterClientAuthentication;
        private Output<ConnectorKafkaClusterEncryptionInTransitArgs> kafkaClusterEncryptionInTransit;
        private Output<String> kafkaConnectVersion;
        private @Nullable Output<ConnectorLogDeliveryArgs> logDelivery;
        private Output<List<ConnectorPluginArgs>> plugins;
        private Output<String> serviceExecutionRoleArn;
        private @Nullable Output<ConnectorWorkerConfigurationArgs> workerConfiguration;

        public Builder() {
    	      // Empty
        }

        public Builder(ConnectorArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.capacity = defaults.capacity;
    	      this.connectorConfiguration = defaults.connectorConfiguration;
    	      this.connectorDescription = defaults.connectorDescription;
    	      this.connectorName = defaults.connectorName;
    	      this.kafkaCluster = defaults.kafkaCluster;
    	      this.kafkaClusterClientAuthentication = defaults.kafkaClusterClientAuthentication;
    	      this.kafkaClusterEncryptionInTransit = defaults.kafkaClusterEncryptionInTransit;
    	      this.kafkaConnectVersion = defaults.kafkaConnectVersion;
    	      this.logDelivery = defaults.logDelivery;
    	      this.plugins = defaults.plugins;
    	      this.serviceExecutionRoleArn = defaults.serviceExecutionRoleArn;
    	      this.workerConfiguration = defaults.workerConfiguration;
        }

        public Builder capacity(Output<ConnectorCapacityArgs> capacity) {
            this.capacity = Objects.requireNonNull(capacity);
            return this;
        }

        public Builder capacity(ConnectorCapacityArgs capacity) {
            this.capacity = Output.of(Objects.requireNonNull(capacity));
            return this;
        }

        public Builder connectorConfiguration(Output<Object> connectorConfiguration) {
            this.connectorConfiguration = Objects.requireNonNull(connectorConfiguration);
            return this;
        }

        public Builder connectorConfiguration(Object connectorConfiguration) {
            this.connectorConfiguration = Output.of(Objects.requireNonNull(connectorConfiguration));
            return this;
        }

        public Builder connectorDescription(@Nullable Output<String> connectorDescription) {
            this.connectorDescription = connectorDescription;
            return this;
        }

        public Builder connectorDescription(@Nullable String connectorDescription) {
            this.connectorDescription = Output.ofNullable(connectorDescription);
            return this;
        }

        public Builder connectorName(@Nullable Output<String> connectorName) {
            this.connectorName = connectorName;
            return this;
        }

        public Builder connectorName(@Nullable String connectorName) {
            this.connectorName = Output.ofNullable(connectorName);
            return this;
        }

        public Builder kafkaCluster(Output<ConnectorKafkaClusterArgs> kafkaCluster) {
            this.kafkaCluster = Objects.requireNonNull(kafkaCluster);
            return this;
        }

        public Builder kafkaCluster(ConnectorKafkaClusterArgs kafkaCluster) {
            this.kafkaCluster = Output.of(Objects.requireNonNull(kafkaCluster));
            return this;
        }

        public Builder kafkaClusterClientAuthentication(Output<ConnectorKafkaClusterClientAuthenticationArgs> kafkaClusterClientAuthentication) {
            this.kafkaClusterClientAuthentication = Objects.requireNonNull(kafkaClusterClientAuthentication);
            return this;
        }

        public Builder kafkaClusterClientAuthentication(ConnectorKafkaClusterClientAuthenticationArgs kafkaClusterClientAuthentication) {
            this.kafkaClusterClientAuthentication = Output.of(Objects.requireNonNull(kafkaClusterClientAuthentication));
            return this;
        }

        public Builder kafkaClusterEncryptionInTransit(Output<ConnectorKafkaClusterEncryptionInTransitArgs> kafkaClusterEncryptionInTransit) {
            this.kafkaClusterEncryptionInTransit = Objects.requireNonNull(kafkaClusterEncryptionInTransit);
            return this;
        }

        public Builder kafkaClusterEncryptionInTransit(ConnectorKafkaClusterEncryptionInTransitArgs kafkaClusterEncryptionInTransit) {
            this.kafkaClusterEncryptionInTransit = Output.of(Objects.requireNonNull(kafkaClusterEncryptionInTransit));
            return this;
        }

        public Builder kafkaConnectVersion(Output<String> kafkaConnectVersion) {
            this.kafkaConnectVersion = Objects.requireNonNull(kafkaConnectVersion);
            return this;
        }

        public Builder kafkaConnectVersion(String kafkaConnectVersion) {
            this.kafkaConnectVersion = Output.of(Objects.requireNonNull(kafkaConnectVersion));
            return this;
        }

        public Builder logDelivery(@Nullable Output<ConnectorLogDeliveryArgs> logDelivery) {
            this.logDelivery = logDelivery;
            return this;
        }

        public Builder logDelivery(@Nullable ConnectorLogDeliveryArgs logDelivery) {
            this.logDelivery = Output.ofNullable(logDelivery);
            return this;
        }

        public Builder plugins(Output<List<ConnectorPluginArgs>> plugins) {
            this.plugins = Objects.requireNonNull(plugins);
            return this;
        }

        public Builder plugins(List<ConnectorPluginArgs> plugins) {
            this.plugins = Output.of(Objects.requireNonNull(plugins));
            return this;
        }

        public Builder serviceExecutionRoleArn(Output<String> serviceExecutionRoleArn) {
            this.serviceExecutionRoleArn = Objects.requireNonNull(serviceExecutionRoleArn);
            return this;
        }

        public Builder serviceExecutionRoleArn(String serviceExecutionRoleArn) {
            this.serviceExecutionRoleArn = Output.of(Objects.requireNonNull(serviceExecutionRoleArn));
            return this;
        }

        public Builder workerConfiguration(@Nullable Output<ConnectorWorkerConfigurationArgs> workerConfiguration) {
            this.workerConfiguration = workerConfiguration;
            return this;
        }

        public Builder workerConfiguration(@Nullable ConnectorWorkerConfigurationArgs workerConfiguration) {
            this.workerConfiguration = Output.ofNullable(workerConfiguration);
            return this;
        }
        public ConnectorArgs build() {
            return new ConnectorArgs(capacity, connectorConfiguration, connectorDescription, connectorName, kafkaCluster, kafkaClusterClientAuthentication, kafkaClusterEncryptionInTransit, kafkaConnectVersion, logDelivery, plugins, serviceExecutionRoleArn, workerConfiguration);
        }
    }
}
