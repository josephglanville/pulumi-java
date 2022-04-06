// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.appmesh.inputs;

import io.pulumi.aws.appmesh.inputs.RouteSpecGrpcRouteTimeoutIdleGetArgs;
import io.pulumi.aws.appmesh.inputs.RouteSpecGrpcRouteTimeoutPerRequestGetArgs;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import java.util.Objects;
import javax.annotation.Nullable;


public final class RouteSpecGrpcRouteTimeoutGetArgs extends io.pulumi.resources.ResourceArgs {

    public static final RouteSpecGrpcRouteTimeoutGetArgs Empty = new RouteSpecGrpcRouteTimeoutGetArgs();

    /**
     * The idle timeout. An idle timeout bounds the amount of time that a connection may be idle.
     * 
     */
    @Import(name="idle")
      private final @Nullable Output<RouteSpecGrpcRouteTimeoutIdleGetArgs> idle;

    public Output<RouteSpecGrpcRouteTimeoutIdleGetArgs> getIdle() {
        return this.idle == null ? Output.empty() : this.idle;
    }

    /**
     * The per request timeout.
     * 
     */
    @Import(name="perRequest")
      private final @Nullable Output<RouteSpecGrpcRouteTimeoutPerRequestGetArgs> perRequest;

    public Output<RouteSpecGrpcRouteTimeoutPerRequestGetArgs> getPerRequest() {
        return this.perRequest == null ? Output.empty() : this.perRequest;
    }

    public RouteSpecGrpcRouteTimeoutGetArgs(
        @Nullable Output<RouteSpecGrpcRouteTimeoutIdleGetArgs> idle,
        @Nullable Output<RouteSpecGrpcRouteTimeoutPerRequestGetArgs> perRequest) {
        this.idle = idle;
        this.perRequest = perRequest;
    }

    private RouteSpecGrpcRouteTimeoutGetArgs() {
        this.idle = Output.empty();
        this.perRequest = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(RouteSpecGrpcRouteTimeoutGetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<RouteSpecGrpcRouteTimeoutIdleGetArgs> idle;
        private @Nullable Output<RouteSpecGrpcRouteTimeoutPerRequestGetArgs> perRequest;

        public Builder() {
    	      // Empty
        }

        public Builder(RouteSpecGrpcRouteTimeoutGetArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.idle = defaults.idle;
    	      this.perRequest = defaults.perRequest;
        }

        public Builder idle(@Nullable Output<RouteSpecGrpcRouteTimeoutIdleGetArgs> idle) {
            this.idle = idle;
            return this;
        }
        public Builder idle(@Nullable RouteSpecGrpcRouteTimeoutIdleGetArgs idle) {
            this.idle = Output.ofNullable(idle);
            return this;
        }
        public Builder perRequest(@Nullable Output<RouteSpecGrpcRouteTimeoutPerRequestGetArgs> perRequest) {
            this.perRequest = perRequest;
            return this;
        }
        public Builder perRequest(@Nullable RouteSpecGrpcRouteTimeoutPerRequestGetArgs perRequest) {
            this.perRequest = Output.ofNullable(perRequest);
            return this;
        }        public RouteSpecGrpcRouteTimeoutGetArgs build() {
            return new RouteSpecGrpcRouteTimeoutGetArgs(idle, perRequest);
        }
    }
}