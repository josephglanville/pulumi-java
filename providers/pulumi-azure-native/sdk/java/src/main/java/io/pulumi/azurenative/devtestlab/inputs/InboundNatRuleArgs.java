// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.devtestlab.inputs;

import io.pulumi.azurenative.devtestlab.enums.TransportProtocol;
import io.pulumi.core.Either;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * A rule for NAT - exposing a VM's port (backendPort) on the public IP address using a load balancer.
 * 
 */
public final class InboundNatRuleArgs extends io.pulumi.resources.ResourceArgs {

    public static final InboundNatRuleArgs Empty = new InboundNatRuleArgs();

    /**
     * The port to which the external traffic will be redirected.
     * 
     */
    @Import(name="backendPort")
      private final @Nullable Output<Integer> backendPort;

    public Output<Integer> getBackendPort() {
        return this.backendPort == null ? Output.empty() : this.backendPort;
    }

    /**
     * The external endpoint port of the inbound connection. Possible values range between 1 and 65535, inclusive. If unspecified, a value will be allocated automatically.
     * 
     */
    @Import(name="frontendPort")
      private final @Nullable Output<Integer> frontendPort;

    public Output<Integer> getFrontendPort() {
        return this.frontendPort == null ? Output.empty() : this.frontendPort;
    }

    /**
     * The transport protocol for the endpoint.
     * 
     */
    @Import(name="transportProtocol")
      private final @Nullable Output<Either<String,TransportProtocol>> transportProtocol;

    public Output<Either<String,TransportProtocol>> getTransportProtocol() {
        return this.transportProtocol == null ? Output.empty() : this.transportProtocol;
    }

    public InboundNatRuleArgs(
        @Nullable Output<Integer> backendPort,
        @Nullable Output<Integer> frontendPort,
        @Nullable Output<Either<String,TransportProtocol>> transportProtocol) {
        this.backendPort = backendPort;
        this.frontendPort = frontendPort;
        this.transportProtocol = transportProtocol;
    }

    private InboundNatRuleArgs() {
        this.backendPort = Output.empty();
        this.frontendPort = Output.empty();
        this.transportProtocol = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(InboundNatRuleArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<Integer> backendPort;
        private @Nullable Output<Integer> frontendPort;
        private @Nullable Output<Either<String,TransportProtocol>> transportProtocol;

        public Builder() {
    	      // Empty
        }

        public Builder(InboundNatRuleArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.backendPort = defaults.backendPort;
    	      this.frontendPort = defaults.frontendPort;
    	      this.transportProtocol = defaults.transportProtocol;
        }

        public Builder backendPort(@Nullable Output<Integer> backendPort) {
            this.backendPort = backendPort;
            return this;
        }
        public Builder backendPort(@Nullable Integer backendPort) {
            this.backendPort = Output.ofNullable(backendPort);
            return this;
        }
        public Builder frontendPort(@Nullable Output<Integer> frontendPort) {
            this.frontendPort = frontendPort;
            return this;
        }
        public Builder frontendPort(@Nullable Integer frontendPort) {
            this.frontendPort = Output.ofNullable(frontendPort);
            return this;
        }
        public Builder transportProtocol(@Nullable Output<Either<String,TransportProtocol>> transportProtocol) {
            this.transportProtocol = transportProtocol;
            return this;
        }
        public Builder transportProtocol(@Nullable Either<String,TransportProtocol> transportProtocol) {
            this.transportProtocol = Output.ofNullable(transportProtocol);
            return this;
        }        public InboundNatRuleArgs build() {
            return new InboundNatRuleArgs(backendPort, frontendPort, transportProtocol);
        }
    }
}
