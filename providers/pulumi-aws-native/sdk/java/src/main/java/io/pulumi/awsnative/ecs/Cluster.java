// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.ecs;

import io.pulumi.awsnative.Utilities;
import io.pulumi.awsnative.ecs.ClusterArgs;
import io.pulumi.awsnative.ecs.outputs.ClusterCapacityProviderStrategyItem;
import io.pulumi.awsnative.ecs.outputs.ClusterConfiguration;
import io.pulumi.awsnative.ecs.outputs.ClusterSettings;
import io.pulumi.awsnative.ecs.outputs.ClusterTag;
import io.pulumi.core.Input;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.OutputExport;
import io.pulumi.core.annotations.ResourceType;
import java.lang.String;
import java.util.List;
import javax.annotation.Nullable;

/**
 * Create an Elastic Container Service (ECS) cluster.
 * 
 */
@ResourceType(type="aws-native:ecs:Cluster")
public class Cluster extends io.pulumi.resources.CustomResource {
    /**
     * The Amazon Resource Name (ARN) of the Amazon ECS cluster, such as arn:aws:ecs:us-east-2:123456789012:cluster/MyECSCluster.
     * 
     */
    @OutputExport(name="arn", type=String.class, parameters={})
    private Output<String> arn;

    /**
     * @return The Amazon Resource Name (ARN) of the Amazon ECS cluster, such as arn:aws:ecs:us-east-2:123456789012:cluster/MyECSCluster.
     * 
     */
    public Output<String> getArn() {
        return this.arn;
    }
    @OutputExport(name="capacityProviders", type=List.class, parameters={String.class})
    private Output</* @Nullable */ List<String>> capacityProviders;

    public Output</* @Nullable */ List<String>> getCapacityProviders() {
        return this.capacityProviders;
    }
    /**
     * A user-generated string that you use to identify your cluster. If you don't specify a name, AWS CloudFormation generates a unique physical ID for the name.
     * 
     */
    @OutputExport(name="clusterName", type=String.class, parameters={})
    private Output</* @Nullable */ String> clusterName;

    /**
     * @return A user-generated string that you use to identify your cluster. If you don't specify a name, AWS CloudFormation generates a unique physical ID for the name.
     * 
     */
    public Output</* @Nullable */ String> getClusterName() {
        return this.clusterName;
    }
    @OutputExport(name="clusterSettings", type=List.class, parameters={ClusterSettings.class})
    private Output</* @Nullable */ List<ClusterSettings>> clusterSettings;

    public Output</* @Nullable */ List<ClusterSettings>> getClusterSettings() {
        return this.clusterSettings;
    }
    @OutputExport(name="configuration", type=ClusterConfiguration.class, parameters={})
    private Output</* @Nullable */ ClusterConfiguration> configuration;

    public Output</* @Nullable */ ClusterConfiguration> getConfiguration() {
        return this.configuration;
    }
    @OutputExport(name="defaultCapacityProviderStrategy", type=List.class, parameters={ClusterCapacityProviderStrategyItem.class})
    private Output</* @Nullable */ List<ClusterCapacityProviderStrategyItem>> defaultCapacityProviderStrategy;

    public Output</* @Nullable */ List<ClusterCapacityProviderStrategyItem>> getDefaultCapacityProviderStrategy() {
        return this.defaultCapacityProviderStrategy;
    }
    @OutputExport(name="tags", type=List.class, parameters={ClusterTag.class})
    private Output</* @Nullable */ List<ClusterTag>> tags;

    public Output</* @Nullable */ List<ClusterTag>> getTags() {
        return this.tags;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public Cluster(String name) {
        this(name, ClusterArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public Cluster(String name, @Nullable ClusterArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public Cluster(String name, @Nullable ClusterArgs args, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("aws-native:ecs:Cluster", name, args == null ? ClusterArgs.Empty : args, makeResourceOptions(options, Input.empty()));
    }

    private Cluster(String name, Input<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("aws-native:ecs:Cluster", name, null, makeResourceOptions(options, id));
    }

    private static io.pulumi.resources.CustomResourceOptions makeResourceOptions(@Nullable io.pulumi.resources.CustomResourceOptions options, @Nullable Input<String> id) {
        var defaultOptions = io.pulumi.resources.CustomResourceOptions.builder()
            .setVersion(Utilities.getVersion())
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
    public static Cluster get(String name, Input<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        return new Cluster(name, id, options);
    }
}
