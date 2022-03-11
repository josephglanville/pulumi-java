// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.mixedreality;

import io.pulumi.azurenative.Utilities;
import io.pulumi.azurenative.mixedreality.RemoteRenderingAccountArgs;
import io.pulumi.azurenative.mixedreality.outputs.IdentityResponse;
import io.pulumi.azurenative.mixedreality.outputs.SkuResponse;
import io.pulumi.azurenative.mixedreality.outputs.SystemDataResponse;
import io.pulumi.core.Alias;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.OutputExport;
import io.pulumi.core.annotations.ResourceType;
import java.lang.String;
import java.util.List;
import java.util.Map;
import javax.annotation.Nullable;

/**
 * RemoteRenderingAccount Response.
 * API Version: 2021-01-01.
 * 
 * ## Example Usage
 * 
 * ## Import
 * 
 * An existing resource can be imported using its type token, name, and identifier, e.g.
 * 
 * ```sh
 * $ pulumi import azure-native:mixedreality:RemoteRenderingAccount MyAccount /subscriptions/xxxxxxxx-xxxx-xxxx-xxxx-xxxxxxxxxxxx/resourceGroups/MyResourceGroup/providers/Microsoft.MixedReality/remoteRenderingAccounts/MyAccount 
 * ```
 * 
 */
@ResourceType(type="azure-native:mixedreality:RemoteRenderingAccount")
public class RemoteRenderingAccount extends io.pulumi.resources.CustomResource {
    /**
     * Correspond domain name of certain Spatial Anchors Account
     * 
     */
    @OutputExport(name="accountDomain", type=String.class, parameters={})
    private Output<String> accountDomain;

    /**
     * @return Correspond domain name of certain Spatial Anchors Account
     * 
     */
    public Output<String> getAccountDomain() {
        return this.accountDomain;
    }
    /**
     * unique id of certain account.
     * 
     */
    @OutputExport(name="accountId", type=String.class, parameters={})
    private Output<String> accountId;

    /**
     * @return unique id of certain account.
     * 
     */
    public Output<String> getAccountId() {
        return this.accountId;
    }
    /**
     * The identity associated with this account
     * 
     */
    @OutputExport(name="identity", type=IdentityResponse.class, parameters={})
    private Output</* @Nullable */ IdentityResponse> identity;

    /**
     * @return The identity associated with this account
     * 
     */
    public Output</* @Nullable */ IdentityResponse> getIdentity() {
        return this.identity;
    }
    /**
     * The kind of account, if supported
     * 
     */
    @OutputExport(name="kind", type=SkuResponse.class, parameters={})
    private Output</* @Nullable */ SkuResponse> kind;

    /**
     * @return The kind of account, if supported
     * 
     */
    public Output</* @Nullable */ SkuResponse> getKind() {
        return this.kind;
    }
    /**
     * The geo-location where the resource lives
     * 
     */
    @OutputExport(name="location", type=String.class, parameters={})
    private Output<String> location;

    /**
     * @return The geo-location where the resource lives
     * 
     */
    public Output<String> getLocation() {
        return this.location;
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
     * The plan associated with this account
     * 
     */
    @OutputExport(name="plan", type=IdentityResponse.class, parameters={})
    private Output</* @Nullable */ IdentityResponse> plan;

    /**
     * @return The plan associated with this account
     * 
     */
    public Output</* @Nullable */ IdentityResponse> getPlan() {
        return this.plan;
    }
    /**
     * The sku associated with this account
     * 
     */
    @OutputExport(name="sku", type=SkuResponse.class, parameters={})
    private Output</* @Nullable */ SkuResponse> sku;

    /**
     * @return The sku associated with this account
     * 
     */
    public Output</* @Nullable */ SkuResponse> getSku() {
        return this.sku;
    }
    /**
     * The name of the storage account associated with this accountId
     * 
     */
    @OutputExport(name="storageAccountName", type=String.class, parameters={})
    private Output</* @Nullable */ String> storageAccountName;

    /**
     * @return The name of the storage account associated with this accountId
     * 
     */
    public Output</* @Nullable */ String> getStorageAccountName() {
        return this.storageAccountName;
    }
    /**
     * System metadata for this account
     * 
     */
    @OutputExport(name="systemData", type=SystemDataResponse.class, parameters={})
    private Output<SystemDataResponse> systemData;

    /**
     * @return System metadata for this account
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

    public interface BuilderApplicator {
        public void apply(RemoteRenderingAccountArgs.Builder a);
    }
    private static io.pulumi.azurenative.mixedreality.RemoteRenderingAccountArgs buildArgs(BuilderApplicator argsBuilder) {
        final var builder = io.pulumi.azurenative.mixedreality.RemoteRenderingAccountArgs.builder();
        argsBuilder.apply(builder);
        return builder.build();
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param argsBuilder A function that configures a passed builder.
     */
    public RemoteRenderingAccount(String name, BuilderApplicator argsBuilder) {
        this(name, buildArgs(argsBuilder), null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public RemoteRenderingAccount(String name) {
        this(name, RemoteRenderingAccountArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public RemoteRenderingAccount(String name, RemoteRenderingAccountArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public RemoteRenderingAccount(String name, RemoteRenderingAccountArgs args, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("azure-native:mixedreality:RemoteRenderingAccount", name, args == null ? RemoteRenderingAccountArgs.Empty : args, makeResourceOptions(options, Output.empty()));
    }

    private RemoteRenderingAccount(String name, Output<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("azure-native:mixedreality:RemoteRenderingAccount", name, null, makeResourceOptions(options, id));
    }

    private static io.pulumi.resources.CustomResourceOptions makeResourceOptions(@Nullable io.pulumi.resources.CustomResourceOptions options, @Nullable Output<String> id) {
        var defaultOptions = io.pulumi.resources.CustomResourceOptions.builder()
            .setVersion(Utilities.getVersion())
            .setAliases(List.of(
                Output.of(Alias.builder().setType("azure-native:mixedreality/v20191202preview:RemoteRenderingAccount").build()),
                Output.of(Alias.builder().setType("azure-native:mixedreality/v20200406preview:RemoteRenderingAccount").build()),
                Output.of(Alias.builder().setType("azure-native:mixedreality/v20210101:RemoteRenderingAccount").build()),
                Output.of(Alias.builder().setType("azure-native:mixedreality/v20210301preview:RemoteRenderingAccount").build())
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
    public static RemoteRenderingAccount get(String name, Output<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        return new RemoteRenderingAccount(name, id, options);
    }
}
