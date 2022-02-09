// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.devtestlab.inputs;

import io.pulumi.azurenative.devtestlab.enums.TransportProtocol;
import io.pulumi.core.Either;
import io.pulumi.core.Input;
import io.pulumi.core.internal.annotations.InputImport;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class PortArgs extends io.pulumi.resources.ResourceArgs {

    public static final PortArgs Empty = new PortArgs();

    @InputImport(name="backendPort")
    private final @Nullable Input<Integer> backendPort;

    public Input<Integer> getBackendPort() {
        return this.backendPort == null ? Input.empty() : this.backendPort;
    }

    @InputImport(name="transportProtocol")
    private final @Nullable Input<Either<String,TransportProtocol>> transportProtocol;

    public Input<Either<String,TransportProtocol>> getTransportProtocol() {
        return this.transportProtocol == null ? Input.empty() : this.transportProtocol;
    }

    public PortArgs(
        @Nullable Input<Integer> backendPort,
        @Nullable Input<Either<String,TransportProtocol>> transportProtocol) {
        this.backendPort = backendPort;
        this.transportProtocol = transportProtocol;
    }

    private PortArgs() {
        this.backendPort = Input.empty();
        this.transportProtocol = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(PortArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<Integer> backendPort;
        private @Nullable Input<Either<String,TransportProtocol>> transportProtocol;

        public Builder() {
    	      // Empty
        }

        public Builder(PortArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.backendPort = defaults.backendPort;
    	      this.transportProtocol = defaults.transportProtocol;
        }

        public Builder setBackendPort(@Nullable Input<Integer> backendPort) {
            this.backendPort = backendPort;
            return this;
        }

        public Builder setBackendPort(@Nullable Integer backendPort) {
            this.backendPort = Input.ofNullable(backendPort);
            return this;
        }

        public Builder setTransportProtocol(@Nullable Input<Either<String,TransportProtocol>> transportProtocol) {
            this.transportProtocol = transportProtocol;
            return this;
        }

        public Builder setTransportProtocol(@Nullable Either<String,TransportProtocol> transportProtocol) {
            this.transportProtocol = Input.ofNullable(transportProtocol);
            return this;
        }

        public PortArgs build() {
            return new PortArgs(backendPort, transportProtocol);
        }
    }
}
