// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.compute_alpha;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.googlenative.compute_alpha.inputs.HostRuleArgs;
import io.pulumi.googlenative.compute_alpha.inputs.HttpHeaderActionArgs;
import io.pulumi.googlenative.compute_alpha.inputs.HttpRedirectActionArgs;
import io.pulumi.googlenative.compute_alpha.inputs.HttpRouteActionArgs;
import io.pulumi.googlenative.compute_alpha.inputs.PathMatcherArgs;
import io.pulumi.googlenative.compute_alpha.inputs.UrlMapTestArgs;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


public final class RegionUrlMapArgs extends io.pulumi.resources.ResourceArgs {

    public static final RegionUrlMapArgs Empty = new RegionUrlMapArgs();

    /**
     * defaultRouteAction takes effect when none of the hostRules match. The load balancer performs advanced routing actions, such as URL rewrites and header transformations, before forwarding the request to the selected backend. If defaultRouteAction specifies any weightedBackendServices, defaultService must not be set. Conversely if defaultService is set, defaultRouteAction cannot contain any weightedBackendServices. Only one of defaultRouteAction or defaultUrlRedirect must be set. UrlMaps for external HTTP(S) load balancers support only the urlRewrite action within defaultRouteAction. defaultRouteAction has no effect when the URL map is bound to a target gRPC proxy that has the validateForProxyless field set to true.
     * 
     */
    @Import(name="defaultRouteAction")
      private final @Nullable Output<HttpRouteActionArgs> defaultRouteAction;

    public Output<HttpRouteActionArgs> getDefaultRouteAction() {
        return this.defaultRouteAction == null ? Output.empty() : this.defaultRouteAction;
    }

    /**
     * The full or partial URL of the defaultService resource to which traffic is directed if none of the hostRules match. If defaultRouteAction is also specified, advanced routing actions, such as URL rewrites, take effect before sending the request to the backend. However, if defaultService is specified, defaultRouteAction cannot contain any weightedBackendServices. Conversely, if routeAction specifies any weightedBackendServices, service must not be specified. Only one of defaultService, defaultUrlRedirect , or defaultRouteAction.weightedBackendService must be set. defaultService has no effect when the URL map is bound to a target gRPC proxy that has the validateForProxyless field set to true.
     * 
     */
    @Import(name="defaultService")
      private final @Nullable Output<String> defaultService;

    public Output<String> getDefaultService() {
        return this.defaultService == null ? Output.empty() : this.defaultService;
    }

    /**
     * When none of the specified hostRules match, the request is redirected to a URL specified by defaultUrlRedirect. If defaultUrlRedirect is specified, defaultService or defaultRouteAction must not be set. Not supported when the URL map is bound to a target gRPC proxy.
     * 
     */
    @Import(name="defaultUrlRedirect")
      private final @Nullable Output<HttpRedirectActionArgs> defaultUrlRedirect;

    public Output<HttpRedirectActionArgs> getDefaultUrlRedirect() {
        return this.defaultUrlRedirect == null ? Output.empty() : this.defaultUrlRedirect;
    }

    /**
     * An optional description of this resource. Provide this property when you create the resource.
     * 
     */
    @Import(name="description")
      private final @Nullable Output<String> description;

    public Output<String> getDescription() {
        return this.description == null ? Output.empty() : this.description;
    }

    /**
     * Specifies changes to request and response headers that need to take effect for the selected backendService. The headerAction specified here take effect after headerAction specified under pathMatcher. headerAction is not supported for load balancers that have their loadBalancingScheme set to EXTERNAL. Not supported when the URL map is bound to a target gRPC proxy that has validateForProxyless field set to true.
     * 
     */
    @Import(name="headerAction")
      private final @Nullable Output<HttpHeaderActionArgs> headerAction;

    public Output<HttpHeaderActionArgs> getHeaderAction() {
        return this.headerAction == null ? Output.empty() : this.headerAction;
    }

    /**
     * The list of host rules to use against the URL.
     * 
     */
    @Import(name="hostRules")
      private final @Nullable Output<List<HostRuleArgs>> hostRules;

    public Output<List<HostRuleArgs>> getHostRules() {
        return this.hostRules == null ? Output.empty() : this.hostRules;
    }

