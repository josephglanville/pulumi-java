// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.networkservices.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.InputImport;
import io.pulumi.gcp.networkservices.inputs.EdgeCacheServiceRoutingPathMatcherRouteRuleHeaderActionGetArgs;
import io.pulumi.gcp.networkservices.inputs.EdgeCacheServiceRoutingPathMatcherRouteRuleMatchRuleGetArgs;
import io.pulumi.gcp.networkservices.inputs.EdgeCacheServiceRoutingPathMatcherRouteRuleRouteActionGetArgs;
import io.pulumi.gcp.networkservices.inputs.EdgeCacheServiceRoutingPathMatcherRouteRuleUrlRedirectGetArgs;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


public final class EdgeCacheServiceRoutingPathMatcherRouteRuleGetArgs extends io.pulumi.resources.ResourceArgs {

    public static final EdgeCacheServiceRoutingPathMatcherRouteRuleGetArgs Empty = new EdgeCacheServiceRoutingPathMatcherRouteRuleGetArgs();

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
     * The header actions, including adding & removing headers, for requests that match this route.
     * Structure is documented below.
     * 
     */
    @InputImport(name="headerAction")
      private final @Nullable Output<EdgeCacheServiceRoutingPathMatcherRouteRuleHeaderActionGetArgs> headerAction;

    public Output<EdgeCacheServiceRoutingPathMatcherRouteRuleHeaderActionGetArgs> getHeaderAction() {
        return this.headerAction == null ? Output.empty() : this.headerAction;
    }

    /**
     * The list of criteria for matching attributes of a request to this routeRule. This list has OR semantics: the request matches this routeRule when any of the matchRules are satisfied. However predicates
     * within a given matchRule have AND semantics. All predicates within a matchRule must match for the request to match the rule.
     * Structure is documented below.
     * 
     */
    @InputImport(name="matchRules", required=true)
      private final Output<List<EdgeCacheServiceRoutingPathMatcherRouteRuleMatchRuleGetArgs>> matchRules;

    public Output<List<EdgeCacheServiceRoutingPathMatcherRouteRuleMatchRuleGetArgs>> getMatchRules() {
        return this.matchRules;
    }

    /**
     * The Origin resource that requests to this route should fetch from when a matching response is not in cache. Origins can be defined as short names ("my-origin") or fully-qualified resource URLs - e.g. "networkservices.googleapis.com/projects/my-project/global/edgecacheorigins/my-origin"
     * Only one of origin or urlRedirect can be set.
     * 
     */
    @InputImport(name="origin")
      private final @Nullable Output<String> origin;

    public Output<String> getOrigin() {
        return this.origin == null ? Output.empty() : this.origin;
    }

    /**
     * The priority of this route rule, where 1 is the highest priority.
     * You cannot configure two or more routeRules with the same priority. Priority for each rule must be set to a number between 1 and 999 inclusive.
     * Priority numbers can have gaps, which enable you to add or remove rules in the future without affecting the rest of the rules. For example, 1, 2, 3, 4, 5, 9, 12, 16 is a valid series of priority numbers
     * to which you could add rules numbered from 6 to 8, 10 to 11, and 13 to 15 in the future without any impact on existing rules.
     * 
     */
    @InputImport(name="priority", required=true)
      private final Output<String> priority;

    public Output<String> getPriority() {
        return this.priority;
    }

    /**
     * In response to a matching path, the routeAction performs advanced routing actions like URL rewrites, header transformations, etc. prior to forwarding the request to the selected origin.
     * Structure is documented below.
     * 
     */
    @InputImport(name="routeAction")
      private final @Nullable Output<EdgeCacheServiceRoutingPathMatcherRouteRuleRouteActionGetArgs> routeAction;

    public Output<EdgeCacheServiceRoutingPathMatcherRouteRuleRouteActionGetArgs> getRouteAction() {
        return this.routeAction == null ? Output.empty() : this.routeAction;
    }

    /**
     * The URL redirect configuration for requests that match this route.
     * Structure is documented below.
     * 
     */
    @InputImport(name="urlRedirect")
      private final @Nullable Output<EdgeCacheServiceRoutingPathMatcherRouteRuleUrlRedirectGetArgs> urlRedirect;

    public Output<EdgeCacheServiceRoutingPathMatcherRouteRuleUrlRedirectGetArgs> getUrlRedirect() {
        return this.urlRedirect == null ? Output.empty() : this.urlRedirect;
    }

