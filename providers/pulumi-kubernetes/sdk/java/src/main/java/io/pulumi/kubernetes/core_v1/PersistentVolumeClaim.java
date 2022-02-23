// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.kubernetes.core_v1;

import io.pulumi.core.Input;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.OutputExport;
import io.pulumi.core.annotations.ResourceType;
import io.pulumi.kubernetes.Utilities;
import io.pulumi.kubernetes.core_v1.PersistentVolumeClaimArgs;
import io.pulumi.kubernetes.core_v1.outputs.PersistentVolumeClaimSpec;
import io.pulumi.kubernetes.core_v1.outputs.PersistentVolumeClaimStatus;
import io.pulumi.kubernetes.meta_v1.outputs.ObjectMeta;
import java.lang.String;
import javax.annotation.Nullable;

/**
 * PersistentVolumeClaim is a user's request for and claim to a persistent volume
 * 
 */
@ResourceType(type="kubernetes:core/v1:PersistentVolumeClaim")
public class PersistentVolumeClaim extends io.pulumi.resources.CustomResource {
    /**
     * APIVersion defines the versioned schema of this representation of an object. Servers should convert recognized schemas to the latest internal value, and may reject unrecognized values. More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#resources
     * 
     */
    @OutputExport(name="apiVersion", type=String.class, parameters={})
    private Output</* @Nullable */ String> apiVersion;

    /**
     * @return APIVersion defines the versioned schema of this representation of an object. Servers should convert recognized schemas to the latest internal value, and may reject unrecognized values. More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#resources
     * 
     */
    public Output</* @Nullable */ String> getApiVersion() {
        return this.apiVersion;
    }
    /**
     * Kind is a string value representing the REST resource this object represents. Servers may infer this from the endpoint the client submits requests to. Cannot be updated. In CamelCase. More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#types-kinds
     * 
     */
    @OutputExport(name="kind", type=String.class, parameters={})
    private Output</* @Nullable */ String> kind;

    /**
     * @return Kind is a string value representing the REST resource this object represents. Servers may infer this from the endpoint the client submits requests to. Cannot be updated. In CamelCase. More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#types-kinds
     * 
     */
    public Output</* @Nullable */ String> getKind() {
        return this.kind;
    }
    /**
     * Standard object's metadata. More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#metadata
     * 
     */
    @OutputExport(name="metadata", type=ObjectMeta.class, parameters={})
    private Output</* @Nullable */ ObjectMeta> metadata;

    /**
     * @return Standard object's metadata. More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#metadata
     * 
     */
    public Output</* @Nullable */ ObjectMeta> getMetadata() {
        return this.metadata;
    }
    /**
     * Spec defines the desired characteristics of a volume requested by a pod author. More info: https://kubernetes.io/docs/concepts/storage/persistent-volumes#persistentvolumeclaims
     * 
     */
    @OutputExport(name="spec", type=PersistentVolumeClaimSpec.class, parameters={})
    private Output</* @Nullable */ PersistentVolumeClaimSpec> spec;

    /**
     * @return Spec defines the desired characteristics of a volume requested by a pod author. More info: https://kubernetes.io/docs/concepts/storage/persistent-volumes#persistentvolumeclaims
     * 
     */
    public Output</* @Nullable */ PersistentVolumeClaimSpec> getSpec() {
        return this.spec;
    }
    /**
     * Status represents the current information/status of a persistent volume claim. Read-only. More info: https://kubernetes.io/docs/concepts/storage/persistent-volumes#persistentvolumeclaims
     * 
     */
    @OutputExport(name="status", type=PersistentVolumeClaimStatus.class, parameters={})
    private Output</* @Nullable */ PersistentVolumeClaimStatus> status;

    /**
     * @return Status represents the current information/status of a persistent volume claim. Read-only. More info: https://kubernetes.io/docs/concepts/storage/persistent-volumes#persistentvolumeclaims
     * 
     */
    public Output</* @Nullable */ PersistentVolumeClaimStatus> getStatus() {
        return this.status;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public PersistentVolumeClaim(String name) {
        this(name, PersistentVolumeClaimArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public PersistentVolumeClaim(String name, @Nullable PersistentVolumeClaimArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public PersistentVolumeClaim(String name, @Nullable PersistentVolumeClaimArgs args, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("kubernetes:core/v1:PersistentVolumeClaim", name, makeArgs(args), makeResourceOptions(options, Input.empty()));
    }

    private PersistentVolumeClaim(String name, Input<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("kubernetes:core/v1:PersistentVolumeClaim", name, null, makeResourceOptions(options, id));
    }

    private static PersistentVolumeClaimArgs makeArgs(@Nullable PersistentVolumeClaimArgs args) {
        var builder = args == null ? PersistentVolumeClaimArgs.builder() : PersistentVolumeClaimArgs.builder(args);
        return builder
            .setApiVersion("v1")
            .setKind("PersistentVolumeClaim")
            .build();
    }

    private static io.pulumi.resources.CustomResourceOptions makeResourceOptions(@Nullable io.pulumi.resources.CustomResourceOptions options, @Nullable Input<String> id) {
        var defaultOptions = io.pulumi.resources.CustomResourceOptions.builder()
            .setVersion(Utilities.getVersion())
            .build();
        return io.pulumi.resources.CustomResourceOptions.merge(defaultOptions, options, id);
    }

    /**
     * Get an existing Host resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param options Optional settings to control the behavior of the CustomResource.
     */
    public static PersistentVolumeClaim get(String name, Input<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        return new PersistentVolumeClaim(name, id, options);
    }
}
