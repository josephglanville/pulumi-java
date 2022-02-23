// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.synapse;

import io.pulumi.azurenative.Utilities;
import io.pulumi.azurenative.synapse.SqlPoolArgs;
import io.pulumi.azurenative.synapse.outputs.SkuResponse;
import io.pulumi.core.Alias;
import io.pulumi.core.Input;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.OutputExport;
import io.pulumi.core.annotations.ResourceType;
import java.lang.Double;
import java.lang.String;
import java.util.List;
import java.util.Map;
import javax.annotation.Nullable;

/**
 * A SQL Analytics pool
 * API Version: 2021-03-01.
 * 
 * ## Example Usage
 * 
 * ## Import
 * 
 * An existing resource can be imported using its type token, name, and identifier, e.g.
 * 
 * ```sh
 * $ pulumi import azure-native:synapse:SqlPool ExampleSqlPool /subscriptions/01234567-89ab-4def-0123-456789abcdef/resourceGroups/ExampleResourceGroup/providers/Microsoft.Synapse/workspaces/ExampleWorkspaces/sqlPools/ExampleSqlPool 
 * ```
 * 
 */
@ResourceType(type="azure-native:synapse:SqlPool")
public class SqlPool extends io.pulumi.resources.CustomResource {
    /**
     * Collation mode
     * 
     */
    @OutputExport(name="collation", type=String.class, parameters={})
    private Output</* @Nullable */ String> collation;

    /**
     * @return Collation mode
     * 
     */
    public Output</* @Nullable */ String> getCollation() {
        return this.collation;
    }
    /**
     * Specifies the mode of sql pool creation.
     * 
     * Default: regular sql pool creation.
     * 
     * PointInTimeRestore: Creates a sql pool by restoring a point in time backup of an existing sql pool. sourceDatabaseId must be specified as the resource ID of the existing sql pool, and restorePointInTime must be specified.
     * 
     * Recovery: Creates a sql pool by a geo-replicated backup. sourceDatabaseId  must be specified as the recoverableDatabaseId to restore.
     * 
     * Restore: Creates a sql pool by restoring a backup of a deleted sql  pool. SourceDatabaseId should be the sql pool's original resource ID. SourceDatabaseId and sourceDatabaseDeletionDate must be specified.
     * 
     */
    @OutputExport(name="createMode", type=String.class, parameters={})
    private Output</* @Nullable */ String> createMode;

    /**
     * @return Specifies the mode of sql pool creation.
     * 
     * Default: regular sql pool creation.
     * 
     * PointInTimeRestore: Creates a sql pool by restoring a point in time backup of an existing sql pool. sourceDatabaseId must be specified as the resource ID of the existing sql pool, and restorePointInTime must be specified.
     * 
     * Recovery: Creates a sql pool by a geo-replicated backup. sourceDatabaseId  must be specified as the recoverableDatabaseId to restore.
     * 
     * Restore: Creates a sql pool by restoring a backup of a deleted sql  pool. SourceDatabaseId should be the sql pool's original resource ID. SourceDatabaseId and sourceDatabaseDeletionDate must be specified.
     * 
     */
    public Output</* @Nullable */ String> getCreateMode() {
        return this.createMode;
    }
    /**
     * Date the SQL pool was created
     * 
     */
    @OutputExport(name="creationDate", type=String.class, parameters={})
    private Output</* @Nullable */ String> creationDate;

    /**
     * @return Date the SQL pool was created
     * 
     */
    public Output</* @Nullable */ String> getCreationDate() {
        return this.creationDate;
    }
    /**
     * The geo-location where the resource lives
     * 
     */
    @OutputExport(name="location", type=String.class, parameters={})
    private Output<String> location;

    /**
     * @return The geo-location where the resource lives
     * 
     */
    public Output<String> getLocation() {
        return this.location;
    }
    /**
     * Maximum size in bytes
     * 
     */
    @OutputExport(name="maxSizeBytes", type=Double.class, parameters={})
    private Output</* @Nullable */ Double> maxSizeBytes;

    /**
     * @return Maximum size in bytes
     * 
     */
    public Output</* @Nullable */ Double> getMaxSizeBytes() {
        return this.maxSizeBytes;
    }
    /**
     * The name of the resource
     * 
     */
    @OutputExport(name="name", type=String.class, parameters={})
    private Output<String> name;

    /**
     * @return The name of the resource
     * 
     */
    public Output<String> getName() {
        return this.name;
    }
    /**
     * Resource state
     * 
     */
    @OutputExport(name="provisioningState", type=String.class, parameters={})
    private Output</* @Nullable */ String> provisioningState;

