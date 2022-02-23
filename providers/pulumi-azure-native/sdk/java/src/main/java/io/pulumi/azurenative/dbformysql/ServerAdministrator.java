// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.dbformysql;

import io.pulumi.azurenative.Utilities;
import io.pulumi.azurenative.dbformysql.ServerAdministratorArgs;
import io.pulumi.core.Alias;
import io.pulumi.core.Input;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.OutputExport;
import io.pulumi.core.annotations.ResourceType;
import java.lang.String;
import java.util.List;
import javax.annotation.Nullable;

/**
 * Represents a and external administrator to be created.
 * API Version: 2017-12-01.
 * 
 * ## Example Usage
 * 
 * ## Import
 * 
 * An existing resource can be imported using its type token, name, and identifier, e.g.
 * 
 * ```sh
 * $ pulumi import azure-native:dbformysql:ServerAdministrator activeDirectory /subscriptions/ffffffff-ffff-ffff-ffff-ffffffffffff/resourceGroups/testrg/providers/Microsoft.DBforMySQL/servers/mysqltestsvc4/administrators/activeDirectory 
 * ```
 * 
 */
@ResourceType(type="azure-native:dbformysql:ServerAdministrator")
public class ServerAdministrator extends io.pulumi.resources.CustomResource {
    /**
     * The type of administrator.
     * 
     */
    @OutputExport(name="administratorType", type=String.class, parameters={})
    private Output<String> administratorType;

    /**
     * @return The type of administrator.
     * 
     */
    public Output<String> getAdministratorType() {
        return this.administratorType;
    }
    /**
     * The server administrator login account name.
     * 
     */
    @OutputExport(name="login", type=String.class, parameters={})
    private Output<String> login;

    /**
     * @return The server administrator login account name.
     * 
     */
    public Output<String> getLogin() {
        return this.login;
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
     * The server administrator Sid (Secure ID).
     * 
     */
    @OutputExport(name="sid", type=String.class, parameters={})
    private Output<String> sid;

    /**
     * @return The server administrator Sid (Secure ID).
     * 
     */
    public Output<String> getSid() {
        return this.sid;
    }
    /**
     * The server Active Directory Administrator tenant id.
     * 
     */
    @OutputExport(name="tenantId", type=String.class, parameters={})
    private Output<String> tenantId;

    /**
     * @return The server Active Directory Administrator tenant id.
     * 
     */
    public Output<String> getTenantId() {
        return this.tenantId;
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
    public ServerAdministrator(String name) {
        this(name, ServerAdministratorArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public ServerAdministrator(String name, ServerAdministratorArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public ServerAdministrator(String name, ServerAdministratorArgs args, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("azure-native:dbformysql:ServerAdministrator", name, args == null ? ServerAdministratorArgs.Empty : args, makeResourceOptions(options, Input.empty()));
    }

    private ServerAdministrator(String name, Input<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("azure-native:dbformysql:ServerAdministrator", name, null, makeResourceOptions(options, id));
    }

    private static io.pulumi.resources.CustomResourceOptions makeResourceOptions(@Nullable io.pulumi.resources.CustomResourceOptions options, @Nullable Input<String> id) {
        var defaultOptions = io.pulumi.resources.CustomResourceOptions.builder()
            .setVersion(Utilities.getVersion())
            .setAliases(List.of(
                Input.of(Alias.builder().setType("azure-native:dbformysql/v20171201:ServerAdministrator").build()),
                Input.of(Alias.builder().setType("azure-native:dbformysql/v20171201preview:ServerAdministrator").build())
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
    public static ServerAdministrator get(String name, Input<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        return new ServerAdministrator(name, id, options);
    }
}
