// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.appmesh.inputs;

import io.pulumi.aws.appmesh.inputs.GatewayRouteSpecHttpRouteActionTargetVirtualServiceGetArgs;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import java.util.Objects;


public final class GatewayRouteSpecHttpRouteActionTargetGetArgs extends io.pulumi.resources.ResourceArgs {

    public static final GatewayRouteSpecHttpRouteActionTargetGetArgs Empty = new GatewayRouteSpecHttpRouteActionTargetGetArgs();

    /**
     * The virtual service gateway route target.
     * 
     */
    @Import(name="virtualService", required=true)
      private final Output<GatewayRouteSpecHttpRouteActionTargetVirtualServiceGetArgs> virtualService;

    public Output<GatewayRouteSpecHttpRouteActionTargetVirtualServiceGetArgs> getVirtualService() {
        return this.virtualService;
    }

    public GatewayRouteSpecHttpRouteActionTargetGetArgs(Output<GatewayRouteSpecHttpRouteActionTargetVirtualServiceGetArgs> virtualService) {
        this.virtualService = Objects.requireNonNull(virtualService, "expected parameter 'virtualService' to be non-null");
    }

    private GatewayRouteSpecHttpRouteActionTargetGetArgs() {
        this.virtualService = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GatewayRouteSpecHttpRouteActionTargetGetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Output<GatewayRouteSpecHttpRouteActionTargetVirtualServiceGetArgs> virtualService;

        public Builder() {
    	      // Empty
        }

        public Builder(GatewayRouteSpecHttpRouteActionTargetGetArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.virtualService = defaults.virtualService;
        }

        public Builder virtualService(Output<GatewayRouteSpecHttpRouteActionTargetVirtualServiceGetArgs> virtualService) {
            this.virtualService = Objects.requireNonNull(virtualService);
            return this;
        }
        public Builder virtualService(GatewayRouteSpecHttpRouteActionTargetVirtualServiceGetArgs virtualService) {
            this.virtualService = Output.of(Objects.requireNonNull(virtualService));
            return this;
        }        public GatewayRouteSpecHttpRouteActionTargetGetArgs build() {
            return new GatewayRouteSpecHttpRouteActionTargetGetArgs(virtualService);
        }
    }
}
