// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.insights;

import io.pulumi.azurenative.Utilities;
import io.pulumi.azurenative.insights.DiagnosticSettingArgs;
import io.pulumi.azurenative.insights.outputs.LogSettingsResponse;
import io.pulumi.azurenative.insights.outputs.MetricSettingsResponse;
import io.pulumi.core.Alias;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.Export;
import io.pulumi.core.annotations.ResourceType;
import java.lang.String;
import java.util.List;
import javax.annotation.Nullable;

/**
 * The diagnostic setting resource.
 * API Version: 2017-05-01-preview.
 * 
 * ## Example Usage
 * 
 * ## Import
 * 
 * An existing resource can be imported using its type token, name, and identifier, e.g.
 * 
 * ```sh
 * $ pulumi import azure-native:insights:DiagnosticSetting mysetting /subscriptions/1a66ce04-b633-4a0b-b2bc-a912ec8986a6/resourcegroups/viruela1/providers/microsoft.logic/workflows/viruela6/diagnosticSettings/mysetting 
 * ```
 * 
 */
@ResourceType(type="azure-native:insights:DiagnosticSetting")
public class DiagnosticSetting extends io.pulumi.resources.CustomResource {
    /**
     * The resource Id for the event hub authorization rule.
     * 
     */
    @Export(name="eventHubAuthorizationRuleId", type=String.class, parameters={})
    private Output</* @Nullable */ String> eventHubAuthorizationRuleId;

    /**
     * @return The resource Id for the event hub authorization rule.
     * 
     */
    public Output</* @Nullable */ String> getEventHubAuthorizationRuleId() {
        return this.eventHubAuthorizationRuleId;
    }
    /**
     * The name of the event hub. If none is specified, the default event hub will be selected.
     * 
     */
    @Export(name="eventHubName", type=String.class, parameters={})
    private Output</* @Nullable */ String> eventHubName;

    /**
     * @return The name of the event hub. If none is specified, the default event hub will be selected.
     * 
     */
    public Output</* @Nullable */ String> getEventHubName() {
        return this.eventHubName;
    }
    /**
     * A string indicating whether the export to Log Analytics should use the default destination type, i.e. AzureDiagnostics, or use a destination type constructed as follows: <normalized service identity>_<normalized category name>. Possible values are: Dedicated and null (null is default.)
     * 
     */
    @Export(name="logAnalyticsDestinationType", type=String.class, parameters={})
    private Output</* @Nullable */ String> logAnalyticsDestinationType;

    /**
     * @return A string indicating whether the export to Log Analytics should use the default destination type, i.e. AzureDiagnostics, or use a destination type constructed as follows: <normalized service identity>_<normalized category name>. Possible values are: Dedicated and null (null is default.)
     * 
     */
    public Output</* @Nullable */ String> getLogAnalyticsDestinationType() {
        return this.logAnalyticsDestinationType;
    }
    /**
     * The list of logs settings.
     * 
     */
    @Export(name="logs", type=List.class, parameters={LogSettingsResponse.class})
    private Output</* @Nullable */ List<LogSettingsResponse>> logs;

    /**
     * @return The list of logs settings.
     * 
     */
    public Output</* @Nullable */ List<LogSettingsResponse>> getLogs() {
        return this.logs;
    }
    /**
     * The list of metric settings.
     * 
     */
    @Export(name="metrics", type=List.class, parameters={MetricSettingsResponse.class})
    private Output</* @Nullable */ List<MetricSettingsResponse>> metrics;

    /**
     * @return The list of metric settings.
     * 
     */
    public Output</* @Nullable */ List<MetricSettingsResponse>> getMetrics() {
        return this.metrics;
    }
    /**
     * Azure resource name
     * 
     */
    @Export(name="name", type=String.class, parameters={})
    private Output<String> name;

