// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.documentdb;

import io.pulumi.azurenative.Utilities;
import io.pulumi.azurenative.documentdb.MongoDBResourceMongoDBDatabaseArgs;
import io.pulumi.azurenative.documentdb.outputs.MongoDBDatabaseGetPropertiesResponseOptions;
import io.pulumi.azurenative.documentdb.outputs.MongoDBDatabaseGetPropertiesResponseResource;
import io.pulumi.core.Alias;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.Export;
import io.pulumi.core.annotations.ResourceType;
import io.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.List;
import java.util.Map;
import javax.annotation.Nullable;

/**
 * An Azure Cosmos DB MongoDB database.
 * API Version: 2021-03-15.
 * 
 * ## Example Usage
 * 
 * ## Import
 * 
 * An existing resource can be imported using its type token, name, and identifier, e.g.
 * 
 * ```sh
 * $ pulumi import azure-native:documentdb:MongoDBResourceMongoDBDatabase databaseName /subscriptions/subid/resourceGroups/rg1/providers/Microsoft.DocumentDB/databaseAccounts/ddb1/mongodbDatabases/databaseName 
 * ```
 * 
 */
@ResourceType(type="azure-native:documentdb:MongoDBResourceMongoDBDatabase")
public class MongoDBResourceMongoDBDatabase extends io.pulumi.resources.CustomResource {
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
    @Export(name="options", type=MongoDBDatabaseGetPropertiesResponseOptions.class, parameters={})
    private Output</* @Nullable */ MongoDBDatabaseGetPropertiesResponseOptions> options;

    public Output</* @Nullable */ MongoDBDatabaseGetPropertiesResponseOptions> getOptions() {
        return this.options;
    }
    @Export(name="resource", type=MongoDBDatabaseGetPropertiesResponseResource.class, parameters={})
    private Output</* @Nullable */ MongoDBDatabaseGetPropertiesResponseResource> resource;

    public Output</* @Nullable */ MongoDBDatabaseGetPropertiesResponseResource> getResource() {
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

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public MongoDBResourceMongoDBDatabase(String name) {
        this(name, MongoDBResourceMongoDBDatabaseArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public MongoDBResourceMongoDBDatabase(String name, MongoDBResourceMongoDBDatabaseArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public MongoDBResourceMongoDBDatabase(String name, MongoDBResourceMongoDBDatabaseArgs args, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("azure-native:documentdb:MongoDBResourceMongoDBDatabase", name, args == null ? MongoDBResourceMongoDBDatabaseArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private MongoDBResourceMongoDBDatabase(String name, Output<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("azure-native:documentdb:MongoDBResourceMongoDBDatabase", name, null, makeResourceOptions(options, id));
    }

    private static io.pulumi.resources.CustomResourceOptions makeResourceOptions(@Nullable io.pulumi.resources.CustomResourceOptions options, @Nullable Output<String> id) {
        var defaultOptions = io.pulumi.resources.CustomResourceOptions.builder()
            .version(Utilities.getVersion())
            .aliases(List.of(
                Output.of(Alias.builder().type("azure-native:documentdb/v20150401:MongoDBResourceMongoDBDatabase").build()),
                Output.of(Alias.builder().type("azure-native:documentdb/v20150408:MongoDBResourceMongoDBDatabase").build()),
                Output.of(Alias.builder().type("azure-native:documentdb/v20151106:MongoDBResourceMongoDBDatabase").build()),
                Output.of(Alias.builder().type("azure-native:documentdb/v20160319:MongoDBResourceMongoDBDatabase").build()),
                Output.of(Alias.builder().type("azure-native:documentdb/v20160331:MongoDBResourceMongoDBDatabase").build()),
                Output.of(Alias.builder().type("azure-native:documentdb/v20190801:MongoDBResourceMongoDBDatabase").build()),
                Output.of(Alias.builder().type("azure-native:documentdb/v20191212:MongoDBResourceMongoDBDatabase").build()),
                Output.of(Alias.builder().type("azure-native:documentdb/v20200301:MongoDBResourceMongoDBDatabase").build()),
                Output.of(Alias.builder().type("azure-native:documentdb/v20200401:MongoDBResourceMongoDBDatabase").build()),
                Output.of(Alias.builder().type("azure-native:documentdb/v20200601preview:MongoDBResourceMongoDBDatabase").build()),
                Output.of(Alias.builder().type("azure-native:documentdb/v20200901:MongoDBResourceMongoDBDatabase").build()),
                Output.of(Alias.builder().type("azure-native:documentdb/v20210115:MongoDBResourceMongoDBDatabase").build()),
                Output.of(Alias.builder().type("azure-native:documentdb/v20210301preview:MongoDBResourceMongoDBDatabase").build()),
                Output.of(Alias.builder().type("azure-native:documentdb/v20210315:MongoDBResourceMongoDBDatabase").build()),
                Output.of(Alias.builder().type("azure-native:documentdb/v20210401preview:MongoDBResourceMongoDBDatabase").build()),
                Output.of(Alias.builder().type("azure-native:documentdb/v20210415:MongoDBResourceMongoDBDatabase").build()),
                Output.of(Alias.builder().type("azure-native:documentdb/v20210515:MongoDBResourceMongoDBDatabase").build()),
                Output.of(Alias.builder().type("azure-native:documentdb/v20210615:MongoDBResourceMongoDBDatabase").build()),
                Output.of(Alias.builder().type("azure-native:documentdb/v20210701preview:MongoDBResourceMongoDBDatabase").build()),
                Output.of(Alias.builder().type("azure-native:documentdb/v20211015:MongoDBResourceMongoDBDatabase").build()),
                Output.of(Alias.builder().type("azure-native:documentdb/v20211015preview:MongoDBResourceMongoDBDatabase").build())
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
    public static MongoDBResourceMongoDBDatabase get(String name, Output<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        return new MongoDBResourceMongoDBDatabase(name, id, options);
    }
}
