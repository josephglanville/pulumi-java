// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.globalaccelerator.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.InputImport;
import java.lang.Integer;
import java.util.Objects;


public final class EndpointGroupPortOverrideGetArgs extends io.pulumi.resources.ResourceArgs {

    public static final EndpointGroupPortOverrideGetArgs Empty = new EndpointGroupPortOverrideGetArgs();

    /**
     * The endpoint port that you want a listener port to be mapped to. This is the port on the endpoint, such as the Application Load Balancer or Amazon EC2 instance.
     * 
     */
    @InputImport(name="endpointPort", required=true)
      private final Output<Integer> endpointPort;

    public Output<Integer> getEndpointPort() {
        return this.endpointPort;
    }

    /**
     * The listener port that you want to map to a specific endpoint port. This is the port that user traffic arrives to the Global Accelerator on.
     * 
     */
    @InputImport(name="listenerPort", required=true)
      private final Output<Integer> listenerPort;

    public Output<Integer> getListenerPort() {
        return this.listenerPort;
    }

    public EndpointGroupPortOverrideGetArgs(
        Output<Integer> endpointPort,
        Output<Integer> listenerPort) {
        this.endpointPort = Objects.requireNonNull(endpointPort, "expected parameter 'endpointPort' to be non-null");
        this.listenerPort = Objects.requireNonNull(listenerPort, "expected parameter 'listenerPort' to be non-null");
    }

    private EndpointGroupPortOverrideGetArgs() {
        this.endpointPort = Output.empty();
        this.listenerPort = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(EndpointGroupPortOverrideGetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Output<Integer> endpointPort;
        private Output<Integer> listenerPort;

        public Builder() {
    	      // Empty
        }

        public Builder(EndpointGroupPortOverrideGetArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.endpointPort = defaults.endpointPort;
    	      this.listenerPort = defaults.listenerPort;
        }

        public Builder endpointPort(Output<Integer> endpointPort) {
            this.endpointPort = Objects.requireNonNull(endpointPort);
            return this;
        }

        public Builder endpointPort(Integer endpointPort) {
            this.endpointPort = Output.of(Objects.requireNonNull(endpointPort));
            return this;
        }

        public Builder listenerPort(Output<Integer> listenerPort) {
            this.listenerPort = Objects.requireNonNull(listenerPort);
            return this;
        }

        public Builder listenerPort(Integer listenerPort) {
            this.listenerPort = Output.of(Objects.requireNonNull(listenerPort));
            return this;
        }
        public EndpointGroupPortOverrideGetArgs build() {
            return new EndpointGroupPortOverrideGetArgs(endpointPort, listenerPort);
        }
    }
}
