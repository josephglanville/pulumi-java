// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.sql;

import io.pulumi.azurenative.Utilities;
import io.pulumi.azurenative.sql.SyncGroupArgs;
import io.pulumi.azurenative.sql.outputs.SkuResponse;
import io.pulumi.azurenative.sql.outputs.SyncGroupSchemaResponse;
import io.pulumi.core.Alias;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.Export;
import io.pulumi.core.annotations.ResourceType;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import javax.annotation.Nullable;

/**
 * An Azure SQL Database sync group.
 * API Version: 2020-11-01-preview.
 * 
 * ## Example Usage
 * 
 * ## Import
 * 
 * An existing resource can be imported using its type token, name, and identifier, e.g.
 * 
 * ```sh
 * $ pulumi import azure-native:sql:SyncGroup syncgroupcrud-3187 /subscriptions/00000000-1111-2222-3333-444444444444/resourceGroups/syncgroupcrud-3521/providers/Microsoft.Sql/servers/syncgroupcrud-8475/databases/syncgroupcrud-4328/syncGroups/syncgroupcrud-3187 
 * ```
 * 
 */
@ResourceType(type="azure-native:sql:SyncGroup")
public class SyncGroup extends io.pulumi.resources.CustomResource {
    /**
     * Conflict logging retention period.
     * 
     */
    @Export(name="conflictLoggingRetentionInDays", type=Integer.class, parameters={})
    private Output</* @Nullable */ Integer> conflictLoggingRetentionInDays;

    /**
     * @return Conflict logging retention period.
     * 
     */
    public Output</* @Nullable */ Integer> getConflictLoggingRetentionInDays() {
        return this.conflictLoggingRetentionInDays;
    }
    /**
     * Conflict resolution policy of the sync group.
     * 
     */
    @Export(name="conflictResolutionPolicy", type=String.class, parameters={})
    private Output</* @Nullable */ String> conflictResolutionPolicy;

    /**
     * @return Conflict resolution policy of the sync group.
     * 
     */
    public Output</* @Nullable */ String> getConflictResolutionPolicy() {
        return this.conflictResolutionPolicy;
    }
    /**
     * If conflict logging is enabled.
     * 
     */
    @Export(name="enableConflictLogging", type=Boolean.class, parameters={})
    private Output</* @Nullable */ Boolean> enableConflictLogging;

    /**
     * @return If conflict logging is enabled.
     * 
     */
    public Output</* @Nullable */ Boolean> getEnableConflictLogging() {
        return this.enableConflictLogging;
    }
    /**
     * User name for the sync group hub database credential.
     * 
     */
    @Export(name="hubDatabaseUserName", type=String.class, parameters={})
    private Output</* @Nullable */ String> hubDatabaseUserName;

    /**
     * @return User name for the sync group hub database credential.
     * 
     */
    public Output</* @Nullable */ String> getHubDatabaseUserName() {
        return this.hubDatabaseUserName;
    }
    /**
     * Sync interval of the sync group.
     * 
     */
    @Export(name="interval", type=Integer.class, parameters={})
    private Output</* @Nullable */ Integer> interval;

    /**
     * @return Sync interval of the sync group.
     * 
     */
    public Output</* @Nullable */ Integer> getInterval() {
        return this.interval;
    }
    /**
     * Last sync time of the sync group.
     * 
     */
    @Export(name="lastSyncTime", type=String.class, parameters={})
    private Output<String> lastSyncTime;

    /**
     * @return Last sync time of the sync group.
     * 
     */
    public Output<String> getLastSyncTime() {
        return this.lastSyncTime;
    }
    /**
     * Resource name.
     * 
     */
    @Export(name="name", type=String.class, parameters={})
    private Output<String> name;

    /**
     * @return Resource name.
     * 
     */
    public Output<String> getName() {
        return this.name;
    }
    /**
     * Private endpoint name of the sync group if use private link connection is enabled.
     * 
     */
    @Export(name="privateEndpointName", type=String.class, parameters={})
    private Output<String> privateEndpointName;

    /**
     * @return Private endpoint name of the sync group if use private link connection is enabled.
     * 
     */
    public Output<String> getPrivateEndpointName() {
        return this.privateEndpointName;
    }
    /**
     * Sync schema of the sync group.
     * 
     */
    @Export(name="schema", type=SyncGroupSchemaResponse.class, parameters={})
    private Output</* @Nullable */ SyncGroupSchemaResponse> schema;

