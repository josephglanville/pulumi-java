// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.cognitiveservices.outputs;

import io.pulumi.azurenative.cognitiveservices.outputs.PrivateEndpointResponse;
import io.pulumi.azurenative.cognitiveservices.outputs.PrivateLinkServiceConnectionStateResponse;
import io.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class PrivateEndpointConnectionPropertiesResponse {
    /**
     * The private link resource group ids.
     * 
     */
    private final @Nullable List<String> groupIds;
    /**
     * The resource of private end point.
     * 
     */
    private final @Nullable PrivateEndpointResponse privateEndpoint;
    /**
     * A collection of information about the state of the connection between service consumer and provider.
     * 
     */
    private final PrivateLinkServiceConnectionStateResponse privateLinkServiceConnectionState;

    @CustomType.Constructor
    private PrivateEndpointConnectionPropertiesResponse(
        @CustomType.Parameter("groupIds") @Nullable List<String> groupIds,
        @CustomType.Parameter("privateEndpoint") @Nullable PrivateEndpointResponse privateEndpoint,
        @CustomType.Parameter("privateLinkServiceConnectionState") PrivateLinkServiceConnectionStateResponse privateLinkServiceConnectionState) {
        this.groupIds = groupIds;
        this.privateEndpoint = privateEndpoint;
        this.privateLinkServiceConnectionState = privateLinkServiceConnectionState;
    }

    /**
     * The private link resource group ids.
     * 
    */
    public List<String> getGroupIds() {
        return this.groupIds == null ? List.of() : this.groupIds;
    }
    /**
     * The resource of private end point.
     * 
    */
    public Optional<PrivateEndpointResponse> getPrivateEndpoint() {
        return Optional.ofNullable(this.privateEndpoint);
    }
    /**
     * A collection of information about the state of the connection between service consumer and provider.
     * 
    */
    public PrivateLinkServiceConnectionStateResponse getPrivateLinkServiceConnectionState() {
        return this.privateLinkServiceConnectionState;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(PrivateEndpointConnectionPropertiesResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable List<String> groupIds;
        private @Nullable PrivateEndpointResponse privateEndpoint;
        private PrivateLinkServiceConnectionStateResponse privateLinkServiceConnectionState;

        public Builder() {
    	      // Empty
        }

        public Builder(PrivateEndpointConnectionPropertiesResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.groupIds = defaults.groupIds;
    	      this.privateEndpoint = defaults.privateEndpoint;
    	      this.privateLinkServiceConnectionState = defaults.privateLinkServiceConnectionState;
        }

        public Builder groupIds(@Nullable List<String> groupIds) {
            this.groupIds = groupIds;
            return this;
        }
        public Builder groupIds(String... groupIds) {
            return groupIds(List.of(groupIds));
        }
        public Builder privateEndpoint(@Nullable PrivateEndpointResponse privateEndpoint) {
            this.privateEndpoint = privateEndpoint;
            return this;
        }
        public Builder privateLinkServiceConnectionState(PrivateLinkServiceConnectionStateResponse privateLinkServiceConnectionState) {
            this.privateLinkServiceConnectionState = Objects.requireNonNull(privateLinkServiceConnectionState);
            return this;
        }        public PrivateEndpointConnectionPropertiesResponse build() {
            return new PrivateEndpointConnectionPropertiesResponse(groupIds, privateEndpoint, privateLinkServiceConnectionState);
        }
    }
}
