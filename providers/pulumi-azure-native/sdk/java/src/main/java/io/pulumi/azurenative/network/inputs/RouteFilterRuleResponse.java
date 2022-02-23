// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.network.inputs;

import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Route Filter Rule Resource.
 * 
 */
public final class RouteFilterRuleResponse extends io.pulumi.resources.InvokeArgs {

    public static final RouteFilterRuleResponse Empty = new RouteFilterRuleResponse();

    /**
     * The access type of the rule.
     * 
     */
    @InputImport(name="access", required=true)
      private final String access;

    public String getAccess() {
        return this.access;
    }

    /**
     * The collection for bgp community values to filter on. e.g. ['12076:5010','12076:5020'].
     * 
     */
    @InputImport(name="communities", required=true)
      private final List<String> communities;

    public List<String> getCommunities() {
        return this.communities;
    }

    /**
     * A unique read-only string that changes whenever the resource is updated.
     * 
     */
    @InputImport(name="etag", required=true)
      private final String etag;

    public String getEtag() {
        return this.etag;
    }

    /**
     * Resource ID.
     * 
     */
    @InputImport(name="id")
      private final @Nullable String id;

    public Optional<String> getId() {
        return this.id == null ? Optional.empty() : Optional.ofNullable(this.id);
    }

    /**
     * Resource location.
     * 
     */
    @InputImport(name="location")
      private final @Nullable String location;

    public Optional<String> getLocation() {
        return this.location == null ? Optional.empty() : Optional.ofNullable(this.location);
    }

    /**
     * The name of the resource that is unique within a resource group. This name can be used to access the resource.
     * 
     */
    @InputImport(name="name")
      private final @Nullable String name;

    public Optional<String> getName() {
        return this.name == null ? Optional.empty() : Optional.ofNullable(this.name);
    }

    /**
     * The provisioning state of the route filter rule resource.
     * 
     */
    @InputImport(name="provisioningState", required=true)
      private final String provisioningState;

    public String getProvisioningState() {
        return this.provisioningState;
    }

    /**
     * The rule type of the rule.
     * 
     */
    @InputImport(name="routeFilterRuleType", required=true)
      private final String routeFilterRuleType;

    public String getRouteFilterRuleType() {
        return this.routeFilterRuleType;
    }

    public RouteFilterRuleResponse(
        String access,
        List<String> communities,
        String etag,
        @Nullable String id,
        @Nullable String location,
        @Nullable String name,
        String provisioningState,
        String routeFilterRuleType) {
        this.access = Objects.requireNonNull(access, "expected parameter 'access' to be non-null");
        this.communities = Objects.requireNonNull(communities, "expected parameter 'communities' to be non-null");
        this.etag = Objects.requireNonNull(etag, "expected parameter 'etag' to be non-null");
        this.id = id;
        this.location = location;
        this.name = name;
        this.provisioningState = Objects.requireNonNull(provisioningState, "expected parameter 'provisioningState' to be non-null");
        this.routeFilterRuleType = Objects.requireNonNull(routeFilterRuleType, "expected parameter 'routeFilterRuleType' to be non-null");
    }

    private RouteFilterRuleResponse() {
        this.access = null;
        this.communities = List.of();
        this.etag = null;
        this.id = null;
        this.location = null;
        this.name = null;
        this.provisioningState = null;
        this.routeFilterRuleType = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(RouteFilterRuleResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String access;
        private List<String> communities;
        private String etag;
        private @Nullable String id;
        private @Nullable String location;
        private @Nullable String name;
        private String provisioningState;
        private String routeFilterRuleType;

        public Builder() {
    	      // Empty
        }

        public Builder(RouteFilterRuleResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.access = defaults.access;
    	      this.communities = defaults.communities;
    	      this.etag = defaults.etag;
    	      this.id = defaults.id;
    	      this.location = defaults.location;
    	      this.name = defaults.name;
    	      this.provisioningState = defaults.provisioningState;
    	      this.routeFilterRuleType = defaults.routeFilterRuleType;
        }

        public Builder setAccess(String access) {
            this.access = Objects.requireNonNull(access);
            return this;
        }

        public Builder setCommunities(List<String> communities) {
            this.communities = Objects.requireNonNull(communities);
            return this;
        }

        public Builder setEtag(String etag) {
            this.etag = Objects.requireNonNull(etag);
            return this;
        }

        public Builder setId(@Nullable String id) {
            this.id = id;
            return this;
        }

        public Builder setLocation(@Nullable String location) {
            this.location = location;
            return this;
        }

        public Builder setName(@Nullable String name) {
            this.name = name;
            return this;
        }

        public Builder setProvisioningState(String provisioningState) {
            this.provisioningState = Objects.requireNonNull(provisioningState);
            return this;
        }

        public Builder setRouteFilterRuleType(String routeFilterRuleType) {
            this.routeFilterRuleType = Objects.requireNonNull(routeFilterRuleType);
            return this;
        }
        public RouteFilterRuleResponse build() {
            return new RouteFilterRuleResponse(access, communities, etag, id, location, name, provisioningState, routeFilterRuleType);
        }
    }
}
