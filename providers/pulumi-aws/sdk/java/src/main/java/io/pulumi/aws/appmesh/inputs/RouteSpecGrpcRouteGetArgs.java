// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.appmesh.inputs;

import io.pulumi.aws.appmesh.inputs.RouteSpecGrpcRouteActionGetArgs;
import io.pulumi.aws.appmesh.inputs.RouteSpecGrpcRouteMatchGetArgs;
import io.pulumi.aws.appmesh.inputs.RouteSpecGrpcRouteRetryPolicyGetArgs;
import io.pulumi.aws.appmesh.inputs.RouteSpecGrpcRouteTimeoutGetArgs;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import java.util.Objects;
import javax.annotation.Nullable;


public final class RouteSpecGrpcRouteGetArgs extends io.pulumi.resources.ResourceArgs {

    public static final RouteSpecGrpcRouteGetArgs Empty = new RouteSpecGrpcRouteGetArgs();

    /**
     * The action to take if a match is determined.
     * 
     */
    @Import(name="action", required=true)
      private final Output<RouteSpecGrpcRouteActionGetArgs> action;

    public Output<RouteSpecGrpcRouteActionGetArgs> getAction() {
        return this.action;
    }

    /**
     * The criteria for determining an gRPC request match.
     * 
     */
    @Import(name="match")
      private final @Nullable Output<RouteSpecGrpcRouteMatchGetArgs> match;

    public Output<RouteSpecGrpcRouteMatchGetArgs> getMatch() {
        return this.match == null ? Output.empty() : this.match;
    }

    /**
     * The retry policy.
     * 
     */
    @Import(name="retryPolicy")
      private final @Nullable Output<RouteSpecGrpcRouteRetryPolicyGetArgs> retryPolicy;

    public Output<RouteSpecGrpcRouteRetryPolicyGetArgs> getRetryPolicy() {
        return this.retryPolicy == null ? Output.empty() : this.retryPolicy;
    }

    /**
     * The types of timeouts.
     * 
     */
    @Import(name="timeout")
      private final @Nullable Output<RouteSpecGrpcRouteTimeoutGetArgs> timeout;

    public Output<RouteSpecGrpcRouteTimeoutGetArgs> getTimeout() {
        return this.timeout == null ? Output.empty() : this.timeout;
    }

    public RouteSpecGrpcRouteGetArgs(
        Output<RouteSpecGrpcRouteActionGetArgs> action,
        @Nullable Output<RouteSpecGrpcRouteMatchGetArgs> match,
        @Nullable Output<RouteSpecGrpcRouteRetryPolicyGetArgs> retryPolicy,
        @Nullable Output<RouteSpecGrpcRouteTimeoutGetArgs> timeout) {
        this.action = Objects.requireNonNull(action, "expected parameter 'action' to be non-null");
        this.match = match;
        this.retryPolicy = retryPolicy;
        this.timeout = timeout;
    }

    private RouteSpecGrpcRouteGetArgs() {
        this.action = Output.empty();
        this.match = Output.empty();
        this.retryPolicy = Output.empty();
        this.timeout = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(RouteSpecGrpcRouteGetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Output<RouteSpecGrpcRouteActionGetArgs> action;
        private @Nullable Output<RouteSpecGrpcRouteMatchGetArgs> match;
        private @Nullable Output<RouteSpecGrpcRouteRetryPolicyGetArgs> retryPolicy;
        private @Nullable Output<RouteSpecGrpcRouteTimeoutGetArgs> timeout;

        public Builder() {
    	      // Empty
        }

        public Builder(RouteSpecGrpcRouteGetArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.action = defaults.action;
    	      this.match = defaults.match;
    	      this.retryPolicy = defaults.retryPolicy;
    	      this.timeout = defaults.timeout;
        }

        public Builder action(Output<RouteSpecGrpcRouteActionGetArgs> action) {
            this.action = Objects.requireNonNull(action);
            return this;
        }
        public Builder action(RouteSpecGrpcRouteActionGetArgs action) {
            this.action = Output.of(Objects.requireNonNull(action));
            return this;
        }
        public Builder match(@Nullable Output<RouteSpecGrpcRouteMatchGetArgs> match) {
            this.match = match;
            return this;
        }
        public Builder match(@Nullable RouteSpecGrpcRouteMatchGetArgs match) {
            this.match = Output.ofNullable(match);
            return this;
        }
        public Builder retryPolicy(@Nullable Output<RouteSpecGrpcRouteRetryPolicyGetArgs> retryPolicy) {
            this.retryPolicy = retryPolicy;
            return this;
        }
        public Builder retryPolicy(@Nullable RouteSpecGrpcRouteRetryPolicyGetArgs retryPolicy) {
            this.retryPolicy = Output.ofNullable(retryPolicy);
            return this;
        }
        public Builder timeout(@Nullable Output<RouteSpecGrpcRouteTimeoutGetArgs> timeout) {
            this.timeout = timeout;
            return this;
        }
        public Builder timeout(@Nullable RouteSpecGrpcRouteTimeoutGetArgs timeout) {
            this.timeout = Output.ofNullable(timeout);
            return this;
        }        public RouteSpecGrpcRouteGetArgs build() {
            return new RouteSpecGrpcRouteGetArgs(action, match, retryPolicy, timeout);
        }
    }
}
