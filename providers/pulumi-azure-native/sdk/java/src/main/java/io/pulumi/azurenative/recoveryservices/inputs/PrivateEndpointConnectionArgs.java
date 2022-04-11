// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.recoveryservices.inputs;

import io.pulumi.azurenative.recoveryservices.enums.ProvisioningState;
import io.pulumi.azurenative.recoveryservices.inputs.PrivateEndpointArgs;
import io.pulumi.azurenative.recoveryservices.inputs.PrivateLinkServiceConnectionStateArgs;
import io.pulumi.core.Either;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * Private Endpoint Connection Response Properties
 * 
 */
public final class PrivateEndpointConnectionArgs extends io.pulumi.resources.ResourceArgs {

    public static final PrivateEndpointConnectionArgs Empty = new PrivateEndpointConnectionArgs();

    /**
     * Gets or sets private endpoint associated with the private endpoint connection
     * 
     */
    @Import(name="privateEndpoint")
      private final @Nullable Output<PrivateEndpointArgs> privateEndpoint;

    public Output<PrivateEndpointArgs> getPrivateEndpoint() {
        return this.privateEndpoint == null ? Codegen.empty() : this.privateEndpoint;
    }

    /**
     * Gets or sets private link service connection state
     * 
     */
    @Import(name="privateLinkServiceConnectionState")
      private final @Nullable Output<PrivateLinkServiceConnectionStateArgs> privateLinkServiceConnectionState;

    public Output<PrivateLinkServiceConnectionStateArgs> getPrivateLinkServiceConnectionState() {
        return this.privateLinkServiceConnectionState == null ? Codegen.empty() : this.privateLinkServiceConnectionState;
    }

    /**
     * Gets or sets provisioning state of the private endpoint connection
     * 
     */
    @Import(name="provisioningState")
      private final @Nullable Output<Either<String,ProvisioningState>> provisioningState;

    public Output<Either<String,ProvisioningState>> getProvisioningState() {
        return this.provisioningState == null ? Codegen.empty() : this.provisioningState;
    }

    public PrivateEndpointConnectionArgs(
        @Nullable Output<PrivateEndpointArgs> privateEndpoint,
        @Nullable Output<PrivateLinkServiceConnectionStateArgs> privateLinkServiceConnectionState,
        @Nullable Output<Either<String,ProvisioningState>> provisioningState) {
        this.privateEndpoint = privateEndpoint;
        this.privateLinkServiceConnectionState = privateLinkServiceConnectionState;
        this.provisioningState = provisioningState;
    }

    private PrivateEndpointConnectionArgs() {
        this.privateEndpoint = Codegen.empty();
        this.privateLinkServiceConnectionState = Codegen.empty();
        this.provisioningState = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(PrivateEndpointConnectionArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<PrivateEndpointArgs> privateEndpoint;
        private @Nullable Output<PrivateLinkServiceConnectionStateArgs> privateLinkServiceConnectionState;
        private @Nullable Output<Either<String,ProvisioningState>> provisioningState;

        public Builder() {
    	      // Empty
        }

        public Builder(PrivateEndpointConnectionArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.privateEndpoint = defaults.privateEndpoint;
    	      this.privateLinkServiceConnectionState = defaults.privateLinkServiceConnectionState;
    	      this.provisioningState = defaults.provisioningState;
        }

        public Builder privateEndpoint(@Nullable Output<PrivateEndpointArgs> privateEndpoint) {
            this.privateEndpoint = privateEndpoint;
            return this;
        }
        public Builder privateEndpoint(@Nullable PrivateEndpointArgs privateEndpoint) {
            this.privateEndpoint = Codegen.ofNullable(privateEndpoint);
            return this;
        }
        public Builder privateLinkServiceConnectionState(@Nullable Output<PrivateLinkServiceConnectionStateArgs> privateLinkServiceConnectionState) {
            this.privateLinkServiceConnectionState = privateLinkServiceConnectionState;
            return this;
        }
        public Builder privateLinkServiceConnectionState(@Nullable PrivateLinkServiceConnectionStateArgs privateLinkServiceConnectionState) {
            this.privateLinkServiceConnectionState = Codegen.ofNullable(privateLinkServiceConnectionState);
            return this;
        }
        public Builder provisioningState(@Nullable Output<Either<String,ProvisioningState>> provisioningState) {
            this.provisioningState = provisioningState;
            return this;
        }
        public Builder provisioningState(@Nullable Either<String,ProvisioningState> provisioningState) {
            this.provisioningState = Codegen.ofNullable(provisioningState);
            return this;
        }        public PrivateEndpointConnectionArgs build() {
            return new PrivateEndpointConnectionArgs(privateEndpoint, privateLinkServiceConnectionState, provisioningState);
        }
    }
}
