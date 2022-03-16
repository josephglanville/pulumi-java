// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.sql;

import io.pulumi.azurenative.Utilities;
import io.pulumi.azurenative.sql.SyncMemberArgs;
import io.pulumi.core.Alias;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.Export;
import io.pulumi.core.annotations.ResourceType;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import javax.annotation.Nullable;

/**
 * An Azure SQL Database sync member.
 * API Version: 2020-11-01-preview.
 * 
 * ## Example Usage
 * 
 * ## Import
 * 
 * An existing resource can be imported using its type token, name, and identifier, e.g.
 * 
 * ```sh
 * $ pulumi import azure-native:sql:SyncMember syncmembercrud-4879 /subscriptions/00000000-1111-2222-3333-444444444444/resourceGroups/syncgroupcrud-65440/providers/Microsoft.Sql/servers/syncgroupcrud-8475/databases/syncgroupcrud-4328/syncGroups/syncgroupcrud-3187/syncMembers/syncmembercrud-4879 
 * ```
 * 
 */
@ResourceType(type="azure-native:sql:SyncMember")
public class SyncMember extends io.pulumi.resources.CustomResource {
    /**
     * Database name of the member database in the sync member.
     * 
     */
    @Export(name="databaseName", type=String.class, parameters={})
    private Output</* @Nullable */ String> databaseName;

    /**
     * @return Database name of the member database in the sync member.
     * 
     */
    public Output</* @Nullable */ String> getDatabaseName() {
        return this.databaseName;
    }
    /**
     * Database type of the sync member.
     * 
     */
    @Export(name="databaseType", type=String.class, parameters={})
    private Output</* @Nullable */ String> databaseType;

    /**
     * @return Database type of the sync member.
     * 
     */
    public Output</* @Nullable */ String> getDatabaseType() {
        return this.databaseType;
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
     * Private endpoint name of the sync member if use private link connection is enabled, for sync members in Azure.
     * 
     */
    @Export(name="privateEndpointName", type=String.class, parameters={})
    private Output<String> privateEndpointName;

    /**
     * @return Private endpoint name of the sync member if use private link connection is enabled, for sync members in Azure.
     * 
     */
    public Output<String> getPrivateEndpointName() {
        return this.privateEndpointName;
    }
    /**
     * Server name of the member database in the sync member
     * 
     */
    @Export(name="serverName", type=String.class, parameters={})
    private Output</* @Nullable */ String> serverName;

    /**
     * @return Server name of the member database in the sync member
     * 
     */
    public Output</* @Nullable */ String> getServerName() {
        return this.serverName;
    }
    /**
     * SQL Server database id of the sync member.
     * 
     */
    @Export(name="sqlServerDatabaseId", type=String.class, parameters={})
    private Output</* @Nullable */ String> sqlServerDatabaseId;

    /**
     * @return SQL Server database id of the sync member.
     * 
     */
    public Output</* @Nullable */ String> getSqlServerDatabaseId() {
        return this.sqlServerDatabaseId;
    }
    /**
     * ARM resource id of the sync agent in the sync member.
     * 
     */
    @Export(name="syncAgentId", type=String.class, parameters={})
    private Output</* @Nullable */ String> syncAgentId;

    /**
     * @return ARM resource id of the sync agent in the sync member.
     * 
     */
    public Output</* @Nullable */ String> getSyncAgentId() {
        return this.syncAgentId;
    }
    /**
     * Sync direction of the sync member.
     * 
     */
    @Export(name="syncDirection", type=String.class, parameters={})
    private Output</* @Nullable */ String> syncDirection;

    /**
     * @return Sync direction of the sync member.
     * 
     */
    public Output</* @Nullable */ String> getSyncDirection() {
        return this.syncDirection;
    }
    /**
     * ARM resource id of the sync member logical database, for sync members in Azure.
     * 
     */
    @Export(name="syncMemberAzureDatabaseResourceId", type=String.class, parameters={})
    private Output</* @Nullable */ String> syncMemberAzureDatabaseResourceId;

    /**
     * @return ARM resource id of the sync member logical database, for sync members in Azure.
     * 
     */
    public Output</* @Nullable */ String> getSyncMemberAzureDatabaseResourceId() {
        return this.syncMemberAzureDatabaseResourceId;
    }
    /**
     * Sync state of the sync member.
     * 
     */
    @Export(name="syncState", type=String.class, parameters={})
    private Output<String> syncState;

    /**
     * @return Sync state of the sync member.
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
     * Whether to use private link connection.
     * 
     */
    @Export(name="usePrivateLinkConnection", type=Boolean.class, parameters={})
    private Output</* @Nullable */ Boolean> usePrivateLinkConnection;

    /**
     * @return Whether to use private link connection.
     * 
     */
    public Output</* @Nullable */ Boolean> getUsePrivateLinkConnection() {
        return this.usePrivateLinkConnection;
    }
    /**
     * User name of the member database in the sync member.
     * 
     */
    @Export(name="userName", type=String.class, parameters={})
    private Output</* @Nullable */ String> userName;

    /**
     * @return User name of the member database in the sync member.
     * 
     */
    public Output</* @Nullable */ String> getUserName() {
        return this.userName;
    }

    public interface BuilderApplicator {
        public void apply(SyncMemberArgs.Builder a);
    }
    private static io.pulumi.azurenative.sql.SyncMemberArgs buildArgs(BuilderApplicator argsBuilder) {
        final var builder = io.pulumi.azurenative.sql.SyncMemberArgs.builder();
        argsBuilder.apply(builder);
        return builder.build();
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param argsBuilder A function that configures a passed builder.
     */
    public SyncMember(String name, BuilderApplicator argsBuilder) {
        this(name, buildArgs(argsBuilder), null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public SyncMember(String name) {
        this(name, SyncMemberArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public SyncMember(String name, SyncMemberArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public SyncMember(String name, SyncMemberArgs args, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("azure-native:sql:SyncMember", name, args == null ? SyncMemberArgs.Empty : args, makeResourceOptions(options, Output.empty()));
    }

    private SyncMember(String name, Output<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("azure-native:sql:SyncMember", name, null, makeResourceOptions(options, id));
    }

    private static io.pulumi.resources.CustomResourceOptions makeResourceOptions(@Nullable io.pulumi.resources.CustomResourceOptions options, @Nullable Output<String> id) {
        var defaultOptions = io.pulumi.resources.CustomResourceOptions.builder()
            .version(Utilities.getVersion())
            .aliases(List.of(
                Output.of(Alias.builder().type("azure-native:sql/v20150501preview:SyncMember").build()),
                Output.of(Alias.builder().type("azure-native:sql/v20190601preview:SyncMember").build()),
                Output.of(Alias.builder().type("azure-native:sql/v20200202preview:SyncMember").build()),
                Output.of(Alias.builder().type("azure-native:sql/v20200801preview:SyncMember").build()),
                Output.of(Alias.builder().type("azure-native:sql/v20201101preview:SyncMember").build()),
                Output.of(Alias.builder().type("azure-native:sql/v20210201preview:SyncMember").build()),
                Output.of(Alias.builder().type("azure-native:sql/v20210501preview:SyncMember").build()),
                Output.of(Alias.builder().type("azure-native:sql/v20210801preview:SyncMember").build())
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
    public static SyncMember get(String name, Output<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        return new SyncMember(name, id, options);
    }
}
