// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.compute.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import io.pulumi.gcp.compute.inputs.RegionUrlMapPathMatcherRouteRuleHeaderActionArgs;
import io.pulumi.gcp.compute.inputs.RegionUrlMapPathMatcherRouteRuleMatchRuleArgs;
import io.pulumi.gcp.compute.inputs.RegionUrlMapPathMatcherRouteRuleRouteActionArgs;
import io.pulumi.gcp.compute.inputs.RegionUrlMapPathMatcherRouteRuleUrlRedirectArgs;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


public final class RegionUrlMapPathMatcherRouteRuleArgs extends io.pulumi.resources.ResourceArgs {

    public static final RegionUrlMapPathMatcherRouteRuleArgs Empty = new RegionUrlMapPathMatcherRouteRuleArgs();

    /**
     * Specifies changes to request and response headers that need to take effect for
     * the selected backendService. headerAction specified here take effect before
     * headerAction in the enclosing HttpRouteRule, PathMatcher and UrlMap.
     * Structure is documented below.
     * 
     */
    @InputImport(name="headerAction")
      private final @Nullable Input<RegionUrlMapPathMatcherRouteRuleHeaderActionArgs> headerAction;

    public Input<RegionUrlMapPathMatcherRouteRuleHeaderActionArgs> getHeaderAction() {
        return this.headerAction == null ? Input.empty() : this.headerAction;
    }

    /**
     * The rules for determining a match.
     * Structure is documented below.
     * 
     */
    @InputImport(name="matchRules")
      private final @Nullable Input<List<RegionUrlMapPathMatcherRouteRuleMatchRuleArgs>> matchRules;

    public Input<List<RegionUrlMapPathMatcherRouteRuleMatchRuleArgs>> getMatchRules() {
        return this.matchRules == null ? Input.empty() : this.matchRules;
    }

    /**
     * For routeRules within a given pathMatcher, priority determines the order
     * in which load balancer will interpret routeRules. RouteRules are evaluated
     * in order of priority, from the lowest to highest number. The priority of
     * a rule decreases as its number increases (1, 2, 3, N+1). The first rule
     * that matches the request is applied.
     * You cannot configure two or more routeRules with the same priority.
     * Priority for each rule must be set to a number between 0 and
     * 2147483647 inclusive.
     * Priority numbers can have gaps, which enable you to add or remove rules
     * in the future without affecting the rest of the rules. For example,
     * 1, 2, 3, 4, 5, 9, 12, 16 is a valid series of priority numbers to which
     * you could add rules numbered from 6 to 8, 10 to 11, and 13 to 15 in the
     * future without any impact on existing rules.
     * 
     */
    @InputImport(name="priority", required=true)
      private final Input<Integer> priority;

    public Input<Integer> getPriority() {
        return this.priority;
    }

    /**
     * In response to a matching path, the load balancer performs advanced routing
     * actions like URL rewrites, header transformations, etc. prior to forwarding the
     * request to the selected backend. If routeAction specifies any
     * weightedBackendServices, service must not be set. Conversely if service is set,
     * routeAction cannot contain any  weightedBackendServices. Only one of routeAction
     * or urlRedirect must be set.
     * Structure is documented below.
     * 
     */
    @InputImport(name="routeAction")
      private final @Nullable Input<RegionUrlMapPathMatcherRouteRuleRouteActionArgs> routeAction;

    public Input<RegionUrlMapPathMatcherRouteRuleRouteActionArgs> getRouteAction() {
        return this.routeAction == null ? Input.empty() : this.routeAction;
    }

    /**
     * A reference to expected RegionBackendService resource the given URL should be mapped to.
     * 
     */
    @InputImport(name="service")
      private final @Nullable Input<String> service;

    public Input<String> getService() {
        return this.service == null ? Input.empty() : this.service;
    }

    /**
     * When a path pattern is matched, the request is redirected to a URL specified
     * by urlRedirect. If urlRedirect is specified, service or routeAction must not
     * be set.
     * Structure is documented below.
     * 
     */
    @InputImport(name="urlRedirect")
      private final @Nullable Input<RegionUrlMapPathMatcherRouteRuleUrlRedirectArgs> urlRedirect;

    public Input<RegionUrlMapPathMatcherRouteRuleUrlRedirectArgs> getUrlRedirect() {
        return this.urlRedirect == null ? Input.empty() : this.urlRedirect;
    }

