// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.webpubsub.outputs;

import io.pulumi.azurenative.webpubsub.outputs.PrivateEndpointResponse;
import io.pulumi.azurenative.webpubsub.outputs.PrivateLinkServiceConnectionStateResponse;
import io.pulumi.azurenative.webpubsub.outputs.SystemDataResponse;
import io.pulumi.core.internal.annotations.OutputCustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class GetWebPubSubPrivateEndpointConnectionResult {
    private final String id;
    private final String name;
    private final @Nullable PrivateEndpointResponse privateEndpoint;
    private final @Nullable PrivateLinkServiceConnectionStateResponse privateLinkServiceConnectionState;
    private final String provisioningState;
    private final SystemDataResponse systemData;
    private final String type;

    @OutputCustomType.Constructor({"id","name","privateEndpoint","privateLinkServiceConnectionState","provisioningState","systemData","type"})
    private GetWebPubSubPrivateEndpointConnectionResult(
        String id,
        String name,
        @Nullable PrivateEndpointResponse privateEndpoint,
        @Nullable PrivateLinkServiceConnectionStateResponse privateLinkServiceConnectionState,
        String provisioningState,
        SystemDataResponse systemData,
        String type) {
        this.id = Objects.requireNonNull(id);
        this.name = Objects.requireNonNull(name);
        this.privateEndpoint = privateEndpoint;
        this.privateLinkServiceConnectionState = privateLinkServiceConnectionState;
        this.provisioningState = Objects.requireNonNull(provisioningState);
        this.systemData = Objects.requireNonNull(systemData);
        this.type = Objects.requireNonNull(type);
    }

    public String getId() {
        return this.id;
    }
    public String getName() {
        return this.name;
    }
    public Optional<PrivateEndpointResponse> getPrivateEndpoint() {
        return Optional.ofNullable(this.privateEndpoint);
    }
    public Optional<PrivateLinkServiceConnectionStateResponse> getPrivateLinkServiceConnectionState() {
        return Optional.ofNullable(this.privateLinkServiceConnectionState);
    }
    public String getProvisioningState() {
        return this.provisioningState;
    }
    public SystemDataResponse getSystemData() {
        return this.systemData;
    }
    public String getType() {
        return this.type;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetWebPubSubPrivateEndpointConnectionResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String id;
        private String name;
        private @Nullable PrivateEndpointResponse privateEndpoint;
        private @Nullable PrivateLinkServiceConnectionStateResponse privateLinkServiceConnectionState;
        private String provisioningState;
        private SystemDataResponse systemData;
        private String type;

        public Builder() {
    	      // Empty
        }

        public Builder(GetWebPubSubPrivateEndpointConnectionResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.id = defaults.id;
    	      this.name = defaults.name;
    	      this.privateEndpoint = defaults.privateEndpoint;
    	      this.privateLinkServiceConnectionState = defaults.privateLinkServiceConnectionState;
    	      this.provisioningState = defaults.provisioningState;
    	      this.systemData = defaults.systemData;
    	      this.type = defaults.type;
        }

        public Builder setId(String id) {
            this.id = Objects.requireNonNull(id);
            return this;
        }

        public Builder setName(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }

        public Builder setPrivateEndpoint(@Nullable PrivateEndpointResponse privateEndpoint) {
            this.privateEndpoint = privateEndpoint;
            return this;
        }

        public Builder setPrivateLinkServiceConnectionState(@Nullable PrivateLinkServiceConnectionStateResponse privateLinkServiceConnectionState) {
            this.privateLinkServiceConnectionState = privateLinkServiceConnectionState;
            return this;
        }

        public Builder setProvisioningState(String provisioningState) {
            this.provisioningState = Objects.requireNonNull(provisioningState);
            return this;
        }

        public Builder setSystemData(SystemDataResponse systemData) {
            this.systemData = Objects.requireNonNull(systemData);
            return this;
        }

        public Builder setType(String type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }

        public GetWebPubSubPrivateEndpointConnectionResult build() {
            return new GetWebPubSubPrivateEndpointConnectionResult(id, name, privateEndpoint, privateLinkServiceConnectionState, provisioningState, systemData, type);
        }
    }
}
