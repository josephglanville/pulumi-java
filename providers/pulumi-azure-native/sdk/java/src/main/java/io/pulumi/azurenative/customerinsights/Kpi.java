// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.customerinsights;

import io.pulumi.azurenative.Utilities;
import io.pulumi.azurenative.customerinsights.KpiArgs;
import io.pulumi.azurenative.customerinsights.outputs.KpiAliasResponse;
import io.pulumi.azurenative.customerinsights.outputs.KpiExtractResponse;
import io.pulumi.azurenative.customerinsights.outputs.KpiGroupByMetadataResponse;
import io.pulumi.azurenative.customerinsights.outputs.KpiParticipantProfilesMetadataResponse;
import io.pulumi.azurenative.customerinsights.outputs.KpiThresholdsResponse;
import io.pulumi.core.Alias;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.OutputExport;
import io.pulumi.core.annotations.ResourceType;
import java.lang.String;
import java.util.List;
import java.util.Map;
import javax.annotation.Nullable;

/**
 * The KPI resource format.
 * API Version: 2017-04-26.
 * 
 * ## Example Usage
 * 
 * ## Import
 * 
 * An existing resource can be imported using its type token, name, and identifier, e.g.
 * 
 * ```sh
 * $ pulumi import azure-native:customerinsights:Kpi sdkTestHub/kpiTest45453647 /subscriptions/c909e979-ef71-4def-a970-bc7c154db8c5/resourceGroups/TestHubRG/providers/Microsoft.CustomerInsights/hubs/sdkTestHub/kpi/kpiTest45453647 
 * ```
 * 
 */
@ResourceType(type="azure-native:customerinsights:Kpi")
public class Kpi extends io.pulumi.resources.CustomResource {
    /**
     * The aliases.
     * 
     */
    @OutputExport(name="aliases", type=List.class, parameters={KpiAliasResponse.class})
    private Output</* @Nullable */ List<KpiAliasResponse>> aliases;

    /**
     * @return The aliases.
     * 
     */
    public Output</* @Nullable */ List<KpiAliasResponse>> getAliases() {
        return this.aliases;
    }
    /**
     * The calculation window.
     * 
     */
    @OutputExport(name="calculationWindow", type=String.class, parameters={})
    private Output<String> calculationWindow;

    /**
     * @return The calculation window.
     * 
     */
    public Output<String> getCalculationWindow() {
        return this.calculationWindow;
    }
    /**
     * Name of calculation window field.
     * 
     */
    @OutputExport(name="calculationWindowFieldName", type=String.class, parameters={})
    private Output</* @Nullable */ String> calculationWindowFieldName;

    /**
     * @return Name of calculation window field.
     * 
     */
    public Output</* @Nullable */ String> getCalculationWindowFieldName() {
        return this.calculationWindowFieldName;
    }
    /**
     * Localized description for the KPI.
     * 
     */
    @OutputExport(name="description", type=Map.class, parameters={String.class, String.class})
    private Output</* @Nullable */ Map<String,String>> description;

    /**
     * @return Localized description for the KPI.
     * 
     */
    public Output</* @Nullable */ Map<String,String>> getDescription() {
        return this.description;
    }
    /**
     * Localized display name for the KPI.
     * 
     */
    @OutputExport(name="displayName", type=Map.class, parameters={String.class, String.class})
    private Output</* @Nullable */ Map<String,String>> displayName;

    /**
     * @return Localized display name for the KPI.
     * 
     */
    public Output</* @Nullable */ Map<String,String>> getDisplayName() {
        return this.displayName;
    }
    /**
     * The mapping entity type.
     * 
     */
    @OutputExport(name="entityType", type=String.class, parameters={})
    private Output<String> entityType;

    /**
     * @return The mapping entity type.
     * 
     */
    public Output<String> getEntityType() {
        return this.entityType;
    }
    /**
     * The mapping entity name.
     * 
     */
    @OutputExport(name="entityTypeName", type=String.class, parameters={})
    private Output<String> entityTypeName;

    /**
     * @return The mapping entity name.
     * 
     */
    public Output<String> getEntityTypeName() {
        return this.entityTypeName;
    }
    /**
     * The computation expression for the KPI.
     * 
     */
    @OutputExport(name="expression", type=String.class, parameters={})
    private Output<String> expression;

    /**
     * @return The computation expression for the KPI.
     * 
     */
    public Output<String> getExpression() {
        return this.expression;
    }
    /**
     * The KPI extracts.
     * 
     */
    @OutputExport(name="extracts", type=List.class, parameters={KpiExtractResponse.class})
    private Output</* @Nullable */ List<KpiExtractResponse>> extracts;

    /**
     * @return The KPI extracts.
     * 
     */
    public Output</* @Nullable */ List<KpiExtractResponse>> getExtracts() {
        return this.extracts;
    }
    /**
     * The filter expression for the KPI.
     * 
     */
    @OutputExport(name="filter", type=String.class, parameters={})
    private Output</* @Nullable */ String> filter;

