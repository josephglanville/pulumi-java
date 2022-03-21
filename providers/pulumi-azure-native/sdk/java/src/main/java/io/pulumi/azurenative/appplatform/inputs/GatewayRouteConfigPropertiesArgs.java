// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.appplatform.inputs;

import io.pulumi.azurenative.appplatform.inputs.GatewayApiRouteArgs;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * API route config of the Spring Cloud Gateway
 * 
 */
public final class GatewayRouteConfigPropertiesArgs extends io.pulumi.resources.ResourceArgs {

    public static final GatewayRouteConfigPropertiesArgs Empty = new GatewayRouteConfigPropertiesArgs();

    /**
     * The resource Id of the Azure Spring Cloud app, required unless route defines `uri`.
     * 
     */
    @Import(name="appResourceId")
      private final @Nullable Output<String> appResourceId;

    public Output<String> getAppResourceId() {
        return this.appResourceId == null ? Output.empty() : this.appResourceId;
    }

    /**
     * Array of API routes, each route contains properties such as `title`, `uri`, `ssoEnabled`, `predicates`, `filters`.
     * 
     */
    @Import(name="routes")
      private final @Nullable Output<List<GatewayApiRouteArgs>> routes;

    public Output<List<GatewayApiRouteArgs>> getRoutes() {
        return this.routes == null ? Output.empty() : this.routes;
    }

    public GatewayRouteConfigPropertiesArgs(
        @Nullable Output<String> appResourceId,
        @Nullable Output<List<GatewayApiRouteArgs>> routes) {
        this.appResourceId = appResourceId;
        this.routes = routes;
    }

    private GatewayRouteConfigPropertiesArgs() {
        this.appResourceId = Output.empty();
        this.routes = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GatewayRouteConfigPropertiesArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<String> appResourceId;
        private @Nullable Output<List<GatewayApiRouteArgs>> routes;

        public Builder() {
    	      // Empty
        }

        public Builder(GatewayRouteConfigPropertiesArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.appResourceId = defaults.appResourceId;
    	      this.routes = defaults.routes;
        }

        public Builder appResourceId(@Nullable Output<String> appResourceId) {
            this.appResourceId = appResourceId;
            return this;
        }
        public Builder appResourceId(@Nullable String appResourceId) {
            this.appResourceId = Output.ofNullable(appResourceId);
            return this;
        }
        public Builder routes(@Nullable Output<List<GatewayApiRouteArgs>> routes) {
            this.routes = routes;
            return this;
        }
        public Builder routes(@Nullable List<GatewayApiRouteArgs> routes) {
            this.routes = Output.ofNullable(routes);
            return this;
        }
        public Builder routes(GatewayApiRouteArgs... routes) {
            return routes(List.of(routes));
        }        public GatewayRouteConfigPropertiesArgs build() {
            return new GatewayRouteConfigPropertiesArgs(appResourceId, routes);
        }
    }
}
