// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.insights;

import io.pulumi.azurenative.Utilities;
import io.pulumi.azurenative.insights.ScheduledQueryRuleArgs;
import io.pulumi.azurenative.insights.outputs.AlertingActionResponse;
import io.pulumi.azurenative.insights.outputs.LogToMetricActionResponse;
import io.pulumi.azurenative.insights.outputs.ScheduleResponse;
import io.pulumi.azurenative.insights.outputs.SourceResponse;
import io.pulumi.core.Alias;
import io.pulumi.core.Either;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.OutputExport;
import io.pulumi.core.annotations.ResourceType;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Map;
import javax.annotation.Nullable;

/**
 * The Log Search Rule resource.
 * API Version: 2018-04-16.
 * 
 * ## Example Usage
 * 
 * ## Import
 * 
 * An existing resource can be imported using its type token, name, and identifier, e.g.
 * 
 * ```sh
 * $ pulumi import azure-native:insights:ScheduledQueryRule logtometricfoo /subscriptions/af52d502-a447-4bc6-8cb7-4780fbb00490/resourceGroups/alertsweu/providers/microsoft.insights/scheduledqueryrules/logtometricfoo 
 * ```
 * 
 */
@ResourceType(type="azure-native:insights:ScheduledQueryRule")
public class ScheduledQueryRule extends io.pulumi.resources.CustomResource {
    /**
     * Action needs to be taken on rule execution.
     * 
     */
    @OutputExport(name="action", type=Either.class, parameters={AlertingActionResponse.class, LogToMetricActionResponse.class})
    private Output<Either<AlertingActionResponse,LogToMetricActionResponse>> action;

    /**
     * @return Action needs to be taken on rule execution.
     * 
     */
    public Output<Either<AlertingActionResponse,LogToMetricActionResponse>> getAction() {
        return this.action;
    }
    /**
     * The flag that indicates whether the alert should be automatically resolved or not. The default is false.
     * 
     */
    @OutputExport(name="autoMitigate", type=Boolean.class, parameters={})
    private Output</* @Nullable */ Boolean> autoMitigate;

    /**
     * @return The flag that indicates whether the alert should be automatically resolved or not. The default is false.
     * 
     */
    public Output</* @Nullable */ Boolean> getAutoMitigate() {
        return this.autoMitigate;
    }
    /**
     * The api-version used when creating this alert rule
     * 
     */
    @OutputExport(name="createdWithApiVersion", type=String.class, parameters={})
    private Output<String> createdWithApiVersion;

    /**
     * @return The api-version used when creating this alert rule
     * 
     */
    public Output<String> getCreatedWithApiVersion() {
        return this.createdWithApiVersion;
    }
    /**
     * The description of the Log Search rule.
     * 
     */
    @OutputExport(name="description", type=String.class, parameters={})
    private Output</* @Nullable */ String> description;

    /**
     * @return The description of the Log Search rule.
     * 
     */
    public Output</* @Nullable */ String> getDescription() {
        return this.description;
    }
    /**
     * The display name of the alert rule
     * 
     */
    @OutputExport(name="displayName", type=String.class, parameters={})
    private Output</* @Nullable */ String> displayName;

    /**
     * @return The display name of the alert rule
     * 
     */
    public Output</* @Nullable */ String> getDisplayName() {
        return this.displayName;
    }
    /**
     * The flag which indicates whether the Log Search rule is enabled. Value should be true or false
     * 
     */
    @OutputExport(name="enabled", type=String.class, parameters={})
    private Output</* @Nullable */ String> enabled;

    /**
     * @return The flag which indicates whether the Log Search rule is enabled. Value should be true or false
     * 
     */
    public Output</* @Nullable */ String> getEnabled() {
        return this.enabled;
    }
    /**
     * The etag field is *not* required. If it is provided in the response body, it must also be provided as a header per the normal etag convention.  Entity tags are used for comparing two or more entities from the same requested resource. HTTP/1.1 uses entity tags in the etag (section 14.19), If-Match (section 14.24), If-None-Match (section 14.26), and If-Range (section 14.27) header fields.
     * 
     */
    @OutputExport(name="etag", type=String.class, parameters={})
    private Output<String> etag;

    /**
     * @return The etag field is *not* required. If it is provided in the response body, it must also be provided as a header per the normal etag convention.  Entity tags are used for comparing two or more entities from the same requested resource. HTTP/1.1 uses entity tags in the etag (section 14.19), If-Match (section 14.24), If-None-Match (section 14.26), and If-Range (section 14.27) header fields.
     * 
     */
    public Output<String> getEtag() {
        return this.etag;
    }
    /**
     * True if alert rule is legacy Log Analytic rule
     * 
     */
    @OutputExport(name="isLegacyLogAnalyticsRule", type=Boolean.class, parameters={})
    private Output<Boolean> isLegacyLogAnalyticsRule;

