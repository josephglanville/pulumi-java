// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.docdb;

import io.pulumi.aws.Utilities;
import io.pulumi.aws.docdb.ClusterInstanceArgs;
import io.pulumi.aws.docdb.inputs.ClusterInstanceState;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.Export;
import io.pulumi.core.annotations.ResourceType;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.Map;
import javax.annotation.Nullable;

/**
 * Provides an DocDB Cluster Resource Instance. A Cluster Instance Resource defines
 * attributes that are specific to a single instance in a [DocDB Cluster](https://www.terraform.io/docs/providers/aws/r/docdb_cluster.html).
 * 
 * You do not designate a primary and subsequent replicas. Instead, you simply add DocDB
 * Instances and DocDB manages the replication. You can use the [count](https://www.terraform.io/docs/configuration/meta-arguments/count.html)
 * meta-parameter to make multiple instances and join them all to the same DocDB
 * Cluster, or you may specify different Cluster Instance resources with various
 * `instance_class` sizes.
 * 
 * ## Example Usage
 * 
 * ## Import
 * 
 * DocDB Cluster Instances can be imported using the `identifier`, e.g.,
 * 
 * ```sh
 *  $ pulumi import aws:docdb/clusterInstance:ClusterInstance prod_instance_1 aurora-cluster-instance-1
 * ```
 * 
 */
@ResourceType(type="aws:docdb/clusterInstance:ClusterInstance")
public class ClusterInstance extends io.pulumi.resources.CustomResource {
    /**
     * Specifies whether any database modifications
     * are applied immediately, or during the next maintenance window. Default is`false`.
     * 
     */
    @Export(name="applyImmediately", type=Boolean.class, parameters={})
    private Output<Boolean> applyImmediately;

    /**
     * @return Specifies whether any database modifications
     * are applied immediately, or during the next maintenance window. Default is`false`.
     * 
     */
    public Output<Boolean> getApplyImmediately() {
        return this.applyImmediately;
    }
    /**
     * Amazon Resource Name (ARN) of cluster instance
     * 
     */
    @Export(name="arn", type=String.class, parameters={})
    private Output<String> arn;

    /**
     * @return Amazon Resource Name (ARN) of cluster instance
     * 
     */
    public Output<String> getArn() {
        return this.arn;
    }
    /**
     * Indicates that minor engine upgrades will be applied automatically to the DB instance during the maintenance window. Default `true`.
     * 
     */
    @Export(name="autoMinorVersionUpgrade", type=Boolean.class, parameters={})
    private Output</* @Nullable */ Boolean> autoMinorVersionUpgrade;

    /**
     * @return Indicates that minor engine upgrades will be applied automatically to the DB instance during the maintenance window. Default `true`.
     * 
     */
    public Output</* @Nullable */ Boolean> getAutoMinorVersionUpgrade() {
        return this.autoMinorVersionUpgrade;
    }
    /**
     * The EC2 Availability Zone that the DB instance is created in. See [docs](https://docs.aws.amazon.com/documentdb/latest/developerguide/API_CreateDBInstance.html) about the details.
     * 
     */
    @Export(name="availabilityZone", type=String.class, parameters={})
    private Output<String> availabilityZone;

    /**
     * @return The EC2 Availability Zone that the DB instance is created in. See [docs](https://docs.aws.amazon.com/documentdb/latest/developerguide/API_CreateDBInstance.html) about the details.
     * 
     */
    public Output<String> getAvailabilityZone() {
        return this.availabilityZone;
    }
    /**
     * (Optional) The identifier of the CA certificate for the DB instance.
     * 
     */
    @Export(name="caCertIdentifier", type=String.class, parameters={})
    private Output<String> caCertIdentifier;

    /**
     * @return (Optional) The identifier of the CA certificate for the DB instance.
     * 
     */
    public Output<String> getCaCertIdentifier() {
        return this.caCertIdentifier;
    }
    /**
     * The identifier of the `aws.docdb.Cluster` in which to launch this instance.
     * 
     */
    @Export(name="clusterIdentifier", type=String.class, parameters={})
    private Output<String> clusterIdentifier;

    /**
     * @return The identifier of the `aws.docdb.Cluster` in which to launch this instance.
     * 
     */
    public Output<String> getClusterIdentifier() {
        return this.clusterIdentifier;
    }
    /**
     * The DB subnet group to associate with this DB instance.
     * 
     */
    @Export(name="dbSubnetGroupName", type=String.class, parameters={})
    private Output<String> dbSubnetGroupName;

