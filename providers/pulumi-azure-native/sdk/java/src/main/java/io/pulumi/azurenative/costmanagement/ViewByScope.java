// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.costmanagement;

import io.pulumi.azurenative.Utilities;
import io.pulumi.azurenative.costmanagement.ViewByScopeArgs;
import io.pulumi.azurenative.costmanagement.outputs.KpiPropertiesResponse;
import io.pulumi.azurenative.costmanagement.outputs.PivotPropertiesResponse;
import io.pulumi.azurenative.costmanagement.outputs.ReportConfigDatasetResponse;
import io.pulumi.azurenative.costmanagement.outputs.ReportConfigTimePeriodResponse;
import io.pulumi.core.Alias;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.Export;
import io.pulumi.core.annotations.ResourceType;
import io.pulumi.core.internal.Codegen;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import javax.annotation.Nullable;

/**
 * States and configurations of Cost Analysis.
 * API Version: 2019-11-01.
 * 
 * ## Example Usage
 * 
 * ## Import
 * 
 * An existing resource can be imported using its type token, name, and identifier, e.g.
 * 
 * ```sh
 * $ pulumi import azure-native:costmanagement:ViewByScope swaggerExample /subscriptions/00000000-0000-0000-0000-000000000000/resourceGroups/MYDEVTESTRG/providers/Microsoft.CostManagement/views/swaggerExample 
 * ```
 * 
 */
@ResourceType(type="azure-native:costmanagement:ViewByScope")
public class ViewByScope extends io.pulumi.resources.CustomResource {
    /**
     * Show costs accumulated over time.
     * 
     */
    @Export(name="accumulated", type=String.class, parameters={})
    private Output</* @Nullable */ String> accumulated;

    /**
     * @return Show costs accumulated over time.
     * 
     */
    public Output</* @Nullable */ String> getAccumulated() {
        return this.accumulated;
    }
    /**
     * Chart type of the main view in Cost Analysis. Required.
     * 
     */
    @Export(name="chart", type=String.class, parameters={})
    private Output</* @Nullable */ String> chart;

    /**
     * @return Chart type of the main view in Cost Analysis. Required.
     * 
     */
    public Output</* @Nullable */ String> getChart() {
        return this.chart;
    }
    /**
     * Date the user created this view.
     * 
     */
    @Export(name="createdOn", type=String.class, parameters={})
    private Output<String> createdOn;

    /**
     * @return Date the user created this view.
     * 
     */
    public Output<String> getCreatedOn() {
        return this.createdOn;
    }
    /**
     * Selected currency.
     * 
     */
    @Export(name="currency", type=String.class, parameters={})
    private Output<String> currency;

    /**
     * @return Selected currency.
     * 
     */
    public Output<String> getCurrency() {
        return this.currency;
    }
    /**
     * Has definition for data in this report config.
     * 
     */
    @Export(name="dataSet", type=ReportConfigDatasetResponse.class, parameters={})
    private Output</* @Nullable */ ReportConfigDatasetResponse> dataSet;

    /**
     * @return Has definition for data in this report config.
     * 
     */
    public Output</* @Nullable */ ReportConfigDatasetResponse> getDataSet() {
        return this.dataSet;
    }
    /**
     * Selected date range for viewing cost in.
     * 
     */
    @Export(name="dateRange", type=String.class, parameters={})
    private Output<String> dateRange;

    /**
     * @return Selected date range for viewing cost in.
     * 
     */
    public Output<String> getDateRange() {
        return this.dateRange;
    }
    /**
     * User input name of the view. Required.
     * 
     */
    @Export(name="displayName", type=String.class, parameters={})
    private Output</* @Nullable */ String> displayName;

    /**
     * @return User input name of the view. Required.
     * 
     */
    public Output</* @Nullable */ String> getDisplayName() {
        return this.displayName;
    }
    /**
     * eTag of the resource. To handle concurrent update scenario, this field will be used to determine whether the user is updating the latest version or not.
     * 
     */
    @Export(name="eTag", type=String.class, parameters={})
    private Output</* @Nullable */ String> eTag;

    /**
     * @return eTag of the resource. To handle concurrent update scenario, this field will be used to determine whether the user is updating the latest version or not.
     * 
     */
    public Output</* @Nullable */ String> getETag() {
        return this.eTag;
    }
    /**
     * Include monetary commitment
     * 
     */
    @Export(name="includeMonetaryCommitment", type=Boolean.class, parameters={})
    private Output<Boolean> includeMonetaryCommitment;

    /**
     * @return Include monetary commitment
     * 
     */
    public Output<Boolean> getIncludeMonetaryCommitment() {
        return this.includeMonetaryCommitment;
    }
    /**
     * List of KPIs to show in Cost Analysis UI.
     * 
     */
    @Export(name="kpis", type=List.class, parameters={KpiPropertiesResponse.class})
    private Output</* @Nullable */ List<KpiPropertiesResponse>> kpis;

    /**
     * @return List of KPIs to show in Cost Analysis UI.
     * 
     */
    public Output</* @Nullable */ List<KpiPropertiesResponse>> getKpis() {
        return this.kpis;
    }
    /**
     * Metric to use when displaying costs.
     * 
     */
    @Export(name="metric", type=String.class, parameters={})
    private Output</* @Nullable */ String> metric;

    /**
     * @return Metric to use when displaying costs.
     * 
     */
    public Output</* @Nullable */ String> getMetric() {
        return this.metric;
    }
    /**
     * Date when the user last modified this view.
     * 
     */
    @Export(name="modifiedOn", type=String.class, parameters={})
    private Output<String> modifiedOn;

