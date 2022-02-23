// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.dataprotection;

import io.pulumi.azurenative.Utilities;
import io.pulumi.azurenative.dataprotection.BackupVaultArgs;
import io.pulumi.azurenative.dataprotection.outputs.BackupVaultResponse;
import io.pulumi.azurenative.dataprotection.outputs.DppIdentityDetailsResponse;
import io.pulumi.azurenative.dataprotection.outputs.SystemDataResponse;
import io.pulumi.core.Alias;
import io.pulumi.core.Input;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.OutputExport;
import io.pulumi.core.annotations.ResourceType;
import java.lang.String;
import java.util.List;
import java.util.Map;
import javax.annotation.Nullable;

/**
 * Backup Vault Resource
 * API Version: 2021-01-01.
 * 
 * ## Example Usage
 * 
 * ## Import
 * 
 * An existing resource can be imported using its type token, name, and identifier, e.g.
 * 
 * ```sh
 * $ pulumi import azure-native:dataprotection:BackupVault swaggerExample /subscriptions/0b352192-dcac-4cc7-992e-a96190ccc68c/resourceGroups/SampleResourceGroup/providers/Microsoft.DataProtection/Backupvaults/swaggerExample 
 * ```
 * 
 */
@ResourceType(type="azure-native:dataprotection:BackupVault")
public class BackupVault extends io.pulumi.resources.CustomResource {
    /**
     * Optional ETag.
     * 
     */
    @OutputExport(name="eTag", type=String.class, parameters={})
    private Output</* @Nullable */ String> eTag;

    /**
     * @return Optional ETag.
     * 
     */
    public Output</* @Nullable */ String> getETag() {
        return this.eTag;
    }
    /**
     * Input Managed Identity Details
     * 
     */
    @OutputExport(name="identity", type=DppIdentityDetailsResponse.class, parameters={})
    private Output</* @Nullable */ DppIdentityDetailsResponse> identity;

    /**
     * @return Input Managed Identity Details
     * 
     */
    public Output</* @Nullable */ DppIdentityDetailsResponse> getIdentity() {
        return this.identity;
    }
    /**
     * Resource location.
     * 
     */
    @OutputExport(name="location", type=String.class, parameters={})
    private Output<String> location;

    /**
     * @return Resource location.
     * 
     */
    public Output<String> getLocation() {
        return this.location;
    }
    /**
     * Resource name associated with the resource.
     * 
     */
    @OutputExport(name="name", type=String.class, parameters={})
    private Output<String> name;

    /**
     * @return Resource name associated with the resource.
     * 
     */
    public Output<String> getName() {
        return this.name;
    }
    /**
     * BackupVaultResource properties
     * 
     */
    @OutputExport(name="properties", type=BackupVaultResponse.class, parameters={})
    private Output<BackupVaultResponse> properties;

    /**
     * @return BackupVaultResource properties
     * 
     */
    public Output<BackupVaultResponse> getProperties() {
        return this.properties;
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
     * Resource tags.
     * 
     */
    @OutputExport(name="tags", type=Map.class, parameters={String.class, String.class})
    private Output</* @Nullable */ Map<String,String>> tags;

    /**
     * @return Resource tags.
     * 
     */
    public Output</* @Nullable */ Map<String,String>> getTags() {
        return this.tags;
    }
    /**
     * Resource type represents the complete path of the form Namespace/ResourceType/ResourceType/...
     * 
     */
    @OutputExport(name="type", type=String.class, parameters={})
    private Output<String> type;

    /**
     * @return Resource type represents the complete path of the form Namespace/ResourceType/ResourceType/...
     * 
     */
    public Output<String> getType() {
        return this.type;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public BackupVault(String name) {
        this(name, BackupVaultArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public BackupVault(String name, BackupVaultArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public BackupVault(String name, BackupVaultArgs args, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("azure-native:dataprotection:BackupVault", name, args == null ? BackupVaultArgs.Empty : args, makeResourceOptions(options, Input.empty()));
    }

    private BackupVault(String name, Input<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("azure-native:dataprotection:BackupVault", name, null, makeResourceOptions(options, id));
    }

    private static io.pulumi.resources.CustomResourceOptions makeResourceOptions(@Nullable io.pulumi.resources.CustomResourceOptions options, @Nullable Input<String> id) {
        var defaultOptions = io.pulumi.resources.CustomResourceOptions.builder()
            .setVersion(Utilities.getVersion())
            .setAliases(List.of(
                Input.of(Alias.builder().setType("azure-native:dataprotection/v20210101:BackupVault").build()),
                Input.of(Alias.builder().setType("azure-native:dataprotection/v20210201preview:BackupVault").build()),
                Input.of(Alias.builder().setType("azure-native:dataprotection/v20210601preview:BackupVault").build()),
                Input.of(Alias.builder().setType("azure-native:dataprotection/v20210701:BackupVault").build()),
                Input.of(Alias.builder().setType("azure-native:dataprotection/v20211001preview:BackupVault").build()),
                Input.of(Alias.builder().setType("azure-native:dataprotection/v20211201preview:BackupVault").build())
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
    public static BackupVault get(String name, Input<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        return new BackupVault(name, id, options);
    }
}
