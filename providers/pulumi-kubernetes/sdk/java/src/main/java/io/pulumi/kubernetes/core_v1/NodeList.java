// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.kubernetes.core_v1;

import io.pulumi.core.Input;
import io.pulumi.core.Output;
import io.pulumi.core.internal.annotations.OutputExport;
import io.pulumi.core.internal.annotations.ResourceType;
import io.pulumi.kubernetes.Utilities;
import io.pulumi.kubernetes.core_v1.NodeListArgs;
import io.pulumi.kubernetes.core_v1.outputs.Node;
import io.pulumi.kubernetes.meta_v1.outputs.ListMeta;
import java.lang.String;
import java.util.List;
import javax.annotation.Nullable;

@ResourceType(type="kubernetes:core/v1:NodeList")
public class NodeList extends io.pulumi.resources.CustomResource {
    @OutputExport(name="apiVersion", type=String.class, parameters={})
    private Output</* @Nullable */ String> apiVersion;

    public Output</* @Nullable */ String> getApiVersion() {
        return this.apiVersion;
    }
    @OutputExport(name="items", type=List.class, parameters={Node.class})
    private Output<List<Node>> items;

    public Output<List<Node>> getItems() {
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

    public NodeList(String name, NodeListArgs args, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("kubernetes:core/v1:NodeList", name, makeArgs(args), makeResourceOptions(options, Input.empty()));
    }

    private NodeList(String name, Input<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("kubernetes:core/v1:NodeList", name, null, makeResourceOptions(options, id));
    }

    private static NodeListArgs makeArgs(NodeListArgs args) {
        var builder = args == null ? NodeListArgs.builder() : NodeListArgs.builder(args);
        return builder
            .setApiVersion("v1")
            .setKind("NodeList")
            .build();
    }

    private static io.pulumi.resources.CustomResourceOptions makeResourceOptions(@Nullable io.pulumi.resources.CustomResourceOptions options, @Nullable Input<String> id) {
        var defaultOptions = io.pulumi.resources.CustomResourceOptions.builder()
            .setVersion(Utilities.getVersion())
            .build();
        return io.pulumi.resources.CustomResourceOptions.merge(defaultOptions, options, id);
    }

    public static NodeList get(String name, Input<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        return new NodeList(name, id, options);
    }
}
