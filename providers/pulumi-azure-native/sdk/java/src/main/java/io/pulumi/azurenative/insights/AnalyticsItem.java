// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.insights;

import io.pulumi.azurenative.Utilities;
import io.pulumi.azurenative.insights.AnalyticsItemArgs;
import io.pulumi.azurenative.insights.outputs.ApplicationInsightsComponentAnalyticsItemPropertiesResponse;
import io.pulumi.core.Alias;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.Export;
import io.pulumi.core.annotations.ResourceType;
import io.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.List;
import javax.annotation.Nullable;

/**
 * Properties that define an Analytics item that is associated to an Application Insights component.
 * API Version: 2015-05-01.
 * 
 * ## Example Usage
 * 
 * ## Import
 * 
 * An existing resource can be imported using its type token, name, and identifier, e.g.
 * 
 * ```sh
 * $ pulumi import azure-native:insights:AnalyticsItem myresource1 /subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/microsoft.insights/components/{resourceName}/{scopePath}/item 
 * ```
 * 
 */
@ResourceType(type="azure-native:insights:AnalyticsItem")
public class AnalyticsItem extends io.pulumi.resources.CustomResource {
    /**
     * The content of this item
     * 
     */
    @Export(name="content", type=String.class, parameters={})
    private Output</* @Nullable */ String> content;

    /**
     * @return The content of this item
     * 
     */
    public Output</* @Nullable */ String> getContent() {
        return this.content;
    }
    /**
     * The user-defined name of the item.
     * 
     */
    @Export(name="name", type=String.class, parameters={})
    private Output</* @Nullable */ String> name;

    /**
     * @return The user-defined name of the item.
     * 
     */
    public Output</* @Nullable */ String> getName() {
        return this.name;
    }
    /**
     * A set of properties that can be defined in the context of a specific item type. Each type may have its own properties.
     * 
     */
    @Export(name="properties", type=ApplicationInsightsComponentAnalyticsItemPropertiesResponse.class, parameters={})
    private Output<ApplicationInsightsComponentAnalyticsItemPropertiesResponse> properties;

    /**
     * @return A set of properties that can be defined in the context of a specific item type. Each type may have its own properties.
     * 
     */
    public Output<ApplicationInsightsComponentAnalyticsItemPropertiesResponse> getProperties() {
        return this.properties;
    }
    /**
     * Enum indicating if this item definition is owned by a specific user or is shared between all users with access to the Application Insights component.
     * 
     */
    @Export(name="scope", type=String.class, parameters={})
    private Output</* @Nullable */ String> scope;

    /**
     * @return Enum indicating if this item definition is owned by a specific user or is shared between all users with access to the Application Insights component.
     * 
     */
    public Output</* @Nullable */ String> getScope() {
        return this.scope;
    }
    /**
     * Date and time in UTC when this item was created.
     * 
     */
    @Export(name="timeCreated", type=String.class, parameters={})
    private Output<String> timeCreated;

    /**
     * @return Date and time in UTC when this item was created.
     * 
     */
    public Output<String> getTimeCreated() {
        return this.timeCreated;
    }
    /**
     * Date and time in UTC of the last modification that was made to this item.
     * 
     */
    @Export(name="timeModified", type=String.class, parameters={})
    private Output<String> timeModified;

    /**
     * @return Date and time in UTC of the last modification that was made to this item.
     * 
     */
    public Output<String> getTimeModified() {
        return this.timeModified;
    }
    /**
     * Enum indicating the type of the Analytics item.
     * 
     */
    @Export(name="type", type=String.class, parameters={})
    private Output</* @Nullable */ String> type;

    /**
     * @return Enum indicating the type of the Analytics item.
     * 
     */
    public Output</* @Nullable */ String> getType() {
        return this.type;
    }
    /**
     * This instance's version of the data model. This can change as new features are added.
     * 
     */
    @Export(name="version", type=String.class, parameters={})
    private Output<String> version;

    /**
     * @return This instance's version of the data model. This can change as new features are added.
     * 
     */
    public Output<String> getVersion() {
        return this.version;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public AnalyticsItem(String name) {
        this(name, AnalyticsItemArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public AnalyticsItem(String name, AnalyticsItemArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public AnalyticsItem(String name, AnalyticsItemArgs args, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("azure-native:insights:AnalyticsItem", name, args == null ? AnalyticsItemArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private AnalyticsItem(String name, Output<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("azure-native:insights:AnalyticsItem", name, null, makeResourceOptions(options, id));
    }

    private static io.pulumi.resources.CustomResourceOptions makeResourceOptions(@Nullable io.pulumi.resources.CustomResourceOptions options, @Nullable Output<String> id) {
        var defaultOptions = io.pulumi.resources.CustomResourceOptions.builder()
            .version(Utilities.getVersion())
            .aliases(List.of(
                Output.of(Alias.builder().type("azure-native:insights/v20150501:AnalyticsItem").build())
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
    public static AnalyticsItem get(String name, Output<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        return new AnalyticsItem(name, id, options);
    }
}
