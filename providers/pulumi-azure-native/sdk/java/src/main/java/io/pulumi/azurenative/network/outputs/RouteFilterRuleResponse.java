// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.network.outputs;

import io.pulumi.core.internal.annotations.OutputCustomType;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class RouteFilterRuleResponse {
    private final String access;
    private final List<String> communities;
    private final String etag;
    private final @Nullable String id;
    private final @Nullable String location;
    private final @Nullable String name;
    private final String provisioningState;
    private final String routeFilterRuleType;

    @OutputCustomType.Constructor({"access","communities","etag","id","location","name","provisioningState","routeFilterRuleType"})
    private RouteFilterRuleResponse(
        String access,
        List<String> communities,
        String etag,
        @Nullable String id,
        @Nullable String location,
        @Nullable String name,
        String provisioningState,
        String routeFilterRuleType) {
        this.access = Objects.requireNonNull(access);
        this.communities = Objects.requireNonNull(communities);
        this.etag = Objects.requireNonNull(etag);
        this.id = id;
        this.location = location;
        this.name = name;
        this.provisioningState = Objects.requireNonNull(provisioningState);
        this.routeFilterRuleType = Objects.requireNonNull(routeFilterRuleType);
    }

    public String getAccess() {
        return this.access;
    }
    public List<String> getCommunities() {
        return this.communities;
    }
    public String getEtag() {
        return this.etag;
    }
    public Optional<String> getId() {
        return Optional.ofNullable(this.id);
    }
    public Optional<String> getLocation() {
        return Optional.ofNullable(this.location);
    }
    public Optional<String> getName() {
        return Optional.ofNullable(this.name);
    }
    public String getProvisioningState() {
        return this.provisioningState;
    }
    public String getRouteFilterRuleType() {
        return this.routeFilterRuleType;
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