    /**
     * @return Resource state
     * 
     */
    public Output</* @Nullable */ String> getProvisioningState() {
        return this.provisioningState;
    }
    /**
     * Backup database to restore from
     * 
     */
    @OutputExport(name="recoverableDatabaseId", type=String.class, parameters={})
    private Output</* @Nullable */ String> recoverableDatabaseId;

    /**
     * @return Backup database to restore from
     * 
     */
    public Output</* @Nullable */ String> getRecoverableDatabaseId() {
        return this.recoverableDatabaseId;
    }
    /**
     * Snapshot time to restore
     * 
     */
    @OutputExport(name="restorePointInTime", type=String.class, parameters={})
    private Output</* @Nullable */ String> restorePointInTime;

    /**
     * @return Snapshot time to restore
     * 
     */
    public Output</* @Nullable */ String> getRestorePointInTime() {
        return this.restorePointInTime;
    }
    /**
     * SQL pool SKU
     * 
     */
    @OutputExport(name="sku", type=SkuResponse.class, parameters={})
    private Output</* @Nullable */ SkuResponse> sku;

    /**
     * @return SQL pool SKU
     * 
     */
    public Output</* @Nullable */ SkuResponse> getSku() {
        return this.sku;
    }
    /**
     * Source database to create from
     * 
     */
    @OutputExport(name="sourceDatabaseId", type=String.class, parameters={})
    private Output</* @Nullable */ String> sourceDatabaseId;

    /**
     * @return Source database to create from
     * 
     */
    public Output</* @Nullable */ String> getSourceDatabaseId() {
        return this.sourceDatabaseId;
    }
    /**
     * Resource status
     * 
     */
    @OutputExport(name="status", type=String.class, parameters={})
    private Output</* @Nullable */ String> status;

    /**
     * @return Resource status
     * 
     */
    public Output</* @Nullable */ String> getStatus() {
        return this.status;
    }
    /**
     * The storage account type used to store backups for this sql pool.
     * 
     */
    @OutputExport(name="storageAccountType", type=String.class, parameters={})
    private Output</* @Nullable */ String> storageAccountType;

    /**
     * @return The storage account type used to store backups for this sql pool.
     * 
     */
    public Output</* @Nullable */ String> getStorageAccountType() {
        return this.storageAccountType;
    }
    /**
     * Resource tags.
     * 
     */
    @OutputExport(name="tags", type=Map.class, parameters={String.class, String.class})
    private Output</* @Nullable */ Map<String,String>> tags;

    /**
     * @return Resource tags.
     * 
     */
    public Output</* @Nullable */ Map<String,String>> getTags() {
        return this.tags;
    }
    /**
     * The type of the resource. E.g. "Microsoft.Compute/virtualMachines" or "Microsoft.Storage/storageAccounts"
     * 
     */
    @OutputExport(name="type", type=String.class, parameters={})
    private Output<String> type;

    /**
     * @return The type of the resource. E.g. "Microsoft.Compute/virtualMachines" or "Microsoft.Storage/storageAccounts"
     * 
     */
    public Output<String> getType() {
        return this.type;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public SqlPool(String name) {
        this(name, SqlPoolArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public SqlPool(String name, SqlPoolArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public SqlPool(String name, SqlPoolArgs args, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("azure-native:synapse:SqlPool", name, args == null ? SqlPoolArgs.Empty : args, makeResourceOptions(options, Input.empty()));
    }

    private SqlPool(String name, Input<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("azure-native:synapse:SqlPool", name, null, makeResourceOptions(options, id));
    }

    private static io.pulumi.resources.CustomResourceOptions makeResourceOptions(@Nullable io.pulumi.resources.CustomResourceOptions options, @Nullable Input<String> id) {
        var defaultOptions = io.pulumi.resources.CustomResourceOptions.builder()
            .setVersion(Utilities.getVersion())
            .setAliases(List.of(
                Input.of(Alias.builder().setType("azure-native:synapse/v20190601preview:SqlPool").build()),
                Input.of(Alias.builder().setType("azure-native:synapse/v20200401preview:SqlPool").build()),
                Input.of(Alias.builder().setType("azure-native:synapse/v20201201:SqlPool").build()),
                Input.of(Alias.builder().setType("azure-native:synapse/v20210301:SqlPool").build()),
                Input.of(Alias.builder().setType("azure-native:synapse/v20210401preview:SqlPool").build()),
                Input.of(Alias.builder().setType("azure-native:synapse/v20210501:SqlPool").build()),
                Input.of(Alias.builder().setType("azure-native:synapse/v20210601:SqlPool").build()),
                Input.of(Alias.builder().setType("azure-native:synapse/v20210601preview:SqlPool").build())
            ))
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
    public static SqlPool get(String name, Input<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        return new SqlPool(name, id, options);
    }
}
