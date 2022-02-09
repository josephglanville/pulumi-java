// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.dbformysql.inputs;

import io.pulumi.azurenative.dbformysql.inputs.PrivateEndpointPropertyResponse;
import io.pulumi.azurenative.dbformysql.inputs.ServerPrivateLinkServiceConnectionStatePropertyResponse;
import io.pulumi.core.internal.annotations.InputImport;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class ServerPrivateEndpointConnectionPropertiesResponse extends io.pulumi.resources.InvokeArgs {

    public static final ServerPrivateEndpointConnectionPropertiesResponse Empty = new ServerPrivateEndpointConnectionPropertiesResponse();

    @InputImport(name="privateEndpoint")
    private final @Nullable PrivateEndpointPropertyResponse privateEndpoint;

    public Optional<PrivateEndpointPropertyResponse> getPrivateEndpoint() {
        return this.privateEndpoint == null ? Optional.empty() : Optional.ofNullable(this.privateEndpoint);
    }

    @InputImport(name="privateLinkServiceConnectionState")
    private final @Nullable ServerPrivateLinkServiceConnectionStatePropertyResponse privateLinkServiceConnectionState;

    public Optional<ServerPrivateLinkServiceConnectionStatePropertyResponse> getPrivateLinkServiceConnectionState() {
        return this.privateLinkServiceConnectionState == null ? Optional.empty() : Optional.ofNullable(this.privateLinkServiceConnectionState);
    }

    @InputImport(name="provisioningState", required=true)
    private final String provisioningState;

    public String getProvisioningState() {
        return this.provisioningState;
    }

    public ServerPrivateEndpointConnectionPropertiesResponse(
        @Nullable PrivateEndpointPropertyResponse privateEndpoint,
        @Nullable ServerPrivateLinkServiceConnectionStatePropertyResponse privateLinkServiceConnectionState,
        String provisioningState) {
        this.privateEndpoint = privateEndpoint;
        this.privateLinkServiceConnectionState = privateLinkServiceConnectionState;
        this.provisioningState = Objects.requireNonNull(provisioningState, "expected parameter 'provisioningState' to be non-null");
    }

    private ServerPrivateEndpointConnectionPropertiesResponse() {
        this.privateEndpoint = null;
        this.privateLinkServiceConnectionState = null;
        this.provisioningState = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ServerPrivateEndpointConnectionPropertiesResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable PrivateEndpointPropertyResponse privateEndpoint;
        private @Nullable ServerPrivateLinkServiceConnectionStatePropertyResponse privateLinkServiceConnectionState;
        private String provisioningState;

        public Builder() {
    	      // Empty
        }

        public Builder(ServerPrivateEndpointConnectionPropertiesResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.privateEndpoint = defaults.privateEndpoint;
    	      this.privateLinkServiceConnectionState = defaults.privateLinkServiceConnectionState;
    	      this.provisioningState = defaults.provisioningState;
        }

        public Builder setPrivateEndpoint(@Nullable PrivateEndpointPropertyResponse privateEndpoint) {
            this.privateEndpoint = privateEndpoint;
            return this;
        }

        public Builder setPrivateLinkServiceConnectionState(@Nullable ServerPrivateLinkServiceConnectionStatePropertyResponse privateLinkServiceConnectionState) {
            this.privateLinkServiceConnectionState = privateLinkServiceConnectionState;
            return this;
        }

        public Builder setProvisioningState(String provisioningState) {
            this.provisioningState = Objects.requireNonNull(provisioningState);
            return this;
        }

        public ServerPrivateEndpointConnectionPropertiesResponse build() {
            return new ServerPrivateEndpointConnectionPropertiesResponse(privateEndpoint, privateLinkServiceConnectionState, provisioningState);
        }
    }
}
