// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.customerinsights;

import io.pulumi.azurenative.Utilities;
import io.pulumi.azurenative.customerinsights.ProfileArgs;
import io.pulumi.azurenative.customerinsights.outputs.PropertyDefinitionResponse;
import io.pulumi.azurenative.customerinsights.outputs.StrongIdResponse;
import io.pulumi.core.Alias;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.Export;
import io.pulumi.core.annotations.ResourceType;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Map;
import javax.annotation.Nullable;

/**
 * The profile resource format.
 * API Version: 2017-04-26.
 * 
 * ## Example Usage
 * 
 * ## Import
 * 
 * An existing resource can be imported using its type token, name, and identifier, e.g.
 * 
 * ```sh
 * $ pulumi import azure-native:customerinsights:Profile azSdkTestHub/TestProfileType396 /subscriptions/c909e979-ef71-4def-a970-bc7c154db8c5/resourceGroups/TestHubRG/providers/Microsoft.CustomerInsights/hubs/azSdkTestHub/profiles/TestProfileType396 
 * ```
 * 
 */
@ResourceType(type="azure-native:customerinsights:Profile")
public class Profile extends io.pulumi.resources.CustomResource {
    /**
     * The api entity set name. This becomes the odata entity set name for the entity Type being referred in this object.
     * 
     */
    @Export(name="apiEntitySetName", type=String.class, parameters={})
    private Output</* @Nullable */ String> apiEntitySetName;

    /**
     * @return The api entity set name. This becomes the odata entity set name for the entity Type being referred in this object.
     * 
     */
    public Output</* @Nullable */ String> getApiEntitySetName() {
        return this.apiEntitySetName;
    }
    /**
     * The attributes for the Type.
     * 
     */
    @Export(name="attributes", type=Map.class, parameters={String.class, List.class})
    private Output</* @Nullable */ Map<String,List<String>>> attributes;

    /**
     * @return The attributes for the Type.
     * 
     */
    public Output</* @Nullable */ Map<String,List<String>>> getAttributes() {
        return this.attributes;
    }
    /**
     * Localized descriptions for the property.
     * 
     */
    @Export(name="description", type=Map.class, parameters={String.class, String.class})
    private Output</* @Nullable */ Map<String,String>> description;

    /**
     * @return Localized descriptions for the property.
     * 
     */
    public Output</* @Nullable */ Map<String,String>> getDescription() {
        return this.description;
    }
    /**
     * Localized display names for the property.
     * 
     */
    @Export(name="displayName", type=Map.class, parameters={String.class, String.class})
    private Output</* @Nullable */ Map<String,String>> displayName;

    /**
     * @return Localized display names for the property.
     * 
     */
    public Output</* @Nullable */ Map<String,String>> getDisplayName() {
        return this.displayName;
    }
    /**
     * Type of entity.
     * 
     */
    @Export(name="entityType", type=String.class, parameters={})
    private Output</* @Nullable */ String> entityType;

    /**
     * @return Type of entity.
     * 
     */
    public Output</* @Nullable */ String> getEntityType() {
        return this.entityType;
    }
    /**
     * The properties of the Profile.
     * 
     */
    @Export(name="fields", type=List.class, parameters={PropertyDefinitionResponse.class})
    private Output</* @Nullable */ List<PropertyDefinitionResponse>> fields;

    /**
     * @return The properties of the Profile.
     * 
     */
    public Output</* @Nullable */ List<PropertyDefinitionResponse>> getFields() {
        return this.fields;
    }
    /**
     * The instance count.
     * 
     */
    @Export(name="instancesCount", type=Integer.class, parameters={})
    private Output</* @Nullable */ Integer> instancesCount;

    /**
     * @return The instance count.
     * 
     */
    public Output</* @Nullable */ Integer> getInstancesCount() {
        return this.instancesCount;
    }
    /**
     * Large Image associated with the Property or EntityType.
     * 
     */
    @Export(name="largeImage", type=String.class, parameters={})
    private Output</* @Nullable */ String> largeImage;

    /**
     * @return Large Image associated with the Property or EntityType.
     * 
     */
    public Output</* @Nullable */ String> getLargeImage() {
        return this.largeImage;
    }
    /**
     * The last changed time for the type definition.
     * 
     */
    @Export(name="lastChangedUtc", type=String.class, parameters={})
    private Output<String> lastChangedUtc;

    /**
     * @return The last changed time for the type definition.
     * 
     */
    public Output<String> getLastChangedUtc() {
        return this.lastChangedUtc;
    }
    /**
     * Any custom localized attributes for the Type.
     * 
     */
    @Export(name="localizedAttributes", type=Map.class, parameters={String.class, Map.class})
    private Output</* @Nullable */ Map<String,Map<String,String>>> localizedAttributes;

