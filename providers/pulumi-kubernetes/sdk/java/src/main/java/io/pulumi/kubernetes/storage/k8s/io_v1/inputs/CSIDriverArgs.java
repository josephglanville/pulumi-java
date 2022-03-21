// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.kubernetes.storage.k8s.io_v1.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.kubernetes.meta_v1.inputs.ObjectMetaArgs;
import io.pulumi.kubernetes.storage.k8s.io_v1.inputs.CSIDriverSpecArgs;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * CSIDriver captures information about a Container Storage Interface (CSI) volume driver deployed on the cluster. Kubernetes attach detach controller uses this object to determine whether attach is required. Kubelet uses this object to determine whether pod information needs to be passed on mount. CSIDriver objects are non-namespaced.
 * 
 */
public final class CSIDriverArgs extends io.pulumi.resources.ResourceArgs {

    public static final CSIDriverArgs Empty = new CSIDriverArgs();

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

    /**
     * Standard object metadata. metadata.Name indicates the name of the CSI driver that this object refers to; it MUST be the same name returned by the CSI GetPluginName() call for that driver. The driver name must be 63 characters or less, beginning and ending with an alphanumeric character ([a-z0-9A-Z]) with dashes (-), dots (.), and alphanumerics between. More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#metadata
     * 
     */
    @Import(name="metadata")
      private final @Nullable Output<ObjectMetaArgs> metadata;

    public Output<ObjectMetaArgs> getMetadata() {
        return this.metadata == null ? Output.empty() : this.metadata;
    }

    /**
     * Specification of the CSI Driver.
     * 
     */
    @Import(name="spec", required=true)
      private final Output<CSIDriverSpecArgs> spec;

    public Output<CSIDriverSpecArgs> getSpec() {
        return this.spec;
    }

    public CSIDriverArgs(
        @Nullable Output<String> apiVersion,
        @Nullable Output<String> kind,
        @Nullable Output<ObjectMetaArgs> metadata,
        Output<CSIDriverSpecArgs> spec) {
        this.apiVersion = apiVersion;
        this.kind = kind;
        this.metadata = metadata;
        this.spec = Objects.requireNonNull(spec, "expected parameter 'spec' to be non-null");
    }

    private CSIDriverArgs() {
        this.apiVersion = Output.empty();
        this.kind = Output.empty();
        this.metadata = Output.empty();
        this.spec = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(CSIDriverArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<String> apiVersion;
        private @Nullable Output<String> kind;
        private @Nullable Output<ObjectMetaArgs> metadata;
        private Output<CSIDriverSpecArgs> spec;

        public Builder() {
    	      // Empty
        }

        public Builder(CSIDriverArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.apiVersion = defaults.apiVersion;
    	      this.kind = defaults.kind;
    	      this.metadata = defaults.metadata;
    	      this.spec = defaults.spec;
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
        public Builder spec(Output<CSIDriverSpecArgs> spec) {
            this.spec = Objects.requireNonNull(spec);
            return this;
        }
        public Builder spec(CSIDriverSpecArgs spec) {
            this.spec = Output.of(Objects.requireNonNull(spec));
            return this;
        }        public CSIDriverArgs build() {
            return new CSIDriverArgs(apiVersion, kind, metadata, spec);
        }
    }
}
