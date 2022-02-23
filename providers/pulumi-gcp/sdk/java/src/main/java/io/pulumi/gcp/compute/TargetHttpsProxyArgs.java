// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.compute;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


public final class TargetHttpsProxyArgs extends io.pulumi.resources.ResourceArgs {

    public static final TargetHttpsProxyArgs Empty = new TargetHttpsProxyArgs();

    /**
     * An optional description of this resource.
     * 
     */
    @InputImport(name="description")
      private final @Nullable Input<String> description;

    public Input<String> getDescription() {
        return this.description == null ? Input.empty() : this.description;
    }

    /**
     * Name of the resource. Provided by the client when the resource is
     * created. The name must be 1-63 characters long, and comply with
     * RFC1035. Specifically, the name must be 1-63 characters long and match
     * the regular expression `a-z?` which means the
     * first character must be a lowercase letter, and all following
     * characters must be a dash, lowercase letter, or digit, except the last
     * character, which cannot be a dash.
     * 
     */
    @InputImport(name="name")
      private final @Nullable Input<String> name;

    public Input<String> getName() {
        return this.name == null ? Input.empty() : this.name;
    }

    /**
     * The ID of the project in which the resource belongs.
     * If it is not provided, the provider project is used.
     * 
     */
    @InputImport(name="project")
      private final @Nullable Input<String> project;

    public Input<String> getProject() {
        return this.project == null ? Input.empty() : this.project;
    }

    /**
     * This field only applies when the forwarding rule that references
     * this target proxy has a loadBalancingScheme set to INTERNAL_SELF_MANAGED.
     * 
     */
    @InputImport(name="proxyBind")
      private final @Nullable Input<Boolean> proxyBind;

    public Input<Boolean> getProxyBind() {
        return this.proxyBind == null ? Input.empty() : this.proxyBind;
    }

    /**
     * Specifies the QUIC override policy for this resource. This determines
     * whether the load balancer will attempt to negotiate QUIC with clients
     * or not. Can specify one of NONE, ENABLE, or DISABLE. If NONE is
     * specified, uses the QUIC policy with no user overrides, which is
     * equivalent to DISABLE.
     * Default value is `NONE`.
     * Possible values are `NONE`, `ENABLE`, and `DISABLE`.
     * 
     */
    @InputImport(name="quicOverride")
      private final @Nullable Input<String> quicOverride;

    public Input<String> getQuicOverride() {
        return this.quicOverride == null ? Input.empty() : this.quicOverride;
    }

    /**
     * A list of SslCertificate resources that are used to authenticate
     * connections between users and the load balancer. At least one SSL
     * certificate must be specified.
     * 
     */
    @InputImport(name="sslCertificates", required=true)
      private final Input<List<String>> sslCertificates;

    public Input<List<String>> getSslCertificates() {
        return this.sslCertificates;
    }

    /**
     * A reference to the SslPolicy resource that will be associated with
     * the TargetHttpsProxy resource. If not set, the TargetHttpsProxy
     * resource will not have any SSL policy configured.
     * 
     */
    @InputImport(name="sslPolicy")
      private final @Nullable Input<String> sslPolicy;

    public Input<String> getSslPolicy() {
        return this.sslPolicy == null ? Input.empty() : this.sslPolicy;
    }

    /**
     * A reference to the UrlMap resource that defines the mapping from URL
     * to the BackendService.
     * 
     */
    @InputImport(name="urlMap", required=true)
      private final Input<String> urlMap;

    public Input<String> getUrlMap() {
        return this.urlMap;
    }

