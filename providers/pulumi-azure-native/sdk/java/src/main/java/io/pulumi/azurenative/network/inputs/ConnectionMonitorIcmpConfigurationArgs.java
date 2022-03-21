// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.network.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * Describes the ICMP configuration.
 * 
 */
public final class ConnectionMonitorIcmpConfigurationArgs extends io.pulumi.resources.ResourceArgs {

    public static final ConnectionMonitorIcmpConfigurationArgs Empty = new ConnectionMonitorIcmpConfigurationArgs();

    /**
     * Value indicating whether path evaluation with trace route should be disabled.
     * 
     */
    @Import(name="disableTraceRoute")
      private final @Nullable Output<Boolean> disableTraceRoute;

    public Output<Boolean> getDisableTraceRoute() {
        return this.disableTraceRoute == null ? Output.empty() : this.disableTraceRoute;
    }

    public ConnectionMonitorIcmpConfigurationArgs(@Nullable Output<Boolean> disableTraceRoute) {
        this.disableTraceRoute = disableTraceRoute;
    }

    private ConnectionMonitorIcmpConfigurationArgs() {
        this.disableTraceRoute = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ConnectionMonitorIcmpConfigurationArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<Boolean> disableTraceRoute;

        public Builder() {
    	      // Empty
        }

        public Builder(ConnectionMonitorIcmpConfigurationArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.disableTraceRoute = defaults.disableTraceRoute;
        }

        public Builder disableTraceRoute(@Nullable Output<Boolean> disableTraceRoute) {
            this.disableTraceRoute = disableTraceRoute;
            return this;
        }
        public Builder disableTraceRoute(@Nullable Boolean disableTraceRoute) {
            this.disableTraceRoute = Output.ofNullable(disableTraceRoute);
            return this;
        }        public ConnectionMonitorIcmpConfigurationArgs build() {
            return new ConnectionMonitorIcmpConfigurationArgs(disableTraceRoute);
        }
    }
}
