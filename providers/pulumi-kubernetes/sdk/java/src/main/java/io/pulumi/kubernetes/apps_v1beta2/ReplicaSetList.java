// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.kubernetes.apps_v1beta2;

import io.pulumi.core.Input;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.OutputExport;
import io.pulumi.core.annotations.ResourceType;
import io.pulumi.kubernetes.Utilities;
import io.pulumi.kubernetes.apps_v1beta2.ReplicaSetListArgs;
import io.pulumi.kubernetes.apps_v1beta2.outputs.ReplicaSet;
import io.pulumi.kubernetes.meta_v1.outputs.ListMeta;
import java.lang.String;
import java.util.List;
import javax.annotation.Nullable;

/**
 * ReplicaSetList is a collection of ReplicaSets.
 * 
 */
@ResourceType(type="kubernetes:apps/v1beta2:ReplicaSetList")
public class ReplicaSetList extends io.pulumi.resources.CustomResource {
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
     * List of ReplicaSets. More info: https://kubernetes.io/docs/concepts/workloads/controllers/replicationcontroller
     * 
     */
    @OutputExport(name="items", type=List.class, parameters={ReplicaSet.class})
    private Output<List<ReplicaSet>> items;

    /**
     * @return List of ReplicaSets. More info: https://kubernetes.io/docs/concepts/workloads/controllers/replicationcontroller
     * 
     */
    public Output<List<ReplicaSet>> getItems() {
        return this.items;
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
     * Standard list metadata. More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#types-kinds
     * 
     */
    @OutputExport(name="metadata", type=ListMeta.class, parameters={})
    private Output</* @Nullable */ ListMeta> metadata;

    /**
     * @return Standard list metadata. More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#types-kinds
     * 
     */
    public Output</* @Nullable */ ListMeta> getMetadata() {
        return this.metadata;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public ReplicaSetList(String name) {
        this(name, ReplicaSetListArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public ReplicaSetList(String name, ReplicaSetListArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public ReplicaSetList(String name, ReplicaSetListArgs args, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("kubernetes:apps/v1beta2:ReplicaSetList", name, makeArgs(args), makeResourceOptions(options, Input.empty()));
    }

    private ReplicaSetList(String name, Input<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("kubernetes:apps/v1beta2:ReplicaSetList", name, null, makeResourceOptions(options, id));
    }

    private static ReplicaSetListArgs makeArgs(ReplicaSetListArgs args) {
        var builder = args == null ? ReplicaSetListArgs.builder() : ReplicaSetListArgs.builder(args);
        return builder
            .setApiVersion("apps/v1beta2")
            .setKind("ReplicaSetList")
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
    public static ReplicaSetList get(String name, Input<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        return new ReplicaSetList(name, id, options);
    }
}