    /**
     * @return Any custom localized attributes for the Type.
     * 
     */
    public Output</* @Nullable */ Map<String,Map<String,String>>> getLocalizedAttributes() {
        return this.localizedAttributes;
    }
    /**
     * Medium Image associated with the Property or EntityType.
     * 
     */
    @Export(name="mediumImage", type=String.class, parameters={})
    private Output</* @Nullable */ String> mediumImage;

    /**
     * @return Medium Image associated with the Property or EntityType.
     * 
     */
    public Output</* @Nullable */ String> getMediumImage() {
        return this.mediumImage;
    }
    /**
     * Resource name.
     * 
     */
    @Export(name="name", type=String.class, parameters={})
    private Output<String> name;

    /**
     * @return Resource name.
     * 
     */
    public Output<String> getName() {
        return this.name;
    }
    /**
     * Provisioning state.
     * 
     */
    @Export(name="provisioningState", type=String.class, parameters={})
    private Output<String> provisioningState;

    /**
     * @return Provisioning state.
     * 
     */
    public Output<String> getProvisioningState() {
        return this.provisioningState;
    }
    /**
     * The schema org link. This helps ACI identify and suggest semantic models.
     * 
     */
    @Export(name="schemaItemTypeLink", type=String.class, parameters={})
    private Output</* @Nullable */ String> schemaItemTypeLink;

    /**
     * @return The schema org link. This helps ACI identify and suggest semantic models.
     * 
     */
    public Output</* @Nullable */ String> getSchemaItemTypeLink() {
        return this.schemaItemTypeLink;
    }
    /**
     * Small Image associated with the Property or EntityType.
     * 
     */
    @Export(name="smallImage", type=String.class, parameters={})
    private Output</* @Nullable */ String> smallImage;

    /**
     * @return Small Image associated with the Property or EntityType.
     * 
     */
    public Output</* @Nullable */ String> getSmallImage() {
        return this.smallImage;
    }
    /**
     * The strong IDs.
     * 
     */
    @Export(name="strongIds", type=List.class, parameters={StrongIdResponse.class})
    private Output</* @Nullable */ List<StrongIdResponse>> strongIds;

    /**
     * @return The strong IDs.
     * 
     */
    public Output</* @Nullable */ List<StrongIdResponse>> getStrongIds() {
        return this.strongIds;
    }
    /**
     * The hub name.
     * 
     */
    @Export(name="tenantId", type=String.class, parameters={})
    private Output<String> tenantId;

    /**
     * @return The hub name.
     * 
     */
    public Output<String> getTenantId() {
        return this.tenantId;
    }
    /**
     * The timestamp property name. Represents the time when the interaction or profile update happened.
     * 
     */
    @Export(name="timestampFieldName", type=String.class, parameters={})
    private Output</* @Nullable */ String> timestampFieldName;

    /**
     * @return The timestamp property name. Represents the time when the interaction or profile update happened.
     * 
     */
    public Output</* @Nullable */ String> getTimestampFieldName() {
        return this.timestampFieldName;
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
     * The name of the entity.
     * 
     */
    @Export(name="typeName", type=String.class, parameters={})
    private Output</* @Nullable */ String> typeName;

    /**
     * @return The name of the entity.
     * 
     */
    public Output</* @Nullable */ String> getTypeName() {
        return this.typeName;
    }

    public interface BuilderApplicator {
        public void apply(ProfileArgs.Builder a);
    }
    private static io.pulumi.azurenative.customerinsights.ProfileArgs buildArgs(BuilderApplicator argsBuilder) {
        final var builder = io.pulumi.azurenative.customerinsights.ProfileArgs.builder();
        argsBuilder.apply(builder);
        return builder.build();
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param argsBuilder A function that configures a passed builder.
     */
    public Profile(String name, BuilderApplicator argsBuilder) {
        this(name, buildArgs(argsBuilder), null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public Profile(String name) {
        this(name, ProfileArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public Profile(String name, ProfileArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public Profile(String name, ProfileArgs args, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("azure-native:customerinsights:Profile", name, args == null ? ProfileArgs.Empty : args, makeResourceOptions(options, Output.empty()));
    }

    private Profile(String name, Output<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("azure-native:customerinsights:Profile", name, null, makeResourceOptions(options, id));
    }

    private static io.pulumi.resources.CustomResourceOptions makeResourceOptions(@Nullable io.pulumi.resources.CustomResourceOptions options, @Nullable Output<String> id) {
        var defaultOptions = io.pulumi.resources.CustomResourceOptions.builder()
            .version(Utilities.getVersion())
            .aliases(List.of(
                Output.of(Alias.builder().type("azure-native:customerinsights/v20170101:Profile").build()),
                Output.of(Alias.builder().type("azure-native:customerinsights/v20170426:Profile").build())
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
    public static Profile get(String name, Output<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        return new Profile(name, id, options);
    }
}
