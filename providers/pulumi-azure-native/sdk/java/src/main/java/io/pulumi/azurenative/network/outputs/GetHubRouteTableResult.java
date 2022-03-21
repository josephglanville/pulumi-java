// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.network.outputs;

import io.pulumi.azurenative.network.outputs.HubRouteResponse;
import io.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class GetHubRouteTableResult {
    /**
     * List of all connections associated with this route table.
     * 
     */
    private final List<String> associatedConnections;
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
     * List of labels associated with this route table.
     * 
     */
    private final @Nullable List<String> labels;
    /**
     * The name of the resource that is unique within a resource group. This name can be used to access the resource.
     * 
     */
    private final @Nullable String name;
    /**
     * List of all connections that advertise to this route table.
     * 
     */
    private final List<String> propagatingConnections;
    /**
     * The provisioning state of the RouteTable resource.
     * 
     */
    private final String provisioningState;
    /**
     * List of all routes.
     * 
     */
    private final @Nullable List<HubRouteResponse> routes;
    /**
     * Resource type.
     * 
     */
    private final String type;

    @CustomType.Constructor
    private GetHubRouteTableResult(
        @CustomType.Parameter("associatedConnections") List<String> associatedConnections,
        @CustomType.Parameter("etag") String etag,
        @CustomType.Parameter("id") @Nullable String id,
        @CustomType.Parameter("labels") @Nullable List<String> labels,
        @CustomType.Parameter("name") @Nullable String name,
        @CustomType.Parameter("propagatingConnections") List<String> propagatingConnections,
        @CustomType.Parameter("provisioningState") String provisioningState,
        @CustomType.Parameter("routes") @Nullable List<HubRouteResponse> routes,
        @CustomType.Parameter("type") String type) {
        this.associatedConnections = associatedConnections;
        this.etag = etag;
        this.id = id;
        this.labels = labels;
        this.name = name;
        this.propagatingConnections = propagatingConnections;
        this.provisioningState = provisioningState;
        this.routes = routes;
        this.type = type;
    }

    /**
     * List of all connections associated with this route table.
     * 
    */
    public List<String> getAssociatedConnections() {
        return this.associatedConnections;
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
     * List of labels associated with this route table.
     * 
    */
    public List<String> getLabels() {
        return this.labels == null ? List.of() : this.labels;
    }
    /**
     * The name of the resource that is unique within a resource group. This name can be used to access the resource.
     * 
    */
    public Optional<String> getName() {
        return Optional.ofNullable(this.name);
    }
    /**
     * List of all connections that advertise to this route table.
     * 
    */
    public List<String> getPropagatingConnections() {
        return this.propagatingConnections;
    }
    /**
     * The provisioning state of the RouteTable resource.
     * 
    */
    public String getProvisioningState() {
        return this.provisioningState;
    }
    /**
     * List of all routes.
     * 
    */
    public List<HubRouteResponse> getRoutes() {
        return this.routes == null ? List.of() : this.routes;
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

    public static Builder builder(GetHubRouteTableResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private List<String> associatedConnections;
        private String etag;
        private @Nullable String id;
        private @Nullable List<String> labels;
        private @Nullable String name;
        private List<String> propagatingConnections;
        private String provisioningState;
        private @Nullable List<HubRouteResponse> routes;
        private String type;

        public Builder() {
    	      // Empty
        }

        public Builder(GetHubRouteTableResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.associatedConnections = defaults.associatedConnections;
    	      this.etag = defaults.etag;
    	      this.id = defaults.id;
    	      this.labels = defaults.labels;
    	      this.name = defaults.name;
    	      this.propagatingConnections = defaults.propagatingConnections;
    	      this.provisioningState = defaults.provisioningState;
    	      this.routes = defaults.routes;
    	      this.type = defaults.type;
        }

        public Builder associatedConnections(List<String> associatedConnections) {
            this.associatedConnections = Objects.requireNonNull(associatedConnections);
            return this;
        }
        public Builder associatedConnections(String... associatedConnections) {
            return associatedConnections(List.of(associatedConnections));
        }
        public Builder etag(String etag) {
            this.etag = Objects.requireNonNull(etag);
            return this;
        }
        public Builder id(@Nullable String id) {
            this.id = id;
            return this;
        }
        public Builder labels(@Nullable List<String> labels) {
            this.labels = labels;
            return this;
        }
        public Builder labels(String... labels) {
            return labels(List.of(labels));
        }
        public Builder name(@Nullable String name) {
            this.name = name;
            return this;
        }
        public Builder propagatingConnections(List<String> propagatingConnections) {
            this.propagatingConnections = Objects.requireNonNull(propagatingConnections);
            return this;
        }
        public Builder propagatingConnections(String... propagatingConnections) {
            return propagatingConnections(List.of(propagatingConnections));
        }
        public Builder provisioningState(String provisioningState) {
            this.provisioningState = Objects.requireNonNull(provisioningState);
            return this;
        }
        public Builder routes(@Nullable List<HubRouteResponse> routes) {
            this.routes = routes;
            return this;
        }
        public Builder routes(HubRouteResponse... routes) {
            return routes(List.of(routes));
        }
        public Builder type(String type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }        public GetHubRouteTableResult build() {
            return new GetHubRouteTableResult(associatedConnections, etag, id, labels, name, propagatingConnections, provisioningState, routes, type);
        }
    }
}