    /**
     * @return Sync schema of the sync group.
     * 
     */
    public Output</* @Nullable */ SyncGroupSchemaResponse> getSchema() {
        return this.schema;
    }
    /**
     * The name and capacity of the SKU.
     * 
     */
    @Export(name="sku", type=SkuResponse.class, parameters={})
    private Output</* @Nullable */ SkuResponse> sku;

    /**
     * @return The name and capacity of the SKU.
     * 
     */
    public Output</* @Nullable */ SkuResponse> getSku() {
        return this.sku;
    }
    /**
     * ARM resource id of the sync database in the sync group.
     * 
     */
    @Export(name="syncDatabaseId", type=String.class, parameters={})
    private Output</* @Nullable */ String> syncDatabaseId;

    /**
     * @return ARM resource id of the sync database in the sync group.
     * 
     */
    public Output</* @Nullable */ String> getSyncDatabaseId() {
        return this.syncDatabaseId;
    }
    /**
     * Sync state of the sync group.
     * 
     */
    @Export(name="syncState", type=String.class, parameters={})
    private Output<String> syncState;

    /**
     * @return Sync state of the sync group.
     * 
     */
    public Output<String> getSyncState() {
        return this.syncState;
    }
    /**
     * Resource type.
     * 
     */
    @Export(name="type", type=String.class, parameters={})
    private Output<String> type;

    /**
     * @return Resource type.
     * 
     */
    public Output<String> getType() {
        return this.type;
    }
    /**
     * If use private link connection is enabled.
     * 
     */
    @Export(name="usePrivateLinkConnection", type=Boolean.class, parameters={})
    private Output</* @Nullable */ Boolean> usePrivateLinkConnection;

    /**
     * @return If use private link connection is enabled.
     * 
     */
    public Output</* @Nullable */ Boolean> getUsePrivateLinkConnection() {
        return this.usePrivateLinkConnection;
    }

    public interface BuilderApplicator {
        public void apply(SyncGroupArgs.Builder a);
    }
    private static io.pulumi.azurenative.sql.SyncGroupArgs buildArgs(BuilderApplicator argsBuilder) {
        final var builder = io.pulumi.azurenative.sql.SyncGroupArgs.builder();
        argsBuilder.apply(builder);
        return builder.build();
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param argsBuilder A function that configures a passed builder.
     */
    public SyncGroup(String name, BuilderApplicator argsBuilder) {
        this(name, buildArgs(argsBuilder), null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public SyncGroup(String name) {
        this(name, SyncGroupArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public SyncGroup(String name, SyncGroupArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public SyncGroup(String name, SyncGroupArgs args, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("azure-native:sql:SyncGroup", name, args == null ? SyncGroupArgs.Empty : args, makeResourceOptions(options, Output.empty()));
    }

    private SyncGroup(String name, Output<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("azure-native:sql:SyncGroup", name, null, makeResourceOptions(options, id));
    }

    private static io.pulumi.resources.CustomResourceOptions makeResourceOptions(@Nullable io.pulumi.resources.CustomResourceOptions options, @Nullable Output<String> id) {
        var defaultOptions = io.pulumi.resources.CustomResourceOptions.builder()
            .version(Utilities.getVersion())
            .aliases(List.of(
                Output.of(Alias.builder().type("azure-native:sql/v20150501preview:SyncGroup").build()),
                Output.of(Alias.builder().type("azure-native:sql/v20190601preview:SyncGroup").build()),
                Output.of(Alias.builder().type("azure-native:sql/v20200202preview:SyncGroup").build()),
                Output.of(Alias.builder().type("azure-native:sql/v20200801preview:SyncGroup").build()),
                Output.of(Alias.builder().type("azure-native:sql/v20201101preview:SyncGroup").build()),
                Output.of(Alias.builder().type("azure-native:sql/v20210201preview:SyncGroup").build()),
                Output.of(Alias.builder().type("azure-native:sql/v20210501preview:SyncGroup").build()),
                Output.of(Alias.builder().type("azure-native:sql/v20210801preview:SyncGroup").build())
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
    public static SyncGroup get(String name, Output<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        return new SyncGroup(name, id, options);
    }
}
