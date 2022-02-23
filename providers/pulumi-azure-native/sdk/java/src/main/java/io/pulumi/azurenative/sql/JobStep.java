// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.sql;

import io.pulumi.azurenative.Utilities;
import io.pulumi.azurenative.sql.JobStepArgs;
import io.pulumi.azurenative.sql.outputs.JobStepActionResponse;
import io.pulumi.azurenative.sql.outputs.JobStepExecutionOptionsResponse;
import io.pulumi.azurenative.sql.outputs.JobStepOutputResponse;
import io.pulumi.core.Alias;
import io.pulumi.core.Input;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.OutputExport;
import io.pulumi.core.annotations.ResourceType;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import javax.annotation.Nullable;

/**
 * A job step.
 * API Version: 2020-11-01-preview.
 * 
 * ## Example Usage
 * 
 * ## Import
 * 
 * An existing resource can be imported using its type token, name, and identifier, e.g.
 * 
 * ```sh
 * $ pulumi import azure-native:sql:JobStep step1 /subscriptions/00000000-1111-2222-3333-444444444444/resourceGroups/group1/providers/Microsoft.Sql/servers/server1/jobAgents/agent1/jobs/job1/steps/step1 
 * ```
 * 
 */
@ResourceType(type="azure-native:sql:JobStep")
public class JobStep extends io.pulumi.resources.CustomResource {
    /**
     * The action payload of the job step.
     * 
     */
    @OutputExport(name="action", type=JobStepActionResponse.class, parameters={})
    private Output<JobStepActionResponse> action;

    /**
     * @return The action payload of the job step.
     * 
     */
    public Output<JobStepActionResponse> getAction() {
        return this.action;
    }
    /**
     * The resource ID of the job credential that will be used to connect to the targets.
     * 
     */
    @OutputExport(name="credential", type=String.class, parameters={})
    private Output<String> credential;

    /**
     * @return The resource ID of the job credential that will be used to connect to the targets.
     * 
     */
    public Output<String> getCredential() {
        return this.credential;
    }
    /**
     * Execution options for the job step.
     * 
     */
    @OutputExport(name="executionOptions", type=JobStepExecutionOptionsResponse.class, parameters={})
    private Output</* @Nullable */ JobStepExecutionOptionsResponse> executionOptions;

    /**
     * @return Execution options for the job step.
     * 
     */
    public Output</* @Nullable */ JobStepExecutionOptionsResponse> getExecutionOptions() {
        return this.executionOptions;
    }
    /**
     * Resource name.
     * 
     */
    @OutputExport(name="name", type=String.class, parameters={})
    private Output<String> name;

    /**
     * @return Resource name.
     * 
     */
    public Output<String> getName() {
        return this.name;
    }
    /**
     * Output destination properties of the job step.
     * 
     */
    @OutputExport(name="output", type=JobStepOutputResponse.class, parameters={})
    private Output</* @Nullable */ JobStepOutputResponse> output;

    /**
     * @return Output destination properties of the job step.
     * 
     */
    public Output</* @Nullable */ JobStepOutputResponse> getOutput() {
        return this.output;
    }
    /**
     * The job step's index within the job. If not specified when creating the job step, it will be created as the last step. If not specified when updating the job step, the step id is not modified.
     * 
     */
    @OutputExport(name="stepId", type=Integer.class, parameters={})
    private Output</* @Nullable */ Integer> stepId;

    /**
     * @return The job step's index within the job. If not specified when creating the job step, it will be created as the last step. If not specified when updating the job step, the step id is not modified.
     * 
     */
    public Output</* @Nullable */ Integer> getStepId() {
        return this.stepId;
    }
    /**
     * The resource ID of the target group that the job step will be executed on.
     * 
     */
    @OutputExport(name="targetGroup", type=String.class, parameters={})
    private Output<String> targetGroup;

    /**
     * @return The resource ID of the target group that the job step will be executed on.
     * 
     */
    public Output<String> getTargetGroup() {
        return this.targetGroup;
    }
    /**
     * Resource type.
     * 
     */
    @OutputExport(name="type", type=String.class, parameters={})
    private Output<String> type;

    /**
     * @return Resource type.
     * 
     */
    public Output<String> getType() {
        return this.type;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public JobStep(String name) {
        this(name, JobStepArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public JobStep(String name, JobStepArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public JobStep(String name, JobStepArgs args, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("azure-native:sql:JobStep", name, args == null ? JobStepArgs.Empty : args, makeResourceOptions(options, Input.empty()));
    }

    private JobStep(String name, Input<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("azure-native:sql:JobStep", name, null, makeResourceOptions(options, id));
    }

    private static io.pulumi.resources.CustomResourceOptions makeResourceOptions(@Nullable io.pulumi.resources.CustomResourceOptions options, @Nullable Input<String> id) {
        var defaultOptions = io.pulumi.resources.CustomResourceOptions.builder()
            .setVersion(Utilities.getVersion())
            .setAliases(List.of(
                Input.of(Alias.builder().setType("azure-native:sql/v20170301preview:JobStep").build()),
                Input.of(Alias.builder().setType("azure-native:sql/v20200202preview:JobStep").build()),
                Input.of(Alias.builder().setType("azure-native:sql/v20200801preview:JobStep").build()),
                Input.of(Alias.builder().setType("azure-native:sql/v20201101preview:JobStep").build()),
                Input.of(Alias.builder().setType("azure-native:sql/v20210201preview:JobStep").build()),
                Input.of(Alias.builder().setType("azure-native:sql/v20210501preview:JobStep").build()),
                Input.of(Alias.builder().setType("azure-native:sql/v20210801preview:JobStep").build())
            ))
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
    public static JobStep get(String name, Input<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        return new JobStep(name, id, options);
    }
}
