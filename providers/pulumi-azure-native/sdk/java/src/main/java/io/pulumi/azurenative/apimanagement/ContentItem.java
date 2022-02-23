// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.apimanagement;

import io.pulumi.azurenative.Utilities;
import io.pulumi.azurenative.apimanagement.ContentItemArgs;
import io.pulumi.core.Alias;
import io.pulumi.core.Input;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.OutputExport;
import io.pulumi.core.annotations.ResourceType;
import java.lang.Object;
import java.lang.String;
import java.util.List;
import javax.annotation.Nullable;

/**
 * Content type contract details.
 * API Version: 2020-12-01.
 * 
 * ## Example Usage
 * 
 * ## Import
 * 
 * An existing resource can be imported using its type token, name, and identifier, e.g.
 * 
 * ```sh
 * $ pulumi import azure-native:apimanagement:ContentItem 4e3cf6a5-574a-ba08-1f23-2e7a38faa6d8 /contentTypes/page/contentItems/4e3cf6a5-574a-ba08-1f23-2e7a38faa6d8 
 * ```
 * 
 */
@ResourceType(type="azure-native:apimanagement:ContentItem")
public class ContentItem extends io.pulumi.resources.CustomResource {
    /**
     * Resource name.
     * 
     */
    @OutputExport(name="name", type=String.class, parameters={})
    private Output<String> name;

    /**
     * @return Resource name.
     * 
     */
    public Output<String> getName() {
        return this.name;
    }
    /**
     * Properties of the content item.
     * 
     */
    @OutputExport(name="properties", type=Object.class, parameters={})
    private Output<Object> properties;

    /**
     * @return Properties of the content item.
     * 
     */
    public Output<Object> getProperties() {
        return this.properties;
    }
    /**
     * Resource type for API Management resource.
     * 
     */
    @OutputExport(name="type", type=String.class, parameters={})
    private Output<String> type;

    /**
     * @return Resource type for API Management resource.
     * 
     */
    public Output<String> getType() {
        return this.type;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public ContentItem(String name) {
        this(name, ContentItemArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public ContentItem(String name, ContentItemArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public ContentItem(String name, ContentItemArgs args, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("azure-native:apimanagement:ContentItem", name, args == null ? ContentItemArgs.Empty : args, makeResourceOptions(options, Input.empty()));
    }

    private ContentItem(String name, Input<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("azure-native:apimanagement:ContentItem", name, null, makeResourceOptions(options, id));
    }

    private static io.pulumi.resources.CustomResourceOptions makeResourceOptions(@Nullable io.pulumi.resources.CustomResourceOptions options, @Nullable Input<String> id) {
        var defaultOptions = io.pulumi.resources.CustomResourceOptions.builder()
            .setVersion(Utilities.getVersion())
            .setAliases(List.of(
                Input.of(Alias.builder().setType("azure-native:apimanagement/v20191201:ContentItem").build()),
                Input.of(Alias.builder().setType("azure-native:apimanagement/v20200601preview:ContentItem").build()),
                Input.of(Alias.builder().setType("azure-native:apimanagement/v20201201:ContentItem").build()),
                Input.of(Alias.builder().setType("azure-native:apimanagement/v20210101preview:ContentItem").build()),
                Input.of(Alias.builder().setType("azure-native:apimanagement/v20210401preview:ContentItem").build()),
                Input.of(Alias.builder().setType("azure-native:apimanagement/v20210801:ContentItem").build())
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
    public static ContentItem get(String name, Input<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        return new ContentItem(name, id, options);
    }
}
