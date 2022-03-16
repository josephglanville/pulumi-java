// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.ec2;

import io.pulumi.aws.Utilities;
import io.pulumi.aws.ec2.FleetArgs;
import io.pulumi.aws.ec2.inputs.FleetState;
import io.pulumi.aws.ec2.outputs.FleetLaunchTemplateConfig;
import io.pulumi.aws.ec2.outputs.FleetOnDemandOptions;
import io.pulumi.aws.ec2.outputs.FleetSpotOptions;
import io.pulumi.aws.ec2.outputs.FleetTargetCapacitySpecification;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.Export;
import io.pulumi.core.annotations.ResourceType;
import java.lang.Boolean;
import java.lang.String;
import java.util.Map;
import javax.annotation.Nullable;

/**
 * Provides a resource to manage EC2 Fleets.
 * 
 * ## Example Usage
 * 
 * ## Import
 * 
 * `aws_ec2_fleet` can be imported by using the Fleet identifier, e.g.,
 * 
 * ```sh
 *  $ pulumi import aws:ec2/fleet:Fleet example fleet-b9b55d27-c5fc-41ac-a6f3-48fcc91f080c
 * ```
 * 
 */
@ResourceType(type="aws:ec2/fleet:Fleet")
public class Fleet extends io.pulumi.resources.CustomResource {
    /**
     * Whether running instances should be terminated if the total target capacity of the EC2 Fleet is decreased below the current size of the EC2. Valid values: `no-termination`, `termination`. Defaults to `termination`.
     * 
     */
    @Export(name="excessCapacityTerminationPolicy", type=String.class, parameters={})
    private Output</* @Nullable */ String> excessCapacityTerminationPolicy;

    /**
     * @return Whether running instances should be terminated if the total target capacity of the EC2 Fleet is decreased below the current size of the EC2. Valid values: `no-termination`, `termination`. Defaults to `termination`.
     * 
     */
    public Output</* @Nullable */ String> getExcessCapacityTerminationPolicy() {
        return this.excessCapacityTerminationPolicy;
    }
    /**
     * Nested argument containing EC2 Launch Template configurations. Defined below.
     * 
     */
    @Export(name="launchTemplateConfig", type=FleetLaunchTemplateConfig.class, parameters={})
    private Output<FleetLaunchTemplateConfig> launchTemplateConfig;

    /**
     * @return Nested argument containing EC2 Launch Template configurations. Defined below.
     * 
     */
    public Output<FleetLaunchTemplateConfig> getLaunchTemplateConfig() {
        return this.launchTemplateConfig;
    }
    /**
     * Nested argument containing On-Demand configurations. Defined below.
     * 
     */
    @Export(name="onDemandOptions", type=FleetOnDemandOptions.class, parameters={})
    private Output</* @Nullable */ FleetOnDemandOptions> onDemandOptions;

    /**
     * @return Nested argument containing On-Demand configurations. Defined below.
     * 
     */
    public Output</* @Nullable */ FleetOnDemandOptions> getOnDemandOptions() {
        return this.onDemandOptions;
    }
    /**
     * Whether EC2 Fleet should replace unhealthy instances. Defaults to `false`.
     * 
     */
    @Export(name="replaceUnhealthyInstances", type=Boolean.class, parameters={})
    private Output</* @Nullable */ Boolean> replaceUnhealthyInstances;

    /**
     * @return Whether EC2 Fleet should replace unhealthy instances. Defaults to `false`.
     * 
     */
    public Output</* @Nullable */ Boolean> getReplaceUnhealthyInstances() {
        return this.replaceUnhealthyInstances;
    }
    /**
     * Nested argument containing Spot configurations. Defined below.
     * 
     */
    @Export(name="spotOptions", type=FleetSpotOptions.class, parameters={})
    private Output</* @Nullable */ FleetSpotOptions> spotOptions;

    /**
     * @return Nested argument containing Spot configurations. Defined below.
     * 
     */
    public Output</* @Nullable */ FleetSpotOptions> getSpotOptions() {
        return this.spotOptions;
    }
    /**
     * Map of Fleet tags. To tag instances at launch, specify the tags in the Launch Template. If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
     * 
     */
    @Export(name="tags", type=Map.class, parameters={String.class, String.class})
    private Output</* @Nullable */ Map<String,String>> tags;

    /**
     * @return Map of Fleet tags. To tag instances at launch, specify the tags in the Launch Template. If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
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
     * Nested argument containing target capacity configurations. Defined below.
     * 
     */
    @Export(name="targetCapacitySpecification", type=FleetTargetCapacitySpecification.class, parameters={})
    private Output<FleetTargetCapacitySpecification> targetCapacitySpecification;

    /**
     * @return Nested argument containing target capacity configurations. Defined below.
     * 
     */
    public Output<FleetTargetCapacitySpecification> getTargetCapacitySpecification() {
        return this.targetCapacitySpecification;
    }
    /**
     * Whether to terminate instances for an EC2 Fleet if it is deleted successfully. Defaults to `false`.
     * 
     */
    @Export(name="terminateInstances", type=Boolean.class, parameters={})
    private Output</* @Nullable */ Boolean> terminateInstances;

    /**
     * @return Whether to terminate instances for an EC2 Fleet if it is deleted successfully. Defaults to `false`.
     * 
     */
    public Output</* @Nullable */ Boolean> getTerminateInstances() {
        return this.terminateInstances;
    }
    /**
     * Whether running instances should be terminated when the EC2 Fleet expires. Defaults to `false`.
     * 
     */
    @Export(name="terminateInstancesWithExpiration", type=Boolean.class, parameters={})
    private Output</* @Nullable */ Boolean> terminateInstancesWithExpiration;

    /**
     * @return Whether running instances should be terminated when the EC2 Fleet expires. Defaults to `false`.
     * 
     */
    public Output</* @Nullable */ Boolean> getTerminateInstancesWithExpiration() {
        return this.terminateInstancesWithExpiration;
    }
    /**
     * The type of request. Indicates whether the EC2 Fleet only requests the target capacity, or also attempts to maintain it. Valid values: `maintain`, `request`. Defaults to `maintain`.
     * 
     */
    @Export(name="type", type=String.class, parameters={})
    private Output</* @Nullable */ String> type;

    /**
     * @return The type of request. Indicates whether the EC2 Fleet only requests the target capacity, or also attempts to maintain it. Valid values: `maintain`, `request`. Defaults to `maintain`.
     * 
     */
    public Output</* @Nullable */ String> getType() {
        return this.type;
    }

    public interface BuilderApplicator {
        public void apply(FleetArgs.Builder a);
    }
    private static io.pulumi.aws.ec2.FleetArgs buildArgs(BuilderApplicator argsBuilder) {
        final var builder = io.pulumi.aws.ec2.FleetArgs.builder();
        argsBuilder.apply(builder);
        return builder.build();
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param argsBuilder A function that configures a passed builder.
     */
    public Fleet(String name, BuilderApplicator argsBuilder) {
        this(name, buildArgs(argsBuilder), null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public Fleet(String name) {
        this(name, FleetArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public Fleet(String name, FleetArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public Fleet(String name, FleetArgs args, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("aws:ec2/fleet:Fleet", name, args == null ? FleetArgs.Empty : args, makeResourceOptions(options, Output.empty()));
    }

    private Fleet(String name, Output<String> id, @Nullable FleetState state, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("aws:ec2/fleet:Fleet", name, state, makeResourceOptions(options, id));
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
    public static Fleet get(String name, Output<String> id, @Nullable FleetState state, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        return new Fleet(name, id, state, options);
    }
}
