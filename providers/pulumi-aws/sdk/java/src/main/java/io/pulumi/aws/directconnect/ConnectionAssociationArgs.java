// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.directconnect;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


public final class ConnectionAssociationArgs extends io.pulumi.resources.ResourceArgs {

    public static final ConnectionAssociationArgs Empty = new ConnectionAssociationArgs();

    /**
     * The ID of the connection.
     * 
     */
    @Import(name="connectionId", required=true)
      private final Output<String> connectionId;

    public Output<String> getConnectionId() {
        return this.connectionId;
    }

    /**
     * The ID of the LAG with which to associate the connection.
     * 
     */
    @Import(name="lagId", required=true)
      private final Output<String> lagId;

    public Output<String> getLagId() {
        return this.lagId;
    }

    public ConnectionAssociationArgs(
        Output<String> connectionId,
        Output<String> lagId) {
        this.connectionId = Objects.requireNonNull(connectionId, "expected parameter 'connectionId' to be non-null");
        this.lagId = Objects.requireNonNull(lagId, "expected parameter 'lagId' to be non-null");
    }

    private ConnectionAssociationArgs() {
        this.connectionId = Output.empty();
        this.lagId = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ConnectionAssociationArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Output<String> connectionId;
        private Output<String> lagId;

        public Builder() {
    	      // Empty
        }

        public Builder(ConnectionAssociationArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.connectionId = defaults.connectionId;
    	      this.lagId = defaults.lagId;
        }

        public Builder connectionId(Output<String> connectionId) {
            this.connectionId = Objects.requireNonNull(connectionId);
            return this;
        }
        public Builder connectionId(String connectionId) {
            this.connectionId = Output.of(Objects.requireNonNull(connectionId));
            return this;
        }
        public Builder lagId(Output<String> lagId) {
            this.lagId = Objects.requireNonNull(lagId);
            return this;
        }
        public Builder lagId(String lagId) {
            this.lagId = Output.of(Objects.requireNonNull(lagId));
            return this;
        }        public ConnectionAssociationArgs build() {
            return new ConnectionAssociationArgs(connectionId, lagId);
        }
    }
}