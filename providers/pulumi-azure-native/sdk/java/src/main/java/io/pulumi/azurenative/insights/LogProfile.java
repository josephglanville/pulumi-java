// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.insights;

import io.pulumi.azurenative.Utilities;
import io.pulumi.azurenative.insights.LogProfileArgs;
import io.pulumi.azurenative.insights.outputs.RetentionPolicyResponse;
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
 * The log profile resource.
 * API Version: 2016-03-01.
 * 
 * ## Example Usage
 * 
 * ## Import
 * 
 * An existing resource can be imported using its type token, name, and identifier, e.g.
 * 
 * ```sh
 * $ pulumi import azure-native:insights:LogProfile default /subscriptions/df602c9c-7aa0-407d-a6fb-eb20c8bd1192/providers/microsoft.insights/logprofiles/default 
 * ```
 * 
 */
@ResourceType(type="azure-native:insights:LogProfile")
public class LogProfile extends io.pulumi.resources.CustomResource {
    /**
     * the categories of the logs. These categories are created as is convenient to the user. Some values are: 'Write', 'Delete', and/or 'Action.'
     * 
     */
    @OutputExport(name="categories", type=List.class, parameters={String.class})
    private Output<List<String>> categories;

    /**
     * @return the categories of the logs. These categories are created as is convenient to the user. Some values are: 'Write', 'Delete', and/or 'Action.'
     * 
     */
    public Output<List<String>> getCategories() {
        return this.categories;
    }
    /**
     * Resource location
     * 
     */
    @OutputExport(name="location", type=String.class, parameters={})
    private Output<String> location;

    /**
     * @return Resource location
     * 
     */
    public Output<String> getLocation() {
        return this.location;
    }
    /**
     * List of regions for which Activity Log events should be stored or streamed. It is a comma separated list of valid ARM locations including the 'global' location.
     * 
     */
    @OutputExport(name="locations", type=List.class, parameters={String.class})
    private Output<List<String>> locations;

    /**
     * @return List of regions for which Activity Log events should be stored or streamed. It is a comma separated list of valid ARM locations including the 'global' location.
     * 
     */
    public Output<List<String>> getLocations() {
        return this.locations;
    }
    /**
     * Azure resource name
     * 
     */
    @OutputExport(name="name", type=String.class, parameters={})
    private Output<String> name;

    /**
     * @return Azure resource name
     * 
     */
    public Output<String> getName() {
        return this.name;
    }
    /**
     * the retention policy for the events in the log.
     * 
     */
    @OutputExport(name="retentionPolicy", type=RetentionPolicyResponse.class, parameters={})
    private Output<RetentionPolicyResponse> retentionPolicy;

    /**
     * @return the retention policy for the events in the log.
     * 
     */
    public Output<RetentionPolicyResponse> getRetentionPolicy() {
        return this.retentionPolicy;
    }
    /**
     * The service bus rule ID of the service bus namespace in which you would like to have Event Hubs created for streaming the Activity Log. The rule ID is of the format: '{service bus resource ID}/authorizationrules/{key name}'.
     * 
     */
    @OutputExport(name="serviceBusRuleId", type=String.class, parameters={})
    private Output</* @Nullable */ String> serviceBusRuleId;

    /**
     * @return The service bus rule ID of the service bus namespace in which you would like to have Event Hubs created for streaming the Activity Log. The rule ID is of the format: '{service bus resource ID}/authorizationrules/{key name}'.
     * 
     */
    public Output</* @Nullable */ String> getServiceBusRuleId() {
        return this.serviceBusRuleId;
    }
    /**
     * the resource id of the storage account to which you would like to send the Activity Log.
     * 
     */
    @OutputExport(name="storageAccountId", type=String.class, parameters={})
    private Output</* @Nullable */ String> storageAccountId;

    /**
     * @return the resource id of the storage account to which you would like to send the Activity Log.
     * 
     */
    public Output</* @Nullable */ String> getStorageAccountId() {
        return this.storageAccountId;
    }
    /**
     * Resource tags
     * 
     */
    @OutputExport(name="tags", type=Map.class, parameters={String.class, String.class})
    private Output</* @Nullable */ Map<String,String>> tags;

    /**
     * @return Resource tags
     * 
     */
    public Output</* @Nullable */ Map<String,String>> getTags() {
        return this.tags;
    }
    /**
     * Azure resource type
     * 
     */
    @OutputExport(name="type", type=String.class, parameters={})
    private Output<String> type;

    /**
     * @return Azure resource type
     * 
     */
    public Output<String> getType() {
        return this.type;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public LogProfile(String name) {
        this(name, LogProfileArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public LogProfile(String name, LogProfileArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public LogProfile(String name, LogProfileArgs args, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("azure-native:insights:LogProfile", name, args == null ? LogProfileArgs.Empty : args, makeResourceOptions(options, Input.empty()));
    }

    private LogProfile(String name, Input<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("azure-native:insights:LogProfile", name, null, makeResourceOptions(options, id));
    }

    private static io.pulumi.resources.CustomResourceOptions makeResourceOptions(@Nullable io.pulumi.resources.CustomResourceOptions options, @Nullable Input<String> id) {
        var defaultOptions = io.pulumi.resources.CustomResourceOptions.builder()
            .setVersion(Utilities.getVersion())
            .setAliases(List.of(
                Input.of(Alias.builder().setType("azure-native:insights/v20160301:LogProfile").build())
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
    public static LogProfile get(String name, Input<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        return new LogProfile(name, id, options);
    }
}
