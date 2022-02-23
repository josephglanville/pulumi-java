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
import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.Object;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


public final class ConnectorArgs extends io.pulumi.resources.ResourceArgs {

    public static final ConnectorArgs Empty = new ConnectorArgs();

    @InputImport(name="capacity", required=true)
      private final Input<ConnectorCapacityArgs> capacity;

    public Input<ConnectorCapacityArgs> getCapacity() {
        return this.capacity;
    }

    /**
     * The configuration for the connector.
     * 
     */
    @InputImport(name="connectorConfiguration", required=true)
      private final Input<Object> connectorConfiguration;

    public Input<Object> getConnectorConfiguration() {
        return this.connectorConfiguration;
    }

    /**
     * A summary description of the connector.
     * 
     */
    @InputImport(name="connectorDescription")
      private final @Nullable Input<String> connectorDescription;

    public Input<String> getConnectorDescription() {
        return this.connectorDescription == null ? Input.empty() : this.connectorDescription;
    }

    /**
     * The name of the connector.
     * 
     */
    @InputImport(name="connectorName")
      private final @Nullable Input<String> connectorName;

    public Input<String> getConnectorName() {
        return this.connectorName == null ? Input.empty() : this.connectorName;
    }

    @InputImport(name="kafkaCluster", required=true)
      private final Input<ConnectorKafkaClusterArgs> kafkaCluster;

    public Input<ConnectorKafkaClusterArgs> getKafkaCluster() {
        return this.kafkaCluster;
    }

    @InputImport(name="kafkaClusterClientAuthentication", required=true)
      private final Input<ConnectorKafkaClusterClientAuthenticationArgs> kafkaClusterClientAuthentication;

    public Input<ConnectorKafkaClusterClientAuthenticationArgs> getKafkaClusterClientAuthentication() {
        return this.kafkaClusterClientAuthentication;
    }

    @InputImport(name="kafkaClusterEncryptionInTransit", required=true)
      private final Input<ConnectorKafkaClusterEncryptionInTransitArgs> kafkaClusterEncryptionInTransit;

    public Input<ConnectorKafkaClusterEncryptionInTransitArgs> getKafkaClusterEncryptionInTransit() {
        return this.kafkaClusterEncryptionInTransit;
    }

    /**
     * The version of Kafka Connect. It has to be compatible with both the Kafka cluster's version and the plugins.
     * 
     */
    @InputImport(name="kafkaConnectVersion", required=true)
      private final Input<String> kafkaConnectVersion;

    public Input<String> getKafkaConnectVersion() {
        return this.kafkaConnectVersion;
    }

    @InputImport(name="logDelivery")
      private final @Nullable Input<ConnectorLogDeliveryArgs> logDelivery;

    public Input<ConnectorLogDeliveryArgs> getLogDelivery() {
        return this.logDelivery == null ? Input.empty() : this.logDelivery;
    }

    /**
     * List of plugins to use with the connector.
     * 
     */
    @InputImport(name="plugins", required=true)
      private final Input<List<ConnectorPluginArgs>> plugins;

    public Input<List<ConnectorPluginArgs>> getPlugins() {
        return this.plugins;
    }

    /**
     * The Amazon Resource Name (ARN) of the IAM role used by the connector to access Amazon S3 objects and other external resources.
     * 
     */
    @InputImport(name="serviceExecutionRoleArn", required=true)
      private final Input<String> serviceExecutionRoleArn;

    public Input<String> getServiceExecutionRoleArn() {
        return this.serviceExecutionRoleArn;
    }

    @InputImport(name="workerConfiguration")
      private final @Nullable Input<ConnectorWorkerConfigurationArgs> workerConfiguration;

    public Input<ConnectorWorkerConfigurationArgs> getWorkerConfiguration() {
        return this.workerConfiguration == null ? Input.empty() : this.workerConfiguration;
    }

