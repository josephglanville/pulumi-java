// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.appmesh.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import java.lang.Integer;
import java.util.Objects;


public final class VirtualNodeSpecListenerConnectionPoolTcpGetArgs extends io.pulumi.resources.ResourceArgs {

    public static final VirtualNodeSpecListenerConnectionPoolTcpGetArgs Empty = new VirtualNodeSpecListenerConnectionPoolTcpGetArgs();

    /**
     * Maximum number of outbound TCP connections Envoy can establish concurrently with all hosts in upstream cluster. Minimum value of `1`.
     * 
     */
    @Import(name="maxConnections", required=true)
      private final Output<Integer> maxConnections;

    public Output<Integer> getMaxConnections() {
        return this.maxConnections;
    }

    public VirtualNodeSpecListenerConnectionPoolTcpGetArgs(Output<Integer> maxConnections) {
        this.maxConnections = Objects.requireNonNull(maxConnections, "expected parameter 'maxConnections' to be non-null");
    }

    private VirtualNodeSpecListenerConnectionPoolTcpGetArgs() {
        this.maxConnections = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(VirtualNodeSpecListenerConnectionPoolTcpGetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Output<Integer> maxConnections;

        public Builder() {
    	      // Empty
        }

        public Builder(VirtualNodeSpecListenerConnectionPoolTcpGetArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.maxConnections = defaults.maxConnections;
        }

        public Builder maxConnections(Output<Integer> maxConnections) {
            this.maxConnections = Objects.requireNonNull(maxConnections);
            return this;
        }
        public Builder maxConnections(Integer maxConnections) {
            this.maxConnections = Output.of(Objects.requireNonNull(maxConnections));
            return this;
        }        public VirtualNodeSpecListenerConnectionPoolTcpGetArgs build() {
            return new VirtualNodeSpecListenerConnectionPoolTcpGetArgs(maxConnections);
        }
    }
}
