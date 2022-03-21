// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.compute.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.gcp.compute.inputs.URLMapDefaultRouteActionGetArgs;
import io.pulumi.gcp.compute.inputs.URLMapDefaultUrlRedirectGetArgs;
import io.pulumi.gcp.compute.inputs.URLMapHeaderActionGetArgs;
import io.pulumi.gcp.compute.inputs.URLMapHostRuleGetArgs;
import io.pulumi.gcp.compute.inputs.URLMapPathMatcherGetArgs;
import io.pulumi.gcp.compute.inputs.URLMapTestGetArgs;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


public final class URLMapState extends io.pulumi.resources.ResourceArgs {

    public static final URLMapState Empty = new URLMapState();

    /**
     * Creation timestamp in RFC3339 text format.
     * 
     */
    @Import(name="creationTimestamp")
      private final @Nullable Output<String> creationTimestamp;

    public Output<String> getCreationTimestamp() {
        return this.creationTimestamp == null ? Output.empty() : this.creationTimestamp;
    }

    /**
     * defaultRouteAction takes effect when none of the pathRules or routeRules match. The load balancer performs
     * advanced routing actions like URL rewrites, header transformations, etc. prior to forwarding the request
     * to the selected backend. If defaultRouteAction specifies any weightedBackendServices, defaultService must not be set.
     * Conversely if defaultService is set, defaultRouteAction cannot contain any weightedBackendServices.
     * Only one of defaultRouteAction or defaultUrlRedirect must be set.
     * Structure is documented below.
     * 
     */
    @Import(name="defaultRouteAction")
      private final @Nullable Output<URLMapDefaultRouteActionGetArgs> defaultRouteAction;

    public Output<URLMapDefaultRouteActionGetArgs> getDefaultRouteAction() {
        return this.defaultRouteAction == null ? Output.empty() : this.defaultRouteAction;
    }

    /**
     * The backend service or backend bucket to use when none of the given paths match.
     * 
     */
    @Import(name="defaultService")
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
    @Import(name="defaultUrlRedirect")
      private final @Nullable Output<URLMapDefaultUrlRedirectGetArgs> defaultUrlRedirect;

    public Output<URLMapDefaultUrlRedirectGetArgs> getDefaultUrlRedirect() {
        return this.defaultUrlRedirect == null ? Output.empty() : this.defaultUrlRedirect;
    }

    /**
     * Description of this test case.
     * 
     */
    @Import(name="description")
      private final @Nullable Output<String> description;

    public Output<String> getDescription() {
        return this.description == null ? Output.empty() : this.description;
    }

    /**
     * Fingerprint of this resource. A hash of the contents stored in this object. This field is used in optimistic locking.
     * 
     */
    @Import(name="fingerprint")
      private final @Nullable Output<String> fingerprint;

    public Output<String> getFingerprint() {
        return this.fingerprint == null ? Output.empty() : this.fingerprint;
    }

    /**
     * Specifies changes to request and response headers that need to take effect for
     * the selected backendService.
     * headerAction specified here take effect before headerAction in the enclosing
     * HttpRouteRule, PathMatcher and UrlMap.
     * Structure is documented below.
     * 
     */
    @Import(name="headerAction")
      private final @Nullable Output<URLMapHeaderActionGetArgs> headerAction;

    public Output<URLMapHeaderActionGetArgs> getHeaderAction() {
        return this.headerAction == null ? Output.empty() : this.headerAction;
    }

    /**
     * The list of HostRules to use against the URL.
     * Structure is documented below.
     * 
     */
    @Import(name="hostRules")
      private final @Nullable Output<List<URLMapHostRuleGetArgs>> hostRules;

    public Output<List<URLMapHostRuleGetArgs>> getHostRules() {
        return this.hostRules == null ? Output.empty() : this.hostRules;
    }

    /**
     * The unique identifier for the resource.
     * 
     */
    @Import(name="mapId")
      private final @Nullable Output<Integer> mapId;

    public Output<Integer> getMapId() {
        return this.mapId == null ? Output.empty() : this.mapId;
    }

    /**
     * The name of the query parameter to match. The query parameter must exist in the
     * request, in the absence of which the request match fails.
     * 
     */
    @Import(name="name")
      private final @Nullable Output<String> name;

    public Output<String> getName() {
        return this.name == null ? Output.empty() : this.name;
    }

