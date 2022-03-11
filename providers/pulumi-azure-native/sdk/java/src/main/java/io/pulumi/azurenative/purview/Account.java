// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.purview;

import io.pulumi.azurenative.Utilities;
import io.pulumi.azurenative.purview.AccountArgs;
import io.pulumi.azurenative.purview.outputs.AccountPropertiesResponseEndpoints;
import io.pulumi.azurenative.purview.outputs.AccountPropertiesResponseManagedResources;
import io.pulumi.azurenative.purview.outputs.AccountPropertiesResponseSystemData;
import io.pulumi.azurenative.purview.outputs.AccountResponseSku;
import io.pulumi.azurenative.purview.outputs.CloudConnectorsResponse;
import io.pulumi.azurenative.purview.outputs.IdentityResponse;
import io.pulumi.azurenative.purview.outputs.PrivateEndpointConnectionResponse;
import io.pulumi.core.Alias;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.OutputExport;
import io.pulumi.core.annotations.ResourceType;
import java.lang.String;
import java.util.List;
import java.util.Map;
import javax.annotation.Nullable;

/**
 * Account resource
 * API Version: 2020-12-01-preview.
 * 
 * ## Example Usage
 * 
 * ## Import
 * 
 * An existing resource can be imported using its type token, name, and identifier, e.g.
 * 
 * ```sh
 * $ pulumi import azure-native:purview:Account account1 /subscriptions/34adfa4f-cedf-4dc0-ba29-b6d1a69ab345/resourceGroups/SampleResourceGroup/providers/Microsoft.Purview/accounts/account1 
 * ```
 * 
 */
@ResourceType(type="azure-native:purview:Account")
public class Account extends io.pulumi.resources.CustomResource {
    /**
     * Cloud connectors.
     * External cloud identifier used as part of scanning configuration.
     * 
     */
    @OutputExport(name="cloudConnectors", type=CloudConnectorsResponse.class, parameters={})
    private Output</* @Nullable */ CloudConnectorsResponse> cloudConnectors;

    /**
     * @return Cloud connectors.
     * External cloud identifier used as part of scanning configuration.
     * 
     */
    public Output</* @Nullable */ CloudConnectorsResponse> getCloudConnectors() {
        return this.cloudConnectors;
    }
    /**
     * Gets the time at which the entity was created.
     * 
     */
    @OutputExport(name="createdAt", type=String.class, parameters={})
    private Output<String> createdAt;

    /**
     * @return Gets the time at which the entity was created.
     * 
     */
    public Output<String> getCreatedAt() {
        return this.createdAt;
    }
    /**
     * Gets the creator of the entity.
     * 
     */
    @OutputExport(name="createdBy", type=String.class, parameters={})
    private Output<String> createdBy;

    /**
     * @return Gets the creator of the entity.
     * 
     */
    public Output<String> getCreatedBy() {
        return this.createdBy;
    }
    /**
     * Gets the creators of the entity's object id.
     * 
     */
    @OutputExport(name="createdByObjectId", type=String.class, parameters={})
    private Output<String> createdByObjectId;

    /**
     * @return Gets the creators of the entity's object id.
     * 
     */
    public Output<String> getCreatedByObjectId() {
        return this.createdByObjectId;
    }
    /**
     * The URIs that are the public endpoints of the account.
     * 
     */
    @OutputExport(name="endpoints", type=AccountPropertiesResponseEndpoints.class, parameters={})
    private Output<AccountPropertiesResponseEndpoints> endpoints;

    /**
     * @return The URIs that are the public endpoints of the account.
     * 
     */
    public Output<AccountPropertiesResponseEndpoints> getEndpoints() {
        return this.endpoints;
    }
    /**
     * Gets or sets the friendly name.
     * 
     */
    @OutputExport(name="friendlyName", type=String.class, parameters={})
    private Output<String> friendlyName;

    /**
     * @return Gets or sets the friendly name.
     * 
     */
    public Output<String> getFriendlyName() {
        return this.friendlyName;
    }
    /**
     * Identity Info on the tracked resource
     * 
     */
    @OutputExport(name="identity", type=IdentityResponse.class, parameters={})
    private Output</* @Nullable */ IdentityResponse> identity;

    /**
     * @return Identity Info on the tracked resource
     * 
     */
    public Output</* @Nullable */ IdentityResponse> getIdentity() {
        return this.identity;
    }
    /**
     * Gets or sets the location.
     * 
     */
    @OutputExport(name="location", type=String.class, parameters={})
    private Output</* @Nullable */ String> location;

    /**
     * @return Gets or sets the location.
     * 
     */
    public Output</* @Nullable */ String> getLocation() {
        return this.location;
    }
    /**
     * Gets or sets the managed resource group name
     * 
     */
    @OutputExport(name="managedResourceGroupName", type=String.class, parameters={})
    private Output</* @Nullable */ String> managedResourceGroupName;

