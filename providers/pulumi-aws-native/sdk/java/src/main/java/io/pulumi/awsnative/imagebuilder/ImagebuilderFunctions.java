// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.imagebuilder;

import io.pulumi.awsnative.Utilities;
import io.pulumi.awsnative.imagebuilder.inputs.GetComponentArgs;
import io.pulumi.awsnative.imagebuilder.inputs.GetContainerRecipeArgs;
import io.pulumi.awsnative.imagebuilder.inputs.GetDistributionConfigurationArgs;
import io.pulumi.awsnative.imagebuilder.inputs.GetImageArgs;
import io.pulumi.awsnative.imagebuilder.inputs.GetImagePipelineArgs;
import io.pulumi.awsnative.imagebuilder.inputs.GetImageRecipeArgs;
import io.pulumi.awsnative.imagebuilder.inputs.GetInfrastructureConfigurationArgs;
import io.pulumi.awsnative.imagebuilder.outputs.GetComponentResult;
import io.pulumi.awsnative.imagebuilder.outputs.GetContainerRecipeResult;
import io.pulumi.awsnative.imagebuilder.outputs.GetDistributionConfigurationResult;
import io.pulumi.awsnative.imagebuilder.outputs.GetImagePipelineResult;
import io.pulumi.awsnative.imagebuilder.outputs.GetImageRecipeResult;
import io.pulumi.awsnative.imagebuilder.outputs.GetImageResult;
import io.pulumi.awsnative.imagebuilder.outputs.GetInfrastructureConfigurationResult;
import io.pulumi.core.TypeShape;
import io.pulumi.deployment.Deployment;
import io.pulumi.deployment.InvokeOptions;
import java.util.concurrent.CompletableFuture;

public final class ImagebuilderFunctions {
    /**
     * Resource schema for AWS::ImageBuilder::Component
     * 
     */
    public static CompletableFuture<GetComponentResult> getComponent(GetComponentArgs args) {
        return getComponent(args, InvokeOptions.Empty);
    }
    public static CompletableFuture<GetComponentResult> getComponent(GetComponentArgs args, InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("aws-native:imagebuilder:getComponent", TypeShape.of(GetComponentResult.class), args, Utilities.withVersion(options));
    }
    /**
     * Resource schema for AWS::ImageBuilder::ContainerRecipe
     * 
     */
    public static CompletableFuture<GetContainerRecipeResult> getContainerRecipe(GetContainerRecipeArgs args) {
        return getContainerRecipe(args, InvokeOptions.Empty);
    }
    public static CompletableFuture<GetContainerRecipeResult> getContainerRecipe(GetContainerRecipeArgs args, InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("aws-native:imagebuilder:getContainerRecipe", TypeShape.of(GetContainerRecipeResult.class), args, Utilities.withVersion(options));
    }
    /**
     * Resource schema for AWS::ImageBuilder::DistributionConfiguration
     * 
     */
    public static CompletableFuture<GetDistributionConfigurationResult> getDistributionConfiguration(GetDistributionConfigurationArgs args) {
        return getDistributionConfiguration(args, InvokeOptions.Empty);
    }
    public static CompletableFuture<GetDistributionConfigurationResult> getDistributionConfiguration(GetDistributionConfigurationArgs args, InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("aws-native:imagebuilder:getDistributionConfiguration", TypeShape.of(GetDistributionConfigurationResult.class), args, Utilities.withVersion(options));
    }
    /**
     * Resource schema for AWS::ImageBuilder::Image
     * 
     */
    public static CompletableFuture<GetImageResult> getImage(GetImageArgs args) {
        return getImage(args, InvokeOptions.Empty);
    }
    public static CompletableFuture<GetImageResult> getImage(GetImageArgs args, InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("aws-native:imagebuilder:getImage", TypeShape.of(GetImageResult.class), args, Utilities.withVersion(options));
    }
    /**
     * Resource schema for AWS::ImageBuilder::ImagePipeline
     * 
     */
    public static CompletableFuture<GetImagePipelineResult> getImagePipeline(GetImagePipelineArgs args) {
        return getImagePipeline(args, InvokeOptions.Empty);
    }
    public static CompletableFuture<GetImagePipelineResult> getImagePipeline(GetImagePipelineArgs args, InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("aws-native:imagebuilder:getImagePipeline", TypeShape.of(GetImagePipelineResult.class), args, Utilities.withVersion(options));
    }
    /**
     * Resource schema for AWS::ImageBuilder::ImageRecipe
     * 
     */
    public static CompletableFuture<GetImageRecipeResult> getImageRecipe(GetImageRecipeArgs args) {
        return getImageRecipe(args, InvokeOptions.Empty);
    }
    public static CompletableFuture<GetImageRecipeResult> getImageRecipe(GetImageRecipeArgs args, InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("aws-native:imagebuilder:getImageRecipe", TypeShape.of(GetImageRecipeResult.class), args, Utilities.withVersion(options));
    }
    /**
     * Resource schema for AWS::ImageBuilder::InfrastructureConfiguration
     * 
     */
    public static CompletableFuture<GetInfrastructureConfigurationResult> getInfrastructureConfiguration(GetInfrastructureConfigurationArgs args) {
        return getInfrastructureConfiguration(args, InvokeOptions.Empty);
    }
    public static CompletableFuture<GetInfrastructureConfigurationResult> getInfrastructureConfiguration(GetInfrastructureConfigurationArgs args, InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("aws-native:imagebuilder:getInfrastructureConfiguration", TypeShape.of(GetInfrastructureConfigurationResult.class), args, Utilities.withVersion(options));
    }
}
