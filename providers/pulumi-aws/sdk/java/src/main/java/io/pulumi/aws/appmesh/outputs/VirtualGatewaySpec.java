// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.appmesh.outputs;

import io.pulumi.aws.appmesh.outputs.VirtualGatewaySpecBackendDefaults;
import io.pulumi.aws.appmesh.outputs.VirtualGatewaySpecListener;
import io.pulumi.aws.appmesh.outputs.VirtualGatewaySpecLogging;
import io.pulumi.core.annotations.CustomType;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class VirtualGatewaySpec {
    /**
     * The defaults for backends.
     * 
     */
    private final @Nullable VirtualGatewaySpecBackendDefaults backendDefaults;
    /**
     * The listeners that the mesh endpoint is expected to receive inbound traffic from. You can specify one listener.
     * 
     */
    private final VirtualGatewaySpecListener listener;
    /**
     * The inbound and outbound access logging information for the virtual gateway.
     * 
     */
    private final @Nullable VirtualGatewaySpecLogging logging;

    @CustomType.Constructor
    private VirtualGatewaySpec(
        @CustomType.Parameter("backendDefaults") @Nullable VirtualGatewaySpecBackendDefaults backendDefaults,
        @CustomType.Parameter("listener") VirtualGatewaySpecListener listener,
        @CustomType.Parameter("logging") @Nullable VirtualGatewaySpecLogging logging) {
        this.backendDefaults = backendDefaults;
        this.listener = listener;
        this.logging = logging;
    }

    /**
     * The defaults for backends.
     * 
    */
    public Optional<VirtualGatewaySpecBackendDefaults> getBackendDefaults() {
        return Optional.ofNullable(this.backendDefaults);
    }
    /**
     * The listeners that the mesh endpoint is expected to receive inbound traffic from. You can specify one listener.
     * 
    */
    public VirtualGatewaySpecListener getListener() {
        return this.listener;
    }
    /**
     * The inbound and outbound access logging information for the virtual gateway.
     * 
    */
    public Optional<VirtualGatewaySpecLogging> getLogging() {
        return Optional.ofNullable(this.logging);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(VirtualGatewaySpec defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable VirtualGatewaySpecBackendDefaults backendDefaults;
        private VirtualGatewaySpecListener listener;
        private @Nullable VirtualGatewaySpecLogging logging;

        public Builder() {
    	      // Empty
        }

        public Builder(VirtualGatewaySpec defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.backendDefaults = defaults.backendDefaults;
    	      this.listener = defaults.listener;
    	      this.logging = defaults.logging;
        }

        public Builder backendDefaults(@Nullable VirtualGatewaySpecBackendDefaults backendDefaults) {
            this.backendDefaults = backendDefaults;
            return this;
        }
        public Builder listener(VirtualGatewaySpecListener listener) {
            this.listener = Objects.requireNonNull(listener);
            return this;
        }
        public Builder logging(@Nullable VirtualGatewaySpecLogging logging) {
            this.logging = logging;
            return this;
        }        public VirtualGatewaySpec build() {
            return new VirtualGatewaySpec(backendDefaults, listener, logging);
        }
    }
}