    /**
     * @return True if alert rule is legacy Log Analytic rule
     * 
     */
    public Output<Boolean> getIsLegacyLogAnalyticsRule() {
        return this.isLegacyLogAnalyticsRule;
    }
    /**
     * Metadata used by portal/tooling/etc to render different UX experiences for resources of the same type; e.g. ApiApps are a kind of Microsoft.Web/sites type.  If supported, the resource provider must validate and persist this value.
     * 
     */
    @OutputExport(name="kind", type=String.class, parameters={})
    private Output<String> kind;

    /**
     * @return Metadata used by portal/tooling/etc to render different UX experiences for resources of the same type; e.g. ApiApps are a kind of Microsoft.Web/sites type.  If supported, the resource provider must validate and persist this value.
     * 
     */
    public Output<String> getKind() {
        return this.kind;
    }
    /**
     * Last time the rule was updated in IS08601 format.
     * 
     */
    @OutputExport(name="lastUpdatedTime", type=String.class, parameters={})
    private Output<String> lastUpdatedTime;

    /**
     * @return Last time the rule was updated in IS08601 format.
     * 
     */
    public Output<String> getLastUpdatedTime() {
        return this.lastUpdatedTime;
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
     * Provisioning state of the scheduled query rule
     * 
     */
    @OutputExport(name="provisioningState", type=String.class, parameters={})
    private Output<String> provisioningState;

    /**
     * @return Provisioning state of the scheduled query rule
     * 
     */
    public Output<String> getProvisioningState() {
        return this.provisioningState;
    }
    /**
     * Schedule (Frequency, Time Window) for rule. Required for action type - AlertingAction
     * 
     */
    @OutputExport(name="schedule", type=ScheduleResponse.class, parameters={})
    private Output</* @Nullable */ ScheduleResponse> schedule;

    /**
     * @return Schedule (Frequency, Time Window) for rule. Required for action type - AlertingAction
     * 
     */
    public Output</* @Nullable */ ScheduleResponse> getSchedule() {
        return this.schedule;
    }
    /**
     * Data Source against which rule will Query Data
     * 
     */
    @OutputExport(name="source", type=SourceResponse.class, parameters={})
    private Output<SourceResponse> source;

    /**
     * @return Data Source against which rule will Query Data
     * 
     */
    public Output<SourceResponse> getSource() {
        return this.source;
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

    public interface BuilderApplicator {
        public void apply(ScheduledQueryRuleArgs.Builder a);
    }
    private static io.pulumi.azurenative.insights.ScheduledQueryRuleArgs buildArgs(BuilderApplicator argsBuilder) {
        final var builder = io.pulumi.azurenative.insights.ScheduledQueryRuleArgs.builder();
        argsBuilder.apply(builder);
        return builder.build();
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param argsBuilder A function that configures a passed builder.
     */
    public ScheduledQueryRule(String name, BuilderApplicator argsBuilder) {
        this(name, buildArgs(argsBuilder), null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public ScheduledQueryRule(String name) {
        this(name, ScheduledQueryRuleArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public ScheduledQueryRule(String name, ScheduledQueryRuleArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public ScheduledQueryRule(String name, ScheduledQueryRuleArgs args, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("azure-native:insights:ScheduledQueryRule", name, args == null ? ScheduledQueryRuleArgs.Empty : args, makeResourceOptions(options, Output.empty()));
    }

    private ScheduledQueryRule(String name, Output<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("azure-native:insights:ScheduledQueryRule", name, null, makeResourceOptions(options, id));
    }

    private static io.pulumi.resources.CustomResourceOptions makeResourceOptions(@Nullable io.pulumi.resources.CustomResourceOptions options, @Nullable Output<String> id) {
        var defaultOptions = io.pulumi.resources.CustomResourceOptions.builder()
            .setVersion(Utilities.getVersion())
            .setAliases(List.of(
                Output.of(Alias.builder().setType("azure-native:insights/v20180416:ScheduledQueryRule").build()),
                Output.of(Alias.builder().setType("azure-native:insights/v20200501preview:ScheduledQueryRule").build()),
                Output.of(Alias.builder().setType("azure-native:insights/v20210201preview:ScheduledQueryRule").build()),
                Output.of(Alias.builder().setType("azure-native:insights/v20210801:ScheduledQueryRule").build())
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
    public static ScheduledQueryRule get(String name, Output<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        return new ScheduledQueryRule(name, id, options);
    }
}