    /**
     * @return Gets or sets the managed resource group name
     * 
     */
    public Output</* @Nullable */ String> getManagedResourceGroupName() {
        return this.managedResourceGroupName;
    }
    /**
     * Gets the resource identifiers of the managed resources.
     * 
     */
    @OutputExport(name="managedResources", type=AccountPropertiesResponseManagedResources.class, parameters={})
    private Output<AccountPropertiesResponseManagedResources> managedResources;

    /**
     * @return Gets the resource identifiers of the managed resources.
     * 
     */
    public Output<AccountPropertiesResponseManagedResources> getManagedResources() {
        return this.managedResources;
    }
    /**
     * Gets or sets the name.
     * 
     */
    @OutputExport(name="name", type=String.class, parameters={})
    private Output<String> name;

    /**
     * @return Gets or sets the name.
     * 
     */
    public Output<String> getName() {
        return this.name;
    }
    /**
     * Gets the private endpoint connections information.
     * 
     */
    @OutputExport(name="privateEndpointConnections", type=List.class, parameters={PrivateEndpointConnectionResponse.class})
    private Output<List<PrivateEndpointConnectionResponse>> privateEndpointConnections;

    /**
     * @return Gets the private endpoint connections information.
     * 
     */
    public Output<List<PrivateEndpointConnectionResponse>> getPrivateEndpointConnections() {
        return this.privateEndpointConnections;
    }
    /**
     * Gets or sets the state of the provisioning.
     * 
     */
    @OutputExport(name="provisioningState", type=String.class, parameters={})
    private Output<String> provisioningState;

    /**
     * @return Gets or sets the state of the provisioning.
     * 
     */
    public Output<String> getProvisioningState() {
        return this.provisioningState;
    }
    /**
     * Gets or sets the public network access.
     * 
     */
    @OutputExport(name="publicNetworkAccess", type=String.class, parameters={})
    private Output</* @Nullable */ String> publicNetworkAccess;

    /**
     * @return Gets or sets the public network access.
     * 
     */
    public Output</* @Nullable */ String> getPublicNetworkAccess() {
        return this.publicNetworkAccess;
    }
    /**
     * Gets or sets the Sku.
     * 
     */
    @OutputExport(name="sku", type=AccountResponseSku.class, parameters={})
    private Output<AccountResponseSku> sku;

    /**
     * @return Gets or sets the Sku.
     * 
     */
    public Output<AccountResponseSku> getSku() {
        return this.sku;
    }
    /**
     * Metadata pertaining to creation and last modification of the resource.
     * 
     */
    @OutputExport(name="systemData", type=AccountPropertiesResponseSystemData.class, parameters={})
    private Output<AccountPropertiesResponseSystemData> systemData;

    /**
     * @return Metadata pertaining to creation and last modification of the resource.
     * 
     */
    public Output<AccountPropertiesResponseSystemData> getSystemData() {
        return this.systemData;
    }
    /**
     * Tags on the azure resource.
     * 
     */
    @OutputExport(name="tags", type=Map.class, parameters={String.class, String.class})
    private Output</* @Nullable */ Map<String,String>> tags;

    /**
     * @return Tags on the azure resource.
     * 
     */
    public Output</* @Nullable */ Map<String,String>> getTags() {
        return this.tags;
    }
    /**
     * Gets or sets the type.
     * 
     */
    @OutputExport(name="type", type=String.class, parameters={})
    private Output<String> type;

    /**
     * @return Gets or sets the type.
     * 
     */
    public Output<String> getType() {
        return this.type;
    }

    public interface BuilderApplicator {
        public void apply(AccountArgs.Builder a);
    }
    private static io.pulumi.azurenative.purview.AccountArgs buildArgs(BuilderApplicator argsBuilder) {
        final var builder = io.pulumi.azurenative.purview.AccountArgs.builder();
        argsBuilder.apply(builder);
        return builder.build();
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param argsBuilder A function that configures a passed builder.
     */
    public Account(String name, BuilderApplicator argsBuilder) {
        this(name, buildArgs(argsBuilder), null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public Account(String name) {
        this(name, AccountArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public Account(String name, AccountArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public Account(String name, AccountArgs args, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("azure-native:purview:Account", name, args == null ? AccountArgs.Empty : args, makeResourceOptions(options, Output.empty()));
    }

    private Account(String name, Output<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("azure-native:purview:Account", name, null, makeResourceOptions(options, id));
    }

    private static io.pulumi.resources.CustomResourceOptions makeResourceOptions(@Nullable io.pulumi.resources.CustomResourceOptions options, @Nullable Output<String> id) {
        var defaultOptions = io.pulumi.resources.CustomResourceOptions.builder()
            .setVersion(Utilities.getVersion())
            .setAliases(List.of(
                Output.of(Alias.builder().setType("azure-native:purview/v20201201preview:Account").build()),
                Output.of(Alias.builder().setType("azure-native:purview/v20210701:Account").build())
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
    public static Account get(String name, Output<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        return new Account(name, id, options);
    }
}