    /**
     * The name of the PathMatcher to use to match the path portion of the URL if the
     * hostRule matches the URL's host portion.
     * 
     */
    @Import(name="pathMatchers")
      private final @Nullable Output<List<URLMapPathMatcherGetArgs>> pathMatchers;

    public Output<List<URLMapPathMatcherGetArgs>> getPathMatchers() {
        return this.pathMatchers == null ? Output.empty() : this.pathMatchers;
    }

    /**
     * The ID of the project in which the resource belongs.
     * If it is not provided, the provider project is used.
     * 
     */
    @Import(name="project")
      private final @Nullable Output<String> project;

    public Output<String> getProject() {
        return this.project == null ? Output.empty() : this.project;
    }

    /**
     * The URI of the created resource.
     * 
     */
    @Import(name="selfLink")
      private final @Nullable Output<String> selfLink;

    public Output<String> getSelfLink() {
        return this.selfLink == null ? Output.empty() : this.selfLink;
    }

    /**
     * The list of expected URL mapping tests. Request to update this UrlMap will
     * succeed only if all of the test cases pass. You can specify a maximum of 100
     * tests per UrlMap.
     * Structure is documented below.
     * 
     */
    @Import(name="tests")
      private final @Nullable Output<List<URLMapTestGetArgs>> tests;

    public Output<List<URLMapTestGetArgs>> getTests() {
        return this.tests == null ? Output.empty() : this.tests;
    }

    public URLMapState(
        @Nullable Output<String> creationTimestamp,
        @Nullable Output<URLMapDefaultRouteActionGetArgs> defaultRouteAction,
        @Nullable Output<String> defaultService,
        @Nullable Output<URLMapDefaultUrlRedirectGetArgs> defaultUrlRedirect,
        @Nullable Output<String> description,
        @Nullable Output<String> fingerprint,
        @Nullable Output<URLMapHeaderActionGetArgs> headerAction,
        @Nullable Output<List<URLMapHostRuleGetArgs>> hostRules,
        @Nullable Output<Integer> mapId,
        @Nullable Output<String> name,
        @Nullable Output<List<URLMapPathMatcherGetArgs>> pathMatchers,
        @Nullable Output<String> project,
        @Nullable Output<String> selfLink,
        @Nullable Output<List<URLMapTestGetArgs>> tests) {
        this.creationTimestamp = creationTimestamp;
        this.defaultRouteAction = defaultRouteAction;
        this.defaultService = defaultService;
        this.defaultUrlRedirect = defaultUrlRedirect;
        this.description = description;
        this.fingerprint = fingerprint;
        this.headerAction = headerAction;
        this.hostRules = hostRules;
        this.mapId = mapId;
        this.name = name;
        this.pathMatchers = pathMatchers;
        this.project = project;
        this.selfLink = selfLink;
        this.tests = tests;
    }

