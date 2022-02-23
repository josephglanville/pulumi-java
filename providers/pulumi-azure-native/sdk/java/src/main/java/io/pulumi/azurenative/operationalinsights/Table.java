// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.operationalinsights;

import io.pulumi.azurenative.Utilities;
import io.pulumi.azurenative.operationalinsights.TableArgs;
import io.pulumi.azurenative.operationalinsights.outputs.RestoredLogsResponse;
import io.pulumi.azurenative.operationalinsights.outputs.ResultStatisticsResponse;
import io.pulumi.azurenative.operationalinsights.outputs.SchemaResponse;
import io.pulumi.azurenative.operationalinsights.outputs.SearchResultsResponse;
import io.pulumi.azurenative.operationalinsights.outputs.SystemDataResponse;
import io.pulumi.core.Alias;
import io.pulumi.core.Input;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.OutputExport;
import io.pulumi.core.annotations.ResourceType;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import javax.annotation.Nullable;

/**
 * Workspace data table definition.
 * API Version: 2021-12-01-preview.
 * 
 * ## Example Usage
 * 
 * ## Import
 * 
 * An existing resource can be imported using its type token, name, and identifier, e.g.
 * 
 * ```sh
 * $ pulumi import azure-native:operationalinsights:Table AzureNetworkFlow /subscriptions/00000000-0000-0000-0000-00000000000/resourcegroups/oiautorest6685/providers/Microsoft.OperationalInsights/workspaces/oiautorest6685/tables/AzureNetworkFlow 
 * ```
 * 
 */
@ResourceType(type="azure-native:operationalinsights:Table")
public class Table extends io.pulumi.resources.CustomResource {
    /**
     * The table data archive retention in days. Calculated as (totalRetentionInDays-retentionInDays)
     * 
     */
    @OutputExport(name="archiveRetentionInDays", type=Integer.class, parameters={})
    private Output<Integer> archiveRetentionInDays;

    /**
     * @return The table data archive retention in days. Calculated as (totalRetentionInDays-retentionInDays)
     * 
     */
    public Output<Integer> getArchiveRetentionInDays() {
        return this.archiveRetentionInDays;
    }
    /**
     * The timestamp that table plan was last modified (UTC).
     * 
     */
    @OutputExport(name="lastPlanModifiedDate", type=String.class, parameters={})
    private Output<String> lastPlanModifiedDate;

    /**
     * @return The timestamp that table plan was last modified (UTC).
     * 
     */
    public Output<String> getLastPlanModifiedDate() {
        return this.lastPlanModifiedDate;
    }
    /**
     * The name of the resource
     * 
     */
    @OutputExport(name="name", type=String.class, parameters={})
    private Output<String> name;

    /**
     * @return The name of the resource
     * 
     */
    public Output<String> getName() {
        return this.name;
    }
    /**
     * The table plan.
     * 
     */
    @OutputExport(name="plan", type=String.class, parameters={})
    private Output</* @Nullable */ String> plan;

    /**
     * @return The table plan.
     * 
     */
    public Output</* @Nullable */ String> getPlan() {
        return this.plan;
    }
    /**
     * Table's current provisioning state. If set to 'updating', indicates a resource lock due to ongoing operation, forbidding any update to the table until the ongoing operation is concluded.
     * 
     */
    @OutputExport(name="provisioningState", type=String.class, parameters={})
    private Output<String> provisioningState;

    /**
     * @return Table's current provisioning state. If set to 'updating', indicates a resource lock due to ongoing operation, forbidding any update to the table until the ongoing operation is concluded.
     * 
     */
    public Output<String> getProvisioningState() {
        return this.provisioningState;
    }
    /**
     * Parameters of the restore operation that initiated this table.
     * 
     */
    @OutputExport(name="restoredLogs", type=RestoredLogsResponse.class, parameters={})
    private Output</* @Nullable */ RestoredLogsResponse> restoredLogs;

