// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.sagemaker;

import io.pulumi.awsnative.Utilities;
import io.pulumi.awsnative.sagemaker.AppImageConfigArgs;
import io.pulumi.awsnative.sagemaker.outputs.AppImageConfigKernelGatewayImageConfig;
import io.pulumi.awsnative.sagemaker.outputs.AppImageConfigTag;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.Export;
import io.pulumi.core.annotations.ResourceType;
import java.lang.String;
import java.util.List;
import javax.annotation.Nullable;

/**
 * Resource Type definition for AWS::SageMaker::AppImageConfig
 * 
 */
@ResourceType(type="aws-native:sagemaker:AppImageConfig")
public class AppImageConfig extends io.pulumi.resources.CustomResource {
    /**
     * The Amazon Resource Name (ARN) of the AppImageConfig.
     * 
     */
    @Export(name="appImageConfigArn", type=String.class, parameters={})
    private Output<String> appImageConfigArn;

    /**
     * @return The Amazon Resource Name (ARN) of the AppImageConfig.
     * 
     */
    public Output<String> getAppImageConfigArn() {
        return this.appImageConfigArn;
    }
    /**
     * The Name of the AppImageConfig.
     * 
     */
    @Export(name="appImageConfigName", type=String.class, parameters={})
    private Output<String> appImageConfigName;

    /**
     * @return The Name of the AppImageConfig.
     * 
     */
    public Output<String> getAppImageConfigName() {
        return this.appImageConfigName;
    }
    /**
     * The KernelGatewayImageConfig.
     * 
     */
    @Export(name="kernelGatewayImageConfig", type=AppImageConfigKernelGatewayImageConfig.class, parameters={})
    private Output</* @Nullable */ AppImageConfigKernelGatewayImageConfig> kernelGatewayImageConfig;

    /**
     * @return The KernelGatewayImageConfig.
     * 
     */
    public Output</* @Nullable */ AppImageConfigKernelGatewayImageConfig> getKernelGatewayImageConfig() {
        return this.kernelGatewayImageConfig;
    }
    /**
     * A list of tags to apply to the AppImageConfig.
     * 
     */
    @Export(name="tags", type=List.class, parameters={AppImageConfigTag.class})
    private Output</* @Nullable */ List<AppImageConfigTag>> tags;

    /**
     * @return A list of tags to apply to the AppImageConfig.
     * 
     */
    public Output</* @Nullable */ List<AppImageConfigTag>> getTags() {
        return this.tags;
    }

    public interface BuilderApplicator {
        public void apply(@Nullable AppImageConfigArgs.Builder a);
    }
    private static io.pulumi.awsnative.sagemaker.AppImageConfigArgs buildArgs(BuilderApplicator argsBuilder) {
        final var builder = io.pulumi.awsnative.sagemaker.AppImageConfigArgs.builder();
        argsBuilder.apply(builder);
        return builder.build();
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param argsBuilder A function that configures a passed builder.
     */
    public AppImageConfig(String name, BuilderApplicator argsBuilder) {
        this(name, buildArgs(argsBuilder), null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public AppImageConfig(String name) {
        this(name, AppImageConfigArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public AppImageConfig(String name, @Nullable AppImageConfigArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public AppImageConfig(String name, @Nullable AppImageConfigArgs args, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("aws-native:sagemaker:AppImageConfig", name, args == null ? AppImageConfigArgs.Empty : args, makeResourceOptions(options, Output.empty()));
    }

    private AppImageConfig(String name, Output<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("aws-native:sagemaker:AppImageConfig", name, null, makeResourceOptions(options, id));
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
    public static AppImageConfig get(String name, Output<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        return new AppImageConfig(name, id, options);
    }
}
