// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.compute;

import io.pulumi.core.Input;
import io.pulumi.core.Output;
import io.pulumi.core.internal.annotations.OutputExport;
import io.pulumi.core.internal.annotations.ResourceType;
import io.pulumi.gcp.Utilities;
import io.pulumi.gcp.compute.NodeTemplateArgs;
import io.pulumi.gcp.compute.inputs.NodeTemplateState;
import io.pulumi.gcp.compute.outputs.NodeTemplateNodeTypeFlexibility;
import io.pulumi.gcp.compute.outputs.NodeTemplateServerBinding;
import java.lang.String;
import java.util.Map;
import javax.annotation.Nullable;

@ResourceType(type="gcp:compute/nodeTemplate:NodeTemplate")
public class NodeTemplate extends io.pulumi.resources.CustomResource {
    @OutputExport(name="cpuOvercommitType", type=String.class, parameters={})
    private Output</* @Nullable */ String> cpuOvercommitType;

    public Output</* @Nullable */ String> getCpuOvercommitType() {
        return this.cpuOvercommitType;
    }
    @OutputExport(name="creationTimestamp", type=String.class, parameters={})
    private Output<String> creationTimestamp;

    public Output<String> getCreationTimestamp() {
        return this.creationTimestamp;
    }
    @OutputExport(name="description", type=String.class, parameters={})
    private Output</* @Nullable */ String> description;

    public Output</* @Nullable */ String> getDescription() {
        return this.description;
    }
    @OutputExport(name="name", type=String.class, parameters={})
    private Output<String> name;

    public Output<String> getName() {
        return this.name;
    }
    @OutputExport(name="nodeAffinityLabels", type=Map.class, parameters={String.class, String.class})
    private Output</* @Nullable */ Map<String,String>> nodeAffinityLabels;

    public Output</* @Nullable */ Map<String,String>> getNodeAffinityLabels() {
        return this.nodeAffinityLabels;
    }
    @OutputExport(name="nodeType", type=String.class, parameters={})
    private Output</* @Nullable */ String> nodeType;

    public Output</* @Nullable */ String> getNodeType() {
        return this.nodeType;
    }
    @OutputExport(name="nodeTypeFlexibility", type=NodeTemplateNodeTypeFlexibility.class, parameters={})
    private Output</* @Nullable */ NodeTemplateNodeTypeFlexibility> nodeTypeFlexibility;

    public Output</* @Nullable */ NodeTemplateNodeTypeFlexibility> getNodeTypeFlexibility() {
        return this.nodeTypeFlexibility;
    }
    @OutputExport(name="project", type=String.class, parameters={})
    private Output<String> project;

    public Output<String> getProject() {
        return this.project;
    }
    @OutputExport(name="region", type=String.class, parameters={})
    private Output<String> region;

    public Output<String> getRegion() {
        return this.region;
    }
    @OutputExport(name="selfLink", type=String.class, parameters={})
    private Output<String> selfLink;

    public Output<String> getSelfLink() {
        return this.selfLink;
    }
    @OutputExport(name="serverBinding", type=NodeTemplateServerBinding.class, parameters={})
    private Output<NodeTemplateServerBinding> serverBinding;

    public Output<NodeTemplateServerBinding> getServerBinding() {
        return this.serverBinding;
    }

    public NodeTemplate(String name, @Nullable NodeTemplateArgs args, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("gcp:compute/nodeTemplate:NodeTemplate", name, args == null ? NodeTemplateArgs.Empty : args, makeResourceOptions(options, Input.empty()));
    }

    private NodeTemplate(String name, Input<String> id, @Nullable NodeTemplateState state, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("gcp:compute/nodeTemplate:NodeTemplate", name, state, makeResourceOptions(options, id));
    }

    private static io.pulumi.resources.CustomResourceOptions makeResourceOptions(@Nullable io.pulumi.resources.CustomResourceOptions options, @Nullable Input<String> id) {
        var defaultOptions = io.pulumi.resources.CustomResourceOptions.builder()
            .setVersion(Utilities.getVersion())
            .build();
        return io.pulumi.resources.CustomResourceOptions.merge(defaultOptions, options, id);
    }

    public static NodeTemplate get(String name, Input<String> id, @Nullable NodeTemplateState state, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        return new NodeTemplate(name, id, state, options);
    }
}