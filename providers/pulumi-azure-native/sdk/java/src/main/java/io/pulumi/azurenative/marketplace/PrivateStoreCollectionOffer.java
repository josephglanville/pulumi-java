// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.marketplace;

import io.pulumi.azurenative.Utilities;
import io.pulumi.azurenative.marketplace.PrivateStoreCollectionOfferArgs;
import io.pulumi.azurenative.marketplace.outputs.PlanResponse;
import io.pulumi.azurenative.marketplace.outputs.SystemDataResponse;
import io.pulumi.core.Alias;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.Export;
import io.pulumi.core.annotations.ResourceType;
import io.pulumi.core.internal.Codegen;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Map;
import javax.annotation.Nullable;

/**
 * The privateStore offer data structure.
 * API Version: 2021-06-01.
 * 
 * ## Example Usage
 * 
 * ## Import
 * 
 * An existing resource can be imported using its type token, name, and identifier, e.g.
 * 
 * ```sh
 * $ pulumi import azure-native:marketplace:PrivateStoreCollectionOffer marketplacetestthirdparty.md-test-third-party-2 /providers/Microsoft.Marketplace/privateStores/a0e28e55-90c4-41d8-8e34-bb7ef7775406/collections/56a1a02d-8cf8-45df-bf37-d5f7120fcb3d/offers/marketplacetestthirdparty.md-test-third-party-2 
 * ```
 * 
 */
@ResourceType(type="azure-native:marketplace:PrivateStoreCollectionOffer")
public class PrivateStoreCollectionOffer extends io.pulumi.resources.CustomResource {
    /**
     * Private store offer creation date
     * 
     */
    @Export(name="createdAt", type=String.class, parameters={})
    private Output<String> createdAt;

    /**
     * @return Private store offer creation date
     * 
     */
    public Output<String> getCreatedAt() {
        return this.createdAt;
    }
    /**
     * Identifier for purposes of race condition
     * 
     */
    @Export(name="eTag", type=String.class, parameters={})
    private Output</* @Nullable */ String> eTag;

    /**
     * @return Identifier for purposes of race condition
     * 
     */
    public Output</* @Nullable */ String> getETag() {
        return this.eTag;
    }
    /**
     * Icon File Uris
     * 
     */
    @Export(name="iconFileUris", type=Map.class, parameters={String.class, String.class})
    private Output</* @Nullable */ Map<String,String>> iconFileUris;

    /**
     * @return Icon File Uris
     * 
     */
    public Output</* @Nullable */ Map<String,String>> getIconFileUris() {
        return this.iconFileUris;
    }
    /**
     * Private store offer modification date
     * 
     */
    @Export(name="modifiedAt", type=String.class, parameters={})
    private Output<String> modifiedAt;

    /**
     * @return Private store offer modification date
     * 
     */
    public Output<String> getModifiedAt() {
        return this.modifiedAt;
    }
    /**
     * The name of the resource.
     * 
     */
    @Export(name="name", type=String.class, parameters={})
    private Output<String> name;

    /**
     * @return The name of the resource.
     * 
     */
    public Output<String> getName() {
        return this.name;
    }
    /**
     * It will be displayed prominently in the marketplace
     * 
     */
    @Export(name="offerDisplayName", type=String.class, parameters={})
    private Output<String> offerDisplayName;

    /**
     * @return It will be displayed prominently in the marketplace
     * 
     */
    public Output<String> getOfferDisplayName() {
        return this.offerDisplayName;
    }
    /**
     * Offer plans
     * 
     */
    @Export(name="plans", type=List.class, parameters={PlanResponse.class})
    private Output</* @Nullable */ List<PlanResponse>> plans;

    /**
     * @return Offer plans
     * 
     */
    public Output</* @Nullable */ List<PlanResponse>> getPlans() {
        return this.plans;
    }
    /**
     * Private store unique id
     * 
     */
    @Export(name="privateStoreId", type=String.class, parameters={})
    private Output<String> privateStoreId;

    /**
     * @return Private store unique id
     * 
     */
    public Output<String> getPrivateStoreId() {
        return this.privateStoreId;
    }
    /**
     * Publisher name that will be displayed prominently in the marketplace
     * 
     */
    @Export(name="publisherDisplayName", type=String.class, parameters={})
    private Output<String> publisherDisplayName;

    /**
     * @return Publisher name that will be displayed prominently in the marketplace
     * 
     */
    public Output<String> getPublisherDisplayName() {
        return this.publisherDisplayName;
    }
    /**
     * Plan ids limitation for this offer
     * 
     */
    @Export(name="specificPlanIdsLimitation", type=List.class, parameters={String.class})
    private Output</* @Nullable */ List<String>> specificPlanIdsLimitation;

    /**
     * @return Plan ids limitation for this offer
     * 
     */
    public Output</* @Nullable */ List<String>> getSpecificPlanIdsLimitation() {
        return this.specificPlanIdsLimitation;
    }
    /**
     * Metadata pertaining to creation and last modification of the resource
     * 
     */
    @Export(name="systemData", type=SystemDataResponse.class, parameters={})
    private Output<SystemDataResponse> systemData;

    /**
     * @return Metadata pertaining to creation and last modification of the resource
     * 
     */
    public Output<SystemDataResponse> getSystemData() {
        return this.systemData;
    }
    /**
     * The type of the resource.
     * 
     */
    @Export(name="type", type=String.class, parameters={})
    private Output<String> type;

    /**
     * @return The type of the resource.
     * 
     */
    public Output<String> getType() {
        return this.type;
    }
    /**
     * Offers unique id
     * 
     */
    @Export(name="uniqueOfferId", type=String.class, parameters={})
    private Output<String> uniqueOfferId;

    /**
     * @return Offers unique id
     * 
     */
    public Output<String> getUniqueOfferId() {
        return this.uniqueOfferId;
    }
    /**
     * Indicating whether the offer was not updated to db (true = not updated). If the allow list is identical to the existed one in db, the offer would not be updated.
     * 
     */
    @Export(name="updateSuppressedDueIdempotence", type=Boolean.class, parameters={})
    private Output</* @Nullable */ Boolean> updateSuppressedDueIdempotence;

    /**
     * @return Indicating whether the offer was not updated to db (true = not updated). If the allow list is identical to the existed one in db, the offer would not be updated.
     * 
     */
    public Output</* @Nullable */ Boolean> getUpdateSuppressedDueIdempotence() {
        return this.updateSuppressedDueIdempotence;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public PrivateStoreCollectionOffer(String name) {
        this(name, PrivateStoreCollectionOfferArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public PrivateStoreCollectionOffer(String name, PrivateStoreCollectionOfferArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public PrivateStoreCollectionOffer(String name, PrivateStoreCollectionOfferArgs args, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("azure-native:marketplace:PrivateStoreCollectionOffer", name, args == null ? PrivateStoreCollectionOfferArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private PrivateStoreCollectionOffer(String name, Output<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("azure-native:marketplace:PrivateStoreCollectionOffer", name, null, makeResourceOptions(options, id));
    }

    private static io.pulumi.resources.CustomResourceOptions makeResourceOptions(@Nullable io.pulumi.resources.CustomResourceOptions options, @Nullable Output<String> id) {
        var defaultOptions = io.pulumi.resources.CustomResourceOptions.builder()
            .version(Utilities.getVersion())
            .aliases(List.of(
                Output.of(Alias.builder().type("azure-native:marketplace/v20210601:PrivateStoreCollectionOffer").build())
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
    public static PrivateStoreCollectionOffer get(String name, Output<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        return new PrivateStoreCollectionOffer(name, id, options);
    }
}