    public EdgeCacheServiceRoutingPathMatcherRouteRuleGetArgs(
        @Nullable Output<String> description,
        @Nullable Output<EdgeCacheServiceRoutingPathMatcherRouteRuleHeaderActionGetArgs> headerAction,
        Output<List<EdgeCacheServiceRoutingPathMatcherRouteRuleMatchRuleGetArgs>> matchRules,
        @Nullable Output<String> origin,
        Output<String> priority,
        @Nullable Output<EdgeCacheServiceRoutingPathMatcherRouteRuleRouteActionGetArgs> routeAction,
        @Nullable Output<EdgeCacheServiceRoutingPathMatcherRouteRuleUrlRedirectGetArgs> urlRedirect) {
        this.description = description;
        this.headerAction = headerAction;
        this.matchRules = Objects.requireNonNull(matchRules, "expected parameter 'matchRules' to be non-null");
        this.origin = origin;
        this.priority = Objects.requireNonNull(priority, "expected parameter 'priority' to be non-null");
        this.routeAction = routeAction;
        this.urlRedirect = urlRedirect;
    }

    private EdgeCacheServiceRoutingPathMatcherRouteRuleGetArgs() {
        this.description = Output.empty();
        this.headerAction = Output.empty();
        this.matchRules = Output.empty();
        this.origin = Output.empty();
        this.priority = Output.empty();
        this.routeAction = Output.empty();
        this.urlRedirect = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(EdgeCacheServiceRoutingPathMatcherRouteRuleGetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<String> description;
        private @Nullable Output<EdgeCacheServiceRoutingPathMatcherRouteRuleHeaderActionGetArgs> headerAction;
        private Output<List<EdgeCacheServiceRoutingPathMatcherRouteRuleMatchRuleGetArgs>> matchRules;
        private @Nullable Output<String> origin;
        private Output<String> priority;
        private @Nullable Output<EdgeCacheServiceRoutingPathMatcherRouteRuleRouteActionGetArgs> routeAction;
        private @Nullable Output<EdgeCacheServiceRoutingPathMatcherRouteRuleUrlRedirectGetArgs> urlRedirect;

        public Builder() {
    	      // Empty
        }

        public Builder(EdgeCacheServiceRoutingPathMatcherRouteRuleGetArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.description = defaults.description;
    	      this.headerAction = defaults.headerAction;
    	      this.matchRules = defaults.matchRules;
    	      this.origin = defaults.origin;
    	      this.priority = defaults.priority;
    	      this.routeAction = defaults.routeAction;
    	      this.urlRedirect = defaults.urlRedirect;
        }

        public Builder description(@Nullable Output<String> description) {
            this.description = description;
            return this;
        }

        public Builder description(@Nullable String description) {
            this.description = Output.ofNullable(description);
            return this;
        }

        public Builder headerAction(@Nullable Output<EdgeCacheServiceRoutingPathMatcherRouteRuleHeaderActionGetArgs> headerAction) {
            this.headerAction = headerAction;
            return this;
        }

        public Builder headerAction(@Nullable EdgeCacheServiceRoutingPathMatcherRouteRuleHeaderActionGetArgs headerAction) {
            this.headerAction = Output.ofNullable(headerAction);
            return this;
        }

        public Builder matchRules(Output<List<EdgeCacheServiceRoutingPathMatcherRouteRuleMatchRuleGetArgs>> matchRules) {
            this.matchRules = Objects.requireNonNull(matchRules);
            return this;
        }

        public Builder matchRules(List<EdgeCacheServiceRoutingPathMatcherRouteRuleMatchRuleGetArgs> matchRules) {
            this.matchRules = Output.of(Objects.requireNonNull(matchRules));
            return this;
        }

        public Builder origin(@Nullable Output<String> origin) {
            this.origin = origin;
            return this;
        }

        public Builder origin(@Nullable String origin) {
            this.origin = Output.ofNullable(origin);
            return this;
        }

        public Builder priority(Output<String> priority) {
            this.priority = Objects.requireNonNull(priority);
            return this;
        }

        public Builder priority(String priority) {
            this.priority = Output.of(Objects.requireNonNull(priority));
            return this;
        }

        public Builder routeAction(@Nullable Output<EdgeCacheServiceRoutingPathMatcherRouteRuleRouteActionGetArgs> routeAction) {
            this.routeAction = routeAction;
            return this;
        }

        public Builder routeAction(@Nullable EdgeCacheServiceRoutingPathMatcherRouteRuleRouteActionGetArgs routeAction) {
            this.routeAction = Output.ofNullable(routeAction);
            return this;
        }

        public Builder urlRedirect(@Nullable Output<EdgeCacheServiceRoutingPathMatcherRouteRuleUrlRedirectGetArgs> urlRedirect) {
            this.urlRedirect = urlRedirect;
            return this;
        }

        public Builder urlRedirect(@Nullable EdgeCacheServiceRoutingPathMatcherRouteRuleUrlRedirectGetArgs urlRedirect) {
            this.urlRedirect = Output.ofNullable(urlRedirect);
            return this;
        }
        public EdgeCacheServiceRoutingPathMatcherRouteRuleGetArgs build() {
            return new EdgeCacheServiceRoutingPathMatcherRouteRuleGetArgs(description, headerAction, matchRules, origin, priority, routeAction, urlRedirect);
        }
    }
}
