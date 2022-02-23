// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.azuredata;

import io.pulumi.azurenative.Utilities;
import io.pulumi.azurenative.azuredata.SqlServerRegistrationArgs;
import io.pulumi.azurenative.azuredata.outputs.SystemDataResponse;
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
 * A SQL server registration.
 * API Version: 2019-07-24-preview.
 * 
 * ## Example Usage
 * 
 * ## Import
 * 
 * An existing resource can be imported using its type token, name, and identifier, e.g.
 * 
 * ```sh
 * $ pulumi import azure-native:azuredata:SqlServerRegistration testsqlregistration /subscriptions/00000000-1111-2222-3333-444444444444/resourceGroups/testrg/providers/Microsoft.AzureData/SqlServerRegistrations/testsqlregistration 
 * ```
 * 
 */
@ResourceType(type="azure-native:azuredata:SqlServerRegistration")
public class SqlServerRegistration extends io.pulumi.resources.CustomResource {
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
     * Optional Properties as JSON string
     * 
     */
    @OutputExport(name="propertyBag", type=String.class, parameters={})
    private Output</* @Nullable */ String> propertyBag;

    /**
     * @return Optional Properties as JSON string
     * 
     */
    public Output</* @Nullable */ String> getPropertyBag() {
        return this.propertyBag;
    }
    /**
     * Resource Group Name
     * 
     */
    @OutputExport(name="resourceGroup", type=String.class, parameters={})
    private Output</* @Nullable */ String> resourceGroup;

    /**
     * @return Resource Group Name
     * 
     */
    public Output</* @Nullable */ String> getResourceGroup() {
        return this.resourceGroup;
    }
    /**
     * Subscription Id
     * 
     */
    @OutputExport(name="subscriptionId", type=String.class, parameters={})
    private Output</* @Nullable */ String> subscriptionId;

    /**
     * @return Subscription Id
     * 
     */
    public Output</* @Nullable */ String> getSubscriptionId() {
        return this.subscriptionId;
    }
    /**
     * Read only system data
     * 
     */
    @OutputExport(name="systemData", type=SystemDataResponse.class, parameters={})
    private Output<SystemDataResponse> systemData;

    /**
     * @return Read only system data
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
     * The type of the resource. Ex- Microsoft.Compute/virtualMachines or Microsoft.Storage/storageAccounts.
     * 
     */
    @OutputExport(name="type", type=String.class, parameters={})
    private Output<String> type;

    /**
     * @return The type of the resource. Ex- Microsoft.Compute/virtualMachines or Microsoft.Storage/storageAccounts.
     * 
     */
    public Output<String> getType() {
        return this.type;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public SqlServerRegistration(String name) {
        this(name, SqlServerRegistrationArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public SqlServerRegistration(String name, SqlServerRegistrationArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public SqlServerRegistration(String name, SqlServerRegistrationArgs args, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("azure-native:azuredata:SqlServerRegistration", name, args == null ? SqlServerRegistrationArgs.Empty : args, makeResourceOptions(options, Input.empty()));
    }

    private SqlServerRegistration(String name, Input<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("azure-native:azuredata:SqlServerRegistration", name, null, makeResourceOptions(options, id));
    }

    private static io.pulumi.resources.CustomResourceOptions makeResourceOptions(@Nullable io.pulumi.resources.CustomResourceOptions options, @Nullable Input<String> id) {
        var defaultOptions = io.pulumi.resources.CustomResourceOptions.builder()
            .setVersion(Utilities.getVersion())
            .setAliases(List.of(
                Input.of(Alias.builder().setType("azure-native:azuredata/v20170301preview:SqlServerRegistration").build()),
                Input.of(Alias.builder().setType("azure-native:azuredata/v20190724preview:SqlServerRegistration").build())
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
    public static SqlServerRegistration get(String name, Input<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        return new SqlServerRegistration(name, id, options);
    }
}
