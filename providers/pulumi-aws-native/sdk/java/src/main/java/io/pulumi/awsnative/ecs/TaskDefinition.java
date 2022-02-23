// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.ecs;

import io.pulumi.awsnative.Utilities;
import io.pulumi.awsnative.ecs.TaskDefinitionArgs;
import io.pulumi.awsnative.ecs.outputs.TaskDefinitionContainerDefinition;
import io.pulumi.awsnative.ecs.outputs.TaskDefinitionEphemeralStorage;
import io.pulumi.awsnative.ecs.outputs.TaskDefinitionInferenceAccelerator;
import io.pulumi.awsnative.ecs.outputs.TaskDefinitionPlacementConstraint;
import io.pulumi.awsnative.ecs.outputs.TaskDefinitionProxyConfiguration;
import io.pulumi.awsnative.ecs.outputs.TaskDefinitionRuntimePlatform;
import io.pulumi.awsnative.ecs.outputs.TaskDefinitionTag;
import io.pulumi.awsnative.ecs.outputs.TaskDefinitionVolume;
import io.pulumi.core.Input;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.OutputExport;
import io.pulumi.core.annotations.ResourceType;
import java.lang.String;
import java.util.List;
import javax.annotation.Nullable;

/**
 * Resource Schema describing various properties for ECS TaskDefinition
 * 
 * ## Example Usage
 * 
 */
@ResourceType(type="aws-native:ecs:TaskDefinition")
public class TaskDefinition extends io.pulumi.resources.CustomResource {
    @OutputExport(name="containerDefinitions", type=List.class, parameters={TaskDefinitionContainerDefinition.class})
    private Output</* @Nullable */ List<TaskDefinitionContainerDefinition>> containerDefinitions;

    public Output</* @Nullable */ List<TaskDefinitionContainerDefinition>> getContainerDefinitions() {
        return this.containerDefinitions;
    }
    @OutputExport(name="cpu", type=String.class, parameters={})
    private Output</* @Nullable */ String> cpu;

    public Output</* @Nullable */ String> getCpu() {
        return this.cpu;
    }
    @OutputExport(name="ephemeralStorage", type=TaskDefinitionEphemeralStorage.class, parameters={})
    private Output</* @Nullable */ TaskDefinitionEphemeralStorage> ephemeralStorage;

    public Output</* @Nullable */ TaskDefinitionEphemeralStorage> getEphemeralStorage() {
        return this.ephemeralStorage;
    }
    @OutputExport(name="executionRoleArn", type=String.class, parameters={})
    private Output</* @Nullable */ String> executionRoleArn;

    public Output</* @Nullable */ String> getExecutionRoleArn() {
        return this.executionRoleArn;
    }
    @OutputExport(name="family", type=String.class, parameters={})
    private Output</* @Nullable */ String> family;

    public Output</* @Nullable */ String> getFamily() {
        return this.family;
    }
    @OutputExport(name="inferenceAccelerators", type=List.class, parameters={TaskDefinitionInferenceAccelerator.class})
    private Output</* @Nullable */ List<TaskDefinitionInferenceAccelerator>> inferenceAccelerators;

    public Output</* @Nullable */ List<TaskDefinitionInferenceAccelerator>> getInferenceAccelerators() {
        return this.inferenceAccelerators;
    }
    @OutputExport(name="ipcMode", type=String.class, parameters={})
    private Output</* @Nullable */ String> ipcMode;

    public Output</* @Nullable */ String> getIpcMode() {
        return this.ipcMode;
    }
    @OutputExport(name="memory", type=String.class, parameters={})
    private Output</* @Nullable */ String> memory;

    public Output</* @Nullable */ String> getMemory() {
        return this.memory;
    }
    @OutputExport(name="networkMode", type=String.class, parameters={})
    private Output</* @Nullable */ String> networkMode;

    public Output</* @Nullable */ String> getNetworkMode() {
        return this.networkMode;
    }
    @OutputExport(name="pidMode", type=String.class, parameters={})
    private Output</* @Nullable */ String> pidMode;

    public Output</* @Nullable */ String> getPidMode() {
        return this.pidMode;
    }
    @OutputExport(name="placementConstraints", type=List.class, parameters={TaskDefinitionPlacementConstraint.class})
    private Output</* @Nullable */ List<TaskDefinitionPlacementConstraint>> placementConstraints;

    public Output</* @Nullable */ List<TaskDefinitionPlacementConstraint>> getPlacementConstraints() {
        return this.placementConstraints;
    }
    @OutputExport(name="proxyConfiguration", type=TaskDefinitionProxyConfiguration.class, parameters={})
    private Output</* @Nullable */ TaskDefinitionProxyConfiguration> proxyConfiguration;

    public Output</* @Nullable */ TaskDefinitionProxyConfiguration> getProxyConfiguration() {
        return this.proxyConfiguration;
    }
    @OutputExport(name="requiresCompatibilities", type=List.class, parameters={String.class})
    private Output</* @Nullable */ List<String>> requiresCompatibilities;

    public Output</* @Nullable */ List<String>> getRequiresCompatibilities() {
        return this.requiresCompatibilities;
    }
    @OutputExport(name="runtimePlatform", type=TaskDefinitionRuntimePlatform.class, parameters={})
    private Output</* @Nullable */ TaskDefinitionRuntimePlatform> runtimePlatform;

    public Output</* @Nullable */ TaskDefinitionRuntimePlatform> getRuntimePlatform() {
        return this.runtimePlatform;
    }
    @OutputExport(name="tags", type=List.class, parameters={TaskDefinitionTag.class})
    private Output</* @Nullable */ List<TaskDefinitionTag>> tags;

    public Output</* @Nullable */ List<TaskDefinitionTag>> getTags() {
        return this.tags;
    }
    /**
     * The Amazon Resource Name (ARN) of the Amazon ECS task definition
     * 
     */
    @OutputExport(name="taskDefinitionArn", type=String.class, parameters={})
    private Output<String> taskDefinitionArn;

    /**
     * @return The Amazon Resource Name (ARN) of the Amazon ECS task definition
     * 
     */
    public Output<String> getTaskDefinitionArn() {
        return this.taskDefinitionArn;
    }
    @OutputExport(name="taskRoleArn", type=String.class, parameters={})
    private Output</* @Nullable */ String> taskRoleArn;

    public Output</* @Nullable */ String> getTaskRoleArn() {
        return this.taskRoleArn;
    }
    @OutputExport(name="volumes", type=List.class, parameters={TaskDefinitionVolume.class})
    private Output</* @Nullable */ List<TaskDefinitionVolume>> volumes;

    public Output</* @Nullable */ List<TaskDefinitionVolume>> getVolumes() {
        return this.volumes;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public TaskDefinition(String name) {
        this(name, TaskDefinitionArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public TaskDefinition(String name, @Nullable TaskDefinitionArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public TaskDefinition(String name, @Nullable TaskDefinitionArgs args, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("aws-native:ecs:TaskDefinition", name, args == null ? TaskDefinitionArgs.Empty : args, makeResourceOptions(options, Input.empty()));
    }

    private TaskDefinition(String name, Input<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("aws-native:ecs:TaskDefinition", name, null, makeResourceOptions(options, id));
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
    public static TaskDefinition get(String name, Input<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        return new TaskDefinition(name, id, options);
    }
}
