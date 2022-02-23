// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.webpubsub.inputs;

import io.pulumi.azurenative.webpubsub.enums.ACLAction;
import io.pulumi.azurenative.webpubsub.inputs.NetworkACLArgs;
import io.pulumi.azurenative.webpubsub.inputs.PrivateEndpointACLArgs;
import io.pulumi.core.Either;
import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * Network ACLs for the resource
 * 
 */
public final class WebPubSubNetworkACLsArgs extends io.pulumi.resources.ResourceArgs {

    public static final WebPubSubNetworkACLsArgs Empty = new WebPubSubNetworkACLsArgs();

    /**
     * Default action when no other rule matches
     * 
     */
    @InputImport(name="defaultAction")
      private final @Nullable Input<Either<String,ACLAction>> defaultAction;

    public Input<Either<String,ACLAction>> getDefaultAction() {
        return this.defaultAction == null ? Input.empty() : this.defaultAction;
    }

    /**
     * ACLs for requests from private endpoints
     * 
     */
    @InputImport(name="privateEndpoints")
      private final @Nullable Input<List<PrivateEndpointACLArgs>> privateEndpoints;

    public Input<List<PrivateEndpointACLArgs>> getPrivateEndpoints() {
        return this.privateEndpoints == null ? Input.empty() : this.privateEndpoints;
    }

    /**
     * ACL for requests from public network
     * 
     */
    @InputImport(name="publicNetwork")
      private final @Nullable Input<NetworkACLArgs> publicNetwork;

    public Input<NetworkACLArgs> getPublicNetwork() {
        return this.publicNetwork == null ? Input.empty() : this.publicNetwork;
    }

    public WebPubSubNetworkACLsArgs(
        @Nullable Input<Either<String,ACLAction>> defaultAction,
        @Nullable Input<List<PrivateEndpointACLArgs>> privateEndpoints,
        @Nullable Input<NetworkACLArgs> publicNetwork) {
        this.defaultAction = defaultAction == null ? Input.ofLeft("Deny") : defaultAction;
        this.privateEndpoints = privateEndpoints;
        this.publicNetwork = publicNetwork;
    }

    private WebPubSubNetworkACLsArgs() {
        this.defaultAction = Input.empty();
        this.privateEndpoints = Input.empty();
        this.publicNetwork = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(WebPubSubNetworkACLsArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<Either<String,ACLAction>> defaultAction;
        private @Nullable Input<List<PrivateEndpointACLArgs>> privateEndpoints;
        private @Nullable Input<NetworkACLArgs> publicNetwork;

        public Builder() {
    	      // Empty
        }

        public Builder(WebPubSubNetworkACLsArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.defaultAction = defaults.defaultAction;
    	      this.privateEndpoints = defaults.privateEndpoints;
    	      this.publicNetwork = defaults.publicNetwork;
        }

        public Builder setDefaultAction(@Nullable Input<Either<String,ACLAction>> defaultAction) {
            this.defaultAction = defaultAction;
            return this;
        }

        public Builder setDefaultAction(@Nullable Either<String,ACLAction> defaultAction) {
            this.defaultAction = Input.ofNullable(defaultAction);
            return this;
        }

        public Builder setPrivateEndpoints(@Nullable Input<List<PrivateEndpointACLArgs>> privateEndpoints) {
            this.privateEndpoints = privateEndpoints;
            return this;
        }

        public Builder setPrivateEndpoints(@Nullable List<PrivateEndpointACLArgs> privateEndpoints) {
            this.privateEndpoints = Input.ofNullable(privateEndpoints);
            return this;
        }

        public Builder setPublicNetwork(@Nullable Input<NetworkACLArgs> publicNetwork) {
            this.publicNetwork = publicNetwork;
            return this;
        }

        public Builder setPublicNetwork(@Nullable NetworkACLArgs publicNetwork) {
            this.publicNetwork = Input.ofNullable(publicNetwork);
            return this;
        }
        public WebPubSubNetworkACLsArgs build() {
            return new WebPubSubNetworkACLsArgs(defaultAction, privateEndpoints, publicNetwork);
        }
    }
}
