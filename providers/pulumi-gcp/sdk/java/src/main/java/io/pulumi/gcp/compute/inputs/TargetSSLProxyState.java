// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.compute.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.InputImport;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


public final class TargetSSLProxyState extends io.pulumi.resources.ResourceArgs {

    public static final TargetSSLProxyState Empty = new TargetSSLProxyState();

    /**
     * A reference to the BackendService resource.
     * 
     */
    @InputImport(name="backendService")
      private final @Nullable Output<String> backendService;

    public Output<String> getBackendService() {
        return this.backendService == null ? Output.empty() : this.backendService;
    }

    /**
     * Creation timestamp in RFC3339 text format.
     * 
     */
    @InputImport(name="creationTimestamp")
      private final @Nullable Output<String> creationTimestamp;

    public Output<String> getCreationTimestamp() {
        return this.creationTimestamp == null ? Output.empty() : this.creationTimestamp;
    }

    /**
     * An optional description of this resource.
     * 
     */
    @InputImport(name="description")
      private final @Nullable Output<String> description;

    public Output<String> getDescription() {
        return this.description == null ? Output.empty() : this.description;
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
      private final @Nullable Output<String> name;

    public Output<String> getName() {
        return this.name == null ? Output.empty() : this.name;
    }

    /**
     * The ID of the project in which the resource belongs.
     * If it is not provided, the provider project is used.
     * 
     */
    @InputImport(name="project")
      private final @Nullable Output<String> project;

    public Output<String> getProject() {
        return this.project == null ? Output.empty() : this.project;
    }

    /**
     * Specifies the type of proxy header to append before sending data to
     * the backend.
     * Default value is `NONE`.
     * Possible values are `NONE` and `PROXY_V1`.
     * 
     */
    @InputImport(name="proxyHeader")
      private final @Nullable Output<String> proxyHeader;

    public Output<String> getProxyHeader() {
        return this.proxyHeader == null ? Output.empty() : this.proxyHeader;
    }

    /**
     * The unique identifier for the resource.
     * 
     */
    @InputImport(name="proxyId")
      private final @Nullable Output<Integer> proxyId;

    public Output<Integer> getProxyId() {
        return this.proxyId == null ? Output.empty() : this.proxyId;
    }

    /**
     * The URI of the created resource.
     * 
     */
    @InputImport(name="selfLink")
      private final @Nullable Output<String> selfLink;

    public Output<String> getSelfLink() {
        return this.selfLink == null ? Output.empty() : this.selfLink;
    }

    /**
     * A list of SslCertificate resources that are used to authenticate
     * connections between users and the load balancer. At least one
     * SSL certificate must be specified.
     * 
     */
    @InputImport(name="sslCertificates")
      private final @Nullable Output<List<String>> sslCertificates;

    public Output<List<String>> getSslCertificates() {
        return this.sslCertificates == null ? Output.empty() : this.sslCertificates;
    }

    /**
     * A reference to the SslPolicy resource that will be associated with
     * the TargetSslProxy resource. If not set, the TargetSslProxy
     * resource will not have any SSL policy configured.
     * 
     */
    @InputImport(name="sslPolicy")
      private final @Nullable Output<String> sslPolicy;

    public Output<String> getSslPolicy() {
        return this.sslPolicy == null ? Output.empty() : this.sslPolicy;
    }

    public TargetSSLProxyState(
        @Nullable Output<String> backendService,
        @Nullable Output<String> creationTimestamp,
        @Nullable Output<String> description,
        @Nullable Output<String> name,
        @Nullable Output<String> project,
        @Nullable Output<String> proxyHeader,
        @Nullable Output<Integer> proxyId,
        @Nullable Output<String> selfLink,
        @Nullable Output<List<String>> sslCertificates,
        @Nullable Output<String> sslPolicy) {
        this.backendService = backendService;
        this.creationTimestamp = creationTimestamp;
        this.description = description;
        this.name = name;
        this.project = project;
        this.proxyHeader = proxyHeader;
        this.proxyId = proxyId;
        this.selfLink = selfLink;
        this.sslCertificates = sslCertificates;
        this.sslPolicy = sslPolicy;
    }

    private TargetSSLProxyState() {
        this.backendService = Output.empty();
        this.creationTimestamp = Output.empty();
        this.description = Output.empty();
        this.name = Output.empty();
        this.project = Output.empty();
        this.proxyHeader = Output.empty();
        this.proxyId = Output.empty();
        this.selfLink = Output.empty();
        this.sslCertificates = Output.empty();
        this.sslPolicy = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(TargetSSLProxyState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<String> backendService;
        private @Nullable Output<String> creationTimestamp;
        private @Nullable Output<String> description;
        private @Nullable Output<String> name;
        private @Nullable Output<String> project;
        private @Nullable Output<String> proxyHeader;
        private @Nullable Output<Integer> proxyId;
        private @Nullable Output<String> selfLink;
        private @Nullable Output<List<String>> sslCertificates;
        private @Nullable Output<String> sslPolicy;

        public Builder() {
    	      // Empty
        }

        public Builder(TargetSSLProxyState defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.backendService = defaults.backendService;
    	      this.creationTimestamp = defaults.creationTimestamp;
    	      this.description = defaults.description;
    	      this.name = defaults.name;
    	      this.project = defaults.project;
    	      this.proxyHeader = defaults.proxyHeader;
    	      this.proxyId = defaults.proxyId;
    	      this.selfLink = defaults.selfLink;
    	      this.sslCertificates = defaults.sslCertificates;
    	      this.sslPolicy = defaults.sslPolicy;
        }

        public Builder backendService(@Nullable Output<String> backendService) {
            this.backendService = backendService;
            return this;
        }

        public Builder backendService(@Nullable String backendService) {
            this.backendService = Output.ofNullable(backendService);
            return this;
        }

        public Builder creationTimestamp(@Nullable Output<String> creationTimestamp) {
            this.creationTimestamp = creationTimestamp;
            return this;
        }

        public Builder creationTimestamp(@Nullable String creationTimestamp) {
            this.creationTimestamp = Output.ofNullable(creationTimestamp);
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

        public Builder proxyHeader(@Nullable Output<String> proxyHeader) {
            this.proxyHeader = proxyHeader;
            return this;
        }

        public Builder proxyHeader(@Nullable String proxyHeader) {
            this.proxyHeader = Output.ofNullable(proxyHeader);
            return this;
        }

        public Builder proxyId(@Nullable Output<Integer> proxyId) {
            this.proxyId = proxyId;
            return this;
        }

        public Builder proxyId(@Nullable Integer proxyId) {
            this.proxyId = Output.ofNullable(proxyId);
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

        public Builder sslCertificates(@Nullable Output<List<String>> sslCertificates) {
            this.sslCertificates = sslCertificates;
            return this;
        }

        public Builder sslCertificates(@Nullable List<String> sslCertificates) {
            this.sslCertificates = Output.ofNullable(sslCertificates);
            return this;
        }

        public Builder sslPolicy(@Nullable Output<String> sslPolicy) {
            this.sslPolicy = sslPolicy;
            return this;
        }

        public Builder sslPolicy(@Nullable String sslPolicy) {
            this.sslPolicy = Output.ofNullable(sslPolicy);
            return this;
        }
        public TargetSSLProxyState build() {
            return new TargetSSLProxyState(backendService, creationTimestamp, description, name, project, proxyHeader, proxyId, selfLink, sslCertificates, sslPolicy);
        }
    }
}
