// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.migrate.outputs;

import io.pulumi.azurenative.migrate.outputs.PrivateLinkServiceConnectionStateResponse;
import io.pulumi.azurenative.migrate.outputs.ResourceIdResponse;
import io.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class PrivateEndpointConnectionPropertiesResponse {
    /**
     * ARM id for the private endpoint resource corresponding to the connection.
     * 
     */
    private final ResourceIdResponse privateEndpoint;
    /**
     * State of the private endpoint connection.
     * 
     */
    private final @Nullable PrivateLinkServiceConnectionStateResponse privateLinkServiceConnectionState;
    /**
     * Indicates whether there is an ongoing operation on the private endpoint.
     * 
     */
    private final String provisioningState;

    @CustomType.Constructor
    private PrivateEndpointConnectionPropertiesResponse(
        @CustomType.Parameter("privateEndpoint") ResourceIdResponse privateEndpoint,
        @CustomType.Parameter("privateLinkServiceConnectionState") @Nullable PrivateLinkServiceConnectionStateResponse privateLinkServiceConnectionState,
        @CustomType.Parameter("provisioningState") String provisioningState) {
        this.privateEndpoint = privateEndpoint;
        this.privateLinkServiceConnectionState = privateLinkServiceConnectionState;
        this.provisioningState = provisioningState;
    }

    /**
     * ARM id for the private endpoint resource corresponding to the connection.
     * 
    */
    public ResourceIdResponse getPrivateEndpoint() {
        return this.privateEndpoint;
    }
    /**
     * State of the private endpoint connection.
     * 
    */
    public Optional<PrivateLinkServiceConnectionStateResponse> getPrivateLinkServiceConnectionState() {
        return Optional.ofNullable(this.privateLinkServiceConnectionState);
    }
    /**
     * Indicates whether there is an ongoing operation on the private endpoint.
     * 
    */
    public String getProvisioningState() {
        return this.provisioningState;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(PrivateEndpointConnectionPropertiesResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ResourceIdResponse privateEndpoint;
        private @Nullable PrivateLinkServiceConnectionStateResponse privateLinkServiceConnectionState;
        private String provisioningState;

        public Builder() {
    	      // Empty
        }

        public Builder(PrivateEndpointConnectionPropertiesResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.privateEndpoint = defaults.privateEndpoint;
    	      this.privateLinkServiceConnectionState = defaults.privateLinkServiceConnectionState;
    	      this.provisioningState = defaults.provisioningState;
        }

        public Builder privateEndpoint(ResourceIdResponse privateEndpoint) {
            this.privateEndpoint = Objects.requireNonNull(privateEndpoint);
            return this;
        }
        public Builder privateLinkServiceConnectionState(@Nullable PrivateLinkServiceConnectionStateResponse privateLinkServiceConnectionState) {
            this.privateLinkServiceConnectionState = privateLinkServiceConnectionState;
            return this;
        }
        public Builder provisioningState(String provisioningState) {
            this.provisioningState = Objects.requireNonNull(provisioningState);
            return this;
        }        public PrivateEndpointConnectionPropertiesResponse build() {
            return new PrivateEndpointConnectionPropertiesResponse(privateEndpoint, privateLinkServiceConnectionState, provisioningState);
        }
    }
}
