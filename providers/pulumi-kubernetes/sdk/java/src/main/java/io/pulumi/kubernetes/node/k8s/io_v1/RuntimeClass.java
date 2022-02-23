// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.kubernetes.node.k8s.io_v1;

import io.pulumi.core.Alias;
import io.pulumi.core.Input;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.OutputExport;
import io.pulumi.core.annotations.ResourceType;
import io.pulumi.kubernetes.Utilities;
import io.pulumi.kubernetes.meta_v1.outputs.ObjectMeta;
import io.pulumi.kubernetes.node.k8s.io_v1.RuntimeClassArgs;
import io.pulumi.kubernetes.node.k8s.io_v1.outputs.Overhead;
import io.pulumi.kubernetes.node.k8s.io_v1.outputs.Scheduling;
import java.lang.String;
import java.util.List;
import javax.annotation.Nullable;

/**
 * RuntimeClass defines a class of container runtime supported in the cluster. The RuntimeClass is used to determine which container runtime is used to run all containers in a pod. RuntimeClasses are manually defined by a user or cluster provisioner, and referenced in the PodSpec. The Kubelet is responsible for resolving the RuntimeClassName reference before running the pod.  For more details, see https://kubernetes.io/docs/concepts/containers/runtime-class/
 * 
 */
@ResourceType(type="kubernetes:node.k8s.io/v1:RuntimeClass")
public class RuntimeClass extends io.pulumi.resources.CustomResource {
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
     * Handler specifies the underlying runtime and configuration that the CRI implementation will use to handle pods of this class. The possible values are specific to the node & CRI configuration.  It is assumed that all handlers are available on every node, and handlers of the same name are equivalent on every node. For example, a handler called "runc" might specify that the runc OCI runtime (using native Linux containers) will be used to run the containers in a pod. The Handler must be lowercase, conform to the DNS Label (RFC 1123) requirements, and is immutable.
     * 
     */
    @OutputExport(name="handler", type=String.class, parameters={})
    private Output<String> handler;

    /**
     * @return Handler specifies the underlying runtime and configuration that the CRI implementation will use to handle pods of this class. The possible values are specific to the node & CRI configuration.  It is assumed that all handlers are available on every node, and handlers of the same name are equivalent on every node. For example, a handler called "runc" might specify that the runc OCI runtime (using native Linux containers) will be used to run the containers in a pod. The Handler must be lowercase, conform to the DNS Label (RFC 1123) requirements, and is immutable.
     * 
     */
    public Output<String> getHandler() {
        return this.handler;
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
     * More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#metadata
     * 
     */
    @OutputExport(name="metadata", type=ObjectMeta.class, parameters={})
    private Output</* @Nullable */ ObjectMeta> metadata;

    /**
     * @return More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#metadata
     * 
     */
    public Output</* @Nullable */ ObjectMeta> getMetadata() {
        return this.metadata;
    }
    /**
     * Overhead represents the resource overhead associated with running a pod for a given RuntimeClass. For more details, see
     *  https://kubernetes.io/docs/concepts/scheduling-eviction/pod-overhead/
     * This field is in beta starting v1.18 and is only honored by servers that enable the PodOverhead feature.
     * 
     */
    @OutputExport(name="overhead", type=Overhead.class, parameters={})
    private Output</* @Nullable */ Overhead> overhead;

    /**
     * @return Overhead represents the resource overhead associated with running a pod for a given RuntimeClass. For more details, see
     *  https://kubernetes.io/docs/concepts/scheduling-eviction/pod-overhead/
     * This field is in beta starting v1.18 and is only honored by servers that enable the PodOverhead feature.
     * 
     */
    public Output</* @Nullable */ Overhead> getOverhead() {
        return this.overhead;
    }
    /**
     * Scheduling holds the scheduling constraints to ensure that pods running with this RuntimeClass are scheduled to nodes that support it. If scheduling is nil, this RuntimeClass is assumed to be supported by all nodes.
     * 
     */
    @OutputExport(name="scheduling", type=Scheduling.class, parameters={})
    private Output</* @Nullable */ Scheduling> scheduling;

    /**
     * @return Scheduling holds the scheduling constraints to ensure that pods running with this RuntimeClass are scheduled to nodes that support it. If scheduling is nil, this RuntimeClass is assumed to be supported by all nodes.
     * 
     */
    public Output</* @Nullable */ Scheduling> getScheduling() {
        return this.scheduling;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public RuntimeClass(String name) {
        this(name, RuntimeClassArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public RuntimeClass(String name, RuntimeClassArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public RuntimeClass(String name, RuntimeClassArgs args, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("kubernetes:node.k8s.io/v1:RuntimeClass", name, makeArgs(args), makeResourceOptions(options, Input.empty()));
    }

    private RuntimeClass(String name, Input<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("kubernetes:node.k8s.io/v1:RuntimeClass", name, null, makeResourceOptions(options, id));
    }

    private static RuntimeClassArgs makeArgs(RuntimeClassArgs args) {
        var builder = args == null ? RuntimeClassArgs.builder() : RuntimeClassArgs.builder(args);
        return builder
            .setApiVersion("node.k8s.io/v1")
            .setKind("RuntimeClass")
            .build();
    }

    private static io.pulumi.resources.CustomResourceOptions makeResourceOptions(@Nullable io.pulumi.resources.CustomResourceOptions options, @Nullable Input<String> id) {
        var defaultOptions = io.pulumi.resources.CustomResourceOptions.builder()
            .setVersion(Utilities.getVersion())
            .setAliases(List.of(
                Input.of(Alias.builder().setType("kubernetes:node.k8s.io/v1alpha1:RuntimeClass").build()),
                Input.of(Alias.builder().setType("kubernetes:node.k8s.io/v1beta1:RuntimeClass").build())
            ))
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
    public static RuntimeClass get(String name, Input<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        return new RuntimeClass(name, id, options);
    }
}
