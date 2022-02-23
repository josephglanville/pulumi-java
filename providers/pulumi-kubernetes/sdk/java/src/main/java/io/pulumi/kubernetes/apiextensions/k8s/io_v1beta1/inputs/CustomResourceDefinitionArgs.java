// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.kubernetes.apiextensions.k8s.io_v1beta1.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import io.pulumi.kubernetes.apiextensions.k8s.io_v1beta1.inputs.CustomResourceDefinitionSpecArgs;
import io.pulumi.kubernetes.apiextensions.k8s.io_v1beta1.inputs.CustomResourceDefinitionStatusArgs;
import io.pulumi.kubernetes.meta_v1.inputs.ObjectMetaArgs;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * CustomResourceDefinition represents a resource that should be exposed on the API server.  Its name MUST be in the format <.spec.name>.<.spec.group>. Deprecated in v1.16, planned for removal in v1.19. Use apiextensions.k8s.io/v1 CustomResourceDefinition instead.
 * 
 */
public final class CustomResourceDefinitionArgs extends io.pulumi.resources.ResourceArgs {

    public static final CustomResourceDefinitionArgs Empty = new CustomResourceDefinitionArgs();

    /**
     * APIVersion defines the versioned schema of this representation of an object. Servers should convert recognized schemas to the latest internal value, and may reject unrecognized values. More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#resources
     * 
     */
    @InputImport(name="apiVersion")
      private final @Nullable Input<String> apiVersion;

    public Input<String> getApiVersion() {
        return this.apiVersion == null ? Input.empty() : this.apiVersion;
    }

    /**
     * Kind is a string value representing the REST resource this object represents. Servers may infer this from the endpoint the client submits requests to. Cannot be updated. In CamelCase. More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#types-kinds
     * 
     */
    @InputImport(name="kind")
      private final @Nullable Input<String> kind;

    public Input<String> getKind() {
        return this.kind == null ? Input.empty() : this.kind;
    }

    @InputImport(name="metadata")
      private final @Nullable Input<ObjectMetaArgs> metadata;

    public Input<ObjectMetaArgs> getMetadata() {
        return this.metadata == null ? Input.empty() : this.metadata;
    }

    /**
     * spec describes how the user wants the resources to appear
     * 
     */
    @InputImport(name="spec", required=true)
      private final Input<CustomResourceDefinitionSpecArgs> spec;

    public Input<CustomResourceDefinitionSpecArgs> getSpec() {
        return this.spec;
    }

    /**
     * status indicates the actual state of the CustomResourceDefinition
     * 
     */
    @InputImport(name="status")
      private final @Nullable Input<CustomResourceDefinitionStatusArgs> status;

    public Input<CustomResourceDefinitionStatusArgs> getStatus() {
        return this.status == null ? Input.empty() : this.status;
    }

    public CustomResourceDefinitionArgs(
        @Nullable Input<String> apiVersion,
        @Nullable Input<String> kind,
        @Nullable Input<ObjectMetaArgs> metadata,
        Input<CustomResourceDefinitionSpecArgs> spec,
        @Nullable Input<CustomResourceDefinitionStatusArgs> status) {
        this.apiVersion = apiVersion;
        this.kind = kind;
        this.metadata = metadata;
        this.spec = Objects.requireNonNull(spec, "expected parameter 'spec' to be non-null");
        this.status = status;
    }

    private CustomResourceDefinitionArgs() {
        this.apiVersion = Input.empty();
        this.kind = Input.empty();
        this.metadata = Input.empty();
        this.spec = Input.empty();
        this.status = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(CustomResourceDefinitionArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<String> apiVersion;
        private @Nullable Input<String> kind;
        private @Nullable Input<ObjectMetaArgs> metadata;
        private Input<CustomResourceDefinitionSpecArgs> spec;
        private @Nullable Input<CustomResourceDefinitionStatusArgs> status;

        public Builder() {
    	      // Empty
        }

        public Builder(CustomResourceDefinitionArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.apiVersion = defaults.apiVersion;
    	      this.kind = defaults.kind;
    	      this.metadata = defaults.metadata;
    	      this.spec = defaults.spec;
    	      this.status = defaults.status;
        }

        public Builder setApiVersion(@Nullable Input<String> apiVersion) {
            this.apiVersion = apiVersion;
            return this;
        }

        public Builder setApiVersion(@Nullable String apiVersion) {
            this.apiVersion = Input.ofNullable(apiVersion);
            return this;
        }

        public Builder setKind(@Nullable Input<String> kind) {
            this.kind = kind;
            return this;
        }

        public Builder setKind(@Nullable String kind) {
            this.kind = Input.ofNullable(kind);
            return this;
        }

        public Builder setMetadata(@Nullable Input<ObjectMetaArgs> metadata) {
            this.metadata = metadata;
            return this;
        }

        public Builder setMetadata(@Nullable ObjectMetaArgs metadata) {
            this.metadata = Input.ofNullable(metadata);
            return this;
        }

        public Builder setSpec(Input<CustomResourceDefinitionSpecArgs> spec) {
            this.spec = Objects.requireNonNull(spec);
            return this;
        }

        public Builder setSpec(CustomResourceDefinitionSpecArgs spec) {
            this.spec = Input.of(Objects.requireNonNull(spec));
            return this;
        }

        public Builder setStatus(@Nullable Input<CustomResourceDefinitionStatusArgs> status) {
            this.status = status;
            return this;
        }

        public Builder setStatus(@Nullable CustomResourceDefinitionStatusArgs status) {
            this.status = Input.ofNullable(status);
            return this;
        }
        public CustomResourceDefinitionArgs build() {
            return new CustomResourceDefinitionArgs(apiVersion, kind, metadata, spec, status);
        }
    }
}
