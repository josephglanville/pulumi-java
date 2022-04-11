// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.appmesh.inputs;

import io.pulumi.aws.appmesh.inputs.GatewayRouteSpecHttp2RouteActionTargetGetArgs;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import java.util.Objects;


public final class GatewayRouteSpecHttp2RouteActionGetArgs extends io.pulumi.resources.ResourceArgs {

    public static final GatewayRouteSpecHttp2RouteActionGetArgs Empty = new GatewayRouteSpecHttp2RouteActionGetArgs();

    /**
     * The target that traffic is routed to when a request matches the gateway route.
     * 
     */
    @Import(name="target", required=true)
      private final Output<GatewayRouteSpecHttp2RouteActionTargetGetArgs> target;

    public Output<GatewayRouteSpecHttp2RouteActionTargetGetArgs> getTarget() {
        return this.target;
    }

    public GatewayRouteSpecHttp2RouteActionGetArgs(Output<GatewayRouteSpecHttp2RouteActionTargetGetArgs> target) {
        this.target = Objects.requireNonNull(target, "expected parameter 'target' to be non-null");
    }

    private GatewayRouteSpecHttp2RouteActionGetArgs() {
        this.target = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GatewayRouteSpecHttp2RouteActionGetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Output<GatewayRouteSpecHttp2RouteActionTargetGetArgs> target;

        public Builder() {
    	      // Empty
        }

        public Builder(GatewayRouteSpecHttp2RouteActionGetArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.target = defaults.target;
        }

        public Builder target(Output<GatewayRouteSpecHttp2RouteActionTargetGetArgs> target) {
            this.target = Objects.requireNonNull(target);
            return this;
        }
        public Builder target(GatewayRouteSpecHttp2RouteActionTargetGetArgs target) {
            this.target = Output.of(Objects.requireNonNull(target));
            return this;
        }        public GatewayRouteSpecHttp2RouteActionGetArgs build() {
            return new GatewayRouteSpecHttp2RouteActionGetArgs(target);
        }
    }
}