    /**
     * Name of the resource. Provided by the client when the resource is created. The name must be 1-63 characters long, and comply with RFC1035. Specifically, the name must be 1-63 characters long and match the regular expression `[a-z]([-a-z0-9]*[a-z0-9])?` which means the first character must be a lowercase letter, and all following characters must be a dash, lowercase letter, or digit, except the last character, which cannot be a dash.
     * 
     */
    @Import(name="name")
      private final @Nullable Output<String> name;

    public Output<String> getName() {
        return this.name == null ? Output.empty() : this.name;
    }

    /**
     * The list of named PathMatchers to use against the URL.
     * 
     */
    @Import(name="pathMatchers")
      private final @Nullable Output<List<PathMatcherArgs>> pathMatchers;

    public Output<List<PathMatcherArgs>> getPathMatchers() {
        return this.pathMatchers == null ? Output.empty() : this.pathMatchers;
    }

    @Import(name="project")
      private final @Nullable Output<String> project;

    public Output<String> getProject() {
        return this.project == null ? Output.empty() : this.project;
    }

    @Import(name="region", required=true)
      private final Output<String> region;

    public Output<String> getRegion() {
        return this.region;
    }

    @Import(name="requestId")
      private final @Nullable Output<String> requestId;

    public Output<String> getRequestId() {
        return this.requestId == null ? Output.empty() : this.requestId;
    }

    /**
     * The list of expected URL mapping tests. Request to update the UrlMap succeeds only if all test cases pass. You can specify a maximum of 100 tests per UrlMap. Not supported when the URL map is bound to a target gRPC proxy that has validateForProxyless field set to true.
     * 
     */
    @Import(name="tests")
      private final @Nullable Output<List<UrlMapTestArgs>> tests;

    public Output<List<UrlMapTestArgs>> getTests() {
        return this.tests == null ? Output.empty() : this.tests;
    }

    public RegionUrlMapArgs(
        @Nullable Output<HttpRouteActionArgs> defaultRouteAction,
        @Nullable Output<String> defaultService,
        @Nullable Output<HttpRedirectActionArgs> defaultUrlRedirect,
        @Nullable Output<String> description,
        @Nullable Output<HttpHeaderActionArgs> headerAction,
        @Nullable Output<List<HostRuleArgs>> hostRules,
        @Nullable Output<String> name,
        @Nullable Output<List<PathMatcherArgs>> pathMatchers,
        @Nullable Output<String> project,
        Output<String> region,
        @Nullable Output<String> requestId,
        @Nullable Output<List<UrlMapTestArgs>> tests) {
        this.defaultRouteAction = defaultRouteAction;
        this.defaultService = defaultService;
        this.defaultUrlRedirect = defaultUrlRedirect;
        this.description = description;
        this.headerAction = headerAction;
        this.hostRules = hostRules;
        this.name = name;
        this.pathMatchers = pathMatchers;
        this.project = project;
        this.region = Objects.requireNonNull(region, "expected parameter 'region' to be non-null");
        this.requestId = requestId;
        this.tests = tests;
    }

