// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.kubernetes.core_v1.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import io.pulumi.kubernetes.core_v1.inputs.LocalObjectReferenceArgs;
import io.pulumi.kubernetes.core_v1.inputs.ObjectReferenceArgs;
import io.pulumi.kubernetes.meta_v1.inputs.ObjectMetaArgs;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * ServiceAccount binds together: * a name, understood by users, and perhaps by peripheral systems, for an identity * a principal that can be authenticated and authorized * a set of secrets
 * 
 */
public final class ServiceAccountArgs extends io.pulumi.resources.ResourceArgs {

    public static final ServiceAccountArgs Empty = new ServiceAccountArgs();

    /**
     * APIVersion defines the versioned schema of this representation of an object. Servers should convert recognized schemas to the latest internal value, and may reject unrecognized values. More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#resources
     * 
     */
    @Import(name="apiVersion")
      private final @Nullable Output<String> apiVersion;

    public Output<String> getApiVersion() {
        return this.apiVersion == null ? Codegen.empty() : this.apiVersion;
    }

    /**
     * AutomountServiceAccountToken indicates whether pods running as this service account should have an API token automatically mounted. Can be overridden at the pod level.
     * 
     */
    @Import(name="automountServiceAccountToken")
      private final @Nullable Output<Boolean> automountServiceAccountToken;

    public Output<Boolean> getAutomountServiceAccountToken() {
        return this.automountServiceAccountToken == null ? Codegen.empty() : this.automountServiceAccountToken;
    }

    /**
     * ImagePullSecrets is a list of references to secrets in the same namespace to use for pulling any images in pods that reference this ServiceAccount. ImagePullSecrets are distinct from Secrets because Secrets can be mounted in the pod, but ImagePullSecrets are only accessed by the kubelet. More info: https://kubernetes.io/docs/concepts/containers/images/#specifying-imagepullsecrets-on-a-pod
     * 
     */
    @Import(name="imagePullSecrets")
      private final @Nullable Output<List<LocalObjectReferenceArgs>> imagePullSecrets;

    public Output<List<LocalObjectReferenceArgs>> getImagePullSecrets() {
        return this.imagePullSecrets == null ? Codegen.empty() : this.imagePullSecrets;
    }

    /**
     * Kind is a string value representing the REST resource this object represents. Servers may infer this from the endpoint the client submits requests to. Cannot be updated. In CamelCase. More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#types-kinds
     * 
     */
    @Import(name="kind")
      private final @Nullable Output<String> kind;

    public Output<String> getKind() {
        return this.kind == null ? Codegen.empty() : this.kind;
    }

    /**
     * Standard object's metadata. More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#metadata
     * 
     */
    @Import(name="metadata")
      private final @Nullable Output<ObjectMetaArgs> metadata;

    public Output<ObjectMetaArgs> getMetadata() {
        return this.metadata == null ? Codegen.empty() : this.metadata;
    }

    /**
     * Secrets is the list of secrets allowed to be used by pods running using this ServiceAccount. More info: https://kubernetes.io/docs/concepts/configuration/secret
     * 
     */
    @Import(name="secrets")
      private final @Nullable Output<List<ObjectReferenceArgs>> secrets;

    public Output<List<ObjectReferenceArgs>> getSecrets() {
        return this.secrets == null ? Codegen.empty() : this.secrets;
    }

    public ServiceAccountArgs(
        @Nullable Output<String> apiVersion,
        @Nullable Output<Boolean> automountServiceAccountToken,
        @Nullable Output<List<LocalObjectReferenceArgs>> imagePullSecrets,
        @Nullable Output<String> kind,
        @Nullable Output<ObjectMetaArgs> metadata,
        @Nullable Output<List<ObjectReferenceArgs>> secrets) {
        this.apiVersion = apiVersion;
        this.automountServiceAccountToken = automountServiceAccountToken;
        this.imagePullSecrets = imagePullSecrets;
        this.kind = kind;
        this.metadata = metadata;
        this.secrets = secrets;
    }

    private ServiceAccountArgs() {
        this.apiVersion = Codegen.empty();
        this.automountServiceAccountToken = Codegen.empty();
        this.imagePullSecrets = Codegen.empty();
        this.kind = Codegen.empty();
        this.metadata = Codegen.empty();
        this.secrets = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ServiceAccountArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<String> apiVersion;
        private @Nullable Output<Boolean> automountServiceAccountToken;
        private @Nullable Output<List<LocalObjectReferenceArgs>> imagePullSecrets;
        private @Nullable Output<String> kind;
        private @Nullable Output<ObjectMetaArgs> metadata;
        private @Nullable Output<List<ObjectReferenceArgs>> secrets;

        public Builder() {
    	      // Empty
        }

        public Builder(ServiceAccountArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.apiVersion = defaults.apiVersion;
    	      this.automountServiceAccountToken = defaults.automountServiceAccountToken;
    	      this.imagePullSecrets = defaults.imagePullSecrets;
    	      this.kind = defaults.kind;
    	      this.metadata = defaults.metadata;
    	      this.secrets = defaults.secrets;
        }

        public Builder apiVersion(@Nullable Output<String> apiVersion) {
            this.apiVersion = apiVersion;
            return this;
        }
        public Builder apiVersion(@Nullable String apiVersion) {
            this.apiVersion = Codegen.ofNullable(apiVersion);
            return this;
        }
        public Builder automountServiceAccountToken(@Nullable Output<Boolean> automountServiceAccountToken) {
            this.automountServiceAccountToken = automountServiceAccountToken;
            return this;
        }
        public Builder automountServiceAccountToken(@Nullable Boolean automountServiceAccountToken) {
            this.automountServiceAccountToken = Codegen.ofNullable(automountServiceAccountToken);
            return this;
        }
        public Builder imagePullSecrets(@Nullable Output<List<LocalObjectReferenceArgs>> imagePullSecrets) {
            this.imagePullSecrets = imagePullSecrets;
            return this;
        }
        public Builder imagePullSecrets(@Nullable List<LocalObjectReferenceArgs> imagePullSecrets) {
            this.imagePullSecrets = Codegen.ofNullable(imagePullSecrets);
            return this;
        }
        public Builder imagePullSecrets(LocalObjectReferenceArgs... imagePullSecrets) {
            return imagePullSecrets(List.of(imagePullSecrets));
        }
        public Builder kind(@Nullable Output<String> kind) {
            this.kind = kind;
            return this;
        }
        public Builder kind(@Nullable String kind) {
            this.kind = Codegen.ofNullable(kind);
            return this;
        }
        public Builder metadata(@Nullable Output<ObjectMetaArgs> metadata) {
            this.metadata = metadata;
            return this;
        }
        public Builder metadata(@Nullable ObjectMetaArgs metadata) {
            this.metadata = Codegen.ofNullable(metadata);
            return this;
        }
        public Builder secrets(@Nullable Output<List<ObjectReferenceArgs>> secrets) {
            this.secrets = secrets;
            return this;
        }
        public Builder secrets(@Nullable List<ObjectReferenceArgs> secrets) {
            this.secrets = Codegen.ofNullable(secrets);
            return this;
        }
        public Builder secrets(ObjectReferenceArgs... secrets) {
            return secrets(List.of(secrets));
        }        public ServiceAccountArgs build() {
            return new ServiceAccountArgs(apiVersion, automountServiceAccountToken, imagePullSecrets, kind, metadata, secrets);
        }
    }
}
