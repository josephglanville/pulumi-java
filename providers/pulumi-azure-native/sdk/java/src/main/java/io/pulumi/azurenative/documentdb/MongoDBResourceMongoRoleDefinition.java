// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.documentdb;

import io.pulumi.azurenative.Utilities;
import io.pulumi.azurenative.documentdb.MongoDBResourceMongoRoleDefinitionArgs;
import io.pulumi.azurenative.documentdb.outputs.PrivilegeResponse;
import io.pulumi.azurenative.documentdb.outputs.RoleResponse;
import io.pulumi.core.Alias;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.Export;
import io.pulumi.core.annotations.ResourceType;
import io.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.List;
import javax.annotation.Nullable;

/**
 * An Azure Cosmos DB Mongo Role Definition.
 * API Version: 2021-10-15-preview.
 * 
 * ## Example Usage
 * 
 * ## Import
 * 
 * An existing resource can be imported using its type token, name, and identifier, e.g.
 * 
 * ```sh
 * $ pulumi import azure-native:documentdb:MongoDBResourceMongoRoleDefinition myMongoDbRoleDefinitionId /subscriptions/mySubscriptionId/resourceGroups/myResourceGroupName/providers/Microsoft.DocumentDB/databaseAccounts/myAccountName/mongodbRoleDefinitions/myMongoDbRoleDefinitionId 
 * ```
 * 
 */
@ResourceType(type="azure-native:documentdb:MongoDBResourceMongoRoleDefinition")
public class MongoDBResourceMongoRoleDefinition extends io.pulumi.resources.CustomResource {
    /**
     * The database name for which access is being granted for this Role Definition.
     * 
     */
    @Export(name="databaseName", type=String.class, parameters={})
    private Output</* @Nullable */ String> databaseName;

    /**
     * @return The database name for which access is being granted for this Role Definition.
     * 
     */
    public Output</* @Nullable */ String> getDatabaseName() {
        return this.databaseName;
    }
    /**
     * The name of the database account.
     * 
     */
    @Export(name="name", type=String.class, parameters={})
    private Output<String> name;

    /**
     * @return The name of the database account.
     * 
     */
    public Output<String> getName() {
        return this.name;
    }
    /**
     * A set of privileges contained by the Role Definition. This will allow application of this Role Definition on the entire database account or any underlying Database / Collection. Scopes higher than Database are not enforceable as privilege.
     * 
     */
    @Export(name="privileges", type=List.class, parameters={PrivilegeResponse.class})
    private Output</* @Nullable */ List<PrivilegeResponse>> privileges;

    /**
     * @return A set of privileges contained by the Role Definition. This will allow application of this Role Definition on the entire database account or any underlying Database / Collection. Scopes higher than Database are not enforceable as privilege.
     * 
     */
    public Output</* @Nullable */ List<PrivilegeResponse>> getPrivileges() {
        return this.privileges;
    }
    /**
     * A user-friendly name for the Role Definition. Must be unique for the database account.
     * 
     */
    @Export(name="roleName", type=String.class, parameters={})
    private Output</* @Nullable */ String> roleName;

    /**
     * @return A user-friendly name for the Role Definition. Must be unique for the database account.
     * 
     */
    public Output</* @Nullable */ String> getRoleName() {
        return this.roleName;
    }
    /**
     * The set of roles inherited by this Role Definition.
     * 
     */
    @Export(name="roles", type=List.class, parameters={RoleResponse.class})
    private Output</* @Nullable */ List<RoleResponse>> roles;

    /**
     * @return The set of roles inherited by this Role Definition.
     * 
     */
    public Output</* @Nullable */ List<RoleResponse>> getRoles() {
        return this.roles;
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
    public MongoDBResourceMongoRoleDefinition(String name) {
        this(name, MongoDBResourceMongoRoleDefinitionArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public MongoDBResourceMongoRoleDefinition(String name, MongoDBResourceMongoRoleDefinitionArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public MongoDBResourceMongoRoleDefinition(String name, MongoDBResourceMongoRoleDefinitionArgs args, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("azure-native:documentdb:MongoDBResourceMongoRoleDefinition", name, args == null ? MongoDBResourceMongoRoleDefinitionArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private MongoDBResourceMongoRoleDefinition(String name, Output<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("azure-native:documentdb:MongoDBResourceMongoRoleDefinition", name, null, makeResourceOptions(options, id));
    }

    private static io.pulumi.resources.CustomResourceOptions makeResourceOptions(@Nullable io.pulumi.resources.CustomResourceOptions options, @Nullable Output<String> id) {
        var defaultOptions = io.pulumi.resources.CustomResourceOptions.builder()
            .version(Utilities.getVersion())
            .aliases(List.of(
                Output.of(Alias.builder().type("azure-native:documentdb/v20211015preview:MongoDBResourceMongoRoleDefinition").build())
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
    public static MongoDBResourceMongoRoleDefinition get(String name, Output<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        return new MongoDBResourceMongoRoleDefinition(name, id, options);
    }
}
