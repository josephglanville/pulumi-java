// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.network.outputs;

import io.pulumi.azurenative.network.outputs.RouteResponse;
import io.pulumi.azurenative.network.outputs.SubnetResponse;
import io.pulumi.core.annotations.CustomType;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class RouteTableResponse {
    /**
     * Whether to disable the routes learned by BGP on that route table. True means disable.
     * 
     */
    private final @Nullable Boolean disableBgpRoutePropagation;
    /**
     * A unique read-only string that changes whenever the resource is updated.
     * 
     */
    private final String etag;
    /**
     * Resource ID.
     * 
     */
    private final @Nullable String id;
    /**
     * Resource location.
     * 
     */
    private final @Nullable String location;
    /**
     * Resource name.
     * 
     */
    private final String name;
    /**
     * The provisioning state of the route table resource.
     * 
     */
    private final String provisioningState;
    /**
     * The resource GUID property of the route table.
     * 
     */
    private final String resourceGuid;
    /**
     * Collection of routes contained within a route table.
     * 
     */
    private final @Nullable List<RouteResponse> routes;
    /**
     * A collection of references to subnets.
     * 
     */
    private final List<SubnetResponse> subnets;
    /**
     * Resource tags.
     * 
     */
    private final @Nullable Map<String,String> tags;
    /**
     * Resource type.
     * 
     */
    private final String type;

    @CustomType.Constructor
    private RouteTableResponse(
        @CustomType.Parameter("disableBgpRoutePropagation") @Nullable Boolean disableBgpRoutePropagation,
        @CustomType.Parameter("etag") String etag,
        @CustomType.Parameter("id") @Nullable String id,
        @CustomType.Parameter("location") @Nullable String location,
        @CustomType.Parameter("name") String name,
        @CustomType.Parameter("provisioningState") String provisioningState,
        @CustomType.Parameter("resourceGuid") String resourceGuid,
        @CustomType.Parameter("routes") @Nullable List<RouteResponse> routes,
        @CustomType.Parameter("subnets") List<SubnetResponse> subnets,
        @CustomType.Parameter("tags") @Nullable Map<String,String> tags,
        @CustomType.Parameter("type") String type) {
        this.disableBgpRoutePropagation = disableBgpRoutePropagation;
        this.etag = etag;
        this.id = id;
        this.location = location;
        this.name = name;
        this.provisioningState = provisioningState;
        this.resourceGuid = resourceGuid;
        this.routes = routes;
        this.subnets = subnets;
        this.tags = tags;
        this.type = type;
    }

    /**
     * Whether to disable the routes learned by BGP on that route table. True means disable.
     * 
    */
    public Optional<Boolean> getDisableBgpRoutePropagation() {
        return Optional.ofNullable(this.disableBgpRoutePropagation);
    }
    /**
     * A unique read-only string that changes whenever the resource is updated.
     * 
    */
    public String getEtag() {
        return this.etag;
    }
    /**
     * Resource ID.
     * 
    */
    public Optional<String> getId() {
        return Optional.ofNullable(this.id);
    }
    /**
     * Resource location.
     * 
    */
    public Optional<String> getLocation() {
        return Optional.ofNullable(this.location);
    }
    /**
     * Resource name.
     * 
    */
    public String getName() {
        return this.name;
    }
    /**
     * The provisioning state of the route table resource.
     * 
    */
    public String getProvisioningState() {
        return this.provisioningState;
    }
    /**
     * The resource GUID property of the route table.
     * 
    */
    public String getResourceGuid() {
        return this.resourceGuid;
    }
    /**
     * Collection of routes contained within a route table.
     * 
    */
    public List<RouteResponse> getRoutes() {
        return this.routes == null ? List.of() : this.routes;
    }
    /**
     * A collection of references to subnets.
     * 
    */
    public List<SubnetResponse> getSubnets() {
        return this.subnets;
    }
    /**
     * Resource tags.
     * 
    */
    public Map<String,String> getTags() {
        return this.tags == null ? Map.of() : this.tags;
    }
    /**
     * Resource type.
     * 
    */
    public String getType() {
        return this.type;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(RouteTableResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Boolean disableBgpRoutePropagation;
        private String etag;
        private @Nullable String id;
        private @Nullable String location;
        private String name;
        private String provisioningState;
        private String resourceGuid;
        private @Nullable List<RouteResponse> routes;
        private List<SubnetResponse> subnets;
        private @Nullable Map<String,String> tags;
        private String type;

        public Builder() {
    	      // Empty
        }

        public Builder(RouteTableResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.disableBgpRoutePropagation = defaults.disableBgpRoutePropagation;
    	      this.etag = defaults.etag;
    	      this.id = defaults.id;
    	      this.location = defaults.location;
    	      this.name = defaults.name;
    	      this.provisioningState = defaults.provisioningState;
    	      this.resourceGuid = defaults.resourceGuid;
    	      this.routes = defaults.routes;
    	      this.subnets = defaults.subnets;
    	      this.tags = defaults.tags;
    	      this.type = defaults.type;
        }

        public Builder disableBgpRoutePropagation(@Nullable Boolean disableBgpRoutePropagation) {
            this.disableBgpRoutePropagation = disableBgpRoutePropagation;
            return this;
        }
        public Builder etag(String etag) {
            this.etag = Objects.requireNonNull(etag);
            return this;
        }
        public Builder id(@Nullable String id) {
            this.id = id;
            return this;
        }
        public Builder location(@Nullable String location) {
            this.location = location;
            return this;
        }
        public Builder name(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }
        public Builder provisioningState(String provisioningState) {
            this.provisioningState = Objects.requireNonNull(provisioningState);
            return this;
        }
        public Builder resourceGuid(String resourceGuid) {
            this.resourceGuid = Objects.requireNonNull(resourceGuid);
            return this;
        }
        public Builder routes(@Nullable List<RouteResponse> routes) {
            this.routes = routes;
            return this;
        }
        public Builder routes(RouteResponse... routes) {
            return routes(List.of(routes));
        }
        public Builder subnets(List<SubnetResponse> subnets) {
            this.subnets = Objects.requireNonNull(subnets);
            return this;
        }
        public Builder subnets(SubnetResponse... subnets) {
            return subnets(List.of(subnets));
        }
        public Builder tags(@Nullable Map<String,String> tags) {
            this.tags = tags;
            return this;
        }
        public Builder type(String type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }        public RouteTableResponse build() {
            return new RouteTableResponse(disableBgpRoutePropagation, etag, id, location, name, provisioningState, resourceGuid, routes, subnets, tags, type);
        }
    }
}
