// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.sql;

import io.pulumi.azurenative.sql.inputs.PrivateEndpointPropertyArgs;
import io.pulumi.azurenative.sql.inputs.PrivateLinkServiceConnectionStatePropertyArgs;
import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class PrivateEndpointConnectionArgs extends io.pulumi.resources.ResourceArgs {

    public static final PrivateEndpointConnectionArgs Empty = new PrivateEndpointConnectionArgs();

    /**
     * Private endpoint which the connection belongs to.
     * 
     */
    @InputImport(name="privateEndpoint")
      private final @Nullable Input<PrivateEndpointPropertyArgs> privateEndpoint;

    public Input<PrivateEndpointPropertyArgs> getPrivateEndpoint() {
        return this.privateEndpoint == null ? Input.empty() : this.privateEndpoint;
    }

    @InputImport(name="privateEndpointConnectionName")
      private final @Nullable Input<String> privateEndpointConnectionName;

    public Input<String> getPrivateEndpointConnectionName() {
        return this.privateEndpointConnectionName == null ? Input.empty() : this.privateEndpointConnectionName;
    }

    /**
     * Connection state of the private endpoint connection.
     * 
     */
    @InputImport(name="privateLinkServiceConnectionState")
      private final @Nullable Input<PrivateLinkServiceConnectionStatePropertyArgs> privateLinkServiceConnectionState;

    public Input<PrivateLinkServiceConnectionStatePropertyArgs> getPrivateLinkServiceConnectionState() {
        return this.privateLinkServiceConnectionState == null ? Input.empty() : this.privateLinkServiceConnectionState;
    }

    /**
     * The name of the resource group that contains the resource. You can obtain this value from the Azure Resource Manager API or the portal.
     * 
     */
    @InputImport(name="resourceGroupName", required=true)
      private final Input<String> resourceGroupName;

    public Input<String> getResourceGroupName() {
        return this.resourceGroupName;
    }

    /**
     * The name of the server.
     * 
     */
    @InputImport(name="serverName", required=true)
      private final Input<String> serverName;

    public Input<String> getServerName() {
        return this.serverName;
    }

    public PrivateEndpointConnectionArgs(
        @Nullable Input<PrivateEndpointPropertyArgs> privateEndpoint,
        @Nullable Input<String> privateEndpointConnectionName,
        @Nullable Input<PrivateLinkServiceConnectionStatePropertyArgs> privateLinkServiceConnectionState,
        Input<String> resourceGroupName,
        Input<String> serverName) {
        this.privateEndpoint = privateEndpoint;
        this.privateEndpointConnectionName = privateEndpointConnectionName;
        this.privateLinkServiceConnectionState = privateLinkServiceConnectionState;
        this.resourceGroupName = Objects.requireNonNull(resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
        this.serverName = Objects.requireNonNull(serverName, "expected parameter 'serverName' to be non-null");
    }

    private PrivateEndpointConnectionArgs() {
        this.privateEndpoint = Input.empty();
        this.privateEndpointConnectionName = Input.empty();
        this.privateLinkServiceConnectionState = Input.empty();
        this.resourceGroupName = Input.empty();
        this.serverName = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(PrivateEndpointConnectionArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<PrivateEndpointPropertyArgs> privateEndpoint;
        private @Nullable Input<String> privateEndpointConnectionName;
        private @Nullable Input<PrivateLinkServiceConnectionStatePropertyArgs> privateLinkServiceConnectionState;
        private Input<String> resourceGroupName;
        private Input<String> serverName;

        public Builder() {
    	      // Empty
        }

        public Builder(PrivateEndpointConnectionArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.privateEndpoint = defaults.privateEndpoint;
    	      this.privateEndpointConnectionName = defaults.privateEndpointConnectionName;
    	      this.privateLinkServiceConnectionState = defaults.privateLinkServiceConnectionState;
    	      this.resourceGroupName = defaults.resourceGroupName;
    	      this.serverName = defaults.serverName;
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

        public Builder setServerName(Input<String> serverName) {
            this.serverName = Objects.requireNonNull(serverName);
            return this;
        }

        public Builder setServerName(String serverName) {
            this.serverName = Input.of(Objects.requireNonNull(serverName));
            return this;
        }
        public PrivateEndpointConnectionArgs build() {
            return new PrivateEndpointConnectionArgs(privateEndpoint, privateEndpointConnectionName, privateLinkServiceConnectionState, resourceGroupName, serverName);
        }
    }
}
