// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.recoveryservices;

import io.pulumi.azurenative.Utilities;
import io.pulumi.azurenative.recoveryservices.ProtectionIntentArgs;
import io.pulumi.azurenative.recoveryservices.outputs.AzureRecoveryServiceVaultProtectionIntentResponse;
import io.pulumi.azurenative.recoveryservices.outputs.AzureResourceProtectionIntentResponse;
import io.pulumi.azurenative.recoveryservices.outputs.AzureWorkloadAutoProtectionIntentResponse;
import io.pulumi.azurenative.recoveryservices.outputs.AzureWorkloadSQLAutoProtectionIntentResponse;
import io.pulumi.core.Alias;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.Export;
import io.pulumi.core.annotations.ResourceType;
import io.pulumi.core.internal.Codegen;
import java.lang.Object;
import java.lang.String;
import java.util.List;
import java.util.Map;
import javax.annotation.Nullable;

/**
 * Base class for backup ProtectionIntent.
 * API Version: 2021-02-01.
 * 
 * ## Example Usage
 * 
 * ## Import
 * 
 * An existing resource can be imported using its type token, name, and identifier, e.g.
 * 
 * ```sh
 * $ pulumi import azure-native:recoveryservices:ProtectionIntent vm;iaasvmcontainerv2;chamsrgtest;chamscandel /subscriptions/00000000-0000-0000-0000-000000000000/resourceGroups/myRG/providers/Microsoft.RecoveryServices/vaults/myVault/backupFabrics/Azure/backupProtectionIntent/vm;iaasvmcontainerv2;chamsrgtest;chamscandel 
 * ```
 * 
 */
@ResourceType(type="azure-native:recoveryservices:ProtectionIntent")
public class ProtectionIntent extends io.pulumi.resources.CustomResource {
    /**
     * Optional ETag.
     * 
     */
    @Export(name="eTag", type=String.class, parameters={})
    private Output</* @Nullable */ String> eTag;

    /**
     * @return Optional ETag.
     * 
     */
    public Output</* @Nullable */ String> getETag() {
        return this.eTag;
    }
    /**
     * Resource location.
     * 
     */
    @Export(name="location", type=String.class, parameters={})
    private Output</* @Nullable */ String> location;

    /**
     * @return Resource location.
     * 
     */
    public Output</* @Nullable */ String> getLocation() {
        return this.location;
    }
    /**
     * Resource name associated with the resource.
     * 
     */
    @Export(name="name", type=String.class, parameters={})
    private Output<String> name;

    /**
     * @return Resource name associated with the resource.
     * 
     */
    public Output<String> getName() {
        return this.name;
    }
    /**
     * ProtectionIntentResource properties
     * 
     */
    @Export(name="properties", type=Object.class, parameters={})
    private Output<Object> properties;

    /**
     * @return ProtectionIntentResource properties
     * 
     */
    public Output<Object> getProperties() {
        return this.properties;
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
     * Resource type represents the complete path of the form Namespace/ResourceType/ResourceType/...
     * 
     */
    @Export(name="type", type=String.class, parameters={})
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
    public ProtectionIntent(String name) {
        this(name, ProtectionIntentArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public ProtectionIntent(String name, ProtectionIntentArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public ProtectionIntent(String name, ProtectionIntentArgs args, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("azure-native:recoveryservices:ProtectionIntent", name, args == null ? ProtectionIntentArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private ProtectionIntent(String name, Output<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("azure-native:recoveryservices:ProtectionIntent", name, null, makeResourceOptions(options, id));
    }

    private static io.pulumi.resources.CustomResourceOptions makeResourceOptions(@Nullable io.pulumi.resources.CustomResourceOptions options, @Nullable Output<String> id) {
        var defaultOptions = io.pulumi.resources.CustomResourceOptions.builder()
            .version(Utilities.getVersion())
            .aliases(List.of(
                Output.of(Alias.builder().type("azure-native:recoveryservices/v20170701:ProtectionIntent").build()),
                Output.of(Alias.builder().type("azure-native:recoveryservices/v20210201:ProtectionIntent").build()),
                Output.of(Alias.builder().type("azure-native:recoveryservices/v20210201preview:ProtectionIntent").build()),
                Output.of(Alias.builder().type("azure-native:recoveryservices/v20210210:ProtectionIntent").build()),
                Output.of(Alias.builder().type("azure-native:recoveryservices/v20210301:ProtectionIntent").build()),
                Output.of(Alias.builder().type("azure-native:recoveryservices/v20210401:ProtectionIntent").build()),
                Output.of(Alias.builder().type("azure-native:recoveryservices/v20210601:ProtectionIntent").build()),
                Output.of(Alias.builder().type("azure-native:recoveryservices/v20210701:ProtectionIntent").build()),
                Output.of(Alias.builder().type("azure-native:recoveryservices/v20210801:ProtectionIntent").build()),
                Output.of(Alias.builder().type("azure-native:recoveryservices/v20211001:ProtectionIntent").build()),
                Output.of(Alias.builder().type("azure-native:recoveryservices/v20211201:ProtectionIntent").build())
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
    public static ProtectionIntent get(String name, Output<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        return new ProtectionIntent(name, id, options);
    }
}