    /**
     * @return The filter expression for the KPI.
     * 
     */
    public Output</* @Nullable */ String> getFilter() {
        return this.filter;
    }
    /**
     * The computation function for the KPI.
     * 
     */
    @OutputExport(name="function", type=String.class, parameters={})
    private Output<String> function;

    /**
     * @return The computation function for the KPI.
     * 
     */
    public Output<String> getFunction() {
        return this.function;
    }
    /**
     * the group by properties for the KPI.
     * 
     */
    @OutputExport(name="groupBy", type=List.class, parameters={String.class})
    private Output</* @Nullable */ List<String>> groupBy;

    /**
     * @return the group by properties for the KPI.
     * 
     */
    public Output</* @Nullable */ List<String>> getGroupBy() {
        return this.groupBy;
    }
    /**
     * The KPI GroupByMetadata.
     * 
     */
    @OutputExport(name="groupByMetadata", type=List.class, parameters={KpiGroupByMetadataResponse.class})
    private Output<List<KpiGroupByMetadataResponse>> groupByMetadata;

    /**
     * @return The KPI GroupByMetadata.
     * 
     */
    public Output<List<KpiGroupByMetadataResponse>> getGroupByMetadata() {
        return this.groupByMetadata;
    }
    /**
     * The KPI name.
     * 
     */
    @OutputExport(name="kpiName", type=String.class, parameters={})
    private Output<String> kpiName;

    /**
     * @return The KPI name.
     * 
     */
    public Output<String> getKpiName() {
        return this.kpiName;
    }
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
     * The participant profiles.
     * 
     */
    @OutputExport(name="participantProfilesMetadata", type=List.class, parameters={KpiParticipantProfilesMetadataResponse.class})
    private Output<List<KpiParticipantProfilesMetadataResponse>> participantProfilesMetadata;

    /**
     * @return The participant profiles.
     * 
     */
    public Output<List<KpiParticipantProfilesMetadataResponse>> getParticipantProfilesMetadata() {
        return this.participantProfilesMetadata;
    }
    /**
     * Provisioning state.
     * 
     */
    @OutputExport(name="provisioningState", type=String.class, parameters={})
    private Output<String> provisioningState;

    /**
     * @return Provisioning state.
     * 
     */
    public Output<String> getProvisioningState() {
        return this.provisioningState;
    }
    /**
     * The hub name.
     * 
     */
    @OutputExport(name="tenantId", type=String.class, parameters={})
    private Output<String> tenantId;

    /**
     * @return The hub name.
     * 
     */
    public Output<String> getTenantId() {
        return this.tenantId;
    }
    /**
     * The KPI thresholds.
     * 
     */
    @OutputExport(name="thresHolds", type=KpiThresholdsResponse.class, parameters={})
    private Output</* @Nullable */ KpiThresholdsResponse> thresHolds;

    /**
     * @return The KPI thresholds.
     * 
     */
    public Output</* @Nullable */ KpiThresholdsResponse> getThresHolds() {
        return this.thresHolds;
    }
    /**
     * Resource type.
     * 
     */
    @OutputExport(name="type", type=String.class, parameters={})
    private Output<String> type;

    /**
     * @return Resource type.
     * 
     */
    public Output<String> getType() {
        return this.type;
    }
    /**
     * The unit of measurement for the KPI.
     * 
     */
    @OutputExport(name="unit", type=String.class, parameters={})
    private Output</* @Nullable */ String> unit;

    /**
     * @return The unit of measurement for the KPI.
     * 
     */
    public Output</* @Nullable */ String> getUnit() {
        return this.unit;
    }

    public interface BuilderApplicator {
        public void apply(KpiArgs.Builder a);
    }
    private static io.pulumi.azurenative.customerinsights.KpiArgs buildArgs(BuilderApplicator argsBuilder) {
        final var builder = io.pulumi.azurenative.customerinsights.KpiArgs.builder();
        argsBuilder.apply(builder);
        return builder.build();
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param argsBuilder A function that configures a passed builder.
     */
    public Kpi(String name, BuilderApplicator argsBuilder) {
        this(name, buildArgs(argsBuilder), null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public Kpi(String name) {
        this(name, KpiArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public Kpi(String name, KpiArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public Kpi(String name, KpiArgs args, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("azure-native:customerinsights:Kpi", name, args == null ? KpiArgs.Empty : args, makeResourceOptions(options, Output.empty()));
    }

    private Kpi(String name, Output<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("azure-native:customerinsights:Kpi", name, null, makeResourceOptions(options, id));
    }

    private static io.pulumi.resources.CustomResourceOptions makeResourceOptions(@Nullable io.pulumi.resources.CustomResourceOptions options, @Nullable Output<String> id) {
        var defaultOptions = io.pulumi.resources.CustomResourceOptions.builder()
            .setVersion(Utilities.getVersion())
            .setAliases(List.of(
                Output.of(Alias.builder().setType("azure-native:customerinsights/v20170101:Kpi").build()),
                Output.of(Alias.builder().setType("azure-native:customerinsights/v20170426:Kpi").build())
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
    public static Kpi get(String name, Output<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        return new Kpi(name, id, options);
    }
}