    public RegionUrlMapPathMatcherRouteRuleArgs(
        @Nullable Input<RegionUrlMapPathMatcherRouteRuleHeaderActionArgs> headerAction,
        @Nullable Input<List<RegionUrlMapPathMatcherRouteRuleMatchRuleArgs>> matchRules,
        Input<Integer> priority,
        @Nullable Input<RegionUrlMapPathMatcherRouteRuleRouteActionArgs> routeAction,
        @Nullable Input<String> service,
        @Nullable Input<RegionUrlMapPathMatcherRouteRuleUrlRedirectArgs> urlRedirect) {
        this.headerAction = headerAction;
        this.matchRules = matchRules;
        this.priority = Objects.requireNonNull(priority, "expected parameter 'priority' to be non-null");
        this.routeAction = routeAction;
        this.service = service;
        this.urlRedirect = urlRedirect;
    }

    private RegionUrlMapPathMatcherRouteRuleArgs() {
        this.headerAction = Input.empty();
        this.matchRules = Input.empty();
        this.priority = Input.empty();
        this.routeAction = Input.empty();
        this.service = Input.empty();
        this.urlRedirect = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(RegionUrlMapPathMatcherRouteRuleArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<RegionUrlMapPathMatcherRouteRuleHeaderActionArgs> headerAction;
        private @Nullable Input<List<RegionUrlMapPathMatcherRouteRuleMatchRuleArgs>> matchRules;
        private Input<Integer> priority;
        private @Nullable Input<RegionUrlMapPathMatcherRouteRuleRouteActionArgs> routeAction;
        private @Nullable Input<String> service;
        private @Nullable Input<RegionUrlMapPathMatcherRouteRuleUrlRedirectArgs> urlRedirect;

        public Builder() {
    	      // Empty
        }

        public Builder(RegionUrlMapPathMatcherRouteRuleArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.headerAction = defaults.headerAction;
    	      this.matchRules = defaults.matchRules;
    	      this.priority = defaults.priority;
    	      this.routeAction = defaults.routeAction;
    	      this.service = defaults.service;
    	      this.urlRedirect = defaults.urlRedirect;
        }

        public Builder setHeaderAction(@Nullable Input<RegionUrlMapPathMatcherRouteRuleHeaderActionArgs> headerAction) {
            this.headerAction = headerAction;
            return this;
        }

        public Builder setHeaderAction(@Nullable RegionUrlMapPathMatcherRouteRuleHeaderActionArgs headerAction) {
            this.headerAction = Input.ofNullable(headerAction);
            return this;
        }

        public Builder setMatchRules(@Nullable Input<List<RegionUrlMapPathMatcherRouteRuleMatchRuleArgs>> matchRules) {
            this.matchRules = matchRules;
            return this;
        }

        public Builder setMatchRules(@Nullable List<RegionUrlMapPathMatcherRouteRuleMatchRuleArgs> matchRules) {
            this.matchRules = Input.ofNullable(matchRules);
            return this;
        }

        public Builder setPriority(Input<Integer> priority) {
            this.priority = Objects.requireNonNull(priority);
            return this;
        }

        public Builder setPriority(Integer priority) {
            this.priority = Input.of(Objects.requireNonNull(priority));
            return this;
        }

        public Builder setRouteAction(@Nullable Input<RegionUrlMapPathMatcherRouteRuleRouteActionArgs> routeAction) {
            this.routeAction = routeAction;
            return this;
        }

        public Builder setRouteAction(@Nullable RegionUrlMapPathMatcherRouteRuleRouteActionArgs routeAction) {
            this.routeAction = Input.ofNullable(routeAction);
            return this;
        }

        public Builder setService(@Nullable Input<String> service) {
            this.service = service;
            return this;
        }

        public Builder setService(@Nullable String service) {
            this.service = Input.ofNullable(service);
            return this;
        }

        public Builder setUrlRedirect(@Nullable Input<RegionUrlMapPathMatcherRouteRuleUrlRedirectArgs> urlRedirect) {
            this.urlRedirect = urlRedirect;
            return this;
        }

        public Builder setUrlRedirect(@Nullable RegionUrlMapPathMatcherRouteRuleUrlRedirectArgs urlRedirect) {
            this.urlRedirect = Input.ofNullable(urlRedirect);
            return this;
        }
        public RegionUrlMapPathMatcherRouteRuleArgs build() {
            return new RegionUrlMapPathMatcherRouteRuleArgs(headerAction, matchRules, priority, routeAction, service, urlRedirect);
        }
    }
}
