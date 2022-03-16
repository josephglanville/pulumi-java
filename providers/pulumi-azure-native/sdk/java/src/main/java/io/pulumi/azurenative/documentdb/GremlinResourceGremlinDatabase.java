// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.documentdb;

import io.pulumi.azurenative.Utilities;
import io.pulumi.azurenative.documentdb.GremlinResourceGremlinDatabaseArgs;
import io.pulumi.azurenative.documentdb.outputs.GremlinDatabaseGetPropertiesResponseOptions;
import io.pulumi.azurenative.documentdb.outputs.GremlinDatabaseGetPropertiesResponseResource;
import io.pulumi.core.Alias;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.Export;
import io.pulumi.core.annotations.ResourceType;
import java.lang.String;
import java.util.List;
import java.util.Map;
import javax.annotation.Nullable;

/**
 * An Azure Cosmos DB Gremlin database.
 * API Version: 2021-03-15.
 * 
 * ## Example Usage
 * 
 * ## Import
 * 
 * An existing resource can be imported using its type token, name, and identifier, e.g.
 * 
 * ```sh
 * $ pulumi import azure-native:documentdb:GremlinResourceGremlinDatabase databaseName /subscriptions/subid/resourceGroups/rg1/providers/Microsoft.DocumentDB/databaseAccounts/ddb1/gremlinDatabases/databaseName 
 * ```
 * 
 */
@ResourceType(type="azure-native:documentdb:GremlinResourceGremlinDatabase")
public class GremlinResourceGremlinDatabase extends io.pulumi.resources.CustomResource {
    /**
     * The location of the resource group to which the resource belongs.
     * 
     */
    @Export(name="location", type=String.class, parameters={})
    private Output</* @Nullable */ String> location;

    /**
     * @return The location of the resource group to which the resource belongs.
     * 
     */
    public Output</* @Nullable */ String> getLocation() {
        return this.location;
    }
    /**
     * The name of the ARM resource.
     * 
     */
    @Export(name="name", type=String.class, parameters={})
    private Output<String> name;

    /**
     * @return The name of the ARM resource.
     * 
     */
    public Output<String> getName() {
        return this.name;
    }
    @Export(name="options", type=GremlinDatabaseGetPropertiesResponseOptions.class, parameters={})
    private Output</* @Nullable */ GremlinDatabaseGetPropertiesResponseOptions> options;

    public Output</* @Nullable */ GremlinDatabaseGetPropertiesResponseOptions> getOptions() {
        return this.options;
    }
    @Export(name="resource", type=GremlinDatabaseGetPropertiesResponseResource.class, parameters={})
    private Output</* @Nullable */ GremlinDatabaseGetPropertiesResponseResource> resource;

    public Output</* @Nullable */ GremlinDatabaseGetPropertiesResponseResource> getResource() {
        return this.resource;
    }
    /**
     * Tags are a list of key-value pairs that describe the resource. These tags can be used in viewing and grouping this resource (across resource groups). A maximum of 15 tags can be provided for a resource. Each tag must have a key no greater than 128 characters and value no greater than 256 characters. For example, the default experience for a template type is set with "defaultExperience": "Cassandra". Current "defaultExperience" values also include "Table", "Graph", "DocumentDB", and "MongoDB".
     * 
     */
    @Export(name="tags", type=Map.class, parameters={String.class, String.class})
    private Output</* @Nullable */ Map<String,String>> tags;

    /**
     * @return Tags are a list of key-value pairs that describe the resource. These tags can be used in viewing and grouping this resource (across resource groups). A maximum of 15 tags can be provided for a resource. Each tag must have a key no greater than 128 characters and value no greater than 256 characters. For example, the default experience for a template type is set with "defaultExperience": "Cassandra". Current "defaultExperience" values also include "Table", "Graph", "DocumentDB", and "MongoDB".
     * 
     */
    public Output</* @Nullable */ Map<String,String>> getTags() {
        return this.tags;
    }
    /**
     * The type of Azure resource.
     * 
     */
    @Export(name="type", type=String.class, parameters={})
    private Output<String> type;

    /**
     * @return The type of Azure resource.
     * 
     */
    public Output<String> getType() {
        return this.type;
    }

