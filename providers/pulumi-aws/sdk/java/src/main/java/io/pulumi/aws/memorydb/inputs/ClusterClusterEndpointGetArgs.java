// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.memorydb.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class ClusterClusterEndpointGetArgs extends io.pulumi.resources.ResourceArgs {

    public static final ClusterClusterEndpointGetArgs Empty = new ClusterClusterEndpointGetArgs();

    /**
     * DNS hostname of the node.
     * 
     */
    @Import(name="address")
      private final @Nullable Output<String> address;

    public Output<String> getAddress() {
        return this.address == null ? Output.empty() : this.address;
    }

    /**
     * The port number on which each of the nodes accepts connections. Defaults to `6379`.
     * 
     */
    @Import(name="port")
      private final @Nullable Output<Integer> port;

    public Output<Integer> getPort() {
        return this.port == null ? Output.empty() : this.port;
    }

    public ClusterClusterEndpointGetArgs(
        @Nullable Output<String> address,
        @Nullable Output<Integer> port) {
        this.address = address;
        this.port = port;
    }

    private ClusterClusterEndpointGetArgs() {
        this.address = Output.empty();
        this.port = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ClusterClusterEndpointGetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<String> address;
        private @Nullable Output<Integer> port;

        public Builder() {
    	      // Empty
        }

        public Builder(ClusterClusterEndpointGetArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.address = defaults.address;
    	      this.port = defaults.port;
        }

        public Builder address(@Nullable Output<String> address) {
            this.address = address;
            return this;
        }
        public Builder address(@Nullable String address) {
            this.address = Output.ofNullable(address);
            return this;
        }
        public Builder port(@Nullable Output<Integer> port) {
            this.port = port;
            return this;
        }
        public Builder port(@Nullable Integer port) {
            this.port = Output.ofNullable(port);
            return this;
        }        public ClusterClusterEndpointGetArgs build() {
            return new ClusterClusterEndpointGetArgs(address, port);
        }
    }
}
