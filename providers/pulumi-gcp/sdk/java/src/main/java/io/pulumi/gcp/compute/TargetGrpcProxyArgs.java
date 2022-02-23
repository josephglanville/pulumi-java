// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.compute;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class TargetGrpcProxyArgs extends io.pulumi.resources.ResourceArgs {

    public static final TargetGrpcProxyArgs Empty = new TargetGrpcProxyArgs();

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
     * Name of the resource. Provided by the client when the resource
     * is created. The name must be 1-63 characters long, and comply
     * with RFC1035. Specifically, the name must be 1-63 characters long
     * and match the regular expression `a-z?` which
     * means the first character must be a lowercase letter, and all
     * following characters must be a dash, lowercase letter, or digit,
     * except the last character, which cannot be a dash.
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
     * URL to the UrlMap resource that defines the mapping from URL to
     * the BackendService. The protocol field in the BackendService
     * must be set to GRPC.
     * 
     */
    @InputImport(name="urlMap")
      private final @Nullable Input<String> urlMap;

    public Input<String> getUrlMap() {
        return this.urlMap == null ? Input.empty() : this.urlMap;
    }

    /**
     * If true, indicates that the BackendServices referenced by
     * the urlMap may be accessed by gRPC applications without using
     * a sidecar proxy. This will enable configuration checks on urlMap
     * and its referenced BackendServices to not allow unsupported features.
     * A gRPC application must use "xds:///" scheme in the target URI
     * of the service it is connecting to. If false, indicates that the
     * BackendServices referenced by the urlMap will be accessed by gRPC
     * applications via a sidecar proxy. In this case, a gRPC application
     * must not use "xds:///" scheme in the target URI of the service
     * it is connecting to
     * 
     */
    @InputImport(name="validateForProxyless")
      private final @Nullable Input<Boolean> validateForProxyless;

    public Input<Boolean> getValidateForProxyless() {
        return this.validateForProxyless == null ? Input.empty() : this.validateForProxyless;
    }

    public TargetGrpcProxyArgs(
        @Nullable Input<String> description,
        @Nullable Input<String> name,
        @Nullable Input<String> project,
        @Nullable Input<String> urlMap,
        @Nullable Input<Boolean> validateForProxyless) {
        this.description = description;
        this.name = name;
        this.project = project;
        this.urlMap = urlMap;
        this.validateForProxyless = validateForProxyless;
    }

    private TargetGrpcProxyArgs() {
        this.description = Input.empty();
        this.name = Input.empty();
        this.project = Input.empty();
        this.urlMap = Input.empty();
        this.validateForProxyless = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(TargetGrpcProxyArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<String> description;
        private @Nullable Input<String> name;
        private @Nullable Input<String> project;
        private @Nullable Input<String> urlMap;
        private @Nullable Input<Boolean> validateForProxyless;

        public Builder() {
    	      // Empty
        }

        public Builder(TargetGrpcProxyArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.description = defaults.description;
    	      this.name = defaults.name;
    	      this.project = defaults.project;
    	      this.urlMap = defaults.urlMap;
    	      this.validateForProxyless = defaults.validateForProxyless;
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

        public Builder setUrlMap(@Nullable Input<String> urlMap) {
            this.urlMap = urlMap;
            return this;
        }

        public Builder setUrlMap(@Nullable String urlMap) {
            this.urlMap = Input.ofNullable(urlMap);
            return this;
        }

        public Builder setValidateForProxyless(@Nullable Input<Boolean> validateForProxyless) {
            this.validateForProxyless = validateForProxyless;
            return this;
        }

        public Builder setValidateForProxyless(@Nullable Boolean validateForProxyless) {
            this.validateForProxyless = Input.ofNullable(validateForProxyless);
            return this;
        }
        public TargetGrpcProxyArgs build() {
            return new TargetGrpcProxyArgs(description, name, project, urlMap, validateForProxyless);
        }
    }
}
