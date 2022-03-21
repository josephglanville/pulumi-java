// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.compute_v1.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.googlenative.compute_v1.inputs.HttpRedirectActionArgs;
import io.pulumi.googlenative.compute_v1.inputs.HttpRouteActionArgs;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * A path-matching rule for a URL. If matched, will use the specified BackendService to handle the traffic arriving at this URL.
 * 
 */
public final class PathRuleArgs extends io.pulumi.resources.ResourceArgs {

    public static final PathRuleArgs Empty = new PathRuleArgs();

    /**
     * The list of path patterns to match. Each must start with / and the only place a * is allowed is at the end following a /. The string fed to the path matcher does not include any text after the first ? or #, and those chars are not allowed here.
     * 
     */
    @Import(name="paths")
      private final @Nullable Output<List<String>> paths;

    public Output<List<String>> getPaths() {
        return this.paths == null ? Output.empty() : this.paths;
    }

    /**
     * In response to a matching path, the load balancer performs advanced routing actions, such as URL rewrites and header transformations, before forwarding the request to the selected backend. If routeAction specifies any weightedBackendServices, service must not be set. Conversely if service is set, routeAction cannot contain any weightedBackendServices. Only one of routeAction or urlRedirect must be set. URL maps for external HTTP(S) load balancers support only the urlRewrite action within a path rule's routeAction.
     * 
     */
    @Import(name="routeAction")
      private final @Nullable Output<HttpRouteActionArgs> routeAction;

    public Output<HttpRouteActionArgs> getRouteAction() {
        return this.routeAction == null ? Output.empty() : this.routeAction;
    }

    /**
     * The full or partial URL of the backend service resource to which traffic is directed if this rule is matched. If routeAction is also specified, advanced routing actions, such as URL rewrites, take effect before sending the request to the backend. However, if service is specified, routeAction cannot contain any weightedBackendServices. Conversely, if routeAction specifies any weightedBackendServices, service must not be specified. Only one of urlRedirect, service or routeAction.weightedBackendService must be set.
     * 
     */
    @Import(name="service")
      private final @Nullable Output<String> service;

    public Output<String> getService() {
        return this.service == null ? Output.empty() : this.service;
    }

    /**
     * When a path pattern is matched, the request is redirected to a URL specified by urlRedirect. If urlRedirect is specified, service or routeAction must not be set. Not supported when the URL map is bound to a target gRPC proxy.
     * 
     */
    @Import(name="urlRedirect")
      private final @Nullable Output<HttpRedirectActionArgs> urlRedirect;

    public Output<HttpRedirectActionArgs> getUrlRedirect() {
        return this.urlRedirect == null ? Output.empty() : this.urlRedirect;
    }

    public PathRuleArgs(
        @Nullable Output<List<String>> paths,
        @Nullable Output<HttpRouteActionArgs> routeAction,
        @Nullable Output<String> service,
        @Nullable Output<HttpRedirectActionArgs> urlRedirect) {
        this.paths = paths;
        this.routeAction = routeAction;
        this.service = service;
        this.urlRedirect = urlRedirect;
    }

    private PathRuleArgs() {
        this.paths = Output.empty();
        this.routeAction = Output.empty();
        this.service = Output.empty();
        this.urlRedirect = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(PathRuleArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<List<String>> paths;
        private @Nullable Output<HttpRouteActionArgs> routeAction;
        private @Nullable Output<String> service;
        private @Nullable Output<HttpRedirectActionArgs> urlRedirect;

        public Builder() {
    	      // Empty
        }

        public Builder(PathRuleArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.paths = defaults.paths;
    	      this.routeAction = defaults.routeAction;
    	      this.service = defaults.service;
    	      this.urlRedirect = defaults.urlRedirect;
        }

        public Builder paths(@Nullable Output<List<String>> paths) {
            this.paths = paths;
            return this;
        }
        public Builder paths(@Nullable List<String> paths) {
            this.paths = Output.ofNullable(paths);
            return this;
        }
        public Builder paths(String... paths) {
            return paths(List.of(paths));
        }
        public Builder routeAction(@Nullable Output<HttpRouteActionArgs> routeAction) {
            this.routeAction = routeAction;
            return this;
        }
        public Builder routeAction(@Nullable HttpRouteActionArgs routeAction) {
            this.routeAction = Output.ofNullable(routeAction);
            return this;
        }
        public Builder service(@Nullable Output<String> service) {
            this.service = service;
            return this;
        }
        public Builder service(@Nullable String service) {
            this.service = Output.ofNullable(service);
            return this;
        }
        public Builder urlRedirect(@Nullable Output<HttpRedirectActionArgs> urlRedirect) {
            this.urlRedirect = urlRedirect;
            return this;
        }
        public Builder urlRedirect(@Nullable HttpRedirectActionArgs urlRedirect) {
            this.urlRedirect = Output.ofNullable(urlRedirect);
            return this;
        }        public PathRuleArgs build() {
            return new PathRuleArgs(paths, routeAction, service, urlRedirect);
        }
    }
}
