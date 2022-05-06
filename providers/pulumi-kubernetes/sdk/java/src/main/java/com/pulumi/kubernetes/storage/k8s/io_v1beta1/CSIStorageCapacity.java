// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.kubernetes.storage.k8s.io_v1beta1;

import com.pulumi.core.Alias;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import com.pulumi.kubernetes.Utilities;
import com.pulumi.kubernetes.meta_v1.outputs.LabelSelector;
import com.pulumi.kubernetes.meta_v1.outputs.ObjectMeta;
import com.pulumi.kubernetes.storage.k8s.io_v1beta1.CSIStorageCapacityArgs;
import java.lang.String;
import java.util.List;
import java.util.Optional;
import javax.annotation.Nullable;

/**
 * CSIStorageCapacity stores the result of one CSI GetCapacity call. For a given StorageClass, this describes the available capacity in a particular topology segment.  This can be used when considering where to instantiate new PersistentVolumes.
 * 
 * For example this can express things like: - StorageClass &#34;standard&#34; has &#34;1234 GiB&#34; available in &#34;topology.kubernetes.io/zone=us-east1&#34; - StorageClass &#34;localssd&#34; has &#34;10 GiB&#34; available in &#34;kubernetes.io/hostname=knode-abc123&#34;
 * 
 * The following three cases all imply that no capacity is available for a certain combination: - no object exists with suitable topology and storage class name - such an object exists, but the capacity is unset - such an object exists, but the capacity is zero
 * 
 * The producer of these objects can decide which approach is more suitable.
 * 
 * They are consumed by the kube-scheduler when a CSI driver opts into capacity-aware scheduling with CSIDriverSpec.StorageCapacity. The scheduler compares the MaximumVolumeSize against the requested size of pending volumes to filter out unsuitable nodes. If MaximumVolumeSize is unset, it falls back to a comparison against the less precise Capacity. If that is also unset, the scheduler assumes that capacity is insufficient and tries some other node.
 * 
 */
@ResourceType(type="kubernetes:storage.k8s.io/v1beta1:CSIStorageCapacity")
public class CSIStorageCapacity extends com.pulumi.resources.CustomResource {
    /**
     * APIVersion defines the versioned schema of this representation of an object. Servers should convert recognized schemas to the latest internal value, and may reject unrecognized values. More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#resources
     * 
     */
    @Export(name="apiVersion", type=String.class, parameters={})
    private Output</* @Nullable */ String> apiVersion;

    /**
     * @return APIVersion defines the versioned schema of this representation of an object. Servers should convert recognized schemas to the latest internal value, and may reject unrecognized values. More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#resources
     * 
     */
    public Output<Optional<String>> apiVersion() {
        return Codegen.optional(this.apiVersion);
    }
    /**
     * Capacity is the value reported by the CSI driver in its GetCapacityResponse for a GetCapacityRequest with topology and parameters that match the previous fields.
     * 
     * The semantic is currently (CSI spec 1.2) defined as: The available capacity, in bytes, of the storage that can be used to provision volumes. If not set, that information is currently unavailable.
     * 
     */
    @Export(name="capacity", type=String.class, parameters={})
    private Output</* @Nullable */ String> capacity;

    /**
     * @return Capacity is the value reported by the CSI driver in its GetCapacityResponse for a GetCapacityRequest with topology and parameters that match the previous fields.
     * 
     * The semantic is currently (CSI spec 1.2) defined as: The available capacity, in bytes, of the storage that can be used to provision volumes. If not set, that information is currently unavailable.
     * 
     */
    public Output<Optional<String>> capacity() {
        return Codegen.optional(this.capacity);
    }
    /**
     * Kind is a string value representing the REST resource this object represents. Servers may infer this from the endpoint the client submits requests to. Cannot be updated. In CamelCase. More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#types-kinds
     * 
     */
    @Export(name="kind", type=String.class, parameters={})
    private Output</* @Nullable */ String> kind;

    /**
     * @return Kind is a string value representing the REST resource this object represents. Servers may infer this from the endpoint the client submits requests to. Cannot be updated. In CamelCase. More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#types-kinds
     * 
     */
    public Output<Optional<String>> kind() {
        return Codegen.optional(this.kind);
    }
    /**
     * MaximumVolumeSize is the value reported by the CSI driver in its GetCapacityResponse for a GetCapacityRequest with topology and parameters that match the previous fields.
     * 
     * This is defined since CSI spec 1.4.0 as the largest size that may be used in a CreateVolumeRequest.capacity_range.required_bytes field to create a volume with the same parameters as those in GetCapacityRequest. The corresponding value in the Kubernetes API is ResourceRequirements.Requests in a volume claim.
     * 
     */
    @Export(name="maximumVolumeSize", type=String.class, parameters={})
    private Output</* @Nullable */ String> maximumVolumeSize;

