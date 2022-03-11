// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.compute_alpha;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.InputImport;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


public final class TargetHttpProxyArgs extends io.pulumi.resources.ResourceArgs {

    public static final TargetHttpProxyArgs Empty = new TargetHttpProxyArgs();

    /**
     * An optional description of this resource. Provide this property when you create the resource.
     * 
     */
    @InputImport(name="description")
      private final @Nullable Output<String> description;

    public Output<String> getDescription() {
        return this.description == null ? Output.empty() : this.description;
    }

    /**
     * URLs to networkservices.HttpFilter resources enabled for xDS clients using this configuration. For example, https://networkservices.googleapis.com/v1alpha1/projects/project/locations/ locationhttpFilters/httpFilter Only filters that handle outbound connection and stream events may be specified. These filters work in conjunction with a default set of HTTP filters that may already be configured by Traffic Director. Traffic Director will determine the final location of these filters within xDS configuration based on the name of the HTTP filter. If Traffic Director positions multiple filters at the same location, those filters will be in the same order as specified in this list. httpFilters only applies for loadbalancers with loadBalancingScheme set to INTERNAL_SELF_MANAGED. See ForwardingRule for more details.
     * 
     */
    @InputImport(name="httpFilters")
      private final @Nullable Output<List<String>> httpFilters;

    public Output<List<String>> getHttpFilters() {
        return this.httpFilters == null ? Output.empty() : this.httpFilters;
    }

    /**
     * Name of the resource. Provided by the client when the resource is created. The name must be 1-63 characters long, and comply with RFC1035. Specifically, the name must be 1-63 characters long and match the regular expression `[a-z]([-a-z0-9]*[a-z0-9])?` which means the first character must be a lowercase letter, and all following characters must be a dash, lowercase letter, or digit, except the last character, which cannot be a dash.
     * 
     */
    @InputImport(name="name")
      private final @Nullable Output<String> name;

    public Output<String> getName() {
        return this.name == null ? Output.empty() : this.name;
    }

    @InputImport(name="project")
      private final @Nullable Output<String> project;

    public Output<String> getProject() {
        return this.project == null ? Output.empty() : this.project;
    }

    /**
     * This field only applies when the forwarding rule that references this target proxy has a loadBalancingScheme set to INTERNAL_SELF_MANAGED. When this field is set to true, Envoy proxies set up inbound traffic interception and bind to the IP address and port specified in the forwarding rule. This is generally useful when using Traffic Director to configure Envoy as a gateway or middle proxy (in other words, not a sidecar proxy). The Envoy proxy listens for inbound requests and handles requests when it receives them. The default is false.
     * 
     */
    @InputImport(name="proxyBind")
      private final @Nullable Output<Boolean> proxyBind;

    public Output<Boolean> getProxyBind() {
        return this.proxyBind == null ? Output.empty() : this.proxyBind;
    }

    @InputImport(name="requestId")
      private final @Nullable Output<String> requestId;

    public Output<String> getRequestId() {
        return this.requestId == null ? Output.empty() : this.requestId;
    }

    /**
     * URL to the UrlMap resource that defines the mapping from URL to the BackendService.
     * 
     */
    @InputImport(name="urlMap")
      private final @Nullable Output<String> urlMap;

    public Output<String> getUrlMap() {
        return this.urlMap == null ? Output.empty() : this.urlMap;
    }

    public TargetHttpProxyArgs(
        @Nullable Output<String> description,
        @Nullable Output<List<String>> httpFilters,
        @Nullable Output<String> name,
        @Nullable Output<String> project,
        @Nullable Output<Boolean> proxyBind,
        @Nullable Output<String> requestId,
        @Nullable Output<String> urlMap) {
        this.description = description;
        this.httpFilters = httpFilters;
        this.name = name;
        this.project = project;
        this.proxyBind = proxyBind;
        this.requestId = requestId;
        this.urlMap = urlMap;
    }

    private TargetHttpProxyArgs() {
        this.description = Output.empty();
        this.httpFilters = Output.empty();
        this.name = Output.empty();
        this.project = Output.empty();
        this.proxyBind = Output.empty();
        this.requestId = Output.empty();
        this.urlMap = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(TargetHttpProxyArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<String> description;
        private @Nullable Output<List<String>> httpFilters;
        private @Nullable Output<String> name;
        private @Nullable Output<String> project;
        private @Nullable Output<Boolean> proxyBind;
        private @Nullable Output<String> requestId;
        private @Nullable Output<String> urlMap;

        public Builder() {
    	      // Empty
        }

        public Builder(TargetHttpProxyArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.description = defaults.description;
    	      this.httpFilters = defaults.httpFilters;
    	      this.name = defaults.name;
    	      this.project = defaults.project;
    	      this.proxyBind = defaults.proxyBind;
    	      this.requestId = defaults.requestId;
    	      this.urlMap = defaults.urlMap;
        }

        public Builder description(@Nullable Output<String> description) {
            this.description = description;
            return this;
        }

        public Builder description(@Nullable String description) {
            this.description = Output.ofNullable(description);
            return this;
        }

        public Builder httpFilters(@Nullable Output<List<String>> httpFilters) {
            this.httpFilters = httpFilters;
            return this;
        }

        public Builder httpFilters(@Nullable List<String> httpFilters) {
            this.httpFilters = Output.ofNullable(httpFilters);
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

        public Builder project(@Nullable Output<String> project) {
            this.project = project;
            return this;
        }

        public Builder project(@Nullable String project) {
            this.project = Output.ofNullable(project);
            return this;
        }

        public Builder proxyBind(@Nullable Output<Boolean> proxyBind) {
            this.proxyBind = proxyBind;
            return this;
        }

        public Builder proxyBind(@Nullable Boolean proxyBind) {
            this.proxyBind = Output.ofNullable(proxyBind);
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

        public Builder urlMap(@Nullable Output<String> urlMap) {
            this.urlMap = urlMap;
            return this;
        }

        public Builder urlMap(@Nullable String urlMap) {
            this.urlMap = Output.ofNullable(urlMap);
            return this;
        }
        public TargetHttpProxyArgs build() {
            return new TargetHttpProxyArgs(description, httpFilters, name, project, proxyBind, requestId, urlMap);
        }
    }
}
