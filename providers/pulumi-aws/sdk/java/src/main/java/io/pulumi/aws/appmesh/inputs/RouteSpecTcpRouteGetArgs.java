// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.appmesh.inputs;

import io.pulumi.aws.appmesh.inputs.RouteSpecTcpRouteActionGetArgs;
import io.pulumi.aws.appmesh.inputs.RouteSpecTcpRouteTimeoutGetArgs;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import java.util.Objects;
import javax.annotation.Nullable;


public final class RouteSpecTcpRouteGetArgs extends io.pulumi.resources.ResourceArgs {

    public static final RouteSpecTcpRouteGetArgs Empty = new RouteSpecTcpRouteGetArgs();

    /**
     * The action to take if a match is determined.
     * 
     */
    @Import(name="action", required=true)
      private final Output<RouteSpecTcpRouteActionGetArgs> action;

    public Output<RouteSpecTcpRouteActionGetArgs> getAction() {
        return this.action;
    }

    /**
     * The types of timeouts.
     * 
     */
    @Import(name="timeout")
      private final @Nullable Output<RouteSpecTcpRouteTimeoutGetArgs> timeout;

    public Output<RouteSpecTcpRouteTimeoutGetArgs> getTimeout() {
        return this.timeout == null ? Output.empty() : this.timeout;
    }

    public RouteSpecTcpRouteGetArgs(
        Output<RouteSpecTcpRouteActionGetArgs> action,
        @Nullable Output<RouteSpecTcpRouteTimeoutGetArgs> timeout) {
        this.action = Objects.requireNonNull(action, "expected parameter 'action' to be non-null");
        this.timeout = timeout;
    }

    private RouteSpecTcpRouteGetArgs() {
        this.action = Output.empty();
        this.timeout = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(RouteSpecTcpRouteGetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Output<RouteSpecTcpRouteActionGetArgs> action;
        private @Nullable Output<RouteSpecTcpRouteTimeoutGetArgs> timeout;

        public Builder() {
    	      // Empty
        }

        public Builder(RouteSpecTcpRouteGetArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.action = defaults.action;
    	      this.timeout = defaults.timeout;
        }

        public Builder action(Output<RouteSpecTcpRouteActionGetArgs> action) {
            this.action = Objects.requireNonNull(action);
            return this;
        }
        public Builder action(RouteSpecTcpRouteActionGetArgs action) {
            this.action = Output.of(Objects.requireNonNull(action));
            return this;
        }
        public Builder timeout(@Nullable Output<RouteSpecTcpRouteTimeoutGetArgs> timeout) {
            this.timeout = timeout;
            return this;
        }
        public Builder timeout(@Nullable RouteSpecTcpRouteTimeoutGetArgs timeout) {
            this.timeout = Output.ofNullable(timeout);
            return this;
        }        public RouteSpecTcpRouteGetArgs build() {
            return new RouteSpecTcpRouteGetArgs(action, timeout);
        }
    }
}
