// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.networkservices.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.InputImport;
import io.pulumi.gcp.networkservices.inputs.EdgeCacheServiceRoutingPathMatcherRouteRuleArgs;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


public final class EdgeCacheServiceRoutingPathMatcherArgs extends io.pulumi.resources.ResourceArgs {

    public static final EdgeCacheServiceRoutingPathMatcherArgs Empty = new EdgeCacheServiceRoutingPathMatcherArgs();

    /**
     * A human-readable description of the resource.
     * 
     */
    @InputImport(name="description")
      private final @Nullable Output<String> description;

    public Output<String> getDescription() {
        return this.description == null ? Output.empty() : this.description;
    }

    /**
     * The name of the query parameter to match. The query parameter must exist in the request, in the absence of which the request match fails.
     * 
     */
    @InputImport(name="name", required=true)
      private final Output<String> name;

    public Output<String> getName() {
        return this.name;
    }

    /**
     * The routeRules to match against. routeRules support advanced routing behaviour, and can match on paths, headers and query parameters, as well as status codes and HTTP methods.
     * Structure is documented below.
     * 
     */
    @InputImport(name="routeRules", required=true)
      private final Output<List<EdgeCacheServiceRoutingPathMatcherRouteRuleArgs>> routeRules;

    public Output<List<EdgeCacheServiceRoutingPathMatcherRouteRuleArgs>> getRouteRules() {
        return this.routeRules;
    }

    public EdgeCacheServiceRoutingPathMatcherArgs(
        @Nullable Output<String> description,
        Output<String> name,
        Output<List<EdgeCacheServiceRoutingPathMatcherRouteRuleArgs>> routeRules) {
        this.description = description;
        this.name = Objects.requireNonNull(name, "expected parameter 'name' to be non-null");
        this.routeRules = Objects.requireNonNull(routeRules, "expected parameter 'routeRules' to be non-null");
    }

    private EdgeCacheServiceRoutingPathMatcherArgs() {
        this.description = Output.empty();
        this.name = Output.empty();
        this.routeRules = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(EdgeCacheServiceRoutingPathMatcherArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<String> description;
        private Output<String> name;
        private Output<List<EdgeCacheServiceRoutingPathMatcherRouteRuleArgs>> routeRules;

        public Builder() {
    	      // Empty
        }

        public Builder(EdgeCacheServiceRoutingPathMatcherArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.description = defaults.description;
    	      this.name = defaults.name;
    	      this.routeRules = defaults.routeRules;
        }

        public Builder description(@Nullable Output<String> description) {
            this.description = description;
            return this;
        }

        public Builder description(@Nullable String description) {
            this.description = Output.ofNullable(description);
            return this;
        }

        public Builder name(Output<String> name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }

        public Builder name(String name) {
            this.name = Output.of(Objects.requireNonNull(name));
            return this;
        }

        public Builder routeRules(Output<List<EdgeCacheServiceRoutingPathMatcherRouteRuleArgs>> routeRules) {
            this.routeRules = Objects.requireNonNull(routeRules);
            return this;
        }

        public Builder routeRules(List<EdgeCacheServiceRoutingPathMatcherRouteRuleArgs> routeRules) {
            this.routeRules = Output.of(Objects.requireNonNull(routeRules));
            return this;
        }
        public EdgeCacheServiceRoutingPathMatcherArgs build() {
            return new EdgeCacheServiceRoutingPathMatcherArgs(description, name, routeRules);
        }
    }
}
