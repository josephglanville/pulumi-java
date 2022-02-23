// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.apimanagement.inputs;

import io.pulumi.azurenative.apimanagement.inputs.PrivateLinkServiceConnectionStateArgs;
import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * The connection state of the private endpoint connection.
 * 
 */
public final class PrivateEndpointConnectionRequestPropertiesArgs extends io.pulumi.resources.ResourceArgs {

    public static final PrivateEndpointConnectionRequestPropertiesArgs Empty = new PrivateEndpointConnectionRequestPropertiesArgs();

    /**
     * A collection of information about the state of the connection between service consumer and provider.
     * 
     */
    @InputImport(name="privateLinkServiceConnectionState")
      private final @Nullable Input<PrivateLinkServiceConnectionStateArgs> privateLinkServiceConnectionState;

    public Input<PrivateLinkServiceConnectionStateArgs> getPrivateLinkServiceConnectionState() {
        return this.privateLinkServiceConnectionState == null ? Input.empty() : this.privateLinkServiceConnectionState;
    }

    public PrivateEndpointConnectionRequestPropertiesArgs(@Nullable Input<PrivateLinkServiceConnectionStateArgs> privateLinkServiceConnectionState) {
        this.privateLinkServiceConnectionState = privateLinkServiceConnectionState;
    }

    private PrivateEndpointConnectionRequestPropertiesArgs() {
        this.privateLinkServiceConnectionState = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(PrivateEndpointConnectionRequestPropertiesArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<PrivateLinkServiceConnectionStateArgs> privateLinkServiceConnectionState;

        public Builder() {
    	      // Empty
        }

        public Builder(PrivateEndpointConnectionRequestPropertiesArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.privateLinkServiceConnectionState = defaults.privateLinkServiceConnectionState;
        }

        public Builder setPrivateLinkServiceConnectionState(@Nullable Input<PrivateLinkServiceConnectionStateArgs> privateLinkServiceConnectionState) {
            this.privateLinkServiceConnectionState = privateLinkServiceConnectionState;
            return this;
        }

        public Builder setPrivateLinkServiceConnectionState(@Nullable PrivateLinkServiceConnectionStateArgs privateLinkServiceConnectionState) {
            this.privateLinkServiceConnectionState = Input.ofNullable(privateLinkServiceConnectionState);
            return this;
        }
        public PrivateEndpointConnectionRequestPropertiesArgs build() {
            return new PrivateEndpointConnectionRequestPropertiesArgs(privateLinkServiceConnectionState);
        }
    }
}
