// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.keyvault.inputs;

import io.pulumi.azurenative.keyvault.inputs.MHSMPrivateEndpointResponse;
import io.pulumi.azurenative.keyvault.inputs.MHSMPrivateLinkServiceConnectionStateResponse;
import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Private endpoint connection item.
 * 
 */
public final class MHSMPrivateEndpointConnectionItemResponse extends io.pulumi.resources.InvokeArgs {

    public static final MHSMPrivateEndpointConnectionItemResponse Empty = new MHSMPrivateEndpointConnectionItemResponse();

    /**
     * Properties of the private endpoint object.
     * 
     */
    @InputImport(name="privateEndpoint")
      private final @Nullable MHSMPrivateEndpointResponse privateEndpoint;

    public Optional<MHSMPrivateEndpointResponse> getPrivateEndpoint() {
        return this.privateEndpoint == null ? Optional.empty() : Optional.ofNullable(this.privateEndpoint);
    }

    /**
     * Approval state of the private link connection.
     * 
     */
    @InputImport(name="privateLinkServiceConnectionState")
      private final @Nullable MHSMPrivateLinkServiceConnectionStateResponse privateLinkServiceConnectionState;

    public Optional<MHSMPrivateLinkServiceConnectionStateResponse> getPrivateLinkServiceConnectionState() {
        return this.privateLinkServiceConnectionState == null ? Optional.empty() : Optional.ofNullable(this.privateLinkServiceConnectionState);
    }

    /**
     * Provisioning state of the private endpoint connection.
     * 
     */
    @InputImport(name="provisioningState", required=true)
      private final String provisioningState;

    public String getProvisioningState() {
        return this.provisioningState;
    }

    public MHSMPrivateEndpointConnectionItemResponse(
        @Nullable MHSMPrivateEndpointResponse privateEndpoint,
        @Nullable MHSMPrivateLinkServiceConnectionStateResponse privateLinkServiceConnectionState,
        String provisioningState) {
        this.privateEndpoint = privateEndpoint;
        this.privateLinkServiceConnectionState = privateLinkServiceConnectionState;
        this.provisioningState = Objects.requireNonNull(provisioningState, "expected parameter 'provisioningState' to be non-null");
    }

    private MHSMPrivateEndpointConnectionItemResponse() {
        this.privateEndpoint = null;
        this.privateLinkServiceConnectionState = null;
        this.provisioningState = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(MHSMPrivateEndpointConnectionItemResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable MHSMPrivateEndpointResponse privateEndpoint;
        private @Nullable MHSMPrivateLinkServiceConnectionStateResponse privateLinkServiceConnectionState;
        private String provisioningState;

        public Builder() {
    	      // Empty
        }

        public Builder(MHSMPrivateEndpointConnectionItemResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.privateEndpoint = defaults.privateEndpoint;
    	      this.privateLinkServiceConnectionState = defaults.privateLinkServiceConnectionState;
    	      this.provisioningState = defaults.provisioningState;
        }

        public Builder setPrivateEndpoint(@Nullable MHSMPrivateEndpointResponse privateEndpoint) {
            this.privateEndpoint = privateEndpoint;
            return this;
        }

        public Builder setPrivateLinkServiceConnectionState(@Nullable MHSMPrivateLinkServiceConnectionStateResponse privateLinkServiceConnectionState) {
            this.privateLinkServiceConnectionState = privateLinkServiceConnectionState;
            return this;
        }

        public Builder setProvisioningState(String provisioningState) {
            this.provisioningState = Objects.requireNonNull(provisioningState);
            return this;
        }
        public MHSMPrivateEndpointConnectionItemResponse build() {
            return new MHSMPrivateEndpointConnectionItemResponse(privateEndpoint, privateLinkServiceConnectionState, provisioningState);
        }
    }
}
