// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.storage;

import io.pulumi.azurenative.Utilities;
import io.pulumi.azurenative.storage.LocalUserArgs;
import io.pulumi.azurenative.storage.outputs.PermissionScopeResponse;
import io.pulumi.azurenative.storage.outputs.SshPublicKeyResponse;
import io.pulumi.azurenative.storage.outputs.SystemDataResponse;
import io.pulumi.core.Alias;
import io.pulumi.core.Input;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.OutputExport;
import io.pulumi.core.annotations.ResourceType;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import javax.annotation.Nullable;

/**
 * The local user associated with the storage accounts.
 * API Version: 2021-08-01.
 * 
 * ## Example Usage
 * 
 * ## Import
 * 
 * An existing resource can be imported using its type token, name, and identifier, e.g.
 * 
 * ```sh
 * $ pulumi import azure-native:storage:LocalUser user1 /subscriptions/{subscription-id}/resourceGroups/res6977/providers/Microsoft.Storage/storageAccounts/sto2527/loalUsers/user1 
 * ```
 * 
 */
@ResourceType(type="azure-native:storage:LocalUser")
public class LocalUser extends io.pulumi.resources.CustomResource {
    /**
     * Indicates whether shared key exists. Set it to false to remove existing shared key.
     * 
     */
    @OutputExport(name="hasSharedKey", type=Boolean.class, parameters={})
    private Output</* @Nullable */ Boolean> hasSharedKey;

    /**
     * @return Indicates whether shared key exists. Set it to false to remove existing shared key.
     * 
     */
    public Output</* @Nullable */ Boolean> getHasSharedKey() {
        return this.hasSharedKey;
    }
    /**
     * Indicates whether ssh key exists. Set it to false to remove existing SSH key.
     * 
     */
    @OutputExport(name="hasSshKey", type=Boolean.class, parameters={})
    private Output</* @Nullable */ Boolean> hasSshKey;

    /**
     * @return Indicates whether ssh key exists. Set it to false to remove existing SSH key.
     * 
     */
    public Output</* @Nullable */ Boolean> getHasSshKey() {
        return this.hasSshKey;
    }
    /**
     * Indicates whether ssh password exists. Set it to false to remove existing SSH password.
     * 
     */
    @OutputExport(name="hasSshPassword", type=Boolean.class, parameters={})
    private Output</* @Nullable */ Boolean> hasSshPassword;

    /**
     * @return Indicates whether ssh password exists. Set it to false to remove existing SSH password.
     * 
     */
    public Output</* @Nullable */ Boolean> getHasSshPassword() {
        return this.hasSshPassword;
    }
    /**
     * Optional, local user home directory.
     * 
     */
    @OutputExport(name="homeDirectory", type=String.class, parameters={})
    private Output</* @Nullable */ String> homeDirectory;

    /**
     * @return Optional, local user home directory.
     * 
     */
    public Output</* @Nullable */ String> getHomeDirectory() {
        return this.homeDirectory;
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
     * The permission scopes of the local user.
     * 
     */
    @OutputExport(name="permissionScopes", type=List.class, parameters={PermissionScopeResponse.class})
    private Output</* @Nullable */ List<PermissionScopeResponse>> permissionScopes;

    /**
     * @return The permission scopes of the local user.
     * 
     */
    public Output</* @Nullable */ List<PermissionScopeResponse>> getPermissionScopes() {
        return this.permissionScopes;
    }
    /**
     * A unique Security Identifier that is generated by the server.
     * 
     */
    @OutputExport(name="sid", type=String.class, parameters={})
    private Output<String> sid;

    /**
     * @return A unique Security Identifier that is generated by the server.
     * 
     */
    public Output<String> getSid() {
        return this.sid;
    }
    /**
     * Optional, local user ssh authorized keys for SFTP.
     * 
     */
    @OutputExport(name="sshAuthorizedKeys", type=List.class, parameters={SshPublicKeyResponse.class})
    private Output</* @Nullable */ List<SshPublicKeyResponse>> sshAuthorizedKeys;

    /**
     * @return Optional, local user ssh authorized keys for SFTP.
     * 
     */
    public Output</* @Nullable */ List<SshPublicKeyResponse>> getSshAuthorizedKeys() {
        return this.sshAuthorizedKeys;
    }
    /**
     * Metadata pertaining to creation and last modification of the resource.
     * 
     */
    @OutputExport(name="systemData", type=SystemDataResponse.class, parameters={})
    private Output<SystemDataResponse> systemData;

    /**
     * @return Metadata pertaining to creation and last modification of the resource.
     * 
     */
    public Output<SystemDataResponse> getSystemData() {
        return this.systemData;
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
    public LocalUser(String name) {
        this(name, LocalUserArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public LocalUser(String name, LocalUserArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public LocalUser(String name, LocalUserArgs args, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("azure-native:storage:LocalUser", name, args == null ? LocalUserArgs.Empty : args, makeResourceOptions(options, Input.empty()));
    }

    private LocalUser(String name, Input<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("azure-native:storage:LocalUser", name, null, makeResourceOptions(options, id));
    }

    private static io.pulumi.resources.CustomResourceOptions makeResourceOptions(@Nullable io.pulumi.resources.CustomResourceOptions options, @Nullable Input<String> id) {
        var defaultOptions = io.pulumi.resources.CustomResourceOptions.builder()
            .setVersion(Utilities.getVersion())
            .setAliases(List.of(
                Input.of(Alias.builder().setType("azure-native:storage/v20210801:LocalUser").build())
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
    public static LocalUser get(String name, Input<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        return new LocalUser(name, id, options);
    }
}
