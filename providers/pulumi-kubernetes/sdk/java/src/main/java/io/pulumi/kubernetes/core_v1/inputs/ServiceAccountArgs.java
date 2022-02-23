// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.kubernetes.core_v1.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
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
    @InputImport(name="apiVersion")
      private final @Nullable Input<String> apiVersion;

    public Input<String> getApiVersion() {
        return this.apiVersion == null ? Input.empty() : this.apiVersion;
    }

    /**
     * AutomountServiceAccountToken indicates whether pods running as this service account should have an API token automatically mounted. Can be overridden at the pod level.
     * 
     */
    @InputImport(name="automountServiceAccountToken")
      private final @Nullable Input<Boolean> automountServiceAccountToken;

    public Input<Boolean> getAutomountServiceAccountToken() {
        return this.automountServiceAccountToken == null ? Input.empty() : this.automountServiceAccountToken;
    }

    /**
     * ImagePullSecrets is a list of references to secrets in the same namespace to use for pulling any images in pods that reference this ServiceAccount. ImagePullSecrets are distinct from Secrets because Secrets can be mounted in the pod, but ImagePullSecrets are only accessed by the kubelet. More info: https://kubernetes.io/docs/concepts/containers/images/#specifying-imagepullsecrets-on-a-pod
     * 
     */
    @InputImport(name="imagePullSecrets")
      private final @Nullable Input<List<LocalObjectReferenceArgs>> imagePullSecrets;

    public Input<List<LocalObjectReferenceArgs>> getImagePullSecrets() {
        return this.imagePullSecrets == null ? Input.empty() : this.imagePullSecrets;
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

    /**
     * Standard object's metadata. More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#metadata
     * 
     */
    @InputImport(name="metadata")
      private final @Nullable Input<ObjectMetaArgs> metadata;

    public Input<ObjectMetaArgs> getMetadata() {
        return this.metadata == null ? Input.empty() : this.metadata;
    }

    /**
     * Secrets is the list of secrets allowed to be used by pods running using this ServiceAccount. More info: https://kubernetes.io/docs/concepts/configuration/secret
     * 
     */
    @InputImport(name="secrets")
      private final @Nullable Input<List<ObjectReferenceArgs>> secrets;

    public Input<List<ObjectReferenceArgs>> getSecrets() {
        return this.secrets == null ? Input.empty() : this.secrets;
    }

    public ServiceAccountArgs(
        @Nullable Input<String> apiVersion,
        @Nullable Input<Boolean> automountServiceAccountToken,
        @Nullable Input<List<LocalObjectReferenceArgs>> imagePullSecrets,
        @Nullable Input<String> kind,
        @Nullable Input<ObjectMetaArgs> metadata,
        @Nullable Input<List<ObjectReferenceArgs>> secrets) {
        this.apiVersion = apiVersion;
        this.automountServiceAccountToken = automountServiceAccountToken;
        this.imagePullSecrets = imagePullSecrets;
        this.kind = kind;
        this.metadata = metadata;
        this.secrets = secrets;
    }

    private ServiceAccountArgs() {
        this.apiVersion = Input.empty();
        this.automountServiceAccountToken = Input.empty();
        this.imagePullSecrets = Input.empty();
        this.kind = Input.empty();
        this.metadata = Input.empty();
        this.secrets = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ServiceAccountArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<String> apiVersion;
        private @Nullable Input<Boolean> automountServiceAccountToken;
        private @Nullable Input<List<LocalObjectReferenceArgs>> imagePullSecrets;
        private @Nullable Input<String> kind;
        private @Nullable Input<ObjectMetaArgs> metadata;
        private @Nullable Input<List<ObjectReferenceArgs>> secrets;

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

        public Builder setApiVersion(@Nullable Input<String> apiVersion) {
            this.apiVersion = apiVersion;
            return this;
        }

        public Builder setApiVersion(@Nullable String apiVersion) {
            this.apiVersion = Input.ofNullable(apiVersion);
            return this;
        }

        public Builder setAutomountServiceAccountToken(@Nullable Input<Boolean> automountServiceAccountToken) {
            this.automountServiceAccountToken = automountServiceAccountToken;
            return this;
        }

        public Builder setAutomountServiceAccountToken(@Nullable Boolean automountServiceAccountToken) {
            this.automountServiceAccountToken = Input.ofNullable(automountServiceAccountToken);
            return this;
        }

        public Builder setImagePullSecrets(@Nullable Input<List<LocalObjectReferenceArgs>> imagePullSecrets) {
            this.imagePullSecrets = imagePullSecrets;
            return this;
        }

        public Builder setImagePullSecrets(@Nullable List<LocalObjectReferenceArgs> imagePullSecrets) {
            this.imagePullSecrets = Input.ofNullable(imagePullSecrets);
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

        public Builder setSecrets(@Nullable Input<List<ObjectReferenceArgs>> secrets) {
            this.secrets = secrets;
            return this;
        }

        public Builder setSecrets(@Nullable List<ObjectReferenceArgs> secrets) {
            this.secrets = Input.ofNullable(secrets);
            return this;
        }
        public ServiceAccountArgs build() {
            return new ServiceAccountArgs(apiVersion, automountServiceAccountToken, imagePullSecrets, kind, metadata, secrets);
        }
    }
}