    private RegionUrlMapArgs() {
        this.defaultRouteAction = Output.empty();
        this.defaultService = Output.empty();
        this.defaultUrlRedirect = Output.empty();
        this.description = Output.empty();
        this.headerAction = Output.empty();
        this.hostRules = Output.empty();
        this.name = Output.empty();
        this.pathMatchers = Output.empty();
        this.project = Output.empty();
        this.region = Output.empty();
        this.requestId = Output.empty();
        this.tests = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(RegionUrlMapArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<HttpRouteActionArgs> defaultRouteAction;
        private @Nullable Output<String> defaultService;
        private @Nullable Output<HttpRedirectActionArgs> defaultUrlRedirect;
        private @Nullable Output<String> description;
        private @Nullable Output<HttpHeaderActionArgs> headerAction;
        private @Nullable Output<List<HostRuleArgs>> hostRules;
        private @Nullable Output<String> name;
        private @Nullable Output<List<PathMatcherArgs>> pathMatchers;
        private @Nullable Output<String> project;
        private Output<String> region;
        private @Nullable Output<String> requestId;
        private @Nullable Output<List<UrlMapTestArgs>> tests;

        public Builder() {
    	      // Empty
        }

        public Builder(RegionUrlMapArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.defaultRouteAction = defaults.defaultRouteAction;
    	      this.defaultService = defaults.defaultService;
    	      this.defaultUrlRedirect = defaults.defaultUrlRedirect;
    	      this.description = defaults.description;
    	      this.headerAction = defaults.headerAction;
    	      this.hostRules = defaults.hostRules;
    	      this.name = defaults.name;
    	      this.pathMatchers = defaults.pathMatchers;
    	      this.project = defaults.project;
    	      this.region = defaults.region;
    	      this.requestId = defaults.requestId;
    	      this.tests = defaults.tests;
        }

        public Builder defaultRouteAction(@Nullable Output<HttpRouteActionArgs> defaultRouteAction) {
            this.defaultRouteAction = defaultRouteAction;
            return this;
        }
        public Builder defaultRouteAction(@Nullable HttpRouteActionArgs defaultRouteAction) {
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
        public Builder defaultUrlRedirect(@Nullable Output<HttpRedirectActionArgs> defaultUrlRedirect) {
            this.defaultUrlRedirect = defaultUrlRedirect;
            return this;
        }
        public Builder defaultUrlRedirect(@Nullable HttpRedirectActionArgs defaultUrlRedirect) {
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
        public Builder headerAction(@Nullable Output<HttpHeaderActionArgs> headerAction) {
            this.headerAction = headerAction;
            return this;
        }
        public Builder headerAction(@Nullable HttpHeaderActionArgs headerAction) {
            this.headerAction = Output.ofNullable(headerAction);
            return this;
        }
        public Builder hostRules(@Nullable Output<List<HostRuleArgs>> hostRules) {
            this.hostRules = hostRules;
            return this;
        }
        public Builder hostRules(@Nullable List<HostRuleArgs> hostRules) {
            this.hostRules = Output.ofNullable(hostRules);
            return this;
        }
        public Builder hostRules(HostRuleArgs... hostRules) {
            return hostRules(List.of(hostRules));
        }
        public Builder name(@Nullable Output<String> name) {
            this.name = name;
            return this;
        }
        public Builder name(@Nullable String name) {
            this.name = Output.ofNullable(name);
            return this;
        }
        public Builder pathMatchers(@Nullable Output<List<PathMatcherArgs>> pathMatchers) {
            this.pathMatchers = pathMatchers;
            return this;
        }
        public Builder pathMatchers(@Nullable List<PathMatcherArgs> pathMatchers) {
            this.pathMatchers = Output.ofNullable(pathMatchers);
            return this;
        }
        public Builder pathMatchers(PathMatcherArgs... pathMatchers) {
            return pathMatchers(List.of(pathMatchers));
        }
        public Builder project(@Nullable Output<String> project) {
            this.project = project;
            return this;
        }
        public Builder project(@Nullable String project) {
            this.project = Output.ofNullable(project);
            return this;
        }
        public Builder region(Output<String> region) {
            this.region = Objects.requireNonNull(region);
            return this;
        }
        public Builder region(String region) {
            this.region = Output.of(Objects.requireNonNull(region));
            return this;
        }
        public Builder requestId(@Nullable Output<String> requestId) {
            this.requestId = requestId;
            return this;
        }
        public Builder requestId(@Nullable String requestId) {
            this.requestId = Output.ofNullable(requestId);
            return this;
        }
        public Builder tests(@Nullable Output<List<UrlMapTestArgs>> tests) {
            this.tests = tests;
            return this;
        }
        public Builder tests(@Nullable List<UrlMapTestArgs> tests) {
            this.tests = Output.ofNullable(tests);
            return this;
        }
        public Builder tests(UrlMapTestArgs... tests) {
            return tests(List.of(tests));
        }        public RegionUrlMapArgs build() {
            return new RegionUrlMapArgs(defaultRouteAction, defaultService, defaultUrlRedirect, description, headerAction, hostRules, name, pathMatchers, project, region, requestId, tests);
        }
    }
}
