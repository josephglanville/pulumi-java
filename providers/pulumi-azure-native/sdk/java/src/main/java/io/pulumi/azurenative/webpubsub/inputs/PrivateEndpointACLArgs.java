// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.webpubsub.inputs;

import io.pulumi.azurenative.webpubsub.enums.WebPubSubRequestType;
import io.pulumi.core.Either;
import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * ACL for a private endpoint
 * 
 */
public final class PrivateEndpointACLArgs extends io.pulumi.resources.ResourceArgs {

    public static final PrivateEndpointACLArgs Empty = new PrivateEndpointACLArgs();

    /**
     * Allowed request types. The value can be one or more of: ClientConnection, ServerConnection, RESTAPI.
     * 
     */
    @InputImport(name="allow")
      private final @Nullable Input<List<Either<String,WebPubSubRequestType>>> allow;

    public Input<List<Either<String,WebPubSubRequestType>>> getAllow() {
        return this.allow == null ? Input.empty() : this.allow;
    }

    /**
     * Denied request types. The value can be one or more of: ClientConnection, ServerConnection, RESTAPI.
     * 
     */
    @InputImport(name="deny")
      private final @Nullable Input<List<Either<String,WebPubSubRequestType>>> deny;

    public Input<List<Either<String,WebPubSubRequestType>>> getDeny() {
        return this.deny == null ? Input.empty() : this.deny;
    }

    /**
     * Name of the private endpoint connection
     * 
     */
    @InputImport(name="name", required=true)
      private final Input<String> name;

    public Input<String> getName() {
        return this.name;
    }

    public PrivateEndpointACLArgs(
        @Nullable Input<List<Either<String,WebPubSubRequestType>>> allow,
        @Nullable Input<List<Either<String,WebPubSubRequestType>>> deny,
        Input<String> name) {
        this.allow = allow;
        this.deny = deny;
        this.name = Objects.requireNonNull(name, "expected parameter 'name' to be non-null");
    }

    private PrivateEndpointACLArgs() {
        this.allow = Input.empty();
        this.deny = Input.empty();
        this.name = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(PrivateEndpointACLArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<List<Either<String,WebPubSubRequestType>>> allow;
        private @Nullable Input<List<Either<String,WebPubSubRequestType>>> deny;
        private Input<String> name;

        public Builder() {
    	      // Empty
        }

        public Builder(PrivateEndpointACLArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.allow = defaults.allow;
    	      this.deny = defaults.deny;
    	      this.name = defaults.name;
        }

        public Builder setAllow(@Nullable Input<List<Either<String,WebPubSubRequestType>>> allow) {
            this.allow = allow;
            return this;
        }

        public Builder setAllow(@Nullable List<Either<String,WebPubSubRequestType>> allow) {
            this.allow = Input.ofNullable(allow);
            return this;
        }

        public Builder setDeny(@Nullable Input<List<Either<String,WebPubSubRequestType>>> deny) {
            this.deny = deny;
            return this;
        }

        public Builder setDeny(@Nullable List<Either<String,WebPubSubRequestType>> deny) {
            this.deny = Input.ofNullable(deny);
            return this;
        }

        public Builder setName(Input<String> name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }

        public Builder setName(String name) {
            this.name = Input.of(Objects.requireNonNull(name));
            return this;
        }
        public PrivateEndpointACLArgs build() {
            return new PrivateEndpointACLArgs(allow, deny, name);
        }
    }
}