    /**
     * @return MaximumVolumeSize is the value reported by the CSI driver in its GetCapacityResponse for a GetCapacityRequest with topology and parameters that match the previous fields.
     * 
     * This is defined since CSI spec 1.4.0 as the largest size that may be used in a CreateVolumeRequest.capacity_range.required_bytes field to create a volume with the same parameters as those in GetCapacityRequest. The corresponding value in the Kubernetes API is ResourceRequirements.Requests in a volume claim.
     * 
     */
    public Output<Optional<String>> maximumVolumeSize() {
        return Codegen.optional(this.maximumVolumeSize);
    }
    /**
     * Standard object&#39;s metadata. The name has no particular meaning. It must be be a DNS subdomain (dots allowed, 253 characters). To ensure that there are no conflicts with other CSI drivers on the cluster, the recommendation is to use csisc-&lt;uuid&gt;, a generated name, or a reverse-domain name which ends with the unique CSI driver name.
     * 
     * Objects are namespaced.
     * 
     * More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#metadata
     * 
     */
    @Export(name="metadata", type=ObjectMeta.class, parameters={})
    private Output</* @Nullable */ ObjectMeta> metadata;

    /**
     * @return Standard object&#39;s metadata. The name has no particular meaning. It must be be a DNS subdomain (dots allowed, 253 characters). To ensure that there are no conflicts with other CSI drivers on the cluster, the recommendation is to use csisc-&lt;uuid&gt;, a generated name, or a reverse-domain name which ends with the unique CSI driver name.
     * 
     * Objects are namespaced.
     * 
     * More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#metadata
     * 
     */
    public Output<Optional<ObjectMeta>> metadata() {
        return Codegen.optional(this.metadata);
    }
    /**
     * NodeTopology defines which nodes have access to the storage for which capacity was reported. If not set, the storage is not accessible from any node in the cluster. If empty, the storage is accessible from all nodes. This field is immutable.
     * 
     */
    @Export(name="nodeTopology", type=LabelSelector.class, parameters={})
    private Output</* @Nullable */ LabelSelector> nodeTopology;

    /**
     * @return NodeTopology defines which nodes have access to the storage for which capacity was reported. If not set, the storage is not accessible from any node in the cluster. If empty, the storage is accessible from all nodes. This field is immutable.
     * 
     */
    public Output<Optional<LabelSelector>> nodeTopology() {
        return Codegen.optional(this.nodeTopology);
    }
    /**
     * The name of the StorageClass that the reported capacity applies to. It must meet the same requirements as the name of a StorageClass object (non-empty, DNS subdomain). If that object no longer exists, the CSIStorageCapacity object is obsolete and should be removed by its creator. This field is immutable.
     * 
     */
    @Export(name="storageClassName", type=String.class, parameters={})
    private Output<String> storageClassName;

    /**
     * @return The name of the StorageClass that the reported capacity applies to. It must meet the same requirements as the name of a StorageClass object (non-empty, DNS subdomain). If that object no longer exists, the CSIStorageCapacity object is obsolete and should be removed by its creator. This field is immutable.
     * 
     */
    public Output<String> storageClassName() {
        return this.storageClassName;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public CSIStorageCapacity(String name) {
        this(name, CSIStorageCapacityArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public CSIStorageCapacity(String name, CSIStorageCapacityArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public CSIStorageCapacity(String name, CSIStorageCapacityArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("kubernetes:storage.k8s.io/v1beta1:CSIStorageCapacity", name, makeArgs(args), makeResourceOptions(options, Codegen.empty()));
    }

    private CSIStorageCapacity(String name, Output<String> id, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("kubernetes:storage.k8s.io/v1beta1:CSIStorageCapacity", name, null, makeResourceOptions(options, id));
    }

    private static CSIStorageCapacityArgs makeArgs(CSIStorageCapacityArgs args) {
        var builder = args == null ? CSIStorageCapacityArgs.builder() : CSIStorageCapacityArgs.builder(args);
        return builder
            .apiVersion("storage.k8s.io/v1beta1")
            .kind("CSIStorageCapacity")
            .build();
    }

    private static com.pulumi.resources.CustomResourceOptions makeResourceOptions(@Nullable com.pulumi.resources.CustomResourceOptions options, @Nullable Output<String> id) {
        var defaultOptions = com.pulumi.resources.CustomResourceOptions.builder()
            .version(Utilities.getVersion())
            .aliases(List.of(
                Output.of(Alias.builder().type("kubernetes:storage.k8s.io/v1:CSIStorageCapacity").build()),
                Output.of(Alias.builder().type("kubernetes:storage.k8s.io/v1alpha1:CSIStorageCapacity").build())
            ))
            .build();
        return com.pulumi.resources.CustomResourceOptions.merge(defaultOptions, options, id);
    }

    /**
     * Get an existing Host resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param options Optional settings to control the behavior of the CustomResource.
     */
    public static CSIStorageCapacity get(String name, Output<String> id, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new CSIStorageCapacity(name, id, options);
    }
}
