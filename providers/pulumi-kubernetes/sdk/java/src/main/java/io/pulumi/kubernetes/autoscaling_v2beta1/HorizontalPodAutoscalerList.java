// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.kubernetes.autoscaling_v2beta1;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Export;
import io.pulumi.core.annotations.ResourceType;
import io.pulumi.core.internal.Codegen;
import io.pulumi.kubernetes.Utilities;
import io.pulumi.kubernetes.autoscaling_v2beta1.HorizontalPodAutoscalerListArgs;
import io.pulumi.kubernetes.autoscaling_v2beta1.outputs.HorizontalPodAutoscaler;
import io.pulumi.kubernetes.meta_v1.outputs.ListMeta;
import java.lang.String;
import java.util.List;
import javax.annotation.Nullable;

/**
 * HorizontalPodAutoscaler is a list of horizontal pod autoscaler objects.
 * 
 */
@ResourceType(type="kubernetes:autoscaling/v2beta1:HorizontalPodAutoscalerList")
public class HorizontalPodAutoscalerList extends io.pulumi.resources.CustomResource {
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
     * items is the list of horizontal pod autoscaler objects.
     * 
     */
    @Export(name="items", type=List.class, parameters={HorizontalPodAutoscaler.class})
    private Output<List<HorizontalPodAutoscaler>> items;

    /**
     * @return items is the list of horizontal pod autoscaler objects.
     * 
     */
    public Output<List<HorizontalPodAutoscaler>> getItems() {
        return this.items;
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
     * metadata is the standard list metadata.
     * 
     */
    @Export(name="metadata", type=ListMeta.class, parameters={})
    private Output</* @Nullable */ ListMeta> metadata;

    /**
     * @return metadata is the standard list metadata.
     * 
     */
    public Output</* @Nullable */ ListMeta> getMetadata() {
        return this.metadata;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public HorizontalPodAutoscalerList(String name) {
        this(name, HorizontalPodAutoscalerListArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public HorizontalPodAutoscalerList(String name, HorizontalPodAutoscalerListArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public HorizontalPodAutoscalerList(String name, HorizontalPodAutoscalerListArgs args, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("kubernetes:autoscaling/v2beta1:HorizontalPodAutoscalerList", name, makeArgs(args), makeResourceOptions(options, Codegen.empty()));
    }

    private HorizontalPodAutoscalerList(String name, Output<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("kubernetes:autoscaling/v2beta1:HorizontalPodAutoscalerList", name, null, makeResourceOptions(options, id));
    }

    private static HorizontalPodAutoscalerListArgs makeArgs(HorizontalPodAutoscalerListArgs args) {
        var builder = args == null ? HorizontalPodAutoscalerListArgs.builder() : HorizontalPodAutoscalerListArgs.builder(args);
        return builder
            .apiVersion("autoscaling/v2beta1")
            .kind("HorizontalPodAutoscalerList")
            .build();
    }

    private static io.pulumi.resources.CustomResourceOptions makeResourceOptions(@Nullable io.pulumi.resources.CustomResourceOptions options, @Nullable Output<String> id) {
        var defaultOptions = io.pulumi.resources.CustomResourceOptions.builder()
            .version(Utilities.getVersion())
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
    public static HorizontalPodAutoscalerList get(String name, Output<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        return new HorizontalPodAutoscalerList(name, id, options);
    }
}
