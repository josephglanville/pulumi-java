// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.web;

import io.pulumi.azurenative.Utilities;
import io.pulumi.azurenative.web.WebAppPremierAddOnArgs;
import io.pulumi.core.Alias;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.Export;
import io.pulumi.core.annotations.ResourceType;
import java.lang.String;
import java.util.List;
import java.util.Map;
import javax.annotation.Nullable;

/**
 * Premier add-on.
 * API Version: 2020-12-01.
 * ## Import
 * 
 * An existing resource can be imported using its type token, name, and identifier, e.g.
 * 
 * ```sh
 * $ pulumi import azure-native:web:WebAppPremierAddOn myresource1 /subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/Microsoft.Web/sites/{name}/premieraddons/{premierAddOnName} 
 * ```
 * 
 */
@ResourceType(type="azure-native:web:WebAppPremierAddOn")
public class WebAppPremierAddOn extends io.pulumi.resources.CustomResource {
    /**
     * Kind of resource.
     * 
     */
    @Export(name="kind", type=String.class, parameters={})
    private Output</* @Nullable */ String> kind;

    /**
     * @return Kind of resource.
     * 
     */
    public Output</* @Nullable */ String> getKind() {
        return this.kind;
    }
    /**
     * Resource Location.
     * 
     */
    @Export(name="location", type=String.class, parameters={})
    private Output<String> location;

    /**
     * @return Resource Location.
     * 
     */
    public Output<String> getLocation() {
        return this.location;
    }
    /**
     * Premier add on Marketplace offer.
     * 
     */
    @Export(name="marketplaceOffer", type=String.class, parameters={})
    private Output</* @Nullable */ String> marketplaceOffer;

    /**
     * @return Premier add on Marketplace offer.
     * 
     */
    public Output</* @Nullable */ String> getMarketplaceOffer() {
        return this.marketplaceOffer;
    }
    /**
     * Premier add on Marketplace publisher.
     * 
     */
    @Export(name="marketplacePublisher", type=String.class, parameters={})
    private Output</* @Nullable */ String> marketplacePublisher;

    /**
     * @return Premier add on Marketplace publisher.
     * 
     */
    public Output</* @Nullable */ String> getMarketplacePublisher() {
        return this.marketplacePublisher;
    }
    /**
     * Resource Name.
     * 
     */
    @Export(name="name", type=String.class, parameters={})
    private Output<String> name;

    /**
     * @return Resource Name.
     * 
     */
    public Output<String> getName() {
        return this.name;
    }
    /**
     * Premier add on Product.
     * 
     */
    @Export(name="product", type=String.class, parameters={})
    private Output</* @Nullable */ String> product;

    /**
     * @return Premier add on Product.
     * 
     */
    public Output</* @Nullable */ String> getProduct() {
        return this.product;
    }
    /**
     * Premier add on SKU.
     * 
     */
    @Export(name="sku", type=String.class, parameters={})
    private Output</* @Nullable */ String> sku;

    /**
     * @return Premier add on SKU.
     * 
     */
    public Output</* @Nullable */ String> getSku() {
        return this.sku;
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
     * Resource type.
     * 
     */
    @Export(name="type", type=String.class, parameters={})
    private Output<String> type;

    /**
     * @return Resource type.
     * 
     */
    public Output<String> getType() {
        return this.type;
    }
    /**
     * Premier add on Vendor.
     * 
     */
    @Export(name="vendor", type=String.class, parameters={})
    private Output</* @Nullable */ String> vendor;

    /**
     * @return Premier add on Vendor.
     * 
     */
    public Output</* @Nullable */ String> getVendor() {
        return this.vendor;
    }

    public interface BuilderApplicator {
        public void apply(WebAppPremierAddOnArgs.Builder a);
    }
    private static io.pulumi.azurenative.web.WebAppPremierAddOnArgs buildArgs(BuilderApplicator argsBuilder) {
        final var builder = io.pulumi.azurenative.web.WebAppPremierAddOnArgs.builder();
        argsBuilder.apply(builder);
        return builder.build();
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param argsBuilder A function that configures a passed builder.
     */
    public WebAppPremierAddOn(String name, BuilderApplicator argsBuilder) {
        this(name, buildArgs(argsBuilder), null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public WebAppPremierAddOn(String name) {
        this(name, WebAppPremierAddOnArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public WebAppPremierAddOn(String name, WebAppPremierAddOnArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public WebAppPremierAddOn(String name, WebAppPremierAddOnArgs args, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("azure-native:web:WebAppPremierAddOn", name, args == null ? WebAppPremierAddOnArgs.Empty : args, makeResourceOptions(options, Output.empty()));
    }

    private WebAppPremierAddOn(String name, Output<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("azure-native:web:WebAppPremierAddOn", name, null, makeResourceOptions(options, id));
    }

    private static io.pulumi.resources.CustomResourceOptions makeResourceOptions(@Nullable io.pulumi.resources.CustomResourceOptions options, @Nullable Output<String> id) {
        var defaultOptions = io.pulumi.resources.CustomResourceOptions.builder()
            .version(Utilities.getVersion())
            .aliases(List.of(
                Output.of(Alias.builder().type("azure-native:web/v20150801:WebAppPremierAddOn").build()),
                Output.of(Alias.builder().type("azure-native:web/v20160801:WebAppPremierAddOn").build()),
                Output.of(Alias.builder().type("azure-native:web/v20180201:WebAppPremierAddOn").build()),
                Output.of(Alias.builder().type("azure-native:web/v20181101:WebAppPremierAddOn").build()),
                Output.of(Alias.builder().type("azure-native:web/v20190801:WebAppPremierAddOn").build()),
                Output.of(Alias.builder().type("azure-native:web/v20200601:WebAppPremierAddOn").build()),
                Output.of(Alias.builder().type("azure-native:web/v20200901:WebAppPremierAddOn").build()),
                Output.of(Alias.builder().type("azure-native:web/v20201001:WebAppPremierAddOn").build()),
                Output.of(Alias.builder().type("azure-native:web/v20201201:WebAppPremierAddOn").build()),
                Output.of(Alias.builder().type("azure-native:web/v20210101:WebAppPremierAddOn").build()),
                Output.of(Alias.builder().type("azure-native:web/v20210115:WebAppPremierAddOn").build()),
                Output.of(Alias.builder().type("azure-native:web/v20210201:WebAppPremierAddOn").build()),
                Output.of(Alias.builder().type("azure-native:web/v20210301:WebAppPremierAddOn").build())
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
    public static WebAppPremierAddOn get(String name, Output<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        return new WebAppPremierAddOn(name, id, options);
    }
}
