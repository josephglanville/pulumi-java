// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.kubernetes.core_v1.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.core.internal.Codegen;
import com.pulumi.kubernetes.core_v1.inputs.PersistentVolumeSpecArgs;
import com.pulumi.kubernetes.core_v1.inputs.PersistentVolumeStatusArgs;
import com.pulumi.kubernetes.meta_v1.inputs.ObjectMetaArgs;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * PersistentVolume (PV) is a storage resource provisioned by an administrator. It is analogous to a node. More info: https://kubernetes.io/docs/concepts/storage/persistent-volumes
 * 
 */
public final class PersistentVolumeArgs extends com.pulumi.resources.ResourceArgs {

    public static final PersistentVolumeArgs Empty = new PersistentVolumeArgs();

    /**
     * APIVersion defines the versioned schema of this representation of an object. Servers should convert recognized schemas to the latest internal value, and may reject unrecognized values. More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#resources
     * 
     */
    @Import(name="apiVersion")
    private @Nullable Output<String> apiVersion;

    /**
     * @return APIVersion defines the versioned schema of this representation of an object. Servers should convert recognized schemas to the latest internal value, and may reject unrecognized values. More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#resources
     * 
     */
    public Optional<Output<String>> apiVersion() {
        return Optional.ofNullable(this.apiVersion);
    }

    /**
     * Kind is a string value representing the REST resource this object represents. Servers may infer this from the endpoint the client submits requests to. Cannot be updated. In CamelCase. More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#types-kinds
     * 
     */
    @Import(name="kind")
    private @Nullable Output<String> kind;

    /**
     * @return Kind is a string value representing the REST resource this object represents. Servers may infer this from the endpoint the client submits requests to. Cannot be updated. In CamelCase. More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#types-kinds
     * 
     */
    public Optional<Output<String>> kind() {
        return Optional.ofNullable(this.kind);
    }

    /**
     * Standard object&#39;s metadata. More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#metadata
     * 
     */
    @Import(name="metadata")
    private @Nullable Output<ObjectMetaArgs> metadata;

    /**
     * @return Standard object&#39;s metadata. More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#metadata
     * 
     */
    public Optional<Output<ObjectMetaArgs>> metadata() {
        return Optional.ofNullable(this.metadata);
    }

    /**
     * spec defines a specification of a persistent volume owned by the cluster. Provisioned by an administrator. More info: https://kubernetes.io/docs/concepts/storage/persistent-volumes#persistent-volumes
     * 
     */
    @Import(name="spec")
    private @Nullable Output<PersistentVolumeSpecArgs> spec;

    /**
     * @return spec defines a specification of a persistent volume owned by the cluster. Provisioned by an administrator. More info: https://kubernetes.io/docs/concepts/storage/persistent-volumes#persistent-volumes
     * 
     */
    public Optional<Output<PersistentVolumeSpecArgs>> spec() {
        return Optional.ofNullable(this.spec);
    }

    /**
     * status represents the current information/status for the persistent volume. Populated by the system. Read-only. More info: https://kubernetes.io/docs/concepts/storage/persistent-volumes#persistent-volumes
     * 
     */
    @Import(name="status")
    private @Nullable Output<PersistentVolumeStatusArgs> status;

    /**
     * @return status represents the current information/status for the persistent volume. Populated by the system. Read-only. More info: https://kubernetes.io/docs/concepts/storage/persistent-volumes#persistent-volumes
     * 
     */
    public Optional<Output<PersistentVolumeStatusArgs>> status() {
        return Optional.ofNullable(this.status);
    }

    private PersistentVolumeArgs() {}

    private PersistentVolumeArgs(PersistentVolumeArgs $) {
        this.apiVersion = $.apiVersion;
        this.kind = $.kind;
        this.metadata = $.metadata;
        this.spec = $.spec;
        this.status = $.status;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(PersistentVolumeArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private PersistentVolumeArgs $;

        public Builder() {
            $ = new PersistentVolumeArgs();
        }

        public Builder(PersistentVolumeArgs defaults) {
            $ = new PersistentVolumeArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param apiVersion APIVersion defines the versioned schema of this representation of an object. Servers should convert recognized schemas to the latest internal value, and may reject unrecognized values. More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#resources
         * 
         * @return builder
         * 
         */
        public Builder apiVersion(@Nullable Output<String> apiVersion) {
            $.apiVersion = apiVersion;
            return this;
        }

        /**
         * @param apiVersion APIVersion defines the versioned schema of this representation of an object. Servers should convert recognized schemas to the latest internal value, and may reject unrecognized values. More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#resources
         * 
         * @return builder
         * 
         */
        public Builder apiVersion(String apiVersion) {
            return apiVersion(Output.of(apiVersion));
        }

        /**
         * @param kind Kind is a string value representing the REST resource this object represents. Servers may infer this from the endpoint the client submits requests to. Cannot be updated. In CamelCase. More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#types-kinds
         * 
         * @return builder
         * 
         */
        public Builder kind(@Nullable Output<String> kind) {
            $.kind = kind;
            return this;
        }

        /**
         * @param kind Kind is a string value representing the REST resource this object represents. Servers may infer this from the endpoint the client submits requests to. Cannot be updated. In CamelCase. More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#types-kinds
         * 
         * @return builder
         * 
         */
        public Builder kind(String kind) {
            return kind(Output.of(kind));
        }

        /**
         * @param metadata Standard object&#39;s metadata. More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#metadata
         * 
         * @return builder
         * 
         */
        public Builder metadata(@Nullable Output<ObjectMetaArgs> metadata) {
            $.metadata = metadata;
            return this;
        }

        /**
         * @param metadata Standard object&#39;s metadata. More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#metadata
         * 
         * @return builder
         * 
         */
        public Builder metadata(ObjectMetaArgs metadata) {
            return metadata(Output.of(metadata));
        }

        /**
         * @param spec spec defines a specification of a persistent volume owned by the cluster. Provisioned by an administrator. More info: https://kubernetes.io/docs/concepts/storage/persistent-volumes#persistent-volumes
         * 
         * @return builder
         * 
         */
        public Builder spec(@Nullable Output<PersistentVolumeSpecArgs> spec) {
            $.spec = spec;
            return this;
        }

        /**
         * @param spec spec defines a specification of a persistent volume owned by the cluster. Provisioned by an administrator. More info: https://kubernetes.io/docs/concepts/storage/persistent-volumes#persistent-volumes
         * 
         * @return builder
         * 
         */
        public Builder spec(PersistentVolumeSpecArgs spec) {
            return spec(Output.of(spec));
        }

        /**
         * @param status status represents the current information/status for the persistent volume. Populated by the system. Read-only. More info: https://kubernetes.io/docs/concepts/storage/persistent-volumes#persistent-volumes
         * 
         * @return builder
         * 
         */
        public Builder status(@Nullable Output<PersistentVolumeStatusArgs> status) {
            $.status = status;
            return this;
        }

        /**
         * @param status status represents the current information/status for the persistent volume. Populated by the system. Read-only. More info: https://kubernetes.io/docs/concepts/storage/persistent-volumes#persistent-volumes
         * 
         * @return builder
         * 
         */
        public Builder status(PersistentVolumeStatusArgs status) {
            return status(Output.of(status));
        }

        public PersistentVolumeArgs build() {
            $.apiVersion = Codegen.stringProp("apiVersion").output().arg($.apiVersion).getNullable();
            $.kind = Codegen.stringProp("kind").output().arg($.kind).getNullable();
            return $;
        }
    }

}
