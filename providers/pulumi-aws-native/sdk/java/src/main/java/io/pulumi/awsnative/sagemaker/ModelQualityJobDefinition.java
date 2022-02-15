// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.sagemaker;

import io.pulumi.awsnative.Utilities;
import io.pulumi.awsnative.sagemaker.ModelQualityJobDefinitionArgs;
import io.pulumi.awsnative.sagemaker.outputs.ModelQualityJobDefinitionModelQualityAppSpecification;
import io.pulumi.awsnative.sagemaker.outputs.ModelQualityJobDefinitionModelQualityBaselineConfig;
import io.pulumi.awsnative.sagemaker.outputs.ModelQualityJobDefinitionModelQualityJobInput;
import io.pulumi.awsnative.sagemaker.outputs.ModelQualityJobDefinitionMonitoringOutputConfig;
import io.pulumi.awsnative.sagemaker.outputs.ModelQualityJobDefinitionMonitoringResources;
import io.pulumi.awsnative.sagemaker.outputs.ModelQualityJobDefinitionNetworkConfig;
import io.pulumi.awsnative.sagemaker.outputs.ModelQualityJobDefinitionStoppingCondition;
import io.pulumi.awsnative.sagemaker.outputs.ModelQualityJobDefinitionTag;
import io.pulumi.core.Input;
import io.pulumi.core.Output;
import io.pulumi.core.internal.annotations.OutputExport;
import io.pulumi.core.internal.annotations.ResourceType;
import java.lang.String;
import java.util.List;
import javax.annotation.Nullable;

@ResourceType(type="aws-native:sagemaker:ModelQualityJobDefinition")
public class ModelQualityJobDefinition extends io.pulumi.resources.CustomResource {
    @OutputExport(name="creationTime", type=String.class, parameters={})
    private Output<String> creationTime;

    public Output<String> getCreationTime() {
        return this.creationTime;
    }
    @OutputExport(name="jobDefinitionArn", type=String.class, parameters={})
    private Output<String> jobDefinitionArn;

    public Output<String> getJobDefinitionArn() {
        return this.jobDefinitionArn;
    }
    @OutputExport(name="jobDefinitionName", type=String.class, parameters={})
    private Output</* @Nullable */ String> jobDefinitionName;

    public Output</* @Nullable */ String> getJobDefinitionName() {
        return this.jobDefinitionName;
    }
    @OutputExport(name="jobResources", type=ModelQualityJobDefinitionMonitoringResources.class, parameters={})
    private Output<ModelQualityJobDefinitionMonitoringResources> jobResources;

    public Output<ModelQualityJobDefinitionMonitoringResources> getJobResources() {
        return this.jobResources;
    }
    @OutputExport(name="modelQualityAppSpecification", type=ModelQualityJobDefinitionModelQualityAppSpecification.class, parameters={})
    private Output<ModelQualityJobDefinitionModelQualityAppSpecification> modelQualityAppSpecification;

    public Output<ModelQualityJobDefinitionModelQualityAppSpecification> getModelQualityAppSpecification() {
        return this.modelQualityAppSpecification;
    }
    @OutputExport(name="modelQualityBaselineConfig", type=ModelQualityJobDefinitionModelQualityBaselineConfig.class, parameters={})
    private Output</* @Nullable */ ModelQualityJobDefinitionModelQualityBaselineConfig> modelQualityBaselineConfig;

    public Output</* @Nullable */ ModelQualityJobDefinitionModelQualityBaselineConfig> getModelQualityBaselineConfig() {
        return this.modelQualityBaselineConfig;
    }
    @OutputExport(name="modelQualityJobInput", type=ModelQualityJobDefinitionModelQualityJobInput.class, parameters={})
    private Output<ModelQualityJobDefinitionModelQualityJobInput> modelQualityJobInput;

    public Output<ModelQualityJobDefinitionModelQualityJobInput> getModelQualityJobInput() {
        return this.modelQualityJobInput;
    }
    @OutputExport(name="modelQualityJobOutputConfig", type=ModelQualityJobDefinitionMonitoringOutputConfig.class, parameters={})
    private Output<ModelQualityJobDefinitionMonitoringOutputConfig> modelQualityJobOutputConfig;

    public Output<ModelQualityJobDefinitionMonitoringOutputConfig> getModelQualityJobOutputConfig() {
        return this.modelQualityJobOutputConfig;
    }
    @OutputExport(name="networkConfig", type=ModelQualityJobDefinitionNetworkConfig.class, parameters={})
    private Output</* @Nullable */ ModelQualityJobDefinitionNetworkConfig> networkConfig;

    public Output</* @Nullable */ ModelQualityJobDefinitionNetworkConfig> getNetworkConfig() {
        return this.networkConfig;
    }
    @OutputExport(name="roleArn", type=String.class, parameters={})
    private Output<String> roleArn;

    public Output<String> getRoleArn() {
        return this.roleArn;
    }
    @OutputExport(name="stoppingCondition", type=ModelQualityJobDefinitionStoppingCondition.class, parameters={})
    private Output</* @Nullable */ ModelQualityJobDefinitionStoppingCondition> stoppingCondition;

    public Output</* @Nullable */ ModelQualityJobDefinitionStoppingCondition> getStoppingCondition() {
        return this.stoppingCondition;
    }
    @OutputExport(name="tags", type=List.class, parameters={ModelQualityJobDefinitionTag.class})
    private Output</* @Nullable */ List<ModelQualityJobDefinitionTag>> tags;

    public Output</* @Nullable */ List<ModelQualityJobDefinitionTag>> getTags() {
        return this.tags;
    }

    public ModelQualityJobDefinition(String name, ModelQualityJobDefinitionArgs args, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("aws-native:sagemaker:ModelQualityJobDefinition", name, args == null ? ModelQualityJobDefinitionArgs.Empty : args, makeResourceOptions(options, Input.empty()));
    }

    private ModelQualityJobDefinition(String name, Input<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("aws-native:sagemaker:ModelQualityJobDefinition", name, null, makeResourceOptions(options, id));
    }

    private static io.pulumi.resources.CustomResourceOptions makeResourceOptions(@Nullable io.pulumi.resources.CustomResourceOptions options, @Nullable Input<String> id) {
        var defaultOptions = io.pulumi.resources.CustomResourceOptions.builder()
            .setVersion(Utilities.getVersion())
            .build();
        return io.pulumi.resources.CustomResourceOptions.merge(defaultOptions, options, id);
    }

    public static ModelQualityJobDefinition get(String name, Input<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        return new ModelQualityJobDefinition(name, id, options);
    }
}