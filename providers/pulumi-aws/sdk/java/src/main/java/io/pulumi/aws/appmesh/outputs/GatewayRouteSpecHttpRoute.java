// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.appmesh.outputs;

import io.pulumi.aws.appmesh.outputs.GatewayRouteSpecHttpRouteAction;
import io.pulumi.aws.appmesh.outputs.GatewayRouteSpecHttpRouteMatch;
import io.pulumi.core.annotations.CustomType;
import java.util.Objects;

@CustomType
public final class GatewayRouteSpecHttpRoute {
    /**
     * The action to take if a match is determined.
     * 
     */
    private final GatewayRouteSpecHttpRouteAction action;
    /**
     * The criteria for determining a request match.
     * 
     */
    private final GatewayRouteSpecHttpRouteMatch match;

    @CustomType.Constructor
    private GatewayRouteSpecHttpRoute(
        @CustomType.Parameter("action") GatewayRouteSpecHttpRouteAction action,
        @CustomType.Parameter("match") GatewayRouteSpecHttpRouteMatch match) {
        this.action = action;
        this.match = match;
    }

    /**
     * The action to take if a match is determined.
     * 
    */
    public GatewayRouteSpecHttpRouteAction getAction() {
        return this.action;
    }
    /**
     * The criteria for determining a request match.
     * 
    */
    public GatewayRouteSpecHttpRouteMatch getMatch() {
        return this.match;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GatewayRouteSpecHttpRoute defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GatewayRouteSpecHttpRouteAction action;
        private GatewayRouteSpecHttpRouteMatch match;

        public Builder() {
    	      // Empty
        }

        public Builder(GatewayRouteSpecHttpRoute defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.action = defaults.action;
    	      this.match = defaults.match;
        }

        public Builder action(GatewayRouteSpecHttpRouteAction action) {
            this.action = Objects.requireNonNull(action);
            return this;
        }
        public Builder match(GatewayRouteSpecHttpRouteMatch match) {
            this.match = Objects.requireNonNull(match);
            return this;
        }        public GatewayRouteSpecHttpRoute build() {
            return new GatewayRouteSpecHttpRoute(action, match);
        }
    }
}