    /**
     * @return The DB subnet group to associate with this DB instance.
     * 
     */
    public Output<String> getDbSubnetGroupName() {
        return this.dbSubnetGroupName;
    }
    /**
     * The region-unique, immutable identifier for the DB instance.
     * 
     */
    @Export(name="dbiResourceId", type=String.class, parameters={})
    private Output<String> dbiResourceId;

    /**
     * @return The region-unique, immutable identifier for the DB instance.
     * 
     */
    public Output<String> getDbiResourceId() {
        return this.dbiResourceId;
    }
    /**
     * The DNS address for this instance. May not be writable
     * 
     */
    @Export(name="endpoint", type=String.class, parameters={})
    private Output<String> endpoint;

    /**
     * @return The DNS address for this instance. May not be writable
     * 
     */
    public Output<String> getEndpoint() {
        return this.endpoint;
    }
    /**
     * The name of the database engine to be used for the DocDB instance. Defaults to `docdb`. Valid Values: `docdb`.
     * 
     */
    @Export(name="engine", type=String.class, parameters={})
    private Output</* @Nullable */ String> engine;

    /**
     * @return The name of the database engine to be used for the DocDB instance. Defaults to `docdb`. Valid Values: `docdb`.
     * 
     */
    public Output</* @Nullable */ String> getEngine() {
        return this.engine;
    }
    /**
     * The database engine version
     * 
     */
    @Export(name="engineVersion", type=String.class, parameters={})
    private Output<String> engineVersion;

    /**
     * @return The database engine version
     * 
     */
    public Output<String> getEngineVersion() {
        return this.engineVersion;
    }
    /**
     * The identifier for the DocDB instance, if omitted, this provider will assign a random, unique identifier.
     * 
     */
    @Export(name="identifier", type=String.class, parameters={})
    private Output<String> identifier;

    /**
     * @return The identifier for the DocDB instance, if omitted, this provider will assign a random, unique identifier.
     * 
     */
    public Output<String> getIdentifier() {
        return this.identifier;
    }
    /**
     * Creates a unique identifier beginning with the specified prefix. Conflicts with `identifier`.
     * 
     */
    @Export(name="identifierPrefix", type=String.class, parameters={})
    private Output<String> identifierPrefix;

    /**
     * @return Creates a unique identifier beginning with the specified prefix. Conflicts with `identifier`.
     * 
     */
    public Output<String> getIdentifierPrefix() {
        return this.identifierPrefix;
    }
    /**
     * The instance class to use. For details on CPU and memory, see [Scaling for DocDB Instances](https://docs.aws.amazon.com/documentdb/latest/developerguide/db-cluster-manage-performance.html#db-cluster-manage-scaling-instance). DocDB currently
     * supports the below instance classes. Please see [AWS Documentation](https://docs.aws.amazon.com/documentdb/latest/developerguide/db-instance-classes.html#db-instance-class-specs) for complete details.
     * - db.r5.large
     * - db.r5.xlarge
     * - db.r5.2xlarge
     * - db.r5.4xlarge
     * - db.r5.12xlarge
     * - db.r5.24xlarge
     * - db.r4.large
     * - db.r4.xlarge
     * - db.r4.2xlarge
     * - db.r4.4xlarge
     * - db.r4.8xlarge
     * - db.r4.16xlarge
     * - db.t3.medium
     * 
     */
    @Export(name="instanceClass", type=String.class, parameters={})
    private Output<String> instanceClass;

    /**
     * @return The instance class to use. For details on CPU and memory, see [Scaling for DocDB Instances](https://docs.aws.amazon.com/documentdb/latest/developerguide/db-cluster-manage-performance.html#db-cluster-manage-scaling-instance). DocDB currently
     * supports the below instance classes. Please see [AWS Documentation](https://docs.aws.amazon.com/documentdb/latest/developerguide/db-instance-classes.html#db-instance-class-specs) for complete details.
     * - db.r5.large
     * - db.r5.xlarge
     * - db.r5.2xlarge
     * - db.r5.4xlarge
     * - db.r5.12xlarge
     * - db.r5.24xlarge
     * - db.r4.large
     * - db.r4.xlarge
     * - db.r4.2xlarge
     * - db.r4.4xlarge
     * - db.r4.8xlarge
     * - db.r4.16xlarge
     * - db.t3.medium
     * 
     */
    public Output<String> getInstanceClass() {
        return this.instanceClass;
    }
    /**
     * The ARN for the KMS encryption key if one is set to the cluster.
     * 
     */
    @Export(name="kmsKeyId", type=String.class, parameters={})
    private Output<String> kmsKeyId;

