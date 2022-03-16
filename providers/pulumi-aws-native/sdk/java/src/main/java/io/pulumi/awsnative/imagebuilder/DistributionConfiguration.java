// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.imagebuilder;

import io.pulumi.awsnative.Utilities;
import io.pulumi.awsnative.imagebuilder.DistributionConfigurationArgs;
import io.pulumi.awsnative.imagebuilder.outputs.DistributionConfigurationDistribution;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.Export;
import io.pulumi.core.annotations.ResourceType;
import java.lang.Object;
import java.lang.String;
import java.util.List;
import javax.annotation.Nullable;

/**
 * Resource schema for AWS::ImageBuilder::DistributionConfiguration
 * 
 */
@ResourceType(type="aws-native:imagebuilder:DistributionConfiguration")
public class DistributionConfiguration extends io.pulumi.resources.CustomResource {
    /**
     * The Amazon Resource Name (ARN) of the distribution configuration.
     * 
     */
    @Export(name="arn", type=String.class, parameters={})
    private Output<String> arn;

    /**
     * @return The Amazon Resource Name (ARN) of the distribution configuration.
     * 
     */
    public Output<String> getArn() {
        return this.arn;
    }
    /**
     * The description of the distribution configuration.
     * 
     */
    @Export(name="description", type=String.class, parameters={})
    private Output</* @Nullable */ String> description;

    /**
     * @return The description of the distribution configuration.
     * 
     */
    public Output</* @Nullable */ String> getDescription() {
        return this.description;
    }
    /**
     * The distributions of the distribution configuration.
     * 
     */
    @Export(name="distributions", type=List.class, parameters={DistributionConfigurationDistribution.class})
    private Output<List<DistributionConfigurationDistribution>> distributions;

    /**
     * @return The distributions of the distribution configuration.
     * 
     */
    public Output<List<DistributionConfigurationDistribution>> getDistributions() {
        return this.distributions;
    }
    /**
     * The name of the distribution configuration.
     * 
     */
    @Export(name="name", type=String.class, parameters={})
    private Output<String> name;

    /**
     * @return The name of the distribution configuration.
     * 
     */
    public Output<String> getName() {
        return this.name;
    }
    /**
     * The tags associated with the component.
     * 
     */
    @Export(name="tags", type=Object.class, parameters={})
    private Output</* @Nullable */ Object> tags;

    /**
     * @return The tags associated with the component.
     * 
     */
    public Output</* @Nullable */ Object> getTags() {
        return this.tags;
    }

    public interface BuilderApplicator {
        public void apply(DistributionConfigurationArgs.Builder a);
    }
    private static io.pulumi.awsnative.imagebuilder.DistributionConfigurationArgs buildArgs(BuilderApplicator argsBuilder) {
        final var builder = io.pulumi.awsnative.imagebuilder.DistributionConfigurationArgs.builder();
        argsBuilder.apply(builder);
        return builder.build();
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param argsBuilder A function that configures a passed builder.
     */
    public DistributionConfiguration(String name, BuilderApplicator argsBuilder) {
        this(name, buildArgs(argsBuilder), null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public DistributionConfiguration(String name) {
        this(name, DistributionConfigurationArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public DistributionConfiguration(String name, DistributionConfigurationArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public DistributionConfiguration(String name, DistributionConfigurationArgs args, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("aws-native:imagebuilder:DistributionConfiguration", name, args == null ? DistributionConfigurationArgs.Empty : args, makeResourceOptions(options, Output.empty()));
    }

    private DistributionConfiguration(String name, Output<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("aws-native:imagebuilder:DistributionConfiguration", name, null, makeResourceOptions(options, id));
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
    public static DistributionConfiguration get(String name, Output<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        return new DistributionConfiguration(name, id, options);
    }
}
