// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.alertsmanagement;

import io.pulumi.azurenative.Utilities;
import io.pulumi.azurenative.alertsmanagement.ActionRuleByNameArgs;
import io.pulumi.azurenative.alertsmanagement.outputs.ActionGroupResponse;
import io.pulumi.azurenative.alertsmanagement.outputs.DiagnosticsResponse;
import io.pulumi.azurenative.alertsmanagement.outputs.SuppressionResponse;
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
 * Action rule object containing target scope, conditions and suppression logic
 * API Version: 2019-05-05-preview.
 * 
 * ## Example Usage
 * 
 * ## Import
 * 
 * An existing resource can be imported using its type token, name, and identifier, e.g.
 * 
 * ```sh
 * $ pulumi import azure-native:alertsmanagement:ActionRuleByName DailySuppression /subscriptions/1e3ff1c0-771a-4119-a03b-be82a51e232d/resourceGroups/alertscorrelationrg/providers/Microsoft.AlertsManagement/actionRules/DailySuppression 
 * ```
 * 
 */
@ResourceType(type="azure-native:alertsmanagement:ActionRuleByName")
public class ActionRuleByName extends io.pulumi.resources.CustomResource {
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
     * action rule properties
     * 
     */
    @OutputExport(name="properties", type=Object.class, parameters={})
    private Output<Object> properties;

    /**
     * @return action rule properties
     * 
     */
    public Output<Object> getProperties() {
        return this.properties;
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
    public ActionRuleByName(String name) {
        this(name, ActionRuleByNameArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public ActionRuleByName(String name, ActionRuleByNameArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public ActionRuleByName(String name, ActionRuleByNameArgs args, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("azure-native:alertsmanagement:ActionRuleByName", name, args == null ? ActionRuleByNameArgs.Empty : args, makeResourceOptions(options, Input.empty()));
    }

    private ActionRuleByName(String name, Input<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("azure-native:alertsmanagement:ActionRuleByName", name, null, makeResourceOptions(options, id));
    }

    private static io.pulumi.resources.CustomResourceOptions makeResourceOptions(@Nullable io.pulumi.resources.CustomResourceOptions options, @Nullable Input<String> id) {
        var defaultOptions = io.pulumi.resources.CustomResourceOptions.builder()
            .setVersion(Utilities.getVersion())
            .setAliases(List.of(
                Input.of(Alias.builder().setType("azure-native:alertsmanagement/v20181102privatepreview:ActionRuleByName").build()),
                Input.of(Alias.builder().setType("azure-native:alertsmanagement/v20190505preview:ActionRuleByName").build()),
                Input.of(Alias.builder().setType("azure-native:alertsmanagement/v20210808:ActionRuleByName").build()),
                Input.of(Alias.builder().setType("azure-native:alertsmanagement/v20210808preview:ActionRuleByName").build())
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
    public static ActionRuleByName get(String name, Input<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        return new ActionRuleByName(name, id, options);
    }
}
