// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.devices.inputs;

import io.pulumi.azurenative.devices.inputs.EnrichmentPropertiesResponse;
import io.pulumi.azurenative.devices.inputs.FallbackRoutePropertiesResponse;
import io.pulumi.azurenative.devices.inputs.RoutePropertiesResponse;
import io.pulumi.azurenative.devices.inputs.RoutingEndpointsResponse;
import io.pulumi.core.annotations.InputImport;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * The routing related properties of the IoT hub. See: https://docs.microsoft.com/azure/iot-hub/iot-hub-devguide-messaging
 * 
 */
public final class RoutingPropertiesResponse extends io.pulumi.resources.InvokeArgs {

    public static final RoutingPropertiesResponse Empty = new RoutingPropertiesResponse();

    /**
     * The properties related to the custom endpoints to which your IoT hub routes messages based on the routing rules. A maximum of 10 custom endpoints are allowed across all endpoint types for paid hubs and only 1 custom endpoint is allowed across all endpoint types for free hubs.
     * 
     */
    @InputImport(name="endpoints")
      private final @Nullable RoutingEndpointsResponse endpoints;

    public Optional<RoutingEndpointsResponse> getEndpoints() {
        return this.endpoints == null ? Optional.empty() : Optional.ofNullable(this.endpoints);
    }

    /**
     * The list of user-provided enrichments that the IoT hub applies to messages to be delivered to built-in and custom endpoints. See: https://aka.ms/telemetryoneventgrid
     * 
     */
    @InputImport(name="enrichments")
      private final @Nullable List<EnrichmentPropertiesResponse> enrichments;

    public List<EnrichmentPropertiesResponse> getEnrichments() {
        return this.enrichments == null ? List.of() : this.enrichments;
    }

    /**
     * The properties of the route that is used as a fall-back route when none of the conditions specified in the 'routes' section are met. This is an optional parameter. When this property is not set, the messages which do not meet any of the conditions specified in the 'routes' section get routed to the built-in eventhub endpoint.
     * 
     */
    @InputImport(name="fallbackRoute")
      private final @Nullable FallbackRoutePropertiesResponse fallbackRoute;

    public Optional<FallbackRoutePropertiesResponse> getFallbackRoute() {
        return this.fallbackRoute == null ? Optional.empty() : Optional.ofNullable(this.fallbackRoute);
    }

    /**
     * The list of user-provided routing rules that the IoT hub uses to route messages to built-in and custom endpoints. A maximum of 100 routing rules are allowed for paid hubs and a maximum of 5 routing rules are allowed for free hubs.
     * 
     */
    @InputImport(name="routes")
      private final @Nullable List<RoutePropertiesResponse> routes;

    public List<RoutePropertiesResponse> getRoutes() {
        return this.routes == null ? List.of() : this.routes;
    }

    public RoutingPropertiesResponse(
        @Nullable RoutingEndpointsResponse endpoints,
        @Nullable List<EnrichmentPropertiesResponse> enrichments,
        @Nullable FallbackRoutePropertiesResponse fallbackRoute,
        @Nullable List<RoutePropertiesResponse> routes) {
        this.endpoints = endpoints;
        this.enrichments = enrichments;
        this.fallbackRoute = fallbackRoute;
        this.routes = routes;
    }

    private RoutingPropertiesResponse() {
        this.endpoints = null;
        this.enrichments = List.of();
        this.fallbackRoute = null;
        this.routes = List.of();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(RoutingPropertiesResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable RoutingEndpointsResponse endpoints;
        private @Nullable List<EnrichmentPropertiesResponse> enrichments;
        private @Nullable FallbackRoutePropertiesResponse fallbackRoute;
        private @Nullable List<RoutePropertiesResponse> routes;

        public Builder() {
    	      // Empty
        }

        public Builder(RoutingPropertiesResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.endpoints = defaults.endpoints;
    	      this.enrichments = defaults.enrichments;
    	      this.fallbackRoute = defaults.fallbackRoute;
    	      this.routes = defaults.routes;
        }

        public Builder setEndpoints(@Nullable RoutingEndpointsResponse endpoints) {
            this.endpoints = endpoints;
            return this;
        }

        public Builder setEnrichments(@Nullable List<EnrichmentPropertiesResponse> enrichments) {
            this.enrichments = enrichments;
            return this;
        }

        public Builder setFallbackRoute(@Nullable FallbackRoutePropertiesResponse fallbackRoute) {
            this.fallbackRoute = fallbackRoute;
            return this;
        }

        public Builder setRoutes(@Nullable List<RoutePropertiesResponse> routes) {
            this.routes = routes;
            return this;
        }
        public RoutingPropertiesResponse build() {
            return new RoutingPropertiesResponse(endpoints, enrichments, fallbackRoute, routes);
        }
    }
}
