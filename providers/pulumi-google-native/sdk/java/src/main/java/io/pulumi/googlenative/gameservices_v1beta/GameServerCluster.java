// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.gameservices_v1beta;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Export;
import io.pulumi.core.annotations.ResourceType;
import io.pulumi.googlenative.Utilities;
import io.pulumi.googlenative.gameservices_v1beta.GameServerClusterArgs;
import io.pulumi.googlenative.gameservices_v1beta.outputs.GameServerClusterConnectionInfoResponse;
import io.pulumi.googlenative.gameservices_v1beta.outputs.KubernetesClusterStateResponse;
import java.lang.String;
import java.util.Map;
import javax.annotation.Nullable;

/**
 * Creates a new game server cluster in a given project and location.
 * 
 */
@ResourceType(type="google-native:gameservices/v1beta:GameServerCluster")
public class GameServerCluster extends io.pulumi.resources.CustomResource {
    /**
     * The state of the Kubernetes cluster, this will be available if 'view' is set to `FULL` in the relevant List/Get/Preview request.
     * 
     */
    @Export(name="clusterState", type=KubernetesClusterStateResponse.class, parameters={})
    private Output<KubernetesClusterStateResponse> clusterState;

    /**
     * @return The state of the Kubernetes cluster, this will be available if 'view' is set to `FULL` in the relevant List/Get/Preview request.
     * 
     */
    public Output<KubernetesClusterStateResponse> getClusterState() {
        return this.clusterState;
    }
    /**
     * The game server cluster connection information. This information is used to manage game server clusters.
     * 
     */
    @Export(name="connectionInfo", type=GameServerClusterConnectionInfoResponse.class, parameters={})
    private Output<GameServerClusterConnectionInfoResponse> connectionInfo;

    /**
     * @return The game server cluster connection information. This information is used to manage game server clusters.
     * 
     */
    public Output<GameServerClusterConnectionInfoResponse> getConnectionInfo() {
        return this.connectionInfo;
    }
    /**
     * The creation time.
     * 
     */
    @Export(name="createTime", type=String.class, parameters={})
    private Output<String> createTime;

    /**
     * @return The creation time.
     * 
     */
    public Output<String> getCreateTime() {
        return this.createTime;
    }
    /**
     * Human readable description of the cluster.
     * 
     */
    @Export(name="description", type=String.class, parameters={})
    private Output<String> description;

    /**
     * @return Human readable description of the cluster.
     * 
     */
    public Output<String> getDescription() {
        return this.description;
    }
    /**
     * ETag of the resource.
     * 
     */
    @Export(name="etag", type=String.class, parameters={})
    private Output<String> etag;

    /**
     * @return ETag of the resource.
     * 
     */
    public Output<String> getEtag() {
        return this.etag;
    }
    /**
     * The labels associated with this game server cluster. Each label is a key-value pair.
     * 
     */
    @Export(name="labels", type=Map.class, parameters={String.class, String.class})
    private Output<Map<String,String>> labels;

    /**
     * @return The labels associated with this game server cluster. Each label is a key-value pair.
     * 
     */
    public Output<Map<String,String>> getLabels() {
        return this.labels;
    }
    /**
     * The resource name of the game server cluster, in the following form: `projects/{project}/locations/{location}/realms/{realm}/gameServerClusters/{cluster}`. For example, `projects/my-project/locations/{location}/realms/zanzibar/gameServerClusters/my-onprem-cluster`.
     * 
     */
    @Export(name="name", type=String.class, parameters={})
    private Output<String> name;

    /**
     * @return The resource name of the game server cluster, in the following form: `projects/{project}/locations/{location}/realms/{realm}/gameServerClusters/{cluster}`. For example, `projects/my-project/locations/{location}/realms/zanzibar/gameServerClusters/my-onprem-cluster`.
     * 
     */
    public Output<String> getName() {
        return this.name;
    }
    /**
     * The last-modified time.
     * 
     */
    @Export(name="updateTime", type=String.class, parameters={})
    private Output<String> updateTime;

    /**
     * @return The last-modified time.
     * 
     */
    public Output<String> getUpdateTime() {
        return this.updateTime;
    }

    public interface BuilderApplicator {
        public void apply(GameServerClusterArgs.Builder a);
    }
    private static io.pulumi.googlenative.gameservices_v1beta.GameServerClusterArgs buildArgs(BuilderApplicator argsBuilder) {
        final var builder = io.pulumi.googlenative.gameservices_v1beta.GameServerClusterArgs.builder();
        argsBuilder.apply(builder);
        return builder.build();
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param argsBuilder A function that configures a passed builder.
     */
    public GameServerCluster(String name, BuilderApplicator argsBuilder) {
        this(name, buildArgs(argsBuilder), null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public GameServerCluster(String name) {
        this(name, GameServerClusterArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public GameServerCluster(String name, GameServerClusterArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public GameServerCluster(String name, GameServerClusterArgs args, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("google-native:gameservices/v1beta:GameServerCluster", name, args == null ? GameServerClusterArgs.Empty : args, makeResourceOptions(options, Output.empty()));
    }

    private GameServerCluster(String name, Output<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("google-native:gameservices/v1beta:GameServerCluster", name, null, makeResourceOptions(options, id));
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
    public static GameServerCluster get(String name, Output<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        return new GameServerCluster(name, id, options);
    }
}
