// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.appmesh.inputs;

import io.pulumi.aws.appmesh.inputs.GatewayRouteSpecGrpcRouteActionGetArgs;
import io.pulumi.aws.appmesh.inputs.GatewayRouteSpecGrpcRouteMatchGetArgs;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import java.util.Objects;


public final class GatewayRouteSpecGrpcRouteGetArgs extends io.pulumi.resources.ResourceArgs {

    public static final GatewayRouteSpecGrpcRouteGetArgs Empty = new GatewayRouteSpecGrpcRouteGetArgs();

    /**
     * The action to take if a match is determined.
     * 
     */
    @Import(name="action", required=true)
      private final Output<GatewayRouteSpecGrpcRouteActionGetArgs> action;

    public Output<GatewayRouteSpecGrpcRouteActionGetArgs> getAction() {
        return this.action;
    }

    /**
     * The criteria for determining a request match.
     * 
     */
    @Import(name="match", required=true)
      private final Output<GatewayRouteSpecGrpcRouteMatchGetArgs> match;

    public Output<GatewayRouteSpecGrpcRouteMatchGetArgs> getMatch() {
        return this.match;
    }

    public GatewayRouteSpecGrpcRouteGetArgs(
        Output<GatewayRouteSpecGrpcRouteActionGetArgs> action,
        Output<GatewayRouteSpecGrpcRouteMatchGetArgs> match) {
        this.action = Objects.requireNonNull(action, "expected parameter 'action' to be non-null");
        this.match = Objects.requireNonNull(match, "expected parameter 'match' to be non-null");
    }

    private GatewayRouteSpecGrpcRouteGetArgs() {
        this.action = Output.empty();
        this.match = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GatewayRouteSpecGrpcRouteGetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Output<GatewayRouteSpecGrpcRouteActionGetArgs> action;
        private Output<GatewayRouteSpecGrpcRouteMatchGetArgs> match;

        public Builder() {
    	      // Empty
        }

        public Builder(GatewayRouteSpecGrpcRouteGetArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.action = defaults.action;
    	      this.match = defaults.match;
        }

        public Builder action(Output<GatewayRouteSpecGrpcRouteActionGetArgs> action) {
            this.action = Objects.requireNonNull(action);
            return this;
        }
        public Builder action(GatewayRouteSpecGrpcRouteActionGetArgs action) {
            this.action = Output.of(Objects.requireNonNull(action));
            return this;
        }
        public Builder match(Output<GatewayRouteSpecGrpcRouteMatchGetArgs> match) {
            this.match = Objects.requireNonNull(match);
            return this;
        }
        public Builder match(GatewayRouteSpecGrpcRouteMatchGetArgs match) {
            this.match = Output.of(Objects.requireNonNull(match));
            return this;
        }        public GatewayRouteSpecGrpcRouteGetArgs build() {
            return new GatewayRouteSpecGrpcRouteGetArgs(action, match);
        }
    }
}