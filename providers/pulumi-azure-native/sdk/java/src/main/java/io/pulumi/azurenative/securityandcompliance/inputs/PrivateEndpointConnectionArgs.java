// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.securityandcompliance.inputs;

import io.pulumi.azurenative.securityandcompliance.inputs.PrivateLinkServiceConnectionStateArgs;
import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.util.Objects;


/**
 * The Private Endpoint Connection resource.
 * 
 */
public final class PrivateEndpointConnectionArgs extends io.pulumi.resources.ResourceArgs {

    public static final PrivateEndpointConnectionArgs Empty = new PrivateEndpointConnectionArgs();

    /**
     * A collection of information about the state of the connection between service consumer and provider.
     * 
     */
    @InputImport(name="privateLinkServiceConnectionState", required=true)
      private final Input<PrivateLinkServiceConnectionStateArgs> privateLinkServiceConnectionState;

    public Input<PrivateLinkServiceConnectionStateArgs> getPrivateLinkServiceConnectionState() {
        return this.privateLinkServiceConnectionState;
    }

    public PrivateEndpointConnectionArgs(Input<PrivateLinkServiceConnectionStateArgs> privateLinkServiceConnectionState) {
        this.privateLinkServiceConnectionState = Objects.requireNonNull(privateLinkServiceConnectionState, "expected parameter 'privateLinkServiceConnectionState' to be non-null");
    }

    private PrivateEndpointConnectionArgs() {
        this.privateLinkServiceConnectionState = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(PrivateEndpointConnectionArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Input<PrivateLinkServiceConnectionStateArgs> privateLinkServiceConnectionState;

        public Builder() {
    	      // Empty
        }

        public Builder(PrivateEndpointConnectionArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.privateLinkServiceConnectionState = defaults.privateLinkServiceConnectionState;
        }

        public Builder setPrivateLinkServiceConnectionState(Input<PrivateLinkServiceConnectionStateArgs> privateLinkServiceConnectionState) {
            this.privateLinkServiceConnectionState = Objects.requireNonNull(privateLinkServiceConnectionState);
            return this;
        }

        public Builder setPrivateLinkServiceConnectionState(PrivateLinkServiceConnectionStateArgs privateLinkServiceConnectionState) {
            this.privateLinkServiceConnectionState = Input.of(Objects.requireNonNull(privateLinkServiceConnectionState));
            return this;
        }
        public PrivateEndpointConnectionArgs build() {
            return new PrivateEndpointConnectionArgs(privateLinkServiceConnectionState);
        }
    }
}
