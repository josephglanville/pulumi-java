// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.kubernetes.rbac.authorization.k8s.io_v1alpha1;

import io.pulumi.core.Input;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.OutputExport;
import io.pulumi.core.annotations.ResourceType;
import io.pulumi.kubernetes.Utilities;
import io.pulumi.kubernetes.meta_v1.outputs.ListMeta;
import io.pulumi.kubernetes.rbac.authorization.k8s.io_v1alpha1.ClusterRoleBindingListArgs;
import io.pulumi.kubernetes.rbac.authorization.k8s.io_v1alpha1.outputs.ClusterRoleBinding;
import java.lang.String;
import java.util.List;
import javax.annotation.Nullable;

/**
 * ClusterRoleBindingList is a collection of ClusterRoleBindings. Deprecated in v1.17 in favor of rbac.authorization.k8s.io/v1 ClusterRoleBindings, and will no longer be served in v1.20.
 * 
 */
@ResourceType(type="kubernetes:rbac.authorization.k8s.io/v1alpha1:ClusterRoleBindingList")
public class ClusterRoleBindingList extends io.pulumi.resources.CustomResource {
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
     * Items is a list of ClusterRoleBindings
     * 
     */
    @OutputExport(name="items", type=List.class, parameters={ClusterRoleBinding.class})
    private Output<List<ClusterRoleBinding>> items;

    /**
     * @return Items is a list of ClusterRoleBindings
     * 
     */
    public Output<List<ClusterRoleBinding>> getItems() {
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
     * Standard object's metadata.
     * 
     */
    @OutputExport(name="metadata", type=ListMeta.class, parameters={})
    private Output</* @Nullable */ ListMeta> metadata;

    /**
     * @return Standard object's metadata.
     * 
     */
    public Output</* @Nullable */ ListMeta> getMetadata() {
        return this.metadata;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public ClusterRoleBindingList(String name) {
        this(name, ClusterRoleBindingListArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public ClusterRoleBindingList(String name, ClusterRoleBindingListArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public ClusterRoleBindingList(String name, ClusterRoleBindingListArgs args, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("kubernetes:rbac.authorization.k8s.io/v1alpha1:ClusterRoleBindingList", name, makeArgs(args), makeResourceOptions(options, Input.empty()));
    }

    private ClusterRoleBindingList(String name, Input<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("kubernetes:rbac.authorization.k8s.io/v1alpha1:ClusterRoleBindingList", name, null, makeResourceOptions(options, id));
    }

    private static ClusterRoleBindingListArgs makeArgs(ClusterRoleBindingListArgs args) {
        var builder = args == null ? ClusterRoleBindingListArgs.builder() : ClusterRoleBindingListArgs.builder(args);
        return builder
            .setApiVersion("rbac.authorization.k8s.io/v1alpha1")
            .setKind("ClusterRoleBindingList")
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
    public static ClusterRoleBindingList get(String name, Input<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        return new ClusterRoleBindingList(name, id, options);
    }
}
