// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.ssm;

import io.pulumi.aws.Utilities;
import io.pulumi.aws.ssm.MaintenanceWindowTaskArgs;
import io.pulumi.aws.ssm.inputs.MaintenanceWindowTaskState;
import io.pulumi.aws.ssm.outputs.MaintenanceWindowTaskTarget;
import io.pulumi.aws.ssm.outputs.MaintenanceWindowTaskTaskInvocationParameters;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.Export;
import io.pulumi.core.annotations.ResourceType;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import javax.annotation.Nullable;

/**
 * Provides an SSM Maintenance Window Task resource
 * 
 * ## Example Usage
 * 
 * ## Import
 * 
 * AWS Maintenance Window Task can be imported using the `window_id` and `window_task_id` separated by `/`.
 * 
 * ```sh
 *  $ pulumi import aws:ssm/maintenanceWindowTask:MaintenanceWindowTask task <window_id>/<window_task_id>
 * ```
 * 
 */
@ResourceType(type="aws:ssm/maintenanceWindowTask:MaintenanceWindowTask")
public class MaintenanceWindowTask extends io.pulumi.resources.CustomResource {
    /**
     * The description of the maintenance window task.
     * 
     */
    @Export(name="description", type=String.class, parameters={})
    private Output</* @Nullable */ String> description;

    /**
     * @return The description of the maintenance window task.
     * 
     */
    public Output</* @Nullable */ String> getDescription() {
        return this.description;
    }
    /**
     * The maximum number of targets this task can be run for in parallel.
     * 
     */
    @Export(name="maxConcurrency", type=String.class, parameters={})
    private Output<String> maxConcurrency;

    /**
     * @return The maximum number of targets this task can be run for in parallel.
     * 
     */
    public Output<String> getMaxConcurrency() {
        return this.maxConcurrency;
    }
    /**
     * The maximum number of errors allowed before this task stops being scheduled.
     * 
     */
    @Export(name="maxErrors", type=String.class, parameters={})
    private Output<String> maxErrors;

    /**
     * @return The maximum number of errors allowed before this task stops being scheduled.
     * 
     */
    public Output<String> getMaxErrors() {
        return this.maxErrors;
    }
    /**
     * The name of the maintenance window task.
     * 
     */
    @Export(name="name", type=String.class, parameters={})
    private Output<String> name;

    /**
     * @return The name of the maintenance window task.
     * 
     */
    public Output<String> getName() {
        return this.name;
    }
    /**
     * The priority of the task in the Maintenance Window, the lower the number the higher the priority. Tasks in a Maintenance Window are scheduled in priority order with tasks that have the same priority scheduled in parallel.
     * 
     */
    @Export(name="priority", type=Integer.class, parameters={})
    private Output</* @Nullable */ Integer> priority;

    /**
     * @return The priority of the task in the Maintenance Window, the lower the number the higher the priority. Tasks in a Maintenance Window are scheduled in priority order with tasks that have the same priority scheduled in parallel.
     * 
     */
    public Output</* @Nullable */ Integer> getPriority() {
        return this.priority;
    }
    /**
     * The role that should be assumed when executing the task. If a role is not provided, Systems Manager uses your account's service-linked role. If no service-linked role for Systems Manager exists in your account, it is created for you.
     * 
     */
    @Export(name="serviceRoleArn", type=String.class, parameters={})
    private Output<String> serviceRoleArn;

    /**
     * @return The role that should be assumed when executing the task. If a role is not provided, Systems Manager uses your account's service-linked role. If no service-linked role for Systems Manager exists in your account, it is created for you.
     * 
     */
    public Output<String> getServiceRoleArn() {
        return this.serviceRoleArn;
    }
    /**
     * The targets (either instances or window target ids). Instances are specified using Key=InstanceIds,Values=instanceid1,instanceid2. Window target ids are specified using Key=WindowTargetIds,Values=window target id1, window target id2.
     * 
     */
    @Export(name="targets", type=List.class, parameters={MaintenanceWindowTaskTarget.class})
    private Output</* @Nullable */ List<MaintenanceWindowTaskTarget>> targets;

    /**
     * @return The targets (either instances or window target ids). Instances are specified using Key=InstanceIds,Values=instanceid1,instanceid2. Window target ids are specified using Key=WindowTargetIds,Values=window target id1, window target id2.
     * 
     */
    public Output</* @Nullable */ List<MaintenanceWindowTaskTarget>> getTargets() {
        return this.targets;
    }
    /**
     * The ARN of the task to execute.
     * 
     */
    @Export(name="taskArn", type=String.class, parameters={})
    private Output<String> taskArn;

    /**
     * @return The ARN of the task to execute.
     * 
     */
    public Output<String> getTaskArn() {
        return this.taskArn;
    }
    /**
     * Configuration block with parameters for task execution.
     * 
     */
    @Export(name="taskInvocationParameters", type=MaintenanceWindowTaskTaskInvocationParameters.class, parameters={})
    private Output</* @Nullable */ MaintenanceWindowTaskTaskInvocationParameters> taskInvocationParameters;

    /**
     * @return Configuration block with parameters for task execution.
     * 
     */
    public Output</* @Nullable */ MaintenanceWindowTaskTaskInvocationParameters> getTaskInvocationParameters() {
        return this.taskInvocationParameters;
    }
    /**
     * The type of task being registered. Valid values: `AUTOMATION`, `LAMBDA`, `RUN_COMMAND` or `STEP_FUNCTIONS`.
     * 
     */
    @Export(name="taskType", type=String.class, parameters={})
    private Output<String> taskType;

    /**
     * @return The type of task being registered. Valid values: `AUTOMATION`, `LAMBDA`, `RUN_COMMAND` or `STEP_FUNCTIONS`.
     * 
     */
    public Output<String> getTaskType() {
        return this.taskType;
    }
    /**
     * The Id of the maintenance window to register the task with.
     * 
     */
    @Export(name="windowId", type=String.class, parameters={})
    private Output<String> windowId;

    /**
     * @return The Id of the maintenance window to register the task with.
     * 
     */
    public Output<String> getWindowId() {
        return this.windowId;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public MaintenanceWindowTask(String name) {
        this(name, MaintenanceWindowTaskArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public MaintenanceWindowTask(String name, MaintenanceWindowTaskArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public MaintenanceWindowTask(String name, MaintenanceWindowTaskArgs args, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("aws:ssm/maintenanceWindowTask:MaintenanceWindowTask", name, args == null ? MaintenanceWindowTaskArgs.Empty : args, makeResourceOptions(options, Output.empty()));
    }

    private MaintenanceWindowTask(String name, Output<String> id, @Nullable MaintenanceWindowTaskState state, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("aws:ssm/maintenanceWindowTask:MaintenanceWindowTask", name, state, makeResourceOptions(options, id));
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
    public static MaintenanceWindowTask get(String name, Output<String> id, @Nullable MaintenanceWindowTaskState state, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        return new MaintenanceWindowTask(name, id, state, options);
    }
}