    public interface BuilderApplicator {
        public void apply(GremlinResourceGremlinDatabaseArgs.Builder a);
    }
    private static io.pulumi.azurenative.documentdb.GremlinResourceGremlinDatabaseArgs buildArgs(BuilderApplicator argsBuilder) {
        final var builder = io.pulumi.azurenative.documentdb.GremlinResourceGremlinDatabaseArgs.builder();
        argsBuilder.apply(builder);
        return builder.build();
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param argsBuilder A function that configures a passed builder.
     */
    public GremlinResourceGremlinDatabase(String name, BuilderApplicator argsBuilder) {
        this(name, buildArgs(argsBuilder), null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public GremlinResourceGremlinDatabase(String name) {
        this(name, GremlinResourceGremlinDatabaseArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public GremlinResourceGremlinDatabase(String name, GremlinResourceGremlinDatabaseArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public GremlinResourceGremlinDatabase(String name, GremlinResourceGremlinDatabaseArgs args, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("azure-native:documentdb:GremlinResourceGremlinDatabase", name, args == null ? GremlinResourceGremlinDatabaseArgs.Empty : args, makeResourceOptions(options, Output.empty()));
    }

    private GremlinResourceGremlinDatabase(String name, Output<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("azure-native:documentdb:GremlinResourceGremlinDatabase", name, null, makeResourceOptions(options, id));
    }

    private static io.pulumi.resources.CustomResourceOptions makeResourceOptions(@Nullable io.pulumi.resources.CustomResourceOptions options, @Nullable Output<String> id) {
        var defaultOptions = io.pulumi.resources.CustomResourceOptions.builder()
            .version(Utilities.getVersion())
            .aliases(List.of(
                Output.of(Alias.builder().type("azure-native:documentdb/v20150401:GremlinResourceGremlinDatabase").build()),
                Output.of(Alias.builder().type("azure-native:documentdb/v20150408:GremlinResourceGremlinDatabase").build()),
                Output.of(Alias.builder().type("azure-native:documentdb/v20151106:GremlinResourceGremlinDatabase").build()),
                Output.of(Alias.builder().type("azure-native:documentdb/v20160319:GremlinResourceGremlinDatabase").build()),
                Output.of(Alias.builder().type("azure-native:documentdb/v20160331:GremlinResourceGremlinDatabase").build()),
                Output.of(Alias.builder().type("azure-native:documentdb/v20190801:GremlinResourceGremlinDatabase").build()),
                Output.of(Alias.builder().type("azure-native:documentdb/v20191212:GremlinResourceGremlinDatabase").build()),
                Output.of(Alias.builder().type("azure-native:documentdb/v20200301:GremlinResourceGremlinDatabase").build()),
                Output.of(Alias.builder().type("azure-native:documentdb/v20200401:GremlinResourceGremlinDatabase").build()),
                Output.of(Alias.builder().type("azure-native:documentdb/v20200601preview:GremlinResourceGremlinDatabase").build()),
                Output.of(Alias.builder().type("azure-native:documentdb/v20200901:GremlinResourceGremlinDatabase").build()),
                Output.of(Alias.builder().type("azure-native:documentdb/v20210115:GremlinResourceGremlinDatabase").build()),
                Output.of(Alias.builder().type("azure-native:documentdb/v20210301preview:GremlinResourceGremlinDatabase").build()),
                Output.of(Alias.builder().type("azure-native:documentdb/v20210315:GremlinResourceGremlinDatabase").build()),
                Output.of(Alias.builder().type("azure-native:documentdb/v20210401preview:GremlinResourceGremlinDatabase").build()),
                Output.of(Alias.builder().type("azure-native:documentdb/v20210415:GremlinResourceGremlinDatabase").build()),
                Output.of(Alias.builder().type("azure-native:documentdb/v20210515:GremlinResourceGremlinDatabase").build()),
                Output.of(Alias.builder().type("azure-native:documentdb/v20210615:GremlinResourceGremlinDatabase").build()),
                Output.of(Alias.builder().type("azure-native:documentdb/v20210701preview:GremlinResourceGremlinDatabase").build()),
                Output.of(Alias.builder().type("azure-native:documentdb/v20211015:GremlinResourceGremlinDatabase").build()),
                Output.of(Alias.builder().type("azure-native:documentdb/v20211015preview:GremlinResourceGremlinDatabase").build())
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
    public static GremlinResourceGremlinDatabase get(String name, Output<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        return new GremlinResourceGremlinDatabase(name, id, options);
    }
}
