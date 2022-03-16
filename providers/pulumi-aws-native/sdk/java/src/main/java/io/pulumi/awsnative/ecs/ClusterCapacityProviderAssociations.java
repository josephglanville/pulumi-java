// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.ecs;

import io.pulumi.awsnative.Utilities;
import io.pulumi.awsnative.ecs.ClusterCapacityProviderAssociationsArgs;
import io.pulumi.awsnative.ecs.outputs.ClusterCapacityProviderAssociationsCapacityProviderStrategy;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.Export;
import io.pulumi.core.annotations.ResourceType;
import java.lang.String;
import java.util.List;
import javax.annotation.Nullable;

/**
 * Associate a set of ECS Capacity Providers with a specified ECS Cluster
 * 
 * ## Example Usage
 * 
 */
@ResourceType(type="aws-native:ecs:ClusterCapacityProviderAssociations")
public class ClusterCapacityProviderAssociations extends io.pulumi.resources.CustomResource {
    @Export(name="capacityProviders", type=List.class, parameters={String.class})
    private Output<List<String>> capacityProviders;

    public Output<List<String>> getCapacityProviders() {
        return this.capacityProviders;
    }
    @Export(name="cluster", type=String.class, parameters={})
    private Output<String> cluster;

    public Output<String> getCluster() {
        return this.cluster;
    }
    @Export(name="defaultCapacityProviderStrategy", type=List.class, parameters={ClusterCapacityProviderAssociationsCapacityProviderStrategy.class})
    private Output<List<ClusterCapacityProviderAssociationsCapacityProviderStrategy>> defaultCapacityProviderStrategy;

    public Output<List<ClusterCapacityProviderAssociationsCapacityProviderStrategy>> getDefaultCapacityProviderStrategy() {
        return this.defaultCapacityProviderStrategy;
    }

    public interface BuilderApplicator {
        public void apply(ClusterCapacityProviderAssociationsArgs.Builder a);
    }
    private static io.pulumi.awsnative.ecs.ClusterCapacityProviderAssociationsArgs buildArgs(BuilderApplicator argsBuilder) {
        final var builder = io.pulumi.awsnative.ecs.ClusterCapacityProviderAssociationsArgs.builder();
        argsBuilder.apply(builder);
        return builder.build();
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param argsBuilder A function that configures a passed builder.
     */
    public ClusterCapacityProviderAssociations(String name, BuilderApplicator argsBuilder) {
        this(name, buildArgs(argsBuilder), null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public ClusterCapacityProviderAssociations(String name) {
        this(name, ClusterCapacityProviderAssociationsArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public ClusterCapacityProviderAssociations(String name, ClusterCapacityProviderAssociationsArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public ClusterCapacityProviderAssociations(String name, ClusterCapacityProviderAssociationsArgs args, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("aws-native:ecs:ClusterCapacityProviderAssociations", name, args == null ? ClusterCapacityProviderAssociationsArgs.Empty : args, makeResourceOptions(options, Output.empty()));
    }

    private ClusterCapacityProviderAssociations(String name, Output<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("aws-native:ecs:ClusterCapacityProviderAssociations", name, null, makeResourceOptions(options, id));
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
    public static ClusterCapacityProviderAssociations get(String name, Output<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        return new ClusterCapacityProviderAssociations(name, id, options);
    }
}
