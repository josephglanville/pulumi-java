// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.appmesh.inputs;

import io.pulumi.aws.appmesh.inputs.GatewayRouteSpecHttpRouteActionTargetVirtualServiceArgs;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import java.util.Objects;


public final class GatewayRouteSpecHttpRouteActionTargetArgs extends io.pulumi.resources.ResourceArgs {

    public static final GatewayRouteSpecHttpRouteActionTargetArgs Empty = new GatewayRouteSpecHttpRouteActionTargetArgs();

    /**
     * The virtual service gateway route target.
     * 
     */
    @Import(name="virtualService", required=true)
      private final Output<GatewayRouteSpecHttpRouteActionTargetVirtualServiceArgs> virtualService;

    public Output<GatewayRouteSpecHttpRouteActionTargetVirtualServiceArgs> getVirtualService() {
        return this.virtualService;
    }

    public GatewayRouteSpecHttpRouteActionTargetArgs(Output<GatewayRouteSpecHttpRouteActionTargetVirtualServiceArgs> virtualService) {
        this.virtualService = Objects.requireNonNull(virtualService, "expected parameter 'virtualService' to be non-null");
    }

    private GatewayRouteSpecHttpRouteActionTargetArgs() {
        this.virtualService = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GatewayRouteSpecHttpRouteActionTargetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Output<GatewayRouteSpecHttpRouteActionTargetVirtualServiceArgs> virtualService;

        public Builder() {
    	      // Empty
        }

        public Builder(GatewayRouteSpecHttpRouteActionTargetArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.virtualService = defaults.virtualService;
        }

        public Builder virtualService(Output<GatewayRouteSpecHttpRouteActionTargetVirtualServiceArgs> virtualService) {
            this.virtualService = Objects.requireNonNull(virtualService);
            return this;
        }
        public Builder virtualService(GatewayRouteSpecHttpRouteActionTargetVirtualServiceArgs virtualService) {
            this.virtualService = Output.of(Objects.requireNonNull(virtualService));
            return this;
        }        public GatewayRouteSpecHttpRouteActionTargetArgs build() {
            return new GatewayRouteSpecHttpRouteActionTargetArgs(virtualService);
        }
    }
}
