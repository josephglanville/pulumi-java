// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.kubernetes.autoscaling_v1;

import io.pulumi.core.Alias;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.Export;
import io.pulumi.core.annotations.ResourceType;
import io.pulumi.core.internal.Codegen;
import io.pulumi.kubernetes.Utilities;
import io.pulumi.kubernetes.autoscaling_v1.HorizontalPodAutoscalerArgs;
import io.pulumi.kubernetes.autoscaling_v1.outputs.HorizontalPodAutoscalerSpec;
import io.pulumi.kubernetes.autoscaling_v1.outputs.HorizontalPodAutoscalerStatus;
import io.pulumi.kubernetes.meta_v1.outputs.ObjectMeta;
import java.lang.String;
import java.util.List;
import javax.annotation.Nullable;

/**
 * configuration of a horizontal pod autoscaler.
 * 
 */
@ResourceType(type="kubernetes:autoscaling/v1:HorizontalPodAutoscaler")
public class HorizontalPodAutoscaler extends io.pulumi.resources.CustomResource {
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
    public Output</* @Nullable */ String> getApiVersion() {
        return this.apiVersion;
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
    public Output</* @Nullable */ String> getKind() {
        return this.kind;
    }
    /**
     * Standard object metadata. More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#metadata
     * 
     */
    @Export(name="metadata", type=ObjectMeta.class, parameters={})
    private Output</* @Nullable */ ObjectMeta> metadata;

    /**
     * @return Standard object metadata. More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#metadata
     * 
     */
    public Output</* @Nullable */ ObjectMeta> getMetadata() {
        return this.metadata;
    }
    /**
     * behaviour of autoscaler. More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#spec-and-status.
     * 
     */
    @Export(name="spec", type=HorizontalPodAutoscalerSpec.class, parameters={})
    private Output</* @Nullable */ HorizontalPodAutoscalerSpec> spec;

    /**
     * @return behaviour of autoscaler. More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#spec-and-status.
     * 
     */
    public Output</* @Nullable */ HorizontalPodAutoscalerSpec> getSpec() {
        return this.spec;
    }
    /**
     * current information about the autoscaler.
     * 
     */
    @Export(name="status", type=HorizontalPodAutoscalerStatus.class, parameters={})
    private Output</* @Nullable */ HorizontalPodAutoscalerStatus> status;

    /**
     * @return current information about the autoscaler.
     * 
     */
    public Output</* @Nullable */ HorizontalPodAutoscalerStatus> getStatus() {
        return this.status;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public HorizontalPodAutoscaler(String name) {
        this(name, HorizontalPodAutoscalerArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public HorizontalPodAutoscaler(String name, @Nullable HorizontalPodAutoscalerArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public HorizontalPodAutoscaler(String name, @Nullable HorizontalPodAutoscalerArgs args, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("kubernetes:autoscaling/v1:HorizontalPodAutoscaler", name, makeArgs(args), makeResourceOptions(options, Codegen.empty()));
    }

    private HorizontalPodAutoscaler(String name, Output<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("kubernetes:autoscaling/v1:HorizontalPodAutoscaler", name, null, makeResourceOptions(options, id));
    }

    private static HorizontalPodAutoscalerArgs makeArgs(@Nullable HorizontalPodAutoscalerArgs args) {
        var builder = args == null ? HorizontalPodAutoscalerArgs.builder() : HorizontalPodAutoscalerArgs.builder(args);
        return builder
            .apiVersion("autoscaling/v1")
            .kind("HorizontalPodAutoscaler")
            .build();
    }

    private static io.pulumi.resources.CustomResourceOptions makeResourceOptions(@Nullable io.pulumi.resources.CustomResourceOptions options, @Nullable Output<String> id) {
        var defaultOptions = io.pulumi.resources.CustomResourceOptions.builder()
            .version(Utilities.getVersion())
            .aliases(List.of(
                Output.of(Alias.builder().type("kubernetes:autoscaling/v2:HorizontalPodAutoscaler").build()),
                Output.of(Alias.builder().type("kubernetes:autoscaling/v2beta1:HorizontalPodAutoscaler").build()),
                Output.of(Alias.builder().type("kubernetes:autoscaling/v2beta2:HorizontalPodAutoscaler").build())
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
    public static HorizontalPodAutoscaler get(String name, Output<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        return new HorizontalPodAutoscaler(name, id, options);
    }
}
