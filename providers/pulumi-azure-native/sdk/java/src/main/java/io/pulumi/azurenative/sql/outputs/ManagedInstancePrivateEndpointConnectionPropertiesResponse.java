// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.sql.outputs;

import io.pulumi.azurenative.sql.outputs.ManagedInstancePrivateEndpointPropertyResponse;
import io.pulumi.azurenative.sql.outputs.ManagedInstancePrivateLinkServiceConnectionStatePropertyResponse;
import io.pulumi.core.internal.annotations.OutputCustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class ManagedInstancePrivateEndpointConnectionPropertiesResponse {
    private final @Nullable ManagedInstancePrivateEndpointPropertyResponse privateEndpoint;
    private final @Nullable ManagedInstancePrivateLinkServiceConnectionStatePropertyResponse privateLinkServiceConnectionState;
    private final String provisioningState;

    @OutputCustomType.Constructor({"privateEndpoint","privateLinkServiceConnectionState","provisioningState"})
    private ManagedInstancePrivateEndpointConnectionPropertiesResponse(
        @Nullable ManagedInstancePrivateEndpointPropertyResponse privateEndpoint,
        @Nullable ManagedInstancePrivateLinkServiceConnectionStatePropertyResponse privateLinkServiceConnectionState,
        String provisioningState) {
        this.privateEndpoint = privateEndpoint;
        this.privateLinkServiceConnectionState = privateLinkServiceConnectionState;
        this.provisioningState = Objects.requireNonNull(provisioningState);
    }

    public Optional<ManagedInstancePrivateEndpointPropertyResponse> getPrivateEndpoint() {
        return Optional.ofNullable(this.privateEndpoint);
    }
    public Optional<ManagedInstancePrivateLinkServiceConnectionStatePropertyResponse> getPrivateLinkServiceConnectionState() {
        return Optional.ofNullable(this.privateLinkServiceConnectionState);
    }
    public String getProvisioningState() {
        return this.provisioningState;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ManagedInstancePrivateEndpointConnectionPropertiesResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable ManagedInstancePrivateEndpointPropertyResponse privateEndpoint;
        private @Nullable ManagedInstancePrivateLinkServiceConnectionStatePropertyResponse privateLinkServiceConnectionState;
        private String provisioningState;

        public Builder() {
    	      // Empty
        }

        public Builder(ManagedInstancePrivateEndpointConnectionPropertiesResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.privateEndpoint = defaults.privateEndpoint;
    	      this.privateLinkServiceConnectionState = defaults.privateLinkServiceConnectionState;
    	      this.provisioningState = defaults.provisioningState;
        }

        public Builder setPrivateEndpoint(@Nullable ManagedInstancePrivateEndpointPropertyResponse privateEndpoint) {
            this.privateEndpoint = privateEndpoint;
            return this;
        }

        public Builder setPrivateLinkServiceConnectionState(@Nullable ManagedInstancePrivateLinkServiceConnectionStatePropertyResponse privateLinkServiceConnectionState) {
            this.privateLinkServiceConnectionState = privateLinkServiceConnectionState;
            return this;
        }

        public Builder setProvisioningState(String provisioningState) {
            this.provisioningState = Objects.requireNonNull(provisioningState);
            return this;
        }

        public ManagedInstancePrivateEndpointConnectionPropertiesResponse build() {
            return new ManagedInstancePrivateEndpointConnectionPropertiesResponse(privateEndpoint, privateLinkServiceConnectionState, provisioningState);
        }
    }
}