    /**
     * @return Azure resource name
     * 
     */
    public Output<String> getName() {
        return this.name;
    }
    /**
     * The service bus rule Id of the diagnostic setting. This is here to maintain backwards compatibility.
     * 
     */
    @Export(name="serviceBusRuleId", type=String.class, parameters={})
    private Output</* @Nullable */ String> serviceBusRuleId;

    /**
     * @return The service bus rule Id of the diagnostic setting. This is here to maintain backwards compatibility.
     * 
     */
    public Output</* @Nullable */ String> getServiceBusRuleId() {
        return this.serviceBusRuleId;
    }
    /**
     * The resource ID of the storage account to which you would like to send Diagnostic Logs.
     * 
     */
    @Export(name="storageAccountId", type=String.class, parameters={})
    private Output</* @Nullable */ String> storageAccountId;

    /**
     * @return The resource ID of the storage account to which you would like to send Diagnostic Logs.
     * 
     */
    public Output</* @Nullable */ String> getStorageAccountId() {
        return this.storageAccountId;
    }
    /**
     * Azure resource type
     * 
     */
    @Export(name="type", type=String.class, parameters={})
    private Output<String> type;

    /**
     * @return Azure resource type
     * 
     */
    public Output<String> getType() {
        return this.type;
    }
    /**
     * The full ARM resource ID of the Log Analytics workspace to which you would like to send Diagnostic Logs. Example: /subscriptions/4b9e8510-67ab-4e9a-95a9-e2f1e570ea9c/resourceGroups/insights-integration/providers/Microsoft.OperationalInsights/workspaces/viruela2
     * 
     */
    @Export(name="workspaceId", type=String.class, parameters={})
    private Output</* @Nullable */ String> workspaceId;

    /**
     * @return The full ARM resource ID of the Log Analytics workspace to which you would like to send Diagnostic Logs. Example: /subscriptions/4b9e8510-67ab-4e9a-95a9-e2f1e570ea9c/resourceGroups/insights-integration/providers/Microsoft.OperationalInsights/workspaces/viruela2
     * 
     */
    public Output</* @Nullable */ String> getWorkspaceId() {
        return this.workspaceId;
    }

    public interface BuilderApplicator {
        public void apply(DiagnosticSettingArgs.Builder a);
    }
    private static io.pulumi.azurenative.insights.DiagnosticSettingArgs buildArgs(BuilderApplicator argsBuilder) {
        final var builder = io.pulumi.azurenative.insights.DiagnosticSettingArgs.builder();
        argsBuilder.apply(builder);
        return builder.build();
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param argsBuilder A function that configures a passed builder.
     */
    public DiagnosticSetting(String name, BuilderApplicator argsBuilder) {
        this(name, buildArgs(argsBuilder), null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public DiagnosticSetting(String name) {
        this(name, DiagnosticSettingArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public DiagnosticSetting(String name, DiagnosticSettingArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public DiagnosticSetting(String name, DiagnosticSettingArgs args, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("azure-native:insights:DiagnosticSetting", name, args == null ? DiagnosticSettingArgs.Empty : args, makeResourceOptions(options, Output.empty()));
    }

    private DiagnosticSetting(String name, Output<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("azure-native:insights:DiagnosticSetting", name, null, makeResourceOptions(options, id));
    }

    private static io.pulumi.resources.CustomResourceOptions makeResourceOptions(@Nullable io.pulumi.resources.CustomResourceOptions options, @Nullable Output<String> id) {
        var defaultOptions = io.pulumi.resources.CustomResourceOptions.builder()
            .version(Utilities.getVersion())
            .aliases(List.of(
                Output.of(Alias.builder().type("azure-native:insights/v20170501preview:DiagnosticSetting").build()),
                Output.of(Alias.builder().type("azure-native:insights/v20210501preview:DiagnosticSetting").build())
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
    public static DiagnosticSetting get(String name, Output<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        return new DiagnosticSetting(name, id, options);
    }
}
