// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.appflow.outputs;

import io.pulumi.awsnative.appflow.outputs.ConnectorProfileCredentials;
import io.pulumi.awsnative.appflow.outputs.ConnectorProfileProperties;
import io.pulumi.core.annotations.CustomType;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class ConnectorProfileConfig {
    private final ConnectorProfileCredentials connectorProfileCredentials;
    private final @Nullable ConnectorProfileProperties connectorProfileProperties;

    @CustomType.Constructor
    private ConnectorProfileConfig(
        @CustomType.Parameter("connectorProfileCredentials") ConnectorProfileCredentials connectorProfileCredentials,
        @CustomType.Parameter("connectorProfileProperties") @Nullable ConnectorProfileProperties connectorProfileProperties) {
        this.connectorProfileCredentials = connectorProfileCredentials;
        this.connectorProfileProperties = connectorProfileProperties;
    }

    public ConnectorProfileCredentials getConnectorProfileCredentials() {
        return this.connectorProfileCredentials;
    }
    public Optional<ConnectorProfileProperties> getConnectorProfileProperties() {
        return Optional.ofNullable(this.connectorProfileProperties);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ConnectorProfileConfig defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ConnectorProfileCredentials connectorProfileCredentials;
        private @Nullable ConnectorProfileProperties connectorProfileProperties;

        public Builder() {
    	      // Empty
        }

        public Builder(ConnectorProfileConfig defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.connectorProfileCredentials = defaults.connectorProfileCredentials;
    	      this.connectorProfileProperties = defaults.connectorProfileProperties;
        }

        public Builder connectorProfileCredentials(ConnectorProfileCredentials connectorProfileCredentials) {
            this.connectorProfileCredentials = Objects.requireNonNull(connectorProfileCredentials);
            return this;
        }
        public Builder connectorProfileProperties(@Nullable ConnectorProfileProperties connectorProfileProperties) {
            this.connectorProfileProperties = connectorProfileProperties;
            return this;
        }        public ConnectorProfileConfig build() {
            return new ConnectorProfileConfig(connectorProfileCredentials, connectorProfileProperties);
        }
    }
}
