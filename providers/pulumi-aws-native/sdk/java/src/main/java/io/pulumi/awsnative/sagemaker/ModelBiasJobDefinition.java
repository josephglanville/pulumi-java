// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.sagemaker;

import io.pulumi.awsnative.Utilities;
import io.pulumi.awsnative.sagemaker.ModelBiasJobDefinitionArgs;
import io.pulumi.awsnative.sagemaker.outputs.ModelBiasJobDefinitionModelBiasAppSpecification;
import io.pulumi.awsnative.sagemaker.outputs.ModelBiasJobDefinitionModelBiasBaselineConfig;
import io.pulumi.awsnative.sagemaker.outputs.ModelBiasJobDefinitionModelBiasJobInput;
import io.pulumi.awsnative.sagemaker.outputs.ModelBiasJobDefinitionMonitoringOutputConfig;
import io.pulumi.awsnative.sagemaker.outputs.ModelBiasJobDefinitionMonitoringResources;
import io.pulumi.awsnative.sagemaker.outputs.ModelBiasJobDefinitionNetworkConfig;
import io.pulumi.awsnative.sagemaker.outputs.ModelBiasJobDefinitionStoppingCondition;
import io.pulumi.awsnative.sagemaker.outputs.ModelBiasJobDefinitionTag;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.Export;
import io.pulumi.core.annotations.ResourceType;
import java.lang.String;
import java.util.List;
import javax.annotation.Nullable;

/**
 * Resource Type definition for AWS::SageMaker::ModelBiasJobDefinition
 * 
 */
@ResourceType(type="aws-native:sagemaker:ModelBiasJobDefinition")
public class ModelBiasJobDefinition extends io.pulumi.resources.CustomResource {
    /**
     * The time at which the job definition was created.
     * 
     */
    @Export(name="creationTime", type=String.class, parameters={})
    private Output<String> creationTime;

    /**
     * @return The time at which the job definition was created.
     * 
     */
    public Output<String> getCreationTime() {
        return this.creationTime;
    }
    /**
     * The Amazon Resource Name (ARN) of job definition.
     * 
     */
    @Export(name="jobDefinitionArn", type=String.class, parameters={})
    private Output<String> jobDefinitionArn;

    /**
     * @return The Amazon Resource Name (ARN) of job definition.
     * 
     */
    public Output<String> getJobDefinitionArn() {
        return this.jobDefinitionArn;
    }
    @Export(name="jobDefinitionName", type=String.class, parameters={})
    private Output</* @Nullable */ String> jobDefinitionName;

    public Output</* @Nullable */ String> getJobDefinitionName() {
        return this.jobDefinitionName;
    }
    @Export(name="jobResources", type=ModelBiasJobDefinitionMonitoringResources.class, parameters={})
    private Output<ModelBiasJobDefinitionMonitoringResources> jobResources;

    public Output<ModelBiasJobDefinitionMonitoringResources> getJobResources() {
        return this.jobResources;
    }
    @Export(name="modelBiasAppSpecification", type=ModelBiasJobDefinitionModelBiasAppSpecification.class, parameters={})
    private Output<ModelBiasJobDefinitionModelBiasAppSpecification> modelBiasAppSpecification;

    public Output<ModelBiasJobDefinitionModelBiasAppSpecification> getModelBiasAppSpecification() {
        return this.modelBiasAppSpecification;
    }
    @Export(name="modelBiasBaselineConfig", type=ModelBiasJobDefinitionModelBiasBaselineConfig.class, parameters={})
    private Output</* @Nullable */ ModelBiasJobDefinitionModelBiasBaselineConfig> modelBiasBaselineConfig;

    public Output</* @Nullable */ ModelBiasJobDefinitionModelBiasBaselineConfig> getModelBiasBaselineConfig() {
        return this.modelBiasBaselineConfig;
    }
    @Export(name="modelBiasJobInput", type=ModelBiasJobDefinitionModelBiasJobInput.class, parameters={})
    private Output<ModelBiasJobDefinitionModelBiasJobInput> modelBiasJobInput;

    public Output<ModelBiasJobDefinitionModelBiasJobInput> getModelBiasJobInput() {
        return this.modelBiasJobInput;
    }
    @Export(name="modelBiasJobOutputConfig", type=ModelBiasJobDefinitionMonitoringOutputConfig.class, parameters={})
    private Output<ModelBiasJobDefinitionMonitoringOutputConfig> modelBiasJobOutputConfig;

    public Output<ModelBiasJobDefinitionMonitoringOutputConfig> getModelBiasJobOutputConfig() {
        return this.modelBiasJobOutputConfig;
    }
    @Export(name="networkConfig", type=ModelBiasJobDefinitionNetworkConfig.class, parameters={})
    private Output</* @Nullable */ ModelBiasJobDefinitionNetworkConfig> networkConfig;

    public Output</* @Nullable */ ModelBiasJobDefinitionNetworkConfig> getNetworkConfig() {
        return this.networkConfig;
    }
    /**
     * The Amazon Resource Name (ARN) of an IAM role that Amazon SageMaker can assume to perform tasks on your behalf.
     * 
     */
    @Export(name="roleArn", type=String.class, parameters={})
    private Output<String> roleArn;

    /**
     * @return The Amazon Resource Name (ARN) of an IAM role that Amazon SageMaker can assume to perform tasks on your behalf.
     * 
     */
    public Output<String> getRoleArn() {
        return this.roleArn;
    }
    @Export(name="stoppingCondition", type=ModelBiasJobDefinitionStoppingCondition.class, parameters={})
    private Output</* @Nullable */ ModelBiasJobDefinitionStoppingCondition> stoppingCondition;

    public Output</* @Nullable */ ModelBiasJobDefinitionStoppingCondition> getStoppingCondition() {
        return this.stoppingCondition;
    }
    /**
     * An array of key-value pairs to apply to this resource.
     * 
     */
    @Export(name="tags", type=List.class, parameters={ModelBiasJobDefinitionTag.class})
    private Output</* @Nullable */ List<ModelBiasJobDefinitionTag>> tags;

    /**
     * @return An array of key-value pairs to apply to this resource.
     * 
     */
    public Output</* @Nullable */ List<ModelBiasJobDefinitionTag>> getTags() {
        return this.tags;
    }

    public interface BuilderApplicator {
        public void apply(ModelBiasJobDefinitionArgs.Builder a);
    }
    private static io.pulumi.awsnative.sagemaker.ModelBiasJobDefinitionArgs buildArgs(BuilderApplicator argsBuilder) {
        final var builder = io.pulumi.awsnative.sagemaker.ModelBiasJobDefinitionArgs.builder();
        argsBuilder.apply(builder);
        return builder.build();
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param argsBuilder A function that configures a passed builder.
     */
    public ModelBiasJobDefinition(String name, BuilderApplicator argsBuilder) {
        this(name, buildArgs(argsBuilder), null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public ModelBiasJobDefinition(String name) {
        this(name, ModelBiasJobDefinitionArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public ModelBiasJobDefinition(String name, ModelBiasJobDefinitionArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public ModelBiasJobDefinition(String name, ModelBiasJobDefinitionArgs args, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("aws-native:sagemaker:ModelBiasJobDefinition", name, args == null ? ModelBiasJobDefinitionArgs.Empty : args, makeResourceOptions(options, Output.empty()));
    }

    private ModelBiasJobDefinition(String name, Output<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("aws-native:sagemaker:ModelBiasJobDefinition", name, null, makeResourceOptions(options, id));
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
    public static ModelBiasJobDefinition get(String name, Output<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        return new ModelBiasJobDefinition(name, id, options);
    }
}