    /**
     * @return The ARN for the KMS encryption key if one is set to the cluster.
     * 
     */
    public Output<String> getKmsKeyId() {
        return this.kmsKeyId;
    }
    /**
     * The database port
     * 
     */
    @Export(name="port", type=Integer.class, parameters={})
    private Output<Integer> port;

    /**
     * @return The database port
     * 
     */
    public Output<Integer> getPort() {
        return this.port;
    }
    /**
     * The daily time range during which automated backups are created if automated backups are enabled.
     * 
     */
    @Export(name="preferredBackupWindow", type=String.class, parameters={})
    private Output<String> preferredBackupWindow;

    /**
     * @return The daily time range during which automated backups are created if automated backups are enabled.
     * 
     */
    public Output<String> getPreferredBackupWindow() {
        return this.preferredBackupWindow;
    }
    /**
     * The window to perform maintenance in.
     * Syntax: "ddd:hh24:mi-ddd:hh24:mi". Eg: "Mon:00:00-Mon:03:00".
     * 
     */
    @Export(name="preferredMaintenanceWindow", type=String.class, parameters={})
    private Output<String> preferredMaintenanceWindow;

    /**
     * @return The window to perform maintenance in.
     * Syntax: "ddd:hh24:mi-ddd:hh24:mi". Eg: "Mon:00:00-Mon:03:00".
     * 
     */
    public Output<String> getPreferredMaintenanceWindow() {
        return this.preferredMaintenanceWindow;
    }
    /**
     * Default 0. Failover Priority setting on instance level. The reader who has lower tier has higher priority to get promoter to writer.
     * 
     */
    @Export(name="promotionTier", type=Integer.class, parameters={})
    private Output</* @Nullable */ Integer> promotionTier;

    /**
     * @return Default 0. Failover Priority setting on instance level. The reader who has lower tier has higher priority to get promoter to writer.
     * 
     */
    public Output</* @Nullable */ Integer> getPromotionTier() {
        return this.promotionTier;
    }
    @Export(name="publiclyAccessible", type=Boolean.class, parameters={})
    private Output<Boolean> publiclyAccessible;

    public Output<Boolean> getPubliclyAccessible() {
        return this.publiclyAccessible;
    }
    /**
     * Specifies whether the DB cluster is encrypted.
     * 
     */
    @Export(name="storageEncrypted", type=Boolean.class, parameters={})
    private Output<Boolean> storageEncrypted;

    /**
     * @return Specifies whether the DB cluster is encrypted.
     * 
     */
    public Output<Boolean> getStorageEncrypted() {
        return this.storageEncrypted;
    }
    /**
     * A map of tags to assign to the instance. .If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
     * 
     */
    @Export(name="tags", type=Map.class, parameters={String.class, String.class})
    private Output</* @Nullable */ Map<String,String>> tags;

    /**
     * @return A map of tags to assign to the instance. .If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
     * 
     */
    public Output</* @Nullable */ Map<String,String>> getTags() {
        return this.tags;
    }
    /**
     * A map of tags assigned to the resource, including those inherited from the provider .
     * 
     */
    @Export(name="tagsAll", type=Map.class, parameters={String.class, String.class})
    private Output<Map<String,String>> tagsAll;

    /**
     * @return A map of tags assigned to the resource, including those inherited from the provider .
     * 
     */
    public Output<Map<String,String>> getTagsAll() {
        return this.tagsAll;
    }
    /**
     * Boolean indicating if this instance is writable. `False` indicates this instance is a read replica.
     * 
     */
    @Export(name="writer", type=Boolean.class, parameters={})
    private Output<Boolean> writer;

    /**
     * @return Boolean indicating if this instance is writable. `False` indicates this instance is a read replica.
     * 
     */
    public Output<Boolean> getWriter() {
        return this.writer;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public ClusterInstance(String name) {
        this(name, ClusterInstanceArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public ClusterInstance(String name, ClusterInstanceArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public ClusterInstance(String name, ClusterInstanceArgs args, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("aws:docdb/clusterInstance:ClusterInstance", name, args == null ? ClusterInstanceArgs.Empty : args, makeResourceOptions(options, Output.empty()));
    }

    private ClusterInstance(String name, Output<String> id, @Nullable ClusterInstanceState state, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("aws:docdb/clusterInstance:ClusterInstance", name, state, makeResourceOptions(options, id));
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
    public static ClusterInstance get(String name, Output<String> id, @Nullable ClusterInstanceState state, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        return new ClusterInstance(name, id, state, options);
    }
}