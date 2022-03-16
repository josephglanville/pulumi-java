// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.elasticache;

import io.pulumi.awsnative.Utilities;
import io.pulumi.awsnative.elasticache.GlobalReplicationGroupArgs;
import io.pulumi.awsnative.elasticache.outputs.GlobalReplicationGroupMember;
import io.pulumi.awsnative.elasticache.outputs.GlobalReplicationGroupRegionalConfiguration;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.Export;
import io.pulumi.core.annotations.ResourceType;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import javax.annotation.Nullable;

/**
 * The AWS::ElastiCache::GlobalReplicationGroup resource creates an Amazon ElastiCache Global Replication Group.
 * 
 */
@ResourceType(type="aws-native:elasticache:GlobalReplicationGroup")
public class GlobalReplicationGroup extends io.pulumi.resources.CustomResource {
    /**
     * AutomaticFailoverEnabled
     * 
     */
    @Export(name="automaticFailoverEnabled", type=Boolean.class, parameters={})
    private Output</* @Nullable */ Boolean> automaticFailoverEnabled;

    /**
     * @return AutomaticFailoverEnabled
     * 
     */
    public Output</* @Nullable */ Boolean> getAutomaticFailoverEnabled() {
        return this.automaticFailoverEnabled;
    }
    /**
     * The cache node type of the Global Datastore
     * 
     */
    @Export(name="cacheNodeType", type=String.class, parameters={})
    private Output</* @Nullable */ String> cacheNodeType;

    /**
     * @return The cache node type of the Global Datastore
     * 
     */
    public Output</* @Nullable */ String> getCacheNodeType() {
        return this.cacheNodeType;
    }
    /**
     * Cache parameter group name to use for the new engine version. This parameter cannot be modified independently.
     * 
     */
    @Export(name="cacheParameterGroupName", type=String.class, parameters={})
    private Output</* @Nullable */ String> cacheParameterGroupName;

    /**
     * @return Cache parameter group name to use for the new engine version. This parameter cannot be modified independently.
     * 
     */
    public Output</* @Nullable */ String> getCacheParameterGroupName() {
        return this.cacheParameterGroupName;
    }
    /**
     * The engine version of the Global Datastore.
     * 
     */
    @Export(name="engineVersion", type=String.class, parameters={})
    private Output</* @Nullable */ String> engineVersion;

    /**
     * @return The engine version of the Global Datastore.
     * 
     */
    public Output</* @Nullable */ String> getEngineVersion() {
        return this.engineVersion;
    }
    /**
     * Indicates the number of node groups in the Global Datastore.
     * 
     */
    @Export(name="globalNodeGroupCount", type=Integer.class, parameters={})
    private Output</* @Nullable */ Integer> globalNodeGroupCount;

    /**
     * @return Indicates the number of node groups in the Global Datastore.
     * 
     */
    public Output</* @Nullable */ Integer> getGlobalNodeGroupCount() {
        return this.globalNodeGroupCount;
    }
    /**
     * The optional description of the Global Datastore
     * 
     */
    @Export(name="globalReplicationGroupDescription", type=String.class, parameters={})
    private Output</* @Nullable */ String> globalReplicationGroupDescription;

    /**
     * @return The optional description of the Global Datastore
     * 
     */
    public Output</* @Nullable */ String> getGlobalReplicationGroupDescription() {
        return this.globalReplicationGroupDescription;
    }
    /**
     * The name of the Global Datastore, it is generated by ElastiCache adding a prefix to GlobalReplicationGroupIdSuffix.
     * 
     */
    @Export(name="globalReplicationGroupId", type=String.class, parameters={})
    private Output<String> globalReplicationGroupId;

    /**
     * @return The name of the Global Datastore, it is generated by ElastiCache adding a prefix to GlobalReplicationGroupIdSuffix.
     * 
     */
    public Output<String> getGlobalReplicationGroupId() {
        return this.globalReplicationGroupId;
    }
    /**
     * The suffix name of a Global Datastore. Amazon ElastiCache automatically applies a prefix to the Global Datastore ID when it is created. Each AWS Region has its own prefix.
     * 
     */
    @Export(name="globalReplicationGroupIdSuffix", type=String.class, parameters={})
    private Output</* @Nullable */ String> globalReplicationGroupIdSuffix;

    /**
     * @return The suffix name of a Global Datastore. Amazon ElastiCache automatically applies a prefix to the Global Datastore ID when it is created. Each AWS Region has its own prefix.
     * 
     */
    public Output</* @Nullable */ String> getGlobalReplicationGroupIdSuffix() {
        return this.globalReplicationGroupIdSuffix;
    }
    /**
     * The replication groups that comprise the Global Datastore.
     * 
     */
    @Export(name="members", type=List.class, parameters={GlobalReplicationGroupMember.class})
    private Output<List<GlobalReplicationGroupMember>> members;

    /**
     * @return The replication groups that comprise the Global Datastore.
     * 
     */
    public Output<List<GlobalReplicationGroupMember>> getMembers() {
        return this.members;
    }
    /**
     * Describes the replication group IDs, the AWS regions where they are stored and the shard configuration for each that comprise the Global Datastore
     * 
     */
    @Export(name="regionalConfigurations", type=List.class, parameters={GlobalReplicationGroupRegionalConfiguration.class})
    private Output</* @Nullable */ List<GlobalReplicationGroupRegionalConfiguration>> regionalConfigurations;

    /**
     * @return Describes the replication group IDs, the AWS regions where they are stored and the shard configuration for each that comprise the Global Datastore
     * 
     */
    public Output</* @Nullable */ List<GlobalReplicationGroupRegionalConfiguration>> getRegionalConfigurations() {
        return this.regionalConfigurations;
    }
    /**
     * The status of the Global Datastore
     * 
     */
    @Export(name="status", type=String.class, parameters={})
    private Output<String> status;

    /**
     * @return The status of the Global Datastore
     * 
     */
    public Output<String> getStatus() {
        return this.status;
    }

    public interface BuilderApplicator {
        public void apply(GlobalReplicationGroupArgs.Builder a);
    }
    private static io.pulumi.awsnative.elasticache.GlobalReplicationGroupArgs buildArgs(BuilderApplicator argsBuilder) {
        final var builder = io.pulumi.awsnative.elasticache.GlobalReplicationGroupArgs.builder();
        argsBuilder.apply(builder);
        return builder.build();
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param argsBuilder A function that configures a passed builder.
     */
    public GlobalReplicationGroup(String name, BuilderApplicator argsBuilder) {
        this(name, buildArgs(argsBuilder), null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public GlobalReplicationGroup(String name) {
        this(name, GlobalReplicationGroupArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public GlobalReplicationGroup(String name, GlobalReplicationGroupArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public GlobalReplicationGroup(String name, GlobalReplicationGroupArgs args, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("aws-native:elasticache:GlobalReplicationGroup", name, args == null ? GlobalReplicationGroupArgs.Empty : args, makeResourceOptions(options, Output.empty()));
    }

    private GlobalReplicationGroup(String name, Output<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("aws-native:elasticache:GlobalReplicationGroup", name, null, makeResourceOptions(options, id));
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
    public static GlobalReplicationGroup get(String name, Output<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        return new GlobalReplicationGroup(name, id, options);
    }
}
