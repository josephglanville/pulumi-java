// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.kubernetes.scheduling.k8s.io_v1alpha1;

import io.pulumi.core.Input;
import io.pulumi.core.Output;
import io.pulumi.core.internal.annotations.OutputExport;
import io.pulumi.core.internal.annotations.ResourceType;
import io.pulumi.kubernetes.Utilities;
import io.pulumi.kubernetes.meta_v1.outputs.ListMeta;
import io.pulumi.kubernetes.scheduling.k8s.io_v1alpha1.PriorityClassListArgs;
import io.pulumi.kubernetes.scheduling.k8s.io_v1alpha1.outputs.PriorityClass;
import java.lang.String;
import java.util.List;
import javax.annotation.Nullable;

@ResourceType(type="kubernetes:scheduling.k8s.io/v1alpha1:PriorityClassList")
public class PriorityClassList extends io.pulumi.resources.CustomResource {
    @OutputExport(name="apiVersion", type=String.class, parameters={})
    private Output</* @Nullable */ String> apiVersion;

    public Output</* @Nullable */ String> getApiVersion() {
        return this.apiVersion;
    }
    @OutputExport(name="items", type=List.class, parameters={PriorityClass.class})
    private Output<List<PriorityClass>> items;

    public Output<List<PriorityClass>> getItems() {
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

    public PriorityClassList(String name, PriorityClassListArgs args, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("kubernetes:scheduling.k8s.io/v1alpha1:PriorityClassList", name, makeArgs(args), makeResourceOptions(options, Input.empty()));
    }

    private PriorityClassList(String name, Input<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("kubernetes:scheduling.k8s.io/v1alpha1:PriorityClassList", name, null, makeResourceOptions(options, id));
    }

    private static PriorityClassListArgs makeArgs(PriorityClassListArgs args) {
        var builder = args == null ? PriorityClassListArgs.builder() : PriorityClassListArgs.builder(args);
        return builder
            .setApiVersion("scheduling.k8s.io/v1alpha1")
            .setKind("PriorityClassList")
            .build();
    }

    private static io.pulumi.resources.CustomResourceOptions makeResourceOptions(@Nullable io.pulumi.resources.CustomResourceOptions options, @Nullable Input<String> id) {
        var defaultOptions = io.pulumi.resources.CustomResourceOptions.builder()
            .setVersion(Utilities.getVersion())
            .build();
        return io.pulumi.resources.CustomResourceOptions.merge(defaultOptions, options, id);
    }

    public static PriorityClassList get(String name, Input<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        return new PriorityClassList(name, id, options);
    }
}
