// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.kubernetes.apiregistration.k8s.io_v1beta1.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.kubernetes.apiregistration.k8s.io_v1beta1.inputs.APIServiceSpecArgs;
import io.pulumi.kubernetes.apiregistration.k8s.io_v1beta1.inputs.APIServiceStatusArgs;
import io.pulumi.kubernetes.meta_v1.inputs.ObjectMetaArgs;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * APIService represents a server for a particular GroupVersion. Name must be "version.group".
 * 
 */
public final class APIServiceArgs extends io.pulumi.resources.ResourceArgs {

    public static final APIServiceArgs Empty = new APIServiceArgs();

    /**
     * APIVersion defines the versioned schema of this representation of an object. Servers should convert recognized schemas to the latest internal value, and may reject unrecognized values. More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#resources
     * 
     */
    @Import(name="apiVersion")
      private final @Nullable Output<String> apiVersion;

    public Output<String> getApiVersion() {
        return this.apiVersion == null ? Output.empty() : this.apiVersion;
    }

    /**
     * Kind is a string value representing the REST resource this object represents. Servers may infer this from the endpoint the client submits requests to. Cannot be updated. In CamelCase. More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#types-kinds
     * 
     */
    @Import(name="kind")
      private final @Nullable Output<String> kind;

    public Output<String> getKind() {
        return this.kind == null ? Output.empty() : this.kind;
    }

    @Import(name="metadata")
      private final @Nullable Output<ObjectMetaArgs> metadata;

    public Output<ObjectMetaArgs> getMetadata() {
        return this.metadata == null ? Output.empty() : this.metadata;
    }

    /**
     * Spec contains information for locating and communicating with a server
     * 
     */
    @Import(name="spec")
      private final @Nullable Output<APIServiceSpecArgs> spec;

    public Output<APIServiceSpecArgs> getSpec() {
        return this.spec == null ? Output.empty() : this.spec;
    }

    /**
     * Status contains derived information about an API server
     * 
     */
    @Import(name="status")
      private final @Nullable Output<APIServiceStatusArgs> status;

    public Output<APIServiceStatusArgs> getStatus() {
        return this.status == null ? Output.empty() : this.status;
    }

    public APIServiceArgs(
        @Nullable Output<String> apiVersion,
        @Nullable Output<String> kind,
        @Nullable Output<ObjectMetaArgs> metadata,
        @Nullable Output<APIServiceSpecArgs> spec,
        @Nullable Output<APIServiceStatusArgs> status) {
        this.apiVersion = apiVersion;
        this.kind = kind;
        this.metadata = metadata;
        this.spec = spec;
        this.status = status;
    }

    private APIServiceArgs() {
        this.apiVersion = Output.empty();
        this.kind = Output.empty();
        this.metadata = Output.empty();
        this.spec = Output.empty();
        this.status = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(APIServiceArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<String> apiVersion;
        private @Nullable Output<String> kind;
        private @Nullable Output<ObjectMetaArgs> metadata;
        private @Nullable Output<APIServiceSpecArgs> spec;
        private @Nullable Output<APIServiceStatusArgs> status;

        public Builder() {
    	      // Empty
        }

        public Builder(APIServiceArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.apiVersion = defaults.apiVersion;
    	      this.kind = defaults.kind;
    	      this.metadata = defaults.metadata;
    	      this.spec = defaults.spec;
    	      this.status = defaults.status;
        }

        public Builder apiVersion(@Nullable Output<String> apiVersion) {
            this.apiVersion = apiVersion;
            return this;
        }
        public Builder apiVersion(@Nullable String apiVersion) {
            this.apiVersion = Output.ofNullable(apiVersion);
            return this;
        }
        public Builder kind(@Nullable Output<String> kind) {
            this.kind = kind;
            return this;
        }
        public Builder kind(@Nullable String kind) {
            this.kind = Output.ofNullable(kind);
            return this;
        }
        public Builder metadata(@Nullable Output<ObjectMetaArgs> metadata) {
            this.metadata = metadata;
            return this;
        }
        public Builder metadata(@Nullable ObjectMetaArgs metadata) {
            this.metadata = Output.ofNullable(metadata);
            return this;
        }
        public Builder spec(@Nullable Output<APIServiceSpecArgs> spec) {
            this.spec = spec;
            return this;
        }
        public Builder spec(@Nullable APIServiceSpecArgs spec) {
            this.spec = Output.ofNullable(spec);
            return this;
        }
        public Builder status(@Nullable Output<APIServiceStatusArgs> status) {
            this.status = status;
            return this;
        }
        public Builder status(@Nullable APIServiceStatusArgs status) {
            this.status = Output.ofNullable(status);
            return this;
        }        public APIServiceArgs build() {
            return new APIServiceArgs(apiVersion, kind, metadata, spec, status);
        }
    }
}
