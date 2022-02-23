// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.network.inputs;

import io.pulumi.azurenative.network.inputs.RouteArgs;
import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * Route table resource.
 * 
 */
public final class RouteTableArgs extends io.pulumi.resources.ResourceArgs {

    public static final RouteTableArgs Empty = new RouteTableArgs();

    /**
     * Whether to disable the routes learned by BGP on that route table. True means disable.
     * 
     */
    @InputImport(name="disableBgpRoutePropagation")
      private final @Nullable Input<Boolean> disableBgpRoutePropagation;

    public Input<Boolean> getDisableBgpRoutePropagation() {
        return this.disableBgpRoutePropagation == null ? Input.empty() : this.disableBgpRoutePropagation;
    }

    /**
     * Resource ID.
     * 
     */
    @InputImport(name="id")
      private final @Nullable Input<String> id;

    public Input<String> getId() {
        return this.id == null ? Input.empty() : this.id;
    }

    /**
     * Resource location.
     * 
     */
    @InputImport(name="location")
      private final @Nullable Input<String> location;

    public Input<String> getLocation() {
        return this.location == null ? Input.empty() : this.location;
    }

    /**
     * Collection of routes contained within a route table.
     * 
     */
    @InputImport(name="routes")
      private final @Nullable Input<List<RouteArgs>> routes;

    public Input<List<RouteArgs>> getRoutes() {
        return this.routes == null ? Input.empty() : this.routes;
    }

    /**
     * Resource tags.
     * 
     */
    @InputImport(name="tags")
      private final @Nullable Input<Map<String,String>> tags;

    public Input<Map<String,String>> getTags() {
        return this.tags == null ? Input.empty() : this.tags;
    }

    public RouteTableArgs(
        @Nullable Input<Boolean> disableBgpRoutePropagation,
        @Nullable Input<String> id,
        @Nullable Input<String> location,
        @Nullable Input<List<RouteArgs>> routes,
        @Nullable Input<Map<String,String>> tags) {
        this.disableBgpRoutePropagation = disableBgpRoutePropagation;
        this.id = id;
        this.location = location;
        this.routes = routes;
        this.tags = tags;
    }

    private RouteTableArgs() {
        this.disableBgpRoutePropagation = Input.empty();
        this.id = Input.empty();
        this.location = Input.empty();
        this.routes = Input.empty();
        this.tags = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(RouteTableArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<Boolean> disableBgpRoutePropagation;
        private @Nullable Input<String> id;
        private @Nullable Input<String> location;
        private @Nullable Input<List<RouteArgs>> routes;
        private @Nullable Input<Map<String,String>> tags;

        public Builder() {
    	      // Empty
        }

        public Builder(RouteTableArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.disableBgpRoutePropagation = defaults.disableBgpRoutePropagation;
    	      this.id = defaults.id;
    	      this.location = defaults.location;
    	      this.routes = defaults.routes;
    	      this.tags = defaults.tags;
        }

        public Builder setDisableBgpRoutePropagation(@Nullable Input<Boolean> disableBgpRoutePropagation) {
            this.disableBgpRoutePropagation = disableBgpRoutePropagation;
            return this;
        }

        public Builder setDisableBgpRoutePropagation(@Nullable Boolean disableBgpRoutePropagation) {
            this.disableBgpRoutePropagation = Input.ofNullable(disableBgpRoutePropagation);
            return this;
        }

        public Builder setId(@Nullable Input<String> id) {
            this.id = id;
            return this;
        }

        public Builder setId(@Nullable String id) {
            this.id = Input.ofNullable(id);
            return this;
        }

        public Builder setLocation(@Nullable Input<String> location) {
            this.location = location;
            return this;
        }

        public Builder setLocation(@Nullable String location) {
            this.location = Input.ofNullable(location);
            return this;
        }

        public Builder setRoutes(@Nullable Input<List<RouteArgs>> routes) {
            this.routes = routes;
            return this;
        }

        public Builder setRoutes(@Nullable List<RouteArgs> routes) {
            this.routes = Input.ofNullable(routes);
            return this;
        }

        public Builder setTags(@Nullable Input<Map<String,String>> tags) {
            this.tags = tags;
            return this;
        }

        public Builder setTags(@Nullable Map<String,String> tags) {
            this.tags = Input.ofNullable(tags);
            return this;
        }
        public RouteTableArgs build() {
            return new RouteTableArgs(disableBgpRoutePropagation, id, location, routes, tags);
        }
    }
}
