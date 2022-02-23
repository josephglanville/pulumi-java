// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.appflow.inputs;

import io.pulumi.awsnative.appflow.inputs.ConnectorProfileCredentialsArgs;
import io.pulumi.awsnative.appflow.inputs.ConnectorProfilePropertiesArgs;
import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * Connector specific configurations needed to create connector profile
 * 
 */
public final class ConnectorProfileConfigArgs extends io.pulumi.resources.ResourceArgs {

    public static final ConnectorProfileConfigArgs Empty = new ConnectorProfileConfigArgs();

    @InputImport(name="connectorProfileCredentials", required=true)
      private final Input<ConnectorProfileCredentialsArgs> connectorProfileCredentials;

    public Input<ConnectorProfileCredentialsArgs> getConnectorProfileCredentials() {
        return this.connectorProfileCredentials;
    }

    @InputImport(name="connectorProfileProperties")
      private final @Nullable Input<ConnectorProfilePropertiesArgs> connectorProfileProperties;

    public Input<ConnectorProfilePropertiesArgs> getConnectorProfileProperties() {
        return this.connectorProfileProperties == null ? Input.empty() : this.connectorProfileProperties;
    }

    public ConnectorProfileConfigArgs(
        Input<ConnectorProfileCredentialsArgs> connectorProfileCredentials,
        @Nullable Input<ConnectorProfilePropertiesArgs> connectorProfileProperties) {
        this.connectorProfileCredentials = Objects.requireNonNull(connectorProfileCredentials, "expected parameter 'connectorProfileCredentials' to be non-null");
        this.connectorProfileProperties = connectorProfileProperties;
    }

    private ConnectorProfileConfigArgs() {
        this.connectorProfileCredentials = Input.empty();
        this.connectorProfileProperties = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ConnectorProfileConfigArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Input<ConnectorProfileCredentialsArgs> connectorProfileCredentials;
        private @Nullable Input<ConnectorProfilePropertiesArgs> connectorProfileProperties;

        public Builder() {
    	      // Empty
        }

        public Builder(ConnectorProfileConfigArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.connectorProfileCredentials = defaults.connectorProfileCredentials;
    	      this.connectorProfileProperties = defaults.connectorProfileProperties;
        }

        public Builder setConnectorProfileCredentials(Input<ConnectorProfileCredentialsArgs> connectorProfileCredentials) {
            this.connectorProfileCredentials = Objects.requireNonNull(connectorProfileCredentials);
            return this;
        }

        public Builder setConnectorProfileCredentials(ConnectorProfileCredentialsArgs connectorProfileCredentials) {
            this.connectorProfileCredentials = Input.of(Objects.requireNonNull(connectorProfileCredentials));
            return this;
        }

        public Builder setConnectorProfileProperties(@Nullable Input<ConnectorProfilePropertiesArgs> connectorProfileProperties) {
            this.connectorProfileProperties = connectorProfileProperties;
            return this;
        }

        public Builder setConnectorProfileProperties(@Nullable ConnectorProfilePropertiesArgs connectorProfileProperties) {
            this.connectorProfileProperties = Input.ofNullable(connectorProfileProperties);
            return this;
        }
        public ConnectorProfileConfigArgs build() {
            return new ConnectorProfileConfigArgs(connectorProfileCredentials, connectorProfileProperties);
        }
    }
}
