// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.compute.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.InputImport;
import io.pulumi.gcp.compute.inputs.URLMapPathMatcherDefaultRouteActionArgs;
import io.pulumi.gcp.compute.inputs.URLMapPathMatcherDefaultUrlRedirectArgs;
import io.pulumi.gcp.compute.inputs.URLMapPathMatcherHeaderActionArgs;
import io.pulumi.gcp.compute.inputs.URLMapPathMatcherPathRuleArgs;
import io.pulumi.gcp.compute.inputs.URLMapPathMatcherRouteRuleArgs;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


public final class URLMapPathMatcherArgs extends io.pulumi.resources.ResourceArgs {

    public static final URLMapPathMatcherArgs Empty = new URLMapPathMatcherArgs();

    /**
     * defaultRouteAction takes effect when none of the pathRules or routeRules match. The load balancer performs
     * advanced routing actions like URL rewrites, header transformations, etc. prior to forwarding the request
     * to the selected backend. If defaultRouteAction specifies any weightedBackendServices, defaultService must not be set.
     * Conversely if defaultService is set, defaultRouteAction cannot contain any weightedBackendServices.
     * Only one of defaultRouteAction or defaultUrlRedirect must be set.
     * Structure is documented below.
     * 
     */
    @InputImport(name="defaultRouteAction")
      private final @Nullable Output<URLMapPathMatcherDefaultRouteActionArgs> defaultRouteAction;

    public Output<URLMapPathMatcherDefaultRouteActionArgs> getDefaultRouteAction() {
        return this.defaultRouteAction == null ? Output.empty() : this.defaultRouteAction;
    }

    /**
     * The backend service or backend bucket to use when none of the given paths match.
     * 
     */
    @InputImport(name="defaultService")
      private final @Nullable Output<String> defaultService;

    public Output<String> getDefaultService() {
        return this.defaultService == null ? Output.empty() : this.defaultService;
    }

    /**
     * When none of the specified hostRules match, the request is redirected to a URL specified
     * by defaultUrlRedirect. If defaultUrlRedirect is specified, defaultService or
     * defaultRouteAction must not be set.
     * Structure is documented below.
     * 
     */
    @InputImport(name="defaultUrlRedirect")
      private final @Nullable Output<URLMapPathMatcherDefaultUrlRedirectArgs> defaultUrlRedirect;

    public Output<URLMapPathMatcherDefaultUrlRedirectArgs> getDefaultUrlRedirect() {
        return this.defaultUrlRedirect == null ? Output.empty() : this.defaultUrlRedirect;
    }

    /**
     * Description of this test case.
     * 
     */
    @InputImport(name="description")
      private final @Nullable Output<String> description;

    public Output<String> getDescription() {
        return this.description == null ? Output.empty() : this.description;
    }

    /**
     * Specifies changes to request and response headers that need to take effect for
     * the selected backendService.
     * headerAction specified here take effect before headerAction in the enclosing
     * HttpRouteRule, PathMatcher and UrlMap.
     * Structure is documented below.
     * 
     */
    @InputImport(name="headerAction")
      private final @Nullable Output<URLMapPathMatcherHeaderActionArgs> headerAction;

    public Output<URLMapPathMatcherHeaderActionArgs> getHeaderAction() {
        return this.headerAction == null ? Output.empty() : this.headerAction;
    }

    /**
     * The name of the query parameter to match. The query parameter must exist in the
     * request, in the absence of which the request match fails.
     * 
     */
    @InputImport(name="name", required=true)
      private final Output<String> name;

    public Output<String> getName() {
        return this.name;
    }

    /**
     * The list of path rules. Use this list instead of routeRules when routing based
     * on simple path matching is all that's required. The order by which path rules
     * are specified does not matter. Matches are always done on the longest-path-first
     * basis. For example: a pathRule with a path /a/b/c/* will match before /a/b/*
     * irrespective of the order in which those paths appear in this list. Within a
     * given pathMatcher, only one of pathRules or routeRules must be set.
     * Structure is documented below.
     * 
     */
    @InputImport(name="pathRules")
      private final @Nullable Output<List<URLMapPathMatcherPathRuleArgs>> pathRules;

    public Output<List<URLMapPathMatcherPathRuleArgs>> getPathRules() {
        return this.pathRules == null ? Output.empty() : this.pathRules;
    }

    /**
     * The list of ordered HTTP route rules. Use this list instead of pathRules when
     * advanced route matching and routing actions are desired. The order of specifying
     * routeRules matters: the first rule that matches will cause its specified routing
     * action to take effect. Within a given pathMatcher, only one of pathRules or
     * routeRules must be set. routeRules are not supported in UrlMaps intended for
     * External load balancers.
     * Structure is documented below.
     * 
     */
    @InputImport(name="routeRules")
      private final @Nullable Output<List<URLMapPathMatcherRouteRuleArgs>> routeRules;

    public Output<List<URLMapPathMatcherRouteRuleArgs>> getRouteRules() {
        return this.routeRules == null ? Output.empty() : this.routeRules;
    }

