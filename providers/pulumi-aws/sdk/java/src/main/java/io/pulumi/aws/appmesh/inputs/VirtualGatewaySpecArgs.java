// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.appmesh.inputs;

import io.pulumi.aws.appmesh.inputs.VirtualGatewaySpecBackendDefaultsArgs;
import io.pulumi.aws.appmesh.inputs.VirtualGatewaySpecListenerArgs;
import io.pulumi.aws.appmesh.inputs.VirtualGatewaySpecLoggingArgs;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import java.util.Objects;
import javax.annotation.Nullable;


public final class VirtualGatewaySpecArgs extends io.pulumi.resources.ResourceArgs {

    public static final VirtualGatewaySpecArgs Empty = new VirtualGatewaySpecArgs();

    /**
     * The defaults for backends.
     * 
     */
    @Import(name="backendDefaults")
      private final @Nullable Output<VirtualGatewaySpecBackendDefaultsArgs> backendDefaults;

    public Output<VirtualGatewaySpecBackendDefaultsArgs> getBackendDefaults() {
        return this.backendDefaults == null ? Output.empty() : this.backendDefaults;
    }

    /**
     * The listeners that the mesh endpoint is expected to receive inbound traffic from. You can specify one listener.
     * 
     */
    @Import(name="listener", required=true)
      private final Output<VirtualGatewaySpecListenerArgs> listener;

    public Output<VirtualGatewaySpecListenerArgs> getListener() {
        return this.listener;
    }

    /**
     * The inbound and outbound access logging information for the virtual gateway.
     * 
     */
    @Import(name="logging")
      private final @Nullable Output<VirtualGatewaySpecLoggingArgs> logging;

    public Output<VirtualGatewaySpecLoggingArgs> getLogging() {
        return this.logging == null ? Output.empty() : this.logging;
    }

    public VirtualGatewaySpecArgs(
        @Nullable Output<VirtualGatewaySpecBackendDefaultsArgs> backendDefaults,
        Output<VirtualGatewaySpecListenerArgs> listener,
        @Nullable Output<VirtualGatewaySpecLoggingArgs> logging) {
        this.backendDefaults = backendDefaults;
        this.listener = Objects.requireNonNull(listener, "expected parameter 'listener' to be non-null");
        this.logging = logging;
    }

    private VirtualGatewaySpecArgs() {
        this.backendDefaults = Output.empty();
        this.listener = Output.empty();
        this.logging = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(VirtualGatewaySpecArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<VirtualGatewaySpecBackendDefaultsArgs> backendDefaults;
        private Output<VirtualGatewaySpecListenerArgs> listener;
        private @Nullable Output<VirtualGatewaySpecLoggingArgs> logging;

        public Builder() {
    	      // Empty
        }

        public Builder(VirtualGatewaySpecArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.backendDefaults = defaults.backendDefaults;
    	      this.listener = defaults.listener;
    	      this.logging = defaults.logging;
        }

        public Builder backendDefaults(@Nullable Output<VirtualGatewaySpecBackendDefaultsArgs> backendDefaults) {
            this.backendDefaults = backendDefaults;
            return this;
        }
        public Builder backendDefaults(@Nullable VirtualGatewaySpecBackendDefaultsArgs backendDefaults) {
            this.backendDefaults = Output.ofNullable(backendDefaults);
            return this;
        }
        public Builder listener(Output<VirtualGatewaySpecListenerArgs> listener) {
            this.listener = Objects.requireNonNull(listener);
            return this;
        }
        public Builder listener(VirtualGatewaySpecListenerArgs listener) {
            this.listener = Output.of(Objects.requireNonNull(listener));
            return this;
        }
        public Builder logging(@Nullable Output<VirtualGatewaySpecLoggingArgs> logging) {
            this.logging = logging;
            return this;
        }
        public Builder logging(@Nullable VirtualGatewaySpecLoggingArgs logging) {
            this.logging = Output.ofNullable(logging);
            return this;
        }        public VirtualGatewaySpecArgs build() {
            return new VirtualGatewaySpecArgs(backendDefaults, listener, logging);
        }
    }
}
