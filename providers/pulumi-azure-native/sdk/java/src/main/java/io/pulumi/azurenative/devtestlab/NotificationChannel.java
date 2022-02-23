// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.devtestlab;

import io.pulumi.azurenative.Utilities;
import io.pulumi.azurenative.devtestlab.NotificationChannelArgs;
import io.pulumi.azurenative.devtestlab.outputs.EventResponse;
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
 * A notification.
 * API Version: 2018-09-15.
 * 
 * ## Example Usage
 * 
 * ## Import
 * 
 * An existing resource can be imported using its type token, name, and identifier, e.g.
 * 
 * ```sh
 * $ pulumi import azure-native:devtestlab:NotificationChannel {notificationChannelName} /subscriptions/{subscriptionId}/resourceGroups/resourceGroupName/providers/Microsoft.DevTestLab/labs/{labName}/notificationChannels/{notificationChannelName} 
 * ```
 * 
 */
@ResourceType(type="azure-native:devtestlab:NotificationChannel")
public class NotificationChannel extends io.pulumi.resources.CustomResource {
    /**
     * The creation date of the notification channel.
     * 
     */
    @OutputExport(name="createdDate", type=String.class, parameters={})
    private Output<String> createdDate;

    /**
     * @return The creation date of the notification channel.
     * 
     */
    public Output<String> getCreatedDate() {
        return this.createdDate;
    }
    /**
     * Description of notification.
     * 
     */
    @OutputExport(name="description", type=String.class, parameters={})
    private Output</* @Nullable */ String> description;

    /**
     * @return Description of notification.
     * 
     */
    public Output</* @Nullable */ String> getDescription() {
        return this.description;
    }
    /**
     * The email recipient to send notifications to (can be a list of semi-colon separated email addresses).
     * 
     */
    @OutputExport(name="emailRecipient", type=String.class, parameters={})
    private Output</* @Nullable */ String> emailRecipient;

    /**
     * @return The email recipient to send notifications to (can be a list of semi-colon separated email addresses).
     * 
     */
    public Output</* @Nullable */ String> getEmailRecipient() {
        return this.emailRecipient;
    }
    /**
     * The list of event for which this notification is enabled.
     * 
     */
    @OutputExport(name="events", type=List.class, parameters={EventResponse.class})
    private Output</* @Nullable */ List<EventResponse>> events;

    /**
     * @return The list of event for which this notification is enabled.
     * 
     */
    public Output</* @Nullable */ List<EventResponse>> getEvents() {
        return this.events;
    }
    /**
     * The location of the resource.
     * 
     */
    @OutputExport(name="location", type=String.class, parameters={})
    private Output</* @Nullable */ String> location;

    /**
     * @return The location of the resource.
     * 
     */
    public Output</* @Nullable */ String> getLocation() {
        return this.location;
    }
    /**
     * The name of the resource.
     * 
     */
    @OutputExport(name="name", type=String.class, parameters={})
    private Output<String> name;

    /**
     * @return The name of the resource.
     * 
     */
    public Output<String> getName() {
        return this.name;
    }
    /**
     * The locale to use when sending a notification (fallback for unsupported languages is EN).
     * 
     */
    @OutputExport(name="notificationLocale", type=String.class, parameters={})
    private Output</* @Nullable */ String> notificationLocale;

    /**
     * @return The locale to use when sending a notification (fallback for unsupported languages is EN).
     * 
     */
    public Output</* @Nullable */ String> getNotificationLocale() {
        return this.notificationLocale;
    }
    /**
     * The provisioning status of the resource.
     * 
     */
    @OutputExport(name="provisioningState", type=String.class, parameters={})
    private Output<String> provisioningState;

    /**
     * @return The provisioning status of the resource.
     * 
     */
    public Output<String> getProvisioningState() {
        return this.provisioningState;
    }
    /**
     * The tags of the resource.
     * 
     */
    @OutputExport(name="tags", type=Map.class, parameters={String.class, String.class})
    private Output</* @Nullable */ Map<String,String>> tags;

    /**
     * @return The tags of the resource.
     * 
     */
    public Output</* @Nullable */ Map<String,String>> getTags() {
        return this.tags;
    }
    /**
     * The type of the resource.
     * 
     */
    @OutputExport(name="type", type=String.class, parameters={})
    private Output<String> type;

    /**
     * @return The type of the resource.
     * 
     */
    public Output<String> getType() {
        return this.type;
    }
    /**
     * The unique immutable identifier of a resource (Guid).
     * 
     */
    @OutputExport(name="uniqueIdentifier", type=String.class, parameters={})
    private Output<String> uniqueIdentifier;

    /**
     * @return The unique immutable identifier of a resource (Guid).
     * 
     */
    public Output<String> getUniqueIdentifier() {
        return this.uniqueIdentifier;
    }
    /**
     * The webhook URL to send notifications to.
     * 
     */
    @OutputExport(name="webHookUrl", type=String.class, parameters={})
    private Output</* @Nullable */ String> webHookUrl;

    /**
     * @return The webhook URL to send notifications to.
     * 
     */
    public Output</* @Nullable */ String> getWebHookUrl() {
        return this.webHookUrl;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public NotificationChannel(String name) {
        this(name, NotificationChannelArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public NotificationChannel(String name, NotificationChannelArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public NotificationChannel(String name, NotificationChannelArgs args, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("azure-native:devtestlab:NotificationChannel", name, args == null ? NotificationChannelArgs.Empty : args, makeResourceOptions(options, Input.empty()));
    }

    private NotificationChannel(String name, Input<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("azure-native:devtestlab:NotificationChannel", name, null, makeResourceOptions(options, id));
    }

    private static io.pulumi.resources.CustomResourceOptions makeResourceOptions(@Nullable io.pulumi.resources.CustomResourceOptions options, @Nullable Input<String> id) {
        var defaultOptions = io.pulumi.resources.CustomResourceOptions.builder()
            .setVersion(Utilities.getVersion())
            .setAliases(List.of(
                Input.of(Alias.builder().setType("azure-native:devtestlab/v20160515:NotificationChannel").build()),
                Input.of(Alias.builder().setType("azure-native:devtestlab/v20180915:NotificationChannel").build())
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
    public static NotificationChannel get(String name, Input<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        return new NotificationChannel(name, id, options);
    }
}
