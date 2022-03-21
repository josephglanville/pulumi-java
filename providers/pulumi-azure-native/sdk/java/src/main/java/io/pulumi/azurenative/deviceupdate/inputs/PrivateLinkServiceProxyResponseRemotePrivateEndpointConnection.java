// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.deviceupdate.inputs;

import io.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


/**
 * Remote private endpoint connection details.
 * 
 */
public final class PrivateLinkServiceProxyResponseRemotePrivateEndpointConnection extends io.pulumi.resources.InvokeArgs {

    public static final PrivateLinkServiceProxyResponseRemotePrivateEndpointConnection Empty = new PrivateLinkServiceProxyResponseRemotePrivateEndpointConnection();

    /**
     * Remote private endpoint connection ID.
     * 
     */
    @Import(name="id", required=true)
      private final String id;

    public String getId() {
        return this.id;
    }

    public PrivateLinkServiceProxyResponseRemotePrivateEndpointConnection(String id) {
        this.id = Objects.requireNonNull(id, "expected parameter 'id' to be non-null");
    }

    private PrivateLinkServiceProxyResponseRemotePrivateEndpointConnection() {
        this.id = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(PrivateLinkServiceProxyResponseRemotePrivateEndpointConnection defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String id;

        public Builder() {
    	      // Empty
        }

        public Builder(PrivateLinkServiceProxyResponseRemotePrivateEndpointConnection defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.id = defaults.id;
        }

        public Builder id(String id) {
            this.id = Objects.requireNonNull(id);
            return this;
        }        public PrivateLinkServiceProxyResponseRemotePrivateEndpointConnection build() {
            return new PrivateLinkServiceProxyResponseRemotePrivateEndpointConnection(id);
        }
    }
}
