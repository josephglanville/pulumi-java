// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.documentdb;

import io.pulumi.azurenative.Utilities;
import io.pulumi.azurenative.documentdb.MongoDBResourceMongoUserDefinitionArgs;
import io.pulumi.azurenative.documentdb.outputs.RoleResponse;
import io.pulumi.core.Alias;
import io.pulumi.core.Input;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.OutputExport;
import io.pulumi.core.annotations.ResourceType;
import java.lang.String;
import java.util.List;
import javax.annotation.Nullable;

/**
 * An Azure Cosmos DB User Definition
 * API Version: 2021-10-15-preview.
 * 
 * ## Example Usage
 * 
 * ## Import
 * 
 * An existing resource can be imported using its type token, name, and identifier, e.g.
 * 
 * ```sh
 * $ pulumi import azure-native:documentdb:MongoDBResourceMongoUserDefinition myUserName /subscriptions/mySubscriptionId/resourceGroups/myResourceGroupName/providers/Microsoft.DocumentDB/databaseAccounts/myAccountName/mongodbUserDefinitions/myUserId 
 * ```
 * 
 */
@ResourceType(type="azure-native:documentdb:MongoDBResourceMongoUserDefinition")
public class MongoDBResourceMongoUserDefinition extends io.pulumi.resources.CustomResource {
    /**
     * A custom definition for the USer Definition.
     * 
     */
    @OutputExport(name="customData", type=String.class, parameters={})
    private Output</* @Nullable */ String> customData;

    /**
     * @return A custom definition for the USer Definition.
     * 
     */
    public Output</* @Nullable */ String> getCustomData() {
        return this.customData;
    }
    /**
     * The database name for which access is being granted for this User Definition.
     * 
     */
    @OutputExport(name="databaseName", type=String.class, parameters={})
    private Output</* @Nullable */ String> databaseName;

    /**
     * @return The database name for which access is being granted for this User Definition.
     * 
     */
    public Output</* @Nullable */ String> getDatabaseName() {
        return this.databaseName;
    }
    /**
     * The Mongo Auth mechanism. For now, we only support auth mechanism SCRAM-SHA-256.
     * 
     */
    @OutputExport(name="mechanisms", type=String.class, parameters={})
    private Output</* @Nullable */ String> mechanisms;

    /**
     * @return The Mongo Auth mechanism. For now, we only support auth mechanism SCRAM-SHA-256.
     * 
     */
    public Output</* @Nullable */ String> getMechanisms() {
        return this.mechanisms;
    }
    /**
     * The name of the database account.
     * 
     */
    @OutputExport(name="name", type=String.class, parameters={})
    private Output<String> name;

    /**
     * @return The name of the database account.
     * 
     */
    public Output<String> getName() {
        return this.name;
    }
    /**
     * The password for User Definition. Response does not contain user password.
     * 
     */
    @OutputExport(name="password", type=String.class, parameters={})
    private Output</* @Nullable */ String> password;

    /**
     * @return The password for User Definition. Response does not contain user password.
     * 
     */
    public Output</* @Nullable */ String> getPassword() {
        return this.password;
    }
    /**
     * The set of roles inherited by the User Definition.
     * 
     */
    @OutputExport(name="roles", type=List.class, parameters={RoleResponse.class})
    private Output</* @Nullable */ List<RoleResponse>> roles;

    /**
     * @return The set of roles inherited by the User Definition.
     * 
     */
    public Output</* @Nullable */ List<RoleResponse>> getRoles() {
        return this.roles;
    }
    /**
     * The type of Azure resource.
     * 
     */
    @OutputExport(name="type", type=String.class, parameters={})
    private Output<String> type;

    /**
     * @return The type of Azure resource.
     * 
     */
    public Output<String> getType() {
        return this.type;
    }
    /**
     * The user name for User Definition.
     * 
     */
    @OutputExport(name="userName", type=String.class, parameters={})
    private Output</* @Nullable */ String> userName;

    /**
     * @return The user name for User Definition.
     * 
     */
    public Output</* @Nullable */ String> getUserName() {
        return this.userName;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public MongoDBResourceMongoUserDefinition(String name) {
        this(name, MongoDBResourceMongoUserDefinitionArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public MongoDBResourceMongoUserDefinition(String name, MongoDBResourceMongoUserDefinitionArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public MongoDBResourceMongoUserDefinition(String name, MongoDBResourceMongoUserDefinitionArgs args, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("azure-native:documentdb:MongoDBResourceMongoUserDefinition", name, args == null ? MongoDBResourceMongoUserDefinitionArgs.Empty : args, makeResourceOptions(options, Input.empty()));
    }

    private MongoDBResourceMongoUserDefinition(String name, Input<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("azure-native:documentdb:MongoDBResourceMongoUserDefinition", name, null, makeResourceOptions(options, id));
    }

    private static io.pulumi.resources.CustomResourceOptions makeResourceOptions(@Nullable io.pulumi.resources.CustomResourceOptions options, @Nullable Input<String> id) {
        var defaultOptions = io.pulumi.resources.CustomResourceOptions.builder()
            .setVersion(Utilities.getVersion())
            .setAliases(List.of(
                Input.of(Alias.builder().setType("azure-native:documentdb/v20211015preview:MongoDBResourceMongoUserDefinition").build())
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
    public static MongoDBResourceMongoUserDefinition get(String name, Input<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        return new MongoDBResourceMongoUserDefinition(name, id, options);
    }
}
