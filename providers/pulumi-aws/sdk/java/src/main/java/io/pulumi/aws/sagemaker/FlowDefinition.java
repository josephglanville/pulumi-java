// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.sagemaker;

import io.pulumi.aws.Utilities;
import io.pulumi.aws.sagemaker.FlowDefinitionArgs;
import io.pulumi.aws.sagemaker.inputs.FlowDefinitionState;
import io.pulumi.aws.sagemaker.outputs.FlowDefinitionHumanLoopActivationConfig;
import io.pulumi.aws.sagemaker.outputs.FlowDefinitionHumanLoopConfig;
import io.pulumi.aws.sagemaker.outputs.FlowDefinitionHumanLoopRequestSource;
import io.pulumi.aws.sagemaker.outputs.FlowDefinitionOutputConfig;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.Export;
import io.pulumi.core.annotations.ResourceType;
import io.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.Map;
import javax.annotation.Nullable;

/**
 * Provides a Sagemaker Flow Definition resource.
 * 
 * ## Example Usage
 * 
 * ## Import
 * 
 * Sagemaker Flow Definitions can be imported using the `flow_definition_name`, e.g.,
 * 
 * ```sh
 *  $ pulumi import aws:sagemaker/flowDefinition:FlowDefinition example example
 * ```
 * 
 */
@ResourceType(type="aws:sagemaker/flowDefinition:FlowDefinition")
public class FlowDefinition extends io.pulumi.resources.CustomResource {
    /**
     * The Amazon Resource Name (ARN) assigned by AWS to this Flow Definition.
     * 
     */
    @Export(name="arn", type=String.class, parameters={})
    private Output<String> arn;

    /**
     * @return The Amazon Resource Name (ARN) assigned by AWS to this Flow Definition.
     * 
     */
    public Output<String> getArn() {
        return this.arn;
    }
    /**
     * The name of your flow definition.
     * 
     */
    @Export(name="flowDefinitionName", type=String.class, parameters={})
    private Output<String> flowDefinitionName;

    /**
     * @return The name of your flow definition.
     * 
     */
    public Output<String> getFlowDefinitionName() {
        return this.flowDefinitionName;
    }
    /**
     * An object containing information about the events that trigger a human workflow. See Human Loop Activation Config details below.
     * 
     */
    @Export(name="humanLoopActivationConfig", type=FlowDefinitionHumanLoopActivationConfig.class, parameters={})
    private Output</* @Nullable */ FlowDefinitionHumanLoopActivationConfig> humanLoopActivationConfig;

    /**
     * @return An object containing information about the events that trigger a human workflow. See Human Loop Activation Config details below.
     * 
     */
    public Output</* @Nullable */ FlowDefinitionHumanLoopActivationConfig> getHumanLoopActivationConfig() {
        return this.humanLoopActivationConfig;
    }
    /**
     * An object containing information about the tasks the human reviewers will perform. See Human Loop Config details below.
     * 
     */
    @Export(name="humanLoopConfig", type=FlowDefinitionHumanLoopConfig.class, parameters={})
    private Output<FlowDefinitionHumanLoopConfig> humanLoopConfig;

    /**
     * @return An object containing information about the tasks the human reviewers will perform. See Human Loop Config details below.
     * 
     */
    public Output<FlowDefinitionHumanLoopConfig> getHumanLoopConfig() {
        return this.humanLoopConfig;
    }
    /**
     * Container for configuring the source of human task requests. Use to specify if Amazon Rekognition or Amazon Textract is used as an integration source. See Human Loop Request Source details below.
     * 
     */
    @Export(name="humanLoopRequestSource", type=FlowDefinitionHumanLoopRequestSource.class, parameters={})
    private Output</* @Nullable */ FlowDefinitionHumanLoopRequestSource> humanLoopRequestSource;

    /**
     * @return Container for configuring the source of human task requests. Use to specify if Amazon Rekognition or Amazon Textract is used as an integration source. See Human Loop Request Source details below.
     * 
     */
    public Output</* @Nullable */ FlowDefinitionHumanLoopRequestSource> getHumanLoopRequestSource() {
        return this.humanLoopRequestSource;
    }
    /**
     * An object containing information about where the human review results will be uploaded. See Output Config details below.
     * 
     */
    @Export(name="outputConfig", type=FlowDefinitionOutputConfig.class, parameters={})
    private Output<FlowDefinitionOutputConfig> outputConfig;

    /**
     * @return An object containing information about where the human review results will be uploaded. See Output Config details below.
     * 
     */
    public Output<FlowDefinitionOutputConfig> getOutputConfig() {
        return this.outputConfig;
    }
    /**
     * The Amazon Resource Name (ARN) of the role needed to call other services on your behalf.
     * 
     */
    @Export(name="roleArn", type=String.class, parameters={})
    private Output<String> roleArn;

    /**
     * @return The Amazon Resource Name (ARN) of the role needed to call other services on your behalf.
     * 
     */
    public Output<String> getRoleArn() {
        return this.roleArn;
    }
    /**
     * A map of tags to assign to the resource. If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
     * 
     */
    @Export(name="tags", type=Map.class, parameters={String.class, String.class})
    private Output</* @Nullable */ Map<String,String>> tags;

    /**
     * @return A map of tags to assign to the resource. If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
     * 
     */
    public Output</* @Nullable */ Map<String,String>> getTags() {
        return this.tags;
    }
    /**
     * A map of tags assigned to the resource, including those inherited from the provider `default_tags` configuration block.
     * 
     */
    @Export(name="tagsAll", type=Map.class, parameters={String.class, String.class})
    private Output<Map<String,String>> tagsAll;

    /**
     * @return A map of tags assigned to the resource, including those inherited from the provider `default_tags` configuration block.
     * 
     */
    public Output<Map<String,String>> getTagsAll() {
        return this.tagsAll;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public FlowDefinition(String name) {
        this(name, FlowDefinitionArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public FlowDefinition(String name, FlowDefinitionArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public FlowDefinition(String name, FlowDefinitionArgs args, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("aws:sagemaker/flowDefinition:FlowDefinition", name, args == null ? FlowDefinitionArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private FlowDefinition(String name, Output<String> id, @Nullable FlowDefinitionState state, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("aws:sagemaker/flowDefinition:FlowDefinition", name, state, makeResourceOptions(options, id));
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
     * @param state
     * @param options Optional settings to control the behavior of the CustomResource.
     */
    public static FlowDefinition get(String name, Output<String> id, @Nullable FlowDefinitionState state, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        return new FlowDefinition(name, id, state, options);
    }
}
