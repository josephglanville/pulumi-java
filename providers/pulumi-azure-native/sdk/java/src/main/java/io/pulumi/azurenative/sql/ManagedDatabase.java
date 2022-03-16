// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.sql;

import io.pulumi.azurenative.Utilities;
import io.pulumi.azurenative.sql.ManagedDatabaseArgs;
import io.pulumi.core.Alias;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.Export;
import io.pulumi.core.annotations.ResourceType;
import java.lang.String;
import java.util.List;
import java.util.Map;
import javax.annotation.Nullable;

/**
 * A managed database resource.
 * API Version: 2020-11-01-preview.
 * 
 * ## Example Usage
 * 
 * ## Import
 * 
 * An existing resource can be imported using its type token, name, and identifier, e.g.
 * 
 * ```sh
 * $ pulumi import azure-native:sql:ManagedDatabase testdb1 /subscriptions/00000000-1111-2222-3333-444444444444/resourceGroups/Default-SQL-SouthEastAsia/providers/Microsoft.Sql/managedInstances/testsvr/databases/testdb1 
 * ```
 * 
 */
@ResourceType(type="azure-native:sql:ManagedDatabase")
public class ManagedDatabase extends io.pulumi.resources.CustomResource {
    /**
     * Collation of the metadata catalog.
     * 
     */
    @Export(name="catalogCollation", type=String.class, parameters={})
    private Output</* @Nullable */ String> catalogCollation;

    /**
     * @return Collation of the metadata catalog.
     * 
     */
    public Output</* @Nullable */ String> getCatalogCollation() {
        return this.catalogCollation;
    }
    /**
     * Collation of the managed database.
     * 
     */
    @Export(name="collation", type=String.class, parameters={})
    private Output</* @Nullable */ String> collation;

    /**
     * @return Collation of the managed database.
     * 
     */
    public Output</* @Nullable */ String> getCollation() {
        return this.collation;
    }
    /**
     * Creation date of the database.
     * 
     */
    @Export(name="creationDate", type=String.class, parameters={})
    private Output<String> creationDate;

    /**
     * @return Creation date of the database.
     * 
     */
    public Output<String> getCreationDate() {
        return this.creationDate;
    }
    /**
     * Geo paired region.
     * 
     */
    @Export(name="defaultSecondaryLocation", type=String.class, parameters={})
    private Output<String> defaultSecondaryLocation;

    /**
     * @return Geo paired region.
     * 
     */
    public Output<String> getDefaultSecondaryLocation() {
        return this.defaultSecondaryLocation;
    }
    /**
     * Earliest restore point in time for point in time restore.
     * 
     */
    @Export(name="earliestRestorePoint", type=String.class, parameters={})
    private Output<String> earliestRestorePoint;

    /**
     * @return Earliest restore point in time for point in time restore.
     * 
     */
    public Output<String> getEarliestRestorePoint() {
        return this.earliestRestorePoint;
    }
    /**
     * Instance Failover Group resource identifier that this managed database belongs to.
     * 
     */
    @Export(name="failoverGroupId", type=String.class, parameters={})
    private Output<String> failoverGroupId;

    /**
     * @return Instance Failover Group resource identifier that this managed database belongs to.
     * 
     */
    public Output<String> getFailoverGroupId() {
        return this.failoverGroupId;
    }
    /**
     * Resource location.
     * 
     */
    @Export(name="location", type=String.class, parameters={})
    private Output<String> location;

    /**
     * @return Resource location.
     * 
     */
    public Output<String> getLocation() {
        return this.location;
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
     * Status of the database.
     * 
     */
    @Export(name="status", type=String.class, parameters={})
    private Output<String> status;

    /**
     * @return Status of the database.
     * 
     */
    public Output<String> getStatus() {
        return this.status;
    }
    /**
     * Resource tags.
     * 
     */
    @Export(name="tags", type=Map.class, parameters={String.class, String.class})
    private Output</* @Nullable */ Map<String,String>> tags;

    /**
     * @return Resource tags.
     * 
     */
    public Output</* @Nullable */ Map<String,String>> getTags() {
        return this.tags;
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

    public interface BuilderApplicator {
        public void apply(ManagedDatabaseArgs.Builder a);
    }
    private static io.pulumi.azurenative.sql.ManagedDatabaseArgs buildArgs(BuilderApplicator argsBuilder) {
        final var builder = io.pulumi.azurenative.sql.ManagedDatabaseArgs.builder();
        argsBuilder.apply(builder);
        return builder.build();
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param argsBuilder A function that configures a passed builder.
     */
    public ManagedDatabase(String name, BuilderApplicator argsBuilder) {
        this(name, buildArgs(argsBuilder), null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public ManagedDatabase(String name) {
        this(name, ManagedDatabaseArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public ManagedDatabase(String name, ManagedDatabaseArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public ManagedDatabase(String name, ManagedDatabaseArgs args, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("azure-native:sql:ManagedDatabase", name, args == null ? ManagedDatabaseArgs.Empty : args, makeResourceOptions(options, Output.empty()));
    }

    private ManagedDatabase(String name, Output<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("azure-native:sql:ManagedDatabase", name, null, makeResourceOptions(options, id));
    }

    private static io.pulumi.resources.CustomResourceOptions makeResourceOptions(@Nullable io.pulumi.resources.CustomResourceOptions options, @Nullable Output<String> id) {
        var defaultOptions = io.pulumi.resources.CustomResourceOptions.builder()
            .version(Utilities.getVersion())
            .aliases(List.of(
                Output.of(Alias.builder().type("azure-native:sql/v20170301preview:ManagedDatabase").build()),
                Output.of(Alias.builder().type("azure-native:sql/v20180601preview:ManagedDatabase").build()),
                Output.of(Alias.builder().type("azure-native:sql/v20190601preview:ManagedDatabase").build()),
                Output.of(Alias.builder().type("azure-native:sql/v20200202preview:ManagedDatabase").build()),
                Output.of(Alias.builder().type("azure-native:sql/v20200801preview:ManagedDatabase").build()),
                Output.of(Alias.builder().type("azure-native:sql/v20201101preview:ManagedDatabase").build()),
                Output.of(Alias.builder().type("azure-native:sql/v20210201preview:ManagedDatabase").build()),
                Output.of(Alias.builder().type("azure-native:sql/v20210501preview:ManagedDatabase").build()),
                Output.of(Alias.builder().type("azure-native:sql/v20210801preview:ManagedDatabase").build())
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
    public static ManagedDatabase get(String name, Output<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        return new ManagedDatabase(name, id, options);
    }
}
