// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.azureactivedirectory;

import io.pulumi.azurenative.Utilities;
import io.pulumi.azurenative.azureactivedirectory.B2CTenantArgs;
import io.pulumi.azurenative.azureactivedirectory.outputs.B2CResourceSKUResponse;
import io.pulumi.azurenative.azureactivedirectory.outputs.B2CTenantResourcePropertiesResponseBillingConfig;
import io.pulumi.core.Alias;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.Export;
import io.pulumi.core.annotations.ResourceType;
import io.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.List;
import java.util.Map;
import javax.annotation.Nullable;

/**
 * API Version: 2019-01-01-preview.
 * 
 * ## Example Usage
 * 
 * ## Import
 * 
 * An existing resource can be imported using its type token, name, and identifier, e.g.
 * 
 * ```sh
 * $ pulumi import azure-native:azureactivedirectory:B2CTenant contoso.onmicrosoft.com /subscriptions/34adfa4f-cedf-4dc0-ba29-b6d1a69ab345/resourceGroups/contosoResourceGroup/providers/Microsoft.AzureActiveDirectory/b2cDirectories/contoso.onmicrosoft.com 
 * ```
 * 
 */
@ResourceType(type="azure-native:azureactivedirectory:B2CTenant")
public class B2CTenant extends io.pulumi.resources.CustomResource {
    /**
     * The billing configuration for the tenant.
     * 
     */
    @Export(name="billingConfig", type=B2CTenantResourcePropertiesResponseBillingConfig.class, parameters={})
    private Output</* @Nullable */ B2CTenantResourcePropertiesResponseBillingConfig> billingConfig;

    /**
     * @return The billing configuration for the tenant.
     * 
     */
    public Output</* @Nullable */ B2CTenantResourcePropertiesResponseBillingConfig> getBillingConfig() {
        return this.billingConfig;
    }
    /**
     * The location in which the resource is hosted and data resides. Can be one of 'United States', 'Europe', 'Asia Pacific', or 'Australia' (preview). Refer to [this documentation](https://aka.ms/B2CDataResidency) for more information.
     * 
     */
    @Export(name="location", type=String.class, parameters={})
    private Output<String> location;

    /**
     * @return The location in which the resource is hosted and data resides. Can be one of 'United States', 'Europe', 'Asia Pacific', or 'Australia' (preview). Refer to [this documentation](https://aka.ms/B2CDataResidency) for more information.
     * 
     */
    public Output<String> getLocation() {
        return this.location;
    }
    /**
     * The name of the B2C tenant resource.
     * 
     */
    @Export(name="name", type=String.class, parameters={})
    private Output<String> name;

    /**
     * @return The name of the B2C tenant resource.
     * 
     */
    public Output<String> getName() {
        return this.name;
    }
    /**
     * SKU properties of the Azure AD B2C tenant. Learn more about Azure AD B2C billing at [aka.ms/b2cBilling](https://aka.ms/b2cBilling).
     * 
     */
    @Export(name="sku", type=B2CResourceSKUResponse.class, parameters={})
    private Output<B2CResourceSKUResponse> sku;

    /**
     * @return SKU properties of the Azure AD B2C tenant. Learn more about Azure AD B2C billing at [aka.ms/b2cBilling](https://aka.ms/b2cBilling).
     * 
     */
    public Output<B2CResourceSKUResponse> getSku() {
        return this.sku;
    }
    /**
     * Resource Tags
     * 
     */
    @Export(name="tags", type=Map.class, parameters={String.class, String.class})
    private Output</* @Nullable */ Map<String,String>> tags;

    /**
     * @return Resource Tags
     * 
     */
    public Output</* @Nullable */ Map<String,String>> getTags() {
        return this.tags;
    }
    /**
     * An identifier of the B2C tenant.
     * 
     */
    @Export(name="tenantId", type=String.class, parameters={})
    private Output</* @Nullable */ String> tenantId;

    /**
     * @return An identifier of the B2C tenant.
     * 
     */
    public Output</* @Nullable */ String> getTenantId() {
        return this.tenantId;
    }
    /**
     * The type of the B2C tenant resource.
     * 
     */
    @Export(name="type", type=String.class, parameters={})
    private Output<String> type;

    /**
     * @return The type of the B2C tenant resource.
     * 
     */
    public Output<String> getType() {
        return this.type;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public B2CTenant(String name) {
        this(name, B2CTenantArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public B2CTenant(String name, B2CTenantArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public B2CTenant(String name, B2CTenantArgs args, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("azure-native:azureactivedirectory:B2CTenant", name, args == null ? B2CTenantArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private B2CTenant(String name, Output<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("azure-native:azureactivedirectory:B2CTenant", name, null, makeResourceOptions(options, id));
    }

    private static io.pulumi.resources.CustomResourceOptions makeResourceOptions(@Nullable io.pulumi.resources.CustomResourceOptions options, @Nullable Output<String> id) {
        var defaultOptions = io.pulumi.resources.CustomResourceOptions.builder()
            .version(Utilities.getVersion())
            .aliases(List.of(
                Output.of(Alias.builder().type("azure-native:azureactivedirectory/v20190101preview:B2CTenant").build())
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
    public static B2CTenant get(String name, Output<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        return new B2CTenant(name, id, options);
    }
}
