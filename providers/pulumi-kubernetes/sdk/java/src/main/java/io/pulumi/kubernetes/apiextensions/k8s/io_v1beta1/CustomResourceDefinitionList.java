// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.kubernetes.apiextensions.k8s.io_v1beta1;

import io.pulumi.core.Input;
import io.pulumi.core.Output;
import io.pulumi.core.internal.annotations.OutputExport;
import io.pulumi.core.internal.annotations.ResourceType;
import io.pulumi.kubernetes.Utilities;
import io.pulumi.kubernetes.apiextensions.k8s.io_v1beta1.CustomResourceDefinitionListArgs;
import io.pulumi.kubernetes.apiextensions.k8s.io_v1beta1.outputs.CustomResourceDefinition;
import io.pulumi.kubernetes.meta_v1.outputs.ListMeta;
import java.lang.String;
import java.util.List;
import javax.annotation.Nullable;

@ResourceType(type="kubernetes:apiextensions.k8s.io/v1beta1:CustomResourceDefinitionList")
public class CustomResourceDefinitionList extends io.pulumi.resources.CustomResource {
    @OutputExport(name="apiVersion", type=String.class, parameters={})
    private Output</* @Nullable */ String> apiVersion;

    public Output</* @Nullable */ String> getApiVersion() {
        return this.apiVersion;
    }
    @OutputExport(name="items", type=List.class, parameters={CustomResourceDefinition.class})
    private Output<List<CustomResourceDefinition>> items;

    public Output<List<CustomResourceDefinition>> getItems() {
        return this.items;
    }
    @OutputExport(name="kind", type=String.class, parameters={})
    private Output</* @Nullable */ String> kind;

    public Output</* @Nullable */ String> getKind() {
        return this.kind;
    }
    @OutputExport(name="metadata", type=ListMeta.class, parameters={})
    private Output</* @Nullable */ ListMeta> metadata;

    public Output</* @Nullable */ ListMeta> getMetadata() {
        return this.metadata;
    }

    public CustomResourceDefinitionList(String name, CustomResourceDefinitionListArgs args, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("kubernetes:apiextensions.k8s.io/v1beta1:CustomResourceDefinitionList", name, makeArgs(args), makeResourceOptions(options, Input.empty()));
    }

    private CustomResourceDefinitionList(String name, Input<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("kubernetes:apiextensions.k8s.io/v1beta1:CustomResourceDefinitionList", name, null, makeResourceOptions(options, id));
    }

    private static CustomResourceDefinitionListArgs makeArgs(CustomResourceDefinitionListArgs args) {
        var builder = args == null ? CustomResourceDefinitionListArgs.builder() : CustomResourceDefinitionListArgs.builder(args);
        return builder
            .setApiVersion("apiextensions.k8s.io/v1beta1")
            .setKind("CustomResourceDefinitionList")
            .build();
    }

    private static io.pulumi.resources.CustomResourceOptions makeResourceOptions(@Nullable io.pulumi.resources.CustomResourceOptions options, @Nullable Input<String> id) {
        var defaultOptions = io.pulumi.resources.CustomResourceOptions.builder()
            .setVersion(Utilities.getVersion())
            .build();
        return io.pulumi.resources.CustomResourceOptions.merge(defaultOptions, options, id);
    }

    public static CustomResourceDefinitionList get(String name, Input<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        return new CustomResourceDefinitionList(name, id, options);
    }
}
