// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.kafkaconnect.inputs;

import io.pulumi.awsnative.kafkaconnect.enums.ConnectorKafkaClusterClientAuthenticationType;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import java.util.Objects;


/**
 * Details of the client authentication used by the Kafka cluster.
 * 
 */
public final class ConnectorKafkaClusterClientAuthenticationArgs extends io.pulumi.resources.ResourceArgs {

    public static final ConnectorKafkaClusterClientAuthenticationArgs Empty = new ConnectorKafkaClusterClientAuthenticationArgs();

    @Import(name="authenticationType", required=true)
      private final Output<ConnectorKafkaClusterClientAuthenticationType> authenticationType;

    public Output<ConnectorKafkaClusterClientAuthenticationType> getAuthenticationType() {
        return this.authenticationType;
    }

    public ConnectorKafkaClusterClientAuthenticationArgs(Output<ConnectorKafkaClusterClientAuthenticationType> authenticationType) {
        this.authenticationType = Objects.requireNonNull(authenticationType, "expected parameter 'authenticationType' to be non-null");
    }

    private ConnectorKafkaClusterClientAuthenticationArgs() {
        this.authenticationType = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ConnectorKafkaClusterClientAuthenticationArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Output<ConnectorKafkaClusterClientAuthenticationType> authenticationType;

        public Builder() {
    	      // Empty
        }

        public Builder(ConnectorKafkaClusterClientAuthenticationArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.authenticationType = defaults.authenticationType;
        }

        public Builder authenticationType(Output<ConnectorKafkaClusterClientAuthenticationType> authenticationType) {
            this.authenticationType = Objects.requireNonNull(authenticationType);
            return this;
        }
        public Builder authenticationType(ConnectorKafkaClusterClientAuthenticationType authenticationType) {
            this.authenticationType = Output.of(Objects.requireNonNull(authenticationType));
            return this;
        }        public ConnectorKafkaClusterClientAuthenticationArgs build() {
            return new ConnectorKafkaClusterClientAuthenticationArgs(authenticationType);
        }
    }
}