    /**
     * @return Date when the user last modified this view.
     * 
     */
    public Output<String> getModifiedOn() {
        return this.modifiedOn;
    }
    /**
     * Resource name.
     * 
     */
    @Export(name="name", type=String.class, parameters={})
    private Output<String> name;

    /**
     * @return Resource name.
     * 
     */
    public Output<String> getName() {
        return this.name;
    }
    /**
     * Configuration of 3 sub-views in the Cost Analysis UI.
     * 
     */
    @Export(name="pivots", type=List.class, parameters={PivotPropertiesResponse.class})
    private Output</* @Nullable */ List<PivotPropertiesResponse>> pivots;

    /**
     * @return Configuration of 3 sub-views in the Cost Analysis UI.
     * 
     */
    public Output</* @Nullable */ List<PivotPropertiesResponse>> getPivots() {
        return this.pivots;
    }
    /**
     * Cost Management scope to save the view on. This includes 'subscriptions/{subscriptionId}' for subscription scope, 'subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}' for resourceGroup scope, 'providers/Microsoft.Billing/billingAccounts/{billingAccountId}' for Billing Account scope, 'providers/Microsoft.Billing/billingAccounts/{billingAccountId}/departments/{departmentId}' for Department scope, 'providers/Microsoft.Billing/billingAccounts/{billingAccountId}/enrollmentAccounts/{enrollmentAccountId}' for EnrollmentAccount scope, 'providers/Microsoft.Billing/billingAccounts/{billingAccountId}/billingProfiles/{billingProfileId}' for BillingProfile scope, 'providers/Microsoft.Billing/billingAccounts/{billingAccountId}/invoiceSections/{invoiceSectionId}' for InvoiceSection scope, 'providers/Microsoft.Management/managementGroups/{managementGroupId}' for Management Group scope, '/providers/Microsoft.CostManagement/externalBillingAccounts/{externalBillingAccountName}' for ExternalBillingAccount scope, and '/providers/Microsoft.CostManagement/externalSubscriptions/{externalSubscriptionName}' for ExternalSubscription scope.
     * 
     */
    @Export(name="scope", type=String.class, parameters={})
    private Output</* @Nullable */ String> scope;

    /**
     * @return Cost Management scope to save the view on. This includes 'subscriptions/{subscriptionId}' for subscription scope, 'subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}' for resourceGroup scope, 'providers/Microsoft.Billing/billingAccounts/{billingAccountId}' for Billing Account scope, 'providers/Microsoft.Billing/billingAccounts/{billingAccountId}/departments/{departmentId}' for Department scope, 'providers/Microsoft.Billing/billingAccounts/{billingAccountId}/enrollmentAccounts/{enrollmentAccountId}' for EnrollmentAccount scope, 'providers/Microsoft.Billing/billingAccounts/{billingAccountId}/billingProfiles/{billingProfileId}' for BillingProfile scope, 'providers/Microsoft.Billing/billingAccounts/{billingAccountId}/invoiceSections/{invoiceSectionId}' for InvoiceSection scope, 'providers/Microsoft.Management/managementGroups/{managementGroupId}' for Management Group scope, '/providers/Microsoft.CostManagement/externalBillingAccounts/{externalBillingAccountName}' for ExternalBillingAccount scope, and '/providers/Microsoft.CostManagement/externalSubscriptions/{externalSubscriptionName}' for ExternalSubscription scope.
     * 
     */
    public Output</* @Nullable */ String> getScope() {
        return this.scope;
    }
    /**
     * Has time period for pulling data for the report.
     * 
     */
    @Export(name="timePeriod", type=ReportConfigTimePeriodResponse.class, parameters={})
    private Output</* @Nullable */ ReportConfigTimePeriodResponse> timePeriod;

    /**
     * @return Has time period for pulling data for the report.
     * 
     */
    public Output</* @Nullable */ ReportConfigTimePeriodResponse> getTimePeriod() {
        return this.timePeriod;
    }
    /**
     * The time frame for pulling data for the report. If custom, then a specific time period must be provided.
     * 
     */
    @Export(name="timeframe", type=String.class, parameters={})
    private Output<String> timeframe;

    /**
     * @return The time frame for pulling data for the report. If custom, then a specific time period must be provided.
     * 
     */
    public Output<String> getTimeframe() {
        return this.timeframe;
    }
    /**
     * Resource type.
     * 
     */
    @Export(name="type", type=String.class, parameters={})
    private Output<String> type;

    /**
     * @return Resource type.
     * 
     */
    public Output<String> getType() {
        return this.type;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public ViewByScope(String name) {
        this(name, ViewByScopeArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public ViewByScope(String name, ViewByScopeArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public ViewByScope(String name, ViewByScopeArgs args, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("azure-native:costmanagement:ViewByScope", name, args == null ? ViewByScopeArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private ViewByScope(String name, Output<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("azure-native:costmanagement:ViewByScope", name, null, makeResourceOptions(options, id));
    }

    private static io.pulumi.resources.CustomResourceOptions makeResourceOptions(@Nullable io.pulumi.resources.CustomResourceOptions options, @Nullable Output<String> id) {
        var defaultOptions = io.pulumi.resources.CustomResourceOptions.builder()
            .version(Utilities.getVersion())
            .aliases(List.of(
                Output.of(Alias.builder().type("azure-native:costmanagement/v20190401preview:ViewByScope").build()),
                Output.of(Alias.builder().type("azure-native:costmanagement/v20191101:ViewByScope").build()),
                Output.of(Alias.builder().type("azure-native:costmanagement/v20200601:ViewByScope").build()),
                Output.of(Alias.builder().type("azure-native:costmanagement/v20211001:ViewByScope").build())
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
    public static ViewByScope get(String name, Output<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        return new ViewByScope(name, id, options);
    }
}
