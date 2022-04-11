// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.storage;

import io.pulumi.azurenative.Utilities;
import io.pulumi.azurenative.storage.EncryptionScopeArgs;
import io.pulumi.azurenative.storage.outputs.EncryptionScopeKeyVaultPropertiesResponse;
import io.pulumi.core.Alias;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.Export;
import io.pulumi.core.annotations.ResourceType;
import io.pulumi.core.internal.Codegen;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import javax.annotation.Nullable;

/**
 * The Encryption Scope resource.
 * API Version: 2021-02-01.
 * 
 * ## Example Usage
 * 
 * ## Import
 * 
 * An existing resource can be imported using its type token, name, and identifier, e.g.
 * 
 * ```sh
 * $ pulumi import azure-native:storage:EncryptionScope {encryption-scope-name} /subscriptions/{subscription-id}/resourceGroups/resource-group-name/providers/Microsoft.Storage/storageAccounts/{storage-account-name}/encryptionScopes/{encryption-scope-name} 
 * ```
 * 
 */
@ResourceType(type="azure-native:storage:EncryptionScope")
public class EncryptionScope extends io.pulumi.resources.CustomResource {
    /**
     * Gets the creation date and time of the encryption scope in UTC.
     * 
     */
    @Export(name="creationTime", type=String.class, parameters={})
    private Output<String> creationTime;

    /**
     * @return Gets the creation date and time of the encryption scope in UTC.
     * 
     */
    public Output<String> getCreationTime() {
        return this.creationTime;
    }
    /**
     * The key vault properties for the encryption scope. This is a required field if encryption scope 'source' attribute is set to 'Microsoft.KeyVault'.
     * 
     */
    @Export(name="keyVaultProperties", type=EncryptionScopeKeyVaultPropertiesResponse.class, parameters={})
    private Output</* @Nullable */ EncryptionScopeKeyVaultPropertiesResponse> keyVaultProperties;

    /**
     * @return The key vault properties for the encryption scope. This is a required field if encryption scope 'source' attribute is set to 'Microsoft.KeyVault'.
     * 
     */
    public Output</* @Nullable */ EncryptionScopeKeyVaultPropertiesResponse> getKeyVaultProperties() {
        return this.keyVaultProperties;
    }
    /**
     * Gets the last modification date and time of the encryption scope in UTC.
     * 
     */
    @Export(name="lastModifiedTime", type=String.class, parameters={})
    private Output<String> lastModifiedTime;

    /**
     * @return Gets the last modification date and time of the encryption scope in UTC.
     * 
     */
    public Output<String> getLastModifiedTime() {
        return this.lastModifiedTime;
    }
    /**
     * The name of the resource
     * 
     */
    @Export(name="name", type=String.class, parameters={})
    private Output<String> name;

    /**
     * @return The name of the resource
     * 
     */
    public Output<String> getName() {
        return this.name;
    }
    /**
     * A boolean indicating whether or not the service applies a secondary layer of encryption with platform managed keys for data at rest.
     * 
     */
    @Export(name="requireInfrastructureEncryption", type=Boolean.class, parameters={})
    private Output</* @Nullable */ Boolean> requireInfrastructureEncryption;

    /**
     * @return A boolean indicating whether or not the service applies a secondary layer of encryption with platform managed keys for data at rest.
     * 
     */
    public Output</* @Nullable */ Boolean> getRequireInfrastructureEncryption() {
        return this.requireInfrastructureEncryption;
    }
    /**
     * The provider for the encryption scope. Possible values (case-insensitive):  Microsoft.Storage, Microsoft.KeyVault.
     * 
     */
    @Export(name="source", type=String.class, parameters={})
    private Output</* @Nullable */ String> source;

    /**
     * @return The provider for the encryption scope. Possible values (case-insensitive):  Microsoft.Storage, Microsoft.KeyVault.
     * 
     */
    public Output</* @Nullable */ String> getSource() {
        return this.source;
    }
    /**
     * The state of the encryption scope. Possible values (case-insensitive):  Enabled, Disabled.
     * 
     */
    @Export(name="state", type=String.class, parameters={})
    private Output</* @Nullable */ String> state;

    /**
     * @return The state of the encryption scope. Possible values (case-insensitive):  Enabled, Disabled.
     * 
     */
    public Output</* @Nullable */ String> getState() {
        return this.state;
    }
    /**
     * The type of the resource. E.g. "Microsoft.Compute/virtualMachines" or "Microsoft.Storage/storageAccounts"
     * 
     */
    @Export(name="type", type=String.class, parameters={})
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
    public EncryptionScope(String name) {
        this(name, EncryptionScopeArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public EncryptionScope(String name, EncryptionScopeArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public EncryptionScope(String name, EncryptionScopeArgs args, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("azure-native:storage:EncryptionScope", name, args == null ? EncryptionScopeArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private EncryptionScope(String name, Output<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("azure-native:storage:EncryptionScope", name, null, makeResourceOptions(options, id));
    }

    private static io.pulumi.resources.CustomResourceOptions makeResourceOptions(@Nullable io.pulumi.resources.CustomResourceOptions options, @Nullable Output<String> id) {
        var defaultOptions = io.pulumi.resources.CustomResourceOptions.builder()
            .version(Utilities.getVersion())
            .aliases(List.of(
                Output.of(Alias.builder().type("azure-native:storage/v20190601:EncryptionScope").build()),
                Output.of(Alias.builder().type("azure-native:storage/v20200801preview:EncryptionScope").build()),
                Output.of(Alias.builder().type("azure-native:storage/v20210101:EncryptionScope").build()),
                Output.of(Alias.builder().type("azure-native:storage/v20210201:EncryptionScope").build()),
                Output.of(Alias.builder().type("azure-native:storage/v20210401:EncryptionScope").build()),
                Output.of(Alias.builder().type("azure-native:storage/v20210601:EncryptionScope").build()),
                Output.of(Alias.builder().type("azure-native:storage/v20210801:EncryptionScope").build())
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
    public static EncryptionScope get(String name, Output<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        return new EncryptionScope(name, id, options);
    }
}
