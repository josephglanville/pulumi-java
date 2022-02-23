// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.automation;

import io.pulumi.azurenative.automation.inputs.PrivateEndpointPropertyArgs;
import io.pulumi.azurenative.automation.inputs.PrivateLinkServiceConnectionStatePropertyArgs;
import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class PrivateEndpointConnectionArgs extends io.pulumi.resources.ResourceArgs {

    public static final PrivateEndpointConnectionArgs Empty = new PrivateEndpointConnectionArgs();

    /**
     * The name of the automation account.
     * 
     */
    @InputImport(name="automationAccountName", required=true)
      private final Input<String> automationAccountName;

    public Input<String> getAutomationAccountName() {
        return this.automationAccountName;
    }

    /**
     * Private endpoint which the connection belongs to.
     * 
     */
    @InputImport(name="privateEndpoint")
      private final @Nullable Input<PrivateEndpointPropertyArgs> privateEndpoint;

    public Input<PrivateEndpointPropertyArgs> getPrivateEndpoint() {
        return this.privateEndpoint == null ? Input.empty() : this.privateEndpoint;
    }

    /**
     * The name of the private endpoint connection.
     * 
     */
    @InputImport(name="privateEndpointConnectionName")
      private final @Nullable Input<String> privateEndpointConnectionName;

    public Input<String> getPrivateEndpointConnectionName() {
        return this.privateEndpointConnectionName == null ? Input.empty() : this.privateEndpointConnectionName;
    }

    /**
     * Connection State of the Private Endpoint Connection.
     * 
     */
    @InputImport(name="privateLinkServiceConnectionState")
      private final @Nullable Input<PrivateLinkServiceConnectionStatePropertyArgs> privateLinkServiceConnectionState;

    public Input<PrivateLinkServiceConnectionStatePropertyArgs> getPrivateLinkServiceConnectionState() {
        return this.privateLinkServiceConnectionState == null ? Input.empty() : this.privateLinkServiceConnectionState;
    }

    /**
     * Name of an Azure Resource group.
     * 
     */
    @InputImport(name="resourceGroupName", required=true)
      private final Input<String> resourceGroupName;

    public Input<String> getResourceGroupName() {
        return this.resourceGroupName;
    }

    public PrivateEndpointConnectionArgs(
        Input<String> automationAccountName,
        @Nullable Input<PrivateEndpointPropertyArgs> privateEndpoint,
        @Nullable Input<String> privateEndpointConnectionName,
        @Nullable Input<PrivateLinkServiceConnectionStatePropertyArgs> privateLinkServiceConnectionState,
        Input<String> resourceGroupName) {
        this.automationAccountName = Objects.requireNonNull(automationAccountName, "expected parameter 'automationAccountName' to be non-null");
        this.privateEndpoint = privateEndpoint;
        this.privateEndpointConnectionName = privateEndpointConnectionName;
        this.privateLinkServiceConnectionState = privateLinkServiceConnectionState;
        this.resourceGroupName = Objects.requireNonNull(resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
    }

    private PrivateEndpointConnectionArgs() {
        this.automationAccountName = Input.empty();
        this.privateEndpoint = Input.empty();
        this.privateEndpointConnectionName = Input.empty();
        this.privateLinkServiceConnectionState = Input.empty();
        this.resourceGroupName = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(PrivateEndpointConnectionArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Input<String> automationAccountName;
        private @Nullable Input<PrivateEndpointPropertyArgs> privateEndpoint;
        private @Nullable Input<String> privateEndpointConnectionName;
        private @Nullable Input<PrivateLinkServiceConnectionStatePropertyArgs> privateLinkServiceConnectionState;
        private Input<String> resourceGroupName;

        public Builder() {
    	      // Empty
        }

        public Builder(PrivateEndpointConnectionArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.automationAccountName = defaults.automationAccountName;
    	      this.privateEndpoint = defaults.privateEndpoint;
    	      this.privateEndpointConnectionName = defaults.privateEndpointConnectionName;
    	      this.privateLinkServiceConnectionState = defaults.privateLinkServiceConnectionState;
    	      this.resourceGroupName = defaults.resourceGroupName;
        }

        public Builder setAutomationAccountName(Input<String> automationAccountName) {
            this.automationAccountName = Objects.requireNonNull(automationAccountName);
            return this;
        }

        public Builder setAutomationAccountName(String automationAccountName) {
            this.automationAccountName = Input.of(Objects.requireNonNull(automationAccountName));
            return this;
        }

        public Builder setPrivateEndpoint(@Nullable Input<PrivateEndpointPropertyArgs> privateEndpoint) {
            this.privateEndpoint = privateEndpoint;
            return this;
        }

        public Builder setPrivateEndpoint(@Nullable PrivateEndpointPropertyArgs privateEndpoint) {
            this.privateEndpoint = Input.ofNullable(privateEndpoint);
            return this;
        }

        public Builder setPrivateEndpointConnectionName(@Nullable Input<String> privateEndpointConnectionName) {
            this.privateEndpointConnectionName = privateEndpointConnectionName;
            return this;
        }

        public Builder setPrivateEndpointConnectionName(@Nullable String privateEndpointConnectionName) {
            this.privateEndpointConnectionName = Input.ofNullable(privateEndpointConnectionName);
            return this;
        }

        public Builder setPrivateLinkServiceConnectionState(@Nullable Input<PrivateLinkServiceConnectionStatePropertyArgs> privateLinkServiceConnectionState) {
            this.privateLinkServiceConnectionState = privateLinkServiceConnectionState;
            return this;
        }

        public Builder setPrivateLinkServiceConnectionState(@Nullable PrivateLinkServiceConnectionStatePropertyArgs privateLinkServiceConnectionState) {
            this.privateLinkServiceConnectionState = Input.ofNullable(privateLinkServiceConnectionState);
            return this;
        }

        public Builder setResourceGroupName(Input<String> resourceGroupName) {
            this.resourceGroupName = Objects.requireNonNull(resourceGroupName);
            return this;
        }

        public Builder setResourceGroupName(String resourceGroupName) {
            this.resourceGroupName = Input.of(Objects.requireNonNull(resourceGroupName));
            return this;
        }
        public PrivateEndpointConnectionArgs build() {
            return new PrivateEndpointConnectionArgs(automationAccountName, privateEndpoint, privateEndpointConnectionName, privateLinkServiceConnectionState, resourceGroupName);
        }
    }
}
