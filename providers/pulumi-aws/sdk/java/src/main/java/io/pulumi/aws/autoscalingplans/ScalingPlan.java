// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.autoscalingplans;

import io.pulumi.aws.Utilities;
import io.pulumi.aws.autoscalingplans.ScalingPlanArgs;
import io.pulumi.aws.autoscalingplans.inputs.ScalingPlanState;
import io.pulumi.aws.autoscalingplans.outputs.ScalingPlanApplicationSource;
import io.pulumi.aws.autoscalingplans.outputs.ScalingPlanScalingInstruction;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.Export;
import io.pulumi.core.annotations.ResourceType;
import io.pulumi.core.internal.Codegen;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import javax.annotation.Nullable;

/**
 * Manages an AWS Auto Scaling scaling plan.
 * More information can be found in the [AWS Auto Scaling User Guide](https://docs.aws.amazon.com/autoscaling/plans/userguide/what-is-aws-auto-scaling.html).
 * 
 * > **NOTE:** The AWS Auto Scaling service uses an AWS IAM service-linked role to manage predictive scaling of Amazon EC2 Auto Scaling groups. The service attempts to automatically create this role the first time a scaling plan with predictive scaling enabled is created.
 * An `aws.iam.ServiceLinkedRole` resource can be used to manually manage this role.
 * See the [AWS documentation](https://docs.aws.amazon.com/autoscaling/plans/userguide/aws-auto-scaling-service-linked-roles.html#create-service-linked-role-manual) for more details.
 * 
 * ## Example Usage
 * 
 * ## Import
 * 
 * Auto Scaling scaling plans can be imported using the `name`, e.g.,
 * 
 * ```sh
 *  $ pulumi import aws:autoscalingplans/scalingPlan:ScalingPlan example MyScale1
 * ```
 * 
 */
@ResourceType(type="aws:autoscalingplans/scalingPlan:ScalingPlan")
public class ScalingPlan extends io.pulumi.resources.CustomResource {
    /**
     * A CloudFormation stack or set of tags. You can create one scaling plan per application source.
     * 
     */
    @Export(name="applicationSource", type=ScalingPlanApplicationSource.class, parameters={})
    private Output<ScalingPlanApplicationSource> applicationSource;

    /**
     * @return A CloudFormation stack or set of tags. You can create one scaling plan per application source.
     * 
     */
    public Output<ScalingPlanApplicationSource> getApplicationSource() {
        return this.applicationSource;
    }
    /**
     * The name of the scaling plan. Names cannot contain vertical bars, colons, or forward slashes.
     * 
     */
    @Export(name="name", type=String.class, parameters={})
    private Output<String> name;

    /**
     * @return The name of the scaling plan. Names cannot contain vertical bars, colons, or forward slashes.
     * 
     */
    public Output<String> getName() {
        return this.name;
    }
    /**
     * The scaling instructions. More details can be found in the [AWS Auto Scaling API Reference](https://docs.aws.amazon.com/autoscaling/plans/APIReference/API_ScalingInstruction.html).
     * 
     */
    @Export(name="scalingInstructions", type=List.class, parameters={ScalingPlanScalingInstruction.class})
    private Output<List<ScalingPlanScalingInstruction>> scalingInstructions;

    /**
     * @return The scaling instructions. More details can be found in the [AWS Auto Scaling API Reference](https://docs.aws.amazon.com/autoscaling/plans/APIReference/API_ScalingInstruction.html).
     * 
     */
    public Output<List<ScalingPlanScalingInstruction>> getScalingInstructions() {
        return this.scalingInstructions;
    }
    /**
     * The version number of the scaling plan. This value is always 1.
     * 
     */
    @Export(name="scalingPlanVersion", type=Integer.class, parameters={})
    private Output<Integer> scalingPlanVersion;

    /**
     * @return The version number of the scaling plan. This value is always 1.
     * 
     */
    public Output<Integer> getScalingPlanVersion() {
        return this.scalingPlanVersion;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public ScalingPlan(String name) {
        this(name, ScalingPlanArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public ScalingPlan(String name, ScalingPlanArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public ScalingPlan(String name, ScalingPlanArgs args, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("aws:autoscalingplans/scalingPlan:ScalingPlan", name, args == null ? ScalingPlanArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private ScalingPlan(String name, Output<String> id, @Nullable ScalingPlanState state, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("aws:autoscalingplans/scalingPlan:ScalingPlan", name, state, makeResourceOptions(options, id));
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
    public static ScalingPlan get(String name, Output<String> id, @Nullable ScalingPlanState state, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        return new ScalingPlan(name, id, state, options);
    }
}