    public TargetHttpsProxyArgs(
        @Nullable Input<String> description,
        @Nullable Input<String> name,
        @Nullable Input<String> project,
        @Nullable Input<Boolean> proxyBind,
        @Nullable Input<String> quicOverride,
        Input<List<String>> sslCertificates,
        @Nullable Input<String> sslPolicy,
        Input<String> urlMap) {
        this.description = description;
        this.name = name;
        this.project = project;
        this.proxyBind = proxyBind;
        this.quicOverride = quicOverride;
        this.sslCertificates = Objects.requireNonNull(sslCertificates, "expected parameter 'sslCertificates' to be non-null");
        this.sslPolicy = sslPolicy;
        this.urlMap = Objects.requireNonNull(urlMap, "expected parameter 'urlMap' to be non-null");
    }

    private TargetHttpsProxyArgs() {
        this.description = Input.empty();
        this.name = Input.empty();
        this.project = Input.empty();
        this.proxyBind = Input.empty();
        this.quicOverride = Input.empty();
        this.sslCertificates = Input.empty();
        this.sslPolicy = Input.empty();
        this.urlMap = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(TargetHttpsProxyArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<String> description;
        private @Nullable Input<String> name;
        private @Nullable Input<String> project;
        private @Nullable Input<Boolean> proxyBind;
        private @Nullable Input<String> quicOverride;
        private Input<List<String>> sslCertificates;
        private @Nullable Input<String> sslPolicy;
        private Input<String> urlMap;

        public Builder() {
    	      // Empty
        }

        public Builder(TargetHttpsProxyArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.description = defaults.description;
    	      this.name = defaults.name;
    	      this.project = defaults.project;
    	      this.proxyBind = defaults.proxyBind;
    	      this.quicOverride = defaults.quicOverride;
    	      this.sslCertificates = defaults.sslCertificates;
    	      this.sslPolicy = defaults.sslPolicy;
    	      this.urlMap = defaults.urlMap;
        }

        public Builder setDescription(@Nullable Input<String> description) {
            this.description = description;
            return this;
        }

        public Builder setDescription(@Nullable String description) {
            this.description = Input.ofNullable(description);
            return this;
        }

        public Builder setName(@Nullable Input<String> name) {
            this.name = name;
            return this;
        }

        public Builder setName(@Nullable String name) {
            this.name = Input.ofNullable(name);
            return this;
        }

        public Builder setProject(@Nullable Input<String> project) {
            this.project = project;
            return this;
        }

        public Builder setProject(@Nullable String project) {
            this.project = Input.ofNullable(project);
            return this;
        }

        public Builder setProxyBind(@Nullable Input<Boolean> proxyBind) {
            this.proxyBind = proxyBind;
            return this;
        }

        public Builder setProxyBind(@Nullable Boolean proxyBind) {
            this.proxyBind = Input.ofNullable(proxyBind);
            return this;
        }

        public Builder setQuicOverride(@Nullable Input<String> quicOverride) {
            this.quicOverride = quicOverride;
            return this;
        }

        public Builder setQuicOverride(@Nullable String quicOverride) {
            this.quicOverride = Input.ofNullable(quicOverride);
            return this;
        }

        public Builder setSslCertificates(Input<List<String>> sslCertificates) {
            this.sslCertificates = Objects.requireNonNull(sslCertificates);
            return this;
        }

        public Builder setSslCertificates(List<String> sslCertificates) {
            this.sslCertificates = Input.of(Objects.requireNonNull(sslCertificates));
            return this;
        }

        public Builder setSslPolicy(@Nullable Input<String> sslPolicy) {
            this.sslPolicy = sslPolicy;
            return this;
        }

        public Builder setSslPolicy(@Nullable String sslPolicy) {
            this.sslPolicy = Input.ofNullable(sslPolicy);
            return this;
        }

        public Builder setUrlMap(Input<String> urlMap) {
            this.urlMap = Objects.requireNonNull(urlMap);
            return this;
        }

        public Builder setUrlMap(String urlMap) {
            this.urlMap = Input.of(Objects.requireNonNull(urlMap));
            return this;
        }
        public TargetHttpsProxyArgs build() {
            return new TargetHttpsProxyArgs(description, name, project, proxyBind, quicOverride, sslCertificates, sslPolicy, urlMap);
        }
    }
}
