// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.kubernetes.flowcontrol.apiserver.k8s.io_v1beta2;

import io.pulumi.core.Input;
import io.pulumi.core.Output;
import io.pulumi.core.internal.annotations.OutputExport;
import io.pulumi.core.internal.annotations.ResourceType;
import io.pulumi.kubernetes.Utilities;
import io.pulumi.kubernetes.flowcontrol.apiserver.k8s.io_v1beta2.PriorityLevelConfigurationListArgs;
import io.pulumi.kubernetes.flowcontrol.apiserver.k8s.io_v1beta2.outputs.PriorityLevelConfiguration;
import io.pulumi.kubernetes.meta_v1.outputs.ListMeta;
import java.lang.String;
import java.util.List;
import javax.annotation.Nullable;

@ResourceType(type="kubernetes:flowcontrol.apiserver.k8s.io/v1beta2:PriorityLevelConfigurationList")
public class PriorityLevelConfigurationList extends io.pulumi.resources.CustomResource {
    @OutputExport(name="apiVersion", type=String.class, parameters={})
    private Output</* @Nullable */ String> apiVersion;

    public Output</* @Nullable */ String> getApiVersion() {
        return this.apiVersion;
    }
    @OutputExport(name="items", type=List.class, parameters={PriorityLevelConfiguration.class})
    private Output<List<PriorityLevelConfiguration>> items;

    public Output<List<PriorityLevelConfiguration>> getItems() {
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

    public PriorityLevelConfigurationList(String name, PriorityLevelConfigurationListArgs args, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("kubernetes:flowcontrol.apiserver.k8s.io/v1beta2:PriorityLevelConfigurationList", name, makeArgs(args), makeResourceOptions(options, Input.empty()));
    }

    private PriorityLevelConfigurationList(String name, Input<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("kubernetes:flowcontrol.apiserver.k8s.io/v1beta2:PriorityLevelConfigurationList", name, null, makeResourceOptions(options, id));
    }

    private static PriorityLevelConfigurationListArgs makeArgs(PriorityLevelConfigurationListArgs args) {
        var builder = args == null ? PriorityLevelConfigurationListArgs.builder() : PriorityLevelConfigurationListArgs.builder(args);
        return builder
            .setApiVersion("flowcontrol.apiserver.k8s.io/v1beta2")
            .setKind("PriorityLevelConfigurationList")
            .build();
    }

    private static io.pulumi.resources.CustomResourceOptions makeResourceOptions(@Nullable io.pulumi.resources.CustomResourceOptions options, @Nullable Input<String> id) {
        var defaultOptions = io.pulumi.resources.CustomResourceOptions.builder()
            .setVersion(Utilities.getVersion())
            .build();
        return io.pulumi.resources.CustomResourceOptions.merge(defaultOptions, options, id);
    }

    public static PriorityLevelConfigurationList get(String name, Input<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        return new PriorityLevelConfigurationList(name, id, options);
    }
}
