// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.appmesh.outputs;

import io.pulumi.aws.appmesh.outputs.RouteSpecGrpcRouteActionWeightedTarget;
import io.pulumi.core.annotations.OutputCustomType;
import java.util.List;
import java.util.Objects;

@OutputCustomType
public final class RouteSpecGrpcRouteAction {
    /**
     * The targets that traffic is routed to when a request matches the route.
     * You can specify one or more targets and their relative weights with which to distribute traffic.
     * 
     */
    private final List<RouteSpecGrpcRouteActionWeightedTarget> weightedTargets;

    @OutputCustomType.Constructor
    private RouteSpecGrpcRouteAction(@OutputCustomType.Parameter("weightedTargets") List<RouteSpecGrpcRouteActionWeightedTarget> weightedTargets) {
        this.weightedTargets = weightedTargets;
    }

    /**
     * The targets that traffic is routed to when a request matches the route.
     * You can specify one or more targets and their relative weights with which to distribute traffic.
     * 
    */
    public List<RouteSpecGrpcRouteActionWeightedTarget> getWeightedTargets() {
        return this.weightedTargets;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(RouteSpecGrpcRouteAction defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private List<RouteSpecGrpcRouteActionWeightedTarget> weightedTargets;

        public Builder() {
    	      // Empty
        }

        public Builder(RouteSpecGrpcRouteAction defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.weightedTargets = defaults.weightedTargets;
        }

        public Builder setWeightedTargets(List<RouteSpecGrpcRouteActionWeightedTarget> weightedTargets) {
            this.weightedTargets = Objects.requireNonNull(weightedTargets);
            return this;
        }
        public RouteSpecGrpcRouteAction build() {
            return new RouteSpecGrpcRouteAction(weightedTargets);
        }
    }
}
