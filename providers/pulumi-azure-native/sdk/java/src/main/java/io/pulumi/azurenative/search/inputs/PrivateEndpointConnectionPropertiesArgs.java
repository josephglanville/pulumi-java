// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.search.inputs;

import io.pulumi.azurenative.search.inputs.PrivateEndpointConnectionPropertiesPrivateEndpointArgs;
import io.pulumi.azurenative.search.inputs.PrivateEndpointConnectionPropertiesPrivateLinkServiceConnectionStateArgs;
import io.pulumi.core.Input;
import io.pulumi.core.internal.annotations.InputImport;
import java.util.Objects;
import javax.annotation.Nullable;


public final class PrivateEndpointConnectionPropertiesArgs extends io.pulumi.resources.ResourceArgs {

    public static final PrivateEndpointConnectionPropertiesArgs Empty = new PrivateEndpointConnectionPropertiesArgs();

    @InputImport(name="privateEndpoint")
    private final @Nullable Input<PrivateEndpointConnectionPropertiesPrivateEndpointArgs> privateEndpoint;

    public Input<PrivateEndpointConnectionPropertiesPrivateEndpointArgs> getPrivateEndpoint() {
        return this.privateEndpoint == null ? Input.empty() : this.privateEndpoint;
    }

    @InputImport(name="privateLinkServiceConnectionState")
    private final @Nullable Input<PrivateEndpointConnectionPropertiesPrivateLinkServiceConnectionStateArgs> privateLinkServiceConnectionState;

    public Input<PrivateEndpointConnectionPropertiesPrivateLinkServiceConnectionStateArgs> getPrivateLinkServiceConnectionState() {
        return this.privateLinkServiceConnectionState == null ? Input.empty() : this.privateLinkServiceConnectionState;
    }

    public PrivateEndpointConnectionPropertiesArgs(
        @Nullable Input<PrivateEndpointConnectionPropertiesPrivateEndpointArgs> privateEndpoint,
        @Nullable Input<PrivateEndpointConnectionPropertiesPrivateLinkServiceConnectionStateArgs> privateLinkServiceConnectionState) {
        this.privateEndpoint = privateEndpoint;
        this.privateLinkServiceConnectionState = privateLinkServiceConnectionState;
    }

    private PrivateEndpointConnectionPropertiesArgs() {
        this.privateEndpoint = Input.empty();
        this.privateLinkServiceConnectionState = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(PrivateEndpointConnectionPropertiesArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<PrivateEndpointConnectionPropertiesPrivateEndpointArgs> privateEndpoint;
        private @Nullable Input<PrivateEndpointConnectionPropertiesPrivateLinkServiceConnectionStateArgs> privateLinkServiceConnectionState;

        public Builder() {
    	      // Empty
        }

        public Builder(PrivateEndpointConnectionPropertiesArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.privateEndpoint = defaults.privateEndpoint;
    	      this.privateLinkServiceConnectionState = defaults.privateLinkServiceConnectionState;
        }

        public Builder setPrivateEndpoint(@Nullable Input<PrivateEndpointConnectionPropertiesPrivateEndpointArgs> privateEndpoint) {
            this.privateEndpoint = privateEndpoint;
            return this;
        }

        public Builder setPrivateEndpoint(@Nullable PrivateEndpointConnectionPropertiesPrivateEndpointArgs privateEndpoint) {
            this.privateEndpoint = Input.ofNullable(privateEndpoint);
            return this;
        }

        public Builder setPrivateLinkServiceConnectionState(@Nullable Input<PrivateEndpointConnectionPropertiesPrivateLinkServiceConnectionStateArgs> privateLinkServiceConnectionState) {
            this.privateLinkServiceConnectionState = privateLinkServiceConnectionState;
            return this;
        }

        public Builder setPrivateLinkServiceConnectionState(@Nullable PrivateEndpointConnectionPropertiesPrivateLinkServiceConnectionStateArgs privateLinkServiceConnectionState) {
            this.privateLinkServiceConnectionState = Input.ofNullable(privateLinkServiceConnectionState);
            return this;
        }

        public PrivateEndpointConnectionPropertiesArgs build() {
            return new PrivateEndpointConnectionPropertiesArgs(privateEndpoint, privateLinkServiceConnectionState);
        }
    }
}
