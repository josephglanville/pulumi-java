// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.appmesh.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;


public final class VirtualGatewaySpecListenerPortMappingGetArgs extends io.pulumi.resources.ResourceArgs {

    public static final VirtualGatewaySpecListenerPortMappingGetArgs Empty = new VirtualGatewaySpecListenerPortMappingGetArgs();

    /**
     * The port used for the port mapping.
     * 
     */
    @Import(name="port", required=true)
      private final Output<Integer> port;

    public Output<Integer> getPort() {
        return this.port;
    }

    /**
     * The protocol used for the port mapping. Valid values are `http`, `http2`, `tcp` and `grpc`.
     * 
     */
    @Import(name="protocol", required=true)
      private final Output<String> protocol;

    public Output<String> getProtocol() {
        return this.protocol;
    }

    public VirtualGatewaySpecListenerPortMappingGetArgs(
        Output<Integer> port,
        Output<String> protocol) {
        this.port = Objects.requireNonNull(port, "expected parameter 'port' to be non-null");
        this.protocol = Objects.requireNonNull(protocol, "expected parameter 'protocol' to be non-null");
    }

    private VirtualGatewaySpecListenerPortMappingGetArgs() {
        this.port = Output.empty();
        this.protocol = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(VirtualGatewaySpecListenerPortMappingGetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Output<Integer> port;
        private Output<String> protocol;

        public Builder() {
    	      // Empty
        }

        public Builder(VirtualGatewaySpecListenerPortMappingGetArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.port = defaults.port;
    	      this.protocol = defaults.protocol;
        }

        public Builder port(Output<Integer> port) {
            this.port = Objects.requireNonNull(port);
            return this;
        }
        public Builder port(Integer port) {
            this.port = Output.of(Objects.requireNonNull(port));
            return this;
        }
        public Builder protocol(Output<String> protocol) {
            this.protocol = Objects.requireNonNull(protocol);
            return this;
        }
        public Builder protocol(String protocol) {
            this.protocol = Output.of(Objects.requireNonNull(protocol));
            return this;
        }        public VirtualGatewaySpecListenerPortMappingGetArgs build() {
            return new VirtualGatewaySpecListenerPortMappingGetArgs(port, protocol);
        }
    }
}
