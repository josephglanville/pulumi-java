// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.appmesh.inputs;

import io.pulumi.aws.appmesh.inputs.RouteSpecHttpRouteActionGetArgs;
import io.pulumi.aws.appmesh.inputs.RouteSpecHttpRouteMatchGetArgs;
import io.pulumi.aws.appmesh.inputs.RouteSpecHttpRouteRetryPolicyGetArgs;
import io.pulumi.aws.appmesh.inputs.RouteSpecHttpRouteTimeoutGetArgs;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import java.util.Objects;
import javax.annotation.Nullable;


public final class RouteSpecHttpRouteGetArgs extends io.pulumi.resources.ResourceArgs {

    public static final RouteSpecHttpRouteGetArgs Empty = new RouteSpecHttpRouteGetArgs();

    /**
     * The action to take if a match is determined.
     * 
     */
    @Import(name="action", required=true)
      private final Output<RouteSpecHttpRouteActionGetArgs> action;

    public Output<RouteSpecHttpRouteActionGetArgs> getAction() {
        return this.action;
    }

    /**
     * The criteria for determining an HTTP request match.
     * 
     */
    @Import(name="match", required=true)
      private final Output<RouteSpecHttpRouteMatchGetArgs> match;

    public Output<RouteSpecHttpRouteMatchGetArgs> getMatch() {
        return this.match;
    }

    /**
     * The retry policy.
     * 
     */
    @Import(name="retryPolicy")
      private final @Nullable Output<RouteSpecHttpRouteRetryPolicyGetArgs> retryPolicy;

    public Output<RouteSpecHttpRouteRetryPolicyGetArgs> getRetryPolicy() {
        return this.retryPolicy == null ? Output.empty() : this.retryPolicy;
    }

    /**
     * The types of timeouts.
     * 
     */
    @Import(name="timeout")
      private final @Nullable Output<RouteSpecHttpRouteTimeoutGetArgs> timeout;

    public Output<RouteSpecHttpRouteTimeoutGetArgs> getTimeout() {
        return this.timeout == null ? Output.empty() : this.timeout;
    }

    public RouteSpecHttpRouteGetArgs(
        Output<RouteSpecHttpRouteActionGetArgs> action,
        Output<RouteSpecHttpRouteMatchGetArgs> match,
        @Nullable Output<RouteSpecHttpRouteRetryPolicyGetArgs> retryPolicy,
        @Nullable Output<RouteSpecHttpRouteTimeoutGetArgs> timeout) {
        this.action = Objects.requireNonNull(action, "expected parameter 'action' to be non-null");
        this.match = Objects.requireNonNull(match, "expected parameter 'match' to be non-null");
        this.retryPolicy = retryPolicy;
        this.timeout = timeout;
    }

    private RouteSpecHttpRouteGetArgs() {
        this.action = Output.empty();
        this.match = Output.empty();
        this.retryPolicy = Output.empty();
        this.timeout = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(RouteSpecHttpRouteGetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Output<RouteSpecHttpRouteActionGetArgs> action;
        private Output<RouteSpecHttpRouteMatchGetArgs> match;
        private @Nullable Output<RouteSpecHttpRouteRetryPolicyGetArgs> retryPolicy;
        private @Nullable Output<RouteSpecHttpRouteTimeoutGetArgs> timeout;

        public Builder() {
    	      // Empty
        }

        public Builder(RouteSpecHttpRouteGetArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.action = defaults.action;
    	      this.match = defaults.match;
    	      this.retryPolicy = defaults.retryPolicy;
    	      this.timeout = defaults.timeout;
        }

        public Builder action(Output<RouteSpecHttpRouteActionGetArgs> action) {
            this.action = Objects.requireNonNull(action);
            return this;
        }
        public Builder action(RouteSpecHttpRouteActionGetArgs action) {
            this.action = Output.of(Objects.requireNonNull(action));
            return this;
        }
        public Builder match(Output<RouteSpecHttpRouteMatchGetArgs> match) {
            this.match = Objects.requireNonNull(match);
            return this;
        }
        public Builder match(RouteSpecHttpRouteMatchGetArgs match) {
            this.match = Output.of(Objects.requireNonNull(match));
            return this;
        }
        public Builder retryPolicy(@Nullable Output<RouteSpecHttpRouteRetryPolicyGetArgs> retryPolicy) {
            this.retryPolicy = retryPolicy;
            return this;
        }
        public Builder retryPolicy(@Nullable RouteSpecHttpRouteRetryPolicyGetArgs retryPolicy) {
            this.retryPolicy = Output.ofNullable(retryPolicy);
            return this;
        }
        public Builder timeout(@Nullable Output<RouteSpecHttpRouteTimeoutGetArgs> timeout) {
            this.timeout = timeout;
            return this;
        }
        public Builder timeout(@Nullable RouteSpecHttpRouteTimeoutGetArgs timeout) {
            this.timeout = Output.ofNullable(timeout);
            return this;
        }        public RouteSpecHttpRouteGetArgs build() {
            return new RouteSpecHttpRouteGetArgs(action, match, retryPolicy, timeout);
        }
    }
}