    public URLMapPathMatcherArgs(
        @Nullable Output<URLMapPathMatcherDefaultRouteActionArgs> defaultRouteAction,
        @Nullable Output<String> defaultService,
        @Nullable Output<URLMapPathMatcherDefaultUrlRedirectArgs> defaultUrlRedirect,
        @Nullable Output<String> description,
        @Nullable Output<URLMapPathMatcherHeaderActionArgs> headerAction,
        Output<String> name,
        @Nullable Output<List<URLMapPathMatcherPathRuleArgs>> pathRules,
        @Nullable Output<List<URLMapPathMatcherRouteRuleArgs>> routeRules) {
        this.defaultRouteAction = defaultRouteAction;
        this.defaultService = defaultService;
        this.defaultUrlRedirect = defaultUrlRedirect;
        this.description = description;
        this.headerAction = headerAction;
        this.name = Objects.requireNonNull(name, "expected parameter 'name' to be non-null");
        this.pathRules = pathRules;
        this.routeRules = routeRules;
    }

    private URLMapPathMatcherArgs() {
        this.defaultRouteAction = Output.empty();
        this.defaultService = Output.empty();
        this.defaultUrlRedirect = Output.empty();
        this.description = Output.empty();
        this.headerAction = Output.empty();
        this.name = Output.empty();
        this.pathRules = Output.empty();
        this.routeRules = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(URLMapPathMatcherArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<URLMapPathMatcherDefaultRouteActionArgs> defaultRouteAction;
        private @Nullable Output<String> defaultService;
        private @Nullable Output<URLMapPathMatcherDefaultUrlRedirectArgs> defaultUrlRedirect;
        private @Nullable Output<String> description;
        private @Nullable Output<URLMapPathMatcherHeaderActionArgs> headerAction;
        private Output<String> name;
        private @Nullable Output<List<URLMapPathMatcherPathRuleArgs>> pathRules;
        private @Nullable Output<List<URLMapPathMatcherRouteRuleArgs>> routeRules;

        public Builder() {
    	      // Empty
        }

        public Builder(URLMapPathMatcherArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.defaultRouteAction = defaults.defaultRouteAction;
    	      this.defaultService = defaults.defaultService;
    	      this.defaultUrlRedirect = defaults.defaultUrlRedirect;
    	      this.description = defaults.description;
    	      this.headerAction = defaults.headerAction;
    	      this.name = defaults.name;
    	      this.pathRules = defaults.pathRules;
    	      this.routeRules = defaults.routeRules;
        }

        public Builder defaultRouteAction(@Nullable Output<URLMapPathMatcherDefaultRouteActionArgs> defaultRouteAction) {
            this.defaultRouteAction = defaultRouteAction;
            return this;
        }

        public Builder defaultRouteAction(@Nullable URLMapPathMatcherDefaultRouteActionArgs defaultRouteAction) {
            this.defaultRouteAction = Output.ofNullable(defaultRouteAction);
            return this;
        }

        public Builder defaultService(@Nullable Output<String> defaultService) {
            this.defaultService = defaultService;
            return this;
        }

        public Builder defaultService(@Nullable String defaultService) {
            this.defaultService = Output.ofNullable(defaultService);
            return this;
        }

        public Builder defaultUrlRedirect(@Nullable Output<URLMapPathMatcherDefaultUrlRedirectArgs> defaultUrlRedirect) {
            this.defaultUrlRedirect = defaultUrlRedirect;
            return this;
        }

        public Builder defaultUrlRedirect(@Nullable URLMapPathMatcherDefaultUrlRedirectArgs defaultUrlRedirect) {
            this.defaultUrlRedirect = Output.ofNullable(defaultUrlRedirect);
            return this;
        }

        public Builder description(@Nullable Output<String> description) {
            this.description = description;
            return this;
        }

        public Builder description(@Nullable String description) {
            this.description = Output.ofNullable(description);
            return this;
        }

        public Builder headerAction(@Nullable Output<URLMapPathMatcherHeaderActionArgs> headerAction) {
            this.headerAction = headerAction;
            return this;
        }

        public Builder headerAction(@Nullable URLMapPathMatcherHeaderActionArgs headerAction) {
            this.headerAction = Output.ofNullable(headerAction);
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

        public Builder pathRules(@Nullable Output<List<URLMapPathMatcherPathRuleArgs>> pathRules) {
            this.pathRules = pathRules;
            return this;
        }

        public Builder pathRules(@Nullable List<URLMapPathMatcherPathRuleArgs> pathRules) {
            this.pathRules = Output.ofNullable(pathRules);
            return this;
        }

        public Builder routeRules(@Nullable Output<List<URLMapPathMatcherRouteRuleArgs>> routeRules) {
            this.routeRules = routeRules;
            return this;
        }

        public Builder routeRules(@Nullable List<URLMapPathMatcherRouteRuleArgs> routeRules) {
            this.routeRules = Output.ofNullable(routeRules);
            return this;
        }
        public URLMapPathMatcherArgs build() {
            return new URLMapPathMatcherArgs(defaultRouteAction, defaultService, defaultUrlRedirect, description, headerAction, name, pathRules, routeRules);
        }
    }
}
