// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.bigtableadmin_v2;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.OutputExport;
import io.pulumi.core.annotations.ResourceType;
import io.pulumi.googlenative.Utilities;
import io.pulumi.googlenative.bigtableadmin_v2.TableArgs;
import io.pulumi.googlenative.bigtableadmin_v2.outputs.RestoreInfoResponse;
import java.lang.String;
import java.util.Map;
import javax.annotation.Nullable;

/**
 * Creates a new table in the specified instance. The table can be created with a full set of initial column families, specified in the request.
 * 
 */
@ResourceType(type="google-native:bigtableadmin/v2:Table")
public class Table extends io.pulumi.resources.CustomResource {
    /**
     * Map from cluster ID to per-cluster table state. If it could not be determined whether or not the table has data in a particular cluster (for example, if its zone is unavailable), then there will be an entry for the cluster with UNKNOWN `replication_status`. Views: `REPLICATION_VIEW`, `ENCRYPTION_VIEW`, `FULL`
     * 
     */
    @OutputExport(name="clusterStates", type=Map.class, parameters={String.class, String.class})
    private Output<Map<String,String>> clusterStates;

    /**
     * @return Map from cluster ID to per-cluster table state. If it could not be determined whether or not the table has data in a particular cluster (for example, if its zone is unavailable), then there will be an entry for the cluster with UNKNOWN `replication_status`. Views: `REPLICATION_VIEW`, `ENCRYPTION_VIEW`, `FULL`
     * 
     */
    public Output<Map<String,String>> getClusterStates() {
        return this.clusterStates;
    }
    /**
     * The column families configured for this table, mapped by column family ID. Views: `SCHEMA_VIEW`, `FULL`
     * 
     */
    @OutputExport(name="columnFamilies", type=Map.class, parameters={String.class, String.class})
    private Output<Map<String,String>> columnFamilies;

    /**
     * @return The column families configured for this table, mapped by column family ID. Views: `SCHEMA_VIEW`, `FULL`
     * 
     */
    public Output<Map<String,String>> getColumnFamilies() {
        return this.columnFamilies;
    }
    /**
     * Immutable. The granularity (i.e. `MILLIS`) at which timestamps are stored in this table. Timestamps not matching the granularity will be rejected. If unspecified at creation time, the value will be set to `MILLIS`. Views: `SCHEMA_VIEW`, `FULL`.
     * 
     */
    @OutputExport(name="granularity", type=String.class, parameters={})
    private Output<String> granularity;

    /**
     * @return Immutable. The granularity (i.e. `MILLIS`) at which timestamps are stored in this table. Timestamps not matching the granularity will be rejected. If unspecified at creation time, the value will be set to `MILLIS`. Views: `SCHEMA_VIEW`, `FULL`.
     * 
     */
    public Output<String> getGranularity() {
        return this.granularity;
    }
    /**
     * The unique name of the table. Values are of the form `projects/{project}/instances/{instance}/tables/_a-zA-Z0-9*`. Views: `NAME_ONLY`, `SCHEMA_VIEW`, `REPLICATION_VIEW`, `FULL`
     * 
     */
    @OutputExport(name="name", type=String.class, parameters={})
    private Output<String> name;

    /**
     * @return The unique name of the table. Values are of the form `projects/{project}/instances/{instance}/tables/_a-zA-Z0-9*`. Views: `NAME_ONLY`, `SCHEMA_VIEW`, `REPLICATION_VIEW`, `FULL`
     * 
     */
    public Output<String> getName() {
        return this.name;
    }
    /**
     * If this table was restored from another data source (e.g. a backup), this field will be populated with information about the restore.
     * 
     */
    @OutputExport(name="restoreInfo", type=RestoreInfoResponse.class, parameters={})
    private Output<RestoreInfoResponse> restoreInfo;

    /**
     * @return If this table was restored from another data source (e.g. a backup), this field will be populated with information about the restore.
     * 
     */
    public Output<RestoreInfoResponse> getRestoreInfo() {
        return this.restoreInfo;
    }

    public interface BuilderApplicator {
        public void apply(TableArgs.Builder a);
    }
    private static io.pulumi.googlenative.bigtableadmin_v2.TableArgs buildArgs(BuilderApplicator argsBuilder) {
        final var builder = io.pulumi.googlenative.bigtableadmin_v2.TableArgs.builder();
        argsBuilder.apply(builder);
        return builder.build();
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param argsBuilder A function that configures a passed builder.
     */
    public Table(String name, BuilderApplicator argsBuilder) {
        this(name, buildArgs(argsBuilder), null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public Table(String name) {
        this(name, TableArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public Table(String name, TableArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public Table(String name, TableArgs args, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("google-native:bigtableadmin/v2:Table", name, args == null ? TableArgs.Empty : args, makeResourceOptions(options, Output.empty()));
    }

    private Table(String name, Output<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("google-native:bigtableadmin/v2:Table", name, null, makeResourceOptions(options, id));
    }

    private static io.pulumi.resources.CustomResourceOptions makeResourceOptions(@Nullable io.pulumi.resources.CustomResourceOptions options, @Nullable Output<String> id) {
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
    public static Table get(String name, Output<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        return new Table(name, id, options);
    }
}
