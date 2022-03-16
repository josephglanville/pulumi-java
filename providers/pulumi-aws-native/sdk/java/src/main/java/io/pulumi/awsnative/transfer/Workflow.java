// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.transfer;

import io.pulumi.awsnative.Utilities;
import io.pulumi.awsnative.transfer.WorkflowArgs;
import io.pulumi.awsnative.transfer.outputs.WorkflowStep;
import io.pulumi.awsnative.transfer.outputs.WorkflowTag;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.Export;
import io.pulumi.core.annotations.ResourceType;
import java.lang.String;
import java.util.List;
import javax.annotation.Nullable;

/**
 * Resource Type definition for AWS::Transfer::Workflow
 * 
 */
@ResourceType(type="aws-native:transfer:Workflow")
public class Workflow extends io.pulumi.resources.CustomResource {
    /**
     * Specifies the unique Amazon Resource Name (ARN) for the workflow.
     * 
     */
    @Export(name="arn", type=String.class, parameters={})
    private Output<String> arn;

    /**
     * @return Specifies the unique Amazon Resource Name (ARN) for the workflow.
     * 
     */
    public Output<String> getArn() {
        return this.arn;
    }
    /**
     * A textual description for the workflow.
     * 
     */
    @Export(name="description", type=String.class, parameters={})
    private Output</* @Nullable */ String> description;

    /**
     * @return A textual description for the workflow.
     * 
     */
    public Output</* @Nullable */ String> getDescription() {
        return this.description;
    }
    /**
     * Specifies the steps (actions) to take if any errors are encountered during execution of the workflow.
     * 
     */
    @Export(name="onExceptionSteps", type=List.class, parameters={WorkflowStep.class})
    private Output</* @Nullable */ List<WorkflowStep>> onExceptionSteps;

    /**
     * @return Specifies the steps (actions) to take if any errors are encountered during execution of the workflow.
     * 
     */
    public Output</* @Nullable */ List<WorkflowStep>> getOnExceptionSteps() {
        return this.onExceptionSteps;
    }
    /**
     * Specifies the details for the steps that are in the specified workflow.
     * 
     */
    @Export(name="steps", type=List.class, parameters={WorkflowStep.class})
    private Output<List<WorkflowStep>> steps;

    /**
     * @return Specifies the details for the steps that are in the specified workflow.
     * 
     */
    public Output<List<WorkflowStep>> getSteps() {
        return this.steps;
    }
    /**
     * Key-value pairs that can be used to group and search for workflows. Tags are metadata attached to workflows for any purpose.
     * 
     */
    @Export(name="tags", type=List.class, parameters={WorkflowTag.class})
    private Output</* @Nullable */ List<WorkflowTag>> tags;

    /**
     * @return Key-value pairs that can be used to group and search for workflows. Tags are metadata attached to workflows for any purpose.
     * 
     */
    public Output</* @Nullable */ List<WorkflowTag>> getTags() {
        return this.tags;
    }
    /**
     * A unique identifier for the workflow.
     * 
     */
    @Export(name="workflowId", type=String.class, parameters={})
    private Output<String> workflowId;

    /**
     * @return A unique identifier for the workflow.
     * 
     */
    public Output<String> getWorkflowId() {
        return this.workflowId;
    }

    public interface BuilderApplicator {
        public void apply(WorkflowArgs.Builder a);
    }
    private static io.pulumi.awsnative.transfer.WorkflowArgs buildArgs(BuilderApplicator argsBuilder) {
        final var builder = io.pulumi.awsnative.transfer.WorkflowArgs.builder();
        argsBuilder.apply(builder);
        return builder.build();
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param argsBuilder A function that configures a passed builder.
     */
    public Workflow(String name, BuilderApplicator argsBuilder) {
        this(name, buildArgs(argsBuilder), null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public Workflow(String name) {
        this(name, WorkflowArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public Workflow(String name, WorkflowArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public Workflow(String name, WorkflowArgs args, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("aws-native:transfer:Workflow", name, args == null ? WorkflowArgs.Empty : args, makeResourceOptions(options, Output.empty()));
    }

    private Workflow(String name, Output<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("aws-native:transfer:Workflow", name, null, makeResourceOptions(options, id));
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
    public static Workflow get(String name, Output<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        return new Workflow(name, id, options);
    }
}
