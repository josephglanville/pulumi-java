// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.network.outputs;

import io.pulumi.core.internal.annotations.OutputCustomType;
import java.lang.Boolean;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class ConnectionMonitorIcmpConfigurationResponse {
    private final @Nullable Boolean disableTraceRoute;

    @OutputCustomType.Constructor({"disableTraceRoute"})
    private ConnectionMonitorIcmpConfigurationResponse(@Nullable Boolean disableTraceRoute) {
        this.disableTraceRoute = disableTraceRoute;
    }

    public Optional<Boolean> getDisableTraceRoute() {
        return Optional.ofNullable(this.disableTraceRoute);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ConnectionMonitorIcmpConfigurationResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Boolean disableTraceRoute;

        public Builder() {
    	      // Empty
        }

        public Builder(ConnectionMonitorIcmpConfigurationResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.disableTraceRoute = defaults.disableTraceRoute;
        }

        public Builder setDisableTraceRoute(@Nullable Boolean disableTraceRoute) {
            this.disableTraceRoute = disableTraceRoute;
            return this;
        }

        public ConnectionMonitorIcmpConfigurationResponse build() {
            return new ConnectionMonitorIcmpConfigurationResponse(disableTraceRoute);
        }
    }
}