    /**
     * @return Parameters of the restore operation that initiated this table.
     * 
     */
    public Output</* @Nullable */ RestoredLogsResponse> getRestoredLogs() {
        return this.restoredLogs;
    }
    /**
     * Search job execution statistics.
     * 
     */
    @OutputExport(name="resultStatistics", type=ResultStatisticsResponse.class, parameters={})
    private Output</* @Nullable */ ResultStatisticsResponse> resultStatistics;

    /**
     * @return Search job execution statistics.
     * 
     */
    public Output</* @Nullable */ ResultStatisticsResponse> getResultStatistics() {
        return this.resultStatistics;
    }
    /**
     * The data table data retention in days, between 4 and 730. Setting this property to null will default to the workspace retention.
     * 
     */
    @OutputExport(name="retentionInDays", type=Integer.class, parameters={})
    private Output</* @Nullable */ Integer> retentionInDays;

    /**
     * @return The data table data retention in days, between 4 and 730. Setting this property to null will default to the workspace retention.
     * 
     */
    public Output</* @Nullable */ Integer> getRetentionInDays() {
        return this.retentionInDays;
    }
    /**
     * Table schema.
     * 
     */
    @OutputExport(name="schema", type=SchemaResponse.class, parameters={})
    private Output</* @Nullable */ SchemaResponse> schema;

    /**
     * @return Table schema.
     * 
     */
    public Output</* @Nullable */ SchemaResponse> getSchema() {
        return this.schema;
    }
    /**
     * Parameters of the search job that initiated this table.
     * 
     */
    @OutputExport(name="searchResults", type=SearchResultsResponse.class, parameters={})
    private Output</* @Nullable */ SearchResultsResponse> searchResults;

    /**
     * @return Parameters of the search job that initiated this table.
     * 
     */
    public Output</* @Nullable */ SearchResultsResponse> getSearchResults() {
        return this.searchResults;
    }
    /**
     * Metadata pertaining to creation and last modification of the resource.
     * 
     */
    @OutputExport(name="systemData", type=SystemDataResponse.class, parameters={})
    private Output<SystemDataResponse> systemData;

    /**
     * @return Metadata pertaining to creation and last modification of the resource.
     * 
     */
    public Output<SystemDataResponse> getSystemData() {
        return this.systemData;
    }
    /**
     * The table data total retention in days, between 4 and 2555. Setting this property to null will default to table retention.
     * 
     */
    @OutputExport(name="totalRetentionInDays", type=Integer.class, parameters={})
    private Output</* @Nullable */ Integer> totalRetentionInDays;

    /**
     * @return The table data total retention in days, between 4 and 2555. Setting this property to null will default to table retention.
     * 
     */
    public Output</* @Nullable */ Integer> getTotalRetentionInDays() {
        return this.totalRetentionInDays;
    }
    /**
     * The type of the resource. E.g. "Microsoft.Compute/virtualMachines" or "Microsoft.Storage/storageAccounts"
     * 
     */
    @OutputExport(name="type", type=String.class, parameters={})
    private Output<String> type;

    /**
     * @return The type of the resource. E.g. "Microsoft.Compute/virtualMachines" or "Microsoft.Storage/storageAccounts"
     * 
     */
    public Output<String> getType() {
        return this.type;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public Table(String name) {
        this(name, TableArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public Table(String name, TableArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public Table(String name, TableArgs args, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("azure-native:operationalinsights:Table", name, args == null ? TableArgs.Empty : args, makeResourceOptions(options, Input.empty()));
    }

    private Table(String name, Input<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("azure-native:operationalinsights:Table", name, null, makeResourceOptions(options, id));
    }

    private static io.pulumi.resources.CustomResourceOptions makeResourceOptions(@Nullable io.pulumi.resources.CustomResourceOptions options, @Nullable Input<String> id) {
        var defaultOptions = io.pulumi.resources.CustomResourceOptions.builder()
            .setVersion(Utilities.getVersion())
            .setAliases(List.of(
                Input.of(Alias.builder().setType("azure-native:operationalinsights/v20211201preview:Table").build())
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
    public static Table get(String name, Input<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        return new Table(name, id, options);
    }
}