    private URLMapState() {
        this.creationTimestamp = Output.empty();
        this.defaultRouteAction = Output.empty();
        this.defaultService = Output.empty();
        this.defaultUrlRedirect = Output.empty();
        this.description = Output.empty();
        this.fingerprint = Output.empty();
        this.headerAction = Output.empty();
        this.hostRules = Output.empty();
        this.mapId = Output.empty();
        this.name = Output.empty();
        this.pathMatchers = Output.empty();
        this.project = Output.empty();
        this.selfLink = Output.empty();
        this.tests = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(URLMapState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<String> creationTimestamp;
        private @Nullable Output<URLMapDefaultRouteActionGetArgs> defaultRouteAction;
        private @Nullable Output<String> defaultService;
        private @Nullable Output<URLMapDefaultUrlRedirectGetArgs> defaultUrlRedirect;
        private @Nullable Output<String> description;
        private @Nullable Output<String> fingerprint;
        private @Nullable Output<URLMapHeaderActionGetArgs> headerAction;
        private @Nullable Output<List<URLMapHostRuleGetArgs>> hostRules;
        private @Nullable Output<Integer> mapId;
        private @Nullable Output<String> name;
        private @Nullable Output<List<URLMapPathMatcherGetArgs>> pathMatchers;
        private @Nullable Output<String> project;
        private @Nullable Output<String> selfLink;
        private @Nullable Output<List<URLMapTestGetArgs>> tests;

        public Builder() {
    	      // Empty
        }

        public Builder(URLMapState defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.creationTimestamp = defaults.creationTimestamp;
    	      this.defaultRouteAction = defaults.defaultRouteAction;
    	      this.defaultService = defaults.defaultService;
    	      this.defaultUrlRedirect = defaults.defaultUrlRedirect;
    	      this.description = defaults.description;
    	      this.fingerprint = defaults.fingerprint;
    	      this.headerAction = defaults.headerAction;
    	      this.hostRules = defaults.hostRules;
    	      this.mapId = defaults.mapId;
    	      this.name = defaults.name;
    	      this.pathMatchers = defaults.pathMatchers;
    	      this.project = defaults.project;
    	      this.selfLink = defaults.selfLink;
    	      this.tests = defaults.tests;
        }

        public Builder creationTimestamp(@Nullable Output<String> creationTimestamp) {
            this.creationTimestamp = creationTimestamp;
            return this;
        }
        public Builder creationTimestamp(@Nullable String creationTimestamp) {
            this.creationTimestamp = Output.ofNullable(creationTimestamp);
            return this;
        }
        public Builder defaultRouteAction(@Nullable Output<URLMapDefaultRouteActionGetArgs> defaultRouteAction) {
            this.defaultRouteAction = defaultRouteAction;
            return this;
        }
        public Builder defaultRouteAction(@Nullable URLMapDefaultRouteActionGetArgs defaultRouteAction) {
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
        public Builder defaultUrlRedirect(@Nullable Output<URLMapDefaultUrlRedirectGetArgs> defaultUrlRedirect) {
            this.defaultUrlRedirect = defaultUrlRedirect;
            return this;
        }
        public Builder defaultUrlRedirect(@Nullable URLMapDefaultUrlRedirectGetArgs defaultUrlRedirect) {
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
        public Builder fingerprint(@Nullable Output<String> fingerprint) {
            this.fingerprint = fingerprint;
            return this;
        }
        public Builder fingerprint(@Nullable String fingerprint) {
            this.fingerprint = Output.ofNullable(fingerprint);
            return this;
        }
        public Builder headerAction(@Nullable Output<URLMapHeaderActionGetArgs> headerAction) {
            this.headerAction = headerAction;
            return this;
        }
        public Builder headerAction(@Nullable URLMapHeaderActionGetArgs headerAction) {
            this.headerAction = Output.ofNullable(headerAction);
            return this;
        }
        public Builder hostRules(@Nullable Output<List<URLMapHostRuleGetArgs>> hostRules) {
            this.hostRules = hostRules;
            return this;
        }
        public Builder hostRules(@Nullable List<URLMapHostRuleGetArgs> hostRules) {
            this.hostRules = Output.ofNullable(hostRules);
            return this;
        }
        public Builder hostRules(URLMapHostRuleGetArgs... hostRules) {
            return hostRules(List.of(hostRules));
        }
        public Builder mapId(@Nullable Output<Integer> mapId) {
            this.mapId = mapId;
            return this;
        }
        public Builder mapId(@Nullable Integer mapId) {
            this.mapId = Output.ofNullable(mapId);
            return this;
        }
        public Builder name(@Nullable Output<String> name) {
            this.name = name;
            return this;
        }
        public Builder name(@Nullable String name) {
            this.name = Output.ofNullable(name);
            return this;
        }
        public Builder pathMatchers(@Nullable Output<List<URLMapPathMatcherGetArgs>> pathMatchers) {
            this.pathMatchers = pathMatchers;
            return this;
        }
        public Builder pathMatchers(@Nullable List<URLMapPathMatcherGetArgs> pathMatchers) {
            this.pathMatchers = Output.ofNullable(pathMatchers);
            return this;
        }
        public Builder pathMatchers(URLMapPathMatcherGetArgs... pathMatchers) {
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
        public Builder selfLink(@Nullable Output<String> selfLink) {
            this.selfLink = selfLink;
            return this;
        }
        public Builder selfLink(@Nullable String selfLink) {
            this.selfLink = Output.ofNullable(selfLink);
            return this;
        }
        public Builder tests(@Nullable Output<List<URLMapTestGetArgs>> tests) {
            this.tests = tests;
            return this;
        }
        public Builder tests(@Nullable List<URLMapTestGetArgs> tests) {
            this.tests = Output.ofNullable(tests);
            return this;
        }
        public Builder tests(URLMapTestGetArgs... tests) {
            return tests(List.of(tests));
        }        public URLMapState build() {
            return new URLMapState(creationTimestamp, defaultRouteAction, defaultService, defaultUrlRedirect, description, fingerprint, headerAction, hostRules, mapId, name, pathMatchers, project, selfLink, tests);
        }
    }
}
