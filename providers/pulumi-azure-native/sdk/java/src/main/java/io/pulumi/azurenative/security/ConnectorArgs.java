// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.security;

import io.pulumi.azurenative.security.inputs.AwAssumeRoleAuthenticationDetailsPropertiesArgs;
import io.pulumi.azurenative.security.inputs.AwsCredsAuthenticationDetailsPropertiesArgs;
import io.pulumi.azurenative.security.inputs.GcpCredentialsDetailsPropertiesArgs;
import io.pulumi.azurenative.security.inputs.HybridComputeSettingsPropertiesArgs;
import io.pulumi.core.Input;
import io.pulumi.core.internal.annotations.InputImport;
import java.lang.Object;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class ConnectorArgs extends io.pulumi.resources.ResourceArgs {

    public static final ConnectorArgs Empty = new ConnectorArgs();

    @InputImport(name="authenticationDetails")
    private final @Nullable Input<Object> authenticationDetails;

    public Input<Object> getAuthenticationDetails() {
        return this.authenticationDetails == null ? Input.empty() : this.authenticationDetails;
    }

    @InputImport(name="connectorName")
    private final @Nullable Input<String> connectorName;

    public Input<String> getConnectorName() {
        return this.connectorName == null ? Input.empty() : this.connectorName;
    }

    @InputImport(name="hybridComputeSettings")
    private final @Nullable Input<HybridComputeSettingsPropertiesArgs> hybridComputeSettings;

    public Input<HybridComputeSettingsPropertiesArgs> getHybridComputeSettings() {
        return this.hybridComputeSettings == null ? Input.empty() : this.hybridComputeSettings;
    }

    public ConnectorArgs(
        @Nullable Input<Object> authenticationDetails,
        @Nullable Input<String> connectorName,
        @Nullable Input<HybridComputeSettingsPropertiesArgs> hybridComputeSettings) {
        this.authenticationDetails = authenticationDetails;
        this.connectorName = connectorName;
        this.hybridComputeSettings = hybridComputeSettings;
    }

    private ConnectorArgs() {
        this.authenticationDetails = Input.empty();
        this.connectorName = Input.empty();
        this.hybridComputeSettings = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ConnectorArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<Object> authenticationDetails;
        private @Nullable Input<String> connectorName;
        private @Nullable Input<HybridComputeSettingsPropertiesArgs> hybridComputeSettings;

        public Builder() {
    	      // Empty
        }

        public Builder(ConnectorArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.authenticationDetails = defaults.authenticationDetails;
    	      this.connectorName = defaults.connectorName;
    	      this.hybridComputeSettings = defaults.hybridComputeSettings;
        }

        public Builder setAuthenticationDetails(@Nullable Input<Object> authenticationDetails) {
            this.authenticationDetails = authenticationDetails;
            return this;
        }

        public Builder setAuthenticationDetails(@Nullable Object authenticationDetails) {
            this.authenticationDetails = Input.ofNullable(authenticationDetails);
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

        public Builder setHybridComputeSettings(@Nullable Input<HybridComputeSettingsPropertiesArgs> hybridComputeSettings) {
            this.hybridComputeSettings = hybridComputeSettings;
            return this;
        }

        public Builder setHybridComputeSettings(@Nullable HybridComputeSettingsPropertiesArgs hybridComputeSettings) {
            this.hybridComputeSettings = Input.ofNullable(hybridComputeSettings);
            return this;
        }

        public ConnectorArgs build() {
            return new ConnectorArgs(authenticationDetails, connectorName, hybridComputeSettings);
        }
    }
}
