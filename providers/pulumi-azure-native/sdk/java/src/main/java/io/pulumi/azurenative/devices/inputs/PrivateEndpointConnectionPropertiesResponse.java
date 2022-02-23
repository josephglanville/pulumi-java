// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.devices.inputs;

import io.pulumi.azurenative.devices.inputs.PrivateEndpointResponse;
import io.pulumi.azurenative.devices.inputs.PrivateLinkServiceConnectionStateResponse;
import io.pulumi.core.annotations.InputImport;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * The properties of a private endpoint connection
 * 
 */
public final class PrivateEndpointConnectionPropertiesResponse extends io.pulumi.resources.InvokeArgs {

    public static final PrivateEndpointConnectionPropertiesResponse Empty = new PrivateEndpointConnectionPropertiesResponse();

    /**
     * The private endpoint property of a private endpoint connection
     * 
     */
    @InputImport(name="privateEndpoint")
      private final @Nullable PrivateEndpointResponse privateEndpoint;

    public Optional<PrivateEndpointResponse> getPrivateEndpoint() {
        return this.privateEndpoint == null ? Optional.empty() : Optional.ofNullable(this.privateEndpoint);
    }

    /**
     * The current state of a private endpoint connection
     * 
     */
    @InputImport(name="privateLinkServiceConnectionState", required=true)
      private final PrivateLinkServiceConnectionStateResponse privateLinkServiceConnectionState;

    public PrivateLinkServiceConnectionStateResponse getPrivateLinkServiceConnectionState() {
        return this.privateLinkServiceConnectionState;
    }

    public PrivateEndpointConnectionPropertiesResponse(
        @Nullable PrivateEndpointResponse privateEndpoint,
        PrivateLinkServiceConnectionStateResponse privateLinkServiceConnectionState) {
        this.privateEndpoint = privateEndpoint;
        this.privateLinkServiceConnectionState = Objects.requireNonNull(privateLinkServiceConnectionState, "expected parameter 'privateLinkServiceConnectionState' to be non-null");
    }

    private PrivateEndpointConnectionPropertiesResponse() {
        this.privateEndpoint = null;
        this.privateLinkServiceConnectionState = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(PrivateEndpointConnectionPropertiesResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable PrivateEndpointResponse privateEndpoint;
        private PrivateLinkServiceConnectionStateResponse privateLinkServiceConnectionState;

        public Builder() {
    	      // Empty
        }

        public Builder(PrivateEndpointConnectionPropertiesResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.privateEndpoint = defaults.privateEndpoint;
    	      this.privateLinkServiceConnectionState = defaults.privateLinkServiceConnectionState;
        }

        public Builder setPrivateEndpoint(@Nullable PrivateEndpointResponse privateEndpoint) {
            this.privateEndpoint = privateEndpoint;
            return this;
        }

        public Builder setPrivateLinkServiceConnectionState(PrivateLinkServiceConnectionStateResponse privateLinkServiceConnectionState) {
            this.privateLinkServiceConnectionState = Objects.requireNonNull(privateLinkServiceConnectionState);
            return this;
        }
        public PrivateEndpointConnectionPropertiesResponse build() {
            return new PrivateEndpointConnectionPropertiesResponse(privateEndpoint, privateLinkServiceConnectionState);
        }
    }
}
