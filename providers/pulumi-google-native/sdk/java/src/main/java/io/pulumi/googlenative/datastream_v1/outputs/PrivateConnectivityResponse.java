// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.datastream_v1.outputs;

import io.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class PrivateConnectivityResponse {
    /**
     * A reference to a private connection resource. Format: `projects/{project}/locations/{location}/privateConnections/{name}`
     * 
     */
    private final String privateConnection;

    @CustomType.Constructor
    private PrivateConnectivityResponse(@CustomType.Parameter("privateConnection") String privateConnection) {
        this.privateConnection = privateConnection;
    }

    /**
     * A reference to a private connection resource. Format: `projects/{project}/locations/{location}/privateConnections/{name}`
     * 
    */
    public String getPrivateConnection() {
        return this.privateConnection;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(PrivateConnectivityResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String privateConnection;

        public Builder() {
    	      // Empty
        }

        public Builder(PrivateConnectivityResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.privateConnection = defaults.privateConnection;
        }

        public Builder privateConnection(String privateConnection) {
            this.privateConnection = Objects.requireNonNull(privateConnection);
            return this;
        }        public PrivateConnectivityResponse build() {
            return new PrivateConnectivityResponse(privateConnection);
        }
    }
}
