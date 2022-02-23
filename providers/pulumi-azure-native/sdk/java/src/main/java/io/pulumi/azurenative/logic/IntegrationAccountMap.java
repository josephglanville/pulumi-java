// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.logic;

import io.pulumi.azurenative.Utilities;
import io.pulumi.azurenative.logic.IntegrationAccountMapArgs;
import io.pulumi.azurenative.logic.outputs.ContentLinkResponse;
import io.pulumi.azurenative.logic.outputs.IntegrationAccountMapPropertiesResponseParametersSchema;
import io.pulumi.core.Alias;
import io.pulumi.core.Input;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.OutputExport;
import io.pulumi.core.annotations.ResourceType;
import java.lang.Object;
import java.lang.String;
import java.util.List;
import java.util.Map;
import javax.annotation.Nullable;

/**
 * The integration account map.
 * API Version: 2019-05-01.
 * 
 * ## Example Usage
 * 
 * ## Import
 * 
 * An existing resource can be imported using its type token, name, and identifier, e.g.
 * 
 * ```sh
 * $ pulumi import azure-native:logic:IntegrationAccountMap IntegrationAccountMap291 /subscriptions/34adfa4f-cedf-4dc0-ba29-b6d1a69ab345/resourceGroups/<resourceGroup>/providers/Microsoft.Logic/integrationAccounts/<IntegrationAccount>/maps/testMap 
 * ```
 * 
 */
@ResourceType(type="azure-native:logic:IntegrationAccountMap")
public class IntegrationAccountMap extends io.pulumi.resources.CustomResource {
    /**
     * The changed time.
     * 
     */
    @OutputExport(name="changedTime", type=String.class, parameters={})
    private Output<String> changedTime;

    /**
     * @return The changed time.
     * 
     */
    public Output<String> getChangedTime() {
        return this.changedTime;
    }
    /**
     * The content.
     * 
     */
    @OutputExport(name="content", type=String.class, parameters={})
    private Output</* @Nullable */ String> content;

    /**
     * @return The content.
     * 
     */
    public Output</* @Nullable */ String> getContent() {
        return this.content;
    }
    /**
     * The content link.
     * 
     */
    @OutputExport(name="contentLink", type=ContentLinkResponse.class, parameters={})
    private Output<ContentLinkResponse> contentLink;

    /**
     * @return The content link.
     * 
     */
    public Output<ContentLinkResponse> getContentLink() {
        return this.contentLink;
    }
    /**
     * The content type.
     * 
     */
    @OutputExport(name="contentType", type=String.class, parameters={})
    private Output</* @Nullable */ String> contentType;

    /**
     * @return The content type.
     * 
     */
    public Output</* @Nullable */ String> getContentType() {
        return this.contentType;
    }
    /**
     * The created time.
     * 
     */
    @OutputExport(name="createdTime", type=String.class, parameters={})
    private Output<String> createdTime;

    /**
     * @return The created time.
     * 
     */
    public Output<String> getCreatedTime() {
        return this.createdTime;
    }
    /**
     * The resource location.
     * 
     */
    @OutputExport(name="location", type=String.class, parameters={})
    private Output</* @Nullable */ String> location;

    /**
     * @return The resource location.
     * 
     */
    public Output</* @Nullable */ String> getLocation() {
        return this.location;
    }
    /**
     * The map type.
     * 
     */
    @OutputExport(name="mapType", type=String.class, parameters={})
    private Output<String> mapType;

    /**
     * @return The map type.
     * 
     */
    public Output<String> getMapType() {
        return this.mapType;
    }
    /**
     * The metadata.
     * 
     */
    @OutputExport(name="metadata", type=Object.class, parameters={})
    private Output</* @Nullable */ Object> metadata;

    /**
     * @return The metadata.
     * 
     */
    public Output</* @Nullable */ Object> getMetadata() {
        return this.metadata;
    }
    /**
     * Gets the resource name.
     * 
     */
    @OutputExport(name="name", type=String.class, parameters={})
    private Output<String> name;

    /**
     * @return Gets the resource name.
     * 
     */
    public Output<String> getName() {
        return this.name;
    }
    /**
     * The parameters schema of integration account map.
     * 
     */
    @OutputExport(name="parametersSchema", type=IntegrationAccountMapPropertiesResponseParametersSchema.class, parameters={})
    private Output</* @Nullable */ IntegrationAccountMapPropertiesResponseParametersSchema> parametersSchema;

    /**
     * @return The parameters schema of integration account map.
     * 
     */
    public Output</* @Nullable */ IntegrationAccountMapPropertiesResponseParametersSchema> getParametersSchema() {
        return this.parametersSchema;
    }
    /**
     * The resource tags.
     * 
     */
    @OutputExport(name="tags", type=Map.class, parameters={String.class, String.class})
    private Output</* @Nullable */ Map<String,String>> tags;

    /**
     * @return The resource tags.
     * 
     */
    public Output</* @Nullable */ Map<String,String>> getTags() {
        return this.tags;
    }
    /**
     * Gets the resource type.
     * 
     */
    @OutputExport(name="type", type=String.class, parameters={})
    private Output<String> type;

    /**
     * @return Gets the resource type.
     * 
     */
    public Output<String> getType() {
        return this.type;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public IntegrationAccountMap(String name) {
        this(name, IntegrationAccountMapArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public IntegrationAccountMap(String name, IntegrationAccountMapArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public IntegrationAccountMap(String name, IntegrationAccountMapArgs args, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("azure-native:logic:IntegrationAccountMap", name, args == null ? IntegrationAccountMapArgs.Empty : args, makeResourceOptions(options, Input.empty()));
    }

    private IntegrationAccountMap(String name, Input<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("azure-native:logic:IntegrationAccountMap", name, null, makeResourceOptions(options, id));
    }

    private static io.pulumi.resources.CustomResourceOptions makeResourceOptions(@Nullable io.pulumi.resources.CustomResourceOptions options, @Nullable Input<String> id) {
        var defaultOptions = io.pulumi.resources.CustomResourceOptions.builder()
            .setVersion(Utilities.getVersion())
            .setAliases(List.of(
                Input.of(Alias.builder().setType("azure-native:logic/v20150801preview:IntegrationAccountMap").build()),
                Input.of(Alias.builder().setType("azure-native:logic/v20160601:IntegrationAccountMap").build()),
                Input.of(Alias.builder().setType("azure-native:logic/v20180701preview:IntegrationAccountMap").build()),
                Input.of(Alias.builder().setType("azure-native:logic/v20190501:IntegrationAccountMap").build())
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
    public static IntegrationAccountMap get(String name, Input<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        return new IntegrationAccountMap(name, id, options);
    }
}