    public ConnectorArgs(
        Input<ConnectorCapacityArgs> capacity,
        Input<Object> connectorConfiguration,
        @Nullable Input<String> connectorDescription,
        @Nullable Input<String> connectorName,
        Input<ConnectorKafkaClusterArgs> kafkaCluster,
        Input<ConnectorKafkaClusterClientAuthenticationArgs> kafkaClusterClientAuthentication,
        Input<ConnectorKafkaClusterEncryptionInTransitArgs> kafkaClusterEncryptionInTransit,
        Input<String> kafkaConnectVersion,
        @Nullable Input<ConnectorLogDeliveryArgs> logDelivery,
        Input<List<ConnectorPluginArgs>> plugins,
        Input<String> serviceExecutionRoleArn,
        @Nullable Input<ConnectorWorkerConfigurationArgs> workerConfiguration) {
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
        this.capacity = Input.empty();
        this.connectorConfiguration = Input.empty();
        this.connectorDescription = Input.empty();
        this.connectorName = Input.empty();
        this.kafkaCluster = Input.empty();
        this.kafkaClusterClientAuthentication = Input.empty();
        this.kafkaClusterEncryptionInTransit = Input.empty();
        this.kafkaConnectVersion = Input.empty();
        this.logDelivery = Input.empty();
        this.plugins = Input.empty();
        this.serviceExecutionRoleArn = Input.empty();
        this.workerConfiguration = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ConnectorArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Input<ConnectorCapacityArgs> capacity;
        private Input<Object> connectorConfiguration;
        private @Nullable Input<String> connectorDescription;
        private @Nullable Input<String> connectorName;
        private Input<ConnectorKafkaClusterArgs> kafkaCluster;
        private Input<ConnectorKafkaClusterClientAuthenticationArgs> kafkaClusterClientAuthentication;
        private Input<ConnectorKafkaClusterEncryptionInTransitArgs> kafkaClusterEncryptionInTransit;
        private Input<String> kafkaConnectVersion;
        private @Nullable Input<ConnectorLogDeliveryArgs> logDelivery;
        private Input<List<ConnectorPluginArgs>> plugins;
        private Input<String> serviceExecutionRoleArn;
        private @Nullable Input<ConnectorWorkerConfigurationArgs> workerConfiguration;

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

        public Builder setCapacity(Input<ConnectorCapacityArgs> capacity) {
            this.capacity = Objects.requireNonNull(capacity);
            return this;
        }

        public Builder setCapacity(ConnectorCapacityArgs capacity) {
            this.capacity = Input.of(Objects.requireNonNull(capacity));
            return this;
        }

        public Builder setConnectorConfiguration(Input<Object> connectorConfiguration) {
            this.connectorConfiguration = Objects.requireNonNull(connectorConfiguration);
            return this;
        }

        public Builder setConnectorConfiguration(Object connectorConfiguration) {
            this.connectorConfiguration = Input.of(Objects.requireNonNull(connectorConfiguration));
            return this;
        }

        public Builder setConnectorDescription(@Nullable Input<String> connectorDescription) {
            this.connectorDescription = connectorDescription;
            return this;
        }

        public Builder setConnectorDescription(@Nullable String connectorDescription) {
            this.connectorDescription = Input.ofNullable(connectorDescription);
            return this;
        }

        public Builder setConnectorName(@Nullable Input<String> connectorName) {
            this.connectorName = connectorName;
            return this;
        }

        public Builder setConnectorName(@Nullable String connectorName) {
            this.connectorName = Input.ofNullable(connectorName);
            return this;
        }

        public Builder setKafkaCluster(Input<ConnectorKafkaClusterArgs> kafkaCluster) {
            this.kafkaCluster = Objects.requireNonNull(kafkaCluster);
            return this;
        }

        public Builder setKafkaCluster(ConnectorKafkaClusterArgs kafkaCluster) {
            this.kafkaCluster = Input.of(Objects.requireNonNull(kafkaCluster));
            return this;
        }

        public Builder setKafkaClusterClientAuthentication(Input<ConnectorKafkaClusterClientAuthenticationArgs> kafkaClusterClientAuthentication) {
            this.kafkaClusterClientAuthentication = Objects.requireNonNull(kafkaClusterClientAuthentication);
            return this;
        }

        public Builder setKafkaClusterClientAuthentication(ConnectorKafkaClusterClientAuthenticationArgs kafkaClusterClientAuthentication) {
            this.kafkaClusterClientAuthentication = Input.of(Objects.requireNonNull(kafkaClusterClientAuthentication));
            return this;
        }

        public Builder setKafkaClusterEncryptionInTransit(Input<ConnectorKafkaClusterEncryptionInTransitArgs> kafkaClusterEncryptionInTransit) {
            this.kafkaClusterEncryptionInTransit = Objects.requireNonNull(kafkaClusterEncryptionInTransit);
            return this;
        }

        public Builder setKafkaClusterEncryptionInTransit(ConnectorKafkaClusterEncryptionInTransitArgs kafkaClusterEncryptionInTransit) {
            this.kafkaClusterEncryptionInTransit = Input.of(Objects.requireNonNull(kafkaClusterEncryptionInTransit));
            return this;
        }

        public Builder setKafkaConnectVersion(Input<String> kafkaConnectVersion) {
            this.kafkaConnectVersion = Objects.requireNonNull(kafkaConnectVersion);
            return this;
        }

        public Builder setKafkaConnectVersion(String kafkaConnectVersion) {
            this.kafkaConnectVersion = Input.of(Objects.requireNonNull(kafkaConnectVersion));
            return this;
        }

        public Builder setLogDelivery(@Nullable Input<ConnectorLogDeliveryArgs> logDelivery) {
            this.logDelivery = logDelivery;
            return this;
        }

        public Builder setLogDelivery(@Nullable ConnectorLogDeliveryArgs logDelivery) {
            this.logDelivery = Input.ofNullable(logDelivery);
            return this;
        }

        public Builder setPlugins(Input<List<ConnectorPluginArgs>> plugins) {
            this.plugins = Objects.requireNonNull(plugins);
            return this;
        }

        public Builder setPlugins(List<ConnectorPluginArgs> plugins) {
            this.plugins = Input.of(Objects.requireNonNull(plugins));
            return this;
        }

        public Builder setServiceExecutionRoleArn(Input<String> serviceExecutionRoleArn) {
            this.serviceExecutionRoleArn = Objects.requireNonNull(serviceExecutionRoleArn);
            return this;
        }

        public Builder setServiceExecutionRoleArn(String serviceExecutionRoleArn) {
            this.serviceExecutionRoleArn = Input.of(Objects.requireNonNull(serviceExecutionRoleArn));
            return this;
        }

        public Builder setWorkerConfiguration(@Nullable Input<ConnectorWorkerConfigurationArgs> workerConfiguration) {
            this.workerConfiguration = workerConfiguration;
            return this;
        }

        public Builder setWorkerConfiguration(@Nullable ConnectorWorkerConfigurationArgs workerConfiguration) {
            this.workerConfiguration = Input.ofNullable(workerConfiguration);
            return this;
        }
        public ConnectorArgs build() {
            return new ConnectorArgs(capacity, connectorConfiguration, connectorDescription, connectorName, kafkaCluster, kafkaClusterClientAuthentication, kafkaClusterEncryptionInTransit, kafkaConnectVersion, logDelivery, plugins, serviceExecutionRoleArn, workerConfiguration);
        }
    }
}
